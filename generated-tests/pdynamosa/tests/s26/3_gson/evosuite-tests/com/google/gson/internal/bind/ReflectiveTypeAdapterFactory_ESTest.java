/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 13:28:58 GMT 2019
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReflectiveTypeAdapterFactory_ESTest extends ReflectiveTypeAdapterFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Excluder excluder0 = new Excluder();
      // Undeclared exception!
      try { 
        ReflectiveTypeAdapterFactory.excludeField((Field) null, true, excluder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.LOWER_CASE_WITH_DASHES;
      Gson gson0 = new Gson();
      Excluder excluder0 = gson0.excluder();
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory((ConstructorConstructor) null, fieldNamingPolicy0, excluder0, (JsonAdapterAnnotationTypeAdapterFactory) null);
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory0.excludeField((Field) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES;
      Gson gson0 = new Gson();
      Excluder excluder0 = gson0.excluder();
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory((ConstructorConstructor) null, fieldNamingPolicy0, excluder0, jsonAdapterAnnotationTypeAdapterFactory0);
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory0.create(gson0, (TypeToken<ReflectiveTypeAdapterFactory.BoundField>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.LOWER_CASE_WITH_DASHES;
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory((ConstructorConstructor) null, fieldNamingPolicy0, (Excluder) null, jsonAdapterAnnotationTypeAdapterFactory0);
      Class<Type> class0 = Type.class;
      TypeToken<Type> typeToken0 = TypeToken.get(class0);
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory0.create((Gson) null, typeToken0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        ReflectiveTypeAdapterFactory.excludeField((Field) null, false, (Excluder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      Excluder excluder1 = excluder0.disableInnerClassSerialization();
      Class<Integer> class0 = Integer.class;
      TypeToken<Integer> typeToken0 = TypeToken.get(class0);
      TypeAdapter<Integer> typeAdapter0 = gson0.getDelegateAdapter((TypeAdapterFactory) excluder1, typeToken0);
      assertNotNull(typeAdapter0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      FieldNamingStrategy fieldNamingStrategy0 = gson0.fieldNamingStrategy();
      Excluder excluder0 = Excluder.DEFAULT;
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory((ConstructorConstructor) null, fieldNamingStrategy0, excluder0, jsonAdapterAnnotationTypeAdapterFactory0);
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory0.excludeField((Field) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Object>((ObjectConstructor<Object>) null, hashMap0);
      String string0 = reflectiveTypeAdapterFactory_Adapter0.toJson((Object) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Object>((ObjectConstructor<Object>) null, hashMap0);
      Object object0 = reflectiveTypeAdapterFactory_Adapter0.fromJson("null");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<Type> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Type>((ObjectConstructor<Type>) null, hashMap0);
      StringReader stringReader0 = new StringReader("\"");
      JsonReader jsonReader0 = new JsonReader(stringReader0);
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory_Adapter0.read(jsonReader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      Excluder excluder1 = excluder0.disableInnerClassSerialization();
      Class<Integer> class0 = Integer.TYPE;
      TypeToken<Integer> typeToken0 = TypeToken.get(class0);
      // Undeclared exception!
      try { 
        gson0.getDelegateAdapter((TypeAdapterFactory) excluder1, typeToken0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // GSON cannot serialize int
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Gson gson0 = new Gson();
      Excluder excluder0 = Excluder.DEFAULT;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) excluder0);
      assertFalse(jsonElement0.isJsonPrimitive());
  }
}
