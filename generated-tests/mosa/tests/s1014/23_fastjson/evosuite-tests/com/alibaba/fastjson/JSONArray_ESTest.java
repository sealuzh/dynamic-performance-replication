/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 05:04:20 GMT 2018
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ObjectStreamConstants;
import java.lang.reflect.Type;
import java.time.chrono.HijrahDate;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONArray_ESTest extends JSONArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      boolean boolean0 = jSONArray1.isEmpty();
      assertTrue(boolean0);
      
      jSONArray1.fluentRemoveAll(jSONArray0);
      assertTrue(jSONArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      // Undeclared exception!
      try { 
        jSONArray0.remove(3394);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3394, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentRemove(2125);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2125, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      jSONArray0.fluentRemove(object0);
      jSONArray0.clear();
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentRetainAll(jSONArray0);
      JSONArray jSONArray3 = jSONArray2.fluentRemoveAll(jSONArray1);
      // Undeclared exception!
      try { 
        jSONArray3.getDoubleValue(989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 989, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1123);
      // Undeclared exception!
      try { 
        jSONArray0.fluentAddAll(1059, (Collection<?>) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1059, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getString(1066);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1066, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.toArray();
      // Undeclared exception!
      try { 
        jSONArray0.getLongValue(1500);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1500, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      ConcurrentHashMap.KeySetView<Object, Boolean> concurrentHashMap_KeySetView0 = ConcurrentHashMap.newKeySet();
      // Undeclared exception!
      try { 
        jSONArray0.addAll(Integer.MAX_VALUE, (Collection<?>) concurrentHashMap_KeySetView0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2147483647, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getSqlDate(1111);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1111, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "yyyy-MM-dd HH:mm:ss");
      jSONArray0.setRelatedArray((Object) null);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      jSONArray0.fluentSet(2125, hashMap0);
      // Undeclared exception!
      try { 
        JSON.parseArray("yyyy-MM-dd HH:mm:ss");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error, expect [, actual error, pos 0, fieldName null
         //
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1065, hashMap0);
      jSONArray1.getJSONObject(1065);
      boolean boolean0 = jSONArray0.remove((Object) jSONArray1);
      assertEquals(1066, jSONArray0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      // Undeclared exception!
      try { 
        jSONArray1.listIterator(117);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 117
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      jSONArray0.fluentAdd((Object) jSONArray1);
      short short0 = ObjectStreamConstants.STREAM_VERSION;
      assertEquals((short)5, short0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, mockJapaneseDate0);
      boolean boolean0 = jSONArray1.contains(mockJapaneseDate0);
      assertEquals(1, jSONArray0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1066, hashMap0);
      jSONArray1.getFloat(220);
      assertEquals(1067, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.subList(1001, (-2957));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex(1001) > toIndex(-2957)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(2125, hashMap0);
      jSONArray1.getJSONObject(989);
      jSONArray1.getComponentType();
      assertEquals(2126, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getDouble((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(2125, hashMap0);
      JSONArray jSONArray2 = jSONArray1.fluentRetainAll(jSONArray0);
      jSONArray2.getJSONArray(989);
      Object[] objectArray0 = new Object[0];
      jSONArray2.toArray(objectArray0);
      assertEquals(2126, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<JSONArray> class0 = JSONArray.class;
      // Undeclared exception!
      try { 
        jSONArray0.getObject(1, class0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.contains(" 7-[,");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      // Undeclared exception!
      try { 
        jSONArray0.getBigDecimal(1066);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1066, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      // Undeclared exception!
      try { 
        jSONArray1.getShort(2125);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2125, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      JSONArray jSONArray1 = jSONArray0.fluentAdd(0, (Object) mockHijrahDate0);
      Class<MockHijrahDate> class0 = MockHijrahDate.class;
      jSONArray1.toJavaList(class0);
      // Undeclared exception!
      try { 
        jSONArray0.getByteValue(989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 989, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.isEmpty();
      assertTrue(boolean0);
      
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = classLoader0.loadClass("com.alibaba.fastjson.JSONArray");
      jSONArray0.setComponentType(class0);
      assertTrue(jSONArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(766);
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      int int0 = jSONArray0.indexOf(mockThaiBuddhistDate0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentAddAll((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      byte byte0 = ObjectStreamConstants.TC_BLOCKDATA;
      // Undeclared exception!
      try { 
        jSONArray0.getByte((byte)119);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 119, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      jSONArray0.sort(comparator0);
      jSONArray0.fluentClear();
      int int0 = Calendar.YEAR;
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      jSONArray0.add(object0);
      int int0 = (-229);
      // Undeclared exception!
      try { 
        jSONArray0.getLongValue((-229));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(2125, hashMap0);
      jSONArray0.getJSONArray(255);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      float float0 = jSONArray1.getFloatValue(2);
      assertEquals(2126, jSONArray0.size());
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      Object object0 = new Object();
      jSONArray1.fluentSet(2125, object0);
      // Undeclared exception!
      try { 
        jSONArray1.getFloatValue(2125);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to float, value : java.lang.Object@10533649
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(2125, hashMap0);
      jSONArray1.getJSONArray(989);
      boolean boolean0 = jSONArray1.isEmpty();
      assertEquals(2126, jSONArray0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = jSONArray0.clone();
      int int0 = jSONArray0.lastIndexOf(object0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<String, JSONPath.Operator> hashMap0 = new HashMap<String, JSONPath.Operator>();
      ConcurrentSkipListMap<String, Object> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Object>(hashMap0);
      JSONArray jSONArray1 = jSONArray0.fluentSet(2125, hashMap0);
      jSONArray1.getByteValue(989);
      // Undeclared exception!
      try { 
        jSONArray1.getInteger(2125);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to int, value : {}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getDate(1068);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1068, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = jSONArray0.getRelatedArray();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<JSONPath.Operator> linkedList0 = new LinkedList<JSONPath.Operator>();
      jSONArray0.containsAll(linkedList0);
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      assertSame(jSONArray0, jSONArray1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<String, JSONPath.Operator> hashMap0 = new HashMap<String, JSONPath.Operator>();
      ConcurrentSkipListMap<String, Object> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Object>(hashMap0);
      JSONArray jSONArray1 = jSONArray0.fluentSet(2901, hashMap0);
      // Undeclared exception!
      try { 
        jSONArray1.getByteValue(2901);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to byte, value : {}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      JSONArray jSONArray1 = jSONArray0.fluentSet((-1), hashMap0);
      // Undeclared exception!
      try { 
        jSONArray1.getJSONObject(225);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 225, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.hashCode();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      // Undeclared exception!
      try { 
        jSONArray0.add(404, (Object) hashMap0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 404, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<JSONPath.Operator> linkedList0 = new LinkedList<JSONPath.Operator>();
      JSONPath.Operator jSONPath_Operator0 = JSONPath.Operator.GE;
      linkedList0.add(jSONPath_Operator0);
      jSONArray0.containsAll(linkedList0);
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      assertEquals(0, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getTimestamp(1500);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1500, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      int int0 = 1082;
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      jSONArray0.fluentSet(1082, hashMap0);
      // Undeclared exception!
      try { 
        jSONArray0.getIntValue(1082);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to int, value : {}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(2125, hashMap0);
      short short0 = jSONArray1.getShortValue(989);
      assertEquals(2126, jSONArray0.size());
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      jSONArray0.fluentSet(2125, hashMap0);
      jSONArray0.getBoolean(1068);
      assertEquals(2126, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1082, hashMap0);
      jSONArray1.getDoubleValue(989);
      boolean boolean0 = jSONArray1.getBooleanValue(989);
      assertEquals(1083, jSONArray0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(989, hashMap0);
      // Undeclared exception!
      try { 
        jSONArray1.getDoubleValue(989);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to double, value : {}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1096, hashMap0);
      jSONArray1.fluentRetainAll(jSONArray0);
      HashMap<JSONPath.Operator, Object> hashMap1 = new HashMap<JSONPath.Operator, Object>();
      jSONArray1.fluentSet(922, hashMap0);
      // Undeclared exception!
      try { 
        jSONArray1.getBooleanValue(1096);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : {}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(2125, hashMap0);
      jSONArray0.getIntValue(989);
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ASMDeserializerFactory aSMDeserializerFactory0 = new ASMDeserializerFactory(classLoader0);
      JSONArray jSONArray2 = jSONArray1.fluentRetainAll(jSONArray0);
      boolean boolean0 = jSONArray2.getBooleanValue(0);
      assertEquals(2126, jSONArray0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<HijrahDate> linkedList0 = new LinkedList<HijrahDate>();
      jSONArray0.retainAll(linkedList0);
      JSONArray jSONArray1 = new JSONArray(989);
      assertTrue(jSONArray1.equals((Object)jSONArray0));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<PropertyNamingStrategy> class0 = PropertyNamingStrategy.class;
      List<PropertyNamingStrategy> list0 = jSONArray0.toJavaList(class0);
      jSONArray0.addAll((Collection<?>) list0);
      // Undeclared exception!
      try { 
        jSONArray0.getBigInteger(94);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 94, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1082, hashMap0);
      // Undeclared exception!
      try { 
        jSONArray1.getShortValue(1082);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to short, value : {}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1087, hashMap0);
      jSONArray1.fluentRetainAll(jSONArray0);
      jSONArray0.getJSONArray(989);
      long long0 = jSONArray1.getLongValue(989);
      assertEquals(1088, jSONArray0.size());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1087, hashMap0);
      JSON.DEFAULT_TYPE_KEY = "yyyy-MM-dd HH:mm:ss";
      JSONArray jSONArray2 = jSONArray1.fluentRetainAll(jSONArray0);
      jSONArray2.addAll((Collection<?>) jSONArray1);
      jSONArray0.getJSONArray(1035);
      // Undeclared exception!
      try { 
        jSONArray0.getBoolean(1087);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : {}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1082, hashMap0);
      JSONArray jSONArray2 = jSONArray1.fluentRetainAll(jSONArray0);
      JSONArray jSONArray3 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray2.getLongValue(1082);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : {}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(2125, hashMap0);
      ParameterizedTypeImpl parameterizedTypeImpl0 = (ParameterizedTypeImpl)TypeReference.LIST_STRING;
      jSONArray1.getObject(989, (Type) parameterizedTypeImpl0);
      jSONArray1.getJSONObject(2125);
      // Undeclared exception!
      try { 
        jSONArray1.getJSONArray((-224));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<JSONPath.Operator, Object> hashMap0 = new HashMap<JSONPath.Operator, Object>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(2125, hashMap0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "yyyy-MM-dd HH:mm:ss";
      stringArray0[1] = "yyyy-MM-dd HH:mm:ss";
      jSONArray1.addAll((Collection<?>) jSONArray0);
      stringArray0[2] = "1.2.46";
      stringArray0[3] = "yyyy-MM-dd HH:mm:ss";
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      MockThaiBuddhistDate mockThaiBuddhistDate1 = new MockThaiBuddhistDate();
      MockThaiBuddhistDate mockThaiBuddhistDate2 = new MockThaiBuddhistDate();
      MockThaiBuddhistDate mockThaiBuddhistDate3 = new MockThaiBuddhistDate();
      Class<MockJapaneseDate> class0 = MockJapaneseDate.class;
      String[] stringArray1 = new String[8];
      stringArray1[0] = "1.2.46";
      stringArray1[1] = "yyyy-MM-dd HH:mm:ss";
      stringArray1[2] = "1.2.46";
      stringArray1[3] = "1.2.46";
      stringArray1[4] = "yyyy-MM-dd HH:mm:ss";
      stringArray1[5] = "1.2.46";
      stringArray1[6] = "1.2.46";
      stringArray1[7] = "1.2.46";
      SimplePropertyPreFilter simplePropertyPreFilter0 = new SimplePropertyPreFilter(class0, stringArray1);
      Class<?> class1 = simplePropertyPreFilter0.getClazz();
      jSONArray1.getObject(989, (Type) class1);
      jSONArray1.getJSONObject(2125);
      // Undeclared exception!
      try { 
        jSONArray0.getJSONArray((-4133));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}