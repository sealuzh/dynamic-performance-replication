/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 01:33:40 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectStreamConstants;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Enumeration;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Segment;
import okio.SegmentedByteString;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SegmentedByteString_ESTest extends SegmentedByteString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Pipe pipe0 = new Pipe(100000L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.utf8();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Pipe pipe0 = new Pipe(100005L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      segmentedByteString0.equals(buffer0);
      segmentedByteString0.hashCode();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      // Undeclared exception!
      try { 
        segmentedByteString0.hmacSha256(segmentedByteString0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Pipe pipe0 = new Pipe(100000L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      segmentedByteString0.hashCode();
      segmentedByteString0.rangeEquals((int) (byte) (-1), (byte[]) null, 19, (int) (byte) (-1));
      // Undeclared exception!
      try { 
        segmentedByteString0.getByte(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.indexOf((byte[]) null, 8257536);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Pipe pipe0 = new Pipe(100000L);
      Buffer buffer0 = pipe0.buffer;
      int int0 = 0;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      Charset charset0 = Charset.defaultCharset();
      buffer0.readString(charset0);
      // Undeclared exception!
      try { 
        segmentedByteString0.md5();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Segment segment0 = new Segment();
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.hex();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Pipe pipe0 = new Pipe(100000L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      segmentedByteString0.hashCode();
      segmentedByteString0.hashCode();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Object object0 = new Object();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("%65,Yu<gZ");
      segmentedByteString0.write(mockPrintStream0);
      // Undeclared exception!
      try { 
        segmentedByteString0.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Charset charset0 = Charset.defaultCharset();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.string(charset0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Pipe pipe0 = new Pipe(100000L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      segmentedByteString0.write(buffer0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      // Undeclared exception!
      try { 
        segmentedByteString0.substring(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeUtf8CodePoint(4267);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      segmentedByteString0.rangeEquals((-1545), (ByteString) segmentedByteString0, (-1545), 1519);
      segmentedByteString0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Pipe pipe0 = new Pipe(100000L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.buffer.sha512();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(" > ");
      // Undeclared exception!
      try { 
        segmentedByteString0.write((OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // out == null
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Pipe pipe0 = new Pipe(99978L);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Buffer buffer0 = pipe0.buffer;
      Buffer buffer1 = pipe0.buffer;
      Buffer buffer2 = buffer0.writeInt(83);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer2, 2);
      byte byte0 = ObjectStreamConstants.TC_ENUM;
      ByteString byteString0 = segmentedByteString0.substring(2, 2);
      assertEquals(2, segmentedByteString0.size());
      assertEquals(0, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Pipe pipe0 = new Pipe(100000L);
      pipe0.sinkClosed = false;
      Buffer buffer0 = pipe0.buffer;
      pipe0.sinkClosed = false;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeDecimalLong(100000L);
      Buffer buffer1 = pipe0.buffer;
      buffer0.writeIntLe(2);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      String string0 = buffer0.toString();
      assertEquals("[hex=02000000]", string0);
      
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      ByteString byteString0 = ByteString.EMPTY;
      boolean boolean0 = segmentedByteString0.equals(byteString0);
      assertEquals(2, segmentedByteString0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Pipe pipe0 = new Pipe(99978L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = pipe0.buffer;
      buffer0.writeIntLe(2);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = pipe0.sinkClosed;
      byte[] byteArray0 = segmentedByteString0.toByteArray();
      assertNotNull(byteArray0);
      
      MockFile mockFile0 = new MockFile("Kx0A!KE-nbn");
      RealBufferedSink realBufferedSink1 = new RealBufferedSink(realBufferedSink0);
      segmentedByteString0.equals(realBufferedSource0);
      boolean boolean1 = segmentedByteString0.rangeEquals(901, byteArray0, (-1942), 2);
      assertEquals(2, segmentedByteString0.size());
      assertArrayEquals(new byte[] {(byte)2, (byte)0}, byteArray0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Pipe pipe0 = new Pipe(99978L);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Buffer buffer0 = pipe0.buffer;
      Buffer buffer1 = pipe0.buffer;
      Buffer buffer2 = buffer0.writeInt(57);
      ByteString byteString0 = buffer2.snapshot();
      byte byte0 = ObjectStreamConstants.TC_RESET;
      byte byte1 = ObjectStreamConstants.TC_ENUM;
      ByteString byteString1 = byteString0.substring(2, 2);
      byteString1.sha512();
      boolean boolean0 = byteString0.rangeEquals(4, byteString1, 2, (int) (byte)121);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Pipe pipe0 = new Pipe(100000L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      boolean boolean0 = pipe0.sourceClosed;
      int int0 = ObjectStreamConstants.baseWireHandle;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeDecimalLong(100000L);
      Buffer buffer1 = pipe0.buffer;
      buffer0.writeIntLe(2);
      buffer0.sha1();
      SegmentedByteString segmentedByteString1 = new SegmentedByteString(realBufferedSink0.buffer, 2);
      segmentedByteString1.rangeEquals(1, (ByteString) segmentedByteString0, (-776), (-776));
      SegmentedByteString segmentedByteString2 = null;
      try {
        segmentedByteString2 = new SegmentedByteString(((RealBufferedSink) bufferedSink0).buffer, (-4737));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=6 offset=0 byteCount=-4737
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Pipe pipe0 = new Pipe(100000L);
      Buffer buffer0 = pipe0.buffer;
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      boolean boolean0 = pipe0.sinkClosed;
      Buffer buffer1 = buffer0.writeIntLe(2);
      boolean boolean1 = pipe0.sinkClosed;
      buffer1.readUtf8Line((long) 0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      ByteString byteString0 = segmentedByteString0.toAsciiLowercase();
      boolean boolean2 = segmentedByteString0.equals(byteString0);
      assertTrue(boolean2);
      assertEquals(2, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Pipe pipe0 = new Pipe(99978L);
      Buffer buffer0 = pipe0.buffer;
      pipe0.sinkClosed = true;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Buffer buffer1 = buffer0.writeIntLe(2);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      boolean boolean0 = pipe0.sourceClosed;
      ByteString byteString0 = ByteString.EMPTY;
      byteString0.indexOf((ByteString) segmentedByteString0);
      buffer1.readByteString();
      byteString0.write(buffer0);
      byte[] byteArray0 = segmentedByteString0.data;
      byte byte0 = ObjectStreamConstants.TC_RESET;
      segmentedByteString0.rangeEquals((int) (byte)121, (byte[]) null, (-4419), (-1617));
      segmentedByteString0.hashCode();
      // Undeclared exception!
      try { 
        segmentedByteString0.getByte(2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=2 offset=2 byteCount=1
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Pipe pipe0 = new Pipe(99978L);
      Buffer buffer0 = pipe0.buffer;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      Buffer buffer1 = pipe0.buffer;
      buffer0.writeIntLe(2);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      Enumeration<DataInputStream> enumeration0 = (Enumeration<DataInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = pipe0.sinkClosed;
      Charset charset0 = Charset.defaultCharset();
      realBufferedSource0.readString((long) 2, charset0);
      realBufferedSource0.indexOf((ByteString) segmentedByteString0);
      MockFile mockFile0 = new MockFile("\u0002\u0000");
      boolean boolean1 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Pipe pipe0 = new Pipe(99978L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeIntLe(2);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      boolean boolean0 = pipe0.sinkClosed;
      pipe0.sourceClosed = false;
      segmentedByteString0.write(buffer0);
      segmentedByteString0.toByteArray();
      byte byte0 = ObjectStreamConstants.TC_RESET;
      String string0 = segmentedByteString0.toString();
      assertEquals(6L, buffer0.size());
      assertEquals("[hex=0200]", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Pipe pipe0 = new Pipe(99978L);
      pipe0.sinkClosed = true;
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeDecimalLong(99978L);
      Buffer buffer1 = pipe0.buffer;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      buffer0.writeIntLe(2);
      buffer0.toString();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      // Undeclared exception!
      try { 
        segmentedByteString0.rangeEquals(2925, (byte[]) null, 2, (-55297));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Pipe pipe0 = new Pipe(100012L);
      Buffer buffer0 = pipe0.buffer;
      pipe0.sinkClosed = false;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      buffer0.writeIntLe(2);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      boolean boolean0 = pipe0.sinkClosed;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      segmentedByteString0.write(buffer0);
      byte[] byteArray0 = segmentedByteString0.toByteArray();
      byte byte0 = ObjectStreamConstants.TC_RESET;
      segmentedByteString0.asByteBuffer();
      boolean boolean1 = pipe0.sourceClosed;
      ByteString byteString0 = new ByteString(byteArray0);
      segmentedByteString0.startsWith(byteArray0);
      byte byte1 = ObjectStreamConstants.TC_ENUM;
      segmentedByteString0.hmacSha1(byteString0);
      assertEquals(6L, buffer0.size());
      assertFalse(buffer0.exhausted());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Pipe pipe0 = new Pipe(100012L);
      Buffer buffer0 = pipe0.buffer;
      pipe0.sinkClosed = false;
      int int0 = 2;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Buffer buffer1 = buffer0.writeIntLe(2);
      short short0 = ObjectStreamConstants.STREAM_VERSION;
      Buffer buffer2 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      boolean boolean0 = pipe0.sinkClosed;
      boolean boolean1 = pipe0.sinkClosed;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      realBufferedSource0.readByteArray();
      segmentedByteString0.write(realBufferedSource0.buffer);
      segmentedByteString0.toByteArray();
      realBufferedSource0.readAll(buffer0);
      Charset.defaultCharset();
      // Undeclared exception!
      try { 
        Charset.forName("");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Pipe pipe0 = new Pipe(99978L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.shouldAllThrowIOExceptions();
      Buffer buffer1 = realBufferedSource0.buffer.writeLong(2);
      Buffer buffer2 = buffer0.writeIntLe(2);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 2);
      segmentedByteString0.equals(buffer0);
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer2);
      buffer0.sha512();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("1/");
      OutputStream outputStream0 = null;
      try { 
        segmentedByteString0.write(mockFileOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Pipe pipe0 = new Pipe(100000L);
      Buffer buffer0 = pipe0.buffer;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Buffer buffer1 = buffer0.writeIntLe(55299);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 2);
      byte[] byteArray0 = new byte[0];
      segmentedByteString0.rangeEquals(1, byteArray0, 1276, 1);
      ByteString byteString0 = segmentedByteString0.toAsciiUppercase();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      segmentedByteString0.lastIndexOf(byteString0, (-200));
      // Undeclared exception!
      try { 
        segmentedByteString0.substring(22);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Pipe pipe0 = new Pipe(100005L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      buffer0.writeIntLe(2);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      buffer0.readShortLe();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      ByteString byteString0 = segmentedByteString0.sha256();
      ByteString byteString1 = segmentedByteString0.sha1();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "{");
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)117;
      realBufferedSource0.indexOf((byte)117, 100005L);
      byteString0.indexOf(byteArray0);
      byteArray0[1] = (byte)10;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      segmentedByteString0.toByteArray();
      segmentedByteString0.hmacSha256(byteString1);
      segmentedByteString0.base64();
      segmentedByteString0.base64Url();
      buffer0.read(realBufferedSource0.buffer, (long) 2);
      segmentedByteString0.write(buffer0);
      realBufferedSource0.indexOf((ByteString) segmentedByteString0);
      pipe0.sourceClosed = false;
      byteString0.getByte(2);
      segmentedByteString0.asByteBuffer();
      segmentedByteString0.endsWith(byteArray0);
      ByteString byteString2 = new ByteString(byteArray0);
      pipe0.sourceClosed = false;
      segmentedByteString0.equals(byteString2);
      segmentedByteString0.toByteArray();
      assertFalse(buffer0.exhausted());
      assertEquals(2L, buffer0.completeSegmentByteCount());
  }
}