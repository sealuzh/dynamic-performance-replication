/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 00:00:20 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0", parserConfig0, (-4091));
      Class<Long> class0 = Long.class;
      Date date0 = dateCodec0.instance.cast(defaultJSONParser0, (Type) class0, (Object) null, (Object) "0");
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullStringAsEmpty;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Short short0 = new Short((short)1843);
      Integer integer0 = new Integer(159);
      Class<Float> class0 = Float.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      BeanContext beanContext0 = javaBeanSerializer0.getBeanContext(0);
      Type type0 = beanContext0.getFieldType();
      dateCodec0.write(jSONSerializer0, short0, integer0, type0, 0);
      assertEquals(4, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[5];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeatureArray0[0];
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 59, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Double double0 = Double.valueOf(0.0);
      Type[] typeArray0 = new Type[3];
      Class<Integer> class0 = Integer.TYPE;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[1], class0);
      dateCodec0.write(jSONSerializer0, double0, serializerFeature0, parameterizedTypeImpl0, 2050);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Class<Object> class0 = Object.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, object0, type0, class0, (-3099));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : java.lang.Object@683e05af
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[5];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeatureArray0[2];
      serializerFeatureArray0[4] = serializerFeatureArray0[2];
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 53, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Byte> class0 = Byte.TYPE;
      jSONSerializer0.incrementIndent();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(53, 53, (short)0, (short)0, 53, (short)0);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, jSONSerializer0, class0, 53);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Class<Object> class0 = Object.class;
      jSONSerializer0.decrementIdent();
      Long long0 = new Long(1447L);
      dateCodec0.write(jSONSerializer0, long0, long0, class0, (-682));
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("R");
      ChronoField chronoField0 = ChronoField.PROLEPTIC_MONTH;
      Double double0 = new Double(2721.145002112086);
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) chronoField0, (Object) double0);
      assertEquals("Thu Jan 01 00:00:02 GMT 1970", object0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Field field0 = dateCodec0.cast((DefaultJSONParser) null, (Type) null, (Object) null, (Object) null);
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl((Type[]) null, class0, class0);
      Type type0 = FieldInfo.getFieldType(class0, parameterizedTypeImpl0, class0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("N6r.W");
      DateCodec dateCodec0 = new DateCodec();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) type0, (Object) "N6r.W");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"N6r.W\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("m@4\"%*WPF", parserConfig0);
      defaultJSONParser0.resolveStatus = 6;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, type0, (Object) class0, (Object) "/'ate(uwS6Wv|!xqVO]&\"=Sm");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/'ate(uwS6Wv|!xqVO]&\"=Sm\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("m@4\"%*WPF", parserConfig0);
      defaultJSONParser0.setResolveStatus((-178));
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, type0, (Object) class0, (Object) "/'ate(uwS6Wv|!xqVO]&\"=Sm");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/'ate(uwS6Wv|!xqVO]&\"=Sm\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteMapNullValue;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeatureArray0[1];
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 548, serializerFeatureArray0);
      serializeWriter0.count = (-1928320875);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, jSONSerializer0, serializerFeature0, (Type) null, (-1876054614));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Object> class0 = Object.class;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, "com.alibaba.fastjson.parser.JSONScanner", jSONSerializer0, class0, (-840));
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"com.alibaba.fastjson.parser.JSONScanner\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, (Object) null, (Object) null, class0, 24);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, (-1695571304), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      JSON.DEFFAULT_DATE_FORMAT = "/Date(0000-00-0T00:00:00";
      Class<Byte> class0 = Byte.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1695571304), (-1695571304), (-1695571304), (-1695571304), (-1695571304));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, jSONSerializer0, class0, (-1695571304));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 't'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 2978, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Byte> class0 = Byte.TYPE;
      Integer integer0 = new Integer(2978);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, integer0, (Object) null, class0, 2978);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 53, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      serializeWriter0.count = 3600000;
      Class<Byte> class0 = Byte.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(53, 160, 160, 160, 53, 160);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, jSONSerializer0, class0, 160);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Integer> class0 = Integer.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) type0, (Object) "?o=");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSON.DEFFAULT_DATE_FORMAT = "j~y;7";
      Class<Object> class0 = Object.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("HDF0", parserConfig0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, type0, (Object) class0, (Object) "/Date(");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'j'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Object> class0 = Object.class;
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0001-01-01t00:00:00+08:00", parserConfig0);
      String string0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "0001-01-01t00:00:00+08:00", (Object) "0001-01-01t00:00:00+08:00");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Object> class0 = Object.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00");
      String string0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "0000-00-0T00:00:00", (Object) "0000-00-00");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Object> class0 = Object.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("u1");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "/'at.uw6Wvyay\"'O]&\"mSm", (Object) "/'at.uw6Wvyay\"'O]&\"mSm");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/'at.uw6Wvyay\"'O]&\"mSm\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<String> class0 = String.class;
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("yyyyMMddHHmmssSSSZ", parserConfig0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "yyyyMMddHHmmssSSSZ", (Object) "/Date(j!y;7'Z<y14k/(|Kz");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(j!y;7'Z<y14k/(|Kz\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Object> class0 = Object.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("Ky1Gr", parserConfig0, 3813);
      Date date0 = dateCodec0.cast(defaultJSONParser0, type0, (Object) null, (Object) "");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Object> class0 = Object.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      MockDate mockDate0 = new MockDate((-3099), (-1257), (-2477), 11, (-3099));
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("CHL6)[JDQ", parserConfig0, (-1257));
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, type0, (Object) mockDate0, (Object) aSMDeserializerFactory0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Object> class0 = Object.class;
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("1", parserConfig0);
      Locale locale0 = Locale.CANADA_FRENCH;
      MockDate mockDate0 = new MockDate(0, (-1), 127, 0, 16, (-1866815264));
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) locale0, (Object) mockDate0);
      assertSame(mockDate0, object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00T00:00:00");
      Class<Float> class0 = Float.TYPE;
      Double double0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "0000-00-00T00:00:00");
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 59, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Byte> class0 = Byte.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(59, 59, 59, 59, 59);
      MockDate mockDate0 = new MockDate();
      mockGregorianCalendar0.setGregorianChange(mockDate0);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, jSONSerializer0, class0, 59);
      assertEquals(22, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 47, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Byte> class0 = Byte.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(47, 47, 47, 47, 47, 47);
      MockDate mockDate0 = new MockDate();
      mockGregorianCalendar0.setGregorianChange(mockDate0);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, jSONSerializer0, class0, 47);
      assertEquals(22, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 59, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Byte> class0 = Byte.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(59, 59, 59, 59, 59);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, jSONSerializer0, class0, 59);
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 37, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Byte> class0 = Byte.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, jSONSerializer0, class0, 37);
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[5];
      SerializerFeature serializerFeature0 = SerializerFeature.NotWriteRootClassName;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[2] = serializerFeature1;
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 64, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Byte> class0 = Byte.TYPE;
      MockDate mockDate0 = new MockDate();
      dateCodec0.write(jSONSerializer0, mockDate0, jSONSerializer0, class0, 64);
      assertEquals(72, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Class<Object> class0 = Object.class;
      Object object0 = new Object();
      dateCodec0.write(jSONSerializer0, (Object) null, object0, class0, 1664);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}