/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 16:40:36 GMT 2018
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.chrono.ChronoLocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSON.DEFFAULT_DATE_FORMAT = "java.util.List";
      JSON.DEFFAULT_DATE_FORMAT = "java.util.List";
      dateCodec0.getFastMatchToken();
      SerializeWriter serializeWriter0 = new SerializeWriter();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      try { 
        Byte.decode("java.util.List");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"java.util.List\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      dateCodec0.getFastMatchToken();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullListAsEmpty;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[0] = serializerFeature1;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 31, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      String[] stringArray0 = new String[4];
      stringArray0[2] = "";
      SimplePropertyPreFilter simplePropertyPreFilter0 = new SimplePropertyPreFilter(stringArray0);
      simplePropertyPreFilter0.getClazz();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, "", jSONSerializer0, (Type) null, 31);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<MockCalendar> class0 = MockCalendar.class;
      Float float0 = new Float((double) (-1073));
      dateCodec0.write(jSONSerializer0, float0, jSONSerializer0, class0, (-1073));
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("5}zN|a{?TPHm");
      JSON.setDefaultTypeKey("5}zN|a{?TPHm");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) "5}zN|a{?TPHm");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"5}zN|a{?TPHm\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = null;
      Class<MockHijrahDate> class0 = MockHijrahDate.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(jSONType0).builder();
      JavaBeanInfo.getBuilderClass(class0, jSONType0);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      mockJapaneseDate0.getMockedClassName();
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) null, (Object) class0, (Object) mockJapaneseDate0);
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
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Short short0 = new Short((short)47);
      Byte byte0 = new Byte((byte)0);
      Class<SerializerFeature> class0 = SerializerFeature.class;
      Class<MockCalendar> class1 = MockCalendar.class;
      IdentityHashMap<String, Field> identityHashMap0 = new IdentityHashMap<String, Field>();
      ParserConfig.getFieldFromCache("com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory", identityHashMap0);
      FieldInfo fieldInfo0 = new FieldInfo("com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory", class0, class1, class0, (Field) null, (byte)0, (-1073), (-1073));
      BeanContext beanContext0 = new BeanContext(class0, fieldInfo0);
      Class class2 = (Class)beanContext0.getFieldType();
      dateCodec0.write(jSONSerializer0, short0, byte0, class2, (-1073));
      assertFalse(class2.isArray());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      int int0 = Opcodes.LCONST_1;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(jSONSerializer0.out, (-198), serializerFeatureArray0);
      JSONSerializer jSONSerializer1 = new JSONSerializer(serializeWriter0);
      Integer integer0 = new Integer((-198));
      Class<Short> class0 = Short.TYPE;
      dateCodec0.write(jSONSerializer1, integer0, "fastjson.parser.autoTypySupport", class0, 10);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Double> class0 = Double.TYPE;
      String string0 = "G";
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) null, (Object) "G");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      FileSystemHandling.shouldAllThrowIOExceptions();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      JSON.setDefaultTypeKey("");
      Type type0 = null;
      String string0 = "fastjson.parser.autoTypeSupport";
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) defaultJSONParser0, (Object) "fastjson.parser.autoTypeSupport");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"fastjson.parser.autoTypeSupport\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      JSON.DEFFAULT_DATE_FORMAT = "5}zN|a{RTPHm";
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("5}zN|a{RTPHm", parserConfig0);
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullBooleanAsFalse;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) serializerFeature0, (Object) "5}zN|a{RTPHm");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'N'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("5}zN|a{RTPHm");
      DefaultJSONParser defaultJSONParser1 = new DefaultJSONParser(defaultJSONParser0.lexer);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser1, (Type) null, (Object) "/Date(i}z5N|a{s&|PHm", (Object) "/Date(i}z5N|a{s&|PHm");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(i}z5N|a{s&|PHm\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      ParserConfig parserConfig0 = new ParserConfig((ASMDeserializerFactory) null);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(":LEg/Li", parserConfig0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      JSON.DEFAULT_TYPE_KEY = "new Date(";
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) mockGregorianCalendar0, (Object) "/Date(val");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(val\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00");
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "0000-00-00", (Object) "0000-00-00");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("InitStringFieldAsEmpty");
      Integer integer0 = new Integer(2);
      dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "kotln.reflect.KFucton", (Object) integer0);
      Long long0 = new Long(1);
      String string0 = (String)defaultJSONParser0.input;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "InitStringFieldAsEmpty", (Object) "InitStringFieldAsEmpty");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"InitStringFieldAsEmpty\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("InitStringFieldAsEmpty");
      Integer integer0 = new Integer(2);
      dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "InitStringFieldAsEmpty", (Object) integer0);
      String string0 = (String)defaultJSONParser0.input;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "InitStringFieldAsEmpty", (Object) "InitStringFieldAsEmpty");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"InitStringFieldAsEmpty\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      int int0 = Opcodes.LCONST_1;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(jSONSerializer0.out, (-198), serializerFeatureArray0);
      JSONSerializer jSONSerializer1 = new JSONSerializer(serializeWriter0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      jSONSerializer1.setDateFormat("`0");
      Integer integer0 = new Integer((-198));
      Class<Short> class0 = Short.TYPE;
      dateCodec0.write(jSONSerializer1, integer0, "fastjson.parser.autoTypySupport", class0, 10);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream(pipedOutputStream0, (-1621));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<MockCalendar> class0 = MockCalendar.class;
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      jSONSerializer0.config(serializerFeature0, true);
      Float float0 = new Float((double) (-1018));
      dateCodec0.write(jSONSerializer0, float0, class0, class0, (-1018));
      System.setCurrentTimeMillis(0L);
      SerializeConfig serializeConfig0 = new SerializeConfig(22, true);
      JSONSerializer jSONSerializer1 = new JSONSerializer(jSONSerializer0.out, serializeConfig0);
      Float float1 = new Float((double) 0L);
      dateCodec0.write(jSONSerializer1, float1, serializeConfig0, class0, 3492);
      assertNotEquals((float)float1, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      dateCodec0.getFastMatchToken();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullListAsEmpty;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[0] = serializerFeature1;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 31, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Float float0 = new Float(0.0);
      Class<String> class0 = String.class;
      FieldInfo fieldInfo0 = new FieldInfo("/Date(0000-00-00", class0, class0, class0, (Field) null, 31, (-1894804883), 31);
      Class<?> class1 = fieldInfo0.declaringClass;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, "", serializerFeature1, class1, (-1894804883));
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
      Class<MockCalendar> class0 = MockCalendar.class;
      char[] charArray0 = new char[4];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, '\u0000', (-4372));
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "/Date(/gste(i}=5N|a{s&|PHm");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(/gste(i}=5N|a{s&|PHm\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<MockCalendar> class0 = MockCalendar.class;
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      jSONSerializer0.config(serializerFeature0, true);
      char[] charArray0 = new char[3];
      charArray0[0] = 'j';
      charArray0[1] = 'f';
      charArray0[2] = '}';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 978, (-1018));
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      TimeZone timeZone0 = TimeZone.getTimeZone("/Date(/gste(i}=5N|a{s&|PHm");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) mockGregorianCalendar0, (Object) "/Date(/gste(i}=5N|a{s&|PHm");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(/gste(i}=5N|a{s&|PHm\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<MockCalendar> class0 = MockCalendar.class;
      Float float0 = new Float(0.0);
      Byte byte0 = new Byte((byte)14);
      dateCodec0.write(jSONSerializer0, byte0, jSONSerializer0, class0, 341);
      ParserConfig parserConfig0 = new ParserConfig(true);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)14;
      byteArray0[1] = (byte)14;
      byteArray0[2] = (byte)14;
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "pG_gv:YB hh");
      byteArray0[3] = (byte)14;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00t00:00:00", parserConfig0, (-181));
      Double double0 = new Double(0.0);
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      Annotation annotation0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) mockThaiBuddhistDate0, (Object) "0000-00-00t00:00:00");
      assertNull(annotation0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<MockCalendar> class0 = MockCalendar.class;
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeConfig) null);
      jSONSerializer0.config(serializerFeature0, true);
      Float float0 = new Float(0.0);
      MockDate mockDate0 = new MockDate((-1437), (-4372), (-1437), (-1074), (-1437));
      dateCodec0.write(jSONSerializer0, mockDate0, serializerFeature0, class0, 1000);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }
}
