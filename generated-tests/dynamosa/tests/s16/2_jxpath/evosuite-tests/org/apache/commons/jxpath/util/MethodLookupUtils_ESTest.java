/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 03:03:22 GMT 2019
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
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[4];
      objectArray0[3] = (Object) "    target propName=";
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupConstructor(class0, objectArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/logging/LogFactory
         //
         verifyException("org.apache.commons.beanutils.ConvertUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class<String> class0 = String.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod((Class) null, "IX0H/5ivb=T&;t`<on.", (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Method method0 = MethodLookupUtils.lookupMethod((Class) null, "nVTC.", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class<String> class0 = String.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertFalse(constructor0.isVarArgs());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
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
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) class0;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod(class0, "copyValueOf", objectArray0);
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
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "' to; type '";
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "' to; type '", objectArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"' to; type '\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
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
  public void test09()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "sum", objectArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/logging/LogFactory
         //
         verifyException("org.apache.commons.beanutils.ConvertUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupConstructor((Class) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupConstructor(class0, objectArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/logging/LogFactory
         //
         verifyException("org.apache.commons.beanutils.ConvertUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) class0;
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "toString", (Object[]) null);
      assertNotNull(method0);
      assertEquals(1, method0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) class0;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "replace", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous method call: replace
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) class0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "subSequence", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "toLowerCase";
      Method method0 = MethodLookupUtils.lookupMethod(class0, "toLowerCase", objectArray0);
      assertEquals("public java.lang.String java.lang.String.toLowerCase()", method0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<String> class0 = String.class;
      Class<Object> class1 = Object.class;
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) class0;
      Method method0 = MethodLookupUtils.lookupMethod(class1, "em", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "[]'", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "";
      Class<String> class0 = String.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[0];
      Method method0 = MethodLookupUtils.lookupMethod(class0, "?$hg", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "trim", (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, true, true, true).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "valueOf", objectArray0);
      assertFalse(method0.isVarArgs());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<Integer> class0 = Integer.class;
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
  public void test24()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "format", objectArray0);
      assertEquals("public static java.lang.String java.lang.String.format(java.lang.String,java.lang.Object[])", method0.toString());
      assertNotNull(method0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "toLowerCase";
      Class<Integer> class0 = Integer.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "valueOf", objectArray0);
      assertFalse(method0.isBridge());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
  }
}