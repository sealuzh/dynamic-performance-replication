package ch.uzh.ifi.seal.PerfAwareUnitTestsEval;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.management.*;
import java.util.List;

public class PerfCounterWriterImpl implements PerfCounterWriter {
    // project,approach,seed,suite,fork,method,type(CSV_BEFORE|CSV_AFTER),time(ns),cpu-utilization,heap-usage,stack-usage,gc-count,gc-time(ms)
    private static final String CSV_LINE = "%s,%s,%s,%s,%d,%s,%s,%d,%f,%d,%d,%d,%d";
    private static final String CSV_BEFORE = "before";
    private static final String CSV_AFTER = "after";

    private String project;
    private String approach;
    private String seed;
    private String suite;
    private BufferedWriter out;
    private boolean useJavaLangSystem = true;

    private RuntimeMXBean rb;
    private MemoryMXBean mb;
    private GarbageCollectorMXBean gb;
    private OperatingSystemMXBean ob;

    private PerfCounterWriterImpl() {}

    public static PerfCounterWriterImpl get(OutputStreamWriter out, String project, String approach, String seed, String suite) throws IOException {
        PerfCounterWriterImpl ret = new PerfCounterWriterImpl();
        //ret.out = new BufferedWriter(new FileWriter(outFilePath));
        //ret.out = new BufferedWriter(new OutputStreamWriter(System.out));
        ret.out = new BufferedWriter(out);
        ret.project = project;
        ret.approach = approach;
        ret.seed = seed;
        ret.suite = suite;

        ret.rb = ManagementFactory.getRuntimeMXBean();
        ret.mb = ManagementFactory.getMemoryMXBean();
        ret.ob = ManagementFactory.getOperatingSystemMXBean();
        List<GarbageCollectorMXBean> gbs = ManagementFactory.getGarbageCollectorMXBeans();
        if (!gbs.isEmpty()) {
            ret.gb = gbs.get(0);
        }

        return ret;
    }

    public static PerfCounterWriterImpl get(OutputStreamWriter out, String project, String approach, String seed, String suite, boolean useJavaLangSystem) throws IOException {
        PerfCounterWriterImpl ret = get(out, project, approach, seed, suite);
        ret.useJavaLangSystem = useJavaLangSystem;
        return ret;
    }

    private void write(String method, int fork, String type) throws IOException {
        long time;
        if (useJavaLangSystem) {
            time = System.nanoTime();
        } else {
            time = rb.getUptime();
        }

        out.write(String.format(CSV_LINE,
                project,
                approach,
                seed,
                suite,
                fork,
                method,
                type,
                time,
                ob.getSystemLoadAverage(),
                mb.getHeapMemoryUsage().getUsed(),
                mb.getNonHeapMemoryUsage().getUsed(),
                gb.getCollectionCount(),
                gb.getCollectionTime()
        ));
        out.newLine();
    }

    @Override
    public void before(String method, int fork) {
        try {
            write(method, fork, CSV_BEFORE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void after(String method, int fork) {
        try {
            write(method, fork, CSV_AFTER);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void flush() throws IOException {
        out.flush();
    }

    @Override
    public void close() throws IOException {
        out.close();
    }
}
