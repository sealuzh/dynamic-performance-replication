/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 06:26:29 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamConstants;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Inflater;
import okio.Buffer;
import okio.ByteString;
import okio.HashingSink;
import okio.HashingSource;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Source;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ByteString_ESTest extends ByteString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.base64();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      byteString0.EMPTY.md5();
      Charset charset0 = Charset.defaultCharset();
      assertEquals("US-ASCII", charset0.name());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteString byteString0 = new ByteString(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.substring(16);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ByteString byteString0 = ByteString.encodeUtf8("*G");
      byteString0.toString();
      // Undeclared exception!
      try { 
        byteString0.endsWith((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      ByteString byteString0 = hashingSink0.hash();
      ByteString byteString1 = hashingSink0.hash();
      byteString0.EMPTY.hmacSha256(byteString1);
      String string0 = byteString0.toString();
      assertEquals("[hex=cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      byteString0.hex();
      ByteString byteString1 = byteString0.sha256();
      ByteString byteString2 = byteString0.hmacSha512(byteString1);
      assertNotSame(byteString2, byteString0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.substring(0);
      boolean boolean0 = byteString1.EMPTY.endsWith(byteArray0);
      assertFalse(boolean0);
      
      String string0 = byteString1.toString();
      assertEquals("[hex=ffffffffffffffff]", string0);
      assertSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("");
      String string0 = byteString0.toString();
      assertEquals("[size=0]", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("Z+MFKi");
      byteString0.toString();
      // Undeclared exception!
      try { 
        byteString0.hmacSha1((ByteString) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = realBufferedSource0.readByteString();
      ByteString byteString1 = byteString0.sha512();
      assertNotSame(byteString0, byteString1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("`QZ4YYV w6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: `
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        ByteString.of(byteArray0, 63, 1796);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=63 byteCount=1796
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.substring(0);
      int int0 = byteString1.EMPTY.indexOf(byteArray0);
      assertEquals((-1), int0);
      assertSame(byteString1, byteString0);
      
      ByteString byteString2 = new ByteString(byteArray0);
      assertTrue(byteString2.equals((Object)byteString1));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("");
      byte[] byteArray0 = new byte[0];
      int int0 = byteString0.indexOf(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      ByteString byteString0 = hashingSink0.hash();
      String string0 = byteString0.toString();
      assertEquals("[hex=b77bbbbbbbb7b7b77bbb57bf73377ffb735fbbfbfbbbbb7b7b7bbb5b7b3bbbbbbb7f7bbbb77b75bf777bb7757bbbbb573bbbbbb7bbbbbb7bbbb7b5bb7b5b7bbb]", string0);
      
      hashingSink0.timeout();
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      ByteString byteString1 = hashingSource0.hash();
      int int0 = byteString0.indexOf(byteString1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      ByteString byteString0 = hashingSink0.hash();
      byteString0.write(buffer0);
      assertEquals(64L, buffer0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("P 2mq Y");
      String string0 = byteString0.base64Url();
      assertEquals("UCAybXEgWQ==", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("data == null");
      byteString0.equals("data == null");
      byteString0.toString();
      byte[] byteArray0 = byteString0.toByteArray();
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = null;
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
  public void test19()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      ByteString byteString0 = hashingSink0.hash();
      byteString0.toString();
      ByteString byteString1 = byteString0.sha1();
      assertNotSame(byteString0, byteString1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("P 2mq%Y");
      String string0 = byteString0.toString();
      assertEquals("[text=P 2mq%Y]", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("not acquired");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: n
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = 0;
      ByteString.codePointIndexToCharIndex("g2I! 0{;Fy5>|x>2(5", 0);
      RealBufferedSource realBufferedSource0 = null;
      try {
        realBufferedSource0 = new RealBufferedSource((Source) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // source == null
         //
         verifyException("okio.RealBufferedSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink.sha512(buffer0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byte[] byteArray0 = new byte[7];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = new ByteString(byteArray0);
      int int0 = byteString0.lastIndexOf(byteString1, 6);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      boolean boolean0 = byteString0.startsWith(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSource hashingSource0 = HashingSource.md5(buffer0);
      ByteString byteString0 = hashingSource0.hash();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-103);
      byteArray0[1] = (byte)9;
      int int0 = byteString0.lastIndexOf(byteArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      ByteString byteString0 = hashingSink0.hash();
      byteString0.toString();
      byteString0.hashCode();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = new ByteString(byteArray0);
      String string0 = byteString0.toString();
      assertEquals("[hex=ffffffffffff]", string0);
      
      boolean boolean0 = byteString1.rangeEquals(62, byteString0, 39, 39);
      assertFalse(boolean0);
      assertTrue(byteString1.equals((Object)byteString0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("`Z4YYV w6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex string: `Z4YYV w6
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      ByteString byteString0 = hashingSink0.hash();
      String string0 = byteString0.toString();
      assertEquals("[hex=b77bbbbbbbb7b7b77bbb57bf73377ffb735fbbfbfbbbbb7b7b7bbb5b7b3bbbbbbb7f7bbbb77b75bf777bb7757bbbbb573bbbbbb7bbbbbb7bbbb7b5bb7b5b7bbb]", string0);
      
      byteString0.toByteArray();
      ByteString byteString1 = hashingSink0.hash();
      int int0 = byteString0.lastIndexOf(byteString1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[4];
      ByteString byteString0 = new ByteString(byteArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(pipedOutputStream0);
      HashingSink hashingSink0 = HashingSink.md5(buffer0);
      HashingSink.sha512(hashingSink0);
      ByteString byteString1 = hashingSink0.hash();
      String string0 = byteString1.toString();
      assertEquals("[hex=7bb77b7b77ffb5fbbb7ffbb7bb77b5bb]", string0);
      
      ByteString byteString2 = byteString1.toAsciiUppercase();
      byteString0.endsWith(byteString1);
      assertSame(byteString1, byteString2);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("-:");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: -
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)42;
      ByteString byteString0 = new ByteString(byteArray0);
      String string0 = byteString0.toString();
      assertEquals("[text=*]", string0);
      
      int int0 = byteString0.lastIndexOf(byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      ByteString byteString0 = hashingSink0.hash();
      byteString0.toString();
      // Undeclared exception!
      try { 
        byteString0.substring(1031, 1031);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex > length(64)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      ByteString byteString0 = ByteString.decodeBase64("HmacHA25");
      Charset.defaultCharset();
      ByteString byteString1 = byteString0.toAsciiUppercase();
      boolean boolean0 = byteString1.endsWith(byteString0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      ByteString byteString1 = byteString0.sha256();
      ByteString byteString2 = byteString1.toAsciiUppercase();
      assertNotSame(byteString2, byteString1);
      assertFalse(byteString2.equals((Object)byteString1));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      ByteString byteString0 = hashingSink0.hash();
      String string0 = byteString0.toString();
      assertEquals("[hex=b77bbbbbbbb7b7b77bbb57bf73377ffb735fbbfbfbbbbb7b7b7bbb5b7b3bbbbbbb7f7bbbb77b75bf777bb7757bbbbb573bbbbbb7bbbbbb7bbbb7b5bb7b5b7bbb]", string0);
      
      ByteString byteString1 = byteString0.toAsciiUppercase();
      assertNotSame(byteString1, byteString0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("*G");
      // Undeclared exception!
      try { 
        byteString0.substring((-292));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ByteString byteString0 = new ByteString((byte[]) null);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      pipedOutputStream0.flush();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(pipedOutputStream0);
      // Undeclared exception!
      try { 
        byteString0.write(filterOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteString byteString0 = new ByteString(byteArray0);
      // Undeclared exception!
      try { 
        byteString0.indexOf((ByteString) null, 641);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("Z+MFKi");
      ByteString byteString1 = byteString0.EMPTY.toAsciiLowercase();
      String string0 = byteString0.toString();
      assertEquals("[text=Z+MFKi]", string0);
      
      byteString0.utf8();
      assertNotSame(byteString0, byteString1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
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
  public void test43()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString1 = ByteString.encodeString("FS9\"NWBK$.>%q(g", charset0);
      byteString0.startsWith(byteString1);
      ByteString byteString2 = byteString1.sha256();
      assertNotSame(byteString2, byteString1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.of((byte[]) null, (-1494), (-1494));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // data == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = new Buffer();
      // Undeclared exception!
      try { 
        ByteString.decodeHex("9Vv_<NVS");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: V
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.decodeHex("data == null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: t
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = "W=vyl==8^-J,@L2";
      ByteString.decodeBase64("W=vyl==8^-J,@L2");
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
  public void test48()  throws Throwable  {
      ByteString.decodeBase64("");
      PipedInputStream pipedInputStream0 = new PipedInputStream(52);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      // Undeclared exception!
      try { 
        ByteString.read(bufferedInputStream0, (-2389));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // byteCount < 0: -2389
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ByteString.decodeHex("");
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString0 = ByteString.encodeString("FS9\"NWBK$.>%q(g", charset0);
      ByteString byteString1 = byteString0.sha256();
      byteString1.EMPTY.indexOf(byteString0);
      ByteString byteString2 = byteString1.sha1();
      assertNotSame(byteString2, byteString1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Charset.defaultCharset();
      ByteString byteString0 = ByteString.decodeBase64("");
      assertNotNull(byteString0);
      
      byteString0.EMPTY.hashCode();
      Charset.defaultCharset();
      ByteString byteString1 = byteString0.toAsciiUppercase();
      boolean boolean0 = byteString0.endsWith(byteString1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteString byteString0 = new ByteString(byteArray0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      byte[] byteArray1 = new byte[0];
      ByteString byteString1 = new ByteString(byteArray1);
      byteString0.equals(byteString1);
      assertFalse(byteString1.equals((Object)byteString0));
      
      String string0 = byteString0.toString();
      assertEquals("[hex=ffffffffffffffff]", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      byteString0.size();
      Charset charset0 = Charset.defaultCharset();
      String string0 = byteString0.string(charset0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      ByteString byteString0 = ByteString.encodeUtf8("X");
      byteString0.EMPTY.sha256();
      byteString0.asByteBuffer();
      FileSystemHandling.shouldAllThrowIOExceptions();
      ByteString byteString1 = byteString0.toAsciiUppercase();
      byteString0.endsWith(byteString1);
      ByteString byteString2 = byteString0.sha1();
      // Undeclared exception!
      try { 
        byteString2.write((OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // out == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteString.encodeString("", (Charset) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charset == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      hashingSink0.hash();
      // Undeclared exception!
      try { 
        ByteString.read((InputStream) null, 1154);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // in == null
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      ByteString byteString0 = hashingSink0.hash();
      ByteString byteString1 = byteString0.substring(36);
      HashingSink.md5(hashingSink0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString2 = realBufferedSource0.readByteString();
      byteString0.asByteBuffer();
      int int0 = byteString1.compareTo(byteString2);
      assertEquals(28, byteString1.size());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ByteString byteString0 = ByteString.encodeUtf8("data == null");
      Charset.defaultCharset();
      ByteString byteString1 = byteString0.toAsciiUppercase();
      byteString0.toString();
      byteString1.toString();
      byteString1.compareTo(byteString0);
      // Undeclared exception!
      try { 
        byteString0.getByte((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      ByteString byteString0 = ByteString.encodeUtf8("X");
      ByteString byteString1 = byteString0.EMPTY.sha256();
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = byteString0.asByteBuffer();
      ByteString.of(byteBuffer0);
      assertEquals("java.nio.HeapByteBufferR[pos=1 lim=1 cap=1]", byteBuffer0.toString());
      
      FileSystemHandling.shouldAllThrowIOExceptions();
      ByteString byteString2 = byteString0.toAsciiUppercase();
      byteString0.endsWith(byteString2);
      byteString0.sha1();
      byteString1.string(charset0);
      int int0 = byteString0.compareTo(byteString2);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "f2S@Hhq[MG");
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)4;
      byteArray0[1] = (byte)43;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        ByteString.read(byteArrayInputStream0, (byte)4);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(pipedOutputStream0);
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      ByteString byteString0 = hashingSink0.hash();
      String string0 = byteString0.toString();
      assertEquals("[hex=b77bbbbbbbb7b7b77bbb57bf73377ffb735fbbfbfbbbbb7b7b7bbb5b7b3bbbbbbb7f7bbbb77b75bf777bb7757bbbbb573bbbbbb7bbbbbb7bbbb7b5bb7b5b7bbb]", string0);
      
      HashingSink hashingSink1 = HashingSink.hmacSha512(hashingSink0, byteString0);
      ByteString byteString1 = hashingSink1.hash();
      int int0 = byteString0.compareTo(byteString1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ByteString byteString0 = ByteString.decodeHex("");
      Charset charset0 = Charset.defaultCharset();
      ByteString byteString1 = ByteString.encodeString("FS9\"NWBK$.>%q(g", charset0);
      byteString1.sha256();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)1;
      ByteString byteString2 = new ByteString(byteArray0);
      byteString1.equals(byteString2);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      byteString0.hashCode();
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
  public void test62()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(pipedOutputStream0);
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      ByteString byteString0 = hashingSink0.hash();
      ByteString byteString1 = byteString0.substring(36);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString2 = realBufferedSource0.readByteString();
      byteString0.asByteBuffer();
      int int0 = byteString2.compareTo(byteString1);
      assertEquals(28, byteString1.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.substring(0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ByteString byteString2 = new ByteString(byteArray0);
      int int0 = byteString0.indexOf(byteArray0);
      assertEquals(0, int0);
      
      ByteString byteString3 = new ByteString(byteArray0);
      boolean boolean0 = byteString3.equals(byteString1);
      assertTrue(boolean0);
      assertSame(byteString1, byteString0);
      
      ByteString byteString4 = new ByteString(byteArray0);
      assertTrue(byteString4.equals((Object)byteString1));
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(pipedOutputStream0);
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      ByteString byteString0 = hashingSink0.hash();
      byteString0.substring(36);
      FilterOutputStream filterOutputStream1 = new FilterOutputStream(pipedOutputStream0);
      HashingSink.md5(hashingSink0);
      HashingSink.sha512(hashingSink0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ",");
      byteString0.toString();
      HashingSource hashingSource0 = HashingSource.hmacSha256(buffer0, byteString0);
      ByteString byteString1 = hashingSource0.hash();
      byteString1.toAsciiUppercase();
      byteString1.endsWith(byteString0);
      byteString0.lastIndexOf(byteString1);
      ByteString.decodeBase64("O/r;i{M1");
      // Undeclared exception!
      try { 
        ByteString.decodeHex("B\"FI;\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected hex digit: \"
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
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
  public void test66()  throws Throwable  {
      ByteString.encodeUtf8("data == null");
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
  public void test67()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      HashingSink.sha512(buffer0);
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      ByteString.read(pipedInputStream0, (byte)0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink hashingSink0 = HashingSink.sha512(buffer0);
      ByteString byteString0 = hashingSink0.hash();
      byteString0.toString();
      byteString0.toString();
      ByteString.codePointIndexToCharIndex("\n", 51);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      HashingSink hashingSink0 = HashingSink.sha512(realBufferedSink0);
      ByteString byteString0 = hashingSink0.hash();
      byteString0.substring(12);
      ByteString byteString1 = byteString0.toAsciiLowercase();
      ByteString.encodeUtf8("");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-11);
      byteArray0[1] = (byte)106;
      byteArray0[2] = (byte)106;
      byteArray0[3] = (byte) (-11);
      byteString1.indexOf(byteArray0);
      ByteString byteString2 = new ByteString(byteArray0);
      byteString1.equals(byteString0);
      ByteString byteString3 = new ByteString(byteArray0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteString byteString0 = new ByteString(byteArray0);
      ByteString byteString1 = byteString0.substring(0);
      byteString0.toString();
      byteString1.substring(0, 0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Inflater inflater0 = new Inflater();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)13;
      ByteString byteString0 = new ByteString(byteArray0);
      byteString0.EMPTY.toAsciiLowercase();
      byteString0.toString();
  }
}