/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 15:02:46 GMT 2018
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
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ObjectStreamConstants;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONArray_ESTest extends JSONArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.fluentRemove(3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      short short0 = ObjectStreamConstants.STREAM_MAGIC;
      LinkedHashSet<MockJapaneseDate> linkedHashSet0 = new LinkedHashSet<MockJapaneseDate>();
      boolean boolean0 = jSONArray0.removeAll(linkedHashSet0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.clone();
      // Undeclared exception!
      try { 
        jSONArray0.getLongValue(3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.toArray();
      Class<MockJapaneseDate> class0 = MockJapaneseDate.class;
      List<MockJapaneseDate> list0 = jSONArray0.toJavaList(class0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<MockMinguoDate> linkedList0 = new LinkedList<MockMinguoDate>();
      boolean boolean0 = jSONArray0.addAll((Collection<?>) linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.toArray();
      // Undeclared exception!
      try { 
        jSONArray0.getInteger(3475);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3475, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<PropertyNamingStrategy> class0 = PropertyNamingStrategy.class;
      List<PropertyNamingStrategy> list0 = jSONArray0.toJavaList(class0);
      JSONArray jSONArray1 = jSONArray0.fluentAddAll((Collection<?>) list0);
      assertEquals(3089, JSON.DEFAULT_GENERATE_FEATURE);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      jSONArray0.indexOf(mockJapaneseDate0);
      boolean boolean0 = jSONArray0.add((Object) mockJapaneseDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.listIterator(3306);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3306
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = jSONArray0.getRelatedArray();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      short short0 = ObjectStreamConstants.STREAM_MAGIC;
      // Undeclared exception!
      try { 
        jSONArray0.getFloat((short) (-21267));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      JSONArray jSONArray2 = jSONArray1.fluentRetainAll(jSONArray0);
      assertSame(jSONArray1, jSONArray2);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<Method> linkedList0 = new LinkedList<Method>();
      boolean boolean0 = jSONArray0.containsAll(linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedHashSet<MockHijrahDate> linkedHashSet0 = new LinkedHashSet<MockHijrahDate>();
      // Undeclared exception!
      try { 
        jSONArray0.fluentAddAll(2457, (Collection<?>) linkedHashSet0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2457, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getTimestamp(2034);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2034, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<MockThaiBuddhistDate> linkedList0 = new LinkedList<MockThaiBuddhistDate>();
      jSONArray0.retainAll(linkedList0);
      // Undeclared exception!
      try { 
        jSONArray0.getDoubleValue(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(48);
      // Undeclared exception!
      try { 
        jSONArray0.subList(1630, 1630);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // toIndex = 1630
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      JSONArray jSONArray1 = jSONArray0.fluentRemoveAll(linkedHashSet0);
      // Undeclared exception!
      try { 
        jSONArray1.getDoubleValue(2303);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2303, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      // Undeclared exception!
      try { 
        jSONArray0.getLong(56320);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 56320, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.contains(jSONArray0);
      Type type0 = jSONArray0.getComponentType();
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 3089);
      jSONArray0.setComponentType((Type) null);
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      MockDate mockDate0 = new MockDate(1405, 2303, 2303, 2303, 2303, 1405);
      jSONArray1.setComponentType((Type) null);
      assertSame(jSONArray0, jSONArray1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentRemove((Object) "Pr6tW}");
      jSONArray1.set(3089, jSONArray0);
      int int0 = 0;
      // Undeclared exception!
      try { 
        jSONArray1.toArray((JSONArray[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        jSONArray0.getDouble(45380);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 45380, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<MockHijrahDate> linkedList0 = new LinkedList<MockHijrahDate>();
      JSONArray jSONArray1 = jSONArray0.fluentAddAll((Collection<?>) linkedList0);
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      boolean boolean0 = jSONArray1.equals(mockMinguoDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONObject jSONObject0 = new JSONObject(3089);
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

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.size();
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
  public void test26()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedHashSet<JSONPath.Operator> linkedHashSet0 = new LinkedHashSet<JSONPath.Operator>();
      JSONPath.Operator jSONPath_Operator0 = JSONPath.Operator.LE;
      linkedHashSet0.add(jSONPath_Operator0);
      jSONArray0.containsAll(linkedHashSet0);
      // Undeclared exception!
      try { 
        jSONArray0.getString(2303);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2303, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<Method> class0 = Method.class;
      List<Method> list0 = jSONArray0.toJavaList(class0);
      // Undeclared exception!
      try { 
        jSONArray0.addAll(255, (Collection<?>) list0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 255, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getBigDecimal(2071);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2071, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 3089);
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, pushbackInputStream0);
      jSONArray1.getJSONObject(2303);
      boolean boolean0 = jSONArray0.contains(pushbackInputStream0);
      assertEquals(3090, jSONArray0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 3089);
      jSONArray0.fluentSet((-1), pushbackInputStream0);
      // Undeclared exception!
      try { 
        jSONArray0.getJSONObject(2303);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2303, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<MockJapaneseDate> class0 = MockJapaneseDate.class;
      jSONArray0.toJavaList(class0);
      // Undeclared exception!
      try { 
        jSONArray0.getString((-1534));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      assertTrue(jSONArray0.isEmpty());
      
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) "Pr6tW}");
      boolean boolean0 = jSONArray1.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.listIterator();
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
  public void test34()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.clear();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray1.getByte(3089);
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
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentRemove((Object) "Pr6tW}");
      jSONArray0.isEmpty();
      ListIterator<Object> listIterator0 = jSONArray1.listIterator();
      jSONArray0.add((Object) listIterator0);
      // Undeclared exception!
      try { 
        jSONArray0.getSqlDate(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to Date, value : java.util.ArrayList$ListItr@6c06b678
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        jSONArray0.getObject((-2676), class0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONObject jSONObject0 = new JSONObject(1173);
      // Undeclared exception!
      try { 
        jSONArray0.add(3089, (Object) jSONObject0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 3089);
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, pushbackInputStream0);
      jSONArray0.getJSONObject(2303);
      jSONArray1.remove((Object) null);
      assertEquals(3089, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      jSONArray0.set(5607, mockMinguoDate0);
      jSONArray0.getByteValue(2303);
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      assertEquals(0, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 3089);
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, pushbackInputStream0);
      // Undeclared exception!
      try { 
        jSONArray1.getJSONArray(3089);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.fastjson.JSONObject cannot be cast to com.alibaba.fastjson.JSONArray
         //
         verifyException("com.alibaba.fastjson.JSONArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      SerializerFeature serializerFeature0 = SerializerFeature.IgnoreErrorGetter;
      jSONArray0.setRelatedArray(serializerFeature0);
      Class<MockJapaneseDate> class0 = MockJapaneseDate.class;
      // Undeclared exception!
      try { 
        jSONArray0.fluentAdd((-32768), (Object) class0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -32768, Size: 0
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
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      jSONArray0.set(3064, mockMinguoDate0);
      // Undeclared exception!
      try { 
        jSONArray0.getByteValue(3064);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to byte, value : org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate@5eaa2112
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(131);
      // Undeclared exception!
      try { 
        jSONArray0.remove(131);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 131, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 3089);
      jSONArray0.fluentSet(3089, pushbackInputStream0);
      jSONArray0.getJSONObject(2303);
      Class<DataInputStream> class0 = DataInputStream.class;
      // Undeclared exception!
      try { 
        jSONArray0.toJavaList(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to : java.io.DataInputStream
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Enumeration<PushbackInputStream> enumeration0 = (Enumeration<PushbackInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      HashMap<String, Field> hashMap0 = new HashMap<String, Field>();
      ParserConfig.getFieldFromCache("Pr6tW}", hashMap0);
      jSONArray0.fluentSet(1810, (Object) null);
      short short0 = jSONArray0.getShortValue(1810);
      assertEquals(1811, jSONArray0.size());
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      int int0 = jSONArray0.lastIndexOf(mockThaiBuddhistDate0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<String, Field> hashMap0 = new HashMap<String, Field>();
      ParserConfig.getFieldFromCache("yyyy-MM-dd HH:mm:ss", hashMap0);
      jSONArray0.fluentSet(1, (Object) null);
      float float0 = jSONArray0.getFloatValue(1);
      assertEquals(2, jSONArray0.size());
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<String, Field> hashMap0 = new HashMap<String, Field>();
      ParserConfig.getFieldFromCache("1.2.46", hashMap0);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1761, mockJapaneseDate0);
      // Undeclared exception!
      try { 
        jSONArray1.getFloatValue(1761);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to float, value : org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate@543fa547
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 3089);
      jSONArray0.fluentSet(3089, pushbackInputStream0);
      long long0 = jSONArray0.getLongValue(2303);
      assertEquals(3090, jSONArray0.size());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<String, Field> hashMap0 = new HashMap<String, Field>();
      ParserConfig.getFieldFromCache("Pr6tW}", hashMap0);
      JSONArray jSONArray1 = jSONArray0.fluentSet(1810, (Object) null);
      boolean boolean0 = jSONArray1.getBooleanValue(204);
      assertEquals(1811, jSONArray0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<String, Field> hashMap0 = new HashMap<String, Field>();
      ParserConfig.getFieldFromCache("Pr6tW}", hashMap0);
      jSONArray0.fluentSet(1810, (Object) null);
      jSONArray0.getIntValue(1810);
      jSONArray0.getBoolean(578);
      assertEquals(1811, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 3042);
      JSONArray jSONArray1 = jSONArray0.fluentSet(3042, pushbackInputStream0);
      JSONArray jSONArray2 = new JSONArray(jSONArray1);
      jSONArray0.getJSONObject(312);
      jSONArray0.size();
      double double0 = jSONArray1.getDoubleValue(1367);
      assertEquals(3043, jSONArray0.size());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 3089);
      jSONArray0.fluentSet(3089, pushbackInputStream0);
      jSONArray0.getJSONObject(2303);
      jSONArray0.getBoolean(2303);
      jSONArray0.getInteger(3088);
      assertEquals(3090, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 3042);
      JSONArray jSONArray1 = new JSONArray(2303);
      JSONArray jSONArray2 = new JSONArray(jSONArray1);
      HashMap<String, Field> hashMap0 = new HashMap<String, Field>();
      ParserConfig.getFieldFromCache("Pr6tW}", hashMap0);
      JSONArray jSONArray3 = jSONArray0.fluentSet(3089, jSONArray1);
      // Undeclared exception!
      try { 
        jSONArray3.getShortValue(3089);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to short, value : []
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<MockMinguoDate> linkedList0 = new LinkedList<MockMinguoDate>();
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-7);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-7), (byte) (-7));
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 125);
      jSONArray0.fluentSet(3074, pushbackInputStream0);
      // Undeclared exception!
      try { 
        jSONArray0.getDoubleValue(3074);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to double, value : java.io.PushbackInputStream@57f73308
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      HashMap<String, Field> hashMap0 = new HashMap<String, Field>();
      ParserConfig.getFieldFromCache("list_item_value", hashMap0);
      JSONArray jSONArray1 = jSONArray0.fluentSet(1810, hashMap0);
      // Undeclared exception!
      try { 
        jSONArray1.getLongValue(1810);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : {}
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-7);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-7), (byte) (-7));
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 125);
      jSONArray0.fluentSet(3061, pushbackInputStream0);
      // Undeclared exception!
      try { 
        jSONArray0.getBooleanValue(3061);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : java.io.PushbackInputStream@4f60d20d
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 3089);
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, pushbackInputStream0);
      jSONArray0.getComponentType();
      jSONArray1.getObject(3076, (Type) null);
      JSONArray jSONArray2 = jSONArray1.fluentRemove((Object) pushbackInputStream0);
      jSONArray2.getInteger(0);
      assertEquals(3089, jSONArray1.size());
      assertEquals(3089, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 3089);
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, pushbackInputStream0);
      JSONArray jSONArray2 = jSONArray0.fluentSet(3097, jSONArray1);
      // Undeclared exception!
      try { 
        jSONArray2.getIntValue(3089);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to int, value : java.io.PushbackInputStream@37e088f2
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 3089);
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, pushbackInputStream0);
      jSONArray1.getJSONObject(3089);
      Class<MockHijrahDate> class0 = MockHijrahDate.class;
      String[] stringArray0 = new String[9];
      stringArray0[0] = "yyyy-MM-dd HH:mm:ss";
      stringArray0[1] = "1.2.46";
      stringArray0[2] = "Pr6tW}";
      stringArray0[3] = "Pr6tW}";
      stringArray0[4] = "Pr6tW}";
      stringArray0[5] = "Pr6tW}";
      stringArray0[6] = "yyyy-MM-dd HH:mm:ss";
      stringArray0[7] = "yyyy-MM-dd HH:mm:ss";
      stringArray0[8] = "yyyy-MM-dd HH:mm:ss";
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, stringArray0);
      Class<?> class1 = javaBeanSerializer0.getType();
      jSONArray1.getObject(68, (Type) class1);
      jSONArray1.size();
      jSONArray0.getDate(2303);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 3042);
      JSONArray jSONArray1 = jSONArray0.fluentSet(3042, pushbackInputStream0);
      JSONArray jSONArray2 = new JSONArray(jSONArray1);
      jSONArray1.fluentSet(193, "Pr6tW}");
      JSONArray jSONArray3 = new JSONArray(jSONArray2);
      // Undeclared exception!
      try { 
        jSONArray1.fluentAdd(3089, (Object) jSONArray2);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 3043
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}