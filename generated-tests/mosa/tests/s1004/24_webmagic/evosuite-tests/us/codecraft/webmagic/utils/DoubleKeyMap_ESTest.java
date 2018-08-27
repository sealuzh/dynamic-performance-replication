/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 20:01:11 GMT 2018
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
      Integer integer0 = new Integer((-1019));
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>();
      doubleKeyMap0.get((String) null, integer0);
      HashMap<Object, Map<Map<Object, Integer>, Object>> hashMap0 = new HashMap<Object, Map<Map<Object, Integer>, Object>>();
      DoubleKeyMap<Object, Map<Object, Integer>, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Map<Object, Integer>, Object>(hashMap0);
      Map<Map<Object, Integer>, Object> map0 = doubleKeyMap1.newMap();
      // Undeclared exception!
      try { 
        doubleKeyMap1.put((Object) null, map0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>();
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Integer>();
      Object object0 = new Object();
      doubleKeyMap1.get(object0, (Object) doubleKeyMap0);
      DoubleKeyMap<Object, String, Integer> doubleKeyMap2 = new DoubleKeyMap<Object, String, Integer>(class0);
      DoubleKeyMap<String, Object, Object> doubleKeyMap3 = new DoubleKeyMap<String, Object, Object>();
      doubleKeyMap3.remove((String) null);
      DoubleKeyMap<String, String, Object> doubleKeyMap4 = new DoubleKeyMap<String, String, Object>();
      doubleKeyMap4.put("", "", (Object) "");
      HashMap<Integer, Map<Object, Integer>> hashMap0 = new HashMap<Integer, Map<Object, Integer>>();
      DoubleKeyMap<Integer, Object, Integer> doubleKeyMap5 = new DoubleKeyMap<Integer, Object, Integer>();
      HashMap<String, Map<String, Object>> hashMap1 = new HashMap<String, Map<String, Object>>();
      DoubleKeyMap<String, String, Object> doubleKeyMap6 = new DoubleKeyMap<String, String, Object>(hashMap1);
      doubleKeyMap6.remove("", "T[Q%f2zQXSL}5");
      Object object1 = new Object();
      Object object2 = doubleKeyMap4.put("", "", (Object) doubleKeyMap1);
      assertEquals("", object2);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>();
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Integer>();
      Object object0 = new Object();
      doubleKeyMap1.get(object0, (Object) doubleKeyMap0);
      DoubleKeyMap<String, Object, Object> doubleKeyMap2 = new DoubleKeyMap<String, Object, Object>();
      doubleKeyMap2.remove((String) null, (Object) null);
      HashMap<Object, Map<String, String>> hashMap0 = new HashMap<Object, Map<String, String>>();
      DoubleKeyMap<Object, Object, Map<Object, Integer>> doubleKeyMap3 = new DoubleKeyMap<Object, Object, Map<Object, Integer>>(class0);
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      hashMap0.put((Object) null, hashMap1);
      DoubleKeyMap<Object, String, String> doubleKeyMap4 = new DoubleKeyMap<Object, String, String>(hashMap0, class0);
      doubleKeyMap4.remove((Object) null, "}m$TR= 'R^KTHH");
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer(0);
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>();
      doubleKeyMap0.put("", integer0, (Object) integer0);
      Object object0 = doubleKeyMap0.get("", integer0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>();
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Integer>();
      Object object0 = new Object();
      Object object1 = new Object();
      doubleKeyMap1.get(object1, (Object) null);
      DoubleKeyMap<Object, String, Integer> doubleKeyMap2 = new DoubleKeyMap<Object, String, Integer>(class0);
      DoubleKeyMap<String, Object, Object> doubleKeyMap3 = new DoubleKeyMap<String, Object, Object>();
      doubleKeyMap3.remove((String) null, (Object) null);
      HashMap<Object, Map<String, String>> hashMap0 = new HashMap<Object, Map<String, String>>();
      DoubleKeyMap<Object, Object, Map<Object, Integer>> doubleKeyMap4 = new DoubleKeyMap<Object, Object, Map<Object, Integer>>(class0);
      Map<String, String> map0 = doubleKeyMap4.newMap();
      hashMap0.put((Object) null, map0);
      Object object2 = new Object();
      Integer integer0 = new Integer(1);
      doubleKeyMap3.put((String) null, object2, (Object) integer0);
      HashMap<Object, Integer> hashMap1 = new HashMap<Object, Integer>();
      doubleKeyMap3.remove((String) null, (Object) hashMap1);
      HashMap<Object, Map<String, String>> hashMap2 = new HashMap<Object, Map<String, String>>();
      Class<Map> class1 = Map.class;
      DoubleKeyMap<Object, Object, Map<Object, Integer>> doubleKeyMap5 = null;
      try {
        doubleKeyMap5 = new DoubleKeyMap<Object, Object, Map<Object, Integer>>(class1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }
}