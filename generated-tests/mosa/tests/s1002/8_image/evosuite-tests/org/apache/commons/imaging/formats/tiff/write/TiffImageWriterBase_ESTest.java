/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:18:05 GMT 2018
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.nio.ByteOrder;
import java.util.Hashtable;
import javax.swing.text.AttributeSet;
import javax.swing.text.StyleConstants;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffImageWriterBase_ESTest extends TiffImageWriterBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.setGPSInDegrees((-309.975365450259), (-309.975365450259));
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertFalse(tiffOutputSummary1.equals((Object)tiffOutputSummary0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.getOrCreateGPSDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertFalse(tiffOutputSummary1.equals((Object)tiffOutputSummary0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      try { 
        tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No directories.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImageFileHeader((BinaryOutputStream) null, 1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BufferedImage bufferedImage0 = new BufferedImage(7, 7, 7);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashtable0);
      assertEquals(208, byteArrayOutputStream0.size());
      assertEquals("II*\u0000\b\u0000\u0000\u0000\f\u0000\u0000\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0001\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0002\u0001\u0003\u0000\u0003\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0003\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0006\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0011\u0001\u0004\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0015\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0016\u0001\u0004\u0000\u0001\u0000\u0000\u0000|\u0001\u0000\u0000\u0017\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0016\u0000\u0000\u0000\u001A\u0001\u0005\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u001B\u0001\u0005\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000(\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\b\u0000\b\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000 P8$\u0016\r\u0007\uFFFDBaP\uFFFDd6\u001D\u000F\uFFFDB\uFFFD \u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(699, 699, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("X{oXCD4m\"#c@84", true);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashtable0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("PARAM_KEY_LZW_COMPRESSION_BLOCK_SIZE", "PARAM_KEY_LZW_COMPRESSION_BLOCK_SIZE");
      BufferedImage bufferedImage0 = new BufferedImage(7, 7, 7);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: PARAM_KEY_LZW_COMPRESSION_BLOCK_SIZE
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addGPSDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      try { 
        tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing root directory.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffOutputDirectory tiffOutputDirectory0 = new TiffOutputDirectory(700, tiffOutputSet0.byteOrder);
      tiffOutputSet0.setGPSInDegrees(700, 700);
      tiffOutputSet0.addDirectory(tiffOutputDirectory0);
      try { 
        tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing directory: 1.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      byteArrayOutputStream0.write(648);
      hashtable0.put("XMP_XML", byteArrayOutputStream0);
      BufferedImage bufferedImage0 = new BufferedImage(7, 7, 7);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashtable0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.ByteArrayOutputStream cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BufferedImage bufferedImage0 = new BufferedImage(7, 7, 7);
      Float float0 = new Float((double) 7);
      hashtable0.put("COMPRESSION", float0);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter (Only CCITT 1D/Group 3/Group 4, LZW, Packbits and uncompressed supported).
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BufferedImage bufferedImage0 = new BufferedImage(7, 18249, 7);
      hashtable0.put("COMPRESSION", "COMPRESSION");
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter, must be numeric: COMPRESSION
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffOutputDirectory tiffOutputDirectory0 = new TiffOutputDirectory((-1170), byteOrder0);
      tiffOutputSet0.addDirectory(tiffOutputDirectory0);
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      try { 
        tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown directory: -1170
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put("PARAM_KEY_LZW_COMPRESSION_BLOCK_SIZE", "PARAM_KEY_LZW_COMPRESSION_BLOCK_SIZE");
      BufferedImage bufferedImage0 = new BufferedImage(7, 7, 7);
      Float float0 = new Float((double) 7);
      hashtable0.put("COMPRESSION", float0);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression block-size parameter: 7.0
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BufferedImage bufferedImage0 = new BufferedImage(7, 7, 7);
      StyleConstants styleConstants0 = (StyleConstants)AttributeSet.ResolveAttribute;
      ByteOrder.nativeOrder();
      Float float0 = new Float((double) 7);
      hashtable0.put("FORMAT", float0);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashtable0);
      assertEquals("II*\u0000\b\u0000\u0000\u0000\f\u0000\u0000\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0001\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0002\u0001\u0003\u0000\u0003\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0003\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0006\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0011\u0001\u0004\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0015\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0016\u0001\u0004\u0000\u0001\u0000\u0000\u0000|\u0001\u0000\u0000\u0017\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0016\u0000\u0000\u0000\u001A\u0001\u0005\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u001B\u0001\u0005\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000(\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\b\u0000\b\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000 P8$\u0016\r\u0007\uFFFDBaP\uFFFDd6\u001D\u000F\uFFFDB\uFFFD \u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(208, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BufferedImage bufferedImage0 = new BufferedImage(4, 4, 4);
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      Float float0 = new Float((double) 4);
      hashtable0.put("COMPRESSION", float0);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashtable0);
      assertEquals("II*\u0000\b\u0000\u0000\u0000\f\u0000\u0000\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0001\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0002\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0003\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0006\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0011\u0001\u0004\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0015\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0016\u0001\u0004\u0000\u0001\u0000\u0000\u0000\uFFFD>\u0000\u0000\u0017\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u001A\u0001\u0005\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u001B\u0001\u0005\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000(\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000&\uFFFD\uFFFD\u0001\u0000\u0010\u0000\u0000", byteArrayOutputStream0.toString());
      assertEquals(184, byteArrayOutputStream0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BufferedImage bufferedImage0 = new BufferedImage(7, 7, 7);
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      Float float0 = new Float(0.71414);
      hashtable0.put("XMP_XML", "COMPESSwIN");
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashtable0);
      assertEquals(232, byteArrayOutputStream0.size());
      assertEquals("II*\u0000\b\u0000\u0000\u0000\r\u0000\u0000\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0001\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0002\u0001\u0003\u0000\u0003\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0003\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0006\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0011\u0001\u0004\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0015\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0016\u0001\u0004\u0000\u0001\u0000\u0000\u0000|\u0001\u0000\u0000\u0017\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0016\u0000\u0000\u0000\u001A\u0001\u0005\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u001B\u0001\u0005\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000(\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\uFFFD\u0002\u0001\u0000\n\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\b\u0000\b\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000COMPESSwIN\u0000\u0000\uFFFD\u0000 P8$\u0016\r\u0007\uFFFDBaP\uFFFDd6\u001D\u000F\uFFFDB\uFFFD \u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      Float float0 = new Float((double) 7);
      hashtable0.put("EXIF", byteArrayOutputStream0);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, byteArrayOutputStream0, hashtable0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.ByteArrayOutputStream cannot be cast to org.apache.commons.imaging.formats.tiff.write.TiffOutputSet
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BufferedImage bufferedImage0 = new BufferedImage(4, 4, 4);
      ByteOrder.nativeOrder();
      Float float0 = new Float(1.0F);
      hashtable0.put("COMPRESSION", float0);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      tiffImageWriterLossy0.writeImage(bufferedImage0, byteArrayOutputStream0, hashtable0);
      assertEquals(232, byteArrayOutputStream0.size());
      assertEquals("II*\u0000\b\u0000\u0000\u0000\f\u0000\u0000\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0001\u0001\u0004\u0000\u0001\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0002\u0001\u0003\u0000\u0003\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0003\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0006\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0011\u0001\u0004\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0015\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0016\u0001\u0004\u0000\u0001\u0000\u0000\u0000\uFFFD\u0002\u0000\u0000\u0017\u0001\u0004\u0000\u0001\u0000\u0000\u00000\u0000\u0000\u0000\u001A\u0001\u0005\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u001B\u0001\u0005\u0000\u0001\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000(\u0001\u0003\u0000\u0001\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\b\u0000\b\u0000\b\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000H\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }
}