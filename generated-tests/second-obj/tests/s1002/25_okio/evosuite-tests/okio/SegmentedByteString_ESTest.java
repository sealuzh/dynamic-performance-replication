/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:18:30 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamConstants;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.Buffer;
import okio.ByteString;
import okio.HashingSink;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Segment;
import okio.SegmentedByteString;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SegmentedByteString_ESTest extends SegmentedByteString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
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
  public void test01()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      byte[] byteArray0 = new byte[9];
      boolean boolean0 = segmentedByteString0.rangeEquals((-1042), byteArray0, 0, (-1175));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.base64Url();
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
      ByteString byteString0 = buffer0.snapshot();
      Buffer buffer1 = buffer0.writeDecimalLong((byte)1);
      FileSystemHandling.shouldAllThrowIOExceptions();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, (byte)1);
      segmentedByteString0.write(buffer1);
      // Undeclared exception!
      try { 
        segmentedByteString0.hmacSha1(byteString0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[1];
      segmentedByteString0.rangeEquals((-1042), (ByteString) segmentedByteString0, 0, (-1042));
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
  public void test06()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("1l ktN9|[3`", charset0);
      // Undeclared exception!
      try { 
        segmentedByteString0.lastIndexOf(byteString0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.toString();
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
      Charset.defaultCharset();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.internalArray();
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
      Buffer buffer0 = new Buffer();
      int int0 = 0;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        segmentedByteString0.toAsciiLowercase();
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
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      segmentedByteString0.hashCode();
      // Undeclared exception!
      try { 
        segmentedByteString0.substring(0, 4746);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer;
      buffer1.writeLong(883L);
      buffer0.clone();
      buffer1.writeInt(10);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, (byte)1);
      segmentedByteString0.rangeEquals((int) (byte)1, (byte[]) null, 10, 10);
      // Undeclared exception!
      try { 
        segmentedByteString0.indexOf((byte[]) null, (int) (byte)1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Charset.defaultCharset();
      buffer0.writeDecimalLong((byte)1);
      FileSystemHandling.shouldAllThrowIOExceptions();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, (byte)1);
      ByteString byteString0 = segmentedByteString0.sha1();
      segmentedByteString0.rangeEquals((int) (byte)1, byteString0, (int) (byte)1, 944);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      buffer0.writeDecimalLong((byte)1);
      FileSystemHandling.shouldAllThrowIOExceptions();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, (byte)1);
      assertEquals(1, segmentedByteString0.size());
      
      String string0 = segmentedByteString0.utf8();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Buffer buffer0 = new Buffer();
      buffer0.writeDecimalLong((byte)1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, (byte)1);
      segmentedByteString0.hashCode();
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = segmentedByteString0.startsWith(byteArray0);
      assertTrue(boolean0);
      
      String string0 = segmentedByteString0.base64();
      assertEquals("MQ==", string0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer;
      Buffer buffer2 = buffer1.writeInt(31);
      HashingSink hashingSink0 = HashingSink.sha256(buffer2);
      ByteString byteString0 = hashingSink0.hash();
      HashingSink hashingSink1 = HashingSink.hmacSha512(buffer1, byteString0);
      HashingSink.hmacSha512(hashingSink1, byteString0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 2);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)1;
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)1;
      segmentedByteString0.rangeEquals((int) (byte)1, byteArray0, 32, (int) (byte)1);
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeDecimalLong((byte)1);
      FileSystemHandling.shouldAllThrowIOExceptions();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, (byte)1);
      MockPrintStream mockPrintStream0 = new MockPrintStream("okio.SegmentedByteString");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      segmentedByteString0.write(objectOutputStream0);
      Charset charset0 = Charset.defaultCharset();
      String string0 = segmentedByteString0.string(charset0);
      assertEquals("1", string0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Pipe pipe0 = new Pipe(999999999995L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      segmentedByteString0.hashCode();
      segmentedByteString0.hashCode();
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
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.buffer.writeInt(31);
      ByteString byteString0 = realBufferedSink0.buffer.snapshot();
      byte byte0 = byteString0.getByte((byte)1);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-14);
      byteArray0[1] = (byte)0;
      byteArray0[3] = (byte) (-87);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer;
      realBufferedSink0.buffer.writeInt((byte)0);
      ByteString byteString0 = realBufferedSink0.buffer.snapshot();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      boolean boolean0 = byteString0.rangeEquals((int) (byte)0, byteArray0, (-1042), (-1042));
      assertFalse(boolean0);
      assertEquals(4, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.snapshot();
      Charset.defaultCharset();
      buffer0.writeDecimalLong((byte)1);
      FileSystemHandling.shouldAllThrowIOExceptions();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, (byte)1);
      segmentedByteString0.sha256();
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
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer;
      Buffer buffer2 = buffer1.writeInt(38);
      HashingSink.sha256(buffer2);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 2);
      ByteString byteString0 = segmentedByteString0.sha1();
      byte[] byteArray0 = new byte[9];
      boolean boolean0 = segmentedByteString0.equals(byteString0);
      assertEquals(2, segmentedByteString0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      buffer0.writeDecimalLong(1255L);
      FileSystemHandling.shouldAllThrowIOExceptions();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      ByteString byteString0 = ByteString.encodeUtf8("Nn");
      boolean boolean0 = segmentedByteString0.startsWith(byteString0);
      assertFalse(boolean0);
      
      String string0 = segmentedByteString0.utf8();
      assertEquals("12", string0);
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Charset.defaultCharset();
      Buffer buffer1 = buffer0.writeDecimalLong((byte)1);
      FileSystemHandling.shouldAllThrowIOExceptions();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, (byte)1);
      MockPrintStream mockPrintStream0 = new MockPrintStream("okio.SegmentedByteString");
      mockPrintStream0.println();
      mockPrintStream0.println((double) (byte)1);
      mockPrintStream0.append((CharSequence) "okio.SegmentedByteString");
      segmentedByteString0.equals("");
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      Buffer buffer2 = realBufferedSource0.buffer();
      buffer2.toString();
      ByteString byteString0 = segmentedByteString0.toAsciiUppercase();
      segmentedByteString0.startsWith(byteString0);
      ByteBuffer byteBuffer0 = segmentedByteString0.asByteBuffer();
      assertTrue(byteBuffer0.isReadOnly());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = buffer0.clone();
      Buffer buffer2 = realBufferedSink0.buffer.writeInt(31);
      HashingSink hashingSink0 = HashingSink.sha256(buffer2);
      hashingSink0.hash();
      buffer0.sha512();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 2);
      byte[] byteArray0 = new byte[9];
      segmentedByteString0.write(buffer1);
      assertFalse(buffer1.exhausted());
      assertFalse(buffer0.equals((Object)buffer1));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      Charset.defaultCharset();
      Buffer buffer1 = buffer0.writeDecimalLong((byte)1);
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = buffer1.readUnsafe();
      Buffer buffer2 = buffer_UnsafeCursor0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer2, (byte)1);
      ByteString byteString0 = segmentedByteString0.sha1();
      byteString0.startsWith((ByteString) segmentedByteString0);
      // Undeclared exception!
      try { 
        ByteString.of((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // data == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeDecimalLong((byte)1);
      ByteString byteString0 = buffer0.snapshot();
      FileSystemHandling.shouldAllThrowIOExceptions();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, (byte)1);
      boolean boolean0 = segmentedByteString0.equals(byteString0);
      assertTrue(boolean0);
      
      byteString0.sha256();
      assertTrue(byteString0.equals((Object)segmentedByteString0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer;
      Buffer buffer2 = realBufferedSink0.buffer.writeInt(18);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      Buffer buffer3 = buffer0.writeDecimalLong((byte)1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, (byte)1);
      HashingSink hashingSink0 = HashingSink.sha1(buffer2);
      hashingSink0.close();
      hashingSink0.timeout();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.shouldAllThrowIOExceptions();
      segmentedByteString0.base64();
      SegmentedByteString segmentedByteString1 = new SegmentedByteString(buffer0, (byte)1);
      segmentedByteString1.equals(segmentedByteString0);
      SegmentedByteString segmentedByteString2 = null;
      try {
        segmentedByteString2 = new SegmentedByteString(buffer3, 54);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=1 offset=0 byteCount=54
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "s.limit == s.pos");
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer;
      Buffer buffer2 = realBufferedSink0.buffer.writeInt(18);
      buffer2.writeShortLe(2);
      Charset.defaultCharset();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 2);
      SegmentedByteString segmentedByteString1 = new SegmentedByteString(buffer1, 2);
      buffer0.writeDecimalLong((byte)1);
      segmentedByteString1.getByte((byte)1);
      SegmentedByteString segmentedByteString2 = new SegmentedByteString(buffer1, (byte)1);
      Segment segment0 = new Segment();
      buffer1.head = segment0;
      HashingSink.sha1(buffer2);
      buffer1.require((byte)0);
      ByteBuffer byteBuffer0 = segmentedByteString1.asByteBuffer();
      ByteString.decodeBase64("s.limit == s.pos");
      byteBuffer0.duplicate();
      FileSystemHandling.shouldAllThrowIOExceptions();
      SegmentedByteString segmentedByteString3 = null;
      try {
        segmentedByteString3 = new SegmentedByteString(buffer2, 2);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // s.limit == s.pos
         //
      }
  }
}