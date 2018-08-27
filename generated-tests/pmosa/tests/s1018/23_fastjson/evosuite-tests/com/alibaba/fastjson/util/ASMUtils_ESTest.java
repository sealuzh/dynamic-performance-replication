/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 14:06:50 GMT 2018
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.ASMUtils;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ASMUtils_ESTest extends ASMUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ASMUtils aSMUtils0 = new ASMUtils();
      Class<Object> class0 = Object.class;
      Class<Method> class1 = Method.class;
      ASMUtils.getMethodType(class1, "Java HotSpot(TM) 64-Bit Server VM");
      ASMUtils.getMethodType(class0, "");
      ASMUtils.getMethodType(class0, "Java HotSpot(TM) 64-Bit Server VM");
      Class<Integer> class2 = Integer.class;
      ASMUtils.type(class2);
      ASMUtils.desc(class2);
      // Undeclared exception!
      try { 
        ASMUtils.getPrimitiveLetter(class0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Type: java.lang.Object is not a primitive type
         //
         verifyException("com.alibaba.fastjson.util.ASMUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Method> class0 = Method.class;
      String string0 = "h:VP5M";
      ASMUtils.getMethodType(class0, "h:VP5M");
      Class<Object> class1 = Object.class;
      ASMUtils.type(class1);
      ASMUtils.isAndroid("java/lang/Object");
      Class<String> class2 = String.class;
      ASMUtils.desc(class2);
      // Undeclared exception!
      try { 
        ASMUtils.getPrimitiveLetter(class0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Type: java.lang.reflect.Method is not a primitive type
         //
         verifyException("com.alibaba.fastjson.util.ASMUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean boolean0 = ASMUtils.checkName("L");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = "xGUCzQN8\\.w";
      ASMUtils.checkName("xGUCzQN8.w");
      String string1 = "";
      ASMUtils.checkName("");
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        ASMUtils.getPrimitiveLetter(class0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Type: java.lang.Integer is not a primitive type
         //
         verifyException("com.alibaba.fastjson.util.ASMUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        ASMUtils.lookupParameterNames((AccessibleObject) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.ASMUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Class<String> class0 = String.class;
      ASMUtils.getMethodType(class0, "dalvik");
      ASMUtils.isAndroid("dalvik");
      Class<Object> class1 = Object.class;
      // Undeclared exception!
      try { 
        ASMUtils.getPrimitiveLetter(class1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Type: java.lang.Object is not a primitive type
         //
         verifyException("com.alibaba.fastjson.util.ASMUtils", e);
      }
  }
}