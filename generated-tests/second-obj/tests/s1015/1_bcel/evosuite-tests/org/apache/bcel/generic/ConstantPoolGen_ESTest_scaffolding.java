/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Jul 07 03:11:32 GMT 2018
 */

package org.apache.bcel.generic;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ConstantPoolGen_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.bcel.generic.ConstantPoolGen"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ConstantPoolGen_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.bcel.generic.ISTORE",
      "org.apache.bcel.generic.InstructionList",
      "org.apache.bcel.classfile.ConstantLong",
      "org.apache.bcel.Const",
      "org.apache.bcel.classfile.Method",
      "org.apache.bcel.generic.INVOKESTATIC",
      "org.apache.bcel.generic.StackProducer",
      "org.apache.bcel.classfile.ConstantMethodType",
      "org.apache.bcel.generic.LLOAD",
      "org.apache.bcel.generic.LoadInstruction",
      "org.apache.bcel.generic.Select",
      "org.apache.bcel.generic.ConstantPoolGen",
      "org.apache.bcel.generic.StoreInstruction",
      "org.apache.bcel.classfile.Node",
      "org.apache.bcel.generic.IF_ICMPEQ",
      "org.apache.bcel.generic.Instruction",
      "org.apache.bcel.generic.GOTO",
      "org.apache.bcel.generic.Type",
      "org.apache.bcel.generic.IF_ICMPNE",
      "org.apache.bcel.util.BCELComparator",
      "org.apache.bcel.classfile.ClassFormatException",
      "org.apache.bcel.classfile.AnnotationEntry",
      "org.apache.bcel.generic.IFLT",
      "org.apache.bcel.generic.MethodGen",
      "org.apache.bcel.generic.IFEQ",
      "org.apache.bcel.generic.InstructionListObserver",
      "org.apache.bcel.generic.IF_ICMPGE",
      "org.apache.bcel.generic.TargetLostException",
      "org.apache.bcel.generic.INVOKESPECIAL",
      "org.apache.bcel.classfile.JavaClass$1",
      "org.apache.bcel.generic.LDC",
      "org.apache.bcel.generic.SIPUSH",
      "org.apache.bcel.generic.CHECKCAST",
      "org.apache.bcel.generic.IFNE",
      "org.apache.bcel.classfile.Visitor",
      "org.apache.bcel.generic.VariableLengthInstruction",
      "org.apache.bcel.util.ByteSequence",
      "org.apache.bcel.classfile.ParameterAnnotations",
      "org.apache.bcel.generic.ArithmeticInstruction",
      "org.apache.bcel.generic.InstructionTargeter",
      "org.apache.bcel.generic.PUTSTATIC",
      "org.apache.bcel.generic.BasicType",
      "org.apache.bcel.generic.UnconditionalBranch",
      "org.apache.bcel.generic.LocalVariableInstruction",
      "org.apache.bcel.generic.GETFIELD",
      "org.apache.bcel.generic.INVOKEDYNAMIC",
      "org.apache.bcel.generic.GOTO_W",
      "org.apache.bcel.generic.InstructionHandle",
      "org.apache.bcel.generic.JsrInstruction",
      "org.apache.bcel.generic.ConstantPoolGen$Index",
      "org.apache.bcel.generic.FieldGenOrMethodGen",
      "org.apache.bcel.generic.ALOAD",
      "org.apache.bcel.generic.LSTORE",
      "org.apache.bcel.generic.JSR",
      "org.apache.bcel.classfile.Utility",
      "org.apache.bcel.generic.BREAKPOINT",
      "org.apache.bcel.classfile.ConstantInteger",
      "org.apache.bcel.classfile.ConstantDouble",
      "org.apache.bcel.generic.GotoInstruction",
      "org.apache.bcel.generic.BranchHandle",
      "org.apache.bcel.generic.IFNONNULL",
      "org.apache.bcel.generic.NamedAndTyped",
      "org.apache.bcel.generic.InstructionComparator",
      "org.apache.bcel.generic.IF_ICMPGT",
      "org.apache.bcel.classfile.Constant$1",
      "org.apache.bcel.generic.ClassGenException",
      "org.apache.bcel.generic.ObjectType",
      "org.apache.bcel.classfile.ConstantClass",
      "org.apache.bcel.generic.IF_ACMPEQ",
      "org.apache.bcel.generic.StackConsumer",
      "org.apache.bcel.generic.BranchInstruction",
      "org.apache.bcel.generic.MethodObserver",
      "org.apache.bcel.classfile.Utility$1",
      "org.apache.bcel.classfile.LocalVariableTable",
      "org.apache.bcel.classfile.ConstantUtf8",
      "org.apache.bcel.classfile.ConstantString",
      "org.apache.bcel.generic.IFLE",
      "org.apache.bcel.classfile.ConstantInvokeDynamic",
      "org.apache.bcel.classfile.ConstantMethodHandle",
      "org.apache.bcel.classfile.ConstantCP",
      "org.apache.bcel.generic.PopInstruction",
      "org.apache.bcel.classfile.ConstantFloat",
      "org.apache.bcel.generic.Visitor",
      "org.apache.bcel.generic.CPInstruction",
      "org.apache.bcel.generic.IF_ACMPNE",
      "org.apache.bcel.generic.FSTORE",
      "org.apache.bcel.generic.IMPDEP1",
      "org.apache.bcel.classfile.Field",
      "org.apache.bcel.generic.AnnotationEntryGen",
      "org.apache.bcel.generic.ReferenceType",
      "org.apache.bcel.generic.LDC2_W",
      "org.apache.bcel.generic.TypedInstruction",
      "org.apache.bcel.generic.InvokeInstruction",
      "org.apache.bcel.generic.MULTIANEWARRAY",
      "org.apache.bcel.Constants",
      "org.apache.bcel.classfile.AccessFlags",
      "org.apache.bcel.generic.IMPDEP2",
      "org.apache.bcel.classfile.ConstantInterfaceMethodref",
      "org.apache.bcel.generic.DSTORE",
      "org.apache.bcel.generic.ANEWARRAY",
      "org.apache.bcel.classfile.LineNumberTable",
      "org.apache.bcel.generic.RET",
      "org.apache.bcel.classfile.ConstantUtf8$1",
      "org.apache.bcel.generic.NEW",
      "org.apache.bcel.generic.JSR_W",
      "org.apache.bcel.generic.LOOKUPSWITCH",
      "org.apache.bcel.generic.FieldInstruction",
      "org.apache.bcel.generic.ArrayType",
      "org.apache.bcel.generic.ILOAD",
      "org.apache.bcel.generic.FieldOrMethod",
      "org.apache.bcel.generic.Type$2",
      "org.apache.bcel.generic.Type$1",
      "org.apache.bcel.util.Repository",
      "org.apache.bcel.classfile.ConstantFieldref",
      "org.apache.bcel.generic.CodeExceptionGen",
      "org.apache.bcel.generic.IndexedInstruction",
      "org.apache.bcel.generic.BIPUSH",
      "org.apache.bcel.generic.InstructionComparator$1",
      "org.apache.bcel.generic.LineNumberGen",
      "org.apache.bcel.generic.Type$3",
      "org.apache.bcel.generic.MethodGen$1",
      "org.apache.bcel.classfile.ConstantPool",
      "org.apache.bcel.generic.TABLESWITCH",
      "org.apache.bcel.generic.PushInstruction",
      "org.apache.bcel.generic.FCMPG",
      "org.apache.bcel.generic.LocalVariableGen",
      "org.apache.bcel.generic.FLOAD",
      "org.apache.bcel.generic.IF_ICMPLE",
      "org.apache.bcel.classfile.FieldOrMethod",
      "org.apache.bcel.generic.ConstantPushInstruction",
      "org.apache.bcel.generic.IFNULL",
      "org.apache.bcel.classfile.ConstantObject",
      "org.apache.bcel.generic.INSTANCEOF",
      "org.apache.bcel.generic.ASTORE",
      "org.apache.bcel.generic.INVOKEVIRTUAL",
      "org.apache.bcel.generic.LoadClass",
      "org.apache.bcel.generic.INVOKEINTERFACE",
      "org.apache.bcel.generic.AllocationInstruction",
      "org.apache.bcel.generic.NEWARRAY",
      "org.apache.bcel.classfile.Attribute",
      "org.apache.bcel.classfile.Constant",
      "org.apache.bcel.classfile.CodeException",
      "org.apache.bcel.generic.GETSTATIC",
      "org.apache.bcel.classfile.JavaClass",
      "org.apache.bcel.classfile.Code",
      "org.apache.bcel.generic.IFGT",
      "org.apache.bcel.generic.LDC_W",
      "org.apache.bcel.generic.DLOAD",
      "org.apache.bcel.generic.IINC",
      "org.apache.bcel.generic.IFGE",
      "org.apache.bcel.generic.IF_ICMPLT",
      "org.apache.bcel.generic.PUTFIELD",
      "org.apache.bcel.classfile.ConstantMethodref",
      "org.apache.bcel.generic.DADD",
      "org.apache.bcel.classfile.ConstantNameAndType",
      "org.apache.bcel.generic.ExceptionThrower",
      "org.apache.bcel.generic.IfInstruction",
      "org.apache.bcel.generic.CompoundInstruction",
      "org.apache.bcel.classfile.ExceptionTable"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ConstantPoolGen_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.bcel.generic.ConstantPoolGen",
      "org.apache.bcel.classfile.Constant",
      "org.apache.bcel.classfile.ConstantUtf8",
      "org.apache.bcel.classfile.ClassFormatException",
      "org.apache.bcel.generic.InstructionComparator",
      "org.apache.bcel.generic.Instruction",
      "org.apache.bcel.generic.ClassGenException",
      "org.apache.bcel.generic.MethodGen",
      "org.apache.bcel.classfile.Method",
      "org.apache.bcel.Const",
      "org.apache.bcel.classfile.Attribute",
      "org.apache.bcel.generic.Type",
      "org.apache.bcel.classfile.Utility",
      "org.apache.bcel.generic.InstructionHandle",
      "org.apache.bcel.generic.BranchHandle",
      "org.apache.bcel.generic.InstructionConst",
      "org.apache.bcel.Constants",
      "org.apache.bcel.util.SyntheticRepository",
      "org.apache.bcel.util.ClassPath",
      "org.apache.bcel.Repository",
      "org.apache.bcel.classfile.ClassParser",
      "org.apache.bcel.classfile.LineNumberTable",
      "org.apache.bcel.classfile.JavaClass",
      "org.apache.bcel.verifier.structurals.Frame",
      "org.apache.bcel.verifier.structurals.InstConstraintVisitor",
      "org.apache.bcel.classfile.Unknown",
      "org.apache.bcel.classfile.Field",
      "org.apache.bcel.generic.InstructionConstants",
      "org.apache.bcel.generic.ReturnaddressType",
      "org.apache.bcel.classfile.ElementValue",
      "org.apache.bcel.generic.ElementValueGen",
      "org.apache.bcel.classfile.ConstantUtf8$CACHE_HOLDER$1",
      "org.apache.bcel.classfile.ConstantUtf8$CACHE_HOLDER",
      "org.apache.bcel.ExceptionConst$EXCS",
      "org.apache.bcel.ExceptionConst",
      "org.apache.bcel.ExceptionConst$1",
      "org.apache.bcel.verifier.exc.AssertionViolatedException"
    );
  }
}
