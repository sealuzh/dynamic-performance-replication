/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 19:57:43 GMT 2019
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Object, Object> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Object, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      linkedHashTreeMap_AvlBuilder0.reset(0);
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, Object>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleImmutableEntry<String, Object>>();
      linkedHashTreeMap0.get("");
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap1 = new LinkedHashTreeMap<String, Integer>((Comparator<? super String>) null);
      LinkedHashTreeMap<Object, String> linkedHashTreeMap2 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.AvlBuilder<Integer, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Integer, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap1.new KeySet();
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, String> linkedHashTreeMap3 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, String>((Comparator<? super AbstractMap.SimpleImmutableEntry<Integer, Object>>) null);
      LinkedHashTreeMap<Object, LinkedHashTreeMap<Object, String>> linkedHashTreeMap4 = new LinkedHashTreeMap<Object, LinkedHashTreeMap<Object, String>>((Comparator<? super Object>) null);
      LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<Object, String>> linkedHashTreeMap_Node1 = linkedHashTreeMap4.removeInternalByKey(linkedHashTreeMap0.comparator);
      assertNull(linkedHashTreeMap_Node1);
      
      Integer integer0 = linkedHashTreeMap1.get((Object) null);
      linkedHashTreeMap1.replace("IY", integer0);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Object, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Object, String>>();
      Object object0 = linkedHashTreeMap_Node0.getKey();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      int int0 = linkedHashTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<Object, Integer>, String> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<AbstractMap.SimpleImmutableEntry<Object, Integer>, String>();
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
      LinkedHashTreeMap<LinkedHashTreeMap<String, String>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<String, String>, String>();
      linkedHashTreeMap0.size = 2;
      Set<LinkedHashTreeMap<String, String>> set0 = linkedHashTreeMap0.keySet();
      assertEquals(2, set0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, String>(comparator0);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>((Object) null, "=");
      linkedHashTreeMap0.find(abstractMap_SimpleEntry0, true);
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Object>(comparator0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, String>, Object> linkedHashTreeMap_Node0 = linkedHashTreeMap0.removeInternalByKey((Object) null);
      assertNull(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Object, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Object, AbstractMap.SimpleImmutableEntry<String, String>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.removeInternalByKey(linkedHashTreeMap_AvlIterator0);
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashTreeMap<Integer, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, String>();
      linkedHashTreeMap0.remove((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Integer, Object> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Integer, Object>();
      LinkedHashTreeMap<Map.Entry<Object, Integer>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<Object, Integer>, String>();
      linkedHashTreeMap0.remove((Object) linkedHashTreeMap_AvlIterator0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, String>(comparator0);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedHashTreeMap0, "");
      linkedHashTreeMap0.put(abstractMap_SimpleEntry0, "");
      assertEquals(1, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, String>();
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, String>(linkedHashTreeMap_Node0, "tW?(", (-2), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      linkedHashTreeMap0.get(linkedHashTreeMap_Node1);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      linkedHashTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, Comparable<Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Comparable<Object>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Map.Entry<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<String, Object>>> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, Object>, Map.Entry<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<String, Object>>>(comparator0);
      linkedHashTreeMap0.findByObject(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, String>(comparator0);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>((Object) null, "=");
      linkedHashTreeMap0.find(abstractMap_SimpleEntry0, false);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Object, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 0);
      LinkedHashTreeMap.Node<Object, Object>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Object, Object>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(0, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Map.Entry<String, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Map.Entry<String, Integer>>(comparator0);
      boolean boolean0 = linkedHashTreeMap0.containsKey((Object) null);
      assertEquals(0, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      Iterator<Map.Entry<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>> iterator0 = (Iterator<Map.Entry<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>>)linkedHashTreeMap_EntrySet0.iterator();
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, Map.Entry<String, String>> linkedHashTreeMap1 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, Map.Entry<String, String>>();
      boolean boolean0 = linkedHashTreeMap1.containsKey(iterator0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashTreeMap<String, Map.Entry<String, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Map.Entry<String, Object>>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal((LinkedHashTreeMap.Node<String, Map.Entry<String, Object>>) null, false);
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
      LinkedHashTreeMap<Map.Entry<Object, Object>, Map.Entry<Object, String>> linkedHashTreeMap0 = new LinkedHashTreeMap<Map.Entry<Object, Object>, Map.Entry<Object, String>>();
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
  public void test21()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Object, Object>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Object, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Object, AbstractMap.SimpleImmutableEntry<String, String>>();
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<String, String>>();
      linkedHashTreeMap_AvlIterator0.reset(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<String, String>> linkedHashTreeMap_Node1 = linkedHashTreeMap_AvlIterator0.next();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<String, Integer> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = linkedHashTreeMap_AvlIterator0.next();
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Integer, Map.Entry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Integer, Map.Entry<Object, Object>>(comparator0);
      linkedHashTreeMap0.clear();
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove(linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, Object>(comparator0);
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node0.next);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, Integer>(comparator0);
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap1);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedHashTreeMap.AvlBuilder<Object, Object> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<Object, Object>();
      linkedHashTreeMap_AvlBuilder0.reset((-730));
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Object, Object>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 1);
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Object>(linkedHashTreeMap_Node0, (Object) null, 3754, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<Object, Object>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Object, Object>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(2, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.last();
      assertNotNull(linkedHashTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      Integer integer0 = new Integer(3);
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<String, Integer>>(linkedHashTreeMap_Node0, integer0, 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, Comparable<Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Comparable<Object>>(comparator0);
      LinkedHashTreeMap.AvlIterator<Object, Map.Entry<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<String, Object>>> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Object, Map.Entry<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<String, Object>>>();
      LinkedHashTreeMap.Node<Comparable<Object>, LinkedHashTreeMap<Object, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Comparable<Object>, LinkedHashTreeMap<Object, Object>>();
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<String, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<String, Object>>();
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>(linkedHashTreeMap0, linkedHashTreeMap_AvlIterator0);
      LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<String, Object>> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<String, Object>>(linkedHashTreeMap_Node1, abstractMap_SimpleImmutableEntry0, (-2154), linkedHashTreeMap_Node1, linkedHashTreeMap_Node1);
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node2);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedHashTreeMap<LinkedHashTreeMap<Object, String>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<Object, String>, Integer>();
      LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<String, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<String, Object>>();
      LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<String, Object>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<String, Object>>(linkedHashTreeMap_Node0, linkedHashTreeMap0, 20, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Object, LinkedHashTreeMap<String, Object>> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.first();
      assertNotNull(linkedHashTreeMap_Node2);
      
      boolean boolean0 = linkedHashTreeMap_Node2.equals(linkedHashTreeMap_Node1);
      assertTrue(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedHashTreeMap.Node<Map.Entry<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<String, Object>>, Comparable<Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Map.Entry<AbstractMap.SimpleImmutableEntry<Object, Object>, AbstractMap.SimpleEntry<String, Object>>, Comparable<Object>>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Object, String>, String>(comparator0);
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap0);
      assertEquals(0, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedHashTreeMap<Comparable<Integer>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Comparable<Integer>, Integer>();
      Set<Comparable<Integer>> set0 = linkedHashTreeMap0.keySet();
      assertNotNull(set0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, Object>>(comparator0);
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Object>>();
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, true);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<LinkedHashTreeMap<String, String>, Map.Entry<Object, Integer>> linkedHashTreeMap0 = new LinkedHashTreeMap<LinkedHashTreeMap<String, String>, Map.Entry<Object, Integer>>(comparator0);
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, String>, Map.Entry<Object, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<String, String>, Map.Entry<Object, Integer>>();
      LinkedHashTreeMap<String, String> linkedHashTreeMap1 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap.Node<LinkedHashTreeMap<String, String>, Map.Entry<Object, Integer>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<LinkedHashTreeMap<String, String>, Map.Entry<Object, Integer>>(linkedHashTreeMap_Node0, linkedHashTreeMap1, 1, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
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
  public void test42()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>((Comparator<? super Object>) null);
      linkedHashTreeMap0.findByEntry(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      LinkedHashTreeMap<Integer, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap1 = new LinkedHashTreeMap<Integer, AbstractMap.SimpleImmutableEntry<String, Object>>();
      Integer integer0 = new Integer(0);
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>("com.google.gson.internal.LinkedHashTreeMap$AvlIterator", linkedHashTreeMap0);
      linkedHashTreeMap1.put(integer0, abstractMap_SimpleImmutableEntry0);
      assertEquals(1, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, String> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleImmutableEntry<Object, Object>, String>(comparator0);
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put((AbstractMap.SimpleImmutableEntry<Object, Object>) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Integer, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 1);
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node0;
      LinkedHashTreeMap.Node<Integer, String>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, String>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(2, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<String, Object>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleEntry<String, Object>>();
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleImmutableEntry<String, Object>>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<String, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      int int0 = linkedHashTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      linkedHashTreeMap_KeySet0.iterator();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedHashTreeMap<Object, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      linkedHashTreeMap0.containsValue((Object) null);
      Set<Map.Entry<Object, AbstractMap.SimpleImmutableEntry<Object, Object>>> set0 = (Set<Map.Entry<Object, AbstractMap.SimpleImmutableEntry<Object, Object>>>)linkedHashTreeMap0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, AbstractMap.SimpleEntry<Object, String>>();
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("", ">Zv[R:~/wG&L/n!7h");
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(abstractMap_SimpleImmutableEntry0);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry1 = linkedHashTreeMap_Node0.setValue(abstractMap_SimpleEntry0);
      assertNull(abstractMap_SimpleEntry1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Integer>>(linkedHashTreeMap_Node0, "]1jM,UgQ", 0, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry0 = linkedHashTreeMap_Node1.getValue();
      assertNull(abstractMap_SimpleImmutableEntry0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, String>();
      String string0 = linkedHashTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LinkedHashTreeMap.Node<Integer, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Integer, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 1);
      LinkedHashTreeMap.Node<Integer, String>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Integer, String>[]) linkedHashTreeMap_NodeArray0);
      assertEquals(2, linkedHashTreeMap_NodeArray1.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, String>, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<Integer, String>, Object>();
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<AbstractMap.SimpleEntry<String, Object>, Integer>((Comparator<? super AbstractMap.SimpleEntry<String, Object>>) null);
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Object>(linkedHashTreeMap_Node0);
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
}
