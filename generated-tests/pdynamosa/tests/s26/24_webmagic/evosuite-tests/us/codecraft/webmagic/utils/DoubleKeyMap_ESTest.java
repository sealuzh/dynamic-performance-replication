/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 13:38:55 GMT 2019
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
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      DoubleKeyMap<String, String, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<String, String, HashMap<String, Object>>();
      doubleKeyMap0.put("[avUch?~PXohywciC", "[avUch?~PXohywciC", hashMap0);
      HashMap<String, Object> hashMap1 = doubleKeyMap0.get("[avUch?~PXohywciC", "");
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleKeyMap<HashMap<Integer, Object>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, Object>, Integer, Object>();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Integer integer0 = new Integer((-2306));
      doubleKeyMap0.put(hashMap0, integer0, (Object) "us.codecraft.webmagic.utils.DoubleKeyMap");
      Object object0 = doubleKeyMap0.remove(hashMap0, integer0);
      assertEquals("us.codecraft.webmagic.utils.DoubleKeyMap", object0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer((-1735));
      HashMap<HashMap<Integer, Integer>, Map<Integer, HashMap<Object, Integer>>> hashMap0 = new HashMap<HashMap<Integer, Integer>, Map<Integer, HashMap<Object, Integer>>>();
      DoubleKeyMap<HashMap<Integer, Integer>, Integer, HashMap<Object, Integer>> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, Integer>, Integer, HashMap<Object, Integer>>(hashMap0);
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      HashMap<Object, Integer> hashMap2 = new HashMap<Object, Integer>(hashMap1);
      doubleKeyMap0.put(hashMap1, integer0, hashMap2);
      Map<Integer, HashMap<Object, Integer>> map0 = doubleKeyMap0.remove(hashMap1);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<Map<Object, String>, Map<String, String>> hashMap0 = new HashMap<Map<Object, String>, Map<String, String>>();
      DoubleKeyMap<Map<Object, String>, String, String> doubleKeyMap0 = new DoubleKeyMap<Map<Object, String>, String, String>(hashMap0);
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      HashMap<String, String> hashMap2 = new HashMap<String, String>();
      hashMap0.put(hashMap1, hashMap2);
      Map<String, String> map0 = doubleKeyMap0.get((Map<Object, String>) hashMap1);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      HashMap<Object, Map<Object, String>> hashMap0 = new HashMap<Object, Map<Object, String>>();
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>(hashMap0);
      Object object0 = new Object();
      String string0 = doubleKeyMap0.remove((Object) class0, object0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<String, HashMap<String, String>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, String>, String>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      String string0 = doubleKeyMap0.remove((String) null, hashMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<String, HashMap<String, String>, String> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<String, String>, String>();
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>();
      String string0 = doubleKeyMap1.remove((Object) doubleKeyMap0, (Object) "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>();
      Map<Object, Object> map0 = doubleKeyMap0.remove((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<Integer, Map<String, Object>> hashMap0 = new HashMap<Integer, Map<String, Object>>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>(hashMap0, class0);
      Integer integer0 = new Integer((-290));
      HashMap<Integer, Map<Object, String>> hashMap1 = new HashMap<Integer, Map<Object, String>>();
      DoubleKeyMap<Integer, Object, String> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, String>(hashMap1, class0);
      Map<Object, Map<Object, Object>> map0 = doubleKeyMap1.newMap();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap2 = new DoubleKeyMap<Object, Object, Object>(map0);
      Object object0 = doubleKeyMap2.put((Object) integer0, (Object) integer0, (Object) doubleKeyMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>();
      Class<HashMap> class0 = HashMap.class;
      Object object0 = doubleKeyMap0.put("RhCt", (Object) null, (Object) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Integer, Map<Object, String>> hashMap0 = new HashMap<Integer, Map<Object, String>>();
      DoubleKeyMap<Integer, Object, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, String>(hashMap0);
      Integer integer0 = new Integer((-360));
      String string0 = doubleKeyMap0.put((Integer) null, (Object) integer0, "w");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<Map<Integer, Object>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Integer, Object>, Object, Object>();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Object object0 = new Object();
      Object object1 = doubleKeyMap0.get((Map<Integer, Object>) hashMap0, object0);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      HashMap<String, Map<String, HashMap<String, Object>>> hashMap0 = new HashMap<String, Map<String, HashMap<String, Object>>>();
      DoubleKeyMap<String, String, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<String, String, HashMap<String, Object>>(hashMap0, class0);
      HashMap<String, Object> hashMap1 = doubleKeyMap0.get((String) null, (String) null);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DoubleKeyMap<String, HashMap<Object, String>, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<String, HashMap<Object, String>, HashMap<Object, Object>>((Map<String, Map<HashMap<Object, String>, HashMap<Object, Object>>>) null);
      Map<HashMap<Object, String>, HashMap<Object, Object>> map0 = doubleKeyMap0.get((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>(class0);
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Integer, Integer>();
      Map<Integer, Integer> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<HashMap<Integer, Object>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Integer, Object>, Integer, Object>((Map<HashMap<Integer, Object>, Map<Integer, Object>>) null, class0);
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Integer integer0 = new Integer((-1735));
      Integer integer1 = new Integer(1);
      doubleKeyMap0.put(hashMap0, integer1, (Object) null);
      Object object0 = doubleKeyMap0.remove(hashMap0, integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<Integer, Map<Map<Object, Object>, String>> hashMap0 = new HashMap<Integer, Map<Map<Object, Object>, String>>();
      DoubleKeyMap<Integer, Map<Object, Object>, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Map<Object, Object>, String>(hashMap0);
      Integer integer0 = new Integer(0);
      String string0 = doubleKeyMap0.remove(integer0, (Map<Object, Object>) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<String, String, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<String, String, HashMap<String, Object>>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      HashMap<String, Object> hashMap1 = doubleKeyMap0.put("", "", hashMap0);
      HashMap<String, Object> hashMap2 = doubleKeyMap0.put("", "", hashMap1);
      assertTrue(hashMap2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DoubleKeyMap<Object, HashMap<Map<String, Object>, String>, String> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Map<String, Object>, String>, String>();
      Object object0 = new Object();
      HashMap<Map<String, Object>, String> hashMap0 = new HashMap<Map<String, Object>, String>();
      String string0 = doubleKeyMap0.get(object0, hashMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DoubleKeyMap<String, String, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<String, String, HashMap<String, Object>>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      doubleKeyMap0.put("", "", hashMap0);
      HashMap<String, Object> hashMap1 = doubleKeyMap0.get("", "");
      assertTrue(hashMap1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<String, Object>, Map<String, Object>, Integer> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Map<String, Object>, Map<String, Object>, Integer>(class0);
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
      HashMap<Integer, Map<Map<Object, Object>, String>> hashMap0 = new HashMap<Integer, Map<Map<Object, Object>, String>>();
      DoubleKeyMap<Integer, Map<Object, Object>, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Map<Object, Object>, String>(hashMap0);
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>();
      Map<Object, Object> map0 = doubleKeyMap1.remove((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DoubleKeyMap<Object, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, String, Integer>();
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Integer>();
      Integer integer0 = new Integer((-1));
      Integer integer1 = doubleKeyMap1.put((Object) doubleKeyMap0, (Object) doubleKeyMap0, integer0);
      assertNull(integer1);
  }
}