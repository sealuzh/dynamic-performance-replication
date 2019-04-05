/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 12:15:17 GMT 2019
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedTreeMap;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Iterator;
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
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      String string0 = linkedTreeMap_Node0.setValue("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Integer>(linkedTreeMap_Node0, "com.google.gson.internal.LinkedTreeMap$EntrySet", linkedTreeMap_Node0, linkedTreeMap_Node0);
      Integer integer0 = linkedTreeMap_Node1.getValue();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, LinkedTreeMap<Object, Integer>>();
      Object object0 = linkedTreeMap_Node0.next.getKey();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap<Object, Comparable<String>> linkedTreeMap0 = new LinkedTreeMap<Object, Comparable<String>>((Comparator<? super Object>) null);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>();
      linkedTreeMap1.find("", true);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap1.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap_EntrySet0);
      assertEquals(1, linkedTreeMap1.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap<String, Comparable<Object>> linkedTreeMap0 = new LinkedTreeMap<String, Comparable<Object>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap1 = new LinkedTreeMap<Object, Object>(comparator0);
      linkedTreeMap1.putIfAbsent(linkedTreeMap0, "4t6Mnu O4n");
      int int0 = linkedTreeMap1.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap0.putIfAbsent("Kn0ui+S:H", "Kn0ui+S:H");
      linkedTreeMap0.removeInternalByKey("Kn0ui+S:H");
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap0.putIfAbsent("Kn0ui+S:H", "Kn0ui+S:H");
      Integer integer0 = new Integer(3384);
      linkedTreeMap0.put("Kn0ui+S:H", integer0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>((Comparator<? super Object>) null);
      linkedTreeMap0.size = 2293;
      Set<Object> set0 = linkedTreeMap0.keySet();
      assertFalse(set0.contains(2293));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedTreeMap<Integer, LinkedTreeMap<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<Integer, LinkedTreeMap<Object, Integer>>();
      LinkedTreeMap.Node<Integer, LinkedTreeMap<Object, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, LinkedTreeMap<Object, Integer>>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      linkedTreeMap0.keySet();
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<LinkedTreeMap<Integer, Integer>, Integer> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Integer, Integer>, Integer>(comparator0);
      linkedTreeMap0.find((LinkedTreeMap<Integer, Integer>) null, true);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>(comparator0);
      Set<Map.Entry<String, Integer>> set0 = (Set<Map.Entry<String, Integer>>)linkedTreeMap0.entrySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer((-652));
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>(comparator0);
      linkedTreeMap0.putIfAbsent("PT6Sg,GG<%%@g#", integer0);
      linkedTreeMap0.entrySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey((Object) null);
      assertNull(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Object>();
      AbstractMap.SimpleImmutableEntry<Object, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, String>(linkedTreeMap_Node0, "");
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Object>(linkedTreeMap_Node0, abstractMap_SimpleImmutableEntry0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>(comparator0);
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node2 = linkedTreeMap0.removeInternalByKey(linkedTreeMap_Node1);
      assertEquals(0, linkedTreeMap0.size());
      assertNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap<String, Comparable<Object>> linkedTreeMap0 = new LinkedTreeMap<String, Comparable<Object>>();
      linkedTreeMap0.remove((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Object>();
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, AbstractMap.SimpleEntry<String, Object>>();
      linkedTreeMap0.remove((Object) linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleImmutableEntry<Object, Object>>(comparator0);
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Integer>(linkedTreeMap_Node0);
      linkedTreeMap0.put(abstractMap_SimpleEntry0, (AbstractMap.SimpleImmutableEntry<Object, Object>) null);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedTreeMap<Object, String>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedTreeMap<Object, String>>();
      LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap1 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<Object, String>>();
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedTreeMap0, "");
      linkedTreeMap1.put("", abstractMap_SimpleEntry0);
      assertEquals(1, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, String>(comparator0);
      linkedTreeMap0.get((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, AbstractMap.SimpleImmutableEntry<Object, String>>();
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap0.get(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedTreeMap<Object, AbstractMap.SimpleEntry<String, String>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleEntry<String, String>>();
      linkedTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, String>(comparator0);
      linkedTreeMap0.findByObject(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Object>();
      LinkedTreeMap<LinkedTreeMap<Integer, Integer>, Integer> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Integer, Integer>, Integer>();
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      Iterator<Map.Entry<String, Object>> iterator0 = (Iterator<Map.Entry<String, Object>>)linkedTreeMap_EntrySet0.iterator();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, Object> linkedTreeMap1 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, Object>(comparator0);
      AbstractMap.SimpleEntry<Integer, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Object>((Integer) null, iterator0);
      linkedTreeMap1.find(abstractMap_SimpleEntry0, false);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedTreeMap<Object, String>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedTreeMap<Object, String>>();
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Object>();
      boolean boolean0 = linkedTreeMap0.containsKey(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedTreeMap<Object, String>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedTreeMap<Object, String>>();
      Integer integer0 = new Integer(1410);
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, String>, Object> linkedTreeMap1 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, String>, Object>();
      AbstractMap.SimpleEntry<Integer, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, String>(integer0, "");
      // Undeclared exception!
      try { 
        linkedTreeMap1.put(abstractMap_SimpleEntry0, linkedTreeMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedTreeMap<Integer, Comparable<String>> linkedTreeMap0 = new LinkedTreeMap<Integer, Comparable<String>>();
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
  public void test27()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.find((Object) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedTreeMap<Object, String>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedTreeMap<Object, String>>();
      Object object0 = new Object();
      linkedTreeMap0.containsValue(object0);
      BiFunction<Object, Object, LinkedTreeMap<Object, String>> biFunction0 = (BiFunction<Object, Object, LinkedTreeMap<Object, String>>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.replaceAll(biFunction0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, Integer> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, Integer>();
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedTreeMap<Object, String>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedTreeMap<Object, String>>();
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      Iterator<Map.Entry<String, Object>> iterator0 = (Iterator<Map.Entry<String, Object>>)linkedTreeMap_EntrySet0.iterator();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(iterator0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap.Node<Comparable<Object>, LinkedTreeMap<Integer, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Object>, LinkedTreeMap<Integer, Object>>();
      LinkedTreeMap.Node<Comparable<Object>, LinkedTreeMap<Integer, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Comparable<Object>, LinkedTreeMap<Integer, Object>>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      LinkedTreeMap.Node<Comparable<Object>, LinkedTreeMap<Integer, Object>> linkedTreeMap_Node2 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Object>();
      linkedTreeMap_Node0.value = (Object) "";
      LinkedTreeMap.Node<Integer, Comparable<Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Comparable<Object>>();
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Integer integer0 = new Integer((-1897));
      LinkedTreeMap.Node<Integer, Comparable<Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Comparable<Object>>();
      LinkedTreeMap.Node<Integer, Comparable<Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Comparable<Object>>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedTreeMap.Node<Integer, LinkedTreeMap<Object, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, LinkedTreeMap<Object, Integer>>();
      LinkedTreeMap.Node<Integer, Comparable<Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Comparable<Object>>();
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Integer integer0 = new Integer(1429);
      LinkedTreeMap.Node<Integer, Comparable<Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Comparable<Object>>();
      LinkedTreeMap.Node<Integer, Comparable<Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Comparable<Object>>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Integer integer0 = new Integer((-652));
      LinkedTreeMap.Node<LinkedTreeMap<String, Object>, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<String, Object>, AbstractMap.SimpleImmutableEntry<Object, String>>();
      boolean boolean0 = linkedTreeMap_Node0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>(comparator0);
      linkedTreeMap0.keySet();
      Set<Object> set0 = linkedTreeMap0.keySet();
      assertEquals(0, set0.size());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>>(linkedTreeMap_Node0, linkedTreeMap0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node2 = linkedTreeMap_Node1.first();
      assertNotNull(linkedTreeMap_Node2);
      
      String string0 = linkedTreeMap_Node2.toString();
      assertEquals("{}=null", string0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedTreeMap.Node<Comparable<Object>, LinkedTreeMap<Integer, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Object>, LinkedTreeMap<Integer, Object>>();
      LinkedTreeMap.Node<Comparable<Object>, LinkedTreeMap<Integer, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Comparable<Object>, LinkedTreeMap<Integer, Object>>(linkedTreeMap_Node0, (Comparable<Object>) null, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      linkedTreeMap_Node1.right = linkedTreeMap_Node0;
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<Object>, LinkedTreeMap<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, LinkedTreeMap<Integer, Object>>(comparator0);
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0.right, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedTreeMap.Node<Comparable<Object>, LinkedTreeMap<Integer, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Comparable<Object>, LinkedTreeMap<Integer, Object>>();
      LinkedTreeMap.Node<Comparable<Object>, LinkedTreeMap<Integer, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Comparable<Object>, LinkedTreeMap<Integer, Object>>(linkedTreeMap_Node0, (Comparable<Object>) null, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      LinkedTreeMap.Node<Comparable<Object>, LinkedTreeMap<Integer, Object>> linkedTreeMap_Node2 = linkedTreeMap_Node0.last();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Comparable<Object>, LinkedTreeMap<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<Comparable<Object>, LinkedTreeMap<Integer, Object>>(comparator0);
      linkedTreeMap0.removeInternal(linkedTreeMap_Node2, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, String>(linkedTreeMap_Node0, "", linkedTreeMap_Node0, linkedTreeMap_Node0);
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
  public void test44()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedTreeMap<Object, String>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedTreeMap<Object, String>>();
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedTreeMap<Object, String>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedTreeMap<Object, String>>();
      boolean boolean0 = linkedTreeMap0.containsKey((Object) null);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedTreeMap<Object, String>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, LinkedTreeMap<Object, String>>();
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>();
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
  public void test47()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>((Comparator<? super String>) null);
      linkedTreeMap0.putIfAbsent("$!hffZ", integer0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove("pPM),;-ua/");
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap0.putIfAbsent("Kn0ui+S:H", "Kn0ui+S:H");
      linkedTreeMap0.removeInternalByKey("E");
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      Integer integer0 = new Integer((-1114));
      linkedTreeMap0.putIfAbsent("", integer0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      assertEquals(1, linkedTreeMap0.size());
      
      boolean boolean0 = linkedTreeMap_KeySet0.remove("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, Object>();
      LinkedTreeMap<Object, Object> linkedTreeMap1 = new LinkedTreeMap<Object, Object>();
      // Undeclared exception!
      try { 
        linkedTreeMap1.put((Object) null, linkedTreeMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      linkedTreeMap0.putIfAbsent("Kn0ui+S:H", "Kn0ui+S:H");
      LinkedTreeMap<String, String> linkedTreeMap1 = new LinkedTreeMap<String, String>();
      BiFunction<Object, Object, Object> biFunction0 = (BiFunction<Object, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      linkedTreeMap0.computeIfPresent(linkedTreeMap1, biFunction0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>((Comparator<? super String>) null);
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal(linkedTreeMap_Node0.right, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Integer>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Integer>, Object>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap0.putIfAbsent("Kn0ui+S:H", "Kn0ui+S:H");
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      linkedTreeMap0.replaceAll(biFunction0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, String>(linkedTreeMap_Node0, "e^>JAO", linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<String, Object>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, String>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, Object>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}
