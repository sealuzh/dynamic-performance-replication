/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 15:38:27 GMT 2018
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.CharArrayReader;
import java.io.Closeable;
import java.io.ObjectStreamConstants;
import java.io.StringReader;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("*a1f[yyUC");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("h6k5p3I$Dze'sf");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = IOUtils.stringSize(682L);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.loadPropertiesFromFile();
      int int0 = IOUtils.decodeUTF8(iOUtils0.specicalFlags_singleQuotes, 76, 76, iOUtils0.ASCII_CHARS);
      assertEquals(76, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('7');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.getChars((-498L), (-2570), iOUtils0.CA);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2571
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((long) 7, 7, iOUtils0.ASCII_CHARS);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars(42, 42, iOUtils0.ASCII_CHARS);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = IOUtils.stringSize(26);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.encodeUTF8(iOUtils0.ASCII_CHARS, 7, 7, iOUtils0.specicalFlags_singleQuotes);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-26), (int) (byte) (-26), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Charset charset0 = IOUtils.UTF8;
      ByteBuffer byteBuffer0 = charset0.encode("H\"S");
      CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
      assertEquals(0, charBuffer0.arrayOffset());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.JSONException", 0, 0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("'F;1<{C", (-2505), (-2505));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, (-2), (-2));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("r5{@wA");
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-1), (byte) (-64)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64(".!2T^/a");
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-1)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("sB!h!TbQ");
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-31), (byte) (-3), (byte)54, (byte) (-48)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)0, 36, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((byte)49, 79, iOUtils0.replaceChars);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[10];
      charArray0[2] = 'z';
      charArray0[3] = '[';
      int int0 = IOUtils.stringSize((long) (byte)7);
      assertEquals(1, int0);
      
      IOUtils.getChars((byte) (-35), (int) (byte)7, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', 'z', '[', '-', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-32);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      char[] charArray0 = new char[0];
      byte[] byteArray1 = IOUtils.decodeBase64(charArray0, (int) (byte)0, (int) (byte)0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1), (-1), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.util.UTF8Decoder", 13, 13);
      assertArrayEquals(new byte[] {(byte)106, (byte) (-53), (byte)99, (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-70), (byte) (-40), (byte) (-91)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      Charset charset0 = IOUtils.UTF8;
      ByteBuffer byteBuffer0 = charset0.encode("]Q#DMD+yMoL1=&");
      CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = charset0.encode(charBuffer0);
      // Undeclared exception!
      try { 
        IOUtils.decode(uTF8Decoder0, byteBuffer1, charBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.charset.CoderResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[7];
      byte[] byteArray0 = IOUtils.decodeBase64("E9AwZ!mHOnv2");
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)7, (byte)7, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IOUtils.stringSize((-1280L));
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1280L), 1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = IOUtils.stringSize((-2649L));
      assertEquals(1, int0);
      
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 1, 1);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("gf0N]=Gs)BbB&E");
      assertArrayEquals(new byte[] {(byte) (-127), (byte) (-3), (byte)13, (byte) (-4), (byte)1, (byte) (-84), (byte) (-4), (byte)22, (byte) (-63), (byte) (-4)}, byteArray0);
      
      StringReader stringReader0 = new StringReader("com.alibaba.fastjson.util.UTF8Decoder");
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("com.alibaba.fastjson.util.UTF8Decoder", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("H");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 966, 966, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 966
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IOUtils.getStringProperty("C0R`4w]t ]OY");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483647L, 1362, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1361
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("4");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("pl.~OZ4e-jtW");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      char[] charArray0 = new char[7];
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte)86;
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 0, 153, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[8];
      IOUtils.getChars((byte)7, (int) (byte)7, charArray0);
      byte[] byteArray0 = IOUtils.decodeBase64("E9wZ!mHOnv2");
      assertArrayEquals(new byte[] {(byte)19, (byte) (-36), (byte)25, (byte) (-2), (byte)97, (byte) (-50), (byte) (-98), (byte) (-3)}, byteArray0);
      
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)7, (byte)7, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '7', '\u0000'}, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("]Q#DMD+yMoL1=&", 2, 81);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_singleQuotes;
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.loadPropertiesFromFile();
      CharArrayReader charArrayReader0 = new CharArrayReader(iOUtils0.DIGITS);
      IOUtils.close(charArrayReader0);
      IOUtils.getChars((-2388), 55, iOUtils0.replaceChars);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-32);
      char[] charArray0 = new char[0];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)0, 144, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", 13, 13);
      char[] charArray0 = new char[2];
      IOUtils.decodeUTF8(byteArray0, 0, 21, charArray0);
      IOUtils iOUtils0 = new IOUtils();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_singleQuotes;
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((-1459L), 7, iOUtils0.ASCII_CHARS);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int int0 = IOUtils.stringSize((-2649L));
      assertEquals(1, int0);
      
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 1, 85);
      assertNotNull(byteArray0);
      
      int int1 = IOUtils.decodeUTF8(byteArray0, 1, 47, iOUtils0.replaceChars);
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.CA, 50, 9);
      byte[] byteArray1 = IOUtils.decodeBase64("fastjson.compatibleWithJavaBean");
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      IOUtils.decodeBase64("");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(100000000000000L, 191, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 190
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (int) (byte)7, (int) (byte)7);
      assertArrayEquals(new byte[] {(byte)28, (byte) (-126), (byte)74, (byte)44, (byte) (-61)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      IOUtils.isIdent('\u00FB');
      char[] charArray0 = new char[2];
      charArray0[0] = '\u00FB';
      charArray0[1] = '\u00FB';
      // Undeclared exception!
      try { 
        IOUtils.getChars((-2147483646), 1693, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1692
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("+eK2f~_IK=>\"");
      assertArrayEquals(new byte[] {(byte) (-7), (byte) (-30), (byte) (-74), (byte) (-1), (byte) (-1), (byte) (-56)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-26);
      byteArray0[3] = (byte) (-96);
      byteArray0[6] = (byte) (-26);
      char[] charArray0 = new char[8];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, 95, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[5] = '\u0099';
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte)86;
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 2, 153, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      IOUtils.firstIdentifier('i');
      char[] charArray0 = new char[4];
      charArray0[0] = 'i';
      charArray0[1] = 'i';
      charArray0[2] = 'N';
      charArray0[3] = 'i';
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 46, 46, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 48
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-32);
      byteArray0[1] = (byte) (-32);
      char[] charArray0 = new char[9];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, 2, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      int int0 = IOUtils.stringSize((-2649L));
      assertEquals(1, int0);
      
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 1, 83);
      int int1 = IOUtils.decodeUTF8(byteArray0, 53, 144, iOUtils0.ASCII_CHARS);
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)58;
      byteArray0[4] = (byte)58;
      byteArray0[6] = (byte)3;
      byteArray0[7] = (byte) (-50);
      char[] charArray0 = new char[6];
      charArray0[0] = '7';
      charArray0[1] = 'S';
      charArray0[2] = '<';
      charArray0[4] = 'w';
      charArray0[5] = 'v';
      IOUtils.decodeUTF8(byteArray0, (byte)5, (byte)3, charArray0);
      IOUtils iOUtils0 = new IOUtils();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      IOUtils.isIdent(')');
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)45;
      byteArray0[1] = (byte) (-70);
      byteArray0[2] = (byte) (-2);
      byteArray0[3] = (byte) (-64);
      char[] charArray0 = new char[1];
      charArray0[0] = ')';
      IOUtils.decodeUTF8(byteArray0, 3, 969, charArray0);
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      int int0 = ObjectStreamConstants.baseWireHandle;
      IOUtils.firstIdentifier('\u010D');
      boolean boolean0 = IOUtils.firstIdentifier('\u010D');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      IOUtils.isIdent('\u0108');
      char[] charArray0 = new char[7];
      charArray0[0] = '\u0108';
      charArray0[1] = '\u0108';
      charArray0[2] = '\u0108';
      charArray0[3] = '\u0108';
      charArray0[4] = '\u0108';
      charArray0[5] = '\u0108';
      charArray0[6] = '\u0108';
      // Undeclared exception!
      try { 
        IOUtils.getChars(0L, 30, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 29
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("]Q;DMD+yMoL1=&", 7, 7);
      assertArrayEquals(new byte[] {(byte) (-56), (byte) (-54), (byte)11}, byteArray0);
  }
}