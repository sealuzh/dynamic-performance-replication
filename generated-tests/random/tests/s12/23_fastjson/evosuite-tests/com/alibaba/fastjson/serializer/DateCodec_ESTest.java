/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 20:24:51 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.FieldInfo;
import java.io.Writer;
import java.lang.reflect.Type;
import java.time.chrono.ChronoLocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("0001-01-01I0:00:00+08|0T");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) defaultJSONParser0, (Object) "0001-01-01I0:00:00+08|0T");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0001-01-01I0:00:00+08|0T\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("}z{3WX+wH.+FH~^=Gp");
      Long long0 = new Long(898L);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) long0, (Object) "/Date(writefieldvaluestringwithdoublequotecheck");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(writefieldvaluestringwithdoublequotecheck\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("0001-01-01T00:00:00+08:00");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      MockCalendar mockCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) defaultJSONParser0, (Object) "0001-01-01T00:00:00+08:00");
      assertNull(mockCalendar0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONScanner jSONScanner0 = new JSONScanner("yyyyMMddHHmmssSSSZ", 127);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0);
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) jSONScanner0, (Object) "^J~14@#UPz@*U<P{&I0");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"^J~14@#UPz@*U<P{&I0\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONScanner jSONScanner0 = new JSONScanner("(Ljava/lang/String;Z)V");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0);
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0, (Object) "(Ljava/lang/String;Z)V");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"(Ljava/lang/String;Z)V\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      char[] charArray0 = new char[1];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 11);
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(dateCodec0, jSONReaderScanner0, parserConfig0);
      Class<Float> class0 = Float.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) null, (Object) defaultJSONParser0);
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
      char[] charArray0 = new char[7];
      ParserConfig parserConfig0 = new ParserConfig(true);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 5, parserConfig0, 5);
      Class<Byte> class0 = Byte.TYPE;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      ZoneInfo zoneInfo0 = (ZoneInfo)jSONSerializer0.timeZone;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(zoneInfo0);
      Double double0 = new Double(0.0);
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) mockGregorianCalendar0, (Object) double0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", object0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("knOlgy`5Yh6", parserConfig0, 2);
      Class<Calendar> class0 = Calendar.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, (Map<String, String>) null);
      Class<?> class1 = javaBeanSerializer0.getType();
      Object object0 = new Object();
      MockDate mockDate0 = new MockDate(2, 0, 0, (-1872058879), 0);
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class1, object0, (Object) mockDate0);
      assertEquals("Wed Dec 02 17:00:00 GMT 211659", date0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      Class<Long> class0 = Long.TYPE;
      Calendar calendar0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0, (Object) null);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      Class<Long> class0 = Long.TYPE;
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) classLoader0, (Object) "");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[8];
      SerializerFeature serializerFeature0 = SerializerFeature.SkipTransientField;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeatureArray0[0];
      serializerFeatureArray0[5] = serializerFeatureArray0[1];
      serializerFeatureArray0[6] = serializerFeature0;
      serializerFeatureArray0[7] = serializerFeatureArray0[5];
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 1770, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1770, 1770, (-841), (-841), (-2835));
      Short short0 = new Short((short)873);
      Class<String> class0 = String.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, short0, type0, (-2054347987));
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[7];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullListAsEmpty;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeatureArray0[1];
      serializerFeatureArray0[3] = serializerFeatureArray0[0];
      SerializerFeature serializerFeature1 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[4] = serializerFeature1;
      serializerFeatureArray0[5] = serializerFeatureArray0[0];
      serializerFeatureArray0[6] = serializerFeatureArray0[1];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Class<Double> class0 = Double.TYPE;
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, mockGregorianCalendar0, class0, 2);
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 3495, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Short short0 = new Short((short)931);
      Double double0 = Double.valueOf(0.0);
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, short0, double0, class0, 1323);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Short cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[8];
      SerializerFeature serializerFeature0 = SerializerFeature.SkipTransientField;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      SerializerFeature serializerFeature1 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[2] = serializerFeature1;
      serializerFeatureArray0[3] = serializerFeatureArray0[1];
      serializerFeatureArray0[4] = serializerFeature0;
      serializerFeatureArray0[5] = serializerFeatureArray0[4];
      serializerFeatureArray0[6] = serializerFeatureArray0[0];
      serializerFeatureArray0[7] = serializerFeatureArray0[3];
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 1770, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1770, 1770, (-841), (-841), (-2835));
      Short short0 = new Short((short)873);
      Class<String> class0 = String.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, short0, type0, (-2054347987));
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("0000-00-00");
      SerializeWriter serializeWriter0 = new SerializeWriter(mockPrintWriter0, 7);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, serializeWriter0, serializeWriter0, (Type) null, 39);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : 
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Double double0 = new Double((-2598.7613358203776));
      Class<Long> class0 = Long.TYPE;
      dateCodec0.write(jSONSerializer0, (Object) null, double0, class0, (-1274291617));
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("0000-00-00");
      SerializeWriter serializeWriter0 = new SerializeWriter(mockPrintWriter0, 7);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockDate mockDate0 = new MockDate((-2057465743), (-10), 0, (-10), 0, (-10));
      dateCodec0.write(jSONSerializer0, mockDate0, (Object) null, (Type) null, (-2057465743));
      assertEquals(5, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}