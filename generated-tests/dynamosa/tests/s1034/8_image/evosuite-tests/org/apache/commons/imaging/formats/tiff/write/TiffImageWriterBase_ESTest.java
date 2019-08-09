/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 07:31:50 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.DebugGraphics;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
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
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addGPSDirectory();
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((byte[]) null);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      PrintStream printStream0 = DebugGraphics.logStream();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(printStream0, tiffOutputSet0.byteOrder);
      binaryOutputStream0.setDebug(true);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, 0L);
      assertTrue(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((ByteOrder) null, byteArray0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      MockFile mockFile0 = new MockFile("");
      File file0 = MockFile.createTempFile("No directories.", "jC_KdWkhdK", (File) mockFile0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, true);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0, tiffOutputSet0.byteOrder);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, 3171L);
      assertFalse(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, (byte[]) null);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, true);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0);
      assertFalse(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((ByteOrder) null, byteArray0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImage((BufferedImage) null, (OutputStream) null, (Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder(302, 1408, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      MockFile mockFile0 = new MockFile("Tiff: unknown/unsupported compression: ");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      // Undeclared exception!
      tiffImageWriterLossless0.writeImage(bufferedImage0, mockFileOutputStream0, hashtable0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      ImageBuilder imageBuilder0 = new ImageBuilder(268, 1587, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      bufferedImage0.coerceData(true);
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(tiffOutputSet0.byteOrder, (byte[]) null);
      // Undeclared exception!
      tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      BufferedImage bufferedImage0 = new BufferedImage(4, 4, 4);
      bufferedImage0.setAccelerationPriority(0.0F);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, byteArrayOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid TIFF byte order 0
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      try { 
        tiffImageWriterLossy0.write(pipedOutputStream0, tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No directories.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(2185);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength((-2));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy((ByteOrder) null);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImageFileHeader((BinaryOutputStream) null, 163L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.getOrCreateGPSDirectory();
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((byte[]) null);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(pipedOutputStream0, tiffOutputSummary0.byteOrder);
      try { 
        tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, (-3));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImageFileHeader((BinaryOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      byte[] byteArray0 = new byte[0];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      try { 
        tiffImageWriterLossless0.write((OutputStream) null, tiffOutputSet0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid TIFF File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(tiffOutputSet0.byteOrder, (byte[]) null);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.validateDirectories((TiffOutputSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, (byte[]) null);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(pipedOutputStream0);
      try { 
        tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      BufferedImage bufferedImage0 = new BufferedImage(4, 4, 4);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, byteArrayOutputStream0, hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid TIFF File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      BufferedImage bufferedImage0 = new BufferedImage(4, 4, 4);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("No directories.", "No directories.");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, byteArrayOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: No directories.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(12, 927, 12);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("COMPRESSION", "COMPRESSION");
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((byte[]) null);
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter, must be numeric: COMPRESSION
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ImageBuilder imageBuilder0 = new ImageBuilder(15, 15, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      Double double0 = Double.valueOf(0.0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("COMPRESSION", double0);
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((byte[]) null);
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter (Only CCITT 1D/Group 3/Group 4, LZW, Packbits and uncompressed supported).
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ImageBuilder imageBuilder0 = new ImageBuilder(15, 15, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("COMPRESSION", (Object) null);
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((byte[]) null);
      // Undeclared exception!
      tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      ImageBuilder imageBuilder0 = new ImageBuilder(38, 38, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("XMP_XML", (Object) null);
      byte[] byteArray0 = new byte[7];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(tiffOutputSet0.byteOrder, byteArray0);
      // Undeclared exception!
      tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      BufferedImage bufferedImage0 = new BufferedImage(4, 4, 4);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      hashMap0.put("EXIF", bufferedImage0);
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, byteArrayOutputStream0, hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.awt.image.BufferedImage cannot be cast to org.apache.commons.imaging.formats.tiff.write.TiffOutputSet
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      ImageBuilder imageBuilder0 = new ImageBuilder(38, 38, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("FORMAT", imageBuilder0);
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(tiffOutputSet0.byteOrder, (byte[]) null);
      // Undeclared exception!
      tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addRootDirectory();
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(tiffOutputSet0.byteOrder, (byte[]) null);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffOutputDirectory tiffOutputDirectory0 = new TiffOutputDirectory(16, tiffOutputSet0.byteOrder);
      tiffOutputSet0.addDirectory(tiffOutputDirectory0);
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(tiffOutputSet0.byteOrder, (byte[]) null);
      try { 
        tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing directory: 0.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.setGPSInDegrees((-1L), (-1L));
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((byte[]) null);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffOutputSet0.addGPSDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
      assertNotSame(tiffOutputSummary1, tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addGPSDirectory();
      try { 
        tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing root directory.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((byte[]) null);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.write((OutputStream) null, tiffOutputSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }
}