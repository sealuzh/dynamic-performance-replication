/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 06:25:31 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSink;
import okio.HashingSource;
import okio.Okio;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Okio_ESTest extends Okio_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.sink((OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // out == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("`F", "`F");
      Sink sink0 = Okio.appendingSink(mockFile0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.source((File) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // file == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      BufferedSink bufferedSink0 = Okio.buffer(sink0);
      assertNotNull(bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.sink((Socket) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // socket == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("[size=");
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        Okio.source(path0, (OpenOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.source((InputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // in == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      try { 
        Okio.sink((Socket) mockSocket0);
        fail("Expecting exception: SocketException");
      
      } catch(SocketException e) {
         //
         // Socket is not connected
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      try { 
        Okio.source((Socket) mockSocket0);
        fail("Expecting exception: SocketException");
      
      } catch(SocketException e) {
         //
         // Socket is not connected
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.source((Socket) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // socket == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile("[size=", "[size=");
          Path path0 = mockFile0.toPath();
          OpenOption[] openOptionArray0 = new OpenOption[0];
          // Undeclared exception!
          try { 
            Okio.sink(path0, openOptionArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/25_okio/[size=/[size=\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1556)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // sun.nio.fs.UnixChannelFactory.open(UnixChannelFactory.java:247)
             // sun.nio.fs.UnixChannelFactory.newFileChannel(UnixChannelFactory.java:136)
             // sun.nio.fs.UnixChannelFactory.newFileChannel(UnixChannelFactory.java:148)
             // sun.nio.fs.UnixFileSystemProvider.newByteChannel(UnixFileSystemProvider.java:212)
             // java.nio.file.spi.FileSystemProvider.newOutputStream(FileSystemProvider.java:434)
             // java.nio.file.Files.newOutputStream(Files.java:216)
             // okio.Okio.sink(Okio.java:193)
             // sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             // sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
             // java.lang.Thread.run(Thread.java:745)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OpenOption[] openOptionArray0 = new OpenOption[0];
      // Undeclared exception!
      try { 
        Okio.sink((Path) null, openOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // path == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.sink((File) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // file == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      AssertionError assertionError0 = new AssertionError("X@Bx*4#*Rh&", mockThrowable0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      AssertionError assertionError0 = new AssertionError((String) null, mockThrowable0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.appendingSink((File) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // file == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.source((Path) null, (OpenOption[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // path == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.buffer((Source) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // source == null
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "gSgmFx0[-OTHyk/Hk3A");
      MockException mockException0 = new MockException();
      AssertionError assertionError0 = new AssertionError("getsockname failed", mockException0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Source source0 = Okio.source((InputStream) pipedInputStream0);
      AssertionError assertionError0 = new AssertionError(source0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("okio.SegmentPool", "okio.SegmentPool");
      Okio.sink((File) mockFile0);
      Source source0 = Okio.source((File) mockFile0);
      HashingSource hashingSource0 = HashingSource.sha256(source0);
      Buffer buffer0 = new Buffer();
      // Undeclared exception!
      try { 
        hashingSource0.read(buffer0, (-72057594037927936L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -72057594037927936
         //
         verifyException("okio.Okio$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("\"j1}tAcgb", "\"j1}tAcgb");
      Sink sink0 = Okio.sink((File) mockFile0);
      Source source0 = Okio.source((File) mockFile0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      realBufferedSource0.timeout();
      BufferedSink bufferedSink0 = Okio.buffer(sink0);
      assertNotNull(bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile(".U\"M?`\"00'O<9we%m");
      Okio.sink((File) mockFile0);
      Source source0 = Okio.source((File) mockFile0);
      HashingSource hashingSource0 = HashingSource.md5(source0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      hashingSource0.read(realBufferedSource0.buffer, 0L);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(".U\"M?`\"00'O<9we%m");
      Buffer buffer0 = new Buffer();
      Source source1 = Okio.source((File) mockFile0);
      assertFalse(source1.equals((Object)source0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile("\"uaj1t,Acgb", "\"uaj1t,Acgb");
      Okio.sink((File) mockFile0);
      Source source0 = Okio.source((File) mockFile0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      realBufferedSource0.close();
      try { 
        realBufferedSource0.readByteString();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFile mockFile0 = new MockFile("okio.SegmentPool", "okio.SegmentPool");
      Okio.sink((File) mockFile0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_mosa/projects/25_okio/okio.SegmentPool/okio.SegmentPool");
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)124;
      byteArray0[1] = (byte) (-119);
      byteArray0[2] = (byte) (-47);
      byteArray0[3] = (byte) (-110);
      byteArray0[4] = (byte) (-62);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      Source source0 = Okio.source((File) mockFile0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      try { 
        realBufferedSource0.readUtf8LineStrict();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // \\n not found: limit=5 content=7c89d192c2\u2026
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      pipedOutputStream0.flush();
      Sink sink0 = Okio.sink((OutputStream) pipedOutputStream0);
      AssertionError assertionError0 = new AssertionError(sink0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }
}