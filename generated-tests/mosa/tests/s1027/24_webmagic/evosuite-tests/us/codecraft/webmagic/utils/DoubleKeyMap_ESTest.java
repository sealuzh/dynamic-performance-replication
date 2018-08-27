/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 18:04:43 GMT 2018
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
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>();
      Integer integer0 = new Integer(1793);
      Object object0 = doubleKeyMap0.get(integer0, integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>();
      Integer integer0 = new Integer(1793);
      Integer integer1 = new Integer(1793);
      doubleKeyMap0.remove(integer1, integer1);
      DoubleKeyMap<String, Integer, String> doubleKeyMap1 = new DoubleKeyMap<String, Integer, String>();
      Integer integer2 = new Integer(1793);
      doubleKeyMap1.put("dD", integer2, "");
      doubleKeyMap1.put("dD", integer1, "");
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap2 = new DoubleKeyMap<Integer, Object, Object>();
      Integer integer3 = new Integer(1);
      HashMap<Object, Map<Object, Object>> hashMap0 = new HashMap<Object, Map<Object, Object>>();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap3 = new DoubleKeyMap<Object, Object, Object>(hashMap0);
      doubleKeyMap3.get((Object) integer2);
      // Undeclared exception!
      try { 
        doubleKeyMap2.put(integer3, (Map<Object, Object>) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DoubleKeyMap<Object, Object, Map<Integer, Integer>> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Map<Integer, Integer>>();
      DoubleKeyMap<Map<Integer, Integer>, Object, String> doubleKeyMap1 = new DoubleKeyMap<Map<Integer, Integer>, Object, String>();
      doubleKeyMap1.newMap();
      Map<Integer, Map<Map<Integer, Integer>, String>> map0 = doubleKeyMap1.newMap();
      DoubleKeyMap<Integer, Map<Integer, Integer>, String> doubleKeyMap2 = new DoubleKeyMap<Integer, Map<Integer, Integer>, String>(map0);
      doubleKeyMap0.remove((Object) doubleKeyMap2);
      doubleKeyMap2.remove((Integer) null);
      Map<Integer, Integer> map1 = doubleKeyMap2.newMap();
      doubleKeyMap0.put((Object) "", (Object) "", map1);
      Object object0 = new Object();
      Object object1 = new Object();
      doubleKeyMap0.remove(object1, (Object) null);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      doubleKeyMap0.put(object0, object0, (Map<Integer, Integer>) hashMap0);
      doubleKeyMap0.remove(object0, (Object) null);
      HashMap<Object, Map<Object, Integer>> hashMap1 = new HashMap<Object, Map<Object, Integer>>();
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap3 = new DoubleKeyMap<Integer, Integer, Object>();
      Integer integer0 = new Integer((-3358));
      DoubleKeyMap<Object, Object, Object> doubleKeyMap4 = new DoubleKeyMap<Object, Object, Object>();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DoubleKeyMap<Object, Object, Map<Integer, Integer>> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Map<Integer, Integer>>();
      DoubleKeyMap<Map<Integer, Integer>, Object, String> doubleKeyMap1 = new DoubleKeyMap<Map<Integer, Integer>, Object, String>();
      Map<Integer, Object> map0 = doubleKeyMap1.newMap();
      Map<Integer, Map<Map<Integer, Integer>, String>> map1 = doubleKeyMap1.newMap();
      DoubleKeyMap<Integer, Map<Integer, Integer>, String> doubleKeyMap2 = new DoubleKeyMap<Integer, Map<Integer, Integer>, String>(map1);
      doubleKeyMap0.remove((Object) "");
      Integer integer0 = new Integer(1377);
      doubleKeyMap2.remove(integer0);
      Map<Integer, Integer> map2 = doubleKeyMap2.newMap();
      doubleKeyMap0.put((Object) null, (Object) map1, map2);
      Object object0 = new Object();
      Object object1 = new Object();
      doubleKeyMap0.remove((Object) map0, (Object) map1);
      Object object2 = new Object();
      doubleKeyMap0.remove((Object) null, (Object) map1);
      HashMap<Object, Map<Object, Integer>> hashMap0 = new HashMap<Object, Map<Object, Integer>>();
      Integer integer1 = new Integer(1377);
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap3 = new DoubleKeyMap<Integer, Integer, Object>();
      Integer integer2 = new Integer(0);
      Integer integer3 = new Integer(1377);
      Object object3 = new Object();
      HashMap<Integer, Map<String, Object>> hashMap1 = new HashMap<Integer, Map<String, Object>>();
      DoubleKeyMap<Integer, String, Object> doubleKeyMap4 = new DoubleKeyMap<Integer, String, Object>(hashMap1);
      doubleKeyMap4.remove(integer3);
      Integer integer4 = new Integer(3106);
      doubleKeyMap3.remove(integer4, integer1);
      DoubleKeyMap<String, Integer, String> doubleKeyMap5 = new DoubleKeyMap<String, Integer, String>();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, Object>();
      Integer integer0 = new Integer(1793);
      Object object0 = new Object();
      Integer integer1 = new Integer(1793);
      doubleKeyMap0.put(integer0, integer1, (Object) integer0);
      Integer integer2 = new Integer(1793);
      Integer integer3 = new Integer(1);
      Integer integer4 = new Integer((-111));
      doubleKeyMap0.get(integer0, integer4);
      HashMap<Integer, Map<String, Object>> hashMap0 = new HashMap<Integer, Map<String, Object>>();
      DoubleKeyMap<Integer, String, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, String, Object>(hashMap0);
      doubleKeyMap1.remove(integer3);
      Integer integer5 = new Integer(1793);
      Integer integer6 = new Integer(1793);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, Map<Integer, Integer>> doubleKeyMap2 = null;
      try {
        doubleKeyMap2 = new DoubleKeyMap<Object, Object, Map<Integer, Integer>>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }
}
