/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 20:04:15 GMT 2019
 */

package us.codecraft.webmagic.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import us.codecraft.webmagic.utils.DoubleKeyMap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DoubleKeyMap_ESTest extends DoubleKeyMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>();
      doubleKeyMap0.put("", (Object) null, "");
      String string0 = doubleKeyMap0.remove("", (Object) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, Map<Object, Integer>> hashMap0 = new HashMap<String, Map<Object, Integer>>();
      HashMap<Object, Integer> hashMap1 = new HashMap<Object, Integer>();
      hashMap0.put("!", hashMap1);
      DoubleKeyMap<String, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<String, Object, Integer>(hashMap0);
      Map<Object, Integer> map0 = doubleKeyMap0.remove("!");
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DoubleKeyMap<Integer, Map<String, String>, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, Map<String, String>, Object>();
      Map<HashMap<String, Integer>, Map<HashMap<String, Object>, String>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<HashMap<String, Integer>, HashMap<String, Object>, String> doubleKeyMap1 = new DoubleKeyMap<HashMap<String, Integer>, HashMap<String, Object>, String>(map0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      doubleKeyMap1.put(hashMap0, hashMap1, "kE~cJ+p=eE^");
      Map<HashMap<String, Object>, String> map1 = doubleKeyMap1.remove(hashMap0);
      assertFalse(map1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>(class0);
      doubleKeyMap0.put("!", (Object) "!", "");
      String string0 = doubleKeyMap0.get("!", (Object) "!");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DoubleKeyMap<Integer, Object, HashMap<String, String>> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, HashMap<String, String>>();
      Integer integer0 = new Integer(1);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      doubleKeyMap0.put(integer0, (Object) integer0, hashMap0);
      Map<Object, HashMap<String, String>> map0 = doubleKeyMap0.get(integer0);
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      HashMap<Object, Map<Object, Integer>> hashMap0 = new HashMap<Object, Map<Object, Integer>>();
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Integer>(hashMap0, class0);
      Object object0 = new Object();
      Integer integer0 = doubleKeyMap0.remove((Object) null, object0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DoubleKeyMap<String, String, Object> doubleKeyMap0 = new DoubleKeyMap<String, String, Object>();
      Map<String, Object> map0 = doubleKeyMap0.remove((String) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>();
      Map<String, Map<Integer, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<String, Integer, Object> doubleKeyMap1 = new DoubleKeyMap<String, Integer, Object>(map0);
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Integer, HashMap<String, String>> doubleKeyMap2 = new DoubleKeyMap<Object, Integer, HashMap<String, String>>(class0);
      Map<Integer, HashMap<String, String>> map1 = doubleKeyMap2.remove((Object) doubleKeyMap1);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DoubleKeyMap<String, String, Object> doubleKeyMap0 = new DoubleKeyMap<String, String, Object>((Map<String, Map<String, Object>>) null);
      Object object0 = doubleKeyMap0.put("", "", (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Integer, Map<Object, Integer>> hashMap0 = new HashMap<Integer, Map<Object, Integer>>();
      Collection<Map<Object, Integer>> collection0 = hashMap0.values();
      Integer integer0 = new Integer(0);
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>();
      Object object0 = doubleKeyMap0.put("", (Object) integer0, (Object) collection0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Object, Map<HashMap<Integer, Object>, Integer>> hashMap0 = new HashMap<Object, Map<HashMap<Integer, Object>, Integer>>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, HashMap<Integer, Object>, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, HashMap<Integer, Object>, Integer>(hashMap0, class0);
      HashMap<Object, Map<Object, String>> hashMap1 = new HashMap<Object, Map<Object, String>>();
      DoubleKeyMap<Object, Object, String> doubleKeyMap1 = new DoubleKeyMap<Object, Object, String>(hashMap1, class0);
      String string0 = doubleKeyMap1.put((Object) " Nu/Hv", (Object) doubleKeyMap0, "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DoubleKeyMap<Object, String, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, String, Integer>();
      Integer integer0 = new Integer((-131));
      Integer integer1 = doubleKeyMap0.put((Object) null, "", integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DoubleKeyMap<String, String, Object> doubleKeyMap0 = new DoubleKeyMap<String, String, Object>((Map<String, Map<String, Object>>) null);
      Object object0 = doubleKeyMap0.get("/UZQx0z,t:t*NMH5>", (String) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Map<String, String>, Object, String> doubleKeyMap0 = new DoubleKeyMap<Map<String, String>, Object, String>(class0);
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>();
      Map<String, String> map0 = doubleKeyMap1.newMap();
      String string0 = doubleKeyMap0.get(map0, (Object) doubleKeyMap1);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DoubleKeyMap<String, String, Object> doubleKeyMap0 = new DoubleKeyMap<String, String, Object>((Map<String, Map<String, Object>>) null);
      Object object0 = doubleKeyMap0.get((String) null, "");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, Object>(class0);
      Map<Integer, Object> map0 = doubleKeyMap0.get((Object) null);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>(class0);
      HashMap<Object, Map<Object, Integer>> hashMap0 = new HashMap<Object, Map<Object, Integer>>();
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Integer>(hashMap0, class0);
      Map<Object, Integer> map0 = doubleKeyMap1.get((Object) doubleKeyMap0);
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DoubleKeyMap<Integer, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<Integer, Object, Integer>();
      Map<Object, Map<String, Object>> map0 = doubleKeyMap0.newMap();
      DoubleKeyMap<Object, String, Object> doubleKeyMap1 = new DoubleKeyMap<Object, String, Object>(map0);
      // Undeclared exception!
      try { 
        doubleKeyMap1.put((Object) map0, "~", (Object) map0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<HashMap<String, Object>, Map<Map<Map<String, String>, String>, Integer>> hashMap0 = new HashMap<HashMap<String, Object>, Map<Map<Map<String, String>, String>, Integer>>();
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<String, Object>, Map<Map<String, String>, String>, Integer> doubleKeyMap0 = new DoubleKeyMap<HashMap<String, Object>, Map<Map<String, String>, String>, Integer>(hashMap0, class0);
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      HashMap<Map<String, String>, String> hashMap2 = new HashMap<Map<String, String>, String>();
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        doubleKeyMap0.put(hashMap1, (Map<Map<String, String>, String>) hashMap2, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DoubleKeyMap<HashMap<Map<String, String>, String>, String, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<HashMap<Map<String, String>, String>, String, String>((Map<HashMap<Map<String, String>, String>, Map<String, String>>) null, (Class<? extends Map>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<String, Map<String, Integer>, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<String, Map<String, Integer>, String>((Map<String, Map<Map<String, Integer>, String>>) null, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DoubleKeyMap<HashMap<Object, Integer>, Integer, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Integer>, Integer, String>((Class<? extends Map>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>();
      doubleKeyMap0.put("", (Object) "", "");
      String string0 = doubleKeyMap0.remove("", (Object) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>();
      doubleKeyMap0.put("", (Object) null, "");
      String string0 = doubleKeyMap0.put("", (Object) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>();
      doubleKeyMap0.put("", (Object) null, "");
      String string0 = doubleKeyMap0.get("", (Object) "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Map> class0 = Map.class;
      DoubleKeyMap<HashMap<Object, Integer>, Integer, String> doubleKeyMap0 = null;
      try {
        doubleKeyMap0 = new DoubleKeyMap<HashMap<Object, Integer>, Integer, String>(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // wrong proto type map interface java.util.Map
         //
         verifyException("us.codecraft.webmagic.utils.MultiKeyMapBase", e);
      }
  }
}
