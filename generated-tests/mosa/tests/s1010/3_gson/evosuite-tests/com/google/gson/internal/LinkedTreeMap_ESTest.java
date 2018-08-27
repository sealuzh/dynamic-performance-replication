/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 01:54:19 GMT 2018
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
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedTreeMap_ESTest extends LinkedTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap1 = new LinkedTreeMap<Object, Object>(comparator0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(linkedTreeMap1, linkedTreeMap1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      LinkedTreeMap<Object, Object> linkedTreeMap1 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap0.remove((Object) linkedTreeMap1);
      assertEquals(0, linkedTreeMap1.size());
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      linkedTreeMap_Node0.toString();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = linkedTreeMap_Node0.last();
      assertNotNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = linkedTreeMap_Node0.last();
      assertNotNull(linkedTreeMap_Node1);
      
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      linkedTreeMap0.get((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node1 = linkedTreeMap_Node0.first();
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      // Undeclared exception!
      linkedTreeMap_Node0.right.last();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      linkedTreeMap0.containsValue(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      linkedTreeMap0.remove((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = linkedTreeMap_Node0.last();
      Object object0 = linkedTreeMap_Node1.setValue(linkedTreeMap0);
      assertNull(object0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer(39);
      linkedTreeMap0.putIfAbsent(integer0, integer0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      assertEquals(1, linkedTreeMap0.size());
      
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Integer>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node2 = linkedTreeMap0.find(linkedTreeMap_Node1, true);
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer(39);
      linkedTreeMap0.putIfAbsent(integer0, integer0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap0.containsValue((Object) null);
      Comparator<Integer> comparator1 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Object> linkedTreeMap1 = new LinkedTreeMap<Integer, Object>(comparator1);
      linkedTreeMap0.remove((Object) linkedTreeMap1);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer(41);
      linkedTreeMap0.putIfAbsent(integer0, integer0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.retainAll(linkedTreeMap_KeySet0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-65), 0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer((-65));
      linkedTreeMap0.putIfAbsent(integer0, integer0);
      linkedTreeMap0.putIfAbsent("JAZRbj<*", integer0);
      boolean boolean0 = linkedTreeMap0.containsValue(integer0);
      assertEquals(2, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      Integer integer0 = new Integer((-65));
      linkedTreeMap0.putIfAbsent(integer0, integer0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.putIfAbsent("JAZRbj<*", integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.right = linkedTreeMap_Node0;
      linkedTreeMap_Node0.equals(linkedTreeMap_Node1);
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap_Node1.left = linkedTreeMap_Node0;
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
  public void test24()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      Integer integer0 = new Integer(1);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((String) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator1);
      LinkedTreeMap<Object, String> linkedTreeMap1 = new LinkedTreeMap<Object, String>();
      linkedTreeMap1.keySet();
      linkedTreeMap1.keySet();
      LinkedTreeMap<String, Integer> linkedTreeMap2 = new LinkedTreeMap<String, Integer>();
      Comparator<String> comparator2 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap3 = new LinkedTreeMap<String, Object>(comparator2);
      Set<String> set0 = linkedTreeMap3.keySet();
      assertNotNull(set0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute(linkedTreeMap_Node0, biFunction0);
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node1, false);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-65), (-65), (-65), (-65), (-65)).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer((-65));
      linkedTreeMap0.putIfAbsent(integer0, integer0);
      linkedTreeMap0.putIfAbsent("r-^|r$gJ^ X,g^fjy,", integer0);
      LinkedTreeMap<Integer, Integer> linkedTreeMap1 = new LinkedTreeMap<Integer, Integer>();
      linkedTreeMap0.putIfAbsent(linkedTreeMap1, linkedTreeMap1);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>();
      linkedTreeMap_Node1.right = linkedTreeMap_Node0;
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node1, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node1);
      
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node2 = new LinkedTreeMap.Node<String, Object>(linkedTreeMap_Node0, "", linkedTreeMap_Node1, linkedTreeMap_Node1);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node3 = linkedTreeMap_Node1.first();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node4 = linkedTreeMap_Node3.last();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node5 = new LinkedTreeMap.Node<String, Object>(linkedTreeMap_Node3, "", linkedTreeMap_Node2, linkedTreeMap_Node4);
      boolean boolean0 = linkedTreeMap_Node5.equals(linkedTreeMap_Node2);
      assertSame(linkedTreeMap_Node4, linkedTreeMap_Node1);
      
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      boolean boolean1 = linkedTreeMap0.containsKey("d,DdDO<)-JcJ|,8HmH");
      assertFalse(boolean1 == boolean0);
      
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer(39);
      linkedTreeMap0.putIfAbsent(integer0, "");
      LinkedTreeMap<Integer, Integer> linkedTreeMap1 = new LinkedTreeMap<Integer, Integer>();
      Integer integer1 = Integer.getInteger("", 39);
      linkedTreeMap0.putIfAbsent(integer1, linkedTreeMap1);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Integer>();
      Integer integer0 = new Integer((-1));
      linkedTreeMap_Node1.value = integer0;
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
      
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Map.Entry.comparingByKey((Comparator<? super Object>) comparator0);
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node2 = new LinkedTreeMap.Node<String, Integer>();
      Integer integer0 = new Integer((-784));
      linkedTreeMap_Node2.value = integer0;
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node3 = new LinkedTreeMap.Node<String, Object>();
      boolean boolean1 = linkedTreeMap_Node3.equals(linkedTreeMap_Node2);
      assertFalse(boolean1);
      assertTrue(boolean1 == boolean0);
      
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>(comparator1);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>(comparator0);
      BiFunction<Object, Integer, Integer> biFunction0 = (BiFunction<Object, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.replaceAll(biFunction0);
      Set<Map.Entry<Object, Integer>> set0 = (Set<Map.Entry<Object, Integer>>)linkedTreeMap0.entrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Integer>();
      Integer integer0 = new Integer((-1));
      linkedTreeMap_Node0.value = integer0;
      Integer.compareUnsigned((-1), 1);
      Integer integer1 = new Integer((-1));
      linkedTreeMap_Node1.value = integer1;
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
      
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Object>();
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Object>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node2 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-65), (-65), 4070, 4070).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer((-65));
      linkedTreeMap0.putIfAbsent(integer0, integer0);
      Integer integer1 = new Integer((-65));
      linkedTreeMap0.putIfAbsent("JAZRbj<*", integer0);
      LinkedTreeMap<Integer, Integer> linkedTreeMap1 = new LinkedTreeMap<Integer, Integer>();
      linkedTreeMap0.putIfAbsent(linkedTreeMap1, linkedTreeMap1);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Map.Entry.comparingByKey((Comparator<? super Object>) comparator0);
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      linkedTreeMap_Node1.right = linkedTreeMap_Node0;
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node1, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-1), (-1), 23, (-1), 23).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer((-1));
      linkedTreeMap0.putIfAbsent(integer0, integer0);
      linkedTreeMap0.putIfAbsent("r-^|r$gJ^ X,g^fjy,", "r-^|r$gJ^ X,g^fjy,");
      LinkedTreeMap<Integer, Integer> linkedTreeMap1 = new LinkedTreeMap<Integer, Integer>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node1 = linkedTreeMap_Node0.first();
      linkedTreeMap0.putIfAbsent(linkedTreeMap_Node1, linkedTreeMap1);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap_Node1.left = linkedTreeMap_Node0;
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
  public void test42()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer(39);
      linkedTreeMap0.putIfAbsent(integer0, integer0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      linkedTreeMap_KeySet0.forEach(consumer0);
      linkedTreeMap_EntrySet0.retainAll(linkedTreeMap_KeySet0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet1 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet1.size();
      assertEquals(0, linkedTreeMap0.size());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.right = linkedTreeMap_Node0;
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
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
  public void test44()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer(1);
      linkedTreeMap0.putIfAbsent(integer0, integer0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet1 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet1.retainAll(linkedTreeMap_EntrySet0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet2 = linkedTreeMap0.new EntrySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.right = linkedTreeMap_Node0;
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer((-1491));
      linkedTreeMap0.putIfAbsent(linkedTreeMap_Node1, integer0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>(integer0, integer0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet1 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet1.remove(linkedTreeMap_Node1);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.right = linkedTreeMap_Node0;
      linkedTreeMap_Node1.toString();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer((-1491));
      linkedTreeMap0.putIfAbsent(linkedTreeMap_Node1, integer0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      AbstractMap.SimpleImmutableEntry<Integer, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, Integer>(integer0, integer0);
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      linkedTreeMap0.replaceAll(biFunction0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet1 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet1.remove(linkedTreeMap_Node1);
      assertEquals(0, linkedTreeMap_EntrySet1.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(39, 39, 39, 39, 39).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer(39);
      linkedTreeMap0.putIfAbsent(integer0, integer0);
      Integer integer1 = new Integer(39);
      linkedTreeMap0.putIfAbsent(integer1, integer0);
      LinkedTreeMap<Integer, Integer> linkedTreeMap1 = new LinkedTreeMap<Integer, Integer>();
      Comparator<String> comparator1 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap2 = new LinkedTreeMap<String, Object>(comparator1);
      linkedTreeMap0.putIfAbsent(linkedTreeMap2, integer1);
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = linkedTreeMap0.root;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      assertEquals(2, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn((-65), (-65), 2822, (-65), 1528).when(comparator0).compare(any() , any());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Integer integer0 = new Integer((-65));
      linkedTreeMap0.putIfAbsent(integer0, integer0);
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Integer, Integer>(linkedTreeMap_Node1, integer0, linkedTreeMap_Node0, linkedTreeMap_Node1);
      Integer integer1 = new Integer((-65));
      LinkedTreeMap<Object, String> linkedTreeMap1 = new LinkedTreeMap<Object, String>();
      Integer integer2 = new Integer((-65));
      linkedTreeMap0.putIfAbsent(",-", linkedTreeMap_Node2);
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node3 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node4 = new LinkedTreeMap.Node<Integer, Integer>();
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node5 = new LinkedTreeMap.Node<Integer, Integer>(linkedTreeMap_Node1, integer2, linkedTreeMap_Node0, linkedTreeMap_Node2);
      LinkedTreeMap<Object, String> linkedTreeMap2 = new LinkedTreeMap<Object, String>();
      Integer integer3 = new Integer(0);
      Integer integer4 = new Integer((-65));
      AbstractMap.SimpleEntry<Integer, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Integer, Integer>(integer3, integer4);
      Integer integer5 = Integer.getInteger(",-", 2822);
      LinkedTreeMap<Integer, Integer> linkedTreeMap3 = new LinkedTreeMap<Integer, Integer>((Comparator<? super Integer>) null);
      BiFunction<Integer, Object, Integer> biFunction0 = (BiFunction<Integer, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap3.computeIfPresent(integer5, biFunction0);
      BiFunction<Object, Object, Integer> biFunction1 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.merge(linkedTreeMap3, integer2, biFunction1);
      linkedTreeMap0.putIfAbsent("", integer1);
      BiFunction<Object, Object, String> biFunction2 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      Object object0 = linkedTreeMap0.merge(integer3, linkedTreeMap_Node2, biFunction2);
      linkedTreeMap0.putIfAbsent(linkedTreeMap_Node0, object0);
      assertEquals(6, linkedTreeMap0.size());
  }
}