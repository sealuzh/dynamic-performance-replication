/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 17:07:31 GMT 2018
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.JavaBeanInfo;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PipedWriter;
import java.io.SequenceInputStream;
import java.lang.reflect.Type;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      SerializeConfig serializeConfig0 = SerializeConfig.getGlobalInstance();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Short short0 = new Short((short)903);
      dateCodec0.write(jSONSerializer0, short0, jSONSerializer0, class0, (short)903);
      assertEquals("byte", class0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("3P3,Kp\"n");
      MockHijrahDate mockHijrahDate0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0, (Object) null);
      assertNull(mockHijrahDate0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      Class<Short> class0 = Short.TYPE;
      dateCodec0.write(jSONSerializer0, (Object) null, mockThaiBuddhistDate0, class0, 1421);
      assertEquals(1041, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("3P3,Kp\"n");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0, (Object) "3P3,Kp\"n");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"3P3,Kp\"n\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Byte> class0 = Byte.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("yyyyMMddHHmmssSSSZ");
      DateCodec dateCodec1 = new DateCodec();
      // Undeclared exception!
      try { 
        dateCodec1.cast(defaultJSONParser0, (Type) class0, (Object) dateCodec0, (Object) "/Date(3P3,Kp\"n");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(3P3,Kp\"n\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      MockDate mockDate0 = new MockDate();
      SerializerFeature serializerFeature0 = SerializerFeature.IgnoreNonFieldGetter;
      SerializeConfig serializeConfig0 = new SerializeConfig(317, false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Object object0 = new Object();
      dateCodec0.write(jSONSerializer0, mockDate0, jSONSerializer0, class0, 317);
      assertEquals("byte", class0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<SerializerFeature> class0 = SerializerFeature.class;
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("8o");
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      dateCodec0.getFastMatchToken();
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) ";Ljava/lang/Object;I)Z", (Object) ";Ljava/lang/Object;I)Z");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \";Ljava/lang/Object;I)Z\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      SerializeConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("N.:f.saJ.ujTXzlfgxt");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "N.:f.saJ.ujTXzlfgxt");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"N.:f.saJ.ujTXzlfgxt\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("0", (-476));
      ParserConfig parserConfig0 = new ParserConfig();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(mockThaiBuddhistDate0, jSONReaderScanner0, parserConfig0);
      dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) parserConfig0, (Object) "0000-00-00T00:00:00");
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullNumberAsZero;
      assertEquals(SerializerFeature.WriteNullNumberAsZero, serializerFeature0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      SerializeConfig serializeConfig0 = new SerializeConfig(317, true);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Object object0 = new Object();
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("", parserConfig0);
      dateCodec0.cast(defaultJSONParser0, (Type) class1, (Object) "", (Object) "");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "", (Object) parserConfig0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      InputStreamReader inputStreamReader0 = new InputStreamReader(bufferedInputStream0);
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(inputStreamReader0, (-3025));
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      Short short0 = new Short((short)6491);
      Short.toUnsignedLong((short)6491);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(short0, jSONReaderScanner0, parserConfig0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0, (Object) "/Date()/");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      ParserConfig.getGlobalInstance();
      Short short0 = new Short((short) (-1171));
      MockFileWriter mockFileWriter0 = new MockFileWriter("~3A<_q4?'", false);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, 610, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig(false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      ZoneInfo zoneInfo0 = (ZoneInfo)jSONSerializer0.timeZone;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(zoneInfo0);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, mockGregorianCalendar0, class0, 841);
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Byte> class0 = Byte.TYPE;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("`yb;8^K,GABG u7%jW");
      MockHijrahDate mockHijrahDate0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) defaultJSONParser0, (Object) "0000-00-00");
      assertNull(mockHijrahDate0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<Byte> class0 = Byte.TYPE;
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      MockFileWriter mockFileWriter0 = new MockFileWriter("/Date(/Date()/", false);
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0, 610);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.QuoteFieldNames;
      serializerFeatureArray0[1] = serializerFeature1;
      SerializeWriter serializeWriter1 = new SerializeWriter(serializeWriter0, 94, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = new SerializeConfig(false);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1, serializeConfig0);
      DateCodec dateCodec1 = new DateCodec();
      ZoneInfo zoneInfo0 = (ZoneInfo)jSONSerializer0.timeZone;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(94, 94, 610, 610, 94);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar((-3025), 96, 94, 198, (-427), 96);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar1, mockJapaneseDate0, class0, 610);
      assertEquals(21, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0);
      InputStreamReader inputStreamReader0 = new InputStreamReader(bufferedInputStream0);
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner(inputStreamReader0, (-3025));
      PipedWriter pipedWriter0 = new PipedWriter();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(pipedWriter0, 318, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      DateCodec dateCodec0 = new DateCodec();
      ZoneInfo zoneInfo0 = (ZoneInfo)jSONSerializer0.timeZone;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(zoneInfo0);
      JSON.DEFAULT_TYPE_KEY = "()Ljavalan/String;";
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(2048, (-427), (-3025), (-3025), 198, 0);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar1, (Object) null, class0, 318);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar1, serializeConfig0, class0, 0);
      assertEquals(26, serializeWriter0.size());
  }
}