/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 09:13:44 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileDescriptor;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.HashingSink;
import okio.InflaterSource;
import okio.Options;
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
      segmentedByteString0.write(buffer0);
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
  public void test01()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 0);
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
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha1(buffer0);
      HashingSink hashingSink1 = HashingSink.md5(hashingSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink1);
      realBufferedSink0.buffer();
      Buffer buffer1 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 0);
      segmentedByteString0.write(buffer0);
      SegmentedByteString segmentedByteString1 = new SegmentedByteString(realBufferedSink0.buffer, 0);
      // Undeclared exception!
      try { 
        segmentedByteString1.equals(segmentedByteString0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      Segment segment0 = buffer0.head;
      buffer0.head = null;
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
  public void test04()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha1(buffer0);
      HashingSink hashingSink1 = HashingSink.md5(hashingSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink1);
      Buffer buffer1 = realBufferedSink0.buffer();
      buffer1.clear();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 0);
      segmentedByteString0.write(realBufferedSink0.buffer);
      ByteString byteString0 = ByteString.encodeUtf8("/$c^o,IIy=)XbEl");
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
  public void test05()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.md5(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      Buffer buffer1 = realBufferedSink0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)109;
      byte byte0 = (byte)0;
      realBufferedSink0.outputStream();
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)109;
      byteArray0[3] = (byte)0;
      byte byte1 = (byte) (-21);
      // Undeclared exception!
      try { 
        segmentedByteString0.indexOf(byteArray0, (int) (byte)109);
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
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte) (-100);
      byteArray0[2] = (byte) (-127);
      byteArray0[3] = (byte)40;
      byteArray0[4] = (byte)16;
      byteArray0[5] = (byte) (-28);
      byteArray0[6] = (byte)69;
      byteArray0[7] = (byte)49;
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
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      int int0 = 0;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      ByteString byteString0 = ByteString.EMPTY;
      // Undeclared exception!
      try { 
        segmentedByteString0.rangeEquals(0, byteString0, 0, 40);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring(0, 0);
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
  public void test11()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-120);
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)31;
      byteArray0[5] = (byte)84;
      ByteString byteString0 = new ByteString(byteArray0);
      boolean boolean0 = segmentedByteString0.rangeEquals((-1288), byteString0, (int) (byte)1, (-1193));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      Charset charset0 = Charset.defaultCharset();
      buffer0.writeString("}", 0, 0, charset0);
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
  public void test13()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      segmentedByteString0.write(buffer0);
      // Undeclared exception!
      try { 
        segmentedByteString0.rangeEquals(1, (byte[]) null, (-2091), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)22;
      segmentedByteString0.rangeEquals((-65), byteArray0, 31, (-1506));
      byteArray0[2] = (byte)118;
      byteArray0[3] = (byte)17;
      // Undeclared exception!
      try { 
        ByteString.of(byteArray0, (int) (byte)17, (int) (byte)118);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=4 offset=17 byteCount=118
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Buffer buffer1 = realBufferedSource0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 0);
      buffer1.clone();
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
  public void test16()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      segmentedByteString0.equals("^");
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      Pipe pipe0 = new Pipe(3349L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeShortLe(108);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      assertEquals(2, segmentedByteString0.size());
      
      String string0 = segmentedByteString0.utf8();
      assertEquals("l\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      segmentedByteString0.write(buffer0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("fp`pCD^u}Y3%7`yp@i");
      mockPrintStream0.println(0.0);
      segmentedByteString0.write(mockPrintStream0);
      assertEquals(0L, buffer0.size());
      assertTrue(buffer0.exhausted());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[12];
      Buffer buffer1 = buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
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
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte) (-8);
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      String string0 = segmentedByteString0.base64Url();
      assertEquals("AAA=", string0);
      
      segmentedByteString0.rangeEquals(2, (ByteString) segmentedByteString0, 2, 2);
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte) (-8);
      Buffer buffer1 = buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      segmentedByteString0.base64Url();
      ByteString byteString0 = ByteString.encodeUtf8("AAA=");
      segmentedByteString0.rangeEquals(1, byteString0, (-2038), 1);
      segmentedByteString0.sha1();
      segmentedByteString0.write(buffer1);
      assertEquals(7L, buffer1.size());
      assertEquals(7L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte) (-8);
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      String string0 = segmentedByteString0.base64Url();
      assertEquals("AAA=", string0);
      
      segmentedByteString0.rangeEquals(5, byteArray0, (int) (byte) (-8), 1451);
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[6];
      Buffer buffer1 = buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 2);
      segmentedByteString0.rangeEquals(0, byteArray0, 0, 2);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      assertFalse(fileDescriptor0.valid());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte) (-8);
      Buffer buffer1 = buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      ByteString byteString0 = buffer0.sha1();
      segmentedByteString0.utf8();
      ByteString.encodeUtf8("\u0000\u0000");
      segmentedByteString0.rangeEquals(1, byteString0, (int) (byte) (-8), (int) (byte) (-8));
      segmentedByteString0.sha1();
      SegmentedByteString segmentedByteString1 = new SegmentedByteString(buffer1, 1);
      segmentedByteString1.write(buffer1);
      assertEquals(6L, buffer1.size());
      assertEquals(6L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      boolean boolean0 = segmentedByteString0.rangeEquals(1, byteArray0, (int) (byte) (-73), (-1));
      assertFalse(boolean0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-8);
      byteArray0[1] = (byte) (-96);
      byteArray0[2] = (byte) (-8);
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      String string0 = segmentedByteString0.base64Url();
      assertEquals("-A==", string0);
      
      segmentedByteString0.hashCode();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte) (-8);
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      String string0 = segmentedByteString0.base64Url();
      assertEquals("AAA=", string0);
      
      buffer0.indexOfElement((ByteString) segmentedByteString0);
      boolean boolean0 = segmentedByteString0.rangeEquals(1, (ByteString) segmentedByteString0, (-2038), 1);
      assertFalse(boolean0);
      
      segmentedByteString0.hashCode();
      segmentedByteString0.asByteBuffer();
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte) (-8);
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      String string0 = segmentedByteString0.base64Url();
      assertEquals("AAA=", string0);
      
      boolean boolean0 = segmentedByteString0.rangeEquals(1, byteArray0, (int) (byte) (-8), (-2));
      assertFalse(boolean0);
      
      segmentedByteString0.md5();
      assertEquals(2, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-8);
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.hashCode();
      segmentedByteString0.asByteBuffer();
      ByteString byteString0 = new ByteString(byteArray0);
      boolean boolean0 = segmentedByteString0.equals(byteString0);
      assertEquals(1, segmentedByteString0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)0;
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.hashCode();
      ByteBuffer byteBuffer0 = segmentedByteString0.asByteBuffer();
      boolean boolean0 = segmentedByteString0.rangeEquals(1, byteArray0, 1, (int) (byte) (-8));
      assertTrue(boolean0);
      
      segmentedByteString0.equals(byteBuffer0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[6];
      Buffer buffer1 = buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 2);
      ByteString byteString0 = segmentedByteString0.toAsciiLowercase();
      boolean boolean0 = segmentedByteString0.equals(byteString0);
      assertTrue(boolean0);
      assertEquals(2, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)0;
      buffer0.write(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.asByteBuffer();
      SegmentedByteString segmentedByteString1 = new SegmentedByteString(buffer0, 1);
      segmentedByteString1.rangeEquals(76, byteArray0, (int) (byte) (-8), 4381);
      boolean boolean0 = segmentedByteString1.equals(segmentedByteString0);
      assertTrue(boolean0);
      assertEquals(1, segmentedByteString1.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[6];
      buffer0.writeHexadecimalUnsignedLong((-358L));
      Buffer buffer1 = buffer0.write(byteArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      buffer1.indexOfElement((ByteString) segmentedByteString0);
      segmentedByteString0.rangeEquals(0, byteArray0, 0, 2);
      ByteString byteString0 = segmentedByteString0.toAsciiUppercase();
      segmentedByteString0.equals(byteString0);
      Object object0 = new Object();
  }
}