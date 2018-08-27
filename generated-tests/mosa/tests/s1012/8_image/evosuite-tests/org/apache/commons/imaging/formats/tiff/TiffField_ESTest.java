/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:20:58 GMT 2018
 */

package org.apache.commons.imaging.formats.tiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffField_ESTest extends TiffField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(216, 216, fieldTypeFloat0, 216, 216, byteArray0, byteOrder0, 216);
      int int0 = tiffField0.getDirectoryType();
      assertEquals(216, tiffField0.getSortHint());
      assertEquals(216, tiffField0.getTag());
      assertEquals(216, int0);
      assertEquals(216, tiffField0.getOffset());
      assertEquals(864, tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[148];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      TiffField tiffField0 = new TiffField(50981, 50981, fieldTypeLong0, 50981, 50981, byteArray0, byteOrder0, 50981);
      TiffElement tiffElement0 = tiffField0.getOversizeValueElement();
      assertEquals(50981, tiffField0.getTag());
      assertEquals(50981L, tiffElement0.offset);
      assertNotNull(tiffElement0);
      assertEquals(50981, tiffField0.getDirectoryType());
      assertEquals(50981, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.UNDEFINED;
      byte[] byteArray0 = new byte[15];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(2321, 2321, fieldTypeByte0, 2321, 2321, byteArray0, byteOrder0, 2321);
      String string0 = tiffField0.toString();
      assertEquals(2321, tiffField0.getBytesLength());
      assertEquals(2321, tiffField0.getSortHint());
      assertEquals(2321, tiffField0.getOffset());
      assertEquals("2321 (0x911: Unknown Tag): 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 (2321 Undefined)", string0);
      assertEquals(2321, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[53];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(41522, 41522, fieldTypeFloat0, 41522, 41522, byteArray0, byteOrder0, 41522);
      String string0 = tiffField0.getDescriptionWithoutValue();
      assertEquals("41522 (0xa232: Unknown Tag): ", string0);
      assertEquals(41522, tiffField0.getDirectoryType());
      assertEquals(41522, tiffField0.getSortHint());
      assertEquals(41522, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[8];
      TiffField tiffField0 = new TiffField(4, 4, fieldTypeFloat0, 4, 4, byteArray0, byteOrder0, 4);
      try { 
        tiffField0.getStringValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected String value(-1 (0xffffffff: Unknown Tag): ): [F@6f5d8e7c
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.UNDEFINED;
      byte[] byteArray0 = new byte[15];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(2366, 2366, fieldTypeByte0, 2366, 2366, byteArray0, byteOrder0, 2366);
      tiffField0.getValue();
      TiffField.OversizeValueElement tiffField_OversizeValueElement0 = tiffField0.new OversizeValueElement(2366, 2366);
      String string0 = tiffField_OversizeValueElement0.getElementDescription(false);
      assertEquals(2366, tiffField0.getTag());
      assertEquals(2366, tiffField0.getSortHint());
      assertEquals(2366, tiffField0.getDirectoryType());
      assertEquals(2366, tiffField0.getBytesLength());
      assertEquals(2366L, tiffField0.getCount());
      assertNotNull(string0);
      assertEquals("OversizeValueElement, tag: Unknown Tag, fieldType: Undefined", string0);
      assertEquals(2366, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[53];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      TiffField tiffField0 = new TiffField(35, 48321, fieldTypeAscii0, 48321, 35, byteArray0, byteOrder0, 35);
      tiffField0.toString();
      assertEquals(35, tiffField0.getTag());
      assertEquals(48321, tiffField0.getBytesLength());
      assertEquals(48321, tiffField0.getDirectoryType());
      assertEquals(35, tiffField0.getOffset());
      assertEquals(48321L, tiffField0.getCount());
      assertEquals(35, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[10];
      TiffField tiffField0 = new TiffField(4, 4, fieldTypeFloat0, 4, 4, byteArray0, byteOrder0, 4);
      String string0 = tiffField0.toString();
      assertEquals("4 (0x4: Unknown Tag): 0.0, 0.0 (4 Float)", string0);
      
      int int0 = tiffField0.getSortHint();
      assertEquals(16, tiffField0.getBytesLength());
      assertEquals(4, tiffField0.getOffset());
      assertEquals(4, int0);
      assertEquals(4, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.UNDEFINED;
      byte[] byteArray0 = new byte[14];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(2321, 2321, fieldTypeByte0.DOUBLE, 2321, 2321, byteArray0, byteOrder0, 2321);
      try { 
        tiffField0.getIntValueOrArraySum();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [D@7287b58f for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[167];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      TiffField tiffField0 = new TiffField(51026, 51026, fieldTypeLong0, 51026, 51026, byteArray0, byteOrder0, 51026);
      tiffField0.getIntValueOrArraySum();
      tiffField0.dump();
      assertEquals(51026, tiffField0.getDirectoryType());
      assertEquals(51026, tiffField0.getOffset());
      assertEquals(51026, tiffField0.getTag());
      assertEquals(51026, tiffField0.getSortHint());
      assertEquals(204104, tiffField0.getBytesLength());
      assertEquals(51026L, tiffField0.getCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[148];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      TiffField tiffField0 = new TiffField(50981, 50981, fieldTypeLong0, 50981, 50981, byteArray0, byteOrder0, 50981);
      tiffField0.getDoubleArrayValue();
      assertEquals(50981L, tiffField0.getCount());
      assertEquals(203924, tiffField0.getBytesLength());
      assertEquals(50981, tiffField0.getOffset());
      assertEquals(50981, tiffField0.getTag());
      assertEquals(50981, tiffField0.getSortHint());
      assertEquals(50981, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      byte[] byteArray0 = new byte[16];
      TiffField tiffField0 = new TiffField(2321, 2321, fieldTypeDouble0, 2321, 2321, byteArray0, byteOrder0, 2321);
      tiffField0.getDoubleArrayValue();
      assertEquals(18568, tiffField0.getBytesLength());
      assertEquals(2321, tiffField0.getOffset());
      assertEquals(2321, tiffField0.getSortHint());
      assertEquals(2321, tiffField0.getTag());
      assertEquals(2321, tiffField0.getDirectoryType());
      assertEquals(2321L, tiffField0.getCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[210];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(253, 253, fieldTypeFloat0, 253, 253, byteArray0, byteOrder0, 253);
      tiffField0.getDoubleArrayValue();
      assertEquals(253, tiffField0.getDirectoryType());
      assertEquals(253L, tiffField0.getCount());
      assertEquals(1012, tiffField0.getBytesLength());
      assertEquals(253, tiffField0.getTag());
      assertEquals(253, tiffField0.getOffset());
      assertEquals(253, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[10];
      TiffField tiffField0 = new TiffField(1384, 1384, fieldTypeFloat0, 1384, 1384, byteArray0, byteOrder0, 1384);
      String string0 = tiffField0.getTagName();
      assertEquals("Unknown Tag (0x568)", string0);
      assertEquals(1384, tiffField0.getDirectoryType());
      assertEquals(1384, tiffField0.getSortHint());
      assertEquals(1384, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[12];
      TiffField tiffField0 = new TiffField(353, 353, fieldTypeShort0, 353, 353, byteArray0, byteOrder0, 353);
      int int0 = tiffField0.getIntValueOrArraySum();
      assertEquals(353, tiffField0.getOffset());
      assertEquals(706, tiffField0.getBytesLength());
      assertEquals(0, int0);
      assertEquals(353, tiffField0.getTag());
      assertEquals(353, tiffField0.getSortHint());
      assertEquals(353, tiffField0.getDirectoryType());
      assertEquals(353L, tiffField0.getCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[16];
      TiffField tiffField0 = new TiffField(308, 308, fieldTypeShort0, 308, 308, byteArray0, byteOrder0, 308);
      tiffField0.getFieldTypeName();
      tiffField0.getDoubleArrayValue();
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
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[120];
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(33, 33, fieldTypeDouble0, 33, 33, byteArray0, byteOrder0, 33);
      try { 
        tiffField0.getIntArrayValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [D@6fc9f50a for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[204];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(27, 27, fieldTypeFloat0, 27, 27, byteArray0, byteOrder0, 27);
      tiffField0.toString();
      // Undeclared exception!
      try { 
        tiffField0.dump((PrintWriter) null, "27 (0x1b: Unknown Tag): 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 (27 Float)");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[120];
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(0, 0, fieldTypeDouble0, 0, 0, byteArray0, byteOrder0, 0);
      tiffField0.getByteArrayValue();
      String string0 = tiffField0.getValueDescription();
      assertNotNull(string0);
      
      TiffElement tiffElement0 = tiffField0.getOversizeValueElement();
      assertEquals(0, tiffField0.getBytesLength());
      assertEquals(0, tiffField0.getSortHint());
      assertEquals(0, tiffField0.getTag());
      assertNull(tiffElement0);
      assertEquals(0, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[203];
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(1139, 1139, fieldTypeLong0, 1L, 1L, byteArray0, byteOrder0, 1139);
      tiffField0.toString();
      assertEquals(1139, tiffField0.getTag());
      assertEquals(4, tiffField0.getBytesLength());
      assertEquals(1139, tiffField0.getSortHint());
      assertEquals(1, tiffField0.getOffset());
      assertEquals(1139, tiffField0.getDirectoryType());
      assertEquals(1L, tiffField0.getCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.UNDEFINED;
      byte[] byteArray0 = new byte[15];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(2321, 2321, fieldTypeByte0, 2321, 2321, byteArray0, byteOrder0, 2321);
      try { 
        tiffField0.getDoubleArrayValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [B@2e6e7625 for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[203];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      TiffField tiffField0 = new TiffField(113, 113, fieldTypeDouble0, 113, 113, byteArray0, byteOrder0, 113);
      tiffField0.dump();
      TiffField.OversizeValueElement tiffField_OversizeValueElement0 = tiffField0.new OversizeValueElement(113, 113);
      String string0 = tiffField_OversizeValueElement0.getElementDescription(true);
      assertEquals(113, tiffField0.getDirectoryType());
      assertEquals(113, tiffField0.getSortHint());
      assertEquals(113, tiffField0.getTag());
      assertEquals(113, tiffField0.getOffset());
      assertNull(string0);
      assertEquals(904, tiffField0.getBytesLength());
      assertEquals(113L, tiffField0.getCount());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[9];
      TiffField tiffField0 = new TiffField(360, 360, fieldTypeShort0, 360, 360, byteArray0, byteOrder0, 360);
      tiffField0.getIntArrayValue();
      // Undeclared exception!
      try { 
        tiffField0.getDoubleValue();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [S cannot be cast to java.lang.Number
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[148];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      TiffField tiffField0 = new TiffField(50981, 50981, fieldTypeLong0, 50981, 50981, byteArray0, byteOrder0, 50981);
      String string0 = tiffField0.getTagName();
      assertEquals(50981, tiffField0.getOffset());
      assertEquals(50981, tiffField0.getDirectoryType());
      assertEquals(50981, tiffField0.getTag());
      assertEquals("ProfileLookTableDims", string0);
      assertEquals(50981, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeAscii fieldTypeAscii0 = new FieldTypeAscii(10, (String) null);
      byte[] byteArray0 = new byte[0];
      TiffField tiffField0 = new TiffField(10, 10, fieldTypeAscii0, 10, 10, byteArray0, byteOrder0, 24);
      tiffField0.dump();
      assertEquals(10L, tiffField0.getCount());
      assertEquals(10, tiffField0.getBytesLength());
      assertEquals(10, tiffField0.getTag());
      assertEquals(24, tiffField0.getSortHint());
      assertEquals(10, tiffField0.getOffset());
      assertEquals(10, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[12];
      TiffField tiffField0 = new TiffField(353, 353, fieldTypeShort0, 353, 353, byteArray0, byteOrder0, 353);
      String string0 = tiffField0.getValueDescription();
      assertEquals(353L, tiffField0.getCount());
      assertEquals(353, tiffField0.getTag());
      assertEquals(353, tiffField0.getSortHint());
      assertEquals(353, tiffField0.getOffset());
      assertEquals(706, tiffField0.getBytesLength());
      assertNotNull(string0);
      assertEquals(353, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeRational fieldTypeRational0 = new FieldTypeRational(195, "SMaxSampleValue");
      TiffField tiffField0 = new TiffField(195, 195, fieldTypeRational0, 195, 195, byteArray0, byteOrder0, 195);
      tiffField0.getIntArrayValue();
      assertEquals(195, tiffField0.getOffset());
      assertEquals(195L, tiffField0.getCount());
      assertEquals(1560, tiffField0.getBytesLength());
      assertEquals(195, tiffField0.getTag());
      assertEquals(195, tiffField0.getDirectoryType());
      assertEquals(195, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[203];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      FieldTypeRational fieldTypeRational0 = new FieldTypeRational(0, "");
      TiffField tiffField0 = new TiffField(65535, 65535, fieldTypeRational0, 65535, 0, byteArray0, byteOrder0, 65535);
      tiffField0.toString();
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
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[150];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      TiffField tiffField0 = new TiffField(51000, 969, fieldTypeRational0, 51000, 51000, byteArray0, byteOrder0, 28);
      tiffField0.getDoubleArrayValue();
      assertEquals(51000, tiffField0.getOffset());
      assertEquals(51000L, tiffField0.getCount());
      assertEquals(51000, tiffField0.getTag());
      assertEquals(408000, tiffField0.getBytesLength());
      assertEquals(28, tiffField0.getSortHint());
      assertEquals(969, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[53];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      ByteOrder byteOrder1 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField((byte)80, (byte)80, fieldTypeRational0, 1L, 7724L, byteArray0, byteOrder1, (byte)80);
      String string0 = File.separator;
      tiffField0.getTag();
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
  public void test30()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      byte[] byteArray0 = new byte[16];
      TiffField tiffField0 = new TiffField(1, 1, fieldTypeDouble0, 1, 591L, byteArray0, byteOrder0, 1);
      tiffField0.getDoubleArrayValue();
      assertEquals(1L, tiffField0.getCount());
      assertEquals(1, tiffField0.getSortHint());
      assertEquals(1, tiffField0.getDirectoryType());
      assertEquals(1, tiffField0.getTag());
      assertEquals(8, tiffField0.getBytesLength());
      assertEquals(591, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[148];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      TiffField tiffField0 = new TiffField(50981, 50981, fieldTypeLong0, 50981, 50981, byteArray0, byteOrder0, 50981);
      tiffField0.getIntArrayValue();
      assertEquals(203924, tiffField0.getBytesLength());
      assertEquals(50981, tiffField0.getSortHint());
      assertEquals(50981, tiffField0.getDirectoryType());
      assertEquals(50981, tiffField0.getTag());
      assertEquals(50981L, tiffField0.getCount());
      assertEquals(50981, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[148];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      ByteOrder byteOrder1 = ByteOrder.BIG_ENDIAN;
      FieldTypeAscii fieldTypeAscii0 = new FieldTypeAscii(267, "dl`Dicy:.bM{p}s= q");
      TiffField tiffField0 = new TiffField(267, 267, fieldTypeAscii0, 0L, (-1L), byteArray0, byteOrder0, 267);
      String string0 = tiffField0.getStringValue();
      assertEquals(267, tiffField0.getSortHint());
      assertNotNull(string0);
      assertEquals(267, tiffField0.getTag());
      assertEquals((-1), tiffField0.getOffset());
      assertEquals(267, tiffField0.getDirectoryType());
      assertEquals(0, tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(239, 239, fieldTypeShort0, 1L, 1L, byteArray0, byteOrder0, 239);
      tiffField0.getIntValueOrArraySum();
      assertEquals(2, tiffField0.getBytesLength());
      assertEquals(1L, tiffField0.getCount());
      assertEquals(239, tiffField0.getDirectoryType());
      assertEquals(239, tiffField0.getSortHint());
      assertEquals(1, tiffField0.getOffset());
      assertEquals(239, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      ByteOrder byteOrder1 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(7096, 32809, fieldTypeShort0.RATIONAL, 7096, 7096, byteArray0, byteOrder0, 7096);
      int int0 = tiffField0.getIntValueOrArraySum();
      assertEquals(0, int0);
      
      String string0 = tiffField0.getValueDescription();
      assertEquals(7096L, tiffField0.getCount());
      assertEquals(56768, tiffField0.getBytesLength());
      assertEquals(32809, tiffField0.getDirectoryType());
      assertEquals(7096, tiffField0.getSortHint());
      assertEquals(7096, tiffField0.getTag());
      assertEquals(7096, tiffField0.getOffset());
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[53];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      ByteOrder byteOrder1 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(7102, 32809, fieldTypeShort0.RATIONAL, 7102, 7102, byteArray0, byteOrder0, 7102);
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
      byte[] byteArray0 = new byte[203];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      FieldTypeByte fieldTypeByte0 = FieldType.SBYTE;
      TiffField tiffField0 = new TiffField(37377, 37377, fieldTypeByte0, 37377, 37377, byteArray0, byteOrder0, 37377);
      tiffField0.dump();
      assertEquals(37377, tiffField0.getSortHint());
      assertEquals(37377, tiffField0.getTag());
      assertEquals(37377L, tiffField0.getCount());
      assertEquals(37377, tiffField0.getOffset());
      assertEquals(37377, tiffField0.getBytesLength());
      assertEquals(37377, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[268];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      ByteOrder.nativeOrder();
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      TiffField tiffField0 = new TiffField(867, 867, fieldTypeShort0, 867, 867, byteArray0, byteOrder0, 867);
      tiffField0.dump();
      assertEquals(1734, tiffField0.getBytesLength());
      assertEquals(867, tiffField0.getSortHint());
      assertEquals(867, tiffField0.getOffset());
      assertEquals(867L, tiffField0.getCount());
      assertEquals(867, tiffField0.getTag());
      assertEquals(867, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[208];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(301, 301, fieldTypeFloat0, 301, 301, byteArray0, byteOrder0, 301);
      String string0 = tiffField0.toString();
      assertEquals(301, tiffField0.getDirectoryType());
      assertEquals(301, tiffField0.getSortHint());
      assertEquals(1204, tiffField0.getBytesLength());
      assertEquals("301 (0x12d: TransferFunction): 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0... (52) (301 Float)", string0);
      assertEquals(301, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte[] byteArray0 = new byte[210];
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      TiffField tiffField0 = new TiffField(1133, 1133, fieldTypeLong0, 1133, 1133, byteArray0, (ByteOrder) null, 1133);
      tiffField0.dump();
      assertEquals(1133, tiffField0.getDirectoryType());
      assertEquals(1133L, tiffField0.getCount());
      assertEquals(4532, tiffField0.getBytesLength());
      assertEquals(1133, tiffField0.getOffset());
      assertEquals(1133, tiffField0.getTag());
      assertEquals(1133, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[420];
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(1372, 1372, fieldTypeDouble0, 1372, 1372, byteArray0, byteOrder0, 1372);
      tiffField0.dump();
      assertEquals(1372, tiffField0.getOffset());
      assertEquals(10976, tiffField0.getBytesLength());
      assertEquals(1372, tiffField0.getDirectoryType());
      assertEquals(1372, tiffField0.getTag());
      assertEquals(1372, tiffField0.getSortHint());
      assertEquals(1372L, tiffField0.getCount());
  }
}