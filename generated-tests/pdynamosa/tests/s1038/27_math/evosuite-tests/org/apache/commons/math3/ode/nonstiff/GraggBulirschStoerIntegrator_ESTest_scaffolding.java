/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Mar 24 07:33:45 GMT 2019
 */

package org.apache.commons.math3.ode.nonstiff;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class GraggBulirschStoerIntegrator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/test/projects/27_math"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(GraggBulirschStoerIntegrator_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.ode.EquationsMapper",
      "org.apache.commons.math3.ode.AbstractIntegrator",
      "org.apache.commons.math3.analysis.solvers.BisectionSolver",
      "org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver",
      "org.apache.commons.math3.ode.ExpandableStatefulODE",
      "org.apache.commons.math3.ode.events.EventFilter",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.ode.SecondaryEquations",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.exception.MathInternalError",
      "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils",
      "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.analysis.solvers.BaseSecantSolver$Method",
      "org.apache.commons.math3.ode.events.EventHandler",
      "org.apache.commons.math3.ode.sampling.StepNormalizerMode",
      "org.apache.commons.math3.exception.ConvergenceException",
      "org.apache.commons.math3.ode.sampling.StepNormalizerBounds",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.analysis.solvers.SecantSolver",
      "org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.ode.events.EventState",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.ode.sampling.StepInterpolator",
      "org.apache.commons.math3.analysis.solvers.UnivariateSolver",
      "org.apache.commons.math3.exception.TooManyEvaluationsException",
      "org.apache.commons.math3.analysis.solvers.BracketedUnivariateSolver",
      "org.apache.commons.math3.analysis.UnivariateFunction",
      "org.apache.commons.math3.exception.NotFiniteNumberException",
      "org.apache.commons.math3.analysis.solvers.PegasusSolver",
      "org.apache.commons.math3.ode.sampling.StepNormalizer",
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.ode.SecondOrderDifferentialEquations",
      "org.apache.commons.math3.ode.events.FilterType",
      "org.apache.commons.math3.util.Incrementor$1",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.analysis.solvers.AllowedSolution",
      "org.apache.commons.math3.util.FastMath$ExpIntTable",
      "org.apache.commons.math3.ode.events.Transformer",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.ode.FirstOrderDifferentialEquations",
      "org.apache.commons.math3.util.FastMath$ExpFracTable",
      "org.apache.commons.math3.util.Incrementor",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator",
      "org.apache.commons.math3.ode.sampling.StepHandler",
      "org.apache.commons.math3.util.Incrementor$MaxCountExceededCallback",
      "org.apache.commons.math3.ode.FirstOrderIntegrator",
      "org.apache.commons.math3.ode.events.EventState$LocalMaxCountExceededException",
      "org.apache.commons.math3.analysis.solvers.IllinoisSolver",
      "org.apache.commons.math3.ode.events.EventHandler$Action",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.ode.ODEIntegrator",
      "org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.ode.FirstOrderConverter",
      "org.apache.commons.math3.analysis.function.Rint",
      "org.apache.commons.math3.ode.sampling.FixedStepHandler",
      "org.apache.commons.math3.analysis.solvers.BaseSecantSolver",
      "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.ode.events.FilterType$1",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.ode.AbstractIntegrator$1",
      "org.apache.commons.math3.ode.events.FilterType$2",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver",
      "org.apache.commons.math3.exception.NoBracketingException"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.math3.ode.SecondOrderDifferentialEquations", false, GraggBulirschStoerIntegrator_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.commons.math3.ode.events.EventHandler", false, GraggBulirschStoerIntegrator_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.apache.commons.math3.ode.sampling.FixedStepHandler", false, GraggBulirschStoerIntegrator_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(GraggBulirschStoerIntegrator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.ode.AbstractIntegrator",
      "org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator",
      "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.util.FastMath$ExpIntTable",
      "org.apache.commons.math3.util.FastMath$ExpFracTable",
      "org.apache.commons.math3.util.Incrementor",
      "org.apache.commons.math3.util.Incrementor$1",
      "org.apache.commons.math3.ode.events.EventFilter",
      "org.apache.commons.math3.analysis.solvers.BaseAbstractUnivariateSolver",
      "org.apache.commons.math3.analysis.solvers.AbstractUnivariateSolver",
      "org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver",
      "org.apache.commons.math3.analysis.solvers.AllowedSolution",
      "org.apache.commons.math3.ode.events.EventState",
      "org.apache.commons.math3.ode.events.EventHandler$Action",
      "org.apache.commons.math3.ode.ExpandableStatefulODE",
      "org.apache.commons.math3.ode.FirstOrderConverter",
      "org.apache.commons.math3.ode.EquationsMapper",
      "org.apache.commons.math3.ode.sampling.StepNormalizer",
      "org.apache.commons.math3.ode.events.Transformer",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.analysis.solvers.BaseSecantSolver",
      "org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver",
      "org.apache.commons.math3.analysis.solvers.BaseSecantSolver$Method",
      "org.apache.commons.math3.analysis.solvers.MullerSolver2",
      "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator",
      "org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator",
      "org.apache.commons.math3.ode.AbstractIntegrator$1",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.analysis.polynomials.PolynomialFunction",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction",
      "org.apache.commons.math3.analysis.solvers.BisectionSolver",
      "org.apache.commons.math3.ode.events.FilterType$3",
      "org.apache.commons.math3.analysis.solvers.RiddersSolver",
      "org.apache.commons.math3.analysis.function.Inverse",
      "org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.exception.TooManyEvaluationsException",
      "org.apache.commons.math3.analysis.solvers.IllinoisSolver",
      "org.apache.commons.math3.analysis.solvers.MullerSolver",
      "org.apache.commons.math3.analysis.solvers.SecantSolver",
      "org.apache.commons.math3.ode.sampling.DummyStepHandler",
      "org.apache.commons.math3.ode.sampling.DummyStepHandler$LazyHolder",
      "org.apache.commons.math3.analysis.solvers.BrentSolver",
      "org.apache.commons.math3.analysis.function.Cbrt",
      "org.apache.commons.math3.analysis.solvers.PegasusSolver",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.analysis.function.Sigmoid",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.analysis.function.Ceil",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.analysis.function.HarmonicOscillator",
      "org.apache.commons.math3.analysis.function.Sinh",
      "org.apache.commons.math3.analysis.function.Ulp",
      "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm",
      "org.apache.commons.math3.util.MathArrays$OrderDirection",
      "org.apache.commons.math3.util.MathArrays",
      "org.apache.commons.math3.util.MathArrays$Position",
      "org.apache.commons.math3.util.MathArrays$3",
      "org.apache.commons.math3.util.Pair",
      "org.apache.commons.math3.util.MathArrays$1",
      "org.apache.commons.math3.exception.NonMonotonicSequenceException",
      "org.apache.commons.math3.analysis.function.Logit",
      "org.apache.commons.math3.exception.NoBracketingException",
      "org.apache.commons.math3.analysis.function.Atanh",
      "org.apache.commons.math3.analysis.function.Asinh",
      "org.apache.commons.math3.ode.events.EventState$1",
      "org.apache.commons.math3.analysis.function.Gaussian",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.analysis.function.Tanh",
      "org.apache.commons.math3.analysis.solvers.BaseSecantSolver$1",
      "org.apache.commons.math3.analysis.function.Exp",
      "org.apache.commons.math3.analysis.function.Acosh",
      "org.apache.commons.math3.analysis.differentiation.DerivativeStructure",
      "org.apache.commons.math3.analysis.differentiation.DSCompiler",
      "org.apache.commons.math3.analysis.function.Rint",
      "org.apache.commons.math3.analysis.function.Tan",
      "org.apache.commons.math3.analysis.function.Expm1",
      "org.apache.commons.math3.analysis.function.Cos",
      "org.apache.commons.math3.util.FastMath$CodyWaite",
      "org.apache.commons.math3.ode.ExpandableStatefulODE$SecondaryComponent",
      "org.apache.commons.math3.ode.sampling.StepNormalizerMode"
    );
  }
}
