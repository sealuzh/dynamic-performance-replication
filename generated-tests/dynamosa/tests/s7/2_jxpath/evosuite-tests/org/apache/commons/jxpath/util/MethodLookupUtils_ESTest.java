/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 17:00:25 GMT 2019
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
      Object[] objectArray0 = new Object[2];
      objectArray0[1] = (Object) "=VaK~!Tn:'zvSDT";
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
      Object[] objectArray0 = new Object[1];
      Class<Integer> class0 = Integer.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod((Class) null, (String) null, (Object[]) null);
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
      Class<Object> class0 = Object.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "", (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Method method0 = MethodLookupUtils.lookupMethod((Class) null, "Ambigous method call: ", (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[0];
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertFalse(constructor0.isVarArgs());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "concat";
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "concat", objectArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"concat\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
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
  public void test08()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "split", objectArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/logging/LogFactory
         //
         verifyException("org.apache.commons.beanutils.ConvertUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) "startsWith";
      Class<String> class0 = String.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "startsWith", objectArray0);
      assertEquals("public boolean java.lang.String.startsWith(java.lang.String,int)", method0.toString());
      assertNotNull(method0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "parseUnsignedInt", (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "valueOf";
      Object object0 = new Object();
      objectArray0[1] = object0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "valueOf", objectArray0);
      assertEquals("public static java.lang.String java.lang.String.valueOf(java.lang.Object)", method0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "valueOf";
      objectArray0[1] = objectArray0[0];
      Method method0 = MethodLookupUtils.lookupMethod(class0, "valueOf", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) "itrKkFn";
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
  public void test17()  throws Throwable  {
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) typeConverter0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "' value '", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "intern";
      Method method0 = MethodLookupUtils.lookupMethod(class0, "intern", objectArray0);
      assertFalse(method0.isAccessible());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[0];
      Method method0 = MethodLookupUtils.lookupMethod(class0, "*y%|t", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      Method method0 = MethodLookupUtils.lookupMethod(class0, "intern", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "parseUnsignedInt";
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "parseUnsignedInt", objectArray0);
      assertEquals("parseUnsignedInt", method0.getName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[0];
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "wait", objectArray0);
      assertEquals("public final void java.lang.Object.wait() throws java.lang.InterruptedException", method0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "intern";
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
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupConstructor(class0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous constructor [null, null]
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
  }
}
