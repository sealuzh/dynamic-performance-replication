/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 03:41:16 GMT 2019
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.CharArrayReader;
import java.io.Closeable;
import java.io.Reader;
import java.io.StringReader;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[4] = (byte)70;
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 4, 113, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("z?'=");
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("A%");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("[K$I>Aq8Y&|", 5, 57);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("", 1, 1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[3] = '|';
      charArray0[4] = '=';
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 1, 4);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      int int0 = IOUtils.stringSize(9999);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.getChars(56320, (-1), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        IOUtils.getChars(65536, (-1375), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1376
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483647L, (-1757), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1758
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      int int0 = IOUtils.stringSize(10L);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile("j}$mh=n}g");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      IOUtils.close(mockFileOutputStream0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      String string0 = IOUtils.readAll(stringReader0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      int int0 = IOUtils.stringSize(0L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      int int0 = IOUtils.stringSize(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      int int0 = IOUtils.stringSize((-1782));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
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
  public void test017()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('Z');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.getChars(9999999995L, 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(0L, (-1318), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1319
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(6, 6, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((int) (byte)0, (-129), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      char[] charArray0 = new char[6];
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
  public void test023()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)0, 224, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 223
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('3');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      char[] charArray0 = new char[6];
      byte[] byteArray0 = new byte[3];
      int int0 = IOUtils.encodeUTF8(charArray0, 0, 0, byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      char[] charArray0 = new char[5];
      byte[] byteArray0 = new byte[0];
      int int0 = IOUtils.encodeUTF8(charArray0, (-1132), (-1132), byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("*`T4Wc%/oW=5'ntV&*");
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8((char[]) null, 0, 1, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, (-2485), 1390, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2485
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      char[] charArray0 = new char[5];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, 0, charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      char[] charArray0 = new char[1];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte) (-45), (byte) (-45), charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      char[] charArray0 = new char[9];
      int int0 = IOUtils.decodeUTF8((byte[]) null, 3968, (-3353), charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 3253, 3253, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3253
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 0, 32);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      char[] charArray0 = new char[5];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        IOUtils.decode(uTF8Decoder0, (ByteBuffer) null, charBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.UTF8Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars(4231L, 1574, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((-684), (-684), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)74, 2145318845, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 1738, 1738, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)0, (byte) (-14), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((char[]) null, 4, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, (-110), (-110));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -221
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((String) null, (-3798), (-3798));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
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
  public void test046()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-33);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      CharBuffer charBuffer0 = CharBuffer.allocate(120);
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
  public void test047()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(9999999);
      CharBuffer charBuffer0 = CharBuffer.allocate(9999999);
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
  public void test048()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        IOUtils.decode((CharsetDecoder) null, byteBuffer0, (CharBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(191);
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
  public void test050()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("Ig.n7");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("A%");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      char[] charArray0 = new char[5];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      String string0 = IOUtils.readAll(charArrayReader0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      char[] charArray0 = new char[5];
      byte[] byteArray0 = new byte[6];
      byteArray0[5] = (byte) (-12);
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)3, (byte)15, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-29);
      char[] charArray0 = new char[9];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)0, 1158, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-32);
      char[] charArray0 = new char[2];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, 30, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[5] = (byte) (-40);
      char[] charArray0 = new char[5];
      int int0 = IOUtils.decodeUTF8(byteArray0, 4, 742, charArray0);
      assertEquals((-1), int0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      char[] charArray0 = new char[6];
      byte[] byteArray0 = IOUtils.specicalFlags_doubleQuotes;
      int int0 = IOUtils.decodeUTF8(byteArray0, 18, 1, charArray0);
      assertArrayEquals(new char[] {'\u0004', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      char[] charArray0 = new char[5];
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte) (-112);
      int int0 = IOUtils.decodeUTF8(byteArray0, 3, 192, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 0, 30, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      char[] charArray0 = new char[5];
      byte[] byteArray0 = new byte[3];
      int int0 = IOUtils.encodeUTF8(charArray0, 1, 1, byteArray0);
      assertEquals(1, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[7] = '\u0083';
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 7, (byte)98, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("c>|(Lv%[Z6E", 5, 5);
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 5, 5, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("UTF8W8");
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("c");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("@?E=");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("com.alibaba.fastjson.util.UTF8Decoder", 29, 3);
      assertEquals(2, byteArray0.length);
      assertArrayEquals(new byte[] {(byte) (-16), (byte)55}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("]'X(@j!q+k", 6, 6);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("@hy6g!tp?H-(2/J{9", 4, 5);
      assertArrayEquals(new byte[] {(byte) (-1), (byte) (-5), (byte)105}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("", 0, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(";'ju8oGWw'", 4, (-2));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[1] = '=';
      charArray0[4] = '=';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 1, 4);
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[1] = '=';
      charArray0[4] = 'b';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 1, 4);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[2] = 'b';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 1, 4);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = '=';
      charArray0[1] = '=';
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 1, 1);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      char[] charArray0 = new char[3];
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 3, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 1, 4);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('`');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('8');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('A');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('\u0096');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Charset charset0 = IOUtils.UTF8;
      CharsetDecoder charsetDecoder0 = charset0.newDecoder();
      CharBuffer charBuffer0 = CharBuffer.allocate(1531);
      ByteBuffer byteBuffer0 = charset0.encode(charBuffer0);
      // Undeclared exception!
      try { 
        IOUtils.decode(charsetDecoder0, byteBuffer0, charBuffer0);
        fail("Expecting exception: BufferOverflowException");
      
      } catch(BufferOverflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.charset.CoderResult", e);
      }
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      Charset charset0 = IOUtils.UTF8;
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.put(charBuffer1);
      ByteBuffer byteBuffer0 = charset0.encode(charBuffer0);
      IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
      assertEquals(0, charBuffer0.remaining());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      char[] charArray0 = new char[9];
      IOUtils.getChars((byte)65, 4, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'\u0000', '\u0000', '0', '5', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      char[] charArray0 = new char[5];
      IOUtils.getChars((byte) (-23), 4, charArray0);
      assertArrayEquals(new char[] {'\u0000', '-', '2', '3', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)60, (int) (byte) (-15), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -16
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      char[] charArray0 = new char[5];
      IOUtils.getChars(1, 1, charArray0);
      //  // Unstable assertion: assertArrayEquals(new char[] {'9', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1637), 4, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-2145100202), 1, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.getChars(3, 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      char[] charArray0 = new char[13];
      // Undeclared exception!
      try { 
        IOUtils.getChars(9999999995L, 4, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      char[] charArray0 = new char[8];
      IOUtils.getChars((-489L), 4, charArray0);
      assertArrayEquals(new char[] {'-', '4', '8', '9', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      char[] charArray0 = new char[9];
      IOUtils.getChars(100000L, 7, charArray0);
      assertArrayEquals(new char[] {'\u0000', '1', '0', '0', '0', '0', '0', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      int int0 = IOUtils.stringSize(3088L);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      int int0 = IOUtils.stringSize((-1722L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      MockFile mockFile0 = new MockFile("j}$mh=n}g");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      IOUtils.close(mockFileOutputStream0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      String string0 = IOUtils.getStringProperty("zC}");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
  }
}
