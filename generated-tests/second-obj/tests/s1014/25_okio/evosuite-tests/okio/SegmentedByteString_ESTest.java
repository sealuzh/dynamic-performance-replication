/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 02:28:36 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectStreamConstants;
import java.io.OutputStream;
import java.nio.charset.Charset;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.HashingSource;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.Segment;
import okio.SegmentedByteString;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
        segmentedByteString0.substring(0, 924);
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
  public void test02()  throws Throwable  {
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
      realBufferedSink0.writeIntLe(690);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      realBufferedSink0.buffer.clear();
      segmentedByteString0.hashCode();
      byte[] byteArray0 = new byte[2];
      segmentedByteString0.endsWith(byteArray0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      int int0 = 0;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.indexOf((byte[]) null);
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
      segmentedByteString0.hashCode();
      segmentedByteString0.hashCode();
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
  public void test08()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-17);
      // Undeclared exception!
      try { 
        segmentedByteString0.lastIndexOf(byteArray0, (int) (byte) (-17));
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
  public void test10()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
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
  public void test11()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8CodePoint(1);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      buffer0.writeInt(1);
      segmentedByteString0.md5();
      segmentedByteString0.hashCode();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      buffer0.readUtf8();
      segmentedByteString0.equals(buffer0);
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer;
      realBufferedSink0.writeIntLe(254);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      realBufferedSink0.buffer.clear();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)58;
      byteArray0[1] = (byte) (-30);
      byteArray0[2] = (byte) (-30);
      segmentedByteString0.rangeEquals((int) (byte)58, byteArray0, (int) (byte) (-30), (int) (byte) (-30));
      // Undeclared exception!
      try { 
        segmentedByteString0.sha512();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.readByteArray();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      segmentedByteString0.write(buffer0);
      segmentedByteString0.equals(buffer0);
      // Undeclared exception!
      try { 
        segmentedByteString0.rangeEquals(0, (ByteString) segmentedByteString0, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Pipe pipe0 = new Pipe(1571L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      Buffer buffer0 = realBufferedSink0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      ByteString byteString0 = ByteString.EMPTY;
      boolean boolean0 = segmentedByteString0.rangeEquals((-1979), byteString0, (-1979), 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer;
      BufferedSink bufferedSink0 = realBufferedSink0.writeIntLe(254);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      segmentedByteString0.hashCode();
      realBufferedSink0.buffer();
      HashingSource.sha1(((RealBufferedSink) bufferedSink0).buffer);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      segmentedByteString0.equals(bufferedSink0);
      segmentedByteString0.rangeEquals(1, (ByteString) segmentedByteString0, 254, 1);
      // Undeclared exception!
      try { 
        segmentedByteString0.getByte(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=1 offset=1 byteCount=1
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeIntLe(258);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      segmentedByteString0.write(buffer0);
      HashingSource.sha1(((RealBufferedSink) bufferedSink0).buffer);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      realBufferedSink0.toString();
      segmentedByteString0.rangeEquals(1, (ByteString) segmentedByteString0, 258, (-1825));
      // Undeclared exception!
      try { 
        segmentedByteString0.getByte(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=1 offset=1 byteCount=1
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer;
      realBufferedSink0.writeIntLe(275);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      segmentedByteString0.write(buffer1);
      assertFalse(buffer1.exhausted());
      
      HashingSource.sha1(buffer0);
      ByteString byteString0 = segmentedByteString0.toAsciiLowercase();
      boolean boolean0 = segmentedByteString0.equals(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer;
      realBufferedSink0.writeIntLe(275);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      realBufferedSink0.buffer.clear();
      byte[] byteArray0 = new byte[1];
      segmentedByteString0.endsWith(byteArray0);
      segmentedByteString0.write(buffer0);
      HashingSource.sha1(buffer0);
      assertFalse(buffer0.exhausted());
      assertEquals(1L, buffer0.completeSegmentByteCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer;
      realBufferedSink0.writeIntLe(254);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      realBufferedSink0.buffer.clear();
      byte[] byteArray0 = new byte[6];
      realBufferedSink0.write((ByteString) segmentedByteString0);
      byteArray0[1] = (byte) (-30);
      byteArray0[2] = (byte) (-30);
      segmentedByteString0.rangeEquals(0, byteArray0, 254, (int) (byte)0);
      segmentedByteString0.rangeEquals((int) (byte)0, byteArray0, (int) (byte) (-30), (int) (byte) (-30));
      // Undeclared exception!
      try { 
        segmentedByteString0.sha512();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = new Buffer();
      realBufferedSink0.writeIntLe(254);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      segmentedByteString0.hashCode();
      realBufferedSink0.buffer();
      segmentedByteString0.write(buffer0);
      ByteString byteString0 = ByteString.encodeUtf8("not attached to a buffer");
      segmentedByteString0.equals(byteString0);
      assertEquals(1L, buffer0.size());
      assertFalse(buffer0.equals((Object)buffer1));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeIntLe(254);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      Charset charset0 = Charset.defaultCharset();
      String string0 = segmentedByteString0.string(charset0);
      assertEquals("\uFFFD", string0);
      
      segmentedByteString0.hashCode();
      OutputStream outputStream0 = bufferedSink0.outputStream();
      segmentedByteString0.write(outputStream0);
      segmentedByteString0.write(realBufferedSink0.buffer);
      HashingSource hashingSource0 = HashingSource.sha1(((RealBufferedSink) bufferedSink0).buffer);
      hashingSource0.hash();
      segmentedByteString0.internalArray();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeIntLe(254);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      realBufferedSink0.buffer.clear();
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = segmentedByteString0.md5();
      realBufferedSink0.write(byteString0);
      byteArray0[1] = (byte) (-30);
      byteArray0[2] = (byte) (-30);
      boolean boolean0 = segmentedByteString0.rangeEquals((int) (byte)0, byteArray0, (int) (byte) (-30), (int) (byte) (-30));
      assertFalse(boolean0);
      
      segmentedByteString0.hashCode();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8CodePoint(1);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      segmentedByteString0.md5();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-43);
      byteArray0[1] = (byte)2;
      byteArray0[2] = (byte)16;
      byteArray0[3] = (byte)115;
      boolean boolean0 = segmentedByteString0.rangeEquals(8, byteArray0, 2, (int) (byte) (-43));
      assertEquals(1, segmentedByteString0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      BufferedSink bufferedSink0 = realBufferedSink0.writeIntLe(254);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      realBufferedSink0.buffer.clear();
      segmentedByteString0.hashCode();
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)0;
      bufferedSink0.write(byteArray0);
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      HashingSource hashingSource0 = HashingSource.sha1(((RealBufferedSink) bufferedSink0).buffer);
      FileSystemHandling fileSystemHandling2 = new FileSystemHandling();
      realBufferedSink0.toString();
      segmentedByteString0.equals(hashingSource0);
      segmentedByteString0.getByte((byte)0);
      SegmentedByteString segmentedByteString1 = null;
      try {
        segmentedByteString1 = new SegmentedByteString(realBufferedSink0.buffer, 31);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=2 offset=0 byteCount=31
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      int int0 = 256;
      BufferedSink bufferedSink0 = realBufferedSink0.writeIntLe(256);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      segmentedByteString0.hashCode();
      byte[] byteArray0 = new byte[1];
      segmentedByteString0.endsWith(byteArray0);
      segmentedByteString0.write(realBufferedSink0.buffer);
      HashingSource.sha1(realBufferedSink0.buffer);
      HashingSource.md5(realBufferedSink0.buffer);
      RealBufferedSink realBufferedSink1 = new RealBufferedSink(buffer0);
      Buffer buffer1 = bufferedSink0.buffer();
      // Undeclared exception!
      try { 
        buffer1.read(byteArray0, 1, 1038);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=1 offset=1 byteCount=1038
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer;
      realBufferedSink0.writeIntLe(275);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
      realBufferedSink0.buffer.clear();
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.shouldAllThrowIOExceptions();
      HashingSource.sha1(buffer0);
      HashingSource hashingSource0 = HashingSource.md5(realBufferedSink0.buffer);
      ByteString byteString0 = ByteString.of(byteArray0);
      segmentedByteString0.equals(byteString0);
      Object object0 = new Object();
      HashingSource hashingSource1 = HashingSource.md5(buffer0);
      assertFalse(hashingSource1.equals((Object)hashingSource0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer;
      realBufferedSink0.writeIntLe(275);
      Segment segment0 = new Segment();
      buffer1.head = segment0;
      SegmentedByteString segmentedByteString0 = null;
      try {
        segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 1);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // s.limit == s.pos
         //
      }
  }
}
