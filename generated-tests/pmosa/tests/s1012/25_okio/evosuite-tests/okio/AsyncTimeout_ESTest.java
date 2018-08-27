/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 00:07:47 GMT 2018
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
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AsyncTimeout_ESTest extends AsyncTimeout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      MockIOException mockIOException0 = new MockIOException();
      mockIOException0.toString();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      asyncTimeout0.deadline(10000000000000L, timeUnit0);
      asyncTimeout0.enter();
      asyncTimeout0.sink((Sink) null);
      IOException iOException0 = asyncTimeout0.newTimeoutException(mockIOException0);
      mockIOException0.getCause();
      IOException iOException1 = asyncTimeout0.exit(iOException0);
      asyncTimeout0.newTimeoutException(iOException1);
      MockIOException mockIOException1 = new MockIOException("<2Y");
      mockIOException1.printStackTrace();
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
  public void test1()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      asyncTimeout0.deadlineNanoTime(559L);
      asyncTimeout0.timeout(559L, timeUnit0);
      asyncTimeout0.enter();
      AsyncTimeout.awaitTimeout();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadline(10000000000000L, timeUnit0);
      asyncTimeout0.enter();
      asyncTimeout0.sink((Sink) null);
      asyncTimeout1.exit(true);
      assertTrue(asyncTimeout1.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      assertNotNull(asyncTimeout0);
      assertFalse(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      
      asyncTimeout0.exit(false);
      assertFalse(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      
      asyncTimeout0.enter();
      assertFalse(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      assertNotNull(asyncTimeout0);
      assertFalse(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      Source source0 = asyncTimeout0.source((Source) null);
      assertNotNull(source0);
      assertFalse(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      
      // Undeclared exception!
      try { 
        asyncTimeout0.deadline(0L, timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duration <= 0: 0
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      assertNotNull(asyncTimeout0);
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertFalse(asyncTimeout0.hasDeadline());
      
      Timeout timeout0 = asyncTimeout0.clearDeadline();
      assertNotNull(timeout0);
      assertSame(asyncTimeout0, timeout0);
      assertSame(timeout0, asyncTimeout0);
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertFalse(asyncTimeout0.hasDeadline());
      assertEquals(0L, timeout0.timeoutNanos());
      assertFalse(timeout0.hasDeadline());
      
      asyncTimeout0.exit(true);
      assertSame(asyncTimeout0, timeout0);
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertFalse(asyncTimeout0.hasDeadline());
      
      asyncTimeout0.timedOut();
      assertSame(asyncTimeout0, timeout0);
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertFalse(asyncTimeout0.hasDeadline());
      
      // Undeclared exception!
      try { 
        AsyncTimeout.awaitTimeout();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      assertNotNull(asyncTimeout0);
      assertFalse(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      
      MockIOException mockIOException0 = new MockIOException();
      assertNotNull(mockIOException0);
      
      String string0 = mockIOException0.toString();
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable", string0);
      assertNotNull(string0);
      
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      Timeout timeout0 = asyncTimeout0.deadline(10000000000000L, timeUnit0);
      assertNotNull(timeout0);
      assertSame(asyncTimeout0, timeout0);
      assertSame(timeout0, asyncTimeout0);
      assertTrue(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertEquals(0L, timeout0.timeoutNanos());
      assertTrue(timeout0.hasDeadline());
      
      Timeout timeout1 = timeout0.deadlineNanoTime(10000000000000L);
      assertNotNull(timeout1);
      assertSame(asyncTimeout0, timeout1);
      assertSame(asyncTimeout0, timeout0);
      assertSame(timeout0, timeout1);
      assertSame(timeout0, asyncTimeout0);
      assertSame(timeout1, timeout0);
      assertSame(timeout1, asyncTimeout0);
      assertTrue(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertEquals(0L, timeout0.timeoutNanos());
      assertTrue(timeout0.hasDeadline());
      assertTrue(timeout1.hasDeadline());
      assertEquals(0L, timeout1.timeoutNanos());
      
      asyncTimeout0.enter();
      assertSame(asyncTimeout0, timeout1);
      assertSame(asyncTimeout0, timeout0);
      assertTrue(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      
      Sink sink0 = asyncTimeout0.sink((Sink) null);
      assertNotNull(sink0);
      assertSame(asyncTimeout0, timeout1);
      assertSame(asyncTimeout0, timeout0);
      assertTrue(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      
      InterruptedIOException interruptedIOException0 = (InterruptedIOException)asyncTimeout0.newTimeoutException(mockIOException0);
      assertEquals(0, interruptedIOException0.bytesTransferred);
      assertNotNull(interruptedIOException0);
      assertSame(asyncTimeout0, timeout1);
      assertSame(asyncTimeout0, timeout0);
      assertTrue(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertEquals("java.io.InterruptedIOException: timeout", interruptedIOException0.toString());
      assertEquals("timeout", interruptedIOException0.getMessage());
      
      Throwable throwable0 = mockIOException0.getCause();
      assertNull(throwable0);
      
      InterruptedIOException interruptedIOException1 = (InterruptedIOException)asyncTimeout0.exit((IOException) interruptedIOException0);
      assertEquals(0, interruptedIOException0.bytesTransferred);
      assertEquals(0, interruptedIOException1.bytesTransferred);
      assertNotNull(interruptedIOException1);
      assertFalse(interruptedIOException1.equals((Object)interruptedIOException0));
      assertSame(asyncTimeout0, timeout1);
      assertSame(asyncTimeout0, timeout0);
      assertNotSame(interruptedIOException0, interruptedIOException1);
      assertNotSame(interruptedIOException1, interruptedIOException0);
      assertTrue(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertEquals("java.io.InterruptedIOException: timeout", interruptedIOException0.toString());
      assertEquals("timeout", interruptedIOException0.getMessage());
      assertEquals("java.io.InterruptedIOException: timeout", interruptedIOException1.toString());
      assertEquals("timeout", interruptedIOException1.getMessage());
      
      InterruptedIOException interruptedIOException2 = (InterruptedIOException)asyncTimeout0.newTimeoutException(interruptedIOException1);
      assertEquals(0, interruptedIOException0.bytesTransferred);
      assertEquals(0, interruptedIOException1.bytesTransferred);
      assertEquals(0, interruptedIOException2.bytesTransferred);
      assertNotNull(interruptedIOException2);
      assertFalse(interruptedIOException0.equals((Object)interruptedIOException1));
      assertFalse(interruptedIOException1.equals((Object)interruptedIOException0));
      assertFalse(interruptedIOException2.equals((Object)interruptedIOException0));
      assertFalse(interruptedIOException2.equals((Object)interruptedIOException1));
      assertSame(asyncTimeout0, timeout1);
      assertSame(asyncTimeout0, timeout0);
      assertNotSame(interruptedIOException0, interruptedIOException2);
      assertNotSame(interruptedIOException0, interruptedIOException1);
      assertNotSame(interruptedIOException1, interruptedIOException0);
      assertNotSame(interruptedIOException1, interruptedIOException2);
      assertNotSame(interruptedIOException2, interruptedIOException0);
      assertNotSame(interruptedIOException2, interruptedIOException1);
      assertTrue(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertEquals("java.io.InterruptedIOException: timeout", interruptedIOException0.toString());
      assertEquals("timeout", interruptedIOException0.getMessage());
      assertEquals("java.io.InterruptedIOException: timeout", interruptedIOException1.toString());
      assertEquals("timeout", interruptedIOException1.getMessage());
      assertEquals("java.io.InterruptedIOException: timeout", interruptedIOException2.toString());
      assertEquals("timeout", interruptedIOException2.getMessage());
      
      MockIOException mockIOException1 = new MockIOException("<2Y");
      assertNotNull(mockIOException1);
      assertFalse(mockIOException1.equals((Object)mockIOException0));
      
      mockIOException1.printStackTrace();
      assertFalse(mockIOException1.equals((Object)mockIOException0));
      assertNotSame(mockIOException1, mockIOException0);
      
      MockIOException mockIOException2 = (MockIOException)asyncTimeout0.exit((IOException) mockIOException1);
      assertNotNull(mockIOException2);
      assertFalse(mockIOException1.equals((Object)mockIOException0));
      assertFalse(mockIOException2.equals((Object)mockIOException0));
      assertSame(asyncTimeout0, timeout1);
      assertSame(asyncTimeout0, timeout0);
      assertNotSame(mockIOException1, mockIOException0);
      assertSame(mockIOException1, mockIOException2);
      assertSame(mockIOException2, mockIOException1);
      assertNotSame(mockIOException2, mockIOException0);
      assertTrue(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      
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
      assertNotNull(asyncTimeout0);
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertFalse(asyncTimeout0.hasDeadline());
      
      MockIOException mockIOException0 = new MockIOException();
      assertNotNull(mockIOException0);
      
      String string0 = mockIOException0.toString();
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable", string0);
      assertNotNull(string0);
      
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadline(10000000000000L, timeUnit0);
      assertNotNull(asyncTimeout1);
      assertSame(asyncTimeout0, asyncTimeout1);
      assertSame(asyncTimeout1, asyncTimeout0);
      assertTrue(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertTrue(asyncTimeout1.hasDeadline());
      assertEquals(0L, asyncTimeout1.timeoutNanos());
      
      asyncTimeout0.enter();
      assertSame(asyncTimeout0, asyncTimeout1);
      assertTrue(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      
      Sink sink0 = asyncTimeout1.sink((Sink) null);
      assertNotNull(sink0);
      assertSame(asyncTimeout0, asyncTimeout1);
      assertSame(asyncTimeout1, asyncTimeout0);
      assertTrue(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertTrue(asyncTimeout1.hasDeadline());
      assertEquals(0L, asyncTimeout1.timeoutNanos());
      
      InterruptedIOException interruptedIOException0 = (InterruptedIOException)asyncTimeout0.newTimeoutException(mockIOException0);
      assertEquals(0, interruptedIOException0.bytesTransferred);
      assertNotNull(interruptedIOException0);
      assertSame(asyncTimeout0, asyncTimeout1);
      assertTrue(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertEquals("timeout", interruptedIOException0.getMessage());
      assertEquals("java.io.InterruptedIOException: timeout", interruptedIOException0.toString());
      
      AsyncTimeout asyncTimeout2 = AsyncTimeout.head;
      assertNotNull(asyncTimeout2);
      assertFalse(asyncTimeout2.equals((Object)asyncTimeout1));
      assertFalse(asyncTimeout2.equals((Object)asyncTimeout0));
      assertNotSame(asyncTimeout2, asyncTimeout1);
      assertNotSame(asyncTimeout2, asyncTimeout0);
      assertFalse(asyncTimeout2.hasDeadline());
      assertEquals(0L, asyncTimeout2.timeoutNanos());
      
      MockIOException mockIOException1 = (MockIOException)asyncTimeout2.exit((IOException) mockIOException0);
      assertNotNull(mockIOException1);
      assertFalse(asyncTimeout2.equals((Object)asyncTimeout1));
      assertFalse(asyncTimeout2.equals((Object)asyncTimeout0));
      assertSame(mockIOException0, mockIOException1);
      assertNotSame(asyncTimeout2, asyncTimeout1);
      assertNotSame(asyncTimeout2, asyncTimeout0);
      assertSame(mockIOException1, mockIOException0);
      assertFalse(asyncTimeout2.hasDeadline());
      assertEquals(0L, asyncTimeout2.timeoutNanos());
      
      InterruptedIOException interruptedIOException1 = (InterruptedIOException)asyncTimeout1.newTimeoutException(mockIOException1);
      assertEquals(0, interruptedIOException1.bytesTransferred);
      assertNotNull(interruptedIOException1);
      assertFalse(asyncTimeout0.equals((Object)asyncTimeout2));
      assertFalse(asyncTimeout1.equals((Object)asyncTimeout2));
      assertFalse(asyncTimeout2.equals((Object)asyncTimeout1));
      assertFalse(asyncTimeout2.equals((Object)asyncTimeout0));
      assertFalse(interruptedIOException1.equals((Object)interruptedIOException0));
      assertNotSame(asyncTimeout0, asyncTimeout2);
      assertSame(asyncTimeout0, asyncTimeout1);
      assertSame(mockIOException0, mockIOException1);
      assertNotSame(asyncTimeout1, asyncTimeout2);
      assertSame(asyncTimeout1, asyncTimeout0);
      assertNotSame(asyncTimeout2, asyncTimeout1);
      assertNotSame(asyncTimeout2, asyncTimeout0);
      assertSame(mockIOException1, mockIOException0);
      assertNotSame(interruptedIOException1, interruptedIOException0);
      assertTrue(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertTrue(asyncTimeout1.hasDeadline());
      assertEquals(0L, asyncTimeout1.timeoutNanos());
      assertFalse(asyncTimeout2.hasDeadline());
      assertEquals(0L, asyncTimeout2.timeoutNanos());
      assertEquals("timeout", interruptedIOException1.getMessage());
      assertEquals("java.io.InterruptedIOException: timeout", interruptedIOException1.toString());
      
      MockIOException mockIOException2 = new MockIOException("");
      assertNotNull(mockIOException2);
      assertFalse(mockIOException2.equals((Object)mockIOException1));
      assertFalse(mockIOException2.equals((Object)mockIOException0));
      
      mockIOException0.printStackTrace();
      assertFalse(mockIOException0.equals((Object)mockIOException2));
      assertNotSame(mockIOException0, mockIOException2);
      assertSame(mockIOException0, mockIOException1);
      
      MockIOException mockIOException3 = new MockIOException("");
      assertNotNull(mockIOException3);
      assertFalse(mockIOException3.equals((Object)mockIOException1));
      assertFalse(mockIOException3.equals((Object)mockIOException0));
      assertFalse(mockIOException3.equals((Object)mockIOException2));
      
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
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
      
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      assertNotNull(asyncTimeout0);
      assertFalse(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      
      MockIOException mockIOException0 = new MockIOException();
      assertNotNull(mockIOException0);
      
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadline(10000000000000L, timeUnit0);
      assertNotNull(asyncTimeout1);
      assertSame(asyncTimeout0, asyncTimeout1);
      assertSame(asyncTimeout1, asyncTimeout0);
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertTrue(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout1.timeoutNanos());
      assertTrue(asyncTimeout1.hasDeadline());
      
      asyncTimeout1.enter();
      assertSame(asyncTimeout0, asyncTimeout1);
      assertSame(asyncTimeout1, asyncTimeout0);
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertTrue(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout1.timeoutNanos());
      assertTrue(asyncTimeout1.hasDeadline());
      
      MockIOException mockIOException1 = new MockIOException();
      assertNotNull(mockIOException1);
      assertFalse(mockIOException1.equals((Object)mockIOException0));
      
      InterruptedIOException interruptedIOException0 = (InterruptedIOException)asyncTimeout0.newTimeoutException(mockIOException0);
      assertEquals(0, interruptedIOException0.bytesTransferred);
      assertNotNull(interruptedIOException0);
      assertFalse(mockIOException0.equals((Object)mockIOException1));
      assertSame(asyncTimeout0, asyncTimeout1);
      assertNotSame(mockIOException0, mockIOException1);
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertTrue(asyncTimeout0.hasDeadline());
      assertEquals("java.io.InterruptedIOException: timeout", interruptedIOException0.toString());
      assertEquals("timeout", interruptedIOException0.getMessage());
      
      asyncTimeout0.exit(false);
      assertSame(asyncTimeout0, asyncTimeout1);
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertTrue(asyncTimeout0.hasDeadline());
      
      InterruptedIOException interruptedIOException1 = (InterruptedIOException)asyncTimeout0.newTimeoutException(mockIOException1);
      assertEquals(0, interruptedIOException1.bytesTransferred);
      assertNotNull(interruptedIOException1);
      assertFalse(mockIOException1.equals((Object)mockIOException0));
      assertFalse(interruptedIOException1.equals((Object)interruptedIOException0));
      assertSame(asyncTimeout0, asyncTimeout1);
      assertNotSame(mockIOException1, mockIOException0);
      assertNotSame(interruptedIOException1, interruptedIOException0);
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertTrue(asyncTimeout0.hasDeadline());
      assertEquals("java.io.InterruptedIOException: timeout", interruptedIOException1.toString());
      assertEquals("timeout", interruptedIOException1.getMessage());
      
      asyncTimeout0.enter();
      assertSame(asyncTimeout0, asyncTimeout1);
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertTrue(asyncTimeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      assertNotNull(asyncTimeout0);
      assertFalse(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      AsyncTimeout asyncTimeout1 = new AsyncTimeout();
      assertNotNull(asyncTimeout1);
      assertFalse(asyncTimeout1.equals((Object)asyncTimeout0));
      assertFalse(asyncTimeout1.hasDeadline());
      assertEquals(0L, asyncTimeout1.timeoutNanos());
      
      MockIOException mockIOException0 = new MockIOException("[Lqu_6Ya@~L'rg}\"U7");
      assertNotNull(mockIOException0);
      
      MockThrowable mockThrowable0 = new MockThrowable("M|[\"7LCM4Shb'[>", mockIOException0);
      assertNotNull(mockThrowable0);
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable: M|[\"7LCM4Shb'[>", mockThrowable0.toString());
      assertEquals("M|[\"7LCM4Shb'[>", mockThrowable0.getMessage());
      
      MockIOException mockIOException1 = new MockIOException(mockThrowable0);
      assertNotNull(mockIOException1);
      assertFalse(mockIOException1.equals((Object)mockIOException0));
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable: M|[\"7LCM4Shb'[>", mockThrowable0.toString());
      assertEquals("M|[\"7LCM4Shb'[>", mockThrowable0.getMessage());
      
      String string0 = mockIOException1.getMessage();
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable: M|[\"7LCM4Shb'[>", string0);
      assertNotNull(string0);
      assertFalse(mockIOException0.equals((Object)mockIOException1));
      assertFalse(mockIOException1.equals((Object)mockIOException0));
      assertNotSame(mockIOException0, mockIOException1);
      assertNotSame(mockIOException1, mockIOException0);
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable: M|[\"7LCM4Shb'[>", mockThrowable0.toString());
      assertEquals("M|[\"7LCM4Shb'[>", mockThrowable0.getMessage());
      
      InterruptedIOException interruptedIOException0 = (InterruptedIOException)asyncTimeout0.newTimeoutException(mockIOException1);
      assertEquals(0, interruptedIOException0.bytesTransferred);
      assertNotNull(interruptedIOException0);
      assertFalse(asyncTimeout0.equals((Object)asyncTimeout1));
      assertFalse(mockIOException0.equals((Object)mockIOException1));
      assertFalse(mockIOException1.equals((Object)mockIOException0));
      assertNotSame(asyncTimeout0, asyncTimeout1);
      assertNotSame(mockIOException0, mockIOException1);
      assertNotSame(mockIOException1, mockIOException0);
      assertFalse(asyncTimeout0.hasDeadline());
      assertEquals(0L, asyncTimeout0.timeoutNanos());
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable: M|[\"7LCM4Shb'[>", mockThrowable0.toString());
      assertEquals("M|[\"7LCM4Shb'[>", mockThrowable0.getMessage());
      assertEquals("java.io.InterruptedIOException: timeout", interruptedIOException0.toString());
      assertEquals("timeout", interruptedIOException0.getMessage());
      
      AsyncTimeout asyncTimeout2 = (AsyncTimeout)asyncTimeout0.timeout(559L, timeUnit0);
      assertNotNull(asyncTimeout2);
      assertFalse(asyncTimeout0.equals((Object)asyncTimeout1));
      assertFalse(asyncTimeout2.equals((Object)asyncTimeout1));
      assertSame(asyncTimeout0, asyncTimeout2);
      assertNotSame(asyncTimeout0, asyncTimeout1);
      assertNotSame(asyncTimeout2, asyncTimeout1);
      assertSame(asyncTimeout2, asyncTimeout0);
      assertFalse(asyncTimeout0.hasDeadline());
      assertEquals(559000000000L, asyncTimeout0.timeoutNanos());
      assertFalse(asyncTimeout2.hasDeadline());
      assertEquals(559000000000L, asyncTimeout2.timeoutNanos());
      
      asyncTimeout0.enter();
      assertFalse(asyncTimeout0.equals((Object)asyncTimeout1));
      assertSame(asyncTimeout0, asyncTimeout2);
      assertNotSame(asyncTimeout0, asyncTimeout1);
      assertFalse(asyncTimeout0.hasDeadline());
      assertEquals(559000000000L, asyncTimeout0.timeoutNanos());
      
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
