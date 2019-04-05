/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Mar 23 07:07:23 GMT 2019
 */

package com.google.re2j;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class RE2_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.re2j.RE2"; 
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
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/6_re2j"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RE2_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.re2j.RE2",
      "com.google.re2j.Parser",
      "com.google.re2j.CharClass",
      "com.google.re2j.Regexp$Op",
      "com.google.re2j.Machine$1",
      "com.google.re2j.RE2$10",
      "com.google.re2j.Machine",
      "com.google.re2j.Simplify",
      "com.google.re2j.MachineInput$UTF16Input",
      "com.google.re2j.Parser$1",
      "com.google.re2j.Parser$Stack",
      "com.google.re2j.Simplify$1",
      "com.google.re2j.Utils",
      "com.google.re2j.RE2$ReplaceFunc",
      "com.google.re2j.Regexp$1",
      "com.google.re2j.Inst$1",
      "com.google.re2j.Parser$Pair",
      "com.google.re2j.PatternSyntaxException",
      "com.google.re2j.Unicode",
      "com.google.re2j.RE2$DeliverFunc",
      "com.google.re2j.Machine$Queue$Entry",
      "com.google.re2j.Inst",
      "com.google.re2j.Prog$1",
      "com.google.re2j.Inst$Op",
      "com.google.re2j.UnicodeTables",
      "com.google.re2j.Machine$Queue",
      "com.google.re2j.Prog",
      "com.google.re2j.RE2$7",
      "com.google.re2j.Regexp",
      "com.google.re2j.Compiler$Frag",
      "com.google.re2j.RE2$6",
      "com.google.re2j.CharGroup",
      "com.google.re2j.RE2$5",
      "com.google.re2j.Parser$StringIterator",
      "com.google.re2j.RE2$4",
      "com.google.re2j.RE2$3",
      "com.google.re2j.RE2$2",
      "com.google.re2j.MachineInput$UTF8Input",
      "com.google.re2j.RE2$1",
      "com.google.re2j.Compiler$1",
      "com.google.re2j.Compiler",
      "com.google.re2j.MachineInput",
      "com.google.re2j.Machine$Thread",
      "com.google.re2j.RE2$9",
      "com.google.re2j.RE2$8"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RE2_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.re2j.RE2",
      "com.google.re2j.RE2$1",
      "com.google.re2j.RE2$2",
      "com.google.re2j.RE2$3",
      "com.google.re2j.RE2$4",
      "com.google.re2j.RE2$5",
      "com.google.re2j.RE2$6",
      "com.google.re2j.RE2$7",
      "com.google.re2j.RE2$8",
      "com.google.re2j.RE2$9",
      "com.google.re2j.RE2$10",
      "com.google.re2j.Regexp$Op",
      "com.google.re2j.Simplify$1",
      "com.google.re2j.Inst$Op",
      "com.google.re2j.Parser",
      "com.google.re2j.Parser$Stack",
      "com.google.re2j.Parser$StringIterator",
      "com.google.re2j.Regexp",
      "com.google.re2j.Parser$1",
      "com.google.re2j.Simplify",
      "com.google.re2j.Compiler",
      "com.google.re2j.Prog",
      "com.google.re2j.Inst",
      "com.google.re2j.Compiler$Frag",
      "com.google.re2j.Compiler$1",
      "com.google.re2j.Unicode",
      "com.google.re2j.UnicodeTables",
      "com.google.re2j.Prog$1",
      "com.google.re2j.Inst$1",
      "com.google.re2j.MachineInput",
      "com.google.re2j.MachineInput$UTF16Input",
      "com.google.re2j.Machine",
      "com.google.re2j.Machine$Queue",
      "com.google.re2j.Utils",
      "com.google.re2j.Machine$Queue$Entry",
      "com.google.re2j.Machine$1",
      "com.google.re2j.Machine$Thread",
      "com.google.re2j.MachineInput$UTF8Input",
      "com.google.re2j.PatternSyntaxException",
      "com.google.re2j.Regexp$1",
      "com.google.re2j.CharClass",
      "com.google.re2j.CharGroup"
    );
  }
}
