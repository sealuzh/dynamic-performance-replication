/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 18:46:40 GMT 2019
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.BisectionSolver;
import org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math3.analysis.solvers.IllinoisSolver;
import org.apache.commons.math3.analysis.solvers.MullerSolver;
import org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.apache.commons.math3.ode.sampling.StepNormalizerBounds;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GraggBulirschStoerIntegrator_ESTest extends GraggBulirschStoerIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 364);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(21.806957299584646, 21.806957299584646, 21.806957299584646, 21.806957299584646);
      graggBulirschStoerIntegrator0.setOrderControl(0, (-3.2555596107382053E-9), 0.9999);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-4, 1.0E-4, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(484, 9.835827818608177E-9, 1.0E-4);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 2081.6, 2081.6, 2081.6);
      graggBulirschStoerIntegrator0.setOrderControl(3691, 0.9999, 429.0);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-958.17278619364), 1.0E-4, (-958.17278619364), 1.0E-4);
      graggBulirschStoerIntegrator0.setOrderControl(2911, 1.0E-4, (-958.17278619364));
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-958.17278619364), 4287.108756, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(6, (-958.17278619364), (-1.0));
      assertEquals(4287.108756, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-4, (-1420.3560464), 59874.140625, 1.0);
      graggBulirschStoerIntegrator0.setControlFactors(999.9, 2.6115946769714355, 0.6, 999.9);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-517.0), (-517.0), (-517.0), (-517.0));
      graggBulirschStoerIntegrator0.setControlFactors(3773.2856319621, (-517.0), (-1788.834389332), 1.0001);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setControlFactors(1.739696979522705, 0.9999, (-214.26330888466), 56);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(922.34, 922.34, (-3372.831182), (-1448.3));
      graggBulirschStoerIntegrator0.setControlFactors(0.9999, (-3372.831182), 306.5259654712469, 764.13082349);
      assertEquals(922.34, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-958.17278619364), 4287.108756, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setControlFactors(1.0E-4, 1.0E-4, 1.0E-4, 1628.91195);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, (-1326.082));
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-1929), (-1929), 0.0);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(455.6534695827625, 0.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 0, 0, (-4431.151095));
      assertEquals(0.0, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setOrderControl(38, 0.0, 38);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-249.20524933446984), (-2.4006971787803736E189), (-249.20524933446984), (-249.20524933446984));
      graggBulirschStoerIntegrator0.setOrderControl((-1394), (-249.20524933446984), (-527.12305));
      assertEquals(249.20524933446984, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3.93114092562274E40), 922.34, 0.46486347913742065, 922.34);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 0);
      assertEquals(6.021501906782791E21, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1575.64524, 1575.64524, 1575.64524, 1575.64524);
      graggBulirschStoerIntegrator0.setControlFactors(0.0, 1575.64524, 0.0, 0.0);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-779.672), 963.89, 963.89, 3368.823635730939);
      graggBulirschStoerIntegrator0.setControlFactors(963.89, 0.0, 0.0, 0.6568518877029419);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-958.17278619364), 4287.108756, doubleArray0, doubleArray0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.BOTH;
      StepNormalizer stepNormalizer0 = new StepNormalizer(6, fixedStepHandler0, stepNormalizerBounds0);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      assertEquals(2026.7685959308897, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4287.108756, 0.0, doubleArray0, doubleArray0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 10.0, (double) 1323, 2146846189, (UnivariateSolver) null);
      assertEquals(4287.108756, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 2081.6, 2081.6, 2081.6);
      MullerSolver mullerSolver0 = new MullerSolver(0.0, 0.0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) null, (double) 4, (-1456.1), (-1073795508), (UnivariateSolver) mullerSolver0);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1252.24751879681, 1252.24751879681, 1252.24751879681, 1252.24751879681);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1456.1), 1.0E-4);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, (-357.491), (-517.0), 2856, (UnivariateSolver) regulaFalsiSolver0);
      assertEquals(1252.24751879681, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.0E-7, (-1801), 8.074507236705857E-73, 2081.6);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(1372, 2081.6, (-1192.0));
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) null, (double) 1372, (-1.0), (-359), (UnivariateSolver) illinoisSolver0);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 2081.6, 2081.6, 2081.6);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(2.5039391215625133E-8, 0.9, 0.0, 20);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) null, 999.9, 0.0, 20, (UnivariateSolver) bracketingNthOrderBrentSolver0);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-779.672), 963.89, 963.89, 3368.823635730939);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) null, 0.0, (-3232.385089437), 722, (UnivariateSolver) illinoisSolver0);
      assertEquals(779.672, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-895.944158), (-895.944158), (-895.944158), 1.3106843166204263E-9);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      BisectionSolver bisectionSolver0 = new BisectionSolver((-1496.0));
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 1.9694106578826904, 1.9694106578826904, 0, (UnivariateSolver) bisectionSolver0);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-517.0), (-517.0), (-517.0), (-517.0));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(58).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.setMaxEvaluations(58);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-517.0));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (58) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4287.108756, (-958.17278619364), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1175).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 4287.108756);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2,350 != 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-517.0), (-517.0), (-517.0), (-517.0));
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((ExpandableStatefulODE) null, (double) 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = null;
      try {
        graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, (double[]) null, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(922.34, 922.34, (-3372.831182), (-1448.3));
      graggBulirschStoerIntegrator0.setInterpolationControl(false, (-1776));
      assertEquals(922.34, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-517.0), (-517.0), (-517.0), (-517.0));
      graggBulirschStoerIntegrator0.setOrderControl(0, (-517.0), 0);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1252.24751879681, 1252.24751879681, 1252.24751879681, 1252.24751879681);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 2856, 2856, 0.0);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2451.0, 2451.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1172, 0, 2451.0);
      assertEquals(2451.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-2207.36467));
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1277.834041622347), (-1277.834041622347), (-1277.834041622347), (-939.2802691459656));
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-2144.3));
      assertEquals(11, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-517.0), (-517.0), (-517.0), (-517.0));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-517.0));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-286.0));
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1277.834041622347), (-1277.834041622347), (-1277.834041622347), 1402.5);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-2144.3));
      assertEquals(20, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-286.0));
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.2802691459655762, 4, (-2144.3), 4);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-2.6949659655907758E-8));
      assertEquals((-2.69496596150276E-8), expandableStatefulODE0.getTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-958.17278619364), 1.0E-4, (-958.17278619364), 1.0E-4);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 6, 6, 1.0E-4);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1.0E-4);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-958.17278619364), 4287.108756, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 0.01);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-517.0), (-517.0), (-517.0), (-517.0));
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 7);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 2081.6, 2081.6, 2081.6);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 6);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1.0001);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1.0), (-1.0), (-1.0), (-1.0));
      graggBulirschStoerIntegrator0.setOrderControl(38, 38, 38);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setControlFactors(6057.24164239, 495.6773739, (-3314.1), (-1301.758597763));
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.500420093536377, 0.500420093536377, 0.500420093536377, 0.500420093536377);
      graggBulirschStoerIntegrator0.setControlFactors(0.500420093536377, 0.41647201776504517, 0.9999, 2.144818548E9);
      assertEquals(0.500420093536377, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1.0), (-1.0), (-1.0), (-1.0));
      graggBulirschStoerIntegrator0.addStepHandler((StepHandler) null);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-958.17278619364), 4287.108756, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setControlFactors((-2550.9118276), 1.0E-4, 1.0029339790344238, 1.0029339790344238);
      assertEquals(958.17278619364, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }
}
