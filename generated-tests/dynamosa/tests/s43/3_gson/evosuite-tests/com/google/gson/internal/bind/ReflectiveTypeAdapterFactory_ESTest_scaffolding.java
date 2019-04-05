/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Mar 24 10:10:47 GMT 2019
 */

package com.google.gson.internal.bind;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ReflectiveTypeAdapterFactory_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/3_gson"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ReflectiveTypeAdapterFactory_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.gson.internal.bind.TimeTypeAdapter$1",
      "com.google.gson.reflect.TypeToken",
      "com.google.gson.internal.bind.TypeAdapters$23",
      "com.google.gson.internal.bind.TypeAdapters$24",
      "com.google.gson.internal.LinkedTreeMap$KeySet",
      "com.google.gson.internal.bind.TypeAdapters$25",
      "com.google.gson.internal.bind.TypeAdapters$26",
      "com.google.gson.internal.bind.TypeAdapters$20",
      "com.google.gson.TypeAdapter",
      "com.google.gson.internal.bind.JsonTreeWriter",
      "com.google.gson.internal.bind.TypeAdapters$21",
      "com.google.gson.internal.bind.TypeAdapters$22",
      "com.google.gson.JsonDeserializationContext",
      "com.google.gson.internal.bind.TypeAdapters$27",
      "com.google.gson.FieldNamingStrategy",
      "com.google.gson.internal.bind.TypeAdapters$28",
      "com.google.gson.internal.bind.TypeAdapters$29",
      "com.google.gson.internal.bind.SqlDateTypeAdapter",
      "com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper",
      "com.google.gson.internal.bind.TimeTypeAdapter",
      "com.google.gson.ExclusionStrategy",
      "com.google.gson.internal.bind.TypeAdapters$34",
      "com.google.gson.internal.bind.TypeAdapters$35",
      "com.google.gson.internal.bind.TypeAdapters$30",
      "com.google.gson.internal.bind.TypeAdapters$32",
      "com.google.gson.internal.bind.TypeAdapters$33",
      "com.google.gson.JsonArray",
      "com.google.gson.LongSerializationPolicy",
      "com.google.gson.internal.bind.TypeAdapters$35$1",
      "com.google.gson.internal.Excluder",
      "com.google.gson.internal.LinkedTreeMap$EntrySet$1",
      "com.google.gson.annotations.Until",
      "com.google.gson.TypeAdapterFactory",
      "com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter",
      "com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl",
      "com.google.gson.stream.JsonReader$1",
      "com.google.gson.internal.bind.MapTypeAdapterFactory$Adapter",
      "com.google.gson.internal.$Gson$Types",
      "com.google.gson.stream.JsonReader",
      "com.google.gson.FieldAttributes",
      "com.google.gson.InstanceCreator",
      "com.google.gson.internal.bind.MapTypeAdapterFactory",
      "com.google.gson.Gson$FutureTypeAdapter",
      "com.google.gson.internal.bind.TreeTypeAdapter",
      "com.google.gson.internal.LinkedTreeMap$Node",
      "com.google.gson.stream.JsonWriter",
      "com.google.gson.internal.bind.ArrayTypeAdapter$1",
      "com.google.gson.internal.Streams",
      "com.google.gson.internal.$Gson$Preconditions",
      "com.google.gson.internal.bind.TypeAdapters$12",
      "com.google.gson.internal.bind.TypeAdapters$13",
      "com.google.gson.internal.bind.TypeAdapters$14",
      "com.google.gson.internal.bind.TypeAdapters$15",
      "com.google.gson.internal.bind.TypeAdapters$10",
      "com.google.gson.internal.Primitives",
      "com.google.gson.internal.bind.TypeAdapters$11",
      "com.google.gson.stream.MalformedJsonException",
      "com.google.gson.internal.bind.ArrayTypeAdapter",
      "com.google.gson.stream.JsonToken",
      "com.google.gson.internal.ConstructorConstructor$3",
      "com.google.gson.internal.bind.TypeAdapters$16",
      "com.google.gson.internal.ObjectConstructor",
      "com.google.gson.internal.bind.TypeAdapters$17",
      "com.google.gson.internal.bind.TypeAdapters$18",
      "com.google.gson.internal.Streams$AppendableWriter$CurrentWrite",
      "com.google.gson.JsonNull",
      "com.google.gson.internal.bind.TypeAdapters$19",
      "com.google.gson.internal.bind.DateTypeAdapter$1",
      "com.google.gson.internal.ConstructorConstructor$8",
      "com.google.gson.LongSerializationPolicy$1",
      "com.google.gson.LongSerializationPolicy$2",
      "com.google.gson.internal.ConstructorConstructor$6",
      "com.google.gson.JsonObject",
      "com.google.gson.internal.bind.JsonTreeReader$1",
      "com.google.gson.TypeAdapter$1",
      "com.google.gson.Gson$6",
      "com.google.gson.internal.UnsafeAllocator$3",
      "com.google.gson.internal.UnsafeAllocator$4",
      "com.google.gson.internal.UnsafeAllocator$1",
      "com.google.gson.internal.UnsafeAllocator$2",
      "com.google.gson.Gson$2",
      "com.google.gson.Gson$3",
      "com.google.gson.internal.bind.ObjectTypeAdapter",
      "com.google.gson.Gson$4",
      "com.google.gson.Gson$5",
      "com.google.gson.internal.bind.DateTypeAdapter",
      "com.google.gson.internal.bind.CollectionTypeAdapterFactory$Adapter",
      "com.google.gson.Gson$1",
      "com.google.gson.internal.bind.TypeAdapters$26$1",
      "com.google.gson.Gson",
      "com.google.gson.internal.LinkedTreeMap$1",
      "com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory",
      "com.google.gson.internal.LinkedTreeMap$EntrySet",
      "com.google.gson.internal.$Gson$Types$WildcardTypeImpl",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1",
      "com.google.gson.annotations.SerializedName",
      "com.google.gson.internal.Excluder$1",
      "com.google.gson.internal.bind.TypeAdapters$2",
      "com.google.gson.internal.bind.JsonTreeReader",
      "com.google.gson.internal.bind.TypeAdapters$1",
      "com.google.gson.internal.bind.JsonTreeWriter$1",
      "com.google.gson.internal.bind.SqlDateTypeAdapter$1",
      "com.google.gson.JsonIOException",
      "com.google.gson.internal.bind.TypeAdapters$8",
      "com.google.gson.internal.bind.TypeAdapters$7",
      "com.google.gson.internal.bind.TypeAdapters",
      "com.google.gson.internal.bind.TypeAdapters$9",
      "com.google.gson.internal.bind.TypeAdapters$4",
      "com.google.gson.internal.LinkedTreeMap",
      "com.google.gson.internal.bind.TypeAdapters$3",
      "com.google.gson.internal.bind.TypeAdapters$6",
      "com.google.gson.internal.bind.TypeAdapters$5",
      "com.google.gson.internal.LazilyParsedNumber",
      "com.google.gson.internal.bind.ObjectTypeAdapter$1",
      "com.google.gson.JsonParseException",
      "com.google.gson.internal.ConstructorConstructor",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter",
      "com.google.gson.internal.LinkedTreeMap$LinkedTreeMapIterator",
      "com.google.gson.JsonElement",
      "com.google.gson.FieldNamingPolicy",
      "com.google.gson.internal.bind.CollectionTypeAdapterFactory",
      "com.google.gson.annotations.JsonAdapter",
      "com.google.gson.JsonSerializationContext",
      "com.google.gson.JsonPrimitive",
      "com.google.gson.internal.UnsafeAllocator",
      "com.google.gson.internal.Streams$AppendableWriter",
      "com.google.gson.internal.ConstructorConstructor$14",
      "com.google.gson.JsonSyntaxException",
      "com.google.gson.FieldNamingPolicy$4",
      "com.google.gson.FieldNamingPolicy$3",
      "com.google.gson.annotations.Since",
      "com.google.gson.FieldNamingPolicy$5",
      "com.google.gson.internal.JsonReaderInternalAccess",
      "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl",
      "com.google.gson.FieldNamingPolicy$2",
      "com.google.gson.FieldNamingPolicy$1",
      "com.google.gson.internal.ConstructorConstructor$12"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ReflectiveTypeAdapterFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1",
      "com.google.gson.TypeAdapter",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter",
      "com.google.gson.internal.Primitives",
      "com.google.gson.internal.$Gson$Types",
      "com.google.gson.reflect.TypeToken",
      "com.google.gson.Gson$1",
      "com.google.gson.Gson",
      "com.google.gson.internal.Excluder",
      "com.google.gson.FieldNamingPolicy",
      "com.google.gson.LongSerializationPolicy",
      "com.google.gson.internal.ConstructorConstructor",
      "com.google.gson.internal.bind.TypeAdapters$1",
      "com.google.gson.internal.bind.TypeAdapters$32",
      "com.google.gson.internal.bind.TypeAdapters$2",
      "com.google.gson.internal.bind.TypeAdapters$3",
      "com.google.gson.internal.bind.TypeAdapters$4",
      "com.google.gson.internal.bind.TypeAdapters$33",
      "com.google.gson.internal.bind.TypeAdapters$5",
      "com.google.gson.internal.bind.TypeAdapters$6",
      "com.google.gson.internal.bind.TypeAdapters$7",
      "com.google.gson.internal.bind.TypeAdapters$8",
      "com.google.gson.TypeAdapter$1",
      "com.google.gson.internal.bind.TypeAdapters$9",
      "com.google.gson.internal.bind.TypeAdapters$10",
      "com.google.gson.internal.bind.TypeAdapters$11",
      "com.google.gson.internal.bind.TypeAdapters$12",
      "com.google.gson.internal.bind.TypeAdapters$13",
      "com.google.gson.internal.bind.TypeAdapters$14",
      "com.google.gson.internal.bind.TypeAdapters$15",
      "com.google.gson.internal.bind.TypeAdapters$16",
      "com.google.gson.internal.bind.TypeAdapters$17",
      "com.google.gson.internal.bind.TypeAdapters$18",
      "com.google.gson.internal.bind.TypeAdapters$19",
      "com.google.gson.internal.bind.TypeAdapters$20",
      "com.google.gson.internal.bind.TypeAdapters$21",
      "com.google.gson.internal.bind.TypeAdapters$22",
      "com.google.gson.internal.bind.TypeAdapters$23",
      "com.google.gson.internal.bind.TypeAdapters$35",
      "com.google.gson.internal.bind.TypeAdapters$24",
      "com.google.gson.internal.bind.TypeAdapters$25",
      "com.google.gson.internal.bind.TypeAdapters$26",
      "com.google.gson.internal.bind.TypeAdapters$27",
      "com.google.gson.internal.bind.TypeAdapters$34",
      "com.google.gson.internal.bind.TypeAdapters$28",
      "com.google.gson.internal.bind.TypeAdapters$29",
      "com.google.gson.internal.bind.TypeAdapters$30",
      "com.google.gson.internal.bind.TypeAdapters",
      "com.google.gson.internal.bind.ObjectTypeAdapter$1",
      "com.google.gson.internal.bind.ObjectTypeAdapter",
      "com.google.gson.Gson$2",
      "com.google.gson.Gson$3",
      "com.google.gson.Gson$5",
      "com.google.gson.Gson$6",
      "com.google.gson.internal.bind.DateTypeAdapter$1",
      "com.google.gson.internal.bind.DateTypeAdapter",
      "com.google.gson.internal.bind.TimeTypeAdapter$1",
      "com.google.gson.internal.bind.TimeTypeAdapter",
      "com.google.gson.internal.bind.SqlDateTypeAdapter$1",
      "com.google.gson.internal.bind.SqlDateTypeAdapter",
      "com.google.gson.internal.bind.ArrayTypeAdapter$1",
      "com.google.gson.internal.bind.ArrayTypeAdapter",
      "com.google.gson.internal.bind.CollectionTypeAdapterFactory",
      "com.google.gson.internal.bind.MapTypeAdapterFactory",
      "com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory",
      "com.google.gson.internal.$Gson$Preconditions",
      "com.google.gson.Gson$FutureTypeAdapter",
      "com.google.gson.internal.JsonReaderInternalAccess",
      "com.google.gson.stream.JsonReader$1",
      "com.google.gson.stream.JsonReader",
      "com.google.gson.JsonElement",
      "com.google.gson.JsonObject",
      "com.google.gson.internal.LinkedTreeMap$1",
      "com.google.gson.internal.LinkedTreeMap",
      "com.google.gson.internal.LinkedTreeMap$Node",
      "com.google.gson.internal.Streams",
      "com.google.gson.stream.JsonWriter",
      "com.google.gson.JsonNull",
      "com.google.gson.internal.bind.JsonTreeReader$1",
      "com.google.gson.internal.bind.JsonTreeReader",
      "com.google.gson.stream.JsonToken",
      "com.google.gson.stream.MalformedJsonException",
      "com.google.gson.internal.bind.JsonTreeWriter$1",
      "com.google.gson.JsonPrimitive",
      "com.google.gson.internal.bind.JsonTreeWriter",
      "com.google.gson.internal.ConstructorConstructor$14",
      "com.google.gson.internal.UnsafeAllocator",
      "com.google.gson.internal.UnsafeAllocator$1",
      "com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl",
      "com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper",
      "com.google.gson.internal.ConstructorConstructor$3",
      "com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl",
      "com.google.gson.internal.ConstructorConstructor$6",
      "com.google.gson.internal.bind.CollectionTypeAdapterFactory$Adapter",
      "com.google.gson.internal.$Gson$Types$WildcardTypeImpl",
      "com.google.gson.JsonArray",
      "com.google.gson.internal.Streams$AppendableWriter",
      "com.google.gson.internal.Streams$AppendableWriter$CurrentWrite",
      "com.google.gson.internal.ConstructorConstructor$12",
      "com.google.gson.internal.bind.MapTypeAdapterFactory$Adapter",
      "com.google.gson.JsonParseException",
      "com.google.gson.JsonSyntaxException",
      "com.google.gson.internal.ConstructorConstructor$8",
      "com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter",
      "com.google.gson.internal.LinkedTreeMap$EntrySet",
      "com.google.gson.internal.LinkedTreeMap$LinkedTreeMapIterator",
      "com.google.gson.internal.LinkedTreeMap$EntrySet$1",
      "com.google.gson.internal.Excluder$1",
      "com.google.gson.internal.LinkedTreeMap$KeySet",
      "com.google.gson.internal.LazilyParsedNumber"
    );
  }
}
