/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 06:05:03 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AsyncTimeout_ESTest extends AsyncTimeout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.exit((IOException) null);
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      asyncTimeout0.timeout(0L, timeUnit0);
      asyncTimeout0.enter();
      assertFalse(asyncTimeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.throwIfReached();
      MockIOException mockIOException0 = new MockIOException();
      asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout0.exit(false);
      boolean boolean0 = true;
      asyncTimeout0.exit(true);
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
  public void test2()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      asyncTimeout0.timeout(255L, timeUnit0);
      asyncTimeout0.timedOut();
      IOException iOException0 = asyncTimeout0.newTimeoutException((IOException) null);
      IOException iOException1 = asyncTimeout0.exit(iOException0);
      asyncTimeout0.newTimeoutException(iOException1);
      asyncTimeout0.clearDeadline();
      Timeout timeout0 = asyncTimeout0.clearTimeout();
      asyncTimeout0.exit(false);
      AsyncTimeout.head = asyncTimeout0;
      asyncTimeout0.exit((IOException) null);
      asyncTimeout0.exit(true);
      asyncTimeout0.exit((IOException) null);
      asyncTimeout0.timedOut();
      AsyncTimeout.head.timedOut();
      asyncTimeout0.exit((IOException) null);
      AsyncTimeout.head.clearDeadline();
      MockIOException mockIOException0 = new MockIOException("", (Throwable) null);
      AsyncTimeout.head.exit((IOException) mockIOException0);
      AsyncTimeout.head.exit(false);
      AsyncTimeout.head.newTimeoutException((IOException) null);
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      Buffer buffer0 = buffer_UnsafeCursor0.buffer;
      AsyncTimeout.head.source((Source) null);
      AsyncTimeout.head.enter();
      asyncTimeout0.exit(false);
      AsyncTimeout.head.exit();
      AsyncTimeout.head.enter();
      AsyncTimeout.head.exit(true);
      AsyncTimeout.head.exit(false);
      assertSame(AsyncTimeout.head, timeout0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      Sink sink0 = asyncTimeout0.sink((Sink) null);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.deadlineNanoTime(255L);
      asyncTimeout0.enter();
      try { 
        asyncTimeout0.exit(true);
        fail("Expecting exception: InterruptedIOException");
      
      } catch(InterruptedIOException e) {
         //
         // timeout
         //
         verifyException("okio.AsyncTimeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadlineNanoTime((-1392409281319745L));
      asyncTimeout0.enter();
      AsyncTimeout.awaitTimeout();
      try { 
        asyncTimeout1.exit(true);
        fail("Expecting exception: InterruptedIOException");
      
      } catch(InterruptedIOException e) {
         //
         // timeout
         //
         verifyException("okio.AsyncTimeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.deadlineNanoTime((-1392409281319745L));
      asyncTimeout0.enter();
      AsyncTimeout asyncTimeout1 = AsyncTimeout.awaitTimeout();
      asyncTimeout1.exit((IOException) null);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      asyncTimeout0.deadline(1000000L, timeUnit0);
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

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.deadlineNanoTime((-282L));
      asyncTimeout0.enter();
      MockIOException mockIOException0 = new MockIOException("Ci/>}mXeRS_K}4");
      IOException iOException0 = asyncTimeout0.exit((IOException) mockIOException0);
      MockIOException mockIOException1 = new MockIOException("okio.Util", iOException0);
      asyncTimeout0.exit((IOException) mockIOException1);
      boolean boolean0 = asyncTimeout0.exit();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadlineNanoTime(0L);
      AsyncTimeout asyncTimeout2 = (AsyncTimeout)asyncTimeout1.deadlineNanoTime(0L);
      asyncTimeout1.exit(false);
      asyncTimeout0.exit();
      asyncTimeout0.exit(false);
      asyncTimeout0.enter();
      asyncTimeout2.exit(false);
      assertSame(asyncTimeout2, asyncTimeout1);
  }
}