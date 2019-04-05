/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 04:11:47 GMT 2019
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
      DoubleKeyMap<String, HashMap<Map<Object, String>, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Map<Object, String>, String>, Integer>();
      Map<Object, String> map0 = doubleKeyMap0.newMap();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      HashMap<HashMap<Object, String>, Integer> hashMap1 = new HashMap<HashMap<Object, String>, Integer>();
      HashMap<Map<Object, String>, Map<HashMap<Object, String>, Integer>> hashMap2 = new HashMap<Map<Object, String>, Map<HashMap<Object, String>, Integer>>();
      hashMap2.put(hashMap0, hashMap1);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Object, String>, HashMap<Object, String>, Integer> doubleKeyMap1 = new DoubleKeyMap<Map<Object, String>, HashMap<Object, String>, Integer>(hashMap2, class0);
      doubleKeyMap1.remove(map0, hashMap0);
      assertTrue(hashMap2.isEmpty());
      assertEquals(0, hashMap2.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<HashMap<Object, Object>, HashMap<Integer, Object>, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, HashMap<Integer, Object>, Object>(class0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      HashMap<HashMap<Object, String>, Integer> hashMap1 = new HashMap<HashMap<Object, String>, Integer>();
      HashMap<Map<Object, String>, Map<HashMap<Object, String>, Integer>> hashMap2 = new HashMap<Map<Object, String>, Map<HashMap<Object, String>, Integer>>();
      hashMap2.put(hashMap0, hashMap1);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Object, String>, HashMap<Object, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, HashMap<Object, String>, Integer>(hashMap2, class0);
      Map<HashMap<Object, String>, Integer> map0 = doubleKeyMap0.remove((Map<Object, String>) hashMap0);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<String, HashMap<Map<Object, String>, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Map<Object, String>, String>, Integer>();
      HashMap<Map<Object, String>, String> hashMap0 = new HashMap<Map<Object, String>, String>();
      Integer integer0 = new Integer(0);
      doubleKeyMap0.put("o\"A;C", hashMap0, integer0);
      Map<HashMap<Map<Object, String>, String>, Integer> map0 = doubleKeyMap0.remove("o\"A;C");
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Class<Map> class0 = Map.class;
      HashMap<Map<Integer, Object>, Map<String, Object>> hashMap1 = new HashMap<Map<Integer, Object>, Map<String, Object>>();
      HashMap<Integer, Map<Integer, Object>> hashMap2 = new HashMap<Integer, Map<Integer, Object>>();
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>(hashMap2);
      Map<Integer, Object> map0 = doubleKeyMap0.newMap();
      hashMap1.put(map0, hashMap0);
      DoubleKeyMap<Map<Integer, Object>, String, Object> doubleKeyMap1 = new DoubleKeyMap<Map<Integer, Object>, String, Object>(hashMap1, class0);
      HashMap<Integer, Object> hashMap3 = new HashMap<Integer, Object>();
      Map<String, Object> map1 = doubleKeyMap1.get((Map<Integer, Object>) hashMap3);
      assertEquals(0, map1.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<String, String, Integer> doubleKeyMap0 = new DoubleKeyMap<String, String, Integer>();
      Map<String, Map<String, HashMap<Integer, String>>> map0 = doubleKeyMap0.newMap();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, String, HashMap<Integer, String>> doubleKeyMap1 = new DoubleKeyMap<String, String, HashMap<Integer, String>>(map0, class0);
      DoubleKeyMap<String, Object, HashMap<Object, Object>> doubleKeyMap2 = new DoubleKeyMap<String, Object, HashMap<Object, Object>>();
      Map<Object, Map<Object, String>> map1 = doubleKeyMap2.newMap();
      DoubleKeyMap<Object, Object, String> doubleKeyMap3 = new DoubleKeyMap<Object, Object, String>(map1);
      String string0 = doubleKeyMap3.remove((Object) "", (Object) doubleKeyMap1);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>();
      Map<Object, Map<String, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, String, String> doubleKeyMap1 = new DoubleKeyMap<Object, String, String>(map0);
      String string0 = doubleKeyMap1.remove((Object) doubleKeyMap0, "us.codecraft.webmagic.utils.DoubleKeyMap");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<Integer, Object, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, String>();
      Map<String, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<String, Object, Object> doubleKeyMap1 = new DoubleKeyMap<String, Object, Object>(map0);
      Map<Object, Object> map1 = doubleKeyMap1.remove((String) null);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>();
      DoubleKeyMap<Object, Map<Object, String>, String> doubleKeyMap1 = new DoubleKeyMap<Object, Map<Object, String>, String>();
      Map<Map<Object, String>, String> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<Map<Object, String>, Map<Object, String>, Map<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, Map<Object, String>, Map<Object, String>>();
      Map<Object, String> map0 = doubleKeyMap0.put((Map<Object, String>) null, (Map<Object, String>) null, (Map<Object, String>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<String, HashMap<String, String>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, String>, String>();
      String string0 = doubleKeyMap0.get("YhKEm", (HashMap<String, String>) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<String, HashMap<String, String>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, String>, String>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      String string0 = doubleKeyMap0.get((String) null, hashMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<Object, Map<String, String>> hashMap0 = new HashMap<Object, Map<String, String>>();
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>(hashMap0);
      DoubleKeyMap<Object, HashMap<Integer, Object>, Map<Integer, Integer>> doubleKeyMap1 = new DoubleKeyMap<Object, HashMap<Integer, Object>, Map<Integer, Integer>>();
      HashMap<Integer, Object> hashMap1 = new HashMap<Integer, Object>();
      Map<Integer, Integer> map0 = doubleKeyMap1.get((Object) doubleKeyMap0, hashMap1);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>();
      Map<Object, String> map0 = doubleKeyMap0.get((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleKeyMap<Object, Map<String, String>, String> doubleKeyMap0 = new DoubleKeyMap<Object, Map<String, String>, String>();
      DoubleKeyMap<Object, String, String> doubleKeyMap1 = new DoubleKeyMap<Object, String, String>();
      Map<String, String> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      HashMap<HashMap<Object, String>, Integer> hashMap1 = new HashMap<HashMap<Object, String>, Integer>();
      HashMap<Map<Object, String>, Map<HashMap<Object, String>, Integer>> hashMap2 = new HashMap<Map<Object, String>, Map<HashMap<Object, String>, Integer>>();
      hashMap2.put(hashMap0, hashMap1);
      hashMap0.put(hashMap2, "]~P6({");
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Object, String>, HashMap<Object, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, HashMap<Object, String>, Integer>(hashMap2, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap0.remove((Map<Object, String>) hashMap0, hashMap0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<Object, Map<String, String>> hashMap0 = new HashMap<Object, Map<String, String>>();
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>(hashMap0);
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Object) hashMap0, "", "");
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<Object, Map<String, Object>> hashMap0 = new HashMap<Object, Map<String, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(hashMap0, class0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Object) class0, "", object0);
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
      DoubleKeyMap<Map<Object, String>, HashMap<Object, String>, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, HashMap<Object, String>, Integer>((Map<Map<Object, String>, Map<HashMap<Object, String>, Integer>>) null, (Class<? extends Map>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, HashMap<Object, Integer>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, String, HashMap<Object, Integer>>((Map<Object, Map<String, HashMap<Object, Integer>>>) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>(class0);
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
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>();
      doubleKeyMap0.put((Object) null, "wrong proto type map ", "wrong proto type map ");
      String string0 = doubleKeyMap0.remove((Object) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<Object, Map<String, String>> hashMap0 = new HashMap<Object, Map<String, String>>();
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>(hashMap0);
      Object object0 = new Object();
      String string0 = doubleKeyMap0.put(object0, "eKIc]oQwYW", "us.codecraft.webmagic.utils.MultiKeyMapBase");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      HashMap<HashMap<Object, String>, Integer> hashMap1 = new HashMap<HashMap<Object, String>, Integer>();
      HashMap<Map<Object, String>, Map<HashMap<Object, String>, Integer>> hashMap2 = new HashMap<Map<Object, String>, Map<HashMap<Object, String>, Integer>>();
      hashMap2.put(hashMap0, hashMap1);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Object, String>, HashMap<Object, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, HashMap<Object, String>, Integer>(hashMap2, class0);
      Integer integer0 = doubleKeyMap0.put((Map<Object, String>) hashMap0, hashMap0, (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>((Class<? extends Map>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }
}
