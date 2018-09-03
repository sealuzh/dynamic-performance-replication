package ch.uzh.ifi.seal.PerfAwareUnitTestsEval

import org.funktionale.either.Either
import java.io.File
import java.io.IOException
import java.nio.file.Paths

abstract class AbstractTransformer(protected val outDir: String,
                                   protected val testDir: String,
                                   protected val approaches: List<String>) : Transformer {

    init {
        val outDir = File(this.outDir)
        if (!outDir.exists()) {
            if (!outDir.mkdirs()) {
                throw IOException("Could not create outDir '${outDir.path}'")
            }
        }
    }

    override fun cpDeps(): Either<String, List<String>> = Either.right(listOf())

    private fun createOutFolderInternal(outDir: String, ts: TestSuite, approach: String): Either<String, String> {
        val outDirPath = Paths.get(outDir, ts.project, approach)
        val outDirFile = File(outDirPath.toUri())
        if (!outDirFile.exists()) {
            if (!outDirFile.mkdirs()) {
                return Either.left("could not create out folder '" + outDirFile.path + "'")
            }
        }
        return Either.right(outDirFile.path)
    }

    protected fun createOutFolder(outDir: String, ts: TestSuite, approach: String): Pair<String, String>? {
        val outFolder = createOutFolderInternal(outDir, ts, approach)
        if (outFolder.isLeft()) {
            // error while creating
            println("ERROR: " + outFolder.left().get())
            return null
        } else {
            return Pair(approach, outFolder.right().get())
        }
    }

    protected fun fqnPath(ts: TestSuite): String = ts.suite.replace(".", "/")

    protected fun sourcePath(ts: TestSuite, a: String): String = Paths.get(testDir, a, "tests", properSeed(ts), ts.project, "evosuite-tests", fqnPath(ts)).toString()

    private fun properSeed(ts: TestSuite): String = if (ts.seed.startsWith("s")) {
        ts.seed
    } else {
        "s${ts.seed}"
    }
}