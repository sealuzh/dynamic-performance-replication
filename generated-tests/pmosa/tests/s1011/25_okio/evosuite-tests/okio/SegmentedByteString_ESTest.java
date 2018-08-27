/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 20:48:52 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectStreamConstants;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.charset.Charset;
import java.util.zip.Deflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.DeflaterSink;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
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
      Pipe pipe0 = new Pipe(4294967295L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      Buffer buffer0 = realBufferedSource0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSource0.buffer, 0);
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
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater(0, true);
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      deflaterSink0.write(buffer0, 0);
      Deflater deflater1 = new Deflater();
      DeflaterSink deflaterSink1 = new DeflaterSink(deflaterSink0, deflater1);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(deflaterSink1);
      Buffer buffer1 = realBufferedSink0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 0);
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
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring(2727, 2727);
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
      buffer0.segmentSizes();
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
  public void test04()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      buffer0.segmentSizes();
      segmentedByteString0.write(buffer0);
      Charset.defaultCharset();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      int int0 = 809;
      // Undeclared exception!
      try { 
        segmentedByteString0.substring(809);
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
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-94);
      byteArray0[1] = (byte) (-7);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)114;
      // Undeclared exception!
      try { 
        segmentedByteString0.lastIndexOf(byteArray0, (int) (byte)114);
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
      int int0 = 0;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      int int1 = 809;
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
  public void test07()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      int int0 = 0;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
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
  public void test08()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      Buffer buffer0 = realBufferedSink0.buffer;
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = buffer0.readAndWriteUnsafe();
      Buffer buffer1 = buffer_UnsafeCursor0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 0);
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
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeByte(4);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      buffer0.write((ByteString) segmentedByteString0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-113);
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
  public void test11()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      pipe0.sinkClosed = true;
      Buffer buffer1 = buffer0.writeInt(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      SegmentedByteString segmentedByteString1 = new SegmentedByteString(buffer1, 1);
      segmentedByteString0.hashCode();
      segmentedByteString1.asByteBuffer();
      assertEquals(1, segmentedByteString1.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      pipe0.sinkClosed = true;
      buffer0.writeInt(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.substring(1);
      segmentedByteString0.md5();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-1);
      segmentedByteString0.rangeEquals(1, byteArray0, (int) (byte) (-1), (int) (byte) (-1));
      segmentedByteString0.toString();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      segmentedByteString0.write(byteArrayOutputStream0);
      assertEquals(1, segmentedByteString0.size());
      assertEquals("\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      buffer0.write((ByteString) segmentedByteString0);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-54);
      byteArray0[1] = (byte)97;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)37;
      byteArray0[4] = (byte) (-61);
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte)66;
      byteArray0[7] = (byte)37;
      byteArray0[8] = (byte) (-23);
      boolean boolean0 = segmentedByteString0.rangeEquals((-645), byteArray0, (int) (byte)66, (-2079));
      assertEquals(0L, buffer0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeInt(2);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      segmentedByteString0.equals(buffer1);
      segmentedByteString0.write(buffer1);
      assertEquals(6L, buffer1.size());
      assertEquals(6L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      Buffer buffer1 = buffer0.writeInt(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      pipe0.sinkClosed = false;
      realBufferedSource0.buffer();
      buffer0.write((ByteString) segmentedByteString0);
      segmentedByteString0.sha1();
      byte[] byteArray0 = new byte[0];
      int int0 = segmentedByteString0.indexOf(byteArray0, 18);
      assertEquals(5L, buffer1.completeSegmentByteCount());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      pipe0.sinkClosed = true;
      buffer0.writeInt(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.substring(1);
      ByteString byteString0 = segmentedByteString0.md5();
      boolean boolean0 = segmentedByteString0.equals(byteString0);
      assertEquals(1, segmentedByteString0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeInt(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      String string0 = segmentedByteString0.toString();
      assertEquals("[hex=00]", string0);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)22;
      boolean boolean0 = segmentedByteString0.rangeEquals(1723, byteArray0, 293, (-2211));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.segmentSizes();
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
  public void test19()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeInt(2);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      boolean boolean0 = segmentedByteString0.rangeEquals((-1), (ByteString) null, 8, (-1));
      assertEquals(2, segmentedByteString0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeInt(2);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 2);
      boolean boolean0 = segmentedByteString0.rangeEquals(2, (ByteString) null, 8, 2);
      boolean boolean1 = segmentedByteString0.equals(buffer1);
      assertTrue(boolean1 == boolean0);
      assertEquals(2, segmentedByteString0.size());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      pipe0.sourceClosed = true;
      buffer0.inputStream();
      pipe0.sinkClosed = true;
      buffer0.writeInt(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      ByteString byteString0 = segmentedByteString0.substring(1);
      ByteString byteString1 = segmentedByteString0.md5();
      pipe0.sinkClosed = true;
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-1);
      segmentedByteString0.rangeEquals(924, byteArray0, (-1371), 1);
      segmentedByteString0.startsWith(byteString0);
      segmentedByteString0.hashCode();
      ByteString byteString2 = segmentedByteString0.toAsciiUppercase();
      assertNotSame(byteString2, byteString1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      pipe0.sourceClosed = true;
      buffer0.inputStream();
      pipe0.sinkClosed = true;
      buffer0.writeInt(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      ByteString byteString0 = segmentedByteString0.sha256();
      ByteString byteString1 = segmentedByteString0.md5();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)70;
      byteArray0[1] = (byte)31;
      byteArray0[2] = (byte)107;
      segmentedByteString0.rangeEquals((int) (byte)1, byteArray0, (int) (byte)31, (-1722));
      segmentedByteString0.md5();
      segmentedByteString0.equals(byteString0);
      segmentedByteString0.hmacSha1(byteString1);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        segmentedByteString0.write(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.inputStream();
      pipe0.sinkClosed = true;
      Buffer buffer1 = buffer0.writeInt((-22));
      buffer0.writeInt((-22));
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      ByteString byteString0 = segmentedByteString0.substring(1);
      segmentedByteString0.toAsciiLowercase();
      boolean boolean0 = segmentedByteString0.rangeEquals((-2356), byteString0, (-22), (-5958));
      segmentedByteString0.md5();
      boolean boolean1 = segmentedByteString0.equals(byteString0);
      assertTrue(boolean1 == boolean0);
      assertEquals(1, segmentedByteString0.size());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeInt(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      SegmentedByteString segmentedByteString1 = new SegmentedByteString(buffer0, 1);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      segmentedByteString1.equals(pipedInputStream0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)31;
      segmentedByteString1.startsWith(byteArray0);
      // Undeclared exception!
      try { 
        segmentedByteString1.getByte(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=1 offset=1 byteCount=1
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      pipe0.sourceClosed = true;
      buffer0.inputStream();
      buffer0.writeInt(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.md5();
      Object object0 = new Object();
      segmentedByteString0.equals(object0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      pipe0.sinkClosed = true;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-1);
      segmentedByteString0.rangeEquals(1, byteArray0, (-1371), (int) (byte) (-1));
      boolean boolean0 = segmentedByteString0.startsWith((ByteString) segmentedByteString0);
      assertTrue(boolean0);
      
      segmentedByteString0.equals(buffer0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Pipe pipe0 = new Pipe(2221L);
      Buffer buffer0 = pipe0.buffer;
      Buffer buffer1 = buffer0.writeInt(1487);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      ByteString byteString0 = segmentedByteString0.toAsciiUppercase();
      boolean boolean0 = segmentedByteString0.equals(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Pipe pipe0 = new Pipe(2221L);
      Buffer buffer0 = pipe0.buffer;
      Buffer buffer1 = buffer0.writeInt(1438);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      buffer1.readShort();
      SegmentedByteString segmentedByteString1 = new SegmentedByteString(buffer1, 1);
      int int0 = segmentedByteString1.compareTo((ByteString) segmentedByteString0);
      assertEquals(1, int0);
      
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      boolean boolean0 = segmentedByteString0.equals(segmentedByteString1);
      assertFalse(boolean0);
      assertFalse(segmentedByteString1.equals((Object)segmentedByteString0));
      assertEquals(1, segmentedByteString1.size());
  }
}