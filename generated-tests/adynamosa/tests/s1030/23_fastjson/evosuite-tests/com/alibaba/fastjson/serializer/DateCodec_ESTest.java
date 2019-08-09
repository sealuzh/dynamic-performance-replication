/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 23:54:10 GMT 2019
 */

package com.alibaba.fastjson.serializer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.serializer.DateCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.io.File;
import java.io.PipedOutputStream;
import java.lang.reflect.Type;
import java.time.Month;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
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
      SerializeConfig serializeConfig0 = new SerializeConfig(true);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeConfig0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        dateCodec0.instance.write(jSONSerializer0, jSONSerializer0, object0, (Type) null, 596);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : 
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Double> class0 = Double.TYPE;
      File file0 = MockFile.createTempFile("ilV$.n", (String) null);
      MockFileWriter mockFileWriter0 = new MockFileWriter(file0, false);
      SerializeWriter serializeWriter0 = new SerializeWriter(mockFileWriter0);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0, serializeConfig0);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockFileWriter0, (Object) null, class0, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : org.evosuite.runtime.mock.java.io.MockFileWriter@49b1fdba
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      jSONSerializer0.incrementIndent();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(245, 2, 245, 0, (-780));
      Class<Float> class0 = Float.class;
      Long long0 = new Long((-2046230269));
      dateCodec0.write(jSONSerializer0, long0, mockGregorianCalendar0, class0, (-2046230269));
      assertTrue(mockGregorianCalendar0.isLenient());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Long long0 = new Long(0L);
      jSONSerializer0.decrementIdent();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-1888596975), (-1888596975), (-1888596975), (-2046230269), 48);
      Class<MockCalendar> class0 = MockCalendar.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      dateCodec0.write(jSONSerializer0, long0, mockGregorianCalendar0, class1, (-1888596975));
      assertFalse(class1.isInterface());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      Class<Double> class0 = Double.TYPE;
      String string0 = dateCodec0.cast((DefaultJSONParser) null, (Type) class0, (Object) null, (Object) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("9D9 $KNCd3VpE|tx");
      DateCodec dateCodec0 = new DateCodec();
      Object object0 = new Object();
      defaultJSONParser0.setResolveStatus(2);
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, object0, (Object) "az`76uI\"X?=.$4 >l>B");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"az`76uI\"X?=.$4 >l>B\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("99 $KNCd3VpE|tx");
      DateCodec dateCodec0 = DateCodec.instance;
      Object object0 = new Object();
      defaultJSONParser0.setResolveStatus((-2140));
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, object0, (Object) "az`76uI\"X?=.$4 >l>B");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"az`76uI\"X?=.$4 >l>B\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      // Undeclared exception!
      try { 
        dateCodec0.write((JSONSerializer) null, "0001-01-01t00:00:00+08:00", "0001-01-01t00:00:00+08:00", (Type) null, 946);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSON.DEFFAULT_DATE_FORMAT = "+<owaTsO(*!!k\"J h";
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("+<owaTsO(*!!k\"J h");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) defaultJSONParser0, (Object) "+<owaTsO(*!!k\"J h");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'o'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("0001-01-01T00:00:00+08:00");
      dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "0001-01-01T00:00:00+08:00", (Object) "0001-01-01T00:00:00+08:00");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("_5'x^`0T$");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 1, 0, (-510), (-1668008629), 438);
      dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) mockGregorianCalendar0, (Object) "0000-00-00T00:00:00");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(":(xyk<NVLr`D@s8]");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) "/Date(99s $KNCd3V7E;|tx");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"/Date(99s $KNCd3V7E;|tx\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("000000-00T00:00:00.000");
      DateCodec dateCodec0 = DateCodec.instance;
      Month month0 = Month.MARCH;
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) month0, (Object) "000000-00T00:00:00.000");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"000000-00T00:00:00.000\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) "", (Object) "");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Class<MockCalendar> class0 = MockCalendar.class;
      Type[] typeArray0 = new Type[8];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, class0, typeArray0[2]);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("com.alibaba.fastjson.serializer.DateCodec");
      // Undeclared exception!
      try { 
        dateCodec0.cast(defaultJSONParser0, (Type) parameterizedTypeImpl0, (Object) defaultJSONParser0.NeedToResolve, (Object) pipedOutputStream0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // parse error
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Float float0 = new Float((-2255.531793));
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) mockGregorianCalendar0, (Object) float0);
      assertEquals("Wed Dec 31 23:59:57 GMT 1969", object0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("");
      MockDate mockDate0 = new MockDate((-499454677), 100, 1406, 1, 2, (-2081));
      Object object0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) mockDate0);
      assertEquals("Sat Jul 05 14:53:10 GMT 85091028", object0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedOutputStream0);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockPrintWriter0, (-1415872522), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<MockCalendar> class0 = MockCalendar.class;
      Integer integer0 = new Integer((-1415872522));
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(11, 11, (-1415872522));
      Type[] typeArray0 = new Type[8];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, class0, typeArray0[2]);
      // Undeclared exception!
      try { 
        dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, integer0, parameterizedTypeImpl0, 99999999);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.util.MockGregorianCalendar cannot be cast to java.util.Date
         //
         verifyException("com.alibaba.fastjson.serializer.DateCodec", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedOutputStream0);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      SerializeWriter serializeWriter0 = new SerializeWriter(mockPrintWriter0, (-1941), serializerFeatureArray0);
      JSONSerializer jSONSerializer0 = new JSONSerializer(serializeWriter0);
      Class<MockCalendar> class0 = MockCalendar.class;
      Integer integer0 = new Integer((-1941));
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(11, 11, (-1941));
      Type[] typeArray0 = new Type[8];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, class0, typeArray0[2]);
      dateCodec0.write(jSONSerializer0, mockGregorianCalendar0, integer0, parameterizedTypeImpl0, 99999999);
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      Byte byte0 = new Byte((byte) (-14));
      dateCodec0.write(jSONSerializer0, (Object) null, byte0, (Type) null, 870);
      assertEquals(0, jSONSerializer0.getIndentCount());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateCodec dateCodec0 = DateCodec.instance;
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser(":(zyk<NVLr`D@s8'");
      Date date0 = dateCodec0.cast(defaultJSONParser0, (Type) null, (Object) null, (Object) "8");
      JSONSerializer jSONSerializer0 = new JSONSerializer();
      dateCodec0.write(jSONSerializer0, date0, ":(zyk<NVLr`D@s8'", (Type) null, (-1792));
      assertNull(jSONSerializer0.getDateFormatPattern());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateCodec dateCodec0 = new DateCodec();
      int int0 = dateCodec0.getFastMatchToken();
      assertEquals(2, int0);
  }
}