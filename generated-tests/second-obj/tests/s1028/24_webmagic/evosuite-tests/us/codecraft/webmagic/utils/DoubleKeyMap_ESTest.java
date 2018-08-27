/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 13:29:00 GMT 2018
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
      DoubleKeyMap<String, Integer, Object> doubleKeyMap0 = new DoubleKeyMap<String, Integer, Object>(class0);
      Integer integer0 = new Integer(0);
      doubleKeyMap0.put("Q?(HBx@(x!mcZ3p", integer0, (Object) "Q?(HBx@(x!mcZ3p");
      Class<HashMap> class1 = HashMap.class;
      DoubleKeyMap<Object, Object, Integer> doubleKeyMap1 = new DoubleKeyMap<Object, Object, Integer>(class1);
      Object object0 = new Object();
      Object object1 = new Object();
      Integer integer1 = doubleKeyMap1.get(object0, object1);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(class0);
      doubleKeyMap0.get((Object) class0, "");
      HashMap<String, Map<Object, Object>> hashMap0 = new HashMap<String, Map<Object, Object>>();
      DoubleKeyMap<String, Object, Object> doubleKeyMap1 = new DoubleKeyMap<String, Object, Object>(hashMap0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      hashMap0.put((String) null, hashMap1);
      Object object0 = new Object();
      HashMap<String, Map<Object, String>> hashMap2 = new HashMap<String, Map<Object, String>>();
      DoubleKeyMap<String, Object, String> doubleKeyMap2 = new DoubleKeyMap<String, Object, String>(hashMap2);
      doubleKeyMap2.remove("");
      doubleKeyMap2.newMap();
      doubleKeyMap2.remove((String) null);
      DoubleKeyMap<String, Object, String> doubleKeyMap3 = new DoubleKeyMap<String, Object, String>();
      Integer integer0 = new Integer(911);
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap4 = new DoubleKeyMap<Integer, Integer, Object>();
      Map<Object, Object> map0 = doubleKeyMap4.newMap();
      doubleKeyMap1.put((String) null, (Object) integer0, (Object) map0);
      doubleKeyMap3.remove((String) null);
      DoubleKeyMap<String, Object, Object> doubleKeyMap5 = new DoubleKeyMap<String, Object, Object>(class0);
      Integer integer1 = new Integer(3612);
      DoubleKeyMap<String, Object, Object> doubleKeyMap6 = new DoubleKeyMap<String, Object, Object>(hashMap0);
      Object object1 = new Object();
      Object object2 = new Object();
      doubleKeyMap6.put((String) null, (Object) hashMap1, object2);
      Integer integer2 = new Integer(3612);
      Object object3 = doubleKeyMap1.remove("", (Object) "");
      assertNull(object3);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(class0);
      doubleKeyMap0.get((Object) class0, "");
      HashMap<String, Map<Object, Object>> hashMap0 = new HashMap<String, Map<Object, Object>>();
      DoubleKeyMap<String, Object, Object> doubleKeyMap1 = new DoubleKeyMap<String, Object, Object>(hashMap0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      hashMap0.put((String) null, hashMap1);
      Object object0 = new Object();
      doubleKeyMap1.get((String) null, object0);
      HashMap<Integer, Map<String, Object>> hashMap2 = new HashMap<Integer, Map<String, Object>>();
      Class<HashMap> class1 = HashMap.class;
      Integer integer0 = new Integer(1737);
      DoubleKeyMap<Integer, Integer, Object> doubleKeyMap2 = new DoubleKeyMap<Integer, Integer, Object>(class1);
      Map<String, Object> map0 = doubleKeyMap2.newMap();
      hashMap2.put(integer0, map0);
      DoubleKeyMap<Integer, String, Object> doubleKeyMap3 = new DoubleKeyMap<Integer, String, Object>(hashMap2, class1);
      Integer integer1 = new Integer(0);
      doubleKeyMap3.remove(integer1, "");
      DoubleKeyMap<String, String, String> doubleKeyMap4 = new DoubleKeyMap<String, String, String>(class0);
      doubleKeyMap4.get("");
      DoubleKeyMap<String, String, Integer> doubleKeyMap5 = new DoubleKeyMap<String, String, Integer>();
      doubleKeyMap5.remove((String) null);
      // Undeclared exception!
      try { 
        doubleKeyMap1.put("", (Map<Object, Object>) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(class0);
      Object object0 = new Object();
      HashMap<String, Map<Object, Object>> hashMap0 = new HashMap<String, Map<Object, Object>>();
      DoubleKeyMap<String, Object, Object> doubleKeyMap1 = new DoubleKeyMap<String, Object, Object>(hashMap0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      hashMap0.put((String) null, hashMap1);
      Object object1 = new Object();
      HashMap<String, Map<Object, String>> hashMap2 = new HashMap<String, Map<Object, String>>();
      DoubleKeyMap<String, Object, String> doubleKeyMap2 = new DoubleKeyMap<String, Object, String>(hashMap2);
      doubleKeyMap2.remove((String) null);
      DoubleKeyMap<String, Object, String> doubleKeyMap3 = new DoubleKeyMap<String, Object, String>();
      doubleKeyMap3.remove((String) null);
      DoubleKeyMap<String, Object, Object> doubleKeyMap4 = new DoubleKeyMap<String, Object, Object>(class0);
      Integer integer0 = new Integer(3612);
      DoubleKeyMap<String, Object, Object> doubleKeyMap5 = new DoubleKeyMap<String, Object, Object>(hashMap0);
      Object object2 = new Object();
      doubleKeyMap5.put(":F", (Object) null, object2);
      Integer integer1 = new Integer(0);
      doubleKeyMap5.remove(":F", (Object) integer1);
      assertEquals(2, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<HashMap> class0 = HashMap.class;
      DoubleKeyMap<Object, String, Object> doubleKeyMap0 = new DoubleKeyMap<Object, String, Object>(class0);
      Object object0 = new Object();
      HashMap<String, Map<Object, Object>> hashMap0 = new HashMap<String, Map<Object, Object>>();
      DoubleKeyMap<String, Object, Object> doubleKeyMap1 = new DoubleKeyMap<String, Object, Object>(hashMap0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      hashMap0.put((String) null, hashMap1);
      Object object1 = new Object();
      HashMap<String, Map<Object, String>> hashMap2 = new HashMap<String, Map<Object, String>>();
      DoubleKeyMap<String, Object, String> doubleKeyMap2 = new DoubleKeyMap<String, Object, String>(hashMap2);
      Map<Object, String> map0 = new HashMap<Object, String>();
      DoubleKeyMap<String, Object, String> doubleKeyMap3 = new DoubleKeyMap<String, Object, String>();
      doubleKeyMap3.remove((String) null);
      DoubleKeyMap<String, Object, Object> doubleKeyMap4 = new DoubleKeyMap<String, Object, Object>(class0);
      Integer integer0 = new Integer(3612);
      DoubleKeyMap<String, Object, Object> doubleKeyMap5 = new DoubleKeyMap<String, Object, Object>(hashMap0);
      Object object2 = new Object();
      doubleKeyMap5.put(":F", (Object) null, object2);
      Integer integer1 = new Integer(0);
      doubleKeyMap1.remove(":F", (Object) null);
      assertEquals(1, hashMap0.size());
  }
}