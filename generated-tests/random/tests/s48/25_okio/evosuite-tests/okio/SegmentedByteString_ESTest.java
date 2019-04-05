/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 10:13:47 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.zip.Deflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.DeflaterSink;
import okio.HashingSink;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.SegmentedByteString;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SegmentedByteString_ESTest extends SegmentedByteString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[6];
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      String string0 = segmentedByteString0.utf8();
      assertEquals("\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      HashingSink hashingSink0 = HashingSink.sha512(deflaterSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeUtf8("*}#|g!<w|<h:,Ve(3");
      realBufferedSink0.writeShort(112);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(((RealBufferedSink) bufferedSink0).buffer, 18);
      int int0 = segmentedByteString0.size();
      assertEquals(18, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeUtf8("out == null");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      ByteString byteString0 = segmentedByteString0.substring(1, 1);
      assertEquals(1, segmentedByteString0.size());
      assertEquals(0, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Pipe pipe0 = new Pipe(898L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      realBufferedSource0.buffer.readUnsafe(buffer_UnsafeCursor0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer_UnsafeCursor0.buffer, 0);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        segmentedByteString0.lastIndexOf(byteArray0, 0);
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
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.toAsciiUppercase();
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
  public void test06()  throws Throwable  {
      Pipe pipe0 = new Pipe(898L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.lastIndexOf(buffer_UnsafeCursor0.data, 0);
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
      Pipe pipe0 = new Pipe(1522L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      Buffer.UnsafeCursor buffer_UnsafeCursor1 = realBufferedSource0.buffer.readUnsafe(buffer_UnsafeCursor0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer_UnsafeCursor1.buffer, 0);
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
  public void test08()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        segmentedByteString0.indexOf(byteArray0, (int) (byte) (-117));
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
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
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
  public void test10()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      HashingSink hashingSink0 = HashingSink.sha512(deflaterSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      Buffer buffer1 = realBufferedSink0.buffer;
      realBufferedSink0.writeDecimalLong(0L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      // Undeclared exception!
      try { 
        segmentedByteString0.getByte((-4819));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=1 offset=-4819 byteCount=1
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentedByteString segmentedByteString0 = null;
      try {
        segmentedByteString0 = new SegmentedByteString((Buffer) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = null;
      try {
        segmentedByteString0 = new SegmentedByteString(buffer0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=0 byteCount=-1
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      segmentedByteString0.hashCode();
      segmentedByteString0.hashCode();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeUtf8("out == null");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.hashCode();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      ByteString byteString0 = ByteString.encodeUtf8("");
      // Undeclared exception!
      try { 
        segmentedByteString0.equals(byteString0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      boolean boolean0 = segmentedByteString0.equals(segmentedByteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeUtf8("out == null");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      boolean boolean0 = segmentedByteString0.equals(buffer0);
      assertFalse(boolean0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeLongLe(0L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 2);
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = segmentedByteString0.rangeEquals(2, byteArray0, 2, 0);
      assertEquals(2, segmentedByteString0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeUtf8("out == null");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      byte[] byteArray0 = new byte[5];
      segmentedByteString0.rangeEquals(477, byteArray0, 1296, (int) (byte) (-34));
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = segmentedByteString0.rangeEquals((-16777216), byteArray0, (-1), (int) (byte)127);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      HashingSink hashingSink0 = HashingSink.sha512(deflaterSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.writeDecimalLong(0L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      boolean boolean0 = segmentedByteString0.rangeEquals(1, (ByteString) segmentedByteString0, 1, 1);
      assertFalse(boolean0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      boolean boolean0 = segmentedByteString0.rangeEquals((int) (byte) (-88), (ByteString) segmentedByteString0, (int) (byte)73, 1352);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      HashingSink hashingSink0 = HashingSink.sha512(deflaterSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeUtf8("*}#|g!<w|<h:,Ve(3");
      realBufferedSink0.writeShort(112);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(((RealBufferedSink) bufferedSink0).buffer, 18);
      segmentedByteString0.write(buffer0);
      assertFalse(buffer0.exhausted());
      assertEquals(18L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[6];
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      segmentedByteString0.write(buffer0);
      assertEquals(8L, buffer0.size());
      assertEquals(8L, buffer0.completeSegmentByteCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      segmentedByteString0.write(buffer0);
      assertEquals(0L, buffer0.size());
      assertTrue(buffer0.exhausted());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
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
  public void test27()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeShortLe(2);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      MockPrintStream mockPrintStream0 = new MockPrintStream("okio.Okio");
      segmentedByteString0.write(mockPrintStream0);
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeUtf8("out == null");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      boolean boolean0 = segmentedByteString0.startsWith((ByteString) segmentedByteString0);
      assertTrue(boolean0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeUtf8("out == null");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      ByteString byteString0 = segmentedByteString0.toAsciiLowercase();
      assertEquals(1, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeUtf8("out == null");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      String string0 = segmentedByteString0.toString();
      assertEquals("[text=o]", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[6];
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      Charset charset0 = Charset.defaultCharset();
      segmentedByteString0.string(charset0);
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      HashingSink hashingSink0 = HashingSink.sha512(deflaterSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      Buffer buffer1 = realBufferedSink0.buffer;
      realBufferedSink0.writeDecimalLong(0L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      ByteString byteString0 = segmentedByteString0.hmacSha256(segmentedByteString0);
      assertEquals(32, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.hmacSha1(segmentedByteString0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      HashingSink hashingSink0 = HashingSink.sha512(deflaterSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.writeDecimalLong(0L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      segmentedByteString0.toAsciiUppercase();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer();
      realBufferedSink0.writeLongLe(0L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 2);
      // Undeclared exception!
      try { 
        segmentedByteString0.indexOf((byte[]) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeUtf8("out == null");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      String string0 = segmentedByteString0.hex();
      assertEquals(1, segmentedByteString0.size());
      assertEquals("6f", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.sha1();
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
      Pipe pipe0 = new Pipe(2896L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring((-2352));
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
      // Undeclared exception!
      try { 
        segmentedByteString0.asByteBuffer();
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
        segmentedByteString0.base64();
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
  public void test42()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
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
  public void test43()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      HashingSink hashingSink0 = HashingSink.sha512(deflaterSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeUtf8("*}#|g!<w|<h:,Ve(3");
      realBufferedSink0.writeShort(112);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(((RealBufferedSink) bufferedSink0).buffer, 18);
      segmentedByteString0.internalArray();
      assertEquals(18, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      HashingSink hashingSink0 = HashingSink.sha512(deflaterSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeUtf8("*}#|g!<w|<h:,Ve(3");
      realBufferedSink0.writeShort(112);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(((RealBufferedSink) bufferedSink0).buffer, 18);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring(18, (-2481));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeShortLe(2);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      byte[] byteArray0 = new byte[1];
      int int0 = segmentedByteString0.lastIndexOf(byteArray0);
      assertEquals(2, segmentedByteString0.size());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
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
  public void test47()  throws Throwable  {
      Pipe pipe0 = new Pipe(350L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      HashingSink hashingSink0 = HashingSink.md5(pipe_PipeSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 0);
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