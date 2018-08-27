/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 06:34:43 GMT 2018
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
      DoubleKeyMap<Integer, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Integer, Integer, String>(class0);
      Integer integer0 = new Integer(0);
      Map<Integer, String> map0 = doubleKeyMap0.remove(integer0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>(class0);
      doubleKeyMap0.get("", (Object) "");
      DoubleKeyMap<String, Integer, String> doubleKeyMap1 = new DoubleKeyMap<String, Integer, String>();
      HashMap<Object, Map<String, String>> hashMap0 = new HashMap<Object, Map<String, String>>();
      DoubleKeyMap<Object, String, String> doubleKeyMap2 = new DoubleKeyMap<Object, String, String>(hashMap0);
      String string0 = doubleKeyMap2.put((Object) " P~!UH A3Yw~h<", "YVY==6>RLBfVEOCQ6", " P~!UH A3Yw~h<");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>(hashMap0);
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Integer) null, (Map<Object, Object>) hashMap1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>();
      Object object0 = new Object();
      doubleKeyMap0.put("", object0, (Object) null);
      Object object1 = new Object();
      doubleKeyMap0.put("", (Object) null, object1);
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>();
      doubleKeyMap1.remove((Object) doubleKeyMap1);
      HashMap<Map<Integer, Integer>, Map<String, Object>> hashMap0 = new HashMap<Map<Integer, Integer>, Map<String, Object>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<Integer, Integer>, String, Object> doubleKeyMap2 = new DoubleKeyMap<Map<Integer, Integer>, String, Object>(hashMap0, class0);
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      doubleKeyMap2.remove((Map<Integer, Integer>) hashMap1);
      DoubleKeyMap<Map<Integer, Integer>, Integer, Object> doubleKeyMap3 = new DoubleKeyMap<Map<Integer, Integer>, Integer, Object>();
      Integer integer0 = new Integer(0);
      Object object2 = doubleKeyMap3.get((Map<Integer, Integer>) hashMap1, integer0);
      assertNull(object2);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DoubleKeyMap<String, String, Object> doubleKeyMap0 = new DoubleKeyMap<String, String, Object>();
      Map<String, Map<String, Object>> map0 = doubleKeyMap0.newMap();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, String, Object> doubleKeyMap1 = new DoubleKeyMap<String, String, Object>(map0, class0);
      Map<String, Map<String, Object>> map1 = doubleKeyMap1.newMap();
      DoubleKeyMap<String, String, Object> doubleKeyMap2 = new DoubleKeyMap<String, String, Object>(map1, class0);
      doubleKeyMap1.remove("", "FOOLodYw6>Jka+2");
      Integer integer0 = new Integer((-41));
      Integer integer1 = new Integer((-366));
      Map<Object, Map<Object, String>> map2 = doubleKeyMap2.newMap();
      DoubleKeyMap<Object, Object, String> doubleKeyMap3 = new DoubleKeyMap<Object, Object, String>(map2);
      Object object0 = new Object();
      doubleKeyMap3.get((Object) doubleKeyMap1, object0);
      Map<String, Map<Object, Integer>> map3 = doubleKeyMap3.newMap();
      DoubleKeyMap<String, Object, Integer> doubleKeyMap4 = new DoubleKeyMap<String, Object, Integer>(map3);
      Integer integer2 = new Integer((-366));
      doubleKeyMap4.put((String) null, (Object) null, integer2);
      doubleKeyMap4.remove((String) null, (Object) doubleKeyMap0);
      doubleKeyMap4.remove((String) null, (Object) null);
      DoubleKeyMap<Object, String, String> doubleKeyMap5 = new DoubleKeyMap<Object, String, String>();
      Integer integer3 = new Integer(1059);
      doubleKeyMap5.remove((Object) doubleKeyMap4);
      DoubleKeyMap<String, Object, String> doubleKeyMap6 = new DoubleKeyMap<String, Object, String>();
      doubleKeyMap6.remove("");
      DoubleKeyMap<String, Integer, Object> doubleKeyMap7 = new DoubleKeyMap<String, Integer, Object>();
      Map<Integer, Object> map4 = doubleKeyMap7.get("");
      assertNull(map4);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>();
      Object object0 = new Object();
      Object object1 = new Object();
      Object object2 = new Object();
      doubleKeyMap0.put("", object1, object2);
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>();
      doubleKeyMap1.remove((Object) doubleKeyMap1);
      HashMap<Map<Integer, Integer>, Map<String, Object>> hashMap0 = new HashMap<Map<Integer, Integer>, Map<String, Object>>();
      DoubleKeyMap<Map<Integer, Integer>, String, Object> doubleKeyMap2 = new DoubleKeyMap<Map<Integer, Integer>, String, Object>();
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      doubleKeyMap2.remove((Map<Integer, Integer>) hashMap1);
      DoubleKeyMap<Map<Integer, Integer>, Integer, Object> doubleKeyMap3 = new DoubleKeyMap<Map<Integer, Integer>, Integer, Object>();
      Integer integer0 = new Integer(48);
      doubleKeyMap3.put((Map<Integer, Integer>) hashMap1, integer0, (Object) null);
      Integer integer1 = new Integer(0);
      doubleKeyMap3.get((Map<Integer, Integer>) hashMap1, integer1);
      Integer integer2 = new Integer(0);
      doubleKeyMap0.put((String) null, (Object) "", (Object) integer2);
      doubleKeyMap0.remove("'w@g");
      DoubleKeyMap<String, Object, String> doubleKeyMap4 = new DoubleKeyMap<String, Object, String>();
      String string0 = doubleKeyMap4.get("sJlEN=BN U", (Object) null);
      assertNull(string0);
  }
}