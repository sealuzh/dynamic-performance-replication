/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 03:18:48 GMT 2018
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
      Timeout timeout0 = Timeout.NONE;
      Timeout timeout1 = timeout0.deadlineNanoTime(0L);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        timeout0.waitUntilNotified(timeout1);
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
      timeout0.NONE.clearDeadline();
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
  public void test02()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      timeout0.deadline(185L, timeUnit0);
      Timeout timeout1 = timeout0.timeout(185L, timeUnit0);
      // Undeclared exception!
      try { 
        timeout1.deadlineNanoTime();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No deadline
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Timeout timeout0 = Timeout.NONE;
      Timeout timeout1 = timeout0.clearDeadline();
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      TimeUnit timeUnit1 = TimeUnit.HOURS;
      timeout0.timeout((-805L), timeUnit1);
      timeout0.timeout((-805L), timeUnit0);
      timeout1.NONE.throwIfReached();
      Timeout timeout2 = timeout1.deadlineNanoTime((-4662L));
      timeout2.clearTimeout();
      TimeUnit timeUnit2 = TimeUnit.DAYS;
      // Undeclared exception!
      try { 
        timeout0.deadline(0L, timeUnit2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duration <= 0: 0
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      // Undeclared exception!
      try { 
        timeout0.timeout((-321L), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout < 0: -321
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.clearTimeout();
      Timeout timeout2 = timeout1.deadlineNanoTime(0L);
      long long0 = 4214L;
      TimeUnit timeUnit0 = TimeUnit.MINUTES;
      Timeout timeout3 = timeout2.timeout(4214L, timeUnit0);
      Timeout timeout4 = timeout3.clearDeadline();
      Timeout timeout5 = timeout4.deadlineNanoTime(0L);
      // Undeclared exception!
      try { 
        timeout5.NONE.deadlineNanoTime();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No deadline
         //
         verifyException("okio.Timeout", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.deadlineNanoTime(452L);
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      Timeout timeout2 = timeout1.timeout(452L, timeUnit0);
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
  public void test07()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      timeout0.deadlineNanoTime((-1L));
      Object object0 = new Object();
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
  public void test08()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      long long0 = (-1L);
      Timeout timeout1 = timeout0.deadlineNanoTime((-1L));
      Timeout timeout2 = timeout1.NONE.deadlineNanoTime((-1L));
      timeout2.clearDeadline();
      Timeout timeout3 = timeout0.deadline(452L, timeUnit0);
      timeout3.deadlineNanoTime((-1029L));
      try { 
        timeout3.waitUntilNotified(timeUnit0);
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
      Timeout timeout1 = timeout0.clearTimeout();
      Timeout timeout2 = timeout1.clearDeadline();
      assertFalse(timeout2.hasDeadline());
      
      timeout2.throwIfReached();
      assertEquals(0L, timeout2.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.clearDeadline();
      timeout1.clearTimeout();
      long long0 = 1000000L;
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      timeout1.timeout(1000000L, timeUnit0);
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
  public void test11()  throws Throwable  {
      Timeout timeout0 = new Timeout();
      Timeout timeout1 = timeout0.clearDeadline();
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      timeout0.deadline(1000000L, timeUnit0);
      timeout1.throwIfReached();
      // Undeclared exception!
      try { 
        timeout0.deadline((-394L), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duration <= 0: -394
         //
         verifyException("okio.Timeout", e);
      }
  }
}