/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 21:27:48 GMT 2019
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
      timeout0.timeout(1589L, timeUnit0);
      timeout0.deadlineNanoTime(1589000L);
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
  public void test01()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      timeout0.deadline(1L, timeUnit0);
      // Undeclared exception!
      try { 
        timeout0.waitUntilNotified(timeout0);
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
      System.setCurrentTimeMillis(1589L);
      timeout0.deadlineNanoTime(1589000L);
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
  public void test03()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      timeout0.deadline(2246L, timeUnit0);
      timeout0.timeout(2246L, timeUnit0);
      System.setCurrentTimeMillis(1000000L);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        timeout0.waitUntilNotified(object0);
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
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.deadlineNanoTime(1589L);
      try { 
        timeout1.throwIfReached();
        fail("Expecting exception: InterruptedIOException");
      
      } catch(InterruptedIOException e) {
         //
         // deadline reached
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      Timeout timeout1 = timeout0.timeout(1L, timeUnit0);
      long long0 = timeout1.timeoutNanos();
      assertEquals(3600000000000L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      Timeout timeout1 = timeout0.timeout(0L, timeUnit0);
      assertFalse(timeout1.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.deadlineNanoTime(1589L);
      boolean boolean0 = timeout0.hasDeadline();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      timeout0.timeout(392L, timeUnit0);
      timeout0.deadlineNanoTime(0L);
      assertEquals(33868800000000000L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.deadlineNanoTime(0L);
      long long0 = timeout1.deadlineNanoTime();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.deadlineNanoTime((-669L));
      long long0 = timeout0.deadlineNanoTime();
      assertEquals((-669L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      timeout0.deadline(392L, timeUnit0);
      Timeout timeout1 = timeout0.clearTimeout();
      assertEquals(0L, timeout1.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      timeout0.timeout(1L, timeUnit0);
      timeout0.clearDeadline();
      assertEquals(3600000000000L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      Timeout timeout1 = timeout0.timeout(0L, timeUnit0);
      assertSame(timeout1, timeout0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      Timeout timeout1 = timeout0.deadlineNanoTime(0L);
      assertSame(timeout0, timeout1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      // Undeclared exception!
      try { 
        timeout0.deadline((-731L), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duration <= 0: -731
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
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
  public void test17()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      timeout0.deadline(392L, timeUnit0);
      assertTrue(timeout0.hasDeadline());
      
      long long0 = timeout0.deadlineNanoTime();
      assertEquals(35261209281320000L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      long long0 = timeout0.timeoutNanos();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      boolean boolean0 = timeout0.hasDeadline();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.deadlineNanoTime(1589000L);
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
  public void test21()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      timeout0.timeout(411L, timeUnit0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        timeout0.waitUntilNotified(object0);
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      Timeout timeout1 = timeout0.deadline(1589L, timeUnit0);
      timeout1.throwIfReached();
      assertTrue(timeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.deadlineNanoTime(1392409281320000L);
      try { 
        timeout1.throwIfReached();
        fail("Expecting exception: InterruptedIOException");
      
      } catch(InterruptedIOException e) {
         //
         // deadline reached
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.throwIfReached();
      assertEquals(0L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      // Undeclared exception!
      try { 
        timeout0.deadline(1000L, (TimeUnit) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unit == null
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      TimeUnit timeUnit0 = TimeUnit.DAYS;
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
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      // Undeclared exception!
      try { 
        timeout0.timeout(1589L, (TimeUnit) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unit == null
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      // Undeclared exception!
      try { 
        timeout0.timeout((-1012L), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout < 0: -1012
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      Timeout timeout1 = timeout0.timeout(1589L, timeUnit0);
      Timeout timeout2 = timeout1.deadline(1589L, timeUnit0);
      // Undeclared exception!
      try { 
        timeout0.waitUntilNotified(timeout2);
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      timeout0.NONE.throwIfReached();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.clearTimeout();
      assertEquals(0L, timeout1.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.clearDeadline();
      assertFalse(timeout1.hasDeadline());
  }
}
