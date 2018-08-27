/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 05:05:27 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Enumeration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.GzipSink;
import okio.Okio;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Okio_ESTest extends Okio_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      mockFile0.getAbsoluteFile();
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
  public void test01()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
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
  public void test02()  throws Throwable  {
      Okio.blackhole();
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
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("K2[bml");
      mockFile0.setExecutable(false);
      Okio.sink((File) mockFile0);
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[1];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.DSYNC;
      StandardOpenOption.values();
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      try { 
        Okio.source(path0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Okio.blackhole();
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
  public void test05()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile("!I", "!I");
          Path path0 = mockFile0.toPath();
          OpenOption[] openOptionArray0 = new OpenOption[1];
          StandardOpenOption standardOpenOption0 = StandardOpenOption.DSYNC;
          openOptionArray0[0] = (OpenOption) standardOpenOption0;
          // Undeclared exception!
          try { 
            Okio.sink(path0, openOptionArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_scripts_adaptive/projects/25_okio/!I/!I\" \"write\")
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
  public void test06()  throws Throwable  {
      Okio.blackhole();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Source source0 = Okio.source((InputStream) pipedInputStream0);
      BufferedSource bufferedSource0 = Okio.buffer(source0);
      assertNotNull(bufferedSource0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError(0.0);
      AssertionError assertionError1 = new AssertionError(4424);
      assertionError0.initCause(assertionError1);
      Okio.isAndroidGetsocknameError(assertionError0);
      AssertionError assertionError2 = new AssertionError(435);
      assertionError2.addSuppressed(assertionError1);
      Okio.isAndroidGetsocknameError(assertionError2);
      Sink sink0 = Okio.blackhole();
      Okio.buffer(sink0);
      try { 
        MockURI.URI("9P^t", "9P^t", "source(", "", "");
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Relative path in absolute URI: 9P^t://9P%5Etsource(?#
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError((-2604.34973351));
      assertionError0.printStackTrace();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Okio.isAndroidGetsocknameError(assertionError0);
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      StandardOpenOption standardOpenOption0 = StandardOpenOption.DELETE_ON_CLOSE;
      StandardOpenOption standardOpenOption1 = StandardOpenOption.WRITE;
      StandardOpenOption standardOpenOption2 = StandardOpenOption.DSYNC;
      StandardOpenOption standardOpenOption3 = StandardOpenOption.APPEND;
      StandardOpenOption standardOpenOption4 = StandardOpenOption.CREATE_NEW;
      StandardOpenOption standardOpenOption5 = StandardOpenOption.DELETE_ON_CLOSE;
      StandardOpenOption standardOpenOption6 = StandardOpenOption.SYNC;
      String string0 = "p0.mP>K9o|]nW]";
      String string1 = "out == null";
      int int0 = 0;
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
  public void test09()  throws Throwable  {
      Okio.blackhole();
      AssertionError assertionError0 = new AssertionError('-');
      Okio.isAndroidGetsocknameError(assertionError0);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("", 12345);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      String string0 = "out == null";
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
  public void test10()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError();
      AssertionError assertionError1 = new AssertionError();
      assertionError1.getLocalizedMessage();
      assertionError0.initCause(assertionError1);
      Okio.isAndroidGetsocknameError(assertionError0);
      AssertionError assertionError2 = new AssertionError(435);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      Okio.source((InputStream) pipedInputStream0);
      Okio.blackhole();
      try { 
        MockURI.URI((String) null, (String) null, "'[.tNRHCc", 224, "byteCount > Integer.MAX_VALUE: ", (String) null, "'[.tNRHCc");
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Illegal character in hostname at index 2: //'[.tNRHCc:224byteCount%20%3E%20Integer.MAX_VALUE:%20#'[.tNRHCc
         //
         verifyException("java.net.URI$Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Okio.blackhole();
      MockFile mockFile0 = new MockFile("source(", "source(");
      MockFile mockFile1 = new MockFile(mockFile0, "source(");
      mockFile1.getAbsolutePath();
      Sink sink0 = Okio.appendingSink(mockFile1);
      AssertionError assertionError0 = new AssertionError(sink0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Source source0 = Okio.source((InputStream) sequenceInputStream0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      realBufferedSource0.timeout();
      try { 
        realBufferedSource0.readByteString(631L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Source source0 = Okio.source((InputStream) byteArrayInputStream0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      ByteString byteString0 = realBufferedSource0.readByteString();
      assertEquals(1, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Source source0 = Okio.source((InputStream) sequenceInputStream0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      RealBufferedSource realBufferedSource1 = new RealBufferedSource(realBufferedSource0);
      realBufferedSource0.toString();
      try { 
        realBufferedSource1.readByteString(1000L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Source source0 = Okio.source((InputStream) sequenceInputStream0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      realBufferedSource0.close();
      realBufferedSource0.readByteString();
      Okio.buffer((Source) realBufferedSource0);
      System.setCurrentTimeMillis((-1L));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      GzipSink gzipSink0 = new GzipSink(sink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(gzipSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.emitCompleteSegments();
      realBufferedSink0.timeout();
      gzipSink0.flush();
      BufferedSink bufferedSink1 = Okio.buffer((Sink) bufferedSink0);
      Okio.buffer((Sink) bufferedSink1);
      Okio.buffer((Sink) gzipSink0);
      // Undeclared exception!
      try { 
        MockURI.parseServerAuthority((URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURI", e);
      }
  }
}