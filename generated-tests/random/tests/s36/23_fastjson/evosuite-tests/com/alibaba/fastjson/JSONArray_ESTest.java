/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 20:56:34 GMT 2019
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import java.io.File;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONArray_ESTest extends JSONArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getByteValue(3062);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3062, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(906);
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray1.fluentRemove(989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 989, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      File file0 = MockFile.createTempFile("com.alibaba.fastjson.JSONArray", "");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) mockFileInputStream0);
      jSONArray1.fluentSet(1, mockFileInputStream0);
      assertEquals(2, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(402);
      jSONArray0.setRelatedArray("1.2.46");
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      File file0 = MockFile.createTempFile("com.alibaba.fastjson.JSONArray", "");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      jSONArray0.fluentAdd((Object) mockFileInputStream0);
      int int0 = jSONArray0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Iterator<Object> iterator0 = jSONArray0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(4573);
      jSONArray0.set(4573, (Object) null);
      jSONArray0.getInteger(0);
      assertEquals(4574, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentSet(3043, fileSystemHandling0);
      jSONArray0.fluentRemove(989);
      assertEquals(3043, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentSet(3043, fileSystemHandling0);
      jSONArray1.fluentAddAll((Collection<?>) jSONArray1);
      jSONArray1.getDouble(3089);
      assertEquals(6088, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(906);
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, jSONArray0);
      jSONArray1.fluentAddAll(906, (Collection<?>) jSONArray0);
      assertEquals(6180, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(4573);
      // Undeclared exception!
      try { 
        jSONArray0.getInteger(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentSet(3043, fileSystemHandling0);
      jSONArray1.fluentAdd(3043, (Object) fileSystemHandling0);
      assertEquals(3045, jSONArray1.size());
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
      LinkedHashSet<InputStream> linkedHashSet0 = new LinkedHashSet<InputStream>();
      // Undeclared exception!
      try { 
        jSONArray0.fluentAddAll((-938), (Collection<?>) linkedHashSet0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -938, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentAdd(3043, (Object) fileSystemHandling0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3043, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(49);
      // Undeclared exception!
      try { 
        jSONArray0.getJSONArray(49);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 49, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getBooleanValue(51068);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 51068, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getBoolean(3087);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3087, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONArray jSONArray0 = null;
      try {
        jSONArray0 = new JSONArray((-3156));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -3156
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(28);
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
      JSONArray jSONArray0 = new JSONArray();
      int int0 = jSONArray0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      File file0 = MockFile.createTempFile("com.alibaba.fastjson.JSONArray", "");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      jSONArray0.fluentSet(1, mockFileInputStream0);
      // Undeclared exception!
      try { 
        jSONArray0.getDoubleValue(1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to double, value : org.evosuite.runtime.mock.java.io.MockFileInputStream@d43b866
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(906);
      jSONArray0.fluentSet(3089, jSONArray0);
      long long0 = jSONArray0.getLongValue(906);
      assertEquals(3090, jSONArray0.size());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(4573);
      jSONArray0.set(4573, (Object) null);
      int int0 = jSONArray0.getIntValue(148);
      assertEquals(4574, jSONArray0.size());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1941);
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) null);
      Boolean boolean0 = jSONArray1.getBoolean(0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(669);
      JSONArray jSONArray1 = jSONArray0.fluentSet(669, "7n~'iZz:6_Ew$NZ}X");
      // Undeclared exception!
      try { 
        jSONArray1.getJSONArray(669);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.alibaba.fastjson.JSONArray
         //
         verifyException("com.alibaba.fastjson.JSONArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      JSONArray jSONArray0 = new JSONArray(linkedList0);
      LinkedList<String> linkedList1 = new LinkedList<String>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(989, linkedList1);
      // Undeclared exception!
      try { 
        jSONArray1.getJSONObject(989);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson.JSONArray cannot be cast to com.alibaba.fastjson.JSONObject
         //
         verifyException("com.alibaba.fastjson.JSONArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentSet((-2709), jSONArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<JSONArray> linkedList0 = new LinkedList<JSONArray>();
      JSONArray jSONArray1 = jSONArray0.fluentSet((-1), linkedList0);
      jSONArray0.fluentRetainAll(jSONArray1);
      assertFalse(jSONArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(402);
      Class<JSONObject> class0 = JSONObject.class;
      List<JSONObject> list0 = jSONArray0.toJavaList(class0);
      boolean boolean0 = jSONArray0.containsAll(list0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.contains((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.set(3015, (Object) null);
      boolean boolean0 = jSONArray0.isEmpty();
      assertEquals(3016, jSONArray0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.setRelatedArray((Object) null);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1941);
      JSONArray jSONArray1 = jSONArray0.fluentRetainAll(jSONArray0);
      assertSame(jSONArray1, jSONArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1941);
      Object object0 = jSONArray0.getRelatedArray();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getSqlDate(2995);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2995, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      PipedInputStream pipedInputStream0 = new PipedInputStream(989);
      JSONArray jSONArray2 = jSONArray1.fluentAdd((Object) pipedInputStream0);
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getTimestamp(989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 989, Size: 0
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
      jSONArray0.hashCode();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      JSONArray jSONArray0 = new JSONArray(linkedList0);
      ParameterizedTypeImpl parameterizedTypeImpl0 = (ParameterizedTypeImpl)TypeReference.LIST_STRING;
      jSONArray0.setComponentType(parameterizedTypeImpl0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(3025);
      // Undeclared exception!
      try { 
        jSONArray0.getString(93);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 93, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(3083);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        jSONArray0.getObject(3083, class0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3083, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(999999);
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentRemoveAll(jSONArray1);
      assertNotSame(jSONArray0, jSONArray2);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getBigDecimal(597);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 597, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.subList((-699), (-699));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // fromIndex = -699
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray1.fluentAdd(54, (Object) jSONArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 54, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(72);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      boolean boolean0 = jSONArray0.remove((Object) pipedInputStream0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getByte((-1508));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      // Undeclared exception!
      try { 
        jSONArray0.getDate(2338);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2338, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
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
  public void test53()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1941);
      ListIterator<Object> listIterator0 = jSONArray0.listIterator();
      assertFalse(listIterator0.hasNext());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1941);
      boolean boolean0 = jSONArray0.retainAll(jSONArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getLong(1018);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1018, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.listIterator(2539);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2539
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getInteger(3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      assertTrue(jSONArray1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentAddAll((Collection<?>) jSONArray0);
      assertNotSame(jSONArray0, jSONArray2);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(72);
      JSONArray jSONArray1 = jSONArray0.fluentRemove((Object) jSONArray0.DEFAULT_GENERATE_FEATURE);
      assertSame(jSONArray0, jSONArray1);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(28);
      Object object0 = jSONArray0.clone();
      assertTrue(object0.equals((Object)jSONArray0));
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(72);
      JSONArray jSONArray1 = jSONArray0.fluentSet(989, jSONArray0.DEFAULT_PARSER_FEATURE);
      Class<InputStream> class0 = InputStream.class;
      // Undeclared exception!
      try { 
        jSONArray1.toJavaList(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to : java.io.InputStream
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      int int0 = jSONArray0.lastIndexOf("1.2.46");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      int int0 = jSONArray0.indexOf(jSONArray0.DEFAULT_PARSER_FEATURE);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray1.fluentRemove(3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object[] objectArray0 = new Object[3];
      Object[] objectArray1 = jSONArray0.toArray(objectArray0);
      assertSame(objectArray0, objectArray1);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1102);
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
