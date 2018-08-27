/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 18:27:41 GMT 2018
 */

package org.apache.commons.imaging.formats.bmp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import javax.swing.text.AttributeSet;
import javax.swing.text.StyleConstants;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.formats.bmp.BmpImageParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BmpImageParser_ESTest extends BmpImageParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      bmpImageParser0.getAcceptedTypes();
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("l~f?9V>w~HE<t*Ht7");
      bmpImageParser0.getImageSize((File) mockFile0);
      bmpImageParser0.setDebug(false);
      String string0 = bmpImageParser0.getName();
      assertEquals("Bmp-Custom", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("{uJ~ M`]w");
      mockFile0.toPath();
      bmpImageParser0.getICCProfileBytes((File) mockFile0);
      bmpImageParser0.getDefaultExtension();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      bmpImageParser0.getImageInfo((File) mockFile0, (Map<String, Object>) hashtable0);
      bmpImageParser0.getName();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 512);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0);
      bufferedInputStream0.close();
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(bufferedInputStream0, "qLLO?xmlhIa)/[%'+3J");
      // Undeclared exception!
      try { 
        bufferedInputStream0.read((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-27);
      byteArray0[1] = (byte)32;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)4;
      byteArray0[4] = (byte)26;
      byteArray0[5] = (byte)13;
      byteArray0[6] = (byte)46;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)103;
      bmpImageParser0.getICCProfileBytes(byteArray0);
      ImageFormat[] imageFormatArray0 = bmpImageParser0.getAcceptedTypes();
      ImageFormat[] imageFormatArray1 = bmpImageParser0.getAcceptedTypes();
      assertNotSame(imageFormatArray1, imageFormatArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)36;
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("mc;NN/UC`jo*FB", byteArray0);
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
  public void test05()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[0];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray((String) null, byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
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
  public void test06()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)125;
      byteArray0[1] = (byte)59;
      byteArray0[2] = (byte)40;
      byteArray0[3] = (byte) (-60);
      byteArray0[4] = (byte)93;
      byteArray0[5] = (byte)89;
      byteArray0[6] = (byte)116;
      bmpImageParser0.getMetadata(byteArray0);
      StyleConstants styleConstants0 = (StyleConstants)AttributeSet.ResolveAttribute;
      hashtable0.put("", styleConstants0);
      try { 
        bmpImageParser0.getBufferedImage((InputStream) bufferedInputStream0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: 
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[0];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray((String) null, byteArray0);
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
  public void test08()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte) (-56);
      byteArray0[2] = (byte)84;
      byteArray0[3] = (byte)77;
      byteArray0[4] = (byte) (-1);
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      try { 
        bmpImageParser0.getAllBufferedImages((ByteSource) byteSourceArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)12;
      byteArray0[1] = (byte)67;
      byteArray0[2] = (byte)12;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)66;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)12, (-3938));
      String string0 = "";
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(byteArrayInputStream0, "");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("", byteArray0);
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceInputStream0, (Map<String, Object>) hashMap0);
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
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-58);
      byteArray0[1] = (byte)46;
      byteArray0[2] = (byte)45;
      byteArray0[3] = (byte)12;
      byteArray0[4] = (byte) (-88);
      byteArray0[5] = (byte) (-5);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1039, 8697);
      String string0 = "BUFFERED_IMAGE_FACTORY";
      FileSystemHandling.shouldAllThrowIOExceptions();
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(byteArrayInputStream0, "BUFFERED_IMAGE_FACTORY");
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      byteSourceInputStream0.getInputStream();
      bmpImageParser0.getXmpXml(byteSourceInputStream0, hashtable0);
      bmpImageParser0.getAcceptedExtensions();
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceInputStream0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-3);
      byteArray0[1] = (byte)56;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byteArray0[2] = (byte)108;
      byteArray0[3] = (byte)54;
      byteArray0[4] = (byte) (-52);
      byteArray0[5] = (byte) (-3);
      byteArray0[6] = (byte)85;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("BUFFERED_IMAGE_FACTORY", byteArray0);
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
  public void test12()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)79;
      byteArray0[1] = (byte)2;
      byteArray0[2] = (byte) (-98);
      byteArray0[3] = (byte) (-80);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "VERBOSE");
      byteArray0[4] = (byte)25;
      byteArray0[5] = (byte)5;
      try { 
        bmpImageParser0.dumpImageFile(byteArray0);
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
      ByteSource byteSource0 = null;
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("Qi", (Object) null);
      try { 
        bmpImageParser0.getImageSize((ByteSource) null, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: Qi
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
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
  public void test15()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      BmpImageParser bmpImageParser0 = new BmpImageParser();
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
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[19];
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
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
      byte[] byteArray0 = new byte[1];
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("1]yJ9M\u0002daa ", (Object) null);
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      ByteSourceArray byteSourceArray0 = new ByteSourceArray((String) null, byteArray0);
      bmpImageParser0.getMetadata((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
      BmpImageParser bmpImageParser1 = new BmpImageParser();
      try { 
        bmpImageParser1.writeImage((BufferedImage) null, (OutputStream) null, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: 1]yJ9M\u0002daa 
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }
}
