/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 14:45:50 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeBeanInfo;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.PipedWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.MinguoDate;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Class<MockCalendar> class0 = MockCalendar.class;
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      MinguoDate minguoDate0 = MockMinguoDate.now((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, minguoDate0, serializeConfig0, class0, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : Minguo ROC 103-02-14
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Object object0 = new Object();
      Class<MockGregorianCalendar> class0 = MockGregorianCalendar.class;
      Class<Integer> class1 = Integer.class;
      FieldInfo fieldInfo0 = new FieldInfo("i~\"!$:c\nU", class1, class1, class1, (Field) null, (-2006530392), (-2006530392), (-2006530392));
      BeanContext beanContext0 = new BeanContext(class0, fieldInfo0);
      Type type0 = beanContext0.getFieldType();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, jSONSerializer0, object0, type0, 7);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : 
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Byte byte0 = new Byte((byte) (-36));
      Class<Double> class0 = Double.TYPE;
      jSONSerializer0.incrementIndent();
      dateCodec0.write(jSONSerializer0, byte0, serializeConfig0, class0, (-1014));
      assertEquals("@type", serializeConfig0.getTypeKey());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Byte byte0 = new Byte((byte)27);
      jSONSerializer0.decrementIdent();
      Class<Float> class0 = Float.TYPE;
      dateCodec0.write(jSONSerializer0, byte0, jSONSerializer0, class0, (byte)27);
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("=H?7jeZ03C`#Ao=}AY", 0);
      ParserConfig parserConfig0 = new ParserConfig((ClassLoader) null);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.instance.cast(defaultJSONParser0, (Type) null, (Object) null, object0);
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
      Class<Byte> class0 = Byte.TYPE;
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("p=GGqBG$1sn)'#<G");
      MockCalendar mockCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) null, (Object) null);
      assertNull(mockCalendar0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(".", parserConfig0);
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl((Type[]) null, (Type) null, (Type) null);
      Locale locale0 = Locale.UK;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) "5+@IT`V(,l]&!", (Object) mockGregorianCalendar0);
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
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("0000-00-00T00:00:00", 6);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      defaultJSONParser0.setResolveStatus(1);
      ChronoField chronoField0 = ChronoField.NANO_OF_SECOND;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) chronoField0, (Object) defaultJSONParser0);
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
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("V:vI", parserConfig0, (-857));
      defaultJSONParser0.setResolveStatus((-857));
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) dateCodec0, (Object) null);
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Long> class0 = Long.TYPE;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl((Type[]) null, class0, class0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, jSONSerializer0, jSONSerializer0, parameterizedTypeImpl0, (-1415));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : 
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Object object0 = new Object();
      Class<MockGregorianCalendar> class0 = MockGregorianCalendar.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      FieldInfo[] fieldInfoArray0 = new FieldInfo[0];
      SerializeBeanInfo serializeBeanInfo0 = new SerializeBeanInfo(class0, jSONType0, "hR.5", "\"uLw$OBQ.NZ<f", 1123, fieldInfoArray0, fieldInfoArray0);
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(serializeBeanInfo0);
      Class<?> class1 = javaBeanSerializer0.getType();
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, object0, "authority", class1, 1123);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Byte byte0 = new Byte((byte)105);
      Class<Integer> class0 = Integer.class;
      String[] stringArray0 = new String[7];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      jSONSerializer0.config(serializerFeature0, true);
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, stringArray0);
      Class<?> class1 = javaBeanSerializer0.getType();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, byte0, (Object) null, class1, (-1096999447));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Byte cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig(true);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("vBLO!", parserConfig0);
      defaultJSONParser0.setDateFormat("Dte(");
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, object0, (Object) "Dte(");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 't'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00T00:00:00", parserConfig0, 10);
      MockGregorianCalendar mockGregorianCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "0000-00-00T00:00:00", (Object) "0000-00-00T00:00:00");
      assertNull(mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00");
      Class<Double> class0 = Double.TYPE;
      Double double0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "0000-00-00");
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(".U8Mr*9_Q?78:qm=V,f");
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0, (Object) "/Date(>?*`");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(>?*`\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(";Ljava/lang/Object;I)Z", 605);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "AWnpq,>\"aXIv6", (Object) ";Ljava/lang/Object;I)Z");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \";Ljava/lang/Object;I)Z\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Float float0 = new Float(0.0);
      String string0 = dateCodec0.cast((DefaultJSONParser) null, (Type) null, (Object) float0, (Object) "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0001-01-01T00:00:00+08:00");
      Class<Double> class0 = Double.TYPE;
      Double double0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "0001-01-01T00:00:00+08:00");
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("7W=");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      Class<Double> class0 = Double.TYPE;
      Byte byte0 = new Byte((byte)21);
      Object object0 = dateCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) byte0);
      Object object1 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, object0);
      assertSame(object1, object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[9];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteEnumUsingName;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[1] = serializerFeature1;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeatureArray0[2];
      serializerFeatureArray0[4] = serializerFeatureArray0[2];
      serializerFeatureArray0[5] = serializerFeatureArray0[1];
      serializerFeatureArray0[6] = serializerFeatureArray0[0];
      serializerFeatureArray0[7] = serializerFeature0;
      serializerFeatureArray0[8] = serializerFeatureArray0[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig(2, false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      MockDate mockDate0 = new MockDate((-5), 1936, 1936);
      Long long0 = new Long(1383L);
      Class<MockCalendar> class0 = MockCalendar.class;
      Class<Long> class1 = Long.class;
      FieldInfo fieldInfo0 = new FieldInfo("x_&", class1, class0, class1, (Field) null, 71, 2748, 2748);
      BeanContext beanContext0 = new BeanContext(class0, fieldInfo0);
      Type type0 = beanContext0.getFieldType();
      dateCodec0.write(jSONSerializer0, mockDate0, long0, type0, (-85));
      assertEquals(72, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Double> class0 = Double.TYPE;
      PipedWriter pipedWriter0 = new PipedWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNonStringValueAsString;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeatureArray0[2];
      serializerFeatureArray0[4] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[5] = serializerFeature1;
      serializerFeatureArray0[6] = serializerFeature1;
      SerializeWriter serializeWriter0 = new SerializeWriter(pipedWriter0, 4751, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 1, 58, 1, 55);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, serializerFeatureArray0[2], class0, 1);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeConfig) null);
      dateCodec0.write(jSONSerializer0, (Object) null, (Object) null, (Type) null, 42);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
