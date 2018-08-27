/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 00:38:56 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.InterruptedIOException;
import okio.AsyncTimeout;
import okio.Pipe;
import okio.Sink;
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
      MockIOException mockIOException0 = new MockIOException("AsyncTimeout.source(");
      mockIOException0.getLocalizedMessage();
      IOException iOException0 = asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout0.newTimeoutException(iOException0);
      asyncTimeout0.timedOut();
      assertEquals(0L, asyncTimeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      Pipe pipe0 = new Pipe(218L);
      Sink sink0 = pipe0.sink();
      asyncTimeout0.sink(sink0);
      asyncTimeout0.exit(true);
      assertFalse(asyncTimeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      assertEquals(0L, asyncTimeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadlineNanoTime(0L);
      asyncTimeout0.enter();
      asyncTimeout1.timedOut();
      asyncTimeout0.timedOut();
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
  public void test4()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      MockIOException mockIOException0 = new MockIOException();
      asyncTimeout0.deadlineNanoTime((-30L));
      asyncTimeout0.enter();
      AsyncTimeout asyncTimeout1 = AsyncTimeout.awaitTimeout();
      asyncTimeout1.timedOut();
      String string0 = "A&KJh3+y} *p (GWoK";
      MockThrowable mockThrowable0 = new MockThrowable(string0);
      MockThrowable mockThrowable1 = new MockThrowable(mockThrowable0);
      MockThrowable mockThrowable2 = new MockThrowable();
      MockIOException mockIOException1 = new MockIOException(mockThrowable2);
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
      MockIOException mockIOException0 = new MockIOException();
      MockIOException mockIOException1 = new MockIOException((Throwable) null);
      asyncTimeout0.newTimeoutException(mockIOException1);
      asyncTimeout0.timedOut();
      asyncTimeout0.newTimeoutException((IOException) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      MockIOException mockIOException0 = new MockIOException();
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadlineNanoTime(0L);
      asyncTimeout0.enter();
      mockIOException0.getLocalizedMessage();
      asyncTimeout1.timedOut();
      asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout1.newTimeoutException(mockIOException0);
      asyncTimeout0.enter();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      MockIOException mockIOException0 = new MockIOException();
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadlineNanoTime(0L);
      asyncTimeout0.deadlineNanoTime(0L);
      asyncTimeout0.enter();
      mockIOException0.getLocalizedMessage();
      asyncTimeout1.timedOut();
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
}
