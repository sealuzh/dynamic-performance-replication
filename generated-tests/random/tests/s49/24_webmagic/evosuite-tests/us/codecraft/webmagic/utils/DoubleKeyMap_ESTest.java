/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 10:50:49 GMT 2019
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
      HashMap<Integer, Map<Map<Integer, Object>, Integer>> hashMap0 = new HashMap<Integer, Map<Map<Integer, Object>, Integer>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Map<Integer, Object>, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Map<Integer, Object>, Integer>(hashMap0, class0);
      Integer integer0 = new Integer(0);
      HashMap<Integer, Object> hashMap1 = new HashMap<Integer, Object>();
      Integer integer1 = doubleKeyMap0.get(integer0, (Map<Integer, Object>) hashMap1);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleKeyMap<HashMap<String, Object>, Integer, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, Integer, HashMap<String, Object>>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      HashMap<String, Object> hashMap1 = doubleKeyMap0.remove(hashMap0, (Integer) null);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      Integer integer0 = new Integer(3199);
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>(class0);
      Integer integer1 = doubleKeyMap0.remove((Object) null, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, Map<String, String>> hashMap0 = new HashMap<String, Map<String, String>>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, String, String> doubleKeyMap0 = new DoubleKeyMap<String, String, String>(hashMap0, class0);
      Map<String, String> map0 = doubleKeyMap0.remove((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Map<Integer, String>, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Map<Integer, String>, Object>((Map<String, Map<Map<Integer, String>, Object>>) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>();
      Map<Integer, Map<Object, HashMap<Integer, Integer>>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, Object, HashMap<Integer, Integer>> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, HashMap<Integer, Integer>>(map0);
      Integer integer0 = new Integer((-1));
      Map<Object, HashMap<Integer, Integer>> map1 = doubleKeyMap1.get(integer0);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      Integer integer0 = new Integer(3199);
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>(class0);
      doubleKeyMap0.put(integer0, (Object) integer0, (Object) integer0);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Object object0 = doubleKeyMap0.remove(integer0, (Object) hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<HashMap<Object, String>, Map<Integer, Object>> hashMap0 = new HashMap<HashMap<Object, String>, Map<Integer, Object>>();
      DoubleKeyMap<HashMap<Object, String>, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, String>, Integer, Object>(hashMap0);
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      DoubleKeyMap<Integer, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Integer, String, Integer>((Map<Integer, Map<String, Integer>>) null);
      Integer integer0 = new Integer(1);
      Map<Integer, Object> map0 = doubleKeyMap1.newMap();
      hashMap0.put(hashMap1, map0);
      Object object0 = doubleKeyMap0.put(hashMap1, integer0, (Object) hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, HashMap<Object, Map<Integer, String>>> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, HashMap<Object, Map<Integer, String>>>();
      Map<String, Map<Object, Map<Integer, String>>> map0 = doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, Map<Integer, String>> doubleKeyMap1 = new DoubleKeyMap<String, Object, Map<Integer, String>>(map0, class0);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      // Undeclared exception!
      try { 
        doubleKeyMap1.put((String) null, (Object) class0, (Map<Integer, String>) hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DoubleKeyMap<HashMap<String, Object>, Integer, HashMap<String, Object>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, Integer, HashMap<String, Object>>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Integer integer0 = new Integer(0);
      doubleKeyMap0.put(hashMap0, integer0, hashMap0);
      HashMap<String, Object> hashMap1 = doubleKeyMap0.remove(hashMap0, integer0);
      assertEquals(0, hashMap1.size());
  }
}
