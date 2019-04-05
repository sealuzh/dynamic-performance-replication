/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 06:35:22 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.CharArrayWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.IdentityHashMap;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Double double0 = new Double((-1801.8598023294));
      dateCodec0.write(jSONSerializer0, double0, (Object) null, (Type) null, 0);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Type[] typeArray0 = new Type[6];
      Class<Byte> class0 = Byte.TYPE;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, class0, typeArray0[3]);
      dateCodec0.write(jSONSerializer0, (Object) null, dateCodec0, parameterizedTypeImpl0, 3600000);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Object object0 = new Object();
      Class<Long> class0 = Long.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, (Object) null, object0, class0, (-4931));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      FormatStyle formatStyle0 = FormatStyle.FULL;
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, formatStyle0, (Object) null, (Type) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeWriter serializeWriter0 = new SerializeWriter(1241);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Float float0 = new Float((double) 1241);
      Class<Double> class0 = Double.TYPE;
      jSONSerializer0.incrementIndent();
      dateCodec0.write(jSONSerializer0, float0, jSONSerializer0, class0, (-1053));
      assertEquals("double", class0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeWriter serializeWriter0 = new SerializeWriter((Writer) null);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      jSONSerializer0.decrementIdent();
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, serializeConfig0, serializeWriter0, (Type) null, 90);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : com.alibaba.fastjson.serializer.SerializeConfig@65
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Type[] typeArray0 = new Type[0];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, (Type) null, (Type) null);
      Calendar calendar0 = dateCodec0.cast((DefaultJSONParser) null, (Type) parameterizedTypeImpl0, (Object) null, (Object) null);
      assertNull(calendar0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Double> class0 = Double.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("71oA4f|LveOtU$kTF0");
      defaultJSONParser0.setResolveStatus(11);
      Double double0 = new Double(2);
      LocalDate localDate0 = MockLocalDate.ofYearDay(449, 2);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) double0, (Object) localDate0);
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
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("jGU(", parserConfig0);
      defaultJSONParser0.resolveStatus = (-404);
      Long long0 = new Long(3547627781654599004L);
      FormatStyle formatStyle0 = FormatStyle.MEDIUM;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) long0, (Object) formatStyle0);
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) null, (Object) mockGregorianCalendar0, (Object) ")s");
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
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Double> class0 = Double.TYPE;
      ParserConfig parserConfig0 = new ParserConfig(true);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0001-01-01t00:00:00+08:00", parserConfig0, (-262));
      Long long0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "0001-01-01t00:00:00+08:00", (Object) "0001-01-01t00:00:00+08:00");
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig(true);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("g*G1", parserConfig0, 255);
      Locale locale0 = Locale.ENGLISH;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) mockGregorianCalendar0, (Object) "0000-00-00t00:00:00");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00", parserConfig0);
      Float float0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) parserConfig0, (Object) "0000-00-00");
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("ycyyg/$/");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) "/Date(s+ ^glaV[u Sj{UD`H");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(s+ ^glaV[u Sj{UD`H\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      Float float0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) defaultJSONParser0, (Object) "");
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Class<Double> class0 = Double.TYPE;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("#y&dg*1", parserConfig0, 919);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) aSMDeserializerFactory0, (Object) fileSystemHandling0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      byte[] byteArray0 = new byte[4];
      Class<Double> class0 = Double.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(125, (byte)5, (-1635334429));
      Object object0 = dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) mockGregorianCalendar0, (Object) byteArray0[3]);
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", object0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("jlA3uY=sWZD~?");
      Class<Object> class0 = Object.class;
      IdentityHashMap<String, String> identityHashMap0 = new IdentityHashMap<String, String>();
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, identityHashMap0);
      Class<?> class1 = javaBeanSerializer0.getType();
      MockDate mockDate0 = new MockDate((-3115), (-4451), 0);
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) class1, (Object) identityHashMap0, (Object) mockDate0);
      assertEquals("Fri Jan 31 00:00:00 GMT 1587", object0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Double> class0 = Double.TYPE;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, (-1941724867), serializerFeatureArray0);
      MockDate mockDate0 = new MockDate((byte)122, (-1941724867), (byte)122, 132, (byte)6);
      Integer integer0 = new Integer((byte)122);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, (SerializeConfig) null);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockDate0, integer0, class0, (-1941724867));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.util.IOUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      byte[] byteArray0 = new byte[4];
      Class<Double> class0 = Double.TYPE;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, (-1941724872), serializerFeatureArray0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(125, (byte)5, (-1635334429));
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, (SerializeConfig) null);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, byteArray0[2], class0, 23);
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeWriter serializeWriter0 = new SerializeWriter(1535);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      SerializerFeature serializerFeature0 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeatureArray0[0];
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1, serializeConfig0);
      MockDate mockDate0 = new MockDate((short)2877, (short) (-19074), 1535, 0, 0, (short)2877);
      dateCodec0.write(jSONSerializer0, mockDate0, serializerFeature0, (Type) null, 26);
      assertEquals(22, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Double> class0 = Double.TYPE;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, 3947, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Short short0 = new Short((short)2877);
      dateCodec0.write(jSONSerializer0, short0, short0, class0, 3947);
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Double> class0 = Double.TYPE;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, 57344, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Integer integer0 = new Integer((short)2877);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, integer0, jSONSerializer0, class0, 57344);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Double> class0 = Double.TYPE;
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, (-1059), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, (SerializeConfig) null);
      Float float0 = new Float((float) 2);
      dateCodec0.write(jSONSerializer0, float0, (Object) null, class0, (-107));
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}
