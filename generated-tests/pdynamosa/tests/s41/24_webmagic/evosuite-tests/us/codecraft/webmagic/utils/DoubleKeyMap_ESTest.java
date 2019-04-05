/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 05:13:43 GMT 2019
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
      DoubleKeyMap<Integer, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Integer>();
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Object>();
      Integer integer0 = new Integer(1154);
      doubleKeyMap1.put((Object) doubleKeyMap0, integer0, (Object) "!");
      Map<Integer, Object> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      String string0 = doubleKeyMap0.remove((Object) null, (Object) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Integer>();
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Object>();
      Map<Integer, Object> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      DoubleKeyMap<Map<Object, Object>, String, Object> doubleKeyMap1 = new DoubleKeyMap<Map<Object, Object>, String, Object>();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object0 = doubleKeyMap1.put((Map<Object, Object>) hashMap0, (String) null, (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      Object object0 = new Object();
      String string0 = doubleKeyMap0.put(object0, object0, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>();
      Map<Object, Map<Object, String>> map0 = doubleKeyMap0.newMap();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>(map0, class0);
      Map<Object, Map<String, HashMap<String, String>>> map1 = doubleKeyMap1.newMap();
      DoubleKeyMap<Object, String, HashMap<String, String>> doubleKeyMap2 = new DoubleKeyMap<Object, String, HashMap<String, String>>(map1);
      Object object0 = new Object();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<String, String> hashMap1 = doubleKeyMap2.put(object0, "H3Q", hashMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>();
      Object object0 = doubleKeyMap1.get((Object) null, (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Integer>();
      DoubleKeyMap<Object, String, String> doubleKeyMap1 = new DoubleKeyMap<Object, String, String>();
      Map<String, String> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<HashMap<Map<String, Object>, Map<String, Object>>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Map<String, Object>, Map<String, Object>>, Integer, Object>();
      Map<HashMap<Integer, String>, Map<String, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<HashMap<Integer, String>, String, String> doubleKeyMap1 = new DoubleKeyMap<HashMap<Integer, String>, String, String>(map0);
      HashMap<String, Map<Map<String, Object>, Object>> hashMap0 = new HashMap<String, Map<Map<String, Object>, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Map<String, Object>, Object> doubleKeyMap2 = new DoubleKeyMap<String, Map<String, Object>, Object>(hashMap0, class0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        doubleKeyMap2.put("C", (Map<String, Object>) hashMap1, (Object) doubleKeyMap1);
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
      HashMap<String, Map<Integer, Map<String, Integer>>> hashMap0 = new HashMap<String, Map<Integer, Map<String, Integer>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Integer, Map<String, Integer>> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Map<String, Integer>>(hashMap0, class0);
      Map<Integer, Map<String, Integer>> map0 = doubleKeyMap0.remove((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<String, Map<String, Object>, String> doubleKeyMap0 = new DoubleKeyMap<String, Map<String, Object>, String>();
      Map<Map<String, Object>, String> map0 = doubleKeyMap0.get((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<String, String, Integer> doubleKeyMap0 = new DoubleKeyMap<String, String, Integer>();
      Integer integer0 = new Integer((-227));
      doubleKeyMap0.put((String) null, "K<}#7[][VI,ju", integer0);
      Integer integer1 = doubleKeyMap0.remove((String) null, "-e7");
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      Object object0 = new Object();
      String string0 = doubleKeyMap0.remove(object0, object0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Integer>();
      Integer integer0 = new Integer((-46));
      doubleKeyMap0.put(integer0, (Object) "q", integer0);
      Integer integer1 = doubleKeyMap0.get(integer0, (Object) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Object, Map<Object, Object>> hashMap0 = new HashMap<Object, Map<Object, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>(hashMap0, class0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      Object object0 = doubleKeyMap0.get((Object) doubleKeyMap0, (Object) hashMap1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>(class0);
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
      DoubleKeyMap<Map<String, Object>, HashMap<Integer, String>, String> doubleKeyMap0 = new DoubleKeyMap<Map<String, Object>, HashMap<Integer, String>, String>((Map<Map<String, Object>, Map<HashMap<Integer, String>, String>>) null);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      doubleKeyMap0.put((Map<String, Object>) null, hashMap0, "w9'+12R/0ZQKt");
      String string0 = doubleKeyMap0.put((Map<String, Object>) null, hashMap0, (String) null);
      assertEquals("w9'+12R/0ZQKt", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<String, String, Integer> doubleKeyMap0 = new DoubleKeyMap<String, String, Integer>();
      Integer integer0 = new Integer(1);
      doubleKeyMap0.put("S7FF%+WR", "", integer0);
      Integer integer1 = doubleKeyMap0.remove("S7FF%+WR", "");
      assertEquals(1, (int)integer1);
  }
}
