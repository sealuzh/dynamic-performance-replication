/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 07:29:08 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Okio_ESTest extends Okio_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Source source0 = Okio.source((InputStream) byteArrayInputStream0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      try { 
        realBufferedSource0.buffer.write(source0, 427L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      File file0 = MockFile.createTempFile("in == null", "");
      Source source0 = Okio.source(file0);
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeShort((-1113));
      try { 
        realBufferedSink0.buffer.write(source0, 1L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StandardOpenOption standardOpenOption0 = StandardOpenOption.CREATE_NEW;
      MockFile mockFile0 = new MockFile((File) null, "");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[3];
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      openOptionArray0[1] = (OpenOption) standardOpenOption0;
      openOptionArray0[2] = (OpenOption) standardOpenOption0;
      Source source0 = Okio.source(path0, openOptionArray0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      File file0 = MockFile.createTempFile("HUwObJ-_ootkF7g\"{", "HUwObJ-_ootkF7g\"{");
      Path path0 = file0.toPath();
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
  public void test04()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.close();
      try { 
        Okio.source((Socket) mockSocket0);
        fail("Expecting exception: SocketException");
      
      } catch(SocketException e) {
         //
         // Socket is closed
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(inetAddress0, 8192);
      mockSocket0.bind(mockInetSocketAddress0);
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
  public void test06()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null, 771);
      Source source0 = Okio.source((InputStream) bufferedInputStream0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/ < 0 < ");
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = MockFile.createTempFile(" < ", " < ");
      Source source0 = Okio.source(file0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      System.setCurrentTimeMillis((-2215L));
      File file0 = MockFile.createTempFile("4yYx\"O[@r{29;-\"s|~", "4yYx\"O[@r{29;-\"s|~");
      Source source0 = Okio.source(file0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      File file0 = MockFile.createTempFile(".8ci<=Ey~J?m", "`");
      Source source0 = Okio.source(file0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      try { 
        Okio.source((File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile("(W*C[i=]s", "UTF-8");
          Path path0 = mockFile0.toPath();
          OpenOption[] openOptionArray0 = new OpenOption[0];
          // Undeclared exception!
          try { 
            Okio.sink(path0, openOptionArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/home/apaniche/performance/Dataset/gordon_scripts/projects/25_okio/(W*C[i=]s/UTF-8\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1559)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // sun.nio.fs.UnixChannelFactory.open(UnixChannelFactory.java:247)
             // sun.nio.fs.UnixChannelFactory.newFileChannel(UnixChannelFactory.java:136)
             // sun.nio.fs.UnixChannelFactory.newFileChannel(UnixChannelFactory.java:148)
             // sun.nio.fs.UnixFileSystemProvider.newByteChannel(UnixFileSystemProvider.java:212)
             // java.nio.file.spi.FileSystemProvider.newOutputStream(FileSystemProvider.java:434)
             // java.nio.file.Files.newOutputStream(Files.java:216)
             // okio.Okio.sink(Okio.java:193)
             // sun.reflect.GeneratedMethodAccessor333.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:748)
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
  public void test12()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.close();
      try { 
        Okio.sink((Socket) mockSocket0);
        fail("Expecting exception: SocketException");
      
      } catch(SocketException e) {
         //
         // Socket is closed
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      mockSocket0.bind((SocketAddress) null);
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
  public void test14()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Sink sink0 = Okio.sink((OutputStream) pipedOutputStream0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      System.setCurrentTimeMillis((-521L));
      MockFile mockFile0 = new MockFile("");
      mockFile0.delete();
      Sink sink0 = Okio.sink((File) mockFile0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".inputStream()", ".inputStream()");
      Sink sink0 = Okio.sink((File) mockFile0);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile(";jK%r", ";jK%r");
      File file0 = MockFile.createTempFile(";jK%r", ";jK%r", (File) mockFile0);
      MockFile mockFile1 = new MockFile(file0, ";jK%r");
      try { 
        Okio.sink((File) mockFile1);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      File file0 = MockFile.createTempFile("aGE|X\"M&P", "aGE|X\"M&P");
      Source source0 = Okio.source(file0);
      BufferedSource bufferedSource0 = Okio.buffer(source0);
      assertNotNull(bufferedSource0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      BufferedSink bufferedSink0 = Okio.buffer(sink0);
      assertNotNull(bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      File file0 = MockFile.createTempFile("v#FKfyDlxy,ZS", "v#FKfyDlxy,ZS");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/v#FKfyDlxy,ZS0v#FKfyDlxy,ZS");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "v#FKfyDlxy,ZS");
      Okio.appendingSink(file0);
      assertEquals(14L, file0.length());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("t_");
      MockFile mockFile1 = new MockFile(mockFile0, ".outputStream()");
      Sink sink0 = Okio.appendingSink(mockFile1);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      File file0 = MockFile.createTempFile("HUwObJ-_ootkF7q\"{", "HUwObJ-_ootkF7q\"{");
      MockFile mockFile0 = new MockFile(file0, "]=3=m^KjgBO[)O6ZP-$");
      try { 
        Okio.appendingSink(mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      File file0 = MockFile.createTempFile("l=XIBL+8 ,of(-wp~", "l=XIBL+8 ,of(-wp~");
      Path path0 = file0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[0];
      try { 
        Okio.source(path0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFile mockFile0 = new MockFile("okio.Okio$4");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[2];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.APPEND;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      // Undeclared exception!
      try { 
        Okio.source(path0, openOptionArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // 'APPEND' not allowed
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("HUwObJ-_ootkF7g\"{", "HUwObJ-_ootkF7g\"{");
      try { 
        Okio.source((File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      File file0 = MockFile.createTempFile("aGE|X\"M&P", "aGE|X\"M&P");
      StandardOpenOption[] standardOpenOptionArray0 = StandardOpenOption.values();
      Path path0 = file0.toPath();
      // Undeclared exception!
      try { 
        Okio.sink(path0, (OpenOption[]) standardOpenOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // READ not allowed
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[3];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.SPARSE;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      openOptionArray0[1] = (OpenOption) linkOption0;
      StandardOpenOption standardOpenOption1 = StandardOpenOption.CREATE_NEW;
      openOptionArray0[2] = (OpenOption) standardOpenOption1;
      // Undeclared exception!
      try { 
        Okio.sink(path0, openOptionArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      try { 
        Okio.sink((File) mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.isAndroidGetsocknameError((AssertionError) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      try { 
        Okio.appendingSink(mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError();
      AssertionError assertionError1 = new AssertionError("getsockname failed", assertionError0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      AssertionError assertionError0 = new AssertionError((String) null, mockThrowable0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError();
      AssertionError assertionError1 = new AssertionError(assertionError0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError();
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.sink((Path) null, (OpenOption[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // path == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        Okio.sink(path0, (OpenOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
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
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
      OpenOption[] openOptionArray0 = new OpenOption[2];
      // Undeclared exception!
      try { 
        Okio.source((Path) null, openOptionArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // path == null
         //
         verifyException("okio.Okio", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
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
  public void test42()  throws Throwable  {
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
  public void test43()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      OutputStream outputStream0 = realBufferedSink0.outputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(outputStream0);
      filterOutputStream0.flush();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      File file0 = MockFile.createTempFile(" < ", " < ");
      Source source0 = Okio.source(file0);
      AssertionError assertionError0 = new AssertionError(source0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      File file0 = MockFile.createTempFile("-9223372036854775808", "sink(");
      Sink sink0 = Okio.sink(file0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.close();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      File file0 = MockFile.createTempFile("aGE|X\"M&P", "aGE|X\"M&P");
      Sink sink0 = Okio.appendingSink(file0);
      AssertionError assertionError0 = new AssertionError(sink0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
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
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        Okio.buffer((Sink) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // sink == null
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      Timeout timeout0 = realBufferedSink0.timeout();
      assertNotNull(timeout0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
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
  public void test51()  throws Throwable  {
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
}