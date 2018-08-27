/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 09:07:09 GMT 2018
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReflectiveTypeAdapterFactory_ESTest extends ReflectiveTypeAdapterFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Excluder excluder0 = Excluder.DEFAULT;
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      Boolean boolean0 = Boolean.TRUE;
      Gson gson0 = new Gson();
      Class<InputStream> class0 = InputStream.class;
      // Undeclared exception!
      try { 
        gson0.fromJson("L;3?vei0U{dcy", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Failed to invoke public java.io.InputStream() with no args
         //
         verifyException("com.google.gson.internal.ConstructorConstructor$3", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Field field0 = null;
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<ReflectiveTypeAdapterFactory.BoundField> class0 = ReflectiveTypeAdapterFactory.BoundField.class;
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonElement) jsonArray0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to invoke no-args constructor for class com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField. Register an InstanceCreator with Gson for this type may fix this problem.
         //
         verifyException("com.google.gson.internal.ConstructorConstructor$14", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.LOWER_CASE_WITH_DASHES;
      Excluder excluder0 = new Excluder();
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      Gson gson0 = new Gson();
      Class<InputStream> class0 = InputStream.class;
      gson0.fromJson("", class0);
      Class<Integer> class1 = Integer.TYPE;
      TypeToken<Integer> typeToken0 = TypeToken.get(class1);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory((ConstructorConstructor) null, fieldNamingPolicy0, excluder0, jsonAdapterAnnotationTypeAdapterFactory0);
      TypeAdapter<Integer> typeAdapter0 = reflectiveTypeAdapterFactory0.create(gson0, typeToken0);
      assertNull(typeAdapter0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ConstructorConstructor constructorConstructor0 = null;
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.LOWER_CASE_WITH_DASHES;
      Excluder excluder0 = new Excluder();
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      Gson gson0 = new Gson();
      gson0.toJson((Object) null);
      gson0.toJson((Object) jsonAdapterAnnotationTypeAdapterFactory0);
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream("{}");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.IDENTITY;
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      Excluder excluder0 = new Excluder();
      Gson gson0 = new Gson();
      gson0.toJson((Object) null);
      Class<InputStream> class0 = InputStream.class;
      gson0.fromJson("null", class0);
      Class<Integer> class1 = Integer.class;
      TypeToken.get(class1);
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      assertFalse(fileSystemHandling1.equals((Object)fileSystemHandling0));
  }
}