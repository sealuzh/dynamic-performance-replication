/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 15:45:58 GMT 2018
 */

package org.apache.commons.imaging.formats.tiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
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
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      byte[] byteArray0 = new byte[10];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(4961, 4961, fieldTypeLong0, 4961, 4961, byteArray0, byteOrder0, 4961);
      tiffField0.dump();
      assertEquals(4961L, tiffField0.getCount());
      assertEquals(4961, tiffField0.getTag());
      assertEquals(4961, tiffField0.getSortHint());
      assertEquals(19844, tiffField0.getBytesLength());
      assertEquals(4961, tiffField0.getOffset());
      assertEquals(4961, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[86];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(102, 102, fieldTypeFloat0, 102, 102, byteArray0, byteOrder0, 102);
      try { 
        tiffField0.getIntArrayValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [F@380406dc for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[86];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(71, 71, fieldTypeFloat0, 71, 71, byteArray0, byteOrder0, 71);
      try { 
        tiffField0.getStringValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected String value(-1 (0xffffffff: Unknown Tag): ): [F@62d419b1
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[4];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(112, 112, fieldTypeFloat0, 112, 112, byteArray0, byteOrder0, 112);
      tiffField0.getDoubleArrayValue();
      assertEquals(112L, tiffField0.getCount());
      assertEquals(112, tiffField0.getTag());
      assertEquals(112, tiffField0.getDirectoryType());
      assertEquals(112, tiffField0.getSortHint());
      assertEquals(448, tiffField0.getBytesLength());
      assertEquals(112, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[85];
      FieldTypeShort fieldTypeShort0 = FieldType.SSHORT;
      TiffField tiffField0 = new TiffField(5, 5, fieldTypeShort0, 691L, 1052L, byteArray0, byteOrder0, 5);
      tiffField0.dump();
      tiffField0.getDoubleArrayValue();
      assertEquals(691L, tiffField0.getCount());
      assertEquals(5, tiffField0.getTag());
      assertEquals(5, tiffField0.getSortHint());
      assertEquals(1382, tiffField0.getBytesLength());
      assertEquals(5, tiffField0.getDirectoryType());
      assertEquals(1052, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[114];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(77, 77, fieldTypeFloat0, 77, 77, byteArray0, byteOrder0, 77);
      String string0 = tiffField0.getDescriptionWithoutValue();
      assertEquals("77 (0x4d: Unknown Tag): ", string0);
      assertEquals(77, tiffField0.getOffset());
      assertEquals(77, tiffField0.getSortHint());
      assertEquals(77, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[338];
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      TiffField tiffField0 = new TiffField(12, (-932), fieldTypeDouble0, (-932), (-609L), byteArray0, byteOrder0, 12);
      String string0 = tiffField0.getTagName();
      assertEquals(12, tiffField0.getSortHint());
      assertEquals((-7456), tiffField0.getBytesLength());
      assertEquals("GPSSpeedRef", string0);
      assertEquals((-609), tiffField0.getOffset());
      assertEquals(12, tiffField0.getTag());
      assertEquals((-932), tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      byte[] byteArray0 = new byte[10];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(4961, 4961, fieldTypeLong0, 4961, 4961, byteArray0, byteOrder0, 4961);
      tiffField0.getFieldTypeName();
      assertEquals(4961, tiffField0.getOffset());
      assertEquals(4961, tiffField0.getSortHint());
      assertEquals(4961, tiffField0.getTag());
      assertEquals(4961, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[5];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      FieldTypeByte fieldTypeByte0 = FieldType.UNDEFINED;
      TiffField tiffField0 = new TiffField(32, 32, fieldTypeByte0, 32, 32, byteArray0, byteOrder0, 32);
      tiffField0.dump();
      assertEquals(32, tiffField0.getOffset());
      assertEquals(32, tiffField0.getSortHint());
      assertEquals(32, tiffField0.getTag());
      assertEquals(32, tiffField0.getBytesLength());
      assertEquals(32, tiffField0.getDirectoryType());
      assertEquals(32L, tiffField0.getCount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      byte[] byteArray0 = new byte[10];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(4961, 4961, fieldTypeLong0, 4961, 4961, byteArray0, byteOrder0, 4961);
      int int0 = tiffField0.getSortHint();
      assertEquals(4961, tiffField0.getDirectoryType());
      assertEquals(4961, tiffField0.getTag());
      assertEquals(4961, tiffField0.getOffset());
      assertEquals(4961, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[67];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(71, 71, fieldTypeFloat0, 71, 71, byteArray0, byteOrder0, 71);
      TiffElement tiffElement0 = tiffField0.getOversizeValueElement();
      assertEquals(71L, tiffElement0.offset);
      assertEquals(71, tiffField0.getDirectoryType());
      assertEquals(71, tiffField0.getTag());
      assertEquals(71, tiffField0.getSortHint());
      assertNotNull(tiffElement0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[4];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(0, 0, fieldTypeFloat0, 0, 0, byteArray0, byteOrder0, 0);
      tiffField0.dump();
      TiffElement tiffElement0 = tiffField0.getOversizeValueElement();
      assertNull(tiffElement0);
      assertEquals(0, tiffField0.getSortHint());
      assertEquals(0, tiffField0.getDirectoryType());
      assertEquals(0, tiffField0.getTag());
      assertEquals(0, tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[62];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(71, 71, fieldTypeFloat0, 71, 71, byteArray0, byteOrder0, 71);
      String string0 = tiffField0.getTagName();
      assertEquals(71, tiffField0.getDirectoryType());
      assertEquals("Unknown Tag (0x47)", string0);
      assertEquals(71, tiffField0.getSortHint());
      assertEquals(71, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[208];
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      TiffField tiffField0 = new TiffField(2320, 2320, fieldTypeDouble0, 2320, 2320, byteArray0, byteOrder0, 2320);
      String string0 = tiffField0.getValueDescription();
      assertEquals(2320L, tiffField0.getCount());
      assertNotNull(string0);
      assertEquals(2320, tiffField0.getSortHint());
      assertEquals(2320, tiffField0.getDirectoryType());
      assertEquals(2320, tiffField0.getTag());
      assertEquals(18560, tiffField0.getBytesLength());
      assertEquals(2320, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[194];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(140, 140, fieldTypeFloat0, 140, 140, byteArray0, byteOrder0, 140);
      try { 
        tiffField0.getIntValueOrArraySum();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [F@4b94ec45 for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      byte[] byteArray0 = new byte[1];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(51008, 51008, fieldTypeRational0, 51008, 51008, byteArray0, byteOrder0, (-1072));
      int int0 = tiffField0.getIntValueOrArraySum();
      assertEquals(408064, tiffField0.getBytesLength());
      assertEquals(51008, tiffField0.getOffset());
      assertEquals((-1072), tiffField0.getSortHint());
      assertEquals(0, int0);
      assertEquals(51008, tiffField0.getTag());
      assertEquals(51008, tiffField0.getDirectoryType());
      assertEquals(51008L, tiffField0.getCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      byte[] byteArray0 = new byte[15];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(4961, 4961, fieldTypeLong0, 4961, 4961, byteArray0, byteOrder0, 4961);
      tiffField0.getIntArrayValue();
      // Undeclared exception!
      try { 
        tiffField0.getDoubleValue();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [I cannot be cast to java.lang.Number
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[172];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(112, 112, fieldTypeFloat0, 112, 112, byteArray0, byteOrder0, 112);
      tiffField0.dump();
      // Undeclared exception!
      try { 
        tiffField0.dump((PrintWriter) null, "ProfileHueSatMapDims");
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
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      byte[] byteArray0 = new byte[2];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(51008, 51008, fieldTypeRational0, 51008, 51008, byteArray0, byteOrder0, (-1072));
      tiffField0.getIntArrayValue();
      assertEquals((-1072), tiffField0.getSortHint());
      assertEquals(408064, tiffField0.getBytesLength());
      assertEquals(51008, tiffField0.getOffset());
      assertEquals(51008, tiffField0.getTag());
      assertEquals(51008L, tiffField0.getCount());
      assertEquals(51008, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      byte[] byteArray0 = new byte[10];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(4961, 4961, fieldTypeLong0, 4961, 4961, byteArray0, byteOrder0, 4961);
      tiffField0.getIntValueOrArraySum();
      int int0 = tiffField0.getBytesLength();
      assertEquals(19844, int0);
      assertEquals(4961, tiffField0.getTag());
      assertEquals(4961L, tiffField0.getCount());
      assertEquals(4961, tiffField0.getDirectoryType());
      assertEquals(4961, tiffField0.getSortHint());
      assertEquals(4961, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[173];
      FieldTypeRational fieldTypeRational0 = new FieldTypeRational(803, "");
      TiffField tiffField0 = new TiffField(803, 1994, fieldTypeRational0, 1994, 803, byteArray0, byteOrder0, 803);
      tiffField0.dump();
      assertEquals(803, tiffField0.getOffset());
      assertEquals(1994, tiffField0.getDirectoryType());
      assertEquals(15952, tiffField0.getBytesLength());
      assertEquals(803, tiffField0.getSortHint());
      assertEquals(1994L, tiffField0.getCount());
      assertEquals(803, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[387];
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      TiffField tiffField0 = new TiffField(2202, 2202, fieldTypeDouble0, 2202, 2202, byteArray0, byteOrder0, 2202);
      tiffField0.getDoubleArrayValue();
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

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.UNDEFINED;
      byte[] byteArray0 = new byte[0];
      TiffField tiffField0 = new TiffField(0, 1, fieldTypeByte0, 32L, 5578L, byteArray0, (ByteOrder) null, 65101);
      try { 
        tiffField0.getDoubleArrayValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [B@72d32cc6 for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[62];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(71, 71, fieldTypeFloat0, 71, 71, byteArray0, byteOrder0, 71);
      int int0 = tiffField0.getDirectoryType();
      assertEquals(71, tiffField0.getSortHint());
      assertEquals(71, int0);
      assertEquals(71, tiffField0.getOffset());
      assertEquals(71, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      byte[] byteArray0 = new byte[10];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(4961, 4961, fieldTypeLong0, 4961, 4961, byteArray0, byteOrder0, 4961);
      tiffField0.getDoubleArrayValue();
      assertEquals(4961, tiffField0.getTag());
      assertEquals(4961, tiffField0.getOffset());
      assertEquals(19844, tiffField0.getBytesLength());
      assertEquals(4961, tiffField0.getSortHint());
      assertEquals(4961, tiffField0.getDirectoryType());
      assertEquals(4961L, tiffField0.getCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[173];
      FieldTypeRational fieldTypeRational0 = new FieldTypeRational(803, "");
      TiffField tiffField0 = new TiffField(803, 1994, fieldTypeRational0, 1994, 803, byteArray0, byteOrder0, 803);
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
  public void test26()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      ByteOrder.nativeOrder();
      byte[] byteArray0 = new byte[91];
      FieldTypeShort fieldTypeShort0 = FieldType.SSHORT;
      ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(75, 75, fieldTypeShort0, 75, 75, byteArray0, byteOrder0, 75);
      tiffField0.getIntArrayValue();
      int int0 = tiffField0.getIntValueOrArraySum();
      assertEquals(75, tiffField0.getOffset());
      assertEquals(0, int0);
      assertEquals(150, tiffField0.getBytesLength());
      assertEquals(75, tiffField0.getTag());
      assertEquals(75, tiffField0.getSortHint());
      assertEquals(75L, tiffField0.getCount());
      assertEquals(75, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[157];
      FieldTypeLong fieldTypeLong0 = FieldType.SLONG;
      TiffField tiffField0 = new TiffField(1, 0, fieldTypeLong0, 1, 0, byteArray0, byteOrder0, 0);
      int int0 = Float.SIZE;
      tiffField0.getDoubleArrayValue();
      assertEquals(0, tiffField0.getOffset());
      assertEquals(0, tiffField0.getDirectoryType());
      assertEquals(0, tiffField0.getSortHint());
      assertEquals(1L, tiffField0.getCount());
      assertEquals(1, tiffField0.getTag());
      assertEquals(4, tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[7];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(103, 103, fieldTypeFloat0, 103, 103, byteArray0, byteOrder0, 103);
      TiffField.OversizeValueElement tiffField_OversizeValueElement0 = tiffField0.new OversizeValueElement(103, 103);
      String string0 = tiffField_OversizeValueElement0.getElementDescription(false);
      assertEquals(103, tiffField0.getSortHint());
      assertEquals("OversizeValueElement, tag: Unknown Tag, fieldType: Float", string0);
      assertNotNull(string0);
      assertEquals(103, tiffField0.getOffset());
      assertEquals(103, tiffField0.getTag());
      assertEquals(103, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[172];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(99, 99, fieldTypeFloat0, 99, 99, byteArray0, byteOrder0, 99);
      TiffField.OversizeValueElement tiffField_OversizeValueElement0 = tiffField0.new OversizeValueElement(99, 99);
      String string0 = tiffField_OversizeValueElement0.getElementDescription(true);
      assertEquals(99, tiffField0.getOffset());
      assertNull(string0);
      assertEquals(99, tiffField0.getSortHint());
      assertEquals(99, tiffField0.getDirectoryType());
      assertEquals(99, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = FieldType.RATIONAL;
      byte[] byteArray0 = new byte[12];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(51008, 51008, fieldTypeRational0, 51008, 51008, byteArray0, byteOrder0, 51008);
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
  public void test31()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[177];
      FieldTypeRational fieldTypeRational0 = new FieldTypeRational(52, (String) null);
      TiffField tiffField0 = new TiffField(52, 52, fieldTypeRational0, 1625L, 52, byteArray0, byteOrder0, (-568));
      tiffField0.toString();
      tiffField0.getDoubleArrayValue();
      assertEquals((-568), tiffField0.getSortHint());
      assertEquals(52, tiffField0.getDirectoryType());
      
      TiffField tiffField1 = new TiffField((-568), (-3841), fieldTypeRational0, 1625L, (-568), byteArray0, byteOrder0, (-3841));
      long long0 = tiffField1.getCount();
      assertEquals(1625L, long0);
      
      String string0 = tiffField1.getValueDescription();
      assertEquals((-568), tiffField1.getTag());
      assertNotNull(string0);
      assertEquals((-568), tiffField1.getOffset());
      assertEquals((-3841), tiffField1.getDirectoryType());
      assertEquals(13000, tiffField1.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[1];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      FieldType fieldType0 = FieldType.getFieldType(2);
      TiffField tiffField0 = new TiffField(2, 2, fieldType0, 2, 2, byteArray0, byteOrder0, 2);
      String string0 = tiffField0.getValueDescription();
      assertEquals(2, tiffField0.getTag());
      assertEquals(2, tiffField0.getBytesLength());
      assertNotNull(string0);
      assertEquals(2, tiffField0.getOffset());
      assertEquals(2, tiffField0.getSortHint());
      assertEquals(2, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[86];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(134, 134, fieldTypeFloat0, 1L, 134, byteArray0, byteOrder0, 21);
      assertEquals(1L, tiffField0.getCount());
      
      tiffField0.getIntArrayValue();
      assertEquals(134, tiffField0.getOffset());
      assertEquals(4, tiffField0.getBytesLength());
      assertEquals(134, tiffField0.getTag());
      assertEquals(21, tiffField0.getSortHint());
      assertEquals(134, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      FieldTypeAscii fieldTypeAscii0 = new FieldTypeAscii(1219, "HAMP\"CEup`Ca@3+x\"");
      byte[] byteArray0 = new byte[0];
      TiffField tiffField0 = new TiffField(1219, 1219, fieldTypeAscii0, 1219, 1219, byteArray0, byteOrder0, 9);
      String string0 = tiffField0.getStringValue();
      assertEquals(1219, tiffField0.getOffset());
      assertEquals(9, tiffField0.getSortHint());
      assertEquals(1219, tiffField0.getBytesLength());
      assertEquals(1219, tiffField0.getDirectoryType());
      assertNotNull(string0);
      assertEquals(1219, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[161];
      FieldTypeLong fieldTypeLong0 = FieldType.SLONG;
      TiffField tiffField0 = new TiffField(1, 1, fieldTypeLong0, 1, 1, byteArray0, byteOrder0, 1);
      tiffField0.dump();
      tiffField0.getIntValueOrArraySum();
      int int0 = tiffField0.getTag();
      assertEquals(1, int0);
      assertEquals(1, tiffField0.getOffset());
      assertEquals(1, tiffField0.getDirectoryType());
      assertEquals(4, tiffField0.getBytesLength());
      assertEquals(1, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[172];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      FieldTypeByte fieldTypeByte0 = FieldType.UNDEFINED;
      TiffField tiffField0 = new TiffField(34, 2135, fieldTypeByte0, 2135, 2135, byteArray0, byteOrder0, 2135);
      String string0 = tiffField0.getValueDescription();
      assertEquals(2135, tiffField0.getSortHint());
      assertNotNull(string0);
      assertEquals(2135, tiffField0.getBytesLength());
      assertEquals(2135, tiffField0.getDirectoryType());
      assertEquals(2135, tiffField0.getOffset());
      assertEquals(34, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[67];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      FieldTypeAscii fieldTypeAscii0 = FieldType.ASCII;
      TiffField tiffField0 = new TiffField((-3807), (-3807), fieldTypeAscii0, 1974L, 2271L, byteArray0, byteOrder0, (-3807));
      tiffField0.dump();
      assertEquals(2271, tiffField0.getOffset());
      assertEquals((-3807), tiffField0.getDirectoryType());
      assertEquals(1974, tiffField0.getBytesLength());
      assertEquals((-3807), tiffField0.getTag());
      assertEquals((-3807), tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      byte[] byteArray0 = new byte[110];
      FieldTypeShort fieldTypeShort0 = FieldType.SSHORT;
      TiffField tiffField0 = new TiffField(74, 74, fieldTypeShort0, 74, (-300L), byteArray0, byteOrder0, 74);
      tiffField0.dump();
      assertEquals((-300), tiffField0.getOffset());
      assertEquals(148, tiffField0.getBytesLength());
      assertEquals(74, tiffField0.getDirectoryType());
      assertEquals(74, tiffField0.getSortHint());
      assertEquals(74, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[222];
      FieldTypeLong fieldTypeLong0 = FieldType.LONG;
      TiffField tiffField0 = new TiffField(3306, 3306, fieldTypeLong0, 3306, 3306, byteArray0, byteOrder0, 3306);
      tiffField0.dump();
      assertEquals(3306, tiffField0.getDirectoryType());
      assertEquals(3306, tiffField0.getTag());
      assertEquals(3306, tiffField0.getSortHint());
      assertEquals(3306, tiffField0.getOffset());
      assertEquals(13224, tiffField0.getBytesLength());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[222];
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      TiffField tiffField0 = new TiffField(2341, 2341, fieldTypeFloat0, 2341, 2341, byteArray0, byteOrder0, 2341);
      String string0 = tiffField0.getValueDescription();
      assertEquals(9364, tiffField0.getBytesLength());
      assertEquals(2341, tiffField0.getOffset());
      assertEquals(2341, tiffField0.getTag());
      assertEquals(2341, tiffField0.getSortHint());
      assertNotNull(string0);
      assertEquals(2341, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[420];
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(2232);
      CharBuffer charBuffer0 = byteBuffer0.asCharBuffer();
      char[] charArray0 = new char[8];
      charArray0[0] = 'M';
      charArray0[1] = 'Q';
      charArray0[2] = ',';
      charArray0[3] = '&';
      charArray0[4] = 'R';
      charArray0[5] = '$';
      charArray0[6] = '>';
      charArray0[7] = '<';
      CharBuffer charBuffer1 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer2 = charBuffer0.put(charBuffer1);
      ByteOrder byteOrder1 = charBuffer2.order();
      TiffField tiffField0 = new TiffField((-14), (-697), fieldTypeDouble0, 2232, (-1L), byteArray0, byteOrder1, 2232);
      // Undeclared exception!
      try { 
        tiffField0.dump((PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }
}