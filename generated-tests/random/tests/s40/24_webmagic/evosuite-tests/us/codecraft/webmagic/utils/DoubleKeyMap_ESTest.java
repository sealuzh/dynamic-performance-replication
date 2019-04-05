/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 01:05:04 GMT 2019
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
  public void test0()  throws Throwable  {
      DoubleKeyMap<Map<Object, Object>, Map<Object, Object>, String> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Object>, Map<Object, Object>, String>();
      Map<Map<Object, Object>, String> map0 = doubleKeyMap0.remove((Map<Object, Object>) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoubleKeyMap<Map<Object, Object>, Object, HashMap<Object, Map<Object, Object>>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Object>, Object, HashMap<Object, Map<Object, Object>>>();
      HashMap<Object, Map<Object, Object>> hashMap0 = doubleKeyMap0.put((Map<Object, Object>) null, (Object) "us.codecraft.webmagic.utils.MultiKeyMapBase", (HashMap<Object, Map<Object, Object>>) null);
      assertNull(hashMap0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer(730);
      HashMap<Integer, Map<String, String>> hashMap0 = new HashMap<Integer, Map<String, String>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, String, String> doubleKeyMap0 = new DoubleKeyMap<Integer, String, String>(hashMap0, class0);
      String string0 = doubleKeyMap0.remove(integer0, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DoubleKeyMap<Map<Object, Object>, HashMap<Integer, Integer>, HashMap<String, String>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Object>, HashMap<Integer, Integer>, HashMap<String, String>>();
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      doubleKeyMap0.put((Map<Object, Object>) null, hashMap0, hashMap1);
      HashMap<String, String> hashMap2 = doubleKeyMap0.remove((Map<Object, Object>) null, hashMap0);
      assertSame(hashMap2, hashMap1);
      assertNotNull(hashMap2);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DoubleKeyMap<Map<Object, Object>, HashMap<Integer, Integer>, HashMap<String, String>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Object>, HashMap<Integer, Integer>, HashMap<String, String>>();
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      doubleKeyMap0.put((Map<Object, Object>) null, hashMap0, hashMap1);
      HashMap<String, String> hashMap2 = doubleKeyMap0.put((Map<Object, Object>) null, hashMap0, hashMap1);
      assertNotNull(hashMap2);
      assertSame(hashMap2, hashMap1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DoubleKeyMap<Map<Object, Object>, HashMap<Integer, Integer>, HashMap<String, String>> doubleKeyMap0 = new DoubleKeyMap<Map<Object, Object>, HashMap<Integer, Integer>, HashMap<String, String>>();
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      HashMap<String, String> hashMap1 = doubleKeyMap0.get((Map<Object, Object>) null, hashMap0);
      assertNull(hashMap1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Object, Map<Integer, Integer>>, HashMap<Object, Object>, Map<Object, Object>> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<Map<Object, Map<Integer, Integer>>, HashMap<Object, Object>, Map<Object, Object>>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>();
      Map<String, Map<Integer, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<String, Integer, Object> doubleKeyMap1 = new DoubleKeyMap<String, Integer, Object>(map0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DoubleKeyMap<HashMap<Object, String>, String, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, String>, String, Integer>();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Integer integer0 = new Integer(0);
      doubleKeyMap0.put(hashMap0, (String) null, integer0);
      Integer integer1 = doubleKeyMap0.remove(hashMap0, "fLE>&~d)[&");
      assertNull(integer1);
  }
}
