/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 07:46:31 GMT 2018
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReflectiveTypeAdapterFactory_ESTest extends ReflectiveTypeAdapterFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<String> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<String>((ObjectConstructor<String>) null, hashMap0);
      reflectiveTypeAdapterFactory_Adapter0.toJson("qn");
      // Undeclared exception!
      try { 
        reflectiveTypeAdapterFactory_Adapter0.fromJson("{}");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)8;
      byteArray0[1] = (byte)117;
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.UPPER_CAMEL_CASE;
      Gson gson0 = new Gson();
      String string0 = gson0.toString();
      Excluder excluder0 = gson0.excluder();
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      FieldNamingPolicy fieldNamingPolicy1 = FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES;
      ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory0 = new ReflectiveTypeAdapterFactory((ConstructorConstructor) null, fieldNamingPolicy1, excluder0, jsonAdapterAnnotationTypeAdapterFactory0);
      Class<InputStream> class0 = InputStream.class;
      Class<InputStream> class1 = InputStream.class;
      TypeToken.get(class1);
      Class<ReflectiveTypeAdapterFactory.BoundField> class2 = ReflectiveTypeAdapterFactory.BoundField.class;
      // Undeclared exception!
      try { 
        gson0.fromJson(string0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Failed to invoke public java.io.InputStream() with no args
         //
         verifyException("com.google.gson.internal.ConstructorConstructor$3", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ConstructorConstructor constructorConstructor0 = null;
      byte byte0 = (byte) (-79);
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.LOWER_CASE_WITH_DASHES;
      Gson gson0 = new Gson();
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      Class<ReflectiveTypeAdapterFactory.BoundField> class0 = ReflectiveTypeAdapterFactory.BoundField.class;
      gson0.toJson((Object) null, (Type) class0);
      Class<ReflectiveTypeAdapterFactory.BoundField> class1 = ReflectiveTypeAdapterFactory.BoundField.class;
      // Undeclared exception!
      try { 
        gson0.fromJson("com.google.gson.internal.LazilyParsedNumber", class1);
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
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ConstructorConstructor constructorConstructor0 = null;
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte) (-79);
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.LOWER_CASE_WITH_DASHES;
      Gson gson0 = new Gson();
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      Class<ReflectiveTypeAdapterFactory.BoundField> class0 = ReflectiveTypeAdapterFactory.BoundField.class;
      gson0.toJson((Object) null, (Type) class0);
      gson0.fromJson("null", class0);
      PipedReader pipedReader0 = null;
      try {
        pipedReader0 = new PipedReader((byte) (-79));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe size <= 0
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Excluder excluder0 = Excluder.DEFAULT;
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      Gson gson0 = new Gson();
      gson0.toJson((Object) jsonAdapterAnnotationTypeAdapterFactory0);
      // Undeclared exception!
      try { 
        FieldNamingPolicy.valueOf("{}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.gson.FieldNamingPolicy.{}
         //
         verifyException("java.lang.Enum", e);
      }
  }
}