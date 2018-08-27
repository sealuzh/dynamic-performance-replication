/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 18:05:54 GMT 2018
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
import com.google.gson.InstanceCreator;
import com.google.gson.JsonNull;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReflectiveTypeAdapterFactory_ESTest extends ReflectiveTypeAdapterFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FieldNamingPolicy fieldNamingPolicy0 = FieldNamingPolicy.LOWER_CASE_WITH_DASHES;
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
  public void test1()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Gson gson0 = new Gson();
      Excluder excluder0 = gson0.excluder();
      ExclusionStrategy exclusionStrategy0 = mock(ExclusionStrategy.class, new ViolatedAssumptionAnswer());
      FileSystemHandling.shouldAllThrowIOExceptions();
      excluder0.excludeFieldsWithoutExposeAnnotation();
      excluder0.withVersion(1.0);
      Excluder excluder1 = Excluder.DEFAULT;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory((ConstructorConstructor) null);
      Class<Type> class0 = Type.class;
      TypeToken<Type> typeToken0 = TypeToken.get(class0);
      Class<? super Type> class1 = typeToken0.getRawType();
      // Undeclared exception!
      try { 
        gson0.fromJson("(I}44Mn kMGxSfs$=?", (Type) class1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to invoke no-args constructor for interface java.lang.reflect.Type. Register an InstanceCreator with Gson for this type may fix this problem.
         //
         verifyException("com.google.gson.internal.ConstructorConstructor$14", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("oL~O?2ueD~QYFW+");
      Gson gson0 = new Gson();
      Object object0 = new Object();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("oL~O?2ueD~QYFW+");
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null, 4514);
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      gson0.toJsonTree((Object) pushbackInputStream0);
      Gson gson1 = new Gson();
      gson1.excluder();
      gson1.toJsonTree(object0);
      ExclusionStrategy exclusionStrategy0 = mock(ExclusionStrategy.class, new ViolatedAssumptionAnswer());
      Excluder excluder0 = Excluder.DEFAULT;
      assertSame(excluder0, excluder1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      StringReader stringReader0 = new StringReader("olZ");
      Gson gson0 = new Gson();
      StringReader stringReader1 = new StringReader("olZ");
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      gson0.newJsonReader(stringReader0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      gson0.toJsonTree((Object) stringReader1);
      gson0.excluder();
      Excluder excluder0 = Excluder.DEFAULT;
      assertSame(excluder0, excluder1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      HashMap<String, Type> hashMap1 = new HashMap<String, Type>();
      ReflectiveTypeAdapterFactory.Adapter<String> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<String>((ObjectConstructor<String>) null, hashMap0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("Expected BEGIN_ARRAY but was ");
      reflectiveTypeAdapterFactory_Adapter0.toJson((Writer) mockPrintWriter0, "Expected BEGIN_ARRAY but was ");
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      reflectiveTypeAdapterFactory_Adapter0.fromJsonTree(jsonNull0);
      StringReader stringReader0 = new StringReader("Expected BEGIN_ARRAY but was ");
      stringReader0.reset();
      reflectiveTypeAdapterFactory_Adapter0.toJson((Writer) mockPrintWriter0, (String) null);
      mockPrintWriter0.println((Object) null);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/3_gson");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Field field0 = null;
      Excluder excluder0 = Excluder.DEFAULT;
      Excluder excluder1 = excluder0.withVersion((-464.678342345383));
      ExclusionStrategy exclusionStrategy0 = mock(ExclusionStrategy.class, new ViolatedAssumptionAnswer());
      Excluder excluder2 = excluder1.withExclusionStrategy(exclusionStrategy0, true, true);
      // Undeclared exception!
      try { 
        ReflectiveTypeAdapterFactory.excludeField((Field) null, true, excluder2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{4");
      Class<Byte> class0 = Byte.TYPE;
      Gson gson0 = new Gson();
      Class<PushbackInputStream> class1 = PushbackInputStream.class;
      try { 
        gson0.fromJson((Reader) stringReader0, class1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.EOFException: End of input at line 1 column 3 path $.4
         //
         verifyException("com.google.gson.Gson", e);
      }
  }
}