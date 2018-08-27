/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 06:58:11 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.InterruptedIOException;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.Source;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockIOException;
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
      MockIOException mockIOException0 = new MockIOException();
      AsyncTimeout asyncTimeout1 = new AsyncTimeout();
      IOException iOException0 = asyncTimeout1.newTimeoutException(mockIOException0);
      mockIOException0.initCause(iOException0);
      asyncTimeout0.throwIfReached();
      asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout1.newTimeoutException(iOException0);
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
      IOException iOException0 = null;
      asyncTimeout0.enter();
      asyncTimeout0.newTimeoutException((IOException) null);
      asyncTimeout0.enter();
      boolean boolean0 = true;
      asyncTimeout0.exit(true);
      Pipe pipe0 = null;
      try {
        pipe0 = new Pipe(0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxBufferSize < 1: 0
         //
         verifyException("okio.Pipe", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      MockIOException mockIOException0 = new MockIOException();
      StackTraceElement stackTraceElement0 = new StackTraceElement("AsyncTimeout.source(", "kk/l28.-oRjf&PY{J", "", 1);
      asyncTimeout0.deadlineNanoTime((long) 1);
      IOException iOException0 = asyncTimeout0.newTimeoutException(mockIOException0);
      asyncTimeout0.enter();
      asyncTimeout0.newTimeoutException(mockIOException0);
      asyncTimeout0.newTimeoutException(iOException0);
      mockIOException0.getSuppressed();
      mockIOException0.getSuppressed();
      mockIOException0.getCause();
      boolean boolean0 = true;
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
      asyncTimeout0.enter();
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[6];
      StackTraceElement stackTraceElement0 = new StackTraceElement("", "CR", "kB=~", 1);
      stackTraceElementArray0[0] = stackTraceElement0;
      asyncTimeout0.deadlineNanoTime((long) 1);
      asyncTimeout0.exit(true);
      asyncTimeout0.enter();
      AsyncTimeout.awaitTimeout();
      AsyncTimeout asyncTimeout1 = new AsyncTimeout();
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
  public void test5()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      MockIOException mockIOException0 = new MockIOException();
      StackTraceElement stackTraceElement0 = new StackTraceElement("kB=~", "kB=~", "okio.AsyncTimeout", 2123);
      asyncTimeout0.deadlineNanoTime((long) 1);
      IOException iOException0 = asyncTimeout0.newTimeoutException(mockIOException0);
      asyncTimeout0.enter();
      asyncTimeout0.newTimeoutException(iOException0);
      asyncTimeout0.newTimeoutException(iOException0);
      mockIOException0.getSuppressed();
      mockIOException0.getSuppressed();
      mockIOException0.getCause();
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
  public void test6()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      MockIOException mockIOException0 = new MockIOException();
      int int0 = 1;
      StackTraceElement stackTraceElement0 = new StackTraceElement("", "CR", "kB=~", 1);
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadlineNanoTime((long) 1);
      InterruptedIOException interruptedIOException0 = (InterruptedIOException)asyncTimeout0.newTimeoutException(mockIOException0);
      asyncTimeout0.enter();
      InterruptedIOException interruptedIOException1 = (InterruptedIOException)asyncTimeout0.newTimeoutException(interruptedIOException0);
      asyncTimeout0.newTimeoutException(interruptedIOException0);
      mockIOException0.getSuppressed();
      asyncTimeout1.newTimeoutException(interruptedIOException1);
      asyncTimeout0.exit(false);
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
      MockIOException mockIOException0 = new MockIOException();
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[6];
      StackTraceElement stackTraceElement0 = new StackTraceElement("", "CR", "kB=~", 1);
      stackTraceElementArray0[0] = stackTraceElement0;
      asyncTimeout0.deadlineNanoTime((long) 1);
      InterruptedIOException interruptedIOException0 = (InterruptedIOException)asyncTimeout0.newTimeoutException(mockIOException0);
      asyncTimeout0.enter();
      asyncTimeout0.newTimeoutException(interruptedIOException0);
      asyncTimeout0.newTimeoutException(interruptedIOException0);
      mockIOException0.getSuppressed();
      mockIOException0.getSuppressed();
      mockIOException0.getCause();
      boolean boolean0 = true;
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
  public void test8()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      boolean boolean0 = true;
      asyncTimeout0.throwIfReached();
      StackTraceElement stackTraceElement0 = new StackTraceElement("-jdBLq7lAl", "*", "*", (-887));
      asyncTimeout0.deadlineNanoTime(2806L);
      MockIOException mockIOException0 = new MockIOException();
      IOException iOException0 = asyncTimeout0.newTimeoutException(mockIOException0);
      asyncTimeout0.enter();
      asyncTimeout0.newTimeoutException(iOException0);
      IOException iOException1 = asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout0.newTimeoutException(iOException1);
      mockIOException0.getSuppressed();
      mockIOException0.getSuppressed();
      mockIOException0.getCause();
      asyncTimeout0.exit(true);
      asyncTimeout0.enter();
      FileSystemHandling.shouldAllThrowIOExceptions();
      AsyncTimeout.awaitTimeout();
      AsyncTimeout asyncTimeout1 = new AsyncTimeout();
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
  public void test9()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      MockIOException mockIOException0 = new MockIOException();
      StackTraceElement stackTraceElement0 = new StackTraceElement("okio.AsyncTimeout", "", "aM9cwy0:ywOu*Yx", 2127);
      asyncTimeout0.deadlineNanoTime(1000000000000000000L);
      IOException iOException0 = asyncTimeout0.newTimeoutException(mockIOException0);
      asyncTimeout0.enter();
      asyncTimeout0.newTimeoutException(iOException0);
      asyncTimeout0.newTimeoutException(mockIOException0);
      mockIOException0.getSuppressed();
      mockIOException0.getSuppressed();
      MockIOException mockIOException1 = new MockIOException(iOException0);
      mockIOException1.getCause();
      asyncTimeout0.exit(true);
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
