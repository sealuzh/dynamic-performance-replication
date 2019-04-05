/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 07:29:02 GMT 2019
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
      HashMap<Integer, Map<Integer, Map<Integer, Object>>> hashMap0 = new HashMap<Integer, Map<Integer, Map<Integer, Object>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Integer, Map<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Map<Integer, Object>>(hashMap0, class0);
      HashMap<Map<Integer, Object>, Map<Object, Object>> hashMap1 = new HashMap<Map<Integer, Object>, Map<Object, Object>>();
      HashMap<Integer, Object> hashMap2 = new HashMap<Integer, Object>();
      DoubleKeyMap<String, Object, Object> doubleKeyMap1 = new DoubleKeyMap<String, Object, Object>();
      Map<Object, Object> map0 = doubleKeyMap1.newMap();
      hashMap1.put(hashMap2, map0);
      DoubleKeyMap<Map<Integer, Object>, Object, Object> doubleKeyMap2 = new DoubleKeyMap<Map<Integer, Object>, Object, Object>(hashMap1);
      doubleKeyMap2.remove((Map<Integer, Object>) hashMap2, (Object) doubleKeyMap0);
      assertEquals(0, hashMap1.size());
      assertTrue(hashMap1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Object, HashMap<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, HashMap<Object, String>>(class0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Map<Integer, Object>, Map<Object, Object>> hashMap0 = new HashMap<Map<Integer, Object>, Map<Object, Object>>();
      HashMap<Integer, Object> hashMap1 = new HashMap<Integer, Object>();
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>();
      Map<Object, Object> map0 = doubleKeyMap0.newMap();
      hashMap0.put(hashMap1, map0);
      DoubleKeyMap<Map<Integer, Object>, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Map<Integer, Object>, Object, Object>(hashMap0);
      Map<Object, Object> map1 = doubleKeyMap1.remove((Map<Integer, Object>) hashMap1);
      assertTrue(map1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>();
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Integer>();
      Integer integer0 = new Integer((-1099));
      doubleKeyMap1.put((Object) doubleKeyMap0, integer0, integer0);
      Map<Integer, Integer> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Map<Object, Integer>, Map<Object, Object>> hashMap0 = new HashMap<Map<Object, Integer>, Map<Object, Object>>();
      DoubleKeyMap<Map<Object, Integer>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Integer>, Object, Object>();
      HashMap<Object, Integer> hashMap1 = new HashMap<Object, Integer>();
      doubleKeyMap0.put((Map<Object, Integer>) hashMap1, (Object) hashMap0, (Object) "");
      Object object0 = doubleKeyMap0.get((Map<Object, Integer>) hashMap1, (Object) hashMap0);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>();
      Map<Object, Object> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Map<Integer, Object>, Integer, Object> doubleKeyMap1 = new DoubleKeyMap<Map<Integer, Object>, Integer, Object>();
      Map<String, Map<Map<Object, Object>, HashMap<String, Integer>>> map1 = doubleKeyMap1.newMap();
      DoubleKeyMap<String, Map<Object, Object>, HashMap<String, Integer>> doubleKeyMap2 = new DoubleKeyMap<String, Map<Object, Object>, HashMap<String, Integer>>(map1);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      doubleKeyMap2.put("", map0, hashMap0);
      Map<Map<Object, Object>, HashMap<String, Integer>> map2 = doubleKeyMap2.get("");
      assertEquals(1, map2.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      String string0 = doubleKeyMap0.remove((Object) null, (Object) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>();
      Object object0 = new Object();
      Integer integer0 = new Integer(0);
      Object object1 = doubleKeyMap0.remove(object0, integer0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<Integer, Map<Integer, Object>> hashMap0 = new HashMap<Integer, Map<Integer, Object>>();
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>(hashMap0);
      Map<Integer, Object> map0 = doubleKeyMap0.remove((Integer) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<Integer, Map<Integer, Object>, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Map<Integer, Object>, Object>();
      Integer integer0 = new Integer(0);
      DoubleKeyMap<String, Object, Object> doubleKeyMap1 = new DoubleKeyMap<String, Object, Object>();
      Object object0 = doubleKeyMap1.put("", (Object) doubleKeyMap0, (Object) integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<Map<Integer, Object>, Integer, Map<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Object>, Integer, Map<Integer, Object>>();
      Integer integer0 = new Integer(0);
      Map<Integer, Object> map0 = doubleKeyMap0.put((Map<Integer, Object>) null, integer0, (Map<Integer, Object>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<Map<Object, Integer>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Integer>, Object, Object>();
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Object>();
      Map<Object, Integer> map0 = doubleKeyMap1.newMap();
      Object object0 = new Object();
      Object object1 = doubleKeyMap0.get(map0, object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>();
      Integer integer0 = new Integer(0);
      Object object0 = doubleKeyMap0.get((Integer) null, integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleKeyMap<Integer, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Integer>();
      Map<String, Integer> map0 = doubleKeyMap0.get((Integer) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      Object object0 = new Object();
      Map<Object, String> map0 = doubleKeyMap0.get(object0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<Object, Map<HashMap<Integer, Integer>, Object>> hashMap0 = new HashMap<Object, Map<HashMap<Integer, Integer>, Object>>();
      DoubleKeyMap<Object, HashMap<Integer, Integer>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Integer, Integer>, Object>(hashMap0);
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Object) hashMap0, hashMap1, (Object) hashMap1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Map> class0 = Map.class;
      Integer integer0 = new Integer(0);
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      HashMap<Integer, Map<Object, Integer>> hashMap1 = new HashMap<Integer, Map<Object, Integer>>();
      DoubleKeyMap<Integer, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Integer>(hashMap1, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap0.put(integer0, (Object) hashMap0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Map<String, Integer>, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Integer, Map<String, Integer>, Integer>((Map<Integer, Map<Map<String, Integer>, Integer>>) null, class0);
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
      HashMap<Map<Integer, Object>, Map<Object, Object>> hashMap0 = new HashMap<Map<Integer, Object>, Map<Object, Object>>();
      HashMap<Integer, Object> hashMap1 = new HashMap<Integer, Object>();
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>();
      DoubleKeyMap<Map<Integer, Object>, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Map<Integer, Object>, Object, Object>(hashMap0);
      doubleKeyMap1.put((Map<Integer, Object>) hashMap1, (Object) "{Y", (Object) doubleKeyMap0);
      doubleKeyMap1.remove((Map<Integer, Object>) hashMap1, (Object) hashMap1);
      assertEquals(1, hashMap0.size());
      assertFalse(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Integer integer0 = new Integer(0);
      DoubleKeyMap<String, HashMap<Map<Integer, Object>, Object>, Integer> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Map<Integer, Object>, Object>, Integer>((Map<String, Map<HashMap<Map<Integer, Object>, Object>, Integer>>) null);
      Integer integer1 = doubleKeyMap0.put("", (HashMap<Map<Integer, Object>, Object>) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Map<Integer, Object>, Map<Object, Object>> hashMap0 = new HashMap<Map<Integer, Object>, Map<Object, Object>>();
      HashMap<Integer, Object> hashMap1 = new HashMap<Integer, Object>();
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>();
      Map<Object, Object> map0 = doubleKeyMap0.newMap();
      hashMap0.put(hashMap1, map0);
      DoubleKeyMap<Map<Integer, Object>, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Map<Integer, Object>, Object, Object>(hashMap0);
      Object object0 = doubleKeyMap1.put((Map<Integer, Object>) hashMap1, (Object) "{Y", (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Map> class0 = Map.class;
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      HashMap<Map<Object, Integer>, Map<Object, Object>> hashMap1 = new HashMap<Map<Object, Integer>, Map<Object, Object>>();
      DoubleKeyMap<Map<Object, Integer>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Integer>, Object, Object>(hashMap1, class0);
      Object object0 = doubleKeyMap0.get((Map<Object, Integer>) hashMap0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, String, Map<Integer, Object>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, String, Map<Integer, Object>>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }
}
