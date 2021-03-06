/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 04:16:59 GMT 2019
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
      DoubleKeyMap<HashMap<Integer, Object>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, Object>, Object, Object>();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Integer integer0 = new Integer(0);
      doubleKeyMap0.put(hashMap0, (Object) null, (Object) integer0);
      Object object0 = doubleKeyMap0.remove(hashMap0, (Object) null);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>();
      HashMap<String, Map<String, Object>> hashMap0 = new HashMap<String, Map<String, Object>>();
      DoubleKeyMap<HashMap<Integer, Object>, Object, Object> doubleKeyMap1 = new DoubleKeyMap<HashMap<Integer, Object>, Object, Object>();
      HashMap<Integer, Object> hashMap1 = new HashMap<Integer, Object>();
      doubleKeyMap1.put(hashMap1, (Object) hashMap0, (Object) doubleKeyMap0);
      Object object0 = doubleKeyMap1.remove(hashMap1, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<HashMap<Integer, Object>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, Object>, Object, Object>();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Integer integer0 = new Integer(0);
      doubleKeyMap0.put(hashMap0, (Object) null, (Object) integer0);
      Map<Object, Object> map0 = doubleKeyMap0.remove(hashMap0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer((-649));
      HashMap<Integer, Map<Object, String>> hashMap0 = new HashMap<Integer, Map<Object, String>>();
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      hashMap0.put(integer0, hashMap1);
      DoubleKeyMap<Integer, Object, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, String>(hashMap0);
      Map<Object, String> map0 = doubleKeyMap0.get(integer0);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer(0);
      DoubleKeyMap<HashMap<String, Object>, String, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, String, Integer>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      doubleKeyMap0.put(hashMap0, "r", integer0);
      Map<String, Integer> map0 = doubleKeyMap0.get(hashMap0);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<Object, String, Map<String, Object>> doubleKeyMap0 = new DoubleKeyMap<Object, String, Map<String, Object>>();
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>();
      Integer integer0 = new Integer(385);
      String string0 = doubleKeyMap1.remove((Object) integer0, (Object) doubleKeyMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, String, String> doubleKeyMap1 = new DoubleKeyMap<Object, String, String>(class0);
      String string0 = doubleKeyMap1.remove((Object) doubleKeyMap0, "[4O_*w!ak#(;)");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Integer>(class0);
      Map<String, Integer> map0 = doubleKeyMap0.remove((Integer) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>();
      DoubleKeyMap<Object, String, String> doubleKeyMap1 = new DoubleKeyMap<Object, String, String>((Map<Object, Map<String, String>>) null);
      Map<String, String> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Object, HashMap<Object, Integer>> doubleKeyMap0 = new DoubleKeyMap<Object, Object, HashMap<Object, Integer>>(class0);
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      HashMap<Object, Integer> hashMap1 = doubleKeyMap0.put((Object) null, (Object) null, hashMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<HashMap<String, String>, Integer, String> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, String>, Integer, String>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Object, HashMap<Object, Integer>> doubleKeyMap1 = new DoubleKeyMap<Object, Object, HashMap<Object, Integer>>(class0);
      DoubleKeyMap<Object, Object, String> doubleKeyMap2 = new DoubleKeyMap<Object, Object, String>();
      String string0 = doubleKeyMap2.put((Object) doubleKeyMap0, (Object) doubleKeyMap1, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>();
      DoubleKeyMap<Object, HashMap<Object, Map<String, Integer>>, Object> doubleKeyMap1 = new DoubleKeyMap<Object, HashMap<Object, Map<String, Integer>>, Object>();
      Object object0 = doubleKeyMap1.get((Object) doubleKeyMap0, (HashMap<Object, Map<String, Integer>>) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>();
      Integer integer0 = new Integer((-1));
      Object object0 = doubleKeyMap0.remove((String) null, integer0);
      HashMap<Object, Map<Object, Object>> hashMap0 = new HashMap<Object, Map<Object, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>(hashMap0, class0);
      Object object1 = doubleKeyMap1.get(object0, (Object) doubleKeyMap0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<HashMap<Object, Object>, Integer, String> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, Integer, String>(class0);
      Map<String, Map<Object, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<String, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<String, Object, Integer>(map0);
      Map<String, Map<Integer, Integer>> map1 = doubleKeyMap1.newMap();
      DoubleKeyMap<String, Integer, Integer> doubleKeyMap2 = new DoubleKeyMap<String, Integer, Integer>(map1, class0);
      Map<Integer, Integer> map2 = doubleKeyMap2.get((String) null);
      assertNull(map2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>();
      DoubleKeyMap<Object, HashMap<Object, Map<String, Integer>>, Object> doubleKeyMap1 = new DoubleKeyMap<Object, HashMap<Object, Map<String, Integer>>, Object>();
      Map<HashMap<Object, Map<String, Integer>>, Object> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<Object, Map<Map<Integer, Map<String, Integer>>, HashMap<String, Object>>> hashMap0 = new HashMap<Object, Map<Map<Integer, Map<String, Integer>>, HashMap<String, Object>>>();
      DoubleKeyMap<Object, Map<Integer, Map<String, Integer>>, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<Object, Map<Integer, Map<String, Integer>>, HashMap<String, Object>>(hashMap0);
      HashMap<Integer, Map<String, Integer>> hashMap1 = new HashMap<Integer, Map<String, Integer>>();
      HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Object) hashMap0, (Map<Integer, Map<String, Integer>>) hashMap1, hashMap2);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>();
      Map<String, Map<String, Object>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, String, Object> doubleKeyMap1 = new DoubleKeyMap<String, String, Object>(map0, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap1.put("[4O_*w!ak#(;)", "[4O_*w!ak#(;)", (Object) "[4O_*w!ak#(;)");
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
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Object, Integer>((Map<Object, Map<Object, Integer>>) null, class0);
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
      DoubleKeyMap<Object, Map<Object, String>, Map<Integer, Object>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Map<Object, String>, Map<Integer, Object>>(class0);
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
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>();
      HashMap<String, Map<String, Object>> hashMap0 = new HashMap<String, Map<String, Object>>();
      DoubleKeyMap<HashMap<Integer, Object>, Object, Object> doubleKeyMap1 = new DoubleKeyMap<HashMap<Integer, Object>, Object, Object>();
      HashMap<Integer, Object> hashMap1 = new HashMap<Integer, Object>();
      doubleKeyMap1.put(hashMap1, (Object) doubleKeyMap0, (Object) doubleKeyMap0);
      Object object0 = doubleKeyMap1.put(hashMap1, (Object) hashMap0, (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>();
      HashMap<Object, Map<HashMap<String, Integer>, String>> hashMap0 = new HashMap<Object, Map<HashMap<String, Integer>, String>>();
      DoubleKeyMap<Object, HashMap<String, Integer>, String> doubleKeyMap1 = new DoubleKeyMap<Object, HashMap<String, Integer>, String>(hashMap0);
      HashMap<HashMap<String, Integer>, String> hashMap1 = new HashMap<HashMap<String, Integer>, String>();
      hashMap0.put(doubleKeyMap0, hashMap1);
      HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();
      String string0 = doubleKeyMap1.get((Object) doubleKeyMap0, hashMap2);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>((Class<? extends Map>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>();
      HashMap<String, Map<String, Object>> hashMap0 = new HashMap<String, Map<String, Object>>();
      DoubleKeyMap<HashMap<Integer, Object>, Object, Object> doubleKeyMap1 = new DoubleKeyMap<HashMap<Integer, Object>, Object, Object>();
      HashMap<Integer, Object> hashMap1 = new HashMap<Integer, Object>();
      doubleKeyMap1.put(hashMap1, (Object) hashMap0, (Object) doubleKeyMap0);
      Object object0 = doubleKeyMap1.remove(hashMap1, (Object) hashMap1);
      assertNotNull(object0);
  }
}
