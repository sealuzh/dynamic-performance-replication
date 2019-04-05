/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 09:03:13 GMT 2019
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
      DoubleKeyMap<HashMap<String, String>, Map<String, Map<String, HashMap<Object, Object>>>, Map<String, HashMap<Object, Object>>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, Map<String, Map<String, HashMap<Object, Object>>>, Map<String, HashMap<Object, Object>>>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Map<String, HashMap<Object, Object>> map0 = doubleKeyMap0.remove(hashMap0, (Map<String, Map<String, HashMap<Object, Object>>>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<Object, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, String>();
      Integer integer0 = new Integer(1);
      String string0 = doubleKeyMap0.remove((Object) null, integer0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<Map<String, HashMap<Object, Object>>, HashMap<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Map<String, HashMap<Object, Object>>, HashMap<Integer, String>, Object>();
      DoubleKeyMap<Object, Object, HashMap<String, Map<String, HashMap<Object, Object>>>> doubleKeyMap1 = new DoubleKeyMap<Object, Object, HashMap<String, Map<String, HashMap<Object, Object>>>>();
      Object object0 = new Object();
      HashMap<String, Map<String, HashMap<Object, Object>>> hashMap0 = doubleKeyMap1.remove((Object) doubleKeyMap0, object0);
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Object, Map<Map<String, HashMap<Object, Object>>, Map<String, Object>>> hashMap0 = new HashMap<Object, Map<Map<String, HashMap<Object, Object>>, Map<String, Object>>>();
      DoubleKeyMap<Object, Map<String, HashMap<Object, Object>>, Map<String, Object>> doubleKeyMap0 = new DoubleKeyMap<Object, Map<String, HashMap<Object, Object>>, Map<String, Object>>(hashMap0);
      Map<Map<String, HashMap<Object, Object>>, Map<String, Object>> map0 = doubleKeyMap0.remove((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Object, Map<String, Object>> hashMap0 = new HashMap<Object, Map<String, Object>>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(hashMap0);
      DoubleKeyMap<Object, Map<String, HashMap<Object, Object>>, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Map<String, HashMap<Object, Object>>, Object>();
      Object object0 = doubleKeyMap1.put((Object) hashMap0, (Map<String, HashMap<Object, Object>>) null, (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer(1);
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>();
      Object object0 = new Object();
      Object object1 = doubleKeyMap0.get((Object) integer0, object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<Object, Map<String, HashMap<Object, Object>>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Map<String, HashMap<Object, Object>>, Object>();
      HashMap<String, HashMap<Object, Object>> hashMap0 = new HashMap<String, HashMap<Object, Object>>();
      Object object0 = doubleKeyMap0.get((Object) null, (Map<String, HashMap<Object, Object>>) hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Map> class0 = Map.class;
      HashMap<Integer, Map<Object, Map<String, HashMap<Object, Object>>>> hashMap0 = new HashMap<Integer, Map<Object, Map<String, HashMap<Object, Object>>>>();
      DoubleKeyMap<Integer, Object, Map<String, HashMap<Object, Object>>> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Map<String, HashMap<Object, Object>>>(hashMap0, class0);
      Map<Object, Map<String, HashMap<Object, Object>>> map0 = doubleKeyMap0.get((Integer) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, Map<Object, Object>> hashMap0 = new HashMap<String, Map<Object, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>(hashMap0, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap0.put("", (Object) "", (Object) class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>((Map<Object, Map<Integer, Integer>>) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Map<String, HashMap<Object, Object>>, Integer>, Map<Object, Integer>, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Map<Map<String, HashMap<Object, Object>>, Integer>, Map<Object, Integer>, Object>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Map<String, HashMap<Object, Object>>, HashMap<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Map<String, HashMap<Object, Object>>, HashMap<Integer, String>, Object>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>();
      Map<String, Object> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleKeyMap<Map<String, HashMap<Object, Object>>, HashMap<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Map<String, HashMap<Object, Object>>, HashMap<Integer, String>, Object>();
      DoubleKeyMap<Object, Object, Map<String, HashMap<Object, Object>>> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Map<String, HashMap<Object, Object>>>();
      Map<Object, Map<String, HashMap<Object, Object>>> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleKeyMap<HashMap<String, String>, Map<String, Map<String, HashMap<Object, Object>>>, Map<String, HashMap<Object, Object>>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, Map<String, Map<String, HashMap<Object, Object>>>, Map<String, HashMap<Object, Object>>>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<String, Map<String, HashMap<Object, Object>>> hashMap1 = new HashMap<String, Map<String, HashMap<Object, Object>>>();
      HashMap<String, HashMap<Object, Object>> hashMap2 = new HashMap<String, HashMap<Object, Object>>();
      doubleKeyMap0.put(hashMap0, (Map<String, Map<String, HashMap<Object, Object>>>) null, (Map<String, HashMap<Object, Object>>) hashMap2);
      Map<String, HashMap<Object, Object>> map0 = doubleKeyMap0.remove(hashMap0, (Map<String, Map<String, HashMap<Object, Object>>>) hashMap1);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      HashMap<String, HashMap<Object, Object>> hashMap0 = new HashMap<String, HashMap<Object, Object>>(960);
      DoubleKeyMap<HashMap<String, String>, Map<String, Map<String, HashMap<Object, Object>>>, Map<String, HashMap<Object, Object>>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, Map<String, Map<String, HashMap<Object, Object>>>, Map<String, HashMap<Object, Object>>>(class0);
      HashMap<Object, Map<Object, String>> hashMap1 = new HashMap<Object, Map<Object, String>>();
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>(hashMap1, class0);
      Map<String, Map<String, HashMap<Object, Object>>> map0 = doubleKeyMap1.newMap();
      doubleKeyMap0.put((HashMap<String, String>) null, map0, (Map<String, HashMap<Object, Object>>) hashMap0);
      Map<String, HashMap<Object, Object>> map1 = doubleKeyMap0.put((HashMap<String, String>) null, map0, (Map<String, HashMap<Object, Object>>) hashMap0);
      assertEquals(0, map1.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleKeyMap<Map<String, HashMap<Object, Object>>, HashMap<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Map<String, HashMap<Object, Object>>, HashMap<Integer, String>, Object>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>();
      Object object0 = doubleKeyMap1.get((Object) doubleKeyMap0, (String) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>();
      Object object0 = new Object();
      doubleKeyMap0.put(object0, object0, (Object) null);
      Object object1 = doubleKeyMap0.get(object0, (Object) "ca9)y/");
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<Object, Map<String, Map<String, HashMap<Object, Object>>>> hashMap0 = new HashMap<Object, Map<String, Map<String, HashMap<Object, Object>>>>();
      DoubleKeyMap<Object, String, Map<String, HashMap<Object, Object>>> doubleKeyMap0 = new DoubleKeyMap<Object, String, Map<String, HashMap<Object, Object>>>(hashMap0);
      HashMap<String, HashMap<Object, Object>> hashMap1 = new HashMap<String, HashMap<Object, Object>>();
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Object) hashMap0, "}-niuB~Sbn\"\"(PYx", (Map<String, HashMap<Object, Object>>) hashMap1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DoubleKeyMap<HashMap<String, String>, Map<String, Map<String, HashMap<Object, Object>>>, Map<String, HashMap<Object, Object>>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, Map<String, Map<String, HashMap<Object, Object>>>, Map<String, HashMap<Object, Object>>>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<String, Map<String, HashMap<Object, Object>>> hashMap1 = new HashMap<String, Map<String, HashMap<Object, Object>>>();
      HashMap<String, HashMap<Object, Object>> hashMap2 = new HashMap<String, HashMap<Object, Object>>();
      doubleKeyMap0.put(hashMap0, (Map<String, Map<String, HashMap<Object, Object>>>) hashMap1, (Map<String, HashMap<Object, Object>>) hashMap2);
      Map<String, HashMap<Object, Object>> map0 = doubleKeyMap0.remove(hashMap0, (Map<String, Map<String, HashMap<Object, Object>>>) hashMap1);
      assertTrue(map0.isEmpty());
  }
}