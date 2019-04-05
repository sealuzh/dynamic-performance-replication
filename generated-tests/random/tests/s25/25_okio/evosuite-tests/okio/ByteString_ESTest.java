/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 10:20:58 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.Buffer;
import okio.ByteString;
import okio.HashingSink;
import okio.Pipe;
import okio.RealBufferedSink;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ByteString_ESTest extends ByteString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = ByteString.of(byteArray0);
      String string0 = byteString0.toString();
      assertEquals("[hex=000000000000]", string0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      ByteString byteString1 = ByteString.EMPTY;
      boolean boolean0 = byteString0.equals(byteString1);
      assertFalse(byteString1.equals((Object)byteString0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.sha512();
      boolean boolean0 = byteString1.startsWith(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.md5(buffer0);
      ByteString byteString0 = hashingSink0.hash();
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = byteString0.startsWith(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("\r");
      String string0 = byteString0.utf8();
      assertEquals("\r", string0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = ByteString.of(byteArray0);
      byte[] byteArray1 = byteString0.toByteArray();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.lastIndexOf(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.sha512();
      int int0 = byteString1.lastIndexOf(byteString0, 104);
      assertEquals(64, int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.hex();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString(":sr-ZHuPayc)", charset0);
      String string0 = byteString0.base64Url();
      assertEquals("OnNyLVpIdVBheWMp", string0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString(":sr-ZHuPayc)", charset0);
      String string0 = byteString0.base64();
      assertEquals("OnNyLVpIdVBheWMp", string0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("duration <= 0: ", charset0);
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = new Buffer.UnsafeCursor();
      buffer0.readUnsafe(buffer_UnsafeCursor0);
      byteString0.write(buffer_UnsafeCursor0.buffer);
      assertEquals((-1L), buffer_UnsafeCursor0.offset);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      // Undeclared exception!
      try { 
        byteString0.substring((int) (byte)65);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      boolean boolean0 = byteString0.startsWith(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = new ByteString(byteArray0);
      boolean boolean0 = byteString0.EMPTY.rangeEquals((int) (byte)11, byteArray0, 0, 2856);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = ByteString.of(byteArray0);
      boolean boolean0 = byteString0.rangeEquals(2363, byteString0, (int) (byte) (-116), (int) (byte) (-116));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("<pwt`}aOlC=m@>4", charset0);
      byte[] byteArray0 = byteString0.internalArray();
      // Undeclared exception!
      try { 
        ByteString.of(byteArray0, (-1252), (-1252));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=15 offset=-1252 byteCount=-1252
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      int int0 = byteString0.lastIndexOf(byteArray0, (int) (byte) (-32));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.lastIndexOf(byteString0, 820);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      int int0 = byteString0.lastIndexOf(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[1];
      int int0 = byteString0.EMPTY.indexOf(byteArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      ByteString byteString1 = ByteString.decodeBase64("-9223372036854775808");
      int int0 = byteString0.indexOf(byteString1, 70);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.indexOf(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      assertEquals(0, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("@*z(Q(p<\"&f//", 2501);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("71MfL8tlt;Qa1(", (-8));
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null, 1752);
      try { 
        ByteString.read(bufferedInputStream0, 101);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = new ByteString(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.indexOf((ByteString) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("xe~5Kl[uzr%wUR9B");
      // Undeclared exception!
      try { 
        byteString0.EMPTY.hmacSha512((ByteString) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      // Undeclared exception!
      try { 
        byteString0.hmacSha512(byteString0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.hmacSha256(byteString0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      // Undeclared exception!
      try { 
        byteString0.hmacSha1(byteString0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.lastIndexOf(byteArray0, 76);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      byte[] byteArray0 = new byte[4];
      ByteString byteString1 = byteString0.sha1();
      int int0 = byteString1.lastIndexOf(byteArray0, (int) (byte)105);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("<pwt`}aOlC=m@>4", charset0);
      byte[] byteArray0 = byteString0.internalArray();
      ByteString byteString1 = byteString0.toAsciiUppercase();
      int int0 = byteString1.indexOf(byteArray0, (-1013));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("9?2EK vQ,{LbC8K");
      byte[] byteArray0 = new byte[5];
      int int0 = byteString0.indexOf(byteArray0, (int) (byte)11);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("<pwt`}aOlC=m@>4", charset0);
      byte[] byteArray0 = byteString0.internalArray();
      int int0 = byteString0.indexOf(byteArray0, (-1013));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = byteString0.rangeEquals((int) (byte)82, byteArray0, 39, 39);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = new ByteString(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.substring((int) (byte) (-30), (-1206));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.md5(buffer0);
      ByteString byteString0 = hashingSink0.hash();
      String string0 = byteString0.hex();
      assertEquals("d41d8cd98f00b204e9800998ecf8427e", string0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[4];
      byteString0.utf8();
      byteArray0[0] = (byte)37;
      byte byte0 = (byte)2;
      // Undeclared exception!
      try { 
        ByteString.decodeHex("ID1ID2");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: I
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("");
      boolean boolean0 = byteString0.rangeEquals(3378, byteString0, 3378, 3378);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = ByteString.of(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.getByte((byte)112);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 112
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("4Wz`%");
      int int0 = byteString0.size();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      byte[] byteArray0 = byteString0.toByteArray();
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Pipe pipe0 = new Pipe(2L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      HashingSink hashingSink0 = HashingSink.sha1(realBufferedSink0);
      ByteString byteString0 = hashingSink0.hash();
      String string0 = byteString0.toString();
      assertEquals("[hex=da39a3ee5e6b4b0d3255bfef95601890afd80709]", string0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex(">\"W_[@:5[VdX p@", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      String string0 = byteString0.toString();
      assertEquals("[size=0]", string0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      ByteString byteString1 = ByteString.decodeBase64("-9223372036854775808");
      assertNotNull(byteString1);
      
      int int0 = byteString1.compareTo(byteString0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.md5(buffer0);
      ByteString byteString1 = hashingSink0.hash();
      int int0 = byteString0.compareTo(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("2l$8_]", charset0);
      ByteString byteString1 = ByteString.encodeUtf8("");
      ByteString byteString2 = byteString1.hmacSha256(byteString0);
      int int0 = byteString2.compareTo(byteString0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("2l$8_]", charset0);
      ByteString byteString1 = byteString0.sha256();
      int int0 = byteString1.compareTo(byteString0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      byteString0.EMPTY.hashCode();
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("4Wz`%");
      byte[] byteArray0 = new byte[3];
      ByteString byteString1 = new ByteString(byteArray0);
      boolean boolean0 = byteString1.equals(byteString0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      ByteString byteString1 = ByteString.decodeHex("");
      boolean boolean0 = byteString1.equals(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = new ByteString(byteArray0);
      Object object0 = new Object();
      boolean boolean0 = byteString0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("4Wz`%");
      byte[] byteArray0 = new byte[3];
      ByteString byteString1 = new ByteString(byteArray0);
      int int0 = byteString0.lastIndexOf(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Pipe pipe0 = new Pipe(2L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      HashingSink hashingSink0 = HashingSink.sha1(realBufferedSink0);
      ByteString byteString0 = hashingSink0.hash();
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = byteString0.endsWith(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString1 = ByteString.encodeString("$c)i. 8kgP$/dxm2", charset0);
      boolean boolean0 = byteString0.startsWith(byteString1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("4Wz`%");
      byte[] byteArray0 = new byte[3];
      ByteString byteString1 = new ByteString(byteArray0);
      boolean boolean0 = byteString1.endsWith(byteString0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = new ByteString(byteArray0);
      boolean boolean0 = byteString0.rangeEquals((-62), byteArray0, (int) (byte) (-57), (-62));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = new ByteString(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.write((OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // out == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = new ByteString(byteArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0);
      byteString0.EMPTY.write(bufferedOutputStream0);
      assertEquals(2, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("\r");
      ByteString byteString1 = byteString0.substring(0);
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("xe~5Kl[uzr%wUR9B");
      assertEquals(16, byteString0.size());
      
      ByteString byteString1 = byteString0.substring(2, 2);
      assertEquals(0, byteString1.size());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.md5(buffer0);
      ByteString byteString0 = hashingSink0.hash();
      // Undeclared exception!
      try { 
        byteString0.substring((int) (byte)34, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      // Undeclared exception!
      try { 
        byteString0.substring(2651, 2651);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > length(0)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Pipe pipe0 = new Pipe(2L);
      Pipe.PipeSink pipe_PipeSink0 = pipe0.new PipeSink();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(pipe_PipeSink0);
      HashingSink hashingSink0 = HashingSink.sha1(realBufferedSink0);
      ByteString byteString0 = hashingSink0.hash();
      ByteString byteString1 = byteString0.substring((int) (byte)0, (int) (byte)0);
      assertEquals(0, byteString1.size());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)123;
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.toAsciiUppercase();
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("");
      ByteString byteString1 = byteString0.toAsciiUppercase();
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("nC96BMv'6)C!kL0!");
      ByteString byteString1 = byteString0.toAsciiLowercase();
      assertNotSame(byteString1, byteString0);
      assertFalse(byteString1.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)97;
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.toAsciiLowercase();
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        ByteString.read(byteArrayInputStream0, (byte)57);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ByteString byteString0 = ByteString.read(pipedInputStream0, 0);
      ByteString byteString1 = byteString0.toAsciiLowercase();
      assertSame(byteString0, byteString1);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        ByteString.read(pipedInputStream0, (-9));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -9
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.read((InputStream) null, (byte)0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // in == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("Expected leading [0-9] or '-' character but was 0x");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: x
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("8VFp!lZK!JdOLN_E");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: V
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("c+y!");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: +
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("duration <= 0: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex string: duration <= 0: 
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // hex == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      boolean boolean0 = byteString0.equals(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("-v/H(");
      assertNull(byteString0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeBase64((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // base64 == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      // Undeclared exception!
      try { 
        byteString0.string((Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("2l$8_]", charset0);
      String string0 = byteString0.EMPTY.string(charset0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("2l$8_]", charset0);
      String string0 = byteString0.toString();
      assertEquals("[text=2l$8_]]", string0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.utf8();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.encodeString("'x", (Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        ByteString.encodeString((String) null, charset0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // s == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.encodeUtf8((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // s == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.of((ByteBuffer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // data == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteBuffer byteBuffer0 = byteString0.asByteBuffer();
      ByteString byteString1 = ByteString.of(byteBuffer0);
      assertNotSame(byteString0, byteString1);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.of((byte[]) null, 11, 11);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // data == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.of((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // data == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      boolean boolean0 = byteString0.endsWith(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.compareTo(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.indexOf(byteString0, (-6));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.hmacSha512(byteString0);
      assertFalse(byteString1.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      Buffer buffer0 = new Buffer();
      byteString0.EMPTY.write(buffer0);
      assertEquals(0L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = new ByteString(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.substring((-1035));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.EMPTY.indexOf(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.sha512();
      int int0 = byteString1.indexOf(byteString0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("\r");
      byteString0.md5();
      assertEquals(1, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.EMPTY.base64Url();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.hmacSha1(byteString0);
      assertNotSame(byteString0, byteString1);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("xe~5Kl[uzr%wUR9B");
      byteString0.EMPTY.base64();
      assertEquals(16, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      boolean boolean0 = byteString0.endsWith(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      int int0 = byteString0.EMPTY.lastIndexOf(byteString0, (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[1];
      int int0 = byteString0.lastIndexOf(byteArray0);
      assertEquals((-1), int0);
  }
}