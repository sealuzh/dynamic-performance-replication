/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 01:06:55 GMT 2019
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
      HashMap<Integer, Map<Object, String>> hashMap0 = new HashMap<Integer, Map<Object, String>>();
      DoubleKeyMap<Integer, Object, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, String>(hashMap0);
      Integer integer0 = new Integer(241);
      doubleKeyMap0.put(integer0, (Object) integer0, "wrong proto type map ");
      Integer integer1 = new Integer(241);
      doubleKeyMap0.remove(integer0, (Object) integer1);
      assertEquals(0, hashMap0.size());
      assertTrue(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, Map<Integer, String>> hashMap0 = new HashMap<String, Map<Integer, String>>();
      DoubleKeyMap<String, Integer, String> doubleKeyMap0 = new DoubleKeyMap<String, Integer, String>(hashMap0);
      Integer integer0 = new Integer((-1543));
      doubleKeyMap0.put("", integer0, "");
      Map<Integer, String> map0 = doubleKeyMap0.get("");
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<String, String, String> doubleKeyMap0 = new DoubleKeyMap<String, String, String>();
      DoubleKeyMap<HashMap<Map<HashMap<String, String>, Integer>, String>, Object, HashMap<Object, Map<HashMap<String, String>, Integer>>> doubleKeyMap1 = new DoubleKeyMap<HashMap<Map<HashMap<String, String>, Integer>, String>, Object, HashMap<Object, Map<HashMap<String, String>, Integer>>>();
      HashMap<Object, Map<HashMap<String, String>, Integer>> hashMap0 = doubleKeyMap1.remove((HashMap<Map<HashMap<String, String>, Integer>, String>) null, (Object) doubleKeyMap0);
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<Integer, Map<Object, String>> hashMap0 = new HashMap<Integer, Map<Object, String>>();
      DoubleKeyMap<Integer, Object, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, String>(hashMap0);
      String string0 = doubleKeyMap0.remove((Integer) null, (Object) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, Map<String, Object>> hashMap0 = new HashMap<String, Map<String, Object>>();
      DoubleKeyMap<String, String, Object> doubleKeyMap0 = new DoubleKeyMap<String, String, Object>(hashMap0);
      DoubleKeyMap<Integer, Map<HashMap<String, String>, Integer>, Map<Object, Map<Object, Object>>> doubleKeyMap1 = new DoubleKeyMap<Integer, Map<HashMap<String, String>, Integer>, Map<Object, Map<Object, Object>>>();
      Map<Object, Map<Object, Object>> map0 = doubleKeyMap1.newMap();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap2 = new DoubleKeyMap<Object, Object, Object>(map0);
      Object object0 = doubleKeyMap2.remove((Object) doubleKeyMap0, (Object) hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<Map<HashMap<String, String>, Integer>, Integer, HashMap<Object, Map<HashMap<String, String>, Integer>>> doubleKeyMap0 = new DoubleKeyMap<Map<HashMap<String, String>, Integer>, Integer, HashMap<Object, Map<HashMap<String, String>, Integer>>>();
      Map<Integer, HashMap<Object, Map<HashMap<String, String>, Integer>>> map0 = doubleKeyMap0.remove((Map<HashMap<String, String>, Integer>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<String, HashMap<Object, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, String>, Integer>();
      DoubleKeyMap<Object, HashMap<String, Map<HashMap<String, String>, Integer>>, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, HashMap<String, Map<HashMap<String, String>, Integer>>, Integer>();
      Map<HashMap<String, Map<HashMap<String, String>, Integer>>, Integer> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<Map<HashMap<String, String>, Integer>, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Map<HashMap<String, String>, Integer>, String, Integer>();
      Map<String, Map<HashMap<Object, Map<HashMap<String, String>, Integer>>, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<String, HashMap<Object, Map<HashMap<String, String>, Integer>>, Object> doubleKeyMap1 = new DoubleKeyMap<String, HashMap<Object, Map<HashMap<String, String>, Integer>>, Object>(map0);
      HashMap<Object, Map<HashMap<String, String>, Integer>> hashMap0 = new HashMap<Object, Map<HashMap<String, String>, Integer>>();
      Object object0 = new Object();
      Object object1 = doubleKeyMap1.put("*/Gg;FSFo )Mke.uy", hashMap0, object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<Object, Object, HashMap<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Object, Object, HashMap<Object, String>>();
      Object object0 = new Object();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      HashMap<Object, String> hashMap1 = doubleKeyMap0.put(object0, object0, hashMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<String, String, String> doubleKeyMap0 = new DoubleKeyMap<String, String, String>();
      String string0 = doubleKeyMap0.put((String) null, (String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Integer, Map<Object, String>> hashMap0 = new HashMap<Integer, Map<Object, String>>();
      DoubleKeyMap<Integer, Object, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, String>(hashMap0);
      Integer integer0 = new Integer(2741);
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>();
      String string0 = doubleKeyMap1.get((Object) integer0, (Object) doubleKeyMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>((Map<Object, Map<Object, String>>) null);
      String string0 = doubleKeyMap0.get((Object) null, (Object) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>((Map<Object, Map<Object, String>>) null);
      Object object0 = new Object();
      String string0 = doubleKeyMap0.get(object0, (Object) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>();
      Map<String, Object> map0 = doubleKeyMap0.get((Integer) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleKeyMap<String, HashMap<Object, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, String>, Integer>();
      DoubleKeyMap<Object, HashMap<Object, String>, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, HashMap<Object, String>, Integer>();
      Map<HashMap<Object, String>, Integer> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer(1662);
      DoubleKeyMap<String, Integer, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<String, Integer, HashMap<Object, Object>>();
      HashMap<Object, Object> hashMap0 = doubleKeyMap0.put("", integer0, (HashMap<Object, Object>) null);
      HashMap<Object, Object> hashMap1 = doubleKeyMap0.put("", integer0, hashMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<Object, Map<String, HashMap<Integer, Object>>> hashMap0 = new HashMap<Object, Map<String, HashMap<Integer, Object>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, HashMap<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<Object, String, HashMap<Integer, Object>>(hashMap0, class0);
      HashMap<Integer, Object> hashMap1 = doubleKeyMap0.get((Object) hashMap0, (String) null);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<HashMap<Map<HashMap<String, String>, Integer>, Object>, Map<Object, String>> hashMap0 = new HashMap<HashMap<Map<HashMap<String, String>, Integer>, Object>, Map<Object, String>>();
      DoubleKeyMap<HashMap<Map<HashMap<String, String>, Integer>, Object>, Object, String> doubleKeyMap0 = new DoubleKeyMap<HashMap<Map<HashMap<String, String>, Integer>, Object>, Object, String>(hashMap0);
      HashMap<Map<HashMap<String, String>, Integer>, Object> hashMap1 = new HashMap<Map<HashMap<String, String>, Integer>, Object>();
      HashMap<Object, String> hashMap2 = new HashMap<Object, String>();
      hashMap0.put(hashMap1, hashMap2);
      Integer integer0 = new Integer(1);
      String string0 = doubleKeyMap0.get(hashMap1, (Object) integer0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, HashMap<Object, String>, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Object, String>, String>(class0);
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
      HashMap<Integer, Map<String, Integer>> hashMap0 = new HashMap<Integer, Map<String, Integer>>();
      DoubleKeyMap<Integer, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Integer>(hashMap0);
      Integer integer0 = new Integer((-1));
      doubleKeyMap0.put(integer0, "Os{E3", integer0);
      doubleKeyMap0.remove(integer0, "");
      assertEquals(1, hashMap0.size());
      assertFalse(hashMap0.isEmpty());
  }
}
