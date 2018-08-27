/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 01:44:52 GMT 2018
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.ObjectStreamConstants;
import java.io.PipedReader;
import java.io.PushbackReader;
import java.io.Reader;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.evosuite.runtime.mock.java.io.MockRandomAccessFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      char[] charArray0 = new char[5];
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 2, 9, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[3];
      byte[] byteArray0 = new byte[7];
      IOUtils.encodeUTF8(charArray0, 0, '\u0000', byteArray0);
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.compatibleWithJavaBean", 8, 8);
      assertArrayEquals(new byte[] {(byte)114, (byte) (-119), (byte) (-87), (byte)106, (byte) (-40)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      IOUtils.close(byteArrayOutputStream0);
      assertEquals(0, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      char[] charArray0 = new char[12];
      IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (int) '\u0000', (int) '\u0000');
      IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      String string0 = IOUtils.FASTJSON_COMPATIBLEWITHFIELDNAME;
      byte[] byteArray0 = IOUtils.specicalFlags_singleQuotes;
      assertFalse(byteArray0.equals((Object)byteArray1));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IOUtils.isValidJsonpQueryParam("?^=@@EZ1^X;");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)71, (int) (byte)71, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 70
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) 1, 18, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars(19, 192, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      IOUtils.isValidJsonpQueryParam("");
      IOUtils.isValidJsonpQueryParam((String) null);
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[4] = (byte)0;
      char[] charArray0 = new char[0];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)0, (byte)0, charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) (-5), 18, (char[]) null);
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
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("?^=@@EZ1^X;");
      assertFalse(boolean0);
      
      byte[] byteArray0 = IOUtils.decodeBase64("?^=@@EZ1^X;");
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-60), (byte) (-1), (byte) (-1), (byte) (-41)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('z');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IOUtils.isIdent('0');
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-32), (int) (byte) (-32), (char[]) null);
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
      IOUtils.loadPropertiesFromFile();
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("K");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      byte[] byteArray0 = IOUtils.specicalFlags_singleQuotes;
      boolean boolean0 = IOUtils.firstIdentifier('U');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      byte[] byteArray0 = IOUtils.decodeBase64("");
      assertArrayEquals(new byte[] {}, byteArray0);
      
      int int0 = IOUtils.stringSize(1000000000L);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("D,fiw");
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-9), (byte) (-30)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(iOUtils0.ASCII_CHARS, 79, 79, iOUtils0.specicalFlags_doubleQuotes);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 96
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 6, 6, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("wsj2= atg5O", 1, 1);
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.decodeBase64(iOUtils0.CA, 1, 63);
      byte[] byteArray1 = IOUtils.decodeBase64("fastjson.compatibleWithFieldName");
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = IOUtils.stringSize((-32));
      assertEquals(1, int0);
      
      char[] charArray0 = new char[9];
      IOUtils.getChars(1, 1, charArray0);
      boolean boolean0 = IOUtils.firstIdentifier('`');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '}';
      charArray0[1] = '4';
      charArray0[2] = 'w';
      charArray0[3] = 'w';
      charArray0[4] = '!';
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)127, 2, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      IOUtils.decodeBase64((char[]) null, 7, (int) (byte)0);
      IOUtils.firstIdentifier('(');
      // Undeclared exception!
      try { 
        IOUtils.getChars(7, 2400, (char[]) null);
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
      byte[] byteArray0 = IOUtils.specicalFlags_doubleQuotes;
      // Undeclared exception!
      try { 
        IOUtils.getChars((-12), (-1097), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      char[] charArray0 = new char[7];
      int int0 = 4;
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 0, 4);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = IOUtils.stringSize(59);
      int int1 = IOUtils.stringSize((long) 59);
      assertTrue(int1 == int0);
      assertEquals(2, int1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IOUtils.decodeBase64("`~");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byte[] byteArray0 = IOUtils.decodeBase64("`~");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("srN");
      assertArrayEquals(new byte[] {(byte) (-78), (byte) (-77)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IOUtils.stringSize((-32));
      char[] charArray0 = new char[9];
      charArray0[1] = 'i';
      // Undeclared exception!
      try { 
        IOUtils.getChars(115, 1, charArray0);
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
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      int int0 = ObjectStreamConstants.baseWireHandle;
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((long) 38, 7, iOUtils0.replaceChars);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      IOUtils.stringSize(2147483595L);
      char[] charArray0 = new char[9];
      char[] charArray1 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.getChars(65536, 10, charArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      char[] charArray0 = new char[3];
      IOUtils.decodeUTF8(byteArray0, 3, (byte)11, charArray0);
      IOUtils.stringSize((long) (-1));
      IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      IOUtils.getChars((-1), 3, charArray0);
      assertArrayEquals(new char[] {'\u0010', '-', '7'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("Hfp.h?++}.g");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = IOUtils.stringSize((-1L));
      assertEquals(1, int0);
      
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.JSONException");
      char[] charArray0 = new char[1];
      charArray0[0] = 'b';
      int int1 = IOUtils.decodeUTF8(byteArray0, 1, 1, charArray0);
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      char[] charArray0 = new char[1];
      byte[] byteArray0 = IOUtils.specicalFlags_doubleQuotes;
      IOUtils.getChars((byte)5, 1, charArray0);
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 1, 20);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      char[] charArray0 = new char[3];
      charArray0[0] = '\u0085';
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 0, '\u0085', byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = (-2805);
      char[] charArray0 = null;
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483647L, (-2805), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      IOUtils.decodeBase64("KgDWH}PMqY>\"o");
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      Charset charset0 = uTF8Decoder0.charset();
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      ByteBuffer byteBuffer0 = charset0.encode("mS-JH0Iw");
      CharBuffer charBuffer0 = uTF8Decoder0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = charset0.encode(charBuffer0);
      // Undeclared exception!
      try { 
        IOUtils.decode(charsetDecoder0, byteBuffer1, charBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.charset.CoderResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVXYZabcdefghijklmnopqrstuvwxyz0123456789+/", 7, 50);
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      char[] charArray0 = new char[6];
      IOUtils.decodeUTF8(byteArray0, 2, 7, charArray0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byte[] byteArray1 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      IOUtils.decodeBase64("r)<", 1, 1);
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.CA, 1, 1);
      byte[] byteArray1 = IOUtils.decodeBase64("fastjson.compatibleWithFieldName");
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[6] = (byte) (-14);
      char[] charArray0 = new char[1];
      IOUtils.decodeUTF8(byteArray0, 6, 6, charArray0);
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      assertEquals(1.0F, uTF8Decoder0.maxCharsPerByte(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      CodingErrorAction codingErrorAction0 = uTF8Decoder0.unmappableCharacterAction();
      CharsetDecoder charsetDecoder0 = uTF8Decoder0.onMalformedInput(codingErrorAction0);
      Charset charset0 = IOUtils.UTF8;
      ByteBuffer byteBuffer0 = charset0.encode("");
      CharBuffer charBuffer0 = uTF8Decoder0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = charset0.encode(charBuffer0);
      IOUtils.decode(charsetDecoder0, byteBuffer1, charBuffer0);
      char[] charArray0 = new char[3];
      charArray0[0] = 'C';
      charArray0[1] = ';';
      charArray0[2] = '*';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      String string0 = IOUtils.readAll(charArrayReader0);
      assertEquals("C;*", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      IOUtils iOUtils0 = new IOUtils();
      char[] charArray0 = new char[0];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      charArrayReader0.read(iOUtils0.CA);
      IOUtils.readAll(charArrayReader0);
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.replaceChars, (int) '4', (int) '4');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 93
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      char[] charArray0 = new char[1];
      byte[] byteArray0 = IOUtils.specicalFlags_doubleQuotes;
      IOUtils.getStringProperty("?!");
      int int0 = 1;
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-2), 1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      char[] charArray0 = new char[3];
      charArray0[0] = ']';
      charArray0[1] = 'U';
      charArray0[2] = '*';
      IOUtils.getChars((-88L), 3, charArray0);
      // Undeclared exception!
      try { 
        IOUtils.getChars(74, 37, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 36
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IOUtils.stringSize((-83));
      long long0 = 10000000000L;
      // Undeclared exception!
      try { 
        IOUtils.getChars(10000000000L, 24, (char[]) null);
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
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = IOUtils.decodeBase64("0F4Y5zb3=,");
      assertArrayEquals(new byte[] {(byte) (-48), (byte)94, (byte)24, (byte) (-25), (byte)54}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      IOUtils.isIdent('x');
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.shouldAllThrowIOExceptions();
      char[] charArray0 = new char[7];
      charArray0[1] = '=';
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 0, 4);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[35];
      byteArray0[0] = (byte) (-114);
      byteArray0[8] = (byte) (-114);
      byte byte0 = (byte) (-20);
      byteArray0[6] = (byte) (-20);
      char[] charArray0 = new char[1];
      IOUtils.decodeUTF8(byteArray0, 6, 6, charArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1), (int) (byte) (-114), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -115
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.shouldAllThrowIOExceptions();
      char[] charArray0 = new char[4];
      charArray0[0] = '=';
      charArray0[1] = '=';
      charArray0[2] = '=';
      charArray0[3] = '=';
      IOUtils.decodeBase64(charArray0, 0, 4);
      IOUtils.decodeBase64("com.alibaba.fastjson.JSONException", 0, 19);
      IOUtils.isIdent('=');
      PipedReader pipedReader0 = new PipedReader();
      PushbackReader pushbackReader0 = new PushbackReader(pipedReader0, 141);
      BufferedReader bufferedReader0 = new BufferedReader(pushbackReader0);
      // Undeclared exception!
      try { 
        IOUtils.readAll(pushbackReader0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // read string from reader error
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      char char0 = '\u0106';
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      IOUtils.firstIdentifier('\u0106');
      // Undeclared exception!
      try { 
        Charset.forName("({$Zcaea.g+p]s0");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // ({$Zcaea.g+p]s0
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      IOUtils.isIdent('\u0107');
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = IOUtils.specicalFlags_doubleQuotes;
      Charset charset0 = IOUtils.UTF8;
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      byte[] byteArray0 = new byte[28];
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      byteArray0[11] = (byte) (-23);
      char[] charArray0 = new char[10];
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      IOUtils.decodeUTF8(byteArray0, 6, 6, charArray0);
      byte[] byteArray1 = IOUtils.specicalFlags_singleQuotes;
      IOUtils.getStringProperty("f|?{e>96ov");
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-14);
      byteArray0[1] = (byte) (-14);
      byteArray0[0] = (byte) (-14);
      char[] charArray0 = new char[1];
      IOUtils.decodeUTF8(byteArray0, (byte)0, 1, charArray0);
      CodingErrorAction codingErrorAction0 = CodingErrorAction.REPORT;
      int int0 = (-1321);
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 8, (-1321));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1314
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }
}