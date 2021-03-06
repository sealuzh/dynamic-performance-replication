/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 12:38:15 GMT 2019
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
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      DoubleKeyMap<Map<Integer, HashMap<Object, Object>>, HashMap<Object, Object>, HashMap<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, HashMap<Object, Object>>, HashMap<Object, Object>, HashMap<Object, String>>();
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      doubleKeyMap0.put((Map<Integer, HashMap<Object, Object>>) null, hashMap0, hashMap1);
      HashMap<Object, String> hashMap2 = doubleKeyMap0.put((Map<Integer, HashMap<Object, Object>>) null, hashMap0, hashMap1);
      assertNotNull(hashMap2);
      assertSame(hashMap2, hashMap1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleKeyMap<String, String, Integer> doubleKeyMap0 = new DoubleKeyMap<String, String, Integer>((Map<String, Map<String, Integer>>) null);
      Integer integer0 = new Integer((-1159));
      doubleKeyMap0.put("", "", integer0);
      Map<String, Integer> map0 = doubleKeyMap0.get("");
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Integer>(class0);
      Integer integer0 = doubleKeyMap0.remove((String) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, Map<Integer, String>> hashMap0 = new HashMap<String, Map<Integer, String>>();
      DoubleKeyMap<String, Integer, String> doubleKeyMap0 = new DoubleKeyMap<String, Integer, String>(hashMap0);
      DoubleKeyMap<HashMap<Object, Integer>, Object, HashMap<Integer, String>> doubleKeyMap1 = new DoubleKeyMap<HashMap<Object, Integer>, Object, HashMap<Integer, String>>();
      HashMap<Object, Integer> hashMap1 = new HashMap<Object, Integer>();
      HashMap<Integer, String> hashMap2 = doubleKeyMap1.remove(hashMap1, (Object) doubleKeyMap0);
      assertNull(hashMap2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<String, HashMap<Object, String>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, String>, String>();
      DoubleKeyMap<Object, HashMap<Integer, Object>, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, HashMap<Integer, Object>, Integer>();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Integer integer0 = doubleKeyMap1.remove((Object) doubleKeyMap0, hashMap0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<String, HashMap<Object, String>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, String>, String>();
      Map<HashMap<Object, String>, String> map0 = doubleKeyMap0.remove((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Integer, String, String> doubleKeyMap0 = new DoubleKeyMap<Integer, String, String>();
      Map<Object, Map<Object, Integer>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Integer>(map0, class0);
      Object object0 = new Object();
      Map<Object, Integer> map1 = doubleKeyMap1.remove(object0);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<Object, Object, Map<Integer, HashMap<Object, Object>>> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Map<Integer, HashMap<Object, Object>>>();
      DoubleKeyMap<String, String, Object> doubleKeyMap1 = new DoubleKeyMap<String, String, Object>();
      doubleKeyMap1.put("W?~2Ad18(C{S}Dc", "W?~2Ad18(C{S}Dc", (Object) doubleKeyMap0);
      Map<String, Object> map0 = doubleKeyMap1.remove("W?~2Ad18(C{S}Dc");
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, Map<Integer, String>> hashMap0 = new HashMap<String, Map<Integer, String>>();
      HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
      DoubleKeyMap<String, Integer, String> doubleKeyMap0 = new DoubleKeyMap<String, Integer, String>(hashMap0);
      DoubleKeyMap<HashMap<Object, Integer>, Object, HashMap<Integer, String>> doubleKeyMap1 = new DoubleKeyMap<HashMap<Object, Integer>, Object, HashMap<Integer, String>>();
      HashMap<Object, Integer> hashMap2 = new HashMap<Object, Integer>();
      HashMap<Integer, String> hashMap3 = doubleKeyMap1.put(hashMap2, (Object) doubleKeyMap0, hashMap1);
      assertNull(hashMap3);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<String, HashMap<Object, String>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, String>, String>();
      DoubleKeyMap<Object, Integer, HashMap<Object, String>> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, HashMap<Object, String>>((Map<Object, Map<Integer, HashMap<Object, String>>>) null);
      Integer integer0 = new Integer((-716));
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      HashMap<Object, String> hashMap1 = doubleKeyMap1.put((Object) doubleKeyMap0, integer0, hashMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Object, Map<Integer, Integer>> hashMap0 = new HashMap<Object, Map<Integer, Integer>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>(hashMap0, class0);
      Integer integer0 = doubleKeyMap0.get((Object) null, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<Object, HashMap<Integer, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Integer, String>, Object>();
      Map<Object, Map<Integer, Integer>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Integer>(map0, class0);
      Integer integer0 = new Integer((-970));
      Integer integer1 = doubleKeyMap1.get((Object) doubleKeyMap0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Map<Integer, HashMap<Object, Object>>, Map<Object, String>> hashMap0 = new HashMap<Map<Integer, HashMap<Object, Object>>, Map<Object, String>>();
      DoubleKeyMap<Map<Integer, HashMap<Object, Object>>, Object, String> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, HashMap<Object, Object>>, Object, String>(hashMap0);
      Map<Object, String> map0 = doubleKeyMap0.get((Map<Integer, HashMap<Object, Object>>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, String>();
      Map<Object, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>(map0, class0);
      Map<Object, Object> map1 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      DoubleKeyMap<Map<Integer, HashMap<Object, Object>>, HashMap<Object, Object>, HashMap<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, HashMap<Object, Object>>, HashMap<Object, Object>, HashMap<Object, String>>();
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      hashMap0.put(hashMap1, (Object) null);
      hashMap1.put(hashMap0, "~R>ohMAEfCQ'0\"#");
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Map<Integer, HashMap<Object, Object>>) null, hashMap0, hashMap1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      HashMap<Map<Integer, HashMap<Object, Object>>, Map<HashMap<Object, Object>, HashMap<Object, String>>> hashMap1 = new HashMap<Map<Integer, HashMap<Object, Object>>, Map<HashMap<Object, Object>, HashMap<Object, String>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Integer, HashMap<Object, Object>>, HashMap<Object, Object>, HashMap<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, HashMap<Object, Object>>, HashMap<Object, Object>, HashMap<Object, String>>(hashMap1, class0);
      HashMap<Object, String> hashMap2 = new HashMap<Object, String>();
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Map<Integer, HashMap<Object, Object>>) null, hashMap0, hashMap2);
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
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Map<Object, Integer>, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Map<Object, Integer>, Integer>((Map<String, Map<Map<Object, Integer>, Integer>>) null, class0);
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
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      DoubleKeyMap<Map<Integer, HashMap<Object, Object>>, HashMap<Object, Object>, HashMap<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, HashMap<Object, Object>>, HashMap<Object, Object>, HashMap<Object, String>>();
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      doubleKeyMap0.put((Map<Integer, HashMap<Object, Object>>) null, (HashMap<Object, Object>) null, hashMap1);
      HashMap<Object, String> hashMap2 = doubleKeyMap0.remove((Map<Integer, HashMap<Object, Object>>) null, hashMap0);
      assertNull(hashMap2);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleKeyMap<HashMap<Object, Integer>, Object, HashMap<Integer, String>> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Integer>, Object, HashMap<Integer, String>>();
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      doubleKeyMap0.put(hashMap0, (Object) hashMap0, (HashMap<Integer, String>) null);
      HashMap<Integer, String> hashMap1 = doubleKeyMap0.put(hashMap0, (Object) null, (HashMap<Integer, String>) null);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DoubleKeyMap<HashMap<Integer, Integer>, HashMap<Object, String>, Map<Integer, HashMap<Object, Object>>> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, Integer>, HashMap<Object, String>, Map<Integer, HashMap<Object, Object>>>();
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      DoubleKeyMap<Integer, Integer, String> doubleKeyMap1 = new DoubleKeyMap<Integer, Integer, String>();
      Map<Integer, HashMap<Object, Object>> map0 = doubleKeyMap1.newMap();
      doubleKeyMap0.put(hashMap0, hashMap1, map0);
      Map<Integer, HashMap<Object, Object>> map1 = doubleKeyMap0.get(hashMap0, hashMap1);
      assertNotNull(map1);
      assertSame(map1, map0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Integer, HashMap<Object, Object>>, HashMap<Object, Object>, HashMap<Object, String>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Map<Integer, HashMap<Object, Object>>, HashMap<Object, Object>, HashMap<Object, String>>(class0);
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
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      DoubleKeyMap<Map<Integer, HashMap<Object, Object>>, HashMap<Object, Object>, HashMap<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, HashMap<Object, Object>>, HashMap<Object, Object>, HashMap<Object, String>>();
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      doubleKeyMap0.put((Map<Integer, HashMap<Object, Object>>) null, hashMap0, hashMap1);
      HashMap<Object, String> hashMap2 = doubleKeyMap0.remove((Map<Integer, HashMap<Object, Object>>) null, hashMap0);
      assertSame(hashMap2, hashMap1);
      assertNotNull(hashMap2);
  }
}
