/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 18:40:03 GMT 2018
 */

package org.apache.commons.imaging.formats.bmp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.DebugGraphics;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.formats.bmp.BmpImageParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.javax.swing.MockJFileChooser;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BmpImageParser_ESTest extends BmpImageParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[0];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("`WR", byteArray0);
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
  public void test01()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      bmpImageParser0.getName();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)4;
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
  public void test02()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)6;
      byteArray0[1] = (byte) (-11);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)40;
      byteArray0[4] = (byte)14;
      byteArray0[5] = (byte)10;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      ImageMetadata imageMetadata0 = bmpImageParser0.getMetadata((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
      assertNull(imageMetadata0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      bmpImageParser0.getDefaultExtension();
      String string0 = null;
      // Undeclared exception!
      try { 
        MockURL.URL((String) null, "BMP: Unknown Compression: ", 2190, "CLMBTOFiBo)UI`'k]! ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String string0 = "";
      MockFile mockFile0 = new MockFile("");
      MockFile mockFile1 = new MockFile(mockFile0, "");
      mockFile0.mkdir();
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile1);
      int int0 = 1918;
      mockFile1.toURI();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-29);
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      try { 
        bmpImageParser0.getImageSize(byteArray0);
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
  public void test06()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)83;
      bmpImageParser0.getICCProfileBytes(byteArray0);
      byteArray0[1] = (byte)31;
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
  public void test07()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      bmpImageParser0.getAcceptedTypes();
      bmpImageParser0.getAcceptedExtensions();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)24;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-83);
      byteArray0[3] = (byte)78;
      byteArray0[4] = (byte)0;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("", byteArray0);
      try { 
        byteSourceArray0.getBlock((int) (byte)78, (int) (byte)78);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not read block (block start: 78, block length: 78, data length: 5).
         //
         verifyException("org.apache.commons.imaging.common.bytesource.ByteSourceArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("");
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-115);
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)84;
      byteArray0[0] = (byte) (-1);
      byteArray0[4] = (byte)20;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)84;
      byteArray0[7] = (byte)20;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("", byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      hashtable0.put("[boolean[]: ", integer0);
      BmpImageParser bmpImageParser1 = new BmpImageParser();
      try { 
        bmpImageParser1.getImageSize((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: [boolean[]: 
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)60;
      byteArray0[1] = (byte)54;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)78;
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte)57;
      byteArray0[7] = (byte) (-116);
      byteArray0[8] = (byte)73;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("U?", byteArray0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String string0 = bmpImageParser0.getXmpXml(byteSourceArray0, hashMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[20];
      byteArray0[0] = (byte)81;
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        bmpImageParser0.dumpImageFile(byteArray0);
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
      byte[] byteArray0 = new byte[20];
      byteArray0[0] = (byte)81;
      MockFile mockFile0 = new MockFile("sL,H7v`jHJ");
      mockFile0.mkdirs();
      bmpImageParser0.getImageSize((File) mockFile0);
      byteArray0[1] = (byte)52;
      byteArray0[2] = (byte) (-116);
      byteArray0[3] = (byte)95;
      byteArray0[4] = (byte) (-99);
      byteArray0[5] = (byte)23;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)0;
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
  public void test12()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      Panel panel0 = new Panel();
      hashtable0.put("BMP Image Data", panel0);
      try { 
        bmpImageParser0.getImageInfo((ByteSource) null, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: BMP Image Data
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      MockFile mockFile0 = new MockFile("ColorSpaceType");
      File file0 = MockFile.createTempFile("`WR", "", (File) mockFile0);
      MockFile mockFile1 = new MockFile(file0, "7z}_/dv 8e2rK/v");
      bmpImageParser0.getBufferedImage((File) mockFile1, (Map<String, Object>) hashtable0);
      PrintStream printStream0 = DebugGraphics.logStream();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      hashtable0.put("7z}_/dv 8e2rK/v", mockHijrahDate0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(printStream0, true);
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, printStream0, hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: 7z}_/dv 8e2rK/v
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      MockJFileChooser mockJFileChooser0 = new MockJFileChooser();
      hashMap0.put((String) null, mockJFileChooser0);
      try { 
        bmpImageParser0.getBufferedImage(byteArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: null
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      bmpImageParser0.writeImage(bufferedImage0, byteArrayOutputStream0, hashMap0);
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
}
