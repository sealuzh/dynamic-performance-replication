/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 03:56:36 GMT 2019
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
      HashMap<Map<Object, String>, Map<String, HashMap<String, Object>>> hashMap0 = new HashMap<Map<Object, String>, Map<String, HashMap<String, Object>>>();
      HashMap<String, HashMap<String, Object>> hashMap1 = new HashMap<String, HashMap<String, Object>>();
      hashMap0.put((Map<Object, String>) null, hashMap1);
      DoubleKeyMap<Map<Object, String>, String, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, String, HashMap<String, Object>>(hashMap0);
      Map<String, HashMap<String, Object>> map0 = doubleKeyMap0.remove((Map<Object, String>) null);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Map<Object, String>, Map<String, HashMap<String, Object>>> hashMap0 = new HashMap<Map<Object, String>, Map<String, HashMap<String, Object>>>();
      HashMap<String, HashMap<String, Object>> hashMap1 = new HashMap<String, HashMap<String, Object>>();
      HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
      hashMap1.put("", hashMap2);
      hashMap0.put((Map<Object, String>) null, hashMap1);
      DoubleKeyMap<Map<Object, String>, String, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, String, HashMap<String, Object>>(hashMap0);
      Map<String, HashMap<String, Object>> map0 = doubleKeyMap0.remove((Map<Object, String>) null);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<Map<Object, String>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, Object, Object>();
      Object object0 = new Object();
      Object object1 = doubleKeyMap0.remove((Map<Object, String>) null, object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      Integer integer0 = new Integer(1);
      HashMap<Object, Map<Integer, Object>> hashMap0 = new HashMap<Object, Map<Integer, Object>>();
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>(hashMap0, class0);
      Object object0 = doubleKeyMap0.remove((Object) null, integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<Integer, Object, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, String>();
      HashMap<Object, Map<String, Object>> hashMap0 = new HashMap<Object, Map<String, Object>>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>(hashMap0);
      Object object0 = doubleKeyMap1.remove((Object) doubleKeyMap0, "L76vUrgL9");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      Map<Object, Map<Integer, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Object>(map0);
      DoubleKeyMap<Object, HashMap<String, Object>, HashMap<String, String>> doubleKeyMap2 = new DoubleKeyMap<Object, HashMap<String, Object>, HashMap<String, String>>();
      Map<HashMap<String, Object>, HashMap<String, String>> map1 = doubleKeyMap2.remove((Object) doubleKeyMap1);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Object, String, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<Object, String, HashMap<Object, Object>>();
      Map<HashMap<String, Integer>, Map<Map<Integer, Object>, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<HashMap<String, Integer>, Map<Integer, Object>, String> doubleKeyMap1 = new DoubleKeyMap<HashMap<String, Integer>, Map<Integer, Object>, String>(map0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      String string0 = doubleKeyMap1.put(hashMap0, (Map<Integer, Object>) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, Map<Object, HashMap<String, Object>>> hashMap0 = new HashMap<String, Map<Object, HashMap<String, Object>>>();
      DoubleKeyMap<String, Object, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<String, Object, HashMap<String, Object>>(hashMap0);
      Map<String, Map<Object, String>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, String> doubleKeyMap1 = new DoubleKeyMap<String, Object, String>(map0, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap1.put("", (Object) doubleKeyMap0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<Integer, String, String> doubleKeyMap0 = new DoubleKeyMap<Integer, String, String>();
      Integer integer0 = new Integer(0);
      DoubleKeyMap<Object, HashMap<String, String>, Object> doubleKeyMap1 = new DoubleKeyMap<Object, HashMap<String, String>, Object>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Object object0 = doubleKeyMap1.put((Object) doubleKeyMap0, hashMap0, (Object) integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<String, Map<Object, String>, HashMap<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<String, Map<Object, String>, HashMap<Integer, Object>>();
      HashMap<Integer, Object> hashMap0 = doubleKeyMap0.get("", (Map<Object, String>) null);
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, String, Integer> doubleKeyMap0 = new DoubleKeyMap<String, String, Integer>(class0);
      Integer integer0 = doubleKeyMap0.get((String) null, "j0^");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<Object, HashMap<String, Object>, HashMap<String, String>> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<String, Object>, HashMap<String, String>>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(0);
      Object object0 = new Object();
      HashMap<String, String> hashMap1 = doubleKeyMap0.get(object0, hashMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, HashMap<String, String>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, String>, String>(class0);
      Map<HashMap<String, String>, String> map0 = doubleKeyMap0.get((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<Map<Object, String>, Map<String, HashMap<String, Object>>> hashMap0 = new HashMap<Map<Object, String>, Map<String, HashMap<String, Object>>>();
      DoubleKeyMap<Map<Object, String>, String, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, String, HashMap<String, Object>>(hashMap0);
      DoubleKeyMap<Integer, Object, String> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, String>();
      Map<Object, Map<String, String>> map0 = doubleKeyMap1.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, String> doubleKeyMap2 = new DoubleKeyMap<Object, String, String>(map0, class0);
      Map<String, String> map1 = doubleKeyMap2.get((Object) doubleKeyMap0);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleKeyMap<Map<Object, Integer>, Object, String> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Integer>, Object, String>();
      HashMap<Object, Map<Integer, Object>> hashMap0 = new HashMap<Object, Map<Integer, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Object>(hashMap0, class0);
      Integer integer0 = new Integer((-2802));
      // Undeclared exception!
      try { 
        doubleKeyMap1.put((Object) null, integer0, (Object) doubleKeyMap0);
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
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>((Map<String, Map<Object, Integer>>) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleKeyMap<String, String, String> doubleKeyMap0 = new DoubleKeyMap<String, String, String>();
      doubleKeyMap0.put("b,%", "wrong proto type map ", "");
      String string0 = doubleKeyMap0.remove("b,%", "noJ0BM.O]e");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<String, Object, Map<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<String, Object, Map<Integer, Object>>((Map<String, Map<Object, Map<Integer, Object>>>) null);
      Map<Integer, Object> map0 = doubleKeyMap0.remove("", (Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleKeyMap<String, String, String> doubleKeyMap0 = new DoubleKeyMap<String, String, String>();
      doubleKeyMap0.put("", "", "`iIvAy");
      String string0 = doubleKeyMap0.put("", "", (String) null);
      assertNotNull(string0);
      assertEquals("`iIvAy", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DoubleKeyMap<String, Object, Map<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<String, Object, Map<Integer, Object>>((Map<String, Map<Object, Map<Integer, Object>>>) null);
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      doubleKeyMap0.put("", (Object) "", (Map<Integer, Object>) hashMap0);
      Object object0 = new Object();
      Map<Integer, Object> map0 = doubleKeyMap0.get("", object0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DoubleKeyMap<String, String, String> doubleKeyMap0 = new DoubleKeyMap<String, String, String>();
      doubleKeyMap0.put("b,%", "wrong proto type map ", "");
      String string0 = doubleKeyMap0.remove("b,%", "wrong proto type map ");
      assertEquals("", string0);
      assertNotNull(string0);
  }
}