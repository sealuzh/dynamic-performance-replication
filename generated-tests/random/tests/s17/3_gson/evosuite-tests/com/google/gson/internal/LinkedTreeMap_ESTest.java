/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 01:26:39 GMT 2019
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
      LinkedTreeMap.Node<LinkedTreeMap<Object, Integer>, LinkedTreeMap<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Object, Integer>, LinkedTreeMap<String, Object>>();
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap<String, Object> linkedTreeMap1 = linkedTreeMap_Node0.setValue(linkedTreeMap0);
      assertEquals(0, linkedTreeMap0.size());
      assertNull(linkedTreeMap1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, String>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, String>, String>();
      String string0 = linkedTreeMap_Node0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<String, String>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<String, String>, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedTreeMap<Integer, Object> linkedTreeMap1 = new LinkedTreeMap<Integer, Object>();
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      linkedTreeMap1.root = linkedTreeMap_Node0;
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node1 = linkedTreeMap1.removeInternalByKey(linkedTreeMap0);
      assertNull(linkedTreeMap_Node1);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Object>();
      Integer integer0 = new Integer(1);
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Object> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey(integer0);
      assertNull(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<String, String>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<String, String>, AbstractMap.SimpleEntry<Object, Object>>();
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>(comparator0);
      linkedTreeMap1.putIfAbsent("kt", linkedTreeMap0);
      linkedTreeMap1.keySet();
      assertEquals(1, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      Integer integer0 = Integer.valueOf(1);
      linkedTreeMap0.put("", integer0);
      linkedTreeMap0.entrySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      linkedTreeMap0.remove((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      linkedTreeMap0.get(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedTreeMap<Object, AbstractMap.SimpleEntry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleEntry<Integer, Integer>>();
      LinkedTreeMap.Node<String, Map.Entry<String, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Map.Entry<String, String>>();
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, Integer> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, Integer>();
      LinkedTreeMap<Object, String> linkedTreeMap1 = new LinkedTreeMap<Object, String>();
      boolean boolean0 = linkedTreeMap0.containsKey(linkedTreeMap1);
      assertEquals(0, linkedTreeMap1.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>(comparator0);
      Integer integer0 = new Integer(0);
      linkedTreeMap0.find(integer0, true);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Map.Entry<String, String>, String>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Map.Entry<String, String>, String>, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, Object>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap1 = new LinkedTreeMap<Object, String>(comparator1);
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap1);
      assertEquals(0, linkedTreeMap1.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap<Object, AbstractMap.SimpleEntry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleEntry<Integer, Integer>>();
      LinkedTreeMap.Node<String, Map.Entry<String, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Map.Entry<String, String>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains((Object) null);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<Object, Integer>, LinkedTreeMap<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Object, Integer>, LinkedTreeMap<String, Object>>();
      LinkedTreeMap.Node<LinkedTreeMap<Object, Integer>, LinkedTreeMap<String, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<LinkedTreeMap<Object, Integer>, LinkedTreeMap<String, Object>>();
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      LinkedTreeMap.Node<LinkedTreeMap<Object, Integer>, LinkedTreeMap<String, Object>> linkedTreeMap_Node2 = linkedTreeMap_Node0.last();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedTreeMap.Node<String, LinkedTreeMap<Object, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, LinkedTreeMap<Object, Integer>>();
      LinkedTreeMap.Node<String, LinkedTreeMap<Object, Integer>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, LinkedTreeMap<Object, Integer>>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      LinkedTreeMap.Node<String, LinkedTreeMap<Object, Integer>> linkedTreeMap_Node2 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, String>, LinkedTreeMap<Object, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, String>, LinkedTreeMap<Object, Integer>>();
      Integer integer0 = Integer.valueOf(2588);
      AbstractMap.SimpleImmutableEntry<Integer, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, String>(integer0, "com.google.gson.internal.LinkedTreeMap");
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, String>, LinkedTreeMap<Object, Integer>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, String>, LinkedTreeMap<Object, Integer>>(linkedTreeMap_Node0, abstractMap_SimpleImmutableEntry0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Object>(linkedTreeMap_Node0, ",OHLQ]1I5l>^+Y+", linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<Map.Entry<String, String>, Integer>> linkedTreeMap_Node2 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<Map.Entry<String, String>, Integer>>();
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Object>(linkedTreeMap_Node0, "m:}e_?M2;}q#m0[7", linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node2 = new LinkedTreeMap.Node<String, Object>(linkedTreeMap_Node0, "m:}e_?M2;}q#m0[7", linkedTreeMap_Node1, linkedTreeMap_Node1);
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object>();
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<String, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>(comparator0);
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap0);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      Set<String> set0 = linkedTreeMap0.keySet();
      assertNotNull(set0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.replaceAll(biFunction0);
      Set<Map.Entry<String, Integer>> set0 = (Set<Map.Entry<String, Integer>>)linkedTreeMap0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedTreeMap<Map.Entry<String, Map.Entry<String, String>>, AbstractMap.SimpleImmutableEntry<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<String, Map.Entry<String, String>>, AbstractMap.SimpleImmutableEntry<Integer, Object>>();
      LinkedTreeMap.Node<Map.Entry<String, Map.Entry<String, String>>, AbstractMap.SimpleImmutableEntry<Integer, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Map.Entry<String, Map.Entry<String, String>>, AbstractMap.SimpleImmutableEntry<Integer, Object>>();
      linkedTreeMap_Node0.right = linkedTreeMap_Node0;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Integer integer0 = new Integer(1);
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<Object, Object>>();
      AbstractMap.SimpleImmutableEntry<Integer, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, String>(integer0, "");
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Integer, String>, AbstractMap.SimpleImmutableEntry<Object, Object>>(linkedTreeMap_Node0, abstractMap_SimpleImmutableEntry0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.left = linkedTreeMap_Node0;
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
  public void test27()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, LinkedTreeMap<Object, String>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, LinkedTreeMap<Object, String>>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, LinkedTreeMap<Object, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, String>, LinkedTreeMap<Object, String>>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0.next, false);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap<Map.Entry<String, Object>, AbstractMap.SimpleImmutableEntry<Integer, String>> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<String, Object>, AbstractMap.SimpleImmutableEntry<Integer, String>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Object>(linkedTreeMap_Node0, ":P9x7]/W':!jaG5|2", linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node1);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap<Map.Entry<String, Object>, Map.Entry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<String, Object>, Map.Entry<String, Object>>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Object>(linkedTreeMap_Node0, "m:}e_?M2;}q#m0[7", linkedTreeMap_Node0, linkedTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(linkedTreeMap_Node1, linkedTreeMap_Node0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap$Node is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(comparator0).compare(any() , any());
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>(comparator0);
      Integer integer0 = new Integer(0);
      linkedTreeMap0.find(integer0, true);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Map.Entry<String, String>, String>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Map.Entry<String, String>, String>, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap_Node0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleImmutableEntry<String, String>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleImmutableEntry<String, String>>(comparator0);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedTreeMap0, "kfGYe");
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry1 = new AbstractMap.SimpleEntry<Object, String>(abstractMap_SimpleEntry0);
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>("", "5");
      linkedTreeMap0.putIfAbsent(abstractMap_SimpleEntry1, abstractMap_SimpleImmutableEntry0);
      linkedTreeMap0.find(abstractMap_SimpleEntry1, true);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Map.Entry<String, String>>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Map.Entry<String, String>>, String>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((AbstractMap.SimpleImmutableEntry<Integer, Map.Entry<String, String>>) null, "Tx%W!-@bsS?DIUEDaV$");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>();
      BiFunction<String, Object, Map.Entry<String, String>> biFunction0 = (BiFunction<String, Object, Map.Entry<String, String>>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(anyString() , any());
      BiFunction<Object, Object, String> biFunction1 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap1.merge("gLf)Z xZ\"1yq", linkedTreeMap_EntrySet0, biFunction1);
      linkedTreeMap1.computeIfPresent("gLf)Z xZ\"1yq", biFunction0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Object, String>, String> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, String>, String>((Comparator<? super LinkedTreeMap<Object, String>>) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>(comparator0);
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      Integer integer0 = Integer.valueOf(1);
      linkedTreeMap0.put("", integer0);
      linkedTreeMap0.replaceAll(biFunction0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedTreeMap.Node<Map.Entry<String, String>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Map.Entry<String, String>, Object>();
      String string0 = linkedTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedTreeMap.Node<Map.Entry<String, Object>, Map.Entry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Map.Entry<String, Object>, Map.Entry<String, Object>>();
      Map.Entry<String, Object> map_Entry0 = linkedTreeMap_Node0.getKey();
      assertNull(map_Entry0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Map.Entry<String, String>> linkedTreeMap0 = new LinkedTreeMap<Integer, Map.Entry<String, String>>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, LinkedTreeMap<Object, Object>> linkedTreeMap1 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, LinkedTreeMap<Object, Object>>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet1 = linkedTreeMap1.new KeySet();
      linkedTreeMap_KeySet1.containsAll(linkedTreeMap_KeySet0);
      assertEquals(0, linkedTreeMap_KeySet1.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, Object> linkedTreeMap1 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap1.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains(linkedTreeMap_EntrySet0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedTreeMap<Map.Entry<Object, Object>, String> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<Object, Object>, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleImmutableEntry<String, String>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleImmutableEntry<String, String>>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedTreeMap<Integer, Map.Entry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, Map.Entry<String, Object>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}
