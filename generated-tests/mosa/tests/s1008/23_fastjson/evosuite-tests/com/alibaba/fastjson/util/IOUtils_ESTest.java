/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 23:58:16 GMT 2018
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
import java.io.PipedInputStream;
import java.io.StringReader;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.getChars(83, 83, iOUtils0.DIGITS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 82
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = IOUtils.stringSize(122);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[1];
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, (-516), (int) '\u0000');
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)7, (int) (byte)7, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-49), (-49), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -50
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1L), (-2663), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2664
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      CharArrayReader charArrayReader0 = new CharArrayReader(iOUtils0.replaceChars);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      IOUtils.getChars((long) 1, 1, iOUtils0.ASCII_CHARS);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      iOUtils0.UTF8.newDecoder();
      int int0 = IOUtils.encodeUTF8(iOUtils0.ASCII_CHARS, 12, 12, iOUtils0.specicalFlags_doubleQuotes);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.decodeUTF8(iOUtils0.specicalFlags_doubleQuotes, 2, 2, iOUtils0.CA);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64(",p180`ECw");
      assertArrayEquals(new byte[] {(byte) (-89), (byte)95, (byte)52, (byte) (-4), (byte)64, (byte) (-80)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      StringReader stringReader0 = new StringReader("encodeUTF8 error");
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("encodeUTF8 error", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-24), (int) (byte) (-24), iOUtils0.replaceChars);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -25
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("fJN*i<H\"}0{;C*=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('~');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      IOUtils.close(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 40, 40);
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("<\".vRki8>YE&");
      assertArrayEquals(new byte[] {(byte) (-67), (byte)25, (byte)34, (byte) (-1), (byte) (-10), (byte)4}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("`H2J0x-s", 0, 0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      CharsetDecoder charsetDecoder0 = iOUtils0.UTF8.newDecoder();
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode("fastjson.compatibleWithJavaBean");
      CharBuffer charBuffer0 = iOUtils0.UTF8.decode(byteBuffer0);
      IOUtils.decode(charsetDecoder0, byteBuffer0, charBuffer0);
      assertTrue(charBuffer0.hasArray());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      CharArrayReader charArrayReader0 = new CharArrayReader(iOUtils0.replaceChars);
      charArrayReader0.read();
      IOUtils.getChars(48, 48, iOUtils0.ASCII_CHARS);
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = IOUtils.FASTJSON_PROPERTIES;
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("fastjson.properties");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((byte)68, 61, iOUtils0.replaceChars);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      int int1 = IOUtils.stringSize(1);
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      CharArrayReader charArrayReader0 = new CharArrayReader(iOUtils0.DIGITS);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.compatibleWithJavaBean", 2, 10);
      IOUtils.decodeUTF8(byteArray0, 2, 95, iOUtils0.DIGITS);
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-31), 2, iOUtils0.CA);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = new char[8];
      charArray0[0] = 'o';
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 1, 'o', byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      CharArrayReader charArrayReader0 = new CharArrayReader(iOUtils0.replaceChars);
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(iOUtils0.specicalFlags_doubleQuotes, 59, 59, iOUtils0.DIGITS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IOUtils.decodeBase64("com.alibaba.fastjson.util.UTF8Decoder");
      IOUtils.getStringProperty("com.alibaba.fastjson.util.UTF8Decoder");
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("q*cP(O@eqNPM)(f,", (-1799), (-1799));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode("fastjson.compatibleWithJavaBean");
      CharBuffer charBuffer0 = iOUtils0.UTF8.decode(byteBuffer0);
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
  public void test31()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars(3588L, 30, iOUtils0.replaceChars);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 30, 30);
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.stringSize(1000000000003L);
      assertEquals(13, int0);
      
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.replaceChars, 13, 13);
      assertArrayEquals(new byte[] {(byte)4, (byte)16, (byte)65, (byte)4, (byte)16, (byte)65, (byte)4, (byte)16, (byte)65}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      byte[] byteArray0 = IOUtils.decodeBase64("_g~E", 2, 2);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("4");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((-4077), 10, iOUtils0.CA);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.stringSize(1341L);
      assertEquals(4, int0);
      
      IOUtils.getChars((-243L), 4, iOUtils0.CA);
      boolean boolean0 = IOUtils.firstIdentifier('i');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = ObjectStreamConstants.baseWireHandle;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(8257536, 8257536, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8257535
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      byte[] byteArray0 = IOUtils.decodeBase64("_xHB", 2, 2);
      assertArrayEquals(new byte[] {(byte)28}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("tgf'4=?J'&D", 4, 4);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-55)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = ObjectStreamConstants.baseWireHandle;
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) 8257536, 337, iOUtils0.CA);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 336
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = ObjectStreamConstants.baseWireHandle;
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(100000000000L, 8257536, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8257535
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64(" </[rHR|b}eI=");
      char[] charArray0 = new char[8];
      int int0 = IOUtils.decodeUTF8(byteArray0, 2, 2, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-6), (byte) (-57), (byte) (-1), (byte) (-1), (byte) (-1), (byte)120}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      CharArrayReader charArrayReader0 = new CharArrayReader(iOUtils0.DIGITS);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.compatibleWithJavaBean", 2, 10);
      int int1 = IOUtils.decodeUTF8(byteArray0, 2, 2, iOUtils0.DIGITS);
      assertArrayEquals(new byte[] {(byte) (-78), (byte) (-40), (byte) (-20), (byte) (-1), (byte) (-1), (byte) (-36), (byte) (-94)}, byteArray0);
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      CharArrayReader charArrayReader0 = new CharArrayReader(iOUtils0.DIGITS);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.properties");
      IOUtils.loadPropertiesFromFile();
      IOUtils.firstIdentifier('G');
      int int1 = IOUtils.decodeUTF8(byteArray0, 2, 2, iOUtils0.CA);
      assertEquals((-1), int1);
      
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("fastjson.compatibleWithFieldName");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      IOUtils.loadPropertiesFromFile();
      byte[] byteArray0 = IOUtils.decodeBase64("UTF-8", 2, 2);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[4] = '\u0080';
      charArray0[6] = '\u0080';
      int int0 = 4;
      byte[] byteArray0 = new byte[12];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 4, 4, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      char[] charArray0 = new char[7];
      charArray0[0] = 'P';
      charArray0[2] = 'P';
      charArray0[3] = '=';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 2, 2);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      char[] charArray0 = new char[4];
      charArray0[0] = 'L';
      charArray0[1] = 'b';
      charArray0[2] = '=';
      charArray0[3] = '=';
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 2, 2);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }
}