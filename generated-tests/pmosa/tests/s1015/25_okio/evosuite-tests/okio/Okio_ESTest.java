/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 06:12:51 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.HashingSink;
import okio.Okio;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Okio_ESTest extends Okio_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError(0.0);
      Okio.isAndroidGetsocknameError(assertionError0);
      MockFile mockFile0 = new MockFile(".", "ik");
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
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Jx ", "Jx ");
      MockFile mockFile1 = new MockFile(mockFile0, "`1s");
      Sink sink0 = Okio.appendingSink(mockFile1);
      assertNotNull(sink0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      BufferedSink bufferedSink0 = buffer0.emit();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(bufferedSink0);
      BufferedSink bufferedSink1 = realBufferedSink0.writeDecimalLong(0L);
      Okio.buffer((Sink) bufferedSink1);
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
  public void test04()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.getSendBufferSize();
      mockSocket0.getReceiveBufferSize();
      mockSocket0.setTrafficClass(0);
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
  public void test05()  throws Throwable  {
      StandardOpenOption standardOpenOption0 = StandardOpenOption.TRUNCATE_EXISTING;
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
  public void test06()  throws Throwable  {
      Okio.blackhole();
      MockFile mockFile0 = new MockFile("");
      mockFile0.delete();
      Okio.sink((File) mockFile0);
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[3];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.CREATE_NEW;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      openOptionArray0[1] = (OpenOption) linkOption0;
      StandardOpenOption standardOpenOption1 = StandardOpenOption.SPARSE;
      openOptionArray0[2] = (OpenOption) standardOpenOption1;
      Okio.source(path0, openOptionArray0);
      // Undeclared exception!
      try { 
        Okio.sink(path0, openOptionArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockInetAddress.getByName("'Y");
      Pipe pipe0 = new Pipe(2186L);
      Source source0 = pipe0.source();
      BufferedSource bufferedSource0 = Okio.buffer(source0);
      assertNotNull(bufferedSource0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      AssertionError assertionError0 = new AssertionError(object0);
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[5];
      StackTraceElement stackTraceElement0 = new StackTraceElement(")", "M~,x#:DBB#w", ")", (-1));
      stackTraceElementArray0[0] = stackTraceElement0;
      StackTraceElement stackTraceElement1 = new StackTraceElement("M~,x#:DBB#w", "Unexpected hex digit: ", "", 872);
      stackTraceElementArray0[1] = stackTraceElement1;
      StackTraceElement stackTraceElement2 = new StackTraceElement("in == null", "in == null", "M~,x#:DBB#w", (-1));
      stackTraceElementArray0[2] = stackTraceElement2;
      StackTraceElement stackTraceElement3 = new StackTraceElement("Unexpected hex digit: ", "Unexpected hex digit: ", "", 1185);
      stackTraceElementArray0[3] = stackTraceElement3;
      StackTraceElement stackTraceElement4 = new StackTraceElement("M~,x#:DBB#w", "", ")", 1);
      stackTraceElementArray0[4] = stackTraceElement4;
      assertionError0.setStackTrace(stackTraceElementArray0);
      MockException mockException0 = new MockException(")", assertionError0);
      assertionError0.initCause(mockException0);
      Okio.isAndroidGetsocknameError(assertionError0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-23);
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
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      AssertionError assertionError0 = new AssertionError();
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[5];
      StackTraceElement stackTraceElement0 = new StackTraceElement(")", "M~,x#:DBB#w", ")", (-1));
      stackTraceElementArray0[0] = stackTraceElement0;
      StackTraceElement stackTraceElement1 = new StackTraceElement("M~,x#:DBB#w", "Unexpected hex digit: ", "Unexpected hex digit: ", 872);
      stackTraceElementArray0[1] = stackTraceElement1;
      StackTraceElement stackTraceElement2 = new StackTraceElement("in == null", "in == null", "M~,x#:DBB#w", (-1));
      stackTraceElementArray0[2] = stackTraceElement2;
      StackTraceElement stackTraceElement3 = new StackTraceElement("Unexpected hex digit: ", "Unexpected hex digit: ", "", 1185);
      stackTraceElementArray0[3] = stackTraceElement3;
      StackTraceElement stackTraceElement4 = new StackTraceElement("M~,x#:DBB#w", ")", ")", 1);
      stackTraceElementArray0[4] = stackTraceElement4;
      assertionError0.setStackTrace(stackTraceElementArray0);
      MockException mockException0 = new MockException(")", assertionError0);
      assertionError0.initCause(mockException0);
      Okio.isAndroidGetsocknameError(assertionError0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-23);
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
      MockFile mockFile0 = new MockFile("#\"M\"lQT|ny$F8/?B:");
      Sink sink0 = Okio.sink((File) mockFile0);
      AssertionError assertionError0 = new AssertionError(sink0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      mockPrintWriter0.checkError();
      FileSystemHandling.shouldAllThrowIOExceptions();
      PrintWriter printWriter0 = mockPrintWriter0.append('n');
      assertionError0.printStackTrace(printWriter0);
      assertionError0.getLocalizedMessage();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Okio.isAndroidGetsocknameError(assertionError0);
      Okio.isAndroidGetsocknameError(assertionError0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(mockFile0);
      Okio.source((InputStream) mockFileInputStream0);
      Okio.buffer(sink0);
      Proxy.Type proxy_Type0 = Proxy.Type.SOCKS;
      MockInetSocketAddress mockInetSocketAddress0 = null;
      try {
        mockInetSocketAddress0 = new MockInetSocketAddress((String) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // hostname can't be null
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      MockFileInputStream mockFileInputStream1 = new MockFileInputStream(fileDescriptor0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Source source0 = Okio.source((InputStream) mockFileInputStream0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      realBufferedSource0.timeout();
      RealBufferedSource realBufferedSource1 = new RealBufferedSource(source0);
      try { 
        realBufferedSource0.readByteString();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      MockFileInputStream mockFileInputStream1 = new MockFileInputStream(fileDescriptor0);
      MockFileInputStream mockFileInputStream2 = new MockFileInputStream(fileDescriptor0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-71);
      byteArray0[2] = (byte) (-78);
      byteArray0[3] = (byte)89;
      byteArray0[4] = (byte)92;
      byteArray0[5] = (byte) (-20);
      byteArray0[6] = (byte) (-50);
      byteArray0[7] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, 755);
      Source source0 = Okio.source((InputStream) byteArrayInputStream0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      ByteString byteString0 = realBufferedSource0.readByteString();
      assertEquals(8, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-31);
      byteArray0[1] = (byte)31;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), (-1400));
      Source source0 = Okio.source((InputStream) byteArrayInputStream0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      RealBufferedSource realBufferedSource1 = new RealBufferedSource(source0);
      realBufferedSource1.toString();
      ByteString byteString0 = realBufferedSource1.readByteString();
      assertEquals(0, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-22), (-22));
      Source source0 = Okio.source((InputStream) byteArrayInputStream0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      realBufferedSource0.close();
      RealBufferedSource realBufferedSource1 = new RealBufferedSource(source0);
      realBufferedSource0.readByteString();
      MockFile mockFile0 = new MockFile("OrYQ4");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[4];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.DELETE_ON_CLOSE;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      openOptionArray0[1] = (OpenOption) linkOption0;
      StandardOpenOption standardOpenOption1 = StandardOpenOption.WRITE;
      openOptionArray0[2] = (OpenOption) standardOpenOption1;
      StandardOpenOption standardOpenOption2 = StandardOpenOption.CREATE_NEW;
      openOptionArray0[3] = (OpenOption) standardOpenOption2;
      // Undeclared exception!
      try { 
        Okio.source(path0, openOptionArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // 'WRITE' not allowed
         //
         verifyException("java.nio.file.spi.FileSystemProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)1;
      ByteString byteString0 = new ByteString(byteArray0);
      HashingSink hashingSink0 = HashingSink.hmacSha512(sink0, byteString0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      hashingSink0.timeout();
      byteString0.endsWith(byteArray0);
      Buffer buffer0 = realBufferedSink0.buffer();
      Okio.buffer((Sink) buffer0);
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