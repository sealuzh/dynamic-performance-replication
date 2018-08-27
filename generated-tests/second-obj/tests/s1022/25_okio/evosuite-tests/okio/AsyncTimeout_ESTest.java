/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 08:29:56 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.ByteString;
import okio.HashingSink;
import okio.HashingSource;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
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
  public void test0()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "obU))/W94");
      FileSystemHandling.shouldAllThrowIOExceptions();
      asyncTimeout0.newTimeoutException((IOException) null);
      asyncTimeout0.throwIfReached();
      assertFalse(asyncTimeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      MockIOException mockIOException0 = new MockIOException((String) null);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      mockIOException0.getStackTrace();
      asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout0.timedOut();
      asyncTimeout0.enter();
      IOException iOException0 = asyncTimeout0.newTimeoutException(mockIOException0);
      assertEquals("timeout", iOException0.getMessage());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      Sink sink0 = asyncTimeout0.sink((Sink) null);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      MockIOException mockIOException0 = new MockIOException();
      mockIOException0.toString();
      asyncTimeout0.newTimeoutException(mockIOException0);
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      asyncTimeout0.deadline(1805L, timeUnit0);
      Source source0 = null;
      asyncTimeout0.source((Source) null);
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
  public void test4()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      MockIOException mockIOException0 = new MockIOException("=;0wtacq/");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "^8B=]c");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      IOException iOException0 = asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout0.exit(iOException0);
      asyncTimeout0.timedOut();
      IOException iOException1 = asyncTimeout0.exit(iOException0);
      asyncTimeout0.exit(iOException1);
      Source source0 = asyncTimeout0.source((Source) null);
      asyncTimeout0.timedOut();
      asyncTimeout0.exit(false);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      RealBufferedSource realBufferedSource1 = new RealBufferedSource(source0);
      // Undeclared exception!
      try { 
        realBufferedSource1.readByteString(999L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.AsyncTimeout$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      MockIOException mockIOException0 = new MockIOException();
      mockIOException0.toString();
      IOException iOException0 = asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout0.newTimeoutException(iOException0);
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadline(1805L, timeUnit0);
      asyncTimeout0.enter();
      asyncTimeout1.exit();
      asyncTimeout1.exit(false);
      Buffer buffer0 = new Buffer();
      buffer0.readAndWriteUnsafe();
      Inflater inflater0 = new Inflater();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      ByteString byteString0 = hashingSource0.hash();
      // Undeclared exception!
      try { 
        byteString0.startsWith((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.deadline(1805L, timeUnit0);
      asyncTimeout0.enter();
      asyncTimeout1.exit();
      asyncTimeout1.exit(false);
      asyncTimeout0.enter();
      RealBufferedSink realBufferedSink0 = null;
      try {
        realBufferedSink0 = new RealBufferedSink((Sink) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // sink == null
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      MockIOException mockIOException0 = new MockIOException();
      asyncTimeout0.exit((IOException) mockIOException0);
      asyncTimeout0.newTimeoutException(mockIOException0);
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      asyncTimeout0.timeout(1805L, timeUnit0);
      asyncTimeout0.source((Source) null);
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
}