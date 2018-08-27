/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 04:42:22 GMT 2018
 */

package com.alibaba.fastjson;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.PascalNameFilter;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.ObjectStreamConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.time.chrono.HijrahDate;
import java.util.Calendar;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONArray_ESTest extends JSONArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      jSONArray0.removeAll(linkedList0);
      jSONArray0.containsAll(linkedList0);
      JSONArray jSONArray1 = jSONArray0.fluentRetainAll(linkedList0);
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<MockJapaneseDate> class0 = MockJapaneseDate.class;
      // Undeclared exception!
      try { 
        jSONArray0.getObject(1425, class0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1425, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      jSONArray0.add((Object) mockHijrahDate0);
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
  public void test03()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      boolean boolean0 = jSONArray1.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SerializeConfig serializeConfig0 = new SerializeConfig();
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getTimestamp(4007);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4007, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getInteger((-2372));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.toJSONString();
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      // Undeclared exception!
      try { 
        jSONArray0.fluentAddAll(4846, (Collection<?>) linkedHashSet0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4846, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<JSONPath.Operator> class0 = JSONPath.Operator.class;
      jSONArray0.indexOf(class0);
      Integer integer0 = new Integer(989);
      jSONArray0.equals(integer0);
      // Undeclared exception!
      try { 
        JSON.toJavaObject((JSON) jSONArray0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to : com.alibaba.fastjson.JSONPath$Operator
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<MockMinguoDate> linkedList0 = new LinkedList<MockMinguoDate>();
      jSONArray0.containsAll(linkedList0);
      JSONArray jSONArray1 = (JSONArray)jSONArray0.clone();
      assertTrue(jSONArray1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      boolean boolean0 = jSONArray0.remove((Object) mockMinguoDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<JSONArray> linkedList0 = new LinkedList<JSONArray>();
      JSONArray jSONArray1 = jSONArray0.fluentRemoveAll(linkedList0);
      ListIterator<Object> listIterator0 = jSONArray1.listIterator();
      assertFalse(listIterator0.hasNext());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(577);
      Object object0 = new Object();
      jSONArray0.setRelatedArray(object0);
      // Undeclared exception!
      try { 
        jSONArray0.subList(577, 4874);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // toIndex = 4874
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(511);
      // Undeclared exception!
      try { 
        jSONArray0.getDate(128);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 128, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      jSONArray0.listIterator();
      jSONArray0.setRelatedArray(mockJapaneseDate0);
      assertEquals(0, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.toJSONString();
      // Undeclared exception!
      try { 
        jSONArray0.getDoubleValue(989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 989, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.add(3208, (Object) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3208, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.isEmpty();
      assertTrue(boolean0);
      
      Class<JSONPath.Operator> class0 = JSONPath.Operator.class;
      jSONArray0.toJavaList(class0);
      assertTrue(jSONArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getLong(1458);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1458, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.toArray();
      Set<String> set0 = Calendar.getAvailableCalendarTypes();
      boolean boolean0 = jSONArray0.retainAll(set0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      SerializeConfig serializeConfig0 = new SerializeConfig();
      PropertyNamingStrategy propertyNamingStrategy0 = serializeConfig0.propertyNamingStrategy;
      jSONArray0.fluentSet((-1), (Object) null);
      JSONArray jSONArray1 = new JSONArray(989);
      // Undeclared exception!
      try { 
        jSONArray1.getBigDecimal(3089);
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
        jSONArray0.getFloat(2026);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2026, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Type type0 = jSONArray0.getComponentType();
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.isEmpty();
      // Undeclared exception!
      try { 
        jSONArray0.getDouble((-272));
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
      // Undeclared exception!
      try { 
        jSONArray0.getSqlDate((-475));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.clear();
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.addAll((Collection<?>) jSONArray0);
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      // Undeclared exception!
      try { 
        jSONArray1.getLongValue((-167));
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
      JSONArray jSONArray1 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray1.getString(989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 989, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getByte(632);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 632, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedHashSet<JSONPath.Operator> linkedHashSet0 = new LinkedHashSet<JSONPath.Operator>();
      LinkedHashSet<JSONPath.Operator> linkedHashSet1 = new LinkedHashSet<JSONPath.Operator>();
      linkedHashSet0.addAll(linkedHashSet1);
      // Undeclared exception!
      try { 
        jSONArray0.addAll(1429, (Collection<?>) linkedHashSet0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1429, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getBigInteger(989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 989, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      jSONArray0.lastIndexOf(mockHijrahDate0);
      // Undeclared exception!
      try { 
        jSONArray0.getBoolean(989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 989, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray1.getShort(989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 989, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockThaiBuddhistDate[] mockThaiBuddhistDateArray0 = new MockThaiBuddhistDate[0];
      jSONArray0.toArray(mockThaiBuddhistDateArray0);
      // Undeclared exception!
      try { 
        jSONArray0.getIntValue(1565);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1565, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      jSONArray0.indexOf(mockThaiBuddhistDate0);
      // Undeclared exception!
      try { 
        jSONArray0.getBoolean(989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 989, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) mockMinguoDate0);
      jSONArray1.removeAll(jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray0.getDoubleValue(1813);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1813, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) null);
      LinkedHashSet<MockMinguoDate> linkedHashSet0 = new LinkedHashSet<MockMinguoDate>();
      jSONArray0.removeAll(linkedHashSet0);
      Class<MockMinguoDate> class0 = MockMinguoDate.class;
      List<MockMinguoDate> list0 = jSONArray1.toJavaList(class0);
      boolean boolean0 = jSONArray0.containsAll(list0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      JSONArray jSONArray1 = jSONArray0.fluentRemove((Object) mockJapaneseDate0);
      MockJapaneseDate.now();
      jSONArray1.contains(jSONArray0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)88;
      byteArray0[1] = (byte)55;
      byteArray0[2] = (byte)71;
      byteArray0[3] = (byte)52;
      byteArray0[4] = (byte) (-49);
      byteArray0[5] = (byte) (-120);
      byteArray0[6] = (byte)33;
      byteArray0[7] = (byte)66;
      UTF8Decoder uTF8Decoder0 = new UTF8Decoder();
      CodingErrorAction codingErrorAction0 = CodingErrorAction.REPLACE;
      CharsetDecoder charsetDecoder0 = uTF8Decoder0.onUnmappableCharacter(codingErrorAction0);
      // Undeclared exception!
      try { 
        JSON.parse(byteArray0, (int) (byte) (-49), 18, charsetDecoder0, (-3733));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = jSONArray0.getRelatedArray();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      short short0 = ObjectStreamConstants.STREAM_MAGIC;
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      JSONArray jSONArray1 = jSONArray0.fluentSet(989, mockHijrahDate0);
      // Undeclared exception!
      try { 
        jSONArray1.getBooleanValue(989);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate@44ff5b65
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<MockMinguoDate> linkedList0 = new LinkedList<MockMinguoDate>();
      LinkedList<MockMinguoDate> linkedList1 = new LinkedList<MockMinguoDate>();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      linkedList1.add(mockMinguoDate0);
      boolean boolean0 = jSONArray0.containsAll(linkedList1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      short short0 = ObjectStreamConstants.STREAM_MAGIC;
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      PropertyNamingStrategy propertyNamingStrategy0 = serializeConfig0.propertyNamingStrategy;
      JSONArray jSONArray1 = jSONArray0.fluentSet(1468, (Object) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      jSONArray0.getBoolean(989);
      jSONArray1.getLongValue(1468);
      jSONArray1.hashCode();
      // Undeclared exception!
      try { 
        jSONArray1.fluentRemove((int) (short) (-21267));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -21267
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      short short0 = ObjectStreamConstants.STREAM_MAGIC;
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1468, mockHijrahDate0);
      jSONArray1.getBooleanValue(989);
      jSONArray0.getBoolean(989);
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      boolean boolean0 = jSONArray0.isEmpty();
      assertEquals(1469, jSONArray0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      short short0 = ObjectStreamConstants.STREAM_MAGIC;
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      PropertyNamingStrategy propertyNamingStrategy0 = serializeConfig0.propertyNamingStrategy;
      JSONArray jSONArray1 = jSONArray0.fluentSet(1468, (Object) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      jSONArray0.getBoolean(989);
      byte byte0 = jSONArray1.getByteValue(1468);
      assertEquals(1469, jSONArray0.size());
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, (Object) null);
      jSONArray1.getJSONArray(228);
      float float0 = jSONArray0.getFloatValue(3089);
      assertEquals(3090, jSONArray0.size());
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      short short0 = ObjectStreamConstants.STREAM_MAGIC;
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      jSONArray0.fluentSet(3089, mockHijrahDate0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        jSONArray0.getBoolean(3089);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate@6cc73ea5
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.setComponentType((Type) null);
      // Undeclared exception!
      try { 
        jSONArray0.getDoubleValue(989);
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
      SerializeConfig.getGlobalInstance();
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, (Object) null);
      jSONArray1.fluentAddAll((Collection<?>) jSONArray0);
      jSONArray1.getJSONObject(989);
      double double0 = jSONArray1.getDoubleValue(3089);
      assertEquals(6180, jSONArray1.size());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      short short0 = ObjectStreamConstants.STREAM_MAGIC;
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      PropertyNamingStrategy propertyNamingStrategy0 = serializeConfig0.propertyNamingStrategy;
      Object object0 = new Object();
      FileSystemHandling.shouldAllThrowIOExceptions();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1468, object0);
      jSONArray1.listIterator(989);
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        jSONArray0.getFloatValue(1468);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to float, value : java.lang.Object@337ac526
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, (Object) null);
      jSONArray0.getShortValue(989);
      jSONArray1.remove((int) (short)0);
      assertEquals(3089, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      short short0 = ObjectStreamConstants.STREAM_MAGIC;
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      PropertyNamingStrategy propertyNamingStrategy0 = serializeConfig0.propertyNamingStrategy;
      jSONArray0.fluentSet(1468, (Object) null);
      int int0 = jSONArray0.getIntValue(989);
      assertEquals(1469, jSONArray0.size());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      short short0 = ObjectStreamConstants.STREAM_MAGIC;
      int int0 = 1468;
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JSONArray jSONArray1 = jSONArray0.fluentSet(1468, propertyNamingStrategy0);
      jSONArray0.getBoolean(989);
      // Undeclared exception!
      try { 
        jSONArray1.getLongValue(1468);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : SnakeCase
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<Field> class0 = Field.class;
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0);
      javaBeanSerializer0.getType();
      jSONArray0.fluentSet(989, javaBeanSerializer0);
      jSONArray0.fluentAdd(989, (Object) javaBeanSerializer0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        jSONArray0.getByteValue(989);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to byte, value : com.alibaba.fastjson.serializer.JavaBeanSerializer@e
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, (Object) null);
      JSONArray jSONArray2 = jSONArray1.fluentSet(989, jSONArray0);
      JSONArray jSONArray3 = jSONArray2.getJSONArray(989);
      int int0 = 1419;
      // Undeclared exception!
      try { 
        jSONArray3.subList(3048, 989);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex(3048) > toIndex(989)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      SerializeConfig.getGlobalInstance();
      JSONArray jSONArray1 = jSONArray0.fluentSet(3089, (Object) null);
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      HijrahDate hijrahDate0 = MockHijrahDate.now();
      HijrahDate hijrahDate1 = MockHijrahDate.from(hijrahDate0);
      jSONArray1.fluentSet(989, hijrahDate1);
      JSONArray jSONArray2 = jSONArray1.fluentAdd((Object) hijrahDate1);
      // Undeclared exception!
      try { 
        jSONArray2.getShortValue(989);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to short, value : Hijrah-umalqura AH 1435-04-14
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      SerializeConfig.getGlobalInstance();
      JSONObject jSONObject0 = new JSONObject(1361, true);
      JSONArray jSONArray1 = jSONArray0.fluentSet(1, jSONObject0);
      jSONArray0.fluentAddAll((Collection<?>) jSONArray1);
      jSONArray0.getJSONObject(1);
      // Undeclared exception!
      try { 
        jSONArray0.getDoubleValue(3089);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3089, Size: 4
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      JSONArray jSONArray1 = jSONArray0.fluentSet(2088, mockJapaneseDate0);
      Class<MockHijrahDate> class0 = MockHijrahDate.class;
      ConcurrentHashMap<String, String> concurrentHashMap0 = new ConcurrentHashMap<String, String>();
      jSONArray0.getObject(1044, (Type) class0);
      // Undeclared exception!
      try { 
        jSONArray1.getDoubleValue(2088);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to double, value : org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate@4409bad7
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      jSONArray0.fluentSet(1149, serializeConfig0);
      // Undeclared exception!
      try { 
        jSONArray0.getIntValue(1149);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to int, value : com.alibaba.fastjson.serializer.SerializeConfig@1c7
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      SerializeConfig serializeConfig0 = SerializeConfig.globalInstance;
      jSONArray0.fluentSet(3089, (Object) null);
      Class<MockHijrahDate> class0 = MockHijrahDate.class;
      ConcurrentHashMap<String, String> concurrentHashMap0 = new ConcurrentHashMap<String, String>();
      jSONArray0.getObject(3089, (Type) class0);
      PascalNameFilter pascalNameFilter0 = new PascalNameFilter();
      serializeConfig0.addFilter(class0, pascalNameFilter0);
      jSONArray0.getObject(3025, (Type) null);
      jSONArray0.getIntValue(989);
  }
}