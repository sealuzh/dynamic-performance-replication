/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 18:31:24 GMT 2018
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.ObjectStreamConstants;
import java.io.PushbackReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Properties;
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
        IOUtils.decodeBase64("X;b>^3E]Pr('n", (-1213), (-1213));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      IOUtils.getChars(1, 1, iOUtils0.ASCII_CHARS);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      CodingErrorAction codingErrorAction0 = CodingErrorAction.IGNORE;
      iOUtils0.DEFAULT_PROPERTIES.toString();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 30, 30);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.replaceChars, 5, 5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 65507
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[8];
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 5, 5, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[4];
      charArray0[1] = '\u0000';
      charArray0[2] = '\u0081';
      charArray0[3] = '\u0000';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 249, 0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      boolean boolean0 = IOUtils.isIdent('@');
      boolean boolean1 = IOUtils.firstIdentifier('@');
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.specicalFlags_doubleQuotes;
      int int0 = IOUtils.decodeUTF8(byteArray0, 17, 17, iOUtils0.replaceChars);
      assertEquals(17, int0);
      
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      IOUtils.getChars((byte) (-2), 17, iOUtils0.replaceChars);
      int int1 = IOUtils.stringSize((long) 17);
      assertEquals(2, int1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("\"d");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("O1(V@/hC");
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-43), (byte) (-1), (byte) (-8), (byte)66}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CodingErrorAction codingErrorAction0 = CodingErrorAction.IGNORE;
      CodingErrorAction codingErrorAction1 = CodingErrorAction.REPLACE;
      IOUtils.loadPropertiesFromFile();
      IOUtils.decodeBase64("-!2/ 55m6Cu4NfeX=");
      // Undeclared exception!
      try { 
        UTF8Decoder.malformedN((ByteBuffer) null, 74);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.UTF8Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = IOUtils.FASTJSON_COMPATIBLEWITHFIELDNAME;
      IOUtils.decodeBase64("GTgg?N$cvo");
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IOUtils.isValidJsonpQueryParam("'D");
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-2147167095), (-2147167095), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2147167096
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)3, 4, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = IOUtils.stringSize(1910L);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((long) 81, 81, iOUtils0.ASCII_CHARS);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((-1907L), 63, iOUtils0.ASCII_CHARS);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      CodingErrorAction codingErrorAction0 = CodingErrorAction.REPLACE;
      CharsetDecoder charsetDecoder0 = uTF8Decoder0.onMalformedInput(codingErrorAction0);
      Charset charset0 = IOUtils.UTF8;
      ByteBuffer byteBuffer0 = charset0.encode("1");
      CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
      IOUtils.decode(charsetDecoder0, byteBuffer0, charBuffer0);
      assertEquals("1", charBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      CodingErrorAction codingErrorAction0 = CodingErrorAction.REPLACE;
      IOUtils iOUtils0 = new IOUtils();
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("fastjson.compatibleWithFieldName", 27, 27);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      CodingErrorAction codingErrorAction0 = uTF8Decoder0.unmappableCharacterAction();
      uTF8Decoder0.onMalformedInput(codingErrorAction0);
      IOUtils.decodeBase64("{n(P&Fr-*?*dnO/ytH");
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("kO");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[5];
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("6.{@YTn");
      boolean boolean1 = IOUtils.isIdent('p');
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = '&';
      charArray0[1] = '(';
      charArray0[2] = '.';
      charArray0[3] = 'g';
      charArray0[4] = '7';
      charArray0[5] = 'n';
      charArray0[6] = '5';
      charArray0[7] = 'e';
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483647L, (-125), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -126
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "]2i&|xPFc");
      boolean boolean0 = IOUtils.isIdent('');
      boolean boolean1 = IOUtils.isValidJsonpQueryParam("");
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.compatibleWithJavaBean");
      IOUtils.decodeUTF8(byteArray0, 18, 18, iOUtils0.replaceChars);
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-2), (-1), iOUtils0.replaceChars);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      FileSystemHandling.shouldAllThrowIOExceptions();
      CodingErrorAction codingErrorAction0 = CodingErrorAction.IGNORE;
      UTF8Decoder uTF8Decoder1 = new UTF8Decoder();
      uTF8Decoder0.reset();
      iOUtils0.DEFAULT_PROPERTIES.toString();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 30, 30);
      IOUtils.decodeUTF8(byteArray0, (byte)0, 30, iOUtils0.replaceChars);
      // Undeclared exception!
      try { 
        IOUtils.getChars((int) (byte)0, (int) (byte)0, iOUtils0.ASCII_CHARS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      UTF8Decoder uTF8Decoder1 = new UTF8Decoder();
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 27, 27);
      int int0 = ObjectStreamConstants.baseWireHandle;
      assertEquals(8257536, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      IOUtils.loadPropertiesFromFile();
      IOUtils.stringSize(128);
      // Undeclared exception!
      try { 
        IOUtils.getChars(128, 1, iOUtils0.ASCII_CHARS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[8];
      IOUtils.getChars((byte)5, (int) (byte)5, charArray0);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter((byte)5);
      charArrayWriter0.reset();
      charArrayWriter0.close();
      IOUtils.close(charArrayWriter0);
      // Undeclared exception!
      try { 
        IOUtils.getChars(224, 22, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 21
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IOUtils.firstIdentifier('k');
      IOUtils iOUtils0 = new IOUtils();
      CharArrayReader charArrayReader0 = new CharArrayReader(iOUtils0.DIGITS);
      IOUtils.readAll(charArrayReader0);
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(iOUtils0.replaceChars, 128, 128, iOUtils0.specicalFlags_doubleQuotes);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 128
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.specicalFlags_singleQuotes;
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-21), 1, iOUtils0.replaceChars);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.compatibleWithJavaBean");
      IOUtils.isValidJsonpQueryParam((String) null);
      iOUtils0.UTF8.encode(">1#&}<C<5KU'-");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      IOUtils.decodeUTF8(byteArray0, 18, 4, iOUtils0.replaceChars);
      IOUtils.encodeUTF8(iOUtils0.CA, (-341), (-425), byteArray0);
      IOUtils iOUtils1 = new IOUtils();
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      IOUtils.decodeBase64("}%4RW0SDUs");
      int int0 = 293;
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(iOUtils0.specicalFlags_doubleQuotes, 18, 293, iOUtils0.ASCII_CHARS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 96
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '\'';
      charArray0[1] = '';
      charArray0[2] = 't';
      // Undeclared exception!
      try { 
        IOUtils.getChars(1000000000000L, 4056, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4055
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      CodingErrorAction codingErrorAction0 = CodingErrorAction.REPLACE;
      UTF8Decoder uTF8Decoder1 = new UTF8Decoder();
      iOUtils0.UTF8.encode("fastjson.compatibleWithJavaBean");
      CharArrayReader charArrayReader0 = new CharArrayReader(iOUtils0.ASCII_CHARS, 82, 82);
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.replaceChars, 2, 82);
      IOUtils.decodeUTF8(byteArray0, 30, 15, iOUtils0.replaceChars);
      boolean boolean0 = IOUtils.firstIdentifier('X');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("utf8 decode error, ", 18, (int) (byte) (-2));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("O^98mc:A^=o.km='N", 5, 5);
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8((char[]) null, 5, 5, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      IOUtils.decodeBase64("O^98mcz:A^=o.km='N", 5, 5);
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      uTF8Decoder0.reset();
      CodingErrorAction codingErrorAction0 = CodingErrorAction.REPLACE;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      UTF8Decoder uTF8Decoder1 = new UTF8Decoder();
      assertEquals(1.0F, uTF8Decoder1.averageCharsPerByte(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.loadPropertiesFromFile();
      IOUtils.decodeBase64("fastjson.compatibleWithJavaBean");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      IOUtils.encodeUTF8(iOUtils0.CA, 18, 18, iOUtils0.specicalFlags_doubleQuotes);
      IOUtils.getChars((-280), 18, iOUtils0.ASCII_CHARS);
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      iOUtils0.UTF8.encode("fastjson.compatibleWithJavaBean");
      FileSystemHandling.shouldAllThrowIOExceptions();
      IOUtils.decodeBase64(">");
      Charset.defaultCharset();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      // Undeclared exception!
      try { 
        uTF8Decoder0.detectedCharset();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.charset.CharsetDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[8];
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      charArray0[0] = '\u00EC';
      charArray0[4] = '\u00EC';
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 2, '\u00EC', byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      UTF8Decoder uTF8Decoder1 = new UTF8Decoder();
      IOUtils iOUtils0 = new IOUtils();
      FileSystemHandling.shouldAllThrowIOExceptions();
      IOUtils.loadPropertiesFromFile();
      int int0 = 8;
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("fastjson.properties", 8, 1342);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      FileSystemHandling.shouldAllThrowIOExceptions();
      UTF8Decoder uTF8Decoder1 = new UTF8Decoder();
      CodingErrorAction codingErrorAction0 = CodingErrorAction.IGNORE;
      uTF8Decoder0.reset();
      int int0 = 30;
      iOUtils0.DEFAULT_PROPERTIES.toString();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 30, 30);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.loadPropertiesFromFile();
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.compatibleWithJavaBean");
      IOUtils.loadPropertiesFromFile();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "fastjson.properties");
      IOUtils.loadPropertiesFromFile();
      IOUtils.firstIdentifier('|');
      int int0 = IOUtils.stringSize((long) 18);
      assertEquals(2, int0);
      
      Charset charset0 = IOUtils.UTF8;
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode("fastjson.compatibleWithJavaBean");
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      uTF8Decoder0.decode(byteBuffer0);
      CharBuffer charBuffer0 = iOUtils0.UTF8.decode(byteBuffer0);
      iOUtils0.UTF8.encode(charBuffer0);
      uTF8Decoder0.decodeLoop(byteBuffer0, charBuffer0);
      int int1 = IOUtils.stringSize(2);
      assertEquals(1, int1);
      
      IOUtils.close((Closeable) null);
      byte[] byteArray1 = IOUtils.specicalFlags_doubleQuotes;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      int int2 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      byte[] byteArray2 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      int int3 = IOUtils.decodeUTF8(byteArray2, 9, 2, iOUtils0.ASCII_CHARS);
      assertEquals((-1), int3);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      FileSystemHandling.shouldAllThrowIOExceptions();
      CodingErrorAction codingErrorAction0 = CodingErrorAction.IGNORE;
      UTF8Decoder uTF8Decoder1 = new UTF8Decoder();
      CodingErrorAction codingErrorAction1 = CodingErrorAction.IGNORE;
      uTF8Decoder0.reset();
      IOUtils.decodeBase64(iOUtils0.CA, 2, 30);
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode("");
      Charset charset0 = Charset.defaultCharset();
      UTF8Decoder uTF8Decoder2 = new UTF8Decoder();
      charset0.newDecoder();
      UTF8Decoder uTF8Decoder3 = new UTF8Decoder();
      UTF8Decoder.malformedN(byteBuffer0, 2);
      uTF8Decoder1.decode(byteBuffer0);
      IOUtils.stringSize(7377304608448933742L);
      IOUtils.loadPropertiesFromFile();
      String string0 = IOUtils.getStringProperty("fastjson.compatibleWithJavaBean");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      int int0 = 91;
      IOUtils.decodeBase64(iOUtils0.replaceChars, 2, 91);
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode("Og`f?IYx)z)^L{g&a");
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
  public void test46()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.replaceChars, 2, 91);
      IOUtils.stringSize(91);
      IOUtils.loadPropertiesFromFile();
      IOUtils.encodeUTF8(iOUtils0.replaceChars, 2, 91, iOUtils0.specicalFlags_singleQuotes);
      CodingErrorAction codingErrorAction0 = CodingErrorAction.IGNORE;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      IOUtils.decodeUTF8(byteArray0, 2, 46, iOUtils0.replaceChars);
      IOUtils.decodeBase64("");
      Charset.defaultCharset();
      CharArrayReader charArrayReader0 = new CharArrayReader(iOUtils0.replaceChars);
      IOUtils.readAll(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.replaceChars, 2, 91);
      IOUtils.stringSize(91);
      IOUtils.loadPropertiesFromFile();
      IOUtils.encodeUTF8(iOUtils0.replaceChars, 2, 91, iOUtils0.specicalFlags_singleQuotes);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      CodingErrorAction codingErrorAction0 = CodingErrorAction.IGNORE;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      IOUtils.decodeUTF8(byteArray0, 2, 46, iOUtils0.replaceChars);
      IOUtils.decodeBase64("");
      Charset.defaultCharset();
      CharArrayReader charArrayReader0 = new CharArrayReader(iOUtils0.replaceChars);
      IOUtils.readAll(charArrayReader0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      FileSystemHandling.shouldAllThrowIOExceptions();
      CodingErrorAction codingErrorAction0 = CodingErrorAction.IGNORE;
      uTF8Decoder0.onMalformedInput(codingErrorAction0);
      UTF8Decoder uTF8Decoder1 = new UTF8Decoder();
      uTF8Decoder0.malformedInputAction();
      uTF8Decoder0.reset();
      int int0 = 30;
      iOUtils0.DEFAULT_PROPERTIES.toString();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 30, 30);
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
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.replaceChars, 2, 91);
      IOUtils.stringSize(91);
      IOUtils.loadPropertiesFromFile();
      char[] charArray0 = new char[7];
      charArray0[0] = 'O';
      charArray0[1] = 'B';
      charArray0[2] = '?';
      charArray0[3] = 'd';
      charArray0[4] = 'x';
      charArray0[5] = '?';
      charArray0[6] = 'd';
      IOUtils.encodeUTF8(charArray0, 2, 2, iOUtils0.specicalFlags_singleQuotes);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      CodingErrorAction codingErrorAction0 = CodingErrorAction.IGNORE;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "7WD-{E?F)|+:Jr^g%W");
      IOUtils.decodeUTF8(byteArray0, 2, 46, iOUtils0.ASCII_CHARS);
      IOUtils.decodeBase64("");
      Charset.defaultCharset();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.replaceChars, 2, 91);
      IOUtils.stringSize(91);
      IOUtils.loadPropertiesFromFile();
      char[] charArray0 = new char[7];
      charArray0[0] = 'O';
      charArray0[1] = 'B';
      charArray0[2] = '?';
      charArray0[3] = 'd';
      charArray0[4] = 'x';
      charArray0[5] = '?';
      charArray0[6] = 'd';
      IOUtils.encodeUTF8(charArray0, 2, 2, iOUtils0.specicalFlags_singleQuotes);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      CodingErrorAction codingErrorAction0 = CodingErrorAction.IGNORE;
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "fastjson.compatibleWithFieldName");
      char[] charArray1 = new char[6];
      charArray1[0] = 'd';
      charArray1[1] = 'd';
      charArray1[2] = 'd';
      charArray1[3] = 'd';
      charArray1[4] = 'd';
      charArray1[5] = 'd';
      IOUtils.decodeUTF8(byteArray0, 2, 2, charArray1);
      IOUtils.decodeBase64("*50?9%yf@pL");
      Charset.defaultCharset();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("O^98mc:A^=o.km='N");
      Properties properties0 = IOUtils.DEFAULT_PROPERTIES;
      StringWriter stringWriter0 = new StringWriter();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "7WD-{E?F)|+:Jr^g%W");
      char[] charArray0 = new char[8];
      charArray0[0] = '*';
      charArray0[1] = 'O';
      charArray0[2] = 'D';
      charArray0[3] = 'n';
      charArray0[4] = 'N';
      charArray0[5] = 'q';
      charArray0[6] = 'X';
      charArray0[7] = 'q';
      IOUtils.decodeUTF8(byteArray0, 5, 5, charArray0);
      StringReader stringReader0 = new StringReader("");
      PushbackReader pushbackReader0 = new PushbackReader(stringReader0);
      IOUtils.readAll(pushbackReader0);
      byte[] byteArray1 = IOUtils.decodeBase64("");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      IOUtils.decodeUTF8(byteArray1, (-1), (-1), charArray0);
      IOUtils.decodeBase64("7WD-{E?F)|+:Jr^g%W");
      Charset charset0 = Charset.defaultCharset();
      assertTrue(charset0.isRegistered());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", 1, 54);
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      UTF8Decoder uTF8Decoder1 = new UTF8Decoder();
      CodingErrorAction codingErrorAction0 = CodingErrorAction.REPORT;
      uTF8Decoder0.onMalformedInput(codingErrorAction0);
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", 1, 54);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      IOUtils iOUtils0 = new IOUtils();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      CodingErrorAction codingErrorAction1 = CodingErrorAction.IGNORE;
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Wo88pnMEKB{Z!}'a");
      int int1 = IOUtils.decodeUTF8(byteArray0, 28, 92, iOUtils0.DIGITS);
      assertEquals((-1), int1);
      
      iOUtils0.UTF8.encode("D9;HJp}zzC{^e;");
      int int2 = IOUtils.stringSize(36);
      assertEquals(2, int2);
  }
}