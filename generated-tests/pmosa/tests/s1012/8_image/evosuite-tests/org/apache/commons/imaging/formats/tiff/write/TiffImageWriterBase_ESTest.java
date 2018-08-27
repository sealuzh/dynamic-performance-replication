/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 22:28:22 GMT 2018
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffImageWriterBase_ESTest extends TiffImageWriterBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      ByteOrder.nativeOrder();
      tiffOutputSet0.getDirectories();
      TiffOutputDirectory tiffOutputDirectory0 = tiffOutputSet0.getOrCreateRootDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffImageWriterBase.imageDataPaddingLength(0);
      TiffImageWriterBase.imageDataPaddingLength(0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-29);
      byteArray0[2] = (byte)73;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-22);
      byteArray0[5] = (byte)19;
      byteArray0[6] = (byte) (-77);
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(tiffOutputSummary0.byteOrder, byteArray0);
      try { 
        tiffOutputSet0.addDirectory(tiffOutputDirectory0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Output set already contains a directory of that type.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffOutputSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
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
  public void test02()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy((ByteOrder) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream("m,L-");
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.getOrCreateExifDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.setGPSInDegrees((-3202.44596869), (-3202.44596869));
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy((ByteOrder) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream("m,r");
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0);
      TiffImageWriterBase.imageDataPaddingLength(1);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet((ByteOrder) null);
      tiffOutputSet0.addGPSDirectory();
      try { 
        tiffImageWriterLossy0.write(binaryOutputStream0, tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing root directory.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy((ByteOrder) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream("m,L-");
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(mockPrintStream0);
      TiffImageWriterLossy tiffImageWriterLossy1 = new TiffImageWriterLossy();
      tiffImageWriterLossy1.writeImageFileHeader(binaryOutputStream0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet((ByteOrder) null);
      tiffOutputSet0.getOrCreateExifDirectory();
      tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      tiffImageWriterLossy1.validateDirectories(tiffOutputSet0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)47;
      byteArray0[1] = (byte)38;
      byteArray0[2] = (byte) (-3);
      tiffOutputSet0.addGPSDirectory();
      tiffImageWriterLossy1.write(mockPrintStream0, tiffOutputSet0);
      tiffImageWriterLossy1.write(mockPrintStream0, tiffOutputSet0);
      assertFalse(tiffImageWriterLossy1.equals((Object)tiffImageWriterLossy0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffOutputDirectory tiffOutputDirectory0 = tiffOutputSet0.getOrCreateExifDirectory();
      TiffDirectoryType tiffDirectoryType0 = TiffDirectoryType.TIFF_DIRECTORY_IFD0;
      TagInfoByte tagInfoByte0 = new TagInfoByte("bOxOu", 77, tiffDirectoryType0);
      tiffOutputDirectory0.add(tagInfoByte0, (byte)46);
      ByteOrder byteOrder1 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder1);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = new TiffOutputSummary(byteOrder1, tiffOutputDirectory0, tiffOutputSummary0.directoryTypeMap);
      assertFalse(tiffOutputSummary1.equals((Object)tiffOutputSummary0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addGPSDirectory();
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffOutputSet0.dump();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffImageWriterLossy tiffImageWriterLossy1 = new TiffImageWriterLossy();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy1.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy1.validateDirectories(tiffOutputSet0);
      assertFalse(tiffOutputSummary1.equals((Object)tiffOutputSummary0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertFalse(tiffOutputSummary1.equals((Object)tiffOutputSummary0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(9, 24, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("T.4 compression with the uncomressed mode extension is not yet supported", false);
          HashMap<String, Object> hashMap0 = new HashMap<String, Object>(2489, 0.0557F);
          TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
          ImageBuilder imageBuilder0 = new ImageBuilder(3, 2489, false);
          BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
          // Undeclared exception!
          tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("T.4 compression with the uncompressed mode extension is not yet supported", false);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(32809, 32809);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      hashMap0.put((String) null, tiffImageWriterLossy0);
      ImageBuilder imageBuilder0 = new ImageBuilder(1930, 482, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: null
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("T.4 compression with the uncomressed mode extension is not yet supported", false);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(2489, 0.0557F);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(3, 3, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockFileOutputStream0, hashMap0);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      TiffOutputSet tiffOutputSet1 = new TiffOutputSet(tiffOutputSet0.byteOrder);
      tiffOutputSet1.addGPSDirectory();
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
  public void test13()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(3, 3, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.putIfAbsent("COMPRESSION", bufferedImage0);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, (OutputStream) null, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid compression parameter, must be numeric: BufferedImage@26784d7: type = 1 DirectColorModel: rmask=ff0000 gmask=ff00 bmask=ff amask=0 IntegerInterleavedRaster: width = 3 height = 3 #Bands = 3 xOff = 0 yOff = 0 dataOffset[0] 0
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(3, 3, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Byte byte0 = new Byte((byte)25);
      hashMap0.putIfAbsent("COMPRESSION", byte0);
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
  public void test15()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(3, 50, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Byte byte0 = new Byte((byte) (-15));
      hashMap0.putIfAbsent("COMPRESSION", (Object) null);
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
  public void test16()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(9, 9, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Long long0 = new Long(2643L);
      Long.sum((-2379L), 8L);
      hashMap0.put("PARAM_KEY_LZW_COMPRESSION_BLOCK_SIZE", long0);
      Byte byte0 = new Byte((byte)0);
      hashMap0.putIfAbsent("COMPRESSION", byte0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, pipedOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Block size parameter 2643 is less than 8000 minimum
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ImageBuilder imageBuilder0 = new ImageBuilder(9, 9, true);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Long long0 = new Long(2643L);
      Long.sum(2643L, 8L);
      hashMap0.put("PARAM_KEY_LZW_COMPRESSION_BLOCK_SIZE", long0);
      Byte byte0 = new Byte((byte)0);
      hashMap0.putIfAbsent("COMPRESSION", byte0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, pipedOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Block size parameter 2643 is less than 8000 minimum
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      Byte byte0 = new Byte((byte)3);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>((byte)3, (byte)25);
      hashMap0.putIfAbsent("COMPRESSION", byte0);
      ImageBuilder imageBuilder0 = new ImageBuilder(3, (byte)25, false);
      BufferedImage bufferedImage0 = imageBuilder0.getBufferedImage();
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
}