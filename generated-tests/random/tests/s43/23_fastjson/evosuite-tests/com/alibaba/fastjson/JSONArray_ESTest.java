/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 04:40:08 GMT 2019
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.PipedInputStream;
import java.lang.reflect.Type;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
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
        jSONArray0.getBooleanValue(58);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 58, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Iterator<Object> iterator0 = jSONArray0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentSet(2155, (Object) null);
      jSONArray1.getFloat(62);
      assertEquals(2156, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentSet(0, (Object) null);
      jSONArray0.fluentRetainAll(jSONArray0);
      assertFalse(jSONArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) fileSystemHandling0);
      JSONArray jSONArray2 = jSONArray1.fluentAddAll((Collection<?>) jSONArray0);
      assertEquals(2, jSONArray2.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) jSONArray0.DEFAULT_GENERATE_FEATURE);
      JSONArray jSONArray2 = jSONArray0.fluentAddAll(0, (Collection<?>) jSONArray1);
      assertFalse(jSONArray2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(138);
      JSONArray jSONArray1 = jSONArray0.fluentRemove((Object) null);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentAddAll(0, (Collection<?>) jSONArray0);
      assertEquals(0, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentAdd((Object) null);
      boolean boolean0 = jSONArray0.addAll((Collection<?>) jSONArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentAdd(1629, (Object) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1629, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      // Undeclared exception!
      try { 
        jSONArray0.getShortValue(2791);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2791, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2746);
      // Undeclared exception!
      try { 
        jSONArray0.getBoolean(117);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 117, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.get(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray((List<Object>) null);
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      // Undeclared exception!
      try { 
        jSONArray0.fluentAddAll(689, (Collection<?>) set0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.JSONArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray((-17));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -17
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(4);
      JSONArray jSONArray1 = jSONArray0.fluentSet(2020, jSONArray0.DEFAULT_GENERATE_FEATURE);
      jSONArray1.getJSONArray(989);
      assertEquals(2021, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedHashSet<PipedInputStream> linkedHashSet0 = new LinkedHashSet<PipedInputStream>(989, 3089);
      jSONArray0.set(1971, linkedHashSet0);
      boolean boolean0 = jSONArray0.contains((Object) null);
      assertEquals(1972, jSONArray0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) fileSystemHandling0);
      SerializeConfig serializeConfig0 = new SerializeConfig();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[0];
      byte[] byteArray0 = JSON.toJSONBytes((Object) jSONArray1, serializeConfig0, 989, serializerFeatureArray0);
      assertEquals(4, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.equals(jSONArray0.DEFAULT_GENERATE_FEATURE);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.add((Object) null);
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) "");
      // Undeclared exception!
      try { 
        jSONArray1.getFloat(1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.remove((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      jSONArray0.set(0, (Object) null);
      Class<JSONObject> class0 = JSONObject.class;
      jSONArray0.toJavaList(class0);
      assertEquals(1, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<Object> class0 = Object.class;
      List<Object> list0 = jSONArray0.toJavaList(class0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(4);
      JSONArray jSONArray1 = jSONArray0.fluentSet(989, jSONArray0.DEFAULT_GENERATE_FEATURE);
      double double0 = jSONArray1.getDoubleValue(989);
      assertEquals(990, jSONArray0.size());
      assertEquals(3089.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(4);
      jSONArray0.fluentSet(989, jSONArray0.DEFAULT_PARSER_FEATURE);
      int int0 = jSONArray0.getIntValue(989);
      assertEquals(990, jSONArray0.size());
      assertEquals(989, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedHashSet<PipedInputStream> linkedHashSet0 = new LinkedHashSet<PipedInputStream>(989, 3089);
      jSONArray0.set(1971, linkedHashSet0);
      short short0 = jSONArray0.getShortValue(1760);
      assertEquals(1972, jSONArray0.size());
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedHashSet<PipedInputStream> linkedHashSet0 = new LinkedHashSet<PipedInputStream>(989, 3089);
      jSONArray0.set(1971, linkedHashSet0);
      byte byte0 = jSONArray0.getByteValue(989);
      assertEquals(1972, jSONArray0.size());
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getJSONArray(3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedHashSet<PipedInputStream> linkedHashSet0 = new LinkedHashSet<PipedInputStream>(989, 3089);
      jSONArray0.set(1971, linkedHashSet0);
      jSONArray0.getJSONObject(1760);
      assertEquals(1972, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2746);
      JSONObject jSONObject0 = new JSONObject(true);
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) jSONObject0);
      jSONArray1.fluentSet(0, jSONArray0);
      assertEquals(1, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      TextStyle textStyle0 = TextStyle.SHORT_STANDALONE;
      jSONArray0.fluentSet((-1), textStyle0);
      assertEquals(1, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      boolean boolean0 = jSONArray0.containsAll(linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedHashSet<PipedInputStream> linkedHashSet0 = new LinkedHashSet<PipedInputStream>(989, 3089);
      linkedHashSet0.add((PipedInputStream) null);
      boolean boolean0 = jSONArray0.containsAll(linkedHashSet0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentSet(3198, jSONArray0.DEFAULT_PARSER_FEATURE);
      boolean boolean0 = jSONArray1.retainAll(jSONArray0);
      assertFalse(jSONArray0.isEmpty());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.contains(jSONArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentSet(2155, (Object) null);
      boolean boolean0 = jSONArray1.isEmpty();
      assertEquals(2156, jSONArray0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2001);
      jSONArray0.setRelatedArray(jSONArray0);
      assertTrue(jSONArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = jSONArray0.getRelatedArray();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray((List<Object>) null);
      // Undeclared exception!
      try { 
        jSONArray0.getSqlDate(8192);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      jSONArray1.fluentSet(989, jSONArray0);
      assertEquals(990, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getTimestamp(3);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2807);
      Type type0 = jSONArray0.getComponentType();
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(138);
      jSONArray0.hashCode();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      JSONArray jSONArray0 = new JSONArray(linkedList0);
      jSONArray0.setComponentType((Type) null);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getString((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray1.fluentAddAll(3089, (Collection<?>) jSONArray0);
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
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        jSONArray0.getObject((-4689), class0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Set<String> set0 = jSONArray0.defaultLocale.getUnicodeLocaleAttributes();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentRemoveAll(set0);
      assertEquals(0, jSONArray2.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getBigDecimal((-462));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.subList(1537, 3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // toIndex = 3089
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.add((-694), (Object) jSONArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -694, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentRemove((Object) jSONArray0.DEFAULT_PARSER_FEATURE);
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2001);
      // Undeclared exception!
      try { 
        jSONArray0.getByte(3071);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3071, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getDate(945);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 945, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      // Undeclared exception!
      try { 
        jSONArray0.getShort(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(2746);
      ListIterator<Object> listIterator0 = jSONArray0.listIterator();
      assertFalse(listIterator0.hasPrevious());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentRetainAll(jSONArray0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getLong(989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 989, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.listIterator((-249));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -249
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      // Undeclared exception!
      try { 
        jSONArray0.getInteger((-1719));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.addAll((Collection<?>) jSONArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentAddAll((Collection<?>) jSONArray0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = jSONArray0.clone();
      assertTrue(object0.equals((Object)jSONArray0));
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentClear();
      assertSame(jSONArray1, jSONArray2);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getDouble(287);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 287, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      // Undeclared exception!
      try { 
        jSONArray0.fluentRemove(3215);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3215, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
      int int0 = jSONArray0.lastIndexOf(dataInputStream0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Set<String> set0 = jSONArray0.defaultLocale.getUnicodeLocaleAttributes();
      // Undeclared exception!
      try { 
        jSONArray0.fluentAdd(3782, (Object) set0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3782, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      int int0 = jSONArray0.indexOf(jSONArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.remove((-2987));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(138);
      String[] stringArray0 = new String[8];
      String[] stringArray1 = jSONArray0.toArray(stringArray0);
      assertEquals(8, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentAdd((Object) fileSystemHandling0);
      JSONArray jSONArray1 = jSONArray0.fluentRemove((Object) jSONArray0);
      assertEquals(1, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getBigInteger(198);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 198, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
