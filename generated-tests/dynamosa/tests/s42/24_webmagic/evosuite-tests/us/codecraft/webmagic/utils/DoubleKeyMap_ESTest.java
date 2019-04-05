/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 09:31:57 GMT 2019
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
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      HashMap<Map<Integer, String>, Map<String, Object>> hashMap1 = new HashMap<Map<Integer, String>, Map<String, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Integer, String>, String, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, String>, String, Object>(hashMap1, class0);
      HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
      hashMap1.put(hashMap0, hashMap2);
      Object object0 = doubleKeyMap0.get((Map<Integer, String>) hashMap0, (String) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, Map<String, String>> hashMap0 = new HashMap<String, Map<String, String>>();
      DoubleKeyMap<String, String, String> doubleKeyMap0 = new DoubleKeyMap<String, String, String>();
      Map<String, String> map0 = doubleKeyMap0.newMap();
      hashMap0.put("lYb{o,/8Iu{(6`", map0);
      DoubleKeyMap<String, String, String> doubleKeyMap1 = new DoubleKeyMap<String, String, String>(hashMap0);
      Map<String, String> map1 = doubleKeyMap1.remove("lYb{o,/8Iu{(6`");
      assertSame(map1, map0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<HashMap<String, String>, Map<Integer, Integer>> hashMap0 = new HashMap<HashMap<String, String>, Map<Integer, Integer>>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      HashMap<Integer, Integer> hashMap2 = new HashMap<Integer, Integer>();
      Integer integer0 = new Integer(32);
      hashMap2.put(integer0, integer0);
      hashMap0.put(hashMap1, hashMap2);
      DoubleKeyMap<HashMap<String, String>, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, Integer, Integer>(hashMap0);
      Map<Integer, Integer> map0 = doubleKeyMap0.remove(hashMap1);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      HashMap<Integer, Map<Object, Object>> hashMap0 = new HashMap<Integer, Map<Object, Object>>();
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>(hashMap0, class0);
      HashMap<HashMap<String, Integer>, Map<String, Object>> hashMap1 = new HashMap<HashMap<String, Integer>, Map<String, Object>>();
      DoubleKeyMap<HashMap<String, Integer>, String, Object> doubleKeyMap1 = new DoubleKeyMap<HashMap<String, Integer>, String, Object>(hashMap1);
      HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();
      Object object0 = doubleKeyMap1.put(hashMap2, "wrong proto type map ", (Object) doubleKeyMap0);
      Object object1 = doubleKeyMap1.put(hashMap2, "wrong proto type map ", object0);
      assertNotNull(object1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<Object, Map<Integer, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Map<Integer, String>, Integer>();
      Integer integer0 = doubleKeyMap0.remove((Object) "", (Map<Integer, String>) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Object, Map<Integer, HashMap<Object, String>>> hashMap0 = new HashMap<Object, Map<Integer, HashMap<Object, String>>>();
      DoubleKeyMap<Object, Integer, HashMap<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, HashMap<Object, String>>(hashMap0);
      Map<HashMap<Object, Object>, Map<Object, Integer>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<Object, Object>, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<HashMap<Object, Object>, Object, Integer>(map0, class0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      Object object0 = new Object();
      Integer integer0 = doubleKeyMap1.remove(hashMap1, object0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Object object0 = new Object();
      DoubleKeyMap<Object, Map<Integer, String>, String> doubleKeyMap0 = new DoubleKeyMap<Object, Map<Integer, String>, String>();
      String string0 = doubleKeyMap0.remove(object0, (Map<Integer, String>) hashMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<Object, Map<Integer, String>> hashMap0 = new HashMap<Object, Map<Integer, String>>();
      DoubleKeyMap<Object, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, String>(hashMap0);
      Map<Integer, String> map0 = doubleKeyMap0.remove((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>();
      HashMap<HashMap<String, Integer>, Map<String, Object>> hashMap0 = new HashMap<HashMap<String, Integer>, Map<String, Object>>();
      DoubleKeyMap<HashMap<String, Integer>, String, Object> doubleKeyMap1 = new DoubleKeyMap<HashMap<String, Integer>, String, Object>(hashMap0);
      Map<String, Object> map0 = doubleKeyMap0.remove((Object) doubleKeyMap1);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>(class0);
      Object object0 = doubleKeyMap0.put("#\tPd[K1XC':Z)x,!}", (Object) "#\tPd[K1XC':Z)x,!}", (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      Integer integer0 = new Integer(924);
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>();
      Map<Integer, Map<String, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, String, String> doubleKeyMap1 = new DoubleKeyMap<Integer, String, String>(map0, class0);
      String string0 = doubleKeyMap1.put(integer0, (String) null, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<Integer, Map<Object, Map<Integer, Map<Integer, String>>>, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Map<Object, Map<Integer, Map<Integer, String>>>, Integer>();
      Map<Object, Map<Integer, Map<Integer, String>>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, Integer, Map<Integer, String>> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Map<Integer, String>>(map0);
      Object object0 = new Object();
      Integer integer0 = new Integer(0);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>(0);
      Map<Integer, String> map1 = doubleKeyMap1.put(object0, integer0, (Map<Integer, String>) hashMap0);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      DoubleKeyMap<Object, Map<Integer, String>, String> doubleKeyMap0 = new DoubleKeyMap<Object, Map<Integer, String>, String>();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      String string0 = doubleKeyMap0.get(object0, (Map<Integer, String>) hashMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>();
      Map<String, Object> map0 = doubleKeyMap0.get((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, Map<Object, String>> hashMap0 = new HashMap<String, Map<Object, String>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>(hashMap0, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap0.put("A%\"}`v-F6=Q3", (Object) class0, "A%\"}`v-F6=Q3");
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
      DoubleKeyMap<Object, String, Map<String, String>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, String, Map<String, String>>((Map<Object, Map<String, Map<String, String>>>) null, class0);
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
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>(class0);
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>();
      Map<Object, Object> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<HashMap<String, String>, Map<Integer, Integer>> hashMap0 = new HashMap<HashMap<String, String>, Map<Integer, Integer>>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      HashMap<Integer, Integer> hashMap2 = new HashMap<Integer, Integer>();
      Integer integer0 = new Integer(2);
      hashMap2.put((Integer) null, integer0);
      hashMap0.put(hashMap1, hashMap2);
      DoubleKeyMap<HashMap<String, String>, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, Integer, Integer>(hashMap0);
      Integer integer1 = new Integer(1721);
      doubleKeyMap0.remove(hashMap1, integer1);
      assertEquals(1, hashMap0.size());
      assertFalse(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<Map<Integer, String>, Map<String, Object>> hashMap0 = new HashMap<Map<Integer, String>, Map<String, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Integer, String>, String, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, String>, String, Object>(hashMap0, class0);
      Object object0 = doubleKeyMap0.remove((Map<Integer, String>) null, "");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Map<Integer, String>, Map<String, Object>> hashMap0 = new HashMap<Map<Integer, String>, Map<String, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Integer, String>, String, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, String>, String, Object>(hashMap0, class0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      hashMap0.put((Map<Integer, String>) null, hashMap1);
      HashMap<Integer, String> hashMap2 = new HashMap<Integer, String>();
      Object object0 = doubleKeyMap0.put((Map<Integer, String>) null, "", (Object) hashMap2);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Map<Integer, String>, Map<String, Object>> hashMap0 = new HashMap<Map<Integer, String>, Map<String, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Integer, String>, String, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, String>, String, Object>(hashMap0, class0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      hashMap0.put((Map<Integer, String>) null, hashMap1);
      Object object0 = doubleKeyMap0.get((Map<Integer, String>) null, (String) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, HashMap<Object, Object>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Object, HashMap<Object, Object>>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<HashMap<String, String>, Map<Integer, Integer>> hashMap0 = new HashMap<HashMap<String, String>, Map<Integer, Integer>>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      HashMap<Integer, Integer> hashMap2 = new HashMap<Integer, Integer>();
      hashMap0.put(hashMap1, hashMap2);
      DoubleKeyMap<HashMap<String, String>, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, Integer, Integer>(hashMap0);
      Integer integer0 = new Integer((-1564));
      doubleKeyMap0.remove(hashMap1, integer0);
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<HashMap<String, String>, Map<Integer, Integer>> hashMap0 = new HashMap<HashMap<String, String>, Map<Integer, Integer>>();
      DoubleKeyMap<HashMap<String, String>, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, Integer, Integer>(hashMap0);
      DoubleKeyMap<HashMap<Object, Object>, Object, String> doubleKeyMap1 = new DoubleKeyMap<HashMap<Object, Object>, Object, String>();
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      String string0 = doubleKeyMap1.get(hashMap1, (Object) doubleKeyMap0);
      assertNull(string0);
  }
}
