/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:55:50 GMT 2018
 */

package org.apache.commons.imaging.formats.bmp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.formats.bmp.BmpImageParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BmpImageParser_ESTest extends BmpImageParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
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
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      BmpImageParser bmpImageParser0 = new BmpImageParser();
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
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      BmpImageParser bmpImageParser0 = new BmpImageParser();
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
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BmpImageParser bmpImageParser0 = new BmpImageParser();
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
  public void test04()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      byte[] byteArray0 = bmpImageParser0.getICCProfileBytes((ByteSource) null, (Map<String, Object>) hashMap0);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BmpImageParser bmpImageParser0 = new BmpImageParser();
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
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      bmpImageParser0.getMetadata(byteArray0);
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      assertNull(byteSourceArray0.getFilename());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String[] stringArray0 = bmpImageParser0.getAcceptedExtensions();
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String string0 = bmpImageParser0.getDefaultExtension();
      assertEquals(".bmp", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[29];
      try { 
        bmpImageParser0.getImageSize(byteArray0);
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
      byte[] byteArray0 = new byte[1];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      hashtable0.put("", integer0);
      BmpImageParser bmpImageParser0 = new BmpImageParser();
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
  public void test12()  throws Throwable  {
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String string0 = bmpImageParser0.getXmpXml((ByteSource) null, hashtable0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      String string0 = bmpImageParser0.getName();
      assertEquals("Bmp-Custom", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      ImageFormat[] imageFormatArray0 = bmpImageParser0.getAcceptedTypes();
      assertNotNull(imageFormatArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("No App2 Segments Found.", bmpImageParser0);
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: No App2 Segments Found.
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      // Undeclared exception!
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, byteArrayOutputStream0, hashMap0);
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
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[8];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("PIXEL_DENSITY", byteArray0);
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: PIXEL_DENSITY
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("VERBOSE", "VERBOSE");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, byteArrayOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: VERBOSE
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      ByteSourceArray byteSourceArray0 = new ByteSourceArray((byte[]) null);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("VERBOSE", bmpImageParser0);
      BmpImageParser bmpImageParser1 = new BmpImageParser();
      // Undeclared exception!
      try { 
        bmpImageParser1.getImageInfo((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      // Undeclared exception!
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, byteArrayOutputStream0, (Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.palette.PaletteFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[18];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      JToolBar.Separator jToolBar_Separator0 = new JToolBar.Separator();
      hashtable0.put("VERBOSE", jToolBar_Separator0);
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unsupported BMP file
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }
}
