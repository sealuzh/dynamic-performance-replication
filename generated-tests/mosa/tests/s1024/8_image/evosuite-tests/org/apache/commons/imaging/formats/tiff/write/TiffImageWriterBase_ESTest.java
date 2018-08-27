/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 15:10:48 GMT 2018
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.nio.ByteOrder;
import java.util.HashMap;
import javax.swing.DebugGraphics;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputField;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffImageWriterBase_ESTest extends TiffImageWriterBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("0000001110110");
      ImageBuilder imageBuilder0 = new ImageBuilder(57, 57, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
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
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      PrintStream printStream0 = DebugGraphics.logStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(printStream0, byteOrder0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, (-1L));
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.getOrCreateGPSDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotSame(tiffOutputSummary1, tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addExifDirectory();
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
  public void test06()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      tiffOutputSet0.setGPSInDegrees((-4), (-1L));
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotSame(tiffOutputSummary1, tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ImageBuilder imageBuilder0 = new ImageBuilder(5, 5, false);
      BufferedImage bufferedImage0 = new BufferedImage(5, 5, 5);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      MockFile mockFile0 = new MockFile("~", "~");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("~", false);
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      hashMap0.put("~", mockThaiBuddhistDate0);
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((byte[]) null);
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: ~
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      ImageBuilder imageBuilder0 = new ImageBuilder(5, 5, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      MockFile mockFile0 = new MockFile("~");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("~", true);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
      assertEquals(1, bufferedImage0.getNumYTiles());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      ImageBuilder imageBuilder0 = new ImageBuilder(258, 258, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("COMPRESSION", imageBuilder0);
      MockFile mockFile0 = new MockFile("COMPRESSION", "COMPRESSION");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("COMPRESSION", true);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter, must be numeric: org.apache.commons.imaging.common.ImageBuilder@2
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.getRootDirectory();
      ImageBuilder imageBuilder0 = new ImageBuilder(5, 5, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("EXIF", tiffOutputSet0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("EXIF");
      MockFileOutputStream mockFileOutputStream1 = new MockFileOutputStream("EXIF", false);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
      assertEquals(0, bufferedImage0.getTileGridXOffset());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addRootDirectory();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = new Object();
      hashMap0.put("FORMAT", object0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("FORMAT", false);
      MockFileOutputStream mockFileOutputStream1 = new MockFileOutputStream("EXIF", false);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, mockFileOutputStream0, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      ImageBuilder imageBuilder0 = new ImageBuilder(5, 5, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("EXIF", tiffOutputSet0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("EXIF", true);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
      assertEquals(0, bufferedImage0.getMinTileY());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      ImageBuilder imageBuilder0 = new ImageBuilder(96, 96, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Float float0 = new Float(73.86630355080838);
      hashMap0.put("COMPRESSION", float0);
      MockFile mockFile0 = new MockFile("COMPRESSION", "COMPRESSION");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("COMPRESSION");
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter (Only CCITT 1D/Group 3/Group 4, LZW, Packbits and uncompressed supported).
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      ImageBuilder imageBuilder0 = new ImageBuilder(4, 4, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Byte byte0 = new Byte((byte)1);
      Float float0 = new Float((double) 4);
      tiffOutputSet0.findField(77);
      hashMap0.put("COMPRESSION", (Object) null);
      MockFile mockFile0 = new MockFile("COMPRESSION");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("COMPRESSION");
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
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
  public void test15()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      ImageBuilder imageBuilder0 = new ImageBuilder(4, 4, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      Byte byte0 = new Byte((byte) (-87));
      Float float0 = new Float(468.5);
      Long long0 = new Long(4);
      Long.compareUnsigned((byte) (-87), 4);
      hashMap0.put("COMPRESSION", long0);
      MockFile mockFile0 = new MockFile("");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("FORMAT");
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, pipedOutputStream0, hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      Float float0 = new Float(0.0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      hashMap0.put("XMP_XML", mockHijrahDate0);
      MockFile mockFile0 = new MockFile("org.apache.commons.imaging.formats.tiff.constants.OceScanjobTagConstants", "org.apache.commons.imaging.formats.tiff.constants.OceScanjobTagConstants");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("XMP_XML");
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      ImageBuilder imageBuilder0 = new ImageBuilder(2, 2, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, mockPrintStream0, hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }
}