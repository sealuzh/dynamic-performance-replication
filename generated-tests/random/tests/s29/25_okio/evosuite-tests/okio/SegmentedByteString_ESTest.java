/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 13:38:48 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.DeflaterSink;
import okio.GzipSource;
import okio.HashingSink;
import okio.InflaterSource;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.SegmentedByteString;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SegmentedByteString_ESTest extends SegmentedByteString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      GzipSource gzipSource0 = new GzipSource(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      Buffer buffer1 = realBufferedSource0.buffer();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-70);
      buffer1.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      segmentedByteString0.hashCode();
      segmentedByteString0.hashCode();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      GzipSource gzipSource0 = new GzipSource(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      Buffer buffer1 = realBufferedSource0.buffer();
      byte[] byteArray0 = new byte[5];
      buffer1.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      boolean boolean0 = segmentedByteString0.rangeEquals(13, (ByteString) null, 13, 0);
      assertFalse(boolean0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 0);
      ByteString byteString0 = ByteString.EMPTY;
      // Undeclared exception!
      try { 
        segmentedByteString0.hmacSha1(byteString0);
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
      Inflater inflater0 = new Inflater(false);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      GzipSource gzipSource0 = new GzipSource(inflaterSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 0);
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
  public void test04()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      Buffer.UnsafeCursor buffer_UnsafeCursor1 = buffer0.readUnsafe(buffer_UnsafeCursor0);
      buffer_UnsafeCursor0.buffer.writeHexadecimalUnsignedLong((-1));
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer_UnsafeCursor1.buffer, 13);
      // Undeclared exception!
      try { 
        segmentedByteString0.indexOf((byte[]) null, 13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
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
  public void test06()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      // Undeclared exception!
      try { 
        segmentedByteString0.getByte((byte) (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=1 offset=-1 byteCount=1
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentedByteString segmentedByteString0 = null;
      try {
        segmentedByteString0 = new SegmentedByteString((Buffer) null, (-39));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      GzipSource gzipSource0 = new GzipSource(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      Buffer buffer1 = realBufferedSource0.buffer();
      byte[] byteArray0 = new byte[5];
      buffer1.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      byte[] byteArray1 = segmentedByteString0.toByteArray();
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      GzipSource gzipSource0 = new GzipSource(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      byte[] byteArray0 = new byte[5];
      realBufferedSource0.buffer.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 1);
      segmentedByteString0.hashCode();
      segmentedByteString0.hashCode();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      buffer0.readUnsafe(buffer_UnsafeCursor0);
      buffer_UnsafeCursor0.buffer.writeHexadecimalUnsignedLong((-1));
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer_UnsafeCursor0.buffer, 13);
      segmentedByteString0.hashCode();
      assertEquals(13, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      GzipSource gzipSource0 = new GzipSource(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      Buffer buffer1 = realBufferedSource0.buffer();
      byte[] byteArray0 = new byte[5];
      buffer1.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      boolean boolean0 = segmentedByteString0.equals("rX");
      assertEquals(1, segmentedByteString0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      HashingSink hashingSink0 = HashingSink.sha512(deflaterSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 0);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        segmentedByteString0.rangeEquals(0, byteArray0, (int) (byte)31, (-308));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 0);
      ByteString byteString0 = ByteString.EMPTY;
      boolean boolean0 = byteString0.rangeEquals(3165, (ByteString) segmentedByteString0, (-837), 646);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      GzipSource gzipSource0 = new GzipSource(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      Buffer buffer1 = realBufferedSource0.buffer();
      byte[] byteArray0 = new byte[5];
      buffer1.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      segmentedByteString0.rangeEquals(13, (ByteString) null, 13, (int) (byte)89);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[5];
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      boolean boolean0 = segmentedByteString0.rangeEquals(13, (ByteString) null, 13, (int) (byte) (-78));
      assertTrue(boolean0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeHexadecimalUnsignedLong((-1));
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 13);
      boolean boolean0 = segmentedByteString0.rangeEquals((-837), (ByteString) segmentedByteString0, (-709), 13);
      assertEquals(13, segmentedByteString0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = new Buffer();
      buffer1.writeHexadecimalUnsignedLong((-1));
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 13);
      segmentedByteString0.write(buffer0);
      assertFalse(buffer0.exhausted());
      assertEquals(13L, buffer0.completeSegmentByteCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      buffer0.readUnsafe(buffer_UnsafeCursor0);
      buffer_UnsafeCursor0.buffer.writeHexadecimalUnsignedLong((-1));
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer_UnsafeCursor0.buffer, 13);
      segmentedByteString0.write(buffer0);
      assertEquals(29L, buffer0.size());
      assertEquals(29L, buffer0.completeSegmentByteCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      GzipSource gzipSource0 = new GzipSource(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      Buffer buffer1 = realBufferedSource0.buffer();
      byte[] byteArray0 = new byte[5];
      buffer1.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("QaV$elG6QRg", true);
      segmentedByteString0.write(mockFileOutputStream0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      buffer0.readUnsafe(buffer_UnsafeCursor0);
      buffer_UnsafeCursor0.buffer.writeHexadecimalUnsignedLong((-1));
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer_UnsafeCursor0.buffer, 13);
      byte byte0 = segmentedByteString0.getByte(5);
      assertEquals(13, segmentedByteString0.size());
      assertEquals((byte)102, byte0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.getByte((byte)0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[8];
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.endsWith(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
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
  public void test24()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      buffer0.readFrom((InputStream) byteArrayInputStream0);
      String string0 = deflaterSink0.toString();
      assertEquals("DeflaterSink([hex=0000000000000000])", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Pipe pipe0 = new Pipe(2147483647L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      Charset charset0 = Charset.defaultCharset();
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
  public void test26()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      Buffer.UnsafeCursor buffer_UnsafeCursor1 = buffer0.readUnsafe(buffer_UnsafeCursor0);
      buffer_UnsafeCursor1.buffer.writeHexadecimalUnsignedLong((-1));
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer_UnsafeCursor1.buffer, 13);
      segmentedByteString0.hmacSha256(segmentedByteString0);
      assertEquals(13, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      GzipSource gzipSource0 = new GzipSource(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      byte[] byteArray0 = new byte[5];
      realBufferedSource0.buffer.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 1);
      // Undeclared exception!
      try { 
        segmentedByteString0.hmacSha1((ByteString) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.toAsciiUppercase();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.indexOf(byteArray0, 1);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      String string0 = segmentedByteString0.hex();
      assertEquals("00", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.sha1();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring(639);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.asByteBuffer();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      Buffer.UnsafeCursor buffer_UnsafeCursor1 = buffer0.readUnsafe(buffer_UnsafeCursor0);
      buffer_UnsafeCursor0.buffer.writeHexadecimalUnsignedLong((-1));
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer_UnsafeCursor1.buffer, 13);
      String string0 = segmentedByteString0.base64();
      assertEquals("ZmZmZmZmZmZmZmZmZg==", string0);
      assertEquals(13, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Pipe pipe0 = new Pipe(1475L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.sha256();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      buffer0.readUnsafe(buffer_UnsafeCursor0);
      buffer_UnsafeCursor0.buffer.writeHexadecimalUnsignedLong((-1));
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 13);
      segmentedByteString0.md5();
      assertEquals(13, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Pipe pipe0 = new Pipe(3L);
      Buffer buffer0 = pipe0.buffer;
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
  public void test38()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring(3008, 31);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        segmentedByteString0.lastIndexOf(byteArray0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Buffer buffer0 = new Buffer();
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
  public void test41()  throws Throwable  {
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
}
