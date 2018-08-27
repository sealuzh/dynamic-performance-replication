/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:08:21 GMT 2018
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
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>((Map<String, Map<Object, Object>>) null);
      Object object0 = doubleKeyMap0.remove("", (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<Object, Map<String, Object>> hashMap0 = new HashMap<Object, Map<String, Object>>();
      BiFunction<Object, Object, Map<String, Object>> biFunction0 = (BiFunction<Object, Object, Map<String, Object>>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.replaceAll(biFunction0);
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(hashMap0, class0);
      DoubleKeyMap<Object, Map<String, Object>, String> doubleKeyMap1 = new DoubleKeyMap<Object, Map<String, Object>, String>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      hashMap1.put("~pTpan'v@N", hashMap0);
      doubleKeyMap1.remove((Object) hashMap1, (Map<String, Object>) hashMap1);
      DoubleKeyMap<String, String, Object> doubleKeyMap2 = new DoubleKeyMap<String, String, Object>(class0);
      String string0 = "";
      // Undeclared exception!
      try { 
        doubleKeyMap2.put("", (Map<String, Object>) hashMap1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DoubleKeyMap<Integer, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Integer>();
      int int0 = 0;
      Integer integer0 = new Integer(1);
      String string0 = "wrong proto type map ";
      Integer integer1 = new Integer(0);
      Integer integer2 = new Integer(0);
      doubleKeyMap0.put(integer2, "", integer2);
      doubleKeyMap0.newMap();
      doubleKeyMap0.put(integer2, "wrong proto type map ", integer1);
      Integer integer3 = new Integer(0);
      doubleKeyMap0.put(integer3, "I<6}q|U:Wt:{]Wl@", integer3);
      DoubleKeyMap<Integer, Object, String> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, String>();
      Map<Object, String> map0 = null;
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Map<String, Object>, String, Object> doubleKeyMap2 = null;
      try {
        doubleKeyMap2 = new DoubleKeyMap<Map<String, Object>, String, Object>(class0);
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
      HashMap<Integer, Map<String, String>> hashMap0 = new HashMap<Integer, Map<String, String>>();
      Class<Map> class0 = Map.class;
      Integer integer0 = new Integer(109);
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      String string0 = "Bgs6";
      hashMap1.put("", "Bgs6");
      hashMap0.put(integer0, hashMap1);
      DoubleKeyMap<Integer, String, String> doubleKeyMap0 = new DoubleKeyMap<Integer, String, String>(hashMap0, class0);
      doubleKeyMap0.remove(integer0, "Bgs6");
      Integer integer1 = new Integer(618);
      Object object0 = new Object();
      Integer integer2 = new Integer(1);
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
  public void test4()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Object>();
      Integer integer0 = new Integer((-629));
      Object object0 = new Object();
      doubleKeyMap0.remove(integer0, object0);
      doubleKeyMap0.put(integer0, (Object) integer0, (Object) null);
      Integer integer1 = new Integer((-629));
      doubleKeyMap0.remove(integer1, (Object) integer1);
      HashMap<Object, Map<Integer, String>> hashMap0 = new HashMap<Object, Map<Integer, String>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = null;
      try {
        doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>(class0);
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
      DoubleKeyMap<Object, Map<String, Object>, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Map<String, Object>, Integer>();
      HashMap<Object, Map<String, Object>> hashMap0 = new HashMap<Object, Map<String, Object>>();
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>(hashMap0);
      Map<String, Object> map0 = doubleKeyMap1.newMap();
      doubleKeyMap0.get((Object) null, map0);
      HashMap<Object, Map<Integer, String>> hashMap1 = new HashMap<Object, Map<Integer, String>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<Object, Integer, String> doubleKeyMap2 = new DoubleKeyMap<Object, Integer, String>(hashMap1, class0);
      HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
      DoubleKeyMap<Object, String, String> doubleKeyMap3 = new DoubleKeyMap<Object, String, String>((Map<Object, Map<String, String>>) null);
      Map<Integer, String> map1 = doubleKeyMap3.newMap();
      hashMap1.put(map0, map1);
      Integer integer0 = new Integer(0);
      doubleKeyMap2.get((Object) hashMap0, integer0);
      DoubleKeyMap<Object, Object, Object> doubleKeyMap4 = new DoubleKeyMap<Object, Object, Object>();
      Class<Map> class1 = Map.class;
      DoubleKeyMap<Object, Object, Object> doubleKeyMap5 = null;
      try {
        doubleKeyMap5 = new DoubleKeyMap<Object, Object, Object>(class1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }
}