/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 19:50:07 GMT 2019
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedTreeMap;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedTreeMap_ESTest extends LinkedTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      Object object0 = linkedTreeMap_Node0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<String, LinkedTreeMap<String, Object>>(comparator0);
      LinkedTreeMap<Integer, String> linkedTreeMap1 = new LinkedTreeMap<Integer, String>();
      Integer integer0 = new Integer((-2474));
      linkedTreeMap1.put(integer0, (String) null);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap1.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap0);
      assertEquals(1, linkedTreeMap1.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap<String, LinkedTreeMap<String, Object>> linkedTreeMap0 = new LinkedTreeMap<String, LinkedTreeMap<String, Object>>();
      linkedTreeMap0.size = 1144;
      int int0 = linkedTreeMap0.size();
      assertEquals(1144, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap0.size = (-2859);
      int int0 = linkedTreeMap0.size();
      assertEquals((-2859), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent("o)e~KWz", "HH-");
      linkedTreeMap0.put("o)e~KWz", ",tPH2enrj2!,D");
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      linkedTreeMap0.put("", "");
      linkedTreeMap0.keySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, String>>();
      LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Object, String>>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      linkedTreeMap0.keySet();
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent("`W.1kux", "`W.1kux");
      linkedTreeMap0.get("`W.1kux");
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<LinkedTreeMap<Object, Object>, Object> linkedTreeMap1 = new LinkedTreeMap<LinkedTreeMap<Object, Object>, Object>(comparator0);
      linkedTreeMap1.put(linkedTreeMap0, "");
      linkedTreeMap1.findByObject(linkedTreeMap0);
      assertEquals(1, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = linkedTreeMap0.find("~KW4z^%", true);
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.put("", "=kGwGOF}_`6)Du0|Fm");
      linkedTreeMap0.entrySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      linkedTreeMap0.entrySet();
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey((Object) null);
      assertEquals(0, linkedTreeMap0.size());
      assertNull(linkedTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>(comparator0);
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node1 = linkedTreeMap0.removeInternalByKey(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
      assertNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>(comparator0);
      linkedTreeMap0.remove((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap0.remove((Object) linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<LinkedTreeMap<String, Object>, AbstractMap.SimpleImmutableEntry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<String, Object>, AbstractMap.SimpleImmutableEntry<Integer, Integer>>(comparator0);
      linkedTreeMap0.get((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, String>();
      linkedTreeMap0.get(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<String, Integer>>(comparator0);
      Object object0 = new Object();
      linkedTreeMap0.findByObject(object0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.find("_g<%e]0-5yd;.'9fBE", false);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleEntry<Object, String>>(comparator0);
      boolean boolean0 = linkedTreeMap0.containsKey((Object) null);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal((LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, String>, AbstractMap.SimpleEntry<Object, Object>>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, AbstractMap.SimpleEntry<String, Integer>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, AbstractMap.SimpleEntry<String, Integer>>();
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>("", (Object) null);
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Integer>(linkedTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(abstractMap_SimpleImmutableEntry0, abstractMap_SimpleEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleImmutableEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.findByEntry((Map.Entry<?, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      Object object0 = linkedTreeMap_Node1.getKey();
      assertNotNull(object0);
      
      boolean boolean0 = linkedTreeMap0.containsKey(object0);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(anyInt() , anyInt());
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>(comparator0);
      Integer integer0 = new Integer(0);
      linkedTreeMap0.put(integer0, "com.google.gson.internal.LinkedTreeMap$KeySet$1");
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove("com.google.gson.internal.LinkedTreeMap$KeySet$1");
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, String>(linkedTreeMap_Node0, "7H6-B]zZ_w %S", linkedTreeMap_Node0, linkedTreeMap_Node0);
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node1);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap1 = new LinkedTreeMap<Integer, String>(comparator1);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap1);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains("HH-");
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, String>>();
      linkedTreeMap_Node0.right = linkedTreeMap_Node0;
      // Undeclared exception!
      linkedTreeMap_Node0.last();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<String, Object>>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap_Node1 = linkedTreeMap_Node0.last();
      assertNotNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap.Node<String, LinkedTreeMap<String, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, LinkedTreeMap<String, String>>();
      LinkedTreeMap.Node<String, LinkedTreeMap<String, String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, LinkedTreeMap<String, String>>(linkedTreeMap_Node0, (String) null, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.left = linkedTreeMap_Node0;
      LinkedTreeMap.Node<String, LinkedTreeMap<String, String>> linkedTreeMap_Node2 = linkedTreeMap_Node1.first();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<String, Object>>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, String>();
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>(linkedTreeMap_Node1);
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry1 = linkedTreeMap_Node0.setValue(abstractMap_SimpleImmutableEntry0);
      assertNull(abstractMap_SimpleImmutableEntry1);
      
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, Integer>();
      Integer integer0 = new Integer(0);
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Integer>("", integer0);
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Integer>, Integer>(linkedTreeMap_Node0, abstractMap_SimpleImmutableEntry0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node1.equals(abstractMap_SimpleImmutableEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedTreeMap.Node<String, LinkedTreeMap<String, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, LinkedTreeMap<String, String>>();
      LinkedTreeMap.Node<String, LinkedTreeMap<String, String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, LinkedTreeMap<String, String>>(linkedTreeMap_Node0, "*#7GSdb8AW", linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      AbstractMap.SimpleEntry<Integer, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, String>(integer0, "Q742(Xs6srL/3{W");
      AbstractMap.SimpleEntry<Integer, String> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Integer, String>(abstractMap_SimpleEntry0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<String, Object>>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<String, Object>>(linkedTreeMap_Node0, abstractMap_SimpleEntry1, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap_Node2 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<String, Object>>(linkedTreeMap_Node1, abstractMap_SimpleEntry1, linkedTreeMap_Node1, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      boolean boolean0 = linkedTreeMap_Node0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.keySet();
      Set<String> set0 = linkedTreeMap0.keySet();
      assertTrue(set0.isEmpty());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BiFunction<Object, String, String> biFunction0 = (BiFunction<Object, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.entrySet();
      linkedTreeMap0.replaceAll(biFunction0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent("`W.u1kux", "");
      linkedTreeMap0.find("o)e~KWz", true);
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = linkedTreeMap0.find("", true);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertEquals(2, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent("com.google.gson.internal.LinkedTreeMap$EntrySet", "");
      linkedTreeMap0.find("", true);
      linkedTreeMap0.remove((Object) "");
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent("o)e~KWz", "HH-");
      linkedTreeMap0.find("HH-", true);
      linkedTreeMap0.find("", true);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent("4<8'Vo>xA3rv", "8cq583YTc}0}d");
      linkedTreeMap0.find("HH-", true);
      linkedTreeMap0.find("]Sd\"", true);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap1 = new LinkedTreeMap<Integer, String>(comparator0);
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, String>(linkedTreeMap_Node0, linkedTreeMap1, linkedTreeMap_Node0, linkedTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal(linkedTreeMap_Node1, true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent("o)e~KWz", "HH-");
      linkedTreeMap0.putIfAbsent("4<8'Vo>xA3rv", "o)e~KWz");
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = linkedTreeMap0.find("HH-", true);
      assertNotNull(linkedTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, String>();
      linkedTreeMap_Node1.right = linkedTreeMap_Node0;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node1, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<Integer, Map.Entry<AbstractMap.SimpleEntry<String, Object>, Integer>>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<Integer, Map.Entry<AbstractMap.SimpleEntry<String, Object>, Integer>>>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Integer, Map.Entry<AbstractMap.SimpleEntry<String, Object>, Integer>>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Integer, Map.Entry<AbstractMap.SimpleEntry<String, Object>, Integer>>>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Integer, Map.Entry<AbstractMap.SimpleEntry<String, Object>, Integer>>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Integer, Map.Entry<AbstractMap.SimpleEntry<String, Object>, Integer>>>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node0);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Object, String>(",$4 ]&F#)]<W=|\"A_", ",$4 ]&F#)]<W=|\"A_");
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, String>>(comparator0);
      linkedTreeMap0.put(abstractMap_SimpleEntry0, abstractMap_SimpleEntry1);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(abstractMap_SimpleEntry1);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap<Object, Map.Entry<AbstractMap.SimpleEntry<String, Object>, Integer>> linkedTreeMap1 = new LinkedTreeMap<Object, Map.Entry<AbstractMap.SimpleEntry<String, Object>, Integer>>();
      // Undeclared exception!
      try { 
        linkedTreeMap1.find(linkedTreeMap0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Integer> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Integer>(comparator0);
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>(linkedTreeMap_Node0);
      linkedTreeMap0.find(abstractMap_SimpleImmutableEntry0, true);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent("`W.u1kux", "");
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = linkedTreeMap0.find("o)e~KWz", true);
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = linkedTreeMap0.find("key == null", true);
      assertFalse(linkedTreeMap_Node1.equals((Object)linkedTreeMap_Node0));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent("", "HH-");
      linkedTreeMap0.remove((Object) "");
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((Integer) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator1).compare(any() , any());
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>(comparator1);
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      linkedTreeMap1.root = linkedTreeMap_Node0;
      boolean boolean0 = linkedTreeMap1.containsKey(linkedTreeMap0);
      assertEquals(0, linkedTreeMap1.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      BiFunction<Object, String, String> biFunction0 = (BiFunction<Object, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("").when(biFunction0).apply(any() , anyString());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.put("", "=kGwGOF}_`6)Du0|Fm");
      linkedTreeMap0.replaceAll(biFunction0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>(linkedTreeMap_Node0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<String, Object>>();
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry1 = linkedTreeMap_Node1.setValue(abstractMap_SimpleImmutableEntry0);
      assertNull(abstractMap_SimpleImmutableEntry1);
      
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      String string0 = linkedTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains((Object) null);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>((Comparator<? super Object>) null);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.putIfAbsent("o)e~KWz", "HH-");
      // Undeclared exception!
      try { 
        linkedTreeMap0.find((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}