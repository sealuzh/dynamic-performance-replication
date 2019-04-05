/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 12:27:44 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.DeflaterSink;
import okio.GzipSource;
import okio.HashingSink;
import okio.HashingSource;
import okio.InflaterSource;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Source;
import okio.Timeout;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RealBufferedSource_ESTest extends RealBufferedSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Pipe pipe0 = new Pipe(4L);
      Buffer buffer0 = pipe0.buffer;
      buffer0.writeDecimalLong(897L);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.readShort();
      assertEquals(0L, buffer0.size());
      assertTrue(buffer0.exhausted());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(deflaterSink0);
      HashingSource hashingSource0 = HashingSource.md5(realBufferedSink0.buffer);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        realBufferedSource0.read(byteArray0, 120, 120);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=120 byteCount=120
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Pipe pipe0 = new Pipe(10000000000000L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      long long0 = realBufferedSource0.indexOf((byte)1, (long) (byte)1);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      inflaterSource0.close();
      // Undeclared exception!
      try { 
        realBufferedSource0.readUtf8();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readDecimalLong();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(true);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      inflaterSource0.close();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readByteString();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        realBufferedSource0.read(byteArray0, 120, 120);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=4 offset=120 byteCount=120
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      ByteString byteString0 = ByteString.decodeHex("");
      ByteString byteString1 = byteString0.sha512();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      try { 
        realBufferedSource0.indexOf(byteString1, 1505L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      ByteString byteString0 = ByteString.decodeHex("");
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOf(byteString0, 1505L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bytes is empty
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Pipe pipe0 = new Pipe(10000000000000000L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      boolean boolean0 = realBufferedSource0.request(1000000000L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Pipe pipe0 = new Pipe(1000L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.require(1000L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      boolean boolean0 = realBufferedSource0.exhausted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Pipe pipe0 = new Pipe(4L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      long long0 = realBufferedSource0.indexOf((byte)73);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Pipe pipe0 = new Pipe(2415L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      realBufferedSource0.close();
      realBufferedSource0.close();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(false);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = charset0.encode("closed");
      ByteString byteString0 = ByteString.of(byteBuffer0);
      boolean boolean0 = realBufferedSource0.rangeEquals(2147483647L, byteString0, 253, 248);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Pipe pipe0 = new Pipe(1000L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      ByteString byteString0 = hashingSource0.hash();
      boolean boolean0 = realBufferedSource0.rangeEquals(255L, byteString0, (-247), (-247));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOf((byte) (-33), (long) (byte) (-33));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex=-33 toIndex=9223372036854775807
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.skip(269L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Pipe pipe0 = new Pipe(269L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      pipe_PipeSource0.close();
      HashingSource hashingSource0 = HashingSource.sha1(pipe_PipeSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readUtf8LineStrict(269L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.Pipe$PipeSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Pipe pipe0 = new Pipe(9223372036854775807L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readUtf8LineStrict((long) (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // limit < 0: -1
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      HashingSource hashingSource0 = HashingSource.sha1(inflaterSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      Charset charset0 = Charset.forName("UTF-8");
      try { 
        realBufferedSource0.readString(charset0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      buffer0.writeLong((-1465L));
      long long0 = realBufferedSource0.readAll(buffer0);
      assertFalse(buffer0.exhausted());
      assertEquals(8L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Pipe pipe0 = new Pipe(1486L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      long long0 = realBufferedSource0.readAll(realBufferedSink0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Source source0 = pipe0.source();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      realBufferedSource0.close();
      // Undeclared exception!
      try { 
        realBufferedSource0.require(4L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(deflaterSink0);
      HashingSource hashingSource0 = HashingSource.md5(realBufferedSink0.buffer);
      realBufferedSink0.writeLong((-812L));
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      realBufferedSource0.readUtf8(2L);
      byte[] byteArray0 = new byte[4];
      int int0 = realBufferedSource0.read(byteArray0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Pipe pipe0 = new Pipe(9223372036854775807L);
      Buffer buffer0 = pipe0.buffer;
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      buffer0.readAndWriteUnsafe(buffer_UnsafeCursor0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer_UnsafeCursor0.buffer);
      realBufferedSource0.close();
      // Undeclared exception!
      try { 
        realBufferedSource0.read(buffer0, 700L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Pipe pipe0 = new Pipe(9223372036854775807L);
      Buffer buffer0 = pipe0.buffer;
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      buffer0.readAndWriteUnsafe(buffer_UnsafeCursor0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer_UnsafeCursor0.buffer);
      long long0 = realBufferedSource0.read(buffer0, 700L);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RealBufferedSource realBufferedSource0 = null;
      try {
        realBufferedSource0 = new RealBufferedSource((Source) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // source == null
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      Buffer buffer1 = realBufferedSource0.buffer();
      assertTrue(buffer1.exhausted());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Pipe pipe0 = new Pipe(10000000000000000L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      byte[] byteArray0 = realBufferedSource0.readByteArray();
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(false);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      HashingSource hashingSource0 = HashingSource.md5(inflaterSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      try { 
        realBufferedSource0.readShortLe();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource(buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      try { 
        realBufferedSource0.readUtf8LineStrict();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Pipe pipe0 = new Pipe(15L);
      Source source0 = pipe0.source();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readByteString((-1152921504606846976L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -1152921504606846976
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Pipe pipe0 = new Pipe(1486L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      Charset charset0 = Charset.defaultCharset();
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      ByteBuffer byteBuffer0 = charset0.encode(charBuffer0);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      boolean boolean0 = realBufferedSource0.rangeEquals(1486L, byteString0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Pipe pipe0 = new Pipe(4L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readFully(buffer0, 4L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readLongLe();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Pipe pipe0 = new Pipe(8L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      pipe0.sourceClosed = true;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readInt();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.Pipe$PipeSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(deflaterSink0);
      HashingSource hashingSource0 = HashingSource.md5(realBufferedSink0.buffer);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      try { 
        realBufferedSource0.readUtf8(2L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Pipe pipe0 = new Pipe(4L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      Timeout timeout0 = realBufferedSource0.timeout();
      assertNotNull(timeout0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      GzipSource gzipSource0 = new GzipSource(inflaterSource0);
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = ByteString.of(byteArray0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      try { 
        realBufferedSource0.indexOf(byteString0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Pipe pipe0 = new Pipe(1799L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      try { 
        realBufferedSource0.readIntLe();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      byte[] byteArray0 = new byte[4];
      int int0 = realBufferedSource0.read(byteArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readByte();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      String string0 = realBufferedSource0.readUtf8Line();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      String string0 = realBufferedSource0.toString();
      assertEquals("buffer([size=0])", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Pipe pipe0 = new Pipe(4L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readShort();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readByteArray((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -1
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readLong();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.md5(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) realBufferedSink0.buffer, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      InputStream inputStream0 = realBufferedSource0.inputStream();
      assertNotNull(inputStream0);
  }
}
