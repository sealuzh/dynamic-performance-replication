/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 09:46:23 GMT 2018
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
import okio.HashingSource;
import okio.RealBufferedSource;
import okio.Source;
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
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      Buffer buffer1 = realBufferedSource0.buffer();
      Source source0 = asyncTimeout0.source(buffer1);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      assertFalse(asyncTimeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.exit();
      asyncTimeout0.timedOut();
      assertEquals(0L, asyncTimeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.timeout(4L, timeUnit0);
      MockIOException mockIOException0 = new MockIOException();
      asyncTimeout1.exit((IOException) mockIOException0);
      asyncTimeout0.enter();
      asyncTimeout0.exit(false);
      assertEquals(345600000000000L, asyncTimeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.newTimeoutException((IOException) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      asyncTimeout0.timeout(4L, timeUnit0);
      asyncTimeout0.enter();
      MockThrowable mockThrowable0 = new MockThrowable((Throwable) null);
      MockIOException mockIOException0 = new MockIOException(mockThrowable0);
      mockIOException0.fillInStackTrace();
      asyncTimeout0.newTimeoutException(mockIOException0);
      asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout0.exit((IOException) mockIOException0);
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
      MockIOException mockIOException0 = new MockIOException((Throwable) null);
      mockIOException0.fillInStackTrace();
      InterruptedIOException interruptedIOException0 = (InterruptedIOException)asyncTimeout1.newTimeoutException(mockIOException0);
      asyncTimeout1.exit((IOException) interruptedIOException0);
      AsyncTimeout asyncTimeout2 = new AsyncTimeout();
      asyncTimeout0.exit((IOException) interruptedIOException0);
      asyncTimeout1.enter();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      asyncTimeout0.timeout(10000L, timeUnit0);
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
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.timeout(4L, timeUnit0);
      asyncTimeout0.enter();
      // Undeclared exception!
      try { 
        asyncTimeout1.enter();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unbalanced enter/exit
         //
         verifyException("okio.AsyncTimeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      asyncTimeout0.deadline(8640000000000L, timeUnit0);
      MockThrowable mockThrowable0 = new MockThrowable();
      MockIOException mockIOException0 = new MockIOException("RDtQU<IP$5L;46KJXm", mockThrowable0);
      asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout0.enter();
  }
}