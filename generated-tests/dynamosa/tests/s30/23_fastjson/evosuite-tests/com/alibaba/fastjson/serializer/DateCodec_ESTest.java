/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 19:01:53 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
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
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.format.ResolverStyle;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeWriter serializeWriter0 = new SerializeWriter();
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Class<Short> class0 = Short.TYPE;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, class0, object0, class0, 2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : short
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Object object0 = new Object();
      Locale locale0 = Locale.CANADA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, object0, mockGregorianCalendar0, (Type) null, (-1338));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : java.lang.Object@5a72e9db
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      jSONSerializer0.incrementIndent();
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, serializeConfig0, jSONSerializer0, class0, (-182));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : com.alibaba.fastjson.serializer.SerializeConfig@3
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      SerializerFeature serializerFeature0 = SerializerFeature.PrettyFormat;
      jSONSerializer0.decrementIdent();
      Long long0 = new Long(0);
      dateCodec0.write(jSONSerializer0, long0, serializerFeature0, (Type) null, 2);
      assertEquals((-1), jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("writeAfter", 275);
      ParserConfig parserConfig0 = new ParserConfig();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) parserConfig0, (Object) aSMDeserializerFactory0);
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
      Class<Byte> class0 = Byte.TYPE;
      Double double0 = dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) null, (Object) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("PX{k", 1241579778);
      ParserConfig parserConfig0 = new ParserConfig();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) classLoader0, (Object) jSONReaderScanner0);
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
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(")/", 1241579778);
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      Type[] typeArray0 = new Type[4];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[3], (Type) null);
      Long long0 = new Long(0L);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) long0, (Object) "fastjson.parser.deny");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"fastjson.parser.deny\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("P{k");
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      defaultJSONParser0.setResolveStatus(43);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "fastjson.parser.autoTypeSupport", (Object) "fastjson.parser.deny");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"fastjson.parser.deny\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("yyyyMMddHHmmssSSSZ", parserConfig0, (-3843));
      defaultJSONParser0.setResolveStatus((-3843));
      Double double0 = new Double(1);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) double0, (Object) "S");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"S\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Integer integer0 = new Integer((-3843));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, "AU", integer0, (Type) null, (-3843));
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"AU\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, (Object) null, (Object) null, (Type) null, (-3403));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      JSON.DEFFAULT_DATE_FORMAT = "com.alibaba.fastjson.serializer.DateCodec";
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Long long0 = new Long(0);
      Float float0 = new Float((float) 0);
      Class<Long> class0 = Long.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, float0, long0, class0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'c'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      StringWriter stringWriter0 = new StringWriter(125);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(stringWriter0, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Long long0 = new Long((byte)29);
      Class<Long> class0 = Long.TYPE;
      Float float0 = new Float((float) (-1L));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, float0, long0, class0, (byte)29);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Float cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      StringWriter stringWriter0 = new StringWriter();
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(stringWriter0, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Long> class0 = Long.TYPE;
      MockDate mockDate0 = new MockDate(4647432019745535565L);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockDate0, serializerFeature0, class0, 2391);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSON.DEFFAULT_DATE_FORMAT = null;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("AldwUnQuotedF7eldCames");
      Class<Field> class0 = Field.class;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "AldwUnQuotedF7eldCames", (Object) "AldwUnQuotedF7eldCames");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSON.DEFFAULT_DATE_FORMAT = ";FTA&;+Wp//+yI{:W|g~";
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(";FTA&;+Wp//+yI{:W|g~", parserConfig0, (-3797));
      Double double0 = new Double((-3797));
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) double0, (Object) ";FTA&;+Wp//+yI{:W|g~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'T'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0001-01-01t00:00:00+08:00", parserConfig0, (-3818));
      Double double0 = new Double(1);
      Short short0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) double0, (Object) "0001-01-01t00:00:00+08:00");
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("=G#3WTZ");
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      Integer integer0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "0000-00-00T00:00:00", (Object) "0000-00-00T00:00:00");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00");
      Class<Field> class0 = Field.class;
      Integer integer0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "0000-00-00", (Object) "0000-00-00");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("AldwUnQuotedF7eldCames");
      Class<Field> class0 = Field.class;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "AldwUnQuotedF7eldCames", (Object) "AldwUnQuotedF7eldCames");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"AldwUnQuotedF7eldCames\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("d-MM-yyy HH:mm:ss");
      Class<Field> class0 = Field.class;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0, (Object) "/Date(0000-00-00");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(0000-00-00\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("PX{k", 1241579778);
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      DateCodec dateCodec0 = new DateCodec();
      Byte byte0 = new Byte((byte)62);
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) defaultJSONParser0, (Object) byte0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", object0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("AldwUnQuotedF7eldCames");
      Class<Field> class0 = Field.class;
      MockDate mockDate0 = new MockDate(1);
      Object object0 = dateCodec0.instance.cast(defaultJSONParser0, (Type) class0, (Object) "AldwUnQuotedF7eldCames", (Object) mockDate0);
      assertSame(mockDate0, object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, (-3844));
      Double double0 = new Double(1);
      Short short0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) double0, (Object) "");
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      StringWriter stringWriter0 = new StringWriter(423);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      SerializerFeature serializerFeature0 = SerializerFeature.PrettyFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(stringWriter0, 423, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(423, 423, (-317), 124, 124);
      Long long0 = new Long((-317));
      Class<MockGregorianCalendar> class0 = MockGregorianCalendar.class;
      Class<ResolverStyle> class1 = ResolverStyle.class;
      FieldInfo fieldInfo0 = new FieldInfo("", class0, class1, class1, (Field) null, (-317), 96, 349);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, long0, fieldInfo0.declaringClass, (-1354));
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      StringWriter stringWriter0 = new StringWriter(125);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[4];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(stringWriter0, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Long> class0 = Long.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-402069349), (-222), (-1263));
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Locale locale0 = Locale.JAPANESE;
      dateCodec0.write(jSONSerializer0, date0, locale0, class0, (byte)29);
      assertEquals(25, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      StringWriter stringWriter0 = new StringWriter(125);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(stringWriter0, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Long long0 = new Long((-1L));
      Byte byte0 = new Byte((byte)29);
      Class<Byte> class0 = Byte.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      dateCodec0.write(jSONSerializer0, byte0, long0, class1, 23);
      assertEquals(2, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.global;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      StringWriter stringWriter0 = new StringWriter(125);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(stringWriter0, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockDate mockDate0 = new MockDate(727, (byte) (-76), (-1368982197), 1740, 125);
      dateCodec0.write(jSONSerializer0, mockDate0, parserConfig0, (Type) null, 1241579778);
      assertEquals(78, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Long long0 = new Long(0);
      Float float0 = new Float((float) 0);
      Class<Long> class0 = Long.TYPE;
      dateCodec0.write(jSONSerializer0, float0, long0, class0, 0);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      DateCodec dateCodec0 = DateCodec.instance;
      dateCodec0.write(jSONSerializer0, (Object) null, jSONSerializer0, (Type) null, 55);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Integer integer0 = new Integer((-3844));
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1940111647), 1, 0, 0, 48, (-2085168037));
      Type[] typeArray0 = new Type[5];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[2], typeArray0[3]);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, integer0, parameterizedTypeImpl0, (-1));
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}