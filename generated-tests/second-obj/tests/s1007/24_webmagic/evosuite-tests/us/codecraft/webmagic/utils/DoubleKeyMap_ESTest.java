/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 21:05:56 GMT 2018
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
      HashMap<Integer, Map<String, String>> hashMap0 = new HashMap<Integer, Map<String, String>>();
      DoubleKeyMap<Integer, String, String> doubleKeyMap0 = new DoubleKeyMap<Integer, String, String>(hashMap0);
      Integer integer0 = new Integer(12);
      doubleKeyMap0.remove(integer0, "m:(9?)uSX1");
      HashMap<Integer, Map<Object, Object>> hashMap1 = new HashMap<Integer, Map<Object, Object>>();
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, Object>();
      Integer integer1 = new Integer(12);
      Object object0 = new Object();
      Object object1 = new Object();
      assertFalse(object1.equals((Object)object0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>();
      Object object0 = new Object();
      Object object1 = new Object();
      doubleKeyMap0.remove(object0, object1);
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>(1016);
      hashMap0.putIfAbsent((Object) null, (Object) null);
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Object) null, (Map<Object, Object>) hashMap0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DoubleKeyMap<Map<String, Object>, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<Map<String, Object>, Object, Integer>();
      HashMap<Map<String, Object>, Map<Integer, Object>> hashMap0 = new HashMap<Map<String, Object>, Map<Integer, Object>>();
      DoubleKeyMap<Map<String, Object>, Integer, Object> doubleKeyMap1 = new DoubleKeyMap<Map<String, Object>, Integer, Object>(hashMap0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      Integer integer0 = new Integer(2742);
      doubleKeyMap1.put((Map<String, Object>) hashMap1, integer0, (Object) hashMap1);
      doubleKeyMap1.put((Map<String, Object>) hashMap1, integer0, (Object) doubleKeyMap0);
      DoubleKeyMap<Object, Object, String> doubleKeyMap2 = new DoubleKeyMap<Object, Object, String>();
      Map<Object, Map<Integer, Object>> map0 = doubleKeyMap2.newMap();
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap3 = new DoubleKeyMap<Object, Integer, Object>(map0);
      Map<String, Map<Integer, Object>> map1 = doubleKeyMap3.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Integer, Object> doubleKeyMap4 = new DoubleKeyMap<String, Integer, Object>(map1, class0);
      Integer integer1 = new Integer(0);
      Object object0 = doubleKeyMap4.get("6(Gg~](]%g)7(`", integer1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<Integer, Map<String, String>> hashMap0 = new HashMap<Integer, Map<String, String>>();
      DoubleKeyMap<Integer, String, String> doubleKeyMap0 = new DoubleKeyMap<Integer, String, String>(hashMap0);
      Integer integer0 = new Integer(1);
      Integer integer1 = new Integer(1);
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      hashMap0.put(integer1, hashMap1);
      String string0 = "m:(9?)uSX1";
      doubleKeyMap0.remove(integer0, "m:(9?)uSX1");
      HashMap<Integer, Map<Object, Object>> hashMap2 = new HashMap<Integer, Map<Object, Object>>();
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, Object>(hashMap2);
      Integer integer2 = new Integer(1);
      Object object0 = new Object();
      doubleKeyMap1.get(integer2, object0);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, String> doubleKeyMap2 = null;
      try {
        doubleKeyMap2 = new DoubleKeyMap<String, Object, String>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object object0 = new Object();
      HashMap<String, Map<String, Object>> hashMap0 = new HashMap<String, Map<String, Object>>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, String, Object> doubleKeyMap0 = new DoubleKeyMap<String, String, Object>();
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
      doubleKeyMap0.remove("");
      Class<HashMap> class1 = HashMap.class;
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, Object>(class1);
      Integer integer0 = new Integer((-1));
      Integer integer1 = new Integer((-1));
      Integer integer2 = new Integer((-1));
      doubleKeyMap1.put(integer2, (Object) class0, (Object) class1);
      Integer integer3 = new Integer(3002);
      doubleKeyMap1.remove(integer2, object0);
      Integer integer4 = new Integer(0);
      HashMap<Integer, Map<String, Object>> hashMap3 = new HashMap<Integer, Map<String, Object>>();
      DoubleKeyMap<Integer, Object, Map<String, Object>> doubleKeyMap2 = new DoubleKeyMap<Integer, Object, Map<String, Object>>(class1);
      DoubleKeyMap<Object, Integer, String> doubleKeyMap3 = new DoubleKeyMap<Object, Integer, String>(class1);
      HashMap<Integer, String> hashMap4 = null;
      try {
        hashMap4 = new HashMap<Integer, String>(0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal load factor: 0.0
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, Object> doubleKeyMap1 = new DoubleKeyMap<String, Object, Object>(class0);
      Map<String, Map<Object, String>> map0 = doubleKeyMap1.newMap();
      DoubleKeyMap<String, Object, String> doubleKeyMap2 = new DoubleKeyMap<String, Object, String>(map0);
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap3 = new DoubleKeyMap<Integer, Integer, Object>();
      Integer integer0 = new Integer(2490);
      Integer integer1 = new Integer(2490);
      doubleKeyMap3.get(integer0, integer1);
      Class<HashMap> class1 = HashMap.class;
      DoubleKeyMap<Object, Object, String> doubleKeyMap4 = new DoubleKeyMap<Object, Object, String>(class1);
      Map<Object, Map<Object, String>> map1 = doubleKeyMap4.newMap();
      DoubleKeyMap<Object, Object, String> doubleKeyMap5 = new DoubleKeyMap<Object, Object, String>(map1);
      HashMap<String, Map<String, Integer>> hashMap0 = new HashMap<String, Map<String, Integer>>();
      DoubleKeyMap<String, String, Integer> doubleKeyMap6 = new DoubleKeyMap<String, String, Integer>(hashMap0, class0);
      Class<HashMap> class2 = HashMap.class;
      DoubleKeyMap<Object, Integer, String> doubleKeyMap7 = new DoubleKeyMap<Object, Integer, String>(class2);
      Object object0 = new Object();
      doubleKeyMap7.get(object0);
      HashMap<String, Map<Integer, Object>> hashMap1 = new HashMap<String, Map<Integer, Object>>();
      DoubleKeyMap<Integer, String, Object> doubleKeyMap8 = new DoubleKeyMap<Integer, String, Object>((Map<Integer, Map<String, Object>>) null);
      Integer integer2 = new Integer((-361));
      doubleKeyMap8.put(integer1, "", (Object) doubleKeyMap0);
      doubleKeyMap8.get(integer1, "R");
      DoubleKeyMap<Integer, Object, Map<String, Object>> doubleKeyMap9 = new DoubleKeyMap<Integer, Object, Map<String, Object>>(class1);
      Map<Object, Map<String, Object>> map2 = doubleKeyMap4.newMap();
      Class<Map> class3 = Map.class;
      DoubleKeyMap<Object, String, Object> doubleKeyMap10 = new DoubleKeyMap<Object, String, Object>(map2, class3);
      Object object1 = new Object();
      doubleKeyMap10.remove(object1);
      DoubleKeyMap<String, Map<String, Object>, Map<String, Object>> doubleKeyMap11 = new DoubleKeyMap<String, Map<String, Object>, Map<String, Object>>();
      Map<Map<String, Object>, Map<String, Object>> map3 = doubleKeyMap11.remove("us.codecraft.webmagic.utils.MultiKeyMapBase");
      assertNull(map3);
  }
}