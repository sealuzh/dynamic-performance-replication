/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 10:38:22 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RealBufferedSource_ESTest extends RealBufferedSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Pipe pipe0 = new Pipe(9223372036854775807L);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ":'nX@PpqM-+5R^@D");
      Buffer buffer0 = pipe0.buffer;
      pipe0.sourceClosed = false;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.readByteString();
      realBufferedSource0.readAll(buffer0);
      realBufferedSource0.indexOf((byte)70, 9223372036854775807L);
      realBufferedSource0.closed = false;
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
  public void test01()  throws Throwable  {
      Pipe pipe0 = new Pipe(8L);
      pipe0.sinkClosed = true;
      Source source0 = pipe0.source();
      pipe0.sourceClosed = false;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      realBufferedSource0.timeout();
      byte byte0 = (byte) (-126);
      boolean boolean0 = true;
      pipe0.sourceClosed = true;
      ByteString byteString0 = ByteString.encodeUtf8("");
      ByteString byteString1 = ByteString.decodeBase64("");
      byte[] byteArray0 = new byte[0];
      byteString1.lastIndexOf(byteArray0, 196);
      realBufferedSource0.close();
      byteString0.lastIndexOf(byteString1, (int) (byte) (-126));
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOf(byteString0, 1095216660480L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha1(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(realBufferedSource0.buffer);
      Buffer buffer1 = realBufferedSink0.buffer();
      long long0 = realBufferedSource0.read(buffer1, 0L);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      GzipSink gzipSink0 = new GzipSink(hashingSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(gzipSink0);
      Buffer buffer1 = realBufferedSink0.buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      ByteString byteString0 = hashingSink0.hash();
      long long0 = realBufferedSource0.indexOf(byteString0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = charset0.encode("|1zfoDUI*}w\b");
      ByteString byteString0 = ByteString.of(byteBuffer0);
      boolean boolean0 = realBufferedSource0.rangeEquals(3538L, byteString0, 38, 99);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Pipe pipe0 = new Pipe(10000000000L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      byte[] byteArray0 = null;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      ByteString[] byteStringArray0 = new ByteString[0];
      Options options0 = Options.of(byteStringArray0);
      realBufferedSource0.select(options0);
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
  public void test06()  throws Throwable  {
      Pipe pipe0 = new Pipe(177L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      Buffer buffer0 = realBufferedSink0.buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readUtf8LineStrict(177L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // \\n not found: limit=0 content=\u2026
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeHexadecimalUnsignedLong((-185L));
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.readByteString(32L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      Buffer buffer0 = new Buffer();
      GzipSink gzipSink0 = new GzipSink(buffer0);
      HashingSink hashingSink0 = HashingSink.md5(gzipSink0);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(hashingSink0);
      Buffer buffer1 = realBufferedSink0.buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
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
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      int int0 = 15;
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(15);
      byteBuffer0.mark();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      realBufferedSource0.indexOf(byteString0, (long) 15);
      realBufferedSource0.indexOf((byte) (-8));
      realBufferedSource0.readUtf8();
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOfElement(byteString0, (-3271L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex < 0
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.readByteArray();
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
  public void test11()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      try { 
        realBufferedSource0.skip(1404L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      long long0 = 9223372036854775807L;
      Pipe pipe0 = new Pipe(9223372036854775807L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      Buffer buffer0 = realBufferedSink0.buffer();
      pipe0.sinkClosed = true;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.close();
      ByteString byteString0 = ByteString.encodeUtf8("2#G[h`UuL~mRlmv");
      // Undeclared exception!
      try { 
        realBufferedSource0.rangeEquals(4L, byteString0);
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
      long long0 = 9L;
      Pipe pipe0 = new Pipe(9L);
      EvoSuiteFile evoSuiteFile0 = null;
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      HashingSource hashingSource0 = HashingSource.sha256(pipe_PipeSource0);
      pipe0.sourceClosed = true;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      Buffer buffer0 = realBufferedSource0.buffer();
      // Undeclared exception!
      try { 
        realBufferedSource0.read(buffer0, 9L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.Pipe$PipeSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      long long0 = 2187L;
      Pipe pipe0 = new Pipe(2187L);
      Buffer buffer0 = pipe0.buffer;
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "7!9>PT+`<M]Q+f>l");
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      realBufferedSource0.readAll(buffer0);
      try { 
        realBufferedSource0.readByteString(2187L);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Pipe pipe0 = new Pipe(8L);
      Source source0 = pipe0.source();
      pipe0.sinkClosed = true;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      realBufferedSource0.readUtf8();
      ByteString byteString0 = ByteString.decodeBase64("");
      boolean boolean0 = realBufferedSource0.rangeEquals((-1152921504606846976L), byteString0, 57, 1952257861);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Pipe pipe0 = new Pipe(9223372036854775807L);
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[1];
      ByteString[] byteStringArray0 = new ByteString[2];
      ByteString byteString0 = realBufferedSource0.readByteString();
      byteStringArray0[0] = byteString0;
      ByteString.decodeBase64("ISIZE");
      byteStringArray0[1] = null;
      Options options0 = Options.of(byteStringArray0);
      realBufferedSource0.select(options0);
      realBufferedSource0.closed = true;
      byteArray0[0] = (byte)89;
      // Undeclared exception!
      try { 
        ByteString.of(byteArray0, (int) (byte)89, (int) (byte)89);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=1 offset=89 byteCount=89
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Pipe pipe0 = new Pipe(10L);
      Source source0 = pipe0.source();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      pipe0.sinkClosed = false;
      pipe0.sourceClosed = false;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      pipe0.sourceClosed = false;
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "not attached to a buffer");
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOf((byte) (-54), (-2314L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex=-2314 toIndex=9223372036854775807
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      long long0 = 9L;
      Pipe pipe0 = new Pipe(9L);
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      HashingSource hashingSource0 = HashingSource.sha256(pipe_PipeSource0);
      pipe0.sourceClosed = true;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      // Undeclared exception!
      try { 
        realBufferedSource0.skip(9L);
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
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "&q^GwT");
      Pipe pipe0 = new Pipe(2333L);
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
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(false);
      InflaterSource inflaterSource0 = new InflaterSource(buffer0, inflater0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)109;
      byteArray0[1] = (byte)81;
      byteArray0[2] = (byte)59;
      ByteString byteString0 = ByteString.of(byteArray0);
      HashingSource hashingSource0 = HashingSource.hmacSha1(inflaterSource0, byteString0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      // Undeclared exception!
      try { 
        realBufferedSource0.indexOf((byte)70, (long) (byte)81, (long) (byte)59);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex=81 toIndex=59
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha1(buffer0);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      realBufferedSource0.require(0L);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Pipe pipe0 = new Pipe(8L);
      pipe0.sourceClosed = false;
      Source source0 = pipe0.source();
      pipe0.sourceClosed = true;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readByteArray(8L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.Pipe$PipeSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(false);
      InflaterSource inflaterSource0 = new InflaterSource(buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      inflaterSource0.refill();
      // Undeclared exception!
      try { 
        realBufferedSource0.readByteString((-1415L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -1415
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Pipe pipe0 = new Pipe(1114L);
      Source source0 = pipe0.source();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      Buffer buffer0 = null;
      // Undeclared exception!
      try { 
        realBufferedSource0.read((Buffer) null, 1114L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sink == null
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater();
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      HashingSource hashingSource0 = HashingSource.md5(inflaterSource0);
      HashingSource hashingSource1 = HashingSource.sha256(hashingSource0);
      Source source0 = hashingSource1.delegate();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      realBufferedSource0.toString();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)29;
      byteArray0[1] = (byte)88;
      byteArray0[2] = (byte)44;
      byteArray0[3] = (byte) (-51);
      byteArray0[4] = (byte) (-65);
      byteArray0[5] = (byte)103;
      byteArray0[6] = (byte)69;
      byteArray0[7] = (byte) (-97);
      try { 
        realBufferedSource0.readFully(byteArray0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // source exhausted prematurely
         //
         verifyException("okio.InflaterSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Pipe pipe0 = new Pipe(100000000000L);
      pipe0.sourceClosed = true;
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      pipe0.sinkClosed = true;
      boolean boolean0 = true;
      pipe0.sourceClosed = true;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(pipe_PipeSource0);
      pipe0.sourceClosed = true;
      byte byte0 = (byte)117;
      // Undeclared exception!
      try { 
        realBufferedSource0.exhausted();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.Pipe$PipeSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      Buffer.UnsafeCursor buffer_UnsafeCursor1 = buffer0.readAndWriteUnsafe(buffer_UnsafeCursor0);
      Buffer buffer1 = buffer_UnsafeCursor1.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      // Undeclared exception!
      try { 
        realBufferedSource0.readFully(buffer_UnsafeCursor1.buffer, (-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -1
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      long long0 = 9223372036854775807L;
      Pipe pipe0 = new Pipe(9223372036854775807L);
      Buffer buffer0 = pipe0.buffer;
      boolean boolean0 = false;
      pipe0.sourceClosed = false;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      byte[] byteArray0 = new byte[6];
      realBufferedSource0.skip((byte) (-16));
      byteArray0[0] = (byte) (-16);
      byteArray0[1] = (byte)102;
      pipe0.sourceClosed = true;
      byteArray0[2] = (byte)113;
      byteArray0[3] = (byte) (-77);
      pipe0.sourceClosed = true;
      buffer0.readByteArray();
      byteArray0[4] = (byte) (-112);
      byteArray0[5] = (byte)28;
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
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(false);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      InflaterSource inflaterSource1 = new InflaterSource(inflaterSource0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource1);
      long long0 = (-1415L);
      // Undeclared exception!
      try { 
        realBufferedSource0.readByteString((-1415L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -1415
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(false);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      try { 
        realBufferedSource0.readByte();
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
      Pipe pipe0 = new Pipe(8L);
      pipe0.sinkClosed = true;
      Source source0 = pipe0.source();
      pipe0.sourceClosed = false;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(source0);
      realBufferedSource0.timeout();
      byte byte0 = (byte) (-126);
      boolean boolean0 = true;
      pipe0.sourceClosed = true;
      ByteString.encodeUtf8("");
      // Undeclared exception!
      try { 
        realBufferedSource0.readByteString();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.Pipe$PipeSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
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
  public void test33()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
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
  public void test34()  throws Throwable  {
      Pipe pipe0 = new Pipe(3279L);
      pipe0.sinkClosed = false;
      Buffer buffer0 = pipe0.buffer;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
      Locale locale0 = Locale.GERMAN;
      locale0.getUnicodeLocaleKeys();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) pipe0;
      objectArray0[1] = (Object) pipe0;
      mockPrintStream0.println(false);
      Object object0 = new Object();
      objectArray0[2] = object0;
      objectArray0[3] = (Object) mockPrintStream0;
      mockPrintStream0.print(12);
      objectArray0[4] = (Object) pipe0;
      PrintStream printStream0 = mockPrintStream0.format(locale0, "", objectArray0);
      buffer0.copyTo((OutputStream) printStream0);
      realBufferedSource0.indexOf((byte) (-126), 3279L);
      realBufferedSource0.inputStream();
      realBufferedSource0.indexOfElement((ByteString) null);
      realBufferedSource0.indexOfElement((ByteString) null);
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
  public void test35()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      GzipSource gzipSource0 = new GzipSource(buffer0);
      gzipSource0.close();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(gzipSource0);
      long long0 = (-733L);
      // Undeclared exception!
      try { 
        realBufferedSource0.read(buffer0, 1021L);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // closed
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.indexOf((byte) (-23));
      long long0 = (-989L);
      realBufferedSource0.readByteString();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-23);
      byteArray0[1] = (byte) (-23);
      byteArray0[2] = (byte)70;
      byte byte0 = (byte)37;
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
  public void test37()  throws Throwable  {
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      Buffer buffer0 = buffer_UnsafeCursor0.buffer;
      Inflater inflater0 = new Inflater();
      long long0 = 2L;
      // Undeclared exception!
      try { 
        buffer_UnsafeCursor0.seek(2L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.Buffer$UnsafeCursor", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.indexOf((byte)46);
      Charset charset0 = Charset.defaultCharset();
      realBufferedSource0.readUtf8();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)46;
      byteArray0[1] = (byte)46;
      byteArray0[2] = (byte)46;
      HashingSource hashingSource0 = HashingSource.sha256(realBufferedSource0);
      ByteString byteString0 = hashingSource0.hash();
      realBufferedSource0.indexOfElement(byteString0);
      byteArray0[3] = (byte)46;
      realBufferedSource0.read(byteArray0);
      realBufferedSource0.readUtf8Line();
      realBufferedSource0.readString(charset0);
      // Undeclared exception!
      try { 
        realBufferedSource0.readUtf8((long) (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -1
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Buffer buffer0 = new Buffer();
      ByteString byteString0 = ByteString.decodeBase64("");
      // Undeclared exception!
      try { 
        HashingSource.hmacSha1(buffer0, byteString0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(true);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)83;
      byteArray0[1] = (byte)1;
      byte byte0 = (byte) (-68);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      Buffer buffer1 = realBufferedSource0.buffer;
      // Undeclared exception!
      try { 
        buffer0.readFully(buffer1, (-1631L));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=0 byteCount=-1631
         //
         verifyException("okio.Util", e);
      }
  }
}