/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 14:09:06 GMT 2019
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import okio.Buffer;
import okio.ByteString;
import okio.HashingSink;
import okio.HashingSource;
import okio.Pipe;
import okio.RealBufferedSink;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ByteString_ESTest extends ByteString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("S0Z3'9");
      ByteString byteString1 = byteString0.sha512();
      int int0 = byteString1.lastIndexOf(byteString0, 65533);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("SmH&'ZBa6hd");
      ByteString byteString1 = byteString0.toAsciiUppercase();
      assertNotSame(byteString1, byteString0);
      assertFalse(byteString1.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        ByteString.read(byteArrayInputStream0, (byte)118);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteString byteString1 = byteString0.toAsciiLowercase();
      assertEquals(0, byteString1.size());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      ByteString byteString1 = byteString0.sha512();
      ByteString byteString2 = byteString1.substring(9);
      assertEquals(55, byteString2.size());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      ByteString byteString1 = byteString0.sha512();
      int int0 = byteString1.size();
      assertEquals(64, int0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      Pipe pipe0 = new Pipe(2752L);
      Buffer buffer0 = pipe0.buffer;
      HashingSource hashingSource0 = HashingSource.sha1(buffer0);
      ByteString byteString1 = hashingSource0.hash();
      int int0 = byteString0.lastIndexOf(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.EMPTY.hex();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      String string0 = byteString0.base64Url();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      String string0 = byteString0.EMPTY.base64();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("Kpkc-utIV+H.z");
      // Undeclared exception!
      try { 
        byteString0.EMPTY.substring((-1369));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = ByteString.of(byteArray0);
      boolean boolean0 = byteString0.EMPTY.rangeEquals((int) (byte)48, byteArray0, (int) (byte)48, (int) (byte)34);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      boolean boolean0 = byteString0.EMPTY.rangeEquals(120, byteString0, (-1), 105);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = byteString0.EMPTY.lastIndexOf(byteArray0, (int) (byte)0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("source is closed");
      int int0 = byteString0.lastIndexOf(byteString0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.indexOf(byteString0, 44);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteString byteString1 = ByteString.encodeUtf8("a-8&A6");
      ByteString byteString2 = byteString0.hmacSha1(byteString1);
      assertFalse(byteString2.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("AH!a,sO 19G\"7w");
      // Undeclared exception!
      try { 
        byteString0.getByte(92);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("HmacSHA1", charset0);
      boolean boolean0 = byteString0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("]_6HvX:WSZ");
      ByteString byteString1 = byteString0.substring(9, 9);
      byte[] byteArray0 = byteString1.toByteArray();
      boolean boolean0 = byteString1.endsWith(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        ByteString.read(pipedInputStream0, 3);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Pipe pipe0 = new Pipe(277L);
      Pipe.PipeSource pipe_PipeSource0 = pipe0.new PipeSource();
      HashingSource hashingSource0 = HashingSource.md5(pipe_PipeSource0);
      ByteString byteString0 = hashingSource0.hash();
      // Undeclared exception!
      try { 
        byteString0.rangeEquals((-1844), (ByteString) null, 43, 65533);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.indexOf((byte[]) null, (-4722));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[7];
      int int0 = byteString0.lastIndexOf(byteArray0, (int) (byte)97);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("WR#%P:q");
      byte[] byteArray0 = new byte[0];
      int int0 = byteString0.indexOf(byteArray0, 4300);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = ByteString.encodeString(")", charset0);
      boolean boolean0 = byteString0.rangeEquals(17, byteArray0, (int) (byte) (-33), (int) (byte)89);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("&|pW@%aZiU1^u=ZN");
      // Undeclared exception!
      try { 
        byteString0.substring(55, 12);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("WR#%P:q");
      String string0 = byteString0.hex();
      assertEquals("57522325503a717f", string0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ByteString byteString0 = ByteString.read(dataInputStream0, 2);
      byteString0.EMPTY.utf8();
      assertEquals(3, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString(")", charset0);
      boolean boolean0 = byteString0.rangeEquals(6, byteString0, 6, 6);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      int int0 = byteString0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("WR#%P:q");
      byte[] byteArray0 = byteString0.toByteArray();
      assertEquals(8, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("\r", 97);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      int int0 = ByteString.codePointIndexToCharIndex("0s&5}M'^qMq5Cj8v", 2);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString(")", charset0);
      String string0 = byteString0.toString();
      assertEquals("[text=)]", string0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      ByteBuffer byteBuffer0 = charset0.encode(charBuffer0);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      String string0 = byteString0.toString();
      assertEquals("[size=0]", string0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(48);
      ByteString byteString1 = ByteString.of(byteBuffer0);
      int int0 = byteString0.compareTo(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      ByteString[] byteStringArray0 = new ByteString[3];
      ByteString byteString0 = ByteString.decodeBase64("source is closed");
      assertNotNull(byteString0);
      
      byteStringArray0[0] = byteString0;
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteString byteString1 = ByteString.of(byteBuffer0);
      int int0 = byteStringArray0[0].compareTo(byteString1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)70;
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect((byte)70);
      ByteString byteString1 = ByteString.of(byteBuffer0);
      int int0 = byteString0.compareTo(byteString1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString(")", charset0);
      ByteString byteString1 = byteString0.hmacSha256(byteString0);
      int int0 = byteString0.compareTo(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = ByteString.of(byteArray0);
      int int0 = byteString0.compareTo(byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("");
      byteString0.EMPTY.hashCode();
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      byte[] byteArray0 = new byte[0];
      ByteString byteString1 = new ByteString(byteArray0);
      boolean boolean0 = byteString0.equals(byteString1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("AH!a,sO 19G\"7w");
      Object object0 = new Object();
      boolean boolean0 = byteString0.EMPTY.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      boolean boolean0 = byteString0.equals(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("]_6HvX:WSZ");
      boolean boolean0 = byteString0.EMPTY.equals(byteString0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      HashingSink hashingSink0 = HashingSink.sha1(realBufferedSink0.buffer);
      ByteString byteString0 = hashingSink0.hash();
      byte[] byteArray0 = new byte[2];
      ByteString byteString1 = ByteString.of(byteArray0);
      int int0 = byteString0.indexOf(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString(")", charset0);
      ByteString byteString1 = byteString0.hmacSha256(byteString0);
      boolean boolean0 = byteString1.startsWith(byteString0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("cz0");
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(454);
      ByteString byteString1 = ByteString.of(byteBuffer0);
      boolean boolean0 = byteString0.startsWith(byteString1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("[text=", charset0);
      boolean boolean0 = byteString0.EMPTY.endsWith(byteString0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.EMPTY.write((OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // out == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteString byteString0 = ByteString.of(byteArray0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)120);
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      byteString0.write(bufferedOutputStream0);
      assertEquals(1, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      char[] charArray0 = new char[0];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      ByteBuffer byteBuffer0 = charset0.encode(charBuffer0);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      ByteString byteString1 = byteString0.substring(0, 0);
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(587);
      ByteString byteString0 = ByteString.of(byteBuffer0);
      String string0 = byteString0.toString();
      //  // Unstable assertion: assertEquals("[size=587 hex=55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555\u2026]", string0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("]_6HvX:WSZ");
      ByteString byteString1 = byteString0.substring(9, 9);
      boolean boolean0 = byteString0.endsWith(byteString1);
      assertEquals(0, byteString1.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("#^cvvp`h");
      // Undeclared exception!
      try { 
        byteString0.substring(3037, 3037);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > length(8)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = new ByteString(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.substring((-2438), (int) (byte) (-3));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      ByteString byteString1 = byteString0.sha512();
      ByteString byteString2 = byteString1.toAsciiUppercase();
      assertNotSame(byteString2, byteString1);
      assertFalse(byteString2.equals((Object)byteString1));
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString(")", charset0);
      ByteString byteString1 = byteString0.toAsciiUppercase();
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("AH!a,sO 19G\"7w");
      ByteString byteString1 = byteString0.toAsciiLowercase();
      assertNotSame(byteString1, byteString0);
      assertFalse(byteString1.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)104;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ByteString byteString0 = ByteString.read(dataInputStream0, 2);
      ByteString byteString1 = byteString0.toAsciiLowercase();
      assertEquals(3, byteArrayInputStream0.available());
      assertSame(byteString0, byteString1);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 70);
      // Undeclared exception!
      try { 
        ByteString.read(bufferedInputStream0, (-1307));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -1307
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.read((InputStream) null, 55);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // in == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("endIndex > string.length: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: n
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("9!BUwh");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: !
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("Bt.7P[)w^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: 
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      assertEquals(0, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("!Z.qAD2K0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex string: !Z.qAD2K0
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // hex == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64(" c9$W=");
      assertNull(byteString0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeBase64((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // base64 == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      ByteString byteString0 = ByteString.EMPTY;
      // Undeclared exception!
      try { 
        byteString0.string((Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteString byteString0 = new ByteString(byteArray0);
      Charset charset0 = Charset.defaultCharset();
      String string0 = byteString0.string(charset0);
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("WR#%P:q");
      String string0 = byteString0.toString();
      //  // Unstable assertion: assertEquals("[hex=3335535335333333]", string0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.encodeString("d1pvJ~", (Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        ByteString.encodeString((String) null, charset0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // s == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.encodeUtf8((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // s == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.of((ByteBuffer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // data == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.of((byte[]) null, (-4252), (-4252));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // data == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        ByteString.of(byteArray0, (-1), 1126);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=2 offset=-1 byteCount=1126
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.of((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // data == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ByteString byteString0 = ByteString.read(dataInputStream0, 2);
      // Undeclared exception!
      try { 
        byteString0.getByte((-125));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("WR#%P:q");
      int int0 = byteString0.EMPTY.indexOf(byteString0, 1492);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("S0Z3'9");
      ByteString byteString1 = byteString0.hmacSha512(byteString0);
      assertNotSame(byteString0, byteString1);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("WR#%P:q");
      Buffer buffer0 = new Buffer();
      byteString0.write(buffer0);
      assertFalse(buffer0.exhausted());
      assertEquals(8, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("WR#%P:q");
      byte[] byteArray0 = new byte[0];
      int int0 = byteString0.indexOf(byteArray0);
      assertEquals(8, byteString0.size());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("WR#%P:q");
      byteString0.sha256();
      assertEquals(8, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("WR#%P:q");
      ByteBuffer byteBuffer0 = byteString0.asByteBuffer();
      assertEquals(8, byteBuffer0.capacity());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("WR#%P:q");
      byteString0.md5();
      assertEquals(8, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ByteString byteString0 = ByteString.read(dataInputStream0, 2);
      String string0 = byteString0.base64Url();
      assertEquals(3, byteArrayInputStream0.available());
      assertEquals("AAA=", string0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = ByteString.of(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.hmacSha1(byteString0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Empty key
         //
         verifyException("javax.crypto.spec.SecretKeySpec", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ByteString byteString0 = ByteString.read(dataInputStream0, 2);
      int int0 = byteString0.lastIndexOf(byteString0);
      assertEquals(3, byteArrayInputStream0.available());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString(")", charset0);
      boolean boolean0 = byteString0.startsWith(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      ByteString[] byteStringArray0 = new ByteString[3];
      ByteString byteString0 = ByteString.decodeBase64("source is closed");
      // Undeclared exception!
      try { 
        byteString0.EMPTY.hmacSha256(byteStringArray0[0]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("WR#%P:q");
      byteString0.sha1();
      assertEquals(8, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("WR#%P:q");
      ByteString byteString1 = byteString0.sha512();
      String string0 = byteString1.toString();
      assertEquals("[hex=4d69592bad8f2e8da4406b9780c89871fc0efd83d436e0cf054fd1e4add8e3446e7a5f1bb690f846fa70c17d2694081e634d01c716afa9a04820450736aea48d]", string0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("WR#%P:q");
      String string0 = byteString0.base64();
      assertEquals("V1IjJVA6cX8=", string0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ByteString byteString0 = ByteString.read(dataInputStream0, 2);
      boolean boolean0 = byteString0.EMPTY.endsWith(byteArray0);
      assertEquals(3, byteArrayInputStream0.available());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ByteString byteString0 = ByteString.read(dataInputStream0, 2);
      boolean boolean0 = byteString0.startsWith(byteArray0);
      assertEquals(3, byteArrayInputStream0.available());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      ByteString byteString0 = ByteString.read(dataInputStream0, 2);
      int int0 = byteString0.EMPTY.lastIndexOf(byteString0, (-2440));
      assertEquals(3, byteArrayInputStream0.available());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("HmacSHA1", charset0);
      byte[] byteArray0 = new byte[8];
      int int0 = byteString0.lastIndexOf(byteArray0);
      assertEquals((-1), int0);
  }
}