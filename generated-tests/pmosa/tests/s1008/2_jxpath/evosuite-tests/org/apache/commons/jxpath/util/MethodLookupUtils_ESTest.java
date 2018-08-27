/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 13:20:11 GMT 2018
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
      Object object0 = new Object();
      Object[] objectArray0 = new Object[1];
      Object object1 = new Object();
      objectArray0[0] = object1;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "q,v;v.Q\"wp -nf ", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
      Method method0 = MethodLookupUtils.lookupMethod(class0, "toString", objectArray0);
      assertFalse(method0.isSynthetic());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) class0;
      MethodLookupUtils.lookupMethod(class0, "cowpareTo", objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[0];
      MethodLookupUtils.lookupMethod(class0, "compareTo", objectArray0);
      Class<String> class1 = String.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class1, objectArray0);
      assertEquals(1, constructor0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[8];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) class0;
      objectArray0[2] = (Object) null;
      objectArray0[3] = (Object) class0;
      objectArray0[4] = (Object) class0;
      objectArray0[5] = (Object) class0;
      objectArray0[6] = (Object) class0;
      objectArray0[7] = (Object) null;
      MethodLookupUtils.lookupStaticMethod(class0, (String) null, objectArray0);
      Object[] objectArray1 = new Object[5];
      objectArray1[0] = object0;
      objectArray1[1] = (Object) null;
      objectArray1[2] = (Object) class0;
      Object object1 = new Object();
      objectArray1[3] = object1;
      objectArray1[4] = object0;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class0, objectArray1);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class0;
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
  public void test06()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[9];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) class0;
      Object object1 = new Object();
      objectArray0[2] = object1;
      objectArray0[3] = (Object) class0;
      objectArray0[4] = (Object) class0;
      objectArray0[5] = (Object) class0;
      objectArray0[6] = (Object) class0;
      objectArray0[7] = (Object) class0;
      objectArray0[8] = (Object) class0;
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<String> class1 = String.class;
      MethodLookupUtils.lookupConstructor(class1, objectArray0);
      Class<String> class2 = String.class;
      String string0 = "[f!MOiA1\"?Q#~C";
      MethodLookupUtils.lookupStaticMethod(class2, "[f!MOiA1\"?Q#~C", objectArray0);
      MethodLookupUtils.lookupStaticMethod(class0, "Ambigous constructor ", objectArray0);
      String string1 = "^m1KLI\\nb8]!B*(2";
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class0, "^m1KLI\nb8]!B*(2", objectArray0);
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
      Object[] objectArray0 = new Object[0];
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      TypeUtils.setTypeConverter(typeConverter0);
      Class<String> class1 = String.class;
      MethodLookupUtils.lookupStaticMethod(class1, "", objectArray0);
      Class<String> class2 = String.class;
      MethodLookupUtils.lookupConstructor(class2, objectArray0);
      Method method0 = MethodLookupUtils.lookupMethod(class2, "", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<String> class0 = String.class;
      String string0 = null;
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) null;
      objectArray0[2] = (Object) null;
      objectArray0[3] = (Object) null;
      Object object0 = new Object();
      objectArray0[4] = object0;
      objectArray0[5] = (Object) class0;
      MethodLookupUtils.lookupMethod(class0, (String) null, objectArray0);
      Class<Object> class1 = Object.class;
      MethodLookupUtils.lookupStaticMethod(class1, (String) null, objectArray0);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Object> class2 = Object.class;
      MethodLookupUtils.lookupMethod(class2, (String) null, objectArray0);
      Class<Integer> class3 = Integer.class;
      MethodLookupUtils.lookupConstructor(class3, objectArray0);
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      doReturn((Object) null).when(typeConverter0).convert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      Class<Integer> class4 = Integer.class;
      MethodLookupUtils.lookupMethod(class4, (String) null, objectArray0);
      Class<Object> class5 = Object.class;
      String string1 = "";
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupMethod(class5, "", objectArray0);
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
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[1] = (Object) class0;
      MethodLookupUtils.lookupMethod(class0, "com(pareTo", objectArray0);
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
  public void test10()  throws Throwable  {
      Class<String> class0 = String.class;
      MethodLookupUtils.lookupMethod(class0, "#4g#8B8F&!9Ns[oa%", (Object[]) null);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Object> class1 = Object.class;
      MethodLookupUtils.lookupStaticMethod(class1, "#4g#8B8F&!9Ns[oa%", (Object[]) null);
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      TypeUtils.setTypeConverter(typeConverter0);
      TypeConverter typeConverter1 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(typeConverter1).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter1);
      MethodLookupUtils.lookupStaticMethod(class0, "", (Object[]) null);
      Class<String> class2 = String.class;
      MethodLookupUtils.lookupMethod(class2, "5J8V=p1KtzB(-,0o9", (Object[]) null);
      MethodLookupUtils.lookupStaticMethod(class0, "#4g#8B8F&!9Ns[oa%", (Object[]) null);
      MethodLookupUtils.lookupStaticMethod(class0, "#4g#8B8F&!9Ns[oa%", (Object[]) null);
      Class<Object> class3 = Object.class;
      MethodLookupUtils.lookupMethod(class3, "#4g#8B8F&!9Ns[oa%", (Object[]) null);
      MethodLookupUtils.lookupConstructor(class3, (Object[]) null);
      Class<Object> class4 = Object.class;
      MethodLookupUtils.lookupStaticMethod(class4, "", (Object[]) null);
      MethodLookupUtils.lookupMethod(class2, "#4g#8B8F&!9Ns[oa%", (Object[]) null);
      Class<String> class5 = String.class;
      MethodLookupUtils.lookupConstructor(class5, (Object[]) null);
      Class<Object> class6 = Object.class;
      MethodLookupUtils.lookupMethod(class6, "5J8V=p1KtzB(-,0o9", (Object[]) null);
      Class<Integer> class7 = Integer.class;
      MethodLookupUtils.lookupMethod(class7, "", (Object[]) null);
      MethodLookupUtils.lookupStaticMethod(class4, "5)b+jCYp1jR~,|kV$", (Object[]) null);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) class5;
      MethodLookupUtils.lookupConstructor(class0, objectArray0);
      Class<Integer> class8 = Integer.class;
      MethodLookupUtils.lookupMethod(class8, "5)b+jCYp1jR~,|kV$", objectArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<String> class0 = String.class;
      MethodLookupUtils.lookupMethod(class0, "~j;5|4VJvk'nqR[o`{cN", objectArray0);
      Class<Integer> class1 = Integer.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupConstructor(class1, objectArray0);
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
      Object object0 = new Object();
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Integer> class0 = Integer.class;
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "hashCode", (Object[]) null);
      assertNotNull(method0);
      assertEquals(1, method0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object[] objectArray0 = new Object[2];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) "toString";
      MethodLookupUtils.lookupStaticMethod(class0, "toString", objectArray0);
      Method method0 = MethodLookupUtils.lookupMethod(class0, "toString", objectArray0);
      assertNull(method0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) class0;
      objectArray0[2] = (Object) "compareTo";
      objectArray0[3] = (Object) "compareTo";
      objectArray0[4] = (Object) "compareTo";
      MethodLookupUtils.lookupMethod(class0, "compareTo", objectArray0);
      MethodLookupUtils.lookupStaticMethod(class0, "compareTo", objectArray0);
      Class<Integer> class1 = Integer.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class1, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) class0;
      String string0 = "compareTo";
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
  public void test16()  throws Throwable  {
      Class<String> class0 = String.class;
      MethodLookupUtils.lookupMethod(class0, "#4g#8B8F&!9Ns[oa%", (Object[]) null);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Object> class1 = Object.class;
      Object object0 = new Object();
      Class<Object> class2 = Object.class;
      MethodLookupUtils.lookupConstructor(class2, (Object[]) null);
      MethodLookupUtils methodLookupUtils1 = new MethodLookupUtils();
      Class<Integer> class3 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class3, "#4g#8B8F&!9Ns[oa%", (Object[]) null);
      Class<Object> class4 = Object.class;
      MethodLookupUtils.lookupConstructor(class4, (Object[]) null);
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, false, false, false).when(typeConverter0).canConvert(any() , any(java.lang.Class.class));
      TypeUtils.setTypeConverter(typeConverter0);
      MethodLookupUtils.lookupConstructor(class1, (Object[]) null);
      MethodLookupUtils.lookupStaticMethod(class0, "format", (Object[]) null);
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) class1;
      Object object1 = new Object();
      objectArray0[1] = object1;
      objectArray0[2] = (Object) "#4g#8B8F&!9Ns[oa%";
      objectArray0[3] = (Object) methodLookupUtils0;
      MethodLookupUtils.lookupStaticMethod(class4, "format", objectArray0);
      Class<String> class5 = String.class;
      Constructor constructor0 = MethodLookupUtils.lookupConstructor(class5, objectArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) "valueOf";
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "valueOf", objectArray0);
      assertFalse(method0.isSynthetic());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<String> class0 = String.class;
      MethodLookupUtils.lookupMethod(class0, "#4g#8B8F&!9Ns[oa%", (Object[]) null);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Object> class1 = Object.class;
      Object object0 = new Object();
      Class<Object> class2 = Object.class;
      MethodLookupUtils.lookupConstructor(class2, (Object[]) null);
      MethodLookupUtils methodLookupUtils1 = new MethodLookupUtils();
      Class<Object> class3 = Object.class;
      MethodLookupUtils.lookupConstructor(class3, (Object[]) null);
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      TypeUtils.setTypeConverter(typeConverter0);
      MethodLookupUtils.lookupConstructor(class1, (Object[]) null);
      Class<String> class4 = String.class;
      MethodLookupUtils.lookupStaticMethod(class4, "format", (Object[]) null);
      MethodLookupUtils.lookupStaticMethod(class0, "#4g#8B8F&!9Ns[oa%", (Object[]) null);
      MethodLookupUtils.lookupStaticMethod(class1, "#4g#8B8F&!9Ns[oa%", (Object[]) null);
      Method method0 = MethodLookupUtils.lookupStaticMethod(class0, "toString", (Object[]) null);
      assertFalse(method0.isVarArgs());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<String> class0 = String.class;
      MethodLookupUtils.lookupMethod(class0, "#4g#8B8F&!9Ns[oa%", (Object[]) null);
      MethodLookupUtils methodLookupUtils0 = new MethodLookupUtils();
      Class<Object> class1 = Object.class;
      MethodLookupUtils.lookupStaticMethod(class1, "#4g#8B8F&!9Ns[oa%", (Object[]) null);
      TypeConverter typeConverter0 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      TypeUtils.setTypeConverter(typeConverter0);
      Object object0 = new Object();
      TypeConverter typeConverter1 = mock(TypeConverter.class, new ViolatedAssumptionAnswer());
      TypeUtils.setTypeConverter(typeConverter1);
      MethodLookupUtils.lookupStaticMethod(class0, "", (Object[]) null);
      Class<String> class2 = String.class;
      MethodLookupUtils.lookupStaticMethod(class0, "#4g#8B8F&!9Ns[oa%", (Object[]) null);
      MethodLookupUtils.lookupStaticMethod(class0, "#4g#8B8F&!9Ns[oa%", (Object[]) null);
      Class<Object> class3 = Object.class;
      MethodLookupUtils.lookupMethod(class3, "#4g#8B8F&!9Ns[oa%", (Object[]) null);
      MethodLookupUtils.lookupConstructor(class3, (Object[]) null);
      Class<Object> class4 = Object.class;
      MethodLookupUtils.lookupStaticMethod(class4, "", (Object[]) null);
      MethodLookupUtils.lookupMethod(class2, "#4g#8B8F&!9Ns[oa%", (Object[]) null);
      Class<String> class5 = String.class;
      MethodLookupUtils.lookupConstructor(class5, (Object[]) null);
      Class<Object> class6 = Object.class;
      MethodLookupUtils.lookupMethod(class6, "", (Object[]) null);
      Class<Integer> class7 = Integer.class;
      MethodLookupUtils.lookupMethod(class7, "", (Object[]) null);
      MethodLookupUtils.lookupStaticMethod(class4, "5)b+jCYp1jR~,|kV$", (Object[]) null);
      Object[] objectArray0 = new Object[1];
      Class<Integer> class8 = Integer.class;
      // Undeclared exception!
      try { 
        MethodLookupUtils.lookupConstructor(class8, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Ambigous constructor [null]
         //
         verifyException("org.apache.commons.jxpath.util.MethodLookupUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) class0;
      objectArray0[0] = (Object) "?uy1`Odra,r|^-J:";
      String string0 = "compareTo";
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
  public void test21()  throws Throwable  {
      Class<String> class0 = String.class;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) class0;
      objectArray0[1] = (Object) class0;
      MethodLookupUtils.lookupMethod(class0, "compareTo", objectArray0);
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
  public void test22()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Class<Integer> class0 = Integer.class;
      MethodLookupUtils.lookupMethod(class0, "reverse", objectArray0);
      Class<Integer> class1 = Integer.class;
      MethodLookupUtils.lookupStaticMethod(class1, "reverse", objectArray0);
      Class<Integer> class2 = Integer.class;
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
}