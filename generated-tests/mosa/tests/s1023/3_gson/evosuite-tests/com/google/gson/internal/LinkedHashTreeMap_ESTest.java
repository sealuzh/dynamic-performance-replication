/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 14:19:50 GMT 2018
 */

package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.internal.LinkedHashTreeMap;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Set;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedHashTreeMap_ESTest extends LinkedHashTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashTreeMap.AvlIterator<Object, Object> linkedHashTreeMap_AvlIterator0 = new LinkedHashTreeMap.AvlIterator<Object, Object>();
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      linkedHashTreeMap0.remove((Object) linkedHashTreeMap_AvlIterator0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>((Comparator<? super String>) null);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      linkedHashTreeMap_EntrySet0.clear();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.last();
      assertNotNull(linkedHashTreeMap_Node1);
      
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains((Object) null);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Object, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 7);
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      linkedHashTreeMap_NodeArray0[6] = linkedHashTreeMap_Node0;
      LinkedHashTreeMap.Node<Object, String>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Object, String>[]) linkedHashTreeMap_NodeArray0);
      assertNotNull(linkedHashTreeMap_NodeArray1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find("", true);
      LinkedHashTreeMap.Node<Object, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Object, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 4);
      linkedHashTreeMap_NodeArray0[0] = linkedHashTreeMap_Node0;
      linkedHashTreeMap_NodeArray0[1] = linkedHashTreeMap_Node0;
      LinkedHashTreeMap.Node<Object, String>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Object, String>[]) linkedHashTreeMap_NodeArray0);
      assertNotNull(linkedHashTreeMap_NodeArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      Set<Object> set0 = linkedHashTreeMap0.keySet();
      assertNotNull(set0);
      
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Integer>();
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      int int0 = linkedHashTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find("5-", true);
      linkedHashTreeMap0.clear();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.find(linkedHashTreeMap_Node0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.gson.internal.LinkedHashTreeMap$Node is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.header;
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node0, false);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find("", true);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      linkedHashTreeMap0.containsValue("");
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find("", true);
      linkedHashTreeMap0.containsValue(linkedHashTreeMap_Node0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.contains("");
      assertEquals(1, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.put((String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      BiFunction<String, Object, String> biFunction0 = (BiFunction<String, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("").when(biFunction0).apply(anyString() , any());
      linkedHashTreeMap0.compute("", biFunction0);
      linkedHashTreeMap0.putIfAbsent("", "");
      linkedHashTreeMap0.find("", true);
      assertEquals(3, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      String string0 = linkedHashTreeMap_Node0.toString();
      assertEquals("null=null", string0);
      
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      assertEquals(0, linkedHashTreeMap0.size());
      
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node1 = linkedHashTreeMap_Node0.first();
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node1);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean1 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node1);
      assertFalse(boolean1 == boolean0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      assertEquals(0, linkedHashTreeMap0.size());
      
      linkedHashTreeMap_Node0.value = (Object) "z";
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Object, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 7);
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, String>();
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node0;
      linkedHashTreeMap_NodeArray0[6] = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<Object, String>[] linkedHashTreeMap_NodeArray1 = LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Object, String>[]) linkedHashTreeMap_NodeArray0);
      assertNotNull(linkedHashTreeMap_NodeArray1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Object>();
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node0;
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node1;
      linkedHashTreeMap_Node0.left = linkedHashTreeMap_Node1.right;
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node1.right, false);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Integer> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Integer>();
      LinkedHashTreeMap.Node<String, Integer> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Integer>(linkedHashTreeMap_Node0, "GdC/zE?W\"N", 695, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
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
  public void test24()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      Object object0 = new Object();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Object>(linkedHashTreeMap_Node0, object0, (-20), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      LinkedHashTreeMap.Node<Integer, Integer> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<Integer, Integer>();
      LinkedHashTreeMap.Node<Integer, Integer> linkedHashTreeMap_Node3 = linkedHashTreeMap_Node2.last();
      LinkedHashTreeMap.Node<Integer, Integer> linkedHashTreeMap_Node4 = new LinkedHashTreeMap.Node<Integer, Integer>();
      boolean boolean0 = linkedHashTreeMap_Node4.equals(linkedHashTreeMap_Node1);
      assertFalse(boolean0);
      assertTrue(linkedHashTreeMap_Node4.equals((Object)linkedHashTreeMap_Node3));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Object>();
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node0;
      linkedHashTreeMap_Node0.left = linkedHashTreeMap_Node1.right;
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node1.right, true);
      assertEquals((-1), linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedHashTreeMap<Object, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, Object>();
      Integer integer0 = new Integer(0);
      Object object0 = new Object();
      linkedHashTreeMap0.keySet();
      Set<Object> set0 = linkedHashTreeMap0.keySet();
      assertNotNull(set0);
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      assertEquals(0, linkedHashTreeMap0.size());
      
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Object>(linkedHashTreeMap_Node0, linkedHashTreeMap_Node0, 1625, linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      boolean boolean0 = linkedHashTreeMap_Node1.equals(linkedHashTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      BiFunction<String, Object, String> biFunction0 = (BiFunction<String, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("1").when(biFunction0).apply(anyString() , any());
      linkedHashTreeMap0.compute("1", biFunction0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.addAll((Collection<?>) linkedHashTreeMap_EntrySet0);
      linkedHashTreeMap_EntrySet0.retainAll(linkedList0);
      linkedHashTreeMap_EntrySet0.remove("1");
      LinkedHashTreeMap<Object, String> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, String>(comparator0);
      linkedHashTreeMap1.containsValue(linkedHashTreeMap_EntrySet0);
      assertEquals(1, linkedHashTreeMap0.size());
      
      LinkedHashTreeMap<Object, Integer> linkedHashTreeMap2 = new LinkedHashTreeMap<Object, Integer>();
      Integer integer0 = new Integer((-2792));
      AbstractMap.SimpleEntry<Object, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Integer>(linkedHashTreeMap1, integer0);
      linkedHashTreeMap2.findByEntry(abstractMap_SimpleEntry0);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Object>();
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node0;
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node1.right;
      linkedHashTreeMap_Node0.left = linkedHashTreeMap_Node0.right;
      // Undeclared exception!
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node1.right, true);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      linkedHashTreeMap0.find("", true);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      boolean boolean0 = linkedHashTreeMap_KeySet0.remove("");
      assertEquals(1, linkedHashTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>(comparator0);
      linkedHashTreeMap0.find("", true);
      BiFunction<Object, Object, Object> biFunction0 = (BiFunction<Object, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      linkedHashTreeMap0.compute("", biFunction0);
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>((Object) null, (Object) null);
      linkedHashTreeMap0.findByEntry(abstractMap_SimpleEntry0);
      assertEquals(1, linkedHashTreeMap0.size());
      
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap1 = new LinkedHashTreeMap<String, String>(comparator1);
      Integer integer0 = new Integer(20);
      boolean boolean0 = linkedHashTreeMap1.containsKey(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      linkedHashTreeMap0.find("p", true);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap0.new KeySet();
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      linkedHashTreeMap_KeySet0.toArray(objectArray0);
      assertEquals(1, linkedHashTreeMap0.size());
      
      boolean boolean0 = linkedHashTreeMap_EntrySet0.retainAll(linkedHashTreeMap_KeySet0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find("", true);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.contains(linkedHashTreeMap_Node0);
      assertEquals(1, linkedHashTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      linkedHashTreeMap0.threshold = (-262);
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find("", true);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      assertEquals(1, linkedHashTreeMap0.size());
      
      boolean boolean0 = linkedHashTreeMap_EntrySet0.remove(linkedHashTreeMap_Node0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, Object>();
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node0.last();
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node2);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap1 = new LinkedHashTreeMap<String, String>(comparator0);
      linkedHashTreeMap1.put("92X;,~czV^z", "92X;,~czV^z");
      assertEquals(1, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, String>(comparator0);
      LinkedHashTreeMap.Node<Integer, Integer> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Integer, Integer>();
      Integer integer0 = linkedHashTreeMap_Node0.key;
      linkedHashTreeMap1.find((Object) null, true);
      boolean boolean0 = linkedHashTreeMap1.containsValue(linkedHashTreeMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      BiFunction<String, Object, String> biFunction0 = (BiFunction<String, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("").when(biFunction0).apply(anyString() , any());
      linkedHashTreeMap0.compute("", biFunction0);
      linkedHashTreeMap0.putIfAbsent("", "");
      linkedHashTreeMap0.find("", true);
      assertEquals(3, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      BiFunction<String, Object, String> biFunction0 = (BiFunction<String, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("1").when(biFunction0).apply(anyString() , any());
      linkedHashTreeMap0.compute("1", biFunction0);
      linkedHashTreeMap0.putIfAbsent("1", "1");
      linkedHashTreeMap0.find("1", true);
      assertEquals(3, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      BiFunction<String, Object, String> biFunction0 = (BiFunction<String, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("").when(biFunction0).apply(anyString() , any());
      linkedHashTreeMap0.compute("", biFunction0);
      linkedHashTreeMap0.putIfAbsent("", "");
      linkedHashTreeMap0.find("", true);
      assertEquals(3, linkedHashTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>(comparator0);
      BiFunction<String, Object, String> biFunction0 = (BiFunction<String, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("e").when(biFunction0).apply(anyString() , any());
      linkedHashTreeMap0.compute("e", biFunction0);
      linkedHashTreeMap0.putIfAbsent("e", "e");
      linkedHashTreeMap0.putIfAbsent("e", "e");
      LinkedHashTreeMap.Node<String, String> linkedHashTreeMap_Node0 = linkedHashTreeMap0.find((String) null, false);
      assertNull(linkedHashTreeMap_Node0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Object>(linkedHashTreeMap_Node0, "7Yl", (-1), linkedHashTreeMap_Node0, linkedHashTreeMap_Node0);
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node0;
      linkedHashTreeMap_Node1.first();
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node1;
      linkedHashTreeMap_Node0.left = linkedHashTreeMap_Node1.right;
      // Undeclared exception!
      try { 
        linkedHashTreeMap0.removeInternal((LinkedHashTreeMap.Node<String, Object>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, Object>();
      LinkedHashTreeMap<Object, String> linkedHashTreeMap0 = new LinkedHashTreeMap<Object, String>();
      linkedHashTreeMap_Node0.value = (Object) "<3RhXC*.Ya5^j7p_";
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node2 = linkedHashTreeMap_Node1.first();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node3 = new LinkedHashTreeMap.Node<Object, String>(linkedHashTreeMap_Node2, linkedHashTreeMap_Node2, 1, linkedHashTreeMap_Node1, linkedHashTreeMap_Node2);
      LinkedHashTreeMap.Node linkedHashTreeMap_Node4 = (LinkedHashTreeMap.Node)linkedHashTreeMap_Node3.key;
      assertNotNull(linkedHashTreeMap_Node4);
      
      boolean boolean0 = linkedHashTreeMap_Node0.equals(linkedHashTreeMap_Node4);
      assertFalse(boolean0);
      
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<String, Object> linkedHashTreeMap1 = new LinkedHashTreeMap<String, Object>(comparator0);
      LinkedHashTreeMap.KeySet linkedHashTreeMap_KeySet0 = linkedHashTreeMap1.new KeySet();
      linkedHashTreeMap_KeySet0.clear();
      assertEquals(0, linkedHashTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Object, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 7);
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, String>();
      linkedHashTreeMap_Node0.setValue("");
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node0;
      linkedHashTreeMap_Node1.left = linkedHashTreeMap_Node0;
      linkedHashTreeMap_NodeArray0[6] = linkedHashTreeMap_Node1;
      // Undeclared exception!
      try { 
        LinkedHashTreeMap.doubleCapacity((LinkedHashTreeMap.Node<Object, String>[]) linkedHashTreeMap_NodeArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedHashTreeMap$AvlBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedHashTreeMap.Node<Object, String>[] linkedHashTreeMap_NodeArray0 = (LinkedHashTreeMap.Node<Object, String>[]) Array.newInstance(LinkedHashTreeMap.Node.class, 7);
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<Object, String>();
      LinkedHashTreeMap.Node<Object, String> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<Object, String>();
      String string0 = linkedHashTreeMap_Node1.setValue("");
      assertNull(string0);
      
      String string1 = linkedHashTreeMap_Node1.setValue("");
      assertNotNull(string1);
      
      linkedHashTreeMap_NodeArray0[6] = linkedHashTreeMap_Node1;
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node2 = new LinkedHashTreeMap.Node<String, Object>();
      boolean boolean0 = linkedHashTreeMap_Node2.equals(linkedHashTreeMap_Node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node1 = new LinkedHashTreeMap.Node<String, Object>();
      int int0 = 4206;
      linkedHashTreeMap_Node0.height = 4206;
      linkedHashTreeMap_Node1.right = linkedHashTreeMap_Node0;
      linkedHashTreeMap_Node0.right = linkedHashTreeMap_Node1;
      linkedHashTreeMap_Node0.left = linkedHashTreeMap_Node1.right;
      // Undeclared exception!
      linkedHashTreeMap0.removeInternal(linkedHashTreeMap_Node1.right, true);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedHashTreeMap<String, Object> linkedHashTreeMap0 = new LinkedHashTreeMap<String, Object>();
      LinkedHashTreeMap.AvlBuilder<String, Object> linkedHashTreeMap_AvlBuilder0 = new LinkedHashTreeMap.AvlBuilder<String, Object>();
      linkedHashTreeMap_AvlBuilder0.reset(9);
      LinkedHashTreeMap.Node<String, Object> linkedHashTreeMap_Node0 = new LinkedHashTreeMap.Node<String, Object>();
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      linkedHashTreeMap_AvlBuilder0.add(linkedHashTreeMap_Node0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedHashTreeMap<Object, String> linkedHashTreeMap1 = new LinkedHashTreeMap<Object, String>(comparator0);
      linkedHashTreeMap1.containsValue(linkedHashTreeMap_AvlBuilder0);
      assertEquals(0, linkedHashTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedHashTreeMap<String, String> linkedHashTreeMap0 = new LinkedHashTreeMap<String, String>();
      BiFunction<String, Object, String> biFunction0 = (BiFunction<String, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("1").when(biFunction0).apply(anyString() , any());
      linkedHashTreeMap0.compute("1", biFunction0);
      LinkedHashTreeMap.EntrySet linkedHashTreeMap_EntrySet0 = linkedHashTreeMap0.new EntrySet();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedHashTreeMap_EntrySet0.retainAll(linkedList0);
      assertEquals(0, linkedHashTreeMap_EntrySet0.size());
      assertTrue(boolean0);
  }
}