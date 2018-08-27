/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 16:12:56 GMT 2018
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.solvers.IllinoisSolver;
import org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver;
import org.apache.commons.math3.analysis.solvers.RiddersSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.apache.commons.math3.ode.sampling.StepNormalizerBounds;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(3, 3, 1000.0, (-1928.3082), 3);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(2821.371856831, 1000.0, (-1928.3082), 2821.371856831);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      dormandPrince54Integrator0.addStepHandler(dummyStepHandler0);
      adamsBashforthIntegrator0.setStarterIntegrator(dormandPrince54Integrator0);
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      adamsBashforthIntegrator0.addEventHandler((EventHandler) eventFilter0, (double) 3, (double) 3, (-2614));
      adamsBashforthIntegrator0.setMaxEvaluations((-2863));
      adamsBashforthIntegrator0.clearEventHandlers();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      adamsBashforthIntegrator0.setMinReduction(3488.705229981867);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        adamsBashforthIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1400.4824, doubleArray0, (double) 3, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one column
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      RiddersSolver riddersSolver0 = new RiddersSolver();
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.4400174617767334, 0.0, 0.4400174617767334, (-620.8092214));
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 2238.827, 2238.827, 2221, (UnivariateSolver) riddersSolver0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 2221;
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 1316);
      doubleArray0[1] = 2238.827;
      doubleArray0[2] = (-3457480.0);
      doubleArray0[3] = 58.14;
      firstOrderConverter0.computeDerivatives((-620.8092214), doubleArray0, doubleArray0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      FilterType filterType1 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter1 = new EventFilter(eventFilter0, filterType1);
      expandableStatefulODE0.setTime(1643.834358454);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter1, (-1844.870871527867), 211.0, 997);
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-1844.870871527867));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minimal step size (4.40E-01) reached, integration needs 0.00E00
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, (-329.0), (-329.0));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 903.69;
      doubleArray0[1] = (-3267.797);
      doubleArray0[2] = (-3267.797);
      try { 
        highamHall54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-3267.797), doubleArray0, Double.NaN, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(595.879, 595.879, 1602.24, 1602.24);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.addStepHandler(dummyStepHandler0);
      graggBulirschStoerIntegrator0.clearStepHandlers();
      graggBulirschStoerIntegrator0.setMaxEvaluations(471);
      graggBulirschStoerIntegrator0.getMaxEvaluations();
      graggBulirschStoerIntegrator0.getName();
      assertEquals(471, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(371293.0, 371293.0, 371293.0, 371293.0);
      dormandPrince54Integrator0.setStepSizeControl((-3457480.0), (double) (-1), (-3457480.0), (-3457480.0));
      LinkedList<EventHandler> linkedList0 = new LinkedList<EventHandler>();
      dormandPrince54Integrator0.setMinReduction(Double.NaN);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      dormandPrince54Integrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 1607.7026758877394, 2);
      dormandPrince54Integrator0.setMaxGrowth(Double.NaN);
      dormandPrince54Integrator0.setMaxEvaluations(1951);
      dormandPrince54Integrator0.clearStepHandlers();
      dormandPrince54Integrator0.getEvaluations();
      assertEquals(1951, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, 0.0, 0.0);
      highamHall54Integrator0.getStepHandlers();
      int int0 = highamHall54Integrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double double0 = 4.547473508864641E-10;
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(4.547473508864641E-10);
      threeEighthesIntegrator0.getCurrentStepStart();
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventHandler eventHandler1 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler1, filterType0);
      double double1 = 1.908818244934082;
      threeEighthesIntegrator0.addEventHandler((EventHandler) eventFilter0, 1.908818244934082, 4.547473508864641E-10, 0);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(959.76707094392);
      // Undeclared exception!
      try { 
        regulaFalsiSolver0.solve((-1530), (UnivariateFunction) null, 959.76707094392, 4.547473508864641E-10, 1.8477759656842807E-8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-374.5467547226902), 0.0, 0.0, (-374.5467547226902));
      graggBulirschStoerIntegrator0.setStepSizeControl(0.0, (-2704.569), 921.033500177, (-3590.892));
      graggBulirschStoerIntegrator0.getEventHandlers();
      graggBulirschStoerIntegrator0.setControlFactors((-374.5467547226902), 0.0, 1000.0, (-386.5226810238));
      graggBulirschStoerIntegrator0.setControlFactors((-374.5467547226902), (-374.5467547226902), 0.0, (-231.966));
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2704.569), (-231.966), (-3547.1467914096), 0.0);
      dormandPrince54Integrator0.clearEventHandlers();
      dormandPrince54Integrator0.getOrder();
      graggBulirschStoerIntegrator0.setInterpolationControl(true, (-1880));
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.NEITHER;
      StepNormalizer stepNormalizer0 = new StepNormalizer((-386.5226810238), (FixedStepHandler) null, stepNormalizerBounds0);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2146524875, 5, 2848.13);
      graggBulirschStoerIntegrator0.getEventHandlers();
      graggBulirschStoerIntegrator0.getCurrentSignedStepsize();
      dormandPrince54Integrator0.clearEventHandlers();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations1 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations1).getDimension();
      FirstOrderConverter firstOrderConverter1 = new FirstOrderConverter(secondOrderDifferentialEquations1);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter1, (-2238.827), doubleArray0, 999.9, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.sampling.StepNormalizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1984.765733762, 1984.765733762, 3593.084, 1984.765733762);
      graggBulirschStoerIntegrator0.setStepSizeControl(0.0, 1713.38674, 3593.084, 1713.38674);
      graggBulirschStoerIntegrator0.setControlFactors(3593.084, 3593.084, 3593.084, 704.39422);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-159.674594), (-1506.5), 1547.28489539);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 3593.084, 704.39422, (-1095), (UnivariateSolver) illinoisSolver0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-1), 2199, (-159.674594));
      graggBulirschStoerIntegrator0.getEventHandlers();
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer(1653.276, fixedStepHandler0);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }
}