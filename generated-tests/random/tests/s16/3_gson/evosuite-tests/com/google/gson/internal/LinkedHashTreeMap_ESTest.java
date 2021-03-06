/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 00:30:40 GMT 2019
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedHashTreeMap;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashTreeMap<Integer, Map.Entry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Map.Entry<Object, Object>>();
      Comparator<Map.Entry<Object, Object>> comparator0 = (Comparator<Map.Entry<Object, Object>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Map.Entry<Object, Object>, String> linkedHashTreeMap1 = new LinkedHashTreeMap<Map.Entry<Object, Object>, String>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap1.new KeySet();
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap2 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap2.header;
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Object>(linkedHashTreeMap_Node0, linkedHashTreeMap0, (-2), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap3 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, String>(comparator1);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 8);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap_Node3 = linkedHashTreeMap_Node2.last();
      assertNotNull(linkedHashTreeMap_Node3);
      
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap_Node4 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>(linkedHashTreeMap_Node2, abstractMap_SimpleEntry0, 0, linkedHashTreeMap_Node3, linkedHashTreeMap_Node3);
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node4;
      linkedHashTreeMap_NodeArray0[1] = linkedHashTreeMap_Node3;
      linkedHashTreeMap_NodeArray0[2] = linkedHashTreeMap_NodeArray0[0];
      linkedHashTreeMap_NodeArray0[3] = linkedHashTreeMap_NodeArray0[0];
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap_Node5 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap_Node6 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>(linkedHashTreeMap_Node4, abstractMap_SimpleEntry0, (-2), linkedHashTreeMap_Node5, linkedHashTreeMap_Node2);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap_Node7 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>(linkedHashTreeMap_Node3, abstractMap_SimpleEntry0, 6, linkedHashTreeMap_Node2, linkedHashTreeMap_NodeArray0[2]);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap_Node8 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>(linkedHashTreeMap_Node7, abstractMap_SimpleEntry0, 0, linkedHashTreeMap_NodeArray0[1], linkedHashTreeMap_NodeArray0[3]);
      assertTrue(linkedHashTreeMap_Node8.equals((Object)linkedHashTreeMap_Node7));
      
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>(linkedHashTreeMap0, linkedHashTreeMap_KeySet0);
      linkedHashTreeMap3.get(abstractMap_SimpleImmutableEntry0);
      assertEquals(0, linkedHashTreeMap3.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashTreeMap.Node<Comparable<Integer>, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<Integer>, Integer>();
      Object object0 = linkedHashTreeMap_Node0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<Integer, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<Integer, Integer>>();
      AbstractMap.SimpleImmutableEntry<Object, String> abstractMap_SimpleImmutableEntry0 = linkedHashTreeMap_Node0.getKey();
      assertNull(abstractMap_SimpleImmutableEntry0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Integer, Integer> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Integer, Integer>();
      LinkedHashTreeMap.Node<Integer, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Integer>();
      linkedHashTreeMap_AvlIterator0.reset(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap_AvlBuilder0.root();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap$AvlBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Map.Entry<Object, Map.Entry<Object, Object>>, Object> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Map.Entry<Object, Map.Entry<Object, Object>>, Object>();
      linkedHashTreeMap_AvlBuilder0.reset((-752));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<String, Comparable<Object>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<String, Comparable<Object>>();
      LinkedHashTreeMap.Node<String, Comparable<Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Comparable<Object>>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashTreeMap<Map.Entry<Object, Object>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<Object, Object>, String>();
      LinkedHashTreeMap.Node<Map.Entry<Object, Object>, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.removeInternalByKey((Object) null);
      assertNull(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<String, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<String, Integer>>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, LinkedHashTreeMap<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, LinkedHashTreeMap<Object, Object>>();
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>(linkedHashTreeMap_Node0);
      linkedHashTreeMap0.removeInternalByKey(abstractMap_SimpleImmutableEntry0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>(comparator0);
      linkedHashTreeMap0.remove((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Map.Entry<Object, Object>>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Map.Entry<Object, Object>>>();
      linkedHashTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap0.header;
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, LinkedHashTreeMap<String, Integer>> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, LinkedHashTreeMap<String, Integer>>(comparator0);
      linkedHashTreeMap1.findByObject(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashTreeMap<Map.Entry<Object, Object>, LinkedHashTreeMap<Integer, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<Object, Object>, LinkedHashTreeMap<Integer, Object>>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      boolean boolean0 = linkedHashTreeMap0.containsKey(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Object, Object> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Object, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Integer>(comparator0);
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashTreeMap<Map.Entry<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<Object, Object>, AbstractMap.SimpleImmutableEntry<Object, String>>((Comparator<? super Map.Entry<Object, Object>>) null);
      boolean boolean0 = linkedHashTreeMap0.containsKey("!1yQ>%'S`?3~");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashTreeMap<Integer, Map.Entry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Map.Entry<Object, Object>>();
      Comparator<Map.Entry<Object, Object>> comparator0 = (Comparator<Map.Entry<Object, Object>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Map.Entry<Object, Object>, String> linkedHashTreeMap1 = new LinkedHashTreeMap<Map.Entry<Object, Object>, String>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap1.new KeySet();
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap2 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap2.header;
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Object>(linkedHashTreeMap_Node0, linkedHashTreeMap0, (-2), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator1).compare(any() , any());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap3 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, String>(comparator1);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 8);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap_Node3 = linkedHashTreeMap_Node2.first();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap_Node4 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>(linkedHashTreeMap_Node3, abstractMap_SimpleEntry0, 0, linkedHashTreeMap_Node2, linkedHashTreeMap_Node2);
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node4;
      linkedHashTreeMap_NodeArray0[1] = linkedHashTreeMap_Node3;
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap_Node5 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap_Node6 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>(linkedHashTreeMap_Node4, abstractMap_SimpleEntry0, (-2), linkedHashTreeMap_Node5, linkedHashTreeMap_NodeArray0[0]);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap_Node7 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>(linkedHashTreeMap_Node3, abstractMap_SimpleEntry0, 6, linkedHashTreeMap_Node3, linkedHashTreeMap_Node6);
      linkedHashTreeMap3.table = linkedHashTreeMap_NodeArray0;
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>(linkedHashTreeMap0, linkedHashTreeMap_KeySet0);
      String string0 = linkedHashTreeMap3.get(abstractMap_SimpleImmutableEntry0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedHashTreeMap<Object, Map.Entry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Map.Entry<Object, Object>>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<Integer, Object>();
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>(linkedHashTreeMap1, linkedHashTreeMap0);
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove(abstractMap_SimpleImmutableEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Integer, Object>, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Integer, Object>, Integer>();
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Integer, Object>, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Integer, Object>, Integer>(linkedHashTreeMap_Node0, linkedHashTreeMap0, 1177, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node1.left = linkedHashTreeMap_Node0;
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node1.left);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Integer, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 7);
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.last();
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Integer, String>();
      linkedHashTreeMap_NodeArray0[2] = linkedHashTreeMap_Node2;
      linkedHashTreeMap_Node2.right = linkedHashTreeMap_NodeArray0[0];
      LinkedHashTreeMap.Node<Integer, String>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, String>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(14, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Integer>(linkedHashTreeMap_Node0, "J5GJSw", 5, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node0;
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.last();
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<String, String>>();
      Integer integer0 = new Integer(2);
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<String, String>>(linkedHashTreeMap_Node0, integer0, (-3619), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node1.left = linkedHashTreeMap_Node0;
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.first();
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      HashMap<Map.Entry<Object, Object>, Integer> hashMap0 = new HashMap<Map.Entry<Object, Object>, Integer>();
      Integer integer0 = hashMap0.put(linkedHashTreeMap_Node0, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap.Node<Comparable<Integer>, Comparable<Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<Integer>, Comparable<Object>>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>(comparator0);
      linkedHashTreeMap_Node1.value = (Object) linkedHashTreeMap0;
      assertEquals(0, linkedHashTreeMap0.size());
      
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, Integer>, Comparable<String>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, Integer>, Comparable<String>>(comparator0);
      Set<AbstractMap.SimpleImmutableEntry<String, Integer>> set0 = linkedHashTreeMap0.keySet();
      LinkedHashTreeMap.Node<String, Map.Entry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Map.Entry<Object, Object>>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Object, Object>(linkedHashTreeMap_Node1, set0, 810, linkedHashTreeMap_Node1, linkedHashTreeMap_Node1);
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node2);
      assertFalse(boolean0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>();
      Integer integer0 = new Integer(11);
      AbstractMap.SimpleImmutableEntry<Integer, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Object>(integer0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Object>, AbstractMap.SimpleEntry<String, Object>>(linkedHashTreeMap_Node0, abstractMap_SimpleImmutableEntry0, 297, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashTreeMap.Node<Comparable<Integer>, Comparable<Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<Integer>, Comparable<Object>>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Object>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashTreeMap.Node<Map.Entry<Object, Object>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<Object, Object>, String>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals("S/SC\"E,]cqIgC&~aZ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, LinkedHashTreeMap<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, LinkedHashTreeMap<Object, Object>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, LinkedHashTreeMap<Object, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, LinkedHashTreeMap<Object, Object>>(linkedHashTreeMap_Node0, linkedHashTreeMap0, 1430, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Object, Object>, LinkedHashTreeMap<Object, Object>> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.first();
      assertNotNull(linkedHashTreeMap_Node2);
      
      String string0 = linkedHashTreeMap_Node2.toString();
      assertEquals("{}=null", string0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      Set<Map.Entry<String, String>> set0 = (Set<Map.Entry<String, String>>)linkedHashTreeMap0.entrySet();
      assertNotNull(set0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, AbstractMap.SimpleImmutableEntry<String, String>>(comparator0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, AbstractMap.SimpleImmutableEntry<String, String>>();
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Object>("Qt*X]U1k:( ?Iw$", "Qt*X]U1k:( ?Iw$");
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, AbstractMap.SimpleImmutableEntry<String, String>>(linkedHashTreeMap_Node0, abstractMap_SimpleEntry0, 2, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node1, false);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashTreeMap<Comparable<String>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Comparable<String>, Integer>();
      LinkedHashTreeMap.Node<Comparable<String>, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<String>, Integer>();
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, true);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal((LinkedHashTreeMap.Node<Object, String>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Comparable<Map.Entry<Object, Object>>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Comparable<Map.Entry<Object, Object>>>(comparator0);
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      linkedHashTreeMap0.findByEntry(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, String>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, String>, Integer>();
      linkedHashTreeMap0.get((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>((Comparator<? super Object>) null);
      LinkedHashTreeMap<String, LinkedHashTreeMap<Object, Object>> linkedHashTreeMap1 = new LinkedHashTreeMap<String, LinkedHashTreeMap<Object, Object>>((Comparator<? super String>) null);
      linkedHashTreeMap1.put("!1yQ>%'S`?3~", linkedHashTreeMap0);
      assertEquals(1, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Integer>(linkedHashTreeMap_Node0, "J5GJSw", 5, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node0;
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, Integer>, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, Integer>, AbstractMap.SimpleEntry<String, String>>();
      AbstractMap.SimpleImmutableEntry<Object, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Integer>(linkedHashTreeMap_Node1.right);
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>("J5GJSw", "");
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put(abstractMap_SimpleImmutableEntry0, abstractMap_SimpleEntry0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleImmutableEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Map.Entry<Object, Object>, Map.Entry<Map.Entry<Object, Object>, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<Object, Object>, Map.Entry<Map.Entry<Object, Object>, String>>(comparator0);
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      linkedHashTreeMap0.find(linkedHashTreeMap_Node0, true);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      assertEquals(1, linkedHashTreeMap0.size());
      
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, Map.Entry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Map.Entry<Object, Object>>(comparator0);
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put((Integer) null, linkedHashTreeMap_Node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedHashTreeMap<Comparable<Integer>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Comparable<Integer>, AbstractMap.SimpleImmutableEntry<String, Object>>();
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<String, Integer>> linkedHashTreeMap1 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<String, Integer>>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains(linkedHashTreeMap1);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Integer>>((Comparator<? super AbstractMap.SimpleEntry<Object, Object>>) null);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      int int0 = linkedHashTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Object, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Object, Integer>>((Comparator<? super String>) null);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.iterator();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Comparable<Map.Entry<Object, Object>>, AbstractMap.SimpleImmutableEntry<Map.Entry<Object, Object>, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Comparable<Map.Entry<Object, Object>>, AbstractMap.SimpleImmutableEntry<Map.Entry<Object, Object>, Object>>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      Object object0 = linkedHashTreeMap_Node0.setValue(linkedHashTreeMap0);
      assertNull(object0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>(comparator0);
      linkedHashTreeMap0.size = 2376;
      Integer integer0 = new Integer(5);
      Integer integer1 = linkedHashTreeMap0.put("", integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedHashTreeMap<Object, Map.Entry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Map.Entry<Object, Object>>((Comparator<? super Object>) null);
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Map.Entry<Object, Object>, Map.Entry<Map.Entry<Object, Object>, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<Object, Object>, Map.Entry<Map.Entry<Object, Object>, String>>(comparator0);
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      Map.Entry<Map.Entry<Object, Object>, String> map_Entry0 = linkedHashTreeMap0.remove((Object) linkedHashTreeMap_Node0);
      assertNull(map_Entry0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      linkedHashTreeMap0.find("com.google.gson.internal.LinkedHashTreeMap$KeySet", false);
      assertEquals(0, linkedHashTreeMap0.size());
  }
}
