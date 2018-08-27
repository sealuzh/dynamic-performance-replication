/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 22:04:38 GMT 2018
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
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      BiFunction<Object, Object, Object> biFunction0 = (BiFunction<Object, Object, Object>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.replaceAll(biFunction0);
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains(linkedTreeMap0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>((Comparator<? super String>) null);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedTreeMap<Integer, Object> linkedTreeMap0 = new LinkedTreeMap<Integer, Object>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.find((Integer) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedTreeMap<Object, Integer> linkedTreeMap0 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.put("", "");
      linkedTreeMap0.get("");
      linkedTreeMap0.find("6VN$I!8~.#s", true);
      assertEquals(2, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>(comparator0);
      linkedTreeMap0.clear();
      linkedTreeMap0.put("com.google.gson.internal.LinkedTreeMap", "");
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>();
      boolean boolean0 = linkedTreeMap0.containsKey((Object) null);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
      
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>();
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node1 = linkedTreeMap1.header;
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node2 = linkedTreeMap_Node1.last();
      assertNotNull(linkedTreeMap_Node2);
      
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node3 = linkedTreeMap_Node2.first();
      assertNotNull(linkedTreeMap_Node3);
      
      LinkedTreeMap.Node<Object, Integer> linkedTreeMap_Node4 = new LinkedTreeMap.Node<Object, Integer>(linkedTreeMap_Node3, linkedTreeMap1, linkedTreeMap_Node3, linkedTreeMap_Node1);
      linkedTreeMap_Node4.toString();
      String string0 = linkedTreeMap_Node4.toString();
      assertEquals(0, linkedTreeMap1.size());
      assertEquals("{(this Map)=null}=null", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap<String, Integer> linkedTreeMap1 = new LinkedTreeMap<String, Integer>();
      LinkedTreeMap.Node<String, Integer> linkedTreeMap_Node0 = linkedTreeMap1.header;
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>(linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(abstractMap_SimpleImmutableEntry0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // key == null
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.find("com.google.ggon.inter:aA.Li`kedTreeMap", true);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      assertEquals(1, linkedTreeMap0.size());
      
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedTreeMap_KeySet0.retainAll(linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>();
      linkedTreeMap1.find("com.google.gson.internal.LinkedTreeMap", true);
      linkedTreeMap1.put("", linkedTreeMap0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = linkedTreeMap1.find(".", true);
      linkedTreeMap1.removeInternal(linkedTreeMap_Node0, false);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap1.new KeySet();
      linkedTreeMap_KeySet0.remove("");
      LinkedTreeMap<Object, Integer> linkedTreeMap2 = new LinkedTreeMap<Object, Integer>();
      Set<Map.Entry<Object, Integer>> set0 = (Set<Map.Entry<Object, Integer>>)linkedTreeMap2.entrySet();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      linkedTreeMap0.keySet();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      BiFunction<Object, String, String> biFunction0 = (BiFunction<Object, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedTreeMap0.computeIfPresent(linkedTreeMap_EntrySet0, biFunction0);
      boolean boolean0 = linkedTreeMap_EntrySet0.contains((Object) null);
      assertFalse(boolean0);
      
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap1 = new LinkedTreeMap<Object, Object>(comparator0);
      linkedTreeMap1.keySet();
      Set<Object> set0 = linkedTreeMap1.keySet();
      assertNotNull(set0);
      
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap1.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
      
      Comparator<Object> comparator1 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Integer> linkedTreeMap2 = new LinkedTreeMap<Object, Integer>(comparator1);
      linkedTreeMap2.remove((Object) null);
      assertEquals(0, linkedTreeMap2.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, String>();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node2 = new LinkedTreeMap.Node<Object, String>(linkedTreeMap_Node1, linkedTreeMap0, linkedTreeMap_Node1, linkedTreeMap_Node1);
      linkedTreeMap_Node2.first();
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal(linkedTreeMap_Node2, true);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap0.put("mwPDA%,/G44v%&}7w#", linkedTreeMap_KeySet0);
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute("mwPDA%,/G44v%&}7w#", biFunction0);
      linkedTreeMap0.find(".", true);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.find("co7.google.gsonintnrnal.LinkedTreeMa", true);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet1 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.retainAll(linkedTreeMap_KeySet1);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Object>();
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node2 = linkedTreeMap_Node1.last();
      linkedTreeMap_Node0.right = linkedTreeMap_Node2;
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node3 = linkedTreeMap_Node0.last();
      linkedTreeMap_Node3.getValue();
      assertSame(linkedTreeMap_Node3, linkedTreeMap_Node2);
      
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>(comparator0);
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = linkedTreeMap0.find("co7.google.gsonintnrnal.LinkedTreeMa", true);
      linkedTreeMap0.put("S8eFxI2<N6kU@,)W;T4", linkedTreeMap_Node0);
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node1);
      
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap_Node1);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      linkedTreeMap_Node0.equals(linkedTreeMap_Node0);
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = linkedTreeMap0.find("e&L.Iq;", true);
      linkedTreeMap0.find("b+6[y$pRP@3Po)", true);
      linkedTreeMap_Node1.first();
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(2, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.put("S8eFxI2<N6kU@,)W;T>4", "");
      // Undeclared exception!
      try { 
        linkedTreeMap0.find((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.find("=[&$Cwc/OYE", true);
      linkedTreeMap0.put("key == null", "=[&$Cwc/OYE");
      linkedTreeMap0.find("", true);
      assertEquals(3, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = linkedTreeMap0.find("", true);
      linkedTreeMap0.put("=[&$Cwc/OYE", "=[&$Cwc/OYE");
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = linkedTreeMap0.find("DV#t>1bDJ._1):", true);
      assertFalse(linkedTreeMap_Node1.equals((Object)linkedTreeMap_Node0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.find("=[&$Cwc/OYE", true);
      linkedTreeMap0.put("key == null", "=[&$Cwc/OYE");
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = linkedTreeMap0.find("SMJ", true);
      linkedTreeMap0.removeInternal(linkedTreeMap_Node0, true);
      assertEquals(2, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = linkedTreeMap0.find("com.google.gson.internal.LinkedTreeMap", true);
      linkedTreeMap0.put("S8eFxI2<N6kU@,)W;T4", linkedTreeMap_Node0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = linkedTreeMap0.find("", true);
      assertFalse(linkedTreeMap_Node1.equals((Object)linkedTreeMap_Node0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = linkedTreeMap1.find("com.google.gson.internal.LinkedTreeMap", true);
      linkedTreeMap1.find("e", true);
      linkedTreeMap1.removeInternal(linkedTreeMap_Node0, true);
      assertEquals(1, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
      
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node0);
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>(linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean1 = linkedTreeMap_Node0.equals(linkedTreeMap_Node1);
      assertFalse(boolean1);
      assertFalse(boolean1 == boolean0);
      assertFalse(linkedTreeMap_Node1.equals((Object)linkedTreeMap_Node0));
      
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      linkedTreeMap_Node0.equals(linkedTreeMap_Node0);
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>("", "");
      linkedTreeMap_Node0.value = (Object) abstractMap_SimpleImmutableEntry0;
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      Map.Entry.comparingByValue();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = linkedTreeMap0.find("*", true);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node2 = linkedTreeMap_Node1.first();
      linkedTreeMap_Node2.first();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet1 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet1.contains(linkedTreeMap_Node1);
      assertEquals(1, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      linkedTreeMap_Node0.toString();
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, Object>();
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node2 = linkedTreeMap0.header;
      linkedTreeMap_Node1.setValue(linkedTreeMap_Node2);
      linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      LinkedTreeMap<Object, String> linkedTreeMap1 = new LinkedTreeMap<Object, String>();
      Integer integer0 = new Integer(0);
      LinkedTreeMap.Node<Integer, Integer> linkedTreeMap_Node3 = new LinkedTreeMap.Node<Integer, Integer>();
      Integer integer1 = new Integer(0);
      Integer integer2 = new Integer((-1));
      assertFalse(integer2.equals((Object)integer1));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = linkedTreeMap0.find("com.google.gson.internal.LinkedTreeMap", true);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = linkedTreeMap_Node0.first();
      linkedTreeMap0.put("com.google.gson.internal.LinkedTreeMap", linkedTreeMap_Node1);
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      linkedTreeMap_Node0.equals(linkedTreeMap_Node0);
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = linkedTreeMap0.find(" is not Comparable", true);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node2 = linkedTreeMap0.findByEntry(linkedTreeMap_Node1);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap_Node2);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node0 = linkedTreeMap0.find("b^^oT8j7a", true);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedTreeMap1.put("", linkedTreeMap_KeySet0);
      linkedTreeMap1.findByEntry(linkedTreeMap_Node0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal((LinkedTreeMap.Node<String, Object>) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = linkedTreeMap0.find("", true);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node2 = linkedTreeMap_Node1.last();
      linkedTreeMap_Node0.setValue(linkedTreeMap_Node2);
      assertEquals(1, linkedTreeMap0.size());
      
      linkedTreeMap_Node0.parent = null;
      linkedTreeMap_Node0.equals(linkedTreeMap_Node0);
      LinkedTreeMap<String, Object> linkedTreeMap1 = new LinkedTreeMap<String, Object>();
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      linkedTreeMap0.find("=[&wcLqOYE", true);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap0.find("=[&wcLqOYE", false);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Integer> linkedTreeMap1 = new LinkedTreeMap<Object, Integer>(comparator0);
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>("=[&wcLqOYE", linkedTreeMap1);
      linkedTreeMap_EntrySet0.remove(abstractMap_SimpleImmutableEntry0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet1 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet1.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      linkedTreeMap_Node0.equals(linkedTreeMap_Node0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      Integer integer0 = new Integer(1);
      linkedTreeMap0.put("{68", integer0);
      LinkedTreeMap<Object, Object> linkedTreeMap1 = new LinkedTreeMap<Object, Object>();
      Integer integer1 = new Integer(1);
      AbstractMap.SimpleEntry<Object, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, Object>(linkedTreeMap1, integer1);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = linkedTreeMap0.findByEntry(abstractMap_SimpleEntry0);
      linkedTreeMap0.removeInternal(linkedTreeMap_Node1, false);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedTreeMap.Node<Object, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, Object>();
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node0);
      assertTrue(boolean0);
      
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node1 = linkedTreeMap0.find("", true);
      linkedTreeMap0.put("com.google.gson.internal.LinkedTreeMap", "");
      Map.Entry.comparingByKey();
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node2 = linkedTreeMap0.find(">Sve%(('", true);
      LinkedTreeMap<Integer, Object> linkedTreeMap1 = new LinkedTreeMap<Integer, Object>();
      linkedTreeMap1.findByEntry(linkedTreeMap_Node2);
      LinkedTreeMap.Node<String, Object> linkedTreeMap_Node3 = linkedTreeMap0.findByEntry(linkedTreeMap_Node1);
      assertNotNull(linkedTreeMap_Node3);
      assertSame(linkedTreeMap_Node3, linkedTreeMap_Node1);
      
      linkedTreeMap0.find("N0^/:", true);
      linkedTreeMap0.removeInternal(linkedTreeMap_Node2, true);
      assertNotSame(linkedTreeMap_Node2, linkedTreeMap_Node3);
  }
}
