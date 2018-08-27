/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 18:42:34 GMT 2018
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.Closeable;
import java.io.ObjectStreamConstants;
import java.io.PipedReader;
import java.io.StringReader;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.encodeUTF8(iOUtils0.DIGITS, 1, 1, iOUtils0.specicalFlags_doubleQuotes);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.getChars((-207L), 65536, iOUtils0.replaceChars);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 65535
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = ObjectStreamConstants.baseWireHandle;
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) 8257536, 8257536, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8257535
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      char[] charArray0 = new char[13];
      IOUtils.getChars((long) 1, 1, charArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('i');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = IOUtils.stringSize(2843);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("UTF-8");
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-1)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("S(");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.properties");
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.compatibleWithJavaBean", 0, 0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 12, 12);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.replaceChars, 16, 16);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars(2, 2, iOUtils0.CA);
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.replaceChars, 2, 2);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.getChars((-2357), (-2357), iOUtils0.DIGITS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2358
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 0, 0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      IOUtils.close(pipedReader0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode("fastjson.properties");
      CharBuffer charBuffer0 = iOUtils0.UTF8.decode(byteBuffer0);
      IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
      assertEquals(0, byteBuffer0.arrayOffset());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("S(");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("r");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("Uj.agX81lX+");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.replaceChars, (-2835), (-2835));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5671
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.alibaba.fastjson.JSONException");
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("com.alibaba.fastjson.JSONException", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = 10;
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 10, 10);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = IOUtils.getStringProperty("S(");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('\u00A1');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = 10;
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 10, 10);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64(":e.!gbWD,Z0kM@hP;ck%");
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("a");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.compatibleWithJavaBean", 2, 2);
      assertArrayEquals(new byte[] {(byte) (-78)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      byte[] byteArray0 = IOUtils.decodeBase64("?XubNvd", 1, 1);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IOUtils.stringSize(2147483695L);
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars(10, 10, iOUtils0.CA);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-110), 1, iOUtils0.CA);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZbcdefghijklmopqrstuvwxyz023456789+/");
      char[] charArray0 = new char[6];
      int int0 = IOUtils.decodeUTF8(byteArray0, 20, 20, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(iOUtils0.specicalFlags_singleQuotes, 36, 36, iOUtils0.DIGITS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGIJKLMsOPQRSTUVWXYZbcdefghijklmopqrstuvwxyz023456789+/");
      char[] charArray0 = new char[17];
      int int0 = IOUtils.decodeUTF8(byteArray0, 20, 20, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("P~T/ko5OE'");
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      char[] charArray0 = new char[2];
      int int1 = IOUtils.decodeUTF8(byteArray0, 1, 1, charArray0);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-12), (byte) (-1), (byte) (-110), (byte) (-114), (byte)78}, byteArray0);
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("P~T/ko5OE'");
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      char[] charArray0 = new char[2];
      int int1 = IOUtils.decodeUTF8(byteArray0, 1, 20, charArray0);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-12), (byte) (-1), (byte) (-110), (byte) (-114), (byte)78}, byteArray0);
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((-543L), 11, iOUtils0.ASCII_CHARS);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      iOUtils0.UTF8.encode("fastjson.properties");
      IOUtils.decodeBase64("fastjson.compatibleWithFieldName");
      IOUtils.getChars((byte)2, (int) (byte)2, iOUtils0.ASCII_CHARS);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = ObjectStreamConstants.baseWireHandle;
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.getChars(8257536, 8257536, iOUtils0.CA);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8257535
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 16, 76);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode("fastjson.compatibleWithFieldName");
      CharBuffer charBuffer0 = iOUtils0.UTF8.decode(byteBuffer0);
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer1 = iOUtils0.UTF8.encode(charBuffer0);
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
  public void test46()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      byte[] byteArray0 = IOUtils.decodeBase64(">?4Q&>fcLy7+@,!'@", 1, 1);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int int0 = (-687);
      int int1 = ObjectStreamConstants.baseWireHandle;
      IOUtils.stringSize((long) 8257536);
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483651L, 8257536, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8257535
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.replaceChars, 11, 11);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.decodeUTF8(iOUtils0.specicalFlags_singleQuotes, (byte)64, (byte)64, iOUtils0.ASCII_CHARS);
      assertEquals(64, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("BMMxlVXF;[0E|g1f", 8, 8);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-32), (byte) (-43)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_singleQuotes;
      char[] charArray0 = new char[9];
      charArray0[0] = '\u00C8';
      charArray0[1] = '\u00C8';
      charArray0[8] = '\u00C8';
      charArray0[3] = '\u00C8';
      IOUtils.getChars((long) 6, 6, charArray0);
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 6, 6, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 10, 10);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("rr#.AvwQ{ix9V,K@=");
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[25];
      byteArray0[1] = (byte)14;
      byteArray0[2] = (byte)14;
      byteArray0[4] = (byte)0;
      byteArray0[8] = (byte) (-30);
      char[] charArray0 = new char[4];
      int int0 = IOUtils.decodeUTF8(byteArray0, 7, (byte)14, charArray0);
      assertEquals((-1), int0);
      
      int int1 = IOUtils.encodeUTF8(charArray0, (byte)14, (byte)0, byteArray0);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-30);
      byteArray0[1] = (byte) (-47);
      char[] charArray0 = new char[1];
      charArray0[0] = '_';
      IOUtils.decodeUTF8(byteArray0, 0, 2, charArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGHIJKwMNOPQRSTUVWXY!abcdefghijklmnopqrstuvwxyz0123456789+/");
      char[] charArray0 = new char[7];
      int int0 = IOUtils.decodeUTF8(byteArray0, 10, 9, charArray0);
      assertArrayEquals(new char[] {'\u04CF', 'A', '\u0014', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      boolean boolean0 = IOUtils.firstIdentifier('\u010C');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('\u010E');
      assertFalse(boolean0);
  }
}