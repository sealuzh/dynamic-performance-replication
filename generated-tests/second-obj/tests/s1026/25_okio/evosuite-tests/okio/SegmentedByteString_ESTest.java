/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 11:52:25 GMT 2018
 */

package okio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamConstants;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Enumeration;
import okio.Buffer;
import okio.ByteString;
import okio.HashingSource;
import okio.Pipe;
import okio.RealBufferedSource;
import okio.SegmentedByteString;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
        segmentedByteString0.toAsciiLowercase();
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
      Pipe pipe0 = new Pipe(88L);
      Buffer buffer0 = pipe0.buffer;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      segmentedByteString0.equals(pipe0);
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
  public void test02()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("M]");
      Buffer buffer2 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      buffer0.readAll(realBufferedSource0.buffer);
      Buffer buffer3 = realBufferedSource0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer3, 1);
      realBufferedSource0.readByteString();
      segmentedByteString0.md5();
      segmentedByteString0.write(buffer2);
      assertFalse(buffer2.exhausted());
      assertFalse(buffer0.equals((Object)buffer2));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      int int0 = 0;
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
  public void test04()  throws Throwable  {
      Pipe pipe0 = new Pipe(58L);
      Buffer buffer0 = pipe0.buffer;
      String string0 = "ImmsyC,v`N";
      FileSystemHandling.shouldAllThrowIOExceptions();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer0);
      InputStream inputStream0 = realBufferedSource0.inputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(inputStream0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      ByteString byteString0 = ByteString.decodeBase64("");
      segmentedByteString0.rangeEquals((-1397), byteString0, (-1397), 0);
      RealBufferedSource realBufferedSource1 = new RealBufferedSource(buffer0);
      Buffer buffer1 = pipe0.buffer;
      segmentedByteString0.write(realBufferedSource1.buffer);
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
  public void test05()  throws Throwable  {
      Pipe pipe0 = new Pipe(58L);
      Buffer buffer0 = pipe0.buffer;
      boolean boolean0 = pipe0.sinkClosed;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      segmentedByteString0.hashCode();
      // Undeclared exception!
      try { 
        segmentedByteString0.rangeEquals(2, (ByteString) segmentedByteString0, 1536, 3808);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Pipe pipe0 = new Pipe(88L);
      Buffer buffer0 = pipe0.buffer;
      pipe0.sinkClosed = true;
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      HashingSource.sha256(buffer0);
      // Undeclared exception!
      try { 
        segmentedByteString0.toAsciiUppercase();
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
  public void test08()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      Charset charset0 = Charset.defaultCharset();
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
  public void test09()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("M]");
      Buffer buffer2 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      realBufferedSource0.readByte();
      Buffer buffer3 = realBufferedSource0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer3, 1);
      buffer0.readAndWriteUnsafe();
      segmentedByteString0.rangeEquals((-1), (byte[]) null, 0, (int) (byte) (-100));
      // Undeclared exception!
      try { 
        segmentedByteString0.indexOf((byte[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("okio.ByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      Charset.defaultCharset();
      // Undeclared exception!
      try { 
        segmentedByteString0.toString();
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
      Buffer buffer1 = new Buffer();
      buffer0.inputStream();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.substring(3622, 0);
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
      buffer0.snapshot();
      Buffer buffer1 = buffer0.writeUtf8("M]");
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      RealBufferedSource realBufferedSource1 = new RealBufferedSource(hashingSource0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 0);
      segmentedByteString0.hashCode();
      segmentedByteString0.hashCode();
      // Undeclared exception!
      try { 
        segmentedByteString0.getByte(2);
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
      Buffer buffer1 = buffer0.writeUtf8("M]");
      Buffer buffer2 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      buffer1.inputStream();
      byte byte0 = ObjectStreamConstants.TC_PROXYCLASSDESC;
      realBufferedSource0.buffer();
      byte[] byteArray0 = new byte[1];
      realBufferedSource0.read(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer2, 0);
      // Undeclared exception!
      try { 
        segmentedByteString0.lastIndexOf(byteArray0, 1);
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
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
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
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/25_okio");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "\u0005IL]/@2");
      Buffer buffer0 = new Buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "M]");
      // Undeclared exception!
      try { 
        segmentedByteString0.substring((-602));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("okio.SegmentedByteString", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      buffer0.snapshot();
      Buffer buffer1 = buffer0.writeUtf8("4]");
      HashingSource hashingSource0 = HashingSource.sha256(buffer0);
      Buffer buffer2 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      RealBufferedSource realBufferedSource1 = new RealBufferedSource(hashingSource0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 0);
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
  public void test17()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("M]");
      Buffer buffer2 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      buffer1.inputStream();
      buffer0.readAll(realBufferedSource0.buffer);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 0);
      segmentedByteString0.write(realBufferedSource0.buffer);
      int int0 = 1;
      Buffer buffer3 = realBufferedSource0.buffer();
      SegmentedByteString segmentedByteString1 = new SegmentedByteString(buffer3, 1);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byteArrayOutputStream0.flush();
      ByteString byteString0 = segmentedByteString1.sha256();
      // Undeclared exception!
      try { 
        segmentedByteString0.equals(byteString0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("oM]");
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      buffer1.inputStream();
      realBufferedSource0.readByte();
      Buffer buffer2 = realBufferedSource0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer2, 1);
      byte byte0 = segmentedByteString0.getByte(0);
      assertEquals((byte)77, byte0);
      
      buffer2.readByteArray();
      Enumeration<ObjectInputStream> enumeration0 = (Enumeration<ObjectInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ByteString byteString0 = ByteString.encodeUtf8("dLup2>PHi'S%I");
      segmentedByteString0.equals(byteString0);
      segmentedByteString0.hmacSha1(byteString0);
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("M]");
      Buffer buffer2 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      buffer0.readAll(realBufferedSource0.buffer);
      Buffer buffer3 = realBufferedSource0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer3, 1);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      buffer3.writeTo((OutputStream) pipedOutputStream0);
      byte[] byteArray0 = new byte[5];
      segmentedByteString0.rangeEquals(1, byteArray0, 310, (int) (byte)0);
      byte[] byteArray1 = realBufferedSource0.readByteArray();
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("M]");
      Buffer buffer2 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      buffer1.inputStream();
      buffer0.readAll(realBufferedSource0.buffer);
      Buffer buffer3 = realBufferedSource0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer3, 1);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)76;
      boolean boolean0 = segmentedByteString0.rangeEquals(1, byteArray0, 690, (int) (byte)76);
      assertFalse(boolean0);
      
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      segmentedByteString0.asByteBuffer();
      assertEquals(1, segmentedByteString0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("M]");
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      buffer1.inputStream();
      byte byte0 = ObjectStreamConstants.TC_MAX;
      Buffer buffer2 = realBufferedSource0.buffer();
      byte[] byteArray0 = new byte[1];
      realBufferedSource0.read(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer2, 1);
      segmentedByteString0.asByteBuffer();
      segmentedByteString0.getByte(0);
      ByteString byteString0 = buffer0.sha256();
      assertEquals(32, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("M]");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Buffer buffer2 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      buffer0.readAll(realBufferedSource0.buffer);
      realBufferedSource0.readByte();
      Buffer buffer3 = realBufferedSource0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer3, 1);
      realBufferedSource0.readByteString();
      segmentedByteString0.md5();
      segmentedByteString0.hashCode();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("M]");
      Buffer buffer2 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      buffer0.readAll(realBufferedSource0.buffer);
      realBufferedSource0.readByte();
      Buffer buffer3 = realBufferedSource0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer3, 1);
      segmentedByteString0.rangeEquals(3376, (ByteString) segmentedByteString0, 3808, 387);
      ByteString byteString0 = segmentedByteString0.md5();
      assertEquals(16, byteString0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("M]");
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      buffer1.inputStream();
      buffer0.readAll(realBufferedSource0.buffer);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer1, 0);
      segmentedByteString0.write(realBufferedSource0.buffer);
      Buffer buffer2 = realBufferedSource0.buffer();
      SegmentedByteString segmentedByteString1 = new SegmentedByteString(buffer2, 1);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      realBufferedSource0.readByteString();
      segmentedByteString1.rangeEquals(1, (ByteString) segmentedByteString0, (int) (byte) (-100), 0);
      // Undeclared exception!
      try { 
        Charset.forName("M]");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // M]
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("M]");
      Buffer buffer2 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      buffer0.readAll(realBufferedSource0.buffer);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      realBufferedSource0.readByte();
      Buffer buffer3 = realBufferedSource0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer3, 1);
      ByteString byteString0 = realBufferedSource0.readByteString();
      segmentedByteString0.startsWith(byteString0);
      segmentedByteString0.md5();
      // Undeclared exception!
      try { 
        buffer3.readByte();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // size == 0
         //
         verifyException("okio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("M]");
      Buffer buffer2 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      buffer1.inputStream();
      buffer0.readAll(realBufferedSource0.buffer);
      realBufferedSource0.readByte();
      int int0 = 1;
      Buffer buffer3 = realBufferedSource0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer3, 1);
      segmentedByteString0.asByteBuffer();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Buffer buffer4 = realBufferedSource0.buffer.write((ByteString) segmentedByteString0);
      SegmentedByteString segmentedByteString1 = new SegmentedByteString(buffer4, 1);
      segmentedByteString0.sha1();
      segmentedByteString0.equals("M]");
      Pipe pipe0 = null;
      try {
        pipe0 = new Pipe(0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxBufferSize < 1: 0
         //
         verifyException("okio.Pipe", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("M]");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Buffer buffer2 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer0, 1);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Buffer buffer3 = new Buffer();
      buffer0.sha256();
      Enumeration<ObjectInputStream> enumeration0 = (Enumeration<ObjectInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      segmentedByteString0.write(byteArrayOutputStream0);
      segmentedByteString0.utf8();
      // Undeclared exception!
      try { 
        buffer0.readUtf8Line((-1117L));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=2 offset=0 byteCount=-1117
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("M]");
      InputStream inputStream0 = buffer0.inputStream();
      Buffer buffer2 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      Buffer buffer3 = realBufferedSource0.buffer();
      byte[] byteArray0 = new byte[1];
      realBufferedSource0.read(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer3, 1);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Buffer buffer4 = new Buffer();
      buffer0.sha256();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(inputStream0, inputStream0);
      ByteString byteString0 = ByteString.of(byteArray0);
      byteString0.substring(1);
      segmentedByteString0.compareTo(byteString0);
      ByteString byteString1 = ByteString.encodeUtf8("dLup4ZUZi'S7I");
      byteString0.hmacSha256(byteString1);
      segmentedByteString0.equals(byteString0);
      segmentedByteString0.utf8();
      // Undeclared exception!
      try { 
        buffer3.readUtf8Line((-1117L));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=1 offset=0 byteCount=-1117
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Buffer buffer1 = buffer0.writeUtf8("M]");
      Buffer buffer2 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      InputStream inputStream0 = realBufferedSource0.buffer.inputStream();
      buffer0.readAll(realBufferedSource0.buffer);
      Buffer buffer3 = realBufferedSource0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer3, 1);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = segmentedByteString0.toByteArray();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(inputStream0, inputStream0);
      ByteString byteString0 = ByteString.of(byteArray0);
      byteString0.indexOf((ByteString) segmentedByteString0);
      ByteString.encodeUtf8("dLup2>PHi'S%I");
      segmentedByteString0.utf8();
      segmentedByteString0.equals(byteString0);
      // Undeclared exception!
      try { 
        segmentedByteString0.getByte((-1155));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=1 offset=-1155 byteCount=1
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("M]");
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      byte byte0 = ObjectStreamConstants.TC_MAX;
      Buffer buffer2 = realBufferedSource0.buffer();
      byte[] byteArray0 = new byte[1];
      realBufferedSource0.read(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer2, 1);
      segmentedByteString0.asByteBuffer();
      buffer2.sha256();
      ByteString byteString0 = new ByteString(byteArray0);
      segmentedByteString0.endsWith(byteArray0);
      segmentedByteString0.equals("M]");
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        buffer1.readString((long) 1, charset0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=0 byteCount=1
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("M]");
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      InputStream inputStream0 = buffer1.inputStream();
      byte byte0 = ObjectStreamConstants.TC_MAX;
      Buffer buffer2 = realBufferedSource0.buffer();
      byte[] byteArray0 = new byte[1];
      realBufferedSource0.read(byteArray0);
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer2, 1);
      segmentedByteString0.asByteBuffer();
      buffer2.sha256();
      byte[] byteArray1 = segmentedByteString0.toByteArray();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(inputStream0, inputStream0);
      ByteString byteString0 = new ByteString(byteArray0);
      segmentedByteString0.endsWith(byteArray1);
      segmentedByteString0.equals("M]");
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        buffer1.readString((long) 1, charset0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // size=0 offset=0 byteCount=1
         //
         verifyException("okio.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Buffer buffer0 = new Buffer();
      Buffer buffer1 = buffer0.writeUtf8("M]");
      Buffer buffer2 = new Buffer();
      RealBufferedSource realBufferedSource0 = new RealBufferedSource(buffer1);
      realBufferedSource0.indexOf((byte)69, 1000L);
      buffer0.readAll(realBufferedSource0.buffer);
      Buffer buffer3 = realBufferedSource0.buffer();
      SegmentedByteString segmentedByteString0 = new SegmentedByteString(buffer3, 1);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byteArrayOutputStream0.reset();
      buffer3.writeTo((OutputStream) byteArrayOutputStream0);
      byteArrayOutputStream0.flush();
      byte byte0 = segmentedByteString0.getByte(0);
      assertEquals((byte)77, byte0);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-100);
      segmentedByteString0.rangeEquals((int) (byte)77, byteArray0, (int) (byte) (-100), (int) (byte) (-100));
      assertEquals(1, segmentedByteString0.size());
  }
}