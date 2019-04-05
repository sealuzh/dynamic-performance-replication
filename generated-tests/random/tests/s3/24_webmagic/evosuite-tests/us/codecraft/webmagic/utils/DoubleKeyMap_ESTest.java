/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 11:24:14 GMT 2019
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
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, String>(class0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, HashMap<String, String>, Map<String, Object>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, String>, Map<String, Object>>((Map<String, Map<HashMap<String, String>, Map<String, Object>>>) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, Map<HashMap<String, Object>, Integer>> hashMap0 = new HashMap<String, Map<HashMap<String, Object>, Integer>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, HashMap<String, Object>, Integer> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, Object>, Integer>(hashMap0, class0);
      Map<HashMap<String, Object>, Integer> map0 = doubleKeyMap0.remove("us.codecraft.webmagic.utils.DoubleKeyMap");
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<Integer, Map<String, Object>, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Map<String, Object>, Object>();
      Integer integer0 = new Integer(1);
      Map<Map<String, Object>, Object> map0 = doubleKeyMap0.get(integer0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, Map<Integer, HashMap<String, Object>>> hashMap0 = new HashMap<String, Map<Integer, HashMap<String, Object>>>();
      DoubleKeyMap<HashMap<String, Object>, String, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, String, Object>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      doubleKeyMap0.put(hashMap1, "us.codecraft.webmagic.utils.MultiKeyMapBase", (Object) hashMap0);
      Object object0 = doubleKeyMap0.remove(hashMap1, "cgF Uo#");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Map> class0 = Map.class;
      HashMap<String, Map<Map<Integer, Integer>, Integer>> hashMap0 = new HashMap<String, Map<Map<Integer, Integer>, Integer>>();
      DoubleKeyMap<String, Map<Integer, Integer>, Integer> doubleKeyMap0 = new DoubleKeyMap<String, Map<Integer, Integer>, Integer>(hashMap0, class0);
      DoubleKeyMap<Object, Map<String, Object>, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Map<String, Object>, Object>();
      Map<Integer, Integer> map0 = doubleKeyMap1.newMap();
      Integer integer0 = doubleKeyMap0.remove("us.codecraft.webmagic.utils.MultiKeyMapBase", map0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<String, Map<HashMap<String, Object>, Integer>> hashMap0 = new HashMap<String, Map<HashMap<String, Object>, Integer>>();
      Class<Map> class0 = Map.class;
      HashMap<Integer, Map<Object, String>> hashMap1 = new HashMap<Integer, Map<Object, String>>();
      Integer integer0 = new Integer(0);
      HashMap<Object, String> hashMap2 = new HashMap<Object, String>();
      hashMap1.putIfAbsent(integer0, hashMap2);
      DoubleKeyMap<Integer, Object, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, String>(hashMap1, class0);
      doubleKeyMap0.put(integer0, (Object) hashMap0, "Bj|$Y");
      Map<Object, String> map0 = doubleKeyMap0.get(integer0);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>();
      Integer integer0 = new Integer((-1));
      Object object0 = doubleKeyMap0.get("", integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>();
      Integer integer0 = new Integer(0);
      doubleKeyMap0.put(integer0, "bCK0`-.,fd:", (Object) integer0);
      Object object0 = doubleKeyMap0.get(integer0, "");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<Object, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, String>();
      Map<String, Map<Object, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<String, Object, String> doubleKeyMap1 = new DoubleKeyMap<String, Object, String>(map0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Integer, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Integer, Integer>(class0);
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
      DoubleKeyMap<String, Map<String, Integer>, Map<String, String>> doubleKeyMap0 = new DoubleKeyMap<String, Map<String, Integer>, Map<String, String>>((Map<String, Map<Map<String, Integer>, Map<String, String>>>) null);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      doubleKeyMap0.put("wrong proto type map ", (Map<String, Integer>) hashMap0, (Map<String, String>) hashMap1);
      Map<String, String> map0 = doubleKeyMap0.remove("wrong proto type map ", (Map<String, Integer>) hashMap0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Integer, HashMap<String, String>, HashMap<String, Map<String, Object>>> doubleKeyMap0 = new DoubleKeyMap<Integer, HashMap<String, String>, HashMap<String, Map<String, Object>>>();
      Integer integer0 = new Integer(0);
      HashMap<String, Map<String, Object>> hashMap0 = doubleKeyMap0.remove(integer0, (HashMap<String, String>) null);
      assertNull(hashMap0);
  }
}