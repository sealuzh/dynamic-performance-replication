/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 22:01:09 GMT 2018
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
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, String, String> doubleKeyMap0 = new DoubleKeyMap<Integer, String, String>(class0);
      Integer integer0 = new Integer((-2883));
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>(class0);
      Object object0 = new Object();
      Object object1 = new Object();
      doubleKeyMap1.put(object0, object1, "");
      doubleKeyMap1.put(object0, (Object) "1}0Z7VY* ~2am1}(`", ">t\"g7HamCdD){3B %hC");
      DoubleKeyMap<String, Object, Object> doubleKeyMap2 = new DoubleKeyMap<String, Object, Object>();
      doubleKeyMap2.remove("1}0Z7VY* ~2am1}(`");
      doubleKeyMap2.remove((String) null, (Object) ">t\"g7HamCdD){3B %hC");
      Object object2 = new Object();
      doubleKeyMap2.remove(">t\"g7HamCdD){3B %hC", object2);
      doubleKeyMap2.remove("/vWIT");
      DoubleKeyMap<Object, Object, Object> doubleKeyMap3 = new DoubleKeyMap<Object, Object, Object>();
      Map<Integer, Map<String, Object>> map0 = doubleKeyMap3.newMap();
      DoubleKeyMap<Integer, String, Object> doubleKeyMap4 = new DoubleKeyMap<Integer, String, Object>(map0, class0);
      Integer integer1 = new Integer(399);
      Class<HashMap> class1 = HashMap.class;
      DoubleKeyMap<Integer, Object, String> doubleKeyMap5 = new DoubleKeyMap<Integer, Object, String>(class1);
      Map<String, Object> map1 = doubleKeyMap5.newMap();
      // Undeclared exception!
      try { 
        doubleKeyMap4.put(integer1, map1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>();
      Map<Integer, Map<String, Object>> map0 = doubleKeyMap0.newMap();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, String, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, String, Object>(map0, class0);
      Integer integer0 = new Integer((-913));
      doubleKeyMap1.remove(integer0, "");
      doubleKeyMap1.get(integer0, "");
      DoubleKeyMap<String, String, Object> doubleKeyMap2 = new DoubleKeyMap<String, String, Object>();
      DoubleKeyMap<Integer, Object, String> doubleKeyMap3 = new DoubleKeyMap<Integer, Object, String>(class0);
      HashMap<String, Map<String, String>> hashMap0 = new HashMap<String, Map<String, String>>();
      DoubleKeyMap<String, String, String> doubleKeyMap4 = new DoubleKeyMap<String, String, String>(hashMap0);
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      hashMap0.put((String) null, hashMap1);
      doubleKeyMap4.get((String) null, (String) null);
      Integer integer1 = new Integer((-913));
      doubleKeyMap0.remove((Object) integer1);
      Class<Map> class1 = Map.class;
      DoubleKeyMap<Map<String, String>, Object, Object> doubleKeyMap5 = null;
      try {
        doubleKeyMap5 = new DoubleKeyMap<Map<String, String>, Object, Object>(class1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>();
      Object object0 = new Object();
      HashMap<String, Map<Integer, String>> hashMap0 = new HashMap<String, Map<Integer, String>>();
      DoubleKeyMap<String, Integer, String> doubleKeyMap1 = new DoubleKeyMap<String, Integer, String>(hashMap0);
      Map<Object, Object> map0 = doubleKeyMap1.newMap();
      doubleKeyMap0.put(object0, object0, (Object) map0);
      Object object1 = new Object();
      doubleKeyMap0.remove(object0, (Object) hashMap0);
      DoubleKeyMap<Object, Object, String> doubleKeyMap2 = new DoubleKeyMap<Object, Object, String>();
      doubleKeyMap2.newMap();
      Object object2 = new Object();
      Object object3 = doubleKeyMap0.remove((Object) null, object2);
      assertNull(object3);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>();
      Object object0 = new Object();
      HashMap<String, Map<Integer, String>> hashMap0 = new HashMap<String, Map<Integer, String>>();
      HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
      hashMap0.put("", hashMap1);
      DoubleKeyMap<String, Integer, String> doubleKeyMap1 = new DoubleKeyMap<String, Integer, String>();
      Map<Integer, String> map0 = hashMap0.putIfAbsent("", hashMap1);
      Map<Object, Object> map1 = doubleKeyMap1.newMap();
      doubleKeyMap0.put(object0, object0, (Object) map1);
      Object object1 = new Object();
      doubleKeyMap0.remove(object0, (Object) hashMap0);
      doubleKeyMap1.newMap();
      doubleKeyMap0.put((Object) hashMap1, (Object) map0, (Object) "");
      Object object2 = new Object();
      doubleKeyMap0.remove((Object) map0, (Object) hashMap1);
      DoubleKeyMap<Object, Object, String> doubleKeyMap2 = new DoubleKeyMap<Object, Object, String>();
      DoubleKeyMap<Object, Object, String> doubleKeyMap3 = new DoubleKeyMap<Object, Object, String>();
      Map<Object, Map<String, Object>> map2 = doubleKeyMap3.newMap();
      Object object3 = new Object();
      Object object4 = doubleKeyMap0.remove((Object) map2, object1);
      assertNull(object4);
  }
}