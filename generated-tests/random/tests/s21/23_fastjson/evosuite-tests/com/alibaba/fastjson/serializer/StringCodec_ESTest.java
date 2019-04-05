/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 05:23:54 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerialContext;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.FieldInfo;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringCodec_ESTest extends StringCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      MockFileWriter mockFileWriter0 = new MockFileWriter("initStringFieldAsEmpty");
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0);
      SerializeConfig serializeConfig0 = new SerializeConfig(true);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      stringCodec0.write(jSONSerializer0, "initStringFieldAsEmpty");
      assertEquals(24, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONScanner jSONScanner0 = new JSONScanner("");
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(StringCodec.instance, jSONScanner0, parserConfig0);
      StringBuffer stringBuffer0 = StringCodec.deserialze(defaultJSONParser0);
      assertNull(stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[1] = '6';
      charArray0[2] = '.';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1853);
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      StringCodec.deserialze(defaultJSONParser0);
      assertEquals(0, jSONReaderScanner0.pos());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("6`osGP]!}-=HL", parserConfig0);
      StringCodec.deserialze(defaultJSONParser0);
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 2, json : 6`osGP]!}-=HL
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("8mS]2l", (-2823));
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(stringBuffer0, jSONReaderScanner0, parserConfig0);
      Class<StringBuilder> class0 = StringBuilder.class;
      StringBuilder stringBuilder0 = defaultJSONParser0.parseObject(class0);
      assertNotNull(stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("(");
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) null, (Object) "(");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, json : (
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      Class<StringBuffer> class0 = StringBuffer.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      Annotation annotation0 = StringCodec.instance.deserialze(defaultJSONParser0, type0, (Object) stringCodec0);
      assertNull(annotation0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      Class<StringBuilder> class0 = StringBuilder.class;
      JSONScanner jSONScanner0 = new JSONScanner("");
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(StringCodec.instance, jSONScanner0, parserConfig0);
      SerialContext serialContext0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) null);
      assertNull(serialContext0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.write(jSONSerializer0, (String) null);
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.write(jSONSerializer0, "");
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      int int0 = stringCodec0.getFastMatchToken();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) jSONSerializer0, (Object) jSONSerializer0, (Type) null, (-6021));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson.serializer.JSONSerializer cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }
}
