/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 22:15:58 GMT 2019
 */

package org.apache.commons.imaging.formats.tiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.PrintWriter;
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
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiffField_ESTest extends TiffField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      byte[] byteArray0 = new byte[2];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byteArray0[0] = (byte)31;
      TiffField tiffField0 = new TiffField(50, 850, fieldTypeShort0, 850, 50, byteArray0, byteOrder0, 50);
      int int0 = tiffField0.getIntValueOrArraySum();
      assertEquals(50, tiffField0.getOffset());
      assertEquals(850, tiffField0.getDirectoryType());
      assertEquals(50, tiffField0.getSortHint());
      assertEquals(50, tiffField0.getTag());
      assertEquals(31, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      byte[] byteArray0 = new byte[5];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(1280, 1280, fieldTypeDouble0, 1280, 0L, byteArray0, byteOrder0, (byte) (-88));
      String string0 = tiffField0.getValueDescription();
      assertEquals((-88), tiffField0.getSortHint());
      assertEquals(0, tiffField0.getOffset());
      assertEquals(1280, tiffField0.getDirectoryType());
      assertNotNull(string0);
      assertEquals(1280, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = new FieldTypeDouble((-223), (String) null);
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField((-223), (-147), fieldTypeDouble0, 0L, 0L, byteArray0, byteOrder0, (byte)20);
      int int0 = tiffField0.getTag();
      assertEquals((-147), tiffField0.getDirectoryType());
      assertEquals(20, tiffField0.getSortHint());
      assertEquals((-223), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.SLONG;
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-2);
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(2054, (-1939), fieldTypeLong0, 2054, (-640L), byteArray0, byteOrder0, (-1));
      tiffField0.getIntValueOrArraySum();
      assertEquals(2054, tiffField0.getTag());
      assertEquals((-640), tiffField0.getOffset());
      assertEquals((-1939), tiffField0.getDirectoryType());
      assertEquals((-1), tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = new FieldTypeByte(614, "ZVpSVe8\b'm3");
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-57);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "ZVpSVe8\b'm3");
      ByteOrder byteOrder0 = charBuffer0.order();
      TiffField tiffField0 = new TiffField(614, 614, fieldTypeByte0, 1L, 1L, byteArray0, byteOrder0, 614);
      tiffField0.getDoubleValue();
      assertEquals(1, tiffField0.getOffset());
      assertEquals(614, tiffField0.getTag());
      assertEquals(614, tiffField0.getSortHint());
      assertEquals(614, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      byte[] byteArray0 = new byte[5];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(1280, 1280, fieldTypeDouble0, 1280, 0L, byteArray0, byteOrder0, (byte) (-88));
      tiffField0.getByteOrder();
      assertEquals(1280, tiffField0.getDirectoryType());
      assertEquals((-88), tiffField0.getSortHint());
      assertEquals(1280, tiffField0.getTag());
      assertEquals(0, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField((-2146966056), (-2145648190), (FieldType) null, (-152L), 1047L, byteArray0, byteOrder0, 4199);
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
  public void test07()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = new FieldTypeAscii((-2644), "1yf");
      byte[] byteArray0 = new byte[6];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(50, 34, fieldTypeAscii0, 2147483647L, 2147483647L, byteArray0, byteOrder0, (byte)109);
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
  public void test08()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = new FieldTypeByte(614, "ZVpSVe8\b'm3");
      byte[] byteArray0 = new byte[6];
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "ZVpSVe8\b'm3");
      ByteOrder byteOrder0 = charBuffer0.order();
      TiffField tiffField0 = new TiffField(614, 614, fieldTypeByte0, 1L, 1L, byteArray0, byteOrder0, 614);
      File file0 = MockFile.createTempFile("Unknown Tag (0x266)", "614 (0x266: Unknown Tag): ");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      tiffField0.dump((PrintWriter) mockPrintWriter0, (String) null);
      assertEquals(68L, file0.length());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      byte[] byteArray0 = new byte[3];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(34019, (-1764), fieldTypeRational0, 34019, (-1764), byteArray0, byteOrder0, (byte) (-1));
      tiffField0.isLocalValue();
      assertEquals(34019, tiffField0.getTag());
      assertEquals((-1764), tiffField0.getDirectoryType());
      assertEquals((-1764), tiffField0.getOffset());
      assertEquals((-1), tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      byte[] byteArray0 = new byte[5];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(1280, 1280, fieldTypeDouble0, 1280, 0L, byteArray0, byteOrder0, (byte) (-88));
      fieldTypeDouble0.getValue(tiffField0);
      assertEquals(1280, tiffField0.getTag());
      assertEquals((-88), tiffField0.getSortHint());
      assertEquals(0, tiffField0.getOffset());
      assertEquals(1280, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = new FieldTypeByte(614, "ZVpSVe8\b'm3");
      byte[] byteArray0 = new byte[6];
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "ZVpSVe8\b'm3");
      ByteOrder byteOrder0 = charBuffer0.order();
      TiffField tiffField0 = new TiffField(614, 614, fieldTypeByte0, 1L, 1L, byteArray0, byteOrder0, 614);
      tiffField0.getByteArrayValue();
      assertEquals(614, tiffField0.getTag());
      assertEquals(614, tiffField0.getDirectoryType());
      assertEquals(614, tiffField0.getSortHint());
      assertEquals(1, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = new FieldTypeByte(614, "ZVpSVe8\b'm3");
      byte[] byteArray0 = new byte[6];
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "ZVpSVe8\b'm3");
      ByteOrder byteOrder0 = charBuffer0.order();
      TiffField tiffField0 = new TiffField(614, 614, fieldTypeByte0, 1L, 1L, byteArray0, byteOrder0, 614);
      tiffField0.getFieldType();
      assertEquals(1, tiffField0.getOffset());
      assertEquals(614, tiffField0.getTag());
      assertEquals(614, tiffField0.getSortHint());
      assertEquals(614, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      byte[] byteArray0 = new byte[7];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(50, 50, fieldTypeFloat0, 50, 50, byteArray0, byteOrder0, (byte) (-9));
      tiffField0.getValue();
      assertEquals(50, tiffField0.getTag());
      assertEquals(50, tiffField0.getOffset());
      assertEquals(50, tiffField0.getDirectoryType());
      assertEquals((-9), tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = new FieldTypeDouble(116, "");
      byte[] byteArray0 = new byte[6];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(561, 65535, fieldTypeDouble0, 65535, 116, byteArray0, byteOrder0, 12);
      tiffField0.getTagInfo();
      assertEquals(116, tiffField0.getOffset());
      assertEquals(561, tiffField0.getTag());
      assertEquals(12, tiffField0.getSortHint());
      assertEquals(65535, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = new FieldTypeAscii((-2644), "1yf");
      byte[] byteArray0 = new byte[6];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(50, 34, fieldTypeAscii0, 2147483647L, 2147483647L, byteArray0, byteOrder0, (byte)109);
      int int0 = tiffField0.getTag();
      assertEquals(109, tiffField0.getSortHint());
      assertEquals(Integer.MAX_VALUE, tiffField0.getOffset());
      assertEquals(50, int0);
      assertEquals(34, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      byte[] byteArray0 = new byte[2];
      TiffField tiffField0 = new TiffField(12, 2032, fieldTypeFloat0, 52L, 52L, byteArray0, (ByteOrder) null, 2143037512);
      tiffField0.getCount();
      assertEquals(2143037512, tiffField0.getSortHint());
      assertEquals(2032, tiffField0.getDirectoryType());
      assertEquals(52, tiffField0.getOffset());
      assertEquals(12, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FieldTypeLong fieldTypeLong0 = FieldType.SLONG;
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField((byte)113, 2, fieldTypeLong0, (byte)113, 1L, byteArray0, byteOrder0, (byte) (-27));
      tiffField0.getBytesLength();
      assertEquals(113, tiffField0.getTag());
      assertEquals(1, tiffField0.getOffset());
      assertEquals(2, tiffField0.getDirectoryType());
      assertEquals((-27), tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = new FieldTypeByte(614, "ZVpSVe8\b'm3");
      byte[] byteArray0 = new byte[6];
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "ZVpSVe8\b'm3");
      ByteOrder byteOrder0 = charBuffer0.order();
      TiffField tiffField0 = new TiffField(614, 614, fieldTypeByte0, 1L, 1L, byteArray0, byteOrder0, 614);
      tiffField0.getDoubleValue();
      assertEquals(1, tiffField0.getOffset());
      assertEquals(614, tiffField0.getSortHint());
      assertEquals(614, tiffField0.getDirectoryType());
      assertEquals(614, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = FieldType.RATIONAL;
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(605, 50, fieldTypeRational0, 605, 1L, byteArray0, byteOrder0, 50);
      // Undeclared exception!
      try { 
        tiffField0.getIntValue();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [Lorg.apache.commons.imaging.common.RationalNumber; cannot be cast to java.lang.Number
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.SLONG;
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(2054, (-1939), fieldTypeLong0, 2054, (-640L), byteArray0, byteOrder0, (-1));
      tiffField0.getIntValueOrArraySum();
      assertEquals((-1939), tiffField0.getDirectoryType());
      assertEquals((-1), tiffField0.getSortHint());
      assertEquals((-640), tiffField0.getOffset());
      assertEquals(2054, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = new FieldTypeDouble(1, "PS,N}${7!WF");
      byte[] byteArray0 = new byte[6];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(1, (-1264), fieldTypeDouble0, 0L, 1, byteArray0, byteOrder0, (-1264));
      try { 
        tiffField0.getIntValueOrArraySum();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [D@1abd2613 for: 1 (0x1: InteroperabilityIndex): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      byte[] byteArray0 = new byte[9];
      byteArray0[4] = (byte)72;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField((-2388), 1, fieldTypeRational0, 486L, 2536L, byteArray0, byteOrder0, (byte)72);
      int int0 = tiffField0.getIntValueOrArraySum();
      assertEquals(1, tiffField0.getDirectoryType());
      assertEquals(2536, tiffField0.getOffset());
      assertEquals(0, int0);
      assertEquals(72, tiffField0.getSortHint());
      assertEquals((-2388), tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      byte[] byteArray0 = new byte[2];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(1, 1, fieldTypeShort0, 1, (-294L), byteArray0, byteOrder0, (byte) (-48));
      tiffField0.getIntValueOrArraySum();
      assertEquals(1, tiffField0.getDirectoryType());
      assertEquals((-294), tiffField0.getOffset());
      assertEquals(1, tiffField0.getTag());
      assertEquals((-48), tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = new FieldTypeDouble(116, "");
      byte[] byteArray0 = new byte[6];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(561, 65535, fieldTypeDouble0, 65535, 116, byteArray0, byteOrder0, 12);
      tiffField0.getDoubleArrayValue();
      assertEquals(65535, tiffField0.getDirectoryType());
      assertEquals(561, tiffField0.getTag());
      assertEquals(116, tiffField0.getOffset());
      assertEquals(12, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      byte[] byteArray0 = new byte[7];
      TiffField tiffField0 = new TiffField(12, 2032, fieldTypeFloat0, 52L, 52L, byteArray0, (ByteOrder) null, 2143037512);
      tiffField0.getDoubleArrayValue();
      assertEquals(2032, tiffField0.getDirectoryType());
      assertEquals(52, tiffField0.getOffset());
      assertEquals(2143037512, tiffField0.getSortHint());
      assertEquals(12, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      byte[] byteArray0 = new byte[7];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(2116360696, (-1014), fieldTypeLong0, 4076L, 0L, byteArray0, byteOrder0, 4);
      tiffField0.getDoubleArrayValue();
      assertEquals((-1014), tiffField0.getDirectoryType());
      assertEquals(2116360696, tiffField0.getTag());
      assertEquals(0, tiffField0.getOffset());
      assertEquals(4, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = new FieldTypeAscii(3516, "");
      byte[] byteArray0 = new byte[18];
      TiffField tiffField0 = new TiffField(3516, 3516, fieldTypeAscii0, 3516, (-1640L), byteArray0, (ByteOrder) null, (byte)21);
      try { 
        tiffField0.getDoubleArrayValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [Ljava.lang.String;@19befa2d for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = new FieldTypeShort(2838, "R2yIxba&:S$\"Ye(vH");
      byte[] byteArray0 = new byte[7];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField(2838, 2838, fieldTypeShort0, 2838, 1801L, byteArray0, byteOrder0, (byte) (-98));
      tiffField0.getDoubleArrayValue();
      assertEquals(1801, tiffField0.getOffset());
      assertEquals((-98), tiffField0.getSortHint());
      assertEquals(2838, tiffField0.getDirectoryType());
      assertEquals(2838, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = FieldType.RATIONAL;
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField((-2147483646), 120, fieldTypeRational0, (-2147483646), 120, byteArray0, byteOrder0, (byte) (-63));
      double[] doubleArray0 = tiffField0.getDoubleArrayValue();
      assertEquals(120, tiffField0.getDirectoryType());
      assertEquals((-63), tiffField0.getSortHint());
      assertEquals((-2147483646), tiffField0.getTag());
      assertArrayEquals(new double[] {Double.NaN}, doubleArray0, 0.01);
      assertEquals(120, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.IFD;
      byte[] byteArray0 = new byte[6];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(1, 1, fieldTypeLong0, 1, 322L, byteArray0, byteOrder0, 1578);
      tiffField0.getDoubleArrayValue();
      assertEquals(1, tiffField0.getTag());
      assertEquals(1, tiffField0.getDirectoryType());
      assertEquals(322, tiffField0.getOffset());
      assertEquals(1578, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = new FieldTypeLong(0, "ChromaBlurRadius");
      byte[] byteArray0 = new byte[3];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(0, 0, fieldTypeLong0, 634L, 0L, byteArray0, byteOrder0, (byte)101);
      tiffField0.getIntArrayValue();
      assertEquals(101, tiffField0.getSortHint());
      assertEquals(0, tiffField0.getOffset());
      assertEquals(0, tiffField0.getTag());
      assertEquals(0, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SHORT;
      byte[] byteArray0 = new byte[4];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(107, 2146533433, fieldTypeShort0, 107, 4L, byteArray0, byteOrder0, 1439);
      int[] intArray0 = tiffField0.getIntArrayValue();
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals(1439, tiffField0.getSortHint());
      assertEquals(4, tiffField0.getOffset());
      assertEquals(2146533433, tiffField0.getDirectoryType());
      assertEquals(107, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      byte[] byteArray0 = new byte[9];
      byteArray0[4] = (byte)72;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField((-2388), 1, fieldTypeRational0, 486L, 2536L, byteArray0, byteOrder0, (byte)72);
      tiffField0.getIntArrayValue();
      assertEquals(2536, tiffField0.getOffset());
      assertEquals(1, tiffField0.getDirectoryType());
      assertEquals(72, tiffField0.getSortHint());
      assertEquals((-2388), tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = new FieldTypeByte(614, "ZVpSVe8\b'm3");
      byte[] byteArray0 = new byte[6];
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "ZVpSVe8\b'm3");
      ByteOrder byteOrder0 = charBuffer0.order();
      TiffField tiffField0 = new TiffField(614, 614, fieldTypeByte0, 1L, 1L, byteArray0, byteOrder0, 614);
      assertEquals(1L, tiffField0.getCount());
      assertEquals(1, tiffField0.getBytesLength());
      
      tiffField0.getIntArrayValue();
      assertEquals(614, tiffField0.getSortHint());
      assertEquals(614, tiffField0.getDirectoryType());
      assertEquals(1, tiffField0.getOffset());
      assertEquals(614, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.SBYTE;
      byte[] byteArray0 = new byte[4];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(2146533433, 2665, fieldTypeByte0, 2146533433, 4L, byteArray0, byteOrder0, 1);
      try { 
        tiffField0.getIntArrayValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown value: [B@707635a3 for: -1 (0xffffffff: Unknown Tag): 
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = new FieldTypeAscii((-2644), "1yf");
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte) (-8);
      byteArray0[2] = (byte)77;
      byteArray0[3] = (byte)75;
      byteArray0[4] = (byte)1;
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(50, 34, fieldTypeAscii0, 2147483647L, 2147483647L, byteArray0, byteOrder0, (byte)109);
      String string0 = tiffField0.getStringValue();
      assertEquals(Integer.MAX_VALUE, tiffField0.getOffset());
      assertNotNull(string0);
      assertEquals(34, tiffField0.getDirectoryType());
      assertEquals(50, tiffField0.getTag());
      assertEquals("\u0001\uFFFDMK\u0001", string0);
      assertEquals(109, tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.LONG;
      byte[] byteArray0 = new byte[9];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(2931, 1792, fieldTypeLong0, 1792, 4L, byteArray0, byteOrder0, (byte) (-124));
      try { 
        tiffField0.getStringValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected String value(-1 (0xffffffff: Unknown Tag): ): [I@1e150f13
         //
         verifyException("org.apache.commons.imaging.formats.tiff.TiffField", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      byte[] byteArray0 = new byte[5];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(1280, 1280, fieldTypeDouble0, 1280, 0L, byteArray0, byteOrder0, (byte) (-88));
      String string0 = tiffField0.getTagName();
      assertEquals(1280, tiffField0.getDirectoryType());
      assertEquals("Unknown Tag (0x500)", string0);
      assertEquals((-88), tiffField0.getSortHint());
      assertEquals(0, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SSHORT;
      byte[] byteArray0 = new byte[9];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(257, 2, fieldTypeShort0, 257, 229L, byteArray0, byteOrder0, 1439);
      String string0 = tiffField0.getTagName();
      assertEquals("ImageLength", string0);
      assertEquals(1439, tiffField0.getSortHint());
      assertEquals(2, tiffField0.getDirectoryType());
      assertEquals(257, tiffField0.getTag());
      assertEquals(229, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FieldTypeFloat fieldTypeFloat0 = FieldType.FLOAT;
      byte[] byteArray0 = new byte[9];
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "Missing value: ");
      ByteOrder byteOrder0 = charBuffer0.order();
      TiffField tiffField0 = new TiffField(261, 50711, fieldTypeFloat0, 261, 2106L, byteArray0, byteOrder0, (-3972));
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("Missing value: ");
      tiffField0.dump((PrintWriter) mockPrintWriter0, "$T5t~");
      assertEquals((-3972), tiffField0.getSortHint());
      assertEquals(261L, tiffField0.getCount());
      assertEquals(1044, tiffField0.getBytesLength());
      assertEquals(2106, tiffField0.getOffset());
      assertEquals(50711, tiffField0.getDirectoryType());
      assertEquals(261, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FieldTypeByte fieldTypeByte0 = FieldType.SBYTE;
      byte[] byteArray0 = new byte[4];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(2146533433, 2665, fieldTypeByte0, 2146533433, 4L, byteArray0, byteOrder0, 1);
      String string0 = tiffField0.getValueDescription();
      assertEquals(2146533433, tiffField0.getTag());
      assertEquals(2146533433L, tiffField0.getCount());
      assertEquals(1, tiffField0.getSortHint());
      assertNotNull(string0);
      assertEquals(4, tiffField0.getOffset());
      assertEquals("0, 0, 0, 0", string0);
      assertEquals(2665, tiffField0.getDirectoryType());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      byte[] byteArray0 = new byte[9];
      TiffField tiffField0 = new TiffField((-1908874352), (-10), fieldTypeDouble0, (-1908874352), (-10), byteArray0, (ByteOrder) null, (byte) (-59));
      String string0 = tiffField0.getValueDescription();
      assertEquals((-1908874352L), tiffField0.getCount());
      assertEquals((-10), tiffField0.getDirectoryType());
      assertEquals((-10), tiffField0.getOffset());
      assertEquals((-59), tiffField0.getSortHint());
      assertEquals(1908874368, tiffField0.getBytesLength());
      assertEquals((-1908874352), tiffField0.getTag());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FieldTypeShort fieldTypeShort0 = FieldType.SSHORT;
      byte[] byteArray0 = new byte[9];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(257, 2, fieldTypeShort0, 257, 229L, byteArray0, byteOrder0, 1439);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(charArrayWriter0, true);
      tiffField0.dump((PrintWriter) mockPrintWriter0);
      assertEquals(50, charArrayWriter0.size());
      assertEquals("257 (0x101: ImageLength): 0, 0, 0, 0 (257 SShort)\n", charArrayWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = new FieldTypeAscii(3516, "");
      byte[] byteArray0 = new byte[18];
      TiffField tiffField0 = new TiffField(3516, 3516, fieldTypeAscii0, 3516, (-1640L), byteArray0, (ByteOrder) null, (byte)21);
      tiffField0.toString();
      assertEquals(3516L, tiffField0.getCount());
      assertEquals(3516, tiffField0.getTag());
      assertEquals(3516, tiffField0.getBytesLength());
      assertEquals(3516, tiffField0.getDirectoryType());
      assertEquals(21, tiffField0.getSortHint());
      assertEquals((-1640), tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = new FieldTypeAscii(3516, "");
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)21;
      TiffField tiffField0 = new TiffField(3516, 3516, fieldTypeAscii0, 3516, (-1640L), byteArray0, (ByteOrder) null, (byte)21);
      tiffField0.toString();
      assertEquals(3516, tiffField0.getBytesLength());
      assertEquals(3516, tiffField0.getTag());
      assertEquals(3516L, tiffField0.getCount());
      assertEquals(3516, tiffField0.getDirectoryType());
      assertEquals(21, tiffField0.getSortHint());
      assertEquals((-1640), tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = new FieldTypeDouble((-223), (String) null);
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField((-223), (-147), fieldTypeDouble0, 0L, 0L, byteArray0, byteOrder0, (byte)20);
      TiffField.OversizeValueElement tiffField_OversizeValueElement0 = tiffField0.new OversizeValueElement((byte) (-1), (-223));
      String string0 = tiffField_OversizeValueElement0.getElementDescription(true);
      assertEquals(20, tiffField0.getSortHint());
      assertEquals((-147), tiffField0.getDirectoryType());
      assertEquals((-223), tiffField0.getTag());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = new FieldTypeDouble((-223), (String) null);
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField((-223), (-147), fieldTypeDouble0, 0L, 0L, byteArray0, byteOrder0, (byte)20);
      TiffElement tiffElement0 = tiffField0.getOversizeValueElement();
      assertEquals((-147), tiffField0.getDirectoryType());
      assertEquals((-223), tiffField0.getTag());
      assertEquals(20, tiffField0.getSortHint());
      assertNull(tiffElement0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FieldTypeRational fieldTypeRational0 = FieldType.SRATIONAL;
      byte[] byteArray0 = new byte[3];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(34019, (-1764), fieldTypeRational0, 34019, (-1764), byteArray0, byteOrder0, (byte) (-1));
      tiffField0.getFieldTypeName();
      assertEquals((-1764), tiffField0.getOffset());
      assertEquals(34019, tiffField0.getTag());
      assertEquals(272152, tiffField0.getBytesLength());
      assertEquals((-1764), tiffField0.getDirectoryType());
      assertEquals((-1), tiffField0.getSortHint());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.LONG;
      byte[] byteArray0 = new byte[9];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(2931, 1792, fieldTypeLong0, 1792, 4L, byteArray0, byteOrder0, (byte) (-124));
      TiffElement tiffElement0 = tiffField0.getOversizeValueElement();
      assertNotNull(tiffElement0);
      
      String string0 = tiffElement0.getElementDescription(false);
      assertEquals("OversizeValueElement, tag: Unknown Tag, fieldType: Long", string0);
      assertNotNull(string0);
      assertEquals(4L, tiffElement0.offset);
      assertEquals((-124), tiffField0.getSortHint());
      assertEquals(1792, tiffField0.getDirectoryType());
      assertEquals(7168, tiffField0.getBytesLength());
      assertEquals(2931, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = FieldType.DOUBLE;
      byte[] byteArray0 = new byte[5];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(1280, 1280, fieldTypeDouble0, 1280, 0L, byteArray0, byteOrder0, (byte) (-88));
      int int0 = tiffField0.getDirectoryType();
      assertEquals((-88), tiffField0.getSortHint());
      assertEquals(10240, tiffField0.getBytesLength());
      assertEquals(1280, int0);
      assertEquals(1280, tiffField0.getTag());
      assertEquals(0, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FieldTypeAscii fieldTypeAscii0 = new FieldTypeAscii((-2644), "1yf");
      byte[] byteArray0 = new byte[6];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      TiffField tiffField0 = new TiffField(50, 34, fieldTypeAscii0, 2147483647L, 2147483647L, byteArray0, byteOrder0, (byte)109);
      int int0 = tiffField0.getSortHint();
      assertEquals(50, tiffField0.getTag());
      assertEquals(34, tiffField0.getDirectoryType());
      assertEquals(109, int0);
      assertEquals(Integer.MAX_VALUE, tiffField0.getOffset());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = new FieldTypeDouble((-223), (String) null);
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField((-223), (-147), fieldTypeDouble0, 0L, 0L, byteArray0, byteOrder0, (byte)20);
      String string0 = tiffField0.getDescriptionWithoutValue();
      assertEquals((-147), tiffField0.getDirectoryType());
      assertEquals(20, tiffField0.getSortHint());
      assertEquals("-223 (0xffffff21: Unknown Tag): ", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FieldTypeLong fieldTypeLong0 = FieldType.LONG;
      byte[] byteArray0 = new byte[9];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      TiffField tiffField0 = new TiffField(2931, 1792, fieldTypeLong0, 1792, 4L, byteArray0, byteOrder0, (byte) (-124));
      tiffField0.dump();
      assertEquals(4, tiffField0.getOffset());
      assertEquals((-124), tiffField0.getSortHint());
      assertEquals(1792L, tiffField0.getCount());
      assertEquals(7168, tiffField0.getBytesLength());
      assertEquals(1792, tiffField0.getDirectoryType());
      assertEquals(2931, tiffField0.getTag());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FieldTypeDouble fieldTypeDouble0 = new FieldTypeDouble((-223), (String) null);
      byte[] byteArray0 = new byte[8];
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      TiffField tiffField0 = new TiffField((-223), (-147), fieldTypeDouble0, 0L, 0L, byteArray0, byteOrder0, (byte)20);
      MockFile mockFile0 = new MockFile("yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0, true);
      tiffField0.dump((PrintWriter) mockPrintWriter0, "");
      assertEquals(44L, mockFile0.length());
      assertEquals(20, tiffField0.getSortHint());
      assertEquals((-147), tiffField0.getDirectoryType());
      assertEquals(0, tiffField0.getBytesLength());
      assertEquals((-223), tiffField0.getTag());
  }
}
