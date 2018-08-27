/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 09:07:16 GMT 2018
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.JavaBeanInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringCodec_ESTest extends StringCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      int int0 = stringCodec0.getFastMatchToken();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.write(jSONSerializer0, "");
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, (-1594));
      StringBuffer stringBuffer0 = StringCodec.deserialze(defaultJSONParser0);
      assertNull(stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("hAKn&2P7");
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) null, (Object) "hAKn&2P7");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, json : hAKn&2P7
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      int int0 = Calendar.ERA;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(jSONType0).builder();
      JavaBeanInfo.getBuilderClass(jSONType0);
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) jSONSerializer0, (Object) jSONSerializer0, (Type) null, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson.serializer.JSONSerializer cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.write(jSONSerializer0, (String) null);
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.global;
      Class<StringBuffer> class0 = StringBuffer.class;
      stringCodec0.getFastMatchToken();
      HashMap<String, Field> hashMap0 = new HashMap<String, Field>();
      parserConfig0.clearDeserializers();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      int int0 = Calendar.LONG_FORMAT;
      stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0);
      System.setCurrentTimeMillis(1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, 1682);
      Class<StringBuilder> class0 = StringBuilder.class;
      int int0 = Calendar.SHORT;
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      Object object0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) mockThaiBuddhistDate0);
      assertNull(object0);
  }
}