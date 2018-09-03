package ch.uzh.ifi.seal.PerfAwareUnitTestsEval

class VoidTransformer(outDir: String, testDir: String, approaches: List<String>) : AbstractTransformer(outDir, testDir, approaches) {
    override fun transform(ts: TestSuite): List<CompilationInfo> = approaches
                .mapNotNull { a -> createOutFolder(outDir, ts, a) }
                .map { (a, outDir) -> CompilationInfo(ts, a, sourcePath(ts, a), outDir) }
                .toList()
}