/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 19:48:57 GMT 2018
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.ObjectStreamConstants;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringReader;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("D", (-1210), (-1210));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("O\\g)uU='[?MJ<G][", 5, 5);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(65536, 65536, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 65535
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.getChars(8064, 8064, iOUtils0.ASCII_CHARS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8063
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGIJKLMNOPQRTUVWXPCabcdefghijklmnopqrstuwxy.0123456789+/", 0, 0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 4, 4);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.encodeUTF8(iOUtils0.ASCII_CHARS, (byte)9, (byte)9, iOUtils0.specicalFlags_singleQuotes);
      String string0 = IOUtils.getStringProperty("fastjson.compatibleWithJavaBean");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '<';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 1, 1);
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
  public void test08()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('\u009C');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[2];
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, (int) '\u0000', (int) '\u0000');
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('\u00CF');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('v');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("eE+7?5");
      assertArrayEquals(new byte[] {(byte)120, (byte)79, (byte) (-69), (byte) (-1)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("O\\g)uU='[?MJ<G][");
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-13), (byte)9, (byte) (-4)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("yk");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("ABCDEFGHIJKLMNOPQRTUVWXYZabcdefghijklmnopqrstuwxyz0123456789+/");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((-409), 507, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[9];
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)20, (int) (byte)20, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 19
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = IOUtils.stringSize(3217L);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      char[] charArray0 = new char[5];
      IOUtils.getChars((long) 1, 1, charArray0);
      assertArrayEquals(new char[] {'1', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      IOUtils.close(mockFileInputStream0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((byte) (-65), 9, iOUtils0.replaceChars);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IOUtils.decodeBase64("cDd$=:]?");
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1528L), 161, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64("P'(?IF(");
      IOUtils.getStringProperty("P'(?IF(");
      int int0 = IOUtils.stringSize((int) 'B');
      assertEquals(2, int0);
      
      int int1 = IOUtils.decodeUTF8(byteArray0, 2, 'B', iOUtils0.replaceChars);
      assertEquals((-1), int1);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-1), (byte)32}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("O\\g)uU='[?MJ<G][", 4, 4);
      assertArrayEquals(new byte[] {(byte) (-71)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("H[:}JNV9o1j\"<iJ$\"NKq", 5, 5);
      assertArrayEquals(new byte[] {(byte)53, (byte)95, (byte)104}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode("fastjson.compatibleWithFieldName");
      CharBuffer charBuffer0 = iOUtils0.UTF8.decode(byteBuffer0);
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
      assertEquals(32, charBuffer0.capacity());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("com.alibaba.fastjson.JSONException");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64(",AigKlW");
      assertArrayEquals(new byte[] {(byte)2, (byte)40, (byte)10, (byte) (-107)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.compatibleWithFieldName");
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 47, 47);
      IOUtils.getChars(47, 47, iOUtils0.CA);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = 5;
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.DIGITS, 5, 5);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("com.alibaba.fastjson.JSONException");
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("com.alibaba.fastjson.JSONException", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("{`");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((byte)63, (int) (byte)63, iOUtils0.CA);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode("fastjson.compatibleWithFieldName");
      iOUtils0.UTF8.decode(byteBuffer0);
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      IOUtils.decodeUTF8(iOUtils0.specicalFlags_singleQuotes, 18, 18, iOUtils0.replaceChars);
      IOUtils.getChars((-735), 18, iOUtils0.CA);
      String string0 = IOUtils.getStringProperty("UTF-8");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.decodeBase64("fastjson.properties");
      IOUtils.getChars(2147483647L, 16, iOUtils0.DIGITS);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(iOUtils0.specicalFlags_doubleQuotes, 18, 18, iOUtils0.DIGITS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((-797L), 11, iOUtils0.replaceChars);
      String string0 = IOUtils.getStringProperty("WyI");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 39, 39);
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      char[] charArray0 = new char[6];
      charArray0[1] = '\u00C0';
      charArray0[4] = '\u00C0';
      charArray0[5] = '\u0000';
      byte[] byteArray0 = new byte[2];
      int int0 = IOUtils.encodeUTF8(charArray0, 1, 1, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-61), (byte) (-128)}, byteArray0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      char char0 = '\u00E2';
      char[] charArray0 = new char[7];
      charArray0[1] = '\u00E2';
      byte[] byteArray0 = new byte[0];
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
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)5;
      byteArray0[5] = (byte) (-32);
      byteArray0[6] = (byte)5;
      char[] charArray0 = new char[1];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)5, 18, charArray0);
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[4] = '\u0000';
      IOUtils.loadPropertiesFromFile();
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-27);
      byteArray0[3] = (byte) (-27);
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)2, (byte)14, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[1] = '\u0000';
      charArray0[4] = '\u0000';
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      IOUtils.loadPropertiesFromFile();
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-27);
      IOUtils.decodeUTF8(byteArray0, (byte)2, (byte)2, charArray0);
      IOUtils.isValidJsonpQueryParam("VDh5  l ?ixw^<");
      PipedWriter pipedWriter0 = null;
      try {
        pipedWriter0 = new PipedWriter((PipedReader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      long long0 = 2147483669L;
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483669L, 2, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte) (-16);
      byteArray0[5] = (byte)3;
      byteArray0[6] = (byte)3;
      char[] charArray0 = new char[8];
      charArray0[3] = 'N';
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)3, (byte)3, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      IOUtils.firstIdentifier('\u0105');
      IOUtils.loadPropertiesFromFile();
      char[] charArray0 = new char[4];
      charArray0[0] = '\u0105';
      charArray0[1] = '\u0105';
      charArray0[2] = '\u0105';
      charArray0[3] = '\u0105';
      // Undeclared exception!
      try { 
        IOUtils.getChars(450, 450, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 449
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[4] = '\u0000';
      IOUtils.loadPropertiesFromFile();
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-42);
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)2, (byte)19, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = '\u00D5';
      charArray0[1] = '\u00D5';
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)0;
      IOUtils.encodeUTF8(charArray0, 1, 1, byteArray0);
      IOUtils.decodeUTF8(byteArray0, (byte)0, 1, charArray0);
      IOUtils.getChars((int) (byte)0, 2, charArray0);
      assertArrayEquals(new char[] {'\u00D5', '0', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      byteArray0[1] = (byte)3;
      byteArray0[3] = (byte) (-16);
      char[] charArray0 = new char[2];
      IOUtils.decodeUTF8(byteArray0, (byte)3, 192, charArray0);
      IOUtils.loadPropertiesFromFile();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, (int) (byte)3, 192);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-64);
      byteArray0[3] = (byte) (-64);
      byteArray0[4] = (byte)93;
      byteArray0[5] = (byte) (-32);
      byteArray0[3] = (byte)39;
      char[] charArray0 = new char[3];
      IOUtils.decodeUTF8(byteArray0, (byte)0, 18, charArray0);
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('\u0109');
      assertFalse(boolean0);
  }
}