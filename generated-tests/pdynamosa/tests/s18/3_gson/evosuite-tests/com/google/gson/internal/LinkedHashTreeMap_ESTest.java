/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 19:30:36 GMT 2019
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
import java.util.Iterator;
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
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedHashTreeMap0, " is not Comparable");
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>(linkedHashTreeMap_Node0, abstractMap_SimpleEntry0, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, Integer> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, Integer>();
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap1 = new LinkedHashTreeMap<Integer, Integer>();
      Integer integer0 = new Integer(0);
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Object, Integer>(linkedHashTreeMap1, integer0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, Integer> linkedHashTreeMap_Node3 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, Integer>(linkedHashTreeMap_Node2, abstractMap_SimpleEntry1, 0, linkedHashTreeMap_Node2, linkedHashTreeMap_Node2);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, Integer> linkedHashTreeMap_Node4 = linkedHashTreeMap_Node3.first();
      assertNotNull(linkedHashTreeMap_Node4);
      
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, Integer> linkedHashTreeMap_Node5 = linkedHashTreeMap_Node4.last();
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry2 = linkedHashTreeMap_Node5.getKey();
      assertNotNull(abstractMap_SimpleEntry2);
      
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node6 = new LinkedHashTreeMap.Node<String, Object>();
      LinkedHashTreeMap<LinkedHashTreeMap<String, Integer>, AbstractMap.SimpleEntry<Object, Integer>> linkedHashTreeMap2 = new LinkedHashTreeMap<LinkedHashTreeMap<String, Integer>, AbstractMap.SimpleEntry<Object, Integer>>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Integer>, AbstractMap.SimpleEntry<Object, Integer>> linkedHashTreeMap_Node7 = linkedHashTreeMap2.removeInternalByKey(abstractMap_SimpleEntry2);
      assertNull(linkedHashTreeMap_Node7);
      assertSame(linkedHashTreeMap_Node4, linkedHashTreeMap_Node5);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, Integer>();
      Integer integer0 = linkedHashTreeMap_Node0.getValue();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<LinkedHashTreeMap<Object, Object>, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<LinkedHashTreeMap<Object, Object>, String>();
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
  public void test03()  throws Throwable  {
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>();
      Integer integer0 = new Integer((-1579));
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.merge("k$)s~?3IK@6DhjR", integer0, biFunction0);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>();
      linkedHashTreeMap0.putIfAbsent("55+HW)", (Integer) null);
      linkedHashTreeMap0.keySet();
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      linkedHashTreeMap0.size = (-2);
      Set<Object> set0 = linkedHashTreeMap0.keySet();
      assertFalse(set0.contains((-2)));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHashTreeMap<Comparable<Object>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Comparable<Object>, String>();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(comparable0).toString();
      BiFunction<String, String, String> biFunction0 = (BiFunction<String, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.merge(comparable0, "|fD*&\u0004)Cel`", biFunction0);
      Set<Map.Entry<Comparable<Object>, String>> set0 = (Set<Map.Entry<Comparable<Object>, String>>)linkedHashTreeMap0.entrySet();
      assertEquals(1, set0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, String>>();
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap_Node0 = linkedHashTreeMap0.removeInternalByKey((Object) null);
      assertNull(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, String>>();
      linkedHashTreeMap0.remove((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      linkedHashTreeMap0.remove((Object) linkedHashTreeMap_AvlIterator0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<String, LinkedHashTreeMap<String, String>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<String, LinkedHashTreeMap<String, String>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer((-2524));
      Object object0 = linkedHashTreeMap0.put(linkedHashTreeMap_AvlBuilder0, integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, Object>();
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<String, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<String, Object>>();
      linkedHashTreeMap0.get(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      linkedHashTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, String>, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<String, String>, Object>();
      linkedHashTreeMap0.findByObject(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, Integer>, AbstractMap.SimpleEntry<String, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, Integer>, AbstractMap.SimpleEntry<String, String>>();
      linkedHashTreeMap0.findByEntry(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, String>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, String>, Integer>();
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>("%", "%");
      linkedHashTreeMap0.find(abstractMap_SimpleEntry0, false);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, String>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, String>, Integer>(comparator0);
      linkedHashTreeMap0.find((AbstractMap.SimpleEntry<String, String>) null, true);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Object>, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Object>, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 0);
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Object>, Object>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<LinkedHashTreeMap<String, Object>, Object>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(0, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, String>>();
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      boolean boolean0 = linkedHashTreeMap0.containsKey(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, String>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, String>, Object>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.findByEntry((Map.Entry<?, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, String>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Integer, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Integer, AbstractMap.SimpleImmutableEntry<String, Object>>();
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<String, Object>>();
      linkedHashTreeMap_AvlIterator0.reset(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlIterator0.next();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<LinkedHashTreeMap<Map.Entry<Comparable<String>, AbstractMap.SimpleEntry<String, Integer>>, Integer>, Object> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<LinkedHashTreeMap<Map.Entry<Comparable<String>, AbstractMap.SimpleEntry<String, Integer>>, Integer>, Object>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<Map.Entry<Comparable<String>, AbstractMap.SimpleEntry<String, Integer>>, Integer>, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<String, Integer>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 1);
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.last();
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node1;
      linkedHashTreeMap0.table = linkedHashTreeMap_NodeArray0;
      Integer integer0 = new Integer((-1851));
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.remove((Object) integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<String, Integer>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 1);
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.last();
      assertNotNull(linkedHashTreeMap_Node1);
      
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node1;
      linkedHashTreeMap0.table = linkedHashTreeMap_NodeArray0;
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Integer>(linkedHashTreeMap_NodeArray0[0]);
      AbstractMap.SimpleEntry<Comparable<String>, AbstractMap.SimpleEntry<String, Integer>> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Comparable<String>, AbstractMap.SimpleEntry<String, Integer>>("{}", abstractMap_SimpleEntry0);
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove(abstractMap_SimpleEntry1);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Integer>(comparator0);
      boolean boolean0 = linkedHashTreeMap0.containsKey((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<String, Integer>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<String, Integer>, String>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      Iterator<Map.Entry<LinkedHashTreeMap<Object, Integer>, String>> iterator0 = (Iterator<Map.Entry<LinkedHashTreeMap<Object, Integer>, String>>)linkedHashTreeMap_EntrySet0.iterator();
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap1 = new LinkedHashTreeMap<String, Integer>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet1 = linkedHashTreeMap1.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet1.contains(iterator0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet1.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<Object, Object>, LinkedHashTreeMap<String, Integer>> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<Object, Object>, LinkedHashTreeMap<String, Integer>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, LinkedHashTreeMap<String, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, LinkedHashTreeMap<String, Integer>>();
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, LinkedHashTreeMap<String, Integer>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, LinkedHashTreeMap<String, Integer>>(linkedHashTreeMap_Node0, abstractMap_SimpleImmutableEntry0, 1176, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_AvlBuilder0.reset(1389);
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<String, String>>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<String, String>>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 3);
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<String, String>>();
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.first();
      assertNotNull(linkedHashTreeMap_Node1);
      
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<String, String>>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<String, String>>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(6, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Comparable<Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Comparable<Object>>();
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node0;
      // Undeclared exception!
      linkedHashTreeMap_Node0.last();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      String string0 = linkedHashTreeMap_Node0.setValue("[QJC.tsQ[8S5m|");
      assertNull(string0);
      
      LinkedHashTreeMap.Node<Map.Entry<String, Object>, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Map.Entry<String, Object>, Integer>();
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, String>(linkedHashTreeMap_Node0, "com.google.gson.internal.LinkedHashTreeMap$KeySet$1", 1385, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      Integer integer0 = new Integer(14);
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, String>(linkedHashTreeMap_Node0, integer0, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Integer, String>();
      boolean boolean0 = linkedHashTreeMap_Node2.equals(linkedHashTreeMap_Node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<String, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<String, Object>>();
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, Object>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedHashTreeMap0, linkedHashTreeMap1);
      LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<String, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<String, Object>>(linkedHashTreeMap_Node0, abstractMap_SimpleEntry0, (-1171), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap1.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Object>(comparator0);
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>();
      Set<Object> set0 = linkedHashTreeMap0.keySet();
      assertNotNull(set0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<Integer, Object>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Integer, Object>, Object>();
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.forEach(biConsumer0);
      Set<Map.Entry<LinkedHashTreeMap<Integer, Object>, Object>> set0 = (Set<Map.Entry<LinkedHashTreeMap<Integer, Object>, Object>>)linkedHashTreeMap0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, String>(linkedHashTreeMap_Node0, "Kyo", (-1), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
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
  public void test40()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>(comparator0);
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, true);
      int int0 = linkedHashTreeMap0.size();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, Object>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, Object>, Object>(comparator0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal((LinkedHashTreeMap.Node<AbstractMap.SimpleEntry<Integer, Object>, Object>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      LinkedHashTreeMap.Node<Comparable<String>, AbstractMap.SimpleEntry<String, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<String>, AbstractMap.SimpleEntry<String, Integer>>();
      LinkedHashTreeMap.Node<Comparable<String>, AbstractMap.SimpleEntry<String, Integer>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Comparable<String>, AbstractMap.SimpleEntry<String, Integer>>(linkedHashTreeMap_Node0, "k$)s~?3IK@6DhjR", 11, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node1);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<LinkedHashTreeMap<String, String>, AbstractMap.SimpleEntry<Integer, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<String, String>, AbstractMap.SimpleEntry<Integer, Object>>(comparator0);
      linkedHashTreeMap0.get((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, String>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, String>, Integer>();
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>(linkedHashTreeMap_Node0);
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
  public void test45()  throws Throwable  {
      Integer integer0 = new Integer((-2));
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Map.Entry<Comparable<String>, AbstractMap.SimpleEntry<String, Integer>>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Map.Entry<Comparable<String>, AbstractMap.SimpleEntry<String, Integer>>>(comparator0);
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Integer>("Tu!Mzbl|e", integer0);
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Integer>(abstractMap_SimpleImmutableEntry0);
      AbstractMap.SimpleEntry<Comparable<String>, AbstractMap.SimpleEntry<String, Integer>> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Comparable<String>, AbstractMap.SimpleEntry<String, Integer>>("", abstractMap_SimpleEntry0);
      Map.Entry<Comparable<String>, AbstractMap.SimpleEntry<String, Integer>> map_Entry0 = linkedHashTreeMap0.put("", abstractMap_SimpleEntry1);
      assertNull(map_Entry0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      Integer integer0 = new Integer((-2));
      linkedHashTreeMap0.find(integer0, true);
      assertEquals(1, linkedHashTreeMap0.size());
      
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put((Object) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>((Comparator<? super String>) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, Integer>();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains(linkedHashTreeMap1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      int int0 = linkedHashTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedHashTreeMap<Integer, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Integer>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.iterator();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>();
      Integer integer0 = new Integer((-1));
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(biFunction0).apply(any() , any());
      BiFunction<Object, Object, Integer> biFunction1 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.merge("k$)s~?3IK@6DhjR", integer0, biFunction1);
      linkedHashTreeMap0.replaceAll(biFunction0);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<Object, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, AbstractMap.SimpleEntry<Object, Integer>>();
      String string0 = linkedHashTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>();
      Integer integer0 = new Integer((-1));
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedHashTreeMap0.threshold = (-1579);
      linkedHashTreeMap0.merge("k$)s~?3IK@6DhjR", integer0, biFunction0);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
  }
}
