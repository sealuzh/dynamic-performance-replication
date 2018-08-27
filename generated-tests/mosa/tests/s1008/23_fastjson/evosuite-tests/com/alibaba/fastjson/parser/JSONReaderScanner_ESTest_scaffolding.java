/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jul 06 23:12:24 GMT 2018
 */

package com.alibaba.fastjson.parser;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class JSONReaderScanner_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.alibaba.fastjson.parser.JSONReaderScanner"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JSONReaderScanner_ESTest_scaffolding.class.getClassLoader() ,
      "com.alibaba.fastjson.serializer.SerializeFilter",
      "com.alibaba.fastjson.parser.JSONLexer",
      "com.alibaba.fastjson.JSONException",
      "com.alibaba.fastjson.serializer.SerializerFeature",
      "com.alibaba.fastjson.parser.SymbolTable",
      "com.alibaba.fastjson.util.IOUtils",
      "com.alibaba.fastjson.JSONAware",
      "com.alibaba.fastjson.parser.JSONLexerBase",
      "com.alibaba.fastjson.JSON",
      "com.alibaba.fastjson.parser.JSONReaderScanner",
      "com.alibaba.fastjson.JSONStreamAware",
      "com.alibaba.fastjson.parser.Feature",
      "com.alibaba.fastjson.util.IOUtils$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JSONReaderScanner_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.alibaba.fastjson.parser.Feature",
      "com.alibaba.fastjson.serializer.SerializerFeature",
      "com.alibaba.fastjson.util.IOUtils",
      "com.alibaba.fastjson.JSON",
      "com.alibaba.fastjson.parser.JSONLexerBase",
      "com.alibaba.fastjson.parser.JSONReaderScanner",
      "com.alibaba.fastjson.JSONException",
      "com.alibaba.fastjson.util.UTF8Decoder",
      "com.alibaba.fastjson.parser.JSONToken"
    );
  }
}
