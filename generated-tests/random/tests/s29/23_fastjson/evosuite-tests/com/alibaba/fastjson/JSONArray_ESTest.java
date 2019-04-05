/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 13:48:02 GMT 2019
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.Month;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentSkipListMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONArray_ESTest extends JSONArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      ListIterator<Object> listIterator0 = jSONArray0.listIterator();
      assertFalse(listIterator0.hasNext());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(650);
      int int0 = jSONArray0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(857);
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) jSONArray0.DEFAULT_GENERATE_FEATURE);
      jSONArray1.fluentRetainAll(jSONArray0);
      assertFalse(jSONArray0.isEmpty());
      assertEquals(1, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(857);
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) jSONArray0.DEFAULT_PARSER_FEATURE);
      JSONArray jSONArray2 = jSONArray1.fluentRemove((Object) jSONArray0);
      assertEquals(1, jSONArray2.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1);
      LinkedList<Month> linkedList0 = new LinkedList<Month>();
      Month month0 = Month.JUNE;
      linkedList0.add(month0);
      jSONArray0.addAll((Collection<?>) linkedList0);
      JSONArray jSONArray1 = jSONArray0.fluentAddAll((Collection<?>) jSONArray0);
      assertSame(jSONArray0, jSONArray1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<Month> class0 = Month.class;
      List<Month> list0 = jSONArray0.toJavaList(class0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getByte(1488);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1488, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(910);
      Iterator<Object> iterator0 = jSONArray0.iterator();
      jSONArray0.fluentSet(910, iterator0);
      assertEquals(911, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentAddAll((-99), (Collection<?>) jSONArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -99, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) null);
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getLongValue(1100);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1100, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<String> class0 = String.class;
      String[] stringArray0 = new String[7];
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, stringArray0);
      List<Object> list0 = javaBeanSerializer0.getFieldValues(".C");
      JSONArray jSONArray0 = new JSONArray(list0);
      // Undeclared exception!
      try { 
        jSONArray0.getJSONObject(11);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 11, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getJSONArray((-956));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(3187);
      // Undeclared exception!
      try { 
        jSONArray0.getBooleanValue(1211);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1211, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1);
      // Undeclared exception!
      try { 
        jSONArray0.getBigDecimal(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray((List<Object>) null);
      // Undeclared exception!
      try { 
        jSONArray0.fluentAddAll((Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray((-24));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -24
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.get(248);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 248, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1);
      LinkedList<Month> linkedList0 = new LinkedList<Month>();
      jSONArray0.add((Object) linkedList0);
      JSONArray jSONArray1 = jSONArray0.fluentRemoveAll(linkedList0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Iterator<Object> iterator0 = jSONArray0.iterator();
      boolean boolean0 = jSONArray0.remove((Object) iterator0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(857);
      jSONArray0.fluentAdd((Object) jSONArray0.DEFAULT_PARSER_FEATURE);
      Class<Field> class0 = Field.class;
      // Undeclared exception!
      try { 
        jSONArray0.toJavaList(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to : java.lang.reflect.Field
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(857);
      jSONArray0.fluentSet(1250, jSONArray0.DEFAULT_PARSER_FEATURE);
      float float0 = jSONArray0.getFloatValue(1236);
      assertEquals(1251, jSONArray0.size());
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(857);
      jSONArray0.fluentSet(1250, jSONArray0.DEFAULT_GENERATE_FEATURE);
      int int0 = jSONArray0.getIntValue(248);
      assertEquals(1251, jSONArray0.size());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1254, jSONArray0.DEFAULT_GENERATE_FEATURE);
      // Undeclared exception!
      try { 
        jSONArray1.getJSONArray(1254);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to com.alibaba.fastjson.JSONArray
         //
         verifyException("com.alibaba.fastjson.JSONArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<JSONArray> class0 = JSONArray.class;
      ConcurrentSkipListMap<String, String> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, String>();
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, concurrentSkipListMap0);
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      List<Object> list0 = javaBeanSerializer0.getFieldValues(linkedHashSet0);
      JSONArray jSONArray0 = new JSONArray(list0);
      LinkedHashSet<JSONArray> linkedHashSet1 = new LinkedHashSet<JSONArray>();
      // Undeclared exception!
      try { 
        jSONArray0.fluentSet((-1034), linkedHashSet1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentSet((-1), "1.2.46");
      assertEquals(1, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(910);
      boolean boolean0 = jSONArray0.containsAll(jSONArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(3187);
      boolean boolean0 = jSONArray0.contains("yyyy-MM-dd HH:mm:ss");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<String> class0 = String.class;
      String[] stringArray0 = new String[7];
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, stringArray0);
      List<Object> list0 = javaBeanSerializer0.getFieldValues(".C");
      JSONArray jSONArray0 = new JSONArray(list0);
      boolean boolean0 = jSONArray0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.setRelatedArray(jSONArray0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(910);
      Object object0 = jSONArray0.getRelatedArray();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(957);
      // Undeclared exception!
      try { 
        jSONArray0.getSqlDate(162);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 162, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getFloat(979);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 979, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getTimestamp(876);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 876, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(967);
      Type type0 = jSONArray0.getComponentType();
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(967);
      jSONArray0.hashCode();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1);
      Class<Integer> class0 = Integer.class;
      String[] stringArray0 = new String[7];
      SimplePropertyPreFilter simplePropertyPreFilter0 = new SimplePropertyPreFilter(class0, stringArray0);
      Class<?> class1 = simplePropertyPreFilter0.getClazz();
      jSONArray0.setComponentType(class1);
      assertEquals("class java.lang.Integer", class1.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getString((-2337));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray1.fluentAddAll(1, (Collection<?>) jSONArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(650);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        jSONArray0.getObject(989, class0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 989, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentRemoveAll(jSONArray0);
      assertNotSame(jSONArray0, jSONArray2);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray((List<Object>) null);
      // Undeclared exception!
      try { 
        jSONArray0.getBigDecimal(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(153);
      // Undeclared exception!
      try { 
        jSONArray0.subList(959, 153);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // toIndex = 153
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.add(785, (Object) "vWnL5(EGux3}^kN8~");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 785, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(857);
      JSONArray jSONArray1 = jSONArray0.fluentAddAll((Collection<?>) jSONArray0);
      assertSame(jSONArray0, jSONArray1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentRetainAll(jSONArray0);
      JSONArray jSONArray3 = jSONArray2.fluentRemove((Object) jSONArray2);
      assertSame(jSONArray3, jSONArray1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getByte((-1036));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(205);
      // Undeclared exception!
      try { 
        jSONArray0.getDate(205);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 205, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(987);
      // Undeclared exception!
      try { 
        jSONArray0.getShort(987);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 987, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.sort((Comparator<? super Object>) null);
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(857);
      boolean boolean0 = jSONArray0.retainAll(jSONArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Class<JSONArray> class0 = JSONArray.class;
      ConcurrentSkipListMap<String, String> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, String>();
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, concurrentSkipListMap0);
      Month month0 = Month.NOVEMBER;
      List<Object> list0 = javaBeanSerializer0.getObjectFieldValues(month0);
      JSONArray jSONArray0 = new JSONArray(list0);
      // Undeclared exception!
      try { 
        jSONArray0.getLong(2207);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2207, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.listIterator(1246);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1246
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getInteger((-990));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      assertSame(jSONArray0, jSONArray1);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentAddAll(1, (Collection<?>) jSONArray0);
      assertSame(jSONArray1, jSONArray2);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(910);
      JSONArray jSONArray1 = (JSONArray)jSONArray0.clone();
      assertEquals(0, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.clear();
      assertEquals(0, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      // Undeclared exception!
      try { 
        jSONArray0.getDouble(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentRemove(965);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 965, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentSet(989, jSONArray0);
      jSONArray1.add(785, (Object) "vWnL5(EGux3}^kN8~");
      assertEquals(991, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentAdd((-361), (Object) ">P9");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -361, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1);
      LinkedList<Month> linkedList0 = new LinkedList<Month>();
      Month month0 = Month.JUNE;
      linkedList0.add(month0);
      jSONArray0.addAll((Collection<?>) linkedList0);
      int int0 = jSONArray0.lastIndexOf(jSONArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(866);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      int int0 = jSONArray0.indexOf(linkedHashSet0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      List<Object> list0 = javaBeanSerializer0.getObjectFieldValues(class0);
      JSONArray jSONArray0 = new JSONArray(list0);
      // Undeclared exception!
      try { 
        jSONArray0.remove(962);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 962, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1222);
      LinkedHashSet<JSONArray>[] linkedHashSetArray0 = (LinkedHashSet<JSONArray>[]) Array.newInstance(LinkedHashSet.class, 8);
      LinkedHashSet<JSONArray>[] linkedHashSetArray1 = jSONArray0.toArray(linkedHashSetArray0);
      assertSame(linkedHashSetArray1, linkedHashSetArray0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      List<Object> list0 = javaBeanSerializer0.getObjectFieldValues(class0);
      JSONArray jSONArray0 = new JSONArray(list0);
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) javaBeanSerializer0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getBigInteger(31186);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 31186, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
