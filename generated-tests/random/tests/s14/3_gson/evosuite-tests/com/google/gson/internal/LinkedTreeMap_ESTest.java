/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 22:21:51 GMT 2019
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedTreeMap;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
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
      LinkedTreeMap<Object, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleEntry<Object, String>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.iterator();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey("");
      assertNull(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      linkedTreeMap0.keySet();
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      Integer integer0 = new Integer(0);
      hashMap0.put(integer0, integer0);
      linkedTreeMap0.putAll(hashMap0);
      linkedTreeMap0.entrySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, Map.Entry<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Integer, Object>, Map.Entry<Object, Integer>>();
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Map.Entry<Object, Integer>, Integer> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<Object, Integer>, Integer>(comparator0);
      boolean boolean0 = linkedTreeMap0.containsKey((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal((LinkedTreeMap.Node<Integer, Integer>) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedTreeMap<Map.Entry<Object, Integer>, Object> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<Object, Integer>, Object>();
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = linkedTreeMap1.header;
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(linkedTreeMap_Node0, linkedTreeMap_Node0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap$Node is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>>();
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, Integer> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, Object>, Integer>(comparator0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Object>(linkedTreeMap_Node0, "N`lpk&~*", linkedTreeMap_Node0, linkedTreeMap_Node0);
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Object>(linkedTreeMap_Node1);
      linkedTreeMap0.find(abstractMap_SimpleEntry0, true);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove("N`lpk&~*");
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      Integer integer0 = new Integer(44);
      boolean boolean0 = linkedTreeMap_KeySet0.remove(integer0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      Set<Map.Entry<String, String>> set0 = (Set<Map.Entry<String, String>>)linkedTreeMap0.entrySet();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(set0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = Integer.getInteger("", (-1));
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>(integer0, integer0);
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(abstractMap_SimpleImmutableEntry0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>((Comparator<? super String>) null);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains((Object) null);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, String>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, linkedTreeMap0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.right = linkedTreeMap_Node0;
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node2 = linkedTreeMap_Node1.first();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node3 = linkedTreeMap_Node2.last();
      assertEquals(0, linkedTreeMap0.size());
      assertNotSame(linkedTreeMap_Node3, linkedTreeMap_Node2);
      assertFalse(linkedTreeMap_Node3.equals((Object)linkedTreeMap_Node2));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedTreeMap.Node<String, AbstractMap.SimpleEntry<String, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, AbstractMap.SimpleEntry<String, String>>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, Integer>>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, Integer>> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleImmutableEntry<Object, Integer>>(linkedTreeMap_Node1, "com.google.gson.internal.LinkedTreeMap$EntrySet", linkedTreeMap_Node1, linkedTreeMap_Node1);
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, Integer>();
      Integer integer0 = linkedTreeMap_Node0.setValue((Integer) null);
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Integer>, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Integer>, String>();
      AbstractMap.SimpleImmutableEntry<Object, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Object, Integer>((Object) null, integer0);
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Integer>, String> linkedTreeMap_Node2 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Integer>, String>(linkedTreeMap_Node1, abstractMap_SimpleImmutableEntry0, linkedTreeMap_Node1, linkedTreeMap_Node1);
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer> linkedTreeMap_Node3 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, Object>, Integer>();
      boolean boolean0 = linkedTreeMap_Node3.equals(linkedTreeMap_Node2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      Integer integer0 = new Integer((-1623));
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Integer>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node2 = linkedTreeMap_Node1.last();
      assertNotNull(linkedTreeMap_Node2);
      
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node3 = linkedTreeMap_Node2.first();
      assertNotNull(linkedTreeMap_Node3);
      
      boolean boolean0 = linkedTreeMap_Node3.equals(linkedTreeMap_Node2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<Integer, Object>, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Integer, Object>, String>();
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>>();
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      Set<String> set0 = linkedTreeMap0.keySet();
      assertNotNull(set0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      Integer integer0 = new Integer(0);
      linkedTreeMap0.containsValue(integer0);
      Set<Map.Entry<Integer, Integer>> set0 = (Set<Map.Entry<Integer, Integer>>)linkedTreeMap0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<LinkedTreeMap<Object, Object>, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, Object>, AbstractMap.SimpleEntry<Object, String>>(comparator0);
      LinkedTreeMap.Node<LinkedTreeMap<Object, Object>, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Object, Object>, AbstractMap.SimpleEntry<Object, String>>();
      LinkedTreeMap<Object, Object> linkedTreeMap1 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<LinkedTreeMap<Object, Object>, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<LinkedTreeMap<Object, Object>, AbstractMap.SimpleEntry<Object, String>>(linkedTreeMap_Node0, linkedTreeMap1, linkedTreeMap_Node0, linkedTreeMap_Node0);
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
  public void test23()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap<String, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Object, String>, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, String>, AbstractMap.SimpleEntry<Object, String>>();
      LinkedTreeMap<Object, String> linkedTreeMap1 = new LinkedTreeMap<Object, String>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.find(linkedTreeMap1, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, String>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, linkedTreeMap0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(19).when(comparator0).compare(anyString() , anyString());
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>(comparator0);
      linkedTreeMap1.put("null=null", linkedTreeMap_Node1.right);
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap1.computeIfPresent("null=null", biFunction0);
      assertEquals(1, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, String>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, linkedTreeMap0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1014)).when(comparator0).compare(anyString() , anyString());
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>(comparator0);
      linkedTreeMap1.put("null=null", linkedTreeMap_Node1.right);
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap1.computeIfPresent("null=null", biFunction0);
      assertEquals(1, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedTreeMap<Integer, Integer> linkedTreeMap1 = new LinkedTreeMap<Integer, Integer>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      linkedTreeMap1.root = linkedTreeMap_Node0;
      linkedTreeMap1.findByObject(linkedTreeMap0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Integer, Object>, String>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node0, linkedTreeMap0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.right = linkedTreeMap_Node0;
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(anyString() , anyString());
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>(comparator0);
      linkedTreeMap1.put("null=null", linkedTreeMap_Node1.right);
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      linkedTreeMap1.computeIfPresent("null=null", biFunction0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Map.Entry<Object, Integer>, String> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<Object, Integer>, String>(comparator0);
      linkedTreeMap0.remove((Object) linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>((Comparator<? super Object>) null);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((Object) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Integer integer0 = Integer.getInteger("", (-1));
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Integer, Integer>>(comparator0);
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>(integer0, integer0);
      linkedTreeMap0.put("", abstractMap_SimpleImmutableEntry0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains("");
      assertEquals(1, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Map.Entry<Object, Integer>> linkedTreeMap0 = new LinkedTreeMap<Object, Map.Entry<Object, Integer>>(comparator0);
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      Integer integer0 = new Integer(0);
      Integer integer1 = hashMap0.put(integer0, integer0);
      linkedTreeMap0.putAll(hashMap0);
      boolean boolean0 = linkedTreeMap0.containsValue(integer1);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<Object, Object>>();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = linkedTreeMap_Node0.getValue();
      assertNull(abstractMap_SimpleEntry0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Integer>();
      String string0 = linkedTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedTreeMap.Node<LinkedTreeMap<Integer, Object>, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<LinkedTreeMap<Integer, Object>, Integer>();
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = linkedTreeMap_Node0.getKey();
      assertNull(linkedTreeMap0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Integer, Integer>> linkedTreeMap0 = new LinkedTreeMap<String, AbstractMap.SimpleImmutableEntry<Integer, Integer>>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<String, Object>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}
