/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 09:31:26 GMT 2019
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.HarmonicOscillator;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.analysis.solvers.IllinoisSolver;
import org.apache.commons.math3.analysis.solvers.MullerSolver;
import org.apache.commons.math3.analysis.solvers.PegasusSolver;
import org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver;
import org.apache.commons.math3.analysis.solvers.RiddersSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondaryEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
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
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.5920095443725586);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (double) 0, doubleArray0, 0.5920095443725586, doubleArray0);
      double double0 = classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (double) 0, doubleArray0, 5.7248419848024, doubleArray0);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
      assertEquals(5.7248419848024, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.5920095443725586);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[0];
      double double0 = classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 4.94E-321, doubleArray0, 5.6843418860808015E-11, doubleArray1);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
      assertEquals(5.6843418860808015E-11, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-2777.317561191324));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.MULTIPLES;
      StepNormalizer stepNormalizer0 = new StepNormalizer((-2777.317561191324), fixedStepHandler0, stepNormalizerMode0);
      threeEighthesIntegrator0.addStepHandler(stepNormalizer0);
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      threeEighthesIntegrator0.integrate(expandableStatefulODE0, 1074.0778569723766);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-881.26033));
      BrentSolver brentSolver0 = new BrentSolver(197.68, 490.113802009146, (-266.08188663));
      threeEighthesIntegrator0.addEventHandler((EventHandler) eventFilter0, (-881.26033), 866.0, 9, (UnivariateSolver) brentSolver0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      threeEighthesIntegrator0.integrate(expandableStatefulODE0, (-301.93));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.04135731729199976);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      double double0 = classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (double) 0, doubleArray0, 0.04135731729199976, doubleArray0);
      assertEquals(0.04135731729199976, double0, 0.01);
      
      classicalRungeKuttaIntegrator0.getEvaluations();
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      double double0 = graggBulirschStoerIntegrator0.getCurrentSignedStepsize();
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2349.43932077311), (-2349.43932077311), 1601.137, 0.0);
      double double0 = graggBulirschStoerIntegrator0.getCurrentSignedStepsize();
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
      assertEquals(2349.43932077311, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(5, (-97.2), (-97.2), doubleArray0, doubleArray0);
      adamsMoultonIntegrator0.setMaxEvaluations(0);
      assertEquals(0, adamsMoultonIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(5, 1848.8891697708905, 0.0, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[6];
      try { 
        dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 63.128936, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 10
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(4.94E-321);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1690.5607501, (double[]) null, 4.94E-321, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-3.193297932837415E-8));
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        midpointIntegrator0.integrate((FirstOrderDifferentialEquations) null, (-1.0), doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(1508.424004603);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      double[] doubleArray0 = new double[2];
      classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-1.0), doubleArray0, 0.0, doubleArray0);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(1263.3796461713696);
      // Undeclared exception!
      try { 
        threeEighthesIntegrator0.computeDerivatives(1.0, (double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, (-1463.4536754499), doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.computeDerivatives(0.0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        classicalRungeKuttaIntegrator0.computeDerivatives((-306.149469853), doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.5920095443725586);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver mullerSolver0 = new MullerSolver((-1751.8922), 0.5920095443725586);
      classicalRungeKuttaIntegrator0.addEventHandler((EventHandler) eventFilter0, 3136.78999297, 5.320482482694994E11, 0, (UnivariateSolver) mullerSolver0);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.5920095443725586);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      HarmonicOscillator harmonicOscillator0 = new HarmonicOscillator(2.220446049250313E-13, 2494.93572996621, 0.5920095443725586);
      regulaFalsiSolver0.solve(1313, (UnivariateFunction) harmonicOscillator0, 2.220446049250313E-13, 2494.93572996621, (-3292.07988));
      classicalRungeKuttaIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.5920095443725586, 0.5920095443725586, 0, (UnivariateSolver) regulaFalsiSolver0);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.5920095443725586);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0);
      classicalRungeKuttaIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.5920095443725586, 0.5920095443725586, 0, (UnivariateSolver) regulaFalsiSolver0);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(1282.9);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      PegasusSolver pegasusSolver0 = new PegasusSolver((-30.0));
      classicalRungeKuttaIntegrator0.addEventHandler((EventHandler) eventFilter0, (-1113.8087412282), 0.0, 5, (UnivariateSolver) pegasusSolver0);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.04135731729199976);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      RiddersSolver riddersSolver0 = new RiddersSolver(5.551115123125783E-14);
      classicalRungeKuttaIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, (-2338.6889944), 519, (UnivariateSolver) riddersSolver0);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator((-431.3735447));
      gillIntegrator0.addEventHandler((EventHandler) null, (-431.3735447), 4.67743, 6, (UnivariateSolver) null);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, (-4764.7975969), 0.0);
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter((EventHandler) null, filterType0);
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter0, (-3879.82117), (double) 720, 0);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-3351.7836958), (-48.225732026), (-3311.72435953022), (-3351.7836958));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      dormandPrince54Integrator0.addEventHandler((EventHandler) eventFilter0, 2445.610991354, (-48.225732026), (-853));
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, (-2452.909841378), (-4764.7975969));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter((EventHandler) null, filterType0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, (-0.35555555555555557), 2291);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1282.9);
      midpointIntegrator0.addEventHandler((EventHandler) null, 1282.9, (-956.8918), 177);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.5920095443725586);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-1587.4547008444), doubleArray0, 437.27652, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.5920095443725586);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      classicalRungeKuttaIntegrator0.addStepHandler((StepHandler) null);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1.1102230246251565E-13, doubleArray0, (double) 0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-619.5892));
      eulerIntegrator0.setMaxEvaluations((-3906));
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(5.6843418860808015E-11, 5.6843418860808015E-11, (-1.3289231465997192E-9), (-1431.2597));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.411954402923584);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 391.1866035453259, (-1.3289231465997192E-9), (-1859), (UnivariateSolver) illinoisSolver0);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.5920095443725586);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      try { 
        classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-1.0), doubleArray0, (-1.0), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(7).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-35.0));
      // Undeclared exception!
      threeEighthesIntegrator0.integrate(expandableStatefulODE0, 1032.564);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.5920095443725586);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((EventHandler.Action) null).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn((double)0, (-645.997663), (double)0, 0.5920095443725586, (-645.997663)).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      classicalRungeKuttaIntegrator0.addEventHandler((EventHandler) eventFilter0, 8.890280021988325, 0.5920095443725586, 5);
      try { 
        classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-1038.0), doubleArray0, (-925.72409), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function values at endpoints do not have different signs, endpoints: [-1,037.408, -1,036.816], values: [645.998, 645.998]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.5920095443725586);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      EventHandler.Action eventHandler_Action0 = EventHandler.Action.STOP;
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(eventHandler_Action0).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn((double)0, (-645.997663), (double)0, 0.5920095443725586, (-645.997663)).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      classicalRungeKuttaIntegrator0.addEventHandler((EventHandler) eventFilter0, 8.890280021988325, 0.5920095443725586, 5);
      double double0 = classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-1038.0), doubleArray0, 0.5920095443725586, doubleArray0);
      assertEquals(4, classicalRungeKuttaIntegrator0.getEvaluations());
      assertEquals((-1037.7039952278137), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.5920095443725586);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[9];
      try { 
        classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1.0, doubleArray0, (-3596.581452562), doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 9 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.5920095443725586);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[5];
      try { 
        classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (double) 0, doubleArray0, 1.2076238768270153E-8, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setMaxEvaluations(177);
      assertEquals(177, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(3092.452902925);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      midpointIntegrator0.addEventHandler((EventHandler) eventFilter0, (-1563.994754791), 0.0, 1639);
      midpointIntegrator0.getEventHandlers();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.5920095443725586);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      EventHandler.Action eventHandler_Action0 = EventHandler.Action.RESET_DERIVATIVES;
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(eventHandler_Action0).when(eventHandler0).eventOccurred(anyDouble() , any(double[].class) , anyBoolean());
      doReturn((double)0, (-645.997663), (double)0, 0.5920095443725586, (-645.997663)).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      classicalRungeKuttaIntegrator0.addEventHandler((EventHandler) eventFilter0, 8.890280021988325, 0.5920095443725586, 5);
      classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-1038.0), doubleArray0, (-925.72409), doubleArray0);
      // Undeclared exception!
      classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-1587.4547008444), doubleArray0, 437.27652, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(3092.452902925);
      midpointIntegrator0.clearEventHandlers();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(965.692209807415, 0.0, 0.0, (-2914.31953111357));
      dormandPrince853Integrator0.getName();
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1282.9);
      midpointIntegrator0.getStepHandlers();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.5920095443725586);
      double double0 = classicalRungeKuttaIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1000.0);
      int int0 = midpointIntegrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.04135731729199976);
      classicalRungeKuttaIntegrator0.getEvaluations();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-3351.7836958), (-48.225732026), (-3311.72435953022), (-3351.7836958));
      dormandPrince54Integrator0.clearStepHandlers();
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }
}
