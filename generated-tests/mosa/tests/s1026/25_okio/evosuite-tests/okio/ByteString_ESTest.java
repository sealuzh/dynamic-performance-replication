/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 16:47:59 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamConstants;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.HashingSink;
import okio.HashingSource;
import okio.InflaterSource;
import okio.RealBufferedSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ByteString_ESTest extends ByteString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[8];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.substring((int) (byte)0);
      byteString1.hmacSha512(byteString0);
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("E4");
      byte[] byteArray0 = byteString0.toByteArray();
      boolean boolean0 = byteString0.endsWith(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-28)}, byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      ByteString byteString0 = hashingSource0.hash();
      HashingSink hashingSink0 = HashingSink.hmacSha512(buffer0, byteString0);
      ByteString byteString1 = hashingSource0.hash();
      ByteString byteString2 = hashingSink0.hash();
      String string0 = byteString0.toString();
      assertEquals("[hex=e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855]", string0);
      
      int int0 = byteString1.indexOf(byteString2);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("E4");
      byteString0.asByteBuffer();
      int int0 = byteString0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.substring((int) (byte)0);
      int int0 = byteString0.indexOf(byteArray0, (-33));
      assertEquals(0, int0);
      assertSame(byteString0, byteString1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("delegate == null");
      String string0 = byteString0.toString();
      assertEquals("[text=delegate == null]", string0);
      
      ByteString byteString1 = byteString0.sha512();
      int int0 = byteString0.lastIndexOf(byteString1, 35);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("E4");
      byteString0.sha512();
      assertEquals(1, byteString0.size());
      
      ByteString byteString1 = ByteString.encodeUtf8("E4");
      assertEquals(2, byteString1.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = new ByteString(byteArray0);
      boolean boolean0 = byteString0.endsWith(byteString1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.substring((int) (byte)0);
      int int0 = byteString1.lastIndexOf(byteString0);
      assertSame(byteString1, byteString0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteString byteString0 = new ByteString(byteArray0);
      byteString0.hashCode();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.toString();
      assertEquals("[size=0]", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteString byteString0 = new ByteString(byteArray0);
      Charset charset0 = Charset.defaultCharset();
      byteString0.string(charset0);
      String string0 = byteString0.toString();
      assertEquals("[hex=dd]", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.substring((int) (byte)0);
      boolean boolean0 = byteString0.startsWith(byteString1);
      assertSame(byteString1, byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("", charset0);
      // Undeclared exception!
      try { 
        byteString0.indexOf((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("E4");
      ByteString byteString1 = byteString0.toAsciiUppercase();
      assertEquals(1, byteString1.size());
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("delegate == null");
      String string0 = byteString0.toString();
      assertEquals("[text=delegate == null]", string0);
      
      ByteString byteString1 = byteString0.toAsciiLowercase();
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      ByteString byteString0 = hashingSource0.hash();
      String string0 = byteString0.toString();
      assertEquals("[hex=13bd133b99f111139ffbf319993fb9b3b7f13113339b9331f395991b795bb955]", string0);
      
      ByteString byteString1 = byteString0.toAsciiLowercase();
      assertNotSame(byteString1, byteString0);
      assertFalse(byteString1.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("e");
      assertNull(byteString0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        ByteString.decodeHex("-9223372036854775808");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: -
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("@DKkVMV]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: @
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      ByteString byteString0 = hashingSource0.hash();
      byteString0.write(buffer0);
      assertEquals(0L, buffer0.completeSegmentByteCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.substring((int) (byte)0);
      boolean boolean0 = byteString1.startsWith(byteArray0);
      assertTrue(boolean0);
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)43;
      ByteString byteString0 = new ByteString(byteArray0);
      boolean boolean0 = byteString0.rangeEquals((int) (byte)43, byteArray0, (-1087), (int) (byte)43);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)43;
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = new ByteString(byteArray0);
      boolean boolean0 = byteString0.EMPTY.startsWith(byteString1);
      assertFalse(boolean0);
      
      String string0 = byteString0.toString();
      assertEquals("[text=+]", string0);
      assertTrue(byteString0.equals((Object)byteString1));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      ByteString byteString0 = new ByteString(byteArray0);
      boolean boolean0 = byteString0.EMPTY.endsWith(byteArray0);
      assertFalse(boolean0);
      
      byteString0.utf8();
      ByteString byteString1 = byteString0.substring((int) (byte)0);
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      ByteString byteString0 = new ByteString(byteArray0);
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString1 = ByteString.of(byteArray0);
      byteString1.string(charset0);
      String string0 = byteString0.toString();
      assertEquals("[hex=dddddddddddddddddddd]", string0);
      
      ByteString byteString2 = byteString0.hmacSha256(byteString1);
      int int0 = byteString2.indexOf(byteString1, 12);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-67);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 8, 20);
      // Undeclared exception!
      try { 
        ByteString.read(byteArrayInputStream0, (byte) (-67));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -67
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      ByteString byteString0 = hashingSource0.hash();
      byteString0.EMPTY.hashCode();
      String string0 = byteString0.utf8();
      assertEquals("\uFFFD\uFFFDB\uFFFD\uFFFD\u001C\u0014\uFFFD\uFFFD\uFFFD\u0219o\uFFFD$'\uFFFDA\uFFFDd\uFFFD\uFFFDL\uFFFD\uFFFD\uFFFD\u001BxR\uFFFDU", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = new ByteString(byteArray0);
      Charset.defaultCharset();
      ByteString.of(byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-13), 12);
      ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray0);
      try { 
        ByteString.read(byteArrayInputStream1, 12);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = new ByteString(byteArray0);
      byteString0.base64();
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte)61;
      boolean boolean0 = byteString0.endsWith(byteArray1);
      assertFalse(boolean0);
      
      String string0 = byteString0.toString();
      assertEquals("[hex=dddddddddddddd]", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeBase64("");
      assertNotNull(byteString0);
      
      Object object0 = new Object();
      boolean boolean0 = byteString0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.md5();
      int int0 = byteString1.lastIndexOf(byteArray0, 81);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      byte[] byteArray0 = new byte[2];
      ByteString byteString0 = new ByteString(byteArray0);
      byteString0.base64();
      try { 
        byteString0.write(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.readUnsafe();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      HashingSource hashingSource1 = HashingSource.sha1(buffer0);
      ByteString byteString0 = hashingSource0.hash();
      ByteString byteString1 = hashingSource1.hash();
      boolean boolean0 = byteString0.EMPTY.endsWith(byteString1);
      assertFalse(boolean0);
      
      ByteString byteString2 = hashingSource0.hash();
      String string0 = byteString0.toString();
      assertEquals("[hex=1ddd133bd9f1d1d3dffdf319dd3fddb3bdf13d1333dddd31f3ddddddd9dbd9dd]", string0);
      
      int int0 = byteString0.lastIndexOf(byteString2);
      assertEquals(0, int0);
      assertTrue(byteString2.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("E4");
      // Undeclared exception!
      try { 
        byteString0.lastIndexOf((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = 4088;
      // Undeclared exception!
      try { 
        ByteString.of(byteArray0, 4088, 4088);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=4088 byteCount=4088
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      ByteString byteString0 = hashingSource0.hash();
      String string0 = byteString0.toString();
      assertEquals("[hex=1d1d133b9931d1d39f313319993319b3bbf13d1333919d31f39399d1b93b1933]", string0);
      
      ByteString byteString1 = byteString0.toAsciiUppercase();
      assertNotSame(byteString1, byteString0);
      assertFalse(byteString1.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      ByteString byteString0 = hashingSource0.hash();
      HashingSink hashingSink0 = HashingSink.hmacSha512(buffer0, byteString0);
      hashingSource0.hash();
      ByteString byteString1 = hashingSink0.hash();
      String string0 = byteString1.toString();
      assertEquals("[hex=9dd93f11d133db11911d3b3f3ff1bfb1d11db3dfd3d33db1dd19bd313d33db11bdb193ff131f11b1db391113b31bb93119b33939b91133b9b9113d3fb3d3319d]", string0);
      
      ByteString byteString2 = byteString1.toAsciiUppercase();
      assertNotSame(byteString2, byteString1);
      assertFalse(byteString2.equals((Object)byteString1));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)7;
      ByteString byteString0 = new ByteString(byteArray0);
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
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("bytes is empty");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: y
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteString byteString0 = new ByteString(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.substring(61, 61);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > length(8)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteString byteString0 = new ByteString(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.substring(534);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("<HA");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex string: <HA
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.substring(1);
      assertEquals(14, byteString1.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      ByteString byteString0 = hashingSource0.hash();
      byteString0.toString();
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
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteString byteString0 = new ByteString(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.substring((-705));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = ByteString.of(byteArray0);
      byteString1.rangeEquals((int) (byte)4, byteArray0, (int) (byte)71, (int) (byte)113);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1945, (byte)113);
      ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream1.markSupported();
      ByteString byteString2 = ByteString.read(byteArrayInputStream1, 1);
      // Undeclared exception!
      try { 
        byteString2.getByte((-4563));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("delegate == null");
      String string0 = byteString0.toString();
      assertEquals("[text=delegate == null]", string0);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-18);
      ByteString byteString1 = new ByteString(byteArray0);
      int int0 = byteString0.compareTo(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)57;
      byteArray0[1] = (byte)57;
      byteArray0[2] = (byte)57;
      byteArray0[3] = (byte)57;
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.sha512();
      int int0 = byteString1.compareTo(byteString0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      ByteString byteString0 = ByteString.encodeUtf8("delegate == null");
      HashingSink hashingSink0 = HashingSink.hmacSha512(buffer0, byteString0);
      ByteString byteString1 = hashingSink0.hash();
      byteString1.toString();
      byte[] byteArray0 = new byte[1];
      ByteString byteString2 = new ByteString(byteArray0);
      byteString1.toString();
      int int0 = ObjectStreamConstants.baseWireHandle;
      HashingSource.hmacSha256(buffer0, byteString0);
      buffer0.readAndWriteUnsafe();
      ByteString byteString3 = hashingSource0.hash();
      byteString0.toString();
      byteString3.toString();
      ByteString.codePointIndexToCharIndex("[hex=39594f53b9d873f3ee94237ff109ca3615db9015d9632b8cbca5155042648d6defb1960eca21b9f2e8156536e211b601e72a667edab541047e8194b6f5759cb8]", 55);
      ByteString byteString4 = byteString0.md5();
      assertEquals(16, byteString4.size());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = realBufferedSource0.readByteString();
      ByteString byteString1 = byteString0.sha256();
      int int0 = byteString1.compareTo(byteString0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)57;
      ByteString byteString0 = new ByteString(byteArray0);
      byteString0.asByteBuffer();
      boolean boolean0 = byteString0.endsWith(byteArray0);
      assertTrue(boolean0);
      
      ByteString byteString1 = new ByteString(byteArray0);
      byteString0.EMPTY.hashCode();
      byteString0.sha1();
      int int0 = byteString0.compareTo(byteString0);
      assertEquals(0, int0);
      
      byteString0.base64Url();
      assertTrue(byteString0.equals((Object)byteString1));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = realBufferedSource0.readByteString();
      HashingSink hashingSink0 = HashingSink.sha1(buffer0);
      ByteString byteString1 = hashingSink0.hash();
      ByteString byteString2 = byteString0.hmacSha1(byteString1);
      assertNotSame(byteString2, byteString0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
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
  public void test55()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)43;
      ByteString byteString0 = new ByteString(byteArray0);
      byteString0.utf8();
      byteString0.toString();
      // Undeclared exception!
      try { 
        ByteString.encodeString("[text=+]", (Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteBuffer byteBuffer0 = byteString0.asByteBuffer();
      ByteString byteString1 = ByteString.of(byteBuffer0);
      boolean boolean0 = byteString1.equals(byteString0);
      assertTrue(boolean0);
      
      byteString0.toString();
      String string0 = byteString0.toString();
      assertEquals("[hex=dddddddddddddd]", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      HashingSource.sha1(hashingSource0);
      ByteString byteString0 = hashingSource0.hash();
      ByteString byteString1 = hashingSource0.hash();
      HashingSource hashingSource1 = HashingSource.hmacSha256(hashingSource0, byteString1);
      HashingSource.hmacSha1(hashingSource1, byteString0);
      ByteString byteString2 = byteString1.toAsciiUppercase();
      boolean boolean0 = byteString1.equals(byteString2);
      assertFalse(boolean0);
      
      int int0 = byteString2.lastIndexOf(byteString1, 98);
      assertTrue(byteString1.equals((Object)byteString0));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.read((InputStream) null, 1142);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // in == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer.UnsafeCursor buffer_UnsafeCursor0 = buffer0.readUnsafe();
      Buffer buffer1 = buffer_UnsafeCursor0.buffer;
      HashingSource hashingSource0 = HashingSource.sha256(buffer1);
      HashingSource hashingSource1 = HashingSource.sha256(hashingSource0);
      HashingSource.sha1(buffer0);
      ByteString byteString0 = hashingSource1.hash();
      hashingSource0.hash();
      byteString0.base64();
      // Undeclared exception!
      try { 
        ByteString.of((byte[]) null, (-104), 255);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // data == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = new ByteString(byteArray0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString1 = realBufferedSource0.readByteString();
      byteString0.equals(byteString1);
      assertFalse(byteString1.equals((Object)byteString0));
      
      String string0 = byteString0.toString();
      assertEquals("[hex=dddddddddddddd]", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
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
  public void test62()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(hashingSource0);
      Charset charset0 = Charset.defaultCharset();
      HashingSource hashingSource1 = HashingSource.md5(buffer0);
      ByteString byteString0 = hashingSource1.hash();
      byteString0.string(charset0);
      String string0 = byteString0.toString();
      assertEquals("[hex=13d1911993dd1bd3199dd99911393bb1]", string0);
      
      ByteString byteString1 = ByteString.encodeUtf8("");
      byteString1.utf8();
      int int0 = byteString1.compareTo(byteString0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)15;
      byteArray0[1] = (byte)15;
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = realBufferedSource0.readByteString();
      byteString0.asByteBuffer();
      ByteBuffer byteBuffer0 = null;
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
  public void test64()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "already attached to a buffer");
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
  public void test65()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = new ByteString(byteArray0);
      byteString0.endsWith(byteArray0);
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
  public void test66()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)110;
      byteArray0[1] = (byte)13;
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.toString();
      assertEquals("[hex=31d1dddddddddddd]", string0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)71;
      byteArray0[1] = (byte)10;
      byteArray0[2] = (byte)117;
      byteArray0[3] = (byte)6;
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.toString();
      assertEquals("[hex=3bdfb3d3]", string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Inflater inflater0 = new Inflater(false);
      InflaterSource inflaterSource0 = new InflaterSource((BufferedSource) buffer0, inflater0);
      HashingSource hashingSource0 = HashingSource.sha256(inflaterSource0);
      HashingSource hashingSource1 = HashingSource.sha1(hashingSource0);
      ByteString byteString0 = hashingSource1.hash();
      byte[] byteArray0 = new byte[4];
      byteString0.EMPTY.startsWith(byteString0);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      ByteString byteString1 = ByteString.encodeUtf8("delegate == null");
      ByteString byteString2 = byteString1.sha1();
      ByteString byteString3 = new ByteString(byteArray0);
      byteString2.equals(byteString3);
      byteString2.indexOf(byteString1, 19);
      Charset charset0 = Charset.defaultCharset();
      charset0.encode("size < 8: ");
      ByteString byteString4 = byteString1.substring((int) (byte)0, (int) (byte)0);
      assertNotSame(byteString4, byteString3);
  }
}