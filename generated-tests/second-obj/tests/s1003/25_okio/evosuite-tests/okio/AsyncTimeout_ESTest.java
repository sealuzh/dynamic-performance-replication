/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:49:44 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSink;
import okio.HashingSink;
import okio.RealBufferedSink;
import okio.Sink;
import okio.Source;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AsyncTimeout_ESTest extends AsyncTimeout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha1(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.outputStream();
      BufferedSink bufferedSink0 = realBufferedSink0.writeLong(65536L);
      Sink sink0 = asyncTimeout0.sink(bufferedSink0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      asyncTimeout0.timeout(2147483647L, timeUnit0);
      asyncTimeout0.clearDeadline();
      asyncTimeout0.exit();
      asyncTimeout0.exit(false);
      Buffer buffer0 = new Buffer();
      Source source0 = asyncTimeout0.source(buffer0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      MockIOException mockIOException0 = new MockIOException((String) null);
      MockThrowable mockThrowable0 = new MockThrowable(mockIOException0);
      MockIOException mockIOException1 = new MockIOException((String) null, mockThrowable0);
      IOException iOException0 = asyncTimeout0.exit((IOException) mockIOException1);
      asyncTimeout0.newTimeoutException(iOException0);
      asyncTimeout0.timedOut();
      assertFalse(asyncTimeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.clearDeadline();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      AsyncTimeout asyncTimeout1 = new AsyncTimeout();
      AsyncTimeout.head = asyncTimeout1;
      asyncTimeout0.deadline(2147483647L, timeUnit0);
      asyncTimeout0.exit();
      asyncTimeout0.enter();
      assertFalse(asyncTimeout0.equals((Object)asyncTimeout1));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.clearDeadline();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      AsyncTimeout asyncTimeout1 = AsyncTimeout.head;
      AsyncTimeout.head = null;
      AsyncTimeout asyncTimeout2 = (AsyncTimeout)asyncTimeout0.deadline(2147483647L, timeUnit0);
      asyncTimeout0.exit();
      asyncTimeout0.enter();
      // Undeclared exception!
      try { 
        asyncTimeout2.enter();
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
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      AsyncTimeout asyncTimeout1 = AsyncTimeout.head;
      AsyncTimeout.head = null;
      asyncTimeout0.deadline(2147483628L, timeUnit0);
      asyncTimeout0.enter();
      asyncTimeout0.exit(false);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      MockIOException mockIOException0 = new MockIOException();
      MockIOException mockIOException1 = new MockIOException();
      AsyncTimeout asyncTimeout2 = AsyncTimeout.head;
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
      asyncTimeout0.clearDeadline();
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      AsyncTimeout asyncTimeout1 = AsyncTimeout.head;
      asyncTimeout0.deadline(2147483647L, timeUnit0);
      asyncTimeout0.exit();
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