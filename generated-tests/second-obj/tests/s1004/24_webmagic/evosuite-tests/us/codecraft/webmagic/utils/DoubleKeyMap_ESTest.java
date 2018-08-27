/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 18:43:29 GMT 2018
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
      HashMap<String, Map<String, Integer>> hashMap0 = new HashMap<String, Map<String, Integer>>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, String, Integer> doubleKeyMap0 = new DoubleKeyMap<String, String, Integer>(hashMap0, class0);
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>();
      doubleKeyMap1.put((Object) doubleKeyMap0, (Object) doubleKeyMap0, "eCFy)?2sfb3pZq@?");
      Class<HashMap> class1 = HashMap.class;
      DoubleKeyMap<Integer, String, Object> doubleKeyMap2 = new DoubleKeyMap<Integer, String, Object>(class1);
      Class<HashMap> class2 = HashMap.class;
      DoubleKeyMap<String, Object, Integer> doubleKeyMap3 = new DoubleKeyMap<String, Object, Integer>((Map<String, Map<Object, Integer>>) null, class2);
      doubleKeyMap2.put((Integer) null, "", (Object) doubleKeyMap1);
      Map<String, Object> map0 = doubleKeyMap3.newMap();
      // Undeclared exception!
      try { 
        doubleKeyMap2.put((Integer) null, map0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>();
      String string0 = "GD-zJ\\mJ4i}UTS:M\"L";
      doubleKeyMap0.remove("GD-zJmJ4i}UTS:M\"L", (Object) "GD-zJmJ4i}UTS:M\"L");
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap1 = null;
      try {
        doubleKeyMap1 = new DoubleKeyMap<Integer, Integer, Integer>(class0);
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
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>();
      doubleKeyMap0.put("", (Object) "", (Object) "");
      doubleKeyMap0.newMap();
      doubleKeyMap0.put("", (Object) null, (Object) null);
      Object object0 = new Object();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>(class0);
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Integer>();
      Object object0 = new Object();
      doubleKeyMap1.get(object0, (Object) doubleKeyMap0);
      DoubleKeyMap<Object, String, Integer> doubleKeyMap2 = new DoubleKeyMap<Object, String, Integer>(class0);
      doubleKeyMap2.remove((Object) ". PJf+Bm&`;\"");
      HashMap<String, Map<Object, Object>> hashMap0 = new HashMap<String, Map<Object, Object>>();
      DoubleKeyMap<String, Object, Object> doubleKeyMap3 = new DoubleKeyMap<String, Object, Object>(hashMap0);
      doubleKeyMap3.newMap();
      Object object1 = new Object();
      Integer integer0 = new Integer(1);
      doubleKeyMap3.put(". PJf+Bm&`;\"", (Object) integer0, (Object) doubleKeyMap2);
      doubleKeyMap3.get(". PJf+Bm&`;\"", (Object) null);
      Class<Map> class1 = Map.class;
      DoubleKeyMap<Integer, String, Object> doubleKeyMap4 = null;
      try {
        doubleKeyMap4 = new DoubleKeyMap<Integer, String, Object>(class1);
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
      DoubleKeyMap<Integer, String, String> doubleKeyMap0 = new DoubleKeyMap<Integer, String, String>();
      doubleKeyMap0.newMap();
      Class<Map> class0 = Map.class;
      Integer integer0 = new Integer((-281));
      HashMap<Integer, Map<Object, String>> hashMap0 = new HashMap<Integer, Map<Object, String>>();
      Integer integer1 = new Integer((-281));
      HashMap<Object, Map<Object, Integer>> hashMap1 = new HashMap<Object, Map<Object, Integer>>();
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Integer>(hashMap1);
      Map<Object, String> map0 = doubleKeyMap1.newMap();
      Integer integer2 = new Integer((-281));
      hashMap0.put(integer2, map0);
      DoubleKeyMap<Integer, Object, String> doubleKeyMap2 = new DoubleKeyMap<Integer, Object, String>(hashMap0, class0);
      doubleKeyMap2.remove(integer1, (Object) hashMap0);
      Class<Map> class1 = Map.class;
      DoubleKeyMap<String, String, Object> doubleKeyMap3 = null;
      try {
        doubleKeyMap3 = new DoubleKeyMap<String, String, Object>(class1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>();
      Integer integer0 = new Integer((-1918));
      doubleKeyMap0.put("", integer0, (Object) "");
      String string0 = "";
      doubleKeyMap0.remove("", (Integer) null);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, Object> doubleKeyMap1 = null;
      try {
        doubleKeyMap1 = new DoubleKeyMap<String, Object, Object>((Map<String, Map<Object, Object>>) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }
}