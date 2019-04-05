/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 07:19:25 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.DeflaterSink;
import okio.GzipSink;
import okio.GzipSource;
import okio.HashingSink;
import okio.HashingSource;
import okio.InflaterSource;
import okio.Options;
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
      Pipe pipe0 = new Pipe(1000000000000000L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      HashingSource hashingSource0 = HashingSource.md5(pipe_PipeSource0);
      pipe0.sinkClosed = true;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      long long0 = realBufferedSource0.indexOf((byte) (-117));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(false);
      InflaterSource inflaterSource0 = new InflaterSource(buffer0, inflater0);
      GzipSource gzipSource0 = new GzipSource(inflaterSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      try { 
        realBufferedSource0.require(1L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readHexadecimalUnsignedLong();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Pipe pipe0 = new Pipe(363L);
      Buffer buffer0 = pipe0.buffer;
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
  public void test04()  throws Throwable  {
      Pipe pipe0 = new Pipe(4L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSource0.read((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Pipe pipe0 = new Pipe(100000000000000L);
      pipe0.sourceClosed = true;
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        realBufferedSource0.read(byteArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.Pipe$PipeSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(true);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      HashingSource hashingSource0 = HashingSource.sha256(inflaterSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      try { 
        realBufferedSource0.exhausted();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Pipe pipe0 = new Pipe(65536L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = ByteString.of(byteArray0);
      long long0 = realBufferedSource0.indexOfElement(byteString0, 10L);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(false);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      HashingSource hashingSource0 = HashingSource.sha1(inflaterSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      // Undeclared exception!
      try { 
        realBufferedSource0.request((-2487L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -2487
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readUtf8(1549L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Pipe pipe0 = new Pipe(8L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = ByteString.of(byteArray0);
      boolean boolean0 = realBufferedSource0.rangeEquals(8L, byteString0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = ByteString.encodeUtf8("");
      boolean boolean0 = realBufferedSource0.rangeEquals(438L, byteString0, 2330, 2330);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Pipe pipe0 = new Pipe(85L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.close();
      ByteString byteString0 = ByteString.EMPTY;
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOfElement(byteString0, (-30L));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Pipe pipe0 = new Pipe(65536L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = ByteString.of(byteArray0);
      long long0 = realBufferedSource0.indexOf(byteString0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      long long0 = realBufferedSource0.indexOf((byte)13, (long) (byte)13, (long) (byte)13);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Pipe pipe0 = new Pipe(10000000000000000L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOf((byte)122, 290L, (long) (byte)122);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex=290 toIndex=122
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.close();
      // Undeclared exception!
      try { 
        realBufferedSource0.readUtf8LineStrict();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.skip((-1L));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      try { 
        realBufferedSource0.readUtf8LineStrict(1L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // \\n not found: limit=0 content=\u2026
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Pipe pipe0 = new Pipe(9223372036854775807L);
      Source source0 = pipe0.source();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readUtf8LineStrict((-30L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // limit < 0: -30
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      String string0 = realBufferedSource0.readUtf8Line();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readString((Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      Charset charset0 = Charset.defaultCharset();
      String string0 = realBufferedSource0.readString(charset0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      long long0 = realBufferedSource0.readAll(buffer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[5];
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readFully(byteArray0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      ByteString[] byteStringArray0 = new ByteString[0];
      Options options0 = Options.of(byteStringArray0);
      int int0 = realBufferedSource0.select(options0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeIntLe(2330);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      int int0 = realBufferedSource0.readIntLe();
      assertEquals(2330, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Pipe pipe0 = new Pipe(363L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      boolean boolean0 = realBufferedSource0.exhausted();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Pipe pipe0 = new Pipe(438L);
      Buffer buffer0 = pipe0.buffer;
      byte[] byteArray0 = new byte[2];
      buffer0.write(byteArray0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      long long0 = realBufferedSource0.read(realBufferedSink0.buffer, (long) (byte)50);
      assertTrue(buffer0.exhausted());
      assertEquals(2L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSource0.read(buffer0, (long) (byte) (-30));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -30
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Pipe pipe0 = new Pipe(438L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      long long0 = realBufferedSource0.read(buffer0, (long) (byte)50);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  public void test32()  throws Throwable  {
      Pipe pipe0 = new Pipe(9223372036854775807L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      Buffer buffer0 = realBufferedSource0.buffer();
      assertEquals(0L, buffer0.completeSegmentByteCount());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      byte[] byteArray0 = realBufferedSource0.readByteArray();
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = ByteString.of(byteArray0);
      HashingSource hashingSource0 = HashingSource.hmacSha256(buffer0, byteString0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      try { 
        realBufferedSource0.readShortLe();
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
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink((BufferedSink) buffer0, deflater0);
      HashingSink hashingSink0 = HashingSink.sha512(deflaterSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      try { 
        realBufferedSource0.readUtf8LineStrict();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // \\n not found: limit=0 content=\u2026
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      String string0 = realBufferedSource0.readUtf8();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readByteString(6L);
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
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = ByteString.decodeBase64("Gd");
      boolean boolean0 = realBufferedSource0.rangeEquals((-194L), byteString0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readFully(realBufferedSource0.buffer, (-6L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -6
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
      Pipe pipe0 = new Pipe(1000000000000000L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      HashingSource hashingSource0 = HashingSource.md5(pipe_PipeSource0);
      pipe0.sinkClosed = true;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      try { 
        realBufferedSource0.readInt();
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Pipe pipe0 = new Pipe(299L);
      Source source0 = pipe0.source();
      HashingSource hashingSource0 = HashingSource.sha256(source0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOf((byte) (-30), (long) (byte) (-30));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex=-30 toIndex=9223372036854775807
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Pipe pipe0 = new Pipe(65536L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      GzipSink gzipSink0 = new GzipSink(realBufferedSource0.buffer);
      gzipSink0.close();
      String string0 = realBufferedSource0.readUtf8Line();
      assertNotNull(string0);
      assertEquals("\u001F\uFFFD\b\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(false);
      InflaterSource inflaterSource0 = new InflaterSource(buffer0, inflater0);
      GzipSource gzipSource0 = new GzipSource(inflaterSource0);
      Timeout timeout0 = gzipSource0.timeout();
      assertNotNull(timeout0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[5];
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      int int0 = realBufferedSource0.read(byteArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Pipe pipe0 = new Pipe(438L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = realBufferedSource0.readByteString();
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOf(byteString0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bytes is empty
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
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
  public void test48()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      long long0 = realBufferedSource0.indexOf((byte)65);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Pipe pipe0 = new Pipe(438L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      String string0 = realBufferedSource0.toString();
      assertEquals("buffer([size=0])", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Buffer buffer0 = new Buffer();
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
  public void test51()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readByteArray(8192L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
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
  public void test53()  throws Throwable  {
      Pipe pipe0 = new Pipe(363L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = ByteString.of(byteArray0);
      long long0 = realBufferedSource0.indexOfElement(byteString0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      InputStream inputStream0 = realBufferedSource0.inputStream();
      Buffer buffer1 = buffer0.readFrom(inputStream0);
      assertEquals(0L, buffer1.size());
  }
}
