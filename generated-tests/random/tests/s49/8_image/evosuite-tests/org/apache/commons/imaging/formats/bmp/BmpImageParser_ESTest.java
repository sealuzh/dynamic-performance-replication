/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 10:23:55 GMT 2019
 */

package org.apache.commons.imaging.formats.bmp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.formats.bmp.BmpImageParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BmpImageParser_ESTest extends BmpImageParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("BUFFERED_IMAGE_FACTORY");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)29;
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
  public void test01()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceFile0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>(3064);
      hashtable0.put("Width", pipedOutputStream0);
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, pipedOutputStream0, hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: Width
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockPrintStream mockPrintStream0 = new MockPrintStream("eytTQ");
      // Undeclared exception!
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, mockPrintStream0, (Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.palette.PaletteFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      bmpImageParser0.writeImage(bufferedImage0, bufferedOutputStream0, hashMap0);
      assertEquals(0, bufferedImage0.getMinTileX());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[5];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = new Object();
      hashMap0.put("5 byte array", object0);
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: 5 byte array
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      File file0 = MockFile.createTempFile("FORMAT", "FORMAT");
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(file0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("BUFFERED_IMAGE_FACTORY", (Object) null);
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceFile0, (Map<String, Object>) hashMap0);
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
      byte[] byteArray0 = new byte[2];
      try { 
        bmpImageParser0.getAllBufferedImages(byteArray0);
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
      PipedInputStream pipedInputStream0 = new PipedInputStream(108);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(pipedInputStream0, "");
      try { 
        bmpImageParser0.getFormatCompliance((ByteSource) byteSourceInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[1];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("", byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>((byte)84);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)84, (byte)84);
      hashMap0.put("", byteArrayInputStream0);
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: 
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[18];
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      File file0 = MockFile.createTempFile("VERBOSE", "WM20J\"T)");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(mockFileInputStream0, 2072);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(bufferedInputStream0);
      hashMap0.put("VERBOSE", pushbackInputStream0);
      try { 
        bmpImageParser0.getImageInfo(byteArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unsupported BMP file
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[9];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>((byte)14);
      hashMap0.put("-ON{6<S4l", byteSourceArray0);
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: -ON{6<S4l
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[5];
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("VERBOSE", "VERBOSE");
      try { 
        bmpImageParser0.getImageSize(byteArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("bhi.Height", (byte[]) null);
      // Undeclared exception!
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceArray0, (Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[8];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      byte[] byteArray1 = bmpImageParser0.getICCProfileBytes((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String[] stringArray0 = bmpImageParser0.getAcceptedExtensions();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[5];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      ImageMetadata imageMetadata0 = bmpImageParser0.getMetadata((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
      assertNull(imageMetadata0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String string0 = bmpImageParser0.getName();
      assertEquals("Bmp-Custom", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[4];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      String string0 = bmpImageParser0.getXmpXml(byteSourceArray0, hashtable0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      ImageFormat[] imageFormatArray0 = bmpImageParser0.getAcceptedTypes();
      assertEquals(1, imageFormatArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String string0 = bmpImageParser0.getDefaultExtension();
      assertEquals(".bmp", string0);
  }
}