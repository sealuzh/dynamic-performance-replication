/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 16:40:25 GMT 2018
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
      // Undeclared exception!
      try { 
        timeout0.deadline((-3348L), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duration <= 0: -3348
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      Timeout timeout1 = timeout0.timeout(1L, timeUnit0);
      long long0 = (-3348L);
      Timeout timeout2 = timeout1.timeout((-3348L), timeUnit0);
      timeout2.throwIfReached();
      timeout2.NONE.throwIfReached();
      timeout0.clearTimeout();
      Timeout timeout3 = timeout0.NONE.timeout((-3348L), timeUnit0);
      // Undeclared exception!
      try { 
        timeout3.deadline((-3348L), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duration <= 0: -3348
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.clearDeadline();
      // Undeclared exception!
      try { 
        timeout1.waitUntilNotified("1b4N/:^6!C4b");
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.deadlineNanoTime((-451L));
      try { 
        timeout1.waitUntilNotified("D+spb&~]\"\u0007ubP");
        fail("Expecting exception: InterruptedIOException");
      
      } catch(InterruptedIOException e) {
         //
         // timeout
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      Timeout timeout1 = timeout0.timeout(1057L, timeUnit0);
      TimeUnit timeUnit1 = TimeUnit.MICROSECONDS;
      timeout1.NONE.deadline(1326L, timeUnit1);
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
  public void test05()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.clearDeadline();
      timeout0.NONE.throwIfReached();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      timeout0.deadline(17514000000000000L, timeUnit0);
      assertTrue(timeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.throwIfReached();
      assertEquals(0L, timeout0.timeoutNanos());
      
      Timeout timeout1 = timeout0.clearDeadline();
      long long0 = (-1L);
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      // Undeclared exception!
      try { 
        timeout1.deadline((-1L), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duration <= 0: -1
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      Timeout timeout1 = new Timeout();
      TimeUnit timeUnit1 = TimeUnit.MICROSECONDS;
      Timeout timeout2 = timeout0.deadline(1326L, timeUnit0);
      // Undeclared exception!
      try { 
        timeout2.waitUntilNotified(timeUnit1);
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.deadlineNanoTime(631L);
      Timeout timeout2 = timeout1.clearTimeout();
      try { 
        timeout2.throwIfReached();
        fail("Expecting exception: InterruptedIOException");
      
      } catch(InterruptedIOException e) {
         //
         // deadline reached
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      timeout0.timeout(1L, timeUnit0);
      TimeUnit timeUnit1 = TimeUnit.DAYS;
      Timeout timeout1 = timeout0.deadline(1L, timeUnit1);
      timeout1.throwIfReached();
      Object object0 = new Object();
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
  public void test11()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      timeout0.timeout(671L, timeUnit0);
      Timeout timeout1 = timeout0.deadlineNanoTime(671L);
      timeout1.hasDeadline();
      Object object0 = new Object();
      try { 
        timeout1.waitUntilNotified("g-|/Li/HaB,u");
        fail("Expecting exception: InterruptedIOException");
      
      } catch(InterruptedIOException e) {
         //
         // timeout
         //
         verifyException("okio.Timeout", e);
      }
  }
}
