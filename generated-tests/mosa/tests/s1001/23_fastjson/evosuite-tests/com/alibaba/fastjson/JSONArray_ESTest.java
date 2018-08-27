/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:01:05 GMT 2018
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
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import java.io.ObjectStreamConstants;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
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
      int int0 = 16384;
      JSONArray jSONArray0 = new JSONArray(16384);
      // Undeclared exception!
      try { 
        jSONArray0.subList(16384, 16384);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // toIndex = 16384
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.toArray();
      int int0 = Opcodes.ACONST_NULL;
      // Undeclared exception!
      try { 
        jSONArray0.fluentRemove(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getFloat((-2381));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1379);
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      JSONArray jSONArray1 = jSONArray0.fluentRemove((Object) mockHijrahDate0);
      boolean boolean0 = jSONArray1.removeAll(jSONArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1, object0);
      jSONArray1.fluentAdd(object0);
      float float0 = jSONArray1.getFloatValue(0);
      assertEquals(3, jSONArray0.size());
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray();
      jSONArray0.retainAll(jSONArray1);
      jSONArray1.listIterator();
      // Undeclared exception!
      try { 
        jSONArray0.getBooleanValue(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      JSONArray jSONArray2 = new JSONArray(jSONArray0);
      jSONArray2.fluentRetainAll(jSONArray0);
      jSONArray2.set(0, jSONArray1);
      // Undeclared exception!
      try { 
        jSONArray2.getShortValue(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to short, value : [{\"$ref\":\"@\"}]
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(0);
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentAddAll(0, (Collection<?>) jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray2.getBigDecimal(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentAdd(0, object0);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      JSONObject jSONObject0 = jSONArray1.getJSONObject(0);
      assertEquals(989, JSON.DEFAULT_PARSER_FEATURE);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Class<JSONObject> class0 = JSONObject.class;
      List<JSONObject> list0 = jSONArray0.toJavaList(class0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.clear();
      short short0 = ObjectStreamConstants.STREAM_MAGIC;
      assertEquals((short) (-21267), short0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      JSONArray jSONArray2 = jSONArray0.fluentAddAll((Collection<?>) jSONArray1);
      jSONArray2.isEmpty();
      // Undeclared exception!
      try { 
        jSONArray2.getByteValue(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      boolean boolean0 = jSONArray0.equals(mockThaiBuddhistDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      boolean boolean0 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean1 = jSONArray0.remove((Object) byteArray0);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentSet(3053, (Object) null);
      jSONArray1.fluentAddAll((Collection<?>) jSONArray0);
      assertEquals(6108, jSONArray1.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(466);
      Class<MockThaiBuddhistDate> class0 = MockThaiBuddhistDate.class;
      String[] stringArray0 = new String[8];
      stringArray0[0] = "1.2.46";
      stringArray0[1] = "@type";
      stringArray0[2] = "1.2.46";
      stringArray0[3] = "yyyy-MM-dd HH:mm:ss";
      stringArray0[4] = "1.2.46";
      stringArray0[5] = "@type";
      stringArray0[6] = "1.2.46";
      jSONArray0.fluentSet(466, "@type");
      stringArray0[7] = "";
      JavaBeanSerializer javaBeanSerializer0 = new JavaBeanSerializer(class0, stringArray0);
      Class<?> class1 = javaBeanSerializer0.getType();
      // Undeclared exception!
      try { 
        jSONArray0.getObject(466, (Type) class1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to : org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.listIterator(3078);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3078
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      jSONArray0.lastIndexOf(propertyNamingStrategy0);
      // Undeclared exception!
      try { 
        jSONArray0.getBigDecimal(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getInteger((-495));
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
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      jSONArray1.getJSONObject(0);
      // Undeclared exception!
      try { 
        jSONArray1.getFloatValue(2248);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2248, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentSet(0, jSONArray0);
      int int0 = 120;
      // Undeclared exception!
      try { 
        jSONArray0.getBooleanValue(120);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 120, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      // Undeclared exception!
      try { 
        jSONArray1.getJSONObject(423);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 423, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.getBigInteger("@type");
      jSONObject0.getJSONArray("V}NOqwh@");
      // Undeclared exception!
      try { 
        jSONArray0.getShort(1051);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1051, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSON.DEFAULT_GENERATE_FEATURE = 0;
      // Undeclared exception!
      try { 
        jSONArray0.getTimestamp(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.remove(3068);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3068, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      // Undeclared exception!
      try { 
        jSONArray1.getIntValue(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to int, value : java.lang.Object@63a77a21
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      // Undeclared exception!
      try { 
        jSONArray1.getByteValue(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to byte, value : java.lang.Object@5fee7b47
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      // Undeclared exception!
      try { 
        jSONArray1.getBoolean(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : java.lang.Object@231a9295
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      jSONArray0.fluentSet(0, object0);
      jSONArray0.getComponentType();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.contains((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.getRelatedArray();
      int int0 = jSONArray0.indexOf("vsVj");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentClear();
      Class<MockThaiBuddhistDate> class0 = MockThaiBuddhistDate.class;
      jSONArray0.lastIndexOf(jSONArray1);
      // Undeclared exception!
      try { 
        jSONArray1.getObject(3076, class0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3076, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      jSONArray1.getJSONObject(0);
      Class<JSONPath.Operator> class0 = JSONPath.Operator.class;
      // Undeclared exception!
      try { 
        jSONArray1.toJavaList(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to : com.alibaba.fastjson.JSONPath$Operator
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Type type0 = jSONArray0.componentType;
      jSONArray0.setComponentType((Type) null);
      assertEquals(0, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      int int0 = 435;
      LinkedHashSet<JSONPath.Operator> linkedHashSet0 = new LinkedHashSet<JSONPath.Operator>();
      Object object0 = new Object();
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[2];
      SerializerFeature serializerFeature0 = SerializerFeature.DisableCheckSpecialChar;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.IgnoreErrorGetter;
      serializerFeatureArray0[1] = serializerFeature1;
      JSON.toJSONBytes(object0, serializerFeatureArray0);
      // Undeclared exception!
      try { 
        jSONArray0.getString(435);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 435, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getSqlDate(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(1);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      JSONArray jSONArray2 = jSONArray1.fluentSet(0, mockJapaneseDate0);
      jSONArray1.fluentSet(631, jSONArray2);
      // Undeclared exception!
      try { 
        jSONArray1.getFloatValue(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to float, value : org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate@6df2fcd4
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getDate(3068);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3068, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      // Undeclared exception!
      try { 
        jSONArray1.getBoolean(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : java.lang.Object@3451410e
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      JSON.DEFAULT_TYPE_KEY = "@type";
      double double0 = new Integer(0);
      jSONArray1.getJSONObject(0);
      Method[] methodArray0 = new Method[0];
      // Undeclared exception!
      try { 
        jSONArray1.toArray(methodArray0);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      Object object1 = new Object();
      int int0 = 423;
      // Undeclared exception!
      try { 
        jSONArray1.getIntValue(219);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 219, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      // Undeclared exception!
      try { 
        jSONArray1.getBooleanValue(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : java.lang.Object@27cfe3a7
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.hashCode();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      // Undeclared exception!
      try { 
        jSONArray1.getJSONArray(105);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 105, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      Object object1 = new Object();
      jSONArray1.containsAll(jSONArray0);
      assertEquals(1, jSONArray0.size());
      
      jSONArray0.fluentRemoveAll(jSONArray1);
      assertTrue(jSONArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      jSONArray0.fluentSet(0, object0);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      // Undeclared exception!
      try { 
        jSONArray0.getLongValue(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : java.lang.Object@589ba1de
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getByte(2178);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2178, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.getDouble(1621);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1621, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.listIterator();
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
  public void test49()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      // Undeclared exception!
      try { 
        jSONArray1.getJSONObject(423);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 423, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      JSONArray jSONArray2 = jSONArray0.fluentAdd((Object) mockJapaneseDate0);
      jSONArray2.fluentAddAll(0, (Collection<?>) jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray1.getLongValue(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : java.lang.Object@42ca973b
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      jSONArray0.fluentSet(0, object0);
      // Undeclared exception!
      try { 
        jSONArray0.getDoubleValue(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to double, value : java.lang.Object@6374dbf2
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      // Undeclared exception!
      try { 
        jSONArray1.getJSONObject(423);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 423, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.add(1048, (Object) "1.2.46");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1048, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.stream();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      JSONArray jSONArray2 = jSONArray0.fluentSet(0, jSONArray1);
      // Undeclared exception!
      try { 
        jSONArray2.getDoubleValue(3077);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3077, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray((List<Object>) null);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      jSONArray0.setRelatedArray(mockJapaneseDate0);
      // Undeclared exception!
      try { 
        jSONArray0.getBigInteger(6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONObject jSONObject0 = new JSONObject(0, true);
      JSONArray jSONArray1 = jSONArray0.fluentSet(3056, jSONObject0);
      jSONArray0.getJSONArray(0);
      jSONArray1.getJSONObject(3056);
      assertEquals(3057, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, object0);
      JSONArray jSONArray2 = jSONArray1.fluentSet(0, jSONArray0);
      jSONArray2.getJSONArray(0);
      // Undeclared exception!
      try { 
        PropertyNamingStrategy.valueOf("y|y&G2dT'>eRYC|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.alibaba.fastjson.PropertyNamingStrategy.y|y&G2dT'>eRYC|
         //
         verifyException("java.lang.Enum", e);
      }
  }
}