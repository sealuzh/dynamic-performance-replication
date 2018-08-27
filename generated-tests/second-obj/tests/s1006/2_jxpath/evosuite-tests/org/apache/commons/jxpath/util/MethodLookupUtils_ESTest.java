/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 19:42:37 GMT 2018
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
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[0];
      MethodLookupUtils.lookupMethod(class0, "Ambigous method call: ", objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<Object> class0 = Object.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "s@uzE:,[-.", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "Convert String[";
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "Convert String[", objectArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Convert String[\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      Object object0 = new Object();
      objectArray0[0] = object0;
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
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "isEmpty";
      Class<String> class0 = String.class;
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
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
  public void test05()  throws Throwable  {
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod(class0, (String) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      String string0 = null;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod(class0, (String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, (Object[]) null);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, (Object[]) null);
      assertFalse(constructor0.isAccessible());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "Convert String[";
      Method method0 = MethodLookupUtils.lookupMethod(class0, "Convert String[", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "join";
      Class<Object> class0 = Object.class;
      Object object0 = new Object();
      MethodLookupUtils.lookupMethod(class0, "equals", objectArray0);
      Class<Object> class1 = Object.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class1, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = new Object();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      doReturn((Object) null).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      TypeConverter typeConverter1 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[1];
      Class<Integer> class0 = Integer.class;
      Class<Object> class1 = Object.class;
      MethodLookupUtils.lookupStaticMethod(class1, "7FQ jC,@+rt~RX_+ Y", objectArray0);
      Class<Object> class2 = Object.class;
      Object[] objectArray1 = new Object[1];
      objectArray1[0] = (Object) typeConverter1;
      MethodLookupUtils.lookupConstructor(class0, objectArray1);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class2, "trim", objectArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod(class0, "join", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous method call: join
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<String> class0 = String.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "]", (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "org.apache.commons.jxpath.util.MethodLookupUtils";
      Method method0 = MethodLookupUtils.lookupMethod(class0, "isEmpty", objectArray0);
      assertFalse(method0.isVarArgs());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "valueOf";
      Class<Object> class0 = Object.class;
      MethodLookupUtils.lookupMethod(class0, "substring", objectArray0);
      Class<Object> class1 = Object.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class1, "valueOf", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[1];
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "join", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[0];
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "intern", objectArray0);
      assertFalse(method0.isSynthetic());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object object0 = new Object();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "cEEmpBy";
      Class<Integer> class0 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class0, "getInteger", objectArray0);
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertEquals(1, constructor0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "valueOf";
      Class<Object> class0 = Object.class;
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
  public void test22()  throws Throwable  {
      Object object0 = new Object();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = object0;
      objectArray0[1] = object0;
      Class<String> class0 = String.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "valueOf", objectArray0);
      assertEquals(9, method0.getModifiers());
  }
}