/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 16:17:34 GMT 2018
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
      Class<Object> class0 = Object.class;
      Type type0 = ASMUtils.getMethodType(class0, "NSB,R5X3zII");
      assertNull(type0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Method> class0 = Method.class;
      String string0 = ASMUtils.desc(class0);
      assertEquals("Ljava/lang/reflect/Method;", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ASMUtils aSMUtils0 = new ASMUtils();
      boolean boolean0 = ASMUtils.isAndroid("Java HotSpot(TM) 64-Bit Server VM");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
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
  public void test4()  throws Throwable  {
      boolean boolean0 = ASMUtils.isAndroid((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      boolean boolean0 = ASMUtils.checkName("^");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      boolean boolean0 = ASMUtils.checkName("2RfC+d.f@-6");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      boolean boolean0 = ASMUtils.isAndroid("lemur");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
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
  public void test9()  throws Throwable  {
      boolean boolean0 = ASMUtils.isAndroid("dalvik");
      assertTrue(boolean0);
  }
}
