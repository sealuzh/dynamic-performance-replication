/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 17:26:01 GMT 2019
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
      HashMap<HashMap<String, Integer>, Map<Object, Object>> hashMap0 = new HashMap<HashMap<String, Integer>, Map<Object, Object>>(0, 1.0F);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<String, Integer>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Integer>, Object, Object>(hashMap0, class0);
      HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
      Object object0 = doubleKeyMap0.get(hashMap1, (Object) hashMap0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DoubleKeyMap<Integer, Object, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, String>();
      Map<String, Map<Object, String>> map0 = doubleKeyMap0.newMap();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, String> doubleKeyMap1 = new DoubleKeyMap<String, Object, String>(map0, class0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, Map<Map<String, String>, String>> hashMap0 = new HashMap<String, Map<Map<String, String>, String>>();
      DoubleKeyMap<String, Map<String, String>, String> doubleKeyMap0 = new DoubleKeyMap<String, Map<String, String>, String>(hashMap0);
      HashMap<Map<String, String>, String> hashMap1 = new HashMap<Map<String, String>, String>();
      HashMap<String, String> hashMap2 = new HashMap<String, String>();
      hashMap1.put(hashMap2, "");
      hashMap0.put(")2NN", hashMap1);
      String string0 = doubleKeyMap0.put(")2NN", (Map<String, String>) hashMap2, ")2NN");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DoubleKeyMap<Object, Integer, HashMap<Object, Object>> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, HashMap<Object, Object>>();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      HashMap<Object, Object> hashMap1 = doubleKeyMap0.put((Object) null, (Integer) null, hashMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      HashMap<Object, Map<Map<Object, Integer>, Integer>> hashMap1 = new HashMap<Object, Map<Map<Object, Integer>, Integer>>();
      DoubleKeyMap<Object, Map<Object, Integer>, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Map<Object, Integer>, Integer>(hashMap1);
      Map<Map<Object, Integer>, Integer> map0 = doubleKeyMap0.get((Object) hashMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DoubleKeyMap<Object, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, String>((Map<Object, Map<Integer, String>>) null);
      Integer integer0 = new Integer((-1919));
      doubleKeyMap0.put((Object) null, integer0, "^NU4m?&xURr");
      Integer integer1 = new Integer(1032);
      String string0 = doubleKeyMap0.remove((Object) null, integer1);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<Object, Object, Map<Object, Integer>> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Map<Object, Integer>>();
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Map<Object, Integer> map0 = doubleKeyMap0.remove((Object) hashMap0, (Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<Object, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, String>((Map<Object, Map<Integer, String>>) null);
      Integer integer0 = new Integer((-1919));
      doubleKeyMap0.put((Object) null, integer0, "^NU4m?&xURr");
      String string0 = doubleKeyMap0.remove((Object) null, integer0);
      assertEquals("^NU4m?&xURr", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<Object, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, String>((Map<Object, Map<Integer, String>>) null);
      Integer integer0 = new Integer((-1919));
      doubleKeyMap0.put((Object) null, integer0, "^NU4m?&xURr");
      String string0 = doubleKeyMap0.get((Object) null, (Integer) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, Map<Object, Integer>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Object, Object, Map<Object, Integer>>(class0);
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
      DoubleKeyMap<HashMap<String, Object>, String, Map<Object, Integer>> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, String, Map<Object, Integer>>();
      Map<Integer, Map<Object, Integer>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Integer, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, Integer>(map0);
      Integer integer0 = new Integer(0);
      Integer integer1 = doubleKeyMap1.put(integer0, (Object) doubleKeyMap0, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<Map<Object, Object>, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Object>, Object, Object>();
      Map<Object, Object> map0 = doubleKeyMap0.remove((Map<Object, Object>) null);
      assertNull(map0);
  }
}
