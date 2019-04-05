/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 15:49:46 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.chrono.ChronoLocalDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringCodec_ESTest extends StringCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig(true);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      stringCodec0.write(jSONSerializer0, "&81a");
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      // Undeclared exception!
      try { 
        stringCodec0.write((JSONSerializer) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      StringBuilder stringBuilder0 = StringCodec.deserialze(defaultJSONParser0);
      assertNull(stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("{\"$ref\":\"..\"}", parserConfig0, 4);
      String string0 = StringCodec.deserialze(defaultJSONParser0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("-&w;PY_", parserConfig0);
      StringCodec.deserialze(defaultJSONParser0);
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 2, json : -&w;PY_
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      char[] charArray0 = new char[5];
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 1, parserConfig0, 4);
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) null, (Object) defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unterminated json string, pos 0, json : \u0000
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Class<StringBuffer> class0 = StringBuffer.class;
      Class<ChronoLocalDate> class1 = ChronoLocalDate.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class1).when(jSONType0).builder();
      Class<?> class2 = JavaBeanInfo.getBuilderClass(jSONType0);
      FieldInfo fieldInfo0 = new FieldInfo("", class0, class0, class2, (Field) null, 2, 0, 2);
      Object object0 = new Object();
      StringBuffer stringBuffer0 = stringCodec0.deserialze(defaultJSONParser0, (Type) fieldInfo0.fieldClass, object0);
      assertNull(stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Class<StringBuilder> class0 = StringBuilder.class;
      String string0 = StringCodec.instance.deserialze(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      stringCodec0.instance.write(jSONSerializer0, (String) null);
      assertEquals(4, stringCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      int int0 = stringCodec0.getFastMatchToken();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) jSONSerializer0, (Object) jSONSerializer0, (Type) null, 24);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson.serializer.JSONSerializer cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }
}
