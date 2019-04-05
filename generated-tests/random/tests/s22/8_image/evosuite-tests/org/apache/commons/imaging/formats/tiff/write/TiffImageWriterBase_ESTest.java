/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 07:19:44 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Locale;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffImageWriterBase_ESTest extends TiffImageWriterBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(2030, 255, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      MockPrintStream mockPrintStream0 = new MockPrintStream("T^");
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      File file0 = MockFile.createTempFile("a!#'~Np", "a!#'~Np");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffOutputSet0.addGPSDirectory();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockFileOutputStream0);
      tiffImageWriterLossy0.write(filterOutputStream0, tiffOutputSet0);
      assertEquals(76L, file0.length());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(bufferedOutputStream0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0, byteOrder0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
      assertFalse(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      File file0 = MockFile.createTempFile("I5!#'~Np", "I5!#'~Np");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      try { 
        tiffImageWriterLossy0.write(mockFileOutputStream0, tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No directories.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength((-1542));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      try { 
        tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No directories.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      MockFile mockFile0 = new MockFile("", "SO");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0, byteOrder0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, 0L);
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder((byte)77, (byte)50, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put(") appears twice in directory.", bufferedImage0);
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: ) appears twice in directory.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      ImageBuilder imageBuilder0 = new ImageBuilder(27, 50781, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Locale locale0 = new Locale("=D?LgUsp6_Nn2J4ye_", "EXIF", "EXIF");
      hashMap0.put("COMPRESSION", locale0);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter, must be numeric: =d?lgusp6_nn2j4ye__EXIF_EXIF
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder((byte)77, (byte)50, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("EXIF", (Object) null);
      // Undeclared exception!
      tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder(48, 61, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Missing root directory.");
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("FORMAT", (Object) null);
      // Undeclared exception!
      tiffImageWriterLossless0.writeImage(bufferedImage0, bufferedOutputStream0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      File file0 = MockFile.createTempFile("a!#'~Np", "a!#'~Np");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.getOrCreateRootDirectory();
      tiffOutputSet0.addGPSDirectory();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockFileOutputStream0);
      tiffImageWriterLossy0.write(filterOutputStream0, tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      File file0 = MockFile.createTempFile("a!#'~Np", "a!#'~Np");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addGPSDirectory();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockFileOutputStream0);
      try { 
        tiffImageWriterLossy0.write(filterOutputStream0, tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing root directory.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      File file0 = MockFile.createTempFile("a!#'~Np", "a!#'~Np");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockFileOutputStream0);
      tiffImageWriterLossy0.write(filterOutputStream0, tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BufferedImage bufferedImage0 = new BufferedImage(3, 3, 3);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(bufferedOutputStream0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
      assertEquals(0.5F, bufferedImage0.getAccelerationPriority(), 0.01F);
  }
}
