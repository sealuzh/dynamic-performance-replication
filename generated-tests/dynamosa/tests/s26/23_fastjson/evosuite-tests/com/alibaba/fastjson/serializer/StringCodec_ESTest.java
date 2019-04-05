/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 14:19:17 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringCodec_ESTest extends StringCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("create deserializeUsing ObjectDeserializer error");
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, json : create deserializeUsing ObjectDeserializer error
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<String> class0 = String.class;
      Class class1 = (Class)FieldInfo.getFieldType(class0, class0, class0);
      stringCodec0.instance.write(jSONSerializer0, (Object) null, (Object) null, (Type) class1, 31);
      assertEquals(17, class1.getModifiers());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SerializeConfig serializeConfig0 = new SerializeConfig(16, true);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      StringCodec.instance.write(jSONSerializer0, "f,W3W:!=9d(5}9");
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig(21);
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeWriter) null, serializeConfig0);
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Type[] typeArray0 = new Type[2];
      Class<Field> class0 = Field.class;
      String[] stringArray0 = new String[4];
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, stringArray0);
      Class<?> class1 = javaBeanSerializer0.getType();
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[0], class1);
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) locale_Category0, (Object) jSONSerializer0, (Type) parameterizedTypeImpl0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.Locale$Category cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      SerializeWriter serializeWriter0 = new SerializeWriter(4);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) defaultJSONParser0, object0, (Type) null, 1888);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson.parser.DefaultJSONParser cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeWriter) null);
      Object object0 = new Object();
      Class<String> class0 = String.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, object0, (Object) null, type0, (-209));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      Class<StringBuffer> class0 = StringBuffer.class;
      FieldInfo fieldInfo0 = new FieldInfo("\"-9223372036854775808\"", class0, class0, class0, (Field) null, 67, 1286, 24);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("springfox.documentation.spring.web.json.Json");
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, fieldInfo0.fieldType, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, json : springfox.documentation.spring.web.json.Json
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      ParseContext parseContext0 = defaultJSONParser0.setContext((ParseContext) null, (Object) parserConfig0, (Object) parserConfig0);
      StringBuffer stringBuffer0 = stringCodec0.deserialze(defaultJSONParser0, (Type) null, (Object) parseContext0);
      assertNull(stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("7Pbz\u0001qo*fW0LA`z~%", parserConfig0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      Class<StringBuffer> class0 = StringBuffer.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      defaultJSONParser0.setResolveStatus(4330);
      StringBuffer stringBuffer0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class1, (Object) "");
      assertNull(stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<StringBuffer> class0 = StringBuffer.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("-.=]))X/RT`0'l");
      defaultJSONParser0.setResolveStatus((-1181));
      StringCodec stringCodec0 = new StringCodec();
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // null, pos 2, json : -.=]))X/RT`0'l
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      defaultJSONParser0.setResolveStatus(4330);
      Integer integer0 = StringCodec.deserialze(defaultJSONParser0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      defaultJSONParser0.setResolveStatus((-518));
      Annotation annotation0 = StringCodec.deserialze(defaultJSONParser0);
      assertNull(annotation0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      // Undeclared exception!
      try { 
        stringCodec0.write((JSONSerializer) null, (Object) null, (Object) null, (Type) null, 16);
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
      Class<StringBuilder> class0 = StringBuilder.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("-L])?/DR|`0B");
      StringCodec stringCodec0 = StringCodec.instance;
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) "-L])?/DR|`0B");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      Class<String> class0 = String.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      // Undeclared exception!
      try { 
        stringCodec0.deserialze((DefaultJSONParser) null, type0, (Object) class0);
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
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("9fZRA");
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // error parse false
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
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[]", parserConfig0);
      Object object0 = StringCodec.deserialze(defaultJSONParser0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<StringBuilder> class0 = StringBuilder.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      StringCodec stringCodec0 = StringCodec.instance;
      String string0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      char[] charArray0 = new char[4];
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 1, parserConfig0, 2019);
      Type[] typeArray0 = new Type[2];
      Class<Integer> class0 = Integer.class;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[0], typeArray0[0]);
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unterminated json string, pos 0, json : \u0000
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      Class<StringBuffer> class0 = StringBuffer.class;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("3YF&$%z:");
      StringBuffer stringBuffer0 = (StringBuffer)stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) class0);
      assertEquals(28, stringBuffer0.length());
      assertNotNull(stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("2<tD2%H&V|~W", parserConfig0);
      Class<Object> class0 = Object.class;
      Class<StringBuilder> class1 = StringBuilder.class;
      FieldInfo fieldInfo0 = new FieldInfo("", class0, class1, class0, (Field) null, 916, 16, 1);
      Object object0 = stringCodec0.deserialze(defaultJSONParser0, (Type) fieldInfo0.fieldClass, (Object) parserConfig0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.write(jSONSerializer0, (String) null);
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      int int0 = stringCodec0.getFastMatchToken();
      assertEquals(4, int0);
  }
}
