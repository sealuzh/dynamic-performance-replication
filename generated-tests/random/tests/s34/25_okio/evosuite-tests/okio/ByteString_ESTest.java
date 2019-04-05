/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 19:47:40 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.Buffer;
import okio.ByteString;
import okio.HashingSink;
import okio.HashingSource;
import okio.Pipe;
import okio.Source;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ByteString_ESTest extends ByteString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "SHA-512";
      ByteString byteString0 = ByteString.decodeBase64("SHA-512");
      byteString0.EMPTY.asByteBuffer();
      byteString0.EMPTY.hashCode();
      ByteString byteString1 = ByteString.decodeBase64("SHA-512");
      byteString0.compareTo(byteString1);
      ByteString byteString2 = byteString0.md5();
      byteString2.EMPTY.endsWith(byteString1);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)38;
      byteArray0[1] = (byte) (-79);
      byteArray0[2] = (byte)74;
      byteString0.indexOf(byteArray0, (int) (byte)38);
      byteString1.startsWith(byteString2);
      // Undeclared exception!
      try { 
        HashingSource.sha256((Source) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // delegate == null
         //
         verifyException("okio.ForwardingSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.EMPTY.toAsciiLowercase();
      assertNotSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("rO'L");
      ByteBuffer byteBuffer0 = byteString0.EMPTY.asByteBuffer();
      ByteString byteString1 = ByteString.of(byteBuffer0);
      assertNotSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = ByteString.encodeUtf8("okio.Util");
      int int0 = byteString1.lastIndexOf(byteString0);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = new ByteString(byteArray0);
      byte[] byteArray1 = byteString0.internalArray();
      assertSame(byteArray0, byteArray1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      String string0 = byteString0.base64();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = ByteString.of(byteArray0);
      Pipe pipe0 = new Pipe(1867L);
      Buffer buffer0 = pipe0.buffer;
      byteString0.EMPTY.write(buffer0);
      assertEquals(0L, buffer0.completeSegmentByteCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(49);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = byteString0.startsWith(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = ByteString.of(byteArray0);
      boolean boolean0 = byteString0.rangeEquals((-559), byteArray0, 26, (int) (byte) (-119));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("%s: actual 0x%08x != expected 0x%08x");
      boolean boolean0 = byteString0.rangeEquals((-1292), byteString0, 156, 156);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        ByteString.of(byteArray0, (-4650), 14);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=6 offset=-4650 byteCount=14
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0, 0, 0);
      assertEquals(0, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.EMPTY.lastIndexOf(byteArray0, (-32));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[4];
      ByteString byteString0 = new ByteString(byteArray1);
      int int0 = byteString0.EMPTY.lastIndexOf(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.indexOf(byteArray0, (-876));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.EMPTY.indexOf(byteString0, (-102));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.indexOf(byteString0, (int) (byte)105);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = ByteString.encodeUtf8("S4+@kxUe@h+");
      int int0 = byteString0.EMPTY.indexOf(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      assertEquals(0, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      assertNotNull(byteString0);
      
      int int0 = byteString0.indexOf(byteString0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("a*>r^XE=cY'wO(6&*", (byte) (-99));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      // Undeclared exception!
      try { 
        byteString0.EMPTY.hmacSha256(byteString0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.lastIndexOf(byteArray0, 1579);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("rO'L");
      byte[] byteArray0 = new byte[3];
      int int0 = byteString0.lastIndexOf(byteArray0, (int) (byte)26);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("UEPTej3MT>UAn");
      byte[] byteArray0 = new byte[5];
      int int0 = byteString0.indexOf(byteArray0, 4);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.hex();
      //  // Unstable assertion: assertEquals("888888", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      boolean boolean0 = byteString0.rangeEquals((-1322), byteString0, 109, 120);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("endIndex > string.length: ");
      // Undeclared exception!
      try { 
        byteString0.getByte((byte)97);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      int int0 = byteString0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      ByteString byteString0 = new ByteString((byte[]) null);
      // Undeclared exception!
      try { 
        HashingSink.hmacSha1(buffer0, byteString0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-119);
      ByteString byteString0 = ByteString.of(byteArray0);
      String string0 = byteString0.toString();
      assertEquals("[hex=8900000000]", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("\r", 18);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)10;
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.toString();
      assertEquals("[hex=0a0000]", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("[size=0]", (byte)1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("rEDZ}UL/,XT*'Nc|e/$", charset0);
      String string0 = byteString0.toString();
      assertEquals("[text=rEDZ}UL/,XT*'Nc|e/$]", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("SBf=[h!MMmdr{gw(k'", charset0);
      String string0 = byteString0.EMPTY.toString();
      assertEquals("[size=0]", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("");
      byte[] byteArray0 = new byte[2];
      ByteString byteString1 = new ByteString(byteArray0);
      int int0 = byteString0.compareTo(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("endIndex > string.length: ");
      ByteString byteString1 = ByteString.EMPTY;
      int int0 = byteString0.compareTo(byteString1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)65;
      ByteString byteString0 = ByteString.of(byteArray0);
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString1 = ByteString.encodeString(".outputStream()", charset0);
      int int0 = byteString0.compareTo(byteString1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = ByteString.of(byteArray0);
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString1 = ByteString.encodeString(".outputStream()", charset0);
      int int0 = byteString0.compareTo(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = ByteString.of(byteArray0);
      byteString0.EMPTY.hashCode();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteString byteString0 = new ByteString(byteArray0);
      boolean boolean0 = byteString0.EMPTY.equals(byteString0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(49);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      ByteString byteString1 = ByteString.encodeUtf8("");
      boolean boolean0 = byteString0.EMPTY.equals(byteString1);
      assertFalse(byteString1.equals((Object)byteString0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("F<`h!/!5*", charset0);
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), (byte) (-10));
      boolean boolean0 = byteString0.equals(byteArrayInputStream0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = ByteString.of(byteArray0);
      boolean boolean0 = byteString0.rangeEquals((-3678), byteArray0, (int) (byte) (-94), (-64));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = ByteString.of(byteArray0);
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
  public void test46()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.substring(0);
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("%s: actual 0x%08x != expected 0x%08x");
      ByteString byteString1 = byteString0.substring(1, 1);
      assertEquals(0, byteString1.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteString byteString0 = ByteString.of(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.EMPTY.substring(0, 4314);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > length(0)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.substring((-1203));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.sha512();
      ByteString byteString2 = byteString1.toAsciiUppercase();
      assertNotSame(byteString2, byteString1);
      assertFalse(byteString2.equals((Object)byteString1));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("UEPTej3MT>UAn");
      ByteString byteString1 = byteString0.toAsciiUppercase();
      int int0 = byteString1.lastIndexOf(byteString0, (int) (byte)54);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.EMPTY.toAsciiUppercase();
      assertEquals(0, byteString1.size());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)105;
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.toAsciiLowercase();
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      ByteString byteString1 = byteString0.EMPTY.sha256();
      ByteString byteString2 = byteString1.toAsciiLowercase();
      assertNotSame(byteString2, byteString1);
      assertFalse(byteString2.equals((Object)byteString1));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        ByteString.read(byteArrayInputStream0, (byte)59);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        ByteString.read(byteArrayInputStream0, (byte) (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -1
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.read((InputStream) null, (-960));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // in == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1762, (-2807));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      try { 
        ByteString.read(bufferedInputStream0, 1831);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("data == null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: t
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("Expected leading [0-9a-fA-F] character but was %#x");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: x
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("D6");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(56319);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0);
      byteString0.EMPTY.write(bufferedOutputStream0);
      assertEquals(1, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("out == null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex string: out == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
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
  public void test64()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = ByteString.of(byteArray0);
      String string0 = byteString0.EMPTY.hex();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("%s: actual 0x%08x != expected 0x%08x");
      assertNull(byteString0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
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
  public void test67()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
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
  public void test68()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      Charset charset0 = Charset.defaultCharset();
      String string0 = byteString0.string(charset0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("SHA-1", charset0);
      String string0 = byteString0.utf8();
      assertEquals("SHA-1", string0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      String string0 = byteString0.utf8();
      //  // Unstable assertion: assertEquals("UEPTej3MT>UAn", string0);
      //  // Unstable assertion: assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.encodeString("7Fm=rSn=J", (Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
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
  public void test73()  throws Throwable  {
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
  public void test74()  throws Throwable  {
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
  public void test75()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.of((byte[]) null, (-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // data == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        ByteString.of(byteArray0, 1492, (int) (byte) (-10));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=3 offset=1492 byteCount=-10
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
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
  public void test78()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("UEPTej3MT>UAn");
      boolean boolean0 = byteString0.endsWith(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = byteString0.hmacSha512(byteString0);
      assertEquals(64, byteString1.size());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("SHA-1", charset0);
      Buffer buffer0 = new Buffer();
      byteString0.write(buffer0);
      assertFalse(buffer0.exhausted());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = ByteString.of(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.substring(85);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("F<`h!/!5*", charset0);
      byte[] byteArray0 = new byte[3];
      int int0 = byteString0.indexOf(byteArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = ByteString.of(byteArray0);
      String string0 = byteString0.base64Url();
      assertEquals("AAAAAA==", string0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      // Undeclared exception!
      try { 
        byteString0.EMPTY.hmacSha1(byteString0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      int int0 = byteString0.lastIndexOf(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("UEPTej3MT>UAn");
      int int0 = byteString0.lastIndexOf(byteString0, (int) (byte)54);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      boolean boolean0 = byteString0.startsWith(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("UEPTej3MT>UAn");
      ByteString byteString1 = byteString0.hmacSha256(byteString0);
      assertNotSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.EMPTY.sha1();
      ByteString byteString2 = byteString0.EMPTY.hmacSha1(byteString1);
      assertNotSame(byteString2, byteString0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.base64();
      assertEquals("AAAAAA==", string0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("UEPTej3MT>UAn");
      byte[] byteArray0 = new byte[5];
      boolean boolean0 = byteString0.endsWith(byteArray0);
      assertFalse(boolean0);
      assertEquals(14, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[5];
      boolean boolean0 = byteString0.startsWith(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      int int0 = byteString0.EMPTY.indexOf(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[7];
      int int0 = byteString0.lastIndexOf(byteArray0);
      assertEquals((-1), int0);
  }
}
