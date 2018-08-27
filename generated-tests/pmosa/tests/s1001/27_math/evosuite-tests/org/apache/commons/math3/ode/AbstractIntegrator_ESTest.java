/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 18:27:41 GMT 2018
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.IllinoisSolver;
import org.apache.commons.math3.analysis.solvers.SecantSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.LutherIntegrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
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
  public void test00()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1659.36, 1659.36, (-3745.6593281364467), 1659.36);
      highamHall54Integrator0.setMinReduction(1659.36);
      highamHall54Integrator0.setSafety(0.0);
      highamHall54Integrator0.clearStepHandlers();
      double double0 = 0.9777777777777777;
      highamHall54Integrator0.setInitialStepSize(1055.9);
      highamHall54Integrator0.getEventHandlers();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1659.36;
      doubleArray0[1] = 1659.36;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.INCREMENT;
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.BOTH;
      StepNormalizer stepNormalizer0 = new StepNormalizer(1659.36, fixedStepHandler0, stepNormalizerMode0, stepNormalizerBounds0);
      highamHall54Integrator0.addStepHandler(stepNormalizer0);
      doubleArray0[5] = (-3745.6593281364467);
      doubleArray0[6] = 1659.36;
      doubleArray0[7] = 1659.36;
      // Undeclared exception!
      try { 
        highamHall54Integrator0.computeDerivatives(0.9777777777777777, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(1.0);
      lutherIntegrator0.getEventHandlers();
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-2784.1);
      doubleArray0[1] = (-2784.1);
      doubleArray0[2] = 1495.36305506712;
      doubleArray0[3] = 903.69;
      double[] doubleArray1 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-2784.1), 1495.36305506712, doubleArray0, doubleArray1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        highamHall54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-2784.1), doubleArray1, 1495.36305506712, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 4
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-374.5467547226902), 0.0, 0.0, (-374.5467547226902));
      graggBulirschStoerIntegrator0.setStepSizeControl(0.0, (-2704.569), 921.033500177, (-3590.892));
      graggBulirschStoerIntegrator0.getEventHandlers();
      graggBulirschStoerIntegrator0.setControlFactors((-374.5467547226902), 0.0, 1000.0, (-386.5226810238));
      graggBulirschStoerIntegrator0.setControlFactors((-374.5467547226902), (-374.5467547226902), 0.0, (-231.966));
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2704.569), (-231.966), (-3547.1467914096), 0.0);
      dormandPrince54Integrator0.clearEventHandlers();
      dormandPrince54Integrator0.getOrder();
      boolean boolean0 = true;
      graggBulirschStoerIntegrator0.setInterpolationControl(true, (-386));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 5, 5, 121.79766750721596);
      graggBulirschStoerIntegrator0.getEventHandlers();
      graggBulirschStoerIntegrator0.getCurrentSignedStepsize();
      dormandPrince54Integrator0.clearEventHandlers();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-386.5226810238);
      doubleArray0[3] = 1000.0;
      doubleArray0[4] = 921.033500177;
      doubleArray0[5] = (-386.5226810238);
      doubleArray0[6] = (-2704.569);
      doubleArray0[7] = (-2704.569);
      doubleArray0[8] = (-3547.1467914096);
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-374.5467547226902), doubleArray0, (-386.5226810238), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 9 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = Double.NaN;
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(Double.NaN, 903.69, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        highamHall54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, Double.NaN, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(0.0);
      eulerIntegrator0.getName();
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(371293.0, 371293.0, 371293.0, 371293.0);
      dormandPrince54Integrator0.setStepSizeControl((-3457480.0), (double) (-1), (-3457480.0), (-3457480.0));
      dormandPrince54Integrator0.getEventHandlers();
      dormandPrince54Integrator0.setMinReduction(Double.NaN);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      dormandPrince54Integrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 1606.8, 2);
      dormandPrince54Integrator0.setMaxGrowth(Double.NaN);
      dormandPrince54Integrator0.setMaxEvaluations((-1));
      dormandPrince54Integrator0.setMaxEvaluations(1951);
      dormandPrince54Integrator0.clearStepHandlers();
      assertEquals(1951, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.6241109587160757;
      doubleArray0[1] = 0.6241109587160757;
      doubleArray0[2] = 0.6241109587160757;
      doubleArray0[3] = 0.6241109587160757;
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = 0.6241109587160757;
      doubleArray1[1] = 0.6241109587160757;
      doubleArray1[2] = 0.6241109587160757;
      doubleArray1[3] = 0.0;
      doubleArray1[4] = 0.6241109587160757;
      doubleArray1[5] = 0.6241109587160757;
      doubleArray1[6] = 0.6241109587160757;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.6241109587160757, 0.6241109587160757, doubleArray0, doubleArray1);
      graggBulirschStoerIntegrator0.clearEventHandlers();
      graggBulirschStoerIntegrator0.setMaxEvaluations(0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, (-682.0), 0.6241109587160757, 0, (UnivariateSolver) null);
      SecantSolver secantSolver0 = new SecantSolver(0, 0.6241109587160757);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.6241109587160757, 0.6241109587160757, (-25), (UnivariateSolver) secantSolver0);
      graggBulirschStoerIntegrator0.getEvaluations();
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = null;
      try {
        adamsMoultonIntegrator0 = new AdamsMoultonIntegrator((-2361), 0.6241109587160757, 0.6241109587160757, doubleArray0, doubleArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator((-2264.117096));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-2264.117096);
      doubleArray0[1] = (-2264.117096);
      firstOrderConverter0.computeDerivatives((-2264.117096), doubleArray0, doubleArray0);
      double double0 = gillIntegrator0.getCurrentSignedStepsize();
      gillIntegrator0.getName();
      double double1 = gillIntegrator0.getCurrentStepStart();
      assertEquals(double1, double0, 0.01);
      
      int int0 = gillIntegrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
      
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      gillIntegrator0.addStepHandler(dummyStepHandler0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2264.117096), Integer.MAX_VALUE, (-2264.117096), 1931.1998);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-261), (-523), 1482.6);
      assertEquals(2205029.350950488, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1032.4048067803221);
      midpointIntegrator0.getStepHandlers();
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      DummyStepHandler.getInstance();
      midpointIntegrator0.addStepHandler(dummyStepHandler0);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1032.4048067803221;
      doubleArray0[1] = 1032.4048067803221;
      doubleArray0[2] = 1032.4048067803221;
      doubleArray0[3] = 1032.4048067803221;
      doubleArray0[4] = 1.0;
      doubleArray0[5] = 1032.4048067803221;
      doubleArray0[6] = 1032.4048067803221;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1032.4048067803221, 1032.4048067803221, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setControlFactors(0.0, 0.0, 1032.4048067803221, (-962.2898084495715));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 1.0, (-1.0), 7, (UnivariateSolver) null);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double double0 = 0.0;
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, 0.0, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(228).when(secondOrderDifferentialEquations0).getDimension();
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((double)228, 0.0, (double)228, (double)228).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 0.0, 1814);
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 0.0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, (-329.0), (-329.0));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(3.3664990715562672E72, Double.NaN);
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 0.0, (-1402), (UnivariateSolver) illinoisSolver0);
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-329.0));
  }
}