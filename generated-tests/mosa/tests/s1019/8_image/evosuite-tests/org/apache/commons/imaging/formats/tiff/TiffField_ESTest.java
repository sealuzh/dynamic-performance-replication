/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:28:53 GMT 2018
 */

package org.apache.commons.imaging.formats.tiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.nio.ByteOrder;
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
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffField_ESTest extends TiffField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      TiffField tiffField0 = new TiffField(0, 0, fieldTypeRational0, 0, 0, byteArray0, byteOrder0, 0);
      try { 
        tiffField0.getStringValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected String value(-1 (0xffffffff: Unknown Tag): ): [Lorg.apache.commons.imaging.common.RationalNumber;@685c703e
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[43];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(13, 13, fieldTypeFloat0, 13, 13, byteArray0, byteOrder0, 13);
      String string0 = tiffField0.getDescriptionWithoutValue();
      assertEquals(13, tiffField0.getOffset());
      assertEquals(13, tiffField0.getDirectoryType());
      assertEquals(13, tiffField0.getSortHint());
      assertFalse(tiffField0.isLocalValue());
      assertEquals("13 (0xd: Unknown Tag): ", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[30];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(13, 13, fieldTypeFloat0, 13, 13, byteArray0, byteOrder0, 13);
      TiffElement tiffElement0 = tiffField0.getOversizeValueElement();
      assertNotNull(tiffElement0);
      assertEquals(13, tiffField0.getTag());
      assertEquals(13L, tiffElement0.offset);
      assertEquals(13, tiffField0.getDirectoryType());
      assertEquals(13, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      TiffField tiffField0 = new TiffField(0, 0, fieldTypeRational0, 0, 0, byteArray0, byteOrder0, 0);
      int int0 = tiffField0.getSortHint();
      assertEquals(0, tiffField0.getTag());
      assertEquals(0, int0);
      assertEquals(0, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[55];
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(445, 1, fieldTypeAscii0, 1, 1, byteArray0, byteOrder0, (-431));
      String string0 = tiffField0.getValueDescription();
      assertEquals(445, tiffField0.getTag());
      assertEquals(1, tiffField0.getBytesLength());
      assertNotNull(string0);
      assertEquals(1, tiffField0.getDirectoryType());
      assertEquals((-431), tiffField0.getSortHint());
      assertEquals(1, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[29];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(0, 0, fieldTypeFloat0, 0, 0, byteArray0, byteOrder0, 0);
      TiffElement tiffElement0 = tiffField0.getOversizeValueElement();
      assertEquals(0, tiffField0.getTag());
      assertEquals(0, tiffField0.getSortHint());
      assertEquals(0, tiffField0.getDirectoryType());
      assertNull(tiffElement0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      TiffField tiffField0 = new TiffField(0, 0, fieldTypeRational0, 0, 0, byteArray0, byteOrder0, 0);
      // Undeclared exception!
      try { 
        tiffField0.getDoubleValue();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [Lorg.apache.commons.imaging.common.RationalNumber; cannot be cast to java.lang.Number
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[162];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(13, 13, fieldTypeFloat0, 13, 13, byteArray0, byteOrder0, 13);
      try { 
        tiffField0.getIntArrayValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [F@6e9e26e for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      TiffField tiffField0 = new TiffField(0, 0, fieldTypeRational0, 0, 0, byteArray0, byteOrder0, 0);
      tiffField0.dump();
      assertEquals(0, tiffField0.getSortHint());
      assertEquals(0, tiffField0.getDirectoryType());
      assertEquals(0, tiffField0.getBytesLength());
      assertEquals(0, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField((-1), (-1), fieldTypeFloat0, (-1), (-1), (byte[]) null, byteOrder0, (-1));
      int int0 = tiffField0.getDirectoryType();
      assertEquals((-1), tiffField0.getTag());
      assertEquals((-1), tiffField0.getSortHint());
      assertEquals((-1), tiffField0.getOffset());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[55];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      TiffField tiffField0 = new TiffField(43, 43, fieldTypeRational0, 43, 43, byteArray0, byteOrder0, 43);
      String string0 = tiffField0.getValueDescription();
      assertEquals(43, tiffField0.getSortHint());
      assertEquals(43, tiffField0.getTag());
      assertEquals(43L, tiffField0.getCount());
      assertEquals(43, tiffField0.getDirectoryType());
      assertEquals(43, tiffField0.getOffset());
      assertNotNull(string0);
      assertEquals(344, tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      TiffField tiffField0 = new TiffField(0, 0, fieldTypeRational0, 0, 0, byteArray0, byteOrder0, 0);
      String string0 = tiffField0.getTagName();
      assertEquals(0, tiffField0.getSortHint());
      assertEquals("Unknown Tag (0x0)", string0);
      assertEquals(0, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[57];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      TiffField tiffField0 = new TiffField(445, 445, fieldTypeDouble0, 8L, 8L, byteArray0, byteOrder0, 445);
      tiffField0.getValueDescription();
      // Undeclared exception!
      try { 
        tiffField0.dump((PrintWriter) null, "0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[45];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(45, 45, fieldTypeFloat0, 45, 45, byteArray0, byteOrder0, 45);
      TiffField.OversizeValueElement tiffField_OversizeValueElement0 = tiffField0.new OversizeValueElement(45, 45);
      String string0 = tiffField_OversizeValueElement0.getElementDescription(true);
      assertNull(string0);
      assertEquals(45, tiffField0.getDirectoryType());
      assertEquals(45, tiffField0.getTag());
      assertEquals(45, tiffField0.getSortHint());
      assertEquals(45, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[57];
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(459, 459, fieldTypeAscii0.IFD, 459, 459, byteArray0, byteOrder0, 459);
      String string0 = tiffField0.getValueDescription();
      assertNotNull(string0);
      
      tiffField0.getIntArrayValue();
      assertEquals(459, tiffField0.getTag());
      assertEquals(1836, tiffField0.getBytesLength());
      assertEquals(459L, tiffField0.getCount());
      assertEquals(459, tiffField0.getSortHint());
      assertEquals(459, tiffField0.getDirectoryType());
      assertEquals(459, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[34];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(1349, 1349, fieldTypeFloat0, 1349, 1349, byteArray0, byteOrder0, 1349);
      try { 
        tiffField0.getIntValueOrArraySum();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [F@477814ef for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[55];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeByte fieldTypeByte0 = FieldType.BYTE;
      TiffField tiffField0 = new TiffField(13, 13, fieldTypeByte0, 13, 13, byteArray0, byteOrder0, 13);
      TiffField.OversizeValueElement tiffField_OversizeValueElement0 = tiffField0.new OversizeValueElement(13, 13);
      String string0 = tiffField_OversizeValueElement0.getElementDescription(false);
      assertEquals(13, tiffField0.getDirectoryType());
      assertEquals("OversizeValueElement, tag: Unknown Tag, fieldType: Byte", string0);
      assertNotNull(string0);
      assertEquals(13, tiffField0.getOffset());
      assertEquals(13, tiffField0.getSortHint());
      assertEquals(13, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[70];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      TiffField tiffField0 = new TiffField((-9), (-9), fieldTypeShort0, 84, 84, byteArray0, byteOrder0, 84);
      String string0 = tiffField0.getValueDescription();
      assertEquals(84, tiffField0.getOffset());
      assertEquals(84, tiffField0.getSortHint());
      assertEquals((-9), tiffField0.getTag());
      assertEquals((-9), tiffField0.getDirectoryType());
      assertEquals(168, tiffField0.getBytesLength());
      assertEquals(84L, tiffField0.getCount());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[117];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(65517, 65517, fieldTypeFloat0.DOUBLE, 65517, 65517, byteArray0, byteOrder0, 65517);
      tiffField0.getDoubleArrayValue();
      assertEquals(65517, tiffField0.getTag());
      assertEquals(65517, tiffField0.getSortHint());
      assertEquals(65517L, tiffField0.getCount());
      assertEquals(524136, tiffField0.getBytesLength());
      assertEquals(65517, tiffField0.getDirectoryType());
      assertEquals(65517, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[55];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      ByteOrder byteOrder1 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(2338, 1, fieldTypeAscii0, 13, 2338, byteArray0, byteOrder1, 1);
      try { 
        tiffField0.getDoubleArrayValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [Ljava.lang.String;@4aa8157b for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      byte[] byteArray0 = new byte[8];
      TiffField tiffField0 = new TiffField(1089, 1089, fieldTypeRational0, 1089, 1089, byteArray0, byteOrder0, 1089);
      tiffField0.getFieldTypeName();
      assertEquals(1089, tiffField0.getTag());
      assertEquals(1089, tiffField0.getSortHint());
      assertEquals(1089, tiffField0.getDirectoryType());
      assertEquals(1089, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(1, 1, fieldTypeFloat0, 1, 1, byteArray0, byteOrder0, 1);
      tiffField0.toString();
      assertEquals(1, tiffField0.getOffset());
      assertEquals(1, tiffField0.getTag());
      assertEquals(1, tiffField0.getSortHint());
      assertEquals(4, tiffField0.getBytesLength());
      assertEquals(1, tiffField0.getDirectoryType());
      assertEquals(1L, tiffField0.getCount());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[54];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(3000, 3000, fieldTypeFloat0, 1L, 276L, byteArray0, byteOrder0, 3000);
      assertEquals(1L, tiffField0.getCount());
      
      tiffField0.getIntValue();
      tiffField0.getIntArrayValue();
      assertEquals(3000, tiffField0.getSortHint());
      assertEquals(3000, tiffField0.getTag());
      assertEquals(4, tiffField0.getBytesLength());
      assertEquals(276, tiffField0.getOffset());
      assertEquals(3000, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[152];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeShort fieldTypeShort0 = FieldType.SSHORT;
      TiffField tiffField0 = new TiffField(37, 37, fieldTypeShort0, 37, (-1888L), byteArray0, byteOrder0, 37);
      tiffField0.getIntArrayValue();
      assertEquals(37, tiffField0.getDirectoryType());
      assertEquals((-1888), tiffField0.getOffset());
      assertEquals(74, tiffField0.getBytesLength());
      assertEquals(37, tiffField0.getSortHint());
      assertEquals(37, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[53];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      TiffField tiffField0 = new TiffField((-9), (-9), fieldTypeShort0, 84, 84, byteArray0, byteOrder0, 84);
      tiffField0.getByteArrayValue();
      tiffField0.getDoubleArrayValue();
      String string0 = tiffField0.getValueDescription();
      assertEquals((-9), tiffField0.getTag());
      assertEquals((-9), tiffField0.getDirectoryType());
      assertEquals(168, tiffField0.getBytesLength());
      assertNotNull(string0);
      assertEquals(84, tiffField0.getOffset());
      assertEquals(84, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      TiffField tiffField0 = new TiffField(2, 2, fieldTypeRational0, 2, 2, byteArray0, byteOrder0, 2);
      tiffField0.getDoubleArrayValue();
      String string0 = tiffField0.getValueDescription();
      assertEquals(16, tiffField0.getBytesLength());
      assertEquals(2, tiffField0.getTag());
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals(2, tiffField0.getOffset());
      assertEquals(2, tiffField0.getDirectoryType());
      assertEquals(2, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      byte[] byteArray0 = new byte[8];
      TiffField tiffField0 = new TiffField(3951, 3951, fieldTypeRational0, 3951, 3951, byteArray0, byteOrder0, 3951);
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
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      TiffField tiffField0 = new TiffField(0, 0, fieldTypeRational0, 0, 0, byteArray0, byteOrder0, 0);
      tiffField0.getIntArrayValue();
      int int0 = tiffField0.getIntValueOrArraySum();
      assertEquals(0, tiffField0.getSortHint());
      assertEquals(0, tiffField0.getTag());
      assertEquals(0, tiffField0.getBytesLength());
      assertEquals(0, tiffField0.getDirectoryType());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      byte[] byteArray0 = new byte[0];
      TiffField tiffField0 = new TiffField(50711, 50711, fieldTypeRational0, 50711, 50711, byteArray0, byteOrder0, 50711);
      String string0 = tiffField0.getTagName();
      assertEquals("CFALayout", string0);
      assertEquals(50711, tiffField0.getOffset());
      assertEquals(50711, tiffField0.getDirectoryType());
      assertEquals(50711, tiffField0.getSortHint());
      assertEquals(50711, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[43];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(13, 13, fieldTypeFloat0, 13, 13, byteArray0, byteOrder0, 13);
      String string0 = tiffField0.getValueDescription();
      assertNotNull(string0);
      assertEquals("0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0", string0);
      
      tiffField0.getDoubleArrayValue();
      assertEquals(13, tiffField0.getSortHint());
      assertEquals(13, tiffField0.getDirectoryType());
      assertEquals(13, tiffField0.getTag());
      assertEquals(13, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[26];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeRational fieldTypeRational0 = FieldType.RATIONAL;
      TiffField tiffField0 = new TiffField((-1), 559, fieldTypeRational0, 559, (-1), byteArray0, byteOrder0, (-1));
      double[] doubleArray0 = tiffField0.getDoubleArrayValue();
      assertEquals(559, tiffField0.getDirectoryType());
      assertEquals((-1), tiffField0.getTag());
      assertEquals((-1), tiffField0.getSortHint());
      assertEquals((-1), tiffField0.getOffset());
      assertEquals(4472, tiffField0.getBytesLength());
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeAscii fieldTypeAscii0 = new FieldTypeAscii(0, (String) null);
      TiffField tiffField0 = new TiffField(54, 0, fieldTypeAscii0, 54, 0L, byteArray0, byteOrder0, 0);
      String string0 = tiffField0.getStringValue();
      assertEquals(0, tiffField0.getOffset());
      assertNotNull(string0);
      assertEquals(54, tiffField0.getTag());
      assertEquals(0, tiffField0.getSortHint());
      assertEquals(0, tiffField0.getDirectoryType());
      assertEquals(54, tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[55];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeByte fieldTypeByte0 = FieldType.BYTE;
      TiffField tiffField0 = new TiffField(13, 13, fieldTypeByte0, 13, 13, byteArray0, byteOrder0, 13);
      String string0 = tiffField0.getValueDescription();
      assertEquals(13, tiffField0.getOffset());
      assertEquals(13, tiffField0.getTag());
      assertEquals(13, tiffField0.getSortHint());
      assertEquals(13, tiffField0.getDirectoryType());
      assertEquals("0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[7];
      TiffField tiffField0 = new TiffField((-26), (-26), fieldTypeLong0, 11680L, (-26), byteArray0, byteOrder0, (-26));
      tiffField0.getDoubleArrayValue();
      tiffField0.getIntValueOrArraySum();
      assertEquals((-26), tiffField0.getTag());
      assertEquals(46720, tiffField0.getBytesLength());
      assertEquals((-26), tiffField0.getOffset());
      assertEquals((-26), tiffField0.getSortHint());
      assertEquals((-26), tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = FieldType.RATIONAL;
      byte[] byteArray0 = new byte[33];
      byteArray0[0] = (byte) (-1);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField((-336), 3576, fieldTypeRational0.SHORT, 1003L, (-336), byteArray0, byteOrder0, (-336));
      tiffField0.getIntValueOrArraySum();
      // Undeclared exception!
      try { 
        tiffField0.getIntValue();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [S cannot be cast to java.lang.Number
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[117];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(65517, 65517, fieldTypeFloat0.DOUBLE, 65517, 65517, byteArray0, byteOrder0, 65517);
      String string0 = tiffField0.toString();
      assertEquals(65517, tiffField0.getDirectoryType());
      assertEquals(65517, tiffField0.getSortHint());
      assertEquals(524136, tiffField0.getBytesLength());
      assertEquals(65517, tiffField0.getOffset());
      assertEquals("65517 (0xffed: Unknown Tag): 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 (65517 Double)", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(1, 1, fieldTypeFloat0, 1, 1, byteArray0, byteOrder0, 1);
      tiffField0.getIntValueOrArraySum();
      assertEquals(4, tiffField0.getBytesLength());
      assertEquals(1, tiffField0.getDirectoryType());
      assertEquals(1, tiffField0.getTag());
      assertEquals(1, tiffField0.getOffset());
      assertEquals(1, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byte[] byteArray0 = new byte[182];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      FieldTypeLong fieldTypeLong0 = new FieldTypeLong(31, ": ");
      TiffField tiffField0 = new TiffField(31, 31, fieldTypeLong0, 1L, 1L, byteArray0, byteOrder0, 31);
      tiffField0.getDoubleArrayValue();
      assertEquals(4, tiffField0.getBytesLength());
      assertEquals(31, tiffField0.getDirectoryType());
      assertEquals(31, tiffField0.getSortHint());
      assertEquals(31, tiffField0.getTag());
      assertEquals(1, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      byte[] byteArray0 = new byte[8];
      ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(3978, 3978, fieldTypeRational0, 3978, 3978, byteArray0, byteOrder0, 3978);
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
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[57];
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeLong fieldTypeLong0 = FieldType.LONG;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      TiffField tiffField0 = new TiffField(459, 459, fieldTypeAscii0, 459, 459, byteArray0, byteOrder0, 459);
      String string0 = tiffField0.getValueDescription();
      assertEquals(459, tiffField0.getSortHint());
      assertEquals(459, tiffField0.getTag());
      assertEquals(459, tiffField0.getOffset());
      assertEquals(459, tiffField0.getBytesLength());
      assertEquals(459, tiffField0.getDirectoryType());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[55];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      FieldTypeByte fieldTypeByte0 = FieldType.BYTE;
      TiffField tiffField0 = new TiffField(1236, 1236, fieldTypeByte0, 1236, 1236, byteArray0, byteOrder0, 1236);
      String string0 = tiffField0.getValueDescription();
      assertEquals(1236, tiffField0.getBytesLength());
      assertEquals(1236, tiffField0.getTag());
      assertEquals(1236, tiffField0.getSortHint());
      assertEquals(1236, tiffField0.getOffset());
      assertNotNull(string0);
      assertEquals(1236, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[204];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      FieldTypeShort fieldTypeShort0 = FieldType.SSHORT;
      TiffField tiffField0 = new TiffField(1426, 37387, fieldTypeShort0, 37387, 1L, byteArray0, byteOrder0, 33);
      String string0 = tiffField0.getValueDescription();
      assertEquals(74774, tiffField0.getBytesLength());
      assertEquals(1, tiffField0.getOffset());
      assertNotNull(string0);
      assertEquals(37387, tiffField0.getDirectoryType());
      assertEquals(33, tiffField0.getSortHint());
      assertEquals(1426, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[220];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(4022, 4022, fieldTypeLong0, 2222L, 2222L, byteArray0, byteOrder0, 4022);
      String string0 = tiffField0.getValueDescription();
      assertNotNull(string0);
      
      System.setCurrentTimeMillis(4022);
      tiffField0.getByteArrayValue();
      assertEquals(4022, tiffField0.getSortHint());
      assertEquals(4022, tiffField0.getDirectoryType());
      assertEquals(4022, tiffField0.getTag());
      assertEquals(2222, tiffField0.getOffset());
      assertEquals(8888, tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[210];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(65, 65, fieldTypeFloat0, 65, 65, byteArray0, byteOrder0, 65);
      String string0 = tiffField0.getValueDescription();
      assertEquals(65, tiffField0.getSortHint());
      assertEquals(65, tiffField0.getDirectoryType());
      assertNotNull(string0);
      assertEquals(65, tiffField0.getTag());
      assertEquals(65, tiffField0.getOffset());
      assertEquals("0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0... (52)", string0);
  }
}