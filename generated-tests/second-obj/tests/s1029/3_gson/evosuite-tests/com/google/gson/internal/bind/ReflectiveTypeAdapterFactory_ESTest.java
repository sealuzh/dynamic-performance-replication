/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 14:23:16 GMT 2018
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.io.InputStream;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReflectiveTypeAdapterFactory_ESTest extends ReflectiveTypeAdapterFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<ReflectiveTypeAdapterFactory.BoundField> class0 = ReflectiveTypeAdapterFactory.BoundField.class;
      TypeToken.get(class0);
      Gson gson0 = new Gson();
      Boolean boolean0 = Boolean.valueOf("");
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to invoke no-args constructor for class com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField. Register an InstanceCreator with Gson for this type may fix this problem.
         //
         verifyException("com.google.gson.internal.ConstructorConstructor$14", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Gson gson0 = new Gson();
      gson0.toJsonTree((Object) fileSystemHandling0);
      Class<ReflectiveTypeAdapterFactory.BoundField> class0 = ReflectiveTypeAdapterFactory.BoundField.class;
      Gson gson1 = new Gson();
      JsonAdapter jsonAdapter0 = mock(JsonAdapter.class, new ViolatedAssumptionAnswer());
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.LOWER_CASE_WITH_DASHES;
      Excluder excluder0 = new Excluder();
      TypeToken.get(class0);
      Class<InputStream> class1 = InputStream.class;
      TypeToken.get(class1);
      TypeToken.get(class1);
      Class<ReflectiveTypeAdapterFactory.BoundField> class2 = ReflectiveTypeAdapterFactory.BoundField.class;
      JsonAdapter jsonAdapter1 = mock(JsonAdapter.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ConstructorConstructor constructorConstructor0 = null;
      Gson gson0 = new Gson();
      Class<Type> class0 = Type.class;
      JsonArray jsonArray0 = new JsonArray();
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to invoke no-args constructor for interface java.lang.reflect.Type. Register an InstanceCreator with Gson for this type may fix this problem.
         //
         verifyException("com.google.gson.internal.ConstructorConstructor$14", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ConstructorConstructor constructorConstructor0 = null;
      FieldNamingStrategy fieldNamingStrategy0 = null;
      Excluder excluder0 = null;
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      Gson gson0 = new Gson();
      gson0.toJsonTree((Object) jsonAdapterAnnotationTypeAdapterFactory0);
      Class<ReflectiveTypeAdapterFactory.BoundField> class0 = ReflectiveTypeAdapterFactory.BoundField.class;
      TypeToken<ReflectiveTypeAdapterFactory.BoundField> typeToken0 = TypeToken.get(class0);
      JsonAdapter jsonAdapter0 = mock(JsonAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(jsonAdapter0).value();
      // Undeclared exception!
      try { 
        jsonAdapterAnnotationTypeAdapterFactory0.getTypeAdapter((ConstructorConstructor) null, gson0, typeToken0, jsonAdapter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.UPPER_CAMEL_CASE;
      Gson gson0 = new Gson();
      Excluder excluder0 = gson0.excluder();
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory((ConstructorConstructor) null, fieldNamingPolicy0, excluder0, jsonAdapterAnnotationTypeAdapterFactory0);
      Class<Integer> class0 = Integer.TYPE;
      TypeToken<Integer> typeToken0 = TypeToken.get(class0);
      TypeAdapter<Integer> typeAdapter0 = reflectiveTypeAdapterFactory0.create(gson0, typeToken0);
      assertNull(typeAdapter0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.UPPER_CAMEL_CASE;
      Excluder excluder0 = new Excluder();
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      ConstructorConstructor constructorConstructor0 = null;
      excluder0.disableInnerClassSerialization();
      Class<Type> class0 = Type.class;
      TypeToken<Type> typeToken0 = TypeToken.get(class0);
      Class<? super Type> class1 = typeToken0.getRawType();
      gson0.fromJson(jsonElement0, (Type) class1);
      TypeToken.get(class0);
      TypeToken.get(class0);
      typeToken0.getRawType();
      FieldNamingPolicy fieldNamingPolicy1 = FieldNamingPolicy.UPPER_CAMEL_CASE;
      gson0.excluder();
      Excluder excluder1 = new Excluder();
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      // Undeclared exception!
      try { 
        FieldNamingPolicy.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.gson.FieldNamingPolicy.
         //
         verifyException("java.lang.Enum", e);
      }
  }
}