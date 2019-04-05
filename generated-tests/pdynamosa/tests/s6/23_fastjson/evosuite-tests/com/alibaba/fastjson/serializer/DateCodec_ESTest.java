/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 15:00:28 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.PascalNameFilter;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.Writer;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullBooleanAsFalse;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig(true);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Byte byte0 = new Byte((byte) (-97));
      Type[] typeArray0 = new Type[0];
      Class<Date> class0 = Date.class;
      String[] stringArray0 = new String[1];
      Map<String, String> map0 = JavaBeanSerializer.createAliasMap(stringArray0);
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, map0);
      Class<?> class1 = javaBeanSerializer0.getType();
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, class1, class0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, serializerFeature0, byte0, parameterizedTypeImpl0, 99999999);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : WriteNullBooleanAsFalse
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Long long0 = new Long(2417L);
      Locale locale0 = new Locale("SX':|!-G=M&", "..\"[m}");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, long0, mockGregorianCalendar0, class0, (-1498));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Short> class0 = Short.class;
      jSONSerializer0.incrementIndent();
      Short short0 = new Short((short)23);
      dateCodec0.write(jSONSerializer0, short0, short0, class0, (short)23);
      assertEquals(1, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Long> class0 = Long.TYPE;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      jSONSerializer0.decrementIdent();
      MockDate mockDate0 = new MockDate();
      dateCodec0.write(jSONSerializer0, mockDate0, "", class0, 2);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("com.al", parserConfig0, 1443);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, object0, (Object) defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("WriteNonStringKeyAsString");
      Type[] typeArray0 = new Type[5];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[4], typeArray0[3]);
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0L);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) "", (Object) localDate0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("6h.I");
      defaultJSONParser0.setResolveStatus(588);
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "", (Object) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("MlUI|H");
      Class<Long> class0 = Long.TYPE;
      defaultJSONParser0.resolveStatus = (-402069349);
      DateCodec dateCodec0 = DateCodec.instance;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0, (Object) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Object object0 = new Object();
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, object0, object0, class0, (-123008));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : java.lang.Object@58aebb64
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeWriter) null);
      Double double0 = new Double((-3982.2123769684868));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, double0, (Object) null, (Type) null, (-799));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Long> class0 = Long.TYPE;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteBigDecimalAsPlain;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeatureArray0[0];
      serializerFeatureArray0[3] = serializerFeatureArray0[0];
      serializerFeatureArray0[4] = serializerFeatureArray0[3];
      serializerFeatureArray0[5] = serializerFeatureArray0[1];
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[6] = serializerFeature1;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Long long0 = new Long((byte)41);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, long0, serializerFeature1, class0, 32);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Long cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Short> class0 = Short.class;
      MockDate mockDate0 = new MockDate(526L);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0001-01-01t00:00:00+08:00");
      Calendar calendar0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) mockDate0, (Object) "0001-01-01t00:00:00+08:00");
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00t00:00:00");
      Class<String> class0 = String.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      Object object0 = dateCodec0.cast(defaultJSONParser0, type0, (Object) type0, (Object) "0000-00-00t00:00:00");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Short> class0 = Short.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00");
      Long long0 = new Long(0);
      String string0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) long0, (Object) "0000-00-00");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("com.alibaba.fastjson.serializer.DateCodec");
      Class<Long> class0 = Long.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "/Date(fastjson.parser.autoTypeAccept");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(fastjson.parser.autoTypeAccept\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("com.alibaba.fastjson.serializer.DateCodec");
      Class<Long> class0 = Long.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) null, (Object) "(Ljava/lang/String;Z)V");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"(Ljava/lang/String;Z)V\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSON.DEFFAULT_DATE_FORMAT = "com.alibaba.fastjson.serialize.datecodec";
      JSON.DEFFAULT_DATE_FORMAT = "com.al";
      char[] charArray0 = new char[3];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 2);
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser((Object) null, jSONReaderScanner0, parserConfig0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) defaultJSONParser0, (Object) "com.al");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'c'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Class<Long> class0 = Long.TYPE;
      String string0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "", (Object) "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      PascalNameFilter pascalNameFilter0 = new PascalNameFilter();
      Double double0 = new Double(2);
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) double0, (Object) pascalNameFilter0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Integer> class0 = Integer.TYPE;
      Float float0 = new Float((double) 4244L);
      Object object0 = dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) dateCodec0, (Object) float0);
      assertEquals("Thu Jan 01 00:00:04 GMT 1970", object0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Class<Long> class0 = Long.TYPE;
      Byte byte0 = new Byte((byte) (-47));
      MockDate mockDate0 = new MockDate(1, 4045, (-1619756272));
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) byte0, (Object) mockDate0);
      assertEquals("Wed Feb 06 00:00:00 GMT 4432414", object0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Integer> class0 = Integer.TYPE;
      Float float0 = new Float((double) 4244L);
      Object object0 = dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) float0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Long> class0 = Long.TYPE;
      MockFileWriter mockFileWriter0 = new MockFileWriter("fastjson.parser.autoTypeAccept", false);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[9];
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeatureArray0[1];
      serializerFeatureArray0[3] = serializerFeatureArray0[1];
      serializerFeatureArray0[4] = serializerFeatureArray0[1];
      serializerFeatureArray0[5] = serializerFeatureArray0[3];
      serializerFeatureArray0[6] = serializerFeatureArray0[3];
      serializerFeatureArray0[7] = serializerFeatureArray0[5];
      serializerFeatureArray0[8] = serializerFeatureArray0[7];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, 2, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockDate mockDate0 = new MockDate(2, 0, 2, (-1195), 41, (-1195));
      dateCodec0.write(jSONSerializer0, mockDate0, serializerFeatureArray0[2], class0, 0);
      assertEquals(22, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Long> class0 = Long.TYPE;
      MockFileWriter mockFileWriter0 = new MockFileWriter("/Date(MC,IVH");
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[9];
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeatureArray0[2];
      serializerFeatureArray0[4] = serializerFeatureArray0[3];
      serializerFeatureArray0[5] = serializerFeature0;
      serializerFeatureArray0[6] = serializerFeatureArray0[4];
      serializerFeatureArray0[7] = serializerFeature0;
      serializerFeatureArray0[8] = serializerFeatureArray0[5];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, 2, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockDate mockDate0 = new MockDate((-1932735280), 1, 1, (-1213), 5);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockDate0, serializerFeature0, class0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Long> class0 = Long.TYPE;
      MockFileWriter mockFileWriter0 = new MockFileWriter("/Date(MC,IVH");
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[9];
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeatureArray0[0];
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeature0;
      serializerFeatureArray0[5] = serializerFeatureArray0[0];
      serializerFeatureArray0[6] = serializerFeatureArray0[0];
      serializerFeatureArray0[7] = serializerFeature0;
      serializerFeatureArray0[8] = serializerFeatureArray0[1];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, 2, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockDate mockDate0 = new MockDate(41, (-1195), (-1195));
      dateCodec0.write(jSONSerializer0, mockDate0, serializerFeatureArray0[0], class0, 0);
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullStringAsEmpty;
      SerializerFeature serializerFeature1 = SerializerFeature.UseISO8601DateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature1;
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeature1;
      serializerFeatureArray0[5] = serializerFeature0;
      serializerFeatureArray0[6] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Integer integer0 = new Integer(0);
      dateCodec0.write(jSONSerializer0, integer0, "MlUI|H", (Type) null, (-1974309331));
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Long> class0 = Long.TYPE;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteBigDecimalAsPlain;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeatureArray0[1];
      serializerFeatureArray0[3] = serializerFeatureArray0[0];
      serializerFeatureArray0[4] = serializerFeatureArray0[3];
      serializerFeatureArray0[5] = serializerFeatureArray0[3];
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[6] = serializerFeature1;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockDate mockDate0 = new MockDate((byte) (-49), 1403, (byte) (-49), (-1), 1, 1);
      dateCodec0.write(jSONSerializer0, mockDate0, dateCodec0, class0, (byte) (-49));
      assertEquals(71, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Short> class0 = Short.class;
      MockDate mockDate0 = new MockDate(526L);
      dateCodec0.write(jSONSerializer0, (Object) null, mockDate0, class0, (-1408035778));
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}