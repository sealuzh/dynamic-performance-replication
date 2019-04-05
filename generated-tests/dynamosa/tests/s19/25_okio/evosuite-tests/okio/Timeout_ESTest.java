/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 07:06:07 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import okio.Timeout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Timeout_ESTest extends Timeout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      Object object0 = new Object();
      Timeout timeout1 = timeout0.deadline(4674L, timeUnit0);
      // Undeclared exception!
      try { 
        timeout1.waitUntilNotified(object0);
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.deadlineNanoTime(1392409281320819L);
      // Undeclared exception!
      try { 
        timeout1.waitUntilNotified(timeout0);
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.deadlineNanoTime(0L);
      System.setCurrentTimeMillis(0L);
      Object object0 = new Object();
      try { 
        timeout0.waitUntilNotified(object0);
        fail("Expecting exception: InterruptedIOException");
      
      } catch(InterruptedIOException e) {
         //
         // timeout
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.deadlineNanoTime(0L);
      System.setCurrentTimeMillis(0L);
      try { 
        timeout0.throwIfReached();
        fail("Expecting exception: InterruptedIOException");
      
      } catch(InterruptedIOException e) {
         //
         // deadline reached
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      timeout0.timeout(316L, timeUnit0);
      long long0 = timeout0.timeoutNanos();
      assertEquals(316000000000L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.deadlineNanoTime(0L);
      boolean boolean0 = timeout1.hasDeadline();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      timeout0.deadline(316L, timeUnit0);
      long long0 = timeout0.deadlineNanoTime();
      assertEquals(1392725281320000L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.deadlineNanoTime((-1L));
      long long0 = timeout0.deadlineNanoTime();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      Timeout timeout1 = timeout0.timeout(316L, timeUnit0);
      timeout1.deadline(316L, timeUnit0);
      assertEquals(316000000000L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      Timeout timeout1 = timeout0.deadline(1241L, timeUnit0);
      Timeout timeout2 = timeout1.clearTimeout();
      assertEquals(0L, timeout2.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      timeout0.timeout(316L, timeUnit0);
      timeout0.clearDeadline();
      assertEquals(316000000000L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      Timeout timeout1 = timeout0.timeout(0L, timeUnit0);
      assertFalse(timeout1.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      // Undeclared exception!
      try { 
        timeout0.deadline(0L, timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duration <= 0: 0
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      // Undeclared exception!
      try { 
        timeout0.waitUntilNotified((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.deadlineNanoTime(0L);
      long long0 = timeout1.deadlineNanoTime();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      long long0 = timeout0.timeoutNanos();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      boolean boolean0 = timeout0.hasDeadline();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      Timeout timeout1 = timeout0.timeout(4807L, timeUnit0);
      // Undeclared exception!
      try { 
        timeout1.waitUntilNotified(timeUnit0);
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.deadlineNanoTime(0L);
      try { 
        timeout0.throwIfReached();
        fail("Expecting exception: InterruptedIOException");
      
      } catch(InterruptedIOException e) {
         //
         // deadline reached
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.throwIfReached();
      assertEquals(0L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      // Undeclared exception!
      try { 
        timeout0.deadline(1L, (TimeUnit) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unit == null
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      // Undeclared exception!
      try { 
        timeout0.deadline((-1L), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duration <= 0: -1
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      timeout0.deadline(1L, timeUnit0);
      timeout0.timeout(1L, timeUnit0);
      assertTrue(timeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      // Undeclared exception!
      try { 
        timeout0.deadlineNanoTime();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No deadline
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      // Undeclared exception!
      try { 
        timeout0.timeout(1L, (TimeUnit) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unit == null
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      // Undeclared exception!
      try { 
        timeout0.timeout((-5199L), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout < 0: -5199
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      timeout0.timeout(1L, timeUnit0);
      timeout0.deadlineNanoTime(1L);
      try { 
        timeout0.waitUntilNotified(timeout0);
        fail("Expecting exception: InterruptedIOException");
      
      } catch(InterruptedIOException e) {
         //
         // timeout
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      Timeout timeout1 = timeout0.timeout(890000000L, timeUnit0);
      assertSame(timeout0, timeout1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      timeout0.throwIfReached();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.clearTimeout();
      assertEquals(0L, timeout1.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.deadlineNanoTime(1392409281320819L);
      timeout0.throwIfReached();
      assertTrue(timeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.clearDeadline();
      assertFalse(timeout1.hasDeadline());
  }
}