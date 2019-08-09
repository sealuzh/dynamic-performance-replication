/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 14:16:05 GMT 2019
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.Reader;
import java.io.StringReader;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-59);
      byteArray0[2] = (byte) (-59);
      char[] charArray0 = new char[6];
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, (byte)45, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_singleQuotes;
      char[] charArray0 = new char[20];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)45, (byte)45, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("=uJA:FM ZY6.!Njw3?");
      assertEquals(12, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("N=Z=Mx0O", (int) (byte)3, 6979);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[5] = 'A';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 3, 3);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = IOUtils.stringSize(99999);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(56320, 56320, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 56319
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) 65536, 336, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 335
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483647L, 3, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = IOUtils.stringSize(10000000000L);
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-2147483645), 2, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileReader mockFileReader0 = new MockFileReader(fileDescriptor0);
      IOUtils.close(mockFileReader0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = IOUtils.stringSize(0L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = IOUtils.stringSize((-1523L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = IOUtils.stringSize((int) (byte)0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = IOUtils.stringSize((-2170));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.readAll((Reader) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // read string from reader error
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('1');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-2243L), (-2190), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2191
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-3804L), 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars(0L, (-1129), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1130
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1952257876), (-1952257876), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1952257877
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.getChars(0, 0, charArray0);
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
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)0, 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('5');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('a');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = new byte[9];
      int int0 = IOUtils.encodeUTF8(charArray0, 0, 0, byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 2704, 2704, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2704
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 0, 0, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8((byte[]) null, 59264, 81, charArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, (-1014), (-1014));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2029
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 0, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("h9QWvY!W1p", (-8), (-8));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("", 5408, 5408);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "fastjson.properties");
      // Undeclared exception!
      try { 
        IOUtils.decode((CharsetDecoder) null, (ByteBuffer) null, charBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars(13, 13, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-91), (-728), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)91, (-545), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -546
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8((char[]) null, (-2543), (-391), (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (-1), (-1), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((char[]) null, 256, 256);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((String) null, 255, 255);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("@([<lN+E9#", 3, 1);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("=");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
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
  public void test48()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.util.IOUtils$1", 7, 7);
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      Charset charset0 = uTF8Decoder0.charset();
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "com.alibaba.fastjson.util.IOUtils$1");
      // Undeclared exception!
      try { 
        IOUtils.decode(charsetDecoder0, byteBuffer0, charBuffer0);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.StringCharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      Charset charset0 = Charset.defaultCharset();
      CharBuffer charBuffer0 = CharBuffer.allocate(8);
      ByteBuffer byteBuffer0 = charset0.encode(charBuffer0);
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
  public void test50()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(116);
      Charset charset0 = IOUtils.UTF8;
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      CharBuffer charBuffer0 = charset0.decode(byteBuffer0);
      // Undeclared exception!
      try { 
        IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      // Undeclared exception!
      try { 
        IOUtils.decode(uTF8Decoder0, (ByteBuffer) null, (CharBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.UTF8Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(76);
      CharBuffer charBuffer0 = uTF8Decoder0.decode(byteBuffer0);
      // Undeclared exception!
      try { 
        IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Current state = FLUSHED, new state = CODING_END
         //
         verifyException("java.nio.charset.CharsetDecoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('!');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('Z');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("com.alibaba.fastjson.JSONException");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringReader stringReader0 = new StringReader("p");
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("p", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      byteArray0[2] = (byte) (-11);
      char[] charArray0 = new char[6];
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, (byte)45, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte) (-31);
      char[] charArray0 = new char[4];
      int int0 = IOUtils.decodeUTF8(byteArray0, 2, 5, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      byte[] byteArray0 = new byte[25];
      byteArray0[1] = (byte) (-32);
      char[] charArray0 = new char[6];
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, (byte)40, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-18);
      char[] charArray0 = new char[9];
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, 1, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-59);
      char[] charArray0 = new char[6];
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, (byte)45, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_singleQuotes;
      char[] charArray0 = new char[20];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 4, 898, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      char[] charArray0 = new char[20];
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.JSONException");
      int int0 = IOUtils.decodeUTF8(byteArray0, 16, 16, charArray0);
      assertEquals(25, byteArray0.length);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      char[] charArray0 = new char[9];
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, 1, charArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      char[] charArray0 = new char[20];
      byte[] byteArray0 = IOUtils.decodeBase64("");
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 19, 110, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      char[] charArray0 = new char[9];
      charArray0[2] = '\u008E';
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 2, (byte)36, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      byte[] byteArray0 = IOUtils.specicalFlags_singleQuotes;
      char[] charArray0 = new char[20];
      int int0 = IOUtils.encodeUTF8(charArray0, 4, 4, byteArray0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      char[] charArray0 = new char[20];
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.JSONException");
      int int0 = IOUtils.encodeUTF8(charArray0, (-1), (-1969), byteArray0);
      assertEquals(0, int0);
      assertEquals(25, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("s[y'2IY*,}nWVWgTm=<");
      assertEquals(12, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("$&=");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.JSONException", 6, 6);
      assertEquals(3, byteArray0.length);
      assertArrayEquals(new byte[] {(byte) (-119), (byte) (-74), (byte) (-101)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64(" ]nmC", 1, 1);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("=\\'%%*oox9WMZQBH", 4, 4);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("4?oCPd:9AI,vA2D", 7, 2);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("CK7AJ( qPb", 0, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[3] = 'j';
      charArray0[5] = 'V';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 3, 3);
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      char[] charArray0 = new char[22];
      charArray0[1] = 'j';
      charArray0[4] = 'k';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 1, 6);
      assertEquals(3, byteArray0.length);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-1), (byte) (-28)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      char[] charArray0 = new char[6];
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
  public void test81()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("UTF-8");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('\u0107');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('/');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      char[] charArray0 = new char[6];
      byte[] byteArray0 = IOUtils.decodeBase64("4?oCPd:9AI,vA2D");
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // utf8 decode error, Input length = 1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      Charset charset0 = uTF8Decoder0.charset();
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      CharBuffer charBuffer0 = uTF8Decoder0.decode(byteBuffer0);
      IOUtils.decode(charsetDecoder0, byteBuffer0, charBuffer0);
      assertEquals(1.0F, charsetDecoder0.maxCharsPerByte(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      char[] charArray0 = new char[9];
      IOUtils.getChars((byte) (-2), 9, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '-', '1'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      char[] charArray0 = new char[9];
      IOUtils.getChars((byte)36, 2, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'3', '0', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      char[] charArray0 = new char[22];
      IOUtils.getChars(19, 19, charArray0);
      assertEquals(22, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        IOUtils.getChars(65536, (-1952257856), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1952257857
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      char[] charArray0 = new char[6];
      IOUtils.getChars((-1), 3, charArray0);
      assertArrayEquals(new char[] {'\u0000', '-', '1', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      char[] charArray0 = new char[34];
      IOUtils.getChars((-1902L), 30, charArray0);
      assertEquals(34, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      char[] charArray0 = new char[11];
      IOUtils.getChars(10000000004L, 11, charArray0);
      assertEquals(11, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("fastjson.compatibleWithJavaBean");
      IOUtils.close(mockPrintWriter0);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      String string0 = IOUtils.getStringProperty("]W+(%s|)yB`/@");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.decodeUTF8(iOUtils0.specicalFlags_doubleQuotes, 49, (-1647), iOUtils0.replaceChars);
      assertEquals(0, int0);
  }
}