/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 09:02:28 GMT 2018
 */

package org.apache.commons.jxpath.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
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
      Object object0 = new Object();
      Object[] objectArray0 = new Object[1];
      Class<String> class0 = String.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "replace", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[0];
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      Method method0 = MethodLookupUtils.lookupMethod(class0, "H/#gu.T+}/9Y sn", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<Object> class0 = Object.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Integer> class0 = Integer.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, (Object[]) null);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      Method method0 = MethodLookupUtils.lookupMethod(class0, "getAnnotatedSuperclass", objectArray0);
      assertFalse(method0.isBridge());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "|8xP/fW;,sYd";
      Method method0 = MethodLookupUtils.lookupMethod(class0, "|8xP/fW;,sYd", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "SO`/:\"";
      objectArray0[1] = (Object) class0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "SO`/:\"", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Integer> class0 = Integer.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "H/#gu.T+}/9Y sn", (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "4k(GXCg,";
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Class<Integer> class0 = Integer.class;
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      Method method0 = MethodLookupUtils.lookupMethod(class0, "4k(GXCg,", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      MethodLookupUtils.lookupMethod(class0, "notify", objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Class<String> class1 = String.class;
      MethodLookupUtils.lookupMethod(class1, "notify", objectArray0);
      Class<Integer> class2 = Integer.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class2, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<Integer> class0 = Integer.class;
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
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod(class0, "getInteger", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous method call: getInteger
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "charAt";
      Class<String> class0 = String.class;
      MethodLookupUtils.lookupMethod(class0, "charAt", objectArray0);
      Class<Object> class1 = Object.class;
      MethodLookupUtils.lookupStaticMethod(class1, "charAt", objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class0, "toBinaryString", (Object[]) null);
      Class<String> class1 = String.class;
      Method method0 = MethodLookupUtils.lookupMethod(class1, "toBinaryString", (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<String> class0 = String.class;
      MethodLookupUtils.lookupConstructor(class0, (Object[]) null);
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "notify", (Object[]) null);
      assertFalse(method0.isVarArgs());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<Integer> class0 = Integer.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "getInteger", objectArray0);
      assertFalse(method0.isVarArgs());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "endsWith";
      MethodLookupUtils.lookupMethod(class0, "endsWith", objectArray0);
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "endsWith", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "endsWith";
      Class<Object> class0 = Object.class;
      Class<Integer> class1 = Integer.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "getBytes", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous method call: getBytes
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "p~Dh";
      Class<Integer> class0 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class0, "getInteger", objectArray0);
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      Class<Object> class1 = Object.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class1, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "endsWiLh";
      Class<Integer> class0 = Integer.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      Class<Object> class1 = Object.class;
      MethodLookupUtils.lookupMethod(class1, "endsWiLh", objectArray0);
      Class<String> class2 = String.class;
      MethodLookupUtils.lookupConstructor(class2, objectArray0);
      MethodLookupUtils.lookupStaticMethod(class1, "toHexString", objectArray0);
      Class<Integer> class3 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class3, "toHexString", objectArray0);
      MethodLookupUtils.lookupConstructor(class2, objectArray0);
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Class<String> class4 = String.class;
      MethodLookupUtils.lookupStaticMethod(class4, "valueOf", objectArray0);
      Class<Integer> class5 = Integer.class;
      Constructor constructor1 = MethodLookupUtils.lookupConstructor(class5, objectArray0);
      assertTrue(constructor1.equals((Object)constructor0));
  }
}