/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 10:04:28 GMT 2018
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
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) class0;
      Object object0 = new Object();
      objectArray0[1] = object0;
      objectArray0[2] = (Object) methodLookupUtils0;
      objectArray0[3] = (Object) class0;
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      Class<Object> class1 = Object.class;
      Object[] objectArray1 = new Object[2];
      objectArray1[0] = (Object) methodLookupUtils0;
      Object object1 = new Object();
      objectArray1[1] = object1;
      MethodLookupUtils.lookupMethod(class1, "Hj 9sW:Yd", objectArray1);
      Class<Object> class2 = Object.class;
      MethodLookupUtils.lookupStaticMethod(class2, "java.util.List", objectArray1);
      MethodLookupUtils.lookupStaticMethod(class2, "Hj 9sW:Yd", objectArray1);
      Object[] objectArray2 = new Object[3];
      objectArray2[0] = object0;
      objectArray2[1] = (Object) null;
      objectArray2[2] = (Object) "java.util.List";
      Method method0 = MethodLookupUtils.lookupMethod(class0, (String) null, objectArray2);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Class<String> class0 = String.class;
      MethodLookupUtils.lookupMethod(class0, (String) null, objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class<String> class0 = String.class;
      MethodLookupUtils.lookupMethod(class0, "", objectArray0);
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, (Object[]) null);
      assertFalse(constructor0.isSynthetic());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[2];
      Object object0 = new Object();
      objectArray0[0] = object0;
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      Method method0 = MethodLookupUtils.lookupMethod(class0, "", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod((Class) null, "0:R/[0K(F]ON3", (Object[]) null);
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
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "toUpperCase", objectArray0);
      assertEquals(1, method0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) class0;
      objectArray0[2] = (Object) null;
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      objectArray0[3] = (Object) null;
      Object object0 = new Object();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      TypeUtils.setTypeConverter(typeConverter0);
      objectArray0[4] = object0;
      objectArray0[5] = (Object) methodLookupUtils0;
      MethodLookupUtils.lookupStaticMethod(class0, (String) null, objectArray0);
      Class<Object> class1 = Object.class;
      TypeConverter typeConverter1 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      TypeUtils.setTypeConverter(typeConverter1);
      MethodLookupUtils.lookupStaticMethod(class1, (String) null, objectArray0);
      Class<Object> class2 = Object.class;
      MethodLookupUtils.lookupStaticMethod(class2, (String) null, objectArray0);
      Class<Object> class3 = Object.class;
      MethodLookupUtils.lookupConstructor(class3, objectArray0);
      MethodLookupUtils.lookupStaticMethod(class3, (String) null, objectArray0);
      MethodLookupUtils.lookupStaticMethod(class3, (String) null, objectArray0);
      Method method0 = MethodLookupUtils.lookupStaticMethod(class1, "!nn~h", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) methodLookupUtils0;
      objectArray0[1] = (Object) class0;
      objectArray0[2] = (Object) "Cannot convert ";
      Object object0 = new Object();
      objectArray0[3] = object0;
      MethodLookupUtils.lookupStaticMethod(class0, "Cannot convert ", objectArray0);
      Class<Object> class1 = Object.class;
      Object[] objectArray1 = new Object[0];
      MethodLookupUtils.lookupMethod(class1, "org.apache.commons.jxpath.util.TypeUtils", objectArray1);
      Class<Object> class2 = Object.class;
      Object[] objectArray2 = new Object[0];
      MethodLookupUtils.lookupMethod(class2, "java.math.BigDecimal", objectArray2);
      Class<String> class3 = String.class;
      MethodLookupUtils.lookupStaticMethod(class3, "8wgNV,", objectArray2);
      Class<String> class4 = String.class;
      MethodLookupUtils.lookupConstructor(class4, objectArray2);
      MethodLookupUtils.lookupConstructor(class3, objectArray2);
      MethodLookupUtils.lookupConstructor(class1, objectArray2);
      Class<Object> class5 = Object.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class5, ")L-F0~W*d3w~;nL[", objectArray2);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) class0;
      objectArray0[2] = (Object) class0;
      Object object0 = new Object();
      objectArray0[3] = object0;
      objectArray0[4] = (Object) class0;
      objectArray0[5] = (Object) class0;
      objectArray0[6] = (Object) class0;
      objectArray0[7] = (Object) class0;
      Object object1 = new Object();
      objectArray0[8] = object1;
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      MethodLookupUtils.lookupStaticMethod(class0, "l=Im9)tkUc4'#B6H84", objectArray0);
      Class<Object> class1 = Object.class;
      MethodLookupUtils.lookupConstructor(class1, objectArray0);
      Class<Integer> class2 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class2, "l=Im9)tkUc4'#B6H84", objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      MethodLookupUtils.lookupConstructor(class0, (Object[]) null);
      Object[] objectArray1 = new Object[0];
      MethodLookupUtils.lookupConstructor(class0, objectArray1);
      Class<Object> class3 = Object.class;
      MethodLookupUtils.lookupMethod(class3, "java.lang.Integer", (Object[]) null);
      Class<Object> class4 = Object.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class4, "rp=", objectArray1);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) class0;
      MethodLookupUtils.lookupMethod(class0, "getChars", objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) class0;
      objectArray0[2] = (Object) class0;
      Object object0 = new Object();
      objectArray0[3] = object0;
      objectArray0[4] = (Object) class0;
      objectArray0[5] = (Object) class0;
      objectArray0[6] = (Object) class0;
      objectArray0[7] = (Object) class0;
      Object object1 = new Object();
      objectArray0[8] = object1;
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      MethodLookupUtils.lookupStaticMethod(class0, "l=Im9)tkUc4'#B6H84", objectArray0);
      Class<Object> class1 = Object.class;
      MethodLookupUtils.lookupConstructor(class1, objectArray0);
      Class<Integer> class2 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class2, "l=Im9)tkUc4'#B6H84", objectArray0);
      Class<String> class3 = String.class;
      MethodLookupUtils.lookupMethod(class3, "l=Im9)tkUc4'#B6H84", objectArray0);
      Class<Object> class4 = Object.class;
      MethodLookupUtils.lookupConstructor(class4, objectArray0);
      Class<Object> class5 = Object.class;
      MethodLookupUtils.lookupMethod(class5, "Nz(lq@<E", objectArray0);
      MethodLookupUtils.lookupMethod(class3, "Nz(lq@<E", objectArray0);
      Class<Object> class6 = Object.class;
      Method method0 = MethodLookupUtils.lookupMethod(class6, "getSigners", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
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
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<Integer> class0 = Integer.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "toHexString", objectArray0);
      assertEquals("public static java.lang.String java.lang.Integer.toHexString(int)", method0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      MethodLookupUtils.lookupStaticMethod(class0, "2)'nh{Q/", objectArray0);
      MethodLookupUtils.lookupMethod(class0, "2)'nh{Q/", objectArray0);
      MethodLookupUtils methodLookupUtils1 = new MethodLookupUtils();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      doReturn((Object) null).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      String string0 = null;
      Class<Object> class1 = Object.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class1, "2)'nh{Q/", objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "valueOf";
      MethodLookupUtils.lookupStaticMethod(class0, "valueOf", objectArray0);
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertFalse(constructor0.isAccessible());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[0];
      MethodLookupUtils.lookupMethod(class0, (String) null, objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      MethodLookupUtils.lookupStaticMethod(class0, "startsWith", objectArray0);
      Class<String> class1 = String.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class1, "toUpperCase", objectArray0);
      assertFalse(method0.isBridge());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class<Integer> class0 = Integer.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "toHexString", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) methodLookupUtils0;
      objectArray0[1] = (Object) "Q\"6zQVU PUL2";
      objectArray0[2] = (Object) methodLookupUtils0;
      objectArray0[3] = (Object) class0;
      MethodLookupUtils.lookupStaticMethod(class0, "Q\"6zQVU PUL2", objectArray0);
      Class<Object> class1 = Object.class;
      MethodLookupUtils.lookupMethod(class1, "/c(W", objectArray0);
      MethodLookupUtils.lookupStaticMethod(class0, "/c(W", objectArray0);
      MethodLookupUtils.lookupStaticMethod(class0, "org.apache.commons.jxpath.util.MethodLookupUtils", objectArray0);
      Class<Object> class2 = Object.class;
      Class<Object> class3 = Object.class;
      MethodLookupUtils.lookupConstructor(class3, objectArray0);
      MethodLookupUtils methodLookupUtils1 = new MethodLookupUtils();
      Class<Integer> class4 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class4, "toHexString", objectArray0);
      MethodLookupUtils.lookupMethod(class2, "Q\"6zQVU PUL2", objectArray0);
      Method method0 = MethodLookupUtils.lookupStaticMethod(class1, "toHexString", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "1(TX\">b ";
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<String> class0 = String.class;
      MethodLookupUtils.lookupMethod(class0, "valueOf", objectArray0);
      Class<Object> class1 = Object.class;
      Object[] objectArray1 = new Object[8];
      objectArray1[0] = (Object) methodLookupUtils0;
      objectArray1[1] = (Object) "1(TX\">b ";
      objectArray1[2] = (Object) class1;
      objectArray1[3] = (Object) methodLookupUtils0;
      objectArray1[7] = (Object) class1;
      MethodLookupUtils.lookupConstructor(class1, objectArray1);
      Class<String> class2 = String.class;
      Class<Integer> class3 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class3, "toHexString", objectArray0);
      MethodLookupUtils.lookupConstructor(class2, objectArray0);
      Class<String> class4 = String.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod(class4, "valueOf", objectArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/logging/LogFactory
         //
         verifyException("org.apache.commons.beanutils.ConvertUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) class0;
      MethodLookupUtils.lookupMethod(class0, "toUpperCase", objectArray0);
      Object[] objectArray1 = new Object[2];
      objectArray1[0] = (Object) class0;
      MethodLookupUtils.lookupMethod(class0, "{`'8)m,&+2d/", objectArray1);
      MethodLookupUtils.lookupMethod(class0, "compareToIgnoreCase", objectArray1);
      MethodLookupUtils.lookupStaticMethod(class0, "indexOf", objectArray0);
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "indexOf", objectArray1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous method call: indexOf
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<String> class0 = String.class;
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<String> class1 = String.class;
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) class1;
      objectArray0[1] = (Object) "valueOf";
      objectArray0[2] = (Object) methodLookupUtils0;
      objectArray0[3] = (Object) class1;
      objectArray0[4] = (Object) class0;
      MethodLookupUtils.lookupStaticMethod(class1, "rotateRight", objectArray0);
      Object[] objectArray1 = new Object[2];
      objectArray1[0] = (Object) class0;
      Object object0 = new Object();
      objectArray1[1] = object0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "valueOf", objectArray1);
      assertEquals(9, method0.getModifiers());
  }
}
