/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 02:01:09 GMT 2019
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
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LinkedTreeMap_ESTest extends LinkedTreeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer((-2));
      LinkedTreeMap.Node<Integer, Comparable<Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Comparable<Integer>>();
      LinkedTreeMap.Node<Integer, Comparable<Integer>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Comparable<Integer>>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      Object object0 = linkedTreeMap_Node1.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedTreeMap.Node<String, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, String>();
      String string0 = linkedTreeMap_Node0.getKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.iterator();
      assertEquals(0, linkedTreeMap_KeySet0.size());
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
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      linkedTreeMap0.put("", "\".");
      linkedTreeMap0.remove((Object) comparator0);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, Comparable<String>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<String, String>, Comparable<String>>(comparator0);
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>("", "");
      linkedTreeMap0.find(abstractMap_SimpleEntry0, true);
      int int0 = linkedTreeMap0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedTreeMap<Map.Entry<Object, Object>, AbstractMap.SimpleEntry<Map.Entry<String, Object>, String>> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<Object, Object>, AbstractMap.SimpleEntry<Map.Entry<String, Object>, String>>();
      linkedTreeMap0.size = (-3328);
      int int0 = linkedTreeMap0.size();
      assertEquals((-3328), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.put("CI8s\" >Aq+D%WB^", "*nB{Ie=?; }l");
      linkedTreeMap0.put("CI8s\" >Aq+D%WB^", "Wwl>eXfG/Dfl`");
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      linkedTreeMap0.put("", "");
      linkedTreeMap0.keySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedTreeMap<Object, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleEntry<Object, String>>();
      Integer integer0 = new Integer(1);
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(anyInt() , anyInt());
      LinkedTreeMap<Integer, Object> linkedTreeMap1 = new LinkedTreeMap<Integer, Object>(comparator0);
      linkedTreeMap1.put(integer0, linkedTreeMap0);
      linkedTreeMap1.findByObject(linkedTreeMap0);
      assertEquals(1, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, Comparable<String>> linkedTreeMap0 = new LinkedTreeMap<Integer, Comparable<String>>(comparator0);
      Integer integer0 = Integer.getInteger("", 922);
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn("").when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute(integer0, biFunction0);
      linkedTreeMap0.entrySet();
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, Comparable<Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Integer>, Comparable<Object>>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, Comparable<Object>> linkedTreeMap_Node0 = linkedTreeMap0.removeInternalByKey((Object) null);
      assertNull(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, String>();
      LinkedTreeMap.Node<Object, String> linkedTreeMap_Node1 = linkedTreeMap0.removeInternalByKey(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
      assertNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<LinkedTreeMap<String, String>, AbstractMap.SimpleImmutableEntry<Object, String>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<String, String>, AbstractMap.SimpleImmutableEntry<Object, String>>(comparator0);
      linkedTreeMap0.remove((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<LinkedTreeMap<String, Integer>, AbstractMap.SimpleEntry<String, Integer>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<String, Integer>, AbstractMap.SimpleEntry<String, Integer>>(comparator0);
      Integer integer0 = new Integer(697);
      AbstractMap.SimpleImmutableEntry<String, Integer> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Integer>("com.google.gson.internal.LinkedTreeMap$LinkedTreeMapIterator", integer0);
      AbstractMap.SimpleEntry<String, Integer> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Integer>(abstractMap_SimpleImmutableEntry0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.put((LinkedTreeMap<String, Integer>) null, abstractMap_SimpleEntry0);
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
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<String, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleImmutableEntry<String, Object>>(comparator0);
      linkedTreeMap0.get((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<LinkedTreeMap<Integer, String>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Integer, String>, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
      linkedTreeMap0.get(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Integer, Object>> linkedTreeMap0 = new LinkedTreeMap<Integer, AbstractMap.SimpleEntry<Integer, Object>>();
      linkedTreeMap0.findByObject((Object) null);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, LinkedTreeMap<Object, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, LinkedTreeMap<Object, Integer>>();
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, String> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, String>((Comparator<? super AbstractMap.SimpleImmutableEntry<String, Object>>) null);
      linkedTreeMap0.findByObject(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<Object, AbstractMap.SimpleImmutableEntry<Object, Object>>(comparator0);
      linkedTreeMap0.findByEntry(linkedTreeMap_Node0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      linkedTreeMap0.find("", false);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, String> linkedTreeMap0 = new LinkedTreeMap<Object, String>(comparator0);
      linkedTreeMap0.find((Object) null, true);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      boolean boolean0 = linkedTreeMap0.containsKey((Object) null);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AbstractMap.SimpleImmutableEntry<String, String> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, String>(":.A{P 7s>L.x", ":.A{P 7s>L.x");
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Object>(abstractMap_SimpleImmutableEntry0);
      LinkedTreeMap<LinkedTreeMap<Integer, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Integer, Object>, AbstractMap.SimpleEntry<Object, Object>>((Comparator<? super LinkedTreeMap<Integer, Object>>) null);
      boolean boolean0 = linkedTreeMap0.containsKey(abstractMap_SimpleEntry0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Comparable<String>> linkedTreeMap0 = new LinkedTreeMap<Object, Comparable<String>>(comparator0);
      // Undeclared exception!
      try { 
        linkedTreeMap0.removeInternal((LinkedTreeMap.Node<Object, Comparable<String>>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, AbstractMap.SimpleEntry<Object, Object>>(comparator0);
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
  public void test26()  throws Throwable  {
      LinkedTreeMap<Integer, Integer> linkedTreeMap0 = new LinkedTreeMap<Integer, Integer>();
      linkedTreeMap0.clear();
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, Object>, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      LinkedTreeMap<Integer, String> linkedTreeMap1 = new LinkedTreeMap<Integer, String>();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(linkedTreeMap1);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap1.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedTreeMap<String, LinkedTreeMap<Integer, String>> linkedTreeMap0 = new LinkedTreeMap<String, LinkedTreeMap<Integer, String>>();
      LinkedTreeMap<Object, Object> linkedTreeMap1 = new LinkedTreeMap<Object, Object>((Comparator<? super Object>) null);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.contains(linkedTreeMap1);
      assertEquals(0, linkedTreeMap_EntrySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleEntry<Object, String>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<Object, Integer>, AbstractMap.SimpleEntry<Object, String>>();
      linkedTreeMap_Node0.right = linkedTreeMap_Node0;
      // Undeclared exception!
      linkedTreeMap_Node0.last();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object>();
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<String, Object>, Object> linkedTreeMap_Node1 = linkedTreeMap_Node0.last();
      assertNotNull(linkedTreeMap_Node1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<Object, Object>>();
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<Object, Object>>();
      linkedTreeMap_Node0.left = linkedTreeMap_Node1;
      LinkedTreeMap.Node<Object, AbstractMap.SimpleEntry<Object, Object>> linkedTreeMap_Node2 = linkedTreeMap_Node0.first();
      assertNotNull(linkedTreeMap_Node2);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Object object0 = linkedTreeMap_Node0.setValue(linkedTreeMap0);
      assertEquals(0, linkedTreeMap0.size());
      assertNull(object0);
      
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      Object object0 = linkedTreeMap_Node0.setValue(linkedTreeMap0);
      assertEquals(0, linkedTreeMap0.size());
      assertNull(object0);
      
      LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<Integer, String>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleImmutableEntry<Object, String>, AbstractMap.SimpleEntry<Integer, String>>();
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap_Node1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      Integer integer0 = new Integer(664);
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node1 = new LinkedTreeMap.Node<Integer, Object>(linkedTreeMap_Node0, integer0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node1.equals(linkedTreeMap_Node1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Integer integer0 = new Integer(835);
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(integer0, "");
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, LinkedTreeMap<Object, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, LinkedTreeMap<Object, Integer>>();
      boolean boolean0 = linkedTreeMap_Node0.equals(abstractMap_SimpleEntry0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>(comparator0);
      AbstractMap.SimpleEntry<String, Object> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, Object>("\")*:+Vv(+m5sB+|$", linkedTreeMap0);
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, LinkedTreeMap<Object, Integer>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, LinkedTreeMap<Object, Integer>>();
      LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, LinkedTreeMap<Object, Integer>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<AbstractMap.SimpleEntry<String, Object>, LinkedTreeMap<Object, Integer>>(linkedTreeMap_Node0, abstractMap_SimpleEntry0, linkedTreeMap_Node0, linkedTreeMap_Node0);
      boolean boolean0 = linkedTreeMap_Node1.equals(abstractMap_SimpleEntry0);
      assertEquals(0, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      boolean boolean0 = linkedTreeMap_Node0.equals(linkedTreeMap0);
      assertFalse(boolean0);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>();
      linkedTreeMap0.keySet();
      Set<Integer> set0 = linkedTreeMap0.keySet();
      assertTrue(set0.isEmpty());
      assertNotNull(set0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedTreeMap<LinkedTreeMap<Object, String>, String> linkedTreeMap0 = new LinkedTreeMap<LinkedTreeMap<Object, String>, String>();
      linkedTreeMap0.entrySet();
      LinkedTreeMap<Object, Object> linkedTreeMap1 = new LinkedTreeMap<Object, Object>();
      linkedTreeMap0.containsValue(linkedTreeMap1);
      assertEquals(0, linkedTreeMap1.size());
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Comparable<Object>> linkedTreeMap0 = new LinkedTreeMap<String, Comparable<Object>>(comparator0);
      LinkedTreeMap.Node<String, Comparable<Object>> linkedTreeMap_Node0 = new LinkedTreeMap.Node<String, Comparable<Object>>();
      LinkedTreeMap.Node<String, Comparable<Object>> linkedTreeMap_Node1 = new LinkedTreeMap.Node<String, Comparable<Object>>();
      LinkedTreeMap.Node<String, Comparable<Object>> linkedTreeMap_Node2 = new LinkedTreeMap.Node<String, Comparable<Object>>(linkedTreeMap_Node1, " cS ", linkedTreeMap_Node0, linkedTreeMap_Node1);
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
  public void test41()  throws Throwable  {
      AbstractMap.SimpleImmutableEntry<String, Object> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<String, Object>("", "");
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.put("", "CI8s\" >Aq+D%WB^");
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      boolean boolean0 = linkedTreeMap_EntrySet0.remove(abstractMap_SimpleImmutableEntry0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.put("", "CI8s\" >Aq+D%WB^");
      linkedTreeMap0.put("CI8s\" >Aq+D%WB^", "");
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove("");
      assertEquals(1, linkedTreeMap0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, Object> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleEntry<Object, String>, Object>();
      LinkedTreeMap<Integer, Integer> linkedTreeMap1 = new LinkedTreeMap<Integer, Integer>();
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(linkedTreeMap1, "");
      // Undeclared exception!
      try { 
        linkedTreeMap0.put(abstractMap_SimpleEntry0, (Object) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.AbstractMap$SimpleEntry is not Comparable
         //
         verifyException("com.google.gson.internal.LinkedTreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedTreeMap<String, String> linkedTreeMap0 = new LinkedTreeMap<String, String>();
      linkedTreeMap0.put("CI8s\" >Aq+D%WB^", "CI8s\" >Aq+D%WB^");
      linkedTreeMap0.put("78", "CI8s\" >Aq+D%WB^");
      AbstractMap.SimpleEntry<String, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<String, String>("6\">9dGr", "1Mj7&7M99esjZE");
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.contains(abstractMap_SimpleEntry0);
      assertEquals(2, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(664).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>(comparator0);
      Integer integer0 = new Integer((-2));
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute("\".", biFunction0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.remove("com.google.gson.internal.LinkedTreeMap$1");
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>(comparator0);
      Integer integer0 = new Integer((-2));
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute("\".", biFunction0);
      BiFunction<Object, Integer, Integer> biFunction1 = (BiFunction<Object, Integer, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction1).apply(any() , anyInt());
      linkedTreeMap0.compute("\".", biFunction1);
      assertEquals(0, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedTreeMap<Map.Entry<Object, Object>, AbstractMap.SimpleEntry<Map.Entry<String, Object>, String>> linkedTreeMap0 = new LinkedTreeMap<Map.Entry<Object, Object>, AbstractMap.SimpleEntry<Map.Entry<String, Object>, String>>();
      int int0 = linkedTreeMap0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      linkedTreeMap0.put("com.google.gson.internal.LinkedTreeMap$1", "com.google.gson.internal.LinkedTreeMap$1");
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      Predicate<Object> predicate0 = Predicate.isEqual((Object) null);
      boolean boolean0 = linkedTreeMap_KeySet0.removeIf(predicate0);
      assertEquals(1, linkedTreeMap0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedTreeMap.Node<Integer, Object> linkedTreeMap_Node0 = new LinkedTreeMap.Node<Integer, Object>();
      String string0 = linkedTreeMap_Node0.toString();
      assertEquals("null=null", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Integer> linkedTreeMap0 = new LinkedTreeMap<String, Integer>(comparator0);
      Integer integer0 = new Integer((-2));
      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(biFunction0).apply(any() , any());
      linkedTreeMap0.compute("\".", biFunction0);
      BiFunction<Object, Object, Integer> biFunction1 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction1).apply(any() , any());
      linkedTreeMap0.replaceAll(biFunction1);
      assertEquals(1, linkedTreeMap0.size());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Integer, String> linkedTreeMap0 = new LinkedTreeMap<Integer, String>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      int int0 = linkedTreeMap_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedTreeMap<Object, LinkedTreeMap<Object, String>> linkedTreeMap0 = new LinkedTreeMap<Object, LinkedTreeMap<Object, String>>();
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      boolean boolean0 = linkedTreeMap_KeySet0.contains((Object) null);
      assertEquals(0, linkedTreeMap_KeySet0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<String, Object> linkedTreeMap0 = new LinkedTreeMap<String, Object>(comparator0);
      LinkedTreeMap.KeySet linkedTreeMap_KeySet0 = linkedTreeMap0.new KeySet();
      linkedTreeMap_KeySet0.clear();
      assertEquals(0, linkedTreeMap_KeySet0.size());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      LinkedTreeMap<Object, Object> linkedTreeMap0 = new LinkedTreeMap<Object, Object>(comparator0);
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      int int0 = linkedTreeMap_EntrySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, LinkedTreeMap<Object, Object>> linkedTreeMap0 = new LinkedTreeMap<AbstractMap.SimpleImmutableEntry<String, Object>, LinkedTreeMap<Object, Object>>();
      LinkedTreeMap.EntrySet linkedTreeMap_EntrySet0 = linkedTreeMap0.new EntrySet();
      linkedTreeMap_EntrySet0.clear();
      assertEquals(0, linkedTreeMap_EntrySet0.size());
  }
}
