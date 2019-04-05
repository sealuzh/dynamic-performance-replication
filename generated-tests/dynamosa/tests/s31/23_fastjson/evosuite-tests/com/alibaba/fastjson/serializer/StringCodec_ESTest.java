/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 20:12:01 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.PipedWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.Month;
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
      SerializeConfig serializeConfig0 = new SerializeConfig(25);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      jSONSerializer0.incrementIndent();
      stringCodec0.write(jSONSerializer0, "");
      assertEquals(1, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteBigDecimalAsPlain;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      jSONSerializer0.decrementIdent();
      stringCodec0.write(jSONSerializer0, "W]os!#*:8>F'd");
      assertEquals(15, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      SerializeWriter serializeWriter0 = new SerializeWriter();
      SerializeConfig serializeConfig0 = new SerializeConfig(false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Integer integer0 = new Integer(3139);
      StringBuilder stringBuilder0 = new StringBuilder("fastjson.parser.autoTypeAccept");
      Type[] typeArray0 = new Type[6];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[0], typeArray0[5]);
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) integer0, (Object) stringBuilder0, (Type) parameterizedTypeImpl0, 738);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Object object0 = new Object();
      stringCodec0.write(jSONSerializer0, (Object) "CFD~t6}ds }", object0, (Type) null, 0);
      assertEquals(4, stringCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      char[] charArray0 = new char[3];
      StringCodec stringCodec0 = StringCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 0, parserConfig0, 0);
      Class<String> class0 = String.class;
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeWriter) null);
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) classLoader0, (Object) defaultJSONParser0, (Type) class0, (-437));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // sun.misc.Launcher$AppClassLoader cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig(25);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      jSONSerializer0.incrementIndent();
      StringBuffer stringBuffer0 = new StringBuffer("");
      stringCodec0.write(jSONSerializer0, (Object) null, (Object) stringBuffer0, (Type) null, 1);
      assertEquals(4, stringCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer((SerializeWriter) null);
      Integer integer0 = new Integer(1172);
      Class<Object> class0 = Object.class;
      Class<Field> class1 = Field.class;
      FieldInfo fieldInfo0 = new FieldInfo("n", class0, class1, class1, (Field) null, 1172, 1172, 86);
      jSONSerializer0.decrementIdent();
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) integer0, (Object) jSONSerializer0, (Type) fieldInfo0.fieldClass, 114);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("8{l8ElAwu(dt|@\"yAs]", parserConfig0, (-43));
      StringCodec stringCodec0 = StringCodec.instance;
      Type[] typeArray0 = new Type[9];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[1], typeArray0[1]);
      Month month0 = Month.OCTOBER;
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<StringBuilder> class0 = StringBuilder.class;
      ParserConfig parserConfig0 = ParserConfig.global;
      JSONScanner jSONScanner0 = new JSONScanner("lH&=%4[9");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(class0, jSONScanner0, parserConfig0);
      StringCodec stringCodec0 = new StringCodec();
      StringBuilder stringBuilder0 = new StringBuilder();
      defaultJSONParser0.resolveStatus = 4;
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) stringBuilder0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, json : lH&=%4[9
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<StringBuilder> class0 = StringBuilder.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      ParserConfig parserConfig0 = ParserConfig.global;
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 837);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, jSONReaderScanner0, parserConfig0);
      defaultJSONParser0.resolveStatus = (-1003);
      StringCodec stringCodec0 = StringCodec.instance;
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) class1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unterminated json string, 
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("8{l8ElAwu(dt|@\"yAs]", parserConfig0, (-43));
      defaultJSONParser0.setResolveStatus(1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.global;
      char[] charArray0 = new char[6];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 837);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, jSONReaderScanner0, parserConfig0);
      defaultJSONParser0.resolveStatus = (-1003);
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unterminated json string, 
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      PipedWriter pipedWriter0 = new PipedWriter();
      SerializeWriter serializeWriter0 = new SerializeWriter(pipedWriter0, 13);
      SerializeConfig serializeConfig0 = new SerializeConfig(13, false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, "8{l8ElAwu(dt|@\"yAs");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      // Undeclared exception!
      try { 
        stringCodec0.write((JSONSerializer) null, (Object) null, (Object) null, (Type) null, 444);
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
      ParserConfig parserConfig0 = ParserConfig.global;
      char[] charArray0 = new char[2];
      charArray0[0] = '-';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 3);
      Object object0 = new Object();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(object0, jSONReaderScanner0, parserConfig0);
      StringCodec stringCodec0 = new StringCodec();
      Class<Integer> class1 = Integer.class;
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) class1);
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
  public void test17()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      char[] charArray0 = new char[9];
      charArray0[0] = '+';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 1, 1);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      // Undeclared exception!
      try { 
        stringCodec0.deserialze(defaultJSONParser0, type0, (Object) defaultJSONParser0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.alibaba.fastjson.parser.JSONReaderScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("J[(~y");
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, pos 1, json : J[(~y
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Field field0 = StringCodec.deserialze(defaultJSONParser0);
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      SerializeWriter serializeWriter0 = new SerializeWriter(39);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      stringCodec0.instance.write(jSONSerializer0, (String) null);
      assertEquals(4, stringCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Integer integer0 = stringCodec0.instance.deserialze(defaultJSONParser0, (Type) null, (Object) "");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      ParserConfig parserConfig0 = new ParserConfig(aSMDeserializerFactory0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("[]Mm>Igcz", parserConfig0, 256);
      String string0 = StringCodec.deserialze(defaultJSONParser0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<StringBuilder> class0 = StringBuilder.class;
      ParserConfig parserConfig0 = ParserConfig.global;
      char[] charArray0 = new char[0];
      JSONScanner jSONScanner0 = new JSONScanner(charArray0, 0, 0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(class0, jSONScanner0, parserConfig0);
      StringCodec stringCodec0 = new StringCodec();
      StringBuilder stringBuilder0 = new StringBuilder();
      String string0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) stringBuilder0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("8{lE\",lAw(d|@\"yAsx", parserConfig0, (-43));
      StringCodec.deserialze(defaultJSONParser0);
      DefaultJSONParser defaultJSONParser1 = new DefaultJSONParser("8", defaultJSONParser0.lexer, parserConfig0);
      DefaultJSONParser defaultJSONParser2 = new DefaultJSONParser(defaultJSONParser1.lexer);
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = StringCodec.instance;
      DefaultJSONParser defaultJSONParser3 = new DefaultJSONParser(defaultJSONParser0.lexer);
      StringBuilder stringBuilder0 = stringCodec0.deserialze(defaultJSONParser3, (Type) class0, (Object) "8{lE\",lAw(d|@\"yAsx");
      assertEquals(",lAw(d|@", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("8{lE\",lAw(d|@\"yAsx", parserConfig0, (-43));
      Class<StringBuilder> class0 = StringBuilder.class;
      StringCodec stringCodec0 = StringCodec.instance;
      StringBuilder stringBuilder0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) "8{lE\",lAw(d|@\"yAsx");
      assertNotNull(stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig();
      Class<StringBuffer> class0 = StringBuffer.class;
      JSONScanner jSONScanner0 = new JSONScanner("");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(parserConfig0, jSONScanner0, parserConfig0);
      StringCodec stringCodec0 = new StringCodec();
      StringBuilder stringBuilder0 = new StringBuilder(15);
      StringBuilder stringBuilder1 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) stringBuilder0);
      assertNull(stringBuilder1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("8{l8ElAwu(dt|@\"yAs]", parserConfig0, (-43));
      Class<StringBuffer> class0 = StringBuffer.class;
      StringCodec stringCodec0 = new StringCodec();
      StringBuilder stringBuilder0 = new StringBuilder(15);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      int int0 = stringCodec0.getFastMatchToken();
      assertEquals(4, int0);
  }
}
