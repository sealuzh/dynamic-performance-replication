/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 11:10:24 GMT 2018
 */

package com.alibaba.fastjson.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.TypeUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedList;
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
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      // Undeclared exception!
      try { 
        JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // default constructor not found. class java.lang.Integer
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Void> class0 = Void.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, false);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<AtomicLong> class0 = AtomicLong.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, true, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, true, true);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Method> class0 = Method.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      // Undeclared exception!
      try { 
        JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // default constructor not found. class java.lang.reflect.Method
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<String> class0 = String.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, false, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<String> class0 = String.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, true, false);
      TypeUtils.isKotlin(javaBeanInfo0.clazz);
      Class<String> class1 = String.class;
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class1, (JSONType) null);
      assertNull(class2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Void> class0 = Void.class;
      Class<Void> class1 = Void.class;
      String[] stringArray0 = new String[1];
      stringArray0[0] = "F<1Uz1{ui";
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("F<1Uz1{ui").when(jSONType0).typeKey();
      doReturn("F<1Uz1{ui").when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class0, class1, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      javaBeanInfo0.orders = stringArray0;
      LinkedList<FieldInfo> linkedList1 = new LinkedList<FieldInfo>();
      linkedList0.listIterator();
      Class<AtomicLong> class2 = AtomicLong.class;
      JSONType jSONType1 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((String[]) null).when(jSONType1).orders();
      doReturn("").when(jSONType1).typeKey();
      doReturn("F<1Uz1{ui").when(jSONType1).typeName();
      LinkedList<FieldInfo> linkedList2 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo1 = null;
      try {
        javaBeanInfo1 = new JavaBeanInfo(javaBeanInfo0.builderClass, class2, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType1, linkedList2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<String> class0 = String.class;
      JavaBeanInfo.build((Class<?>) class0, (Type) class0, (PropertyNamingStrategy) null, true, true);
      Constructor<AtomicBoolean>[] constructorArray0 = (Constructor<AtomicBoolean>[]) Array.newInstance(Constructor.class, 4);
      constructorArray0[0] = (Constructor<AtomicBoolean>) constructorArray0;
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      Class<Void> class1 = Void.class;
      String[] stringArray0 = new String[24];
      stringArray0[18] = "";
      stringArray0[2] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class1).when(jSONType0).builder();
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("").when(jSONType0).typeKey();
      doReturn("").when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class0, class1, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      JavaBeanInfo.getBuilderClass(javaBeanInfo0.jsonType);
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
  public void test12()  throws Throwable  {
      Class<Void> class0 = Void.class;
      Class<Void> class1 = Void.class;
      String[] stringArray0 = new String[1];
      stringArray0[0] = "F<1Uz1{ui";
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("F<1Uz1{ui", (String) null).when(jSONType0).typeKey();
      doReturn("F<1Uz1{ui", (String) null).when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class0, class1, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      javaBeanInfo0.orders = stringArray0;
      LinkedList<FieldInfo> linkedList1 = new LinkedList<FieldInfo>();
      linkedList0.listIterator();
      JavaBeanInfo.getBuilderClass(javaBeanInfo0.jsonType);
      Class<Object> class2 = Object.class;
      linkedList1.addLast((FieldInfo) null);
      Class<FieldInfo> class3 = FieldInfo.class;
      JavaBeanInfo javaBeanInfo1 = null;
      try {
        javaBeanInfo1 = new JavaBeanInfo(class2, class3, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, javaBeanInfo0.jsonType, linkedList1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Void> class0 = Void.class;
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "!;3tHEa.w`InrdGi){d";
      Class<AtomicBoolean> class1 = AtomicBoolean.class;
      Class<String> class2 = String.class;
      FieldInfo fieldInfo0 = new FieldInfo("!;3tHEa.w`InrdGi){d", class1, class2, class0, (Field) null, 2048, 102, 3082);
      linkedList0.addFirst(fieldInfo0);
      stringArray0[1] = "org.springframework.security.web.savedrequest.DefaultSavedRequest";
      stringArray0[2] = "org.springframework.security.web.savedrequest.DefaultSavedRequest";
      stringArray0[3] = "wai";
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("!;3tHEa.w`InrdGi){d").when(jSONType0).typeKey();
      doReturn("org.springframework.security.web.savedrequest.DefaultSavedRequest").when(jSONType0).typeName();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class0, class0, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      JavaBeanInfo.getBuilderClass(javaBeanInfo0.jsonType);
      Class<String> class3 = String.class;
      Constructor<AtomicLong>[] constructorArray0 = (Constructor<AtomicLong>[]) Array.newInstance(Constructor.class, 5);
      constructorArray0[0] = (Constructor<AtomicLong>) constructorArray0;
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<AtomicLong> class0 = AtomicLong.class;
      TypeUtils.isKotlin(class0);
      Class<Object> class1 = Object.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class1).when(jSONType0).builder();
      Class<?> class2 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      Class<FieldInfo> class3 = FieldInfo.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class3, (Type) class2, propertyNamingStrategy0);
      Class<String> class4 = String.class;
      JavaBeanInfo.getBuilderClass(class4, (JSONType) null);
      JavaBeanInfo.getBuilderClass((JSONType) null);
      JavaBeanInfo.getBuilderClass((JSONType) null);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<Void> class5 = Void.class;
      JavaBeanInfo javaBeanInfo1 = new JavaBeanInfo(class4, class5, javaBeanInfo0.creatorConstructor, javaBeanInfo0.creatorConstructor, (Method) null, (Method) null, (JSONType) null, linkedList0);
      Class<?> class6 = JavaBeanInfo.getBuilderClass(class3, (JSONType) null);
      assertNull(class6);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      Class<FieldInfo> class1 = FieldInfo.class;
      Constructor<Integer>[] constructorArray0 = (Constructor<Integer>[]) Array.newInstance(Constructor.class, 4);
      constructorArray0[0] = (Constructor<Integer>) constructorArray0;
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Void> class0 = Void.class;
      Class<Void> class1 = Void.class;
      String[] stringArray0 = new String[1];
      String[] stringArray1 = new String[0];
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0, (Class) null).when(jSONType0).builder();
      doReturn((Object) stringArray0, (Object) stringArray1).when(jSONType0).orders();
      doReturn("F<1Uz1{ui", "F<1Uz1{ui").when(jSONType0).typeKey();
      doReturn("F<1Uz1{ui", "F<1Uz1{ui").when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(class0, class1, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      javaBeanInfo0.orders = stringArray0;
      LinkedList<FieldInfo> linkedList1 = new LinkedList<FieldInfo>();
      linkedList0.listIterator();
      JavaBeanInfo.getBuilderClass(javaBeanInfo0.jsonType);
      Class<Object> class2 = Object.class;
      linkedList1.addLast((FieldInfo) null);
      Class<FieldInfo> class3 = FieldInfo.class;
      linkedList0.add((FieldInfo) null);
      JavaBeanInfo javaBeanInfo1 = new JavaBeanInfo(class2, class3, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, javaBeanInfo0.jsonType, linkedList1);
      JavaBeanInfo.getBuilderClass(javaBeanInfo0.jsonType);
      Constructor<AtomicBoolean>[] constructorArray0 = (Constructor<AtomicBoolean>[]) Array.newInstance(Constructor.class, 19);
      constructorArray0[1] = constructorArray0[0];
      constructorArray0[2] = constructorArray0[1];
      constructorArray0[3] = constructorArray0[2];
      // Undeclared exception!
      try { 
        JavaBeanInfo.getDefaultConstructor(javaBeanInfo0.builderClass, constructorArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }
}