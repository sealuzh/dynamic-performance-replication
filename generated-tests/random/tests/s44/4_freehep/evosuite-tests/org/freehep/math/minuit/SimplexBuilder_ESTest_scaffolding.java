/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Mar 24 05:41:45 GMT 2019
 */

package org.freehep.math.minuit;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class SimplexBuilder_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.freehep.math.minuit.SimplexBuilder"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SimplexBuilder_ESTest_scaffolding.class.getClassLoader() ,
      "org.freehep.math.minuit.SqrtUpParameterTransformation",
      "org.freehep.math.minuit.MinuitParameter",
      "org.freehep.math.minuit.FCNGradientBase",
      "org.freehep.math.minuit.MnUtils",
      "org.freehep.math.minuit.MnUserTransformation",
      "org.freehep.math.minuit.MinimumParameters",
      "org.freehep.math.minuit.ContoursError",
      "org.freehep.math.minuit.InitialGradientCalculator",
      "org.freehep.math.minuit.MinimumError$MnInvertFailed",
      "org.freehep.math.minuit.MnUserCovariance",
      "org.freehep.math.minuit.MinimumError$MnNotPosDef",
      "org.freehep.math.minuit.FunctionGradient",
      "org.freehep.math.minuit.AnalyticalGradientCalculator",
      "org.freehep.math.minuit.MnUserParameterState",
      "org.freehep.math.minuit.Pair",
      "org.freehep.math.minuit.MnAlgebraicSymMatrix$EigenvaluesException",
      "org.freehep.math.minuit.FunctionMinimum$MnAboveMaxEdm",
      "org.freehep.math.minuit.MinosError",
      "org.freehep.math.minuit.MinimumError",
      "org.freehep.math.minuit.MinimumError$MnMadePosDef",
      "org.freehep.math.minuit.SimplexBuilder",
      "org.freehep.math.minuit.MnUserParameters",
      "org.freehep.math.minuit.MinimumError$MnHesseFailed",
      "org.freehep.math.minuit.FunctionMinimum",
      "org.freehep.math.minuit.SqrtLowParameterTransformation",
      "org.freehep.math.minuit.HessianGradientCalculator",
      "org.freehep.math.minuit.GradientCalculator",
      "org.freehep.math.minuit.FCNBase",
      "org.freehep.math.minuit.SinParameterTransformation",
      "org.freehep.math.minuit.SimplexParameters",
      "org.freehep.math.minuit.FunctionMinimum$MnReachedCallLimit",
      "org.freehep.math.minuit.MinimumState",
      "org.freehep.math.minuit.MnFcn",
      "org.freehep.math.minuit.MnGlobalCorrelationCoeff",
      "org.freehep.math.minuit.MnStrategy",
      "org.freehep.math.minuit.Numerical2PGradientCalculator",
      "org.freehep.math.minuit.MnMachinePrecision",
      "org.freehep.math.minuit.MatrixInversionException",
      "org.freehep.math.minuit.Point",
      "org.freehep.math.minuit.MnPrint",
      "org.freehep.math.minuit.MinimumSeed",
      "org.freehep.math.minuit.MinimumBuilder",
      "org.freehep.math.minuit.MnAlgebraicVector",
      "org.freehep.math.minuit.MnAlgebraicSymMatrix"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.freehep.math.minuit.FCNBase", false, SimplexBuilder_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.freehep.math.minuit.FCNGradientBase", false, SimplexBuilder_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SimplexBuilder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.freehep.math.minuit.SimplexBuilder",
      "org.freehep.math.minuit.MnFcn",
      "org.freehep.math.minuit.MnUserTransformation",
      "org.freehep.math.minuit.MnMachinePrecision",
      "org.freehep.math.minuit.SinParameterTransformation",
      "org.freehep.math.minuit.SqrtUpParameterTransformation",
      "org.freehep.math.minuit.SqrtLowParameterTransformation",
      "org.freehep.math.minuit.AnalyticalGradientCalculator",
      "org.freehep.math.minuit.MinimumState",
      "org.freehep.math.minuit.MinimumParameters",
      "org.freehep.math.minuit.MnAlgebraicVector",
      "org.freehep.math.minuit.MinimumError",
      "org.freehep.math.minuit.MnAlgebraicSymMatrix",
      "org.freehep.math.minuit.FunctionGradient",
      "org.freehep.math.minuit.MinimumSeed",
      "org.freehep.math.minuit.MnStrategy",
      "org.freehep.math.minuit.MnUtils",
      "org.freehep.math.minuit.Pair",
      "org.freehep.math.minuit.SimplexParameters",
      "org.freehep.math.minuit.FunctionMinimum",
      "org.freehep.math.minuit.MnUserParameterState",
      "org.freehep.math.minuit.MnUserParameters",
      "org.freehep.math.minuit.MnUserCovariance",
      "org.freehep.math.minuit.MnPrint",
      "org.freehep.math.minuit.MnGlobalCorrelationCoeff",
      "org.freehep.math.minuit.Numerical2PGradientCalculator",
      "org.freehep.math.minuit.FunctionMinimum$MnReachedCallLimit",
      "org.freehep.math.minuit.HessianGradientCalculator",
      "org.freehep.math.minuit.MinimumError$MnMadePosDef",
      "org.freehep.math.minuit.MinuitParameter",
      "org.freehep.math.minuit.MinimumError$MnNotPosDef",
      "org.freehep.math.minuit.InitialGradientCalculator",
      "org.freehep.math.minuit.MinimumError$MnHesseFailed",
      "org.freehep.math.minuit.MinimumError$MnInvertFailed",
      "org.freehep.math.minuit.FunctionMinimum$MnAboveMaxEdm",
      "org.freehep.math.minuit.MatrixInversionException"
    );
  }
}
