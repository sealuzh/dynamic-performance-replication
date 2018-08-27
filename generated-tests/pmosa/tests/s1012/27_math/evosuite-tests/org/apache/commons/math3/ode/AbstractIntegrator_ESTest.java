/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 22:43:35 GMT 2018
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm;
import org.apache.commons.math3.analysis.solvers.MullerSolver;
import org.apache.commons.math3.analysis.solvers.MullerSolver2;
import org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver;
import org.apache.commons.math3.analysis.solvers.SecantSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondaryEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.apache.commons.math3.ode.sampling.StepNormalizerBounds;
import org.apache.commons.math3.ode.sampling.StepNormalizerMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 1399.6590799358432;
      double double1 = (-1028.730458);
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1399.6590799358432, (-1028.730458), (-1028.730458), 1399.6590799358432);
      dormandPrince853Integrator0.getOrder();
      dormandPrince853Integrator0.getCurrentSignedStepsize();
      dormandPrince853Integrator0.getName();
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter((EventHandler) null, filterType0);
      MullerSolver mullerSolver0 = new MullerSolver(0.0, 2727.0);
      int int0 = 0;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1028.730458);
      doubleArray0[1] = 0.0;
      PolynomialFunctionNewtonForm polynomialFunctionNewtonForm0 = null;
      try {
        polynomialFunctionNewtonForm0 = new PolynomialFunctionNewtonForm(doubleArray0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // array sizes should have difference 1 (2 != 2 + 1)
         //
         verifyException("org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = (-1180.317360787005);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1180.317360787005);
      doubleArray0[1] = 2257.94729812081;
      doubleArray0[2] = (-1180.317360787005);
      doubleArray0[3] = (-1180.317360787005);
      doubleArray0[4] = 1000.0;
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1180.317360787005), 2257.94729812081, doubleArray0, doubleArray0);
      int int0 = 227;
      dormandPrince54Integrator0.setMaxEvaluations(227);
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(227, 2773.6, 1000.0, (-1180.317360787005), 0.0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.0);
      classicalRungeKuttaIntegrator0.getEvaluations();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      classicalRungeKuttaIntegrator0.singleStep(firstOrderConverter0, (-254.835), doubleArray0, 0.0);
      double double0 = 1135.397253829752;
      classicalRungeKuttaIntegrator0.getStepHandlers();
      double double1 = 0.0;
      double[] doubleArray1 = null;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = null;
      try {
        graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1135.397253829752, 0.0, (double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.0, (-1749.51272582673), (-1749.51272582673), (-1749.51272582673));
      int int0 = dormandPrince853Integrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1583.1168989);
      eulerIntegrator0.getCurrentStepStart();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = Double.NaN;
      doubleArray0[1] = 1583.1168989;
      doubleArray0[2] = Double.NaN;
      doubleArray0[3] = Double.NaN;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 1583.1168989;
      doubleArray0[6] = 1583.1168989;
      doubleArray0[7] = 1583.1168989;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(Double.NaN, 1583.1168989, doubleArray0, doubleArray0);
      double double0 = 0.0;
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.computeDerivatives(1.740249660600677E-253, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = 800.73126407;
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 1.0, doubleArray0, doubleArray0);
      int int0 = (-487);
      graggBulirschStoerIntegrator0.setOrderControl((-487), (-3253.864566724522), (-3253.864566724522));
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(1, 604.2337677256579, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator1.setInterpolationControl(false, 3);
      graggBulirschStoerIntegrator1.setOrderControl(889, 5.377173488599035E239, (-3819.33349553));
      graggBulirschStoerIntegrator1.getEventHandlers();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.clearStepHandlers();
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-33.367848588695), doubleArray0, 1.0, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(0.0);
      threeEighthesIntegrator0.clearEventHandlers();
      threeEighthesIntegrator0.getStepHandlers();
      double double0 = (-925.85109);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(Double.NaN, 0.0, (-5.755303038890997E-8), (-925.85109));
      highamHall54Integrator0.getOrder();
      double double1 = (-2585.2274113570747);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 0.0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(5, 0.0, 34.367848588695, 34.367848588695, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      try { 
        adamsBashforthIntegrator0.integrate(expandableStatefulODE0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one column
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(800.73126407);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(99).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(800.73126407, 595.146, (-2218.2563285962874), 800.73126407, 595.146).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-2218.2563285962874);
      doubleArray0[1] = (double) 99;
      doubleArray0[2] = 800.73126407;
      doubleArray0[3] = 595.146;
      doubleArray0[4] = 7.105427357601002E-12;
      doubleArray0[5] = (double) 99;
      doubleArray0[6] = 595.146;
      doubleArray0[7] = (-2331.16253932369);
      doubleArray0[8] = 595.146;
      eventFilter0.init((-2331.16253932369), doubleArray0, 2787.901821178881);
      threeEighthesIntegrator0.addEventHandler((EventHandler) eventFilter0, 1808.992240118, 1808.992240118, 1442);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      threeEighthesIntegrator0.integrate(expandableStatefulODE0, 800.73126407);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(800.73126407);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      threeEighthesIntegrator0.addEventHandler((EventHandler) eventFilter0, 1808.992240118, 1808.992240118, 1442);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      threeEighthesIntegrator0.integrate(expandableStatefulODE0, 800.73126407);
  }
}