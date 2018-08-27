/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 01:40:47 GMT 2018
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.Gson;
import com.google.gson.JsonNull;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.io.CharArrayWriter;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReflectiveTypeAdapterFactory_ESTest extends ReflectiveTypeAdapterFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Object>((ObjectConstructor<Object>) null, hashMap0);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      reflectiveTypeAdapterFactory_Adapter0.fromJsonTree(jsonNull0);
      reflectiveTypeAdapterFactory_Adapter0.toJsonTree(hashMap0);
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter1 = new ReflectiveTypeAdapterFactory.Adapter<Object>((ObjectConstructor<Object>) null, hashMap0);
      assertFalse(reflectiveTypeAdapterFactory_Adapter1.equals((Object)reflectiveTypeAdapterFactory_Adapter0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Object>((ObjectConstructor<Object>) null, hashMap0);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      reflectiveTypeAdapterFactory_Adapter0.toJson((Object) null);
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter1 = new ReflectiveTypeAdapterFactory.Adapter<Object>((ObjectConstructor<Object>) null, hashMap0);
      assertFalse(reflectiveTypeAdapterFactory_Adapter1.equals((Object)reflectiveTypeAdapterFactory_Adapter0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Excluder excluder0 = new Excluder();
      Class<ReflectiveTypeAdapterFactory.BoundField> class0 = ReflectiveTypeAdapterFactory.BoundField.class;
      TypeToken.get(class0);
      TypeToken.get((Type) class0);
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.fromJson("@UHhwZ~~mk,V1l*/,i", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to invoke no-args constructor for class com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField. Register an InstanceCreator with Gson for this type may fix this problem.
         //
         verifyException("com.google.gson.internal.ConstructorConstructor$14", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Excluder excluder0 = new Excluder();
      Class<ReflectiveTypeAdapterFactory.BoundField> class0 = ReflectiveTypeAdapterFactory.BoundField.class;
      TypeToken.get(class0);
      TypeToken<?> typeToken0 = TypeToken.get((Type) class0);
      Gson gson0 = new Gson();
      // Undeclared exception!
      try { 
        gson0.toJson((Object) typeToken0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Excluder excluder0 = new Excluder();
      Class<ReflectiveTypeAdapterFactory.BoundField> class0 = ReflectiveTypeAdapterFactory.BoundField.class;
      TypeToken<ReflectiveTypeAdapterFactory.BoundField> typeToken0 = TypeToken.get(class0);
      TypeToken.get((Type) class0);
      Gson gson0 = new Gson();
      Class<Integer> class1 = Integer.class;
      TypeToken<Integer> typeToken1 = TypeToken.get(class1);
      gson0.getDelegateAdapter((TypeAdapterFactory) excluder0, typeToken1);
      TypeAdapter<ReflectiveTypeAdapterFactory.BoundField> typeAdapter0 = gson0.getAdapter(typeToken0);
      assertNotNull(typeAdapter0);
  }
}