/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 19:28:04 GMT 2019
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.io.ByteArrayInputStream;
import java.io.SequenceInputStream;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONArray_ESTest extends JSONArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(193);
      // Undeclared exception!
      try { 
        jSONArray0.getInteger((byte)28);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 28, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray1.fluentAdd(1651, (Object) jSONArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1651, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1651, jSONArray0);
      jSONArray1.addAll(1651, (Collection<?>) jSONArray0);
      jSONArray0.getJSONObject(1651);
      assertEquals(3304, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) null);
      jSONArray0.fluentRemove((Object) jSONArray1.DEFAULT_GENERATE_FEATURE);
      assertFalse(jSONArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentSet(37, "!/>=xEYAb( ");
      jSONArray0.fluentRemove(37);
      assertEquals(37, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentSet(2245, (Object) null);
      jSONArray1.fluentAddAll((Collection<?>) jSONArray0);
      assertEquals(4492, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.setRelatedArray((Object) null);
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentSet(0, jSONArray0.DEFAULT_PARSER_FEATURE);
      assertEquals(1, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentRemove((Object) null);
      assertEquals(0, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      // Undeclared exception!
      try { 
        jSONArray0.fluentAddAll((-2515), (Collection<?>) linkedHashSet0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -2515, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.addAll(1651, (Collection<?>) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1651, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getString((-2929));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getShort((-2874));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(7);
      Class<JSONArray> class0 = JSONArray.class;
      // Undeclared exception!
      try { 
        jSONArray0.getObject(178, (Type) class0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 178, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      // Undeclared exception!
      try { 
        jSONArray0.getJSONArray(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getJSONArray((byte) (-98));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      // Undeclared exception!
      try { 
        jSONArray0.fluentRemove((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray((-1045));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -1045
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.get(145);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 145, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.clear();
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object[] objectArray0 = jSONArray0.toArray();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(13);
      boolean boolean0 = jSONArray0.retainAll(jSONArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2093);
      String string0 = jSONArray0.toJSONString();
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(979);
      JSONArray jSONArray1 = jSONArray0.fluentSet(962, (Object) null);
      Class<JSONObject> class0 = JSONObject.class;
      jSONArray1.toJavaList(class0);
      assertEquals(963, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) null);
      long long0 = jSONArray1.getLongValue(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      jSONArray0.set(1, byteArrayInputStream0);
      // Undeclared exception!
      try { 
        jSONArray0.getBooleanValue(1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : java.io.ByteArrayInputStream@2b0ec24b
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Enumeration<ByteArrayInputStream> enumeration0 = (Enumeration<ByteArrayInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JSONArray jSONArray1 = jSONArray0.fluentSet(2894, sequenceInputStream0);
      jSONArray1.getBoolean(2173);
      assertEquals(2895, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentSet(2245, (Object) null);
      jSONArray1.getJSONArray(2245);
      assertEquals(2246, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      jSONArray0.fluentSet((-1), byteArrayInputStream0);
      assertEquals(1, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(7);
      Class<JSONArray> class0 = JSONArray.class;
      List<JSONArray> list0 = jSONArray0.toJavaList(class0);
      boolean boolean0 = jSONArray0.containsAll(list0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentSet(37, "!/>=xEYAb( ");
      jSONArray0.fluentRetainAll(jSONArray0);
      assertFalse(jSONArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.contains(jSONArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(193);
      boolean boolean0 = jSONArray0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.setRelatedArray(jSONArray0.DEFAULT_PARSER_FEATURE);
      assertTrue(jSONArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = jSONArray0.getRelatedArray();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getSqlDate(3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      JSONArray jSONArray0 = new JSONArray(linkedList0);
      // Undeclared exception!
      try { 
        jSONArray0.getFloat(34);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 34, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.add((Object) jSONArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2093);
      // Undeclared exception!
      try { 
        jSONArray0.getTimestamp((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(13);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        jSONArray0.fluentAddAll(1651, (Collection<?>) linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1651, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Type type0 = jSONArray0.getComponentType();
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONObject jSONObject0 = new JSONObject(1651, false);
      JSONObject jSONObject1 = jSONObject0.fluentRemove(jSONArray0);
      assertSame(jSONObject0, jSONObject1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(385);
      jSONArray0.setComponentType((Type) null);
      assertEquals(0, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getString(103);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 103, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jSONArray0.getObject(3089, class0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentRemoveAll(jSONArray1);
      assertTrue(jSONArray2.equals((Object)jSONArray0));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      // Undeclared exception!
      try { 
        jSONArray0.getBigDecimal(84);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 84, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.subList(3852, 3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // toIndex = 3089
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.remove((Object) jSONArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(224);
      // Undeclared exception!
      try { 
        jSONArray0.getByte(3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getDate(48);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 48, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getShort(3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      ListIterator<Object> listIterator0 = jSONArray0.listIterator();
      assertFalse(listIterator0.hasPrevious());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentRetainAll(jSONArray0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getLong(3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(15);
      // Undeclared exception!
      try { 
        jSONArray0.listIterator(15);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 15
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.addAll((Collection<?>) jSONArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentAddAll((Collection<?>) jSONArray0);
      assertSame(jSONArray1, jSONArray0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = jSONArray0.clone();
      assertNotSame(object0, jSONArray0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentClear();
      // Undeclared exception!
      try { 
        jSONArray2.fluentAdd(3089, (Object) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getDouble(1651);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1651, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentRemove(37);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 37, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentSet(1651, jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray0.getJSONObject(1651);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson.JSONArray cannot be cast to com.alibaba.fastjson.JSONObject
         //
         verifyException("com.alibaba.fastjson.JSONArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2093);
      int int0 = jSONArray0.lastIndexOf("[]");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      int int0 = jSONArray0.indexOf(jSONArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.remove(2196);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2196, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(7);
      Integer[] integerArray0 = new Integer[8];
      Integer[] integerArray1 = jSONArray0.toArray(integerArray0);
      assertEquals(8, integerArray1.length);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) "!/>=xEYAb( ");
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getBigInteger(3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
