/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 22:35:30 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.HashingSink;
import okio.HashingSource;
import okio.InflaterSource;
import okio.Pipe;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ByteString_ESTest extends ByteString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)64;
      byteArray0[1] = (byte)83;
      byteArray0[2] = (byte) (-12);
      byteArray0[3] = (byte) (-109);
      byteArray0[4] = (byte)29;
      byteArray0[5] = (byte) (-9);
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.md5();
      ByteString byteString2 = byteString1.toAsciiUppercase();
      assertNotSame(byteString2, byteString1);
      assertFalse(byteString2.equals((Object)byteString1));
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.EMPTY.toAsciiLowercase();
      assertNotSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.EMPTY.toAsciiUppercase();
      boolean boolean0 = byteString1.startsWith(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteBuffer byteBuffer0 = byteString0.asByteBuffer();
      ByteString byteString1 = ByteString.of(byteBuffer0);
      assertNotSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("ID1ID2");
      byte[] byteArray0 = byteString0.internalArray();
      assertArrayEquals(new byte[] {(byte)32, (byte)61, (byte)72, (byte)15}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      String string0 = byteString0.hex();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)77;
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.sha512();
      byte byte0 = byteString1.getByte(27);
      assertEquals((byte)49, byte0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = ByteString.of(byteArray0);
      String string0 = byteString0.base64Url();
      assertEquals("AAAAAAAA", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("PYm%87_|!NDN sPQ`");
      String string0 = byteString0.base64();
      assertEquals("UFltJTg3X3whTkROIHNQUWA=", string0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = ByteString.of(byteArray0);
      Buffer buffer0 = new Buffer();
      byteString0.write(buffer0);
      assertEquals(6L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = ByteString.of(byteArray0);
      boolean boolean0 = byteString0.rangeEquals(65533, byteString0, 276, 3311);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        ByteString.of(byteArray0, (-3764), (int) (byte)4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=3 offset=-3764 byteCount=4
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      byte[] byteArray0 = new byte[0];
      int int0 = byteString0.lastIndexOf(byteArray0, 110);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      int int0 = byteString0.lastIndexOf(byteString0, (-2712));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      int int0 = byteString0.EMPTY.lastIndexOf(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = byteString0.internalArray();
      int int0 = byteString0.EMPTY.indexOf(byteArray0, 3514);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = byteString0.internalArray();
      int int0 = byteString0.EMPTY.indexOf(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.indexOf(byteString0, (int) (byte)64);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.indexOf(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("@CQ");
      ByteString byteString1 = byteString0.EMPTY.hmacSha256(byteString0);
      assertNotSame(byteString0, byteString1);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("");
      boolean boolean0 = byteString0.rangeEquals(8, (byte[]) null, 127, 127);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = ByteString.of(byteArray0);
      byteString0.hashCode();
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.lastIndexOf(byteArray0, 11);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.sha512();
      int int0 = byteString1.indexOf(byteArray0, (int) (byte)19);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = ByteString.of(byteArray0);
      String string0 = byteString0.hex();
      assertEquals("00000000000000", string0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("1E;O7t^\\%");
      String string0 = byteString0.utf8();
      assertEquals("1E;O7t^\\%", string0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      boolean boolean0 = byteString0.rangeEquals((-931), byteString0, (-931), 1137);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      // Undeclared exception!
      try { 
        byteString0.getByte(16711680);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = realBufferedSource0.readByteString();
      boolean boolean0 = realBufferedSource0.rangeEquals(10L, byteString0, 0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.sha512();
      String string0 = byteString1.toString();
      //  // Unstable assertion: assertEquals("[hex=6d008f8b00d0882feace00a9200f0d8cf0afe007602a0d00d9c0408d988c2a4f70a0edfc80d0702fa0f4e20b2c0a244c8c0d000bab404000e24067d2a80e0e09]", string0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("[hex=25980fd89c6ffa459defe5ab582452e6cf2fb48cae2d3d51adb69352ec65e3d445609fcd156fb211c583190484d0331ab251cc8f9e4f34e0f7ec531552ef28ae]", (byte)23);
      assertEquals(23, int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.toString();
      assertEquals("[hex=000000]", string0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("1E;O7t^\\%");
      String string0 = byteString0.toString();
      assertEquals("[text=1E;O7t^\\\\%]", string0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      String string0 = byteString0.toString();
      assertEquals("[size=0]", string0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[2];
      ByteString byteString1 = new ByteString(byteArray0);
      int int0 = byteString0.compareTo(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Pipe pipe0 = new Pipe(1L);
      Buffer buffer0 = pipe0.buffer;
      HashingSink hashingSink0 = HashingSink.sha1(buffer0);
      ByteString byteString0 = hashingSink0.hash();
      ByteString byteString1 = ByteString.EMPTY;
      int int0 = byteString0.compareTo(byteString1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-3);
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = ByteString.encodeUtf8("bytes is empty");
      int int0 = byteString0.compareTo(byteString1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = ByteString.encodeUtf8("bytes is empty");
      int int0 = byteString0.compareTo(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = realBufferedSource0.readByteString();
      byteString0.EMPTY.hashCode();
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      byte[] byteArray0 = new byte[3];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      HashingSink hashingSink0 = HashingSink.hmacSha256(realBufferedSink0, byteString0);
      ByteString byteString1 = hashingSink0.hash();
      HashingSource hashingSource0 = HashingSource.hmacSha256(realBufferedSink0.buffer, byteString1);
      ByteString byteString2 = hashingSource0.hash();
      boolean boolean0 = byteString2.equals(byteString1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Pipe pipe0 = new Pipe(100000000L);
      Buffer buffer0 = pipe0.buffer;
      ByteString byteString0 = ByteString.encodeUtf8("v}OO.s*#hJ.,gYx");
      assertEquals(15, byteString0.size());
      
      HashingSource hashingSource0 = HashingSource.hmacSha256(buffer0, byteString0);
      ByteString byteString1 = hashingSource0.hash();
      boolean boolean0 = byteString0.equals(byteString1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteString byteString1 = ByteString.of(byteBuffer0);
      boolean boolean0 = byteString0.equals(byteString1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = ByteString.of(byteArray0);
      boolean boolean0 = byteString0.equals(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = ByteString.of(byteArray0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      boolean boolean0 = byteString0.EMPTY.equals(bufferedInputStream0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.sha512();
      int int0 = byteString1.lastIndexOf(byteArray0, (int) (byte)19);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.md5();
      int int0 = byteString1.indexOf(byteArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("newSize < 0: ", charset0);
      byte[] byteArray0 = new byte[6];
      boolean boolean0 = byteString0.endsWith(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha1(buffer0);
      ByteString byteString1 = hashingSource0.hash();
      boolean boolean0 = byteString0.startsWith(byteString1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = byteString0.rangeEquals(110, byteArray0, (-4062), (-4062));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      boolean boolean0 = byteString0.EMPTY.rangeEquals(0, (byte[]) null, 0, 65);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2439);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = byteString0.rangeEquals((-4324), byteArray0, (-4324), 796);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
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
  public void test052()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("*/6kMNVA7z", charset0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("#;MD<i^D_v&4");
      byteString0.write(mockPrintStream0);
      assertEquals(10, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.EMPTY.substring(0, 0);
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = ByteString.of(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.substring((int) (byte)51);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = ByteString.of(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.substring((int) (byte)72, (int) (byte)72);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > length(3)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = ByteString.of(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.EMPTY.substring((-94), 3419);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-79);
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte)12;
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.md5();
      ByteString byteString2 = byteString1.toAsciiUppercase();
      assertNotSame(byteString2, byteString1);
      assertFalse(byteString2.equals((Object)byteString1));
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("okio.ByteString");
      ByteString byteString1 = byteString0.EMPTY.md5();
      ByteString byteString2 = byteString1.toAsciiUppercase();
      assertSame(byteString2, byteString1);
      assertEquals(15, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.sha512();
      ByteString byteString2 = byteString1.toAsciiLowercase();
      assertNotSame(byteString2, byteString1);
      assertFalse(byteString2.equals((Object)byteString1));
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      try { 
        ByteString.read(bufferedInputStream0, 105);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(bufferedInputStream0, bufferedInputStream0);
      try { 
        ByteString.read(sequenceInputStream0, 85);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        ByteString.read(byteArrayInputStream0, (byte) (-9));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -9
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.read((InputStream) null, 90);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // in == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ByteString byteString0 = ByteString.read(pipedInputStream0, 0);
      assertEquals(0, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("D+U{Btla.O");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: +
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("beginIndex < 0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: g
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("6*NULn;^V/");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: *
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("s == null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex string: s == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
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
  public void test070()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("UTF-8");
      assertNull(byteString0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
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
  public void test072()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = new ByteString(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.EMPTY.string((Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      String string0 = byteString0.string(charset0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2439);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      String string0 = byteString0.toString();
      assertEquals("[size=2439 hex=00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\u2026]", string0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = realBufferedSource0.readByteString();
      String string0 = byteString0.utf8();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.encodeString("UnD:DyaLv", (Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
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
  public void test078()  throws Throwable  {
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
  public void test079()  throws Throwable  {
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
  public void test080()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.of((byte[]) null, 54, 43);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // data == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
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
  public void test082()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("@CQ");
      boolean boolean0 = byteString0.endsWith(byteString0);
      assertTrue(boolean0);
      assertEquals(3, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("*/6kMNVA7z", charset0);
      int int0 = byteString0.compareTo(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      int int0 = byteString0.indexOf(byteString0, 110);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
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
  public void test086()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = new ByteString(byteArray0);
      Buffer buffer0 = new Buffer();
      byteString0.EMPTY.write(buffer0);
      assertTrue(buffer0.exhausted());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(true);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(inflaterSource0);
      HashingSource hashingSource0 = HashingSource.md5(realBufferedSource0.buffer);
      ByteString byteString0 = hashingSource0.hash();
      ByteString byteString1 = byteString0.substring(8);
      assertEquals(8, byteString1.size());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.sha256();
      int int0 = byteString1.lastIndexOf(byteString0);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      ByteString byteString1 = byteString0.sha512();
      byte[] byteArray0 = new byte[0];
      int int0 = byteString1.lastIndexOf(byteArray0, 110);
      assertEquals(64, int0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("ID1ID2");
      ByteString byteString1 = byteString0.md5();
      int int0 = byteString1.lastIndexOf(byteString0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = realBufferedSource0.readByteString();
      String string0 = byteString0.base64Url();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.hmacSha1(byteString0);
      int int0 = byteString0.indexOf(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = realBufferedSource0.readByteString();
      int int0 = byteString0.indexOf(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("@CQ");
      int int0 = byteString0.lastIndexOf(byteString0, 3);
      assertEquals(0, int0);
      assertEquals(3, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      assertNotNull(byteString0);
      
      boolean boolean0 = byteString0.startsWith(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
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
  public void test097()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.sha1();
      assertNotSame(byteString0, byteString1);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      String string0 = byteString0.base64();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = ByteString.of(byteArray0);
      boolean boolean0 = byteString0.endsWith(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = ByteString.of(byteArray0);
      boolean boolean0 = byteString0.startsWith(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("ID1ID2");
      assertNotNull(byteString0);
      
      byte[] byteArray0 = new byte[9];
      int int0 = byteString0.EMPTY.lastIndexOf(byteArray0);
      assertEquals((-1), int0);
  }
}
