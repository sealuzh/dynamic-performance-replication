/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 18:53:13 GMT 2018
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedTreeMap;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedTreeMap_ESTest extends LinkedTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node1 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node1);
      
      String string0 = linkedTreeMap_Node1.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.putIfAbsent("", "");
      linkedTreeMap0.keySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.find(linkedTreeMap_Node0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap$Node is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains((Object) null);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>((Comparator<? super String>) null);
      boolean boolean0 = linkedTreeMap0.containsKey((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node0 = linkedTreeMap0.find("x2D{9k", true);
      assertEquals(1, linkedTreeMap0.size());
      
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = linkedTreeMap0.removeInternalByKey("x2D{9k");
      assertSame(linkedTreeMap_Node1, linkedTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>();
      linkedTreeMap1.remove((Object) linkedTreeMap0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap1 = new LinkedTreeMap<String, String>(comparator1);
      BiFunction<String, String, String> biFunction0 = (BiFunction<String, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.merge(linkedTreeMap1, "", biFunction0);
      LinkedTreeMap<Object, String> linkedTreeMap2 = new LinkedTreeMap<Object, String>();
      linkedTreeMap0.get(linkedTreeMap2);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.putIfAbsent((Object) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2), (-2), (-2), (-2), (-2)).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>();
      linkedTreeMap0.put(linkedTreeMap1, "x2D{9k");
      linkedTreeMap0.put("x2D{9k", "x2D{9k");
      BiFunction<String, Object, String> biFunction0 = (BiFunction<String, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      String string0 = linkedTreeMap0.merge(linkedTreeMap1, "x2D{9k", biFunction0);
      assertEquals("x2D{9k", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>();
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node0;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = linkedTreeMap_Node0.last();
      assertNotNull(linkedTreeMap_Node1);
      
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node2 = new LinkedTreeMap.Node<String, Object>(linkedTreeMap_Node1, "6~]kIw9#|5EHOzTZ4", linkedTreeMap_Node0, linkedTreeMap_Node1);
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertFalse(linkedTreeMap_Node0.equals((Object)linkedTreeMap_Node2));
      
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>();
      linkedTreeMap_Node0.parent = linkedTreeMap_Node1;
      linkedTreeMap_Node0.right = linkedTreeMap_Node0;
      linkedTreeMap_Node0.left = linkedTreeMap_Node0;
      // Undeclared exception!
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Set<Map.Entry<Object, Object>> set0 = (Set<Map.Entry<Object, Object>>)linkedTreeMap0.entrySet();
      assertNotNull(set0);
      
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.replaceAll(biFunction0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Object>(linkedTreeMap_Node0, "", linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node1);
      assertFalse(boolean0);
      assertFalse(linkedTreeMap_Node1.equals((Object)linkedTreeMap_Node0));
      
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(11, 11, 11, 11, 11).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>();
      linkedTreeMap0.put(linkedTreeMap1, "x2D{9k");
      linkedTreeMap0.put("x2D{9k", "x2D{9k");
      BiFunction<String, Object, String> biFunction0 = (BiFunction<String, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      String string0 = linkedTreeMap0.merge(linkedTreeMap1, "x2D{9k", biFunction0);
      assertEquals("x2D{9k", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>();
      linkedTreeMap0.put("x2D{9k", "x2D{9k");
      linkedTreeMap0.put("x2D{9k", ")9EM90UCsx7M=");
      assertEquals(1, linkedTreeMap0.size());
      
      BiFunction<String, Object, String> biFunction0 = (BiFunction<String, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(anyString() , any());
      linkedTreeMap0.merge(linkedTreeMap1, ")9EM90UCsx7M=", biFunction0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node2 = linkedTreeMap_Node1.last();
      linkedTreeMap_Node0.parent = linkedTreeMap_Node2;
      linkedTreeMap_Node0.right = linkedTreeMap_Node2;
      linkedTreeMap_Node0.left = linkedTreeMap_Node2;
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      linkedTreeMap_Node1.parent = linkedTreeMap_Node0;
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      linkedTreeMap0.find((String) null, true);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.contains((Object) null);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      Comparator<String> comparator1 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Integer> linkedTreeMap1 = new LinkedTreeMap<String, Integer>(comparator1);
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = linkedTreeMap1.find("", true);
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>();
      linkedTreeMap_Node0.parent = linkedTreeMap_Node1;
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      linkedTreeMap_Node0.left = linkedTreeMap_Node0.parent;
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1, 1, (-2)).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap1 = new LinkedTreeMap<Integer, String>(comparator1);
      LinkedTreeMap<Object, Integer> linkedTreeMap2 = new LinkedTreeMap<Object, Integer>();
      linkedTreeMap0.put(linkedTreeMap2, "x2D{9k");
      BiFunction<Object, String, String> biFunction0 = (BiFunction<Object, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.merge(linkedTreeMap1, "x2D{9k", biFunction0);
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = linkedTreeMap0.find("x2D{9k", true);
      assertNotNull(linkedTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator1);
      linkedTreeMap_Node0.value = (Object) linkedTreeMap0;
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
      
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>(comparator0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = linkedTreeMap0.header;
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      Set<Object> set0 = linkedTreeMap0.keySet();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      // Undeclared exception!
      try { 
        linkedTreeMap_EntrySet0.retainAll(set0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      Integer integer0 = new Integer(2740);
      BiFunction<Object, String, String> biFunction0 = (BiFunction<Object, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.merge(integer0, "se~6|8-{I;@Olw3", biFunction0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet1 = linkedTreeMap0.new EntrySet();
      // Undeclared exception!
      try { 
        linkedTreeMap0.find((Object) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = linkedTreeMap0.header;
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Object>();
      Integer integer0 = new Integer(613);
      Object object0 = linkedTreeMap_Node1.setValue(linkedTreeMap_Node0);
      assertNull(object0);
      
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node2 = new LinkedTreeMap.Node<String, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node3 = linkedTreeMap_Node2.first();
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node3);
      assertFalse(boolean0);
      
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>();
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, "ll,", linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node2 = linkedTreeMap_Node1.last();
      boolean boolean1 = linkedTreeMap_Node2.equals(linkedTreeMap_Node1);
      assertFalse(boolean1 == boolean0);
      
      LinkedTreeMap<Integer, String> linkedTreeMap1 = new LinkedTreeMap<Integer, String>();
      linkedTreeMap1.findByEntry(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      Integer integer0 = new Integer(4765);
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Integer>((String) null, integer0);
      boolean boolean0 = linkedTreeMap_Node0.equals(abstractMap_SimpleImmutableEntry0);
      assertFalse(boolean0);
      
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = linkedTreeMap0.header;
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, (Object) null, linkedTreeMap_Node0, linkedTreeMap_Node0);
      Set<Object> set0 = linkedTreeMap0.keySet();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      // Undeclared exception!
      try { 
        linkedTreeMap_EntrySet0.retainAll(set0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      linkedTreeMap0.clear();
      Integer integer0 = new Integer(0);
      BiConsumer<Object, Object> biConsumer0 = (BiConsumer<Object, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.forEach(biConsumer0);
      linkedTreeMap0.find(integer0, true);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedTreeMap_KeySet0.retainAll(linkedList0);
      linkedTreeMap_KeySet0.iterator();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet1 = linkedTreeMap0.new KeySet();
      // Undeclared exception!
      try { 
        linkedTreeMap_KeySet1.add("");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap0.entrySet();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = linkedTreeMap0.header;
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node2 = new LinkedTreeMap.Node<String, Object>();
      linkedTreeMap_Node1.right = linkedTreeMap_Node2;
      linkedTreeMap_Node1.last();
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node3 = new LinkedTreeMap.Node<Integer, Object>();
      Object object0 = linkedTreeMap_Node3.setValue(linkedTreeMap_Node2);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = linkedTreeMap0.header;
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.putAll(linkedTreeMap0);
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, "", linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap0.keySet();
      Set<Object> set0 = linkedTreeMap0.keySet();
      assertNotNull(set0);
      
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(comparator0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node2 = linkedTreeMap_Node1.last();
      linkedTreeMap_Node0.parent = linkedTreeMap_Node2;
      linkedTreeMap_Node0.right = linkedTreeMap_Node2;
      linkedTreeMap_Node0.height = 951;
      linkedTreeMap_Node0.left = linkedTreeMap_Node0;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      assertEquals((-1), linkedTreeMap0.size());
      
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>();
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = linkedTreeMap0.find(linkedTreeMap0, true);
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = linkedTreeMap_Node0.last();
      linkedTreeMap0.containsKey(linkedTreeMap_Node0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Object> linkedTreeMap1 = new LinkedTreeMap<Integer, Object>(comparator1);
      linkedTreeMap1.findByObject(linkedTreeMap_Node1);
      assertEquals(1, linkedTreeMap0.size());
      
      LinkedTreeMap<Object, String> linkedTreeMap2 = new LinkedTreeMap<Object, String>();
      assertEquals(0, linkedTreeMap2.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      Integer integer0 = new Integer(2728);
      BiFunction<Object, String, String> biFunction0 = (BiFunction<Object, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.merge(integer0, "a", biFunction0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet1 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet1.retainAll(linkedTreeMap_EntrySet0);
      assertEquals(1, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1, 1, 1, (-2), 0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap1 = new LinkedTreeMap<Integer, String>(comparator1);
      LinkedTreeMap<Object, Integer> linkedTreeMap2 = new LinkedTreeMap<Object, Integer>();
      linkedTreeMap0.put(linkedTreeMap2, "x2D{9k");
      BiFunction<Object, String, String> biFunction0 = (BiFunction<Object, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.merge(linkedTreeMap1, "x2D{9k", biFunction0);
      BiFunction<Object, String, String> biFunction1 = (BiFunction<Object, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.merge("x2D{9k", " is not Comparable", biFunction1);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      boolean boolean0 = linkedTreeMap_EntrySet0.retainAll(linkedList0);
      assertEquals(0, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      linkedTreeMap0.put("x2D{9k", "x2D{9k");
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Integer>();
      hashMap0.put(linkedTreeMap_Node1, (String) null);
      Set<Object> set0 = hashMap0.keySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.retainAll(set0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertTrue(boolean0);
  }
}
