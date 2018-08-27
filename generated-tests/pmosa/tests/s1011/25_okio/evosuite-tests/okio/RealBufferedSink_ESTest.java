/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 21:36:08 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.zip.Deflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.DeflaterSink;
import okio.HashingSink;
import okio.HashingSource;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RealBufferedSink_ESTest extends RealBufferedSink_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeLongLe(811L);
      Timeout timeout0 = realBufferedSink0.timeout();
      assertNotNull(timeout0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      long long0 = 1L;
      realBufferedSink0.writeLongLe(1L);
      realBufferedSink0.outputStream();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-12);
      byte byte0 = (byte)101;
      byteArray0[1] = (byte)101;
      byteArray0[2] = (byte) (-62);
      byteArray0[3] = (byte)100;
      buffer0.indexOf((byte)0, (long) (byte)100);
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)1;
      byte byte1 = (byte)0;
      // Undeclared exception!
      try { 
        Charset.forName("");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Pipe pipe0 = new Pipe(1802L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.writeDecimalLong(1802L);
      pipe0.sourceClosed = false;
      realBufferedSink0.writeUtf8CodePoint((-408));
      realBufferedSink0.flush();
      Buffer buffer0 = realBufferedSink0.buffer();
      pipe0.sourceClosed = true;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      Buffer buffer1 = realBufferedSource0.buffer();
      buffer1.writeUtf8CodePoint(48);
      // Undeclared exception!
      try { 
        buffer0.write(buffer1, 903L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=1 offset=0 byteCount=903
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeUtf8CodePoint(1228);
      realBufferedSink0.close();
      assertEquals(2L, buffer0.size());
      assertFalse(buffer0.exhausted());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Pipe pipe0 = new Pipe(8192L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      realBufferedSink0.writeShort((-1));
      realBufferedSink0.writeUtf8("");
      pipe_PipeSink0.close();
      realBufferedSink0.timeout();
      String string0 = "m?HK?";
      int int0 = 0;
      realBufferedSink0.writeUtf8("m?HK?", 0, 0);
      Source source0 = null;
      int int1 = 891;
      int int2 = 56320;
      // Undeclared exception!
      try { 
        Charset.forName("m?HK?");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // m?HK?
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8("]", (-1262), (-678));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        realBufferedSink0.write(byteArray0, 1024, 1024);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=1024 byteCount=1024
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      BufferedSink bufferedSink0 = buffer0.emit();
      HashingSink hashingSink0 = HashingSink.sha256(bufferedSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      BufferedSink bufferedSink1 = realBufferedSink0.writeHexadecimalUnsignedLong(100000000000000000L);
      realBufferedSink0.writeShort(1);
      BufferedSink bufferedSink2 = realBufferedSink0.write((Source) buffer0, 0L);
      assertSame(bufferedSink2, bufferedSink1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeHexadecimalUnsignedLong(1763L);
      realBufferedSink0.close();
      assertEquals(3L, buffer0.size());
      assertFalse(buffer0.exhausted());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.write((Source) buffer0, (long) 0);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString("", 1968526677, 1968526677, (Charset) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      int int0 = (-1208);
      realBufferedSink0.writeIntLe((-1208));
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString("HmacSHA256", (-735), (-4631), (Charset) null);
        fail("Expecting exception: IllegalAccessError");
      
      } catch(IllegalAccessError e) {
         //
         // beginIndex < 0: -735
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeIntLe(1789569706);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Charset charset0 = Charset.defaultCharset();
      BufferedSink bufferedSink0 = realBufferedSink0.writeString("", charset0);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)51;
      BufferedSink bufferedSink0 = realBufferedSink0.write(byteArray0);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.write(buffer0, 1L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      Buffer buffer1 = realBufferedSource0.buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer1);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      // Undeclared exception!
      try { 
        realBufferedSink0.write(buffer0, (-53L));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=0 byteCount=-53
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      long long0 = 1L;
      Pipe pipe0 = new Pipe(1L);
      Sink sink0 = pipe0.sink();
      pipe0.sinkClosed = true;
      pipe0.sinkClosed = false;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.outputStream();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      ByteString byteString0 = realBufferedSource0.readByteString();
      Charset charset0 = Charset.defaultCharset();
      byteString0.string(charset0);
      realBufferedSink0.write(byteString0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeHexadecimalUnsignedLong((-1152921504606846976L));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.write((ByteString) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeInt(55);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      BufferedSink bufferedSink0 = buffer0.emit();
      HashingSink hashingSink0 = HashingSink.sha256(bufferedSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      RealBufferedSink realBufferedSink1 = new RealBufferedSink(bufferedSink0);
      realBufferedSink1.writeHexadecimalUnsignedLong(1L);
      realBufferedSink0.writeShort(1);
      RealBufferedSink realBufferedSink2 = new RealBufferedSink(hashingSink0);
      try { 
        realBufferedSink2.write((Source) realBufferedSink1.buffer, 100000000000000000L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      try { 
        realBufferedSink0.write((Source) buffer0, 811L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      RealBufferedSink realBufferedSink1 = (RealBufferedSink)realBufferedSink0.writeUtf8("\"|A4cF%E`");
      String string0 = realBufferedSink1.toString();
      assertEquals("buffer([size=0])", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.writeDecimalLong(100000L);
      int int0 = (-408);
      realBufferedSink0.writeUtf8CodePoint((-2285));
      BufferedSink bufferedSink0 = realBufferedSink0.buffer.emit();
      RealBufferedSink realBufferedSink1 = new RealBufferedSink(bufferedSink0);
      realBufferedSink1.flush();
      realBufferedSink0.buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      Buffer buffer0 = realBufferedSource0.buffer();
      int int1 = (-94);
      buffer0.writeUtf8CodePoint((-94));
      // Undeclared exception!
      try { 
        buffer0.write(realBufferedSink1.buffer, (long) 48);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=0 byteCount=48
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Pipe pipe0 = new Pipe(1802L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeDecimalLong(1802L);
      pipe0.sourceClosed = false;
      RealBufferedSink realBufferedSink1 = new RealBufferedSink(realBufferedSink0);
      realBufferedSink1.writeAll(((RealBufferedSink) bufferedSink0).buffer);
      realBufferedSink0.flush();
      Buffer buffer0 = realBufferedSink0.buffer();
      buffer0.readAndWriteUnsafe();
      pipe0.sourceClosed = true;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      Buffer buffer1 = realBufferedSource0.buffer();
      buffer1.writeUtf8CodePoint(48);
      bufferedSink0.writeShort(48);
      // Undeclared exception!
      try { 
        buffer0.write(buffer1, 903L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=1 offset=0 byteCount=903
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Sink sink0 = pipe0.sink();
      pipe0.sinkClosed = true;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShortLe(0);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      BufferedSink bufferedSink0 = buffer0.emit();
      HashingSink hashingSink0 = HashingSink.sha256(bufferedSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      BufferedSink bufferedSink1 = realBufferedSink0.writeShortLe((-363));
      assertSame(realBufferedSink0, bufferedSink1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.emit();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Pipe pipe0 = new Pipe(1802L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      RealBufferedSink realBufferedSink1 = new RealBufferedSink(realBufferedSink0);
      realBufferedSink1.outputStream();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      ByteString byteString0 = realBufferedSource0.readByteString();
      Charset charset0 = Charset.defaultCharset();
      byteString0.string(charset0);
      realBufferedSink0.emit();
      realBufferedSink1.outputStream();
      RealBufferedSink realBufferedSink2 = new RealBufferedSink(sink0);
      BufferedSink bufferedSink0 = realBufferedSink2.writeDecimalLong(0L);
      assertSame(bufferedSink0, realBufferedSink2);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeByte((-2760));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      HashingSink hashingSink0 = HashingSink.sha1(deflaterSink0);
      Sink sink0 = hashingSink0.delegate();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      ByteString byteString0 = hashingSink0.hash();
      HashingSink.hmacSha256(realBufferedSink0, byteString0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeByte((-1409));
      realBufferedSink0.writeByte((-1409));
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      realBufferedSink0.writeLong((-1409));
      realBufferedSink0.writeShort((-798));
      BufferedSink bufferedSink1 = realBufferedSink0.emitCompleteSegments();
      assertSame(bufferedSink1, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.timeout();
      BufferedSink bufferedSink0 = realBufferedSink0.writeLong(1568L);
      assertSame(realBufferedSink0, bufferedSink0);
  }
}
