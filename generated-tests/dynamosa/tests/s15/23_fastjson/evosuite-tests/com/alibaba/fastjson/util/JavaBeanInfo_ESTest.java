/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 01:59:38 GMT 2019
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
      Class<Object> class0 = Object.class;
      Class<Void> class1 = Void.TYPE;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class1).when(jSONType0).builder();
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertTrue(class2.isPrimitive());
      assertNotNull(class2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      assertEquals("void", class1.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      Class<AtomicBoolean> class2 = AtomicBoolean.class;
      JSONType jSONType1 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class1).when(jSONType1).builder();
      Class<?> class3 = JavaBeanInfo.getBuilderClass(class2, jSONType1);
      assertNotNull(class3);
      assertTrue(class3.isInterface());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Constructor<Object>[] constructorArray0 = (Constructor<Object>[]) Array.newInstance(Constructor.class, 7);
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
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        JavaBeanInfo.getDefaultConstructor((Class<?>) null, (Constructor<?>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.Reflection", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Constructor<AtomicBoolean>[] constructorArray0 = (Constructor<AtomicBoolean>[]) Array.newInstance(Constructor.class, 0);
      Class<Annotation> class0 = Annotation.class;
      Constructor<?> constructor0 = JavaBeanInfo.getDefaultConstructor(class0, constructorArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertNull(class1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertNull(class1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<String> class0 = String.class;
      Type[] typeArray0 = new Type[3];
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl(typeArray0, typeArray0[2], class0);
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) parameterizedTypeImpl0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      // Undeclared exception!
      try { 
        JavaBeanInfo.build((Class<?>) null, (Type) null, propertyNamingStrategy0, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      // Undeclared exception!
      try { 
        JavaBeanInfo.build((Class<?>) null, (Type) class0, propertyNamingStrategy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<Void> class1 = Void.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class1).when(jSONType0).builder();
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertNull(class2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<?> class0 = JavaBeanInfo.getBuilderClass((Class<?>) null, (JSONType) null);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Constructor<AtomicBoolean>[] constructorArray0 = (Constructor<AtomicBoolean>[]) Array.newInstance(Constructor.class, 1);
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
  public void test16()  throws Throwable  {
      Constructor<AtomicBoolean>[] constructorArray0 = (Constructor<AtomicBoolean>[]) Array.newInstance(Constructor.class, 0);
      Constructor<?> constructor0 = JavaBeanInfo.getCreatorConstructor(constructorArray0);
      assertNull(constructor0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      Class<Integer> class0 = Integer.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, false);
      JavaBeanInfo.build(javaBeanInfo0.clazz, (Type) null, propertyNamingStrategy0, false, false);
      Class<Integer> class1 = Integer.class;
      JavaBeanInfo.build((Class<?>) class1, (Type) class1, propertyNamingStrategy0, false, true);
      // Undeclared exception!
      JavaBeanInfo.build((Class<?>) class0, (Type) class1, propertyNamingStrategy0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      Class<Annotation> class0 = Annotation.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) null, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Void> class1 = Void.TYPE;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class1, (Type) class0, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      Class<Object> class0 = Object.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, true);
      Class<String> class1 = String.class;
      Type type0 = FieldInfo.getFieldType(javaBeanInfo0.clazz, class1, class0);
      ParameterizedTypeImpl parameterizedTypeImpl0 = new ParameterizedTypeImpl((Type[]) null, type0, class1);
      JavaBeanInfo javaBeanInfo1 = JavaBeanInfo.build((Class<?>) class1, (Type) parameterizedTypeImpl0, propertyNamingStrategy0, false, true);
      assertEquals(0, javaBeanInfo1.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<AtomicLong> class1 = AtomicLong.class;
      FieldInfo fieldInfo0 = new FieldInfo("*&", class0, class1, class0, (Field) null, (-1444788025), 37, (-1444788025));
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      linkedList0.add(fieldInfo0);
      linkedList0.add(fieldInfo0);
      Class<Object> class2 = Object.class;
      String[] stringArray0 = new String[4];
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("*&").when(jSONType0).typeKey();
      doReturn("qR$zd*:?eUNO_ej%R1}").when(jSONType0).typeName();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(fieldInfo0.fieldClass, class2, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<AtomicInteger> class0 = AtomicInteger.class;
      FieldInfo fieldInfo0 = new FieldInfo("A<1h@K<@v0?W)wWL3j", class0, class0, class0, (Field) null, (-382), 217, (-1604));
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(fieldInfo0.fieldClass, fieldInfo0.declaringClass, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, (JSONType) null, linkedList0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Void> class0 = Void.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      assertNull(class1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      Class<FieldInfo> class0 = FieldInfo.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, true, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      Class<Void> class0 = Void.TYPE;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<AtomicLong> class1 = AtomicLong.class;
      FieldInfo fieldInfo0 = new FieldInfo("*&", class0, class1, class1, (Field) null, 30, 31, 30);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<Annotation> class2 = Annotation.class;
      FieldInfo fieldInfo1 = new FieldInfo("*&", fieldInfo0.fieldClass, class2, class0, (Field) null, 30, 30, 30);
      JavaBeanInfo.add(linkedList0, fieldInfo1);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      Class<AtomicLong> class1 = AtomicLong.class;
      FieldInfo fieldInfo0 = new FieldInfo("@R)mk~$n+L", class1, class0, class1, (Field) null, 8, 8, 8);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      linkedList0.add(fieldInfo0);
      FieldInfo fieldInfo1 = new FieldInfo("@R)mk~$n+L", fieldInfo0.fieldClass, fieldInfo0.declaringClass, fieldInfo0.declaringClass, (Field) null, 8, 8, 8);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo1);
      assertEquals(1, linkedList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<String> class0 = String.class;
      FieldInfo fieldInfo0 = new FieldInfo("3=Y>_x]~yJH2!Drpfx,", class0, class0, class0, (Field) null, 28, 28, 28);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo.add(linkedList0, fieldInfo0);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) null, (PropertyNamingStrategy) null);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<String> class0 = String.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, (PropertyNamingStrategy) null, true, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<AtomicLong> class1 = AtomicLong.class;
      FieldInfo fieldInfo0 = new FieldInfo("*&", class0, class1, class0, (Field) null, (-1444788025), 37, (-1444788025));
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      linkedList0.add(fieldInfo0);
      Class<Object> class2 = Object.class;
      String[] stringArray0 = new String[4];
      stringArray0[0] = "*&";
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("*&").when(jSONType0).typeKey();
      doReturn("qR$zd*:?eUNO_ej%R1}").when(jSONType0).typeName();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(fieldInfo0.fieldClass, class2, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<AtomicLong> class1 = AtomicLong.class;
      FieldInfo fieldInfo0 = new FieldInfo("", class0, class1, class0, (Field) null, (-1444788025), 37, (-1444788025));
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<Object> class2 = Object.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(fieldInfo0.alternateNames).when(jSONType0).orders();
      doReturn("com.alibaba.fastjson.util.JavaBeanInfo").when(jSONType0).typeKey();
      doReturn("").when(jSONType0).typeName();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(fieldInfo0.fieldClass, class2, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((String[]) null).when(jSONType0).orders();
      doReturn(".z47[I&EfP+").when(jSONType0).typeKey();
      doReturn(".z47[I&EfP+").when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo0 = null;
      try {
        javaBeanInfo0 = new JavaBeanInfo(class0, class0, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Class<AtomicLong> class1 = AtomicLong.class;
      FieldInfo fieldInfo0 = new FieldInfo("*&", class0, class1, class0, (Field) null, (-1444788025), 37, (-1444788025));
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<Object> class2 = Object.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn("").when(jSONType0).typeKey();
      doReturn((String) null).when(jSONType0).typeName();
      JavaBeanInfo javaBeanInfo0 = null;
      try {
        javaBeanInfo0 = new JavaBeanInfo(fieldInfo0.fieldClass, class2, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<?> class0 = JavaBeanInfo.getBuilderClass((JSONType) null);
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }
}
