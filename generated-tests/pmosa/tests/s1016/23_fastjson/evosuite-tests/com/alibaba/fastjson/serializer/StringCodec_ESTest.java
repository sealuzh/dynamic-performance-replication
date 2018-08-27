/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 08:45:02 GMT 2018
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
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.chrono.ChronoLocalDate;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringCodec_ESTest extends StringCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      stringCodec0.getFastMatchToken();
      stringCodec0.getFastMatchToken();
      String string0 = "yyyy-MM-ddTHH:mm:ss";
      ParserConfig parserConfig0 = new ParserConfig((ASMDeserializerFactory) null);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("yyyy-MM-ddTHH:mm:ss", parserConfig0, 4);
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, json : yyyy-MM-ddTHH:mm:ss
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Locale locale0 = Locale.US;
      jSONSerializer0.locale = locale0;
      stringCodec0.write(jSONSerializer0, "6\"?gaP");
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("Z$}I$uM", parserConfig0, 0);
      Class<Annotation> class0 = Annotation.class;
      String[] stringArray0 = new String[2];
      stringArray0[0] = "fastjson.parser.autoTypeSupport";
      stringArray0[1] = "fastjson.parser.autoTypeSupport";
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, stringArray0);
      // Undeclared exception!
      try { 
        javaBeanSerializer0.getBeanContext(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.alibaba.fastjson.serializer.JavaBeanSerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("I7c&r QNmfP*j\"NVKy", parserConfig0, 4);
      JavaBeanInfo.getBuilderClass((JSONType) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) null, object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, json : I7c&r QNmfP*j\"NVKy
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, 4);
      Class<StringBuffer> class0 = StringBuffer.class;
      Object object0 = new Object();
      StringCodec stringCodec0 = StringCodec.instance;
      StringBuilder stringBuilder0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) "");
      assertNull(stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      StringCodec.instance = stringCodec0;
      Class<MockMinguoDate> class0 = MockMinguoDate.class;
      Class<ChronoLocalDate> class1 = ChronoLocalDate.class;
      IdentityHashMap<String, Field> identityHashMap0 = new IdentityHashMap<String, Field>();
      ParserConfig.getFieldFromCache("com.alibaba.fastjson.serializer.StringCodec", identityHashMap0);
      FieldInfo fieldInfo0 = new FieldInfo("com.alibaba.fastjson.serializer.StringCodec", class1, class0, (Type) null, (Field) null, 1296, 2328, 0);
      BeanContext beanContext0 = new BeanContext(class0, fieldInfo0);
      Class<Annotation> class2 = Annotation.class;
      beanContext0.getMethod();
      SerializerFeature serializerFeature0 = SerializerFeature.QuoteFieldNames;
      StringCodec.instance.write(jSONSerializer0, (Object) null, (Object) serializerFeature0, (Type) class2, 0);
      beanContext0.getAnnation(class2);
      beanContext0.getMethod();
      StringCodec.instance.write(jSONSerializer0, (Object) "com.alibaba.fastjson.serializer.StringCodec", (Object) null, (Type) class0, 1296);
      stringCodec0.write(jSONSerializer0, "com.alibaba.fastjson.serializer.StringCodec");
      stringCodec0.getFastMatchToken();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      String string0 = StringCodec.deserialze(defaultJSONParser0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, 4);
      Class<StringBuilder> class0 = StringBuilder.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      Object object0 = new Object();
      StringCodec stringCodec0 = new StringCodec();
      StringBuilder stringBuilder0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class1, (Object) aSMDeserializerFactory0);
      assertNull(stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, 10);
      Class<StringBuilder> class0 = StringBuilder.class;
      Object object0 = new Object();
      StringCodec stringCodec0 = new StringCodec();
      StringBuilder stringBuilder0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) parserConfig0);
      assertNull(stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("56y'ew*J:xS6~_Jkq>-", parserConfig0, 10);
      Class<StringBuilder> class0 = StringBuilder.class;
      Object object0 = new Object();
      StringCodec stringCodec0 = new StringCodec();
      StringBuilder stringBuilder0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0);
      assertNotNull(stringBuilder0);
  }
}