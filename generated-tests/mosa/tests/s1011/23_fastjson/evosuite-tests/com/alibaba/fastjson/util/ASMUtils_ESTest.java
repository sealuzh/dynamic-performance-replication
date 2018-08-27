/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 02:12:25 GMT 2018
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.ASMUtils;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ASMUtils_ESTest extends ASMUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ASMUtils aSMUtils0 = new ASMUtils();
      assertFalse(ASMUtils.IS_ANDROID);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
  public void test2()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ASMUtils.desc(class0);
      Type type0 = ASMUtils.getMethodType(class0, "Ljava/lang/Object;");
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      boolean boolean0 = ASMUtils.checkName("qHQm8%U5/F~Z/");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Class<Method> class0 = Method.class;
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
  public void test5()  throws Throwable  {
      boolean boolean0 = ASMUtils.isAndroid("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      boolean boolean0 = ASMUtils.isAndroid((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      boolean boolean0 = ASMUtils.checkName(".g}vz");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      boolean boolean0 = ASMUtils.isAndroid("dalvik");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      boolean boolean0 = ASMUtils.isAndroid("lemur");
      assertTrue(boolean0);
  }
}