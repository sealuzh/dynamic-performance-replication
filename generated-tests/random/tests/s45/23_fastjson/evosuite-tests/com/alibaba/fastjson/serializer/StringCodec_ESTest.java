/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 06:46:45 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.FieldInfo;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.chrono.ChronoLocalDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringCodec_ESTest extends StringCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      Class<StringBuffer> class0 = StringBuffer.class;
      Field field0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) null);
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("com.alibaba.fastjson.serializer.ReferenceCodec", parserConfig0);
      Class<StringBuilder> class0 = StringBuilder.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      // Undeclared exception!
      try { 
        StringCodec.instance.deserialze(defaultJSONParser0, type0, (Object) type0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, json : com.alibaba.fastjson.serializer.ReferenceCodec
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      StringBuffer stringBuffer0 = new StringBuffer();
      // Undeclared exception!
      try { 
        stringCodec0.deserialze((DefaultJSONParser) null, (Type) null, (Object) stringBuffer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringCodec.deserialze((DefaultJSONParser) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      String string0 = StringCodec.deserialze(defaultJSONParser0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      SerializeWriter serializeWriter0 = new SerializeWriter();
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      stringCodec0.write(jSONSerializer0, "");
      assertEquals(2, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = '0';
      charArray0[1] = '.';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 27);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      Object object0 = StringCodec.deserialze(defaultJSONParser0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("1s~\"Pdutbm(J96g", parserConfig0);
      StringCodec.deserialze(defaultJSONParser0);
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 2, json : 1s~\"Pdutbm(J96g
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      StringCodec stringCodec0 = StringCodec.instance;
      Class<StringBuilder> class0 = StringBuilder.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      StringBuilder stringBuilder0 = new StringBuilder();
      String string0 = stringCodec0.deserialze(defaultJSONParser0, type0, (Object) stringBuilder0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      Class<StringBuffer> class0 = StringBuffer.class;
      Class<Annotation> class1 = Annotation.class;
      FieldInfo fieldInfo0 = new FieldInfo("", class1, class0, class0, (Field) null, 0, 0, 0);
      String string0 = stringCodec0.deserialze(defaultJSONParser0, (Type) fieldInfo0.fieldClass, (Object) defaultJSONParser0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.write(jSONSerializer0, (String) null);
      assertEquals(4, stringCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      int int0 = stringCodec0.getFastMatchToken();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      Class class1 = (Class)FieldInfo.getFieldType(class0, class0, class0);
      stringCodec0.instance.write(jSONSerializer0, (Object) "", (Object) "", (Type) class1, 16);
      assertFalse(class1.isArray());
  }
}
