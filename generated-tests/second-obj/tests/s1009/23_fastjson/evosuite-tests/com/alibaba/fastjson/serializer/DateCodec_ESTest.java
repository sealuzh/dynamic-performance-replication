/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 22:33:02 GMT 2018
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.chrono.ChronoLocalDate;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) null, (Object) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(":00");
      ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(":00");
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      Class<Byte> class0 = Byte.TYPE;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) mockMinguoDate0, (Object) "fastjson.parser.deny");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"fastjson.parser.deny\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Double double0 = new Double(0.0);
      Class<Byte> class0 = Byte.TYPE;
      Object object0 = new Object();
      dateCodec0.write(jSONSerializer0, (Object) null, object0, class0, 19);
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<MockMinguoDate> class0 = MockMinguoDate.class;
      int int0 = Opcodes.FCONST_0;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      char[] charArray0 = new char[5];
      charArray0[1] = '~';
      charArray0[2] = 'T';
      charArray0[3] = '1';
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 6);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "");
      int int1 = Double.BYTES;
      System.setCurrentTimeMillis(0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Double double0 = new Double(0.0);
      Double double1 = new Double(0.0);
      Class<Byte> class0 = Byte.TYPE;
      dateCodec0.write(jSONSerializer0, double0, double1, class0, 4227);
      MockDate mockDate0 = new MockDate();
      dateCodec0.write(jSONSerializer0, mockDate0, mockDate0, class0, 4227);
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      DateCodec dateCodec0 = new DateCodec();
      Field field0 = dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) class0, (Object) null);
      assertNull(field0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("Eww7.8ZzBB!.EDL;uG");
      ParserConfig parserConfig0 = new ParserConfig();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      Class<MockThaiBuddhistDate> class0 = MockThaiBuddhistDate.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      SerializeConfig serializeConfig0 = new SerializeConfig(true);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) jSONReaderScanner0, (Object) "Eww7.8ZzBB!.EDL;uG");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Eww7.8ZzBB!.EDL;uG\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("0000-00-00T00:00:00");
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      Class<Method> class0 = Method.class;
      Class<ChronoLocalDate> class1 = ChronoLocalDate.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class1);
      BeanContext beanContext0 = javaBeanSerializer0.getBeanContext(1);
      beanContext0.getMethod();
      dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) beanContext0, (Object) "0000-00-00T00:00:00");
      LinkedList<MockMinguoDate> linkedList0 = new LinkedList<MockMinguoDate>();
      System.setCurrentTimeMillis(0);
      SerializeWriter serializeWriter0 = new SerializeWriter();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, (SerializeConfig) null);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, jSONReaderScanner0, "0000-00-00T00:00:00", class0, 2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : com.alibaba.fastjson.parser.JSONReaderScanner@2
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSON.setDefaultTypeKey("*M7@s");
      dateCodec0.getFastMatchToken();
      FileSystemHandling.shouldAllThrowIOExceptions();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("%%RtGi:#0[%p/");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "*M7@s", (Object) "/Date(0000-00-00T0:00:00");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(0000-00-00T0:00:00\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      byte[] byteArray0 = new byte[13];
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("MiscCodec not support ");
      SerializeConfig serializeConfig0 = new SerializeConfig(2);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      ZoneInfo zoneInfo0 = (ZoneInfo)jSONSerializer0.timeZone;
      JSON.DEFFAULT_DATE_FORMAT = "MiscCodec not support ";
      Class<MockThaiBuddhistDate> class0 = MockThaiBuddhistDate.class;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "MiscCodec not support ");
      JSON.DEFFAULT_DATE_FORMAT = "MiscCodec not support ";
      JSONSerializer jSONSerializer1 = new JSONSerializer();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      FileSystemHandling.shouldAllThrowIOExceptions();
      jSONSerializer1.locale = JSON.defaultLocale;
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      defaultJSONParser0.setConfig(parserConfig0);
      boolean boolean0 = jSONSerializer1.out.disableCircularReferenceDetect;
      System.setCurrentTimeMillis(4647432019745535567L);
      dateCodec0.getFastMatchToken();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) byteArray0, (Object) "MiscCodec not support ");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"MiscCodec not support \"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }
}