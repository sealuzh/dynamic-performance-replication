/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 13:12:37 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringCodec_ESTest extends StringCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.write(jSONSerializer0, (Object) null, (Object) null, (Type) null, 4);
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("9VFH,yxN9R;Lab4", parserConfig0);
      Object object0 = stringCodec0.deserialze(defaultJSONParser0, (Type) null, (Object) parserConfig0);
      assertEquals("9", object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      jSONSerializer0.incrementIndent();
      stringCodec0.write(jSONSerializer0, "3e)%k/(9S8J`");
      assertEquals(4, stringCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      SerializeWriter serializeWriter0 = new SerializeWriter(1);
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      jSONSerializer0.decrementIdent();
      stringCodec0.write(jSONSerializer0, "oS6eZn");
      assertEquals(8, serializeWriter0.size());
      assertEquals(8, serializeWriter0.getBufferLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<String> class0 = String.class;
      Class<Object> class1 = Object.class;
      Class<Annotation> class2 = Annotation.class;
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) class2, (Object) class1, (Type) class0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Class cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      SerializeConfig serializeConfig0 = new SerializeConfig(4, false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Integer integer0 = new Integer(4);
      Class<Field> class0 = Field.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      Type type0 = javaBeanSerializer0.getFieldType(4);
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) integer0, (Object) integer0, type0, 4);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      Class<Annotation> class0 = Annotation.class;
      Class<Integer> class1 = Integer.class;
      FieldInfo fieldInfo0 = new FieldInfo("_dL9pcCzN#udi", class0, class1, class1, (Field) null, 193, (-1858), 193);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        stringCodec0.write((JSONSerializer) null, (Object) null, object0, (Type) fieldInfo0.fieldClass, (-1858));
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
      StringCodec stringCodec0 = new StringCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Object object0 = new Object();
      jSONSerializer0.incrementIndent();
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, object0, (Object) jSONSerializer0, (Type) null, 1147);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<StringBuffer> class0 = StringBuffer.class;
      StringCodec stringCodec0 = StringCodec.instance;
      SerializeConfig serializeConfig0 = new SerializeConfig(false);
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeWriter) null, serializeConfig0);
      jSONSerializer0.decrementIdent();
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) serializeConfig0, (Object) "3e)%k/(9S8J`", (Type) class0, 2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson.serializer.SerializeConfig cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      char[] charArray0 = new char[6];
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 0, parserConfig0, 0);
      Object object0 = new Object();
      Integer integer0 = stringCodec0.deserialze(defaultJSONParser0, (Type) null, object0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<StringBuffer> class0 = StringBuffer.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("3e)%k/(9S8J`");
      StringCodec stringCodec0 = StringCodec.instance;
      Type[] typeArray0 = new Type[2];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[1], class0);
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) "3e)%k/(9S8J`");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // null, pos 2, json : 3e)%k/(9S8J`
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      Class<StringBuffer> class0 = StringBuffer.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("Nmg(Q[9U HjGuW!C=");
      defaultJSONParser0.resolveStatus = 17;
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 3, json : Nmg(Q[9U HjGuW!C=
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("org.springframework.security.web.authentication.WebAuthenticationDetails");
      StringCodec stringCodec0 = StringCodec.instance;
      defaultJSONParser0.setResolveStatus((-2462));
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) null, (Object) defaultJSONParser0.NeedToResolve);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, json : org.springframework.security.web.authentication.WebAuthenticationDetails
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("?lp!7Z<K*df&Y");
      defaultJSONParser0.setResolveStatus(4);
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, json : ?lp!7Z<K*df&Y
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("3e%@k/9S8J`", parserConfig0, (-1452));
      defaultJSONParser0.resolveStatus = (-1452);
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // For input string: \"3e\", pos 2, json : 3e%@k/9S8J`
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
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
  public void test16()  throws Throwable  {
      Class<StringBuffer> class0 = StringBuffer.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("-MP$k'2qFudm%A@Rc");
      StringCodec stringCodec0 = StringCodec.instance;
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[6-{^:");
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Object object0 = StringCodec.deserialze(defaultJSONParser0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("7xuXA/h%p*Vr+");
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal state. u
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("'RqU*J`CDLNCr_zK've");
      Object object0 = StringCodec.deserialze(defaultJSONParser0);
      assertEquals("RqU*J`CDLNCr_zK", object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("5D3");
      Object object0 = StringCodec.deserialze(defaultJSONParser0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = StringCodec.instance;
      Object object0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      Class<StringBuilder> class0 = StringBuilder.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("\"-9223372036854775808\"");
      SerializerFeature serializerFeature0 = SerializerFeature.UseSingleQuotes;
      Object object0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) serializerFeature0);
      assertEquals("-9223372036854775808", object0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = StringCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("4");
      Object object0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) class0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      Class<StringBuffer> class0 = StringBuffer.class;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, 0);
      Object object0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<StringBuffer> class0 = StringBuffer.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("'D$A?X'ehn");
      StringCodec stringCodec0 = StringCodec.instance;
      StringBuffer stringBuffer0 = (StringBuffer)stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) "'D$A?X'ehn");
      assertEquals(5, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<StringBuffer> class0 = StringBuffer.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("5D3");
      StringCodec stringCodec0 = StringCodec.instance;
      StringBuffer stringBuffer0 = (StringBuffer)stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0.resolveStatus);
      assertNotNull(stringBuffer0);
      assertEquals(27, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      // Undeclared exception!
      try { 
        stringCodec0.deserialze((DefaultJSONParser) null, (Type) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.write(jSONSerializer0, (String) null);
      assertEquals(4, stringCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      int int0 = stringCodec0.getFastMatchToken();
      assertEquals(4, int0);
  }
}