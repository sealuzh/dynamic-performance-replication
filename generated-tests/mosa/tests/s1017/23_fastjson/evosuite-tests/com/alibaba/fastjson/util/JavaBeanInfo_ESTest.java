/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 08:47:15 GMT 2018
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
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicLong;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaBeanInfo_ESTest extends JavaBeanInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      Class<AtomicLong> class0 = AtomicLong.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
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
      Class<Method> class0 = Method.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(class0, jSONType0);
      assertNull(class1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<String> class0 = String.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<FieldInfo> class0 = FieldInfo.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, true, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<String> class0 = String.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.PascalCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0, true, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Method> class0 = Method.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.CamelCase;
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
  public void test08()  throws Throwable  {
      Class<Void> class0 = Void.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jSONType0).builder();
      Class<?> class1 = JavaBeanInfo.getBuilderClass(jSONType0);
      assertNull(class1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Void> class0 = Void.TYPE;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.SnakeCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      PropertyNamingStrategy propertyNamingStrategy0 = PropertyNamingStrategy.KebabCase;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, propertyNamingStrategy0);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Method> class0 = Method.class;
      JavaBeanInfo javaBeanInfo0 = JavaBeanInfo.build((Class<?>) class0, (Type) class0, (PropertyNamingStrategy) null, true, true);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      FieldInfo fieldInfo0 = new FieldInfo("set", class0, class0, class0, (Field) null, (-981), (-981), 95);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      linkedList0.add(fieldInfo0);
      Class<Integer> class1 = Integer.class;
      FieldInfo fieldInfo1 = new FieldInfo("set", class0, class1, fieldInfo0.declaringClass, (Field) null, (-981), (-848), (-981));
      JavaBeanInfo.add(linkedList0, fieldInfo1);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Method> class0 = Method.class;
      FieldInfo fieldInfo0 = new FieldInfo("set", class0, class0, class0, (Field) null, (-1), 548, 548);
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      LinkedList<FieldInfo> linkedList1 = new LinkedList<FieldInfo>();
      linkedList1.add(fieldInfo0);
      Class<String> class1 = String.class;
      Class<AtomicLong> class2 = AtomicLong.class;
      FieldInfo fieldInfo1 = new FieldInfo("set", class1, class2, class2, (Field) null, (-1061), (-1061), 512);
      JavaBeanInfo.add(linkedList0, fieldInfo0);
      boolean boolean0 = JavaBeanInfo.add(linkedList0, fieldInfo1);
      assertEquals(1, linkedList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      FieldInfo fieldInfo0 = new FieldInfo(")et", class0, class0, class0, (Field) null, (-937), (-937), (-937));
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(fieldInfo0.alternateNames).when(jSONType0).orders();
      doReturn(")et").when(jSONType0).typeKey();
      doReturn(")et").when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(fieldInfo0.fieldClass, fieldInfo0.declaringClass, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList0);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Object> class0 = Object.class;
      FieldInfo fieldInfo0 = new FieldInfo("s3t", class0, class0, class0, (Field) null, (-967), (-967), (-967));
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      boolean boolean0 = fieldInfo0.jsonDirect;
      linkedList0.add(fieldInfo0);
      String[] stringArray0 = new String[15];
      stringArray0[1] = "";
      stringArray0[2] = "s3t";
      stringArray0[8] = "02/>B#FR<{9|";
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("").when(jSONType0).typeKey();
      doReturn("02/>B#FR<{9|").when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList1 = new LinkedList<FieldInfo>();
      linkedList1.add(fieldInfo0);
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(fieldInfo0.declaringClass, fieldInfo0.declaringClass, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList1);
      assertEquals(0, javaBeanInfo0.parserFeatures);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Object> class0 = Object.class;
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      Class<Integer> class1 = Integer.class;
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(jSONType0).builder();
      JavaBeanInfo.getBuilderClass(jSONType0);
      JSONType jSONType1 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn((String[]) null).when(jSONType1).orders();
      doReturn("\u0007l+M").when(jSONType1).typeKey();
      doReturn("").when(jSONType1).typeName();
      JavaBeanInfo javaBeanInfo0 = null;
      try {
        javaBeanInfo0 = new JavaBeanInfo(class0, class1, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType1, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.alibaba.fastjson.util.JavaBeanInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Object> class0 = Object.class;
      FieldInfo fieldInfo0 = new FieldInfo("s3t", class0, class0, class0, (Field) null, (-967), (-967), (-967));
      LinkedList<FieldInfo> linkedList0 = new LinkedList<FieldInfo>();
      boolean boolean0 = fieldInfo0.jsonDirect;
      Class<Method> class1 = Method.class;
      FieldInfo.getFieldType(class1, fieldInfo0.fieldType, class0);
      linkedList0.add(fieldInfo0);
      String[] stringArray0 = new String[15];
      stringArray0[1] = "";
      stringArray0[2] = "02/>B#FR<{9|";
      stringArray0[8] = "";
      JSONType jSONType0 = mock(JSONType.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(jSONType0).orders();
      doReturn("").when(jSONType0).typeKey();
      doReturn("02/>B#FR<{9|").when(jSONType0).typeName();
      LinkedList<FieldInfo> linkedList1 = new LinkedList<FieldInfo>();
      linkedList1.add(fieldInfo0);
      JavaBeanInfo javaBeanInfo0 = new JavaBeanInfo(fieldInfo0.declaringClass, fieldInfo0.declaringClass, (Constructor<?>) null, (Constructor<?>) null, (Method) null, (Method) null, jSONType0, linkedList1);
      assertEquals(0, javaBeanInfo0.defaultConstructorParameterSize);
  }
}