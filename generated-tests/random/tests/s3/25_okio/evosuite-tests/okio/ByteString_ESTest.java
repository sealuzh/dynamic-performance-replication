/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 11:05:08 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.HashingSource;
import okio.InflaterSource;
import okio.Pipe;
import okio.RealBufferedSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ByteString_ESTest extends ByteString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.EMPTY.sha256();
      boolean boolean0 = byteString1.endsWith(byteString0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("HmacSHA512");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = byteString0.startsWith(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)90;
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.toAsciiLowercase();
      assertNotSame(byteString1, byteString0);
      assertFalse(byteString1.equals((Object)byteString0));
      assertArrayEquals(new byte[] {(byte)90, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = ByteString.of(byteArray0);
      byte[] byteArray1 = byteString0.toByteArray();
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("");
      Charset charset0 = Charset.defaultCharset();
      String string0 = byteString0.EMPTY.string(charset0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      int int0 = byteString0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = ByteString.encodeUtf8("closed");
      int int0 = byteString0.lastIndexOf(byteString1, 9);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[6];
      ByteString byteString1 = ByteString.of(byteArray0);
      int int0 = byteString0.lastIndexOf(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("2%");
      byte[] byteArray0 = byteString0.internalArray();
      assertArrayEquals(new byte[] {(byte)50, (byte)37}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.indexOf(byteString0, (int) (byte) (-96));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("charset == null");
      String string0 = byteString0.EMPTY.hex();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      String string0 = byteString0.base64Url();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("K]_hNP;'}d)pB re>%", charset0);
      String string0 = byteString0.EMPTY.base64();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = byteString0.toByteArray();
      boolean boolean0 = byteString0.startsWith(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = byteString0.rangeEquals(90, byteArray0, 90, 117);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = ByteString.encodeUtf8("Y\"Dt~*)E[o2-)u");
      boolean boolean0 = byteString0.rangeEquals(90, byteString1, 90, 90);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("data == null");
      byte[] byteArray0 = new byte[1];
      int int0 = byteString0.EMPTY.lastIndexOf(byteArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      int int0 = byteString0.lastIndexOf(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("data == null");
      byte[] byteArray0 = new byte[1];
      int int0 = byteString0.indexOf(byteArray0, 51);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("X3lgfHfrLt+{");
      // Undeclared exception!
      try { 
        byteString0.indexOf((ByteString) null, (int) (byte) (-108));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      int int0 = byteString0.EMPTY.indexOf(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.getByte((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("data == null");
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = byteString0.endsWith(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      boolean boolean0 = byteString0.endsWith(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("closed", (-1166));
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("", 1666);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      // Undeclared exception!
      try { 
        byteString0.indexOf((ByteString) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("");
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
  public void test028()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("[hex=", charset0);
      // Undeclared exception!
      try { 
        byteString0.getByte(12);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = new ByteString(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.endsWith((ByteString) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.indexOf(byteArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("SHA-512");
      byte[] byteArray0 = new byte[2];
      int int0 = byteString0.indexOf(byteArray0, (-1376));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[8];
      boolean boolean0 = byteString0.rangeEquals(90, byteArray0, 90, 117);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.hex();
      assertEquals("000000000000", string0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("");
      String string0 = byteString0.utf8();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      boolean boolean0 = byteString0.rangeEquals(90, byteString0, 90, 90);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("HmacSHA512");
      int int0 = byteString0.size();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(false);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(14);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      HashingSource hashingSource0 = HashingSource.hmacSha256(inflaterSource0, byteString0);
      assertNotNull(hashingSource0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)37;
      byteArray0[1] = (byte)100;
      byteArray0[2] = (byte) (-114);
      ByteString byteString0 = ByteString.of(byteArray0);
      String string0 = byteString0.toString();
      assertEquals("[hex=25648e000000]", string0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("\n not found: limit=", 47);
      assertEquals(19, int0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("}dJW`-R'{F+%[w", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("charset == null");
      String string0 = byteString0.toString();
      assertEquals("[text=charset == null]", string0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      String string0 = byteString0.toString();
      assertEquals("[size=0]", string0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteString byteString0 = ByteString.of(byteArray0);
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha1(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      ByteString byteString1 = realBufferedSource0.readByteString();
      int int0 = byteString1.compareTo(byteString0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteString.of(byteBuffer0);
      ByteString byteString1 = ByteString.of(byteBuffer0);
      int int0 = byteString0.compareTo(byteString1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("charset == null");
      byte[] byteArray0 = new byte[8];
      ByteString byteString1 = new ByteString(byteArray0);
      int int0 = byteString0.compareTo(byteString1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("charset == null");
      assertEquals(15, byteString0.size());
      
      ByteString byteString1 = byteString0.hmacSha1(byteString0);
      int int0 = byteString0.compareTo(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.compareTo(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      byteString0.hashCode();
      byteString0.hashCode();
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      ByteString byteString1 = ByteString.EMPTY;
      boolean boolean0 = byteString0.equals(byteString1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("K]_hNP;'}d)pB re>%", charset0);
      boolean boolean0 = byteString0.EMPTY.equals(byteString0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      boolean boolean0 = byteString0.equals(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      Object object0 = new Object();
      boolean boolean0 = byteString0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("data == null");
      byte[] byteArray0 = new byte[1];
      int int0 = byteString0.lastIndexOf(byteArray0, 101);
      assertEquals((-1), int0);
      assertEquals(12, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.lastIndexOf(byteArray0, (int) (byte) (-123));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("data == null");
      byte[] byteArray0 = new byte[1];
      ByteString byteString1 = ByteString.of(byteArray0);
      int int0 = byteString0.indexOf(byteString1);
      assertEquals(12, byteString0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("okio.Options");
      ByteString byteString1 = byteString0.sha1();
      boolean boolean0 = byteString0.endsWith(byteString1);
      assertFalse(boolean0);
      assertEquals(12, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("2%");
      byte[] byteArray0 = new byte[8];
      boolean boolean0 = byteString0.rangeEquals((-4400), byteArray0, (-4400), 66);
      assertEquals(2, byteString0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("$");
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
  public void test059()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, true);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0, 5);
      byteString0.EMPTY.write(bufferedOutputStream0);
      assertEquals(0, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.substring(0);
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("data == null");
      // Undeclared exception!
      try { 
        byteString0.substring(114, (int) (byte) (-2));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      // Undeclared exception!
      try { 
        byteString0.substring(117, 117);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > length(0)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteString byteString0 = ByteString.of(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.substring((-128));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("Y\"Dt~*)E[o2-)u");
      ByteString byteString1 = byteString0.toAsciiUppercase();
      assertNotSame(byteString1, byteString0);
      assertFalse(byteString1.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      HashingSource hashingSource0 = HashingSource.md5(realBufferedSource0);
      ByteString byteString0 = hashingSource0.hash();
      ByteString byteString1 = byteString0.toAsciiUppercase();
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("");
      ByteString byteString1 = byteString0.toAsciiUppercase();
      assertEquals(0, byteString1.size());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.EMPTY.sha256();
      ByteString byteString2 = byteString1.toAsciiLowercase();
      assertNotSame(byteString2, byteString1);
      assertFalse(byteString2.equals((Object)byteString1));
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)105;
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.toAsciiLowercase();
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.EMPTY.toAsciiLowercase();
      assertNotSame(byteString0, byteString1);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      ByteString byteString0 = ByteString.read(dataInputStream0, 0);
      assertEquals(0, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(70);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pushbackInputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(bufferedInputStream0, pipedInputStream0);
      // Undeclared exception!
      try { 
        ByteString.read(sequenceInputStream0, (-739));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -739
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.read((InputStream) null, (-632));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // in == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        ByteString.read(byteArrayInputStream0, (byte)23);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("fA`xFF1;0M");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: `
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("5d^Mlj?v/(:p:+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: ^
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex(" `Oo");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit:  
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("~Wb\"6W4X$R");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: ~
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      byte[] byteArray0 = new byte[6];
      ByteString byteString1 = ByteString.of(byteArray0);
      int int0 = byteString0.EMPTY.indexOf(byteString1, 63);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
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
  public void test080()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("6@|I3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex string: 6@|I3
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("<2ce*<sG0twp14kaQ");
      assertNull(byteString0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
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
  public void test083()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      HashingSource hashingSource0 = HashingSource.md5(realBufferedSource0);
      ByteString byteString0 = hashingSource0.hash();
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
  public void test084()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("K]_hNP;'}d)pB re>%", charset0);
      String string0 = byteString0.string(charset0);
      assertEquals("K]_hNP;'}d)pB re>%", string0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("X3lgfHfrLt+{");
      String string0 = byteString0.toString();
      assertEquals("[hex=58336c676648667f724c742b7b]", string0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.utf8();
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.encodeString("", (Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
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
  public void test089()  throws Throwable  {
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
  public void test090()  throws Throwable  {
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
  public void test091()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.of((byte[]) null, 642, (-2469));
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
      // Undeclared exception!
      try { 
        ByteString.of(byteArray0, 439, (int) (byte) (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=9 offset=439 byteCount=-1
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
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
  public void test094()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("K]_hNP;'}d)pB re>%", charset0);
      byte byte0 = byteString0.getByte(12);
      assertEquals((byte)66, byte0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      int int0 = byteString0.indexOf(byteString0, 745);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("");
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
  public void test097()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = ByteString.of(byteArray0);
      Pipe pipe0 = new Pipe((byte)105);
      Buffer buffer0 = pipe0.buffer;
      byteString0.write(buffer0);
      assertEquals(0L, buffer0.completeSegmentByteCount());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.substring((int) (byte)3);
      assertEquals(3, byteString1.size());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.indexOf(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.sha512();
      assertEquals(64, byteString1.size());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteBuffer byteBuffer0 = byteString0.EMPTY.asByteBuffer();
      assertEquals(0, byteBuffer0.remaining());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.md5();
      assertNotSame(byteString0, byteString1);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = ByteString.of(byteArray0);
      String string0 = byteString0.base64Url();
      assertEquals("AAAA", string0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
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
  public void test105()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.lastIndexOf(byteString0, 9);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = ByteString.of(byteArray0);
      boolean boolean0 = byteString0.EMPTY.startsWith(byteString0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.EMPTY.hmacSha256(byteString0);
      assertFalse(byteString1.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("data == null");
      String string0 = byteString0.base64();
      assertEquals("ZGF0YSA9PSBudWxs", string0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("data == null");
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = byteString0.endsWith(byteArray0);
      assertEquals(12, byteString0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("data == null");
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = byteString0.EMPTY.startsWith(byteArray0);
      assertEquals(12, byteString0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("HmacSHA512");
      assertNotNull(byteString0);
      
      byte[] byteArray0 = new byte[0];
      int int0 = byteString0.lastIndexOf(byteArray0);
      assertEquals(7, int0);
  }
}
