/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 15:49:57 GMT 2018
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
      HashMap<Object, Map<Object, Object>> hashMap0 = new HashMap<Object, Map<Object, Object>>();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>();
      Object object0 = doubleKeyMap0.get((Object) hashMap0, (Object) "");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>();
      Integer integer0 = new Integer((-1));
      doubleKeyMap0.remove(integer0);
      DoubleKeyMap<String, Map<Integer, Integer>, String> doubleKeyMap1 = new DoubleKeyMap<String, Map<Integer, Integer>, String>();
      HashMap<Map<Integer, Integer>, String> hashMap0 = new HashMap<Map<Integer, Integer>, String>();
      // Undeclared exception!
      try { 
        doubleKeyMap1.put("ZTpxuNA4q@<D~=", (Map<Map<Integer, Integer>, String>) hashMap0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object object0 = new Object();
      HashMap<Object, Map<Integer, Integer>> hashMap0 = new HashMap<Object, Map<Integer, Integer>>();
      Class<HashMap> class0 = HashMap.class;
      Integer integer0 = new Integer((-1164));
      DoubleKeyMap<Object, Integer, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Integer>();
      doubleKeyMap0.get(object0);
      DoubleKeyMap<String, Object, String> doubleKeyMap1 = new DoubleKeyMap<String, Object, String>(class0);
      doubleKeyMap1.put("wron proto type map ", (Object) "wron proto type map ", "");
      Object object1 = new Object();
      doubleKeyMap1.remove("wrong proto type map ", object1);
      doubleKeyMap1.put("wron proto type map ", (Object) null, "");
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      Object object2 = new Object();
      assertFalse(object2.equals((Object)object1));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<Object, Map<Object, Object>> hashMap0 = new HashMap<Object, Map<Object, Object>>();
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>();
      Object object0 = new Object();
      Object object1 = new Object();
      DoubleKeyMap<Integer, Integer, Integer> doubleKeyMap1 = new DoubleKeyMap<Integer, Integer, Integer>();
      Map<Map<Integer, Integer>, Map<Object, Object>> map0 = doubleKeyMap1.newMap();
      DoubleKeyMap<Map<Integer, Integer>, Object, Object> doubleKeyMap2 = new DoubleKeyMap<Map<Integer, Integer>, Object, Object>(map0);
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      doubleKeyMap2.get((Map<Integer, Integer>) hashMap1);
      hashMap0.put(object1, (Map<Object, Object>) null);
      doubleKeyMap0.put((Object) hashMap0, object0, (Object) "#");
      Object object2 = doubleKeyMap0.get((Object) hashMap0, (Object) "");
      assertNull(object2);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>(class0);
      doubleKeyMap0.newMap();
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>();
      doubleKeyMap1.newMap();
      doubleKeyMap0.put((Object) doubleKeyMap1, "w0#YaISck:rH+", "w0#YaISck:rH+");
      doubleKeyMap0.remove((Object) doubleKeyMap1, "w0#YaISck:rH+");
      doubleKeyMap1.newMap();
      HashMap<Object, Map<Object, String>> hashMap0 = new HashMap<Object, Map<Object, String>>();
      Object object0 = new Object();
      DoubleKeyMap<Object, Object, String> doubleKeyMap2 = new DoubleKeyMap<Object, Object, String>(hashMap0, class0);
      Object object1 = new Object();
      assertFalse(object1.equals((Object)object0));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>(class0);
      doubleKeyMap0.newMap();
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>();
      doubleKeyMap1.newMap();
      doubleKeyMap0.put((Object) doubleKeyMap1, "KaB@Ad'IEXm.", "w0#YaISck:rH+");
      doubleKeyMap0.remove((Object) doubleKeyMap1, "w0#YaISck:rH+");
      doubleKeyMap1.newMap();
      HashMap<Object, Map<Object, String>> hashMap0 = new HashMap<Object, Map<Object, String>>();
      Object object0 = new Object();
      DoubleKeyMap<Object, Object, String> doubleKeyMap2 = new DoubleKeyMap<Object, Object, String>(hashMap0);
      Object object1 = new Object();
      Class<Map> class1 = Map.class;
      DoubleKeyMap<String, Map<Integer, Integer>, Integer> doubleKeyMap3 = null;
      try {
        doubleKeyMap3 = new DoubleKeyMap<String, Map<Integer, Integer>, Integer>(class1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }
}