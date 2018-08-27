/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 06:43:09 GMT 2018
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.BufferedInputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.ObjectStreamConstants;
import java.io.PipedReader;
import java.io.StringReader;
import java.net.URI;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(99, 77, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 76
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((-4203), (-4203), (char[]) null);
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
      IOUtils.stringSize(45L);
      IOUtils.firstIdentifier('|');
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)0, (int) (byte)0, charArray0);
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
      char[] charArray0 = new char[2];
      charArray0[1] = 'v';
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-12), (-347), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -348
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("~g>(EY");
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-60)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IOUtils.decodeBase64("lRM|;[$>b?Yd;-fV");
      IOUtils.close((Closeable) null);
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      assertEquals(1.0F, uTF8Decoder0.maxCharsPerByte(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      IOUtils.decodeBase64("_J-hC");
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = IOUtils.decodeBase64((char[]) null, 128, 0);
      IOUtils.getStringProperty("com.alibaba.fastjson.JSONException");
      IOUtils.stringSize(3741);
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8((char[]) null, 3741, 3741, byteArray0);
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
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("zZo");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      IOUtils.decodeBase64("");
      IOUtils iOUtils0 = new IOUtils();
      Charset.defaultCharset();
      IOUtils.close(stringReader0);
      short short0 = ObjectStreamConstants.STREAM_VERSION;
      IOUtils.getStringProperty("fastjson.compatibleWithFieldName");
      IOUtils.loadPropertiesFromFile();
      IOUtils.isValidJsonpQueryParam("NtQ4.");
      // Undeclared exception!
      try { 
        IOUtils.getChars(76, 76, iOUtils0.DIGITS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 75
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IOUtils.isValidJsonpQueryParam("sI\"#zj/O");
      IOUtils iOUtils0 = new IOUtils();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1914L), 37, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 36
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Enumeration<BufferedInputStream> enumeration0 = (Enumeration<BufferedInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = IOUtils.decodeBase64("3xk", 3318, 0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IOUtils.getStringProperty("com.alibaba.fastjson.JSONException");
      int int0 = IOUtils.stringSize(3741);
      assertEquals(4, int0);
      
      boolean boolean0 = IOUtils.isIdent('o');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      byte[] byteArray0 = IOUtils.decodeBase64("6n,UYRmAcmP)H0L9");
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.loadPropertiesFromFile();
      IOUtils.decodeUTF8(byteArray0, 2, 2, iOUtils0.CA);
      Charset.defaultCharset();
      String string0 = IOUtils.getStringProperty("fastjson.properties");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = IOUtils.stringSize(224);
      assertEquals(3, int0);
      
      byte[] byteArray0 = IOUtils.decodeBase64("n{8}");
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      char[] charArray0 = new char[2];
      charArray0[0] = '!';
      charArray0[1] = '?';
      int int0 = IOUtils.decodeUTF8(byteArray0, (-3423), (-1), charArray0);
      assertEquals(0, int0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("read string from reader error", (-1336), (-1336));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IOUtils.decodeBase64("");
      char[] charArray0 = new char[20];
      charArray0[0] = '9';
      charArray0[1] = '\'';
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 156, 156);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 156
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      byte[] byteArray0 = IOUtils.specicalFlags_doubleQuotes;
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.loadPropertiesFromFile();
      CharArrayReader charArrayReader0 = new CharArrayReader(iOUtils0.CA, 2, 2);
      String string0 = IOUtils.readAll(charArrayReader0);
      assertEquals("CD", string0);
      
      int int1 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      Charset.defaultCharset();
      IOUtils.getStringProperty("fastjson.properties");
      boolean boolean0 = IOUtils.isIdent('&');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(iOUtils0.DIGITS, 9, 9, iOUtils0.specicalFlags_singleQuotes);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8((char[]) null, 16, 16, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FileSystemHandling.shouldAllThrowIOExceptions();
      char[] charArray0 = new char[5];
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray1 = new byte[4];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, (byte)0, (byte)65, byteArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      CharsetDecoder charsetDecoder0 = uTF8Decoder0.reset();
      Charset charset0 = uTF8Decoder0.charset();
      ByteBuffer byteBuffer0 = charset0.encode("TknK9u");
      CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
      IOUtils.decode(charsetDecoder0, byteBuffer0, charBuffer0);
      assertEquals("TknK9u", charBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char char0 = 'n';
      IOUtils.firstIdentifier('n');
      IOUtils.decodeBase64(";");
      char[] charArray0 = null;
      // Undeclared exception!
      try { 
        IOUtils.getChars(1073741824, 1073741824, (char[]) null);
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
      int int0 = IOUtils.stringSize(3741);
      assertEquals(4, int0);
      
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.util.UTF8Decoder", 5, 4);
      assertArrayEquals(new byte[] {(byte) (-106), (byte)38, (byte) (-38)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      boolean boolean1 = IOUtils.isIdent(';');
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.stringSize((-199L));
      IOUtils.getChars(1, 1, iOUtils0.ASCII_CHARS);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      IOUtils.stringSize(2);
      char[] charArray0 = new char[25];
      charArray0[0] = 'W';
      charArray0[3] = '0';
      charArray0[5] = '0';
      charArray0[17] = 'W';
      charArray0[7] = '0';
      IOUtils.getChars(2, 1, charArray0);
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)96, 1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      IOUtils.stringSize(2147483647L);
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.decodeUTF8(iOUtils0.specicalFlags_doubleQuotes, 10, 10, iOUtils0.CA);
      Charset.defaultCharset();
      IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 44, 10);
      IOUtils.getChars(10, 10, iOUtils0.ASCII_CHARS);
      IOUtils.getChars((long) 44, 45, iOUtils0.CA);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      IOUtils iOUtils0 = new IOUtils();
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode("fastjson.properties");
      Charset.defaultCharset();
      byteBuffer0.asLongBuffer();
      short short0 = ObjectStreamConstants.STREAM_VERSION;
      int int0 = IOUtils.decodeUTF8(iOUtils0.specicalFlags_doubleQuotes, 49, (short)5, iOUtils0.ASCII_CHARS);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_doubleQuotes;
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      IOUtils.stringSize((-327));
      IOUtils.getStringProperty("#!J");
      IOUtils.isValidJsonpQueryParam((String) null);
      IOUtils iOUtils0 = new IOUtils();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      IOUtils.stringSize(2147483647L);
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.decodeUTF8(iOUtils0.specicalFlags_doubleQuotes, 10, 10, iOUtils0.CA);
      Charset.defaultCharset();
      String string0 = IOUtils.FASTJSON_PROPERTIES;
      IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 10, 10);
      IOUtils.getChars(10, 10, iOUtils0.ASCII_CHARS);
      IOUtils.loadPropertiesFromFile();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("fastjson.properties", 10, 10);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = ObjectStreamConstants.baseWireHandle;
      IOUtils iOUtils0 = new IOUtils();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      IOUtils.loadPropertiesFromFile();
      int int1 = ObjectStreamConstants.baseWireHandle;
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.replaceChars, 4, 8257536);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8257539
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("Cr<|{]e2{X`=");
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.encodeUTF8(iOUtils0.CA, (-1804), (-8), iOUtils0.specicalFlags_doubleQuotes);
      FileSystemHandling.shouldAllThrowIOExceptions();
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)0, 55, iOUtils0.DIGITS);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-1), (byte) (-34), (byte) (-1), (byte) (-1)}, byteArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      IOUtils.stringSize(2749L);
      Charset charset0 = IOUtils.UTF8;
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = charset0.encode("vI}uMLu-H16*zWz'1@");
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
  public void test36()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      IOUtils.decodeBase64("6n,UYRmAcmP)H0L9");
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.decodeUTF8(iOUtils0.specicalFlags_doubleQuotes, (-2147200370), (-543), iOUtils0.ASCII_CHARS);
      // Undeclared exception!
      try { 
        IOUtils.getChars(971L, 2, iOUtils0.replaceChars);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      IOUtils.stringSize(2147483647L);
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.decodeUTF8(iOUtils0.specicalFlags_doubleQuotes, 10, 10, iOUtils0.CA);
      Charset.defaultCharset();
      IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 44, 10);
      IOUtils.getChars(10, 10, iOUtils0.ASCII_CHARS);
      IOUtils.loadPropertiesFromFile();
      IOUtils.getChars((long) (-1666), 10, iOUtils0.DIGITS);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode("fastjson.properties");
      byteBuffer0.flip();
      Charset.defaultCharset();
      byteBuffer0.asLongBuffer();
      short short0 = ObjectStreamConstants.STREAM_MAGIC;
      byte byte0 = (byte)108;
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(iOUtils0.specicalFlags_doubleQuotes, 10, 2239, iOUtils0.DIGITS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      IOUtils.getChars(122, 7, iOUtils0.CA);
      boolean boolean0 = IOUtils.firstIdentifier('*');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      IOUtils.stringSize(2147483647L);
      IOUtils iOUtils0 = new IOUtils();
      int int0 = ObjectStreamConstants.baseWireHandle;
      Charset.defaultCharset();
      String string0 = IOUtils.FASTJSON_COMPATIBLEWITHFIELDNAME;
      IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 44, 10);
      IOUtils.getChars((-1420), 10, iOUtils0.DIGITS);
      IOUtils.isIdent('A');
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[9];
      IOUtils.getChars((byte)2, (int) (byte)2, charArray0);
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483649L, (int) (byte)2, charArray0);
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
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("t==(,\"~d)r", 6, 6);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      IOUtils.decodeBase64("ABCDEFGHIJKLNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", 2, 54);
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      IOUtils.loadPropertiesFromFile();
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      CodingErrorAction codingErrorAction0 = uTF8Decoder0.unmappableCharacterAction();
      CharsetDecoder charsetDecoder0 = uTF8Decoder0.onUnmappableCharacter(codingErrorAction0);
      // Undeclared exception!
      try { 
        charsetDecoder0.replaceWith("fastjson.compatibleWithJavaBean");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Replacement too long
         //
         verifyException("java.nio.charset.CharsetDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      IOUtils.stringSize(2147483647L);
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.decodeUTF8(iOUtils0.specicalFlags_doubleQuotes, 10, 10, iOUtils0.CA);
      Charset.defaultCharset();
      IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 44, 10);
      IOUtils.getChars(10, 10, iOUtils0.ASCII_CHARS);
      IOUtils.loadPropertiesFromFile();
      IOUtils.isIdent('Q');
      IOUtils.getChars((byte) (-77), 10, iOUtils0.DIGITS);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      IOUtils.stringSize(2147483647L);
      IOUtils iOUtils0 = new IOUtils();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      IOUtils.decodeBase64(iOUtils0.CA, 10, 10);
      IOUtils.isValidJsonpQueryParam("Kx<DUUgg)+]x8;y^");
      PipedReader pipedReader0 = new PipedReader(2);
      PipedReader pipedReader1 = new PipedReader(2);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      IOUtils.stringSize((-11));
      IOUtils iOUtils0 = new IOUtils();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      IOUtils.loadPropertiesFromFile();
      int int0 = ObjectStreamConstants.baseWireHandle;
      IOUtils.decodeBase64(iOUtils0.replaceChars, 4, 1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      char[] charArray0 = new char[15];
      FileSystemHandling.shouldAllThrowIOExceptions();
      charArray0[3] = '\u00B3';
      charArray0[1] = '\u00B3';
      byte[] byteArray0 = IOUtils.specicalFlags_doubleQuotes;
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 1, '\u00B3', byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 15
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("t==(j,\"~d),r", 2, 2);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-9);
      byteArray0[2] = (byte)116;
      byteArray0[8] = (byte)66;
      byteArray0[4] = (byte) (-12);
      byteArray0[8] = (byte)64;
      char[] charArray0 = new char[1];
      IOUtils.decodeUTF8(byteArray0, (byte)0, (byte)64, charArray0);
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) (byte) (-9), 33, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 32
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("t==(j,\"~d|u),r", 1, 1);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFmHIJKLMNOPQ[STUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.stringSize(2147483647L);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      IOUtils iOUtils1 = new IOUtils();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(1);
      IOUtils.decodeUTF8(byteArray0, 10, 426, iOUtils0.DIGITS);
      Charset.defaultCharset();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      IOUtils.getStringProperty("fastjson.compatibleWithFieldName");
      charArrayWriter0.reset();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils1.DIGITS, (-1), 856);
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
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      String string0 = "ABCDEFmHIJKLMNOPQ[STUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFmHIJKLMNOPQ[STUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.stringSize(2147483647L);
      IOUtils iOUtils1 = new IOUtils();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(1);
      IOUtils.decodeUTF8(byteArray0, 10, 1, iOUtils0.DIGITS);
      CharArrayWriter charArrayWriter1 = null;
      try {
        charArrayWriter1 = new CharArrayWriter((-516));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative initial size: -516
         //
         verifyException("java.io.CharArrayWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringReader stringReader0 = new StringReader(";");
      stringReader0.ready();
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.encodeUTF8(iOUtils0.replaceChars, 34, 34, iOUtils0.specicalFlags_singleQuotes);
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode("fastjson.properties");
      stringReader0.close();
      Charset.defaultCharset();
      byteBuffer0.asLongBuffer();
      IOUtils.close(stringReader0);
      short short0 = ObjectStreamConstants.STREAM_VERSION;
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile(";");
      URI uRI0 = mockFile0.toURI();
      mockFile0.toPath();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/23_fastjson/;");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      IOUtils.loadPropertiesFromFile();
      IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, (int) (short)5, 68);
      MockURI.getRawSchemeSpecificPart(uRI0);
      IOUtils.stringSize(68);
      Charset charset0 = IOUtils.UTF8;
      Charset.defaultCharset();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      CharBuffer charBuffer0 = uTF8Decoder0.decode(byteBuffer0);
      charset0.encode(charBuffer0);
      uTF8Decoder0.replacement();
      FileSystemHandling.appendDataToFile(evoSuiteFile0, iOUtils0.specicalFlags_singleQuotes);
      IOUtils.isValidJsonpQueryParam("\uFFFD");
      UTF8Decoder uTF8Decoder1 = new UTF8Decoder();
      CodingErrorAction codingErrorAction0 = uTF8Decoder1.malformedInputAction();
      uTF8Decoder1.onMalformedInput(codingErrorAction0);
      CodingErrorAction codingErrorAction1 = uTF8Decoder1.malformedInputAction();
      uTF8Decoder1.onMalformedInput(codingErrorAction1);
      CharBuffer charBuffer1 = charset0.decode(byteBuffer0);
      // Undeclared exception!
      try { 
        uTF8Decoder1.flush(charBuffer1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Current state = RESET, new state = FLUSHED
         //
         verifyException("java.nio.charset.CharsetDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getStringProperty("fastjson.compatibleWithFieldName");
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      byte[] byteArray0 = IOUtils.decodeBase64("TfnpWhvmzF");
      FileSystemHandling.shouldAllThrowIOExceptions();
      iOUtils0.DEFAULT_PROPERTIES.getProperty("fastjson.compatibleWithFieldName");
      IOUtils.decodeUTF8(byteArray0, 2, 90, iOUtils0.CA);
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-68), (-3782), iOUtils0.ASCII_CHARS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3783
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringReader stringReader0 = new StringReader("J");
      stringReader0.ready();
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getStringProperty("fastjson.compatibleWithFieldName");
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      byte[] byteArray0 = IOUtils.decodeBase64("TfnpWhvmzF");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      IOUtils.readAll(stringReader0);
      IOUtils.decodeUTF8(byteArray0, 2, 2, iOUtils0.DIGITS);
      int int1 = 33;
      // Undeclared exception!
      try { 
        IOUtils.getChars((-170L), 445, iOUtils0.CA);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 444
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }
}