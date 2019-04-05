/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 09:18:51 GMT 2019
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
      DoubleKeyMap<Map<Integer, Map<HashMap<Object, Object>, Object>>, Map<Object, Object>, HashMap<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Map<HashMap<Object, Object>, Object>>, Map<Object, Object>, HashMap<Object, String>>();
      HashMap<Integer, Map<HashMap<Object, Object>, Object>> hashMap0 = new HashMap<Integer, Map<HashMap<Object, Object>, Object>>();
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
      doubleKeyMap0.put((Map<Integer, Map<HashMap<Object, Object>, Object>>) hashMap0, (Map<Object, Object>) hashMap2, hashMap1);
      Map<Map<Object, Object>, HashMap<Object, String>> map0 = doubleKeyMap0.remove((Map<Integer, Map<HashMap<Object, Object>, Object>>) hashMap0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleKeyMap<String, Object, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<String, Object, HashMap<Object, Object>>();
      Map<Object, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>(map0, class0);
      Object object0 = doubleKeyMap1.remove((Object) class0, (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<Map<Map<HashMap<Object, Object>, Object>, Object>, Object, Map<String, Integer>> doubleKeyMap0 = new DoubleKeyMap<Map<Map<HashMap<Object, Object>, Object>, Object>, Object, Map<String, Integer>>();
      Map<String, Integer> map0 = doubleKeyMap0.remove((Map<Map<HashMap<Object, Object>, Object>, Object>) null, (Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>();
      Map<Object, Map<HashMap<Object, Object>, Object>> map0 = doubleKeyMap0.newMap();
      HashMap<Object, Map<Map<Object, Map<HashMap<Object, Object>, Object>>, Object>> hashMap0 = new HashMap<Object, Map<Map<Object, Map<HashMap<Object, Object>, Object>>, Object>>();
      DoubleKeyMap<Object, Map<Object, Map<HashMap<Object, Object>, Object>>, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Map<Object, Map<HashMap<Object, Object>, Object>>, Object>(hashMap0);
      Object object0 = new Object();
      Object object1 = doubleKeyMap1.remove(object0, map0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<Map<Map<HashMap<Object, Object>, Object>, Object>, Object, Map<String, Integer>> doubleKeyMap0 = new DoubleKeyMap<Map<Map<HashMap<Object, Object>, Object>, Object>, Object, Map<String, Integer>>();
      Map<Object, Map<String, Integer>> map0 = doubleKeyMap0.remove((Map<Map<HashMap<Object, Object>, Object>, Object>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>();
      Map<Object, Map<Map<Object, Integer>, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, Map<Object, Integer>, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Map<Object, Integer>, Integer>(map0);
      Map<Map<Object, Integer>, Integer> map1 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Map<Integer, Map<HashMap<Object, Object>, Object>>, Map<Object, Object>, HashMap<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Map<HashMap<Object, Object>, Object>>, Map<Object, Object>, HashMap<Object, String>>();
      HashMap<Integer, Map<HashMap<Object, Object>, Object>> hashMap0 = new HashMap<Integer, Map<HashMap<Object, Object>, Object>>();
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>();
      String string0 = doubleKeyMap1.put((Object) hashMap0, (Object) doubleKeyMap0, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>(class0);
      Object object0 = new Object();
      Object object1 = doubleKeyMap0.put(object0, (Integer) null, object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      Integer integer0 = new Integer(1314);
      HashMap<String, Map<Object, HashMap<Object, String>>> hashMap0 = new HashMap<String, Map<Object, HashMap<Object, String>>>();
      DoubleKeyMap<String, Object, HashMap<Object, String>> doubleKeyMap0 = new DoubleKeyMap<String, Object, HashMap<Object, String>>(hashMap0);
      Map<Integer, Map<Integer, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap1 = new DoubleKeyMap<Integer, Integer, Integer>(map0, class0);
      Integer integer1 = doubleKeyMap1.get(integer0, (Integer) null);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, Map<Map<HashMap<Object, Object>, Object>, String>> hashMap0 = new HashMap<String, Map<Map<HashMap<Object, Object>, Object>, String>>();
      DoubleKeyMap<String, Map<HashMap<Object, Object>, Object>, String> doubleKeyMap0 = new DoubleKeyMap<String, Map<HashMap<Object, Object>, Object>, String>(hashMap0);
      DoubleKeyMap<Integer, Object, HashMap<Object, String>> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, HashMap<Object, String>>();
      Integer integer0 = new Integer((-2838));
      HashMap<Object, String> hashMap1 = doubleKeyMap1.get(integer0, (Object) doubleKeyMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      Integer integer0 = new Integer(0);
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>(class0);
      Object object0 = doubleKeyMap0.get((Integer) null, integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>();
      HashMap<Object, Map<Integer, HashMap<String, Object>>> hashMap0 = new HashMap<Object, Map<Integer, HashMap<String, Object>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Integer, HashMap<String, Object>> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, HashMap<String, Object>>(hashMap0, class0);
      Integer integer0 = new Integer(1);
      HashMap<String, Object> hashMap1 = doubleKeyMap1.get((Object) doubleKeyMap0, integer0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<HashMap<Object, Object>, Object, String> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Object>, Object, String>();
      HashMap<Object, Map<Object, Integer>> hashMap0 = new HashMap<Object, Map<Object, Integer>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Integer>(hashMap0, class0);
      Map<Object, Integer> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleKeyMap<String, Object, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<String, Object, HashMap<Object, Object>>();
      Map<Object, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>(map0, class0);
      doubleKeyMap1.put((Object) "s[1dRW!L#v!~;t[P", (Object) "s[1dRW!L#v!~;t[P", (Object) map0);
      // Undeclared exception!
      try { 
        doubleKeyMap1.remove((Object) map0, (Object) class0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      Map<Object, Object> map0 = doubleKeyMap0.newMap();
      Integer integer0 = new Integer(0);
      HashMap<Object, Map<Integer, Object>> hashMap0 = new HashMap<Object, Map<Integer, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Object>(hashMap0, class0);
      // Undeclared exception!
      try { 
        doubleKeyMap1.put((Object) null, integer0, (Object) map0);
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
      DoubleKeyMap<Object, Integer, Map<HashMap<Object, Object>, Object>> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Map<HashMap<Object, Object>, Object>>();
      Map<Integer, Map<HashMap<Object, Object>, Object>> map0 = doubleKeyMap0.get((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleKeyMap<Map<Integer, Map<HashMap<Object, Object>, Object>>, Map<Object, Object>, HashMap<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Map<HashMap<Object, Object>, Object>>, Map<Object, Object>, HashMap<Object, String>>();
      HashMap<Integer, Map<HashMap<Object, Object>, Object>> hashMap0 = new HashMap<Integer, Map<HashMap<Object, Object>, Object>>();
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
      doubleKeyMap0.put((Map<Integer, Map<HashMap<Object, Object>, Object>>) hashMap0, (Map<Object, Object>) hashMap2, hashMap1);
      HashMap<Object, Object> hashMap3 = new HashMap<Object, Object>();
      hashMap3.put(hashMap2, doubleKeyMap0);
      HashMap<Object, String> hashMap4 = doubleKeyMap0.remove((Map<Integer, Map<HashMap<Object, Object>, Object>>) hashMap0, (Map<Object, Object>) hashMap3);
      assertNull(hashMap4);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<Map<Integer, Map<HashMap<Object, Object>, Object>>, Map<Object, Object>, HashMap<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Map<HashMap<Object, Object>, Object>>, Map<Object, Object>, HashMap<Object, String>>();
      HashMap<Integer, Map<HashMap<Object, Object>, Object>> hashMap0 = new HashMap<Integer, Map<HashMap<Object, Object>, Object>>();
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
      doubleKeyMap0.put((Map<Integer, Map<HashMap<Object, Object>, Object>>) hashMap0, (Map<Object, Object>) hashMap2, hashMap1);
      HashMap<Object, String> hashMap3 = doubleKeyMap0.put((Map<Integer, Map<HashMap<Object, Object>, Object>>) hashMap0, (Map<Object, Object>) hashMap2, (HashMap<Object, String>) null);
      assertNotNull(hashMap3);
      assertSame(hashMap3, hashMap1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      HashMap<String, Map<String, String>> hashMap0 = new HashMap<String, Map<String, String>>();
      DoubleKeyMap<String, String, String> doubleKeyMap0 = new DoubleKeyMap<String, String, String>(hashMap0, class0);
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      hashMap0.put("^sy", hashMap1);
      String string0 = doubleKeyMap0.get("^sy", "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>(class0);
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
      DoubleKeyMap<Map<Integer, Map<HashMap<Object, Object>, Object>>, Map<Object, Object>, HashMap<Object, String>> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Map<HashMap<Object, Object>, Object>>, Map<Object, Object>, HashMap<Object, String>>();
      HashMap<Integer, Map<HashMap<Object, Object>, Object>> hashMap0 = new HashMap<Integer, Map<HashMap<Object, Object>, Object>>();
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
      doubleKeyMap0.put((Map<Integer, Map<HashMap<Object, Object>, Object>>) hashMap0, (Map<Object, Object>) hashMap2, hashMap1);
      HashMap<Object, String> hashMap3 = doubleKeyMap0.remove((Map<Integer, Map<HashMap<Object, Object>, Object>>) hashMap0, (Map<Object, Object>) hashMap2);
      assertNotNull(hashMap3);
      assertSame(hashMap3, hashMap1);
  }
}