/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 23:47:29 GMT 2018
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.lang.reflect.Type;
import java.time.temporal.ChronoField;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      MockFileWriter mockFileWriter0 = new MockFileWriter("<ZXM  7hnOsW");
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0);
      SerializeWriter serializeWriter1 = serializeWriter0.append('|');
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      Short short0 = new Short((short)1);
      Class<Byte> class0 = Byte.TYPE;
      dateCodec0.write(jSONSerializer0, short0, mockFileWriter0, class0, 0);
      assertEquals(2, serializeWriter1.size());
      assertEquals(2, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSON.DEFFAULT_DATE_FORMAT = "5Ewu?cf<h<";
      Class<Byte> class0 = Byte.TYPE;
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("5Ewu?cf<h<", parserConfig0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "fastjson.parser.autoTypeSupport", (Object) "000-00-00It00:00:00");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"000-00-00It00:00:00\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Class<Byte> class0 = Byte.TYPE;
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("bmIu5", parserConfig0, (-3941));
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) fileSystemHandling0, (Object) "yyyy-MM-dd HH:mm:ss");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"yyyy-MM-dd HH:mm:ss\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Class<Double> class0 = Double.TYPE;
      dateCodec0.write(jSONSerializer0, (Object) null, (Object) null, class0, 44);
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeWriter serializeWriter0 = new SerializeWriter();
      SerializeConfig serializeConfig0 = new SerializeConfig();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      MockDate mockDate0 = new MockDate(1, 1, 1, 1, 1);
      dateCodec0.write(jSONSerializer0, mockDate0, mockDate0, (Type) null, 1);
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("m|Ar-S#KkrhsF_", 1);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      SerializerFeature serializerFeature0 = SerializerFeature.BrowserSecure;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) mockDate0, (Object) serializerFeature0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      Class<Byte> class0 = Byte.TYPE;
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig(false);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00t00:00:00");
      dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "fastjson.parser.autoTypeSupport", (Object) "0000-00-00t00:00:00");
      System.setCurrentTimeMillis(0);
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer1 = new JSONSerializer(serializeConfig0);
      jSONSerializer0.toString();
      byte byte0 = (byte)4;
      ChronoField chronoField0 = ChronoField.MINUTE_OF_DAY;
      int int0 = (-727);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, chronoField0, mockMinguoDate0, (Type) null, (-727));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : MinuteOfDay
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Class<Byte> class0 = Byte.TYPE;
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("bpIu", parserConfig0, (-3946));
      JSON.DEFFAULT_DATE_FORMAT = "0001-01-01T00:00:00+08:00";
      dateCodec0.getFastMatchToken();
      dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) fileSystemHandling0, (Object) "0001-01-01T00:00:00+08:00");
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      SerializerFeature serializerFeature0 = SerializerFeature.BrowserSecure;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = null;
      try {
        serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.SerializeWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      JSON.DEFFAULT_DATE_FORMAT = "0001-01-01T00:00:00+08:00";
      parserConfig0.clearDeserializers();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      SerializerFeature serializerFeature0 = SerializerFeature.NotWriteDefaultValue;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[1] = serializerFeature1;
      SerializerFeature serializerFeature2 = SerializerFeature.BrowserSecure;
      serializerFeatureArray0[2] = serializerFeature2;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeWriter serializeWriter1 = serializeWriter0.append('.');
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      MockDate mockDate0 = new MockDate();
      dateCodec0.write(jSONSerializer0, mockDate0, mockDate0, class0, 23);
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("YSPxH=IJ{AC-J", parserConfig0, (-3947));
      JSON.DEFFAULT_DATE_FORMAT = "fastjson.parser.deny";
      parserConfig0.clearDeserializers();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNonStringKeyAsString;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[1] = serializerFeature1;
      serializerFeatureArray0[2] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      SerializeWriter serializeWriter1 = serializeWriter0.append('.');
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0, 0);
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("fastjson.parser.autoTypeAccept", 0);
      dateCodec0.write(jSONSerializer0, mockDate0, mockDate0, class0, 23);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0, (Object) "fastjson.parser.deny");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"fastjson.parser.deny\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("ol'.bg8[$", parserConfig0, (-3946));
      JSON.DEFFAULT_DATE_FORMAT = "ol'.bg8[$";
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      SerializeWriter serializeWriter0 = new SerializeWriter();
      System.setCurrentTimeMillis(0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) JSON.defaultTimeZone, (Object) "/Date(*k:I.ihZ!^:\"m");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(*k:I.ihZ!^:\"m\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("ol'.bg8[$", parserConfig0, (-3946));
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      SerializerFeature serializerFeature0 = SerializerFeature.NotWriteDefaultValue;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.UseISO8601DateFormat;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature1;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      parserConfig0.addDeny("ol'.bg8[$");
      jSONSerializer0.beforeFilters = null;
      MockDate mockDate0 = new MockDate(1, 0, 0, 2, 8231, 2);
      MockDate mockDate1 = new MockDate(8231, 2, 0, (-3946), 0);
      mockDate0.after(mockDate1);
      dateCodec0.write(jSONSerializer0, mockDate0, mockDate1, class0, 10);
      System.setCurrentTimeMillis(1);
      System.setCurrentTimeMillis(3466L);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      FileSystemHandling.shouldAllThrowIOExceptions();
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.global;
      SerializeWriter serializeWriter0 = new SerializeWriter(14);
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      TimeZone timeZone0 = mockGregorianCalendar0.getTimeZone();
      jSONSerializer0.write(";mi+<7W?VH+^_RO");
      jSONSerializer0.timeZone = timeZone0;
      Short short0 = new Short((short) (-813));
      Short.toUnsignedLong((short)1568);
      ParserConfig.global = parserConfig0;
      parserConfig0.clearDeserializers();
      JSON.DEFFAULT_DATE_FORMAT = "M";
      FileSystemHandling.shouldAllThrowIOExceptions();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("M", parserConfig0);
      System.setCurrentTimeMillis(0);
      Object object0 = new Object();
      defaultJSONParser0.resolveReference("fastjson.parser.autoTypeAccept");
      System.setCurrentTimeMillis(14);
      dateCodec0.cast(defaultJSONParser0, (Type) class0, object0, (Object) "0000-00-00");
      System.setCurrentTimeMillis((-1237L));
      dateCodec0.getFastMatchToken();
      System.setCurrentTimeMillis(0);
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("ol'.bg8[$", parserConfig0, (-3946));
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      SerializerFeature serializerFeature0 = SerializerFeature.NotWriteDefaultValue;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeature1;
      SerializeWriter serializeWriter0 = new SerializeWriter(serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      parserConfig0.addDeny("ol'.bg8[$");
      jSONSerializer0.beforeFilters = null;
      MockDate mockDate0 = new MockDate(1, 0, 0, 2, 8231, 2);
      MockDate mockDate1 = new MockDate(8231, 2, 0, (-3946), 0);
      mockDate0.after(mockDate1);
      dateCodec0.write(jSONSerializer0, mockDate0, mockDate1, class0, 10);
      System.setCurrentTimeMillis(1);
      System.setCurrentTimeMillis(3466L);
      System.setCurrentTimeMillis(143L);
  }
}