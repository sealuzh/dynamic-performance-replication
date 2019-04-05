/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 09:43:45 GMT 2019
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.PascalNameFilter;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.lang.reflect.Type;
import java.time.ZoneId;
import java.util.Collection;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONArray_ESTest extends JSONArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      SerializeFilter[] serializeFilterArray0 = new SerializeFilter[7];
      String[] stringArray0 = new String[1];
      SimplePropertyPreFilter simplePropertyPreFilter0 = new SimplePropertyPreFilter(stringArray0);
      serializeFilterArray0[1] = (SerializeFilter) simplePropertyPreFilter0;
      boolean boolean0 = jSONArray0.equals(serializeFilterArray0[1]);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      JSONArray jSONArray0 = new JSONArray(linkedList0);
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray1.getBigDecimal(3089);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      int int0 = jSONArray0.indexOf("[]");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.set(454, (Object) null);
      int int0 = jSONArray0.lastIndexOf((Object) null);
      assertEquals(455, jSONArray0.size());
      assertEquals(454, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.set(454, (Object) null);
      jSONArray0.getFloat(454);
      assertEquals(455, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONObject jSONObject0 = new JSONObject(3089);
      jSONArray0.fluentSet(1272, jSONObject0);
      jSONArray0.getBigDecimal(1);
      assertEquals(1273, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1);
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, (Object) null);
      jSONArray1.fluentRemove((Object) jSONArray0);
      assertEquals(3090, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      JSONArray jSONArray1 = jSONArray0.fluentAddAll((Collection<?>) set0);
      assertEquals(599, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getFloat(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
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
  public void test10()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      jSONArray0.fluentSet(1, sequenceInputStream0);
      assertEquals(2, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      SerializeFilter[] serializeFilterArray0 = new SerializeFilter[7];
      PascalNameFilter pascalNameFilter0 = new PascalNameFilter();
      serializeFilterArray0[5] = (SerializeFilter) pascalNameFilter0;
      JSONArray jSONArray1 = jSONArray0.fluentRemove((Object) serializeFilterArray0[5]);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentRemove(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentAdd((-865), (Object) jSONArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -865, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.add((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      // Undeclared exception!
      try { 
        jSONArray0.getShortValue(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getJSONObject(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getJSONArray(62);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 62, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getJSONArray((-510));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getBooleanValue(3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentAddAll(3089, (Collection<?>) jSONArray0);
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
      Object[] objectArray0 = jSONArray0.toArray();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<String> class0 = String.class;
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, map0);
      List<Object> list0 = javaBeanSerializer0.getObjectFieldValues((Object) null);
      JSONArray jSONArray0 = new JSONArray(list0);
      boolean boolean0 = jSONArray0.addAll((Collection<?>) list0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      int int0 = jSONArray0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.add((Object) "1.2.46");
      jSONArray0.set(454, (Object) null);
      int int0 = jSONArray0.indexOf((Object) null);
      assertEquals(455, jSONArray0.size());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentAdd((Object) null);
      Class<Object> class0 = Object.class;
      List<Object> list0 = jSONArray0.toJavaList(class0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2217);
      // Undeclared exception!
      try { 
        jSONArray0.getDoubleValue(3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1);
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, (Object) null);
      float float0 = jSONArray1.getFloatValue(3089);
      assertEquals(3090, jSONArray0.size());
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.set(454, (Object) null);
      long long0 = jSONArray0.getLongValue(1);
      assertEquals(455, jSONArray0.size());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1);
      jSONArray0.fluentSet(3089, (Object) null);
      int int0 = jSONArray0.getIntValue(1040);
      assertEquals(3090, jSONArray0.size());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.set(454, (Object) null);
      boolean boolean0 = jSONArray0.getBooleanValue(454);
      assertEquals(455, jSONArray0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentSet(3919, (Object) null);
      jSONArray0.getJSONObject(3089);
      assertEquals(3920, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentSet((-1241), (Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(47);
      jSONArray0.fluentSet((-1), jSONArray0);
      assertEquals(1, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) null);
      jSONArray0.fluentRetainAll(jSONArray1);
      assertEquals(1, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.contains(jSONArray0.DEFAULT_GENERATE_FEATURE);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      boolean boolean0 = jSONArray0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(862);
      jSONArray0.setRelatedArray(jSONArray0.DEFAULT_GENERATE_FEATURE);
      assertEquals(0, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(867);
      Object object0 = jSONArray0.getRelatedArray();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2431);
      // Undeclared exception!
      try { 
        jSONArray0.getSqlDate(56);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 56, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getTimestamp((-724));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<Integer> class0 = Integer.class;
      List<Integer> list0 = jSONArray0.toJavaList(class0);
      JSONArray jSONArray1 = jSONArray0.fluentAddAll(0, (Collection<?>) list0);
      assertTrue(jSONArray1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Type type0 = jSONArray0.getComponentType();
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Class<String> class0 = String.class;
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, map0);
      List<Object> list0 = javaBeanSerializer0.getObjectFieldValues((Object) null);
      JSONArray jSONArray0 = new JSONArray(list0);
      jSONArray0.hashCode();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<JSONArray> class0 = JSONArray.class;
      jSONArray0.setComponentType(class0);
      assertEquals(0, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Class<String> class0 = String.class;
      Map<String, String> map0 = ZoneId.SHORT_IDS;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, map0);
      List<Object> list0 = javaBeanSerializer0.getObjectFieldValues((Object) null);
      JSONArray jSONArray0 = new JSONArray(list0);
      // Undeclared exception!
      try { 
        jSONArray0.getString((-3860));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.addAll(3089, (Collection<?>) jSONArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<PushbackInputStream> class0 = PushbackInputStream.class;
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
  public void test48()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.removeAll(jSONArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(867);
      // Undeclared exception!
      try { 
        jSONArray0.getBigDecimal((byte) (-58));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.subList(3123, 982);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // toIndex = 982
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(114);
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentAdd((Object) jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray2.fluentAdd(68, (Object) jSONArray1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 68, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1);
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentRemove((Object) jSONArray0);
      assertTrue(jSONArray2.equals((Object)jSONArray0));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getByte(977);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 977, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getDate((-1084));
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
      // Undeclared exception!
      try { 
        jSONArray0.getShort((-508));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      ListIterator<Object> listIterator0 = jSONArray0.listIterator();
      int int0 = jSONArray0.lastIndexOf(listIterator0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentRetainAll(jSONArray0);
      assertTrue(jSONArray2.equals((Object)jSONArray0));
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getLong(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1509);
      // Undeclared exception!
      try { 
        jSONArray0.listIterator(1485);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1485
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.containsAll(jSONArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getInteger(981);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 981, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(47);
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1530);
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentAddAll((Collection<?>) jSONArray0);
      assertTrue(jSONArray2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = jSONArray0.clone();
      assertNotSame(object0, jSONArray0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      jSONArray0.clear();
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getDouble(1267);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1267, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      SerializeFilter[] serializeFilterArray0 = new SerializeFilter[7];
      boolean boolean0 = jSONArray0.equals(serializeFilterArray0[1]);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1530);
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentSet(1530, (Object) null);
      // Undeclared exception!
      try { 
        jSONArray2.fluentRemove(3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 1531
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      JSONArray jSONArray1 = jSONArray0.fluentRemoveAll(set0);
      assertSame(jSONArray1, jSONArray0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Integer[] integerArray0 = new Integer[2];
      Integer[] integerArray1 = jSONArray0.toArray(integerArray0);
      assertEquals(2, integerArray1.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(47);
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray1.getBooleanValue(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : [{\"$ref\":\"@\"}]
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      JSONArray jSONArray0 = new JSONArray(linkedList0);
      // Undeclared exception!
      try { 
        jSONArray0.getBigInteger(962);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 962, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }
}
