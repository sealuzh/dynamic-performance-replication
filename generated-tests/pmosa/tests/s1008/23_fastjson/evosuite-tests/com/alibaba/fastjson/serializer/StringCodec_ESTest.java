/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 11:49:06 GMT 2018
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.StringCodec;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringCodec_ESTest extends StringCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      stringCodec0.getFastMatchToken();
      Object object0 = new Object();
      JSONScanner jSONScanner0 = new JSONScanner(")hD0B*?8D7J|oyQ", 31);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(object0, jSONScanner0, parserConfig0);
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, json : )hD0B*?8D7J|oyQ
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      stringCodec0.getFastMatchToken();
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      MockHijrahDate mockHijrahDate0 = StringCodec.deserialze(defaultJSONParser0);
      assertNull(mockHijrahDate0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      int int0 = 0;
      StringBuffer stringBuffer0 = new StringBuffer(0);
      Type type0 = null;
      Class<SerializerFeature>[] classArray0 = (Class<SerializerFeature>[]) Array.newInstance(Class.class, 2);
      Class<SerializerFeature> class0 = SerializerFeature.class;
      classArray0[0] = class0;
      Class<SerializerFeature> class1 = SerializerFeature.class;
      classArray0[1] = class1;
      serializeConfig0.configEnumAsJavaBean(classArray0);
      stringCodec0.instance.write(jSONSerializer0, "$VALUES");
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) stringBuffer0, (Object) jSONSerializer0, (Type) null, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.StringBuffer cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      stringCodec0.write(jSONSerializer0, "kHG982{AQD<y/8");
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Object object0 = new Object();
      StringCodec stringCodec0 = StringCodec.instance;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<Method> class0 = Method.class;
      MockHijrahDate mockHijrahDate0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) classLoader0);
      assertNull(mockHijrahDate0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Class<StringBuffer> class0 = StringBuffer.class;
      Object object0 = new Object();
      StringBuilder stringBuilder0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) "");
      assertNull(stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec.instance = stringCodec0;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Object object0 = new Object();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      StringBuilder stringBuilder0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) "");
      assertNull(stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Class<StringBuilder> class0 = StringBuilder.class;
      DefaultJSONParser defaultJSONParser1 = new DefaultJSONParser("9oBM*bM){nf");
      Object object0 = new Object();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      stringCodec0.deserialze(defaultJSONParser1, (Type) class0, (Object) "");
      MockHijrahDate mockHijrahDate0 = StringCodec.deserialze(defaultJSONParser0);
      assertNull(mockHijrahDate0);
  }
}