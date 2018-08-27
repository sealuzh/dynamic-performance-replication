/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 09:53:21 GMT 2018
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Hashtable;
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
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffImageWriterBase_ESTest extends TiffImageWriterBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(3, 33405, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, (OutputStream) null, hashtable0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      assertNotNull(tiffOutputSet0);
      
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      assertNotNull(tiffImageWriterLossy0);
      
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
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(tiffImageWriterLossy0);
      
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
  public void test03()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      assertNotNull(tiffImageWriterLossy0);
      
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      assertNotNull(tiffOutputSet0);
      
      TiffOutputDirectory tiffOutputDirectory0 = tiffOutputSet0.getOrCreateExifDirectory();
      assertEquals((-2), tiffOutputDirectory0.type);
      assertEquals(6, tiffOutputDirectory0.getItemLength());
      assertNotNull(tiffOutputDirectory0);
      
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
      
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotSame(tiffOutputSummary1, tiffOutputSummary0);
      assertNotNull(tiffOutputSummary1);
      assertFalse(tiffOutputSummary1.equals((Object)tiffOutputSummary0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "%xca2[");
      assertFalse(boolean0);
      
      System.setCurrentTimeMillis((-4151L));
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      assertNotNull(tiffImageWriterLossy0);
      
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      assertNotNull(tiffOutputSet0);
      
      tiffOutputSet0.setGPSInDegrees((-4151L), (-1897.5525299934907));
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      assertNotNull(tiffImageWriterLossy0);
      
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(tiffOutputSet0);
      
      TiffOutputDirectory tiffOutputDirectory0 = tiffOutputSet0.getRootDirectory();
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNull(tiffOutputDirectory0);
      
      TiffOutputDirectory tiffOutputDirectory1 = tiffOutputSet0.addInteroperabilityDirectory();
      assertEquals((-4), tiffOutputDirectory1.type);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertEquals(6, tiffOutputDirectory1.getItemLength());
      assertNotNull(tiffOutputDirectory1);
      
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(tiffOutputSummary0);
      
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotSame(tiffOutputSummary1, tiffOutputSummary0);
      assertNotNull(tiffOutputSummary1);
      assertFalse(tiffOutputSummary1.equals((Object)tiffOutputSummary0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      assertNotNull(tiffImageWriterLossy0);
      
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(tiffOutputSet0);
      
      TiffOutputDirectory tiffOutputDirectory0 = tiffOutputSet0.getRootDirectory();
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNull(tiffOutputDirectory0);
      
      TiffOutputDirectory tiffOutputDirectory1 = tiffOutputSet0.getOrCreateGPSDirectory();
      assertEquals((-3), tiffOutputDirectory1.type);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertEquals(6, tiffOutputDirectory1.getItemLength());
      assertNotNull(tiffOutputDirectory1);
      
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(tiffOutputSummary0);
      
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotSame(tiffOutputSummary1, tiffOutputSummary0);
      assertNotNull(tiffOutputSummary1);
      assertFalse(tiffOutputSummary1.equals((Object)tiffOutputSummary0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      byte[] byteArray0 = new byte[3];
      ByteOrder byteOrder1 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder1.toString());
      assertNotSame(byteOrder1, byteOrder0);
      assertNotNull(byteOrder1);
      assertFalse(byteOrder1.equals((Object)byteOrder0));
      
      byteArray0[0] = (byte)5;
      byteArray0[1] = (byte)5;
      byteArray0[2] = (byte)5;
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      assertArrayEquals(new byte[] {(byte)5, (byte)5, (byte)5}, byteArray0);
      assertNotNull(tiffImageWriterLossless0);
      
      BufferedImage bufferedImage0 = new BufferedImage((byte)5, (byte)5, 4);
      assertEquals(5, bufferedImage0.getHeight());
      assertEquals(5, bufferedImage0.getWidth());
      assertEquals(1, bufferedImage0.getNumXTiles());
      assertEquals(5, bufferedImage0.getTileWidth());
      assertEquals(0, bufferedImage0.getMinY());
      assertEquals(5, bufferedImage0.getTileHeight());
      assertEquals(0, bufferedImage0.getMinTileY());
      assertEquals(4, bufferedImage0.getType());
      assertEquals(0, bufferedImage0.getMinTileX());
      assertEquals(0, bufferedImage0.getTileGridXOffset());
      assertEquals(1, bufferedImage0.getTransparency());
      assertEquals(1, bufferedImage0.getNumYTiles());
      assertEquals(0, bufferedImage0.getTileGridYOffset());
      assertEquals(0.5F, bufferedImage0.getAccelerationPriority(), 0.01F);
      assertTrue(bufferedImage0.hasTileWriters());
      assertEquals(0, bufferedImage0.getMinX());
      assertFalse(bufferedImage0.isAlphaPremultiplied());
      assertNotNull(bufferedImage0);
      
      PrintStream printStream0 = DebugGraphics.logStream();
      assertNotNull(printStream0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream(printStream0);
      assertNotNull(mockPrintStream0);
      
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      assertEquals(0, hashMap0.size());
      assertTrue(hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      TiffImageWriterLossless tiffImageWriterLossless1 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      assertArrayEquals(new byte[] {(byte)5, (byte)5, (byte)5}, byteArray0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(tiffImageWriterLossless1);
      assertFalse(byteOrder0.equals((Object)byteOrder1));
      assertFalse(tiffImageWriterLossless1.equals((Object)tiffImageWriterLossless0));
      
      try { 
        tiffImageWriterLossless1.writeImage(bufferedImage0, mockPrintStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid TIFF byte order 5
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(tiffImageWriterLossy0);
      
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      assertNotNull(tiffOutputSet0);
      
      TiffOutputDirectory tiffOutputDirectory0 = tiffOutputSet0.getOrCreateRootDirectory();
      assertEquals(0, tiffOutputDirectory0.type);
      assertEquals(6, tiffOutputDirectory0.getItemLength());
      assertNotNull(tiffOutputDirectory0);
      
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(tiffOutputSummary0);
      
      System.setCurrentTimeMillis(0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      assertNotNull(fileSystemHandling0);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)51;
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      assertArrayEquals(new byte[] {(byte)51}, byteArray0);
      assertNotNull(tiffImageWriterLossless0);
      
      BufferedImage bufferedImage0 = new BufferedImage((byte)51, (byte)73, 2);
      assertEquals(73, bufferedImage0.getHeight());
      assertEquals(0, bufferedImage0.getMinTileX());
      assertEquals(0, bufferedImage0.getMinTileY());
      assertEquals(1, bufferedImage0.getNumXTiles());
      assertEquals(0, bufferedImage0.getMinY());
      assertEquals(0, bufferedImage0.getMinX());
      assertFalse(bufferedImage0.isAlphaPremultiplied());
      assertEquals(73, bufferedImage0.getTileHeight());
      assertEquals(51, bufferedImage0.getWidth());
      assertEquals(0.5F, bufferedImage0.getAccelerationPriority(), 0.01F);
      assertTrue(bufferedImage0.hasTileWriters());
      assertEquals(51, bufferedImage0.getTileWidth());
      assertEquals(2, bufferedImage0.getType());
      assertEquals(0, bufferedImage0.getTileGridYOffset());
      assertEquals(0, bufferedImage0.getTileGridXOffset());
      assertEquals(3, bufferedImage0.getTransparency());
      assertEquals(1, bufferedImage0.getNumYTiles());
      assertNotNull(bufferedImage0);
      
      PrintStream printStream0 = DebugGraphics.logStream();
      assertNotNull(printStream0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      WritableRaster writableRaster0 = bufferedImage0.getAlphaRaster();
      assertEquals(73, bufferedImage0.getHeight());
      assertEquals(0, bufferedImage0.getMinTileX());
      assertEquals(0, bufferedImage0.getMinTileY());
      assertEquals(1, bufferedImage0.getNumXTiles());
      assertEquals(0, bufferedImage0.getMinY());
      assertEquals(0, bufferedImage0.getMinX());
      assertFalse(bufferedImage0.isAlphaPremultiplied());
      assertEquals(73, bufferedImage0.getTileHeight());
      assertEquals(51, bufferedImage0.getWidth());
      assertEquals(0.5F, bufferedImage0.getAccelerationPriority(), 0.01F);
      assertTrue(bufferedImage0.hasTileWriters());
      assertEquals(51, bufferedImage0.getTileWidth());
      assertEquals(2, bufferedImage0.getType());
      assertEquals(0, bufferedImage0.getTileGridYOffset());
      assertEquals(0, bufferedImage0.getTileGridXOffset());
      assertEquals(3, bufferedImage0.getTransparency());
      assertEquals(1, bufferedImage0.getNumYTiles());
      assertEquals(0, writableRaster0.getSampleModelTranslateY());
      assertEquals(1, writableRaster0.getNumDataElements());
      assertEquals(51, writableRaster0.getWidth());
      assertEquals(0, writableRaster0.getMinY());
      assertEquals(73, writableRaster0.getHeight());
      assertEquals(0, writableRaster0.getSampleModelTranslateX());
      assertEquals(0, writableRaster0.getMinX());
      assertEquals(3, writableRaster0.getTransferType());
      assertEquals(1, writableRaster0.getNumBands());
      assertNotNull(writableRaster0);
      
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      Object object1 = hashMap0.put("", (Object) null);
      assertFalse(hashMap0.isEmpty());
      assertEquals(1, hashMap0.size());
      assertNull(object1);
      
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, printStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(tiffImageWriterLossy0);
      
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(tiffOutputSet0);
      
      TiffOutputDirectory tiffOutputDirectory0 = tiffOutputSet0.getRootDirectory();
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNull(tiffOutputDirectory0);
      
      TiffOutputDirectory tiffOutputDirectory1 = tiffOutputSet0.addGPSDirectory();
      assertEquals((-3), tiffOutputDirectory1.type);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertEquals(6, tiffOutputDirectory1.getItemLength());
      assertNotNull(tiffOutputDirectory1);
      
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
  public void test11()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      byte byte0 = (byte)5;
      byte[] byteArray0 = new byte[3];
      boolean boolean0 = FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      assertFalse(boolean0);
      
      ByteOrder byteOrder1 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder1.toString());
      assertNotSame(byteOrder1, byteOrder0);
      assertNotNull(byteOrder1);
      assertFalse(byteOrder1.equals((Object)byteOrder0));
      
      byteArray0[0] = (byte)5;
      byteArray0[1] = (byte)5;
      byteArray0[2] = (byte)5;
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      assertArrayEquals(new byte[] {(byte)5, (byte)5, (byte)5}, byteArray0);
      assertNotNull(tiffImageWriterLossless0);
      
      BufferedImage bufferedImage0 = new BufferedImage((byte)5, (byte)5, 4);
      assertFalse(bufferedImage0.isAlphaPremultiplied());
      assertEquals(0, bufferedImage0.getMinTileY());
      assertEquals(0, bufferedImage0.getMinTileX());
      assertEquals(0, bufferedImage0.getTileGridYOffset());
      assertEquals(1, bufferedImage0.getTransparency());
      assertTrue(bufferedImage0.hasTileWriters());
      assertEquals(4, bufferedImage0.getType());
      assertEquals(5, bufferedImage0.getTileHeight());
      assertEquals(0, bufferedImage0.getTileGridXOffset());
      assertEquals(1, bufferedImage0.getNumXTiles());
      assertEquals(0.5F, bufferedImage0.getAccelerationPriority(), 0.01F);
      assertEquals(0, bufferedImage0.getMinY());
      assertEquals(0, bufferedImage0.getMinX());
      assertEquals(5, bufferedImage0.getWidth());
      assertEquals(1, bufferedImage0.getNumYTiles());
      assertEquals(5, bufferedImage0.getHeight());
      assertEquals(5, bufferedImage0.getTileWidth());
      assertNotNull(bufferedImage0);
      
      PrintStream printStream0 = DebugGraphics.logStream();
      assertNotNull(printStream0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream(printStream0);
      assertNotNull(mockPrintStream0);
      
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      assertEquals(0, hashMap0.size());
      assertTrue(hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      Object object0 = hashMap0.put("XMP_XML", byteArray0);
      assertArrayEquals(new byte[] {(byte)5, (byte)5, (byte)5}, byteArray0);
      assertEquals(1, hashMap0.size());
      assertFalse(hashMap0.isEmpty());
      assertNull(object0);
      
      TiffImageWriterLossless tiffImageWriterLossless1 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      assertArrayEquals(new byte[] {(byte)5, (byte)5, (byte)5}, byteArray0);
      assertEquals("BIG_ENDIAN", byteOrder0.toString());
      assertNotNull(tiffImageWriterLossless1);
      assertFalse(byteOrder0.equals((Object)byteOrder1));
      assertFalse(tiffImageWriterLossless1.equals((Object)tiffImageWriterLossless0));
      
      // Undeclared exception!
      try { 
        tiffImageWriterLossless1.writeImage(bufferedImage0, mockPrintStream0, hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [B cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      assertNotNull(tiffOutputSet0);
      
      byte[] byteArray0 = new byte[0];
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertNotNull(tiffImageWriterLossless0);
      
      BufferedImage bufferedImage0 = new BufferedImage(2, 2, 2);
      assertEquals(0, bufferedImage0.getMinTileX());
      assertEquals(0, bufferedImage0.getMinTileY());
      assertFalse(bufferedImage0.isAlphaPremultiplied());
      assertEquals(2, bufferedImage0.getTileWidth());
      assertEquals(0, bufferedImage0.getMinY());
      assertEquals(0, bufferedImage0.getMinX());
      assertEquals(2, bufferedImage0.getHeight());
      assertEquals(1, bufferedImage0.getNumXTiles());
      assertEquals(2, bufferedImage0.getType());
      assertEquals(0, bufferedImage0.getTileGridXOffset());
      assertEquals(1, bufferedImage0.getNumYTiles());
      assertEquals(0.5F, bufferedImage0.getAccelerationPriority(), 0.01F);
      assertEquals(2, bufferedImage0.getWidth());
      assertTrue(bufferedImage0.hasTileWriters());
      assertEquals(0, bufferedImage0.getTileGridYOffset());
      assertEquals(3, bufferedImage0.getTransparency());
      assertEquals(2, bufferedImage0.getTileHeight());
      assertNotNull(bufferedImage0);
      
      PrintStream printStream0 = DebugGraphics.logStream();
      assertNotNull(printStream0);
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      WritableRaster writableRaster0 = bufferedImage0.getAlphaRaster();
      assertEquals(0, bufferedImage0.getMinTileX());
      assertEquals(0, bufferedImage0.getMinTileY());
      assertFalse(bufferedImage0.isAlphaPremultiplied());
      assertEquals(2, bufferedImage0.getTileWidth());
      assertEquals(0, bufferedImage0.getMinY());
      assertEquals(0, bufferedImage0.getMinX());
      assertEquals(2, bufferedImage0.getHeight());
      assertEquals(1, bufferedImage0.getNumXTiles());
      assertEquals(2, bufferedImage0.getType());
      assertEquals(0, bufferedImage0.getTileGridXOffset());
      assertEquals(1, bufferedImage0.getNumYTiles());
      assertEquals(0.5F, bufferedImage0.getAccelerationPriority(), 0.01F);
      assertEquals(2, bufferedImage0.getWidth());
      assertTrue(bufferedImage0.hasTileWriters());
      assertEquals(0, bufferedImage0.getTileGridYOffset());
      assertEquals(3, bufferedImage0.getTransparency());
      assertEquals(2, bufferedImage0.getTileHeight());
      assertEquals(0, writableRaster0.getSampleModelTranslateY());
      assertEquals(2, writableRaster0.getHeight());
      assertEquals(1, writableRaster0.getNumBands());
      assertEquals(1, writableRaster0.getNumDataElements());
      assertEquals(0, writableRaster0.getSampleModelTranslateX());
      assertEquals(0, writableRaster0.getMinY());
      assertEquals(2, writableRaster0.getWidth());
      assertEquals(0, writableRaster0.getMinX());
      assertEquals(3, writableRaster0.getTransferType());
      assertNotNull(writableRaster0);
      
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      assertEquals(0, hashMap0.size());
      assertTrue(hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      Object object1 = hashMap0.putIfAbsent("FORMAT", "FORMAT");
      assertEquals(1, hashMap0.size());
      assertFalse(hashMap0.isEmpty());
      assertNull(object1);
      
      ByteOrder byteOrder1 = ByteOrder.LITTLE_ENDIAN;
      assertEquals("LITTLE_ENDIAN", byteOrder1.toString());
      assertSame(byteOrder1, byteOrder0);
      assertNotNull(byteOrder1);
      
      Object object2 = hashMap0.put("EXIF", printStream0);
      assertEquals(2, hashMap0.size());
      assertFalse(hashMap0.isEmpty());
      assertNull(object2);
      
      // Undeclared exception!
      try { 
        tiffImageWriterLossless0.writeImage(bufferedImage0, printStream0, hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.PrintStream cannot be cast to org.apache.commons.imaging.formats.tiff.write.TiffOutputSet
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      assertEquals("LITTLE_ENDIAN", byteOrder0.toString());
      assertNotNull(byteOrder0);
      
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      assertNotNull(tiffOutputSet0);
      
      TiffOutputDirectory tiffOutputDirectory0 = tiffOutputSet0.addRootDirectory();
      assertEquals(0, tiffOutputDirectory0.type);
      assertEquals(6, tiffOutputDirectory0.getItemLength());
      assertNotNull(tiffOutputDirectory0);
      
      byte[] byteArray0 = new byte[12];
      byteArray0[0] = (byte)5;
      tiffOutputSet0.removeField(0);
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteArray0);
      assertNotNull(tiffImageWriterLossless0);
      
      ByteOrder byteOrder1 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder1.toString());
      assertSame(byteOrder1, byteOrder0);
      assertNotNull(byteOrder1);
      
      ByteOrder byteOrder2 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder2.toString());
      assertSame(byteOrder2, byteOrder0);
      assertSame(byteOrder2, byteOrder1);
      assertNotNull(byteOrder2);
      
      ByteOrder byteOrder3 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder3.toString());
      assertSame(byteOrder3, byteOrder1);
      assertSame(byteOrder3, byteOrder0);
      assertSame(byteOrder3, byteOrder2);
      assertNotNull(byteOrder3);
      
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder2);
      assertEquals("LITTLE_ENDIAN", byteOrder2.toString());
      assertNotNull(tiffImageWriterLossy0);
      
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)5);
      assertEquals("", byteArrayOutputStream0.toString());
      assertEquals(0, byteArrayOutputStream0.size());
      assertNotNull(byteArrayOutputStream0);
      
      ByteOrder byteOrder4 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder4.toString());
      assertSame(byteOrder4, byteOrder3);
      assertSame(byteOrder4, byteOrder1);
      assertSame(byteOrder4, byteOrder2);
      assertSame(byteOrder4, byteOrder0);
      assertNotNull(byteOrder4);
      
      TiffOutputSet tiffOutputSet1 = new TiffOutputSet();
      assertNotNull(tiffOutputSet1);
      assertFalse(tiffOutputSet1.equals((Object)tiffOutputSet0));
      
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      assertNotNull(fileSystemHandling0);
      
      ByteOrder byteOrder5 = ByteOrder.nativeOrder();
      assertEquals("LITTLE_ENDIAN", byteOrder5.toString());
      assertSame(byteOrder5, byteOrder0);
      assertSame(byteOrder5, byteOrder1);
      assertSame(byteOrder5, byteOrder3);
      assertSame(byteOrder5, byteOrder2);
      assertSame(byteOrder5, byteOrder4);
      assertNotNull(byteOrder5);
      
      TiffOutputDirectory tiffOutputDirectory1 = tiffOutputSet1.addInteroperabilityDirectory();
      assertEquals((-4), tiffOutputDirectory1.type);
      assertEquals(6, tiffOutputDirectory1.getItemLength());
      assertNotSame(tiffOutputDirectory1, tiffOutputDirectory0);
      assertNotSame(tiffOutputSet1, tiffOutputSet0);
      assertNotNull(tiffOutputDirectory1);
      assertFalse(tiffOutputDirectory1.equals((Object)tiffOutputDirectory0));
      assertFalse(tiffOutputSet1.equals((Object)tiffOutputSet0));
      
      String string0 = tiffOutputSet0.toString();
      assertNotSame(tiffOutputSet0, tiffOutputSet1);
      assertNotNull(string0);
      assertFalse(tiffOutputSet0.equals((Object)tiffOutputSet1));
      assertEquals("TiffOutputSet {\nbyteOrder: LITTLE_ENDIAN\n\tdirectory 0: Root (0)\n}\n", string0);
      
      tiffOutputSet0.addDirectory(tiffOutputDirectory1);
      assertEquals((-4), tiffOutputDirectory1.type);
      assertEquals(6, tiffOutputDirectory1.getItemLength());
      assertNotSame(tiffOutputDirectory1, tiffOutputDirectory0);
      assertNotSame(tiffOutputSet0, tiffOutputSet1);
      assertNotSame(tiffOutputSet1, tiffOutputSet0);
      assertFalse(tiffOutputDirectory1.equals((Object)tiffOutputDirectory0));
      assertFalse(tiffOutputSet0.equals((Object)tiffOutputSet1));
      assertFalse(tiffOutputSet1.equals((Object)tiffOutputSet0));
      
      tiffImageWriterLossy0.write(byteArrayOutputStream0, tiffOutputSet0);
      assertEquals("LITTLE_ENDIAN", byteOrder2.toString());
      assertEquals(56, byteArrayOutputStream0.size());
      assertEquals("II*\u0000\b\u0000\u0000\u0000\u0001\u0000i\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000$\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0005\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000\u001C\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
      assertNotSame(tiffOutputSet0, tiffOutputSet1);
      assertSame(byteOrder2, byteOrder0);
      assertSame(byteOrder2, byteOrder1);
      assertSame(byteOrder2, byteOrder4);
      assertSame(byteOrder2, byteOrder3);
      assertSame(byteOrder2, byteOrder5);
      assertFalse(tiffOutputSet0.equals((Object)tiffOutputSet1));
      
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis((byte)5);
      tiffImageWriterLossy0.write(byteArrayOutputStream0, tiffOutputSet1);
      assertEquals("LITTLE_ENDIAN", byteOrder2.toString());
      assertEquals(112, byteArrayOutputStream0.size());
      assertEquals("II*\u0000\b\u0000\u0000\u0000\u0001\u0000i\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000$\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0005\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000\u001C\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000II*\u0000\b\u0000\u0000\u0000\u0001\u0000i\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000\u001C\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0005\uFFFD\u0004\u0000\u0001\u0000\u0000\u00000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
      assertSame(byteOrder2, byteOrder0);
      assertSame(byteOrder2, byteOrder1);
      assertSame(byteOrder2, byteOrder4);
      assertSame(byteOrder2, byteOrder3);
      assertSame(byteOrder2, byteOrder5);
      assertNotSame(tiffOutputSet1, tiffOutputSet0);
      assertFalse(tiffOutputSet1.equals((Object)tiffOutputSet0));
  }
}
