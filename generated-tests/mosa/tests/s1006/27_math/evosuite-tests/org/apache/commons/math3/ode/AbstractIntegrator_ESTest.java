/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 21:22:42 GMT 2018
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.analysis.solvers.IllinoisSolver;
import org.apache.commons.math3.analysis.solvers.PegasusSolver;
import org.apache.commons.math3.analysis.solvers.SecantSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.LutherIntegrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.apache.commons.math3.ode.sampling.StepNormalizerMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(3.634736373360733E-8);
      lutherIntegrator0.getStepHandlers();
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[18];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(2139.35914325313, (-1978.74649), 2139.35914325313, (-1978.74649));
      highamHall54Integrator0.getEventHandlers();
      HighamHall54Integrator highamHall54Integrator1 = new HighamHall54Integrator(2139.35914325313, 1.573964437869041E134, Double.NaN, 3597.072802147278);
      highamHall54Integrator0.setMaxEvaluations(2368);
      highamHall54Integrator1.setSafety((-1978.74649));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2368).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-446.16028));
      double double0 = classicalRungeKuttaIntegrator0.getCurrentStepStart();
      double double1 = new Double(1.573964437869041E134);
      assertNotEquals(double1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(1.1368683772161603E-10);
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(1.1368683772161603E-10);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1.1368683772161603E-10;
      doubleArray0[1] = 1.1368683772161603E-10;
      doubleArray0[2] = 1.1368683772161603E-10;
      doubleArray0[3] = 1.1368683772161603E-10;
      doubleArray0[4] = 1.1368683772161603E-10;
      try { 
        classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1.1368683772161603E-10, doubleArray0, 198.4833, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(812.3561400536963, 812.3561400536963, 812.3561400536963, 812.3561400536963);
      graggBulirschStoerIntegrator0.getEvaluations();
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-2.0183663375378704E-8), (-2.0183663375378704E-8), (-4666.150191132), (-4666.150191132));
      int int0 = highamHall54Integrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-1.0));
      midpointIntegrator0.getName();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1.1368683772161603E-10);
      double double0 = eulerIntegrator0.getCurrentSignedStepsize();
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(1.1368683772161603E-10);
      gillIntegrator0.getCurrentStepStart();
      gillIntegrator0.getEventHandlers();
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      gillIntegrator0.addEventHandler((EventHandler) eventFilter0, 1.1368683772161603E-10, 1.0339757656912846E-22, 8);
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(8, Double.NaN, 3141.824982275, 8, (-2171.2676271599));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 3141.824982275;
      doubleArray0[1] = (-2171.2676271599);
      doubleArray0[2] = Double.NaN;
      firstOrderConverter0.computeDerivatives(Double.NaN, doubleArray0, doubleArray0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      try { 
        adamsBashforthIntegrator0.integrate(expandableStatefulODE0, 3141.824982275);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one column
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(2139.35914325313);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      SecantSolver secantSolver0 = new SecantSolver();
      classicalRungeKuttaIntegrator0.addEventHandler((EventHandler) eventFilter0, (-3268.375953), 2371.3, 1591, (UnivariateSolver) secantSolver0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1094).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      classicalRungeKuttaIntegrator0.integrate(expandableStatefulODE0, (-446.16028));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-540.0), 0.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setControlFactors((-2134.336617), 0.33333333333333287, 0.33333333333333287, 2.591899541396432E-175);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      SecondOrderDifferentialEquations secondOrderDifferentialEquations1 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations1).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations1);
      graggBulirschStoerIntegrator0.getEventHandlers();
      firstOrderConverter0.computeDerivatives(9.094947017729282E-10, doubleArray0, doubleArray0);
      double double0 = (-1.0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-592.9941685709928), 0.0, 9.094947017729282E-10, (-1.0));
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.MULTIPLES;
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer((-991.8224), fixedStepHandler0, stepNormalizerMode0);
      graggBulirschStoerIntegrator1.addStepHandler(stepNormalizer0);
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-540.596984301166), 0.33333333333333287, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setControlFactors(5, 0.33333333333333287, 0.33333333333333287, (-540.596984301166));
      int int0 = 0;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(5, (-540.596984301166), (-540.596984301166), 0.33333333333333287);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-540.596984301166));
      graggBulirschStoerIntegrator1.addEventHandler((EventHandler) eventFilter0, (-540.596984301166), (-540.596984301166), 0, (UnivariateSolver) illinoisSolver0);
      // Undeclared exception!
      graggBulirschStoerIntegrator1.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-540.596984301166), doubleArray0, (double) 5, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(1.1368683772161603E-10);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      PegasusSolver pegasusSolver0 = new PegasusSolver(1.1368683772161603E-10);
      gillIntegrator0.addEventHandler((EventHandler) eventFilter0, 1.1368683772161603E-10, 1.1368683772161603E-10, 4852, (UnivariateSolver) pegasusSolver0);
      gillIntegrator0.getEventHandlers();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.33333333333333287, (-540.0), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setControlFactors(2435.0, 812.3561400536963, 2435.0, (-1.0));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.getEventHandlers();
      firstOrderConverter0.computeDerivatives(5, doubleArray0, doubleArray0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(2435.0, (-1544.0), 148.23976968559, 3376.8411406666664);
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      EventFilter eventFilter1 = new EventFilter(eventFilter0, filterType0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-540.0));
      BrentSolver brentSolver0 = new BrentSolver(5);
      graggBulirschStoerIntegrator1.addEventHandler((EventHandler) eventFilter1, 2.591899541396432E-175, (double) 5, 25, (UnivariateSolver) brentSolver0);
      graggBulirschStoerIntegrator1.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 3.430336362898836E-90, doubleArray0, (-1.0), doubleArray0);
      graggBulirschStoerIntegrator0.clearStepHandlers();
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(2435.0);
      // Undeclared exception!
      classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.33333333333333287, doubleArray0, 3.2441826014060764E125, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-540.0), 0.33333333333333287, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 5, 5, (-540.0));
      graggBulirschStoerIntegrator0.setControlFactors((-2134.336617), 0.33333333333333287, 0.33333333333333287, 2.591899541396432E-175);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.getEventHandlers();
      firstOrderConverter0.computeDerivatives((-540.0), doubleArray0, doubleArray0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-991.8224), (-540.0), (-540.0), 0.33333333333333287);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      EventFilter eventFilter1 = new EventFilter(eventFilter0, filterType0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-991.8224));
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 4.94E-321, 9.094947017729282E-10, 5, (UnivariateSolver) illinoisSolver0);
      graggBulirschStoerIntegrator1.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-462.9998), doubleArray0, (double) 5, doubleArray0);
      graggBulirschStoerIntegrator1.clearStepHandlers();
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-540.0));
      classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 392.6353036814528, doubleArray0, (double) 0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-540.596984301166), 0.33333333333333287, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setControlFactors((-2134.336617), 0.33333333333333287, 0.33333333333333287, 2.591899541396432E-175);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.getEventHandlers();
      firstOrderConverter0.computeDerivatives((-540.596984301166), doubleArray0, doubleArray0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-2134.336617), (-540.596984301166), (-540.596984301166), 0.33333333333333287);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      double double0 = 392.6353036814528;
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(4263.059628861737, 1674.836);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 1000.0, 2368.260572, 5, (UnivariateSolver) illinoisSolver0);
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = 1674.836;
      doubleArray1[2] = (double) 0;
      try { 
        graggBulirschStoerIntegrator1.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (double) 0, doubleArray0, (double) 5, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-540.0), 0.33333333333333287, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 5, 5, (-540.0));
      graggBulirschStoerIntegrator0.setControlFactors((-2134.336617), 0.33333333333333287, 0.33333333333333287, 2.591899541396432E-175);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.getEventHandlers();
      firstOrderConverter0.computeDerivatives((-540.0), doubleArray0, doubleArray0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-991.8224), (-540.0), (-540.0), 0.33333333333333287);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(1000.0);
      classicalRungeKuttaIntegrator0.getCurrentStepStart();
      classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 392.6353036814528, doubleArray0);
  }
}