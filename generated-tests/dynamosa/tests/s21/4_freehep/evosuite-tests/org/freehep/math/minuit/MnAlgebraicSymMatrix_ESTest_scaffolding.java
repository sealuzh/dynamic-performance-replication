/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Mar 23 08:48:33 GMT 2019
 */

package org.freehep.math.minuit;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MnAlgebraicSymMatrix_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.freehep.math.minuit.MnAlgebraicSymMatrix"; 
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
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/4_freehep"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MnAlgebraicSymMatrix_ESTest_scaffolding.class.getClassLoader() ,
      "org.freehep.math.minuit.MinuitParameter",
      "org.freehep.math.minuit.MnUserParameters",
      "org.freehep.math.minuit.FunctionMinimum",
      "org.freehep.math.minuit.MnUserTransformation",
      "org.freehep.math.minuit.MinimumParameters",
      "org.freehep.math.minuit.ContoursError",
      "org.freehep.math.minuit.MinimumState",
      "org.freehep.math.minuit.MnGlobalCorrelationCoeff",
      "org.freehep.math.minuit.MnUserCovariance",
      "org.freehep.math.minuit.MnMachinePrecision",
      "org.freehep.math.minuit.FunctionGradient",
      "org.freehep.math.minuit.MatrixInversionException",
      "org.freehep.math.minuit.MnUserParameterState",
      "org.freehep.math.minuit.Point",
      "org.freehep.math.minuit.MnPrint",
      "org.freehep.math.minuit.MnAlgebraicSymMatrix$EigenvaluesException",
      "org.freehep.math.minuit.MinimumSeed",
      "org.freehep.math.minuit.MnAlgebraicVector",
      "org.freehep.math.minuit.MinosError",
      "org.freehep.math.minuit.MnAlgebraicSymMatrix",
      "org.freehep.math.minuit.MinimumError"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MnAlgebraicSymMatrix_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.freehep.math.minuit.MnAlgebraicSymMatrix",
      "org.freehep.math.minuit.MnAlgebraicSymMatrix$EigenvaluesException",
      "org.freehep.math.minuit.MnPrint",
      "org.freehep.math.minuit.MnAlgebraicVector",
      "org.freehep.math.minuit.MatrixInversionException"
    );
  }
}
