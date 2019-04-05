/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 13:06:37 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.Writer;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0h dr8y&^{|9*}", parserConfig0, (-563));
      Class<Long> class0 = Long.TYPE;
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "0h dr8y&^{|9*}", (Object) "3");
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig(true);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Byte byte0 = new Byte((byte) (-63));
      Class<Float> class0 = Float.TYPE;
      dateCodec0.write(jSONSerializer0, byte0, jSONSerializer0, class0, 0);
      assertFalse(class0.isEnum());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("/Datei(0000-00-00", true);
      Class<Float> class0 = Float.TYPE;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, (byte)98, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Double double0 = new Double(1);
      DateCodec dateCodec0 = DateCodec.instance;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl((Type[]) null, class0, class0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, jSONSerializer0, double0, parameterizedTypeImpl0, (short)14);
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
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Object object0 = new Object();
      TextStyle textStyle0 = TextStyle.FULL_STANDALONE;
      Class<Double> class0 = Double.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, object0, textStyle0, class0, 2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : java.lang.Object@47d4ee3b
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      MockFile mockFile0 = new MockFile((String) null, "com.alibaba.fastjson.serializer.LongCodec");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0, true);
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0);
      SerializeConfig serializeConfig0 = new SerializeConfig(true);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      jSONSerializer0.incrementIndent();
      Double double0 = new Double(4357.482);
      dateCodec0.write(jSONSerializer0, double0, (Object) null, (Type) null, 20);
      assertEquals(4, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("/Datei(0000-00-00", false);
      Class<Float> class0 = Float.TYPE;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, 1095, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      DateCodec dateCodec0 = DateCodec.instance;
      Float float0 = new Float(Double.NaN);
      jSONSerializer0.decrementIdent();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, class0, float0, class0, (-2054599450));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : float
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) defaultJSONParser0.NONE, object0);
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
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      Double double0 = dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) null, (Object) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("new Date(", parserConfig0, (-81));
      Class<Long> class0 = Long.TYPE;
      Type[] typeArray0 = new Type[1];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[0], class0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 0, (-1960997171), 0, (-1218891965));
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) class0, (Object) mockGregorianCalendar0);
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
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, 1);
      defaultJSONParser0.resolveStatus = 2372;
      Class<Long> class0 = Long.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "", (Object) "0h!qR8#&^{|9*}");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"0h!qR8#&^{|9*}\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      MockFileWriter mockFileWriter0 = new MockFileWriter("@,.NbFnEE", true);
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("@,.NbFnEE", parserConfig0, 0);
      defaultJSONParser0.resolveStatus = (-110);
      Class<Long> class0 = Long.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) mockFileWriter0, (Object) "@,.NbFnEE");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"@,.NbFnEE\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Byte byte0 = new Byte((byte)94);
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, "}VDD^}ua#Mg", byte0, class0, 2);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"}VDD^}ua#Mg\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, (Object) null, (Object) null, class0, (-2144));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("3)8!");
      Class<Float> class0 = Float.TYPE;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, (-1960997155), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      DateCodec dateCodec0 = new DateCodec();
      JSON.DEFFAULT_DATE_FORMAT = "!nJG&(W!?72m";
      Long long0 = new Long((-1960997155));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, long0, serializeWriter0, class0, (-1960997155));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'n'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter(":j!");
      Class<Float> class0 = Float.TYPE;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, (-1995378783), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      DateCodec dateCodec0 = DateCodec.instance;
      Float float0 = new Float((double) (-1995378783));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, float0, ":j!", class0, (-1995378783));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Float cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("):8j!");
      Class<Float> class0 = Float.TYPE;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, (-1995378783), serializerFeatureArray0);
      serializeWriter0.count = (-1995378783);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      DateCodec dateCodec0 = new DateCodec();
      Long long0 = new Long((-1995378783));
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, long0, serializeWriter0, class0, (-1995378783));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1995378783
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Long> class0 = Long.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) "0h!qR8#&^{|9*}", (Object) "0h!qR8#&^{|9*}");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSON.DEFFAULT_DATE_FORMAT = "0h!qR8#&^{|9*}";
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, 1);
      Class<Long> class0 = Long.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "", (Object) "0h!qR8#&^{|9*}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'q'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0001-01-01T00:00:00+08:00", parserConfig0);
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Long> class0 = Long.TYPE;
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "0001-01-01T00:00:00+08:00", (Object) "0001-01-01T00:00:00+08:00");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullStringAsEmpty;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("1<}YJd$=pADw0$AXiJ2", parserConfig0, 15);
      Class<Long> class0 = Long.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) serializerFeature0, (Object) "/Date(0000-00-00");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(0000-00-00\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0.classLoader);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00", parserConfig0);
      DateCodec dateCodec0 = new DateCodec();
      Class<Long> class0 = Long.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-559), 0, (-2850), 0, 0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) mockGregorianCalendar0, (Object) "/Date(000V00-0)/");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"000V00-0\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("uT", parserConfig0);
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Long> class0 = Long.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "Path deser)alize erorr");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Path deser)alize erorr\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("<5@BtB", parserConfig0, 6);
      Class<Long> class0 = Long.TYPE;
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0, (Object) "0000-00-00T00:00:00");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      DateCodec dateCodec0 = new DateCodec();
      Class<Long> class0 = Long.TYPE;
      ChronoField chronoField0 = ChronoField.YEAR;
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) chronoField0, (Object) "");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("Zty>Z+!<'H$1");
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Long> class0 = Long.TYPE;
      Double double0 = new Double(0);
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "Zty>Z+!<'H$1", (Object) double0);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, (-870));
      Class<Long> class0 = Long.TYPE;
      MockDate mockDate0 = new MockDate(0, 0, 2, (-870), (-870), (-870));
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "", (Object) mockDate0);
      assertSame(date0, mockDate0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00", parserConfig0, (-1857));
      Class<Long> class0 = Long.TYPE;
      Double double0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) parserConfig0, (Object) "0000-00-00");
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("/Datei(0000-00-00", true);
      Class<Float> class0 = Float.TYPE;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, (byte)98, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Double double0 = new Double(1);
      DateCodec dateCodec0 = DateCodec.instance;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((short)14, (byte)98, (short)14, (short)14, (short)14);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, double0, class0, 1);
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("3)8!");
      Class<Float> class0 = Float.TYPE;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, 2232, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      DateCodec dateCodec0 = new DateCodec();
      Long long0 = new Long(2232);
      dateCodec0.write(jSONSerializer0, long0, serializeWriter0, class0, 2232);
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[8];
      SerializerFeature serializerFeature0 = SerializerFeature.SortField;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[2] = serializerFeature1;
      serializerFeatureArray0[3] = serializerFeatureArray0[1];
      serializerFeatureArray0[4] = serializerFeature0;
      serializerFeatureArray0[5] = serializerFeatureArray0[1];
      serializerFeatureArray0[6] = serializerFeatureArray0[2];
      serializerFeatureArray0[7] = serializerFeatureArray0[0];
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      MockDate mockDate0 = new MockDate((-1736590245), (-1736590245), (-4932), (-1736590245), 3);
      Class<Short> class0 = Short.TYPE;
      dateCodec0.write(jSONSerializer0, mockDate0, serializerFeatureArray0[0], class0, 14);
      assertEquals(79, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("3)8!");
      Class<Float> class0 = Float.TYPE;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, (-1960997155), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      DateCodec dateCodec0 = new DateCodec();
      Long long0 = new Long((-1960997155));
      dateCodec0.write(jSONSerializer0, long0, serializeWriter0, class0, (-1960997155));
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter(":j!");
      Class<Float> class0 = Float.TYPE;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullNumberAsZero;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, (-1995378783), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      DateCodec dateCodec0 = DateCodec.instance;
      Instant instant0 = MockInstant.ofEpochSecond((long) (-1995378783), (long) (-1995378783));
      Date date0 = Date.from(instant0);
      dateCodec0.write(jSONSerializer0, date0, date0, class0, (-1995378783));
      assertEquals(24, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      MockFile mockFile0 = new MockFile((String) null, "com.alibaba.fastjson.serializer.LongCodec");
      MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0, true);
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0);
      SerializeConfig serializeConfig0 = new SerializeConfig(true);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = classLoader0.loadClass("com.alibaba.fastjson.serializer.LongCodec");
      dateCodec0.write(jSONSerializer0, (Object) null, serializeWriter0, class0, 188);
      assertFalse(class0.isEnum());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockFileWriter mockFileWriter0 = new MockFileWriter("/Datei(0000-00-00", true);
      Class<Float> class0 = Float.TYPE;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, (byte)98, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Double double0 = new Double(1);
      DateCodec dateCodec0 = DateCodec.instance;
      Short short0 = new Short((short)14);
      dateCodec0.write(jSONSerializer0, short0, double0, class0, (short)14);
      char[] charArray0 = new char[8];
      serializeWriter0.buf = charArray0;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((short)14, (byte)98, (short)14, (short)14, (short)14);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, double0, class0, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
