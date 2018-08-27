/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 20:55:06 GMT 2018
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.ObjectStreamConstants;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.IsoChronology;
import java.time.format.ResolverStyle;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONArray_ESTest extends JSONArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.listIterator(72);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 72
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentRemove(72);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 72, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getInteger(72);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 72, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentAdd((Object) null);
      int int0 = jSONArray0.lastIndexOf((Object) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSON.defaultTimeZone = jSONArray0.defaultTimeZone;
      ListIterator<Object> listIterator0 = jSONArray0.listIterator();
      assertFalse(listIterator0.hasPrevious());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      int int0 = (-1891);
      // Undeclared exception!
      try { 
        jSONArray0.fluentSet((-1891), (Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2047);
      // Undeclared exception!
      try { 
        jSONArray0.fluentAdd(2360, (Object) "1.2.46");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2360, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.add((Object) null);
      int int0 = Opcodes.INVOKEVIRTUAL;
      assertEquals(182, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.clear();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      short short0 = ObjectStreamConstants.STREAM_MAGIC;
      assertEquals((short) (-21267), short0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getTimestamp(23);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 23, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(879);
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      Object[] objectArray0 = jSONArray1.toArray();
      assertNotNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentAdd(object0);
      jSONArray0.addAll((Collection<?>) jSONArray1);
      jSONArray1.fluentSet(0, object0);
      assertEquals(2, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(487);
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JSONArray jSONArray1 = jSONArray0.fluentRemove((Object) propertyNamingStrategy0);
      boolean boolean0 = jSONArray1.retainAll(jSONArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(879);
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      Class<MockHijrahDate> class0 = MockHijrahDate.class;
      List<MockHijrahDate> list0 = jSONArray1.toJavaList(class0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<MockJapaneseDate> linkedList0 = new LinkedList<MockJapaneseDate>();
      JSONArray jSONArray1 = jSONArray0.fluentAddAll((Collection<?>) linkedList0);
      // Undeclared exception!
      try { 
        jSONArray1.add(3164, (Object) jSONArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3164, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getShort((-2472));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      int int0 = 2572;
      // Undeclared exception!
      try { 
        jSONArray0.remove(2572);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2572, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      jSONArray0.fluentRemove(object0);
      // Undeclared exception!
      try { 
        jSONArray0.subList((-5), 72);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // fromIndex = -5
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = 0;
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      // Undeclared exception!
      try { 
        jSONArray1.getByte(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to byte, value : java.lang.Object@72e271ca
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentRemove((Object) jSONArray0);
      jSONArray1.setRelatedArray((Object) null);
      JSONArray jSONArray2 = jSONArray1.fluentRetainAll(jSONArray0);
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      JSONArray jSONArray0 = new JSONArray();
      Period period0 = Period.ofMonths(72);
      Period period1 = Period.from(period0);
      IsoChronology isoChronology0 = period1.getChronology();
      ConcurrentSkipListMap<TemporalField, Long> concurrentSkipListMap0 = new ConcurrentSkipListMap<TemporalField, Long>();
      ResolverStyle resolverStyle0 = ResolverStyle.LENIENT;
      isoChronology0.resolveDate(concurrentSkipListMap0, resolverStyle0);
      boolean boolean1 = jSONArray0.equals((Object) null);
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(21);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      jSONArray0.removeAll(linkedList0);
      // Undeclared exception!
      try { 
        jSONArray0.getBigInteger(21);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 21, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      Object object0 = new Object();
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      JSONArray jSONArray2 = jSONArray1.fluentRetainAll(jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray2.getJSONArray(0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson.JSONObject cannot be cast to com.alibaba.fastjson.JSONArray
         //
         verifyException("com.alibaba.fastjson.JSONArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.hashCode();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Integer integer0 = new Integer((-1));
      jSONArray0.fluentSet(1, integer0);
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      MockHijrahDate[] mockHijrahDateArray0 = new MockHijrahDate[0];
      MockHijrahDate[] mockHijrahDateArray1 = jSONArray1.toArray(mockHijrahDateArray0);
      assertSame(mockHijrahDateArray0, mockHijrahDateArray1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentRemoveAll((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      Class<JSONPath.Operator> class0 = JSONPath.Operator.class;
      // Undeclared exception!
      try { 
        jSONArray0.getObject(0, class0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(72, object0);
      jSONArray0.fluentAdd(object0);
      jSONArray1.subList(32, 72);
      assertEquals(74, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Integer integer0 = new Integer((-1));
      JSONArray jSONArray1 = jSONArray0.fluentSet(879, integer0);
      assertEquals(880, jSONArray1.size());
      
      JSONArray jSONArray2 = jSONArray0.fluentClear();
      MockHijrahDate[] mockHijrahDateArray0 = new MockHijrahDate[0];
      boolean boolean0 = jSONArray1.contains(jSONArray2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getDate(72);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 72, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(72);
      jSONArray0.containsAll(jSONArray1);
      Integer integer0 = new Integer(214);
      short short0 = ObjectStreamConstants.STREAM_MAGIC;
      Integer integer1 = new Integer(968);
      // Undeclared exception!
      try { 
        jSONArray1.getSqlDate(72);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 72, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(879);
      jSONArray0.fluentClear();
      // Undeclared exception!
      try { 
        jSONArray0.getBigInteger(879);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 879, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(3080);
      // Undeclared exception!
      try { 
        jSONArray0.getDouble(3080);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3080, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      JSONArray jSONArray0 = new JSONArray(879);
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      // Undeclared exception!
      try { 
        jSONArray1.getString((-3491));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(879);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      JSONArray jSONArray1 = jSONArray0.fluentAddAll((Collection<?>) linkedList0);
      jSONArray0.fluentClear();
      // Undeclared exception!
      try { 
        jSONArray1.getLong(1203);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1203, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      Object object0 = new Object();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      int int0 = 0;
      jSONArray0.fluentSet(0, object0);
      // Undeclared exception!
      try { 
        jSONArray0.getLongValue(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : java.lang.Object@23deb319
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      short short0 = ObjectStreamConstants.STREAM_MAGIC;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "1.2.46");
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      jSONArray0.containsAll(jSONArray0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "1.2.46");
      jSONArray0.getRelatedArray();
      jSONArray0.isEmpty();
      // Undeclared exception!
      try { 
        jSONArray0.getIntValue(72);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 72, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      Object object0 = new Object();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      int int0 = 4;
      jSONArray0.fluentSet(4, object0);
      jSONArray0.getLongValue(0);
      // Undeclared exception!
      try { 
        jSONArray0.getShort(72);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 72, Size: 5
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Type type0 = jSONArray0.getComponentType();
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(72, object0);
      SerializeConfig.getGlobalInstance();
      Integer integer0 = new Integer(72);
      jSONArray1.getJSONObject(72);
      // Undeclared exception!
      try { 
        jSONArray0.getDoubleValue(72);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to double, value : java.lang.Object@61b949aa
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(879);
      jSONArray0.setComponentType((Type) null);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      jSONArray1.fluentRetainAll(jSONArray0);
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      SerializerFeature serializerFeature0 = SerializerFeature.WriteSlashAsSpecial;
      serializerFeatureArray0[0] = serializerFeature0;
      Class<MockHijrahDate> class0 = MockHijrahDate.class;
      // Undeclared exception!
      try { 
        jSONArray0.toJavaList(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to : org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      jSONArray1.indexOf(object0);
      SerializerFeature serializerFeature0 = SerializerFeature.WriteSlashAsSpecial;
      // Undeclared exception!
      try { 
        jSONArray1.getJSONArray(1141048066);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1141048066, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      jSONArray0.forEach(consumer0);
      jSONArray0.remove((Object) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      jSONArray0.fluentClear();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      JSONArray jSONArray1 = new JSONArray(72);
      // Undeclared exception!
      try { 
        jSONArray1.addAll(72, (Collection<?>) jSONArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 72, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(879);
      jSONArray0.fluentClear();
      Class<MockHijrahDate> class0 = MockHijrahDate.class;
      List<MockHijrahDate> list0 = new LinkedList<MockHijrahDate>();
      // Undeclared exception!
      try { 
        jSONArray0.getFloat((-659));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      Object object0 = new Object();
      jSONArray0.fluentSet(0, object0);
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      Class<Method> class0 = Method.class;
      String[] stringArray0 = new String[9];
      stringArray0[0] = "1.2.46";
      stringArray0[1] = "1.2.46";
      stringArray0[2] = "1.2.46";
      stringArray0[3] = "1.2.46";
      stringArray0[5] = "1.2.46";
      SimplePropertyPreFilter simplePropertyPreFilter0 = new SimplePropertyPreFilter(class0, stringArray0);
      SimplePropertyPreFilter simplePropertyPreFilter1 = new SimplePropertyPreFilter(stringArray0);
      // Undeclared exception!
      try { 
        jSONArray0.getBoolean(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : java.lang.Object@78a72d9d
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(72, object0);
      SerializeConfig.getGlobalInstance();
      Integer integer0 = new Integer(13);
      jSONArray1.getJSONObject(72);
      jSONArray0.getDoubleValue(13);
      boolean boolean0 = jSONArray0.isEmpty();
      assertEquals(73, jSONArray0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(35);
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(2292, object0);
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      Class<Method> class0 = Method.class;
      Class<MockJapaneseDate> class1 = MockJapaneseDate.class;
      String[] stringArray0 = new String[3];
      stringArray0[0] = "1.2.46";
      stringArray0[1] = "1.2.46";
      stringArray0[2] = "1.2.46";
      SimplePropertyPreFilter simplePropertyPreFilter0 = new SimplePropertyPreFilter(class1, stringArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray1 = new String[2];
      stringArray1[0] = "1.2.46";
      stringArray1[1] = "1.2.46";
      SimplePropertyPreFilter simplePropertyPreFilter1 = new SimplePropertyPreFilter(stringArray1);
      jSONArray1.getBoolean(113);
      JSONObject jSONObject0 = new JSONObject(72, false);
      jSONArray1.getBigInteger(113);
      HashMap<String, Field> hashMap0 = new HashMap<String, Field>();
      ParserConfig.getFieldFromCache("1.2.46", hashMap0);
      // Undeclared exception!
      try { 
        jSONArray1.getTimestamp(2292);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Timestamp, value : java.lang.Object@409edac0
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      int int0 = (-428);
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      LinkedHashSet<MockHijrahDate> linkedHashSet0 = new LinkedHashSet<MockHijrahDate>();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      linkedHashSet0.add(mockHijrahDate0);
      jSONArray0.containsAll(linkedHashSet0);
      LinkedList<MockHijrahDate> linkedList0 = new LinkedList<MockHijrahDate>();
      // Undeclared exception!
      try { 
        jSONArray0.getFloat((-428));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(35);
      Object object0 = new Object();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "1.2.46");
      jSONArray0.fluentSet(0, object0);
      Object object1 = new Object();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      // Undeclared exception!
      try { 
        jSONArray0.getByteValue(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to byte, value : java.lang.Object@48b6df52
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      jSONArray0.containsAll(jSONArray0);
      JSONArray jSONArray1 = jSONArray0.fluentSet(72, (Object) null);
      // Undeclared exception!
      try { 
        jSONArray1.fluentAddAll(711, (Collection<?>) jSONArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 711, Size: 73
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      JSONArray jSONArray2 = jSONArray0.fluentSet(72, mockThaiBuddhistDate0);
      Object object0 = new Object();
      JSONArray jSONArray3 = new JSONArray(1310);
      PropertyNamingStrategy propertyNamingStrategy1 = PropertyNamingStrategy.SnakeCase;
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      jSONArray2.containsAll(jSONArray3);
      // Undeclared exception!
      try { 
        jSONArray1.getIntValue(1278);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1278, Size: 73
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(35);
      Object object0 = new Object();
      Object object1 = new Object();
      int int0 = Calendar.FIELD_COUNT;
      JSONArray jSONArray1 = jSONArray0.fluentSet(35, object1);
      jSONArray1.getBooleanValue(0);
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      ConcurrentSkipListMap<String, Field> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Field>();
      concurrentSkipListMap0.pollLastEntry();
      Class<JSONArray> class0 = JSONArray.class;
      BeanContext beanContext0 = null;
      try {
        beanContext0 = new BeanContext(class0, (FieldInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.serializer.BeanContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      int int0 = 0;
      JSONArray jSONArray0 = new JSONArray(0);
      Object object0 = new Object();
      Object object1 = new Object();
      int int1 = Calendar.FIELD_COUNT;
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object1);
      // Undeclared exception!
      try { 
        jSONArray1.getBooleanValue(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : java.lang.Object@2c7eb07c
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      jSONArray0.DEFAULT_TYPE_KEY = "1.2.46";
      jSONArray1.getJSONObject(0);
      // Undeclared exception!
      try { 
        jSONArray1.fluentAdd(72, (Object) 72);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 72, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      jSONArray0.fluentClear();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      mockThaiBuddhistDate0.getMockedClassName();
      JSONArray jSONArray1 = jSONArray0.fluentSet(72, mockThaiBuddhistDate0);
      Object object0 = new Object();
      JSONArray jSONArray2 = new JSONArray(1310);
      // Undeclared exception!
      try { 
        jSONArray1.getShortValue(1310);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1310, Size: 73
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      mockThaiBuddhistDate0.getMockedClassName();
      jSONArray0.fluentSet(72, mockThaiBuddhistDate0);
      MockJapaneseDate.now();
      Integer integer0 = new Integer(72);
      ParserConfig parserConfig0 = new ParserConfig((ClassLoader) null);
      // Undeclared exception!
      try { 
        jSONArray1.getFloatValue(72);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to float, value : org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate@33e8ab3f
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(72);
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      jSONArray0.containsAll(jSONArray1);
      JSONArray jSONArray2 = jSONArray0.fluentSet(72, (Object) null);
      // Undeclared exception!
      try { 
        jSONArray2.fluentAddAll(711, (Collection<?>) jSONArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 711, Size: 73
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      jSONArray0.DEFAULT_TYPE_KEY = "1.2.46";
      Integer integer0 = new Integer(72);
      jSONArray1.getJSONObject(0);
      // Undeclared exception!
      try { 
        jSONArray1.fluentAdd(72, (Object) integer0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 72, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(72);
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      jSONArray0.containsAll(jSONArray1);
      JSONArray jSONArray2 = jSONArray0.fluentSet(72, (Object) null);
      // Undeclared exception!
      try { 
        jSONArray2.fluentAddAll(711, (Collection<?>) jSONArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 711, Size: 73
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      mockThaiBuddhistDate0.getMockedClassName();
      JSONArray jSONArray2 = jSONArray0.fluentSet(72, mockThaiBuddhistDate0);
      MockJapaneseDate.now();
      ParserConfig parserConfig0 = new ParserConfig((ASMDeserializerFactory) null);
      DefaultJSONParser defaultJSONParser0 = new DefaultJSONParser("1.2.46", parserConfig0, 72);
      parserConfig0.addDeny("1.2.46");
      JSONArray jSONArray3 = new JSONArray(72);
      jSONArray1.getShortValue(0);
      jSONArray2.hashCode();
      assertEquals(73, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(72);
      jSONArray1.containsAll(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentSet(72, jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray2.fluentAddAll(711, (Collection<?>) jSONArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 711, Size: 73
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}