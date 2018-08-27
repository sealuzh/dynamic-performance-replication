/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 00:48:10 GMT 2018
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
import com.alibaba.fastjson.serializer.StringCodec;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringCodec_ESTest extends StringCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("java/lang/Float");
      Class<MockMinguoDate> class0 = MockMinguoDate.class;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) mockJapaneseDate0, (Object) class0, (Type) class0, 2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate cannot be cast to java.lang.String
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.write(jSONSerializer0, "com.alibaba.fastjson.serializer.StringCodec");
      assertEquals(4, stringCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      Class<MockMinguoDate> class0 = MockMinguoDate.class;
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      MockMinguoDate mockMinguoDate1 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) mockMinguoDate0);
      assertNull(mockMinguoDate1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.write(jSONSerializer0, (String) null);
      assertEquals(4, stringCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("69x!\">");
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, jSONReaderScanner0, parserConfig0);
      // Undeclared exception!
      try { 
        StringCodec.deserialze(defaultJSONParser0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal state. !
         //
         verifyException("com.alibaba.fastjson.parser.JSONLexerBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HashMap<String, Field> hashMap0 = new HashMap<String, Field>();
      Class<StringBuffer> class0 = StringBuffer.class;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      StringCodec stringCodec0 = new StringCodec();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      Class<Object> class1 = Object.class;
      String string0 = File.separator;
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      Object object0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) class1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HashMap<String, Field> hashMap0 = new HashMap<String, Field>();
      JSONScanner jSONScanner0 = new JSONScanner("");
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONScanner0, parserConfig0);
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      Class<StringBuilder> class0 = StringBuilder.class;
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      StringCodec stringCodec0 = StringCodec.instance;
      Method method0 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) hashMap1);
      assertNull(method0);
  }
}