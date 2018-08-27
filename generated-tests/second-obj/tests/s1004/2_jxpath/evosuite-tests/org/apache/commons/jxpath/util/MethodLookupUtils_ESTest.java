/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 18:26:15 GMT 2018
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
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "_", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "java.lang.Character", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, (Object[]) null);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Object> class0 = Object.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Object> class0 = Object.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "V9OC", (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<String> class0 = String.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "", (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      Class<Integer> class0 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class0, "decode", objectArray0);
      Object object0 = new Object();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Object[] objectArray1 = new Object[1];
      objectArray1[0] = (Object) typeConverter0;
      MethodLookupUtils.lookupMethod(class0, "decode", objectArray1);
      Class<Object> class1 = Object.class;
      MethodLookupUtils.lookupStaticMethod(class1, "Pq", objectArray1);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<Object> class0 = Object.class;
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "_", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "atIndexOf";
      Class<String> class0 = String.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "atIndexOf", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) class0;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, (String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[0];
      Method method0 = MethodLookupUtils.lookupMethod(class0, "highestOneBit", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) methodLookupUtils0;
      objectArray0[2] = (Object) class0;
      Object object0 = new Object();
      objectArray0[3] = object0;
      MethodLookupUtils.lookupStaticMethod(class0, "9^G", objectArray0);
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Class<Integer> class1 = Integer.class;
      Object[] objectArray1 = new Object[1];
      objectArray1[0] = (Object) class1;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class1, objectArray1);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "lastIndexOf";
      Class<String> class0 = String.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "lastIndexOf", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
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
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<String> class0 = String.class;
      Object[] objectArray1 = new Object[1];
      objectArray1[0] = (Object) methodLookupUtils0;
      MethodLookupUtils.lookupMethod(class0, "Ambigous method call: ", objectArray1);
      Class<String> class1 = String.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class1, "copyValueOf", objectArray0);
      assertFalse(method0.isAccessible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodLookupUtils.lookupConstructor(class0, (Object[]) null);
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "hashCode", (Object[]) null);
      assertEquals(257, method0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "lastIndexOf";
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "lastIndexOf", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous method call: lastIndexOf
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) "lastIndexOf";
      objectArray0[1] = (Object) "lastIndexOf";
      objectArray0[2] = (Object) "lastIndexOf";
      Object object0 = new Object();
      objectArray0[5] = object0;
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Object object1 = new Object();
      Object[] objectArray1 = new Object[1];
      objectArray1[0] = object1;
      Class<String> class0 = String.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "isEmpty", objectArray1);
      assertFalse(method0.isVarArgs());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "lastIndexOf";
      Class<String> class0 = String.class;
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      Object object0 = new Object();
      Object object1 = new Object();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      TypeUtils.setTypeConverter(typeConverter0);
      Object object2 = new Object();
      TypeConverter typeConverter1 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(object2).when(typeConverter1).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter1);
      MethodLookupUtils.lookupMethod(class0, "lastIndexOf", objectArray0);
      Class<String> class1 = String.class;
      MethodLookupUtils.lookupStaticMethod(class1, "org.apache.commons.jxpath.util.MethodLookupUtils", objectArray0);
      Class<String> class2 = String.class;
      MethodLookupUtils.lookupConstructor(class2, objectArray0);
      Class<Integer> class3 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class3, "parseInt", objectArray0);
      MethodLookupUtils.lookupConstructor(class2, objectArray0);
      Object object3 = new Object();
      assertFalse(object3.equals((Object)object2));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<String> class0 = String.class;
      Object[] objectArray1 = null;
      MethodLookupUtils.lookupMethod(class0, (String) null, objectArray0);
      Class<Integer> class1 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class1, (String) null, objectArray0);
      MethodLookupUtils.lookupStaticMethod(class0, "    Target name = ", (Object[]) null);
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod(class1, "valueOf", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous method call: valueOf
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "lastIndexOf";
      Class<String> class0 = String.class;
      Class<String> class1 = String.class;
      MethodLookupUtils.lookupStaticMethod(class0, "lastIndexOf", objectArray0);
      Object object0 = new Object();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      Object object1 = new Object();
      TypeConverter typeConverter1 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, true, true, true).when(typeConverter1).canConvert(any() , any(java.lang.Class.class));
      doReturn((Object) null).when(typeConverter1).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter1);
      Object object2 = new Object();
      MethodLookupUtils.lookupStaticMethod(class1, "valueOf", objectArray0);
      Class<String> class2 = String.class;
      MethodLookupUtils.lookupStaticMethod(class2, "lastIndexOf", objectArray0);
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class2, "trim", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }
}