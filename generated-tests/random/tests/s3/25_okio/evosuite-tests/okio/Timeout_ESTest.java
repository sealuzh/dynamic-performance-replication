/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 11:19:05 GMT 2019
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Timeout_ESTest extends Timeout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      timeout0.timeout(1000000L, timeUnit0);
      // Undeclared exception!
      try { 
        timeout0.waitUntilNotified(timeUnit0);
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
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      Timeout timeout1 = timeout0.timeout(309L, timeUnit0);
      long long0 = timeout1.timeoutNanos();
      assertEquals(309L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      Timeout timeout1 = timeout0.timeout(156L, timeUnit0);
      timeout1.deadlineNanoTime(156L);
      assertEquals(156L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      timeout0.timeout(309L, timeUnit0);
      timeout0.clearDeadline();
      assertEquals(309L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      Timeout timeout1 = timeout0.timeout(0L, timeUnit0);
      assertEquals(0L, timeout1.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      Timeout timeout1 = timeout0.deadlineNanoTime(0L);
      assertSame(timeout0, timeout1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      Timeout timeout1 = timeout0.deadlineNanoTime((-583L));
      assertSame(timeout0, timeout1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      // Undeclared exception!
      try { 
        timeout0.NONE.deadline(0L, timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duration <= 0: 0
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.deadlineNanoTime(156L);
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      timeout1.timeout(156L, timeUnit0);
      try { 
        timeout1.waitUntilNotified(timeout0);
        fail("Expecting exception: InterruptedIOException");
      
      } catch(InterruptedIOException e) {
         //
         // timeout
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.deadlineNanoTime(156L);
      try { 
        timeout1.waitUntilNotified(timeout0);
        fail("Expecting exception: InterruptedIOException");
      
      } catch(InterruptedIOException e) {
         //
         // timeout
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.deadlineNanoTime(2464L);
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
  public void test11()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      timeout0.deadline(762L, timeUnit0);
      timeout0.throwIfReached();
      assertEquals(0L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.throwIfReached();
      assertEquals(0L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      // Undeclared exception!
      try { 
        timeout0.deadline(2292L, (TimeUnit) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unit == null
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      // Undeclared exception!
      try { 
        timeout0.deadline((-583L), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duration <= 0: -583
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.deadlineNanoTime(156L);
      assertTrue(timeout0.hasDeadline());
      
      long long0 = timeout0.deadlineNanoTime();
      assertEquals(156L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      // Undeclared exception!
      try { 
        timeout0.timeout(156L, (TimeUnit) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unit == null
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      // Undeclared exception!
      try { 
        timeout0.timeout((-1210L), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout < 0: -1210
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      Timeout timeout1 = timeout0.timeout(309L, timeUnit0);
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
  public void test20()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      Timeout timeout1 = timeout0.timeout(1066L, timeUnit0);
      assertSame(timeout0, timeout1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.NONE.deadlineNanoTime(2464L);
      timeout1.throwIfReached();
      assertFalse(timeout0.equals((Object)timeout1));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      // Undeclared exception!
      try { 
        timeout0.waitUntilNotified(timeUnit0);
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      long long0 = timeout0.timeoutNanos();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.clearTimeout();
      assertEquals(0L, timeout1.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.deadlineNanoTime(3004L);
      timeout1.clearTimeout();
      assertTrue(timeout0.hasDeadline());
      assertEquals(0L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.clearDeadline();
      assertFalse(timeout1.hasDeadline());
  }
}