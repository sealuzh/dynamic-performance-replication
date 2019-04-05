/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 13:48:44 GMT 2019
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
      DoubleKeyMap<HashMap<String, String>, Map<String, HashMap<String, Object>>, String> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, Map<String, HashMap<String, Object>>, String>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<String, HashMap<String, Object>> hashMap1 = new HashMap<String, HashMap<String, Object>>();
      doubleKeyMap0.put(hashMap0, (Map<String, HashMap<String, Object>>) hashMap1, "kJy7=xnGt");
      Map<Map<String, HashMap<String, Object>>, String> map0 = doubleKeyMap0.remove(hashMap0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, HashMap<String, Object>> hashMap0 = new HashMap<String, HashMap<String, Object>>();
      Class<Map> class0 = Map.class;
      HashMap<Map<String, HashMap<String, Object>>, Map<Object, Map<String, HashMap<String, Object>>>> hashMap1 = new HashMap<Map<String, HashMap<String, Object>>, Map<Object, Map<String, HashMap<String, Object>>>>(1, 1);
      HashMap<Object, Map<String, HashMap<String, Object>>> hashMap2 = new HashMap<Object, Map<String, HashMap<String, Object>>>();
      hashMap1.put(hashMap0, hashMap2);
      DoubleKeyMap<Map<String, HashMap<String, Object>>, Object, Map<String, HashMap<String, Object>>> doubleKeyMap0 = new DoubleKeyMap<Map<String, HashMap<String, Object>>, Object, Map<String, HashMap<String, Object>>>(hashMap1, class0);
      Map<Object, Map<String, HashMap<String, Object>>> map0 = doubleKeyMap0.get((Map<String, HashMap<String, Object>>) hashMap0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Map<Map<String, HashMap<String, Object>>, Integer>, Map<Map<String, HashMap<String, Object>>, Object>> hashMap0 = new HashMap<Map<Map<String, HashMap<String, Object>>, Integer>, Map<Map<String, HashMap<String, Object>>, Object>>();
      DoubleKeyMap<Map<Map<String, HashMap<String, Object>>, Integer>, Map<String, HashMap<String, Object>>, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Map<String, HashMap<String, Object>>, Integer>, Map<String, HashMap<String, Object>>, Object>(hashMap0);
      HashMap<Map<String, HashMap<String, Object>>, Integer> hashMap1 = new HashMap<Map<String, HashMap<String, Object>>, Integer>(0);
      DoubleKeyMap<Map<String, HashMap<String, Object>>, Map<String, HashMap<String, Object>>, String> doubleKeyMap1 = new DoubleKeyMap<Map<String, HashMap<String, Object>>, Map<String, HashMap<String, Object>>, String>();
      Map<String, HashMap<String, Object>> map0 = doubleKeyMap1.newMap();
      doubleKeyMap0.put((Map<Map<String, HashMap<String, Object>>, Integer>) hashMap1, map0, (Object) hashMap1);
      Map<Map<String, HashMap<String, Object>>, Object> map1 = doubleKeyMap0.get((Map<Map<String, HashMap<String, Object>>, Integer>) hashMap1);
      assertFalse(map1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, Map<Integer, String>> hashMap0 = new HashMap<String, Map<Integer, String>>();
      DoubleKeyMap<String, Integer, String> doubleKeyMap0 = new DoubleKeyMap<String, Integer, String>();
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>();
      String string0 = doubleKeyMap1.remove((Object) hashMap0, (Object) doubleKeyMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<String, HashMap<String, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, String>, Integer>();
      Integer integer0 = doubleKeyMap0.remove((String) null, (HashMap<String, String>) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, Map<HashMap<Object, Integer>, Map<String, HashMap<String, Object>>>> hashMap0 = new HashMap<String, Map<HashMap<Object, Integer>, Map<String, HashMap<String, Object>>>>();
      DoubleKeyMap<String, HashMap<Object, Integer>, Map<String, HashMap<String, Object>>> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, Integer>, Map<String, HashMap<String, Object>>>(hashMap0);
      HashMap<Object, Map<String, Integer>> hashMap1 = new HashMap<Object, Map<String, Integer>>();
      DoubleKeyMap<Object, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, String, Integer>(hashMap1);
      Integer integer0 = doubleKeyMap1.remove((Object) doubleKeyMap0, (String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<String, HashMap<String, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, String>, Integer>();
      Map<HashMap<String, String>, Integer> map0 = doubleKeyMap0.remove((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>();
      Object object0 = new Object();
      Map<Integer, Integer> map0 = doubleKeyMap0.remove(object0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, Map<Integer, String>> hashMap0 = new HashMap<String, Map<Integer, String>>();
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      Object object0 = new Object();
      String string0 = doubleKeyMap0.put((Object) hashMap0, object0, "MAe%:?");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<Map<Integer, Map<String, Integer>>, String, Map<Integer, Map<String, Integer>>> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Map<String, Integer>>, String, Map<Integer, Map<String, Integer>>>();
      Map<Integer, Map<String, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Integer, String, Integer>(map0);
      DoubleKeyMap<String, String, Object> doubleKeyMap2 = new DoubleKeyMap<String, String, Object>();
      Object object0 = doubleKeyMap2.put((String) null, "*wN'/_3UI'c:~z?w!f*", (Object) doubleKeyMap1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(265);
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, HashMap<String, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<String, String>, Integer>((Map<Object, Map<HashMap<String, String>, Integer>>) null, class0);
      Object object0 = new Object();
      Integer integer1 = doubleKeyMap0.put(object0, (HashMap<String, String>) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>();
      Map<Object, Map<String, Object>> map0 = doubleKeyMap0.newMap();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>(map0, class0);
      DoubleKeyMap<String, Object, String> doubleKeyMap2 = new DoubleKeyMap<String, Object, String>(class0);
      String string0 = doubleKeyMap2.get("$)m", (Object) doubleKeyMap1);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>();
      Map<Object, Map<String, Object>> map0 = doubleKeyMap0.newMap();
      HashMap<Integer, Map<Object, Object>> hashMap0 = new HashMap<Integer, Map<Object, Object>>();
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, Object>(hashMap0);
      Object object0 = doubleKeyMap1.get((Integer) null, (Object) map0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<Object, Map<HashMap<String, Object>, Map<Object, Object>>> hashMap0 = new HashMap<Object, Map<HashMap<String, Object>, Map<Object, Object>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, HashMap<String, Object>, Map<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<String, Object>, Map<Object, Object>>(hashMap0, class0);
      Object object0 = new Object();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>(1);
      Map<Object, Object> map0 = doubleKeyMap0.get(object0, hashMap1);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Object, Map<Map<String, HashMap<String, Object>>, HashMap<String, Object>>> hashMap0 = new HashMap<Object, Map<Map<String, HashMap<String, Object>>, HashMap<String, Object>>>();
      DoubleKeyMap<Object, Map<String, HashMap<String, Object>>, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<Object, Map<String, HashMap<String, Object>>, HashMap<String, Object>>(hashMap0);
      Map<Map<String, HashMap<String, Object>>, HashMap<String, Object>> map0 = doubleKeyMap0.get((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleKeyMap<HashMap<String, String>, Map<String, HashMap<String, Object>>, String> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, Map<String, HashMap<String, Object>>, String>();
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Integer>();
      Map<Integer, Integer> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, Map<HashMap<String, String>, Integer>> hashMap0 = new HashMap<String, Map<HashMap<String, String>, Integer>>();
      DoubleKeyMap<String, HashMap<String, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, String>, Integer>(hashMap0);
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      doubleKeyMap0.put("", hashMap1, (Integer) null);
      doubleKeyMap0.remove("", (HashMap<String, String>) null);
      assertFalse(hashMap0.isEmpty());
      assertEquals(1, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<HashMap<String, String>, Map<String, HashMap<String, Object>>, String> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, Map<String, HashMap<String, Object>>, String>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<String, HashMap<String, Object>> hashMap1 = new HashMap<String, HashMap<String, Object>>();
      doubleKeyMap0.put(hashMap0, (Map<String, HashMap<String, Object>>) hashMap1, "P~n");
      String string0 = doubleKeyMap0.put(hashMap0, (Map<String, HashMap<String, Object>>) hashMap1, "kJy7=xnGt");
      assertEquals("P~n", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleKeyMap<Map<Integer, Map<String, Integer>>, String, Map<Integer, Map<String, Integer>>> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Map<String, Integer>>, String, Map<Integer, Map<String, Integer>>>();
      Map<Integer, Map<String, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Integer, String, Integer>(map0);
      Integer integer0 = new Integer(1);
      Integer integer1 = doubleKeyMap1.get(integer0, (String) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Integer integer0 = new Integer(0);
      DoubleKeyMap<Integer, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Integer>();
      doubleKeyMap0.put(integer0, "4b^Xd\u0006A7=9\"`hsL+Zn", (Integer) null);
      Integer integer1 = doubleKeyMap0.get(integer0, "2d|NP|~jW{[plu|");
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>(class0);
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
      DoubleKeyMap<HashMap<String, String>, Map<String, HashMap<String, Object>>, String> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, Map<String, HashMap<String, Object>>, String>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<String, HashMap<String, Object>> hashMap1 = new HashMap<String, HashMap<String, Object>>();
      doubleKeyMap0.put(hashMap0, (Map<String, HashMap<String, Object>>) hashMap1, "P~n");
      String string0 = doubleKeyMap0.remove(hashMap0, (Map<String, HashMap<String, Object>>) hashMap1);
      assertEquals("P~n", string0);
  }
}
