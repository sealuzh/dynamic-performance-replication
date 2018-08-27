/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:38:07 GMT 2018
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReflectiveTypeAdapterFactory_ESTest extends ReflectiveTypeAdapterFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Type> class0 = Type.class;
      // Undeclared exception!
      try { 
        gson0.fromJson("e6XQ`?j", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to invoke no-args constructor for interface java.lang.reflect.Type. Register an InstanceCreator with Gson for this type may fix this problem.
         //
         verifyException("com.google.gson.internal.ConstructorConstructor$14", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Object>((ObjectConstructor<Object>) null, hashMap0);
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      reflectiveTypeAdapterFactory_Adapter0.fromJsonTree(jsonNull0);
      boolean boolean0 = FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, ReflectiveTypeAdapterFactory.BoundField> hashMap0 = new HashMap<String, ReflectiveTypeAdapterFactory.BoundField>();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ReflectiveTypeAdapterFactory.Adapter<Object> reflectiveTypeAdapterFactory_Adapter0 = new ReflectiveTypeAdapterFactory.Adapter<Object>((ObjectConstructor<Object>) null, hashMap0);
      char[] charArray0 = new char[8];
      charArray0[1] = '7';
      charArray0[2] = 'H';
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      reflectiveTypeAdapterFactory_Adapter0.toJsonTree((Object) null);
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0);
      JsonReader jsonReader0 = new JsonReader(charArrayReader0);
      try { 
        jsonReader0.nextLong();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $
         //
         verifyException("com.google.gson.stream.JsonReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = "";
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      EvoSuiteFile evoSuiteFile0 = null;
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("");
      LineNumberReader lineNumberReader0 = new LineNumberReader(stringReader0);
      stringReader0.mark(8);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      stringReader0.ready();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      charArrayWriter0.close();
      // Undeclared exception!
      try { 
        gson0.toJson((Object) lineNumberReader0, (Appendable) charArrayWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class java.io.LineNumberReader declares multiple JSON fields named markedSkipLF
         //
         verifyException("com.google.gson.internal.bind.ReflectiveTypeAdapterFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toString();
      Class<ByteArrayInputStream> class0 = ByteArrayInputStream.class;
      try { 
        gson0.fromJson(string0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Unterminated array at line 1 column 42 path $.factories[0]
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ConstructorConstructor constructorConstructor0 = null;
      Gson gson0 = new Gson();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) charArrayWriter0);
      gson0.toJson(jsonElement0);
      charArrayWriter0.write("{\"buf\":[\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\"],\"count\":java.lang.Integer@0000000136}");
      charArrayWriter0.flush();
      charArrayWriter0.reset();
      Class<ByteArrayInputStream> class0 = ByteArrayInputStream.class;
      try { 
        gson0.fromJson("{\"buf\":[\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\",\"\u0000\"],\"count\":java.lang.Integer@0000000136}", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: empty String
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$5", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ConstructorConstructor constructorConstructor0 = null;
      Gson gson0 = new Gson();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      JsonObject jsonObject0 = new JsonObject();
      gson0.toJson((JsonElement) jsonObject0);
      charArrayWriter0.write("{}");
      gson0.newJsonWriter(charArrayWriter0);
      charArrayWriter0.flush();
      Class<ByteArrayInputStream> class0 = ByteArrayInputStream.class;
      gson0.fromJson("{}", class0);
      charArrayWriter0.flush();
      charArrayWriter0.flush();
      MockFile mockFile0 = new MockFile((String) null, "-{NinvL}IZ)!lb");
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter(mockFile0, " declares multiple JSON fields named ");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         //  declares multiple JSON fields named 
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }
}
