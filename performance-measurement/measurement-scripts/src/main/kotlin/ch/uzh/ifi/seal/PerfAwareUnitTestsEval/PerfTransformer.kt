package ch.uzh.ifi.seal.PerfAwareUnitTestsEval

import com.github.javaparser.JavaParser
import com.github.javaparser.ast.CompilationUnit
import com.github.javaparser.ast.ImportDeclaration
import com.github.javaparser.ast.Modifier
import com.github.javaparser.ast.NodeList
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration
import com.github.javaparser.ast.expr.*
import com.github.javaparser.ast.stmt.BlockStmt
import com.github.javaparser.ast.stmt.ExpressionStmt
import com.github.javaparser.ast.stmt.Statement
import org.funktionale.either.Either
import java.io.File
import java.io.FileInputStream
import java.io.IOException
import java.nio.file.Paths


class PerfTransformer(outDir: String, testDir: String, approaches: List<String>, val printToStdout: Boolean = false, val mockGui: Boolean = true) : AbstractTransformer(outDir, testDir, approaches) {
    companion object {
        val envFork = "PERF_EXP_FORK"
    }

    val importJavaSystem = "java.lang.System"
    val importInteger = "java.lang.Integer"
    val importBefore = "org.junit.Before"
    val importAfter = "org.junit.After"
    val importBeforeClass = "org.junit.BeforeClass"
    val importAfterClass = "org.junit.AfterClass"
    val importRule = "org.junit.Rule"
    val importTestName = "org.junit.rules.TestName"
    val importOSR = "java.io.OutputStreamWriter"

    val importPerfCounterWriterImpl = "ch.uzh.ifi.seal.PerfAwareUnitTestsEval.PerfCounterWriterImpl"
    val importPerfCounterWriter = "ch.uzh.ifi.seal.PerfAwareUnitTestsEval.PerfCounterWriter"
    val importPCWFileWriter = "ch.uzh.ifi.seal.PerfAwareUnitTestsEval.FileWriter"
    val importPCWSystem = "ch.uzh.ifi.seal.PerfAwareUnitTestsEval.System"

    val annotationBeforeClass = importBeforeClass.substringAfterLast(".")
    val annotationAfterClass = importAfterClass.substringAfterLast(".")
    val annotationBefore = importBefore.substringAfterLast(".")
    val annotationAfter = importAfter.substringAfterLast(".")
    val annotationRule = importRule.substringAfterLast(".")

    val idPrefix = "_sealuzh_"
    val fieldPCW = idPrefix + "pcw"
    val fieldTestName = idPrefix + "testName"
    val fieldFork = idPrefix + "fork"

    val methodBeforeClass = idPrefix + "bc"
    val methodAfterClass = idPrefix + "ac"
    val methodBefore = idPrefix + "b"
    val methodAfter = idPrefix + "a"
    val methodPTWbefore = "before"
    val methodPTWafter = "after"
    val methodGetName = "getMethodName"

    val testSuiteName = "ts"

    val outFile = "out.csv"

    private val genSrcFolder = "gen-src"

    private val vt = VoidTransformer(outDir, testDir, approaches)


    private fun getPCWClassFilePaths(): List<String> {
        val ptwImpl = importPerfCounterWriterImpl.replace(".", "/") + ".class"
        val ptw = importPerfCounterWriter.replace(".", "/") + ".class"
        val system = importPCWSystem.replace(".", "/") + ".class"
        val fileWriter = importPCWFileWriter.replace(".", "/") + ".class"
        return listOf(ptw, ptwImpl, system, fileWriter)
    }

    // package deps into own jar and return path to this jar
    override fun cpDeps(): Either<String, List<String>> {
        val baseDir = PerfTransformer::class.java.classLoader.getResource("").path
        val cs = getPCWClassFilePaths()

        val jarPath = Paths.get(outDir, "pcw.jar").toString()
        val jarCmd = "jar cf " + jarPath + cs.fold("", { acc, e -> "$acc $e"})
        val (packageExited, _, errJar) = jarCmd.runCommand(File(baseDir), 5)
        if (!packageExited) {
            return Either.left("Packaging timed out")
        }
        if (errJar != null && errJar.trim().isNotEmpty()) {
            return Either.left(errJar)
        }

        return Either.right(listOf(jarPath))
    }

    override fun transform(ts: TestSuite): List<CompilationInfo> = vt.transform(ts)
            .mapNotNull { copy(it) }
            .mapNotNull { transSc(it) }

    private fun copy(ci: CompilationInfo): CompilationInfo? {
        val dir = File(Paths.get(ci.outDir, genSrcFolder,
                *ci.testSuite.suite.substringBeforeLast(".").split(".").toTypedArray()).toString())
        if (!dir.exists()) {
            if (!dir.mkdirs()) {
                return null
            }
        }

        val newPath = Paths.get(dir.path, ci.testSuite.suite.substringAfterLast(".")).toString()

        val estestPath = ci.testSuiteFile + estestSuffix + javaSuffix
        val estest = File(estestPath)
        if (!estest.exists()) {
            println("Test suite does not exist '${estestPath}'")
            return null
        }
        val newFile = File(newPath + estestSuffix + javaSuffix)
        if (newFile.exists()) {
            newFile.delete()
        }
        val newEstest = estest.copyTo(newFile)
        if (!newEstest.exists()) {
            throw RuntimeException("Could not copy test suite '${estestPath}'")
        }

        val estestScaffPath = ci.testSuiteFile + estestScaffSuffix + javaSuffix
        val estestScaff = File(estestScaffPath)
        if (!estestScaff.exists()) {
            // should never happen if estest suite exists
            throw IllegalStateException("No scaffolding test suite for '${estestPath}'")
        }
        val newScaffFile = File(newPath + estestScaffSuffix + javaSuffix)
        if (newScaffFile.exists()) {
            newScaffFile.delete()
        }
        val newEstestScaff = estestScaff.copyTo(newScaffFile)
        if (!newEstestScaff.exists()) {
            throw RuntimeException("Could not copy test suite '${estestScaffPath}'")
        }

        return CompilationInfo(
                testSuite = ci.testSuite,
                approach = ci.approach,
                outDir = ci.outDir,
                testSuiteFile = newPath
        )
    }

    private fun transSc(ci: CompilationInfo): CompilationInfo? {
        val path = ci.testSuiteFile + estestSuffix + javaSuffix
        val cu = JavaParser.parse(FileInputStream(path))
        addImports(cu)

        val className = ci.testSuite.suite.substringAfterLast(".") + estestSuffix
        val oc = cu.getClassByName(className)
        if (!oc.isPresent) {
            println("No class for name '${className}' in '${path}'")
            return null
        }
        val c = oc.get()

        // create out file
        val outFile = File(Paths.get(outDir, outFile).toUri())
        outFile.writeText("")

        addFields(c)
        addMethods(c, outFile.path, ci)

        // save file back
        File(path).writeText(cu.toString())
        return ci
    }

    private fun addImports(cu: CompilationUnit) {
        // check imports and if not existing
        addImport(cu, importAfter)
        addImport(cu, importBefore)
        addImport(cu, importAfterClass)
        addImport(cu, importBeforeClass)
        addImport(cu, importPerfCounterWriterImpl)
        addImport(cu, importRule)
        addImport(cu, importTestName)
        if (printToStdout) {
            addImport(cu, importOSR)
        }
    }

    private fun addImport(cu: CompilationUnit, import: String) {
        if (!cu.imports.contains(ImportDeclaration(import, false, false))) {
            cu.addImport(import)
        }
    }

    private fun addFields(c: ClassOrInterfaceDeclaration) {
        addField(c, importPerfCounterWriterImpl.substringAfterLast("."), fieldPCW)
        addField(c, "int", fieldFork)
        // test name field
        val tnType = importTestName.substringAfterLast(".")
        val tn = c.addFieldWithInitializer(JavaParser.parseType(tnType),
                fieldTestName,
                ObjectCreationExpr(null,
                    JavaParser.parseClassOrInterfaceType(importTestName.substringAfterLast(".")),
                    NodeList()),
                Modifier.PUBLIC)
        tn.addAnnotation(annotationRule)
    }

    private fun addField(c: ClassOrInterfaceDeclaration, type: String, name: String, annotations: List<String> = listOf()) {
        val f = c.addField(type, name, Modifier.PRIVATE, Modifier.STATIC)
        if (annotations.isNotEmpty()) {
            annotations.forEach { a ->
                f.addAnnotation(a)
            }
        }
    }

    private fun addMethods(c: ClassOrInterfaceDeclaration, outFilePath: String, ci: CompilationInfo) {
        addBeforeClass(c, outFilePath, ci)
        addAfterClass(c)
        addBefore(c)
        addAfter(c)
    }

    private fun addBeforeClass(c: ClassOrInterfaceDeclaration, outFilePath: String, ci: CompilationInfo) {
        val m = c.addMethod(methodBeforeClass, Modifier.STATIC, Modifier.PUBLIC)
        m.addAnnotation(annotationBeforeClass)
        m.addThrownException(IOException::class.java)
        m.setBody(BlockStmt(
                NodeList.nodeList<Statement>(
                        ExpressionStmt(AssignExpr(
                                NameExpr(fieldFork),
                                MethodCallExpr(
                                        NameExpr(importInteger),
                                        "parseInt",
                                        NodeList.nodeList<Expression>(MethodCallExpr(
                                                MethodCallExpr(NameExpr(importJavaSystem),"getenv"),
                                                "get",
                                                NodeList.nodeList<Expression>(StringLiteralExpr(envFork))))
                                        ),
                                AssignExpr.Operator.ASSIGN
                        )),
                        ExpressionStmt(AssignExpr(
                                NameExpr(fieldPCW),
                                MethodCallExpr(
                                        NameExpr(importPerfCounterWriterImpl.substringAfterLast(".")),
                                        "get",
                                        NodeList.nodeList<Expression>(
                                                if (printToStdout) {
                                                    ObjectCreationExpr(null,
                                                            JavaParser.parseClassOrInterfaceType(importOSR.substringAfterLast(".")),
                                                            NodeList.nodeList<Expression>(NameExpr("java.lang.System.out")))
                                                } else {
                                                    ObjectCreationExpr(null,
                                                            JavaParser.parseClassOrInterfaceType(importPCWFileWriter),
                                                            NodeList.nodeList<Expression>(StringLiteralExpr(outFilePath), BooleanLiteralExpr(true)))
                                                },
                                                StringLiteralExpr(ci.testSuite.project),
                                                StringLiteralExpr(ci.approach),
                                                StringLiteralExpr(ci.testSuite.seed),
                                                StringLiteralExpr(ci.testSuite.suite))),
                                AssignExpr.Operator.ASSIGN
                        )),
                        ExpressionStmt(MethodCallExpr(NameExpr(fieldPCW), methodPTWbefore, NodeList.nodeList<Expression>(StringLiteralExpr(testSuiteName), IntegerLiteralExpr(fieldFork))))
                )
        ))
    }

    private fun addAfterClass(c: ClassOrInterfaceDeclaration) {
        val m = c.addMethod(methodAfterClass, Modifier.STATIC, Modifier.PUBLIC)
        m.addAnnotation(annotationAfterClass)
        m.addThrownException(IOException::class.java)
        m.setBody(BlockStmt(
                NodeList.nodeList<Statement>(
                        ExpressionStmt(MethodCallExpr(NameExpr(fieldPCW), methodPTWafter, NodeList.nodeList<Expression>(StringLiteralExpr(testSuiteName), IntegerLiteralExpr(fieldFork)))),
                        ExpressionStmt(MethodCallExpr(
                                NameExpr(fieldPCW),
                                "flush"
                        )),
                        ExpressionStmt(MethodCallExpr(
                                NameExpr(fieldPCW),
                                "close"
                        ))
                )
        ))
    }

    private fun addAfter(c: ClassOrInterfaceDeclaration) {
        val m = c.addMethod(methodAfter, Modifier.PUBLIC)
        m.addAnnotation(annotationAfter)
        m.setBody(BlockStmt(NodeList.nodeList<Statement>(
                beforeAfterBody(methodPTWafter)
        )))
    }

    private fun addBefore(c: ClassOrInterfaceDeclaration) {
        val m = c.addMethod(methodBefore, Modifier.PUBLIC)
        m.addAnnotation(annotationBefore)
        m.setBody(BlockStmt(NodeList.nodeList<Statement>(
                beforeAfterBody(methodPTWbefore)
        )))
    }

    private fun beforeAfterBody(method: String): ExpressionStmt {
        return ExpressionStmt(
                MethodCallExpr(NameExpr(fieldPCW), method, NodeList.nodeList<Expression>(
                        MethodCallExpr(NameExpr(fieldTestName), methodGetName), IntegerLiteralExpr(fieldFork)
                )))
    }
}
