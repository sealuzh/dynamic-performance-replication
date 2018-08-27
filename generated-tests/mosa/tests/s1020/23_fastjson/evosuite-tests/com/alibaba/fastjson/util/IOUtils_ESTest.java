/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 11:25:39 GMT 2018
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.CharArrayReader;
import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectStreamConstants;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CodingErrorAction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars(102, 102, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((-166), (-166), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = IOUtils.stringSize(224);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.encodeUTF8(iOUtils0.CA, 30, 30, iOUtils0.specicalFlags_doubleQuotes);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("zZo");
      assertArrayEquals(new byte[] {(byte) (-51), (byte) (-102)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("!AGScdie1Vju");
      assertArrayEquals(new byte[] {(byte)0, (byte)100, (byte) (-100), (byte) (-1), (byte) (-8), (byte) (-98), (byte) (-1), (byte)85, (byte)99}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("OZaC$B>>Ra");
      assertArrayEquals(new byte[] {(byte)57, (byte) (-106), (byte) (-126), (byte) (-1), (byte) (-1), (byte) (-1), (byte)69}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64((char[]) null, 0, 0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("com.alibaba.fastjson.util.UTF8Decoder");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((-234L), 1763, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) 1786, 1786, (char[]) null);
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
      byte[] byteArray0 = IOUtils.decodeBase64("");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("kKjuD%D[BZqwH@.", 0, 0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('N');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("encodeUTF8 error");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.decodeUTF8(iOUtils0.specicalFlags_doubleQuotes, 21, 21, iOUtils0.ASCII_CHARS);
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("wuTD//<Tj{");
      assertArrayEquals(new byte[] {(byte) (-62), (byte) (-28), (byte) (-61), (byte) (-1), (byte) (-1), (byte) (-45)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("fastjson.compatibleWithJavaBean", (-694), (-694));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      CharArrayReader charArrayReader0 = new CharArrayReader(iOUtils0.ASCII_CHARS);
      String string0 = IOUtils.readAll(charArrayReader0);
      assertEquals("zz01234567777777777777z0123456777777777777777777777777777777777777777777777777777777777777777777", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 11, 11);
      assertArrayEquals(new byte[] {(byte) (-17), (byte) (-66), (byte) (-5), (byte) (-17), (byte) (-66), (byte) (-5), (byte) (-17), (byte) (-66)}, byteArray0);
      assertArrayEquals(new byte[] {(byte) (-45), (byte)62, (byte)121, (byte) (-25), (byte) (-114), (byte)56, (byte) (-29)}, byteArray0);
      
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(iOUtils0.ASCII_CHARS, 11, 11, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode("fastjson.compatibleWithJavaBean");
      CharBuffer charBuffer0 = iOUtils0.UTF8.decode(byteBuffer0);
      IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
      assertEquals(34, byteBuffer0.capacity());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      IOUtils.close(filterOutputStream0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('\u0080');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IOUtils.stringSize(100000000000000000L);
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((long) 18, 18, iOUtils0.replaceChars);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((byte)36, (int) (byte)36, iOUtils0.CA);
      IOUtils.getChars((-5L), (int) (byte)36, iOUtils0.ASCII_CHARS);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, (-1404), (-1404));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2809
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 18, 18);
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.compatibleWithJavaBean");
      int int0 = IOUtils.decodeUTF8(byteArray0, 21, 21, iOUtils0.ASCII_CHARS);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(iOUtils0.specicalFlags_singleQuotes, 81, 81, iOUtils0.CA);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 64
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("5 +o9$if0zRAU7%n@!]", 6, 6);
      assertArrayEquals(new byte[] {(byte) (-119), (byte) (-3), (byte)51, (byte)68}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483647L, 1786, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((int) (byte)65, (int) (byte)65, iOUtils0.replaceChars);
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.stringSize((long) 6);
      IOUtils.getChars(6, 6, iOUtils0.CA);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      CodingErrorAction codingErrorAction0 = CodingErrorAction.REPORT;
      uTF8Decoder0.onUnmappableCharacter(codingErrorAction0);
      int int0 = 16;
      IOUtils.getChars((int) (byte) (-66), 16, iOUtils0.replaceChars);
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.DIGITS, 2147483645, (-2259));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2147481385
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("5 +o'9$if0zRAU7%n@!]", 6, 6);
      assertArrayEquals(new byte[] {(byte) (-119), (byte) (-3), (byte)51}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((byte) (-106), 15, iOUtils0.CA);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      byte[] byteArray0 = IOUtils.decodeBase64("PPh.ik", 2, 2);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("W");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode("fastjson.compatibleWithJavaBean");
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
  public void test42()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("t0=li=");
      assertArrayEquals(new byte[] {(byte) (-73), (byte)64, (byte)37}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IOUtils.getStringProperty("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1717986917), (-1717986917), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1717986918
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("t0==");
      char[] charArray0 = new char[20];
      charArray0[0] = 's';
      charArray0[2] = 's';
      charArray0[3] = '#';
      charArray0[4] = '=';
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        pipedOutputStream0.write(byteArray0, 97, 10);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("3");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483685L, 1786, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("5 +o9$iNwzRAU7%>n@!]");
      char[] charArray0 = new char[6];
      int int0 = IOUtils.decodeUTF8(byteArray0, 6, 6, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.util.UTF8Decoder");
      char[] charArray0 = new char[3];
      charArray0[1] = 'W';
      int int0 = IOUtils.decodeUTF8(byteArray0, 21, 6, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0017', 'W', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      char[] charArray0 = new char[6];
      charArray0[0] = '\u00A0';
      charArray0[1] = '\u00A0';
      charArray0[1] = '\u00A0';
      charArray0[3] = '\u00A0';
      byte[] byteArray0 = new byte[12];
      int int0 = IOUtils.encodeUTF8(charArray0, 2, 2, byteArray0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte) (-17);
      char[] charArray0 = new char[19];
      charArray0[8] = '\u0000';
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 2, (byte)12, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 11, 81);
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-28);
      byteArray0[1] = (byte)0;
      char[] charArray0 = new char[7];
      charArray0[1] = '_';
      charArray0[3] = '=';
      charArray0[4] = '[';
      IOUtils.decodeUTF8(byteArray0, (byte)0, 3521, charArray0);
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)10;
      byteArray0[2] = (byte)70;
      byteArray0[3] = (byte)2;
      byteArray0[5] = (byte) (-23);
      byteArray0[6] = (byte) (-128);
      byteArray0[7] = (byte)2;
      char[] charArray0 = new char[4];
      charArray0[0] = '|';
      charArray0[2] = '|';
      IOUtils.decodeUTF8(byteArray0, (byte)2, 67, charArray0);
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 45, 45, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 47
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[3] = (byte)2;
      byteArray0[5] = (byte) (-32);
      char[] charArray0 = new char[23];
      charArray0[3] = '\u0000';
      IOUtils.decodeUTF8(byteArray0, (byte)2, 70, charArray0);
      int int0 = ObjectStreamConstants.baseWireHandle;
      assertEquals(8257536, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789+/");
      int int0 = 9;
      char[] charArray0 = new char[3];
      charArray0[0] = '\"';
      charArray0[1] = 'W';
      charArray0[2] = 'Q';
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 9, 9, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)2;
      byteArray0[2] = (byte) (-12);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      char[] charArray0 = new char[8];
      charArray0[0] = 'M';
      charArray0[1] = '[';
      charArray0[2] = '3';
      charArray0[3] = 'm';
      charArray0[4] = '<';
      charArray0[5] = '7';
      charArray0[6] = 'b';
      charArray0[7] = '$';
      int int1 = IOUtils.decodeUTF8(byteArray0, (byte) (-12), (-32), charArray0);
      assertEquals(0, int1);
      
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      uTF8Decoder0.charset();
      int int2 = IOUtils.decodeUTF8(byteArray0, (byte)2, (byte)2, charArray0);
      assertEquals((-1), int2);
      
      boolean boolean0 = IOUtils.isIdent('7');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = "j%/h(Y#USVl`8Qkx";
      byte[] byteArray0 = IOUtils.decodeBase64("j%/h(Y#USVl`8Qkx");
      char[] charArray0 = new char[0];
      IOUtils.decodeUTF8(byteArray0, 2, 2, charArray0);
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("j%/h(Y#USVl`8Qkx", 41, 41);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      char[] charArray0 = new char[18];
      charArray0[0] = '!';
      charArray0[1] = '!';
      charArray0[2] = '!';
      charArray0[3] = '!';
      IOUtils.loadPropertiesFromFile();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-23);
      byteArray0[2] = (byte) (-19);
      byteArray0[3] = (byte)2;
      byteArray0[5] = (byte) (-23);
      byteArray0[6] = (byte) (-81);
      byteArray0[7] = (byte) (-99);
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 5, 28, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      byte[] byteArray0 = new byte[17];
      byteArray0[1] = (byte)74;
      byteArray0[2] = (byte) (-64);
      byteArray0[4] = (byte) (-47);
      char[] charArray0 = new char[3];
      charArray0[0] = '`';
      charArray0[1] = 'U';
      charArray0[2] = 'l';
      int int1 = IOUtils.decodeUTF8(byteArray0, (byte)3, 2, charArray0);
      assertEquals((-1), int1);
      assertArrayEquals(new char[] {'\u0000', 'U', 'l'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      boolean boolean0 = IOUtils.isIdent('\u0100');
      int int1 = IOUtils.stringSize((long) 2);
      assertEquals(1, int1);
      
      boolean boolean1 = IOUtils.isValidJsonpQueryParam("9_");
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[5] = (byte) (-10);
      byteArray0[7] = (byte)21;
      char[] charArray0 = new char[4];
      charArray0[3] = '\u0000';
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)2, 67, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }
}