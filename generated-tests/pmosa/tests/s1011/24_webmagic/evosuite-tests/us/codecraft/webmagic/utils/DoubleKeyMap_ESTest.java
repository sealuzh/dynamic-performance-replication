/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 21:07:28 GMT 2018
 */

package us.codecraft.webmagic.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.utils.DoubleKeyMap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DoubleKeyMap_ESTest extends DoubleKeyMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, Map<String, String>> hashMap0 = new HashMap<String, Map<String, String>>();
      DoubleKeyMap<String, String, String> doubleKeyMap0 = new DoubleKeyMap<String, String, String>(hashMap0);
      HashMap<Object, Map<Object, Object>> hashMap1 = new HashMap<Object, Map<Object, Object>>(1153, 665.74F);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>(hashMap1, class0);
      HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
      // Undeclared exception!
      try { 
        doubleKeyMap1.put((Object) hashMap0, (Map<Object, Object>) hashMap2);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      doubleKeyMap0.put((Object) null, "", (Object) class0);
      Object object0 = new Object();
      HashMap<Object, Map<Object, Object>> hashMap1 = new HashMap<Object, Map<Object, Object>>();
      BiFunction<Object, String, String> biFunction0 = (BiFunction<Object, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn(" mla6").when(biFunction0).apply(any() , anyString());
      hashMap0.compute("", biFunction0);
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>(hashMap1);
      doubleKeyMap1.remove((Object) class0);
      HashMap<Object, Map<Integer, Object>> hashMap2 = new HashMap<Object, Map<Integer, Object>>();
      DoubleKeyMap<Object, Object, Map<String, String>> doubleKeyMap2 = new DoubleKeyMap<Object, Object, Map<String, String>>();
      int int0 = 2762;
      Integer integer0 = new Integer(2762);
      doubleKeyMap2.put((Object) integer0, (Object) hashMap2, (Map<String, String>) null);
      Object object1 = new Object();
      doubleKeyMap2.remove((Object) integer0, object1);
      DoubleKeyMap<Object, Object, String> doubleKeyMap3 = null;
      try {
        doubleKeyMap3 = new DoubleKeyMap<Object, Object, String>(class0);
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
      DoubleKeyMap<Map<String, String>, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Map<String, String>, Integer, String>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      Integer integer0 = new Integer(0);
      doubleKeyMap0.remove((Map<String, String>) hashMap0, integer0);
      DoubleKeyMap<Object, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, String, Integer>();
      Map<String, String> map0 = doubleKeyMap1.newMap();
      doubleKeyMap0.get(map0);
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap2 = new DoubleKeyMap<Integer, Integer, Object>();
      Integer integer1 = new Integer(1099);
      Integer integer2 = new Integer(0);
      Object object0 = new Object();
      doubleKeyMap2.put(integer1, integer2, object0);
      DoubleKeyMap<Object, Object, String> doubleKeyMap3 = new DoubleKeyMap<Object, Object, String>();
      doubleKeyMap3.get((Object) doubleKeyMap1);
      HashMap<Integer, Map<Object, Object>> hashMap1 = new HashMap<Integer, Map<Object, Object>>();
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap4 = new DoubleKeyMap<Integer, Object, Object>(hashMap1);
      Object object1 = new Object();
      Integer integer3 = new Integer(1099);
      DoubleKeyMap<String, Map<String, String>, Object> doubleKeyMap5 = new DoubleKeyMap<String, Map<String, String>, Object>((Map<String, Map<Map<String, String>, Object>>) null);
      Map<String, Map<Integer, Object>> map1 = doubleKeyMap5.newMap();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Integer, Object> doubleKeyMap6 = new DoubleKeyMap<String, Integer, Object>(map1, class0);
      Integer integer4 = new Integer(0);
      doubleKeyMap6.get("r/^,,q", integer4);
      Map<Object, Map<String, Object>> map2 = doubleKeyMap3.newMap();
      DoubleKeyMap<Object, String, Object> doubleKeyMap7 = new DoubleKeyMap<Object, String, Object>(map2);
      doubleKeyMap7.put((Object) null, (String) null, (Object) "r/^,,q");
      Integer integer5 = new Integer(1099);
      Object object2 = doubleKeyMap2.remove(integer5, integer2);
      assertNotSame(object2, object1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      doubleKeyMap0.put((Object) null, "", (Object) class0);
      Object object0 = new Object();
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      HashMap<Object, Map<Object, Object>> hashMap2 = new HashMap<Object, Map<Object, Object>>();
      hashMap2.put(hashMap0, hashMap1);
      BiFunction<Object, String, String> biFunction0 = (BiFunction<Object, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , anyString());
      hashMap0.compute("", biFunction0);
      DoubleKeyMap<Object, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Object>(hashMap2);
      doubleKeyMap1.remove((Object) class0);
      HashMap<Object, Map<Integer, Object>> hashMap3 = new HashMap<Object, Map<Integer, Object>>();
      DoubleKeyMap<Object, Object, Map<String, String>> doubleKeyMap2 = new DoubleKeyMap<Object, Object, Map<String, String>>();
      int int0 = 2762;
      Integer integer0 = new Integer(2762);
      doubleKeyMap2.put((Object) integer0, (Object) hashMap3, (Map<String, String>) null);
      Object object1 = new Object();
      doubleKeyMap2.remove((Object) integer0, object1);
      Class<Map> class1 = Map.class;
      DoubleKeyMap<Object, Object, String> doubleKeyMap3 = null;
      try {
        doubleKeyMap3 = new DoubleKeyMap<Object, Object, String>(class1);
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
      DoubleKeyMap<Map<String, String>, Map<String, String>, String> doubleKeyMap0 = new DoubleKeyMap<Map<String, String>, Map<String, String>, String>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      doubleKeyMap0.put((Map<String, String>) hashMap0, (Map<String, String>) hashMap0, "}-!Y");
      DoubleKeyMap<String, Integer, Object> doubleKeyMap1 = new DoubleKeyMap<String, Integer, Object>();
      Integer integer0 = new Integer(0);
      doubleKeyMap1.get((String) null, integer0);
      HashMap<Object, Map<String, Object>> hashMap1 = new HashMap<Object, Map<String, Object>>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap2 = new DoubleKeyMap<Object, String, Object>(hashMap1);
      DoubleKeyMap<Object, String, Integer> doubleKeyMap3 = new DoubleKeyMap<Object, String, Integer>();
      Map<Integer, String> map0 = doubleKeyMap3.newMap();
      Object object0 = new Object();
      doubleKeyMap2.put((Object) map0, "", object0);
      doubleKeyMap3.put((Object) doubleKeyMap2, "", integer0);
      Object object1 = new Object();
      Object object2 = doubleKeyMap2.put((Object) map0, "bvRAiu26u$\"/,gG", object1);
      assertNull(object2);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DoubleKeyMap<Map<String, String>, Map<String, String>, String> doubleKeyMap0 = new DoubleKeyMap<Map<String, String>, Map<String, String>, String>();
      DoubleKeyMap<Object, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, String, Integer>((Map<Object, Map<String, Integer>>) null);
      Map<String, String> map0 = doubleKeyMap1.newMap();
      doubleKeyMap0.put(map0, map0, "");
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      doubleKeyMap0.get((Map<String, String>) hashMap0, (Map<String, String>) hashMap0);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Object, String> doubleKeyMap2 = null;
      try {
        doubleKeyMap2 = new DoubleKeyMap<Object, Object, String>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }
}