/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 13:02:11 GMT 2018
 */

package org.apache.commons.imaging.formats.tiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
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
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffField_ESTest extends TiffField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(34727, 34727, fieldTypeRational0, 34727, 34727, byteArray0, byteOrder0, (byte)0);
      int int0 = tiffField0.getIntValueOrArraySum();
      assertEquals(0, tiffField0.getSortHint());
      assertEquals(34727L, tiffField0.getCount());
      assertEquals(0, int0);
      assertEquals(277816, tiffField0.getBytesLength());
      assertEquals(34727, tiffField0.getDirectoryType());
      assertEquals(34727, tiffField0.getTag());
      assertEquals(34727, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = new FieldTypeByte(739, "CwS<P");
      byte[] byteArray0 = new byte[14];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(739, 739, fieldTypeByte0.IFD, 739, 739, byteArray0, byteOrder0, 2146882280);
      String string0 = tiffField0.getValueDescription();
      assertEquals(739, tiffField0.getOffset());
      assertEquals(2146882280, tiffField0.getSortHint());
      assertEquals(739, tiffField0.getDirectoryType());
      assertNotNull(string0);
      assertEquals(739, tiffField0.getTag());
      assertEquals(739L, tiffField0.getCount());
      assertEquals(2956, tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      FieldTypeByte fieldTypeByte0 = new FieldTypeByte(50, "Ag9\"");
      TiffField tiffField0 = new TiffField(1632, 50, fieldTypeByte0, 50, 1632, byteArray0, (ByteOrder) null, 50);
      String string0 = tiffField0.getValueDescription();
      assertNotNull(string0);
      assertEquals(50L, tiffField0.getCount());
      assertEquals(50, tiffField0.getDirectoryType());
      assertEquals(1632, tiffField0.getOffset());
      assertEquals(50, tiffField0.getBytesLength());
      assertEquals(1632, tiffField0.getTag());
      assertEquals(50, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byte[] byteArray0 = new byte[351];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder byteOrder1 = ByteOrder.LITTLE_ENDIAN;
      ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(88, 797, fieldTypeFloat0.DOUBLE, 88, 88, byteArray0, byteOrder0, 797);
      tiffField0.getValueDescription();
      ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
      assertSame(byteOrder2, byteOrder1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(0, 0, fieldTypeShort0, 0, 0, (byte[]) null, byteOrder0, 0);
      boolean boolean0 = tiffField0.isLocalValue();
      assertTrue(boolean0);
      assertEquals(0, tiffField0.getDirectoryType());
      assertEquals(0, tiffField0.getSortHint());
      assertEquals(0, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteOrder.nativeOrder();
      FieldTypeShort fieldTypeShort0 = new FieldTypeShort(65535, "CwS<PM");
      TiffField tiffField0 = new TiffField(65535, 739, fieldTypeShort0, 3348L, (-4318L), byteArray0, byteOrder0, 65535);
      tiffField0.getValueDescription();
      FieldTypeShort fieldTypeShort1 = new FieldTypeShort(739, "0, 0, 0, 0, 0, 0, 0");
      assertEquals("0, 0, 0, 0, 0, 0, 0", fieldTypeShort1.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = new FieldTypeFloat((-1824), "");
      byte[] byteArray0 = new byte[4];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(4136, 4136, fieldTypeFloat0, 4136, 4136, byteArray0, byteOrder0, 4136);
      tiffField0.getDoubleArrayValue();
      assertEquals(4136, tiffField0.getOffset());
      assertEquals(4136, tiffField0.getTag());
      assertEquals(4136, tiffField0.getSortHint());
      assertEquals(4136L, tiffField0.getCount());
      assertEquals(16544, tiffField0.getBytesLength());
      assertEquals(4136, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.UNDEFINED;
      byte[] byteArray0 = new byte[0];
      TiffField tiffField0 = new TiffField(1268, 1268, fieldTypeByte0, 1268, 1381L, byteArray0, (ByteOrder) null, 1268);
      try { 
        tiffField0.getDoubleArrayValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [B@442cdcc7 for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(7, 7, fieldTypeFloat0, 1234L, 7, byteArray0, byteOrder0, 4166);
      tiffField0.getValueDescription();
      Long.valueOf((-2456L));
      int int0 = Float.SIZE;
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      byte[] byteArray0 = new byte[5];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(41, 41, fieldTypeAscii0, 41, (-3653L), byteArray0, byteOrder0, (-1022));
      String string0 = tiffField0.getValueDescription();
      assertEquals((-3653), tiffField0.getOffset());
      assertEquals((-1022), tiffField0.getSortHint());
      assertEquals(41, tiffField0.getDirectoryType());
      assertEquals(41, tiffField0.getTag());
      assertEquals(41, tiffField0.getBytesLength());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      byte[] byteArray0 = new byte[18];
      byteArray0[3] = (byte) (-1);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField((-4), (-4), fieldTypeRational0, (-4), (-4), byteArray0, byteOrder0, (byte) (-1));
      // Undeclared exception!
      try { 
        tiffField0.dump((PrintWriter) null, "!~#L;liDIV6lM");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      byte[] byteArray0 = new byte[10];
      byteArray0[2] = (byte)50;
      byteArray0[5] = (byte)50;
      TiffField tiffField0 = new TiffField(0, 0, fieldTypeLong0, 1L, 1L, byteArray0, (ByteOrder) null, (-2580));
      String string0 = tiffField0.getValueDescription();
      assertNotNull(string0);
      assertEquals(0, tiffField0.getDirectoryType());
      assertEquals(4, tiffField0.getBytesLength());
      assertEquals(0, tiffField0.getTag());
      assertEquals(1L, tiffField0.getCount());
      assertEquals(1, tiffField0.getOffset());
      assertEquals((-2580), tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = new FieldTypeShort(50, "$");
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(2545, 13, fieldTypeShort0, 1376L, 1376L, (byte[]) null, byteOrder0, 50);
      int int0 = tiffField0.getDirectoryType();
      assertEquals(50, tiffField0.getSortHint());
      assertEquals(2545, tiffField0.getTag());
      assertEquals(13, int0);
      assertEquals(1376, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(21, 21, (FieldType) null, (-464L), (-464L), (byte[]) null, byteOrder0, 21);
      String string0 = tiffField0.getDescriptionWithoutValue();
      assertEquals((-464), tiffField0.getOffset());
      assertEquals(21, tiffField0.getDirectoryType());
      assertEquals("21 (0x15: Unknown Tag): ", string0);
      assertEquals(21, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(485, (-1972), fieldTypeAscii0, (-1972), 485, byteArray0, byteOrder0, (-1972));
      tiffField0.getOversizeValueElement();
      // Undeclared exception!
      try { 
        tiffField0.getDoubleValue();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      ByteOrder byteOrder1 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(485, (-1972), fieldTypeAscii0, 9152L, 485, byteArray0, byteOrder0, (-1972));
      TiffElement tiffElement0 = tiffField0.getOversizeValueElement();
      assertNotNull(tiffElement0);
      
      String string0 = tiffField0.getStringValue();
      assertEquals(9152, tiffField0.getBytesLength());
      assertEquals(485, tiffField0.getTag());
      assertNotNull(string0);
      assertEquals((-1972), tiffField0.getDirectoryType());
      assertEquals(485, tiffField0.getOffset());
      assertEquals((-1972), tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      byte[] byteArray0 = new byte[9];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(50725, 50725, fieldTypeAscii0, 65535, 50725, byteArray0, byteOrder0, 65535);
      try { 
        tiffField0.getStringValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected String value(50725 (0xc625: ReductionMatrix1): ): [Ljava.lang.String;@4913d94f
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(65535, 65535, fieldTypeAscii0, 65535, 65535, (byte[]) null, byteOrder0, 36);
      String string0 = tiffField0.getTagName();
      assertEquals(65535, tiffField0.getOffset());
      assertEquals("Unknown Tag (0xffff)", string0);
      assertEquals(36, tiffField0.getSortHint());
      assertEquals(65535, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.UNDEFINED;
      byte[] byteArray0 = new byte[0];
      TiffField tiffField0 = new TiffField(1268, 1268, fieldTypeByte0, 1268, 1381L, byteArray0, (ByteOrder) null, 1268);
      try { 
        tiffField0.getIntValueOrArraySum();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [B@23ca38df for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = new FieldTypeDouble(12, "");
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(12, 12, fieldTypeDouble0, 12, 12, (byte[]) null, byteOrder0, 465);
      // Undeclared exception!
      try { 
        tiffField0.getOversizeValueElement();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.BYTE;
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(1, 25, fieldTypeByte0, 25, 1, byteArray0, byteOrder0, (-1581));
      TiffField.OversizeValueElement tiffField_OversizeValueElement0 = tiffField0.new OversizeValueElement((-2413), 1);
      String string0 = tiffField_OversizeValueElement0.getElementDescription(true);
      assertEquals((-1581), tiffField0.getSortHint());
      assertEquals(1, tiffField0.getTag());
      assertNull(string0);
      assertEquals(1, tiffField0.getOffset());
      assertEquals(25, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(41, 10, fieldTypeAscii0, 10, (-3653L), byteArray0, byteOrder0, (-1022));
      String string0 = tiffField0.getValueDescription();
      assertEquals((-1022), tiffField0.getSortHint());
      assertEquals(10, tiffField0.getDirectoryType());
      assertEquals(10, tiffField0.getBytesLength());
      assertEquals(41, tiffField0.getTag());
      assertNotNull(string0);
      assertEquals((-3653), tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.LONG;
      byte[] byteArray0 = new byte[2];
      TiffField tiffField0 = new TiffField(1787, 2587, fieldTypeLong0, 2587, (-1525L), byteArray0, (ByteOrder) null, 1787);
      tiffField0.getIntArrayValue();
      assertEquals(2587L, tiffField0.getCount());
      assertEquals(1787, tiffField0.getTag());
      assertEquals((-1525), tiffField0.getOffset());
      assertEquals(1787, tiffField0.getSortHint());
      assertEquals(10348, tiffField0.getBytesLength());
      assertEquals(2587, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(485, (-1972), fieldTypeAscii0, 485, 485, byteArray0, byteOrder0, (-1972));
      try { 
        tiffField0.getIntArrayValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value:  for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SSHORT;
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)32;
      byteArray0[1] = (byte)13;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField((-1582), (-1297), fieldTypeShort0, 4936L, 4936L, byteArray0, byteOrder0, (byte)32);
      double[] doubleArray0 = tiffField0.getDoubleArrayValue();
      assertEquals(4936L, tiffField0.getCount());
      assertEquals((-1582), tiffField0.getTag());
      assertEquals((-1297), tiffField0.getDirectoryType());
      assertEquals(4936, tiffField0.getOffset());
      assertEquals(9872, tiffField0.getBytesLength());
      assertArrayEquals(new double[] {3360.0}, doubleArray0, 0.01);
      assertEquals(32, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SSHORT;
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-76);
      byteArray0[2] = (byte)38;
      byteArray0[3] = (byte)38;
      byteArray0[4] = (byte)31;
      byteArray0[6] = (byte)0;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(33922, 3860, fieldTypeShort0, 3860, 3860, byteArray0, byteOrder0, (-1251));
      int int0 = tiffField0.getIntValueOrArraySum();
      assertEquals(33922, tiffField0.getTag());
      assertEquals(3860L, tiffField0.getCount());
      assertEquals((-1251), tiffField0.getSortHint());
      assertEquals(3860, tiffField0.getOffset());
      assertEquals(9977, int0);
      assertEquals(7720, tiffField0.getBytesLength());
      assertEquals(3860, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(1152, 1152, fieldTypeFloat0, 1152, 1152, byteArray0, byteOrder0, 1152);
      // Undeclared exception!
      try { 
        tiffField0.getDoubleValue();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [F cannot be cast to java.lang.Number
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.BYTE;
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(1, 25, fieldTypeByte0, 25, 1, byteArray0, byteOrder0, (-1581));
      TiffField.OversizeValueElement tiffField_OversizeValueElement0 = tiffField0.new OversizeValueElement((-2437), 1);
      String string0 = tiffField_OversizeValueElement0.getElementDescription(false);
      assertEquals(1, tiffField0.getOffset());
      assertEquals(25, tiffField0.getDirectoryType());
      assertEquals(1, tiffField0.getTag());
      assertEquals((-1581), tiffField0.getSortHint());
      assertEquals("OversizeValueElement, tag: Unknown Tag, fieldType: Byte", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = new FieldTypeFloat(24, "GDALNoData");
      byte[] byteArray0 = new byte[11];
      byteArray0[0] = (byte)17;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-123);
      byteArray0[4] = (byte) (-92);
      byteArray0[5] = (byte) (-70);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(24, (-5487), fieldTypeFloat0, 1L, 24, byteArray0, byteOrder0, 65535);
      tiffField0.getDoubleArrayValue();
      assertEquals(24, tiffField0.getTag());
      assertEquals(4, tiffField0.getBytesLength());
      assertEquals(1L, tiffField0.getCount());
      assertEquals(65535, tiffField0.getSortHint());
      assertEquals(24, tiffField0.getOffset());
      assertEquals((-5487), tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)0;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte) (-32);
      TiffField tiffField0 = new TiffField((byte)0, 43, fieldTypeShort0, 1L, 0, byteArray1, byteOrder0, 43);
      tiffField0.getIntArrayValue();
      assertEquals(0, tiffField0.getTag());
      assertEquals(1L, tiffField0.getCount());
      assertEquals(43, tiffField0.getDirectoryType());
      assertEquals(2, tiffField0.getBytesLength());
      assertEquals(0, tiffField0.getOffset());
      assertEquals(43, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.LONG;
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)43;
      byteArray0[1] = (byte)43;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteOrder byteOrder1 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte)43;
      byteArray1[1] = (byte)43;
      byteArray1[2] = (byte)43;
      byteArray1[3] = (byte)43;
      TiffField tiffField0 = new TiffField((byte)43, (-5856), fieldTypeLong0, 91, (-5856), byteArray1, byteOrder1, (byte)43);
      tiffField0.getIntValueOrArraySum();
      TiffElement tiffElement0 = tiffField0.getOversizeValueElement();
      assertEquals(91L, tiffField0.getCount());
      assertNotNull(tiffElement0);
      assertEquals((-5856), tiffField0.getDirectoryType());
      assertEquals(364, tiffField0.getBytesLength());
      assertEquals((-5856L), tiffElement0.offset);
      assertEquals(43, tiffField0.getTag());
      assertEquals(43, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.LONG;
      byte[] byteArray0 = new byte[7];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FileSystemHandling.shouldAllThrowIOExceptions();
      TiffField tiffField0 = new TiffField((byte) (-83), (byte) (-83), fieldTypeLong0, (byte)4, (-1L), byteArray0, byteOrder0, 876);
      tiffField0.getDoubleArrayValue();
      assertEquals(16, tiffField0.getBytesLength());
      assertEquals((-83), tiffField0.getTag());
      assertEquals((-83), tiffField0.getDirectoryType());
      assertEquals(876, tiffField0.getSortHint());
      assertEquals((-1), tiffField0.getOffset());
      assertEquals(4L, tiffField0.getCount());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = new FieldTypeDouble(222, "|72>");
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)110;
      byteArray0[2] = (byte)110;
      byteArray0[4] = (byte)63;
      TiffField tiffField0 = new TiffField(627, 222, fieldTypeDouble0, 627, 222, byteArray0, (ByteOrder) null, 42112);
      tiffField0.getDoubleArrayValue();
      assertEquals(222, tiffField0.getDirectoryType());
      assertEquals(627, tiffField0.getTag());
      assertEquals(42112, tiffField0.getSortHint());
      assertEquals(222, tiffField0.getOffset());
      assertEquals(5016, tiffField0.getBytesLength());
      assertEquals(627L, tiffField0.getCount());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.BYTE;
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(48324, 0, fieldTypeByte0, 1L, 0L, byteArray0, byteOrder0, 48324);
      int int0 = tiffField0.getSortHint();
      assertEquals(48324, int0);
      
      String string0 = tiffField0.getTagName();
      assertEquals(48324, tiffField0.getTag());
      assertEquals(0, tiffField0.getOffset());
      assertEquals("ImageDataDiscard", string0);
      assertEquals(0, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteOrder byteOrder1 = ByteOrder.nativeOrder();
      FieldTypeShort fieldTypeShort0 = FieldType.SSHORT;
      TiffField tiffField0 = new TiffField(775, (-1275), fieldTypeShort0, 91, 1020L, byteArray0, byteOrder1, 775);
      int[] intArray0 = tiffField0.getIntArrayValue();
      assertEquals(91L, tiffField0.getCount());
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(1020, tiffField0.getOffset());
      assertEquals(775, tiffField0.getTag());
      assertEquals((-1275), tiffField0.getDirectoryType());
      assertEquals(775, tiffField0.getSortHint());
      assertEquals(182, tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = FieldType.RATIONAL;
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField((-744), 28, fieldTypeRational0, 4L, 28, byteArray0, byteOrder0, (-10));
      boolean boolean0 = tiffField0.isLocalValue();
      assertFalse(boolean0);
      
      tiffField0.getIntArrayValue();
      assertEquals(28, tiffField0.getDirectoryType());
      assertEquals(4L, tiffField0.getCount());
      assertEquals(28, tiffField0.getOffset());
      assertEquals((-744), tiffField0.getTag());
      assertEquals((-10), tiffField0.getSortHint());
      assertEquals(32, tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      Charset.defaultCharset();
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(458, (-1650), fieldTypeRational0, 4145, 28L, byteArray0, byteOrder0, 458);
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
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(4136, 41728, fieldTypeRational0, 4136, (-2215), byteArray0, byteOrder0, 41728);
      double[] doubleArray0 = tiffField0.getDoubleArrayValue();
      assertArrayEquals(new double[] {Double.NaN}, doubleArray0, 0.01);
      
      tiffField0.getFieldTypeName();
      TiffField.OversizeValueElement tiffField_OversizeValueElement0 = tiffField0.new OversizeValueElement(41728, 41728);
      assertEquals(41728, tiffField0.getDirectoryType());
      assertEquals(33088, tiffField0.getBytesLength());
      assertEquals(4136, tiffField0.getTag());
      assertEquals((-2215), tiffField0.getOffset());
      assertEquals(4136L, tiffField0.getCount());
      assertEquals(41728, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.UNDEFINED;
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-87);
      byteArray0[1] = (byte) (-87);
      byteArray0[2] = (byte) (-37);
      TiffField tiffField0 = new TiffField(336, 336, fieldTypeByte0, 1L, 1353L, byteArray0, (ByteOrder) null, 2138859215);
      assertEquals(1L, tiffField0.getCount());
      
      tiffField0.getIntValueOrArraySum();
      assertEquals(336, tiffField0.getDirectoryType());
      assertEquals(1, tiffField0.getBytesLength());
      assertEquals(1353, tiffField0.getOffset());
      assertEquals(336, tiffField0.getTag());
      assertEquals(2138859215, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      byte[] byteArray0 = new byte[18];
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1672);
      ByteBuffer byteBuffer1 = byteBuffer0.putLong((long) 1672);
      ByteOrder byteOrder0 = byteBuffer1.order();
      TiffField tiffField0 = new TiffField(42037, 42037, fieldTypeRational0, 352L, 42037, byteArray0, byteOrder0, 1672);
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
  public void test40()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.SBYTE;
      byte[] byteArray0 = new byte[104];
      FieldTypeByte fieldTypeByte1 = new FieldTypeByte(3, ">r)Zu");
      TiffField tiffField0 = new TiffField((byte) (-114), (byte) (-1), fieldTypeByte1, 2145372061, (byte) (-114), byteArray0, (ByteOrder) null, (byte) (-1));
      String string0 = tiffField0.getValueDescription();
      assertEquals((-1), tiffField0.getDirectoryType());
      assertEquals((-114), tiffField0.getTag());
      assertEquals((-1), tiffField0.getSortHint());
      assertEquals((-114), tiffField0.getOffset());
      assertNotNull(string0);
      assertEquals(2145372061, tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byte[] byteArray0 = new byte[319];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      ByteOrder.nativeOrder();
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      TiffField tiffField0 = new TiffField(2444, 2444, fieldTypeAscii0, 2444, 964L, byteArray0, byteOrder0, 2444);
      tiffField0.getValueDescription();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        tiffField0.getDoubleValue();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [Ljava.lang.String; cannot be cast to java.lang.Number
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.SBYTE;
      byte[] byteArray0 = new byte[104];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(46, 65535, fieldTypeByte0.SSHORT, 65535, 65535, byteArray0, byteOrder0, 65535);
      FieldTypeByte fieldTypeByte1 = FieldType.UNDEFINED;
      Object object0 = new Object();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder byteOrder1 = ByteOrder.BIG_ENDIAN;
      String string0 = tiffField0.toString();
      assertEquals(65535, tiffField0.getOffset());
      assertEquals(65535, tiffField0.getDirectoryType());
      assertEquals(65535, tiffField0.getSortHint());
      assertEquals(131070, tiffField0.getBytesLength());
      assertEquals("46 (0x2e: Unknown Tag): 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0... (52) (65535 SShort)", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byte[] byteArray0 = new byte[216];
      FieldTypeFloat fieldTypeFloat0 = new FieldTypeFloat(485, "");
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(4136, 4136, fieldTypeFloat0, 1240L, 485, byteArray0, byteOrder0, (-8));
      tiffField0.getValueDescription();
      Long.valueOf((long) 4136);
      int int0 = Float.SIZE;
      System.setCurrentTimeMillis(4136);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byte[] byteArray0 = new byte[304];
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FileSystemHandling fileSystemHandling2 = new FileSystemHandling();
      ByteOrder byteOrder1 = ByteOrder.BIG_ENDIAN;
      ByteOrder.nativeOrder();
      Object object0 = new Object();
      Object object1 = new Object();
      FieldTypeLong fieldTypeLong0 = FieldType.SLONG;
      TiffField tiffField0 = new TiffField((byte) (-90), (byte) (-90), fieldTypeLong0, 1278, (byte) (-90), byteArray0, byteOrder1, 46);
      String string0 = tiffField0.getValueDescription();
      assertNotNull(string0);
      
      int int0 = tiffField0.getSortHint();
      assertEquals(46, int0);
      
      tiffField0.getFieldTypeName();
      assertEquals((-90), tiffField0.getTag());
      assertEquals(5112, tiffField0.getBytesLength());
      assertEquals((-90), tiffField0.getDirectoryType());
      assertEquals((-90), tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[431];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      int int0 = 48322;
      ByteOrder byteOrder1 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(48322, 797, fieldTypeFloat0.DOUBLE, 48322, 48322, byteArray0, byteOrder0, 797);
      byte[] byteArray1 = new byte[0];
      ByteOrder.nativeOrder();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
      tiffField0.dump();
      Float float0 = new Float(21.1162345675);
      // Undeclared exception!
      try { 
        tiffField0.getIntValue();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [D cannot be cast to java.lang.Number
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }
}
