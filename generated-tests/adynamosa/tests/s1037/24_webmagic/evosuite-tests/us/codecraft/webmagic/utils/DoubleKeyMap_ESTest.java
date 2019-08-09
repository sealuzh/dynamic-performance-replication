/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 12:23:15 GMT 2019
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
      DoubleKeyMap<Integer, Integer, Map<String, String>> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Map<String, String>>();
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(0);
      HashMap<Object, Map<Map<String, String>, String>> hashMap0 = new HashMap<Object, Map<Map<String, String>, String>>();
      DoubleKeyMap<Object, Map<String, String>, String> doubleKeyMap1 = new DoubleKeyMap<Object, Map<String, String>, String>(hashMap0);
      Map<String, String> map0 = doubleKeyMap1.newMap();
      doubleKeyMap0.put(integer0, integer1, map0);
      Map<String, String> map1 = doubleKeyMap0.remove(integer0, integer1);
      assertTrue(map1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(0);
      HashMap<Object, Map<Map<String, String>, String>> hashMap0 = new HashMap<Object, Map<Map<String, String>, String>>();
      HashMap<Map<String, String>, String> hashMap1 = new HashMap<Map<String, String>, String>();
      hashMap0.put(integer0, hashMap1);
      DoubleKeyMap<Object, Map<String, String>, String> doubleKeyMap0 = new DoubleKeyMap<Object, Map<String, String>, String>(hashMap0);
      Map<Map<String, String>, String> map0 = doubleKeyMap0.remove((Object) integer0);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, HashMap<Object, Integer>> doubleKeyMap0 = new DoubleKeyMap<Object, String, HashMap<Object, Integer>>();
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      doubleKeyMap0.put((Object) class0, "6W>RM/[0)@", hashMap0);
      Map<String, HashMap<Object, Integer>> map0 = doubleKeyMap0.remove((Object) class0);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, Map<String, String>> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Map<String, String>>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      DoubleKeyMap<HashMap<String, Object>, Object, String> doubleKeyMap1 = new DoubleKeyMap<HashMap<String, Object>, Object, String>();
      String string0 = doubleKeyMap1.remove(hashMap0, (Object) doubleKeyMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<Integer, Map<String, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Map<String, String>, Integer>();
      Map<Object, Map<String, HashMap<Object, Object>>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, String, HashMap<Object, Object>> doubleKeyMap1 = new DoubleKeyMap<Object, String, HashMap<Object, Object>>(map0);
      HashMap<Object, Object> hashMap0 = doubleKeyMap1.remove((Object) doubleKeyMap0, "us.codecraft.webmagic.utils.MultiKeyMapBase");
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Object, Map<Integer, String>> hashMap0 = new HashMap<Object, Map<Integer, String>>();
      DoubleKeyMap<Object, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, String>(hashMap0);
      Map<Integer, String> map0 = doubleKeyMap0.remove((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Object, Map<String, String>, String> doubleKeyMap0 = new DoubleKeyMap<Object, Map<String, String>, String>();
      DoubleKeyMap<Object, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, String, Integer>();
      Map<String, Integer> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(0);
      HashMap<Object, Map<Map<String, String>, String>> hashMap0 = new HashMap<Object, Map<Map<String, String>, String>>();
      DoubleKeyMap<Object, Map<String, String>, String> doubleKeyMap0 = new DoubleKeyMap<Object, Map<String, String>, String>(hashMap0);
      HashMap<Object, Map<Integer, Object>> hashMap1 = new HashMap<Object, Map<Integer, Object>>();
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Object>(hashMap1);
      Object object0 = doubleKeyMap1.put((Object) hashMap0, integer0, (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<HashMap<Integer, String>, Map<String, String>, String> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, String>, Map<String, String>, String>();
      Map<Map<String, String>, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Map<String, String>, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Map<String, String>, Object, Object>(map0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Object object0 = doubleKeyMap1.put((Map<String, String>) hashMap0, (Object) null, (Object) hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<Integer, Object, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, HashMap<Object, Object>>();
      Integer integer0 = new Integer((-600));
      Object object0 = new Object();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      HashMap<Object, Object> hashMap1 = doubleKeyMap0.put(integer0, object0, hashMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<Object, String, HashMap<Map<String, String>, Object>> doubleKeyMap0 = new DoubleKeyMap<Object, String, HashMap<Map<String, String>, Object>>();
      HashMap<Map<String, String>, Object> hashMap0 = new HashMap<Map<String, String>, Object>();
      HashMap<Map<String, String>, Object> hashMap1 = doubleKeyMap0.put((Object) null, "us.codecraft.webmagic.utils.MultiKeyMapBase", hashMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, Map<String, String>> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Map<String, String>>();
      Integer integer0 = new Integer((-4));
      DoubleKeyMap<Object, Integer, Map<Integer, Object>> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Map<Integer, Object>>();
      Map<Integer, Object> map0 = doubleKeyMap1.put((Object) doubleKeyMap0, integer0, (Map<Integer, Object>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Integer, Map<String, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Map<String, String>, Object>();
      Map<Map<String, String>, Map<String, Object>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<String, String>, String, Object> doubleKeyMap1 = new DoubleKeyMap<Map<String, String>, String, Object>(map0, class0);
      Object object0 = doubleKeyMap1.get((Map<String, String>) null, "");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleKeyMap<Object, Map<String, String>, String> doubleKeyMap0 = new DoubleKeyMap<Object, Map<String, String>, String>();
      Object object0 = new Object();
      Map<String, String> map0 = doubleKeyMap0.newMap();
      String string0 = doubleKeyMap0.get(object0, map0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Object, Map<String, Object>> hashMap0 = new HashMap<Object, Map<String, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(hashMap0, class0);
      DoubleKeyMap<Object, Map<String, String>, String> doubleKeyMap1 = new DoubleKeyMap<Object, Map<String, String>, String>();
      Map<String, String> map0 = doubleKeyMap1.newMap();
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Object) hashMap0, "us.codecraft.webmagic.utils.DoubleKeyMap", (Object) map0);
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
      DoubleKeyMap<Object, Map<String, String>, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Map<String, String>, String>((Map<Object, Map<Map<String, String>, String>>) null, class0);
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
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>();
      Map<String, Object> map0 = doubleKeyMap0.get((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, Map<String, String>> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Map<String, String>>();
      Integer integer0 = new Integer((-5));
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      doubleKeyMap0.put(integer0, integer0, (Map<String, String>) hashMap0);
      Integer integer1 = new Integer(0);
      Map<String, String> map0 = doubleKeyMap0.remove(integer0, integer1);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<Object, Map<Map<String, String>, Object>> hashMap0 = new HashMap<Object, Map<Map<String, String>, Object>>();
      DoubleKeyMap<Object, Map<String, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Map<String, String>, Object>(hashMap0);
      Object object0 = doubleKeyMap0.remove((Object) null, (Map<String, String>) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, Map<String, String>> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Map<String, String>>();
      Integer integer0 = new Integer(0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      doubleKeyMap0.put(integer0, integer0, (Map<String, String>) hashMap0);
      Map<String, String> map0 = doubleKeyMap0.put(integer0, integer0, (Map<String, String>) null);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer((-2267));
      HashMap<Object, Map<Integer, Integer>> hashMap0 = new HashMap<Object, Map<Integer, Integer>>(0);
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>(hashMap0);
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, Object>();
      Map<Integer, Integer> map0 = doubleKeyMap1.newMap();
      hashMap0.put(integer0, map0);
      Integer integer1 = doubleKeyMap0.get((Object) integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Map<String, String>, HashMap<Map<String, String>, Object>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Integer, Map<String, String>, HashMap<Map<String, String>, Object>>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }
}