/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 19:53:54 GMT 2019
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
      LinkedTreeMap.Node<String, Map.Entry<Object, Comparable<Integer>>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Map.Entry<Object, Comparable<Integer>>>();
      Object object0 = linkedTreeMap_Node0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<Object, String>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Object, String>, String>();
      LinkedTreeMap<Object, String> linkedTreeMap0 = linkedTreeMap_Node0.getKey();
      assertNull(linkedTreeMap0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>((Comparator<? super String>) null);
      Integer integer0 = Integer.valueOf((-169));
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute("com.google.gson.internal.LinkedTreeMap$KeySet", biFunction0);
      LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedTreeMap1 = new LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      Set<Integer> set0 = linkedTreeMap1.keySet();
      boolean boolean0 = linkedTreeMap0.containsKey(set0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, AbstractMap.SimpleImmutableEntry<Object, Integer>>(comparator0);
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, Integer>>((Comparator<? super String>) null);
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Integer>(linkedTreeMap_Node0);
      linkedTreeMap0.put("=In", abstractMap_SimpleEntry0);
      int int0 = linkedTreeMap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      Integer integer0 = new Integer((-1344));
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node0);
      linkedTreeMap0.putIfAbsent(integer0, abstractMap_SimpleEntry0);
      linkedTreeMap0.put(integer0, abstractMap_SimpleEntry0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>(comparator0);
      Integer integer0 = new Integer((-1043));
      linkedTreeMap0.find(integer0, true);
      linkedTreeMap0.keySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Object, String>>(comparator0);
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      linkedTreeMap0.keySet();
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<String>, String> linkedTreeMap0 = new LinkedTreeMap<Comparable<String>, String>(comparator0);
      LinkedTreeMap.Node<Comparable<String>, String> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey((Object) null);
      assertEquals(0, linkedTreeMap0.size());
      assertNull(linkedTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object>();
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, String>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, String>, String>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Integer, String>, String> linkedTreeMap_Node1 = linkedTreeMap0.removeInternalByKey(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
      assertNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedTreeMap<Integer, Comparable<String>> linkedTreeMap0 = new LinkedTreeMap<Integer, Comparable<String>>();
      linkedTreeMap0.remove((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<Object, Object>>();
      linkedTreeMap0.get((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer>();
      linkedTreeMap0.get(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      linkedTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, "", linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Integer>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Integer>, Object>();
      linkedTreeMap0.findByObject(linkedTreeMap_Node1);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, LinkedTreeMap<String, String>> linkedTreeMap0 = new LinkedTreeMap<Object, LinkedTreeMap<String, String>>(comparator0);
      linkedTreeMap0.find((Object) null, false);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, String>, Integer> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, String>, Integer>(comparator0);
      Integer integer0 = new Integer(1780);
      AbstractMap.SimpleImmutableEntry<Integer, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, String>(integer0, "{Q#JrjtqiNq^>!ZTL");
      linkedTreeMap0.find(abstractMap_SimpleImmutableEntry0, false);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      boolean boolean0 = linkedTreeMap0.containsKey((Object) null);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      boolean boolean0 = linkedTreeMap0.containsKey(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal((LinkedTreeMap.Node<Object, Integer>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap<Map.Entry<Object, Comparable<Integer>>, String> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<Object, Comparable<Integer>>, String>();
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
  public void test22()  throws Throwable  {
      LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedTreeMap<Comparable<Object>, LinkedTreeMap<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, LinkedTreeMap<Object, Integer>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove((Object) null);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.Node<Object, Comparable<Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Comparable<Integer>>();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleEntry<String, Object>>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      linkedTreeMap_Node0.right = linkedTreeMap_Node0;
      // Undeclared exception!
      linkedTreeMap_Node0.last();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap.Node<Integer, LinkedTreeMap<Integer, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, LinkedTreeMap<Integer, String>>();
      LinkedTreeMap.Node<Integer, LinkedTreeMap<Integer, String>> linkedTreeMap_Node1 = linkedTreeMap_Node0.last();
      assertNotNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<String, Integer>, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<String, Integer>, AbstractMap.SimpleImmutableEntry<Integer, String>>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node0;
      // Undeclared exception!
      linkedTreeMap_Node0.first();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedTreeMap.Node<Object, Comparable<String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Comparable<String>>();
      LinkedTreeMap.Node<Object, Comparable<String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Comparable<String>>();
      linkedTreeMap_Node0.value = (Comparable<String>) "{}";
      linkedTreeMap_Node1.value = (Comparable<String>) "{}";
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedTreeMap.Node<Object, Comparable<String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Comparable<String>>();
      linkedTreeMap_Node0.value = (Comparable<String>) "{}";
      LinkedTreeMap.Node<Object, Comparable<String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Comparable<String>>();
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap.Node<Object, Comparable<String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Comparable<String>>();
      LinkedTreeMap.Node<Object, Comparable<String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Comparable<String>>();
      linkedTreeMap_Node1.value = (Comparable<String>) "{}";
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap.Node<Object, Comparable<String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Comparable<String>>();
      LinkedTreeMap.Node<Object, Comparable<String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Comparable<String>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      LinkedTreeMap.Node<Object, Comparable<String>> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Object, Comparable<String>>(linkedTreeMap_Node1, linkedTreeMap0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node2);
      assertEquals(0, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      Integer integer0 = new Integer((-2245));
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedTreeMap.Node<Object, Comparable<String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Comparable<String>>();
      LinkedTreeMap.Node<Object, Comparable<String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Comparable<String>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      LinkedTreeMap.Node<Object, Comparable<String>> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Object, Comparable<String>>(linkedTreeMap_Node1, linkedTreeMap0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node1);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedTreeMap.Node<Integer, LinkedTreeMap<Integer, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, LinkedTreeMap<Integer, String>>();
      boolean boolean0 = linkedTreeMap_Node0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>>();
      linkedTreeMap0.keySet();
      Set<AbstractMap.SimpleImmutableEntry<Object, String>> set0 = linkedTreeMap0.keySet();
      assertNotNull(set0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>((Comparator<? super Integer>) null);
      linkedTreeMap0.entrySet();
      Set<Map.Entry<Integer, String>> set0 = (Set<Map.Entry<Integer, String>>)linkedTreeMap0.entrySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Comparable<Integer>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Comparable<Integer>>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, linkedTreeMap_Node1, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node3 = linkedTreeMap_Node2.first();
      linkedTreeMap_Node0.right = linkedTreeMap_Node3;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node3, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, linkedTreeMap0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node1, false);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<Object>, Object> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Object>(comparator0);
      LinkedTreeMap.Node<Comparable<Object>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Object>, Object>();
      LinkedTreeMap.Node<Comparable<Object>, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Comparable<Object>, Object>();
      linkedTreeMap_Node1.right = linkedTreeMap_Node0;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node1, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>();
      linkedTreeMap_Node1.right = linkedTreeMap_Node0;
      linkedTreeMap_Node1.left = linkedTreeMap_Node0;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node1, false);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>();
      linkedTreeMap_Node1.left = linkedTreeMap_Node0;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node1, false);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, linkedTreeMap0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal(linkedTreeMap_Node1, false);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>((Comparator<? super String>) null);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, Integer> linkedTreeMap1 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, Integer>((Comparator<? super AbstractMap.SimpleImmutableEntry<Integer, Object>>) null);
      Integer integer0 = new Integer(2);
      AbstractMap.SimpleImmutableEntry<Integer, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Object>(integer0, linkedTreeMap_KeySet0);
      // Undeclared exception!
      try { 
        linkedTreeMap1.put(abstractMap_SimpleImmutableEntry0, integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleImmutableEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.merge("i*8$IU9hhm*;O/", "i*8$IU9hhm*;O/", biFunction0);
      linkedTreeMap0.put("", "");
      assertEquals(2, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Object, Object>>();
      Integer integer0 = new Integer(4);
      Integer integer1 = new Integer((-1344));
      linkedTreeMap0.putIfAbsent(integer1, (AbstractMap.SimpleEntry<Object, Object>) null);
      linkedTreeMap0.put(integer0, (AbstractMap.SimpleEntry<Object, Object>) null);
      assertEquals(2, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(anyString() , anyString());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      linkedTreeMap0.putIfAbsent("xG(,1m", "xG(,1m");
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, Integer>> linkedTreeMap1 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, Integer>>(comparator1);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap1.new EntrySet();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap_EntrySet0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleEntry<Integer, String>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<Integer, String>>();
      Integer integer0 = new Integer(2055);
      AbstractMap.SimpleEntry<Integer, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, String>(integer0, "G.?xW");
      linkedTreeMap0.putIfAbsent("G.?xW", abstractMap_SimpleEntry0);
      linkedTreeMap0.remove((Object) "G.?xW");
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, String>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, String>(comparator0);
      linkedTreeMap0.remove((Object) linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap1 = new LinkedTreeMap<Object, Object>(comparator0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((Integer) null, linkedTreeMap1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Object, Object>>();
      Integer integer0 = new Integer(4);
      linkedTreeMap0.putIfAbsent(integer0, (AbstractMap.SimpleEntry<Object, Object>) null);
      linkedTreeMap0.putIfAbsent(integer0, (AbstractMap.SimpleEntry<Object, Object>) null);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>((Comparator<? super String>) null);
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("?H?cQwf`B5ki5%F#}").when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute("", biFunction0);
      linkedTreeMap0.putAll(linkedTreeMap0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      String string0 = linkedTreeMap_Node0.setValue((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      String string0 = linkedTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<Object, String>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<Object, String>>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Integer integer0 = new Integer((-3015));
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, String>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains(integer0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, String>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}