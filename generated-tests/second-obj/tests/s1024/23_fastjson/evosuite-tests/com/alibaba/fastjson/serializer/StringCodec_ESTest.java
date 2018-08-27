/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:19:17 GMT 2018
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.alibaba.fastjson.serializer.StringCodec;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringCodec_ESTest extends StringCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      defaultJSONParser0.close();
      Method method0 = StringCodec.deserialze(defaultJSONParser0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.write(jSONSerializer0, "=");
      int int0 = Opcodes.BIPUSH;
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringCodec stringCodec0 = StringCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      stringCodec0.instance.write(jSONSerializer0, "@Jw@SE!&");
      // Undeclared exception!
      try { 
        stringCodec0.write(jSONSerializer0, (Object) jSONSerializer0, (Object) jSONSerializer0, (Type) null, 6);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson.serializer.JSONSerializer cannot be cast to java.lang.String
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
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("1.2.46");
      Class<StringBuilder> class0 = StringBuilder.class;
      Class<Integer> class1 = Integer.class;
      DefaultJSONParser defaultJSONParser1 = new DefaultJSONParser("");
      System.setCurrentTimeMillis(1);
      StringCodec stringCodec0 = new StringCodec();
      stringCodec0.deserialze(defaultJSONParser1, (Type) class0, (Object) class1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringCodec stringCodec0 = new StringCodec();
      Class<StringBuffer> class0 = StringBuffer.class;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "l");
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      Object object0 = new Object();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      MockHijrahDate mockHijrahDate1 = new MockHijrahDate();
      Object object1 = stringCodec0.deserialze(defaultJSONParser0, (Type) class0, (Object) mockHijrahDate1);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("\"vr]]68!mp| E\"bf~x");
      StringCodec.deserialze(defaultJSONParser0);
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      ParserConfig.getGlobalInstance();
      Object object0 = new Object();
      StringCodec stringCodec0 = new StringCodec();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "fastjson.parser.deny");
      stringCodec0.getFastMatchToken();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "fastjson.parser.autoTypeSupport";
      stringArray0[1] = "fastjson.parser.deny";
      SimplePropertyPreFilter simplePropertyPreFilter0 = new SimplePropertyPreFilter(stringArray0);
      simplePropertyPreFilter0.getClazz();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      assertNull(jSONSerializer0.getDateFormatPattern());
  }
}
