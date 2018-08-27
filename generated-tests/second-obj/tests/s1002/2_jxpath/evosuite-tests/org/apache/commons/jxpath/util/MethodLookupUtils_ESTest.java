/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 16:35:38 GMT 2018
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
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "hashCode";
      Class<Object> class0 = Object.class;
      MethodLookupUtils.lookupMethod(class0, "hashCode", objectArray0);
      Object object0 = new Object();
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[0];
      Method method0 = MethodLookupUtils.lookupMethod(class0, (String) null, objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      Object[] objectArray0 = new Object[1];
      Object object1 = new Object();
      Class<String> class0 = String.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "welY\"_W$vU<^,Tj\u0006", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) methodLookupUtils0;
      Class<String> class0 = String.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "E_<gY", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) methodLookupUtils0;
      objectArray0[1] = (Object) methodLookupUtils0;
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
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "Rr<QbOVz7k,w r:Gz(", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) methodLookupUtils0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "D%\"u:d~*Ml `", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "3Mo]|G ", (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Object[] objectArray0 = new Object[2];
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      objectArray0[0] = (Object) methodLookupUtils0;
      Class<String> class0 = String.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "E_<gY", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Object[] objectArray0 = new Object[2];
      MethodLookupUtils.lookupStaticMethod(class0, "toString", objectArray0);
      objectArray0[0] = (Object) class0;
      Class<Object> class1 = Object.class;
      MethodLookupUtils.lookupConstructor(class1, objectArray0);
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod(class0, "toString", objectArray0);
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
      Class<Object> class0 = Object.class;
      Class<Object> class1 = Object.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      MethodLookupUtils.lookupStaticMethod(class1, "ys5h`3/KW9XdJ", objectArray0);
      MethodLookupUtils.lookupStaticMethod(class0, "lastIndexOf", objectArray0);
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      TypeUtils.setTypeConverter(typeConverter0);
      TypeConverter typeConverter1 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(typeConverter1).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter1);
      Class<Integer> class2 = Integer.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class2, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "getResource", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) class0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "getResource", objectArray0);
      assertEquals("getResource", method0.getName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[25];
      Object[] objectArray1 = new Object[1];
      objectArray1[0] = (Object) "toUpperCase";
      Class<Integer> class0 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class0, "decode", objectArray1);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Method method0 = MethodLookupUtils.lookupMethod(class0, "toUpperCase", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "hashCode";
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
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
  public void test16()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[17];
      MethodLookupUtils.lookupStaticMethod(class0, "hashCode", (Object[]) null);
      Class<Object> class1 = Object.class;
      Object[] objectArray1 = new Object[22];
      MethodLookupUtils.lookupMethod(class1, "hashCode", objectArray1);
      Class<String> class2 = String.class;
      Object[] objectArray2 = new Object[1];
      objectArray2[0] = (Object) "hashCode";
      MethodLookupUtils.lookupStaticMethod(class2, "hashCode", objectArray0);
      MethodLookupUtils.lookupMethod(class2, "hashCode", objectArray1);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, true, true, true).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Object[] objectArray3 = new Object[8];
      Class<Object> class3 = Object.class;
      MethodLookupUtils.lookupConstructor(class3, (Object[]) null);
      Class<Object> class4 = Object.class;
      MethodLookupUtils.lookupConstructor(class4, objectArray3);
      MethodLookupUtils.lookupMethod(class2, "valueOf", objectArray1);
      Class<String> class5 = String.class;
      MethodLookupUtils.lookupStaticMethod(class5, "valueOf", objectArray2);
      MethodLookupUtils.lookupStaticMethod(class5, "Z+@gUPm", (Object[]) null);
      MethodLookupUtils.lookupConstructor(class5, objectArray2);
      Class<Integer> class6 = Integer.class;
      Method method0 = MethodLookupUtils.lookupMethod(class6, "Ambigous constructor ", objectArray0);
      assertNull(method0);
  }
}