/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 12:09:49 GMT 2019
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
      HashMap<HashMap<Object, String>, Map<Map<Object, String>, Object>> hashMap0 = new HashMap<HashMap<Object, String>, Map<Map<Object, String>, Object>>();
      Class<Map> class0 = Map.class;
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      HashMap<Map<Object, String>, Object> hashMap2 = new HashMap<Map<Object, String>, Object>();
      hashMap0.put(hashMap1, hashMap2);
      DoubleKeyMap<HashMap<Object, String>, Map<Object, String>, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, String>, Map<Object, String>, Object>(hashMap0, class0);
      Map<Map<Object, String>, Object> map0 = doubleKeyMap0.remove(hashMap1);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleKeyMap<HashMap<Map<Object, String>, Integer>, Map<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Map<Object, String>, Integer>, Map<Integer, String>, Object>();
      HashMap<Map<Object, String>, Integer> hashMap0 = new HashMap<Map<Object, String>, Integer>();
      DoubleKeyMap<Map<Integer, String>, String, Object> doubleKeyMap1 = new DoubleKeyMap<Map<Integer, String>, String, Object>();
      Map<Integer, String> map0 = doubleKeyMap1.newMap();
      doubleKeyMap0.put(hashMap0, map0, (Object) hashMap0);
      Map<Map<Integer, String>, Object> map1 = doubleKeyMap0.remove(hashMap0);
      assertEquals(1, map1.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<HashMap<Map<Object, String>, Integer>, Map<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Map<Object, String>, Integer>, Map<Integer, String>, Object>();
      HashMap<Map<Object, String>, Integer> hashMap0 = new HashMap<Map<Object, String>, Integer>();
      DoubleKeyMap<Map<Integer, String>, String, Object> doubleKeyMap1 = new DoubleKeyMap<Map<Integer, String>, String, Object>();
      Map<Integer, String> map0 = doubleKeyMap1.newMap();
      doubleKeyMap0.put(hashMap0, map0, (Object) hashMap0);
      HashMap hashMap1 = (HashMap)doubleKeyMap0.put(hashMap0, map0, (Object) map0);
      assertTrue(hashMap1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<HashMap<String, String>, Map<HashMap<Object, Map<Object, String>>, Integer>> hashMap0 = new HashMap<HashMap<String, String>, Map<HashMap<Object, Map<Object, String>>, Integer>>();
      DoubleKeyMap<HashMap<String, String>, HashMap<Object, Map<Object, String>>, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, HashMap<Object, Map<Object, String>>, Integer>(hashMap0);
      Map<Object, Map<Map<Object, String>, Map<Object, Object>>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Map<Object, String>, Map<Object, Object>> doubleKeyMap1 = new DoubleKeyMap<Object, Map<Object, String>, Map<Object, Object>>(map0, class0);
      Map<Object, Object> map1 = doubleKeyMap1.remove((Object) "us.codecraft.webmagic.utils.MultiKeyMapBase", (Map<Object, String>) null);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, Map<Object, Integer>> hashMap0 = new HashMap<String, Map<Object, Integer>>();
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>(hashMap0);
      Object object0 = new Object();
      Integer integer0 = doubleKeyMap0.remove((String) null, object0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>();
      Object object0 = new Object();
      Object object1 = doubleKeyMap0.remove(object0, "us.codecraft.webmagic.utils.DoubleKeyMap");
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Integer>((Map<Object, Map<Object, Integer>>) null);
      Map<Object, Integer> map0 = doubleKeyMap0.remove((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, Map<String, Map<Object, String>>> hashMap0 = new HashMap<String, Map<String, Map<Object, String>>>();
      DoubleKeyMap<String, String, Map<Object, String>> doubleKeyMap0 = new DoubleKeyMap<String, String, Map<Object, String>>(hashMap0);
      HashMap<HashMap<String, String>, Map<HashMap<Object, Map<Object, String>>, Integer>> hashMap1 = new HashMap<HashMap<String, String>, Map<HashMap<Object, Map<Object, String>>, Integer>>();
      DoubleKeyMap<HashMap<String, String>, HashMap<Object, Map<Object, String>>, Integer> doubleKeyMap1 = new DoubleKeyMap<HashMap<String, String>, HashMap<Object, Map<Object, String>>, Integer>(hashMap1);
      Map<Object, Map<Map<Object, String>, Map<Object, Object>>> map0 = doubleKeyMap1.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Map<Object, String>, Map<Object, Object>> doubleKeyMap2 = new DoubleKeyMap<Object, Map<Object, String>, Map<Object, Object>>(map0, class0);
      Map<Map<Object, String>, Map<Object, Object>> map1 = doubleKeyMap2.remove((Object) doubleKeyMap0);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<HashMap<Object, Object>, Integer, Map<Object, String>> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, Integer, Map<Object, String>>();
      Integer integer0 = new Integer((-1));
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      doubleKeyMap0.put((HashMap<Object, Object>) null, integer0, (Map<Object, String>) hashMap0);
      Map<Integer, Map<Object, String>> map0 = doubleKeyMap0.get((HashMap<Object, Object>) null);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<Map<Object, String>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, Integer, Object>();
      Map<Object, Map<Object, HashMap<String, String>>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, Object, HashMap<String, String>> doubleKeyMap1 = new DoubleKeyMap<Object, Object, HashMap<String, String>>(map0);
      HashMap<String, String> hashMap0 = doubleKeyMap1.put((Object) doubleKeyMap0, (Object) doubleKeyMap0, (HashMap<String, String>) null);
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Integer>();
      Map<Object, Map<String, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>(map0, class0);
      Map<String, Map<Object, Object>> map1 = doubleKeyMap1.newMap();
      DoubleKeyMap<String, Object, Object> doubleKeyMap2 = new DoubleKeyMap<String, Object, Object>(map1);
      Object object0 = doubleKeyMap2.get((String) null, (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, String, Integer> doubleKeyMap0 = new DoubleKeyMap<String, String, Integer>(class0);
      Integer integer0 = doubleKeyMap0.get((String) null, (String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>();
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>();
      Map<Object, String> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<Object, Map<String, String>> hashMap0 = new HashMap<Object, Map<String, String>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>(hashMap0, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Object) hashMap0, (String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Map<Object, String>, Map<Object, String>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Integer, Map<Object, String>, Map<Object, String>>((Map<Integer, Map<Map<Object, String>, Map<Object, String>>>) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleKeyMap<Object, Map<Object, String>, HashMap<Object, Object>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Map<Object, String>, HashMap<Object, Object>>((Class<? extends Map>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleKeyMap<HashMap<Map<Object, String>, Integer>, Map<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Map<Object, String>, Integer>, Map<Integer, String>, Object>();
      HashMap<Map<Object, String>, Integer> hashMap0 = new HashMap<Map<Object, String>, Integer>();
      DoubleKeyMap<Map<Integer, String>, String, Object> doubleKeyMap1 = new DoubleKeyMap<Map<Integer, String>, String, Object>();
      doubleKeyMap0.put(hashMap0, (Map<Integer, String>) null, (Object) doubleKeyMap1);
      Map<Integer, String> map0 = doubleKeyMap1.newMap();
      Object object0 = doubleKeyMap0.remove(hashMap0, map0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<HashMap<String, Object>, HashMap<Integer, Integer>, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, HashMap<Integer, Integer>, Object>();
      HashMap<Object, Map<Object, Map<Object, String>>> hashMap0 = new HashMap<Object, Map<Object, Map<Object, String>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, Map<Object, String>> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Map<Object, String>>(hashMap0, class0);
      Map<Object, String> map0 = doubleKeyMap1.get((Object) doubleKeyMap0, (Object) class0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<Integer, Map<String, Object>> hashMap0 = new HashMap<Integer, Map<String, Object>>();
      Integer integer0 = new Integer(1466);
      DoubleKeyMap<HashMap<Object, Integer>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Integer>, Object, Object>();
      Map<String, Object> map0 = doubleKeyMap0.newMap();
      hashMap0.put(integer0, map0);
      DoubleKeyMap<Integer, String, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, String, Object>(hashMap0);
      Object object0 = doubleKeyMap1.get(integer0, "");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Integer, String>, HashMap<String, Map<Object, String>>, HashMap<Object, Object>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Map<Integer, String>, HashMap<String, Map<Object, String>>, HashMap<Object, Object>>(class0);
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
      DoubleKeyMap<HashMap<Map<Object, String>, Integer>, Map<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Map<Object, String>, Integer>, Map<Integer, String>, Object>();
      HashMap<Map<Object, String>, Integer> hashMap0 = new HashMap<Map<Object, String>, Integer>();
      DoubleKeyMap<Map<Integer, String>, String, Object> doubleKeyMap1 = new DoubleKeyMap<Map<Integer, String>, String, Object>();
      Map<Integer, String> map0 = doubleKeyMap1.newMap();
      doubleKeyMap0.put(hashMap0, map0, (Object) map0);
      HashMap hashMap1 = (HashMap)doubleKeyMap0.remove(hashMap0, map0);
      assertEquals(0, hashMap1.size());
  }
}
