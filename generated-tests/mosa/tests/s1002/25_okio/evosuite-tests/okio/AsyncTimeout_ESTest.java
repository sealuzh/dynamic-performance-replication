/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 18:06:27 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.Pipe;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AsyncTimeout_ESTest extends AsyncTimeout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.exit(true);
      Pipe pipe0 = new Pipe(2381L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      Buffer buffer0 = realBufferedSource0.buffer;
      Source source0 = asyncTimeout0.source(pipe_PipeSource0);
      asyncTimeout0.source(source0);
      Source source1 = asyncTimeout0.source(buffer0);
      assertNotSame(source1, source0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.timedOut();
      assertFalse(asyncTimeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      Sink sink0 = asyncTimeout0.sink((Sink) null);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      assertEquals(0L, asyncTimeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.exit();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      asyncTimeout0.deadline(100000000000000L, timeUnit0);
      asyncTimeout0.enter();
      // Undeclared exception!
      try { 
        asyncTimeout0.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unbalanced enter/exit
         //
         verifyException("okio.AsyncTimeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.exit(false);
      asyncTimeout0.exit(false);
      asyncTimeout0.exit((IOException) null);
      asyncTimeout0.deadlineNanoTime(4898L);
      asyncTimeout0.newTimeoutException((IOException) null);
      asyncTimeout0.enter();
      MockIOException mockIOException0 = new MockIOException((String) null);
      asyncTimeout0.exit((IOException) mockIOException0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      AsyncTimeout asyncTimeout1 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      asyncTimeout1.throwIfReached();
      asyncTimeout1.timeout(2060L, timeUnit0);
      asyncTimeout1.enter();
      asyncTimeout1.exit(false);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      asyncTimeout0.deadline(100000000000000L, timeUnit0);
      asyncTimeout0.enter();
      // Undeclared exception!
      try { 
        AsyncTimeout.awaitTimeout();
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }
}