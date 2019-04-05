/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 09:37:45 GMT 2019
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Rint;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.analysis.solvers.IllinoisSolver;
import org.apache.commons.math3.analysis.solvers.PegasusSolver;
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
import org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(1.0);
      threeEighthesIntegrator0.clearStepHandlers();
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, threeEighthesIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-206.0), (-206.0), (-206.0), (-2536.398037));
      highamHall54Integrator0.clearEventHandlers();
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.04556282049746119, 654.1366685, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[6];
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 0.0, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-877.51), (-877.51), (-877.51), 6991.0511995);
      StepNormalizer stepNormalizer0 = new StepNormalizer((-2344.691908), (FixedStepHandler) null);
      dormandPrince853Integrator0.addStepHandler(stepNormalizer0);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1697.719444175, 2450.9279, doubleArray0, doubleArray0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      BrentSolver brentSolver0 = new BrentSolver(2.2737367544323206E-10, 2053.072633);
      Rint rint0 = new Rint();
      brentSolver0.solve(871, (UnivariateFunction) rint0, 7.47197247068667E-43, 1000.0);
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter0, 1697.719444175, 2450.9279, 871, (UnivariateSolver) brentSolver0);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1697.719444175, 2450.9279, doubleArray0, doubleArray0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      BrentSolver brentSolver0 = new BrentSolver(2.2737367544323206E-10, 2053.072633);
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter0, 1697.719444175, 2450.9279, 871, (UnivariateSolver) brentSolver0);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-877.51), (-877.51), (-877.51), 6991.0511995);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      dormandPrince853Integrator0.addEventHandler((EventHandler) eventFilter0, (-877.51), (-1406.76), (-1483));
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(985.055, (-618.0), 985.055, (-1093.977939982749));
      // Undeclared exception!
      dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-2410.0), doubleArray0, 985.055, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3049.680697575), (-238.52), doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.computeDerivatives(2051.68, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.1521609496625161);
      midpointIntegrator0.setMaxEvaluations((-1890));
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-466.066478), 2.220446049250313E-13, (-466.066478), (-466.066478));
      dormandPrince54Integrator0.getEvaluations();
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.0, 1.0, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(1.0);
      try { 
        dormandPrince853Integrator0.integrate(expandableStatefulODE0, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(3481.710073007366);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      double double0 = eulerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-618.0), doubleArray0, (-2410.0), doubleArray0);
      assertEquals((-2410.0), double0, 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.220446049250313E-13, 2.220446049250313E-13, 2.220446049250313E-13, 2.220446049250313E-13);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-197.83866786069854));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[6];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(Double.NaN, Double.NaN, doubleArray0, doubleArray1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, Double.NaN, doubleArray0, Double.NaN, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(8, 8, 1620.73491552943, 1620.73491552943, 1620.73491552943);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[2];
      try { 
        adamsBashforthIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1620.73491552943, doubleArray0, 2852.466334063, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(141.0508801705, 141.0508801705, 516.0, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      double double0 = graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 1.0, doubleArray0);
      assertEquals(1.0, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1.1508772192025259E-158), 3327.208865328, 3327.208865328, (-1280.500073353));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      PegasusSolver pegasusSolver0 = new PegasusSolver(3327.208865328, (-4532.47), 3327.208865328);
      dormandPrince853Integrator0.addEventHandler((EventHandler) eventFilter0, (-1818.212022), (-1.1508772192025259E-158), Integer.MAX_VALUE, (UnivariateSolver) pegasusSolver0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, (-1280.500073353));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3049.680697575), (-238.52), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setMaxEvaluations(6);
      assertEquals(6, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-1093.8603726225178));
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(9.094947017729282E-10, Double.NaN);
      midpointIntegrator0.addEventHandler((EventHandler) null, (-1093.8603726225178), (-1093.8603726225178), 5, (UnivariateSolver) illinoisSolver0);
      midpointIntegrator0.getEventHandlers();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1000.0, (-591.4062443), (-591.4062443), 1211.95217);
      graggBulirschStoerIntegrator0.getName();
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1.1508772192025259E-158), 3327.208865328, 3327.208865328, (-1280.500073353));
      dormandPrince853Integrator0.getStepHandlers();
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-1093.8603726225178));
      midpointIntegrator0.addEventHandler((EventHandler) null, (-1093.8603726225178), (-286.513063832), 1);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.1521609496625161);
      double double0 = midpointIntegrator0.getCurrentStepStart();
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.1521609496625161);
      int int0 = midpointIntegrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(5, 2174.16050574285, (-1395.4219454), (-477.5421918341), 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      adamsMoultonIntegrator0.integrate(expandableStatefulODE0, (-1395.4219454));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(1914.4166655);
      double double0 = threeEighthesIntegrator0.getCurrentSignedStepsize();
      assertEquals(Integer.MAX_VALUE, threeEighthesIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }
}
