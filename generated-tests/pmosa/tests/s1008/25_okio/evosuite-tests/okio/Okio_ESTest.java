/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 11:33:32 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Locale;
import okio.Buffer;
import okio.BufferedSink;
import okio.GzipSource;
import okio.HashingSink;
import okio.Okio;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Okio_ESTest extends Okio_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("_;S YGlB7.hUJuh4", "_;S YGlB7.hUJuh4");
      MockFile mockFile1 = new MockFile(mockFile0, "_;S YGlB7.hUJuh4");
      Sink sink0 = Okio.sink((File) mockFile1);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile1);
      Locale locale0 = new Locale("Failed to close timed out socket ", "_;S YGlB7.hUJuh4");
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) mockFile0;
      objectArray0[1] = (Object) "Failed to close timed out socket ";
      mockPrintStream0.write((-2342));
      objectArray0[2] = (Object) sink0;
      Object object0 = new Object();
      objectArray0[3] = object0;
      PrintStream printStream0 = mockPrintStream0.printf(locale0, "Failed to close timed out socket ", objectArray0);
      Okio.sink((OutputStream) printStream0);
      Okio.sink((File) mockFile1);
      try { 
        MockURI.URI("_;S YGlB7.hUJuh4", "j^Zf", "", (-2342), ")", "", "j^Zf");
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Relative path in absolute URI: _;S YGlB7.hUJuh4://j%5EZf@:-2342)?#j%5EZf
         //
         verifyException("java.net.URI", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Okio.blackhole();
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.deleteOnExit();
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
  public void test02()  throws Throwable  {
      Okio.blackhole();
      MockFile mockFile0 = new MockFile(";5SnEip<OcN+e3");
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
  public void test03()  throws Throwable  {
      Okio.blackhole();
      MockFile mockFile0 = new MockFile("H`bT");
      MockFile mockFile1 = new MockFile(mockFile0, "Ux/f/G&XZf|DFssi");
      Okio.appendingSink(mockFile1);
      AssertionError assertionError0 = new AssertionError((-942.357145589947));
      AssertionError assertionError1 = new AssertionError("H`bT", assertionError0);
      Okio.isAndroidGetsocknameError(assertionError1);
      mockFile1.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[6];
      StandardOpenOption standardOpenOption0 = StandardOpenOption.CREATE_NEW;
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
      StandardOpenOption standardOpenOption1 = StandardOpenOption.CREATE;
      openOptionArray0[1] = (OpenOption) standardOpenOption1;
      StandardOpenOption standardOpenOption2 = StandardOpenOption.SYNC;
      openOptionArray0[2] = (OpenOption) standardOpenOption2;
      // Undeclared exception!
      try { 
        LinkOption.valueOf("Ux/f/G&XZf|DFssi");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant java.nio.file.LinkOption.Ux/f/G&XZf|DFssi
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Okio.blackhole();
      AssertionError assertionError0 = new AssertionError((-1134.03823471835));
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[1];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      openOptionArray0[0] = (OpenOption) linkOption0;
      Source source0 = Okio.source(path0, openOptionArray0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError(8192);
      Okio.isAndroidGetsocknameError(assertionError0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("v%.9Ctq5+");
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockPrintStream0, true);
      mockPrintStream1.print((Object) assertionError0);
      mockPrintStream0.close();
      PrintStream printStream0 = mockPrintStream1.append('d');
      Okio.sink((OutputStream) printStream0);
      Okio.sink((OutputStream) printStream0);
      MockFile mockFile0 = new MockFile("@GQB)@MopBAw*");
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
  public void test07()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError('d');
      assertionError0.getSuppressed();
      assertionError0.fillInStackTrace();
      Okio.isAndroidGetsocknameError(assertionError0);
      Okio.blackhole();
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
  public void test08()  throws Throwable  {
      Okio.blackhole();
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
      Okio.blackhole();
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
      Okio.blackhole();
      String string0 = "Ux/f/G&XZf|DFssi";
      AssertionError assertionError0 = new AssertionError((-942.357145589947));
      AssertionError assertionError1 = new AssertionError("F`nT", assertionError0);
      assertionError1.getLocalizedMessage();
      Okio.isAndroidGetsocknameError(assertionError1);
      StandardOpenOption standardOpenOption0 = StandardOpenOption.CREATE_NEW;
      StandardOpenOption standardOpenOption1 = StandardOpenOption.CREATE;
      StandardOpenOption standardOpenOption2 = StandardOpenOption.SYNC;
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
  public void test11()  throws Throwable  {
      Okio.blackhole();
      String string0 = "\"XUrC9[d,eJobUw";
      MockFile mockFile0 = new MockFile("\"XUrC9[d,eJobUw", "\"XUrC9[d,eJobUw");
      Okio.appendingSink(mockFile0);
      Path path0 = mockFile0.toPath();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-8);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)36;
      byteArray0[5] = (byte)0;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      OpenOption[] openOptionArray0 = null;
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
  public void test12()  throws Throwable  {
      Okio.blackhole();
      AssertionError assertionError0 = new AssertionError();
      assertionError0.printStackTrace();
      assertionError0.printStackTrace();
      MockException mockException0 = new MockException(assertionError0);
      assertionError0.initCause(mockException0);
      AssertionError assertionError1 = new AssertionError("\r", assertionError0);
      Okio.isAndroidGetsocknameError(assertionError0);
      StandardOpenOption standardOpenOption0 = StandardOpenOption.DELETE_ON_CLOSE;
      StandardOpenOption standardOpenOption1 = StandardOpenOption.CREATE;
      StandardOpenOption standardOpenOption2 = StandardOpenOption.SYNC;
      // Undeclared exception!
      try { 
        LinkOption.valueOf("6'fh&JBsfe d@f&Gx,n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant java.nio.file.LinkOption.6'fh&JBsfe d@f&Gx,n
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Sink sink0 = Okio.blackhole();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      OutputStream outputStream0 = realBufferedSink0.outputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(outputStream0, true);
      Locale locale0 = new Locale("o!Z\u0007.`.x_", "o!Z\u0007.`.x_", "o!Z\u0007.`.x_");
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) realBufferedSink0;
      objectArray0[1] = (Object) locale0;
      objectArray0[2] = (Object) locale0;
      objectArray0[3] = (Object) "qi<acC4'7-@(zl";
      objectArray0[4] = (Object) outputStream0;
      objectArray0[5] = (Object) mockPrintStream0;
      objectArray0[6] = (Object) realBufferedSink0;
      objectArray0[7] = (Object) locale0;
      objectArray0[8] = (Object) sink0;
      PrintStream printStream0 = mockPrintStream0.format(locale0, "qi<acC4'7-@(zl", objectArray0);
      Okio.sink((OutputStream) printStream0);
      System.setCurrentTimeMillis(1L);
      MockFile mockFile0 = new MockFile("o!Z\u0007.`.x_");
      Sink sink1 = Okio.appendingSink(mockFile0);
      assertFalse(sink1.equals((Object)sink0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("getsockname failed");
      Sink sink0 = Okio.appendingSink(mockFile0);
      HashingSink hashingSink0 = HashingSink.sha512(sink0);
      mockFile0.getAbsoluteFile();
      hashingSink0.flush();
      BufferedSink bufferedSink0 = Okio.buffer((Sink) hashingSink0);
      assertNotNull(bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      System.setCurrentTimeMillis(3999L);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      Source source0 = Okio.source((InputStream) dataInputStream0);
      GzipSource gzipSource0 = new GzipSource(source0);
      gzipSource0.timeout();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      realBufferedSource0.buffer();
      // Undeclared exception!
      try { 
        realBufferedSource0.buffer.write((Source) gzipSource0, 3999L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      System.setCurrentTimeMillis(3999L);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      Source source0 = Okio.source((InputStream) dataInputStream0);
      GzipSource gzipSource0 = new GzipSource(source0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      int int0 = 40;
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null, 40);
      DataInputStream dataInputStream1 = new DataInputStream(bufferedInputStream0);
      Okio.source((InputStream) dataInputStream0);
      GzipSource gzipSource1 = new GzipSource(source0);
      RealBufferedSource realBufferedSource1 = new RealBufferedSource(source0);
      // Undeclared exception!
      try { 
        gzipSource1.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      Source source0 = Okio.source((InputStream) dataInputStream0);
      GzipSource gzipSource0 = new GzipSource(source0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      Okio.buffer((Sink) realBufferedSource0.buffer);
      AssertionError assertionError0 = new AssertionError(source0);
      MockException mockException0 = new MockException("", assertionError0);
      MockThrowable mockThrowable0 = new MockThrowable(mockException0);
      AssertionError assertionError1 = new AssertionError("", mockThrowable0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      System.setCurrentTimeMillis(3999L);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-3);
      byteArray0[2] = (byte) (-121);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-86);
      byteArray0[5] = (byte) (-117);
      byteArray0[6] = (byte)25;
      byteArray0[7] = (byte) (-11);
      byteArray0[8] = (byte) (-98);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      Source source0 = Okio.source((InputStream) byteArrayInputStream0);
      GzipSource gzipSource0 = new GzipSource(source0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      try { 
        realBufferedSource0.buffer.write(source0, 32L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Buffer", e);
      }
  }
}