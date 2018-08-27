/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 22:07:09 GMT 2018
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
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>();
      DoubleKeyMap<String, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<String, Object, Integer>();
      Integer integer0 = doubleKeyMap1.get("Q6-I0TS;:;2W;ZpS~", (Object) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoubleKeyMap<Object, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, String>();
      HashMap<String, Map<Object, String>> hashMap0 = new HashMap<String, Map<Object, String>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, String> doubleKeyMap1 = new DoubleKeyMap<String, Object, String>(hashMap0, class0);
      HashMap<Integer, Map<Object, Integer>> hashMap1 = new HashMap<Integer, Map<Object, Integer>>();
      HashMap<Object, String> hashMap2 = new HashMap<Object, String>();
      hashMap0.put("", hashMap2);
      DoubleKeyMap<Integer, Object, Integer> doubleKeyMap2 = new DoubleKeyMap<Integer, Object, Integer>(hashMap1);
      Object object0 = new Object();
      String string0 = doubleKeyMap1.get("", (Object) doubleKeyMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Object, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, String>(class0);
      Integer integer0 = new Integer((-1));
      doubleKeyMap0.remove(integer0, (Object) class0);
      HashMap<String, Map<Object, Object>> hashMap0 = new HashMap<String, Map<Object, Object>>();
      Object object0 = new Object();
      DoubleKeyMap<Integer, Integer, String> doubleKeyMap1 = new DoubleKeyMap<Integer, Integer, String>();
      Integer integer1 = new Integer((-738));
      doubleKeyMap1.put(integer0, integer1, (String) null);
      Integer integer2 = new Integer((-1));
      doubleKeyMap1.put(integer2, integer2, (String) null);
      DoubleKeyMap<Object, String, String> doubleKeyMap2 = new DoubleKeyMap<Object, String, String>();
      Integer integer3 = new Integer(0);
      String string0 = doubleKeyMap2.remove((Object) integer3, "t}5{pR");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<String, Map<Object, Object>> hashMap0 = new HashMap<String, Map<Object, Object>>();
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>(hashMap0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      doubleKeyMap0.put("", (Object) "f@kHnAK~EOk^U{x", (Object) hashMap1);
      Object object0 = new Object();
      doubleKeyMap0.remove("", object0);
      Integer integer0 = new Integer(3352);
      Object object1 = new Object();
      assertFalse(object1.equals((Object)object0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashMap<String, Map<Object, Object>> hashMap0 = new HashMap<String, Map<Object, Object>>();
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>(hashMap0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      doubleKeyMap0.put("", (Object) "", (Object) null);
      Object object0 = new Object();
      doubleKeyMap0.remove("", (Object) "");
      DoubleKeyMap<String, String, String> doubleKeyMap1 = new DoubleKeyMap<String, String, String>();
      Object object1 = new Object();
      Integer integer0 = new Integer((-410));
      DoubleKeyMap<String, Integer, Object> doubleKeyMap2 = new DoubleKeyMap<String, Integer, Object>((Map<String, Map<Integer, Object>>) null);
      DoubleKeyMap<String, Integer, Object> doubleKeyMap3 = new DoubleKeyMap<String, Integer, Object>();
      doubleKeyMap3.newMap();
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap4 = new DoubleKeyMap<Object, Integer, Object>();
      Map<String, Map<Integer, Object>> map0 = doubleKeyMap4.newMap();
      DoubleKeyMap<String, Integer, Object> doubleKeyMap5 = new DoubleKeyMap<String, Integer, Object>(map0);
      doubleKeyMap5.newMap();
      HashMap<Map<String, Object>, Map<String, String>> hashMap2 = new HashMap<Map<String, Object>, Map<String, String>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<String, Object>, String, String> doubleKeyMap6 = new DoubleKeyMap<Map<String, Object>, String, String>(hashMap2, class0);
      HashMap<String, Object> hashMap3 = new HashMap<String, Object>();
      HashMap<String, String> hashMap4 = new HashMap<String, String>();
      DoubleKeyMap<String, Object, Integer> doubleKeyMap7 = new DoubleKeyMap<String, Object, Integer>();
      DoubleKeyMap<String, Object, Integer> doubleKeyMap8 = new DoubleKeyMap<String, Object, Integer>();
      Map<Object, Integer> map1 = new HashMap<Object, Integer>();
      Object object2 = new Object();
      doubleKeyMap7.remove("");
      DoubleKeyMap<Object, Object, Object> doubleKeyMap9 = new DoubleKeyMap<Object, Object, Object>();
      HashMap<Object, Object> hashMap5 = new HashMap<Object, Object>();
      // Undeclared exception!
      try { 
        doubleKeyMap9.put((Object) "", (Map<Object, Object>) hashMap5);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
