/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 02:34:48 GMT 2018
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
      Object[] objectArray0 = new Object[0];
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      MethodLookupUtils.lookupStaticMethod(class0, "java.lang.Byte", objectArray0);
      Class<Integer> class1 = Integer.class;
      MethodLookupUtils.lookupMethod(class1, "org.apache.commons.jxpath.util.MethodLookupUtils", objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      MethodLookupUtils.lookupStaticMethod(class0, "java.util.concurrent.atomic.AtomicLong", objectArray0);
      MethodLookupUtils.lookupMethod(class1, "", objectArray0);
      Class<Integer> class2 = Integer.class;
      Object[] objectArray1 = new Object[1];
      objectArray1[0] = (Object) null;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class2, (String) null, objectArray1);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[1];
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
  public void test02()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "valueOf";
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "valueOf", objectArray0);
      assertFalse(method0.isAccessible());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "Ambigous method call: ";
      MethodLookupUtils.lookupMethod(class0, "Ambigous method call: ", objectArray0);
      Class<String> class1 = String.class;
      MethodLookupUtils.lookupStaticMethod(class1, "XLJaKEr2)zOK", objectArray0);
      MethodLookupUtils.lookupConstructor(class1, objectArray0);
      Object[] objectArray1 = new Object[2];
      objectArray1[0] = (Object) class1;
      Object object0 = new Object();
      objectArray1[1] = object0;
      MethodLookupUtils.lookupStaticMethod(class0, "XLJaKEr2)zOK", objectArray1);
      Method method0 = MethodLookupUtils.lookupStaticMethod(class1, "O1kZt(", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "toUpperCase";
      Method method0 = MethodLookupUtils.lookupMethod(class0, "toUpperCase", objectArray0);
      assertFalse(method0.isBridge());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "tM(nzFE}muCX87{_L@X";
      objectArray0[1] = (Object) class0;
      objectArray0[2] = (Object) "tM(nzFE}muCX87{_L@X";
      objectArray0[3] = (Object) class0;
      objectArray0[4] = (Object) class0;
      Object object0 = new Object();
      objectArray0[5] = object0;
      objectArray0[6] = (Object) "tM(nzFE}muCX87{_L@X";
      objectArray0[7] = (Object) "tM(nzFE}muCX87{_L@X";
      objectArray0[8] = (Object) class0;
      MethodLookupUtils.lookupStaticMethod(class0, "tM(nzFE}muCX87{_L@X", objectArray0);
      MethodLookupUtils.lookupStaticMethod(class0, "", objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      TypeUtils.setTypeConverter(typeConverter0);
      MethodLookupUtils.lookupStaticMethod(class0, "", objectArray0);
      Class<Object> class1 = Object.class;
      MethodLookupUtils.lookupStaticMethod(class1, "tM(nzFE}muCX87{_L@X", objectArray0);
      Class<Object> class2 = Object.class;
      MethodLookupUtils.lookupConstructor(class2, objectArray0);
      Class<Object> class3 = Object.class;
      MethodLookupUtils.lookupStaticMethod(class3, "", objectArray0);
      Class<Object> class4 = Object.class;
      Object[] objectArray1 = new Object[4];
      objectArray1[0] = (Object) null;
      objectArray1[1] = (Object) class3;
      objectArray1[2] = (Object) "tM(nzFE}muCX87{_L@X";
      objectArray1[3] = (Object) class0;
      MethodLookupUtils.lookupConstructor(class4, objectArray1);
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      Method method0 = MethodLookupUtils.lookupMethod(class0, "7Va7m +H'{GTm", objectArray1);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) class0;
      Object object0 = new Object();
      objectArray0[2] = object0;
      objectArray0[3] = (Object) class0;
      objectArray0[4] = (Object) class0;
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      Class<Object> class1 = Object.class;
      MethodLookupUtils.lookupMethod(class1, "org.apache.commons.jxpath.ExpressionContext", objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      Class<Object> class2 = Object.class;
      MethodLookupUtils.lookupConstructor(class2, objectArray0);
      Class<Integer> class3 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class3, "java.lang.Object", objectArray0);
      Class<Integer> class4 = Integer.class;
      MethodLookupUtils.lookupConstructor(class4, objectArray0);
      MethodLookupUtils.lookupStaticMethod(class0, "org.apache.commons.jxpath.ExpressionContext", objectArray0);
      Class<Integer> class5 = Integer.class;
      MethodLookupUtils.lookupConstructor(class5, objectArray0);
      MethodLookupUtils.lookupStaticMethod(class3, "$C&7iO5ic2]pdsPv;", (Object[]) null);
      MethodLookupUtils.lookupConstructor(class4, objectArray0);
      Class<Integer> class6 = Integer.class;
      MethodLookupUtils.lookupMethod(class6, "org.apache.commons.jxpath.ExpressionContext", objectArray0);
      Class<String> class7 = String.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class7, "", (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<Integer> class0 = Integer.class;
      Object[] objectArray1 = new Object[1];
      objectArray1[0] = (Object) class0;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupConstructor(class0, objectArray1);
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
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "org.apache.commons.jxpath.util.MethodLookupUtils";
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "org.apache.commons.jxpath.util.MethodLookupUtils", objectArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"org.apache.commons.jxpath.util.MethodLookupUtils\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      TypeUtils.setTypeConverter(typeConverter0);
      Class<Object> class0 = Object.class;
      MethodLookupUtils.lookupMethod(class0, (String) null, (Object[]) null);
      Class<Object> class1 = Object.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class1, (Object[]) null);
      Class<Object> class2 = Object.class;
      MethodLookupUtils.lookupMethod(class2, (String) null, (Object[]) null);
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) null;
      objectArray0[1] = (Object) null;
      objectArray0[2] = (Object) null;
      objectArray0[3] = (Object) class2;
      objectArray0[4] = (Object) class2;
      objectArray0[5] = (Object) class0;
      objectArray0[6] = (Object) constructor0;
      objectArray0[7] = (Object) null;
      MethodLookupUtils.lookupStaticMethod(class0, ".Mlv", objectArray0);
      MethodLookupUtils.lookupMethod(class0, (String) null, (Object[]) null);
      Class<Object> class3 = Object.class;
      MethodLookupUtils.lookupStaticMethod(class3, ".Mlv", (Object[]) null);
      Class<Object> class4 = Object.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod(class4, (String) null, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Object> class0 = Object.class;
      String string0 = null;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) null;
      MethodLookupUtils.lookupMethod(class0, (String) null, objectArray0);
      Class<Object> class1 = Object.class;
      MethodLookupUtils.lookupStaticMethod(class1, "org.apache.commons.jxpath.util.MethodLookupUtils", objectArray0);
      String string1 = "%h]a`+u602{Gj";
      MethodLookupUtils.lookupMethod(class1, "%h]a`+u602{Gj", objectArray0);
      MethodLookupUtils.lookupMethod(class0, "%h]a`+u602{Gj", objectArray0);
      String string2 = "java.lang.Object";
      MethodLookupUtils.lookupStaticMethod(class0, "java.lang.Object", objectArray0);
      Class<Integer> class2 = Integer.class;
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
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[6];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) class0;
      objectArray0[2] = (Object) class0;
      objectArray0[3] = (Object) class0;
      objectArray0[4] = (Object) class0;
      objectArray0[5] = (Object) class0;
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      Object[] objectArray1 = new Object[6];
      objectArray1[0] = (Object) class0;
      objectArray1[1] = (Object) null;
      Object object1 = new Object();
      objectArray1[2] = object1;
      objectArray1[3] = object0;
      objectArray1[4] = (Object) null;
      objectArray1[5] = (Object) null;
      MethodLookupUtils.lookupMethod(class0, (String) null, objectArray1);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      MethodLookupUtils.lookupStaticMethod(class0, "COR", objectArray1);
      Class<Object> class1 = Object.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class1, (String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) class0;
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      Class<Integer> class1 = Integer.class;
      String string0 = "org.apache.commons.jxpath.ExpressionContext";
      MethodLookupUtils.lookupStaticMethod(class1, "org.apache.commons.jxpath.ExpressionContext", objectArray0);
      MethodLookupUtils.lookupStaticMethod(class1, "org.apache.commons.jxpath.ExpressionContext", objectArray0);
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      Class<String> class2 = String.class;
      Object[] objectArray1 = new Object[2];
      objectArray1[0] = (Object) null;
      objectArray1[1] = (Object) "org.apache.commons.jxpath.ExpressionContext";
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupConstructor(class2, objectArray1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/logging/LogFactory
         //
         verifyException("org.apache.commons.beanutils.ConvertUtilsBean", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class<Object> class0 = Object.class;
      MethodLookupUtils.lookupMethod(class0, "Ambigous method call: ", objectArray0);
      Class<Object> class1 = Object.class;
      Object object0 = new Object();
      MethodLookupUtils.lookupStaticMethod(class1, "hashCode", objectArray0);
      Class<String> class2 = String.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class2, objectArray0);
      assertEquals("public java.lang.String()", constructor0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "equalsIgnoreCase";
      Method method0 = MethodLookupUtils.lookupMethod(class0, "equalsIgnoreCase", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "Ambigous methodncall2 ";
      MethodLookupUtils.lookupMethod(class0, "Ambigous methodncall2 ", objectArray0);
      Class<Object> class1 = Object.class;
      MethodLookupUtils.lookupMethod(class1, "Ambigous constructor ", objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<String> class2 = String.class;
      MethodLookupUtils.lookupStaticMethod(class2, "XLJaKEr2)zOK", objectArray0);
      Class<Object> class3 = Object.class;
      MethodLookupUtils.lookupConstructor(class3, objectArray0);
      MethodLookupUtils.lookupMethod(class1, "XLJaKEr2)zOK", objectArray0);
      Method method0 = MethodLookupUtils.lookupMethod(class3, "equalsIgnoreCase", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = new Object();
      Class<Integer> class0 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class0, "hashCode", (Object[]) null);
      Class<String> class1 = String.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class1, (Object[]) null);
      assertEquals(1, constructor0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      MethodLookupUtils.lookupMethod(class0, "Ambigous method call: ", (Object[]) null);
      Object object0 = new Object();
      Class<Integer> class1 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class1, "hashCode", (Object[]) null);
      MethodLookupUtils.lookupConstructor(class0, (Object[]) null);
      Class<Object> class2 = Object.class;
      Method method0 = MethodLookupUtils.lookupMethod(class2, "format", (Object[]) null);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "equalsIgnoreCase";
      Method method0 = MethodLookupUtils.lookupMethod(class0, "equalsIgnoreCase", objectArray0);
      assertFalse(method0.isVarArgs());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<Integer> class0 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class0, "hashCode", objectArray0);
      MethodLookupUtils.lookupMethod(class0, "vkj3 p6H4(1N??I", objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<Integer> class0 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class0, "toUnsignedLong", objectArray0);
      Class<Integer> class1 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class1, "CP(F&dt2O", objectArray0);
      Class<String> class2 = String.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupStaticMethod(class2, "valueOf", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous method call: valueOf
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "getBytes";
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
  public void test24()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "getBytes";
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "contentEquals", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous method call: contentEquals
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "valueOf";
      Object object0 = new Object();
      objectArray0[1] = object0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "valueOf", objectArray0);
      assertFalse(method0.isBridge());
  }
}