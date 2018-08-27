/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jul 16 17:20:16 GMT 2018
 */

package org.mozilla.javascript;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Parser_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mozilla.javascript.Parser"; 
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
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Parser_ESTest_scaffolding.class.getClassLoader() ,
      "org.mozilla.javascript.ContextListener",
      "org.mozilla.javascript.Interpreter",
      "org.mozilla.javascript.ClassShutter",
      "org.mozilla.javascript.Node$Scope",
      "org.mozilla.javascript.Kit",
      "org.mozilla.javascript.ScriptableObject$Slot",
      "org.mozilla.javascript.RhinoException",
      "org.mozilla.javascript.DefaultErrorReporter",
      "org.mozilla.javascript.ImporterTopLevel",
      "org.mozilla.javascript.Node",
      "org.mozilla.javascript.debug.DebuggableScript",
      "org.mozilla.javascript.ScriptOrFnNode",
      "org.mozilla.javascript.ContextFactory$Listener",
      "org.mozilla.javascript.ContextFactory",
      "org.mozilla.javascript.Node$Symbol",
      "org.mozilla.javascript.IdScriptableObject",
      "org.mozilla.javascript.NativeArray",
      "org.mozilla.javascript.optimizer.Codegen",
      "org.mozilla.javascript.GeneratedClassLoader",
      "org.mozilla.javascript.VMBridge",
      "org.mozilla.javascript.Script",
      "org.mozilla.javascript.debug.Debugger",
      "org.mozilla.javascript.RegExpProxy",
      "org.mozilla.javascript.ScriptRuntime$MessageProvider",
      "org.mozilla.javascript.jdk13.VMBridge_jdk13",
      "org.mozilla.javascript.Scriptable",
      "org.mozilla.javascript.BaseFunction",
      "org.mozilla.javascript.ObjArray",
      "org.mozilla.javascript.ScriptRuntime",
      "org.mozilla.javascript.Parser",
      "org.mozilla.javascript.InterpretedFunction",
      "org.mozilla.javascript.EcmaError",
      "org.mozilla.javascript.MemberBox",
      "org.mozilla.javascript.xml.XMLObject",
      "org.mozilla.javascript.Callable",
      "org.mozilla.javascript.NativeFunction",
      "org.mozilla.javascript.Decompiler",
      "org.mozilla.javascript.NativeObject",
      "org.mozilla.javascript.IdFunctionCall",
      "org.mozilla.javascript.WrappedException",
      "org.mozilla.javascript.NativeContinuation",
      "org.mozilla.javascript.Node$StringNode",
      "org.mozilla.javascript.Function",
      "org.mozilla.javascript.ScriptableObject$GetterSlot",
      "org.mozilla.javascript.NativeCall",
      "org.mozilla.javascript.xml.XMLLib$Factory",
      "org.mozilla.javascript.Node$PropListItem",
      "org.mozilla.javascript.xml.XMLLib",
      "org.mozilla.javascript.TokenStream",
      "org.mozilla.javascript.Context",
      "org.mozilla.javascript.SecurityController",
      "org.mozilla.javascript.Parser$ParserException",
      "org.mozilla.javascript.EvaluatorException",
      "org.mozilla.javascript.ConstProperties",
      "org.mozilla.javascript.JavaScriptException",
      "org.mozilla.javascript.ContinuationPending",
      "org.mozilla.classfile.ClassFileWriter$ClassFileFormatException",
      "org.mozilla.javascript.FunctionObject",
      "org.mozilla.javascript.UintMap",
      "org.mozilla.javascript.WrapFactory",
      "org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider",
      "org.mozilla.javascript.ErrorReporter",
      "org.mozilla.javascript.ScriptableObject",
      "org.mozilla.javascript.Node$1",
      "org.mozilla.javascript.debug.DebuggableObject",
      "org.mozilla.javascript.CompilerEnvirons",
      "org.mozilla.javascript.FunctionNode",
      "org.mozilla.javascript.IRFactory",
      "org.mozilla.javascript.ContextAction",
      "org.mozilla.javascript.Node$Jump",
      "org.mozilla.javascript.Node$NumberNode",
      "org.mozilla.javascript.ObjToIntMap",
      "org.mozilla.javascript.Evaluator"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Parser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mozilla.javascript.Parser",
      "org.mozilla.javascript.Parser$ParserException",
      "org.mozilla.javascript.Kit",
      "org.mozilla.javascript.optimizer.Codegen",
      "org.mozilla.javascript.Interpreter",
      "org.mozilla.javascript.Context",
      "org.mozilla.javascript.ContextFactory",
      "org.mozilla.javascript.ScriptableObject$Slot",
      "org.mozilla.javascript.ScriptableObject",
      "org.mozilla.javascript.ScriptRuntime",
      "org.mozilla.javascript.VMBridge",
      "org.mozilla.javascript.DToA",
      "org.mozilla.javascript.DefaultErrorReporter",
      "org.mozilla.javascript.Node",
      "org.mozilla.javascript.RhinoException",
      "org.mozilla.javascript.EvaluatorException",
      "org.mozilla.javascript.ObjToIntMap",
      "org.mozilla.javascript.ObjArray",
      "org.mozilla.javascript.Decompiler",
      "org.mozilla.javascript.TokenStream",
      "org.mozilla.javascript.IRFactory",
      "org.mozilla.javascript.FunctionNode",
      "org.mozilla.javascript.SecurityController",
      "org.mozilla.javascript.IdScriptableObject",
      "org.mozilla.javascript.BaseFunction",
      "org.mozilla.javascript.EcmaError",
      "org.mozilla.javascript.JavaAdapter",
      "org.mozilla.javascript.NativeJavaObject",
      "org.mozilla.javascript.NativeJavaClass",
      "org.mozilla.javascript.NativeJavaArray",
      "org.mozilla.javascript.ClassCache",
      "org.mozilla.javascript.NativeObject",
      "org.mozilla.javascript.NativeIterator$StopIteration",
      "org.mozilla.javascript.ImporterTopLevel",
      "org.mozilla.javascript.NativeGenerator",
      "org.mozilla.javascript.UniqueTag",
      "org.mozilla.javascript.Scriptable",
      "org.mozilla.javascript.IdScriptableObject$PrototypeValues",
      "org.mozilla.javascript.NativeJavaPackage",
      "org.mozilla.javascript.NativeArray",
      "org.mozilla.javascript.IdFunctionObject",
      "org.mozilla.javascript.NativeError",
      "org.mozilla.javascript.NativeGlobal",
      "org.mozilla.javascript.Undefined",
      "org.mozilla.javascript.NativeString",
      "org.mozilla.javascript.NativeBoolean",
      "org.mozilla.javascript.NativeNumber",
      "org.mozilla.javascript.NativeDate",
      "org.mozilla.javascript.NativeMath",
      "org.mozilla.javascript.NativeWith",
      "org.mozilla.javascript.NativeCall",
      "org.mozilla.javascript.NativeScript",
      "org.mozilla.javascript.NativeIterator",
      "org.mozilla.javascript.LazilyLoadedCtor",
      "org.mozilla.javascript.ScriptableObject$GetterSlot",
      "org.mozilla.javascript.FunctionObject",
      "org.mozilla.javascript.NativeJavaTopPackage",
      "org.mozilla.javascript.ContinuationPending",
      "org.mozilla.javascript.NativeContinuation"
    );
  }
}
