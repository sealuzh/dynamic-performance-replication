/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 12:46:28 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.OutputStream;
import java.nio.charset.Charset;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.GzipSink;
import okio.HashingSink;
import okio.HashingSource;
import okio.Options;
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
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.writeDecimalLong(536L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 2);
      segmentedByteString0.hashCode();
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Pipe pipe0 = new Pipe(65280L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      ByteString byteString0 = ByteString.encodeUtf8("");
      // Undeclared exception!
      try { 
        segmentedByteString0.hmacSha256(byteString0);
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
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
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
  public void test04()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        segmentedByteString0.rangeEquals(0, byteArray0, (int) (byte)0, (-398));
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
      Pipe pipe0 = new Pipe(4127L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = ByteString.of(byteArray0);
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
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      SegmentedByteString segmentedByteString0 = null;
      try {
        segmentedByteString0 = new SegmentedByteString((Buffer) null, (-326));
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
      buffer0.writeUtf8("[\"1;5DP}8yASEO@a");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.hmacSha512(segmentedByteString0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      boolean boolean0 = segmentedByteString0.equals(buffer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Pipe pipe0 = new Pipe(4127L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      boolean boolean0 = segmentedByteString0.equals(segmentedByteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeUtf8("[\"1;5DP}8yASEO@a");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      ByteString byteString0 = segmentedByteString0.sha1();
      segmentedByteString0.equals(byteString0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeLongLe(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = segmentedByteString0.endsWith(byteArray0);
      assertFalse(boolean0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[9];
      boolean boolean0 = segmentedByteString0.rangeEquals((-931), byteArray0, 120, (int) (byte) (-10));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeUtf8("[\"1;5DP}8yASEO@a");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      boolean boolean0 = segmentedByteString0.endsWith((ByteString) segmentedByteString0);
      assertTrue(boolean0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeUtf8("[\"1;5DP}8yASEO@a");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      boolean boolean0 = segmentedByteString0.rangeEquals(31, (ByteString) segmentedByteString0, 31, 110);
      assertFalse(boolean0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Pipe pipe0 = new Pipe(4127L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      boolean boolean0 = segmentedByteString0.rangeEquals((-1), (ByteString) null, 0, (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("[\"1;5DP}8yASEO@a");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.write(buffer1);
      assertFalse(buffer0.exhausted());
      assertEquals(17L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeDecimalLong(536L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(((RealBufferedSink) bufferedSink0).buffer, 1);
      segmentedByteString0.write(buffer0);
      assertEquals(1L, buffer0.completeSegmentByteCount());
      assertEquals(1L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.writeDecimalLong(536L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      OutputStream outputStream0 = realBufferedSink0.outputStream();
      segmentedByteString0.write(outputStream0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeUtf8("[\"1;5DP}8yASEO@a");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      boolean boolean0 = segmentedByteString0.rangeEquals(1, (ByteString) segmentedByteString0, (-1271), (-2792));
      assertTrue(boolean0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Pipe pipe0 = new Pipe(1000000000000000L);
      Buffer buffer0 = pipe0.buffer;
      byte[] byteArray0 = new byte[2];
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      ByteString[] byteStringArray0 = new ByteString[8];
      byteStringArray0[0] = (ByteString) segmentedByteString0;
      Options options0 = Options.of(byteStringArray0);
      int int0 = buffer0.selectPrefix(options0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      GzipSink gzipSink0 = new GzipSink(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(gzipSink0);
      realBufferedSink0.flush();
      String string0 = buffer0.toString();
      assertEquals("[hex=1f8b0800000000000000000000ffff]", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeDecimalLong(536L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(((RealBufferedSink) bufferedSink0).buffer, 1);
      byte[] byteArray0 = segmentedByteString0.internalArray();
      segmentedByteString0.rangeEquals(2, byteArray0, 1543, 3100);
      assertEquals(1, segmentedByteString0.size());
      assertArrayEquals(new byte[] {(byte)53}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeUtf8("[\"1;5DP}8yASEO@a");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      String string0 = segmentedByteString0.toString();
      assertEquals("[text=[]", string0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.writeDecimalLong(536L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      Charset charset0 = Charset.defaultCharset();
      String string0 = segmentedByteString0.string(charset0);
      assertEquals("5", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeDecimalLong(536L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(((RealBufferedSink) bufferedSink0).buffer, 1);
      segmentedByteString0.hmacSha1(segmentedByteString0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeUtf8("[\"1;5DP}8yASEO@a");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      ByteString byteString0 = segmentedByteString0.toAsciiUppercase();
      assertEquals(1, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 0);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        segmentedByteString0.indexOf(byteArray0, 52);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.writeDecimalLong(536L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      String string0 = segmentedByteString0.hex();
      assertEquals("35", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring((-147));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.writeDecimalLong(536L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      String string0 = segmentedByteString0.base64();
      assertEquals(1, segmentedByteString0.size());
      assertEquals("NQ==", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeDecimalLong(536L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(((RealBufferedSink) bufferedSink0).buffer, 1);
      segmentedByteString0.sha256();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeDecimalLong(536L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(((RealBufferedSink) bufferedSink0).buffer, 1);
      segmentedByteString0.md5();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeUtf8("[\"1;5DP}8yASEO@a");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring(1, (int) (byte)0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Pipe pipe0 = new Pipe(435L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        segmentedByteString0.lastIndexOf(byteArray0, 786);
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
      buffer0.writeUtf8("[\"1;5DP}8yASEO@a");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      String string0 = segmentedByteString0.utf8();
      assertEquals(1, segmentedByteString0.size());
      assertEquals("[", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeUtf8("[\"1;5DP}8yASEO@a");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      String string0 = segmentedByteString0.base64Url();
      assertEquals(1, segmentedByteString0.size());
      assertEquals("Ww==", string0);
  }
}
