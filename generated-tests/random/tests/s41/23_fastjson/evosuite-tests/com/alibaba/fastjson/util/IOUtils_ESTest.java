/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 02:13:55 GMT 2019
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.StringReader;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("f$B%-fj8xV");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("l|&zbdh.XZYz+");
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = IOUtils.stringSize(1000L);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = IOUtils.stringSize(0L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = IOUtils.stringSize((-117L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = IOUtils.stringSize((-311));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-2540L), (-656), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -657
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(60, 827, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 826
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.encodeUTF8(iOUtils0.replaceChars, (-1), (-1), iOUtils0.specicalFlags_singleQuotes);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = new char[6];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, 0, charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 714, (-3266));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2553
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      Charset charset0 = uTF8Decoder0.charset();
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      ByteBuffer byteBuffer0 = charset0.encode("fastjson.compatibleWithJavaBean");
      CharBuffer charBuffer0 = CharBuffer.allocate(3984);
      IOUtils.decode(charsetDecoder0, byteBuffer0, charBuffer0);
      assertFalse(charsetDecoder0.isAutoDetecting());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)83, (int) (byte)83, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 82
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8((char[]) null, 3, 3, byteArray0);
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
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("com.alibaba.fastjson.JSONException", 18, 614);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('#');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('C');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<Z\"`8hev\"$0<.-nO");
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("<Z\"`8hev\"$0<.-nO", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte) (-12);
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)4, (byte)4, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-10);
      char[] charArray0 = new char[0];
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, 1, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-26);
      char[] charArray0 = new char[7];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)0, 121, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-64);
      char[] charArray0 = new char[7];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, 68, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[4] = (byte) (-35);
      char[] charArray0 = new char[1];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)4, (byte)120, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(iOUtils0.specicalFlags_singleQuotes, 3, 1722, iOUtils0.replaceChars);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 93
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.JSONException");
      char[] charArray0 = new char[4];
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, 244, charArray0);
      assertEquals(25, byteArray0.length);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.JSONException");
      char[] charArray0 = new char[4];
      int int0 = IOUtils.decodeUTF8(byteArray0, (-487), (-487), charArray0);
      assertEquals(25, byteArray0.length);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[9];
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 4, 4, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("`0V[|G=");
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("O");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 3, 2, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 54, 54, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 54
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("{W67F!M@");
      char[] charArray0 = new char[3];
      int int0 = IOUtils.encodeUTF8(charArray0, 0, 1, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-82), (byte) (-59), (byte) (-4)}, byteArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((String) null, (-2066), (-2066));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("S']kf)%!A4.U", 2, 2);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("", 0, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("o@bH_2-Pg%}%bCQj68D", 1, 9);
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 10, 10);
      assertArrayEquals(new byte[] {(byte) (-45), (byte) (-99), (byte)58, (byte) (-45), (byte) (-67), (byte)60, (byte) (-45)}, byteArray0);
      assertEquals(7, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[1] = 'N';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 2, 1);
      int int0 = IOUtils.encodeUTF8(charArray0, 2, (-1281), byteArray0);
      assertEquals(0, int0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 1, 2716);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, (-2900), 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2900
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[9];
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 0, 0);
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 256, 55296, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 256
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 2, 1);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("fastjson.properties");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('&');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('U');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(30);
      char[] charArray0 = new char[7];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.charset.CoderResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int int0 = IOUtils.stringSize(42);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      char[] charArray0 = new char[3];
      IOUtils.getChars((byte) (-27), 3, charArray0);
      assertArrayEquals(new char[] {'-', '2', '7'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-107), 1, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      char[] charArray0 = new char[8];
      IOUtils.getChars((byte)29, 4, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '2', '9', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[8];
      IOUtils.getChars(1, 1, charArray0);
      assertArrayEquals(new char[] {'1', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-3522), 4, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2146180563, (-1710), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1711
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars(10000000L, 40, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 39
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.getChars(100000000000L, 7, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-700L), 3, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      char[] charArray0 = new char[2];
      IOUtils.getChars(4L, 1, charArray0);
      assertArrayEquals(new char[] {'4', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = IOUtils.getStringProperty("{W67F!M@");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(iOUtils0.specicalFlags_singleQuotes);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      IOUtils.close(dataInputStream0);
  }
}
