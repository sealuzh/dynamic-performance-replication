/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 00:16:58 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DebugGraphics;
import org.apache.commons.imaging.common.BinaryOutputStream;
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
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffOutputSet0.setGPSInDegrees((-1L), 0.0);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addGPSDirectory();
      tiffOutputSet0.setGPSInDegrees((-3710.36), (-3710.36));
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BufferedImage bufferedImage0 = new BufferedImage(2, 3, 2);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      MockFile mockFile0 = new MockFile("TOMZ)I|F,Hc,N%%");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
      assertEquals(196L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Jp[5!:HFL(l+'HId", false);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockFileOutputStream0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, 0L);
      assertEquals(8, binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[7];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      PrintStream printStream0 = DebugGraphics.logStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(printStream0);
      binaryOutputStream0.setDebug(true);
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, (-1862L));
      assertTrue(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy((ByteOrder) null);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, 8L);
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
      byte[] byteArray0 = new byte[4];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("SubfileType");
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0);
      binaryOutputStream0.write(byteArray0, (int) (byte)6, (-753));
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0, 2);
      assertEquals((-745), binaryOutputStream0.getByteCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy((ByteOrder) null);
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
  public void test08()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(324);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(byteArrayOutputStream0, tiffOutputSet0.byteOrder);
      binaryOutputStream0.setDebug(true);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
      assertEquals("II*\u0000\b\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("PIXEL_DENSITY");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(objectOutputStream0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
      assertFalse(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[4];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("SubfileType");
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0);
      binaryOutputStream0.write(byteArray0, (int) (byte)6, (-753));
      tiffImageWriterLossless0.writeImageFileHeader(binaryOutputStream0);
      assertFalse(binaryOutputStream0.getDebug());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BufferedImage bufferedImage0 = new BufferedImage(321, 1054, 3);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, pipedOutputStream0, (Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[7];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      PrintStream printStream0 = DebugGraphics.logStream();
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.write(printStream0, (TiffOutputSet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength(324);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = TiffImageWriterBase.imageDataPaddingLength((-922));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImageFileHeader((BinaryOutputStream) null, 1750L);
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
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream((OutputStream) null, byteOrder0);
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
  public void test18()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
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
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.validateDirectories((TiffOutputSet) null);
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
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      BufferedImage bufferedImage0 = new BufferedImage(2, 2, 2);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Short short0 = new Short((short) (-260));
      hashMap0.put("COMPRESSION", short0);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter (Only CCITT 1D/Group 3/Group 4, LZW, Packbits and uncompressed supported).
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BufferedImage bufferedImage0 = new BufferedImage(9, 9, 9);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Short short0 = new Short((short)2);
      hashMap0.put("COMPRESSION", short0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(324);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(byteArrayOutputStream0);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BufferedImage bufferedImage0 = new BufferedImage(324, 2, 2);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("oy,K,;P&Xr+rz_0S", bufferedImage0);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, binaryOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: oy,K,;P&Xr+rz_0S
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BufferedImage bufferedImage0 = new BufferedImage(9, 9, 9);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("PARAM_KEY_LZW_COMPRESSION_BLOCK_SIZE", tiffImageWriterLossy0);
      Short short0 = new Short((short)2);
      hashMap0.put("COMPRESSION", short0);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression block-size parameter: 2
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream((OutputStream) null);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BufferedImage bufferedImage0 = new BufferedImage(1088, 1088, 2);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("COMPRESSION", binaryOutputStream0);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter, must be numeric: org.apache.commons.imaging.common.BinaryOutputStream@2ee60b5c
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream((OutputStream) null);
      BufferedImage bufferedImage0 = new BufferedImage(2, 2, 2);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("COMPRESSION", (Object) null);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, binaryOutputStream0, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      BufferedImage bufferedImage0 = new BufferedImage(2, 2, 2);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Short short0 = new Short((short)1);
      hashMap0.put("COMPRESSION", short0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BufferedImage bufferedImage0 = new BufferedImage(1088, 1088, 2);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("XMP_XML", (Object) null);
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.putIfAbsent("EXIF", tiffImageWriterLossy0);
      PrintStream printStream0 = DebugGraphics.logStream();
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, printStream0, hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy cannot be cast to org.apache.commons.imaging.formats.tiff.write.TiffOutputSet
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      BufferedImage bufferedImage0 = new BufferedImage(1088, 1088, 2);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("FORMAT", "COMPRESSION");
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[4];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      ByteOrder byteOrder0 = charBuffer0.order();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      TiffOutputDirectory tiffOutputDirectory0 = new TiffOutputDirectory(423, byteOrder0);
      tiffOutputSet0.addDirectory(tiffOutputDirectory0);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
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
  public void test31()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.setGPSInDegrees((-3710.36), (-3710.36));
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotSame(tiffOutputSummary1, tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addGPSDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(tiffOutputSet0.byteOrder);
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
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase");
      ByteOrder byteOrder0 = charBuffer0.order();
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

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotSame(tiffOutputSummary1, tiffOutputSummary0);
  }
}
