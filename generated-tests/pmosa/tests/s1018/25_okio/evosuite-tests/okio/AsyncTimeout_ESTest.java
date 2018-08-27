/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 14:22:24 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.ByteString;
import okio.HashingSource;
import okio.Options;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Timeout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AsyncTimeout_ESTest extends AsyncTimeout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.exit(true);
      IOException iOException0 = asyncTimeout0.newTimeoutException((IOException) null);
      assertEquals("java.io.InterruptedIOException: timeout", iOException0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      MockIOException mockIOException0 = new MockIOException((Throwable) null);
      asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout0.enter();
      assertFalse(asyncTimeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      asyncTimeout0.clearDeadline();
      MockIOException mockIOException0 = new MockIOException();
      mockIOException0.getSuppressed();
      asyncTimeout0.exit();
      mockIOException0.printStackTrace();
      asyncTimeout0.enter();
      IOException iOException0 = asyncTimeout0.newTimeoutException(mockIOException0);
      asyncTimeout0.enter();
      asyncTimeout0.clearTimeout();
      asyncTimeout0.exit(false);
      asyncTimeout0.timedOut();
      asyncTimeout0.timedOut();
      asyncTimeout0.enter();
      mockIOException0.addSuppressed(iOException0);
      // Undeclared exception!
      try { 
        AsyncTimeout.awaitTimeout();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.AsyncTimeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      asyncTimeout0.deadline(65536L, timeUnit0);
      AsyncTimeout.head = asyncTimeout0;
      asyncTimeout0.enter();
      assertEquals(0L, asyncTimeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      Timeout timeout0 = asyncTimeout0.timeout(4L, timeUnit0);
      asyncTimeout0.enter();
      MockThrowable mockThrowable0 = new MockThrowable((Throwable) null);
      mockThrowable0.getLocalizedMessage();
      MockIOException mockIOException0 = new MockIOException(mockThrowable0);
      mockIOException0.fillInStackTrace();
      asyncTimeout0.newTimeoutException(mockIOException0);
      asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout0.exit(true);
      assertSame(asyncTimeout0, timeout0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      long long0 = 4L;
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.timeout(4L, timeUnit0);
      asyncTimeout1.enter();
      asyncTimeout1.exit();
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

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.timeout(4L, timeUnit0);
      asyncTimeout0.enter();
      MockThrowable mockThrowable0 = new MockThrowable((Throwable) null);
      mockThrowable0.getLocalizedMessage();
      asyncTimeout1.exit(true);
      asyncTimeout0.enter();
      assertFalse(asyncTimeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      Pipe pipe0 = new Pipe(2698L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      Sink sink0 = asyncTimeout0.sink(pipe_PipeSink0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.timeout(4L, timeUnit0);
      asyncTimeout1.enter();
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