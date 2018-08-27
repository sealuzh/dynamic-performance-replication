/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 19:33:38 GMT 2018
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import java.io.ObjectStreamConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.ChronoLocalDate;
import java.util.Calendar;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
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
        jSONArray0.getByte(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      // Undeclared exception!
      try { 
        jSONArray1.fluentAddAll(1392510721, (Collection<?>) jSONArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1392510721, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(169);
      // Undeclared exception!
      try { 
        jSONArray0.fluentRemove(169);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 169, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      int int0 = jSONArray0.indexOf("Kx8T]%4|d`PuuuI!");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedHashSet<Field> linkedHashSet0 = new LinkedHashSet<Field>();
      JSONArray jSONArray1 = jSONArray0.fluentAddAll((Collection<?>) linkedHashSet0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.toArray();
      // Undeclared exception!
      try { 
        jSONArray0.getJSONObject(3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(4153);
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      JSONArray jSONArray2 = jSONArray1.fluentRemove((Object) jSONArray0);
      assertEquals(0, jSONArray2.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      int int0 = (-1774);
      // Undeclared exception!
      try { 
        jSONArray0.getDate((-1774));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(579);
      // Undeclared exception!
      try { 
        jSONArray0.getTimestamp(1336);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1336, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) mockJapaneseDate0);
      jSONArray0.fluentRetainAll(jSONArray1);
      assertFalse(jSONArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(8232);
      // Undeclared exception!
      try { 
        jSONArray0.getSqlDate(1190);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1190, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      MockHijrahDate.from(localDateTime0);
      jSONArray0.fluentSet(3089, mockHijrahDate0);
      jSONArray0.getJSONObject(989);
      jSONArray0.getFloat(114);
      assertEquals(3090, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.subList(568, 568);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // toIndex = 568
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONObject jSONObject0 = new JSONObject();
      Class<PropertyNamingStrategy> class0 = PropertyNamingStrategy.class;
      // Undeclared exception!
      try { 
        jSONArray0.getObject(1397, class0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1397, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(16384);
      // Undeclared exception!
      try { 
        jSONArray0.getBigDecimal(16384);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 16384, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      JSONArray jSONArray0 = new JSONArray(linkedList0);
      jSONArray0.removeAll(linkedList0);
      jSONArray0.indexOf(linkedList0);
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      // Undeclared exception!
      try { 
        jSONArray0.getByte((-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentRemoveAll(jSONArray0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.clear();
      assertTrue(jSONArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      int int0 = jSONArray0.lastIndexOf(object0);
      int int1 = jSONArray0.hashCode();
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray1.fluentAdd(1, (Object) jSONArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      LinkedHashSet<MockJapaneseDate> linkedHashSet0 = new LinkedHashSet<MockJapaneseDate>();
      jSONArray0.containsAll(jSONArray1);
      // Undeclared exception!
      try { 
        jSONArray0.remove(3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      jSONArray0.fluentSet(3089, mockHijrahDate0);
      jSONArray0.getJSONObject(989);
      short short0 = jSONArray0.getShortValue(1154);
      assertEquals(3090, jSONArray0.size());
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      jSONArray0.fluentAdd((Object) mockJapaneseDate0);
      // Undeclared exception!
      try { 
        jSONArray0.getBooleanValue(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate@5704abac
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, mockHijrahDate0);
      boolean boolean0 = jSONArray0.remove((Object) jSONArray1);
      assertEquals(3090, jSONArray0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      JSONArray jSONArray1 = jSONArray0.fluentSet(24, mockHijrahDate0);
      ParserConfig parserConfig0 = ParserConfig.global;
      // Undeclared exception!
      try { 
        jSONArray1.getShortValue(24);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to short, value : org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate@201ca4ba
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.listIterator(3065);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3065
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.clone();
      // Undeclared exception!
      try { 
        jSONArray0.getFloatValue(68);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 68, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getInteger((-1168));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, mockHijrahDate0);
      long long0 = jSONArray1.getLongValue(126);
      assertEquals(3090, jSONArray0.size());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.contains((Object) null);
      // Undeclared exception!
      try { 
        jSONArray0.remove((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) mockJapaneseDate0);
      jSONArray1.containsAll(jSONArray0);
      Class<MockThaiBuddhistDate> class0 = MockThaiBuddhistDate.class;
      // Undeclared exception!
      try { 
        jSONArray1.toJavaList(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to : org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) mockJapaneseDate0);
      // Undeclared exception!
      try { 
        jSONArray1.getJSONArray(0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson.JSONObject cannot be cast to com.alibaba.fastjson.JSONArray
         //
         verifyException("com.alibaba.fastjson.JSONArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentClear();
      // Undeclared exception!
      try { 
        jSONArray0.getShort(989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 989, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, mockHijrahDate0);
      jSONArray1.getJSONObject(3089);
      jSONArray1.remove(989);
      double double0 = jSONArray1.getDoubleValue(904);
      assertEquals(3089, jSONArray0.size());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) mockJapaneseDate0);
      // Undeclared exception!
      try { 
        jSONArray1.getLongValue(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate@967a7de
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      JSONArray jSONArray1 = jSONArray0.fluentSet((-1), mockHijrahDate0);
      // Undeclared exception!
      try { 
        jSONArray1.getFloatValue((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) mockJapaneseDate0);
      // Undeclared exception!
      try { 
        jSONArray1.getDoubleValue(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to double, value : org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate@720a2432
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.retainAll(linkedList0);
      // Undeclared exception!
      try { 
        jSONArray0.getDoubleValue(1278);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1278, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      boolean boolean0 = jSONArray1.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getLong((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSONArray jSONArray0 = new JSONArray();
      byte byte0 = ObjectStreamConstants.TC_NULL;
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      // Undeclared exception!
      try { 
        jSONArray0.addAll((int) (byte)112, (Collection<?>) linkedHashSet0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 112, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) "2YT//1J+2V2Q*~");
      JSONArray jSONArray0 = new JSONArray(linkedList0);
      boolean boolean0 = jSONArray0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      LinkedHashSet<MockJapaneseDate> linkedHashSet0 = new LinkedHashSet<MockJapaneseDate>();
      jSONArray0.containsAll(linkedHashSet0);
      jSONArray0.setRelatedArray(jSONArray1);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      JSONArray jSONArray2 = jSONArray1.fluentSet(1529, mockJapaneseDate0);
      jSONArray1.getJSONObject(736);
      jSONArray1.getJSONObject(989);
      jSONArray2.getRelatedArray();
      assertEquals(1530, jSONArray1.size());
      assertEquals(1530, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
      jSONArray0.setComponentType(class0);
      jSONArray0.toJavaList(class0);
      JSONObject jSONObject0 = new JSONObject(3089);
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) jSONArray0);
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      // Undeclared exception!
      try { 
        jSONArray1.getBigInteger(989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 989, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getDouble(154);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 154, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Integer integer0 = new Integer(3089);
      jSONArray0.add((Object) integer0);
      jSONArray0.listIterator();
      // Undeclared exception!
      try { 
        jSONArray0.fluentAdd(162, (Object) integer0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 162, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<Field> linkedList0 = new LinkedList<Field>();
      Type type0 = jSONArray0.getComponentType();
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1432, mockHijrahDate0);
      JSONArray jSONArray2 = jSONArray1.fluentRetainAll(jSONArray0);
      jSONArray2.fluentRemove((Object) jSONArray1);
      jSONArray2.getJSONObject(1432);
      PropertyNamingStrategy[] propertyNamingStrategyArray0 = new PropertyNamingStrategy[0];
      // Undeclared exception!
      try { 
        jSONArray0.toArray(propertyNamingStrategyArray0);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, mockHijrahDate0);
      // Undeclared exception!
      try { 
        jSONArray1.getIntValue(3089);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to int, value : org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate@4aac91cb
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(576);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      JSONArray jSONArray1 = jSONArray0.fluentRemove((Object) mockJapaneseDate0);
      JSONArray jSONArray2 = jSONArray1.fluentSet(3089, jSONArray0);
      JSONArray jSONArray3 = new JSONArray(jSONArray2);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      JSONArray jSONArray4 = jSONArray3.fluentAdd((Object) mockThaiBuddhistDate0);
      jSONArray4.getBooleanValue(989);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      jSONArray0.fluentAdd((Object) mockJapaneseDate0);
      // Undeclared exception!
      try { 
        jSONArray0.getBoolean(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate@46800b2b
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentClear();
      LinkedHashSet<MockJapaneseDate> linkedHashSet0 = new LinkedHashSet<MockJapaneseDate>();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      linkedHashSet0.add(mockJapaneseDate0);
      boolean boolean0 = jSONArray0.containsAll(linkedHashSet0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      jSONArray0.fluentSet(3089, mockHijrahDate0);
      jSONArray0.getFloatValue(989);
      jSONArray0.getJSONObject(3089);
      assertEquals(3090, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      jSONArray0.fluentAdd((Object) null);
      int int0 = jSONArray0.getIntValue(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      jSONArray0.fluentSet(3089, mockHijrahDate0);
      jSONArray0.getJSONObject(989);
      jSONArray0.getBoolean(989);
      assertEquals(3090, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      JSONArray jSONArray2 = jSONArray0.fluentAdd((Object) jSONArray1);
      JSONArray jSONArray3 = jSONArray2.getJSONArray(0);
      jSONArray0.fluentClear();
      // Undeclared exception!
      try { 
        jSONArray3.getString(2772);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2772, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, mockHijrahDate0);
      jSONArray0.getJSONObject(1180);
      // Undeclared exception!
      try { 
        jSONArray1.getByteValue(3089);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to byte, value : org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate@522109c0
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) mockJapaneseDate0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "1.2.46";
      stringArray0[1] = "1.2.46";
      stringArray0[2] = "g7CK,,";
      stringArray0[3] = "1.2.46";
      stringArray0[4] = "1.2.46";
      stringArray0[5] = "1.2.46";
      stringArray0[6] = "1.2.46";
      SimplePropertyPreFilter simplePropertyPreFilter0 = new SimplePropertyPreFilter(stringArray0);
      Class<Field> class0 = Field.class;
      SimplePropertyPreFilter simplePropertyPreFilter1 = new SimplePropertyPreFilter(class0, stringArray0);
      simplePropertyPreFilter1.getClazz();
      // Undeclared exception!
      try { 
        jSONArray1.getObject(0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to : java.lang.reflect.Field
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, mockHijrahDate0);
      // Undeclared exception!
      try { 
        jSONArray1.getFloatValue(3089);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to float, value : org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate@391dd537
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1225, mockHijrahDate0);
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      jSONArray0.defaultLocale.getDisplayVariant();
      jSONArray1.getByteValue(0);
      int int0 = Calendar.SHORT_STANDALONE;
      // Undeclared exception!
      try { 
        jSONArray0.fluentAdd((-2016), (Object) mockMinguoDate0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -2016, Size: 1226
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, mockHijrahDate0);
      jSONArray0.addAll((Collection<?>) jSONArray1);
      assertEquals(6180, jSONArray1.size());
      assertEquals(6180, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      jSONArray0.fluentSet(3089, mockHijrahDate0);
      JSONObject jSONObject0 = new JSONObject(989);
      JSONObject jSONObject1 = jSONObject0.fluentPut("1.2.46", jSONArray0);
      JSONObject jSONObject2 = new JSONObject(jSONObject1);
      jSONArray0.fluentSet(3089, jSONObject2);
      JSONArray jSONArray1 = jSONArray0.fluentSet(1, jSONObject0);
      JSONObject jSONObject3 = jSONArray1.getJSONObject(3089);
      assertSame(jSONObject3, jSONObject2);
  }
}