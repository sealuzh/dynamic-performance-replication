/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jul 06 23:42:47 GMT 2018
 */

package org.apache.bcel.classfile;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Utility_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.bcel.classfile.Utility"; 
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
    java.lang.System.setProperty("file.encoding", "ANSI_X3.4-1968"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Europe/Luxembourg"); 
    java.lang.System.setProperty("sun.boot.class.path", "/mnt/gaiagpfs/apps/resif/data/production/v0.3-20170713/default/software/lang/Java/1.8.0_121/jre/lib/resources.jar:/mnt/gaiagpfs/apps/resif/data/production/v0.3-20170713/default/software/lang/Java/1.8.0_121/jre/lib/rt.jar:/mnt/gaiagpfs/apps/resif/data/production/v0.3-20170713/default/software/lang/Java/1.8.0_121/jre/lib/sunrsasign.jar:/mnt/gaiagpfs/apps/resif/data/production/v0.3-20170713/default/software/lang/Java/1.8.0_121/jre/lib/jsse.jar:/mnt/gaiagpfs/apps/resif/data/production/v0.3-20170713/default/software/lang/Java/1.8.0_121/jre/lib/jce.jar:/mnt/gaiagpfs/apps/resif/data/production/v0.3-20170713/default/software/lang/Java/1.8.0_121/jre/lib/charsets.jar:/mnt/gaiagpfs/apps/resif/data/production/v0.3-20170713/default/software/lang/Java/1.8.0_121/jre/lib/jfr.jar:/mnt/gaiagpfs/apps/resif/data/production/v0.3-20170713/default/software/lang/Java/1.8.0_121/jre/classes"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Utility_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.bcel.util.ClassLoaderRepository",
      "org.apache.bcel.classfile.Field",
      "org.apache.bcel.classfile.PMGClass",
      "org.apache.bcel.classfile.ConstantLong",
      "org.apache.bcel.classfile.Utility$JavaWriter",
      "org.apache.bcel.Const",
      "org.apache.bcel.classfile.Method",
      "org.apache.bcel.Constants",
      "org.apache.bcel.classfile.AccessFlags",
      "org.apache.bcel.classfile.Signature$MyByteArrayInputStream",
      "org.apache.bcel.util.SyntheticRepository",
      "org.apache.bcel.classfile.ConstantMethodType",
      "org.apache.bcel.classfile.ConstantInterfaceMethodref",
      "org.apache.bcel.classfile.DescendingVisitor",
      "org.apache.bcel.classfile.Annotations",
      "org.apache.bcel.classfile.Node",
      "org.apache.bcel.classfile.LineNumberTable",
      "org.apache.bcel.classfile.ConstantUtf8$1",
      "org.apache.bcel.generic.Type",
      "org.apache.bcel.util.MemorySensitiveClassPathRepository",
      "org.apache.bcel.classfile.BootstrapMethods",
      "org.apache.bcel.classfile.ClassFormatException",
      "org.apache.bcel.util.BCELComparator",
      "org.apache.bcel.classfile.AnnotationEntry",
      "org.apache.bcel.util.ClassPath$PathEntry",
      "org.apache.bcel.classfile.JavaClass$1",
      "org.apache.bcel.classfile.Utility$JavaReader",
      "org.apache.bcel.classfile.SourceFile",
      "org.apache.bcel.classfile.MethodParameters",
      "org.apache.bcel.classfile.Visitor",
      "org.apache.bcel.util.Repository",
      "org.apache.bcel.util.ByteSequence",
      "org.apache.bcel.classfile.ParameterAnnotations",
      "org.apache.bcel.classfile.RuntimeInvisibleAnnotations",
      "org.apache.bcel.classfile.Signature",
      "org.apache.bcel.classfile.ConstantFieldref",
      "org.apache.bcel.classfile.AnnotationDefault",
      "org.apache.bcel.classfile.ConstantPool",
      "org.apache.bcel.util.ClassPath",
      "org.apache.bcel.classfile.Unknown",
      "org.apache.bcel.classfile.RuntimeVisibleParameterAnnotations",
      "org.apache.bcel.classfile.Utility",
      "org.apache.bcel.classfile.Synthetic",
      "org.apache.bcel.util.ClassPath$1",
      "org.apache.bcel.classfile.FieldOrMethod",
      "org.apache.bcel.util.ByteSequence$ByteArrayStream",
      "org.apache.bcel.classfile.ConstantInteger",
      "org.apache.bcel.classfile.ConstantDouble",
      "org.apache.bcel.classfile.StackMapEntry",
      "org.apache.bcel.classfile.InnerClasses",
      "org.apache.bcel.classfile.StackMap",
      "org.apache.bcel.classfile.ConstantObject",
      "org.apache.bcel.classfile.EmptyVisitor",
      "org.apache.bcel.classfile.Constant$1",
      "org.apache.bcel.classfile.Attribute",
      "org.apache.bcel.classfile.Method$1",
      "org.apache.bcel.classfile.Constant",
      "org.apache.bcel.classfile.CodeException",
      "org.apache.bcel.classfile.Field$1",
      "org.apache.bcel.classfile.JavaClass",
      "org.apache.bcel.classfile.Deprecated",
      "org.apache.bcel.classfile.ConstantClass",
      "org.apache.bcel.classfile.Code",
      "org.apache.bcel.classfile.RuntimeInvisibleParameterAnnotations",
      "org.apache.bcel.classfile.EnclosingMethod",
      "org.apache.bcel.classfile.ParameterAnnotationEntry",
      "org.apache.bcel.classfile.Utility$1",
      "org.apache.bcel.classfile.LocalVariableTable",
      "org.apache.bcel.classfile.AttributeReader",
      "org.apache.bcel.classfile.ConstantUtf8",
      "org.apache.bcel.classfile.UnknownAttributeReader",
      "org.apache.bcel.classfile.ConstantString",
      "org.apache.bcel.classfile.LocalVariable",
      "org.apache.bcel.classfile.ConstantValue",
      "org.apache.bcel.classfile.ConstantInvokeDynamic",
      "org.apache.bcel.classfile.ConstantMethodref",
      "org.apache.bcel.classfile.RuntimeVisibleAnnotations",
      "org.apache.bcel.classfile.LocalVariableTypeTable",
      "org.apache.bcel.classfile.ConstantCP",
      "org.apache.bcel.classfile.ConstantMethodHandle",
      "org.apache.bcel.classfile.LineNumber",
      "org.apache.bcel.classfile.ConstantNameAndType",
      "org.apache.bcel.classfile.ConstantFloat",
      "org.apache.bcel.classfile.InnerClass",
      "org.apache.bcel.classfile.ExceptionTable"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Utility_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.bcel.classfile.Utility",
      "org.apache.bcel.Const",
      "org.apache.bcel.classfile.ClassFormatException",
      "org.apache.bcel.classfile.Attribute",
      "org.apache.bcel.classfile.Constant",
      "org.apache.bcel.classfile.Method",
      "org.apache.bcel.classfile.ConstantUtf8",
      "org.apache.bcel.Constants",
      "org.apache.bcel.classfile.JavaClass",
      "org.apache.bcel.classfile.ElementValue",
      "org.apache.bcel.util.ClassPath",
      "org.apache.bcel.util.SyntheticRepository",
      "org.apache.bcel.classfile.ClassParser",
      "org.apache.bcel.classfile.LineNumberTable",
      "org.apache.bcel.classfile.Field",
      "org.apache.bcel.classfile.ConstantUtf8$CACHE_HOLDER$1",
      "org.apache.bcel.classfile.ConstantUtf8$CACHE_HOLDER"
    );
  }
}
