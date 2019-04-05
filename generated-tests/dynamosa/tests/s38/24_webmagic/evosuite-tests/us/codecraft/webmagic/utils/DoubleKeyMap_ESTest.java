/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 05:03:14 GMT 2019
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
      HashMap<Integer, Map<Integer, Object>> hashMap0 = new HashMap<Integer, Map<Integer, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>(hashMap0, class0);
      Integer integer0 = new Integer((-1121));
      Integer integer1 = new Integer((-1121));
      HashMap<Integer, Object> hashMap1 = new HashMap<Integer, Object>();
      hashMap0.put(integer1, hashMap1);
      Object object0 = doubleKeyMap0.get(integer0, integer1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleKeyMap<Map<Integer, HashMap<Object, Object>>, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, HashMap<Object, Object>>, Integer, Integer>();
      HashMap<Integer, HashMap<Object, Object>> hashMap0 = new HashMap<Integer, HashMap<Object, Object>>();
      Integer integer0 = doubleKeyMap0.remove((Map<Integer, HashMap<Object, Object>>) hashMap0, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, String>();
      DoubleKeyMap<HashMap<Object, String>, Object, String> doubleKeyMap1 = new DoubleKeyMap<HashMap<Object, String>, Object, String>();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      String string0 = doubleKeyMap1.remove(hashMap0, (Object) doubleKeyMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<String, Integer, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<String, Integer, HashMap<Object, Object>>();
      Integer integer0 = new Integer(1735);
      HashMap<Object, Object> hashMap0 = doubleKeyMap0.remove((String) null, integer0);
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<HashMap<String, Integer>, Object, String> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Integer>, Object, String>();
      DoubleKeyMap<Object, Map<Integer, HashMap<Object, Object>>, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Map<Integer, HashMap<Object, Object>>, Integer>();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap2 = new DoubleKeyMap<Object, Object, Object>();
      Map<Integer, HashMap<Object, Object>> map0 = doubleKeyMap2.newMap();
      Integer integer0 = doubleKeyMap1.remove((Object) doubleKeyMap0, map0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<HashMap<Object, Integer>, String, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Integer>, String, Object>();
      Map<String, Object> map0 = doubleKeyMap0.remove((HashMap<Object, Integer>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<String, String, Integer> doubleKeyMap0 = new DoubleKeyMap<String, String, Integer>();
      DoubleKeyMap<Object, String, Map<Integer, HashMap<Object, Object>>> doubleKeyMap1 = new DoubleKeyMap<Object, String, Map<Integer, HashMap<Object, Object>>>();
      Map<String, Map<Integer, HashMap<Object, Object>>> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      DoubleKeyMap<HashMap<String, Integer>, HashMap<Object, Object>, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Integer>, HashMap<Object, Object>, Object>();
      Object object0 = doubleKeyMap0.put(hashMap0, (HashMap<Object, Object>) null, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      HashMap<HashMap<String, Integer>, Map<HashMap<Object, Object>, Object>> hashMap1 = new HashMap<HashMap<String, Integer>, Map<HashMap<Object, Object>, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<String, Integer>, HashMap<Object, Object>, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Integer>, HashMap<Object, Object>, Object>(hashMap1, class0);
      HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        doubleKeyMap0.put(hashMap2, hashMap0, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<Integer, Map<Integer, HashMap<Object, Object>>, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Map<Integer, HashMap<Object, Object>>, Integer>();
      HashMap<String, Map<Object, HashMap<String, Object>>> hashMap0 = new HashMap<String, Map<Object, HashMap<String, Object>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, HashMap<String, Object>> doubleKeyMap1 = new DoubleKeyMap<String, Object, HashMap<String, Object>>(hashMap0, class0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        doubleKeyMap1.put("us.codecraft.webmagic.utils.DoubleKeyMap", (Object) doubleKeyMap0, hashMap1);
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
      DoubleKeyMap<Map<Object, Object>, String, HashMap<String, String>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Object>, String, HashMap<String, String>>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<String, String> hashMap1 = doubleKeyMap0.put((Map<Object, Object>) null, (String) null, hashMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<HashMap<String, Integer>, Object, String> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Integer>, Object, String>();
      Map<HashMap<Object, Object>, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<HashMap<Object, Object>, Object, Object> doubleKeyMap1 = new DoubleKeyMap<HashMap<Object, Object>, Object, Object>(map0);
      HashMap<Object, Map<Map<Integer, HashMap<Object, Object>>, String>> hashMap0 = new HashMap<Object, Map<Map<Integer, HashMap<Object, Object>>, String>>();
      DoubleKeyMap<Object, Map<Integer, HashMap<Object, Object>>, String> doubleKeyMap2 = new DoubleKeyMap<Object, Map<Integer, HashMap<Object, Object>>, String>(hashMap0);
      HashMap<Integer, HashMap<Object, Object>> hashMap1 = new HashMap<Integer, HashMap<Object, Object>>();
      String string0 = doubleKeyMap2.put((Object) doubleKeyMap1, (Map<Integer, HashMap<Object, Object>>) hashMap1, "wrong proto type map ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<HashMap<Object, Object>, Map<Integer, Object>> hashMap0 = new HashMap<HashMap<Object, Object>, Map<Integer, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<Object, Object>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, Integer, Object>(hashMap0, class0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      Object object0 = doubleKeyMap0.get(hashMap1, (Integer) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<Integer, Map<String, Object>> hashMap0 = new HashMap<Integer, Map<String, Object>>();
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>(hashMap0);
      HashMap<Map<Integer, HashMap<Object, Object>>, Integer> hashMap1 = new HashMap<Map<Integer, HashMap<Object, Object>>, Integer>();
      DoubleKeyMap<Map<Map<Integer, HashMap<Object, Object>>, Integer>, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Map<Map<Integer, HashMap<Object, Object>>, Integer>, Object, Object>();
      Object object0 = doubleKeyMap1.get((Map<Map<Integer, HashMap<Object, Object>>, Integer>) hashMap1, (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleKeyMap<HashMap<Object, Object>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, Integer, Object>();
      Integer integer0 = new Integer(1735);
      Object object0 = doubleKeyMap0.get((HashMap<Object, Object>) null, integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<HashMap<Integer, Object>, Map<HashMap<Object, String>, Object>> hashMap0 = new HashMap<HashMap<Integer, Object>, Map<HashMap<Object, String>, Object>>();
      DoubleKeyMap<HashMap<Integer, Object>, HashMap<Object, String>, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, Object>, HashMap<Object, String>, Object>(hashMap0);
      Map<Object, Map<String, Integer>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, String, Integer>(map0, class0);
      Object object0 = new Object();
      Integer integer0 = doubleKeyMap1.get(object0, "");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, String, Integer> doubleKeyMap0 = new DoubleKeyMap<String, String, Integer>(class0);
      Map<String, Integer> map0 = doubleKeyMap0.get((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<Map<Object, Object>, Object, HashMap<Object, Integer>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Object>, Object, HashMap<Object, Integer>>();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object0 = new Object();
      HashMap<Integer, HashMap<Object, Object>> hashMap1 = new HashMap<Integer, HashMap<Object, Object>>();
      Integer integer0 = new Integer(1);
      hashMap1.put(integer0, hashMap0);
      hashMap0.put(object0, hashMap1);
      // Undeclared exception!
      try { 
        doubleKeyMap0.remove((Map<Object, Object>) hashMap0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>();
      Integer integer0 = new Integer((-979));
      HashMap<Integer, HashMap<Object, Object>> hashMap0 = new HashMap<Integer, HashMap<Object, Object>>();
      doubleKeyMap0.put(integer0, "us.codecraft.webmagic.utils.DoubleKeyMap", (Object) hashMap0);
      Object object0 = doubleKeyMap0.remove(integer0, ")j/THXQO*V U");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Integer, Map<String, Object>> hashMap0 = new HashMap<Integer, Map<String, Object>>();
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>(hashMap0);
      Integer integer0 = new Integer((-979));
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>();
      Map<Object, Object> map0 = doubleKeyMap1.newMap();
      doubleKeyMap0.put(integer0, "us.codecraft.webmagic.utils.DoubleKeyMap", (Object) map0);
      HashMap hashMap1 = (HashMap)doubleKeyMap0.put(integer0, "us.codecraft.webmagic.utils.DoubleKeyMap", (Object) map0);
      assertTrue(hashMap1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Object, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Integer>(class0);
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
      HashMap<Integer, Map<String, Object>> hashMap0 = new HashMap<Integer, Map<String, Object>>();
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>(hashMap0);
      Integer integer0 = new Integer((-979));
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>();
      Map<Object, Object> map0 = doubleKeyMap1.newMap();
      doubleKeyMap0.put(integer0, "us.codecraft.webmagic.utils.DoubleKeyMap", (Object) map0);
      doubleKeyMap0.remove(integer0, "us.codecraft.webmagic.utils.DoubleKeyMap");
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>();
      Object object0 = new Object();
      Map<Object, Object> map0 = doubleKeyMap0.get(object0);
      assertNull(map0);
  }
}
