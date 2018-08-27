/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 09:41:47 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.HashingSink;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Segment;
import okio.SegmentedByteString;
import okio.Source;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SegmentedByteString_ESTest extends SegmentedByteString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.utf8();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.require(0);
      Charset charset0 = Charset.defaultCharset();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.string(charset0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.hmacSha1(segmentedByteString0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.sha1();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      Buffer buffer1 = realBufferedSink0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.hex();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      int int0 = 0;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.sha256();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      segmentedByteString0.hashCode();
      // Undeclared exception!
      try { 
        segmentedByteString0.hmacSha256(segmentedByteString0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.base64();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      int int0 = 0;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      byte[] byteArray0 = null;
      segmentedByteString0.rangeEquals((-2680), (byte[]) null, (-2680), 5799);
      SegmentedByteString segmentedByteString1 = null;
      try {
        segmentedByteString1 = new SegmentedByteString(buffer0, 47);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=0 byteCount=47
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      ByteString byteString0 = ByteString.encodeUtf8("s == null");
      segmentedByteString0.rangeEquals((-3203), byteString0, 0, (-3203));
      // Undeclared exception!
      try { 
        segmentedByteString0.asByteBuffer();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.base64Url();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      HashingSink.sha1(buffer0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.lastIndexOf((byte[]) null, 40);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      segmentedByteString0.write(pipedOutputStream0);
      // Undeclared exception!
      try { 
        segmentedByteString0.md5();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(realBufferedSink0.buffer, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.write((OutputStream) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // out == null
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      buffer0.writeDecimalLong(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.hashCode();
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "out == null");
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      realBufferedSource0.readByteString();
      realBufferedSource0.readByteString();
      segmentedByteString0.hashCode();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeDecimalLong(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      byte[] byteArray0 = new byte[5];
      buffer1.indexOf((ByteString) segmentedByteString0, (long) (byte)0);
      ByteString byteString0 = ByteString.EMPTY;
      SegmentedByteString segmentedByteString1 = new SegmentedByteString(buffer0, 1);
      boolean boolean0 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeDecimalLong(1);
      BufferedSink bufferedSink0 = buffer1.write((Source) buffer0, 0L);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(bufferedSink0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      segmentedByteString0.write(buffer1);
      boolean boolean0 = segmentedByteString0.rangeEquals(1, (ByteString) segmentedByteString0, 2838, 0);
      assertFalse(buffer0.exhausted());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeDecimalLong(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.asByteBuffer();
      segmentedByteString0.asByteBuffer();
      ByteString byteString0 = segmentedByteString0.toAsciiUppercase();
      boolean boolean0 = segmentedByteString0.endsWith(byteString0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.readUtf8();
      buffer0.writeDecimalLong(3788L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.hashCode();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[0];
      segmentedByteString0.startsWith(byteArray0);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring((-2182), (-2182));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeDecimalLong(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      ByteString byteString0 = segmentedByteString0.toAsciiLowercase();
      segmentedByteString0.rangeEquals(1, byteString0, (-1415), 78);
      // Undeclared exception!
      try { 
        segmentedByteString0.getByte((-259));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=1 offset=-259 byteCount=1
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.readUtf8();
      buffer0.writeDecimalLong(3788L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      SegmentedByteString segmentedByteString1 = new SegmentedByteString(buffer0, 1);
      segmentedByteString1.hashCode();
      byte[] byteArray0 = new byte[1];
      segmentedByteString0.startsWith(byteArray0);
      // Undeclared exception!
      try { 
        segmentedByteString1.substring((-2182), (-2182));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // beginIndex < 0
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeDecimalLong(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      assertEquals(1, segmentedByteString0.size());
      
      segmentedByteString0.asByteBuffer();
      boolean boolean0 = segmentedByteString0.endsWith((ByteString) segmentedByteString0);
      assertTrue(boolean0);
      
      Charset.defaultCharset();
      byte[] byteArray0 = segmentedByteString0.internalArray();
      assertArrayEquals(new byte[] {(byte)49}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeDecimalLong(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.asByteBuffer();
      FileSystemHandling.shouldAllThrowIOExceptions();
      boolean boolean0 = FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "out == null");
      segmentedByteString0.hashCode();
      byte[] byteArray0 = new byte[0];
      boolean boolean1 = segmentedByteString0.rangeEquals(1, byteArray0, 1, 653);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeDecimalLong(1);
      BufferedSink bufferedSink0 = buffer1.write((Source) buffer0, 0L);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(bufferedSink0);
      Charset charset0 = Charset.defaultCharset();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      Object object0 = new Object();
      ByteString byteString0 = ByteString.encodeString("mED11=g", charset0);
      segmentedByteString0.equals(byteString0);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring(122, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endIndex < beginIndex
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeDecimalLong(1);
      Object object0 = new Object();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      segmentedByteString0.write(byteArrayOutputStream0);
      assertEquals(1, byteArrayOutputStream0.size());
      assertEquals("1", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeDecimalLong(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.asByteBuffer();
      segmentedByteString0.toString();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteString byteString0 = realBufferedSource0.readByteString();
      Locale locale0 = new Locale("E)\"<v<&hWU8TbY'8", "E)\"<v<&hWU8TbY'8");
      locale0.getUnicodeLocaleKeys();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      RealBufferedSource realBufferedSource1 = new RealBufferedSource(buffer1);
      segmentedByteString0.equals(byteString0);
      Buffer buffer2 = realBufferedSource1.buffer;
      assertTrue(buffer2.equals((Object)buffer0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      buffer0.readUtf8();
      buffer0.writeDecimalLong(3788L);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      segmentedByteString0.hashCode();
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(buffer0);
      realBufferedSink0.writeDecimalLong(1);
      realBufferedSink0.toString();
      Charset.defaultCharset();
      segmentedByteString0.hmacSha512(segmentedByteString0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(realBufferedSink0.buffer);
      RealBufferedSource realBufferedSource1 = new RealBufferedSource(realBufferedSource0);
      ByteString byteString0 = realBufferedSource1.readByteString();
      segmentedByteString0.startsWith(byteString0);
      SegmentedByteString segmentedByteString1 = null;
      try {
        segmentedByteString1 = new SegmentedByteString(realBufferedSink0.buffer, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=0 byteCount=-1
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.writeDecimalLong(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      buffer0.readByteArray();
      segmentedByteString0.asByteBuffer();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ByteString byteString0 = segmentedByteString0.substring(1, 1);
      boolean boolean0 = byteString0.endsWith((ByteString) segmentedByteString0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeDecimalLong(1);
      BufferedSink bufferedSink0 = buffer1.write((Source) buffer0, 0L);
      RealBufferedSink realBufferedSink0 = new RealBufferedSink(bufferedSink0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 1);
      MockFile mockFile0 = new MockFile("U$)AZ/IBY=~:", "U$)AZ/IBY=~:");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      buffer0.writeTo((OutputStream) mockFileOutputStream0);
      segmentedByteString0.write(buffer1);
      boolean boolean0 = segmentedByteString0.rangeEquals(1, (ByteString) segmentedByteString0, 2838, 0);
      assertEquals(1L, buffer1.completeSegmentByteCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeDecimalLong(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      byte[] byteArray0 = new byte[5];
      ByteString byteString0 = buffer1.sha256();
      SegmentedByteString segmentedByteString1 = new SegmentedByteString(buffer0, 1);
      segmentedByteString1.equals(buffer1);
      Buffer buffer2 = new Buffer();
      Buffer buffer3 = new Buffer();
      segmentedByteString0.write(buffer0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "}0NwD:T");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ByteString byteString1 = ByteString.read(byteArrayInputStream0, 1);
      segmentedByteString1.equals(byteString1);
      buffer3.indexOf(byteString0, (long) 1);
      segmentedByteString1.indexOf(byteString0);
      ByteString.decodeBase64("?");
      // Undeclared exception!
      try { 
        segmentedByteString0.startsWith((ByteString) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      int int0 = 1;
      buffer0.writeDecimalLong(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-46);
      byteArray0[1] = (byte) (-46);
      byteArray0[2] = (byte) (-46);
      byteArray0[3] = (byte) (-46);
      byteArray0[4] = (byte) (-46);
      segmentedByteString0.rangeEquals(4, byteArray0, 56, (int) (byte) (-46));
      ByteArrayOutputStream byteArrayOutputStream0 = null;
      try {
        byteArrayOutputStream0 = new ByteArrayOutputStream((byte) (-46));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative initial size: -46
         //
         verifyException("java.io.ByteArrayOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      int int0 = 1;
      Buffer buffer1 = buffer0.writeDecimalLong(1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      byte[] byteArray0 = new byte[5];
      buffer1.sha256();
      Segment segment0 = new Segment(byteArray0, 1, 1, false, false);
      buffer1.head = segment0;
      SegmentedByteString segmentedByteString1 = null;
      try {
        segmentedByteString1 = new SegmentedByteString(buffer0, 1);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // s.limit == s.pos
         //
      }
  }
}