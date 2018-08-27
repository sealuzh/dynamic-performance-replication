/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 05:17:42 GMT 2018
 */

package org.apache.commons.imaging.formats.bmp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.TextField;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.function.BiFunction;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.formats.bmp.BmpImageParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BmpImageParser_ESTest extends BmpImageParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[3];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("VERBOSE", byteArray0);
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceArray0, (Map<String, Object>) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      bmpImageParser0.getAcceptedTypes();
      BufferedImage bufferedImage0 = null;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      byteArrayOutputStream0.close();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      LocalDateTime localDateTime0 = MockLocalDateTime.ofEpochSecond(0, 0, zoneOffset0);
      MockMinguoDate.from(localDateTime0);
      hashMap0.put("K3fN_~-2#UiC$R)", mockMinguoDate0);
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte) (-60);
      byteArray0[0] = (byte) (-60);
      try { 
        byteArrayOutputStream0.toString("K3fN_~-2#UiC$R)");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("");
      File file0 = mockFile0.getAbsoluteFile();
      mockFile0.getAbsolutePath();
      MockFile mockFile1 = new MockFile("", "Nt0``");
      mockFile0.renameTo(mockFile1);
      bmpImageParser0.getAllBufferedImages((File) mockFile0);
      bmpImageParser0.getName();
      bmpImageParser0.getFormatCompliance(file0);
      ByteSource byteSource0 = null;
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-101);
      byteArray0[2] = (byte) (-5);
      byteArray0[3] = (byte)100;
      byteArray0[4] = (byte) (-114);
      byteArray0[5] = (byte)6;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)24;
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      try { 
        bmpImageParser0.getBufferedImage(byteArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[0];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      bmpImageParser0.getMetadata((ByteSource) null);
      // Undeclared exception!
      try { 
        bmpImageParser0.getBufferedImage((InputStream) null, (Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("f");
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)40;
      byteArray0[2] = (byte) (-45);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)67;
      byteArray0[5] = (byte)93;
      byteArray0[6] = (byte) (-8);
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      try { 
        bmpImageParser0.dumpImageFile((PrintWriter) mockPrintWriter0, (ByteSource) byteSourceArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-92);
      byteArray0[4] = (byte)80;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[0];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)15;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("", byteArray0);
      String string0 = bmpImageParser0.getXmpXml(byteSourceArray0, (Map<String, Object>) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      bmpImageParser0.getName();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byte byte0 = (byte)3;
      byteArray0[1] = (byte)3;
      byteArray0[2] = (byte) (-35);
      bmpImageParser0.getICCProfileBytes(byteArray0);
      byteArray0[3] = (byte)52;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      try { 
        byteSourceArray0.getBlock((long) (byte)3, 2366);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not read block (block start: 3, block length: 2366, data length: 4).
         //
         verifyException("org.apache.commons.imaging.common.bytesource.ByteSourceArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String string0 = "#,/z\\LCf";
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)24;
      byteArray0[3] = (byte)86;
      byteArray0[4] = (byte)72;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("#,/zLCf", byteArray0);
      byteSourceArray0.getDescription();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("", bmpImageParser0);
      byteSourceArray0.getInputStream();
      hashtable0.put("+5qs;:", "");
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      hashtable0.put("5 byte array", mockThaiBuddhistDate0);
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: 
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte) (-3);
      byteArray1[1] = (byte)14;
      byteArray1[2] = (byte) (-1);
      byteArray1[3] = (byte)64;
      bmpImageParser0.getDefaultExtension();
      byteArray1[4] = (byte) (-1);
      byteArray1[5] = (byte) (-1);
      byteArray1[6] = (byte)31;
      byteArray1[7] = (byte)0;
      try { 
        bmpImageParser0.getFormatCompliance(byteArray1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      bmpImageParser0.getDefaultExtension();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, (OutputStream) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.palette.PaletteFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[1];
      MockFile mockFile0 = new MockFile((String) null, "VERBOSE");
      bmpImageParser0.getFormatCompliance((File) mockFile0);
      byteArray0[0] = (byte)75;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("VERBOSE", byteArray0);
      InputStream inputStream0 = byteSourceArray0.getInputStream(1L);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      hashMap0.put((String) null, mockMinguoDate0);
      try { 
        bmpImageParser0.getBufferedImage(inputStream0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: null
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[10];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      ImageParser.getAllImageParsers();
      BiFunction<Object, Object, TextField> biFunction0 = (BiFunction<Object, Object, TextField>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge(" (}2", byteSourceArray0, biFunction0);
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter:  (}2
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[18];
      byteArray0[0] = (byte) (-71);
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unsupported BMP file
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[18];
      byteArray0[0] = (byte) (-71);
      byteArray0[1] = (byte)77;
      byteArray0[2] = (byte)77;
      byteArray0[1] = (byte)0;
      try { 
        bmpImageParser0.getFormatCompliance(byteArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unsupported BMP file
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)12;
      byteArray0[1] = (byte) (-75);
      byteArray0[2] = (byte)2;
      byteArray0[3] = (byte) (-118);
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)7;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)12, (byte)2);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, (byte)7);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(bufferedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      hashMap0.put("XWXoq?p4Dm-5au!", dataInputStream0);
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, (OutputStream) null, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: XWXoq?p4Dm-5au!
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }
}