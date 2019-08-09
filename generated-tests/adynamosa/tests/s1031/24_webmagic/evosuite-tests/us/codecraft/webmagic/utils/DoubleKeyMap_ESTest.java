/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 01:53:29 GMT 2019
 */

package us.codecraft.webmagic.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.utils.DoubleKeyMap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DoubleKeyMap_ESTest extends DoubleKeyMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, String, Integer>(class0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Object, Map<HashMap<Map<Object, Integer>, Object>, String>> hashMap0 = new HashMap<Object, Map<HashMap<Map<Object, Integer>, Object>, String>>();
      DoubleKeyMap<Object, HashMap<Map<Object, Integer>, Object>, String> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Map<Object, Integer>, Object>, String>(hashMap0);
      HashMap<Map<Object, Integer>, Object> hashMap1 = new HashMap<Map<Object, Integer>, Object>();
      HashMap<HashMap<Map<Object, Integer>, Object>, String> hashMap2 = new HashMap<HashMap<Map<Object, Integer>, Object>, String>();
      hashMap2.put(hashMap1, "");
      hashMap0.put("#c&hXc-bbVl6x,/Q", hashMap2);
      doubleKeyMap0.remove((Object) "#c&hXc-bbVl6x,/Q", hashMap1);
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Map> class0 = Map.class;
      HashMap<Integer, Map<String, Map<Object, Integer>>> hashMap0 = new HashMap<Integer, Map<String, Map<Object, Integer>>>();
      DoubleKeyMap<Integer, String, Map<Object, Integer>> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Map<Object, Integer>>(hashMap0, class0);
      Integer integer0 = new Integer(437);
      HashMap<Object, Map<Object, String>> hashMap1 = new HashMap<Object, Map<Object, String>>();
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>(hashMap1);
      Map<String, Map<Object, Integer>> map0 = doubleKeyMap1.newMap();
      hashMap0.put(integer0, map0);
      Map<String, Map<Object, Integer>> map1 = doubleKeyMap0.remove(integer0);
      assertTrue(map1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>((Map<Integer, Map<String, Object>>) null);
      Integer integer0 = new Integer(2092);
      doubleKeyMap0.put(integer0, "us.codecraft.webmagic.utils.MultiKeyMapBase", (Object) null);
      Map<String, Object> map0 = doubleKeyMap0.remove(integer0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<String, Object>, Object, HashMap<String, String>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, Object, HashMap<String, String>>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      doubleKeyMap0.put(hashMap0, (Object) class0, hashMap1);
      Map<Object, HashMap<String, String>> map0 = doubleKeyMap0.get(hashMap0);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      DoubleKeyMap<Map<Object, String>, Integer, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, Integer, HashMap<Object, Object>>();
      HashMap<Object, Object> hashMap1 = doubleKeyMap0.remove((Map<Object, String>) hashMap0, (Integer) null);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<Integer, Map<String, HashMap<Integer, Map<Object, Integer>>>> hashMap0 = new HashMap<Integer, Map<String, HashMap<Integer, Map<Object, Integer>>>>();
      DoubleKeyMap<Integer, String, HashMap<Integer, Map<Object, Integer>>> doubleKeyMap0 = new DoubleKeyMap<Integer, String, HashMap<Integer, Map<Object, Integer>>>(hashMap0);
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>();
      Map<String, Map<Object, Object>> map0 = doubleKeyMap1.newMap();
      DoubleKeyMap<String, Object, Object> doubleKeyMap2 = new DoubleKeyMap<String, Object, Object>(map0);
      Object object0 = doubleKeyMap2.remove("", (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<Integer, String, Map<Object, Map<Object, Integer>>> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Map<Object, Map<Object, Integer>>>();
      Map<Object, Map<Object, Integer>> map0 = doubleKeyMap0.remove((Integer) null, "=#}");
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<Object, Map<HashMap<Map<Object, Integer>, Object>, String>> hashMap0 = new HashMap<Object, Map<HashMap<Map<Object, Integer>, Object>, String>>();
      HashMap<Map<Object, Integer>, Object> hashMap1 = new HashMap<Map<Object, Integer>, Object>();
      DoubleKeyMap<Object, HashMap<Map<Object, Integer>, Object>, String> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Map<Object, Integer>, Object>, String>(hashMap0);
      Object object0 = new Object();
      String string0 = doubleKeyMap0.remove(object0, hashMap1);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Object, Map<Object, Map<Integer, String>>> hashMap0 = new HashMap<Object, Map<Object, Map<Integer, String>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, Map<Integer, String>> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Map<Integer, String>>(hashMap0, class0);
      Map<Object, Map<Integer, String>> map0 = doubleKeyMap0.remove((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<String, HashMap<Integer, Map<Object, Integer>>, Object> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Integer, Map<Object, Integer>>, Object>();
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>();
      Map<Object, String> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>();
      DoubleKeyMap<String, Object, Map<Object, Integer>> doubleKeyMap1 = new DoubleKeyMap<String, Object, Map<Object, Integer>>();
      DoubleKeyMap<Integer, String, Map<Object, Integer>> doubleKeyMap2 = new DoubleKeyMap<Integer, String, Map<Object, Integer>>((Map<Integer, Map<String, Map<Object, Integer>>>) null);
      Map<Object, Integer> map0 = doubleKeyMap2.newMap();
      Map<Object, Integer> map1 = doubleKeyMap1.put("", (Object) doubleKeyMap0, map0);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      HashMap<String, Map<Object, Integer>> hashMap0 = new HashMap<String, Map<Object, Integer>>();
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>(hashMap0, class0);
      Map<Object, Map<Integer, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, Integer, String> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, String>(map0);
      String string0 = doubleKeyMap1.get((Object) "", (Integer) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleKeyMap<String, Map<Integer, Object>, String> doubleKeyMap0 = new DoubleKeyMap<String, Map<Integer, Object>, String>((Map<String, Map<Map<Integer, Object>, String>>) null);
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      String string0 = doubleKeyMap0.get((String) null, (Map<Integer, Object>) hashMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Object, Map<Object, Map<Object, Integer>>> hashMap0 = new HashMap<Object, Map<Object, Map<Object, Integer>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, Map<Object, Integer>> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Map<Object, Integer>>(hashMap0, class0);
      Object object0 = new Object();
      Map<Object, Integer> map0 = doubleKeyMap0.get(object0, object0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleKeyMap<Object, HashMap<Object, String>, String> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Object, String>, String>();
      Map<Map<Object, Integer>, Map<Object, HashMap<Object, Integer>>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Map<Object, Integer>, Object, HashMap<Object, Integer>> doubleKeyMap1 = new DoubleKeyMap<Map<Object, Integer>, Object, HashMap<Object, Integer>>(map0);
      Map<Object, HashMap<Object, Integer>> map1 = doubleKeyMap1.get((Map<Object, Integer>) null);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Map<String, Map<Map<Object, String>, Object>>, HashMap<Integer, String>> doubleKeyMap0 = new DoubleKeyMap<String, Map<String, Map<Map<Object, String>, Object>>, HashMap<Integer, String>>();
      Map<String, Map<Map<Object, String>, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<String, Map<Object, String>, Object> doubleKeyMap1 = new DoubleKeyMap<String, Map<Object, String>, Object>(map0, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap1.put("", (Map<Object, String>) null, (Object) "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Integer, Map<String, HashMap<Integer, Map<Object, Integer>>>> hashMap0 = new HashMap<Integer, Map<String, HashMap<Integer, Map<Object, Integer>>>>();
      DoubleKeyMap<Integer, String, HashMap<Integer, Map<Object, Integer>>> doubleKeyMap0 = new DoubleKeyMap<Integer, String, HashMap<Integer, Map<Object, Integer>>>(hashMap0);
      HashMap<Integer, Map<Object, Integer>> hashMap1 = new HashMap<Integer, Map<Object, Integer>>();
      HashMap<Integer, Map<Object, Integer>> hashMap2 = doubleKeyMap0.put((Integer) null, "", hashMap1);
      HashMap<Integer, Map<Object, Integer>> hashMap3 = doubleKeyMap0.put((Integer) null, "", hashMap2);
      assertSame(hashMap3, hashMap1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleKeyMap<String, String, Map<Object, String>> doubleKeyMap0 = new DoubleKeyMap<String, String, Map<Object, String>>();
      DoubleKeyMap<HashMap<Integer, String>, Integer, Integer> doubleKeyMap1 = new DoubleKeyMap<HashMap<Integer, String>, Integer, Integer>();
      Map<Object, String> map0 = doubleKeyMap1.newMap();
      doubleKeyMap0.put("", "", map0);
      Map<Object, String> map1 = doubleKeyMap0.get("", "");
      assertTrue(map1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, String, String>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DoubleKeyMap<HashMap<Map<Object, Integer>, Map<Object, Integer>>, HashMap<String, Object>, String> doubleKeyMap0 = new DoubleKeyMap<HashMap<Map<Object, Integer>, Map<Object, Integer>>, HashMap<String, Object>, String>();
      HashMap<Map<Object, Integer>, Map<Object, Integer>> hashMap0 = new HashMap<Map<Object, Integer>, Map<Object, Integer>>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
      hashMap2.put("", hashMap1);
      doubleKeyMap0.put(hashMap0, hashMap2, "");
      String string0 = doubleKeyMap0.remove(hashMap0, hashMap1);
      assertNull(string0);
  }
}