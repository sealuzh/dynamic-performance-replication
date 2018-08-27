package anonymous.sub

import com.beust.klaxon.Klaxon
import com.opencsv.CSVReader
import org.funktionale.either.Either
import org.funktionale.option.Option
import java.io.File
import java.io.FileReader
import java.nio.file.Paths
import java.util.concurrent.TimeUnit

/**
 * Created by christophlaaber on 05/02/18.
 */

val homeDir = java.lang.System.getProperty("user.dir")
val inputSize = 1
val defaultCompileTimout: Long = 5
val defaultExecTimeout: Long = 10
val hamcrestFileName = "evosuite-hamcrest.jar"
val junitFileName = "evosuite-junit.jar"
val evosuiteFileName = "evosuite-standalone-runtime-cl-adapted.jar"
val testsJar = "estests_%s.jar"
val junitRunner = "org.junit.runner.JUnitCore"
val javacErr = "error"
val javacErrs = "errors"

// execution via command line:
// ./gradlew run -Dargs="project_dir{,exclude_dir}"
fun main(args: Array<String>) {
    if (args.size != inputSize) {
        println("Invalid argument size (expected: $inputSize, was ${args.size})")
        return
    }

    val inFile = File(args[0])
    if (!inFile.exists()) {
        println("Input file does not exist")
        return
    }

    val config = Klaxon().parse<Config>(inFile)
    if (config == null) {
        println("Could not parse config file")
        return
    }

    // check config params
    val error = checkConfig(config)
    if (error.isDefined()) {
        println("ERROR: " + error.get())
        return
    }

    // evosuite paths
    val evo = ClassLoader.getSystemClassLoader().getResource(evosuiteFileName)
    if (evo == null) {
        println("ERROR: could not load evosuite file")
        return
    }
    val junit = ClassLoader.getSystemClassLoader().getResource(junitFileName)
    if (junit == null) {
        println("ERROR: could not load junit file")
        return
    }
    val hamcrest = ClassLoader.getSystemClassLoader().getResource(hamcrestFileName)
    if (hamcrest == null) {
        println("ERROR: could not load hamcrest file")
        return
    }

    //val tf = BufferedReader(FileReader(config.testFile))
    val tf = CSVReader(FileReader(config.testFile))
    // transform
    val transformer = if (config.transform) {
        PerfTransformer(config.outDir, config.testDir, config.approaches, config.resultsToStdOut)
    } else {
        VoidTransformer(config.outDir, config.testDir, config.approaches)
    }

    val start = System.nanoTime()

    // transformer libs
    val maybeTlibs = transformer.cpDeps()
    if (maybeTlibs.isLeft()) {
        println("ERROR: Could not get transformer libs: '${maybeTlibs.left().get()}'")
        return
    }
    val tlibs = transformer.cpDeps().right().get().reduce({l, r -> "$l:$r"})
    val evoInfo = EvoInfo(evo.path, junit.path, hamcrest.path, tlibs)

    val transformed: List<CompilationInfo> = tf
            .filter { ts -> ts != null && ts.size == 3 }
            .map { ts -> TestSuite(ts[0], ts[1], ts[2]) }
            .map { ts -> transformer.transform(ts) }
            .flatten()

    // compile
    println("# Start compiling all projects")
    val startCompilation = System.nanoTime()
    val compiled: List<ExecutionInfo> = transformed.
            mapNotNull { ci ->
                println("## Start compilation for '" + ci.str() + "'")
                val startSuiteCompilation = System.nanoTime()
                val execInfo = compileTestSuite(evoInfo, config.projects, ci, config.compileTimeout)
                val endSuiteCompilation = System.nanoTime()
                if (execInfo.isLeft()) {
                    println("## Compilation ERROR for '" + ci.str() + "': \n" + execInfo.left().get())
                    null
                } else {
                    println("## Finished compilation for '" + ci.str() + "' in " + (endSuiteCompilation - startSuiteCompilation) + "ns")
                    execInfo.right().get()
                }
            }
    val endCompilation = System.nanoTime()
    println("# Finished compiling all projects in " + (endCompilation - startCompilation) + "ns")

    // run
    println("")
    println("# Start executing unit-test suites")
    val startExecution = System.nanoTime()
    compiled.forEach { ei ->
        println("## Start execution for '" + ei.compilationInfo.str() + "'")
        val startSuiteExecution = System.nanoTime()
        execTestSuiteTimes(evoInfo, ei, config.forks, config.verboseRun, config.execTimeout)
        val endSuiteExecution = System.nanoTime()
        println("## Finished execution for '" + ei.compilationInfo.str() + "' in " + (endSuiteExecution - startSuiteExecution) + "ns")
    }
    val endExecution = System.nanoTime()
    println("# Finished executing unit-test suites in " + (endExecution - startExecution) + "ns")

    val end = System.nanoTime()
    println("Overall execution took ${end - start}ns")
}

data class Config(val projects: String,
                  val testFile: String,
                  val testDir: String,
                  val outDir: String,
                  val forks: Int = 1,
                  val approaches: List<String>,
                  val verboseRun: Boolean = false,
                  val execTimeout: Long = defaultExecTimeout,
                  val compileTimeout: Long = defaultCompileTimout,
                  val transform: Boolean = false,
                  val resultsToStdOut: Boolean = false)

data class TestSuite(val project: String, val suite: String, val seed: String)
data class EvoInfo(val evo: String, val junit: String, val hamcrest: String, val pwc: String)
data class CompilationInfo(val testSuite: TestSuite, val approach: String, val testSuiteFile: String, val outDir: String)
fun CompilationInfo.str(): String {
    val delimiter = "-"
    return this.testSuite.project + delimiter + this.approach + delimiter + this.testSuite.seed + delimiter + this.testSuite.suite
}
data class ExecutionInfo(val projectJar: String, val projectLibs: String, val testJar: String, val suite: String, val compilationInfo: CompilationInfo)

fun checkConfig(c: Config): Option<String> =
        if (!File(c.testDir).exists()){
            Option.Some("testDir does not exist")
        } else if (!File(c.testFile).exists()) {
            Option.Some("testFile does not exist")
        } else if (!File(c.projects).exists()) {
            Option.Some("projects does not exist")
        } else {
            Option.None
        }

fun String.runCommand(workingDir: File, timeout: Long, env: Map<String, String> = mapOf()): Triple<Boolean, String?, String?> {
    try {
        val parts = this.split("\\s".toRegex())
        val procBuilder = ProcessBuilder(*parts.toTypedArray())
                .directory(workingDir)
                .redirectOutput(ProcessBuilder.Redirect.PIPE)
                .redirectError(ProcessBuilder.Redirect.PIPE)
        procBuilder.environment().putAll(env)

        val proc = procBuilder.start()

        // true if normal exit, false if timed out
        val exited = proc.waitFor(timeout, TimeUnit.MINUTES)
        return Triple(exited, proc.inputStream.bufferedReader().readText(), proc.errorStream.bufferedReader().readText())
    } catch(e: Throwable) {
        e.printStackTrace()
        return Triple(false, null, e.message)
    }
}

// returns the path to the jar file to execute
fun compileTestSuite(evoInfo: EvoInfo, projectsPath: String, info: CompilationInfo, timeout: Long): Either<String, ExecutionInfo> {
    // get project jar
    val projPath = Paths.get(projectsPath, info.testSuite.project)
    val projDir = projPath.toFile()
    if (!projDir.exists()) {
        // directory does not exist
        return Either.left("directory does not exist '" + projPath.toString() + "'")
    }
    val jars = projDir.listFiles { f -> f.isFile && f.path.endsWith("jar") }
    if (jars.isEmpty()) {
        // no jars in directory
        return Either.left("no jars in directory '" + projPath.toString() + "'")
    } else if (jars.size > 1){
        println("WARNING: directory contains " + jars.size + " jars. We will take the first one")
    }

    // always get first that we find
    val projJar = jars.get(0)

    // check if there are library dependencies
    val libPath = projPath.resolve("lib")

    val classesDir = Paths.get(info.outDir, "classes")
    val classesDirFile = classesDir.toFile()
    if (!classesDirFile.exists()) {
        if (!classesDirFile.mkdirs()) {
            return Either.left("could not create classes directory ('" + classesDirFile.path + "'")
        }
    }

    val cp = evoInfo.evo + ":" + evoInfo.junit + ":" + evoInfo.hamcrest + ":" + projJar.path
    val exec = StringBuilder("javac -d " + classesDirFile.path + " -cp " + cp)
    val libFile = libPath.toFile()
    val projectLibsBuilder = StringBuilder(evoInfo.pwc)
    if (evoInfo.pwc.isNotBlank()) {
        exec.append(":${evoInfo.pwc}")
    }
    if (libFile.exists()) {
        // add lib to build path
        val projectLibs = Paths.get(libFile.path, "*").toString()
        val cpEntry = ":$projectLibs"
        exec.append(cpEntry)
        projectLibsBuilder.append(cpEntry)
    }
    val projectLibs = projectLibsBuilder.toString()

    //val evosuiteTest = "evosuite-test"
    //val execBase = exec.toString() + ":" + Paths.get(info.testSuiteFile.substringBeforeLast(evosuiteTest), evosuiteTest).toString()
    val execBase = exec.toString()

    // compile evosuite test suite classes
    val execStr = execBase + " " + info.testSuiteFile + estestScaffSuffix + javaSuffix + " " + info.testSuiteFile + estestSuffix + javaSuffix
    val (compileExited, _, err) = execStr.runCommand(File(homeDir), timeout)
    if (!compileExited) {
        return Either.left("Compilation timed out")
    }
    if (err != null) {
        val err2 = err.trim()
        if (err2.isNotEmpty() && (err2.endsWith(javacErr) || err2.endsWith(javacErrs))) {
            return Either.left(err2)
        }
    }

    // package compiled classes into jar
    val testSuiteBase = info.testSuite.suite.replace(".", "/")
    val scaffClass =  testSuiteBase + estestScaffSuffix + classSuffix
    val testClass = testSuiteBase + estestSuffix + classSuffix

    val jarPath = Paths.get(info.outDir, testsJar.format(info.testSuite.suite.replace(".", "-"))).toString()
    val jarCmd = "jar cf " + jarPath + " " + scaffClass + " " + testClass
    val (packageExited, _, errJar) = jarCmd.runCommand(classesDirFile, timeout)
    if (!packageExited) {
        return Either.left("Packaging timed out")
    }
    if (errJar != null && errJar.trim().isNotEmpty()) {
        return Either.left(errJar)
    }

    return Either.right(ExecutionInfo(projectJar = projJar.path, projectLibs = projectLibs, testJar = jarPath, suite = (info.testSuite.suite + estestSuffix), compilationInfo = info))
}

fun execTestSuiteTimes(evoInfo: EvoInfo, execInfo: ExecutionInfo, forks: Int, verbose: Boolean, timeout: Long) {
    1.rangeTo(forks).forEach { f ->
        println("### Start fork=$f")
        val startFork = System.nanoTime()
        val failed = execTestSuite(evoInfo, execInfo, f, verbose, timeout)
        val endFork = System.nanoTime()
        println("### Finished fork=$f in ${endFork - startFork}ns")
        if (failed) {
            return
        }
    }
}

// returns true if failed, false otherwise
fun execTestSuite(evoInfo: EvoInfo, execInfo: ExecutionInfo, fork: Int, verbose: Boolean, timeout: Long): Boolean {
    val exec = StringBuilder("java -cp " + evoInfo.evo + ":" + evoInfo.junit + ":" +  evoInfo.hamcrest + ":" + execInfo.projectJar + ":" + execInfo.testJar)
    if (execInfo.projectLibs.isNotEmpty()) {
        exec.append(":" + execInfo.projectLibs)
    }
    exec.append(" " + junitRunner + " " + execInfo.suite)
    val execStr = exec.toString()
    println("#### Execution command:\n${PerfTransformer.envFork}=$fork $execStr")
    val (exited, out, err) = execStr.runCommand(File(homeDir), timeout, mapOf(Pair(PerfTransformer.envFork, fork.toString())))
    if (!exited) {
        //timed out
        println("#### Execution timed out for '${execInfo.compilationInfo.str()}' (fork=$fork)")
    }
    if (out != null && verbose) {
        println("Output stream:")
        println(out)
    }

    if (err != null && verbose) {
        println("Error stream:")
        println(err)
    }
    return !exited
}
