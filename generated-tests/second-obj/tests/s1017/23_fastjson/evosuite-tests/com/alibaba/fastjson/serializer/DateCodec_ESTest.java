/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 04:59:01 GMT 2018
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
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.chrono.ChronoLocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      System.setCurrentTimeMillis(34L);
      Class<Integer> class0 = Integer.TYPE;
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
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Integer integer0 = new Integer((-1877));
      dateCodec0.write(jSONSerializer0, integer0, jSONSerializer0, (Type) null, 1722);
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeConfig serializeConfig0 = new SerializeConfig(89);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Class<Integer> class0 = Integer.TYPE;
      dateCodec0.instance.write(jSONSerializer0, (Object) null, (Object) null, class0, 39);
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
      
      Class<Short> class0 = Short.TYPE;
      dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) null, (Object) null);
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("eW'{ENZ?TI", parserConfig0);
      String string0 = ParserConfig.AUTOTYPE_SUPPORT_PROPERTY;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "fastjson.parser.autoTypeSupport", (Object) "eW'{ENZ?TI");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"eW'{ENZ?TI\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(":00");
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      classLoader0.clearAssertionStatus();
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      LinkedList<ExtraProcessor> linkedList0 = new LinkedList<ExtraProcessor>();
      parserConfig0.clearDeserializers();
      classLoader0.setDefaultAssertionStatus(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(":00", parserConfig0);
      MockGregorianCalendar mockGregorianCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "0000-00-00T00:00:00", (Object) "0000-00-00T00:00:00");
      assertNull(mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[8];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 0, parserConfig0, 0);
      defaultJSONParser0.getExtraTypeProviders();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      LinkedList<ExtraProcessor> linkedList0 = new LinkedList<ExtraProcessor>();
      DateCodec dateCodec0 = new DateCodec();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) defaultJSONParser0, (Object) "/Date(/Date(Rp!nSaB>m&%RF)/");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(Rp!nSaB>m&%RF\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      char[] charArray0 = new char[15];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      ParserConfig parserConfig0 = ParserConfig.global;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 0, parserConfig0, 0);
      Type type0 = null;
      String string0 = "/Date(Rp!nSaB>m&%RF";
      int int0 = (-2081328671);
      Integer integer0 = new Integer((-2081328671));
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) integer0, (Object) "/Date(Rp!nSaB>m&%RF");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(Rp!nSaB>m&%RF\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[8];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 0);
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 0, parserConfig0, 0);
      LinkedList<ExtraProcessor> linkedList0 = new LinkedList<ExtraProcessor>();
      Properties properties0 = new Properties();
      DateCodec dateCodec0 = new DateCodec();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) defaultJSONParser0, (Object) "WriteEnumUsingToString");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"WriteEnumUsingToString\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      char[] charArray0 = new char[8];
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      parserConfig0.addDeny("/Date(WriteEnumUsingToString");
      Locale locale0 = Locale.ROOT;
      locale0.getScript();
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0, '\u0000');
      defaultJSONParser0.getDateFormat();
      classLoader0.setDefaultAssertionStatus(true);
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
      
      int int1 = Opcodes.IAND;
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) JSON.defaultLocale, (Object) "");
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      ClassLoader.getSystemClassLoader();
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Short short0 = new Short((short) (-147));
      dateCodec0.write(jSONSerializer0, mockDate0, jSONSerializer0, (Type) null, (short) (-147));
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      char[] charArray0 = new char[14];
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(charArray0, 10);
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      jSONReaderScanner0.intValue();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(charArray0, 0, parserConfig0, 0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      defaultJSONParser0.resolveStatus = 476;
      DefaultJSONParser defaultJSONParser1 = new DefaultJSONParser(charArray0, 1, parserConfig0, 0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 0);
      Integer integer0 = new Integer(476);
      dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "0001-01-01t00:00:00+08:00", (Object) "0001-01-01t00:00:00+08:00");
      System.setCurrentTimeMillis(0L);
      Integer integer1 = new Integer(476);
      assertEquals(476, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullListAsEmpty;
      SerializerFeature serializerFeature1 = SerializerFeature.WriteNullListAsEmpty;
      SerializerFeature serializerFeature2 = SerializerFeature.WriteDateUseDateFormat;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      serializerFeatureArray0[0] = serializerFeature2;
      serializerFeatureArray0[1] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Integer integer0 = new Integer(3377);
      Class<Integer> class0 = Integer.TYPE;
      Integer.compare(3377, 50900);
      DateCodec dateCodec0 = new DateCodec();
      dateCodec0.write(jSONSerializer0, integer0, serializerFeature1, class0, 163);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("=@T(=n(ac]Wt|=eg7^:a");
      Long long0 = new Long(1711L);
      SerializerFeature serializerFeature3 = SerializerFeature.BrowserCompatible;
      HashMap<String, Field> hashMap0 = new HashMap<String, Field>(0);
      assertEquals(0, hashMap0.size());
  }
}
