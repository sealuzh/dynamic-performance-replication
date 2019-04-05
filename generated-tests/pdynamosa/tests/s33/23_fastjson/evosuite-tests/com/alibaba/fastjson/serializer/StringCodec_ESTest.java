/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 23:53:58 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringCodec_ESTest extends StringCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      char[] charArray0 = new char[4];
      charArray0[0] = '<';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 167, 167);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) null, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, 
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
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
      StringCodec stringCodec0 = StringCodec.instance;
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      jSONSerializer0.incrementIndent();
      stringCodec0.write(jSONSerializer0, "");
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig(false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      jSONSerializer0.decrementIdent();
      stringCodec0.write(jSONSerializer0, "");
      assertEquals((-1), jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      Class<Object> class0 = Object.class;
      String[] stringArray0 = new String[4];
      SimplePropertyPreFilter simplePropertyPreFilter0 = new SimplePropertyPreFilter(class0, stringArray0);
      Class<?> class1 = simplePropertyPreFilter0.getClazz();
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) propertyNamingStrategy0, (Object) propertyNamingStrategy0, (Type) class1, (-2012));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson.PropertyNamingStrategy cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      // Undeclared exception!
      try { 
        stringCodec0.write((JSONSerializer) null, (Object) null, (Object) null, (Type) null, 163);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeWriter) null);
      jSONSerializer0.decrementIdent();
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) "!cThC", (Object) jSONSerializer0, (Type) null, (-111));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      Class<StringBuffer> class0 = StringBuffer.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      defaultJSONParser0.setResolveStatus(4);
      Object object0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) "u{Or<9fn))");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("43e|");
      defaultJSONParser0.setResolveStatus((-875));
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = StringCodec.instance;
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // null, pos 3, json : 43e|
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      defaultJSONParser0.resolveStatus = 759;
      StringCodec.deserialze(defaultJSONParser0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("2");
      defaultJSONParser0.setResolveStatus((-635));
      String string0 = StringCodec.deserialze(defaultJSONParser0);
      assertEquals("2", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeWriter) null, serializeConfig0);
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeConfig) null);
      StringBuffer stringBuffer0 = new StringBuffer(0);
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) stringBuffer0, (Object) null, (Type) null, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.StringBuffer cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("-:");
      Class<StringBuilder> class0 = StringBuilder.class;
      StringBuilder stringBuilder0 = new StringBuilder("F4w%-l~OV");
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) stringBuilder0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        stringCodec0.deserialze((DefaultJSONParser) null, (Type) null, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("4e");
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // null, pos 2, json : 4e
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(512);
      BufferedWriter bufferedWriter0 = new BufferedWriter(charArrayWriter0);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[5];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteEnumUsingName;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeatureArray0[0];
      serializerFeatureArray0[3] = serializerFeatureArray0[0];
      serializerFeatureArray0[4] = serializerFeatureArray0[1];
      SerializeWriter serializeWriter0 = new SerializeWriter(bufferedWriter0, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      stringCodec0.write(jSONSerializer0, "java.math.BigDecimal@0000000003");
      assertEquals(33, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("43e0|");
      String string0 = StringCodec.deserialze(defaultJSONParser0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("\"=M~M^IEs@\"rTt[", parserConfig0);
      Object object0 = stringCodec0.deserialze(defaultJSONParser0, (Type) null, (Object) null);
      assertEquals("=M~M^IEs@", object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      StringCodec stringCodec0 = StringCodec.instance;
      Type[] typeArray0 = new Type[7];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[6], typeArray0[6]);
      StringBuilder stringBuilder0 = stringCodec0.deserialze(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) parameterizedTypeImpl0);
      assertNull(stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("4O3e|");
      Class<StringBuffer> class0 = StringBuffer.class;
      StringCodec stringCodec0 = StringCodec.instance;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      StringBuffer stringBuffer0 = (StringBuffer)stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) propertyNamingStrategy0);
      assertNotNull(stringBuffer0);
      assertEquals(28, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = StringCodec.instance;
      String string0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.write(jSONSerializer0, (String) null);
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      int int0 = stringCodec0.getFastMatchToken();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl((Type[]) null, (Type) null, (Type) null);
      stringCodec0.write(jSONSerializer0, (Object) "2", (Object) null, (Type) parameterizedTypeImpl0, 2);
      assertEquals(4, stringCodec0.getFastMatchToken());
  }
}