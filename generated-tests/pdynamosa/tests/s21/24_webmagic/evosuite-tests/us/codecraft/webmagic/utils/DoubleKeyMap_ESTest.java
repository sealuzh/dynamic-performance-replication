/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 07:30:09 GMT 2019
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
      DoubleKeyMap<Integer, String, String> doubleKeyMap0 = new DoubleKeyMap<Integer, String, String>();
      Integer integer0 = new Integer(0);
      doubleKeyMap0.put(integer0, "", "");
      Map<String, String> map0 = doubleKeyMap0.remove(integer0);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<HashMap<String, Object>, Map<Object, HashMap<String, String>>> hashMap0 = new HashMap<HashMap<String, Object>, Map<Object, HashMap<String, String>>>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      HashMap<Object, HashMap<String, String>> hashMap2 = new HashMap<Object, HashMap<String, String>>();
      hashMap0.put(hashMap1, hashMap2);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<String, Object>, Object, HashMap<String, String>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, Object, HashMap<String, String>>(hashMap0, class0);
      Map<Object, HashMap<String, String>> map0 = doubleKeyMap0.get(hashMap1);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, String>();
      String string0 = doubleKeyMap0.remove((Object) class0, (Integer) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<Map<Map<String, HashMap<Object, Object>>, Integer>, Map<Object, Integer>, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Map<String, HashMap<Object, Object>>, Integer>, Map<Object, Integer>, Object>();
      DoubleKeyMap<String, Object, Map<String, Object>> doubleKeyMap1 = new DoubleKeyMap<String, Object, Map<String, Object>>();
      Map<String, Object> map0 = doubleKeyMap1.remove("#C", (Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<Map<String, HashMap<Object, Object>>, HashMap<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Map<String, HashMap<Object, Object>>, HashMap<Integer, String>, Object>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>();
      Object object0 = doubleKeyMap1.remove((Object) doubleKeyMap0, "IyOImR}_%j@<m`<{bM");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Object, Map<Map<String, HashMap<Object, Object>>, Map<String, Object>>> hashMap0 = new HashMap<Object, Map<Map<String, HashMap<Object, Object>>, Map<String, Object>>>();
      DoubleKeyMap<Object, Map<String, HashMap<Object, Object>>, Map<String, Object>> doubleKeyMap0 = new DoubleKeyMap<Object, Map<String, HashMap<Object, Object>>, Map<String, Object>>(hashMap0);
      Map<Map<String, HashMap<Object, Object>>, Map<String, Object>> map0 = doubleKeyMap0.remove((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Object, String, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<Object, String, HashMap<Object, Object>>();
      Map<Object, Map<Object, HashMap<Integer, String>>> map0 = doubleKeyMap0.newMap();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Object, HashMap<Integer, String>> doubleKeyMap1 = new DoubleKeyMap<Object, Object, HashMap<Integer, String>>(map0, class0);
      Map<Object, HashMap<Integer, String>> map1 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<Map<String, HashMap<Object, Object>>, HashMap<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Map<String, HashMap<Object, Object>>, HashMap<Integer, String>, Object>();
      DoubleKeyMap<Map<Object, Map<Object, Integer>>, String, Object> doubleKeyMap1 = new DoubleKeyMap<Map<Object, Map<Object, Integer>>, String, Object>();
      Map<Object, Map<Object, Integer>> map0 = doubleKeyMap1.newMap();
      Object object0 = doubleKeyMap1.put(map0, "", (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<Object, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, String>();
      Integer integer0 = new Integer(0);
      String string0 = doubleKeyMap0.put((Object) null, integer0, "PUuco=17*PE");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<Map<String, HashMap<Object, Object>>, HashMap<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Map<String, HashMap<Object, Object>>, HashMap<Integer, String>, Object>();
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Integer>();
      Integer integer0 = doubleKeyMap1.put((Object) doubleKeyMap0, (Integer) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<HashMap<Object, String>, HashMap<Object, Object>, HashMap<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, String>, HashMap<Object, Object>, HashMap<Integer, Object>>();
      Map<Integer, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, Object>(map0);
      Object object0 = new Object();
      Object object1 = doubleKeyMap1.get((Integer) null, object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>(class0);
      Object object0 = new Object();
      Object object1 = doubleKeyMap0.get(object0, (Object) "ca9)y/");
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Map<String, HashMap<Object, Object>>> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Map<String, HashMap<Object, Object>>>();
      Map<Object, Map<String, HashMap<Object, Object>>> map0 = doubleKeyMap0.get((Integer) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleKeyMap<Object, Map<Integer, Map<Object, Map<Object, String>>>, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Map<Integer, Map<Object, Map<Object, String>>>, Integer>();
      Map<Integer, Map<Object, Map<Object, String>>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Object, Map<Object, String>> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, Map<Object, String>>(map0, class0);
      Integer integer0 = new Integer(1);
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      // Undeclared exception!
      try { 
        doubleKeyMap1.put(integer0, (Object) doubleKeyMap0, (Map<Object, String>) hashMap0);
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
      DoubleKeyMap<Map<String, HashMap<Object, Object>>, Object, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Map<String, HashMap<Object, Object>>, Object, Integer>((Map<Map<String, HashMap<Object, Object>>, Map<Object, Integer>>) null, class0);
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
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      DoubleKeyMap<String, Map<String, HashMap<Object, Object>>, Object> doubleKeyMap1 = new DoubleKeyMap<String, Map<String, HashMap<Object, Object>>, Object>();
      Map<Object, String> map0 = doubleKeyMap0.get((Object) doubleKeyMap1);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleKeyMap<HashMap<String, String>, Map<String, Map<String, HashMap<Object, Object>>>, Map<String, HashMap<Object, Object>>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, Map<String, Map<String, HashMap<Object, Object>>>, Map<String, HashMap<Object, Object>>>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<String, Map<String, HashMap<Object, Object>>> hashMap1 = new HashMap<String, Map<String, HashMap<Object, Object>>>();
      HashMap<String, HashMap<Object, Object>> hashMap2 = new HashMap<String, HashMap<Object, Object>>(503);
      doubleKeyMap0.put(hashMap0, (Map<String, Map<String, HashMap<Object, Object>>>) hashMap1, (Map<String, HashMap<Object, Object>>) hashMap2);
      hashMap1.put("kehdx1V:^a", (Map<String, HashMap<Object, Object>>) null);
      Map<String, HashMap<Object, Object>> map0 = doubleKeyMap0.remove(hashMap0, (Map<String, Map<String, HashMap<Object, Object>>>) hashMap1);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<HashMap<String, String>, Map<String, Map<String, HashMap<Object, Object>>>, Map<String, HashMap<Object, Object>>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, Map<String, Map<String, HashMap<Object, Object>>>, Map<String, HashMap<Object, Object>>>();
      HashMap<String, Map<String, HashMap<Object, Object>>> hashMap0 = new HashMap<String, Map<String, HashMap<Object, Object>>>();
      Map<String, HashMap<Object, Object>> map0 = doubleKeyMap0.remove((HashMap<String, String>) null, (Map<String, Map<String, HashMap<Object, Object>>>) hashMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleKeyMap<HashMap<String, String>, Map<String, Map<String, HashMap<Object, Object>>>, Map<String, HashMap<Object, Object>>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, Map<String, Map<String, HashMap<Object, Object>>>, Map<String, HashMap<Object, Object>>>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<String, Map<String, HashMap<Object, Object>>> hashMap1 = new HashMap<String, Map<String, HashMap<Object, Object>>>();
      HashMap<String, HashMap<Object, Object>> hashMap2 = new HashMap<String, HashMap<Object, Object>>(503);
      doubleKeyMap0.put(hashMap0, (Map<String, Map<String, HashMap<Object, Object>>>) hashMap1, (Map<String, HashMap<Object, Object>>) hashMap2);
      Map<String, HashMap<Object, Object>> map0 = doubleKeyMap0.put(hashMap0, (Map<String, Map<String, HashMap<Object, Object>>>) hashMap1, (Map<String, HashMap<Object, Object>>) hashMap2);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      HashMap<HashMap<String, Object>, Map<Object, Object>> hashMap1 = new HashMap<HashMap<String, Object>, Map<Object, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<String, Object>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, Object, Object>(hashMap1, class0);
      Object object0 = doubleKeyMap0.get(hashMap0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<Map<String, HashMap<Object, Object>>, Object>, String, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<HashMap<Map<String, HashMap<Object, Object>>, Object>, String, Object>(class0);
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
      HashMap<HashMap<String, Object>, Map<Object, Object>> hashMap0 = new HashMap<HashMap<String, Object>, Map<Object, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<String, Object>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, Object, Object>(hashMap0, class0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
      hashMap0.put(hashMap1, hashMap2);
      Object object0 = doubleKeyMap0.get(hashMap1, (Object) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DoubleKeyMap<HashMap<String, String>, Map<String, Map<String, HashMap<Object, Object>>>, Map<String, HashMap<Object, Object>>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, Map<String, Map<String, HashMap<Object, Object>>>, Map<String, HashMap<Object, Object>>>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<String, Map<String, HashMap<Object, Object>>> hashMap1 = new HashMap<String, Map<String, HashMap<Object, Object>>>();
      HashMap<String, HashMap<Object, Object>> hashMap2 = new HashMap<String, HashMap<Object, Object>>(503);
      doubleKeyMap0.put(hashMap0, (Map<String, Map<String, HashMap<Object, Object>>>) hashMap1, (Map<String, HashMap<Object, Object>>) hashMap2);
      Map<String, HashMap<Object, Object>> map0 = doubleKeyMap0.remove(hashMap0, (Map<String, Map<String, HashMap<Object, Object>>>) hashMap1);
      assertEquals(0, map0.size());
  }
}
