/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 09:07:28 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.zip.Deflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.DeflaterSink;
import okio.GzipSink;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RealBufferedSink_ESTest extends RealBufferedSink_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  public void test01()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.sha256();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeUtf8CodePoint(55296);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      ByteString byteString0 = new ByteString((byte[]) null);
      // Undeclared exception!
      try { 
        realBufferedSink0.write(byteString0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      Buffer buffer1 = realBufferedSource0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer1);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShort(2302);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeIntLe(0);
      realBufferedSink0.close();
      assertFalse(buffer0.exhausted());
      assertEquals(4L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.segmentSizes();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      realBufferedSink0.writeAll(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeShort(1618);
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
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8((String) null, (int) (byte) (-30), (int) (byte) (-30));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // string == null
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)118;
      BufferedSink bufferedSink0 = realBufferedSink0.write(byteArray0);
      assertSame(bufferedSink0, realBufferedSink0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeShortLe(1);
      ((RealBufferedSink) bufferedSink0).close();
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
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        realBufferedSink0.write(byteArray0, (int) (byte) (-30), (int) (byte) (-30));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=-30 byteCount=-30
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      try { 
        realBufferedSink0.write((Source) buffer0, 8L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Pipe pipe0 = new Pipe(195L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.emit();
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Pipe pipe0 = new Pipe(16L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeDecimalLong(16L);
      BufferedSink bufferedSink1 = realBufferedSink0.emit();
      assertSame(bufferedSink1, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.buffer();
      BufferedSink bufferedSink0 = realBufferedSink0.write((Source) buffer0, (-18L));
      assertSame(realBufferedSink0, bufferedSink0);
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
      buffer0.segmentSizes();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeHexadecimalUnsignedLong(792L);
      realBufferedSink0.timeout();
      realBufferedSink0.flush();
      assertFalse(buffer0.exhausted());
      assertEquals(3L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.segmentSizes();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      realBufferedSink0.writeAll(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeLong(0L);
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
      realBufferedSink0.outputStream();
      realBufferedSink0.writeLong(1000L);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString("endIndex < beginIndex: ", (-887), (-887), (Charset) null);
        fail("Expecting exception: IllegalAccessError");
      
      } catch(IllegalAccessError e) {
         //
         // beginIndex < 0: -887
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeInt(768);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeUtf8("");
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
  public void test20()  throws Throwable  {
      Pipe pipe0 = new Pipe(174L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeByte(0);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Pipe pipe0 = new Pipe(32L);
      Buffer buffer0 = pipe0.buffer;
      Buffer buffer1 = buffer0.writeInt(0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer1);
      try { 
        realBufferedSink0.write((Source) buffer1, 96L);
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
      realBufferedSink0.close();
      byte byte0 = (byte)85;
      // Undeclared exception!
      try { 
        realBufferedSink0.write((byte[]) null);
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
  public void test24()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      buffer_UnsafeCursor0.offset = (-1L);
      Buffer.UnsafeCursor buffer_UnsafeCursor1 = buffer0.readUnsafe(buffer_UnsafeCursor0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer_UnsafeCursor1.buffer);
      realBufferedSink0.writeDecimalLong(174L);
      realBufferedSink0.close();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer_UnsafeCursor1.buffer);
      ByteString byteString0 = realBufferedSource0.readByteString();
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
  public void test25()  throws Throwable  {
      Pipe pipe0 = new Pipe(1722L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
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
  public void test26()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      buffer0.readAndWriteUnsafe();
      // Undeclared exception!
      try { 
        realBufferedSink0.write((byte[]) null, (-1), (-1));
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
      Buffer buffer0 = new Buffer();
      buffer0.sha256();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.timeout();
      realBufferedSink0.close();
      Buffer buffer1 = null;
      // Undeclared exception!
      try { 
        realBufferedSink0.writeDecimalLong((-1L));
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
      realBufferedSink0.writeUtf8("");
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
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.sha256();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.write((Buffer) null, 0L);
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
      Charset.defaultCharset();
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8CodePoint((-139));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      int int0 = (-4627);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeUtf8("UTF-8", 0, (-4627));
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
      Pipe pipe0 = new Pipe(16L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      pipe_PipeSink0.close();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      RealBufferedSink realBufferedSink1 = new RealBufferedSink(realBufferedSink0);
      realBufferedSink1.writeHexadecimalUnsignedLong(125L);
      // Undeclared exception!
      try { 
        realBufferedSink1.close();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.Pipe$PipeSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      BufferedSink bufferedSink0 = realBufferedSink0.writeLongLe(716L);
      assertSame(realBufferedSink0, bufferedSink0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      int int0 = 0;
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
  public void test35()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      realBufferedSink0.close();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeUtf8("");
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeByte((-2230));
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
      Pipe pipe0 = new Pipe(87L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        realBufferedSink0.writeHexadecimalUnsignedLong(87L);
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
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      realBufferedSink0.writeAll(buffer0);
      Charset charset0 = Charset.defaultCharset();
      int int0 = 84;
      // Undeclared exception!
      try { 
        realBufferedSink0.writeString((String) null, 84, 84, charset0);
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
      Charset charset0 = Charset.defaultCharset();
      BufferedSink bufferedSink0 = realBufferedSink0.writeString("iz^izXK$mg+v", charset0);
      realBufferedSink0.toString();
      realBufferedSink0.close();
      // Undeclared exception!
      try { 
        bufferedSink0.writeUtf8("buffer([size=0])");
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
      BufferedSink bufferedSink0 = realBufferedSink0.writeShortLe(0);
      ((RealBufferedSink) bufferedSink0).close();
      int int0 = (-268);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeInt((-268));
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
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      realBufferedSink0.timeout();
      int int0 = 2062;
      // Undeclared exception!
      try { 
        realBufferedSink0.writeShortLe(2062);
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
      buffer0.segmentSizes();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.close();
      realBufferedSink0.writeAll(buffer0);
      // Undeclared exception!
      try { 
        realBufferedSink0.writeLongLe(0L);
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
      Pipe pipe0 = new Pipe(96L);
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Deflater deflater0 = new Deflater();
      DeflaterSink deflaterSink0 = new DeflaterSink(realBufferedSink0, deflater0);
      deflaterSink0.finishDeflate();
      deflaterSink0.timeout();
      FileSystemHandling.shouldAllThrowIOExceptions();
      GzipSink gzipSink0 = new GzipSink(deflaterSink0);
      deflaterSink0.timeout();
      // Undeclared exception!
      gzipSink0.close();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ">Afe?4\"e@O(,d0Uh");
      realBufferedSink0.close();
      int int0 = 704;
      // Undeclared exception!
      try { 
        realBufferedSink0.writeIntLe(704);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSink", e);
      }
  }
}