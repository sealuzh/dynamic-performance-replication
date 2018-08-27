/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 00:40:17 GMT 2018
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
      HashMap<Object, Map<String, String>> hashMap0 = new HashMap<Object, Map<String, String>>();
      DoubleKeyMap<Object, String, String> doubleKeyMap0 = new DoubleKeyMap<Object, String, String>(hashMap0);
      // Undeclared exception!
      try { 
        doubleKeyMap0.put((Object) hashMap0, "", "");
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoubleKeyMap<String, String, String> doubleKeyMap0 = new DoubleKeyMap<String, String, String>();
      doubleKeyMap0.remove("aZN_9 @^'");
      String string0 = doubleKeyMap0.remove("", "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, String, String> doubleKeyMap0 = new DoubleKeyMap<String, String, String>(class0);
      DoubleKeyMap<String, Integer, Object> doubleKeyMap1 = new DoubleKeyMap<String, Integer, Object>();
      Integer integer0 = new Integer(0);
      doubleKeyMap1.put("+Vb4P@M#8W+B69pL>+", integer0, (Object) integer0);
      Integer integer1 = new Integer(3734);
      doubleKeyMap1.put("+Vb4P@M#8W+B69pL>+", integer1, (Object) "+Vb4P@M#8W+B69pL>+");
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap2 = new DoubleKeyMap<Object, Integer, Object>();
      Object object0 = new Object();
      doubleKeyMap2.get(object0);
      DoubleKeyMap<String, String, Integer> doubleKeyMap3 = new DoubleKeyMap<String, String, Integer>((Map<String, Map<String, Integer>>) null);
      Map<String, Integer> map0 = doubleKeyMap3.remove("+Vb4P@M#8W+B69pL>+");
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DoubleKeyMap<String, String, String> doubleKeyMap0 = new DoubleKeyMap<String, String, String>();
      Map<String, String> map0 = doubleKeyMap0.newMap();
      // Undeclared exception!
      try { 
        doubleKeyMap0.put("us.codecraft.webmagic.utils.MultiKeyMapBase", map0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>((Map<String, Map<Object, Integer>>) null);
      Integer integer0 = new Integer((-1));
      doubleKeyMap0.put("", (Object) "", integer0);
      doubleKeyMap0.remove("", (Object) "");
      Integer integer1 = doubleKeyMap0.get("", (Object) "");
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>((Map<String, Map<Object, Integer>>) null);
      Integer integer0 = new Integer(1);
      Object object0 = new Object();
      doubleKeyMap0.put("", object0, integer0);
      Integer integer1 = new Integer(1);
      Object object1 = new Object();
      doubleKeyMap0.remove("", object1);
      doubleKeyMap0.get("4XA", (Object) "");
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, Object> doubleKeyMap1 = new DoubleKeyMap<String, Object, Object>(class0);
      doubleKeyMap1.newMap();
      DoubleKeyMap<Object, Object, Map<Object, String>> doubleKeyMap2 = new DoubleKeyMap<Object, Object, Map<Object, String>>();
      Class<Map> class1 = Map.class;
      DoubleKeyMap<Integer, Object, String> doubleKeyMap3 = null;
      try {
        doubleKeyMap3 = new DoubleKeyMap<Integer, Object, String>(class1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>((Map<String, Map<Object, Integer>>) null);
      Integer integer0 = new Integer(1);
      Integer integer1 = new Integer(1);
      doubleKeyMap0.put("", (Object) "", integer1);
      Integer integer2 = new Integer((-1));
      doubleKeyMap0.remove("", (Object) "m/9=L{");
      DoubleKeyMap<Integer, Object, String> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, String>();
      Map<Integer, Map<Object, String>> map0 = doubleKeyMap1.newMap();
      doubleKeyMap0.get("", (Object) map0);
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Object, Object> doubleKeyMap2 = null;
      try {
        doubleKeyMap2 = new DoubleKeyMap<String, Object, Object>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }
}