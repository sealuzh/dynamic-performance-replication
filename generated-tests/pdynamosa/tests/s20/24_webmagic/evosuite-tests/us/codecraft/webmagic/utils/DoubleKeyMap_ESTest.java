/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 06:07:07 GMT 2019
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
      HashMap<HashMap<Integer, Object>, Map<Object, Object>> hashMap0 = new HashMap<HashMap<Integer, Object>, Map<Object, Object>>();
      DoubleKeyMap<HashMap<Integer, Object>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, Object>, Object, Object>(hashMap0);
      HashMap<Integer, Object> hashMap1 = new HashMap<Integer, Object>();
      Integer integer0 = new Integer((-695));
      Object object0 = doubleKeyMap0.get(hashMap1, (Object) integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Object, HashMap<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, HashMap<Object, String>>(class0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Integer, Map<Integer, Map<Integer, Object>>> hashMap0 = new HashMap<Integer, Map<Integer, Map<Integer, Object>>>();
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>();
      Map<Object, Object> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<HashMap<Map<Integer, Object>, String>, Object, HashMap<String, Integer>> doubleKeyMap1 = new DoubleKeyMap<HashMap<Map<Integer, Object>, String>, Object, HashMap<String, Integer>>();
      HashMap<Map<Integer, Object>, String> hashMap1 = new HashMap<Map<Integer, Object>, String>();
      HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();
      doubleKeyMap1.put(hashMap1, (Object) hashMap0, hashMap2);
      HashMap<String, Integer> hashMap3 = doubleKeyMap1.remove(hashMap1, (Object) map0);
      assertSame(hashMap3, hashMap2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<String, Integer, HashMap<Object, Map<Integer, Object>>> doubleKeyMap0 = new DoubleKeyMap<String, Integer, HashMap<Object, Map<Integer, Object>>>();
      Integer integer0 = new Integer(1);
      HashMap<Object, Map<Integer, Object>> hashMap0 = new HashMap<Object, Map<Integer, Object>>();
      doubleKeyMap0.put("g~^=X`ZQ'!K[]r@3BE8", integer0, hashMap0);
      Map<Integer, HashMap<Object, Map<Integer, Object>>> map0 = doubleKeyMap0.get("g~^=X`ZQ'!K[]r@3BE8");
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      String string0 = doubleKeyMap0.remove((Object) null, (Object) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>();
      Integer integer0 = new Integer(0);
      Object object0 = doubleKeyMap1.remove((Object) doubleKeyMap0, (Object) integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<Integer, Map<Integer, Object>> hashMap0 = new HashMap<Integer, Map<Integer, Object>>();
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>(hashMap0);
      Map<Integer, Object> map0 = doubleKeyMap0.remove((Integer) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>();
      DoubleKeyMap<Object, Integer, HashMap<String, Integer>> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, HashMap<String, Integer>>();
      Map<Integer, HashMap<String, Integer>> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<HashMap<Object, Object>, Map<HashMap<Map<Integer, Object>, Object>, Object>> hashMap0 = new HashMap<HashMap<Object, Object>, Map<HashMap<Map<Integer, Object>, Object>, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<Object, Object>, HashMap<Map<Integer, Object>, Object>, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, HashMap<Map<Integer, Object>, Object>, Object>(hashMap0, class0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      Object object0 = new Object();
      HashMap<Map<Integer, Object>, Object> hashMap2 = new HashMap<Map<Integer, Object>, Object>();
      // Undeclared exception!
      try { 
        doubleKeyMap0.put(hashMap1, hashMap2, object0);
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
      Integer integer0 = new Integer((-695));
      HashMap<Integer, Map<Map<Object, Integer>, Integer>> hashMap0 = new HashMap<Integer, Map<Map<Object, Integer>, Integer>>();
      DoubleKeyMap<Integer, Map<Object, Integer>, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Map<Object, Integer>, Integer>(hashMap0);
      Integer integer1 = doubleKeyMap0.put(integer0, (Map<Object, Integer>) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>();
      DoubleKeyMap<Map<Integer, Object>, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Map<Integer, Object>, Object, Integer>();
      Integer integer0 = new Integer(1);
      Integer integer1 = doubleKeyMap1.put((Map<Integer, Object>) null, (Object) doubleKeyMap0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>();
      Map<Object, Map<Integer, String>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Integer, String> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, String>(map0, class0);
      Integer integer0 = new Integer((-131));
      // Undeclared exception!
      try { 
        doubleKeyMap1.put((Object) doubleKeyMap0, integer0, "");
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
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>();
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Integer>();
      Integer integer0 = doubleKeyMap1.get((Object) doubleKeyMap0, (Object) doubleKeyMap0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Map<Integer, Object>> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Map<Integer, Object>>();
      Map<Integer, Map<Integer, Object>> map0 = doubleKeyMap0.get((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>();
      DoubleKeyMap<Object, Integer, String> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, String>();
      Map<Integer, String> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
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
      Object object0 = new Object();
      Integer integer0 = new Integer(1);
      DoubleKeyMap<HashMap<Map<Integer, Object>, String>, Object, HashMap<String, Integer>> doubleKeyMap0 = new DoubleKeyMap<HashMap<Map<Integer, Object>, String>, Object, HashMap<String, Integer>>();
      HashMap<Map<Integer, Object>, String> hashMap0 = new HashMap<Map<Integer, Object>, String>();
      HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
      doubleKeyMap0.put(hashMap0, (Object) integer0, hashMap1);
      HashMap<String, Integer> hashMap2 = doubleKeyMap0.remove(hashMap0, object0);
      assertNull(hashMap2);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<String, Integer, HashMap<Object, Map<Integer, Object>>> doubleKeyMap0 = new DoubleKeyMap<String, Integer, HashMap<Object, Map<Integer, Object>>>();
      Integer integer0 = new Integer(1);
      HashMap<Object, Map<Integer, Object>> hashMap0 = new HashMap<Object, Map<Integer, Object>>();
      HashMap<Object, Map<Integer, Object>> hashMap1 = doubleKeyMap0.put("g~^=X`ZQ'!K[]r@3BE8", integer0, hashMap0);
      HashMap<Object, Map<Integer, Object>> hashMap2 = doubleKeyMap0.put("g~^=X`ZQ'!K[]r@3BE8", integer0, hashMap1);
      assertTrue(hashMap2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, HashMap<Object, String>, HashMap<Map<Integer, Object>, Object>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, String>, HashMap<Map<Integer, Object>, Object>>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }
}
