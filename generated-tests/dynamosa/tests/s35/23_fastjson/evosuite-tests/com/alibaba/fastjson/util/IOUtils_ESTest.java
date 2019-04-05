/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 01:31:46 GMT 2019
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.BufferedOutputStream;
import java.io.CharArrayReader;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.Reader;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.CharsetDecoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtils_ESTest extends IOUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("+r82VPFb+.6mU\"\"AC=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = new byte[11];
      byteArray0[1] = (byte) (-57);
      byteArray0[2] = (byte) (-57);
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)0, 192, iOUtils0.replaceChars);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = IOUtils.decodeBase64("fastjson.compatibleWithJavaBean");
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, 1, iOUtils0.DIGITS);
      assertEquals(23, byteArray0.length);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(iOUtils0.specicalFlags_singleQuotes, 136, 136, iOUtils0.DIGITS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("+r82VPFb+.6mU\"\"AC=");
      assertEquals(12, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
      assertEquals(48, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("kFzj0Ah<&)Va'P:.d/", 3, 3);
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.CA, 0, 84);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 83
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.replaceChars, (-1425), (-1425));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2851
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      int int0 = IOUtils.stringSize(99);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        IOUtils.getChars(52429, 52429, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 52428
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      char[] charArray0 = new char[1];
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
  public void test012()  throws Throwable  {
      int int0 = IOUtils.stringSize(100000L);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars(2147462204, 10, iOUtils0.replaceChars);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileReader mockFileReader0 = new MockFileReader(fileDescriptor0);
      IOUtils.close(mockFileReader0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      char[] charArray0 = new char[0];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      String string0 = IOUtils.readAll(charArrayReader0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.decodeUTF8(iOUtils0.specicalFlags_singleQuotes, 61, 61, iOUtils0.ASCII_CHARS);
      assertEquals(61, int0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      int int0 = IOUtils.stringSize(0L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      int int0 = IOUtils.stringSize((-3320L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      int int0 = IOUtils.stringSize(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      int int0 = IOUtils.stringSize((-34));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
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
  public void test022()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('9');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) 1513, 1513, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1512
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        IOUtils.getChars(2147483647L, 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.getChars(0L, (-3576), iOUtils0.replaceChars);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3577
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars(3955, 3955, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3954
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.getChars(1, 0, iOUtils0.DIGITS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        IOUtils.getChars(0, 3052, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3051
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)6, 0, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)89, 0, iOUtils0.ASCII_CHARS);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte)0, (-2590), charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2591
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('9');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 1, (-2), (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(iOUtils0.ASCII_CHARS, 3, 3, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      char[] charArray0 = new char[5];
      byte[] byteArray0 = new byte[1];
      int int0 = IOUtils.encodeUTF8(charArray0, 0, 0, byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      char[] charArray0 = new char[6];
      byte[] byteArray0 = new byte[5];
      int int0 = IOUtils.encodeUTF8(charArray0, 118, (-322), byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, 0, 3096, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("kh6IHvfD:C");
      assertEquals(8, byteArray0.length);
      
      char[] charArray0 = new char[0];
      int int0 = IOUtils.decodeUTF8(byteArray0, 4, 4, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, (byte)0, (byte)0, (char[]) null);
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
      byte[] byteArray0 = new byte[6];
      char[] charArray0 = new char[2];
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte) (-47), (byte) (-47), charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      char[] charArray0 = new char[1];
      int int0 = IOUtils.decodeUTF8((byte[]) null, 3, (-511), charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (-740), (-740));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("-");
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      // Undeclared exception!
      try { 
        IOUtils.decode(uTF8Decoder0, byteBuffer0, (CharBuffer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.UTF8Decoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(iOUtils0.specicalFlags_singleQuotes);
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      CharBuffer charBuffer0 = uTF8Decoder0.decode(byteBuffer0);
      // Undeclared exception!
      try { 
        IOUtils.decode((CharsetDecoder) null, byteBuffer0, charBuffer0);
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
        IOUtils.getStringProperty((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getStringProperty("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((long) 2581, 2581, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.getChars((int) (byte)69, (int) (byte)69, (char[]) null);
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
      // Undeclared exception!
      try { 
        IOUtils.getChars((byte) (-65), (int) (byte) (-65), (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8((char[]) null, 2470, 2470, iOUtils0.specicalFlags_singleQuotes);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(byteArray0, 4046, 4046, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((char[]) null, (-2108438489), (-2108438489));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64((String) null, 686, 686);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", 53, (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
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
  public void test056()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("\u0000\u0000\u0000\u0000\u0000\u0000");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      CharsetDecoder charsetDecoder0 = iOUtils0.UTF8.newDecoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(124);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "fastjson.compatibleWithJavaBean");
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
  public void test058()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(iOUtils0.specicalFlags_doubleQuotes);
      CharBuffer charBuffer0 = CharBuffer.wrap(iOUtils0.CA);
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
  public void test059()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(28);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "fastjson.compatibleWithJavaBean");
      // Undeclared exception!
      try { 
        IOUtils.decode(uTF8Decoder0, byteBuffer0, charBuffer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      CharBuffer charBuffer0 = CharBuffer.wrap(iOUtils0.replaceChars);
      CharsetDecoder charsetDecoder0 = iOUtils0.UTF8.newDecoder();
      // Undeclared exception!
      try { 
        IOUtils.decode(charsetDecoder0, (ByteBuffer) null, charBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode("fastjson.properties");
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
  public void test062()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('Z');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("fastjson.properties");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      boolean boolean0 = IOUtils.isValidJsonpQueryParam((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      CharArrayReader charArrayReader0 = new CharArrayReader(iOUtils0.ASCII_CHARS);
      String string0 = IOUtils.readAll(charArrayReader0);
      //  // Unstable assertion: assertEquals("\u0000\u00000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u000422232425262728292A2B2C2D2E2F", string0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-32);
      byteArray0[2] = (byte) (-65);
      char[] charArray0 = new char[1];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, (byte)30, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-32);
      char[] charArray0 = new char[1];
      int int0 = IOUtils.decodeUTF8(byteArray0, 0, (byte)30, charArray0);
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      byte[] byteArray0 = new byte[11];
      byteArray0[2] = (byte) (-64);
      int int0 = IOUtils.decodeUTF8(byteArray0, (byte)0, 192, iOUtils0.replaceChars);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-57);
      char[] charArray0 = new char[7];
      int int0 = IOUtils.decodeUTF8(byteArray0, 1, 999, charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      char[] charArray0 = new char[3];
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeUTF8(iOUtils0.specicalFlags_singleQuotes, 'D', 'D', charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      char[] charArray0 = new char[7];
      charArray0[0] = '\u0080';
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8(charArray0, (byte)0, 118, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      int int0 = IOUtils.encodeUTF8(iOUtils0.CA, 3, 3, iOUtils0.specicalFlags_doubleQuotes);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("Bodg}:O::=");
      // Undeclared exception!
      try { 
        IOUtils.encodeUTF8((char[]) null, (-1093), 106, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000E1F202122232425262818292A2B2C2D2E2F");
      assertEquals(26, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("");
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64(":9-O JH.N;4.NBF", 6, 6);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("3<{", 1, 1);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64("[[._A0.ntR{UTk}ype", 3, 3);
      assertEquals(1, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      byte[] byteArray0 = IOUtils.decodeBase64((String) null, 0, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64("", 90, 1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[1] = 'o';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 1, 6);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[1] = 'o';
      charArray0[6] = 'k';
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 1, 6);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      char[] charArray0 = new char[2];
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
  public void test085()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[2] = '=';
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
  public void test086()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '=';
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(charArray0, 1, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      char[] charArray0 = new char[0];
      byte[] byteArray0 = IOUtils.decodeBase64(charArray0, 0, 0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.decodeBase64(iOUtils0.ASCII_CHARS, 3, 3);
       //  fail("Expecting exception: NegativeArraySizeException");
       // Unstable assertion
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      boolean boolean0 = IOUtils.isIdent('@');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('A');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      boolean boolean0 = IOUtils.firstIdentifier('@');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-41);
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      char[] charArray0 = new char[6];
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
  public void test093()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      CharsetDecoder charsetDecoder0 = iOUtils0.UTF8.newDecoder();
      ByteBuffer byteBuffer0 = iOUtils0.UTF8.encode("fastjson.compatibleWithJavaBean");
      CharBuffer charBuffer0 = iOUtils0.UTF8.decode(byteBuffer0);
      IOUtils.decode(charsetDecoder0, byteBuffer0, charBuffer0);
      assertFalse(charBuffer0.isDirect());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      char[] charArray0 = new char[7];
      IOUtils.getChars((byte)75, 2, charArray0);
      assertArrayEquals(new char[] {'7', '5', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      char[] charArray0 = new char[8];
      IOUtils.getChars((byte) (-64), 7, charArray0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '-', '6', '4', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars((-1110), 24, iOUtils0.replaceChars);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      // Undeclared exception!
      try { 
        IOUtils.getChars((-1570), (-1570), iOUtils0.CA);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1571
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      IOUtils iOUtils0 = new IOUtils();
      IOUtils.getChars(999999999992L, 46, iOUtils0.replaceChars);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        IOUtils.getChars((-2945L), 4, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("com.alibaba.fastjson.util.UTF8Decoder", false);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      IOUtils.close(bufferedOutputStream0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      IOUtils.close((Closeable) null);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      String string0 = IOUtils.getStringProperty("kFzj0Ah<&)Va'P:.d/");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      IOUtils.loadPropertiesFromFile();
  }
}