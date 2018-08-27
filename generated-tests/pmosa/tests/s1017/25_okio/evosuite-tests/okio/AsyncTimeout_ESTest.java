/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 11:48:15 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import okio.AsyncTimeout;
import okio.Pipe;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AsyncTimeout_ESTest extends AsyncTimeout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      long long0 = 0L;
      asyncTimeout0.exit();
      asyncTimeout0.enter();
      asyncTimeout0.exit();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      asyncTimeout0.timeout(0L, timeUnit0);
      asyncTimeout0.exit();
      asyncTimeout0.enter();
      TimeUnit timeUnit1 = TimeUnit.MICROSECONDS;
      asyncTimeout0.timeout(0L, timeUnit1);
      asyncTimeout0.exit(true);
      asyncTimeout0.enter();
      asyncTimeout0.exit();
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
  public void test01()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      MockIOException mockIOException0 = new MockIOException(">l?[o2=v_&:qZcXn");
      asyncTimeout0.exit((IOException) mockIOException0);
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
  public void test02()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      MockIOException mockIOException0 = new MockIOException();
      asyncTimeout0.newTimeoutException(mockIOException0);
      asyncTimeout0.clearTimeout();
      asyncTimeout0.enter();
      asyncTimeout0.exit();
      MockThrowable mockThrowable0 = new MockThrowable();
      MockIOException mockIOException1 = new MockIOException(mockThrowable0);
      mockIOException1.getSuppressed();
      IOException iOException0 = asyncTimeout0.exit((IOException) mockIOException1);
      asyncTimeout0.sink((Sink) null);
      asyncTimeout0.exit(false);
      asyncTimeout0.exit(true);
      asyncTimeout0.exit(iOException0);
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
  public void test03()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      AsyncTimeout.head = asyncTimeout0;
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
  public void test04()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      asyncTimeout0.timeout(65536000000000L, timeUnit0);
      asyncTimeout0.enter();
      boolean boolean0 = asyncTimeout0.exit();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      asyncTimeout0.throwIfReached();
      asyncTimeout0.throwIfReached();
      asyncTimeout0.exit(true);
      asyncTimeout0.deadlineNanoTime(0L);
      asyncTimeout0.deadline(1000000000L, timeUnit0);
      asyncTimeout0.exit();
      MockIOException mockIOException0 = new MockIOException("`D(EC\"/?");
      IOException iOException0 = asyncTimeout0.newTimeoutException(mockIOException0);
      MockIOException mockIOException1 = new MockIOException("b^&", iOException0);
      asyncTimeout0.newTimeoutException(mockIOException1);
      asyncTimeout0.enter();
      asyncTimeout0.sink((Sink) null);
      Source source0 = asyncTimeout0.source((Source) null);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      AsyncTimeout.head = asyncTimeout0;
      AsyncTimeout asyncTimeout1 = AsyncTimeout.head;
      Timeout timeout0 = asyncTimeout1.deadlineNanoTime(65536L);
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      AsyncTimeout asyncTimeout2 = (AsyncTimeout)asyncTimeout0.deadline(65536L, timeUnit0);
      AsyncTimeout.head.exit();
      MockIOException mockIOException0 = new MockIOException("*bz$lRV-\"HtCW,M");
      AsyncTimeout.head.newTimeoutException(mockIOException0);
      MockIOException mockIOException1 = new MockIOException("b^&", mockIOException0);
      asyncTimeout0.newTimeoutException(mockIOException1);
      asyncTimeout0.enter();
      asyncTimeout2.timedOut();
      assertSame(asyncTimeout2, timeout0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      asyncTimeout0.deadline(1009L, timeUnit0);
      asyncTimeout0.exit((IOException) null);
      IOException iOException0 = asyncTimeout0.newTimeoutException((IOException) null);
      asyncTimeout0.exit(iOException0);
      asyncTimeout0.exit(false);
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
  public void test08()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      asyncTimeout0.throwIfReached();
      asyncTimeout0.throwIfReached();
      asyncTimeout0.exit(true);
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadlineNanoTime(0L);
      AsyncTimeout asyncTimeout2 = (AsyncTimeout)asyncTimeout0.deadline(1000000000L, timeUnit0);
      asyncTimeout0.exit();
      MockIOException mockIOException0 = new MockIOException("`D(EC\"/?");
      InterruptedIOException interruptedIOException0 = (InterruptedIOException)asyncTimeout0.newTimeoutException(mockIOException0);
      MockIOException mockIOException1 = new MockIOException("b^&", interruptedIOException0);
      asyncTimeout0.newTimeoutException(mockIOException1);
      asyncTimeout0.enter();
      asyncTimeout1.exit(true);
      asyncTimeout1.enter();
      assertSame(asyncTimeout1, asyncTimeout2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      asyncTimeout0.throwIfReached();
      asyncTimeout0.throwIfReached();
      asyncTimeout0.exit(true);
      asyncTimeout0.deadlineNanoTime(0L);
      asyncTimeout0.deadline(1000000000L, timeUnit0);
      asyncTimeout0.exit();
      MockIOException mockIOException0 = new MockIOException("`D(EC\"/?");
      IOException iOException0 = asyncTimeout0.newTimeoutException(mockIOException0);
      MockIOException mockIOException1 = new MockIOException("b^&", iOException0);
      asyncTimeout0.newTimeoutException(mockIOException1);
      asyncTimeout0.enter();
      asyncTimeout0.sink((Sink) null);
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
  public void test10()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      asyncTimeout0.throwIfReached();
      asyncTimeout0.throwIfReached();
      asyncTimeout0.exit(true);
      asyncTimeout0.deadlineNanoTime((-21L));
      Timeout timeout0 = asyncTimeout0.deadline(1000000000L, timeUnit0);
      timeout0.deadlineNanoTime(3018L);
      timeout0.deadlineNanoTime();
      asyncTimeout0.exit();
      MockIOException mockIOException0 = new MockIOException();
      IOException iOException0 = asyncTimeout0.newTimeoutException(mockIOException0);
      MockIOException mockIOException1 = new MockIOException("b^&", iOException0);
      asyncTimeout0.newTimeoutException(mockIOException1);
      asyncTimeout0.enter();
      AsyncTimeout asyncTimeout1 = AsyncTimeout.awaitTimeout();
      asyncTimeout1.timedOut();
      assertTrue(asyncTimeout1.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.throwIfReached();
      asyncTimeout0.exit(true);
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadlineNanoTime(0L);
      asyncTimeout0.exit();
      MockIOException mockIOException0 = new MockIOException("`D(EC\"/?");
      InterruptedIOException interruptedIOException0 = (InterruptedIOException)asyncTimeout0.newTimeoutException(mockIOException0);
      MockIOException mockIOException1 = new MockIOException("b^&", interruptedIOException0);
      asyncTimeout0.newTimeoutException(mockIOException1);
      asyncTimeout0.enter();
      asyncTimeout0.sink((Sink) null);
      MockIOException mockIOException2 = new MockIOException();
      asyncTimeout1.exit((IOException) mockIOException2);
  }
}
