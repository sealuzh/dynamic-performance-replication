/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 12:45:36 GMT 2019
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
      DoubleKeyMap<String, HashMap<Object, Integer>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, Integer>, String>();
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      doubleKeyMap0.put("", hashMap0, "");
      String string0 = doubleKeyMap0.remove("", hashMap0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleKeyMap<String, HashMap<Object, Integer>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, Integer>, String>();
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      doubleKeyMap0.put((String) null, hashMap0, (String) null);
      Map<HashMap<Object, Integer>, String> map0 = doubleKeyMap0.remove((String) null);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<String, HashMap<Object, Integer>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, Integer>, String>();
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      doubleKeyMap0.put("wrong proto type map ", hashMap0, (String) null);
      Map<HashMap<Object, Integer>, String> map0 = doubleKeyMap0.get("wrong proto type map ");
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<HashMap<Object, Map<Integer, Integer>>, Map<Object, Object>> hashMap0 = new HashMap<HashMap<Object, Map<Integer, Integer>>, Map<Object, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<Object, Map<Integer, Integer>>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Map<Integer, Integer>>, Object, Object>(hashMap0, class0);
      HashMap<Object, Map<Integer, Integer>> hashMap1 = new HashMap<Object, Map<Integer, Integer>>();
      Object object0 = doubleKeyMap0.remove(hashMap1, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<Integer, Object, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, String>();
      Map<Integer, Map<Object, HashMap<Object, String>>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, Object, HashMap<Object, String>> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, HashMap<Object, String>>(map0);
      Map<Object, Map<Integer, Map<Integer, Integer>>> map1 = doubleKeyMap1.newMap();
      DoubleKeyMap<Object, Integer, Map<Integer, Integer>> doubleKeyMap2 = new DoubleKeyMap<Object, Integer, Map<Integer, Integer>>(map1);
      DoubleKeyMap<Object, String, Object> doubleKeyMap3 = new DoubleKeyMap<Object, String, Object>();
      Object object0 = doubleKeyMap3.remove((Object) doubleKeyMap2, "*{vICw|u;L");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Object, Map<Map<Integer, Integer>, Map<HashMap<Integer, String>, Map<Object, Map<Object, Integer>>>>> hashMap0 = new HashMap<Object, Map<Map<Integer, Integer>, Map<HashMap<Integer, String>, Map<Object, Map<Object, Integer>>>>>();
      DoubleKeyMap<Object, Map<Integer, Integer>, Map<HashMap<Integer, String>, Map<Object, Map<Object, Integer>>>> doubleKeyMap0 = new DoubleKeyMap<Object, Map<Integer, Integer>, Map<HashMap<Integer, String>, Map<Object, Map<Object, Integer>>>>(hashMap0);
      DoubleKeyMap<Object, HashMap<String, Object>, Map<Object, Object>> doubleKeyMap1 = new DoubleKeyMap<Object, HashMap<String, Object>, Map<Object, Object>>();
      Map<HashMap<String, Object>, Map<Object, Object>> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<String, HashMap<Object, Integer>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, Integer>, String>();
      String string0 = doubleKeyMap0.put((String) null, (HashMap<Object, Integer>) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>();
      Integer integer0 = new Integer(1);
      Object object0 = new Object();
      Integer integer1 = doubleKeyMap0.put(object0, integer0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, HashMap<Object, Integer>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, Integer>, String>();
      Map<HashMap<Object, String>, Map<HashMap<Object, Object>, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<HashMap<Object, String>, HashMap<Object, Object>, String> doubleKeyMap1 = new DoubleKeyMap<HashMap<Object, String>, HashMap<Object, Object>, String>(map0);
      Map<HashMap<Object, Object>, Map<Integer, Integer>> map1 = doubleKeyMap1.newMap();
      DoubleKeyMap<HashMap<Object, Object>, Integer, Integer> doubleKeyMap2 = new DoubleKeyMap<HashMap<Object, Object>, Integer, Integer>(map1, class0);
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Integer integer0 = doubleKeyMap2.get(hashMap0, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Integer, Map<String, Object>> hashMap0 = new HashMap<Integer, Map<String, Object>>();
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>(hashMap0);
      Object object0 = doubleKeyMap0.get((Integer) null, "");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<HashMap<Object, Object>, Object, HashMap<String, String>> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, Object, HashMap<String, String>>();
      Map<Object, HashMap<String, String>> map0 = doubleKeyMap0.get((HashMap<Object, Object>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<Object, Map<Map<Integer, Integer>, HashMap<Integer, Map<Integer, Integer>>>> hashMap0 = new HashMap<Object, Map<Map<Integer, Integer>, HashMap<Integer, Map<Integer, Integer>>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Map<Integer, Integer>, HashMap<Integer, Map<Integer, Integer>>> doubleKeyMap0 = new DoubleKeyMap<Object, Map<Integer, Integer>, HashMap<Integer, Map<Integer, Integer>>>(hashMap0, class0);
      Object object0 = new Object();
      Map<Map<Integer, Integer>, HashMap<Integer, Map<Integer, Integer>>> map0 = doubleKeyMap0.get(object0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>();
      Map<String, Map<Object, Map<Integer, Object>>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, Map<Integer, Object>> doubleKeyMap1 = new DoubleKeyMap<String, Object, Map<Integer, Object>>(map0, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap1.put("", (Object) doubleKeyMap0, (Map<Integer, Object>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Map<Integer, Integer>, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Map<Integer, Integer>, Integer>((Map<Object, Map<Map<Integer, Integer>, Integer>>) null, class0);
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
      DoubleKeyMap<Integer, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Integer>();
      HashMap<HashMap<Object, Map<Integer, Integer>>, Map<Object, Object>> hashMap0 = new HashMap<HashMap<Object, Map<Integer, Integer>>, Map<Object, Object>>();
      DoubleKeyMap<HashMap<Object, Map<Integer, Integer>>, Object, Object> doubleKeyMap1 = new DoubleKeyMap<HashMap<Object, Map<Integer, Integer>>, Object, Object>(hashMap0, class0);
      HashMap<Object, Map<Integer, Integer>> hashMap1 = new HashMap<Object, Map<Integer, Integer>>();
      HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
      hashMap2.put((Object) null, (Object) null);
      hashMap0.put(hashMap1, hashMap2);
      doubleKeyMap1.remove(hashMap1, (Object) doubleKeyMap0);
      assertEquals(1, hashMap0.size());
      assertFalse(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      HashMap<String, Map<HashMap<Object, Integer>, String>> hashMap1 = new HashMap<String, Map<HashMap<Object, Integer>, String>>();
      DoubleKeyMap<String, HashMap<Object, Integer>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, Integer>, String>(hashMap1);
      doubleKeyMap0.put((String) null, hashMap0, "wrong proto type map ");
      String string0 = doubleKeyMap0.put((String) null, hashMap0, (String) null);
      assertEquals("wrong proto type map ", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleKeyMap<Integer, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Integer>();
      Integer integer0 = new Integer((-3383));
      doubleKeyMap0.put(integer0, "nahs)j:?xF7sK", integer0);
      Integer integer1 = doubleKeyMap0.get(integer0, "<p");
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, HashMap<String, String>, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<String, String>, Object>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Map> class0 = Map.class;
      HashMap<Integer, Map<HashMap<Map<Integer, Integer>, Object>, Object>> hashMap0 = new HashMap<Integer, Map<HashMap<Map<Integer, Integer>, Object>, Object>>();
      DoubleKeyMap<Integer, HashMap<Map<Integer, Integer>, Object>, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<Map<Integer, Integer>, Object>, Object>(hashMap0, class0);
      Integer integer0 = new Integer((-1006));
      // Undeclared exception!
      try { 
        doubleKeyMap0.put(integer0, (HashMap<Map<Integer, Integer>, Object>) null, (Object) doubleKeyMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DoubleKeyMap<String, HashMap<Object, Integer>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, Integer>, String>();
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      doubleKeyMap0.put((String) null, hashMap0, (String) null);
      String string0 = doubleKeyMap0.remove((String) null, hashMap0);
      assertNull(string0);
  }
}
