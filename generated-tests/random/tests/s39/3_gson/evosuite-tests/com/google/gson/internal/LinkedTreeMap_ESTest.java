/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 23:52:14 GMT 2019
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
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedTreeMap_ESTest extends LinkedTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      String string0 = linkedTreeMap_Node0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, LinkedTreeMap<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, LinkedTreeMap<Object, Object>>();
      Object object0 = linkedTreeMap_Node0.getKey();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      linkedTreeMap0.size = 2270;
      int int0 = linkedTreeMap0.size();
      assertEquals(2270, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<Integer>, Integer> linkedTreeMap0 = new LinkedTreeMap<Comparable<Integer>, Integer>(comparator0);
      LinkedTreeMap<Integer, Object> linkedTreeMap1 = new LinkedTreeMap<Integer, Object>();
      linkedTreeMap1.findByObject(linkedTreeMap0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Object, Integer>>((Comparator<? super String>) null);
      LinkedTreeMap.Node<String, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey((Object) null);
      assertEquals(0, linkedTreeMap0.size());
      assertNull(linkedTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Map.Entry<AbstractMap.SimpleEntry<Object, Object>, Comparable<String>>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, String>, Map.Entry<AbstractMap.SimpleEntry<Object, Object>, Comparable<String>>>(comparator0);
      Object object0 = new Object();
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, String>, Map.Entry<AbstractMap.SimpleEntry<Object, Object>, Comparable<String>>> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey(object0);
      assertNull(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = linkedTreeMap0.find("com.google.gson.internal.LinkedTreeMap", true);
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, LinkedTreeMap<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, LinkedTreeMap<Object, Object>>();
      linkedTreeMap0.remove((Object) linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      linkedTreeMap0.find((Object) null, false);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<Object>, Object> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, Object>(comparator0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal((LinkedTreeMap.Node<Comparable<Object>, Object>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Integer>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, Integer>, String>(comparator0);
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
  public void test14()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      // Undeclared exception!
      try { 
        linkedTreeMap0.find(linkedTreeMap_EntrySet0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap$EntrySet is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<LinkedTreeMap<String, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<String, Object>, Object>(comparator0);
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      UnaryOperator<Object> unaryOperator0 = UnaryOperator.identity();
      linkedTreeMap0.computeIfAbsent("b2vZnD?t!,p", unaryOperator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, LinkedTreeMap<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, LinkedTreeMap<Object, Object>>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      LinkedTreeMap<Integer, Integer> linkedTreeMap1 = new LinkedTreeMap<Integer, Integer>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet1 = linkedTreeMap1.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet1.remove(linkedTreeMap_KeySet0);
      assertEquals(0, linkedTreeMap_KeySet1.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<Integer>, Comparable<String>> linkedTreeMap0 = new LinkedTreeMap<Comparable<Integer>, Comparable<String>>(comparator0);
      Integer integer0 = new Integer(1);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(integer0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>((Comparator<? super Object>) null);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains("q?M6}jYu,");
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>();
      Integer integer0 = new Integer(1);
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node1, integer0, linkedTreeMap_Node0, linkedTreeMap_Node1);
      linkedTreeMap_Node0.right = linkedTreeMap_Node2;
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node3 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node3);
      
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node4 = linkedTreeMap_Node3.last();
      assertNotSame(linkedTreeMap_Node4, linkedTreeMap_Node3);
      assertFalse(linkedTreeMap_Node4.equals((Object)linkedTreeMap_Node3));
      assertNotNull(linkedTreeMap_Node4);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node0;
      // Undeclared exception!
      linkedTreeMap_Node0.first();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedTreeMap.Node<String, Comparable<String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Comparable<String>>();
      LinkedTreeMap.Node<String, Comparable<String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Comparable<String>>(linkedTreeMap_Node0, "4<0PJ]$H\u0000+", linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<String, Comparable<String>> linkedTreeMap_Node2 = linkedTreeMap_Node1.first();
      assertNotNull(linkedTreeMap_Node2);
      
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, LinkedTreeMap<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, LinkedTreeMap<Object, Object>>();
      LinkedTreeMap.Node<Integer, Map.Entry<Integer, Integer>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Map.Entry<Integer, Integer>>();
      Integer integer0 = new Integer(1287);
      LinkedTreeMap.Node<Integer, Map.Entry<Integer, Integer>> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Integer, Map.Entry<Integer, Integer>>(linkedTreeMap_Node1, integer0, linkedTreeMap_Node1, linkedTreeMap_Node1);
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, LinkedTreeMap<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Object>, LinkedTreeMap<Object, Object>>();
      Integer integer0 = linkedTreeMap0.remove((Object) null);
      LinkedTreeMap.Node<Integer, Map.Entry<Integer, Integer>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Map.Entry<Integer, Integer>>();
      LinkedTreeMap.Node<Integer, Map.Entry<Integer, Integer>> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Integer, Map.Entry<Integer, Integer>>(linkedTreeMap_Node1, integer0, linkedTreeMap_Node1, linkedTreeMap_Node1);
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<Integer>, Integer> linkedTreeMap0 = new LinkedTreeMap<Comparable<Integer>, Integer>(comparator0);
      LinkedTreeMap.Node<Comparable<String>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<String>, String>();
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap0);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<Integer>, Integer> linkedTreeMap0 = new LinkedTreeMap<Comparable<Integer>, Integer>(comparator0);
      Set<Comparable<Integer>> set0 = linkedTreeMap0.keySet();
      assertNotNull(set0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      Integer integer0 = new Integer((-1611));
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, String>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
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
  public void test30()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, Object>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, Object>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node0;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>(comparator0);
      Integer integer0 = new Integer((-1000));
      linkedTreeMap0.find(integer0, true);
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>("z#R", "z#R");
      linkedTreeMap0.findByEntry(abstractMap_SimpleImmutableEntry0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedTreeMap<String, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<String, Object>>();
      boolean boolean0 = linkedTreeMap0.containsKey((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Integer, Object>>();
      Integer integer0 = new Integer((-361));
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(integer0, ",>WC07#t\"");
      LinkedTreeMap<Object, String> linkedTreeMap1 = new LinkedTreeMap<Object, String>();
      AbstractMap.SimpleImmutableEntry<Integer, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Object>(integer0, linkedTreeMap1);
      AbstractMap.SimpleEntry<Integer, Object> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Integer, Object>(abstractMap_SimpleImmutableEntry0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(abstractMap_SimpleEntry0, abstractMap_SimpleEntry1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(comparator0).compare(any() , any());
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>(comparator0);
      Integer integer0 = new Integer((-1000));
      linkedTreeMap0.find(integer0, true);
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>("z#R", "z#R");
      linkedTreeMap0.findByEntry(abstractMap_SimpleImmutableEntry0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1820)).when(comparator0).compare(any() , any());
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>(comparator0);
      Integer integer0 = new Integer((-1000));
      linkedTreeMap0.find(integer0, true);
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>("z#R", "z#R");
      linkedTreeMap0.findByEntry(abstractMap_SimpleImmutableEntry0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Integer>(linkedTreeMap_Node0, (String) null, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      linkedTreeMap0.find("com.google.gson.internal.LinkedTreeMap", true);
      linkedTreeMap0.get(linkedTreeMap_Node1.next);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<LinkedTreeMap<String, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<String, Object>, Object>(comparator0);
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>();
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.merge(linkedTreeMap1, linkedTreeMap1, biFunction0);
      linkedTreeMap0.remove((Object) linkedTreeMap1);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedTreeMap<Comparable<String>, Integer> linkedTreeMap0 = new LinkedTreeMap<Comparable<String>, Integer>();
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((Comparable<String>) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      Comparator<String> comparator1 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator1).compare(anyString() , anyString());
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>(comparator1);
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap0, linkedTreeMap0);
      AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleEntry<Object, Object>, Comparable<String>> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<AbstractMap.SimpleEntry<Object, Object>, Comparable<String>>(abstractMap_SimpleEntry0, "");
      linkedTreeMap1.put("", abstractMap_SimpleImmutableEntry0);
      boolean boolean0 = linkedTreeMap1.containsKey(linkedTreeMap_KeySet0);
      assertEquals(1, linkedTreeMap1.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<LinkedTreeMap<Object, String>, String> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, String>, String>(comparator0);
      LinkedTreeMap<Object, String> linkedTreeMap1 = new LinkedTreeMap<Object, String>();
      linkedTreeMap0.find(linkedTreeMap1, true);
      BiFunction<Object, String, String> biFunction0 = (BiFunction<Object, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.computeIfPresent(linkedTreeMap1, biFunction0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedTreeMap<Object, Comparable<Object>> linkedTreeMap0 = new LinkedTreeMap<Object, Comparable<Object>>();
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>();
      linkedTreeMap1.putIfAbsent("Z)u=qI", linkedTreeMap0);
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedTreeMap1.forEach(biConsumer0);
      assertEquals(1, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      String string0 = linkedTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Object>(linkedTreeMap_Node0);
      AbstractMap.SimpleImmutableEntry<Object, Object> abstractMap_SimpleImmutableEntry1 = linkedTreeMap_Node0.setValue(abstractMap_SimpleImmutableEntry0);
      assertNull(abstractMap_SimpleImmutableEntry1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, LinkedTreeMap<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, LinkedTreeMap<Object, Object>>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, LinkedTreeMap<Object, Object>> linkedTreeMap1 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, LinkedTreeMap<Object, Object>>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap1.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Comparable<Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, Comparable<Object>>();
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.forEach(biConsumer0);
      Set<Map.Entry<AbstractMap.SimpleEntry<Object, Object>, Comparable<Object>>> set0 = (Set<Map.Entry<AbstractMap.SimpleEntry<Object, Object>, Comparable<Object>>>)linkedTreeMap0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}
