/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 22:12:46 GMT 2019
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.util.ASMUtils;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ASMUtils_ESTest extends ASMUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = ASMUtils.isAndroid("dQzV.bUZOLRm\"#2&");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = ASMUtils.isAndroid("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Type type0 = ASMUtils.getMethodType(class0, "($\"6|QS'$JzLr}1q");
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Method> class0 = Method.class;
      Type type0 = ASMUtils.getMethodType(class0, "");
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Type type0 = ASMUtils.getMethodType((Class<?>) null, (String) null);
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = ASMUtils.checkName("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        ASMUtils.type((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.ASMUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AccessibleObject accessibleObject0 = mock(AccessibleObject.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ASMUtils.lookupParameterNames(accessibleObject0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // codegen.java.lang.reflect.AccessibleObject$MockitoMock$641550637 cannot be cast to java.lang.reflect.Constructor
         //
         verifyException("com.alibaba.fastjson.util.ASMUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
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
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        ASMUtils.desc((Method) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.ASMUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        ASMUtils.desc((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.ASMUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ASMUtils.checkName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.ASMUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<String> class0 = String.class;
      String string0 = ASMUtils.type(class0);
      assertEquals("java/lang/String", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      boolean boolean0 = ASMUtils.checkName("W|n.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = ASMUtils.checkName("8~T;g]w;Cr([Xhg,u");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        ASMUtils.getPrimitiveLetter((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.ASMUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String string0 = ASMUtils.desc(class0);
      assertEquals("Ljava/lang/Object;", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = ASMUtils.isAndroid("lemur");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = ASMUtils.isAndroid((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = ASMUtils.isAndroid("dalvik");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ASMUtils aSMUtils0 = new ASMUtils();
      assertFalse(ASMUtils.IS_ANDROID);
  }
}
