/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 01:20:15 GMT 2018
 */

package org.apache.commons.imaging.formats.tiff.write;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import org.apache.commons.imaging.common.BinaryOutputStream;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.TiffDirectory;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossless;
import org.apache.commons.imaging.formats.tiff.write.TiffImageWriterLossy;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffImageWriterBase_ESTest extends TiffImageWriterBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet((ByteOrder) null);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(byteArrayOutputStream0, (ByteOrder) null);
      try { 
        tiffImageWriterLossy0.write(binaryOutputStream0, tiffOutputSet0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // No directories.
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
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
  public void test02()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addGPSDirectory();
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
  public void test03()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      TiffImageWriterLossless tiffImageWriterLossless0 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream((OutputStream) null, byteOrder0);
      TiffImageWriterLossless tiffImageWriterLossless1 = new TiffImageWriterLossless(byteOrder0, byteArray0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossless1.writeImageFileHeader(binaryOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy(byteOrder0);
      LinkedList<TiffField> linkedList0 = new LinkedList<TiffField>();
      TiffDirectory tiffDirectory0 = new TiffDirectory(1447, linkedList0, 1447, 1447);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      tiffDirectory0.getTiffImage(byteOrder0, (Map<String, Object>) hashtable0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0);
      // Undeclared exception!
      try { 
        tiffImageWriterLossy0.writeImage((BufferedImage) null, bufferedOutputStream0, hashtable0);
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
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.getOrCreateExifDirectory();
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      TiffOutputSummary tiffOutputSummary1 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertFalse(tiffOutputSummary1.equals((Object)tiffOutputSummary0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1235);
      byteArrayOutputStream0.reset();
      BinaryOutputStream binaryOutputStream0 = new BinaryOutputStream(byteArrayOutputStream0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0, 1235);
      binaryOutputStream0.write2Bytes((-1546));
      byteArrayOutputStream0.write((-1546));
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      binaryOutputStream0.write(1235);
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet(byteOrder0);
      tiffOutputSet0.getOrCreateGPSDirectory();
      tiffOutputSet0.getExifDirectory();
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
      tiffImageWriterLossy0.write(binaryOutputStream0, tiffOutputSet0);
      tiffImageWriterLossy0.writeImageFileHeader(binaryOutputStream0);
      tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      tiffImageWriterLossy0.write(byteArrayOutputStream0, tiffOutputSet0);
      assertEquals(140, byteArrayOutputStream0.size());
      assertEquals("II\u0000*\u0000\u0000\u0004\uFFFD\uFFFD\uFFFD\uFFFD\uFFFDII\u0000*\u0000\u0000\u0000\bII*\u0000\b\u0000\u0000\u0000\u0002\u0000i\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000(\u0000\u0000\u0000%\uFFFD\u0004\u0000\u0001\u0000\u0000\u00000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000II\u0000*\u0000\u0000\u0000\bII*\u0000\b\u0000\u0000\u0000\u0002\u0000i\uFFFD\u0004\u0000\u0001\u0000\u0000\u0000(\u0000\u0000\u0000%\uFFFD\u0004\u0000\u0001\u0000\u0000\u00000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.setGPSInDegrees(0.0, 0.0);
      TiffOutputSummary tiffOutputSummary0 = tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      assertNotNull(tiffOutputSummary0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.addInteroperabilityDirectory();
      tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0);
      TiffImageWriterBase.imageDataPaddingLength(8000);
      tiffImageWriterLossy0.write(bufferedOutputStream0, tiffOutputSet0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      LinkedList<TiffField> linkedList0 = new LinkedList<TiffField>();
      TiffDirectory tiffDirectory0 = new TiffDirectory(73, linkedList0, 0L, 0L);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      BufferedImage bufferedImage0 = new BufferedImage(6, 6, 6);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0);
      TiffImageWriterLossy tiffImageWriterLossy1 = new TiffImageWriterLossy();
      try { 
        tiffImageWriterLossy1.writeImage(bufferedImage0, pipedOutputStream0, hashtable0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<TiffField> linkedList0 = new LinkedList<TiffField>();
      TiffDirectory tiffDirectory0 = new TiffDirectory(79, linkedList0, 0L, 79);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BufferedImage bufferedImage0 = new BufferedImage(79, 6, 6);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, pipedOutputStream0, hashtable0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      LinkedList<TiffField> linkedList0 = new LinkedList<TiffField>();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      ByteOrder byteOrder1 = ByteOrder.BIG_ENDIAN;
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      BufferedImage bufferedImage0 = new BufferedImage(1447, 1447, 4);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0);
      BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(bufferedOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0, false);
      // Undeclared exception!
      tiffImageWriterLossy0.writeImage(bufferedImage0, mockPrintStream0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TiffImageWriterLossy tiffImageWriterLossy0 = new TiffImageWriterLossy();
      TiffOutputSet tiffOutputSet0 = new TiffOutputSet();
      tiffOutputSet0.getOrCreateGPSDirectory();
      tiffImageWriterLossy0.validateDirectories(tiffOutputSet0);
      ArrayList<TiffField> arrayList0 = new ArrayList<TiffField>();
      TiffDirectory tiffDirectory0 = new TiffDirectory(34853, arrayList0, 34853, (-1L));
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("", byteOrder0);
      BufferedImage bufferedImage0 = new BufferedImage(48322, 86, 6);
      bufferedImage0.getData();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0);
      BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(pipedOutputStream0);
      try { 
        tiffImageWriterLossy0.writeImage(bufferedImage0, bufferedOutputStream0, hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.write.TiffImageWriterBase", e);
      }
  }
}