/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 15:34:54 GMT 2018
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
import okio.ByteString;
import okio.GzipSource;
import okio.HashingSink;
import okio.HashingSource;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AsyncTimeout_ESTest extends AsyncTimeout_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.enter();
      asyncTimeout0.exit(false);
      assertEquals(0L, asyncTimeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      Pipe pipe0 = new Pipe(1282L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      pipe0.sourceClosed = true;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      asyncTimeout0.deadlineNanoTime(1282L);
      BufferedSink bufferedSink0 = realBufferedSink0.writeUtf8CodePoint(1114111);
      asyncTimeout0.sink(bufferedSink0);
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
  public void test02()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      asyncTimeout0.timedOut();
      MockIOException mockIOException0 = new MockIOException();
      MockIOException mockIOException1 = new MockIOException(mockIOException0);
      MockThrowable mockThrowable0 = new MockThrowable(mockIOException1);
      MockIOException mockIOException2 = new MockIOException("", mockThrowable0);
      mockIOException2.printStackTrace();
      IOException iOException0 = asyncTimeout0.exit((IOException) mockIOException2);
      IOException iOException1 = asyncTimeout0.newTimeoutException(iOException0);
      asyncTimeout0.enter();
      asyncTimeout0.sink((Sink) null);
      asyncTimeout0.sink((Sink) null);
      asyncTimeout0.sink((Sink) null);
      asyncTimeout0.timedOut();
      asyncTimeout0.exit(iOException1);
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
  public void test03()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      MockIOException mockIOException0 = new MockIOException();
      MockIOException mockIOException1 = new MockIOException(mockIOException0);
      asyncTimeout0.newTimeoutException(mockIOException1);
      Pipe pipe0 = new Pipe(65536L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha1(buffer0);
      HashingSink.sha1(hashingSink0);
      ByteString byteString0 = hashingSink0.hash();
      HashingSource.hmacSha256(pipe_PipeSource0, byteString0);
      GzipSource gzipSource0 = new GzipSource(pipe_PipeSource0);
      asyncTimeout0.source(gzipSource0);
      asyncTimeout0.exit(true);
      assertEquals(0L, asyncTimeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      System.setCurrentTimeMillis((-938L));
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      boolean boolean0 = asyncTimeout0.exit();
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)116;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)46;
      ByteString byteString0 = new ByteString(byteArray0);
      HashingSource hashingSource0 = HashingSource.hmacSha256(buffer0, byteString0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      Buffer buffer1 = realBufferedSource0.buffer();
      asyncTimeout0.source(buffer1);
      asyncTimeout0.exit((IOException) null);
      asyncTimeout0.newTimeoutException((IOException) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      asyncTimeout0.timedOut();
      asyncTimeout0.newTimeoutException((IOException) null);
      asyncTimeout0.timedOut();
      System.setCurrentTimeMillis((-938L));
      asyncTimeout0.timedOut();
      System.setCurrentTimeMillis(0L);
      asyncTimeout0.sink((Sink) null);
      System.setCurrentTimeMillis(4L);
      boolean boolean1 = asyncTimeout0.exit();
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      asyncTimeout0.timeout(558L, timeUnit0);
      asyncTimeout0.enter();
      System.setCurrentTimeMillis(1576L);
      System.setCurrentTimeMillis(65536L);
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
  public void test06()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      Timeout timeout0 = asyncTimeout0.timeout(558L, timeUnit0);
      timeout0.deadlineNanoTime(558L);
      asyncTimeout0.enter();
      System.setCurrentTimeMillis(558L);
      System.setCurrentTimeMillis(65536L);
      AsyncTimeout.awaitTimeout();
      long long0 = 0L;
      System.setCurrentTimeMillis(long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      asyncTimeout0.timeout(558L, timeUnit0);
      asyncTimeout0.enter();
      System.setCurrentTimeMillis(558L);
      System.setCurrentTimeMillis(65536L);
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
  public void test08()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      AsyncTimeout asyncTimeout1 = (AsyncTimeout)asyncTimeout0.timeout(558L, timeUnit0);
      MockThrowable mockThrowable0 = new MockThrowable("}:>$UT3");
      MockIOException mockIOException0 = new MockIOException(mockThrowable0);
      asyncTimeout1.exit((IOException) mockIOException0);
      asyncTimeout0.enter();
      asyncTimeout1.exit(true);
      Buffer buffer0 = new Buffer();
      Source source0 = asyncTimeout0.source(buffer0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      asyncTimeout0.timeout(558L, timeUnit0);
      asyncTimeout0.deadlineNanoTime(558L);
      asyncTimeout0.enter();
      System.setCurrentTimeMillis(558L);
      System.setCurrentTimeMillis(65536L);
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
  public void test10()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      asyncTimeout0.clearTimeout();
      asyncTimeout0.timeout(71776119061217299L, timeUnit0);
      asyncTimeout0.enter();
      asyncTimeout0.exit(false);
      asyncTimeout0.enter();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AsyncTimeout asyncTimeout0 = new AsyncTimeout();
      AsyncTimeout asyncTimeout1 = new AsyncTimeout();
      asyncTimeout0.deadlineNanoTime(558L);
      asyncTimeout0.enter();
      System.setCurrentTimeMillis(558L);
      System.setCurrentTimeMillis(65532L);
      AsyncTimeout.awaitTimeout();
      long long0 = 10000000000000L;
      System.setCurrentTimeMillis(long0);
  }
}