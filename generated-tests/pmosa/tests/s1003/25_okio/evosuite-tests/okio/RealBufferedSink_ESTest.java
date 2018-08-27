/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 22:11:42 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.DeflaterSink;
import okio.HashingSink;
import okio.HashingSource;
import okio.InflaterSource;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RealBufferedSink_ESTest extends RealBufferedSink_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.timeout();
      HashingSource hashingSource0 = HashingSource.sha1(realBufferedSink0.buffer);
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource(hashingSource0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      long long0 = 1438L;
      try { 
        realBufferedSource0.readByteString(1438L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Pipe pipe0 = new Pipe(1000000000000L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShortLe(2441);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater(1);
      DeflaterSink deflaterSink0 = new DeflaterSink(buffer0, deflater0);
      HashingSink hashingSink0 = HashingSink.sha1(deflaterSink0);
      Sink sink0 = hashingSink0.delegate();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.writeInt(0);
      realBufferedSink0.writeHexadecimalUnsignedLong(1705L);
      deflaterSink0.flush();
      realBufferedSink0.writeHexadecimalUnsignedLong(0);
      deflaterSink0.close();
      realBufferedSink0.toString();
      realBufferedSink0.outputStream();
      realBufferedSink0.writeDecimalLong(1705L);
      realBufferedSink0.writeHexadecimalUnsignedLong(1705L);
      realBufferedSink0.writeByte((-1903));
      realBufferedSink0.writeUtf8("");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)89;
      byteArray0[2] = (byte) (-60);
      byteArray0[3] = (byte)0;
      ByteString byteString0 = new ByteString(byteArray0);
      realBufferedSink0.write(byteString0);
      assertEquals(13L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeByte(2126634292);
      String string0 = realBufferedSink0.toString();
      assertEquals("buffer([size=0])", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.outputStream();
      BufferedSink bufferedSink0 = realBufferedSink0.writeUtf8("Qxau");
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeDecimalLong(82L);
      // Undeclared exception!
      try { 
        realBufferedSink0.write(buffer0, 82L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=0 byteCount=82
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeUtf8CodePoint(1694);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Pipe pipe0 = new Pipe(4294967295L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.segmentSizes();
      pipe0.sinkClosed = false;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeUtf8("closed");
      buffer0.readAll(realBufferedSink0);
      realBufferedSink0.flush();
      buffer0.readShortLe();
      realBufferedSink0.writeUtf8CodePoint(0);
      realBufferedSink0.writeByte(0);
      realBufferedSink0.writeAll(buffer0);
      realBufferedSink0.writeAll(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = realBufferedSource0.readByteString(0L);
      buffer0.indexOfElement(byteString0);
      realBufferedSink0.writeUtf8("closed");
      realBufferedSink0.writeInt((short)27747);
      realBufferedSink0.emitCompleteSegments();
      BufferedSink bufferedSink0 = realBufferedSink0.writeShort((-3138));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShort(1908874353);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Pipe pipe0 = new Pipe(3L);
      Buffer buffer0 = pipe0.buffer;
      pipe0.sourceClosed = false;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeIntLe((-183));
      realBufferedSink0.writeUtf8CodePoint(0);
      BufferedSink bufferedSink1 = realBufferedSink0.writeLong(0);
      assertSame(bufferedSink1, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeIntLe((-1));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Pipe pipe0 = new Pipe(8L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)79;
      BufferedSink bufferedSink0 = realBufferedSink0.write(byteArray0);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.write((Source) buffer0, (-1L));
      int int0 = 0;
      int int1 = 617;
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8((String) null, 617, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // string == null
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.flush();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8("229*c|48HPJ[':!", 3050, 1676);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex: 1676 < 3050
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.outputStream();
      String string0 = "";
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString("", (Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.flush();
      realBufferedSink0.writeAll(buffer0);
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString("[size=", 2146702744, 2146702744, charset0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > string.length: 2146702744 > 6
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      ByteString byteString0 = new ByteString(byteArray0);
      BufferedSink bufferedSink0 = realBufferedSink0.emit();
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater(1);
      DeflaterSink deflaterSink0 = new DeflaterSink(buffer0, deflater0);
      HashingSink hashingSink0 = HashingSink.sha1(deflaterSink0);
      Sink sink0 = hashingSink0.delegate();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)102;
      byteArray0[1] = (byte)9;
      ByteString byteString0 = new ByteString(byteArray0);
      realBufferedSink0.writeLong((byte)102);
      RealBufferedSink realBufferedSink1 = new RealBufferedSink(deflaterSink0);
      realBufferedSink1.write(byteString0);
      try { 
        realBufferedSink0.write((Source) realBufferedSink1.buffer, (long) (byte)102);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      BufferedSink bufferedSink0 = buffer0.emit();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(bufferedSink0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)93;
      // Undeclared exception!
      try { 
        realBufferedSink0.write(byteArray0, (int) (byte)93, (int) (byte)93);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=1 offset=93 byteCount=93
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      Buffer buffer1 = realBufferedSource0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer1);
      // Undeclared exception!
      try { 
        realBufferedSink0.write((byte[]) null, 0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // source == null
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater(1);
      DeflaterSink deflaterSink0 = new DeflaterSink(buffer0, deflater0);
      HashingSink hashingSink0 = HashingSink.sha1(deflaterSink0);
      Sink sink0 = hashingSink0.delegate();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeInt(0);
      bufferedSink0.writeLongLe(304L);
      buffer0.indexOf((byte)69);
      realBufferedSink0.writeHexadecimalUnsignedLong(1705L);
      deflaterSink0.flush();
      realBufferedSink0.writeHexadecimalUnsignedLong(0);
      deflaterSink0.close();
      realBufferedSink0.outputStream();
      BufferedSink bufferedSink1 = realBufferedSink0.writeDecimalLong(1705L);
      realBufferedSink0.writeHexadecimalUnsignedLong(1705L);
      RealBufferedSink realBufferedSink1 = new RealBufferedSink(bufferedSink1);
      // Undeclared exception!
      try { 
        realBufferedSink1.flush();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Deflater has been closed
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      int int0 = 1;
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink(buffer0, deflater0);
      HashingSink hashingSink0 = HashingSink.sha1(deflaterSink0);
      Sink sink0 = hashingSink0.delegate();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      RealBufferedSink realBufferedSink1 = new RealBufferedSink(realBufferedSink0);
      RealBufferedSink realBufferedSink2 = new RealBufferedSink(sink0);
      deflaterSink0.flush();
      DeflaterSink deflaterSink1 = new DeflaterSink((BufferedSink) realBufferedSink2, deflater0);
      // Undeclared exception!
      try { 
        deflaterSink1.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Deflater has been closed
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }
}