/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 11:13:26 GMT 2019
 */

package org.apache.commons.imaging.formats.bmp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.DebugGraphics;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.PixelDensity;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.formats.bmp.BmpImageParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BmpImageParser_ESTest extends BmpImageParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)36;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceArray0, (Map<String, Object>) null);
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
      byte[] byteArray0 = new byte[3];
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("/=\"tQ", byteArray0);
      hashtable0.put("PBM", byteSourceArray0);
      String string0 = bmpImageParser0.getXmpXml(byteSourceArray0, hashtable0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      String string0 = bmpImageParser0.getXmpXml((ByteSource) null, hashtable0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[6];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      PixelDensity pixelDensity0 = PixelDensity.createFromPixelsPerInch((byte)30, (byte)30);
      hashMap0.put((String) null, pixelDensity0);
      ImageMetadata imageMetadata0 = bmpImageParser0.getMetadata((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
      assertNull(imageMetadata0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[3];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("BW", byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      ImageMetadata imageMetadata0 = bmpImageParser0.getMetadata((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
      assertNull(imageMetadata0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[9];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
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
  public void test06()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[0];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      byte[] byteArray1 = bmpImageParser0.getICCProfileBytes((ByteSource) byteSourceArray0, (Map<String, Object>) null);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[6];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      PixelDensity pixelDensity0 = PixelDensity.createFromPixelsPerInch((byte)30, (byte)30);
      hashMap0.put((String) null, pixelDensity0);
      byte[] byteArray1 = bmpImageParser0.getICCProfileBytes((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) null, (Map<String, Object>) hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[3];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      // Undeclared exception!
      try { 
        bmpImageParser0.dumpImageFile((PrintWriter) null, (ByteSource) byteSourceArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        bmpImageParser0.getImageSize((ByteSource) null, (Map<String, Object>) hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      // Undeclared exception!
      try { 
        bmpImageParser0.getImageInfo((ByteSource) null, (Map<String, Object>) hashtable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      // Undeclared exception!
      try { 
        bmpImageParser0.getFormatCompliance((ByteSource) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[3];
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("/=\"tQ", byteArray0);
      hashtable0.put("PBM", byteSourceArray0);
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: PBM
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("VERBOSE");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("colorSpace.green.y", (Object) null);
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, mockPrintStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: colorSpace.green.y
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("VERBOSE");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("FORMAT", (Object) null);
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      // Undeclared exception!
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, mockFileOutputStream0, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.palette.PaletteFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("/XJY1x}d'c;w:3");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
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
  public void test17()  throws Throwable  {
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      // Undeclared exception!
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, (OutputStream) null, hashtable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.palette.PaletteFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      hashtable0.put("&", dataInputStream0);
      try { 
        bmpImageParser0.getBufferedImage((InputStream) byteArrayInputStream0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: &
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      hashtable0.put("BUFFERED_IMAGE_FACTORY", dataInputStream0);
      try { 
        bmpImageParser0.getBufferedImage((InputStream) byteArrayInputStream0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[5];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      InputStream inputStream0 = byteSourceArray0.getInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(inputStream0, (byte)7);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("VERBOSE", inputStream0);
      try { 
        bmpImageParser0.getBufferedImage((InputStream) bufferedInputStream0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      // Undeclared exception!
      try { 
        bmpImageParser0.getBufferedImage((InputStream) null, (Map<String, Object>) hashtable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[0];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      try { 
        bmpImageParser0.getFormatCompliance((ByteSource) byteSourceArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      Object object0 = new Object();
      hashtable0.put(")5l[zc3qXS 8M", object0);
      try { 
        bmpImageParser0.getImageInfo((ByteSource) null, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: )5l[zc3qXS 8M
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[4];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      Object object0 = new Object();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("VERBOSE", object0);
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      PixelDensity pixelDensity0 = PixelDensity.createFromPixelsPerCentimetre((byte)65, 0.0);
      hashtable0.put(">HRLf2[E3|gfh>-", pixelDensity0);
      try { 
        bmpImageParser0.getImageSize((ByteSource) null, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: >HRLf2[E3|gfh>-
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      hashMap0.put("VERBOSE", defaultTableModel0);
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(pipedInputStream0, "VERBOSE");
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceInputStream0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceArray0, (Map<String, Object>) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[6];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      InputStream inputStream0 = byteSourceArray0.getInputStream();
      try { 
        bmpImageParser0.getBufferedImage(inputStream0, (Map<String, Object>) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[20];
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      try { 
        bmpImageParser0.getImageSize(byteArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unsupported BMP file
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      PrintStream printStream0 = DebugGraphics.logStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(printStream0);
      // Undeclared exception!
      try { 
        bmpImageParser0.dumpImageFile((PrintWriter) mockPrintWriter0, (ByteSource) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      byte[] byteArray0 = bmpImageParser0.getICCProfileBytes((ByteSource) null, (Map<String, Object>) hashtable0);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String[] stringArray0 = bmpImageParser0.getAcceptedExtensions();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      ImageMetadata imageMetadata0 = bmpImageParser0.getMetadata((ByteSource) null, (Map<String, Object>) null);
      assertNull(imageMetadata0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String string0 = bmpImageParser0.getName();
      assertEquals("Bmp-Custom", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[0];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      String string0 = bmpImageParser0.getXmpXml(byteSourceArray0, (Map<String, Object>) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      ImageFormat[] imageFormatArray0 = bmpImageParser0.getAcceptedTypes();
      assertEquals(1, imageFormatArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String string0 = bmpImageParser0.getDefaultExtension();
      assertEquals(".bmp", string0);
  }
}
