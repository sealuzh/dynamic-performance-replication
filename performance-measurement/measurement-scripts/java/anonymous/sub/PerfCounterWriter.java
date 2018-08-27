package anonymous.sub;

import java.io.Closeable;
import java.io.Flushable;

public interface PerfCounterWriter extends Flushable, Closeable {
    void before(String method, int fork);
    default void before(String method) {
        before(method, 0);
    }
    void after(String method, int fork);
    default void after(String method) {
        after(method, 0);
    }
}
