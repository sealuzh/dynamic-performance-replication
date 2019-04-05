/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 12:08:01 GMT 2019
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
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, String>(comparator0);
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Map.Entry<Object, Integer>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap1 = new LinkedHashTreeMap<Map.Entry<Object, Integer>, AbstractMap.SimpleEntry<Object, Object>>(comparator1);
      LinkedHashTreeMap.Node<Map.Entry<Object, Integer>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Map.Entry<Object, Integer>, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedHashTreeMap.Node<Map.Entry<Object, Integer>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Map.Entry<Object, Integer>, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap1.new KeySet();
      Integer integer0 = new Integer(7);
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove(integer0);
      assertFalse(boolean0);
      
      LinkedHashTreeMap<Comparable<Object>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap2 = new LinkedHashTreeMap<Comparable<Object>, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node3 = new LinkedHashTreeMap.Node<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node4 = new LinkedHashTreeMap.Node<String, Object>(linkedHashTreeMap_Node3, "", 7, linkedHashTreeMap_Node3, linkedHashTreeMap_Node3);
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node5 = new LinkedHashTreeMap.Node<String, Object>();
      assertFalse(linkedHashTreeMap_Node5.equals((Object)linkedHashTreeMap_Node4));
      
      LinkedHashTreeMap<String, Object> linkedHashTreeMap3 = new LinkedHashTreeMap<String, Object>();
      linkedHashTreeMap3.findByEntry(linkedHashTreeMap_Node4);
      assertFalse(linkedHashTreeMap_Node4.equals((Object)linkedHashTreeMap_Node5));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashTreeMap.Node<Comparable<Object>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<Object>, String>();
      Object object0 = linkedHashTreeMap_Node0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Integer>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Integer>(linkedHashTreeMap_Node0, (AbstractMap.SimpleEntry<String, Object>) null, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = linkedHashTreeMap_Node1.getKey();
      assertNull(abstractMap_SimpleEntry0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Integer>>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      int int0 = linkedHashTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<String, LinkedHashTreeMap<Integer, Object>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<String, LinkedHashTreeMap<Integer, Object>>();
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
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>(comparator0);
      Integer integer0 = new Integer(784);
      linkedHashTreeMap0.find(integer0, true);
      linkedHashTreeMap0.keySet();
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<String, String>>();
      Integer integer0 = new Integer(1305);
      linkedHashTreeMap0.get(integer0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, Object>((Comparator<? super AbstractMap.SimpleImmutableEntry<Object, String>>) null);
      linkedHashTreeMap0.remove((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Map.Entry<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>, LinkedHashTreeMap<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>, LinkedHashTreeMap<Object, String>>(comparator0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>();
      Object object0 = linkedHashTreeMap0.remove((Object) linkedHashTreeMap_Node0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, Integer>((Comparator<? super AbstractMap.SimpleImmutableEntry<Integer, Object>>) null);
      linkedHashTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<String, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 0);
      LinkedHashTreeMap.Node<String, Object>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<String, Object>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(0, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<String, Object>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, LinkedHashTreeMap<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, LinkedHashTreeMap<Object, String>>(comparator0);
      boolean boolean0 = linkedHashTreeMap0.containsKey(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>((Comparator<? super Object>) null);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal((LinkedHashTreeMap.Node<Object, Object>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Object, Map.Entry<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Object, Map.Entry<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>>();
      LinkedHashTreeMap.Node<Object, Map.Entry<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, AbstractMap.SimpleImmutableEntry<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleImmutableEntry<Object, String>>(comparator0);
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      boolean boolean0 = linkedHashTreeMap0.containsKey((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashTreeMap<Map.Entry<Integer, Object>, Comparable<Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<Integer, Object>, Comparable<Object>>((Comparator<? super Map.Entry<Integer, Object>>) null);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove("=?G&kl3W~RV(");
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedHashTreeMap<Comparable<String>, LinkedHashTreeMap<Integer, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Comparable<String>, LinkedHashTreeMap<Integer, Object>>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Integer, Integer> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Integer, Integer>();
      LinkedHashTreeMap.Node<Integer, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Integer>();
      linkedHashTreeMap_AvlBuilder0.reset((-3895));
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<AbstractMap.SimpleEntry<Object, String>, String> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<AbstractMap.SimpleEntry<Object, String>, String>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String>();
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node0;
      linkedHashTreeMap_AvlIterator0.reset(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, String> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlIterator0.next();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<Object, Object>>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<Object, Object>>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 8);
      LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<Object, Object>>();
      Integer integer0 = new Integer((-1056));
      LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<Object, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<Object, Object>>(linkedHashTreeMap_Node0, integer0, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_NodeArray0[1] = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<Object, Object>>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, LinkedHashTreeMap<Object, Object>>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(16, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.last();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, String>, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<String, String>, AbstractMap.SimpleEntry<Object, String>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, String>, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<String, String>, AbstractMap.SimpleEntry<Object, String>>(linkedHashTreeMap_Node0, linkedHashTreeMap0, (-2), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node0.left = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, String>, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node0.first();
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      Set<Map.Entry<Object, String>> set0 = (Set<Map.Entry<Object, String>>)linkedHashTreeMap0.entrySet();
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Comparable<String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<Object, String>, Comparable<String>>();
      AbstractMap.SimpleImmutableEntry<Object, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, String>(set0, "%z1");
      LinkedHashTreeMap.Node<Map.Entry<Object, String>, Comparable<String>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Map.Entry<Object, String>, Comparable<String>>(linkedHashTreeMap_Node0, abstractMap_SimpleImmutableEntry0, 1544, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<String, String>();
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>(linkedHashTreeMap_Node2);
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<String, String>(abstractMap_SimpleEntry0);
      AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>> abstractMap_SimpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>(abstractMap_SimpleEntry0, abstractMap_SimpleImmutableEntry1);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(abstractMap_SimpleImmutableEntry2);
      assertFalse(boolean0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      LinkedHashTreeMap.Node<Map.Entry<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Map.Entry<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>();
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_Node3 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>(linkedHashTreeMap_Node2, abstractMap_SimpleEntry0, 83, linkedHashTreeMap_Node2, linkedHashTreeMap_Node2);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node3);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<LinkedHashTreeMap<Object, Object>, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<LinkedHashTreeMap<Object, Object>, String>>();
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<LinkedHashTreeMap<Object, Object>, String>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<LinkedHashTreeMap<Object, Object>, String>>(linkedHashTreeMap_Node0, linkedHashTreeMap_Node0, 3894, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, String>, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<String, String>, Integer>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashTreeMap<Object, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      linkedHashTreeMap0.keySet();
      Set<Object> set0 = linkedHashTreeMap0.keySet();
      assertNotNull(set0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>();
      Set<Map.Entry<Object, Integer>> set0 = (Set<Map.Entry<Object, Integer>>)linkedHashTreeMap0.entrySet();
      assertNotNull(set0);
      
      BiConsumer<Object, Integer> biConsumer0 = (BiConsumer<Object, Integer>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.forEach(biConsumer0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Map.Entry<Object, Integer>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<Object, Integer>, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      LinkedHashTreeMap.Node<Map.Entry<Object, Integer>, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<Object, Integer>, AbstractMap.SimpleEntry<Object, Object>>();
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node0;
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, false);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      linkedHashTreeMap_Node0.left = linkedHashTreeMap_Node0;
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, false);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashTreeMap<String, Map.Entry<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Map.Entry<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>>();
      LinkedHashTreeMap.Node<String, Map.Entry<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Map.Entry<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>>();
      LinkedHashTreeMap.Node<String, Map.Entry<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Map.Entry<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>>(linkedHashTreeMap_Node0, "?fi", 1293, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node1, true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Integer>, LinkedHashTreeMap<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Integer>, LinkedHashTreeMap<Object, Object>>();
      LinkedHashTreeMap.Node<Object, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Integer>();
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Integer>(linkedHashTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find(abstractMap_SimpleEntry0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(comparator0).compare(any() , any());
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>(comparator0);
      LinkedHashTreeMap.Node<Integer, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Integer, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 2);
      Integer integer0 = new Integer(784);
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find(integer0, true);
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node0;
      linkedHashTreeMap0.table = linkedHashTreeMap_NodeArray0;
      linkedHashTreeMap0.find((Integer) null, false);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>(comparator0);
      LinkedHashTreeMap.Node<Integer, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Integer, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 2);
      Integer integer0 = new Integer(784);
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find(integer0, true);
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node0;
      linkedHashTreeMap0.table = linkedHashTreeMap_NodeArray0;
      linkedHashTreeMap0.find((Integer) null, false);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      Integer integer0 = new Integer((-1709));
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedHashTreeMap0, integer0);
      linkedHashTreeMap0.put(integer0, abstractMap_SimpleEntry0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.merge((Object) null, "cc42<l=#6MehNQ5", biFunction0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedHashTreeMap.Node<String, LinkedHashTreeMap<String, Object>>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<String, LinkedHashTreeMap<String, Object>>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 7);
      LinkedHashTreeMap.Node<String, LinkedHashTreeMap<String, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, LinkedHashTreeMap<String, Object>>();
      LinkedHashTreeMap.Node<String, LinkedHashTreeMap<String, Object>> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.first();
      assertNotNull(linkedHashTreeMap_Node1);
      
      linkedHashTreeMap_NodeArray0[1] = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<String, LinkedHashTreeMap<String, Object>>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<String, LinkedHashTreeMap<String, Object>>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(14, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, Integer>((Comparator<? super AbstractMap.SimpleImmutableEntry<Integer, Object>>) null);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains("'{/2(-/bf=eu!");
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, LinkedHashTreeMap<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, LinkedHashTreeMap<Object, String>>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedHashTreeMap<String, Map.Entry<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Map.Entry<AbstractMap.SimpleEntry<String, String>, AbstractMap.SimpleImmutableEntry<String, String>>>();
      linkedHashTreeMap0.find("", true);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      LinkedHashTreeMap<String, Integer>[] linkedHashTreeMapArray0 = (LinkedHashTreeMap<String, Integer>[]) Array.newInstance(LinkedHashTreeMap.class, 4);
      // Undeclared exception!
      try { 
        linkedHashTreeMap_KeySet0.toArray(linkedHashTreeMapArray0);
        fail("Expecting exception: ArrayStoreException");
      
      } catch(ArrayStoreException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.iterator();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Integer integer0 = new Integer(1305);
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, AbstractMap.SimpleImmutableEntry<Object, Integer>>(comparator0);
      AbstractMap.SimpleImmutableEntry<Object, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Integer>((Object) null, integer0);
      AbstractMap.SimpleImmutableEntry<Object, Integer> abstractMap_SimpleImmutableEntry1 = linkedHashTreeMap0.putIfAbsent(integer0, abstractMap_SimpleImmutableEntry0);
      assertNull(abstractMap_SimpleImmutableEntry1);
      
      String string0 = linkedHashTreeMap0.toString();
      assertEquals("{1305=null=1305}", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedHashTreeMap<String, LinkedHashTreeMap<Integer, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, LinkedHashTreeMap<Integer, Object>>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<String, Object>>();
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>("_[kfWumx<?l", "_[kfWumx<?l");
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry1 = linkedHashTreeMap_Node0.setValue(abstractMap_SimpleImmutableEntry0);
      assertNull(abstractMap_SimpleImmutableEntry1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, Object>>(linkedHashTreeMap_Node0, (Integer) null, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node0;
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.last();
      assertNotNull(linkedHashTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      String string0 = linkedHashTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      boolean boolean0 = linkedHashTreeMap0.isEmpty();
      assertTrue(boolean0);
  }
}
