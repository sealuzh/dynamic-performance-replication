/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 08:15:36 GMT 2019
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.CharArrayReader;
import java.io.Closeable;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)2;
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)2, (byte)57, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = IOUtils.stringSize(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = IOUtils.stringSize((-1100));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) 1, 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars(0L, (-1340), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1341
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.getChars(29, 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('2');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('A');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      char[] charArray0 = new char[2];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)3, (-3775), charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      CharArrayReader charArrayReader0 = new CharArrayReader(iOUtils0.replaceChars, 20, 2521);
      charArrayReader0.close();
      // Undeclared exception!
      try { 
        IOUtils.readAll(charArrayReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // read string from reader error
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)6, (byte)86, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((char[]) null, (-286), (-286));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((String) null, (-32), (-2274));
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
  public void test15()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('-');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('h');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("com.alibaba.fastjson.JSONException");
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
      IOUtils iOUtils0 = new IOUtils();
      CharArrayReader charArrayReader0 = new CharArrayReader(iOUtils0.replaceChars);
      String string0 = IOUtils.readAll(charArrayReader0);
      //  // Unstable assertion: assertEquals("\u0000\u0000\u0000\u00004567btnvfr\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\"\u0000\u0000\u0000\u0000'\u0000\u0000\u0000\u0000\u0000\u0000\u0000/\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u000066\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00007\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\\", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-16);
      char[] charArray0 = new char[9];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)0, (byte)43, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[4] = (byte) (-128);
      char[] charArray0 = new char[6];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)2, (byte)57, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 15, 1497, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("zX#MVu<o");
      assertEquals(6, byteArray0.length);
      
      char[] charArray0 = new char[6];
      int int0 = IOUtils.decodeUTF8(byteArray0, 2, 58, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(iOUtils0.replaceChars, 1, 1, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[1] = '/';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 1, 2);
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 1051, 1, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1051
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.encodeUTF8(iOUtils0.ASCII_CHARS, 20, 20, iOUtils0.specicalFlags_singleQuotes);
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[1];
      byte[] byteArray0 = new byte[8];
      int int0 = IOUtils.encodeUTF8(charArray0, 0, 0, byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("r=");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("K04&");
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64(" !_Fp(_Sts");
      assertEquals(5, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("i");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      char[] charArray0 = new char[1];
      int int0 = IOUtils.decodeUTF8(byteArray0, 1440, 0, charArray0);
      assertEquals(0, byteArray0.length);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.compatibleWithJavaBean", 1, 1);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("K:Sm~3M6q]i*|8fTo`", 0, 12);
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("_4sZ!IaB ", 4, 4);
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("='5/", 1, 1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("", 0, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 32, 32);
      //  // Unstable assertion: assertEquals(18, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '=';
      charArray0[1] = '=';
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 0, 2);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '=';
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[7];
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 0, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 3, 3);
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
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("7[aiSU}HF8gX(*rc");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier(';');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(19);
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
  public void test47()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(20);
      CharBuffer charBuffer0 = CharBuffer.wrap(iOUtils0.ASCII_CHARS, 20, 36);
      IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
      assertEquals(20, byteBuffer0.capacity());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int int0 = IOUtils.stringSize(1180);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      char[] charArray0 = new char[4];
      IOUtils.getChars((byte)107, 3, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'4', '-', '7', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      char[] charArray0 = new char[4];
      IOUtils.getChars((byte) (-24), 3, charArray0);
      assertArrayEquals(new char[] {'-', '2', '4', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-73), 1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)118, (-1373), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1374
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-2823), 4, charArray0);
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
        IOUtils.getChars((-2092419963), (-2092419963), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2092419964
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[1];
      IOUtils.getChars(1L, 1, charArray0);
      assertArrayEquals(new char[] {'1'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483647L, 82, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 81
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483670L, 82, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 81
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1568L), 4, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) 4, 1180, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      int int0 = IOUtils.stringSize(4215L);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      int int0 = IOUtils.stringSize((-1L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("fastjson.properties");
      IOUtils.close(mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String string0 = IOUtils.getStringProperty("utf8 decode error, ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars(66, 66, iOUtils0.ASCII_CHARS);
  }
}
