/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:47:58 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import okio.AsyncTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AsyncTimeout_ESTest extends AsyncTimeout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.exit(false);
      MockIOException mockIOException0 = new MockIOException();
      MockIOException mockIOException1 = new MockIOException(mockIOException0);
      asyncTimeout0.newTimeoutException(mockIOException1);
      asyncTimeout0.deadlineNanoTime(4294967295L);
      mockIOException1.getCause();
      asyncTimeout0.exit((IOException) mockIOException1);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("C9_;JTajDi+}W.M");
      mockPrintWriter0.println();
      mockPrintWriter0.println("");
      mockIOException0.printStackTrace((PrintWriter) mockPrintWriter0);
      asyncTimeout0.sink((Sink) null);
      IOException iOException0 = asyncTimeout0.newTimeoutException(mockIOException0);
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      asyncTimeout0.timeout(4294967295L, timeUnit0);
      asyncTimeout0.exit(false);
      asyncTimeout0.enter();
      IOException iOException1 = asyncTimeout0.exit(iOException0);
      asyncTimeout0.exit((IOException) mockIOException1);
      asyncTimeout0.exit(iOException1);
      asyncTimeout0.timedOut();
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
  public void test1()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      asyncTimeout0.exit(false);
      MockIOException mockIOException0 = new MockIOException();
      MockIOException mockIOException1 = new MockIOException(mockIOException0);
      asyncTimeout0.newTimeoutException(mockIOException1);
      asyncTimeout0.deadlineNanoTime(4294967295L);
      mockIOException1.getCause();
      asyncTimeout0.exit((IOException) mockIOException1);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("C9_;JTajDi+}W.M");
      mockPrintWriter0.println();
      mockPrintWriter0.println("C9_;JTajDi+}W.M");
      mockIOException0.printStackTrace((PrintWriter) mockPrintWriter0);
      Sink sink0 = asyncTimeout0.sink((Sink) null);
      asyncTimeout0.newTimeoutException(mockIOException0);
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.timeout(4294967295L, timeUnit0);
      asyncTimeout0.exit(false);
      asyncTimeout0.exit((IOException) mockIOException1);
      asyncTimeout0.source((Source) null);
      asyncTimeout0.enter();
      asyncTimeout0.sink(sink0);
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
  public void test2()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      MockIOException mockIOException0 = new MockIOException();
      MockIOException mockIOException1 = new MockIOException(mockIOException0);
      IOException iOException0 = asyncTimeout0.newTimeoutException(mockIOException1);
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadlineNanoTime(4294967295L);
      mockIOException0.getCause();
      asyncTimeout1.exit(iOException0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("C9_;JTajDi+}W.M");
      mockPrintWriter0.println();
      mockPrintWriter0.println((String) null);
      MockIOException mockIOException2 = new MockIOException();
      mockIOException2.printStackTrace((PrintWriter) mockPrintWriter0);
      asyncTimeout0.sink((Sink) null);
      asyncTimeout0.exit(false);
      asyncTimeout0.exit((IOException) mockIOException2);
      asyncTimeout1.source((Source) null);
      asyncTimeout1.enter();
      asyncTimeout0.sink((Sink) null);
      asyncTimeout0.exit(false);
      asyncTimeout0.timedOut();
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
  public void test3()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      asyncTimeout0.exit(false);
      MockIOException mockIOException0 = new MockIOException();
      MockIOException mockIOException1 = new MockIOException(mockIOException0);
      IOException iOException0 = asyncTimeout0.newTimeoutException(mockIOException1);
      asyncTimeout0.deadlineNanoTime(4294967295L);
      mockIOException1.getCause();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("C9_8JTaCtDi+}W.M");
      mockPrintWriter0.println();
      mockPrintWriter0.println("");
      mockIOException0.printStackTrace((PrintWriter) mockPrintWriter0);
      Sink sink0 = asyncTimeout0.sink((Sink) null);
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      asyncTimeout0.timeout(4294967295L, timeUnit0);
      asyncTimeout0.exit(false);
      asyncTimeout0.exit((IOException) mockIOException1);
      asyncTimeout0.source((Source) null);
      asyncTimeout0.enter();
      asyncTimeout0.sink(sink0);
      asyncTimeout0.exit(iOException0);
      asyncTimeout0.exit((IOException) mockIOException1);
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
  public void test4()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      MockIOException mockIOException0 = new MockIOException();
      MockIOException mockIOException1 = new MockIOException(mockIOException0);
      asyncTimeout0.newTimeoutException(mockIOException1);
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadlineNanoTime(4294967295L);
      mockIOException1.getCause();
      asyncTimeout0.exit((IOException) mockIOException1);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("C9_;JTajDi+}W.M");
      mockPrintWriter0.println();
      mockPrintWriter0.println("");
      mockIOException0.printStackTrace((PrintWriter) mockPrintWriter0);
      Sink sink0 = asyncTimeout0.sink((Sink) null);
      asyncTimeout0.exit(false);
      asyncTimeout0.exit((IOException) mockIOException1);
      asyncTimeout0.source((Source) null);
      asyncTimeout0.enter();
      asyncTimeout0.sink(sink0);
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
  public void test5()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      asyncTimeout0.exit(false);
      MockIOException mockIOException0 = new MockIOException();
      MockIOException mockIOException1 = new MockIOException(mockIOException0);
      asyncTimeout0.newTimeoutException(mockIOException1);
      Timeout timeout0 = asyncTimeout0.deadlineNanoTime(4294967295L);
      timeout0.clearDeadline();
      MockIOException mockIOException2 = new MockIOException();
      asyncTimeout0.exit((IOException) mockIOException1);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("C9_;JTajDi+}W.M");
      mockPrintWriter0.println();
      mockPrintWriter0.println("");
      mockIOException0.printStackTrace((PrintWriter) mockPrintWriter0);
      Sink sink0 = asyncTimeout0.sink((Sink) null);
      asyncTimeout0.newTimeoutException(mockIOException0);
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.timeout(4294967295L, timeUnit0);
      asyncTimeout0.exit(false);
      asyncTimeout0.exit((IOException) mockIOException1);
      asyncTimeout0.source((Source) null);
      asyncTimeout0.enter();
      asyncTimeout0.sink(sink0);
      asyncTimeout1.exit(true);
      asyncTimeout1.exit((IOException) mockIOException0);
      asyncTimeout1.timedOut();
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
      asyncTimeout0.enter();
      asyncTimeout0.exit(false);
      MockIOException mockIOException0 = new MockIOException();
      MockIOException mockIOException1 = new MockIOException(mockIOException0);
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadlineNanoTime(4294967295L);
      MockIOException mockIOException2 = (MockIOException)mockIOException1.getCause();
      asyncTimeout0.exit((IOException) mockIOException1);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("C9_;JTajDi+}W.M");
      mockPrintWriter0.println();
      mockPrintWriter0.println("");
      mockIOException0.printStackTrace((PrintWriter) mockPrintWriter0);
      asyncTimeout0.sink((Sink) null);
      asyncTimeout0.newTimeoutException(mockIOException0);
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      AsyncTimeout asyncTimeout2 = (AsyncTimeout)asyncTimeout0.timeout(4294967295L, timeUnit0);
      asyncTimeout0.exit(false);
      asyncTimeout0.exit((IOException) mockIOException1);
      asyncTimeout0.enter();
      asyncTimeout1.sink((Sink) null);
      asyncTimeout2.exit((IOException) mockIOException2);
      asyncTimeout1.exit((IOException) mockIOException0);
      asyncTimeout2.exit(false);
      asyncTimeout2.exit((IOException) mockIOException0);
      AsyncTimeout asyncTimeout3 = new AsyncTimeout();
      asyncTimeout0.exit();
      asyncTimeout1.enter();
      AsyncTimeout asyncTimeout4 = AsyncTimeout.head;
      asyncTimeout4.timedOut();
      System.setCurrentTimeMillis(4294967295L);
  }
}