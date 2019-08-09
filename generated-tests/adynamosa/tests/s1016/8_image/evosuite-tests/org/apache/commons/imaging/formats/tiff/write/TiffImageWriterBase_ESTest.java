/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 00:26:57 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.util.HashMap;
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
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFile mockFile0 = new MockFile("cgu|", "n\"oe5yA]");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffOutputSet0.setGPSInDegrees((byte) (-73), (byte) (-73));
      tiffImageWriterLossy0.write(mockFileOutputStream0, tiffOutputSet0);
      assertEquals(184L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      PrintStream printStream0 = DebugGraphics.logStream();
      tiffOutputSet0.addGPSDirectory();
      tiffOutputSet0.setGPSInDegrees((byte)41, (byte)0);
      tiffImageWriterLossy0.write(printStream0, tiffOutputSet0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      PrintStream printStream0 = DebugGraphics.logStream();
      ImageBuilder imageBuilder0 = new ImageBuilder(13, 13, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>((byte)41, (byte)41);
      tiffImageWriterLossy0.writeImage(bufferedImage0, printStream0, hashMap0);
      assertEquals(13, bufferedImage0.getTileWidth());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(3);
      ByteOrder byteOrder0 = charBuffer0.order();
      byte[] byteArray0 = new byte[6];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)91);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(byteArrayOutputStream0);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, (-1216L));
      assertEquals("II\u0000*\uFFFD\uFFFD\uFFFD@", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[5];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      File file0 = MockFile.createTempFile("XMP_XML", "sh:?Ly%_T]CT*:");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0);
      binaryOutputStream0.setDebug(true);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, 3L);
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream((OutputStream) null, tiffOutputSet0.byteOrder);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("More than one GPS directory offset field.");
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0, byteOrder0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, 0L);
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      byte[] byteArray0 = new byte[5];
      MockPrintStream mockPrintStream0 = new MockPrintStream("TiffOutputSet {\nbyteOrder: LITTLE_ENDIAN\n\tdirectory 0: Root (0)\n\t\tfield 0: [TagInfo. tag: 34665 (0x8769, name: ExifOffset]\n\t\tfield 0: [TagInfo. tag: 34853 (0x8825, name: GPSInfo]\n\tdirectory 1: Exif (-2)\n\tdirectory 2: Gps (-3)\n\t\tfield 2: [TagInfo. tag: 0 (0x0, name: GPSVersionID]\n\t\tfield 2: [TagInfo. tag: 3 (0x3, name: GPSLongitudeRef]\n\t\tfield 2: [TagInfo. tag: 1 (0x1, name: GPSLatitudeRef]\n\t\tfield 2: [TagInfo. tag: 4 (0x4, name: GPSLongitude]\n\t\tfield 2: [TagInfo. tag: 2 (0x2, name: GPSLatitude]\n\tdirectory 3: Interoperability (-4)\n}\n");
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0, tiffOutputSet0.byteOrder);
      binaryOutputStream0.write(byteArray0, (int) (byte) (-73), (int) (byte) (-73));
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, 0L);
      assertEquals((-65), binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      byte[] byteArray0 = new byte[8];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(tiffOutputSet0.byteOrder, byteArray0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImageFileHeader((BinaryOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream((OutputStream) null);
      binaryOutputStream0.setDebug(true);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockPrintStream mockPrintStream0 = new MockPrintStream("TiffOutputSet {\nbyteOrder: LITTLE_ENDIAN\n\tdirectory 0: Root (0)\n\t\tfield 0: [TagInfo. tag: 34665 (0x8769, name: ExifOffset]\n\t\tfield 0: [TagInfo. tag: 34853 (0x8825, name: GPSInfo]\n\tdirectory 1: Exif (-2)\n\tdirectory 2: Gps (-3)\n\t\tfield 2: [TagInfo. tag: 0 (0x0, name: GPSVersionID]\n\t\tfield 2: [TagInfo. tag: 3 (0x3, name: GPSLongitudeRef]\n\t\tfield 2: [TagInfo. tag: 1 (0x1, name: GPSLatitudeRef]\n\t\tfield 2: [TagInfo. tag: 4 (0x4, name: GPSLongitude]\n\t\tfield 2: [TagInfo. tag: 2 (0x2, name: GPSLatitude]\n\tdirectory 3: Interoperability (-4)\n}\n");
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0, tiffOutputSet0.byteOrder);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
      assertFalse(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[4];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      File file0 = MockFile.createTempFile("XMP_XML", "sh:?Ly%_T]CT*:");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0);
      binaryOutputStream0.write(byteArray0, 42033, (int) (byte) (-12));
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0);
      assertFalse(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      PrintStream printStream0 = DebugGraphics.logStream();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, printStream0, (Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PrintStream printStream0 = DebugGraphics.logStream();
      byte[] byteArray0 = new byte[7];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder(13, 13, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      bufferedImage0.coerceData(true);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, printStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid TIFF byte order 0
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(1);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength((-4681));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImageFileHeader((BinaryOutputStream) null, 257L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.setGPSInDegrees(1632.98435605221, 1497.7472);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.write((OutputStream) null, tiffOutputSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[0];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
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
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder((byte)69, (byte)127, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      ImageBuilder imageBuilder0 = new ImageBuilder((byte)96, (byte)127, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("y@HvkX!(", imageBuilder0);
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: y@HvkX!(
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("XMP_XML", (Object) null);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, (OutputStream) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("FORMAT", "FORMAT");
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, (OutputStream) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      TiffOutputDirectory tiffOutputDirectory0 = new TiffOutputDirectory(96, tiffOutputSet0.byteOrder);
      tiffOutputSet0.addDirectory(tiffOutputDirectory0);
      try { 
        tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing directory: 0.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      PrintStream printStream0 = DebugGraphics.logStream();
      tiffOutputSet0.setGPSInDegrees((byte)41, (byte)0);
      tiffImageWriterLossy0.write(printStream0, tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      PrintStream printStream0 = DebugGraphics.logStream();
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffImageWriterLossy0.write(printStream0, tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      PrintStream printStream0 = DebugGraphics.logStream();
      tiffOutputSet0.addGPSDirectory();
      try { 
        tiffImageWriterLossy0.write(printStream0, tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing root directory.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(3);
      ByteOrder byteOrder0 = charBuffer0.order();
      byte[] byteArray0 = new byte[6];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
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
}