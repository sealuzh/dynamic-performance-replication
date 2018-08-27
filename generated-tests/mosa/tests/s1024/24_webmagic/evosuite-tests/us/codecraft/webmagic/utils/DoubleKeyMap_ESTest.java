/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 14:45:01 GMT 2018
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
      HashMap<String, Map<Object, Object>> hashMap0 = new HashMap<String, Map<Object, Object>>();
      DoubleKeyMap<String, Object, Object> doubleKeyMap0 = new DoubleKeyMap<String, Object, Object>(hashMap0);
      doubleKeyMap0.remove((String) null);
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, Object>();
      Map<String, Map<Integer, Integer>> map0 = doubleKeyMap1.newMap();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, Integer, Integer> doubleKeyMap2 = new DoubleKeyMap<String, Integer, Integer>(map0, class0);
      Map<Integer, Integer> map1 = doubleKeyMap2.remove((String) null);
      assertNull(map1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DoubleKeyMap<String, Object, String> doubleKeyMap0 = new DoubleKeyMap<String, Object, String>();
      String string0 = doubleKeyMap0.remove("", (Object) "");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DoubleKeyMap<Object, Object, Object> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Object>();
      DoubleKeyMap<String, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<String, Object, Integer>((Map<String, Map<Object, Integer>>) null);
      Map<Object, Map<String, Object>> map0 = doubleKeyMap1.newMap();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, String, Object> doubleKeyMap2 = new DoubleKeyMap<Object, String, Object>(map0, class0);
      Integer integer0 = new Integer(2235);
      Object object0 = doubleKeyMap2.put((Object) integer0, "p~s62", (Object) "p~s62");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<String, Map<String, String>> hashMap0 = new HashMap<String, Map<String, String>>();
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, String, String> doubleKeyMap0 = new DoubleKeyMap<String, String, String>(hashMap0, class0);
      String string0 = doubleKeyMap0.get("", "iu)sw:K}AnMV$5:");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DoubleKeyMap<Integer, String, Object> doubleKeyMap0 = new DoubleKeyMap<Integer, String, Object>((Map<Integer, Map<String, Object>>) null);
      DoubleKeyMap<Integer, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, Integer>();
      Integer integer0 = new Integer((-270));
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      // Undeclared exception!
      try { 
        doubleKeyMap1.put(integer0, (Map<Object, Integer>) hashMap0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      Integer integer0 = new Integer(0);
      Class<HashMap> class1 = HashMap.class;
      DoubleKeyMap<Object, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, String>(class1);
      Object object0 = new Object();
      doubleKeyMap0.put((Object) class0, integer0, "\"UH+!=M]");
      doubleKeyMap0.remove((Object) class1, integer0);
      Object object1 = new Object();
      HashMap<Integer, Map<String, Integer>> hashMap0 = new HashMap<Integer, Map<String, Integer>>();
      DoubleKeyMap<Integer, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Integer, String, Integer>(hashMap0, class1);
      // Undeclared exception!
      try { 
        doubleKeyMap1.put(integer0, (Map<String, Integer>) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HashMap<Object, Map<Object, Integer>> hashMap0 = new HashMap<Object, Map<Object, Integer>>();
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap0 = new DoubleKeyMap<Object, Object, Integer>(hashMap0);
      Object object0 = new Object();
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(0);
      doubleKeyMap0.put(object0, (Object) integer0, integer1);
      Integer integer2 = new Integer(0);
      doubleKeyMap0.put(object0, (Object) "", integer2);
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Integer, Object, Object> doubleKeyMap1 = new DoubleKeyMap<Integer, Object, Object>(class0);
      doubleKeyMap1.remove((Integer) null);
      HashMap<Object, Map<String, Integer>> hashMap1 = new HashMap<Object, Map<String, Integer>>();
      DoubleKeyMap<Object, String, Integer> doubleKeyMap2 = new DoubleKeyMap<Object, String, Integer>(hashMap1, class0);
      Integer integer3 = new Integer(0);
      Integer integer4 = new Integer(0);
      Integer integer5 = doubleKeyMap2.put((Object) integer3, "", integer4);
      assertNull(integer5);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HashMap<String, Map<String, String>> hashMap0 = new HashMap<String, Map<String, String>>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      hashMap0.put("", hashMap1);
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<String, String, String> doubleKeyMap0 = new DoubleKeyMap<String, String, String>(hashMap0, class0);
      doubleKeyMap0.get("", "iu)sw:K}AnMV$5:");
      DoubleKeyMap<String, Integer, Integer> doubleKeyMap1 = new DoubleKeyMap<String, Integer, Integer>(class0);
      Integer integer0 = new Integer(0);
      doubleKeyMap1.remove((String) null, integer0);
      Map<Integer, Integer> map0 = doubleKeyMap1.remove("$?=8h~F(");
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      Integer integer0 = new Integer(0);
      Class<HashMap> class1 = HashMap.class;
      DoubleKeyMap<Object, Integer, String> doubleKeyMap0 = new DoubleKeyMap<Object, Integer, String>(class1);
      Object object0 = new Object();
      doubleKeyMap0.put((Object) class0, integer0, "\"UH+!=M]");
      doubleKeyMap0.remove((Object) class1, (Integer) null);
      Object object1 = new Object();
      HashMap<Integer, Map<String, Integer>> hashMap0 = new HashMap<Integer, Map<String, Integer>>();
      DoubleKeyMap<Integer, String, Integer> doubleKeyMap1 = new DoubleKeyMap<Integer, String, Integer>();
      // Undeclared exception!
      try { 
        doubleKeyMap1.put(integer0, (Map<String, Integer>) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}