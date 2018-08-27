/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 20:01:53 GMT 2018
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.ObjectStreamConstants;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PushbackReader;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IOUtils.getStringProperty("r-~");
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(iOUtils0.ASCII_CHARS, (-759), 255, iOUtils0.specicalFlags_doubleQuotes);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -759
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IOUtils.getStringProperty("r-~");
      IOUtils.firstIdentifier('>');
      IOUtils.isValidJsonpQueryParam((String) null);
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("", 63, 63);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) 0, (-1584), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1585
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("Xxs4*");
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(iOUtils0.ASCII_CHARS, 2048, 2048, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2048
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IOUtils.decodeBase64("!(g<`:odAK{V6)e");
      IOUtils.firstIdentifier('N');
      IOUtils.getStringProperty("*rwwDb^,2q:Bl(fgj");
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("*rwwDb^,2q:Bl(fgj", 0, (-2118));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = IOUtils.stringSize((-19L));
      assertEquals(1, int0);
      
      byte[] byteArray0 = IOUtils.decodeBase64("E)K\"bN[");
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-1), (byte)108}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      IOUtils.firstIdentifier('<');
      IOUtils.isIdent('<');
      IOUtils.loadPropertiesFromFile();
      IOUtils.getStringProperty("UTF-8");
      char[] charArray0 = new char[0];
      int int0 = 578;
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 578, 578);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 578
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IOUtils.firstIdentifier('h');
      IOUtils.isIdent('h');
      IOUtils.stringSize(1289);
      String string0 = null;
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((String) null, (-1834), 128);
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
      IOUtils iOUtils0 = new IOUtils();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("fastjson.compatibleWithFieldName");
      IOUtils.getStringProperty("fastjson.properties");
      int int0 = IOUtils.stringSize((-1552));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IOUtils.stringSize(320L);
      int int0 = 0;
      IOUtils.stringSize(0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)91;
      char[] charArray0 = new char[1];
      char char0 = '7';
      charArray0[0] = '7';
      IOUtils.decodeUTF8(byteArray0, 0, 0, charArray0);
      byte byte0 = (byte)4;
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)4, 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      char[] charArray0 = new char[1];
      charArray0[0] = 'a';
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-121), (int) (byte) (-121), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -122
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IOUtils.isValidJsonpQueryParam("|a8HTfHHILgwKG_|*k");
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(iOUtils0.CA, 680, 680, iOUtils0.specicalFlags_singleQuotes);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 680
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.loadPropertiesFromFile();
      IOUtils.isValidJsonpQueryParam("fastjson.properties");
      IOUtils.isValidJsonpQueryParam("com.alibaba.fastjson.JSONException");
      int int0 = 13;
      IOUtils.decodeUTF8(iOUtils0.specicalFlags_doubleQuotes, 13, (-55), iOUtils0.replaceChars);
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(iOUtils0.CA, (-55), 240, iOUtils0.specicalFlags_doubleQuotes);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -55
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IOUtils.isIdent('\u00CD');
      Charset charset0 = IOUtils.UTF8;
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      ByteBuffer byteBuffer0 = charset0.encode("");
      CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = charset0.encode(charBuffer0);
      IOUtils.decode(charsetDecoder0, byteBuffer1, charBuffer0);
      assertEquals(0, charBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      CodingErrorAction codingErrorAction0 = CodingErrorAction.REPLACE;
      CharsetDecoder charsetDecoder0 = uTF8Decoder0.onUnmappableCharacter(codingErrorAction0);
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode(" J//");
      CharBuffer charBuffer0 = iOUtils0.UTF8.decode(byteBuffer0);
      IOUtils.decode(charsetDecoder0, byteBuffer0, charBuffer0);
      IOUtils.stringSize((-1265L));
      // Undeclared exception!
      try { 
        IOUtils.getChars(1L, 0, iOUtils0.DIGITS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.CA, (-2221), (-1752));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3974
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((-25), (-25), (char[]) null);
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
      char[] charArray0 = null;
      // Undeclared exception!
      try { 
        IOUtils.getChars(0, 0, (char[]) null);
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
      IOUtils.stringSize(224);
      IOUtils.isValidJsonpQueryParam((String) null);
      char[] charArray0 = new char[2];
      charArray0[0] = 'R';
      charArray0[1] = 'Z';
      int int0 = 0;
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 0, (-32));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -33
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.encodeUTF8(iOUtils0.ASCII_CHARS, 2, 2, iOUtils0.specicalFlags_singleQuotes);
      int int1 = IOUtils.decodeUTF8(iOUtils0.specicalFlags_doubleQuotes, 7, 2, iOUtils0.replaceChars);
      assertTrue(int1 == int0);
      assertEquals(2, int1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[6];
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 3, 230, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.loadPropertiesFromFile();
      IOUtils.isValidJsonpQueryParam("fastjson.properties");
      IOUtils.isValidJsonpQueryParam("com.alibaba.fastjson.JSONException");
      IOUtils.getChars((byte)115, 27, iOUtils0.CA);
      CharsetDecoder charsetDecoder0 = null;
      String string0 = "-w`X3S-5";
      // Undeclared exception!
      try { 
        Charset.forName("");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.stringSize((-3076L));
      IOUtils.getChars((byte)110, 30, iOUtils0.replaceChars);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)107, 2, iOUtils0.CA);
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
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 63, 63);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 125
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.isIdent('@');
      IOUtils.loadPropertiesFromFile();
      IOUtils.getChars(56, 56, iOUtils0.CA);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IOUtils.getStringProperty("r-~");
      IOUtils iOUtils0 = new IOUtils();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      IOUtils.close(charArrayWriter0);
      IOUtils.encodeUTF8(iOUtils0.DIGITS, (-1366), (-1366), iOUtils0.specicalFlags_singleQuotes);
      // Undeclared exception!
      try { 
        IOUtils.getChars((-749), 3, iOUtils0.DIGITS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = IOUtils.FASTJSON_COMPATIBLEWITHJAVABEAN;
      IOUtils.firstIdentifier('>');
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("fastjson.compatibleWithJavaBean");
      assertTrue(boolean0);
      
      byte[] byteArray0 = IOUtils.decodeBase64("r-~");
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(">#~");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("read string from reader error");
      PushbackReader pushbackReader0 = new PushbackReader(stringReader0);
      String string0 = IOUtils.readAll(pushbackReader0);
      assertEquals("read string from reader error", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IOUtils.stringSize(320L);
      IOUtils.stringSize((long) 0);
      IOUtils.close((Closeable) null);
      char[] charArray0 = new char[8];
      charArray0[0] = '!';
      charArray0[1] = 'm';
      charArray0[2] = '0';
      charArray0[3] = 'l';
      charArray0[4] = 'P';
      charArray0[5] = 'm';
      charArray0[6] = 'G';
      charArray0[7] = 'L';
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1L), 77, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 76
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IOUtils.getStringProperty("&>[Bmu)bL$?3");
      boolean boolean0 = IOUtils.firstIdentifier('N');
      assertTrue(boolean0);
      
      char[] charArray0 = new char[7];
      charArray0[0] = 'N';
      charArray0[1] = 'N';
      charArray0[2] = 'N';
      charArray0[3] = 'N';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 3, 3);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      int int0 = IOUtils.stringSize((long) 2814);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = IOUtils.stringSize((-603L));
      assertEquals(1, int0);
      
      char[] charArray0 = new char[16];
      charArray0[0] = 'Y';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 1, 1);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.decodeBase64(iOUtils0.CA, 46, 4);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.decodeBase64(iOUtils0.CA, 7, 7);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((-7L), 9, iOUtils0.ASCII_CHARS);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = 'G';
      charArray0[1] = '.';
      charArray0[2] = 'K';
      charArray0[3] = '0';
      charArray0[4] = 'q';
      charArray0[5] = ']';
      charArray0[6] = '0';
      charArray0[7] = '\\';
      charArray0[8] = 'k';
      IOUtils.getChars(3, 3, charArray0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-39);
      byteArray0[1] = (byte) (-77);
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte) (-64);
      byteArray0[4] = (byte)62;
      byteArray0[5] = (byte) (-76);
      IOUtils.decodeUTF8(byteArray0, (byte) (-39), (byte) (-64), charArray0);
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = charset0.encode("utf8 decode error, ");
      CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
      ByteBuffer byteBuffer1 = charset0.encode(charBuffer0);
      // Undeclared exception!
      try { 
        IOUtils.decode((CharsetDecoder) null, byteBuffer1, charBuffer0);
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
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 46, 46);
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_singleQuotes;
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 7, 7, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.loadPropertiesFromFile();
      IOUtils.isValidJsonpQueryParam("fastjson.properties");
      IOUtils.getChars((long) 9, 9, iOUtils0.replaceChars);
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.compatibleWithFieldName");
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[16];
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 3, 3, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.loadPropertiesFromFile();
      IOUtils.isValidJsonpQueryParam("fastjson.properties");
      IOUtils.getChars((-93L), 9, iOUtils0.CA);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      IOUtils.stringSize(4L);
      byte[] byteArray0 = IOUtils.decodeBase64(">#~", 1, 1);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = IOUtils.stringSize(3415L);
      assertEquals(4, int0);
      
      byte[] byteArray0 = IOUtils.decodeBase64("read string from reader error", 4, 4);
      assertArrayEquals(new byte[] {(byte) (-78), (byte) (-38)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IOUtils.getStringProperty("r|gc3\"4FPf");
      byte[] byteArray0 = IOUtils.decodeBase64("Dxb3[9/,?^?U3t", 4, 4);
      assertArrayEquals(new byte[] {(byte) (-9)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      IOUtils.decodeBase64("encodeUTF8 error", 6, 6);
      String string0 = IOUtils.getStringProperty("encodeUTF8 error");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IOUtils.stringSize(10000000000L);
      byte[] byteArray0 = IOUtils.decodeBase64("read string from reader error", 11, 11);
      char[] charArray0 = new char[3];
      charArray0[0] = '8';
      charArray0[1] = '\\';
      charArray0[2] = '7';
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 179, 179, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 179
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      int int0 = IOUtils.stringSize(10000000000L);
      assertEquals(11, int0);
      
      IOUtils.decodeBase64("4^q;QV%bw+?oh&J=<");
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      char[] charArray0 = new char[7];
      charArray0[0] = 'j';
      charArray0[1] = '{';
      charArray0[2] = 'Q';
      charArray0[3] = ']';
      charArray0[4] = '~';
      charArray0[5] = 'p';
      charArray0[6] = '}';
      int int0 = IOUtils.decodeUTF8(byteArray0, 5, 5, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'j', '{', 'Q', ']', '~', 'p', '}'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.compatibleWithFieldName");
      char[] charArray0 = new char[9];
      int int0 = IOUtils.decodeUTF8(byteArray0, 7, 7, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.util.UTF8Decoder");
      char[] charArray0 = new char[7];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      IOUtils.decodeUTF8(byteArray0, 7, 7, charArray0);
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) (-1), (-1), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = '\u00CD';
      charArray0[1] = '\u00CD';
      charArray0[2] = '\u00CD';
      charArray0[3] = '\u00CD';
      charArray0[4] = '\u00CD';
      charArray0[5] = '\u00CD';
      charArray0[6] = '\u00CD';
      charArray0[7] = '\u00CD';
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-74);
      byteArray0[1] = (byte)46;
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 3, (byte)46, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[16];
      charArray0[4] = '\u00DD';
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 3, (byte)55, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("J=", 1, 1);
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
      IOUtils.stringSize((-2332));
      IOUtils.isIdent('\u0104');
      char[] charArray0 = new char[3];
      charArray0[0] = '\u0104';
      charArray0[1] = '\u0104';
      charArray0[2] = '\u0104';
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-32);
      byteArray0[1] = (byte) (-23);
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 128, 1, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 128
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String string0 = "com.alibaba.fastjson.util.UTF8Decoder";
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.util.UTF8Decoder");
      char[] charArray0 = new char[11];
      IOUtils.decodeUTF8(byteArray0, 21, 21, charArray0);
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1128L), (-789), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -790
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('\u0104');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)0;
      byteArray0[4] = (byte)105;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)12;
      byteArray0[7] = (byte) (-12);
      char[] charArray0 = new char[6];
      charArray0[0] = 'T';
      char char0 = '/';
      charArray0[1] = '/';
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 6, '/', charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)3;
      byteArray0[1] = (byte)3;
      byteArray0[2] = (byte)3;
      byteArray0[3] = (byte)76;
      byteArray0[4] = (byte)105;
      byteArray0[5] = (byte)3;
      byteArray0[6] = (byte)12;
      byteArray0[7] = (byte) (-12);
      char[] charArray0 = new char[6];
      charArray0[0] = 'T';
      charArray0[1] = '/';
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)3, 6, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'L', 'i', '\u0003', '\f', '\u0000', '\u0000'}, charArray0);
      
      boolean boolean0 = IOUtils.firstIdentifier('Z');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      byte[] byteArray0 = new byte[25];
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)76;
      byteArray0[4] = (byte)121;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)12;
      byteArray0[7] = (byte) (-26);
      char[] charArray0 = new char[6];
      charArray0[2] = 'T';
      charArray0[1] = '\u0000';
      int int0 = IOUtils.decodeUTF8(byteArray0, 6, 13, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\f', '\u0000', 'T', '\u0000', '\u0000', '\u0000'}, charArray0);
      
      boolean boolean0 = IOUtils.firstIdentifier('\f');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      char[] charArray0 = new char[5];
      charArray0[0] = '3';
      charArray0[1] = 'n';
      charArray0[2] = 'C';
      charArray0[3] = 'z';
      charArray0[4] = 'o';
      int int0 = IOUtils.decodeUTF8(byteArray0, 21, 101, charArray0);
      assertArrayEquals(new char[] {'q', '\u05DF', 'C', 'z', 'o'}, charArray0);
      assertEquals((-1), int0);
  }
}
