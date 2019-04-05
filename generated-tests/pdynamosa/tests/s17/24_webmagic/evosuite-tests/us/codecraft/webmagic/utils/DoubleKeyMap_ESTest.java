/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 02:59:12 GMT 2019
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
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Integer integer0 = new Integer(1);
      HashMap<Map<Object, String>, Map<HashMap<Object, String>, Integer>> hashMap1 = new HashMap<Map<Object, String>, Map<HashMap<Object, String>, Integer>>();
      DoubleKeyMap<Map<Object, String>, HashMap<Object, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, HashMap<Object, String>, Integer>(hashMap1);
      HashMap<Object, String> hashMap2 = new HashMap<Object, String>();
      doubleKeyMap0.put((Map<Object, String>) hashMap0, hashMap2, integer0);
      doubleKeyMap0.remove((Map<Object, String>) hashMap0, hashMap2);
      assertTrue(hashMap1.isEmpty());
      assertEquals(0, hashMap1.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleKeyMap<String, String, Integer> doubleKeyMap0 = new DoubleKeyMap<String, String, Integer>();
      Integer integer0 = doubleKeyMap0.remove("us.codecraft.webmagic.utils.MultiKeyMapBase", "");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      HashMap<Map<Object, String>, Map<HashMap<Object, String>, Integer>> hashMap1 = new HashMap<Map<Object, String>, Map<HashMap<Object, String>, Integer>>();
      HashMap<HashMap<Object, String>, Integer> hashMap2 = new HashMap<HashMap<Object, String>, Integer>();
      hashMap1.put(hashMap0, hashMap2);
      DoubleKeyMap<Map<Object, String>, HashMap<Object, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, HashMap<Object, String>, Integer>(hashMap1);
      Map<HashMap<Object, String>, Integer> map0 = doubleKeyMap0.remove((Map<Object, String>) hashMap0);
      assertEquals(0, map0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      HashMap<Map<Object, String>, Map<HashMap<Object, String>, Integer>> hashMap1 = new HashMap<Map<Object, String>, Map<HashMap<Object, String>, Integer>>();
      DoubleKeyMap<Map<Object, String>, HashMap<Object, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, HashMap<Object, String>, Integer>(hashMap1);
      Integer integer0 = new Integer((-3422));
      doubleKeyMap0.put((Map<Object, String>) hashMap0, hashMap0, integer0);
      Map<HashMap<Object, String>, Integer> map0 = doubleKeyMap0.remove((Map<Object, String>) hashMap0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<String, HashMap<Map<Object, String>, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Map<Object, String>, String>, Integer>();
      Map<HashMap<Map<Object, String>, String>, Integer> map0 = doubleKeyMap0.remove((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>();
      DoubleKeyMap<Object, Map<Object, String>, String> doubleKeyMap1 = new DoubleKeyMap<Object, Map<Object, String>, String>();
      Map<String, String> map0 = doubleKeyMap0.remove((Object) doubleKeyMap1);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>();
      Object object0 = doubleKeyMap1.put((Object) "", "LILa\"nK=t|QVY", (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>(class0);
      Map<Integer, Map<Integer, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>();
      DoubleKeyMap<Object, Object, String> doubleKeyMap2 = new DoubleKeyMap<Object, Object, String>(class0);
      String string0 = doubleKeyMap2.put((Object) map0, (Object) doubleKeyMap1, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, Map<Map<Object, String>, Object>> hashMap0 = new HashMap<String, Map<Map<Object, String>, Object>>();
      DoubleKeyMap<String, Map<Object, String>, Object> doubleKeyMap0 = new DoubleKeyMap<String, Map<Object, String>, Object>(hashMap0);
      DoubleKeyMap<Object, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, String, Integer>();
      Integer integer0 = new Integer(0);
      Integer integer1 = doubleKeyMap1.put((Object) doubleKeyMap0, "", integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, Map<String, HashMap<Integer, String>>> hashMap0 = new HashMap<String, Map<String, HashMap<Integer, String>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, String, HashMap<Integer, String>> doubleKeyMap0 = new DoubleKeyMap<String, String, HashMap<Integer, String>>(hashMap0, class0);
      HashMap<Integer, String> hashMap1 = doubleKeyMap0.get((String) null, (String) null);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<String, String, Integer> doubleKeyMap0 = new DoubleKeyMap<String, String, Integer>();
      Map<String, Map<String, HashMap<Integer, String>>> map0 = doubleKeyMap0.newMap();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, String, HashMap<Integer, String>> doubleKeyMap1 = new DoubleKeyMap<String, String, HashMap<Integer, String>>(map0, class0);
      HashMap<Integer, String> hashMap0 = doubleKeyMap1.get((String) null, "");
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<Map<Object, Map<Object, String>>, Map<Integer, Map<Integer, Integer>>> hashMap0 = new HashMap<Map<Object, Map<Object, String>>, Map<Integer, Map<Integer, Integer>>>();
      DoubleKeyMap<Map<Object, Map<Object, String>>, Integer, Map<Integer, Integer>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Map<Object, String>>, Integer, Map<Integer, Integer>>(hashMap0);
      Map<Integer, Map<Integer, Integer>> map0 = doubleKeyMap0.get((Map<Object, Map<Object, String>>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<Object, Map<String, String>, String> doubleKeyMap0 = new DoubleKeyMap<Object, Map<String, String>, String>();
      DoubleKeyMap<Object, String, String> doubleKeyMap1 = new DoubleKeyMap<Object, String, String>();
      Map<String, String> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      HashMap<Integer, Map<Map<Object, String>, Map<Object, Object>>> hashMap0 = new HashMap<Integer, Map<Map<Object, String>, Map<Object, Object>>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Map<Object, String>, Map<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<Integer, Map<Object, String>, Map<Object, Object>>(hashMap0, class0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      // Undeclared exception!
      try { 
        doubleKeyMap0.put(integer0, (Map<Object, String>) null, (Map<Object, Object>) hashMap1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>();
      doubleKeyMap0.put((Object) null, "h", "");
      String string0 = doubleKeyMap0.remove((Object) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DoubleKeyMap<String, Object, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<String, Object, HashMap<Object, Object>>();
      Map<Object, Map<Object, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>(map0);
      Object object0 = new Object();
      String string0 = doubleKeyMap1.remove(object0, object0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>();
      Object object0 = doubleKeyMap1.get((Object) doubleKeyMap0, (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>();
      Integer integer0 = new Integer((-1));
      DoubleKeyMap<String, HashMap<Map<Object, String>, String>, Integer> doubleKeyMap1 = new DoubleKeyMap<String, HashMap<Map<Object, String>, String>, Integer>();
      Map<Object, Map<HashMap<Map<Object, String>, Map<Object, Object>>, Map<Object, String>>> map0 = doubleKeyMap1.newMap();
      doubleKeyMap0.put(integer0, "", (Object) map0);
      HashMap hashMap0 = (HashMap)doubleKeyMap0.get(integer0, "");
      assertTrue(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Integer, Integer>, Integer, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Integer>, Integer, Object>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }
}