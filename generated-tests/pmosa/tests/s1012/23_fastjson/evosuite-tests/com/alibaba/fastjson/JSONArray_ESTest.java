/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 23:33:35 GMT 2018
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
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.UTF8Decoder;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.ObjectStreamConstants;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.sql.Date;
import java.time.Clock;
import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.evosuite.runtime.mock.java.util.MockDate;
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
        jSONArray0.fluentRemove((-6128));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -6128
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      int int0 = (-1);
      String string0 = "";
      // Undeclared exception!
      try { 
        jSONArray0.fluentAdd((-1), (Object) "");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedHashSet<JSONArray> linkedHashSet0 = new LinkedHashSet<JSONArray>();
      JSONArray jSONArray1 = jSONArray0.fluentAddAll(0, (Collection<?>) linkedHashSet0);
      JSONArray jSONArray2 = jSONArray1.fluentAdd((Object) jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray2.fluentAdd(89, (Object) jSONArray1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 89, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedHashSet<Method> linkedHashSet0 = new LinkedHashSet<Method>();
      JSONArray jSONArray1 = jSONArray0.fluentAddAll((Collection<?>) linkedHashSet0);
      JSONArray jSONArray2 = jSONArray1.fluentClear();
      JSONArray jSONArray3 = jSONArray2.fluentRetainAll(linkedHashSet0);
      JSONArray jSONArray4 = jSONArray3.fluentAdd((Object) jSONArray2);
      LinkedList<Method> linkedList0 = new LinkedList<Method>();
      JSONArray jSONArray5 = jSONArray4.fluentRemoveAll(linkedList0);
      // Undeclared exception!
      try { 
        jSONArray5.getInteger((-1231));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.isEmpty();
      // Undeclared exception!
      try { 
        jSONArray0.getDate(27);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 27, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray((List<Object>) null);
      // Undeclared exception!
      try { 
        jSONArray0.fluentSet(0, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      jSONArray0.fluentSet(1, mockMinguoDate0);
      // Undeclared exception!
      try { 
        jSONArray0.getShortValue(1380);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1380, Size: 2
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      String string0 = "()[C";
      Class<Method> class0 = Method.class;
      // Undeclared exception!
      try { 
        jSONArray0.getByte(81);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 81, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List<Object> list0 = null;
      JSONArray jSONArray0 = new JSONArray();
      int int0 = 304;
      Class<JSONArray> class0 = JSONArray.class;
      // Undeclared exception!
      try { 
        jSONArray0.getObject(61, class0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 61, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      JSONArray jSONArray0 = new JSONArray(linkedList0);
      SerializeConfig serializeConfig0 = new SerializeConfig(989, true);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      linkedList0.forEach(consumer0);
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      int int0 = 0;
      FieldInfo[] fieldInfoArray0 = new FieldInfo[6];
      Class<MockThaiBuddhistDate> class0 = MockThaiBuddhistDate.class;
      String string0 = null;
      Class<MockJapaneseDate> class1 = MockJapaneseDate.class;
      HashMap<String, Field> hashMap0 = new HashMap<String, Field>();
      ParserConfig.getFieldFromCache("com.alebaba.fastjson.JSONArray", hashMap0);
      // Undeclared exception!
      try { 
        jSONArray0.getBigInteger((-2012));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -2012, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.isEmpty();
      MockDate mockDate0 = new MockDate(989, 989, 989, 989, 989);
      jSONArray0.size();
      JSONArray jSONArray1 = jSONArray0.fluentSet(0, (Object) null);
      // Undeclared exception!
      try { 
        jSONArray1.getString(989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 989, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(80);
      Clock clock0 = MockClock.tickMinutes(zoneOffset0);
      MockMinguoDate.now(clock0);
      jSONArray0.lastIndexOf(mockMinguoDate0);
      boolean boolean0 = jSONArray0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.isEmpty();
      MockDate mockDate0 = new MockDate(989, 989, 989, 989, 989);
      jSONArray0.size();
      // Undeclared exception!
      try { 
        jSONArray0.fluentSet((-25), (Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockDate mockDate0 = new MockDate(751, 0, 751, 3063, 12);
      jSONArray0.size();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1424, mockDate0);
      jSONArray0.getString(0);
      Object object0 = new Object();
      JSONArray jSONArray2 = jSONArray0.fluentRemove(object0);
      jSONArray2.retainAll(jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray1.getDouble(6122);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 6122, Size: 1425
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.isEmpty();
      MockDate mockDate0 = new MockDate(989, 989, 1006);
      boolean boolean1 = jSONArray0.contains(mockDate0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.isEmpty();
      MockDate mockDate0 = new MockDate(989, 989, 989, 989, 989);
      jSONArray0.size();
      // Undeclared exception!
      try { 
        jSONArray0.remove(0);
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
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      JSONArray jSONArray1 = jSONArray0.fluentRemove((Object) mockHijrahDate0);
      jSONArray1.fluentRemoveAll(jSONArray0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("yyyy-MM-dd HH:mm:ss");
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0, 989);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(bufferedOutputStream0);
      SerializerFeature[] serializerFeatureArray0 = new SerializerFeature[5];
      SerializerFeature serializerFeature0 = SerializerFeature.SkipTransientField;
      serializerFeatureArray0[0] = serializerFeature0;
      SerializerFeature serializerFeature1 = SerializerFeature.UseSingleQuotes;
      serializerFeatureArray0[1] = serializerFeature1;
      SerializerFeature serializerFeature2 = SerializerFeature.UseSingleQuotes;
      serializerFeatureArray0[2] = serializerFeature2;
      SerializerFeature serializerFeature3 = SerializerFeature.SortField;
      serializerFeatureArray0[3] = serializerFeature3;
      SerializerFeature serializerFeature4 = SerializerFeature.MapSortField;
      serializerFeatureArray0[4] = serializerFeature4;
      JSON.writeJSONString((OutputStream) filterOutputStream0, (Object) jSONArray0, serializerFeatureArray0);
      jSONArray1.hashCode();
      jSONArray1.iterator();
      jSONArray1.fluentRemoveAll(jSONArray0);
      // Undeclared exception!
      try { 
        ZoneOffset.ofHours(989);
        fail("Expecting exception: DateTimeException");
      
      } catch(DateTimeException e) {
         //
         // Zone offset hours not in valid range: value 989 is not in the range -18 to 18
         //
         verifyException("java.time.ZoneOffset", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<MockJapaneseDate> linkedList0 = new LinkedList<MockJapaneseDate>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1391, linkedList0);
      boolean boolean0 = jSONArray1.getBooleanValue(1381);
      assertEquals(1392, jSONArray0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.iterator();
      jSONArray0.defaultLocale.getISO3Country();
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
  public void test19()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(215);
      JSONArray jSONArray1 = new JSONArray(jSONArray0);
      JSONArray jSONArray2 = jSONArray1.fluentRemoveAll(jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray2.getString(4327);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4327, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.isEmpty();
      Integer integer0 = new Integer(24);
      jSONArray0.remove((Object) integer0);
      // Undeclared exception!
      try { 
        jSONArray0.getLong(126);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 126, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JSONArray jSONArray0 = new JSONArray();
      boolean boolean0 = jSONArray0.isEmpty();
      MockDate mockDate0 = new MockDate((-2866), 989, 1006);
      boolean boolean1 = jSONArray0.contains(mockDate0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.isEmpty();
      // Undeclared exception!
      try { 
        jSONArray0.listIterator((-1230));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1230
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      JSONArray jSONArray0 = new JSONArray(linkedList0);
      JSONArray jSONArray1 = jSONArray0.fluentAdd((Object) linkedList0);
      linkedList0.remove((Object) jSONArray1);
      // Undeclared exception!
      try { 
        jSONArray1.getJSONObject(989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 989, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray(1);
      Class<MockHijrahDate> class0 = MockHijrahDate.class;
      List<MockHijrahDate> list0 = jSONArray0.toJavaList(class0);
      JSONArray jSONArray1 = jSONArray0.fluentRemoveAll(list0);
      // Undeclared exception!
      try { 
        jSONArray1.getJSONArray(989);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 989, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSON.DEFAULT_TYPE_KEY = "1.2.46";
      Class<MockMinguoDate> class0 = MockMinguoDate.class;
      List<MockMinguoDate> list0 = jSONArray0.toJavaList(class0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = jSONArray0.getRelatedArray();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      jSONArray0.setRelatedArray(mockMinguoDate0);
      assertEquals(0, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.clear();
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockDate mockDate0 = new MockDate(989, 989, 989);
      int int0 = Calendar.ERA;
      JSONArray jSONArray1 = jSONArray0.fluentSet(989, jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray1.getIntValue((-2759));
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
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "(II)Z");
      // Undeclared exception!
      try { 
        jSONArray0.getFloat(44);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 44, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentAdd(object0);
      jSONArray1.removeAll(jSONArray0);
      jSONArray1.addAll((Collection<?>) jSONArray0);
      JSONObject jSONObject0 = new JSONObject(true);
      jSONArray1.equals(jSONObject0);
      assertTrue(jSONArray1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      int int0 = (-1762);
      // Undeclared exception!
      try { 
        jSONArray0.getBigDecimal((-1762));
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
      LinkedHashSet<Field> linkedHashSet0 = new LinkedHashSet<Field>();
      boolean boolean0 = jSONArray0.containsAll(linkedHashSet0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockThaiBuddhistDate mockThaiBuddhistDate0 = new MockThaiBuddhistDate();
      // Undeclared exception!
      try { 
        jSONArray0.add(1967, (Object) mockThaiBuddhistDate0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1967, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      long long0 = new Integer(989);
      ListIterator<Object> listIterator0 = jSONArray0.listIterator();
      assertFalse(listIterator0.hasNext());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-104);
      byteArray0[1] = (byte)79;
      byteArray0[2] = (byte) (-96);
      byteArray0[3] = (byte) (-60);
      byteArray0[4] = (byte) (-27);
      byteArray0[5] = (byte) (-63);
      byteArray0[6] = (byte)93;
      byteArray0[7] = (byte) (-59);
      byteArray0[8] = (byte) (-89);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      JSONArray jSONArray0 = new JSONArray();
      int int0 = 0;
      // Undeclared exception!
      try { 
        jSONArray0.getTimestamp(1361);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1361, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<Method> linkedList0 = new LinkedList<Method>();
      jSONArray0.fluentRetainAll(linkedList0);
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      boolean boolean0 = jSONArray0.add((Object) mockJapaneseDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = jSONArray0.clone();
      assertNotSame(object0, jSONArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      jSONArray0.indexOf(object0);
      // Undeclared exception!
      try { 
        jSONArray0.getSqlDate(12);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 12, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.getComponentType();
      jSONArray0.setComponentType((Type) null);
      assertTrue(jSONArray0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JSONArray jSONArray0 = new JSONArray();
      // Undeclared exception!
      try { 
        jSONArray0.subList(1413, 1413);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // toIndex = 1413
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedHashSet<PropertyNamingStrategy> linkedHashSet0 = new LinkedHashSet<PropertyNamingStrategy>();
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      linkedHashSet0.add(propertyNamingStrategy0);
      PropertyNamingStrategy propertyNamingStrategy1 = PropertyNamingStrategy.PascalCase;
      linkedHashSet0.add(propertyNamingStrategy1);
      boolean boolean0 = jSONArray0.containsAll(linkedHashSet0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockDate mockDate0 = new MockDate(751, 0, 751, 3063, 12);
      jSONArray0.size();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1424, mockDate0);
      jSONArray1.addAll(496, (Collection<?>) jSONArray0);
      boolean boolean0 = jSONArray0.isEmpty();
      assertEquals(2850, jSONArray0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockDate mockDate0 = new MockDate(751, 0, 751, 3063, 12);
      jSONArray0.size();
      jSONArray0.fluentSet(1424, mockDate0);
      jSONArray0.getString(0);
      Object object0 = new Object();
      JSONArray jSONArray1 = jSONArray0.fluentRemove(object0);
      jSONArray1.getBoolean(989);
      assertEquals(1425, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<MockJapaneseDate> linkedList0 = new LinkedList<MockJapaneseDate>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1359, (Object) null);
      jSONArray1.getLongValue(989);
      jSONArray1.fluentRetainAll(jSONArray0);
      byte byte0 = ObjectStreamConstants.SC_ENUM;
      SerializeWriter serializeWriter0 = new SerializeWriter();
      jSONArray1.writeJSONString((Appendable) serializeWriter0);
      jSONArray1.getJSONObject(56);
      assertEquals(1360, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockDate mockDate0 = new MockDate(751, 0, 751, 3063, 12);
      jSONArray0.size();
      jSONArray0.fluentSet(1424, mockDate0);
      jSONArray0.getString(0);
      Object object0 = new Object();
      jSONArray0.fluentRemove(object0);
      jSONArray0.getBooleanValue(2);
      jSONArray0.getJSONObject(989);
      assertEquals(1425, jSONArray0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockDate mockDate0 = new MockDate(751, 0, 751, 3063, 12);
      jSONArray0.fluentSet(3063, mockDate0);
      float float0 = jSONArray0.getFloatValue(751);
      assertEquals(3064, jSONArray0.size());
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<MockJapaneseDate> linkedList0 = new LinkedList<MockJapaneseDate>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1391, linkedList0);
      jSONArray0.size();
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      jSONArray1.fluentSet(0, mockHijrahDate0);
      LinkedList<String> linkedList1 = new LinkedList<String>();
      JSONArray jSONArray2 = jSONArray1.fluentAddAll(122, (Collection<?>) linkedList1);
      jSONArray2.getString(989);
      // Undeclared exception!
      try { 
        jSONArray2.getBoolean(1391);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : []
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<MockJapaneseDate> linkedList0 = new LinkedList<MockJapaneseDate>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(1391, linkedList0);
      JSONArray jSONArray2 = jSONArray0.fluentRetainAll(jSONArray1);
      jSONArray2.getString(1391);
      Object object0 = new Object();
      JSONArray jSONArray3 = new JSONArray();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "1.2.46";
      stringArray0[1] = "1.2.46";
      stringArray0[2] = "";
      stringArray0[3] = "1.2.46";
      SimplePropertyPreFilter simplePropertyPreFilter0 = new SimplePropertyPreFilter(stringArray0);
      simplePropertyPreFilter0.getClazz();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<MockJapaneseDate> linkedList0 = new LinkedList<MockJapaneseDate>();
      jSONArray0.fluentSet(1378, linkedList0);
      short short0 = jSONArray0.getShortValue(989);
      assertEquals(1379, jSONArray0.size());
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = new JSONArray(1411);
      JSONArray jSONArray2 = jSONArray1.fluentSet(989, jSONArray0);
      // Undeclared exception!
      try { 
        jSONArray2.getFloatValue(989);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to float, value : []
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.fluentSet(989, "yyyy-MM-dd HH:mm:ss");
      // Undeclared exception!
      try { 
        jSONArray1.getDoubleValue(989);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<MockJapaneseDate> linkedList0 = new LinkedList<MockJapaneseDate>();
      jSONArray0.fluentSet(1378, linkedList0);
      int int0 = jSONArray0.getIntValue(989);
      assertEquals(1379, jSONArray0.size());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.toJSONString();
      JSONArray jSONArray1 = new JSONArray(989);
      MockMinguoDate[] mockMinguoDateArray0 = new MockMinguoDate[1];
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      mockMinguoDateArray0[0] = mockMinguoDate0;
      jSONArray1.toArray(mockMinguoDateArray0);
      JSONArray jSONArray2 = jSONArray0.fluentAddAll((Collection<?>) jSONArray1);
      assertNotSame(jSONArray2, jSONArray1);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      Object object0 = new Object();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      jSONArray0.fluentSet(989, mockJapaneseDate0);
      int int0 = 1317;
      // Undeclared exception!
      try { 
        jSONArray0.getLongValue(989);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to long, value : org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate@1b0b5611
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<MockJapaneseDate> linkedList0 = new LinkedList<MockJapaneseDate>();
      JSON.DEFAULT_TYPE_KEY = "1.2.46";
      jSONArray0.fluentSet(1378, linkedList0);
      // Undeclared exception!
      try { 
        jSONArray0.getIntValue(1378);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to int, value : []
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentSet(989, "yyyy-MM-dd HH:mm:ss");
      // Undeclared exception!
      try { 
        jSONArray0.getJSONArray(989);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.alibaba.fastjson.JSONArray
         //
         verifyException("com.alibaba.fastjson.JSONArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      jSONArray0.fluentSet(989, "yyyy-MM-dd HH:mm:ss");
      // Undeclared exception!
      try { 
        jSONArray0.getShortValue(989);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"yyyy-MM-dd HH:mm:ss\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      LinkedList<MockJapaneseDate> linkedList0 = new LinkedList<MockJapaneseDate>();
      JSONArray jSONArray1 = jSONArray0.fluentSet(989, linkedList0);
      // Undeclared exception!
      try { 
        jSONArray1.getBooleanValue(989);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to boolean, value : []
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      MockJapaneseDate mockJapaneseDate0 = new MockJapaneseDate();
      jSONArray0.fluentSet(1, mockJapaneseDate0);
      // Undeclared exception!
      try { 
        jSONArray0.getByteValue(1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // can not cast to byte, value : org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate@29668601
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }
}