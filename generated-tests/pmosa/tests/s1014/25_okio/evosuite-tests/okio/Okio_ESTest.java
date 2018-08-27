/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 05:07:43 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.GzipSink;
import okio.GzipSource;
import okio.Okio;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Okio_ESTest extends Okio_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".dj,cDXrBtv");
      mockFile0.setExecutable(false);
      Okio.sink((File) mockFile0);
      AssertionError assertionError0 = new AssertionError('g');
      Okio.isAndroidGetsocknameError(assertionError0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 50);
      Source source0 = Okio.source((InputStream) pipedInputStream0);
      Okio.buffer(source0);
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      int int0 = 53;
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket(inetAddress0, 50, inetAddress0, 53);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@722eba8a
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile("~8=q`lM5");
      Okio.appendingSink(mockFile0);
      Source source0 = Okio.source((File) mockFile0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("5");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[0];
      try { 
        Okio.source(path0, openOptionArray0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError(0.0);
      MockThrowable mockThrowable0 = new MockThrowable(assertionError0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(")2wGbO:56ve=j$*");
      mockPrintStream0.print(280.97F);
      PrintStream printStream0 = mockPrintStream0.append('D');
      MockThrowable.getDefaultStackTrace();
      MockThrowable.replacement_printStackTrace((Throwable) mockThrowable0, printStream0);
      assertionError0.initCause(mockThrowable0);
      Okio.isAndroidGetsocknameError(assertionError0);
      MockFile mockFile0 = new MockFile(")2wGbO:56ve=j$*");
      MockFile mockFile1 = new MockFile(mockFile0, ")2wGbO:56ve=j$*");
      try { 
        Okio.source((File) mockFile1);
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
      Okio.blackhole();
      AssertionError assertionError0 = new AssertionError(3778.6028F);
      AssertionError assertionError1 = new AssertionError("", assertionError0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          AssertionError assertionError0 = new AssertionError(0L);
          assertionError0.getSuppressed();
          Okio.isAndroidGetsocknameError(assertionError0);
          MockFile mockFile0 = new MockFile("=y,O`4D5}_qd7");
          Path path0 = mockFile0.toPath();
          OpenOption[] openOptionArray0 = new OpenOption[0];
          // Undeclared exception!
          try { 
            Okio.sink(path0, openOptionArray0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"=y,O`4D5}_qd7\" \"write\")
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
  public void test07()  throws Throwable  {
      Okio.blackhole();
      MockFile mockFile0 = new MockFile("", "");
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
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError(592.95);
      MockThrowable mockThrowable0 = new MockThrowable(assertionError0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(")2wGbO:56ve=j$*");
      mockPrintStream0.print(280.97F);
      PrintStream printStream0 = mockPrintStream0.append(';');
      StackTraceElement[] stackTraceElementArray0 = MockThrowable.getDefaultStackTrace();
      MockThrowable.replacement_printStackTrace((Throwable) assertionError0, printStream0);
      AssertionError assertionError1 = new AssertionError(0L);
      assertionError1.initCause(assertionError0);
      Okio.isAndroidGetsocknameError(assertionError1);
      Locale locale0 = new Locale("SA~Tqf(I92d", "", "");
      PrintStream printStream1 = mockPrintStream0.printf(locale0, "", (Object[]) stackTraceElementArray0);
      Okio.sink((OutputStream) printStream1);
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
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
  public void test11()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError();
      MockThrowable mockThrowable0 = new MockThrowable(assertionError0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(")2wGbO:56ve=j$*");
      mockPrintStream0.print(280.97F);
      PrintStream printStream0 = mockPrintStream0.append('D');
      MockThrowable.getDefaultStackTrace();
      MockThrowable.replacement_printStackTrace((Throwable) mockThrowable0, printStream0);
      assertionError0.initCause(mockThrowable0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
      
      MockFile mockFile0 = new MockFile(")2wGbO:56ve=j$*");
      Okio.appendingSink(mockFile0);
      assertEquals(247L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("_b?mEtN+fxI3M;(");
      Sink sink0 = Okio.sink((File) mockFile0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      OutputStream outputStream0 = realBufferedSink0.outputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(outputStream0, true);
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "_b?mEtN+fxI3M;(");
      PrintStream printStream0 = mockPrintStream0.append((CharSequence) "_b?mEtN+fxI3M;(");
      Okio.sink((OutputStream) printStream0);
      Okio.appendingSink(mockFile0);
      assertEquals(15L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile("_b?mEtN+fxI3M;(");
      Sink sink0 = Okio.blackhole();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      OutputStream outputStream0 = realBufferedSink0.outputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(outputStream0, true);
      FileSystemHandling.shouldAllThrowIOExceptions();
      PrintStream printStream0 = mockPrintStream0.append((CharSequence) "_b?mEtN+fxI3M;(");
      printStream0.print((-1L));
      Sink sink1 = Okio.sink((OutputStream) printStream0);
      Sink sink2 = Okio.appendingSink(mockFile0);
      assertFalse(sink2.equals((Object)sink1));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("_b?mEth+fxI3M;G");
      Sink sink0 = Okio.sink((File) mockFile0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      OutputStream outputStream0 = realBufferedSink0.outputStream();
      mockFile0.setLastModified(1L);
      MockPrintStream mockPrintStream0 = new MockPrintStream(outputStream0, true);
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockPrintStream0, true);
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, ")");
      mockPrintStream0.append((CharSequence) ")");
      mockPrintStream0.println((Object) sink0);
      // Undeclared exception!
      try { 
        mockPrintStream0.append((CharSequence) "_b?mEth+fxI3M;G", (-9), 32);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("_b?mEtN+fxI3M;(");
      Sink sink0 = Okio.sink((File) mockFile0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      OutputStream outputStream0 = realBufferedSink0.outputStream();
      realBufferedSink0.close();
      MockPrintStream mockPrintStream0 = new MockPrintStream(outputStream0, true);
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "_b?mEtN+fxI3M;(");
      PrintStream printStream0 = mockPrintStream0.append((CharSequence) "_b?mEtN+fxI3M;(");
      Okio.sink((OutputStream) printStream0);
      Okio.appendingSink(mockFile0);
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
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)59;
      byteArray0[1] = (byte)96;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Source source0 = Okio.source((InputStream) byteArrayInputStream0);
      GzipSource gzipSource0 = new GzipSource(source0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      RealBufferedSource realBufferedSource1 = new RealBufferedSource(gzipSource0);
      gzipSource0.close();
      InputStream inputStream0 = realBufferedSource1.inputStream();
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream(inputStream0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Source source0 = Okio.source((InputStream) byteArrayInputStream0);
      GzipSource gzipSource0 = new GzipSource(source0);
      byteArrayInputStream0.close();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      gzipSource0.timeout();
      try { 
        realBufferedSource0.indexOf((byte) (-89), 10L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("))%zLX\">_n^4C3PT?Fl");
      Sink sink0 = Okio.sink((File) mockFile0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      OutputStream outputStream0 = realBufferedSink0.outputStream();
      realBufferedSink0.timeout();
      MockPrintStream mockPrintStream0 = new MockPrintStream(outputStream0, true);
      mockPrintStream0.append((CharSequence) "))%zLX\">_n^4C3PT?Fl");
      BufferedSink bufferedSink0 = Okio.buffer(sink0);
      assertFalse(bufferedSink0.equals((Object)realBufferedSink0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("_b?mEtN+fxI3M;(");
      Sink sink0 = Okio.blackhole();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      realBufferedSink0.close();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, true);
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "_b?mEtN+fxI3M;(");
      PrintStream printStream0 = mockPrintStream0.append((CharSequence) "_b?mEtN+fxI3M;(");
      Okio.sink((OutputStream) printStream0);
      Okio.appendingSink(mockFile0);
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
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Source source0 = Okio.source((InputStream) byteArrayInputStream0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      realBufferedSource0.toString();
      realBufferedSource0.indexOf((byte)26, (long) (byte)26);
      Buffer buffer0 = new Buffer();
      Source source1 = Okio.source((InputStream) byteArrayInputStream0);
      assertFalse(source1.equals((Object)source0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      GzipSink gzipSink0 = new GzipSink(sink0);
      gzipSink0.timeout();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(gzipSink0);
      Buffer buffer0 = realBufferedSink0.buffer();
      BufferedSource bufferedSource0 = Okio.buffer((Source) buffer0);
      BufferedSource bufferedSource1 = Okio.buffer((Source) bufferedSource0);
      assertFalse(bufferedSource1.equals((Object)bufferedSource0));
  }
}