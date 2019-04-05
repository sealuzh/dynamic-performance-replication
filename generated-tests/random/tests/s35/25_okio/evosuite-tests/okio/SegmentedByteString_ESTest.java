/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 20:12:31 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.GzipSink;
import okio.InflaterSource;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.SegmentedByteString;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SegmentedByteString_ESTest extends SegmentedByteString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.startsWith((ByteString) segmentedByteString0);
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
      Pipe pipe0 = new Pipe(3L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      GzipSink gzipSink0 = new GzipSink(pipe_PipeSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(gzipSink0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 0);
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
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 0);
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
  public void test03()  throws Throwable  {
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
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Charset charset0 = Charset.defaultCharset();
      realBufferedSink0.writeString("ONCTYNmtG~y2", charset0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      // Undeclared exception!
      try { 
        segmentedByteString0.getByte((-845));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=1 offset=-845 byteCount=1
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
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

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = null;
      try {
        segmentedByteString0 = new SegmentedByteString(buffer0, 511);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=0 byteCount=511
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      segmentedByteString0.hashCode();
      segmentedByteString0.hashCode();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Charset charset0 = Charset.defaultCharset();
      realBufferedSink0.writeString("ONCTYNmtG~y2", charset0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      segmentedByteString0.hashCode();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      Locale locale0 = Locale.UK;
      boolean boolean0 = segmentedByteString0.equals(locale0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeUtf8("2fPhI'c/l`#TFrTF>p");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = segmentedByteString0.rangeEquals(783, byteArray0, 954, 783);
      assertFalse(boolean0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Pipe pipe0 = new Pipe(3L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      GzipSink gzipSink0 = new GzipSink(pipe_PipeSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(gzipSink0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 0);
      boolean boolean0 = segmentedByteString0.rangeEquals((-3412), (ByteString) null, (-3412), 709);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("2fPhI'c/l`#TFrTF>p");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      buffer1.readUtf8();
      segmentedByteString0.write(buffer1);
      assertFalse(buffer1.exhausted());
      assertEquals(1L, buffer0.completeSegmentByteCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("2fPhI'c/l`#TFrTF>p");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.write(buffer1);
      assertFalse(buffer0.exhausted());
      assertEquals(19L, buffer0.completeSegmentByteCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
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
  public void test16()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeUtf8("2fPhI'c/l`#TFrTF>p");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      boolean boolean0 = segmentedByteString0.startsWith((ByteString) segmentedByteString0);
      assertEquals(1, segmentedByteString0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Pipe pipe0 = new Pipe(4387L);
      Buffer buffer0 = pipe0.buffer;
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = buffer0.readAndWriteUnsafe();
      buffer0.writeUtf8CodePoint(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer_UnsafeCursor0.buffer, 1);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Pipe pipe0 = new Pipe(1603L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeShort(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.rangeEquals(1, (ByteString) segmentedByteString0, 1, 320);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeUtf8("2fPhI'c/l`#TFrTF>p");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      String string0 = segmentedByteString0.toString();
      assertEquals("[text=2]", string0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeInt(2);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      segmentedByteString0.hmacSha256(segmentedByteString0);
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(true);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      realBufferedSource0.buffer.writeInt(2);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 2);
      ByteString byteString0 = segmentedByteString0.toAsciiUppercase();
      assertEquals(2, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 0);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        segmentedByteString0.indexOf(byteArray0);
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
      buffer0.writeInt(2);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      String string0 = segmentedByteString0.hex();
      assertEquals(2, segmentedByteString0.size());
      assertEquals("0000", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Pipe pipe0 = new Pipe(1603L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeShort(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.sha1();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring(693);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Pipe pipe0 = new Pipe(1603L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeShort(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.asByteBuffer();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(true);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      realBufferedSource0.buffer.writeInt(2);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 2);
      ByteString byteString0 = segmentedByteString0.sha256();
      byteString0.hmacSha256(segmentedByteString0);
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.indexOf((ByteString) segmentedByteString0);
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
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring(632, 632);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        segmentedByteString0.lastIndexOf(byteArray0, (int) (byte)33);
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
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 0);
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
  public void test37()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(true);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      Buffer buffer1 = realBufferedSource0.buffer;
      buffer1.writeInt(2);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 2);
      String string0 = segmentedByteString0.base64Url();
      assertEquals("AAA=", string0);
      assertEquals(2, segmentedByteString0.size());
  }
}
