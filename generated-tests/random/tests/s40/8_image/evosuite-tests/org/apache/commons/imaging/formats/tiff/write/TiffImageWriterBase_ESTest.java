/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 01:06:03 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;
import javax.swing.DebugGraphics;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.imaging.PixelDensity;
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
import sun.awt.SunHints;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffImageWriterBase_ESTest extends TiffImageWriterBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      ImageBuilder imageBuilder0 = new ImageBuilder(333, 333, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      MockFile mockFile0 = new MockFile("yo'~5");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockPrintStream0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((ByteOrder) null, byteArray0);
      File file0 = MockFile.createTempFile("m^wJaY", "m^wJaY");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(objectOutputStream0);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, 557L);
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[0];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      PrintStream printStream0 = DebugGraphics.logStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(printStream0, byteOrder0);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, (-340L));
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(2);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[5];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImageFileHeader((BinaryOutputStream) null, (-2267L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
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
  public void test06()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, (byte[]) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("l>,L4}-(mY+r9");
      BufferedImage bufferedImage0 = new BufferedImage(3, 3, 3);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, mockFileOutputStream0, hashtable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BufferedImage bufferedImage0 = new BufferedImage(3994, 3994, 5);
      MockFile mockFile0 = new MockFile("}tQmn=3`[`f(07~v");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(5);
      SunHints.Key sunHints_Key0 = (SunHints.Key)RenderingHints.KEY_FRACTIONALMETRICS;
      hashMap0.put(".w+5!GS=045fW&][?", sunHints_Key0);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, mockPrintStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: .w+5!GS=045fW&][?
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[0];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      PrintStream printStream0 = DebugGraphics.logStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(printStream0, byteOrder0);
      ImageBuilder imageBuilder0 = new ImageBuilder(127, 32773, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Vector<PixelDensity> vector0 = new Vector<PixelDensity>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, 43);
      hashMap0.put("COMPRESSION", defaultTableModel0);
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, binaryOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter, must be numeric: javax.swing.table.DefaultTableModel@1866e744
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFile mockFile0 = new MockFile("XMP_XML");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("XMP_XML", mockFile0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, mockPrintStream0, hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.io.MockFile cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      ByteOrder byteOrder0 = charBuffer0.order();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Float float0 = new Float(95.047F);
      hashMap0.put("EXIF", float0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, byteArrayOutputStream0, hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Float cannot be cast to org.apache.commons.imaging.formats.tiff.write.TiffOutputSet
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[6];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("FORMAT");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Double double0 = new Double(10000.0);
      hashMap0.put("FORMAT", double0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImage((BufferedImage) null, mockPrintStream0, hashMap0);
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
      byte[] byteArray0 = new byte[0];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless((ByteOrder) null, byteArray0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet((ByteOrder) null);
      tiffOutputSet0.addRootDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossless0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffOutputDirectory tiffOutputDirectory0 = new TiffOutputDirectory(50714, tiffOutputSet0.byteOrder);
      tiffOutputSet0.addDirectory(tiffOutputDirectory0);
      try { 
        tiffImageWriterLossy0.write((OutputStream) null, tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing directory: 0.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.addExifDirectory();
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
  public void test15()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.write((OutputStream) null, tiffOutputSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffOutputDirectory tiffOutputDirectory0 = new TiffOutputDirectory((-4285), tiffOutputSet0.byteOrder);
      tiffOutputSet0.addDirectory(tiffOutputDirectory0);
      try { 
        tiffImageWriterLossy0.write((OutputStream) null, tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown directory: -4285
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(34018);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(byteArrayOutputStream0, byteOrder0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.setGPSInDegrees((-2147.12118271), (-1494.8668));
      tiffImageWriterLossy0.write(binaryOutputStream0, tiffOutputSet0);
      tiffImageWriterLossy0.write(binaryOutputStream0, tiffOutputSet0);
      assertEquals(328, binaryOutputStream0.getByteCount());
      assertEquals("II*\u0000\b\u0000\u0000\u0000\u0002\u0000i\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000(\u0000\u0000\u0000%\uFFFD\u0004\u0000\u0001\u0000\u0000\u00000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0002\u0003\u0000\u0000\u0001\u0000\u0002\u0000\u0002\u0000\u0000\u0000S\u0000\u0000\u0000\u0002\u0000\u0005\u0000\u0003\u0000\u0000\u0000t\u0000\u0000\u0000\u0003\u0000\u0002\u0000\u0002\u0000\u0000\u0000W\u0000\u0000\u0000\u0004\u0000\u0005\u0000\u0003\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uFFFD\u0005\u0000\u0000\u0001\u0000\u0000\u00004\u0000\u0000\u0000\u0001\u0000\u0000\u0000\f\u0000\u0000\u0000\u0019\u0000\u0000\u0000c\b\u0000\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0001\u0000\u0000\u0000A\u0010\u0001\u0000\uFFFD\u0010\u0000\u0000II*\u0000\b\u0000\u0000\u0000\u0002\u0000i\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000(\u0000\u0000\u0000%\uFFFD\u0004\u0000\u0001\u0000\u0000\u00000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0001\u0000\u0004\u0000\u0000\u0000\u0002\u0003\u0000\u0000\u0001\u0000\u0002\u0000\u0002\u0000\u0000\u0000S\u0000\u0000\u0000\u0002\u0000\u0005\u0000\u0003\u0000\u0000\u0000t\u0000\u0000\u0000\u0003\u0000\u0002\u0000\u0002\u0000\u0000\u0000W\u0000\u0000\u0000\u0004\u0000\u0005\u0000\u0003\u0000\u0000\u0000\uFFFD\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\uFFFD\u0005\u0000\u0000\u0001\u0000\u0000\u00004\u0000\u0000\u0000\u0001\u0000\u0000\u0000\f\u0000\u0000\u0000\u0019\u0000\u0000\u0000c\b\u0000\u0000\u0001\u0000\u0000\u0000\u0007\u0000\u0000\u0000\u0001\u0000\u0000\u0000A\u0010\u0001\u0000\uFFFD\u0010\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
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
}
