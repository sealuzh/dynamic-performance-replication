/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 12:33:08 GMT 2018
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
      DoubleKeyMap<Object, Object, String> doubleKeyMap0 = new DoubleKeyMap<Object, Object, String>(class0);
      Object object0 = new Object();
      doubleKeyMap0.put(object0, object0, "KY~2GeAybjJi;^:cw:`");
      HashMap<Integer, Map<Object, Object>> hashMap0 = new HashMap<Integer, Map<Object, Object>>();
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, Object>(hashMap0);
      Integer integer0 = new Integer(0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      // Undeclared exception!
      try { 
        doubleKeyMap1.put(integer0, (Map<Object, Object>) hashMap1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<Object, Map<Object, Object>> hashMap0 = new HashMap<Object, Map<Object, Object>>();
      Class<HashMap> class0 = HashMap.class;
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>(4260);
      hashMap0.put(class0, hashMap1);
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>(hashMap0, class0);
      doubleKeyMap0.get((Object) hashMap0);
      DoubleKeyMap<String, String, Object> doubleKeyMap1 = new DoubleKeyMap<String, String, Object>(class0);
      doubleKeyMap1.newMap();
      DoubleKeyMap<Integer, Map<Integer, Integer>, String> doubleKeyMap2 = new DoubleKeyMap<Integer, Map<Integer, Integer>, String>();
      Map<Integer, Integer> map0 = doubleKeyMap2.newMap();
      DoubleKeyMap<Object, Object, Map<Integer, Integer>> doubleKeyMap3 = new DoubleKeyMap<Object, Object, Map<Integer, Integer>>();
      Object object0 = new Object();
      Object object1 = new Object();
      doubleKeyMap3.put(object0, object1, map0);
      Object object2 = new Object();
      Object object3 = new Object();
      Object object4 = new Object();
      doubleKeyMap3.remove((Object) doubleKeyMap2, (Object) doubleKeyMap1);
      HashMap<Integer, Integer> hashMap2 = new HashMap<Integer, Integer>();
      Object object5 = new Object();
      doubleKeyMap3.put(object0, object5, (Map<Integer, Integer>) null);
      Object object6 = new Object();
      HashMap<Object, Map<String, String>> hashMap3 = new HashMap<Object, Map<String, String>>();
      DoubleKeyMap<Object, String, String> doubleKeyMap4 = new DoubleKeyMap<Object, String, String>(hashMap3, class0);
      Object object7 = new Object();
      DoubleKeyMap<Object, String, String> doubleKeyMap5 = new DoubleKeyMap<Object, String, String>();
      doubleKeyMap4.get((Object) doubleKeyMap2, "");
      Class<HashMap> class1 = HashMap.class;
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap6 = new DoubleKeyMap<Integer, Object, Object>(class1);
      Integer integer0 = new Integer(93);
      DoubleKeyMap<Object, Object, Object> doubleKeyMap7 = new DoubleKeyMap<Object, Object, Object>();
      doubleKeyMap7.get((Object) null);
      Integer integer1 = new Integer(0);
      // Undeclared exception!
      try { 
        doubleKeyMap6.put(integer1, (Map<Object, Object>) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>();
      doubleKeyMap0.newMap();
      Object object0 = new Object();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      doubleKeyMap1.put((Object) doubleKeyMap0, "th2lqQ>zd;NNy", (Object) "th2lqQ>zd;NNy");
      String string0 = "";
      doubleKeyMap1.get((Object) doubleKeyMap0, "");
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap2 = new DoubleKeyMap<Object, Integer, Object>();
      int int0 = 0;
      Integer integer0 = new Integer(0);
      doubleKeyMap2.put((Object) null, integer0, (Object) doubleKeyMap1);
      Object object1 = new Object();
      Integer integer1 = new Integer(0);
      doubleKeyMap2.remove((Object) null, integer0);
      DoubleKeyMap<Object, Object, String> doubleKeyMap3 = new DoubleKeyMap<Object, Object, String>((Map<Object, Map<Object, String>>) null);
      doubleKeyMap3.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Integer, String, Object> doubleKeyMap4 = null;
      try {
        doubleKeyMap4 = new DoubleKeyMap<Integer, String, Object>(class0);
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
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>();
      Object object0 = new Object();
      doubleKeyMap0.remove(object0);
      doubleKeyMap1.put((Object) doubleKeyMap0, "th2lqQ>zd;NNy", (Object) "th2lqQ>zd;NNy");
      Object object1 = new Object();
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap2 = new DoubleKeyMap<Object, Integer, Object>();
      Integer integer0 = new Integer(0);
      doubleKeyMap2.put((Object) null, integer0, (Object) doubleKeyMap1);
      Object object2 = new Object();
      Integer integer1 = new Integer((-788));
      doubleKeyMap2.remove(object2, integer1);
      Integer integer2 = new Integer((-1383));
      doubleKeyMap2.remove((Object) null, integer2);
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap3 = new DoubleKeyMap<Integer, Object, Object>();
      Map<Object, Map<Object, String>> map0 = doubleKeyMap3.newMap();
      DoubleKeyMap<Object, Object, String> doubleKeyMap4 = new DoubleKeyMap<Object, Object, String>(map0);
      doubleKeyMap4.newMap();
      doubleKeyMap4.remove(object1);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, Map<Integer, Integer>> doubleKeyMap5 = null;
      try {
        doubleKeyMap5 = new DoubleKeyMap<Object, String, Map<Integer, Integer>>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }
}