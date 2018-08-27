/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 18:39:53 GMT 2018
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
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "contains", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[1];
      Method method0 = MethodLookupUtils.lookupMethod(class0, ";Oz[#yVBtF5VyRzP", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "isEmpty";
      Class<Object> class0 = Object.class;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "isEmpty", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "isEmpty";
      Class<Object> class0 = Object.class;
      MethodLookupUtils.lookupMethod(class0, "isEmpty", objectArray0);
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      MethodLookupUtils.lookupMethod(class0, "8,se'Vpan", objectArray0);
      Class<String> class1 = String.class;
      MethodLookupUtils.lookupMethod(class1, "8,se'Vpan", objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Object> class2 = Object.class;
      MethodLookupUtils.lookupMethod(class2, "8,se'Vpan", objectArray0);
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod(class0, "hashCode", objectArray0);
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
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) "org.apache.commons.jxpath.util.BasicTypeConverter";
      Object object0 = new Object();
      objectArray0[1] = object0;
      objectArray0[2] = (Object) class0;
      objectArray0[3] = (Object) "org.apache.commons.jxpath.util.BasicTypeConverter";
      objectArray0[4] = (Object) class0;
      objectArray0[5] = (Object) class0;
      objectArray0[6] = (Object) "org.apache.commons.jxpath.util.BasicTypeConverter";
      MethodLookupUtils.lookupMethod(class0, "org.apache.commons.jxpath.util.BasicTypeConverter", objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<String> class1 = String.class;
      MethodLookupUtils.lookupMethod(class1, "org.apache.commons.jxpath.util.BasicTypeConverter", objectArray0);
      Class<String> class2 = String.class;
      MethodLookupUtils.lookupStaticMethod(class2, "org.apache.commons.jxpath.util.BasicTypeConverter", objectArray0);
      MethodLookupUtils.lookupMethod(class0, "org.apache.commons.jxpath.util.BasicTypeConverter", objectArray0);
      MethodLookupUtils.lookupMethod(class2, "`^", objectArray0);
      Class<String> class3 = String.class;
      MethodLookupUtils.lookupConstructor(class3, objectArray0);
      Class<Object> class4 = Object.class;
      Object[] objectArray1 = new Object[7];
      objectArray1[0] = (Object) class4;
      objectArray1[1] = (Object) null;
      objectArray1[2] = (Object) methodLookupUtils0;
      objectArray1[3] = (Object) class0;
      objectArray1[4] = (Object) null;
      objectArray1[5] = (Object) "`^";
      objectArray1[6] = (Object) class0;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class4, "", objectArray1);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Object> class0 = Object.class;
      String string0 = "Sz";
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) class0;
      Class<Object> class1 = Object.class;
      MethodLookupUtils.lookupConstructor(class1, objectArray0);
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Object object0 = new Object();
      objectArray0[1] = object0;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "Sz", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) null;
      MethodLookupUtils.lookupStaticMethod(class0, (String) null, objectArray0);
      Class<Object> class1 = Object.class;
      Object[] objectArray1 = new Object[4];
      objectArray1[0] = (Object) null;
      objectArray1[1] = (Object) null;
      objectArray1[2] = (Object) class0;
      objectArray1[3] = (Object) null;
      MethodLookupUtils.lookupConstructor(class1, objectArray1);
      MethodLookupUtils.lookupMethod(class0, "D),", objectArray1);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      TypeUtils.setTypeConverter(typeConverter0);
      Class<String> class2 = String.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupConstructor(class2, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous constructor [null]
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
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
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) class0;
      objectArray0[2] = (Object) "";
      Object object0 = new Object();
      MethodLookupUtils.lookupMethod(class0, "EE]K@iN9VF2\"~6", objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[6];
      objectArray0[1] = (Object) class0;
      objectArray0[1] = (Object) class0;
      Object object0 = new Object();
      Object object1 = new Object();
      MethodLookupUtils.lookupStaticMethod(class0, "org.apache.commons.beanutils.ConvertUtilsBean", objectArray0);
      MethodLookupUtils.lookupStaticMethod(class0, "contains", objectArray0);
      Object[] objectArray1 = new Object[0];
      MethodLookupUtils.lookupConstructor(class0, objectArray1);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Object> class1 = Object.class;
      MethodLookupUtils.lookupStaticMethod(class1, "Ambigous constructor ", objectArray0);
      MethodLookupUtils.lookupStaticMethod(class0, "VkO^ff='Kd=%", objectArray1);
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      Class<String> class2 = String.class;
      Class<Integer> class3 = Integer.class;
      MethodLookupUtils.lookupMethod(class3, "Q^=", objectArray1);
      Object[] objectArray2 = new Object[7];
      objectArray2[0] = (Object) "contains";
      objectArray2[1] = (Object) "Q^=";
      objectArray2[3] = (Object) class1;
      objectArray2[4] = (Object) null;
      objectArray2[5] = (Object) "org.apache.commons.beanutils.ConvertUtilsBean";
      objectArray2[6] = (Object) class3;
      Method method0 = MethodLookupUtils.lookupMethod(class2, "charAt", objectArray2);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "valueOf";
      MethodLookupUtils.lookupStaticMethod(class0, "valueOf", objectArray0);
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "valueOf", objectArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"valueOf\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      MethodLookupUtils.lookupConstructor(class0, (Object[]) null);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Integer> class1 = Integer.class;
      MethodLookupUtils.lookupMethod(class1, "hashCode", (Object[]) null);
      Method method0 = MethodLookupUtils.lookupStaticMethod(class1, "hashCode", (Object[]) null);
      assertEquals(1, method0.getModifiers());
      assertNotNull(method0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<Integer> class0 = Integer.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "hashCode", objectArray0);
      assertEquals(9, method0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<Integer> class0 = Integer.class;
      String string0 = "valueOf";
      MethodLookupUtils.lookupMethod(class0, "valueOf", objectArray0);
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
  public void test17()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) class0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "compareToIgnoreCase", objectArray0);
      assertEquals(1, method0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) class0;
      MethodLookupUtils.lookupMethod(class0, "org.apache.commons.jxpath.util.MethodLookupUtils", objectArray0);
      Class<String> class1 = String.class;
      MethodLookupUtils.lookupMethod(class1, "compareToIgnoreCase", objectArray0);
      MethodLookupUtils.lookupMethod(class1, "join", objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      MethodLookupUtils.lookupMethod(class0, "compareTo", objectArray0);
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      MethodLookupUtils.lookupMethod(class1, "join", objectArray0);
      MethodLookupUtils.lookupStaticMethod(class0, "org.apache.commons.jxpath.util.MethodLookupUtils", objectArray0);
      Class<Integer> class2 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class2, "join", objectArray0);
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) class0;
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      MethodLookupUtils.lookupStaticMethod(class0, "compareToIgnoreCas", objectArray0);
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
}