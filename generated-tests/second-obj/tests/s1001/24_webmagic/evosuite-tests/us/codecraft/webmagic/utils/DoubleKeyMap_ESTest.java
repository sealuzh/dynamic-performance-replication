/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 16:21:06 GMT 2018
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
      HashMap<Object, Map<Integer, Integer>> hashMap0 = new HashMap<Object, Map<Integer, Integer>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>(hashMap0, class0);
      HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
      Integer integer0 = new Integer(1);
      Integer integer1 = doubleKeyMap0.get((Object) hashMap1, integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoubleKeyMap<String, String, Object> doubleKeyMap0 = new DoubleKeyMap<String, String, Object>();
      Map<Object, Map<Object, Object>> map0 = doubleKeyMap0.newMap();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>(map0, class0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        doubleKeyMap1.put(object0, (Map<Object, Object>) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, Map<Object, Object>> hashMap0 = new HashMap<String, Map<Object, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>(hashMap0, class0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      String string0 = "";
      hashMap0.put("", hashMap1);
      String string1 = "";
      int int0 = (-1);
      Integer integer0 = new Integer(0);
      doubleKeyMap0.get("", (Object) "");
      Class<Map> class1 = Map.class;
      DoubleKeyMap<Object, String, Integer> doubleKeyMap1 = null;
      try {
        doubleKeyMap1 = new DoubleKeyMap<Object, String, Integer>(class1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>();
      doubleKeyMap0.newMap();
      doubleKeyMap0.put((String) null, (Object) null, (String) null);
      doubleKeyMap0.remove((String) null, (Object) null);
      doubleKeyMap0.remove((String) null);
      Integer integer0 = new Integer(0);
      doubleKeyMap0.remove("", (Object) integer0);
      doubleKeyMap0.remove((String) null);
      HashMap<Integer, Map<Object, String>> hashMap0 = new HashMap<Integer, Map<Object, String>>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Object, String> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, String>(hashMap0, class0);
      hashMap0.clear();
      Integer integer1 = new Integer(848);
      doubleKeyMap1.put(integer1, (Object) hashMap0, (String) null);
      Integer integer2 = new Integer(0);
      doubleKeyMap1.put(integer1, (Object) integer1, "us.codecraft.webmagic.utils.MultiKeyMapBase");
      DoubleKeyMap<String, Object, String> doubleKeyMap2 = new DoubleKeyMap<String, Object, String>();
      doubleKeyMap1.newMap();
      Class<Map> class1 = Map.class;
      DoubleKeyMap<String, Object, Integer> doubleKeyMap3 = null;
      try {
        doubleKeyMap3 = new DoubleKeyMap<String, Object, Integer>(class1);
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
      HashMap<String, Map<Object, Object>> hashMap0 = new HashMap<String, Map<Object, Object>>();
      Integer integer0 = new Integer((-1));
      HashMap<Object, Map<String, Object>> hashMap1 = new HashMap<Object, Map<String, Object>>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(hashMap1);
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, String, Object> doubleKeyMap1 = new DoubleKeyMap<String, String, Object>(class0);
      doubleKeyMap1.put("", "", (Object) "");
      doubleKeyMap1.newMap();
      doubleKeyMap1.put("", "E+s:cq", (Object) "q{RJ");
      DoubleKeyMap<String, String, Integer> doubleKeyMap2 = new DoubleKeyMap<String, String, Integer>();
      Map<Integer, Map<Object, String>> map0 = doubleKeyMap2.newMap();
      doubleKeyMap1.remove("", "us.codecraft.webmagic.utils.MultiKeyMapBase");
      DoubleKeyMap<Integer, Object, String> doubleKeyMap3 = new DoubleKeyMap<Integer, Object, String>(map0, class0);
      Integer integer1 = new Integer((-1));
      Integer integer2 = new Integer((-1));
      DoubleKeyMap<Integer, Object, String> doubleKeyMap4 = new DoubleKeyMap<Integer, Object, String>();
      Integer integer3 = new Integer((-1));
      doubleKeyMap4.put(integer3, (Object) hashMap0, "y1sCRT8[");
      DoubleKeyMap<String, Object, String> doubleKeyMap5 = new DoubleKeyMap<String, Object, String>();
      doubleKeyMap3.newMap();
      doubleKeyMap1.put("", "E+s:cq", (Object) null);
      doubleKeyMap5.newMap();
      HashMap<Object, Map<Object, Integer>> hashMap2 = new HashMap<Object, Map<Object, Integer>>();
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap6 = new DoubleKeyMap<Object, Object, Integer>(hashMap2);
      Map<Object, Integer> map1 = doubleKeyMap6.remove((Object) class0);
      assertNull(map1);
  }
}
