/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 04:08:38 GMT 2019
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaBeanInfo_ESTest extends JavaBeanInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      assertEquals("void", class1.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      assertFalse(class1.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      Constructor<Integer>[] constructorArray0 = (Constructor<Integer>[]) Array.newInstance(Constructor.class, 3);
      // Undeclared exception!
      try { 
        JavaBeanInfo.getDefaultConstructor(class0, constructorArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      Constructor<?> constructor0 = JavaBeanInfo.getDefaultConstructor(class1, (Constructor<?>[]) null);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      Constructor<?> constructor0 = JavaBeanInfo.getDefaultConstructor(class0, (Constructor<?>[]) null);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        JavaBeanInfo.getCreatorConstructor((Constructor[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertFalse(class1.isInterface());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<?> class0 = JavaBeanInfo.getBuilderClass((JSONType) null);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      Class<AtomicLong> class0 = AtomicLong.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) null, propertyNamingStrategy0, true, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Type[] typeArray0 = new Type[5];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[4], typeArray0[1]);
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) parameterizedTypeImpl0, propertyNamingStrategy0, true, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) null, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Constructor<String>[] constructorArray0 = (Constructor<String>[]) Array.newInstance(Constructor.class, 0);
      // Undeclared exception!
      try { 
        JavaBeanInfo.getDefaultConstructor((Class<?>) null, constructorArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.Reflection", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        JavaBeanInfo.build((Class<?>) null, (Type) class0, (PropertyNamingStrategy) null, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl((Type[]) null, (Type) null, class0);
      // Undeclared exception!
      try { 
        JavaBeanInfo.build((Class<?>) null, (Type) parameterizedTypeImpl0, propertyNamingStrategy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        JavaBeanInfo.add((List<FieldInfo>) null, (FieldInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      Class<Void> class1 = Void.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class1).when(jSONType0).builder();
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertNull(class2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      Class<?> class1 = JavaBeanInfo.getBuilderClass(class0, (JSONType) null);
      assertNull(class1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(jSONType0).builder();
      Class<?> class0 = JavaBeanInfo.getBuilderClass((Class<?>) null, jSONType0);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Constructor<Integer>[] constructorArray0 = (Constructor<Integer>[]) Array.newInstance(Constructor.class, 3);
      // Undeclared exception!
      try { 
        JavaBeanInfo.getCreatorConstructor(constructorArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Constructor<Object>[] constructorArray0 = (Constructor<Object>[]) Array.newInstance(Constructor.class, 0);
      Constructor<?> constructor0 = JavaBeanInfo.getCreatorConstructor(constructorArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<String> class0 = String.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      Class<Void> class1 = Void.TYPE;
      Type type0 = FieldInfo.getFieldType(class0, class1, class1);
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build(class1, type0, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      Class<String> class1 = String.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class1, (Type) class0, propertyNamingStrategy0);
      Class<AtomicInteger> class2 = AtomicInteger.class;
      Class<Object> class3 = Object.class;
      JavaBeanInfo javaBeanInfo1 = new JavaBeanInfo(class2, class3, javaBeanInfo0.defaultConstructor, javaBeanInfo0.defaultConstructor, (Method) null, (Method) null, (JSONType) null, linkedList0);
      assertEquals(0, javaBeanInfo1.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<AtomicInteger> class1 = AtomicInteger.class;
      Class<AtomicLong> class2 = AtomicLong.class;
      Class<Object> class3 = Object.class;
      FieldInfo fieldInfo0 = new FieldInfo("java.lang.Integer", (Class<?>) null, class3, javaBeanInfo0.clazz, (Field) null, 2745, 115, 115);
      linkedList0.add(fieldInfo0);
      FieldInfo fieldInfo1 = new FieldInfo("N=n~[LJ(GsciZ~Qq@8W", class1, class2, class1, (Field) null, 115, 0, 0);
      linkedList0.add(fieldInfo1);
      JavaBeanInfo javaBeanInfo1 = new JavaBeanInfo(class0, javaBeanInfo0.clazz, javaBeanInfo0.creatorConstructor, javaBeanInfo0.creatorConstructor, (Method) null, (Method) null, (JSONType) null, linkedList0);
      assertEquals(1, javaBeanInfo1.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      Class<FieldInfo> class0 = FieldInfo.class;
      Class<Void> class1 = Void.TYPE;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class1, propertyNamingStrategy0, true, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<AtomicInteger> class0 = AtomicInteger.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build(class1, (Type) class1, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<AtomicLong> class0 = AtomicLong.class;
      FieldInfo fieldInfo0 = new FieldInfo("7", class0, class0, class0, (Field) null, 3, 73, 254);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo.add(linkedList0, fieldInfo0);
      Class<String> class1 = String.class;
      FieldInfo fieldInfo1 = new FieldInfo("7", fieldInfo0.declaringClass, class1, class0, (Field) null, 3, 14, 3);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo1);
      assertEquals(1, linkedList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<AtomicLong> class0 = AtomicLong.class;
      FieldInfo fieldInfo0 = new FieldInfo("7", class0, class0, class0, (Field) null, 254, 73, 254);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo.add(linkedList0, fieldInfo0);
      Class<Integer> class1 = Integer.class;
      Class<FieldInfo> class2 = FieldInfo.class;
      FieldInfo fieldInfo1 = new FieldInfo("7", class1, class2, fieldInfo0.declaringClass, (Field) null, 420, 2725, (-1982477622));
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo1);
      assertFalse(linkedList0.contains(fieldInfo0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<AtomicInteger> class0 = AtomicInteger.class;
      Class<AtomicLong> class1 = AtomicLong.class;
      FieldInfo fieldInfo0 = new FieldInfo("N=n~[LJ(GsciZ~Qq@8W", class0, class1, class0, (Field) null, 115, 0, 0);
      linkedList0.add(fieldInfo0);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<AtomicInteger> class1 = AtomicInteger.class;
      Class<AtomicLong> class2 = AtomicLong.class;
      FieldInfo fieldInfo0 = new FieldInfo("N=n~[LJ(GsciZ~Qq@8W", class1, class2, class1, (Field) null, 115, 0, 0);
      linkedList0.add(fieldInfo0);
      JavaBeanInfo javaBeanInfo1 = new JavaBeanInfo(class0, javaBeanInfo0.clazz, javaBeanInfo0.creatorConstructor, javaBeanInfo0.creatorConstructor, (Method) null, (Method) null, (JSONType) null, linkedList0);
      assertEquals(1, javaBeanInfo1.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      Class<AtomicLong> class1 = AtomicLong.class;
      JavaBeanInfo javaBeanInfo1 = new JavaBeanInfo(class1, class1, (Constructor<?>) null, javaBeanInfo0.creatorConstructor, (Method) null, (Method) null, (JSONType) null, linkedList0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, (PropertyNamingStrategy) null, true, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      String[] stringArray0 = new String[2];
      stringArray0[0] = ";*n?D";
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn(";*n?D").when(jSONType0).typeKey();
      doReturn(";*n?D").when(jSONType0).typeName();
      Class<Annotation> class1 = Annotation.class;
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<AtomicLong> class2 = AtomicLong.class;
      Class<FieldInfo> class3 = FieldInfo.class;
      FieldInfo fieldInfo0 = new FieldInfo(";*n?D", class2, class3, class0, (Field) null, 75, (-411), 2715);
      linkedList0.addFirst(fieldInfo0);
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class1, class0, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[2];
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("*n?@").when(jSONType0).typeKey();
      doReturn("*n?@").when(jSONType0).typeName();
      Class<String> class0 = String.class;
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<Integer> class1 = Integer.class;
      FieldInfo fieldInfo0 = new FieldInfo("E", class1, class0, class1, (Field) null, (-2788), (-2788), (-2788));
      linkedList0.add(fieldInfo0);
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class0, class0, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      String[] stringArray0 = new String[0];
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn(";*n?D").when(jSONType0).typeKey();
      doReturn(";*n?D").when(jSONType0).typeName();
      Class<Annotation> class1 = Annotation.class;
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class1, class0, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((String[]) null).when(jSONType0).orders();
      doReturn("get").when(jSONType0).typeKey();
      doReturn("get").when(jSONType0).typeName();
      Class<Annotation> class1 = Annotation.class;
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo0 = null;
      try {
        javaBeanInfo0 = new JavaBeanInfo(class1, class0, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((String[]) null).when(jSONType0).orders();
      doReturn("").when(jSONType0).typeKey();
      doReturn("").when(jSONType0).typeName();
      Class<Annotation> class1 = Annotation.class;
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo0 = null;
      try {
        javaBeanInfo0 = new JavaBeanInfo(class1, class0, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) null, (PropertyNamingStrategy) null);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }
}
