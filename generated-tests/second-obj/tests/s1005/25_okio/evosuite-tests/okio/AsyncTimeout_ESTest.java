/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 18:54:24 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.InterruptedIOException;
import okio.AsyncTimeout;
import okio.HashingSource;
import okio.Sink;
import okio.Source;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AsyncTimeout_ESTest extends AsyncTimeout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.exit(true);
      assertEquals(0L, asyncTimeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      Sink sink0 = asyncTimeout0.sink((Sink) null);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      MockIOException mockIOException0 = new MockIOException();
      asyncTimeout0.timedOut();
      asyncTimeout0.enter();
      Source source0 = asyncTimeout0.source((Source) null);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      MockIOException mockIOException0 = new MockIOException("34UdB");
      IOException iOException0 = asyncTimeout0.exit((IOException) mockIOException0);
      IOException iOException1 = asyncTimeout0.exit(iOException0);
      assertSame(iOException1, iOException0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.exit();
      MockIOException mockIOException0 = new MockIOException("");
      MockIOException mockIOException1 = new MockIOException("6-nBD.x[yfLI/5zs-/", mockIOException0);
      asyncTimeout0.newTimeoutException(mockIOException1);
      asyncTimeout0.newTimeoutException((IOException) null);
      asyncTimeout0.timedOut();
      asyncTimeout0.timedOut();
      asyncTimeout0.enter();
      Source source0 = null;
      // Undeclared exception!
      try { 
        HashingSource.sha256((Source) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // delegate == null
         //
         verifyException("okio.ForwardingSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.deadlineNanoTime((-1392409271320000L));
      MockIOException mockIOException0 = new MockIOException("8=_}%O");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      asyncTimeout0.timedOut();
      asyncTimeout0.enter();
      AsyncTimeout asyncTimeout1 = AsyncTimeout.awaitTimeout();
      assertTrue(asyncTimeout1.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.deadlineNanoTime(0L);
      MockIOException mockIOException0 = new MockIOException("34UdB");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)67;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      asyncTimeout0.timedOut();
      asyncTimeout0.timedOut();
      asyncTimeout0.enter();
      asyncTimeout0.exit(false);
      asyncTimeout0.enter();
      AsyncTimeout asyncTimeout1 = AsyncTimeout.head;
      AsyncTimeout asyncTimeout2 = AsyncTimeout.head;
      // Undeclared exception!
      try { 
        asyncTimeout2.waitUntilNotified(mockIOException0);
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Object", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      AsyncTimeout.head = asyncTimeout0;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadlineNanoTime((-1392409271320000L));
      MockIOException mockIOException0 = new MockIOException("8=_}%O");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      asyncTimeout0.timedOut();
      asyncTimeout1.enter();
      AsyncTimeout.awaitTimeout();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadlineNanoTime(0L);
      MockIOException mockIOException0 = new MockIOException("34UdB");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)67;
      asyncTimeout0.timedOut();
      asyncTimeout1.enter();
      AsyncTimeout.awaitTimeout();
      asyncTimeout1.exit(false);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.deadlineNanoTime(0L);
      MockIOException mockIOException0 = new MockIOException("34UdB");
      asyncTimeout0.timedOut();
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
  public void test10()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.deadlineNanoTime(1391016862048680000L);
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadlineNanoTime(10000000L);
      MockIOException mockIOException0 = new MockIOException("");
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)2;
      byteArray0[2] = (byte) (-70);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      asyncTimeout0.timedOut();
      mockIOException0.getMessage();
      asyncTimeout1.enter();
      AsyncTimeout asyncTimeout2 = AsyncTimeout.awaitTimeout();
      asyncTimeout2.exit((IOException) mockIOException0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadlineNanoTime(10000000L);
      byte[] byteArray0 = new byte[6];
      asyncTimeout1.exit();
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      asyncTimeout0.timedOut();
      asyncTimeout1.timedOut();
      asyncTimeout0.enter();
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
}