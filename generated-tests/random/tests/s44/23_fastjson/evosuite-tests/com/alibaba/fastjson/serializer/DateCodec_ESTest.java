/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 05:20:37 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.Month;
import java.util.Date;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      SerializerFeature serializerFeature0 = SerializerFeature.UseSingleQuotes;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[2] = serializerFeature1;
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeature1;
      serializerFeatureArray0[5] = serializerFeatureArray0[2];
      serializerFeatureArray0[6] = serializerFeatureArray0[5];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Short short0 = new Short((short) (-25387));
      Short short1 = new Short((short) (-25387));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, short0, short1, (Type) null, (-2606));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Short cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Long> class0 = Long.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1), (-1), (-1), 1, 1958, 14);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, class0, class0, 0);
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Long> class0 = Long.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, jSONSerializer0, jSONSerializer0, class0, 1136);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : 
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0001-01-01T00:00:00+08:00");
      Class<Integer> class0 = Integer.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      List<Month> list0 = dateCodec0.instance.cast(defaultJSONParser0, (Type) class0, (Object) mockGregorianCalendar0, (Object) "0001-01-01T00:00:00+08:00");
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("0000-00-00T00:00:00", 16);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      Class<Short> class0 = Short.TYPE;
      Float float0 = new Float((double) 2);
      Integer integer0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) float0, (Object) "0000-00-00T00:00:00");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0001-01-01T00:00:00+08:00");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "0001-01-01T00:00:00+08:00", (Object) "/Date(Dl*x0C=.)[yxxN9>1j");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(Dl*x0C=.)[yxxN9>1j\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("Dl*x0C=.)[yxxN9>1j", parserConfig0);
      Byte byte0 = new Byte((byte)16);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) byte0, (Object) "Dl*x0C=.)[yxxN9>1j");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Dl*x0C=.)[yxxN9>1j\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<String> class0 = String.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((byte) (-97), (-3956), (-1862679359), (-1988874649), (-1988874649), 2698);
      Field field0 = dateCodec0.cast((DefaultJSONParser) null, type0, (Object) mockGregorianCalendar0, (Object) "");
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0001-01-01T00:00:00+08:00");
      Class<List> class0 = List.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, type0, (Object) "0001-01-01T00:00:00+08:00", (Object) defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("2qrkqN", parserConfig0, (-913));
      Float float0 = new Float((float) (-913));
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) defaultJSONParser0, (Object) float0);
      assertEquals("Wed Dec 31 23:59:59 GMT 1969", object0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("Dl*x0C=.)[yxxN9>1j");
      Class<Long> class0 = Long.TYPE;
      MockDate mockDate0 = new MockDate((-4253), 552, 2, (-2870), 552, (-2117));
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) mockDate0);
      assertSame(mockDate0, date0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, 618);
      Object object0 = new Object();
      Double double0 = dateCodec0.cast(defaultJSONParser0, (Type) null, object0, (Object) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("im*^iD$v", parserConfig0);
      Type[] typeArray0 = new Type[0];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, (Type) null, (Type) null);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) null, (Object) "im*^iD$v");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"im*^iD$v\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeWriter serializeWriter0 = new SerializeWriter(22);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[8];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullNumberAsZero;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[1] = serializerFeature1;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeatureArray0[0];
      serializerFeatureArray0[4] = serializerFeatureArray0[1];
      serializerFeatureArray0[5] = serializerFeatureArray0[0];
      serializerFeatureArray0[6] = serializerFeatureArray0[2];
      serializerFeatureArray0[7] = serializerFeatureArray0[2];
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, 22, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig(false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1, serializeConfig0);
      Class<Double> class0 = Double.TYPE;
      dateCodec0.write(jSONSerializer0, "0000-00-00", serializeWriter0, class0, 22);
      assertEquals(26, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      MockFileWriter mockFileWriter0 = new MockFileWriter("u6sB70h", false);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      SerializerFeature serializerFeature0 = SerializerFeature.DisableCircularReferenceDetect;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeatureArray0[1];
      SerializerFeature serializerFeature1 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[3] = serializerFeature1;
      serializerFeatureArray0[4] = serializerFeatureArray0[0];
      serializerFeatureArray0[5] = serializerFeatureArray0[0];
      serializerFeatureArray0[6] = serializerFeatureArray0[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1677, 29, 123);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, mockGregorianCalendar0, (Type) null, 614);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeWriter serializeWriter0 = new SerializeWriter();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, (SerializeConfig) null);
      MockDate mockDate0 = new MockDate((-5470), (-2365), 2002, (-5470), 2002);
      dateCodec0.write(jSONSerializer0, mockDate0, serializeWriter0, (Type) null, (-2365));
      assertEquals(16, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNonStringKeyAsString;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Float> class0 = Float.TYPE;
      dateCodec0.write(jSONSerializer0, (Object) null, (Object) null, class0, 575);
      assertEquals("float", class0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
