/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 17:39:01 GMT 2018
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
import java.util.LinkedList;
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
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>((Comparator<? super String>) null);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      linkedTreeMap0.put("", "");
      assertEquals(1, linkedTreeMap0.size());
      
      BiFunction<String, Object, Integer> biFunction0 = (BiFunction<String, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(anyString() , any());
      linkedTreeMap0.compute("", biFunction0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      BiFunction<String, Object, Object> biFunction0 = (BiFunction<String, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      Integer integer0 = new Integer((-11));
      linkedTreeMap0.containsValue(integer0);
      linkedTreeMap0.replaceAll(biFunction0);
      BiFunction<String, Object, String> biFunction1 = (BiFunction<String, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.replaceAll(biFunction1);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = linkedTreeMap0.findByObject("com.google.gson.internal.LinkedTreeMap");
      assertNull(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      Object object0 = new Object();
      linkedTreeMap0.remove(object0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      assertEquals(0, linkedTreeMap0.size());
      
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      String string0 = linkedTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.retainAll(linkedTreeMap_EntrySet0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap1 = new LinkedTreeMap<String, String>(comparator0);
      linkedTreeMap1.keySet();
      Set<String> set0 = linkedTreeMap1.keySet();
      assertNotNull(set0);
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(linkedTreeMap_Node0, "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedTreeMap$Node is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.put("n-r{RBC6VggaP", "n-r{RBC6VggaP");
      BiFunction<String, Object, String> biFunction0 = (BiFunction<String, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(anyString() , any());
      linkedTreeMap0.compute("", biFunction0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.put("$L", "$L");
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute("W", biFunction0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.put(".r", ".r");
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet1 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet1.retainAll(linkedTreeMap_KeySet0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, String>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, String>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      linkedTreeMap0.removeInternal(linkedTreeMap_Node1, false);
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      assertEquals((-2), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.putIfAbsent("0Hi2`l;u/z,mJ[{gp8s", "");
      linkedTreeMap0.put("", "");
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("").when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute(";sFcS21nwwjpm!7B", biFunction0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, String>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, false);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.put("j", "j");
      Integer integer0 = new Integer(5);
      linkedTreeMap0.putIfAbsent("", integer0);
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("=").when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute("=", biFunction0);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.putIfAbsent("Z", "FA-2w7\"+Njk");
      linkedTreeMap0.put("FA-2w7\"+Njk", "FA-2w7\"+Njk");
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("").when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute(";sFcS21nwwjpm!7B", biFunction0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.remove("");
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.put("n-r{BC6VggaP", "n-r{BC6VggaP");
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      linkedTreeMap0.replaceAll(biFunction0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains("n-r{BC6VggaP");
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, String>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
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
  public void test24()  throws Throwable  {
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, String>();
      Integer integer0 = new Integer(594);
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, String>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node2 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node2);
      
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
      
      LinkedTreeMap.KeySet linkedTreeMap_KeySet1 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet1.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      Integer integer0 = new Integer(1746);
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Object>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node2 = linkedTreeMap_Node1.first();
      assertNotNull(linkedTreeMap_Node2);
      
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node3 = linkedTreeMap_Node2.last();
      assertNotNull(linkedTreeMap_Node3);
      
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node4 = new LinkedTreeMap.Node<Object, String>();
      String string0 = linkedTreeMap_Node4.value;
      Object object0 = linkedTreeMap_Node3.setValue((Object) null);
      assertNull(object0);
      
      boolean boolean0 = linkedTreeMap_Node3.equals(linkedTreeMap_Node2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      Integer integer0 = new Integer(1);
      linkedTreeMap0.put("", integer0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove("");
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      assertEquals(0, linkedTreeMap0.size());
      
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      linkedTreeMap_Node0.value = "";
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Object>();
      Object object0 = new Object();
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Object>();
      Object object0 = linkedTreeMap_Node1.setValue(linkedTreeMap0);
      assertEquals(0, linkedTreeMap0.size());
      assertNull(object0);
      
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      String string0 = linkedTreeMap_Node0.value;
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, String>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      linkedTreeMap_Node1.first();
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Integer, Object>();
      Object object0 = linkedTreeMap_Node2.setValue(linkedTreeMap0);
      assertNull(object0);
      
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node1);
      assertFalse(boolean0);
      
      LinkedTreeMap<Object, String> linkedTreeMap1 = new LinkedTreeMap<Object, String>();
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.putIfAbsent("", "FA-2w7\"+Njk");
      linkedTreeMap0.put("FA-2w7\"+Njk", "FA-2w7\"+Njk");
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedTreeMap_KeySet0.retainAll(linkedList0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, String>();
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Integer, String>();
      linkedTreeMap_Node1.right = linkedTreeMap_Node2;
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node3 = linkedTreeMap_Node1.first();
      assertNotNull(linkedTreeMap_Node3);
      
      LinkedTreeMap.Node<Integer, String> linkedTreeMap_Node4 = linkedTreeMap_Node3.last();
      assertNotNull(linkedTreeMap_Node4);
      
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node4);
      assertNotSame(linkedTreeMap_Node4, linkedTreeMap_Node3);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      assertEquals(0, linkedTreeMap0.size());
      
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Object>();
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node2 = linkedTreeMap_Node1.first();
      Object object0 = linkedTreeMap_Node2.setValue(linkedTreeMap_Node0);
      assertNull(object0);
      
      boolean boolean0 = linkedTreeMap_Node2.equals(linkedTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.put(".r", ".r");
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute("{gf^1", biFunction0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = linkedTreeMap0.findByObject(".r");
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.put("j", "j");
      BiFunction<String, Object, Object> biFunction0 = (BiFunction<String, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(anyString() , any());
      linkedTreeMap0.compute("82?{m%whTi5", biFunction0);
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      Integer integer0 = new Integer(2191);
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node2 = linkedTreeMap_Node1.first();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node3 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, "j", linkedTreeMap_Node2, linkedTreeMap_Node1);
      linkedTreeMap_Node3.last();
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap_Node3);
      linkedTreeMap0.findByEntry(abstractMap_SimpleEntry0);
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>();
      Set<Map.Entry<Object, Integer>> set0 = (Set<Map.Entry<Object, Integer>>)linkedTreeMap1.entrySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>(comparator0);
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap2 = new LinkedTreeMap<String, Object>(comparator1);
      linkedTreeMap1.put("", linkedTreeMap2);
      LinkedTreeMap<String, Object> linkedTreeMap3 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap<Object, Object> linkedTreeMap4 = new LinkedTreeMap<Object, Object>((Comparator<? super Object>) null);
      BiFunction<Object, Object, Object> biFunction0 = (BiFunction<Object, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap3.merge("", linkedTreeMap4, biFunction0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = linkedTreeMap1.removeInternalByKey(linkedTreeMap2);
      BiFunction<Object, Object, Integer> biFunction1 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction1).apply(any() , any());
      linkedTreeMap1.compute("", biFunction1);
      BiFunction<Object, Object, Object> biFunction2 = (BiFunction<Object, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction2).apply(any() , any());
      linkedTreeMap2.compute("ZMrP=Z/P", biFunction2);
      linkedTreeMap3.findByEntry(linkedTreeMap_Node0);
      assertTrue(linkedTreeMap2.equals((Object)linkedTreeMap1));
      assertTrue(linkedTreeMap1.equals((Object)linkedTreeMap2));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      linkedTreeMap_Node0.first();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, String>();
      linkedTreeMap_Node0.right = linkedTreeMap_Node1;
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Object, String>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node2;
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      assertEquals((-1), linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node1 = linkedTreeMap_Node0.first();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Object, String>(linkedTreeMap_Node1, (Object) null, linkedTreeMap_Node1, linkedTreeMap_Node1);
      linkedTreeMap_Node0.right = linkedTreeMap_Node2;
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node3 = new LinkedTreeMap.Node<Object, String>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node3;
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      assertEquals((-1), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.putIfAbsent("", "FA-2w7\"+Njk");
      linkedTreeMap0.put("FA-2w7\"+Njk", "FA-2w7\"+Njk");
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("").when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute(";sFcS21nwwjpm!7B", biFunction0);
      BiFunction<Object, Object, Object> biFunction1 = (BiFunction<Object, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction1).apply(any() , any());
      linkedTreeMap0.compute("FA-2w7\"+Njk", biFunction1);
      assertEquals(2, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node1 = linkedTreeMap_Node0.first();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Object, String>();
      linkedTreeMap_Node0.right = linkedTreeMap_Node2;
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node3 = new LinkedTreeMap.Node<Object, String>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node3;
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node4 = linkedTreeMap_Node1.last();
      linkedTreeMap0.removeInternal(linkedTreeMap_Node4, true);
      linkedTreeMap0.removeInternal(linkedTreeMap_Node2, true);
      assertEquals((-3), linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.putIfAbsent("", "");
      linkedTreeMap0.replace("", (Object) "", (Object) "");
      linkedTreeMap0.put(">nM", ">nM");
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("(7~").when(biFunction0).apply(any() , any());
      Object object0 = linkedTreeMap0.compute("Bdl", biFunction0);
      assertEquals("(7~", object0);
  }
}