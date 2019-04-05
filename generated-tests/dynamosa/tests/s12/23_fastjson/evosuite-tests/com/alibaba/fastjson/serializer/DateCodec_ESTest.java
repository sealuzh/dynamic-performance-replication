/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 23:21:29 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.CharArrayWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[6];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeatureArray0[0];
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeatureArray0[0];
      serializerFeatureArray0[5] = serializerFeatureArray0[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      MockDate mockDate0 = new MockDate((byte)7);
      Short short0 = new Short((byte)7);
      dateCodec0.write(jSONSerializer0, mockDate0, short0, (Type) null, (byte)7);
      assertEquals(60, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Object> class0 = Object.class;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[5];
      SerializerFeature serializerFeature0 = SerializerFeature.SkipTransientField;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeatureArray0[1];
      serializerFeatureArray0[3] = serializerFeatureArray0[2];
      SerializerFeature serializerFeature1 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[4] = serializerFeature1;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Long long0 = new Long((byte)7);
      dateCodec0.write(jSONSerializer0, long0, (Object) null, class0, (byte)7);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeWriter serializeWriter0 = new SerializeWriter();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Type[] typeArray0 = new Type[0];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, (Type) null, (Type) null);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, jSONSerializer0, serializeWriter0, parameterizedTypeImpl0, 5);
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
      DateCodec dateCodec0 = new DateCodec();
      MockFileWriter mockFileWriter0 = new MockFileWriter("i]S}']$cPl[<j", true);
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0);
      SerializeConfig serializeConfig0 = new SerializeConfig(903);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Object object0 = new Object();
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, object0, (Object) null, class0, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : java.lang.Object@69f11cf3
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Long> class0 = Long.class;
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, "BS&aGyZjwq", "BS&aGyZjwq", class0, 8192);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      jSONSerializer0.incrementIndent();
      dateCodec0.write(jSONSerializer0, (Object) null, (Object) null, (Type) null, 77);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[6];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeatureArray0[0];
      serializerFeatureArray0[3] = serializerFeatureArray0[2];
      serializerFeatureArray0[4] = serializerFeatureArray0[3];
      serializerFeatureArray0[5] = serializerFeatureArray0[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      jSONSerializer0.decrementIdent();
      Byte byte0 = new Byte((byte)7);
      Class<Integer> class0 = Integer.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, byte0, serializeWriter0, class1, 16384);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Byte cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("U;7:5u xhbUU>Z:MO|^");
      Short short0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "U;7:5u xhbUU>Z:MO|^", (Object) null);
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Double> class0 = Double.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) null, (Object) javaBeanSerializer0);
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
      DateCodec dateCodec0 = new DateCodec();
      Class<Long> class0 = Long.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      Class<?> class1 = javaBeanSerializer0.getType();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) class0, object0, (Object) class1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONScanner jSONScanner0 = new JSONScanner("h>h");
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(dateCodec0, jSONScanner0, parserConfig0);
      Type[] typeArray0 = new Type[2];
      Class<MockCalendar> class0 = MockCalendar.class;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[1], typeArray0[1]);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) typeArray0[0], (Object) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, "U;7:5u xhbUU>Z:MO|^", "U;7:5u xhbUU>Z:MO|^", class0, 584);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"U;7:5u xhbUU>Z:MO|^\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[5];
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature0;
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Byte byte0 = new Byte((byte)64);
      JSON.DEFFAULT_DATE_FORMAT = ">dm[I@dsi.ND\"-q6>{u";
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, byte0, serializerFeature0, (Type) null, 107);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'I'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Double> class0 = Double.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      Class<?> class1 = javaBeanSerializer0.getType();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(13, (-846), 200, 961, 3327, 0);
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) class1, (Object) mockGregorianCalendar0, (Object) "TLMXW#");
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
      Class<Object> class0 = Object.class;
      JSON.DEFFAULT_DATE_FORMAT = "U;7:5u xhbUU>Z:MO|^";
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("U;7:5u xhbUU>Z:MO|^");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "U;7:5u xhbUU>Z:MO|^", (Object) "U;7:5u xhbUU>Z:MO|^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'U'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<String> class0 = String.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Long long0 = new Long((-1338L));
      Short short0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) long0, (Object) "0001-01-01T00:00:00+08:00");
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      Class<String> class0 = String.class;
      Float float0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) null, (Object) "0000-00-00");
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("U;7:5u xhbUU>Z:MO|^");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "U;7:5u xhbUU>Z:MO|^", (Object) "U;7:5u xhbUU>Z:MO|^");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"U;7:5u xhbUU>Z:MO|^\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("U;7:5u xhbUU>Z:MO|^");
      Long long0 = new Long(0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) long0, (Object) "/Date(unsupport type");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(unsupport type\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONScanner jSONScanner0 = new JSONScanner("");
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0, parserConfig0);
      Long long0 = dateCodec0.instance.deserialze(defaultJSONParser0, (Type) null, (Object) parserConfig0, "fastjson.parser.deny", 0);
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) long0, (Object) jSONScanner0.matchStat);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      MockDate mockDate0 = new MockDate();
      Date date0 = dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) class0, (Object) mockDate0);
      assertSame(date0, mockDate0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, 3600000);
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      Float float0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) serializeWriter0, (Object) "");
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Object> class0 = Object.class;
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockDate mockDate0 = new MockDate((byte) (-60), (byte)7, 1600, 1600, (byte) (-60));
      dateCodec0.write(jSONSerializer0, mockDate0, serializeWriter0, class0, (-355668288));
      assertEquals(22, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Object> class0 = Object.class;
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockDate mockDate0 = new MockDate((byte)7, (byte)7, 1579, 1579, (byte)7);
      dateCodec0.write(jSONSerializer0, mockDate0, serializeWriter0, class0, 1579);
      assertEquals(22, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Object> class0 = Object.class;
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockDate mockDate0 = new MockDate((byte) (-54), (byte) (-54), (byte) (-54));
      dateCodec0.write(jSONSerializer0, mockDate0, serializeWriter0, class0, (byte) (-54));
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[6];
      SerializerFeature serializerFeature0 = SerializerFeature.UseSingleQuotes;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeatureArray0[0];
      SerializerFeature serializerFeature1 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[3] = serializerFeature1;
      serializerFeatureArray0[4] = serializerFeatureArray0[3];
      serializerFeatureArray0[5] = serializerFeatureArray0[3];
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 728, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockDate mockDate0 = new MockDate(728, 728, 1062, (-2034867703), 728, 2462);
      Short short0 = new Short((short) (-3700));
      // Undeclared exception!
      try { 
        dateCodec0.instance.write(jSONSerializer0, mockDate0, short0, class0, (-2034867703));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[6];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeatureArray0[0];
      serializerFeatureArray0[3] = serializerFeature0;
      serializerFeatureArray0[4] = serializerFeature0;
      serializerFeatureArray0[5] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Byte byte0 = new Byte((byte)53);
      Class<Byte> class0 = Byte.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      dateCodec0.write(jSONSerializer0, byte0, jSONSerializer0, class1, 22);
      assertEquals(2, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 1129, serializerFeatureArray0);
      Locale locale0 = Locale.CANADA;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      Date date0 = TypeUtils.castToDate(calendar0);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Class<Byte> class0 = Byte.TYPE;
      dateCodec0.write(jSONSerializer0, date0, (Object) null, class0, 1076);
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, 1129, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<Double> class0 = Double.TYPE;
      Object object0 = new Object();
      dateCodec0.write(jSONSerializer0, (Object) null, object0, class0, 3174);
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
