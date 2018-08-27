/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 07:34:33 GMT 2018
 */

package org.apache.commons.imaging.formats.tiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.ObjectStreamConstants;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.apache.commons.imaging.formats.tiff.TiffElement;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeDouble;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffField_ESTest extends TiffField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField((-1465), (-1465), fieldTypeRational0, (-1465), (-1465), (byte[]) null, byteOrder0, (-1465));
      String string0 = tiffField0.getTagName();
      assertEquals("Unknown Tag (0xfffffa47)", string0);
      
      int int0 = tiffField0.getOffset();
      assertEquals((-1465), tiffField0.getSortHint());
      assertEquals((-1465), tiffField0.getDirectoryType());
      assertEquals((-11720), tiffField0.getBytesLength());
      assertEquals((-1465), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-121);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)93;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(0, 0, fieldTypeAscii0, 0, (-1302L), byteArray0, byteOrder0, 9);
      String string0 = tiffField0.getValueDescription();
      assertEquals(0, tiffField0.getDirectoryType());
      assertEquals((-1302), tiffField0.getOffset());
      assertEquals(0, tiffField0.getTag());
      assertNotNull(string0);
      assertEquals(0, tiffField0.getBytesLength());
      assertEquals(9, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = new FieldTypeDouble(863, ")U");
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)84;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(25, 863, fieldTypeDouble0, 25, 863, byteArray0, byteOrder0, 320);
      // Undeclared exception!
      try { 
        tiffField0.getDoubleValue();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [D cannot be cast to java.lang.Number
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.SBYTE;
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-36);
      byteArray0[1] = (byte)0;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(65535, 4, fieldTypeByte0, 65535, 2756L, byteArray0, byteOrder0, (byte)0);
      // Undeclared exception!
      try { 
        tiffField0.getIntValue();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [B cannot be cast to java.lang.Number
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[109];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      FileSystemHandling.shouldAllThrowIOExceptions();
      TiffField tiffField0 = new TiffField(327, 65535, fieldTypeFloat0, 65535, (byte)110, byteArray0, byteOrder0, (byte)110);
      ByteOrder byteOrder1 = ByteOrder.LITTLE_ENDIAN;
      ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
      String string0 = tiffField0.getValueDescription();
      assertEquals(262140, tiffField0.getBytesLength());
      assertEquals(110, tiffField0.getOffset());
      assertEquals(65535, tiffField0.getDirectoryType());
      assertEquals(110, tiffField0.getSortHint());
      assertNotNull(string0);
      assertEquals(65535L, tiffField0.getCount());
      assertEquals(327, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FieldTypeByte fieldTypeByte0 = FieldType.SBYTE;
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)39;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(501, 1, fieldTypeByte0, 653L, 653L, byteArray0, byteOrder0, (byte)39);
      String string0 = tiffField0.getValueDescription();
      assertEquals(39, tiffField0.getSortHint());
      assertEquals(501, tiffField0.getTag());
      assertEquals(653, tiffField0.getBytesLength());
      assertEquals(653L, tiffField0.getCount());
      assertNotNull(string0);
      assertEquals(1, tiffField0.getDirectoryType());
      assertEquals(653, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[371];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FieldTypeByte fieldTypeByte0 = FieldType.SBYTE;
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField((-846), 0, fieldTypeByte0, 388L, 653L, byteArray0, byteOrder0, (byte)39);
      String string0 = tiffField0.getValueDescription();
      assertEquals((-846), tiffField0.getTag());
      assertEquals(388L, tiffField0.getCount());
      assertEquals(653, tiffField0.getOffset());
      assertNotNull(string0);
      assertEquals(0, tiffField0.getDirectoryType());
      assertEquals(39, tiffField0.getSortHint());
      assertEquals(388, tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)50;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(41, (-136), fieldTypeAscii0, 657L, 657L, byteArray0, byteOrder0, (byte)50);
      TiffElement tiffElement0 = tiffField0.getOversizeValueElement();
      assertEquals((-136), tiffField0.getDirectoryType());
      assertEquals(41, tiffField0.getTag());
      assertEquals(657L, tiffElement0.offset);
      assertEquals(50, tiffField0.getSortHint());
      assertNotNull(tiffElement0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = new byte[6];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(1676, 1676, fieldTypeDouble0, 1676, 1676, byteArray0, (ByteOrder) null, 1676);
      try { 
        tiffField0.getStringValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected String value(-1 (0xffffffff: Unknown Tag): ): [D@16363c48
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-18);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-28);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(2251, 2251, fieldTypeLong0, 2251, 2965L, byteArray0, byteOrder0, (byte) (-18));
      String string0 = tiffField0.getValueDescription();
      assertEquals(2251L, tiffField0.getCount());
      assertEquals(2251, tiffField0.getTag());
      assertEquals(9004, tiffField0.getBytesLength());
      assertEquals(2251, tiffField0.getDirectoryType());
      assertEquals(2965, tiffField0.getOffset());
      assertEquals((-18), tiffField0.getSortHint());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = new FieldTypeDouble((-278), "xl");
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(3128, (-278), fieldTypeDouble0, (-278), (-278), (byte[]) null, byteOrder0, 3128);
      assertTrue(tiffField0.isLocalValue());
      
      tiffField0.getOversizeValueElement();
      assertEquals(3128, tiffField0.getSortHint());
      assertEquals(3128, tiffField0.getTag());
      assertEquals((-278), tiffField0.getOffset());
      assertEquals((-278), tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = new FieldTypeShort(3525, "");
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(3525, 3525, fieldTypeShort0, (-393L), (-393L), byteArray0, byteOrder0, (byte)0);
      tiffField0.isLocalValue();
      assertEquals(0, tiffField0.getSortHint());
      assertEquals((-393), tiffField0.getOffset());
      assertEquals(3525, tiffField0.getTag());
      assertEquals(3525, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/8_image");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "v=.qtkcf");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[43];
      ByteOrder.nativeOrder();
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder byteOrder1 = ByteOrder.nativeOrder();
      FieldTypeFloat fieldTypeFloat0 = new FieldTypeFloat((-655), "v=.qtkcf");
      TiffField tiffField0 = new TiffField((-655), (-655), fieldTypeFloat0, 1L, (-655), byteArray0, byteOrder0, 0);
      tiffField0.getIntValueOrArraySum();
      try { 
        fieldTypeFloat0.writeData(byteOrder1, byteOrder1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid data: LITTLE_ENDIAN (java.nio.ByteOrder)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      byte[] byteArray0 = new byte[0];
      TiffField tiffField0 = new TiffField((-433), (-433), fieldTypeDouble0, 3115L, (byte) (-42), byteArray0, (ByteOrder) null, (byte) (-42));
      tiffField0.getDoubleArrayValue();
      assertEquals((-433), tiffField0.getDirectoryType());
      assertEquals((-42), tiffField0.getOffset());
      assertEquals(24920, tiffField0.getBytesLength());
      assertEquals(3115L, tiffField0.getCount());
      assertEquals((-433), tiffField0.getTag());
      assertEquals((-42), tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      byte[] byteArray0 = new byte[7];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField((byte)0, 0, fieldTypeLong0, 3732, 3732, byteArray0, byteOrder0, 3732);
      TiffField.OversizeValueElement tiffField_OversizeValueElement0 = tiffField0.new OversizeValueElement(7, 293);
      tiffField0.getIntValueOrArraySum();
      assertEquals(3732, tiffField0.getOffset());
      assertEquals(3732, tiffField0.getSortHint());
      assertEquals(0, tiffField0.getDirectoryType());
      assertEquals(0, tiffField0.getTag());
      assertEquals(14928, tiffField0.getBytesLength());
      assertEquals(3732L, tiffField0.getCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[94];
      int int0 = 2594;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      TiffField tiffField0 = new TiffField(16, 2594, fieldTypeAscii0, 16, 16, byteArray0, byteOrder0, 1373);
      try { 
        tiffField0.getIntValueOrArraySum();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [Ljava.lang.String;@1cc5922e for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.UNDEFINED;
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-31);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(1982292598, 1982292598, fieldTypeByte0, 1982292598, (-2453L), byteArray0, byteOrder0, 1982292598);
      try { 
        tiffField0.getDoubleArrayValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [B@238d1940 for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteOrder byteOrder0 = byteBuffer0.order();
      TiffField tiffField0 = new TiffField((-644), (-644), fieldTypeAscii0, (-644), (-644), byteArray0, byteOrder0, (-644));
      TiffField.OversizeValueElement tiffField_OversizeValueElement0 = tiffField0.new OversizeValueElement(103, 50);
      String string0 = tiffField_OversizeValueElement0.getElementDescription(false);
      assertEquals((-644), tiffField0.getOffset());
      assertEquals((-644), tiffField0.getTag());
      assertEquals("OversizeValueElement, tag: Unknown Tag, fieldType: ASCII", string0);
      assertNotNull(string0);
      assertEquals((-644), tiffField0.getSortHint());
      assertEquals((-644), tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = new FieldTypeFloat(1669, "");
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField((-782), (-782), fieldTypeFloat0, 2496L, 1669, byteArray0, byteOrder0, (-782));
      try { 
        tiffField0.getIntArrayValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [F@14361513 for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/8_image");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      byte[] byteArray0 = new byte[80];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, (String) null);
      TiffField tiffField0 = new TiffField(10, 50962, fieldTypeFloat0.SHORT, 10, 10, byteArray0, byteOrder0, 50962);
      tiffField0.getValueDescription();
      ByteOrder byteOrder1 = ByteOrder.nativeOrder();
      assertSame(byteOrder1, byteOrder0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(33, 65535, (FieldType) null, 65535, 4L, byteArray0, byteOrder0, 33);
      // Undeclared exception!
      try { 
        tiffField0.getFieldTypeName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byte[] byteArray0 = new byte[151];
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FileSystemHandling.shouldAllThrowIOExceptions();
      FieldTypeLong fieldTypeLong0 = FieldType.LONG;
      TiffField tiffField0 = new TiffField(1116, 1116, fieldTypeLong0, 2613, 1116, byteArray0, (ByteOrder) null, 2144585559);
      TiffField.OversizeValueElement tiffField_OversizeValueElement0 = tiffField0.new OversizeValueElement(615, 2147278202);
      tiffField0.getDoubleArrayValue();
      ByteOrder.nativeOrder();
      try { 
        FieldType.getFieldType((-2078));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Field type -2078 is unsupported
         //
         verifyException("org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      FieldTypeRational fieldTypeRational0 = FieldType.RATIONAL;
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)119;
      byteArray0[2] = (byte)11;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField((-1056), 50834, fieldTypeRational0, 0L, 0L, byteArray0, byteOrder0, 2390);
      int int0 = tiffField0.getIntValueOrArraySum();
      assertEquals(50834, tiffField0.getDirectoryType());
      assertEquals(0, int0);
      assertEquals((-1056), tiffField0.getTag());
      assertEquals(0, tiffField0.getBytesLength());
      assertEquals(2390, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FieldTypeByte fieldTypeByte0 = FieldType.UNDEFINED;
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte)39;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(501, 1, fieldTypeByte0, 1, 1, byteArray0, byteOrder0, 501);
      String string0 = tiffField0.getValueDescription();
      assertEquals(501, tiffField0.getTag());
      assertEquals(1, tiffField0.getOffset());
      assertEquals(1, tiffField0.getDirectoryType());
      assertEquals(501, tiffField0.getSortHint());
      assertEquals(1, tiffField0.getBytesLength());
      assertEquals(1L, tiffField0.getCount());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      TiffField tiffField0 = new TiffField(558, (byte)74, fieldTypeRational0, (byte)74, 67, byteArray0, (ByteOrder) null, (byte)0);
      // Undeclared exception!
      try { 
        tiffField0.getIntArrayValue();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = new FieldTypeRational(40, " ");
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-123);
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-111);
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)105;
      byteArray0[5] = (byte) (-7);
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(40, 40, fieldTypeRational0, 255L, 40, byteArray0, byteOrder0, (byte) (-7));
      tiffField0.getIntArrayValue();
      System.setCurrentTimeMillis((byte) (-1));
      BufferedOutputStream bufferedOutputStream0 = null;
      try {
        bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, (byte) (-7));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Buffer size <= 0
         //
         verifyException("java.io.BufferedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)33;
      byteArray0[2] = (byte) (-121);
      byteArray0[3] = (byte)33;
      byteArray0[4] = (byte)93;
      byteArray0[5] = (byte) (-121);
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(0, 0, fieldTypeAscii0, 0, (-1302L), byteArray0, byteOrder0, 0);
      String string0 = tiffField0.getStringValue();
      assertEquals(0, tiffField0.getSortHint());
      assertEquals((-1302), tiffField0.getOffset());
      assertEquals(0, tiffField0.getTag());
      assertEquals(0, tiffField0.getBytesLength());
      assertEquals(0, tiffField0.getDirectoryType());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.LONG;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-14);
      byteArray0[1] = (byte) (-14);
      TiffField tiffField0 = new TiffField(0, (-682), fieldTypeLong0, 50, (-1L), byteArray0, (ByteOrder) null, (byte) (-14));
      byteOrder0.toString();
      tiffField0.getIntArrayValue();
      long long0 = tiffField0.getCount();
      assertEquals(50L, long0);
      
      tiffField0.getByteArrayValue();
      assertEquals(0, tiffField0.getTag());
      assertEquals((-14), tiffField0.getSortHint());
      assertEquals(200, tiffField0.getBytesLength());
      assertEquals((-682), tiffField0.getDirectoryType());
      assertEquals((-1), tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.SLONG;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(16, 16, fieldTypeLong0, 16, 7976L, (byte[]) null, byteOrder0, 16);
      // Undeclared exception!
      try { 
        tiffField0.dump((PrintWriter) null, "|~'[d2r>\rorT");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)40;
      byteArray0[1] = (byte) (-106);
      byteArray0[2] = (byte) (-32);
      byteArray0[5] = (byte)40;
      byteArray0[7] = (byte)37;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(42034, 42034, fieldTypeShort0, 42034, 2147483647L, byteArray0, byteOrder0, (-327));
      int int0 = tiffField0.getIntValueOrArraySum();
      assertEquals(42034L, tiffField0.getCount());
      assertEquals(42034, tiffField0.getTag());
      assertEquals(Integer.MAX_VALUE, tiffField0.getOffset());
      assertEquals(42034, tiffField0.getDirectoryType());
      assertEquals((-7160), int0);
      assertEquals(84068, tiffField0.getBytesLength());
      assertEquals((-327), tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[211];
      FieldTypeFloat fieldTypeFloat0 = new FieldTypeFloat(1533, "+mfdO4CS^'");
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(1533, 36, fieldTypeFloat0, 1533, (-211L), byteArray0, byteOrder0, 36);
      tiffField0.getDoubleArrayValue();
      TiffElement tiffElement0 = tiffField0.getOversizeValueElement();
      assertEquals((-211L), tiffElement0.offset);
      assertEquals(1533, tiffField0.getTag());
      assertEquals(36, tiffField0.getDirectoryType());
      assertNotNull(tiffElement0);
      assertEquals(36, tiffField0.getSortHint());
      assertEquals(6132, tiffField0.getBytesLength());
      assertEquals(1533L, tiffField0.getCount());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = new FieldTypeRational(13, "Oi/r<");
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-69);
      byteArray0[1] = (byte)73;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(33918, 103, fieldTypeRational0, (-2224L), 13, byteArray0, byteOrder0, 4138);
      String string0 = tiffField0.getTagName();
      assertEquals(13, tiffField0.getOffset());
      assertEquals(103, tiffField0.getDirectoryType());
      assertEquals("IntergraphPacketData", string0);
      assertEquals(4138, tiffField0.getSortHint());
      assertEquals(33918, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[211];
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      Charset.defaultCharset();
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField((byte)0, (byte)0, fieldTypeRational0, 1730L, 1730L, byteArray0, byteOrder0, (-135));
      tiffField0.getDoubleArrayValue();
      String string0 = tiffField0.getValueDescription();
      assertEquals((-135), tiffField0.getSortHint());
      assertEquals(1730, tiffField0.getOffset());
      assertNotNull(string0);
      assertEquals(0, tiffField0.getDirectoryType());
      assertEquals(1730L, tiffField0.getCount());
      assertEquals(0, tiffField0.getTag());
      assertEquals(13840, tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SSHORT;
      byte[] byteArray0 = new byte[7];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(1742, 1, fieldTypeShort0, 40L, 844L, byteArray0, byteOrder0, (-99));
      tiffField0.getDoubleArrayValue();
      tiffField0.getByteArrayValue();
      assertEquals(1, tiffField0.getDirectoryType());
      assertEquals(80, tiffField0.getBytesLength());
      assertEquals(40L, tiffField0.getCount());
      assertEquals(1742, tiffField0.getTag());
      assertEquals((-99), tiffField0.getSortHint());
      assertEquals(844, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[10];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField((-13), (-855), fieldTypeDouble0, 1L, (byte)15, byteArray0, byteOrder0, (byte)15);
      ByteOrder.nativeOrder();
      tiffField0.getDescriptionWithoutValue();
      tiffField0.getFieldType();
      tiffField0.getDirectoryType();
      tiffField0.getDoubleArrayValue();
      tiffField0.getSortHint();
      System.setCurrentTimeMillis(65535);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = new FieldTypeAscii(0, "_EMi3B-!u{YXAc$");
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte)63;
      byteArray0[9] = (byte)63;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder byteOrder1 = ByteOrder.BIG_ENDIAN;
      FieldTypeRational fieldTypeRational0 = new FieldTypeRational(0, "_EMi3B-!u{YXAc$");
      ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(65107, 1448, fieldTypeRational0, 65535L, 1448, byteArray0, byteOrder0, (-2904));
      // Undeclared exception!
      try { 
        tiffField0.getIntValueOrArraySum();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.apache.commons.imaging.common.RationalNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      byte[] byteArray0 = new byte[63];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      String string0 = File.pathSeparator;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ":");
      TiffField tiffField0 = new TiffField((byte)20, (byte)20, fieldTypeDouble0, 1L, (byte)20, byteArray0, byteOrder0, (byte)20);
      assertEquals(1L, tiffField0.getCount());
      
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      tiffField0.getIntArrayValue();
      ByteOrder byteOrder1 = ByteOrder.LITTLE_ENDIAN;
      ByteOrder.nativeOrder();
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      ByteOrder.nativeOrder();
      FileSystemHandling.shouldAllThrowIOExceptions();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      int int0 = tiffField0.getDirectoryType();
      assertEquals(20, tiffField0.getOffset());
      assertEquals(20, int0);
      assertEquals(8, tiffField0.getBytesLength());
      assertEquals(20, tiffField0.getTag());
      assertEquals(20, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      byte[] byteArray0 = new byte[94];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      TiffField tiffField0 = new TiffField(16, 50, fieldTypeAscii0, 120L, 120L, byteArray0, byteOrder0, 1416);
      TiffField.OversizeValueElement tiffField_OversizeValueElement0 = tiffField0.new OversizeValueElement((-35), 2594);
      String string0 = tiffField_OversizeValueElement0.getElementDescription(true);
      assertNull(string0);
      
      tiffField0.toString();
      assertEquals(120, tiffField0.getBytesLength());
      assertEquals(16, tiffField0.getTag());
      assertEquals(120, tiffField0.getOffset());
      assertEquals(50, tiffField0.getDirectoryType());
      assertEquals(1416, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      byte[] byteArray0 = new byte[63];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder byteOrder1 = ByteOrder.LITTLE_ENDIAN;
      ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField((byte)74, (-4826), fieldTypeDouble0, (byte)74, (-1499L), byteArray0, byteOrder0, 1066);
      ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
      tiffField0.getValueDescription();
      try { 
        FieldType.getFieldType(37);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Field type 37 is unsupported
         //
         verifyException("org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[218];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1723);
      byteBuffer0.put((int) (byte)88, (byte)88);
      TiffField tiffField0 = new TiffField(0, 0, fieldTypeShort0, 1723, (byte)30, byteArray0, byteOrder0, (byte)88);
      tiffField0.getIntArrayValue();
      String string0 = tiffField0.toString();
      assertEquals("0 (0x0: Unknown Tag): 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0... (109) (1723 Short)", string0);
      assertEquals(30, tiffField0.getOffset());
      assertEquals(3446, tiffField0.getBytesLength());
      assertEquals(0, tiffField0.getDirectoryType());
      assertEquals(88, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[275];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      ByteOrder.nativeOrder();
      ByteOrder byteOrder1 = ByteOrder.BIG_ENDIAN;
      int int0 = (-4826);
      TiffField tiffField0 = new TiffField((byte)74, (byte)74, fieldTypeFloat0, (byte)74, (byte)74, byteArray0, byteOrder0, (-4826));
      ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
      tiffField0.getValueDescription();
      try { 
        FieldType.getFieldType((byte)74);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Field type 74 is unsupported
         //
         verifyException("org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[224];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder.nativeOrder();
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      ByteOrder byteOrder1 = ByteOrder.BIG_ENDIAN;
      ByteOrder.nativeOrder();
      int int0 = ObjectStreamConstants.baseWireHandle;
      ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
      ByteOrder byteOrder3 = ByteOrder.nativeOrder();
      FileSystemHandling.shouldAllThrowIOExceptions();
      ByteOrder.nativeOrder();
      ByteOrder byteOrder4 = ByteOrder.LITTLE_ENDIAN;
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ByteOrder byteOrder5 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(1536, 4098, fieldTypeLong0, 2700L, 4180L, byteArray0, byteOrder3, 230);
      tiffField0.getValueDescription();
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter("0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0... (56)", "0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0... (56)");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0... (56)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[417];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FileSystemHandling.shouldAllThrowIOExceptions();
      ByteOrder.nativeOrder();
      String string0 = null;
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      FileSystemHandling.shouldAllThrowIOExceptions();
      ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(37381, 22, fieldTypeFloat0.DOUBLE, 37381, 22, byteArray0, byteOrder0, 22);
      String string1 = File.separator;
      tiffField0.dump();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      int int0 = Short.BYTES;
      ByteArrayOutputStream byteArrayOutputStream0 = null;
      try {
        byteArrayOutputStream0 = new ByteArrayOutputStream((-538));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative initial size: -538
         //
         verifyException("java.io.ByteArrayOutputStream", e);
      }
  }
}
