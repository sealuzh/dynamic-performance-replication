/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 08:45:51 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.FieldInfo;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateCodec_ESTest extends DateCodec_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00t00:00:00", parserConfig0, 125);
      Long long0 = new Long((-3932L));
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "0000-00-00t00:00:00", (Object) long0);
      assertEquals("Wed Dec 31 23:59:56 GMT 1969", date0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("r?o)G+", (byte)58);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0);
      Class<Float> class0 = Float.TYPE;
      MockGregorianCalendar mockGregorianCalendar0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) class0, (Object) "0000-00-00");
      assertNull(mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ParserConfig parserConfig0 = new ParserConfig(classLoader0);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("z[#~$;u[a=!bvE5_sq", parserConfig0, 19);
      Class<Calendar> class0 = Calendar.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      Short short0 = new Short((short) (-4480));
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, type0, (Object) short0, (Object) "/Date(");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONReaderScanner jSONReaderScanner0 = new JSONReaderScanner("");
      ParserConfig parserConfig0 = new ParserConfig(true);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(jSONReaderScanner0, parserConfig0);
      Class<Short> class0 = Short.TYPE;
      Short short0 = dateCodec0.cast(defaultJSONParser0, (Type) class0, (Object) "", (Object) "");
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00t00:00:00", parserConfig0, 125);
      Float float0 = new Float((double) 5944107969236155580L);
      Locale locale0 = Locale.TAIWAN;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) float0, (Object) mockGregorianCalendar0);
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
      DateCodec dateCodec0 = new DateCodec();
      ParserConfig parserConfig0 = new ParserConfig();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0000-00-00t00:00:00", parserConfig0, 125);
      Class<String> class0 = String.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      Date date0 = dateCodec0.deserialze(defaultJSONParser0, type0, (Object) "0000-00-00t00:00:00");
      ParseContext parseContext0 = defaultJSONParser0.setContext((Object) date0, (Object) type0);
      String string0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) parseContext0, (Object) "0000-00-00t00:00:00");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      ParserConfig parserConfig0 = ParserConfig.getGlobalInstance();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("childContext", parserConfig0);
      Short short0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) null);
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      PipedWriter pipedWriter0 = new PipedWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedWriter0, false);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[3];
      SerializerFeature serializerFeature0 = SerializerFeature.DisableCheckSpecialChar;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeatureArray0[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockPrintWriter0, 316, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Integer integer0 = Integer.getInteger("0000-00-0000:00:00", (-4357));
      dateCodec0.write(jSONSerializer0, integer0, pipedWriter0, (Type) null, 38);
      assertEquals(26, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      StringWriter stringWriter0 = new StringWriter(1368);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[1];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteNullListAsEmpty;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializeWriter serializeWriter0 = new SerializeWriter(stringWriter0, 2491, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Double double0 = new Double(0.75);
      Class<Integer> class0 = Integer.class;
      Type type0 = FieldInfo.getFieldType(class0, class0, class0);
      dateCodec0.instance.write(jSONSerializer0, double0, stringWriter0, type0, 1491);
      assertEquals(13, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      SerializeWriter serializeWriter0 = new SerializeWriter();
      BufferedWriter bufferedWriter0 = new BufferedWriter(serializeWriter0);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[9];
      SerializerFeature serializerFeature0 = SerializerFeature.SortField;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeature0;
      serializerFeatureArray0[2] = serializerFeatureArray0[1];
      serializerFeatureArray0[3] = serializerFeatureArray0[1];
      serializerFeatureArray0[4] = serializerFeatureArray0[2];
      serializerFeatureArray0[5] = serializerFeatureArray0[1];
      serializerFeatureArray0[6] = serializerFeatureArray0[1];
      serializerFeatureArray0[7] = serializerFeatureArray0[0];
      SerializerFeature serializerFeature1 = SerializerFeature.WriteClassName;
      serializerFeatureArray0[8] = serializerFeature1;
      SerializeWriter serializeWriter1 = new SerializeWriter(bufferedWriter0, serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter1);
      MockDate mockDate0 = new MockDate((-1469L));
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-835), 1, 124, 124, (-835));
      dateCodec0.write(jSONSerializer0, mockDate0, mockGregorianCalendar0, (Type) null, 7);
      assertEquals(64, serializeWriter1.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(1);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[6];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteSlashAsSpecial;
      serializerFeatureArray0[0] = serializerFeature0;
      serializerFeatureArray0[1] = serializerFeatureArray0[0];
      serializerFeatureArray0[2] = serializerFeatureArray0[1];
      SerializerFeature serializerFeature1 = SerializerFeature.WriteDateUseDateFormat;
      serializerFeatureArray0[3] = serializerFeature1;
      serializerFeatureArray0[4] = serializerFeatureArray0[0];
      serializerFeatureArray0[5] = serializerFeatureArray0[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(charArrayWriter0, 2449, serializerFeatureArray0);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      Long long0 = new Long((-2656L));
      Calendar calendar0 = MockCalendar.getInstance();
      dateCodec0.instance.write(jSONSerializer0, long0, calendar0, (Type) null, 16);
      assertEquals(21, serializeWriter0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      Class<MockGregorianCalendar> class0 = MockGregorianCalendar.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2453), 131072, 131072, 0, (-1), 131072);
      javaBeanSerializer0.writeNoneASM(jSONSerializer0, mockGregorianCalendar0, dateCodec0, class0, 0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=216439647812000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=8828,MONTH=8,WEEK_OF_YEAR=38,WEEK_OF_MONTH=3,DAY_OF_MONTH=12,DAY_OF_YEAR=256,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=23,SECOND=32,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<String> class0 = String.class;
      SerializeWriter serializeWriter0 = new SerializeWriter();
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Byte byte0 = new Byte((byte) (-95));
      dateCodec0.instance.write(jSONSerializer0, (Object) null, byte0, class0, (byte) (-95));
      assertEquals(2, dateCodec0.getFastMatchToken());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}