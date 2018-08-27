/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 15:40:32 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.BufferedSink;
import okio.GzipSink;
import okio.GzipSource;
import okio.HashingSource;
import okio.Okio;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.mock.java.util.logging.MockLogRecord;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Okio_ESTest extends Okio_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      MockInetAddress.anyLocalAddress();
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
  public void test01()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockException mockException0 = new MockException((String) null);
      AssertionError assertionError0 = new AssertionError((String) null, mockException0);
      Proxy proxy0 = Proxy.NO_PROXY;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      MockSocket mockSocket0 = new MockSocket(proxy0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%s: actual 0x%08x != expected 0x%08x");
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
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", " Ht*[AS:w");
      Okio.appendingSink(mockFile0);
      Source source0 = Okio.source((File) mockFile0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      Sink sink0 = Okio.blackhole();
      Okio.source((InputStream) pipedInputStream0);
      BufferedSink bufferedSink0 = Okio.buffer(sink0);
      assertNotNull(bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Unexpected hex string: ");
      MockFile mockFile1 = new MockFile("vx");
      Sink sink0 = Okio.sink((File) mockFile0);
      AssertionError assertionError0 = new AssertionError(sink0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StandardOpenOption standardOpenOption0 = StandardOpenOption.TRUNCATE_EXISTING;
      OpenOption[] openOptionArray0 = new OpenOption[3];
      openOptionArray0[0] = (OpenOption) standardOpenOption0;
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
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      StandardOpenOption standardOpenOption0 = StandardOpenOption.TRUNCATE_EXISTING;
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      StandardOpenOption standardOpenOption1 = StandardOpenOption.APPEND;
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[1];
      openOptionArray0[0] = (OpenOption) linkOption0;
      Source source0 = Okio.source(path0, openOptionArray0);
      assertNotNull(source0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("/K");
      Sink sink0 = Okio.sink((File) mockFile0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      Buffer buffer0 = realBufferedSink0.buffer;
      realBufferedSink0.timeout();
      BufferedSink bufferedSink0 = buffer0.emit();
      GzipSink gzipSink0 = new GzipSink(bufferedSink0);
      AssertionError assertionError0 = new AssertionError();
      MockException mockException0 = new MockException(assertionError0);
      AssertionError assertionError1 = new AssertionError("", mockException0);
      boolean boolean0 = Okio.isAndroidGetsocknameError(assertionError1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      Okio.source((InputStream) pipedInputStream0);
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
  public void test13()  throws Throwable  {
      Okio.blackhole();
      OutputStream outputStream0 = null;
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
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Nq");
      FileSystemHandling.shouldAllThrowIOExceptions();
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
  public void test15()  throws Throwable  {
      AssertionError assertionError0 = new AssertionError();
      MockException mockException0 = new MockException(assertionError0);
      AssertionError assertionError1 = new AssertionError("", mockException0);
      Okio.isAndroidGetsocknameError(assertionError1);
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
  public void test16()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Okio.blackhole();
      OpenOption[] openOptionArray0 = new OpenOption[4];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      openOptionArray0[1] = (OpenOption) linkOption0;
      LinkOption linkOption1 = LinkOption.NOFOLLOW_LINKS;
      openOptionArray0[3] = (OpenOption) linkOption1;
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
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      String string0 = "";
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      Sink sink0 = Okio.blackhole();
      Okio.source((InputStream) pipedInputStream0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      Buffer buffer0 = realBufferedSink0.buffer;
      realBufferedSink0.timeout();
      try { 
        buffer0.readUtf8CodePoint();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("");
      MockException mockException0 = new MockException(mockThrowable0);
      String string0 = Logger.GLOBAL_LOGGER_NAME;
      AssertionError assertionError0 = new AssertionError("", mockException0);
      Okio.isAndroidGetsocknameError(assertionError0);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      Source source0 = Okio.source((InputStream) sequenceInputStream0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      HashingSource hashingSource0 = HashingSource.md5(source0);
      RealBufferedSource realBufferedSource1 = new RealBufferedSource(realBufferedSource0);
      realBufferedSource1.readByteString();
      HashingSource hashingSource1 = HashingSource.sha256(realBufferedSource0);
      hashingSource1.timeout();
      hashingSource0.hash();
      RealBufferedSource realBufferedSource2 = new RealBufferedSource(hashingSource1);
      realBufferedSource0.buffer();
      RealBufferedSource realBufferedSource3 = new RealBufferedSource(hashingSource0);
      Buffer buffer0 = new Buffer();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
      Okio.sink((OutputStream) mockPrintStream0);
      GzipSink gzipSink0 = new GzipSink(realBufferedSource1.buffer);
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockThrowable mockThrowable0 = new MockThrowable((Throwable) null);
      AssertionError assertionError0 = new AssertionError("file == null", mockThrowable0);
      Okio.isAndroidGetsocknameError(assertionError0);
      PipedOutputStream pipedOutputStream1 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Source source0 = Okio.source((InputStream) pipedInputStream0);
      AssertionError assertionError1 = new AssertionError();
      Okio.isAndroidGetsocknameError(assertionError0);
      MockFile mockFile0 = new MockFile("");
      MockFile mockFile1 = new MockFile(mockFile0, "file == null");
      Okio.appendingSink(mockFile1);
      GzipSource gzipSource0 = new GzipSource(source0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      Buffer buffer0 = new Buffer();
      gzipSource0.close();
      Pipe pipe0 = new Pipe(1482L);
      Buffer buffer1 = pipe0.buffer;
      // Undeclared exception!
      try { 
        realBufferedSource0.readByteString();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }
}