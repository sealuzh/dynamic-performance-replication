/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 16:12:48 GMT 2018
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.StringCodec;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringCodec_ESTest extends StringCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.write(jSONSerializer0, "writeFieldNameDirect");
      assertEquals(4, stringCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      MockMinguoDate mockMinguoDate0 = stringCodec0.deserialze(defaultJSONParser0, (Type) null, (Object) "");
      assertNull(mockMinguoDate0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) serializeConfig0, (Object) mockThaiBuddhistDate0, (Type) null, (-1));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson.serializer.SerializeConfig cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.write(jSONSerializer0, (String) null);
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, (-1706));
      Class<StringBuilder> class0 = StringBuilder.class;
      Object object0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      FileSystemHandling.shouldAllThrowIOExceptions();
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("6?PO4m<'+xkl~5d59WT", parserConfig0, 176);
      Class<StringBuilder> class0 = StringBuilder.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      SerializeWriter serializeWriter0 = new SerializeWriter(2);
      serializeWriter0.expandCapacity(2);
      SerializerFeature serializerFeature0 = SerializerFeature.WriteBigDecimalAsPlain;
      Object object0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) serializerFeature0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.global;
      parserConfig0.setDefaultClassLoader((ClassLoader) null);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("6DPO4m<'+xkl~5d59WT", parserConfig0, 20);
      Class<StringBuffer> class0 = StringBuffer.class;
      stringCodec0.getFastMatchToken();
      stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) null);
      StringCodec stringCodec1 = new StringCodec();
      Feature feature0 = Feature.AllowComment;
      defaultJSONParser0.config(feature0, true);
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 3, json : 6DPO4m<'+xkl~5d59WT
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      ParserConfig parserConfig0 = ParserConfig.global;
      parserConfig0.setDefaultClassLoader((ClassLoader) null);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, 1);
      ParserConfig parserConfig1 = new ParserConfig((ClassLoader) null);
      Class<StringBuffer> class0 = StringBuffer.class;
      StringCodec.deserialze(defaultJSONParser0);
      stringCodec0.getFastMatchToken();
      stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) null);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      // Undeclared exception!
      try { 
        defaultJSONParser0.parseArrayWithType(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Class cannot be cast to java.lang.reflect.ParameterizedType
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }
}