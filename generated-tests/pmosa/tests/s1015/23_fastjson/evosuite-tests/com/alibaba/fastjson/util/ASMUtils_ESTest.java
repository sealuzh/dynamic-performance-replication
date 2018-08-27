/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 07:05:23 GMT 2018
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
      Class<Integer> class0 = Integer.class;
      ASMUtils.type(class0);
      ASMUtils aSMUtils0 = new ASMUtils();
      ASMUtils.desc(class0);
      ASMUtils.type(class0);
      Class<Method> class1 = Method.class;
      ASMUtils.getMethodType(class1, "java/lang/Integer");
      Class<String> class2 = String.class;
      ASMUtils.type(class2);
      Class<Method> class3 = Method.class;
      // Undeclared exception!
      try { 
        ASMUtils.getPrimitiveLetter(class3);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Type: java.lang.reflect.Method is not a primitive type
         //
         verifyException("com.alibaba.fastjson.util.ASMUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = ASMUtils.checkName(".class");
      boolean boolean1 = ASMUtils.isAndroid(".class");
      assertTrue(boolean1 == boolean0);
      
      Class<Object> class0 = Object.class;
      String string0 = ASMUtils.type(class0);
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ASMUtils.desc(class0);
      Class<Integer> class1 = Integer.class;
      ASMUtils.getMethodType(class1, "[)RpbRRH");
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
  public void test3()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ASMUtils.desc(class0);
      ASMUtils.type(class0);
      ASMUtils.checkName("Ljava/lang/Object;");
      ASMUtils.isAndroid("dalvik");
      ASMUtils.checkName("java/lang/Object");
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
}