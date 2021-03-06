/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 22:28:14 GMT 2019
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.Closeable;
import java.io.PipedReader;
import java.io.StringReader;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)44;
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)0, (byte)44, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)14;
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)0, (byte)44, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("4?");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = IOUtils.stringSize((-1326L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = IOUtils.stringSize((-2));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) 0, 1510, iOUtils0.CA);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1509
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-107), (int) (byte) (-107), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -108
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)110, (-3132), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3133
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('8');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("sc{0qz(D,,t&fDtw?{$");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (-3800), 1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3800
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("b?*i'H*~%-Xx_lOdM");
      IOUtils.close(mockPrintWriter0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      // Undeclared exception!
      try { 
        IOUtils.readAll(pipedReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // read string from reader error
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 192, 192, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 127, 33);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 127
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("utf8 decode error, ", 4, (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("read string from reader error");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("com.alibaba.fastjson.JSONException");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("fastjson.compatibleWithFieldName");
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("fastjson.compatibleWithFieldName", string0);
      
      String string1 = IOUtils.readAll(stringReader0);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte) (-23);
      char[] charArray0 = new char[8];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)1, 240, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte) (-38);
      char[] charArray0 = new char[9];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)2, (byte)5, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      char[] charArray0 = new char[3];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)127, (-2147483645), charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("utf8 decode error, ");
      char[] charArray0 = new char[4];
      int int0 = IOUtils.decodeUTF8(byteArray0, 4, 4, charArray0);
      assertEquals(12, byteArray0.length);
      assertArrayEquals(new char[] {'\u05DC', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.util.IOUtils$1", 1, 1);
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 1, 1, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(iOUtils0.ASCII_CHARS, 65, 65, iOUtils0.specicalFlags_doubleQuotes);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 96
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[8];
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, (-1060), 109, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1060
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[2];
      byte[] byteArray0 = new byte[8];
      int int0 = IOUtils.encodeUTF8(charArray0, 202, (-458), byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("LVP&Pc=&(");
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("^P/.pROq");
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("Y");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", 3, 3);
      assertArrayEquals(new byte[] {(byte)12, (byte)65}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("J'D", 1, 1);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("UTF-8", 3, 3);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("^P/.pROq", (-2278), (-2278));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("read string from reader error", 0, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.JSONException", 18, (int) (byte)4);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[1] = 'I';
      charArray0[5] = 'I';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 1, 6);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 1, 6);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[4];
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 1, 1);
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 1, 16, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[1];
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 1073741824, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 2, 2);
      assertArrayEquals(new byte[] {(byte) (-45)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('{');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('z');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('{');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('v');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(78);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "o");
      char[] charArray0 = new char[2];
      CharBuffer charBuffer1 = CharBuffer.wrap(charArray0);
      charBuffer0.read(charBuffer1);
      // Undeclared exception!
      try { 
        IOUtils.decode(charsetDecoder0, byteBuffer0, charBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.charset.CoderResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      Charset charset0 = IOUtils.UTF8;
      ByteBuffer byteBuffer0 = charset0.encode("");
      CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
      IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
      assertFalse(charBuffer0.hasRemaining());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      int int0 = IOUtils.stringSize(274);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[6];
      IOUtils.getChars((byte)4, (int) (byte)4, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '4', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      char[] charArray0 = new char[8];
      IOUtils.getChars((byte) (-90), 4, charArray0);
      assertArrayEquals(new char[] {'\u0000', '-', '9', '0', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.getChars(999999, 999999, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 999998
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[6];
      IOUtils.getChars((-32), 4, charArray0);
      assertArrayEquals(new char[] {'\u0000', '-', '3', '2', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      char[] charArray0 = new char[7];
      IOUtils.getChars(3, 1, charArray0);
      assertArrayEquals(new char[] {'3', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      char[] charArray0 = new char[7];
      IOUtils.getChars((-3308L), 6, charArray0);
      assertArrayEquals(new char[] {'\u0000', '-', '3', '3', '0', '8', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483647L, (-1681), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1682
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483674L, (-1681), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1682
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1L), 256, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 255
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      int int0 = IOUtils.stringSize(453L);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      int int0 = IOUtils.stringSize(0L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String string0 = IOUtils.getStringProperty("fastjson.compatibleWithJavaBean");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((long) 1, 2, iOUtils0.CA);
  }
}
