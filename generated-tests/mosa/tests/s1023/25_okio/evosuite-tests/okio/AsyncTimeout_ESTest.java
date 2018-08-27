/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 14:03:38 GMT 2018
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
  public void test0()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.timedOut();
      assertEquals(0L, asyncTimeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.exit(false);
      MockThrowable mockThrowable0 = new MockThrowable();
      MockIOException mockIOException0 = new MockIOException(mockThrowable0);
      asyncTimeout0.exit(true);
      asyncTimeout0.exit();
      asyncTimeout0.exit(true);
      asyncTimeout0.exit();
      IOException iOException0 = asyncTimeout0.newTimeoutException((IOException) null);
      assertEquals("java.io.InterruptedIOException: timeout", iOException0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      asyncTimeout0.timeout(1207L, timeUnit0);
      MockIOException mockIOException0 = new MockIOException();
      MockIOException mockIOException1 = new MockIOException();
      asyncTimeout0.newTimeoutException(mockIOException1);
      asyncTimeout0.newTimeoutException(mockIOException1);
      MockIOException mockIOException2 = new MockIOException("");
      asyncTimeout0.exit((IOException) mockIOException0);
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
  public void test3()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      asyncTimeout0.exit();
      Pipe pipe0 = new Pipe(10000000000000000L);
      Sink sink0 = pipe0.sink();
      asyncTimeout0.sink(sink0);
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadline(10000000000000000L, timeUnit0);
      MockThrowable mockThrowable0 = new MockThrowable("|");
      String string0 = "zjlv7EE~8";
      asyncTimeout1.enter();
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
  public void test4()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.source((Source) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      asyncTimeout0.exit();
      Pipe pipe0 = new Pipe(696L);
      Sink sink0 = pipe0.sink();
      asyncTimeout0.sink(sink0);
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadline(10000000000000000L, timeUnit0);
      MockThrowable mockThrowable0 = new MockThrowable((String) null);
      MockIOException mockIOException0 = new MockIOException((String) null, mockThrowable0);
      InterruptedIOException interruptedIOException0 = (InterruptedIOException)asyncTimeout1.newTimeoutException(mockIOException0);
      InterruptedIOException interruptedIOException1 = (InterruptedIOException)asyncTimeout0.newTimeoutException(interruptedIOException0);
      MockIOException mockIOException1 = (MockIOException)asyncTimeout1.exit((IOException) mockIOException0);
      asyncTimeout0.exit((IOException) interruptedIOException1);
      asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout0.enter();
      asyncTimeout0.exit((IOException) mockIOException1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      asyncTimeout0.exit();
      Pipe pipe0 = new Pipe(10000000000000000L);
      Sink sink0 = pipe0.sink();
      asyncTimeout0.sink(sink0);
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadline(10000000000000000L, timeUnit0);
      MockThrowable mockThrowable0 = new MockThrowable("|");
      MockIOException mockIOException0 = new MockIOException();
      InterruptedIOException interruptedIOException0 = (InterruptedIOException)asyncTimeout0.newTimeoutException(mockIOException0);
      asyncTimeout0.newTimeoutException(interruptedIOException0);
      AsyncTimeout asyncTimeout2 = new AsyncTimeout();
      asyncTimeout2.exit((IOException) mockIOException0);
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

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      asyncTimeout0.exit();
      Pipe pipe0 = new Pipe(10000000000000000L);
      Sink sink0 = pipe0.sink();
      asyncTimeout0.sink(sink0);
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadline(10000000000000000L, timeUnit0);
      MockThrowable mockThrowable0 = new MockThrowable("|");
      MockIOException mockIOException0 = new MockIOException("zjlv7EE~8");
      asyncTimeout1.exit((IOException) mockIOException0);
      asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout1.enter();
      asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout1.enter();
      asyncTimeout0.exit();
      asyncTimeout1.exit(false);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      asyncTimeout0.exit();
      Pipe pipe0 = new Pipe(10000000000000000L);
      Sink sink0 = pipe0.sink();
      asyncTimeout0.sink(sink0);
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadline(10000000000000000L, timeUnit0);
      MockThrowable mockThrowable0 = new MockThrowable("|");
      MockIOException mockIOException0 = new MockIOException("zjlv7EE~8");
      asyncTimeout1.exit((IOException) mockIOException0);
      asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout1.enter();
      MockIOException mockIOException1 = (MockIOException)asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout1.enter();
      asyncTimeout0.exit();
      asyncTimeout0.exit((IOException) mockIOException1);
      MockIOException mockIOException2 = (MockIOException)asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout1.exit((IOException) mockIOException2);
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