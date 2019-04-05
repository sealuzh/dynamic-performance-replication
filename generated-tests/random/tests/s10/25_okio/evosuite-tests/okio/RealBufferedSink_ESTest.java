/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 18:50:06 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.GzipSink;
import okio.GzipSource;
import okio.HashingSink;
import okio.HashingSource;
import okio.InflaterSource;
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
      Pipe pipe0 = new Pipe(15L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      byte[] byteArray0 = new byte[6];
      BufferedSink bufferedSink0 = realBufferedSink0.write(byteArray0, (int) (byte)1, (int) (byte)1);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Pipe pipe0 = new Pipe(839L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      Timeout timeout0 = realBufferedSink0.timeout();
      assertEquals(0L, timeout0.timeoutNanos());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.emitCompleteSegments();
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeUtf8(".inputStream()");
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString("$ckGR)~p<,[j.", 942, 989, charset0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > string.length: 989 > 13
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      ByteString byteString0 = ByteString.encodeUtf8("lLfsjz%vbnX");
      HashingSink hashingSink0 = HashingSink.hmacSha512(buffer0, byteString0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShortLe((-1036));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeLong((-1));
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeIntLe((-1));
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Pipe pipe0 = new Pipe(1955L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeByte((-1508));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeLongLe((-1270L));
      ByteString byteString0 = ByteString.encodeUtf8("lLfsjz%vbnX");
      HashingSink hashingSink0 = HashingSink.hmacSha512(buffer0, byteString0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      // Undeclared exception!
      try { 
        realBufferedSink0.write(buffer0, 10L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=8 offset=0 byteCount=10
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Pipe pipe0 = new Pipe(8192L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      HashingSink hashingSink0 = HashingSink.sha256(pipe_PipeSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      pipe_PipeSink0.close();
      realBufferedSink0.writeInt(3173);
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
  public void test11()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      realBufferedSink0.close();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Pipe pipe0 = new Pipe(65536L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      GzipSink gzipSink0 = new GzipSink(pipe_PipeSink0);
      gzipSink0.flush();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Pipe pipe0 = new Pipe(15L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
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
      realBufferedSink0.flush();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Charset charset0 = Charset.defaultCharset();
      realBufferedSink0.writeString("\"E#I:T?+_p", charset0);
      realBufferedSink0.emit();
      assertFalse(buffer0.exhausted());
      assertEquals(10L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.emit();
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeHexadecimalUnsignedLong(7L);
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
      BufferedSink bufferedSink0 = realBufferedSink0.writeHexadecimalUnsignedLong(2448);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      GzipSource gzipSource0 = new GzipSource(buffer0);
      HashingSource hashingSource0 = HashingSource.sha256(gzipSource0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeDecimalLong(2949L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeDecimalLong((-1));
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Pipe pipe0 = new Pipe(1879048192L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeLongLe((-250L));
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
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeLongLe(2448);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Pipe pipe0 = new Pipe(10L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeLong(8192L);
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
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeIntLe(1474);
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
      Pipe pipe0 = new Pipe(4294967295L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeInt(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Pipe pipe0 = new Pipe(396L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeShortLe(3122);
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
      Pipe pipe0 = new Pipe(15L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShortLe(0);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha1(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.closed = true;
      // Undeclared exception!
      try { 
        realBufferedSink0.writeShort(1752);
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
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShort((-712));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Pipe pipe0 = new Pipe(10L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeByte(1932735283);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Pipe pipe0 = new Pipe(1352L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      buffer0.writeLong(4L);
      try { 
        realBufferedSink0.write((Source) buffer0, 60L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.write((Source) buffer0, (-1L));
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Pipe pipe0 = new Pipe(18L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
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
  public void test35()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      long long0 = realBufferedSink0.writeAll(buffer0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Pipe pipe0 = new Pipe(8192L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      HashingSink hashingSink0 = HashingSink.sha256(pipe_PipeSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.close();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        realBufferedSink0.write(byteArray0, 549, 766);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(true);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        realBufferedSink0.write(byteArray0, 2533, 1269);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=7 offset=2533 byteCount=1269
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Pipe pipe0 = new Pipe(8192L);
      Buffer buffer0 = pipe0.buffer;
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.closed = true;
      byte[] byteArray0 = new byte[2];
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
  public void test39()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      byte[] byteArray0 = new byte[8];
      realBufferedSink0.write(byteArray0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeAll(buffer0);
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
      Pipe pipe0 = new Pipe(839L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.closed = true;
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString("", 4030, 4030, charset0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = ByteString.of(byteArray0);
      HashingSink hashingSink0 = HashingSink.hmacSha256(buffer0, byteString0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString((String) null, (int) (byte)86, 0, charset0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // string == null
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Pipe pipe0 = new Pipe(529L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      realBufferedSink0.close();
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString("source == null", charset0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Pipe pipe0 = new Pipe(1955L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8CodePoint(1879048192);
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
      BufferedSink bufferedSink0 = realBufferedSink0.writeUtf8CodePoint((-1));
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8(")", 2067947216, 2067947216);
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
      Pipe pipe0 = new Pipe(1046L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8("", 127, (-1192));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex: -1192 < 127
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Pipe pipe0 = new Pipe(1955L);
      Sink sink0 = pipe0.sink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(sink0);
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
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Pipe pipe0 = new Pipe(3511L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      byte[] byteArray0 = new byte[7];
      realBufferedSink0.close();
      ByteString byteString0 = ByteString.of(byteArray0);
      // Undeclared exception!
      try { 
        realBufferedSink0.write(byteString0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      ByteString byteString0 = buffer0.readByteString();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      buffer0.readUnsafe(buffer_UnsafeCursor0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer_UnsafeCursor0.buffer);
      BufferedSink bufferedSink0 = realBufferedSink0.write(byteString0);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      ByteString byteString0 = ByteString.encodeUtf8("lLfsjz%vbnX");
      HashingSink hashingSink0 = HashingSink.hmacSha512(buffer0, byteString0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.write(buffer0, 10L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Pipe pipe0 = new Pipe(15L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSink0.write(buffer0, (-1519L));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=0 byteCount=-1519
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
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
  public void test54()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      ByteString byteString0 = ByteString.encodeUtf8("lLfsjz%vbnX");
      HashingSink hashingSink0 = HashingSink.hmacSha512(buffer0, byteString0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      String string0 = realBufferedSink0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Pipe pipe0 = new Pipe(15L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      OutputStream outputStream0 = realBufferedSink0.outputStream();
      assertNotNull(outputStream0);
  }
}
