/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 03:19:59 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RealBufferedSink_ESTest extends RealBufferedSink_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Pipe pipe0 = new Pipe(16L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      Timeout timeout0 = realBufferedSink0.timeout();
      assertFalse(timeout0.hasDeadline());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.emitCompleteSegments();
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Pipe pipe0 = new Pipe(1637L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeHexadecimalUnsignedLong(33L);
      Buffer buffer1 = realBufferedSink0.buffer();
      assertEquals(2L, buffer1.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeLongLe(0L);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeIntLe((-1073741823));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeInt((-623));
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeByte((-3621));
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Pipe pipe0 = new Pipe(2451L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.writeLong((-1L));
      HashingSource hashingSource0 = HashingSource.md5(realBufferedSink0.buffer);
      // Undeclared exception!
      try { 
        realBufferedSink0.write((Source) hashingSource0, 65280L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // source == this
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Pipe pipe0 = new Pipe(96L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      realBufferedSink0.writeLongLe(96L);
      pipe_PipeSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.close();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.Pipe$PipeSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater(0, true);
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      DeflaterSink deflaterSink1 = new DeflaterSink(deflaterSink0, deflater0);
      HashingSink hashingSink0 = HashingSink.md5(deflaterSink1);
      // Undeclared exception!
      try { 
        hashingSink0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Deflater has been closed
         //
         verifyException("java.util.zip.Deflater", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Pipe pipe0 = new Pipe(1637L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeHexadecimalUnsignedLong(33L);
      realBufferedSink0.close();
      assertFalse(buffer0.exhausted());
      assertEquals(2L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Pipe pipe0 = new Pipe(16L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      realBufferedSink0.close();
      realBufferedSink0.close();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Pipe pipe0 = new Pipe(16L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.flush();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Pipe pipe0 = new Pipe(1000000L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.flush();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeLongLe((-1764L));
      realBufferedSink0.emit();
      assertFalse(buffer0.exhausted());
      assertEquals(8L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
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
  public void test16()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.emit();
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.emitCompleteSegments();
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
        realBufferedSink0.writeHexadecimalUnsignedLong((-666L));
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
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeDecimalLong(254L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      Buffer.UnsafeCursor buffer_UnsafeCursor1 = buffer0.readUnsafe(buffer_UnsafeCursor0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer_UnsafeCursor1.buffer);
      BufferedSink bufferedSink0 = realBufferedSink0.writeDecimalLong((-1));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Pipe pipe0 = new Pipe(8192L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      realBufferedSink0.closed = true;
      // Undeclared exception!
      try { 
        realBufferedSink0.writeLongLe(8192L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeLong(4L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Pipe pipe0 = new Pipe(3L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeIntLe(2132360523);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeInt(685);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Pipe pipe0 = new Pipe(8192L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      realBufferedSink0.closed = true;
      // Undeclared exception!
      try { 
        realBufferedSink0.writeShortLe(3044);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShortLe((-3621));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Pipe pipe0 = new Pipe(550L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      HashingSource hashingSource0 = HashingSource.sha256(pipe_PipeSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeShort((-2634));
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
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShort(2021161080);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeByte(1);
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
      Buffer buffer0 = new Buffer();
      buffer0.writeLong(12L);
      HashingSink hashingSink0 = HashingSink.sha1(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      try { 
        realBufferedSink0.write((Source) buffer0, 1637L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      buffer0.readUnsafe(buffer_UnsafeCursor0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer_UnsafeCursor0.buffer);
      BufferedSink bufferedSink0 = realBufferedSink0.write((Source) buffer0, (-1L));
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      Buffer.UnsafeCursor buffer_UnsafeCursor1 = buffer0.readUnsafe(buffer_UnsafeCursor0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer_UnsafeCursor0.buffer);
      realBufferedSink0.writeUtf8CodePoint(0);
      realBufferedSink0.flush();
      long long0 = realBufferedSink0.writeAll(buffer_UnsafeCursor1.buffer);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Pipe pipe0 = new Pipe(31L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      byte[] byteArray0 = new byte[7];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      HashingSink hashingSink0 = HashingSink.hmacSha1(pipe_PipeSink0, byteString0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeAll((Source) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // source == null
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      Buffer.UnsafeCursor buffer_UnsafeCursor1 = buffer0.readUnsafe(buffer_UnsafeCursor0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer_UnsafeCursor0.buffer);
      long long0 = realBufferedSink0.writeAll(buffer_UnsafeCursor1.buffer);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      HashingSink hashingSink0 = HashingSink.sha1(deflaterSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.close();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        realBufferedSink0.write(byteArray0, 24, 24);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Pipe pipe0 = new Pipe(1095216660480L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      byte[] byteArray0 = new byte[6];
      BufferedSink bufferedSink0 = realBufferedSink0.write(byteArray0, (int) (byte)0, (int) (byte)0);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Pipe pipe0 = new Pipe(948L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      byte[] byteArray0 = new byte[1];
      realBufferedSink0.closed = true;
      // Undeclared exception!
      try { 
        realBufferedSink0.write(byteArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      byte[] byteArray0 = new byte[1];
      BufferedSink bufferedSink0 = realBufferedSink0.write(byteArray0);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Pipe pipe0 = new Pipe(1637L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString("buffer([size=0])", 0, 192, charset0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString("", (-3418), 0, charset0);
        fail("Expecting exception: IllegalAccessError");
      
      } catch(IllegalAccessError e) {
         //
         // beginIndex < 0: -3418
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString("", charset0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Charset charset0 = Charset.defaultCharset();
      BufferedSink bufferedSink0 = realBufferedSink0.writeString("", charset0);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8CodePoint(121);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8CodePoint(2021161080);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected code point: 78787878
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Pipe pipe0 = new Pipe(100000000000000L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8("_", 4867, 4867);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8("", (-1), 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0: -1
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater(0, false);
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = ByteString.of(byteArray0);
      HashingSink hashingSink0 = HashingSink.hmacSha512(deflaterSink0, byteString0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeUtf8("buffer([size=0])");
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Pipe pipe0 = new Pipe(16L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      ByteString byteString0 = ByteString.EMPTY;
      BufferedSink bufferedSink0 = realBufferedSink0.write(byteString0);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = buffer0.readAndWriteUnsafe();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer_UnsafeCursor0.buffer);
      realBufferedSink0.closed = true;
      // Undeclared exception!
      try { 
        realBufferedSink0.write(buffer0, (long) (-1));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Pipe pipe0 = new Pipe(87L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      // Undeclared exception!
      try { 
        realBufferedSink0.write(realBufferedSource0.buffer, 1637L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=0 byteCount=1637
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      RealBufferedSink realBufferedSink0 = null;
      try {
        realBufferedSink0 = new RealBufferedSink((Sink) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // sink == null
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Pipe pipe0 = new Pipe(1637L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer();
      assertTrue(buffer1.equals((Object)buffer0));
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      String string0 = realBufferedSink0.toString();
      assertEquals("buffer([size=0])", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      OutputStream outputStream0 = realBufferedSink0.outputStream();
      assertNotNull(outputStream0);
  }
}
