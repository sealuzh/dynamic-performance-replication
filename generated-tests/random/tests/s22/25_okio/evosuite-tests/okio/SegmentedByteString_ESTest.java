/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 06:58:55 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import okio.Buffer;
import okio.ByteString;
import okio.HashingSink;
import okio.Options;
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
      Pipe pipe0 = new Pipe(10000000000L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeLongLe(10000000000L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      segmentedByteString0.hashCode();
      assertEquals(3, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Pipe pipe0 = new Pipe(60L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeUtf8CodePoint(150);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      segmentedByteString0.hmacSha1(segmentedByteString0);
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      buffer0.readUnsafe(buffer_UnsafeCursor0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer_UnsafeCursor0.buffer, 0);
      segmentedByteString0.write(buffer0);
      assertTrue(buffer0.exhausted());
      assertEquals(0L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[8];
      ByteString byteString0 = new ByteString(byteArray0);
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
  public void test04()  throws Throwable  {
      Pipe pipe0 = new Pipe(1498L);
      Buffer buffer0 = pipe0.buffer;
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
  public void test05()  throws Throwable  {
      Pipe pipe0 = new Pipe(758L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
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
  public void test06()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 0);
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
  public void test07()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        segmentedByteString0.indexOf(byteArray0, (-1900));
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
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      buffer0.readUnsafe(buffer_UnsafeCursor0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer_UnsafeCursor0.buffer, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.getByte((-1678));
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
      Pipe pipe0 = new Pipe(60L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeUtf8CodePoint(150);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      // Undeclared exception!
      try { 
        segmentedByteString0.getByte((-794));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=2 offset=-794 byteCount=1
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SegmentedByteString segmentedByteString0 = null;
      try {
        segmentedByteString0 = new SegmentedByteString((Buffer) null, (-2484));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha256(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      SegmentedByteString segmentedByteString0 = null;
      try {
        segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 242);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=0 byteCount=242
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Pipe pipe0 = new Pipe(1095216660480L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeLong(3);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      segmentedByteString0.hashCode();
      segmentedByteString0.hashCode();
      assertEquals(3, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      ByteString[] byteStringArray0 = new ByteString[8];
      byteStringArray0[4] = (ByteString) segmentedByteString0;
      Options options0 = Options.of(byteStringArray0);
      int int0 = options0.lastIndexOf(byteStringArray0[4]);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Pipe pipe0 = new Pipe(60L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeUtf8CodePoint(150);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = realBufferedSource0.readByteString((long) 2);
      boolean boolean0 = byteString0.rangeEquals((-1900), (ByteString) segmentedByteString0, 1, (-729));
      assertEquals(2, segmentedByteString0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Pipe pipe0 = new Pipe(10000000000L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeLongLe(10000000000L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      segmentedByteString0.rangeEquals(240, byteArray0, (-2047), 1379);
      assertEquals(3, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[5];
      boolean boolean0 = segmentedByteString0.rangeEquals((-1900), byteArray0, 0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Pipe pipe0 = new Pipe(1095216660480L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeLong(3);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      boolean boolean0 = segmentedByteString0.endsWith((ByteString) segmentedByteString0);
      assertTrue(boolean0);
      assertEquals(3, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      boolean boolean0 = segmentedByteString0.rangeEquals((-1900), (ByteString) segmentedByteString0, 2, 2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeUtf8("size > Integer.MAX_VALUE: ");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 16);
      segmentedByteString0.write(buffer0);
      assertEquals(42L, buffer0.size());
      assertEquals(42L, buffer0.completeSegmentByteCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Pipe pipe0 = new Pipe(1095216660480L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeLong(3);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
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
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeUtf8("size > Integer.MAX_VALUE: ");
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 16);
      MockPrintStream mockPrintStream0 = new MockPrintStream("fA6r[F=^D");
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0, 866);
      segmentedByteString0.write(bufferedOutputStream0);
      assertEquals(16, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Pipe pipe0 = new Pipe(10000000000L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeLongLe(10000000000L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      byte byte0 = segmentedByteString0.getByte((byte)0);
      assertEquals((byte)0, byte0);
      assertEquals(3, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      buffer0.readAndWriteUnsafe(buffer_UnsafeCursor0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer_UnsafeCursor0.buffer, 0);
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
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = buffer0.readAndWriteUnsafe();
      buffer_UnsafeCursor0.resizeBuffer(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer_UnsafeCursor0.buffer, 1);
      // Undeclared exception!
      try { 
        segmentedByteString0.hmacSha256((ByteString) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Pipe pipe0 = new Pipe(1095216660480L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeLong(3);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      ByteString byteString0 = segmentedByteString0.toAsciiUppercase();
      assertEquals(3, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Pipe pipe0 = new Pipe(1095216660480L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeLong(3);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      int int0 = segmentedByteString0.indexOf(byteArray0, 3014);
      assertEquals(3, segmentedByteString0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      Pipe pipe0 = new Pipe(1095216660480L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeLong(3);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      segmentedByteString0.sha1();
      assertEquals(3, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Pipe pipe0 = new Pipe(10000000000L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeLongLe(10000000000L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      ByteString byteString0 = segmentedByteString0.substring(3);
      boolean boolean0 = segmentedByteString0.equals(byteString0);
      assertEquals(3, segmentedByteString0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Pipe pipe0 = new Pipe(10000000000L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeLongLe(10000000000L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      segmentedByteString0.asByteBuffer();
      assertEquals(3, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
      Pipe pipe0 = new Pipe(10000000000L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeLongLe(10000000000L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      segmentedByteString0.md5();
      assertEquals(3, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Pipe pipe0 = new Pipe(1095216660480L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeLong(3);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 3);
      byte[] byteArray0 = segmentedByteString0.internalArray();
      assertNotNull(byteArray0);
      assertEquals(3, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring((-2328), 0);
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
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.lastIndexOf((byte[]) null, 0);
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
  public void test39()  throws Throwable  {
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
