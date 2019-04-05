/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 13:11:10 GMT 2019
 */

package org.apache.commons.jxpath.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.apache.commons.jxpath.util.MethodLookupUtils;
import org.apache.commons.jxpath.util.TypeConverter;
import org.apache.commons.jxpath.util.TypeUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MethodLookupUtils_ESTest extends MethodLookupUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[9];
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[2];
      Method method0 = MethodLookupUtils.lookupMethod(class0, "", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class<String> class0 = String.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertFalse(constructor0.isVarArgs());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "valueOf";
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod(class0, "valueOf", objectArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/logging/LogFactory
         //
         verifyException("org.apache.commons.beanutils.ConvertUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) class0;
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Class<Object> class1 = Object.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class1, "nxL%6twy^)6S(", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) class0;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "PKrul=bwM+Lba$p7~;y", objectArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/logging/LogFactory
         //
         verifyException("org.apache.commons.beanutils.ConvertUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) class0;
      Class<String> class1 = String.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupConstructor(class1, objectArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/logging/LogFactory
         //
         verifyException("org.apache.commons.beanutils.ConvertUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) class0;
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Class<String> class1 = String.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class1, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, (Object[]) null);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "@:5%>,T/";
      objectArray0[1] = (Object) class0;
      Class<String> class1 = String.class;
      Method method0 = MethodLookupUtils.lookupMethod(class1, "compareTo", objectArray0);
      assertNotNull(method0);
      assertTrue(method0.isSynthetic());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) "indexOf";
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "indexOf", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous method call: indexOf
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "@:5%>,T/";
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "compareTo", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous method call: compareTo
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "valueOf";
      Object object0 = new Object();
      objectArray0[1] = object0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "valueOf", objectArray0);
      assertFalse(method0.isBridge());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) class0;
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Method method0 = MethodLookupUtils.lookupMethod(class0, "PKrul=bwM+Lba$p7~;y", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "toString";
      Class<Object> class0 = Object.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "toString", objectArray0);
      assertEquals(1, method0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class<String> class0 = String.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "[`d?*^*8e-2hAmAsBf", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "parseInt", (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod(class0, "valueOf", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous method call: valueOf
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Class<Integer> class0 = Integer.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "parseInt", objectArray0);
      assertNotNull(method0);
      assertEquals("public static int java.lang.Integer.parseInt(java.lang.String,int) throws java.lang.NumberFormatException", method0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[0];
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "getClass", objectArray0);
      assertFalse(method0.isAccessible());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "I";
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "parseInt", objectArray0);
      assertEquals(9, method0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "1n", (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupConstructor(class0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous constructor [null]
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
  }
}
