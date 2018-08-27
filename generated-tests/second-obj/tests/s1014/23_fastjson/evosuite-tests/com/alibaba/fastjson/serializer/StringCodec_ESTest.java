/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 02:15:03 GMT 2018
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.StringCodec;
import java.lang.reflect.Type;
import java.time.Duration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
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
      // Undeclared exception!
      try { 
        stringCodec0.write((JSONSerializer) null, (Object) null, (Object) null, (Type) null, 1296);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.StringCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      Integer integer0 = stringCodec0.deserialze(defaultJSONParser0, (Type) null, (Object) mockJapaneseDate0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.write(jSONSerializer0, "");
      assertEquals(4, stringCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      stringCodec0.write(jSONSerializer0, (String) null);
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, 1);
      StringBuilder stringBuilder0 = new StringBuilder("");
      Class<StringBuilder> class0 = StringBuilder.class;
      Duration.ofSeconds((long) 0);
      stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      Class<StringBuffer> class0 = StringBuffer.class;
      Object object0 = new Object();
      StringCodec stringCodec1 = StringCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      stringCodec1.deserialze(defaultJSONParser0, (Type) class0, (Object) null);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      MockHijrahDate mockHijrahDate0 = StringCodec.deserialze(defaultJSONParser0);
      assertNull(mockHijrahDate0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("1E4", parserConfig0, 1458);
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      StringCodec.deserialze(defaultJSONParser0);
      StringCodec stringCodec0 = StringCodec.instance;
      Object object0 = new Object();
      StringCodec stringCodec1 = StringCodec.instance;
      StringCodec stringCodec2 = StringCodec.instance;
      StringBuilder stringBuilder0 = new StringBuilder("1E4");
      assertEquals("1E4", stringBuilder0.toString());
  }
}