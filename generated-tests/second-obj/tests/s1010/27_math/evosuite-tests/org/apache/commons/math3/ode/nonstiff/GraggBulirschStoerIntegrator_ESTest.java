/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 22:55:12 GMT 2018
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.SecantSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
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
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1564.772348), (-1564.772348), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1999.8573441353851);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(618).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      double double0 = (-1285.4529529398);
      SecantSolver secantSolver0 = new SecantSolver(4, (-1887.37));
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1285.4529529398), (-1285.4529529398), (-822.38496473), 1209.8234530109);
      expandableStatefulODE0.setTime((-1851.5628158441716));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      FilterType filterType1 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter1 = new EventFilter(eventFilter0, filterType1);
      FilterType filterType2 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter2 = new EventFilter(eventFilter1, filterType2);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.6, (-1887.37), (-931), (UnivariateSolver) secantSolver0);
      double double1 = 10.0;
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 0.6);
      double double2 = 210.73085785934342;
      int int0 = 2;
      double double3 = (-75.30808);
      graggBulirschStoerIntegrator0.setOrderControl(int0, double2, double3);
      double double4 = (-580.5475);
      double double5 = (-483.4112667466802);
      graggBulirschStoerIntegrator0.setControlFactors(double4, double1, double5, double0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecantSolver secantSolver0 = new SecantSolver(0.0, (-5.3086706437795354E-9));
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4, 0.0, 1.0368403169781264E257, (-74.81495583057404));
      expandableStatefulODE0.setTime((-2225.723));
      graggBulirschStoerIntegrator0.scalAbsoluteTolerance = (double) 4;
      graggBulirschStoerIntegrator0.setInterpolationControl(true, (-1013));
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minimal step size (4.00E00) reached, integration needs 0.00E00
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecantSolver secantSolver0 = new SecantSolver((-1285.4529529398), (-5.3086706437795354E-9));
      expandableStatefulODE0.setTime((-2225.723));
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(480.8369604209193, 1.0368403169781264E257, 480.8369604209193, 2704.5720774114416);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 10.0);
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.FIRST;
      StepNormalizer stepNormalizer0 = new StepNormalizer((-1618.43329751894), (FixedStepHandler) null, stepNormalizerBounds0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 480.8369604209193);
      graggBulirschStoerIntegrator0.setControlFactors(353.35954746864, 2704.5720774114416, (-3318.1836484), (-2225.723));
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      assertFalse(expandableStatefulODE1.equals((Object)expandableStatefulODE0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecantSolver secantSolver0 = new SecantSolver((-995.0731923), 2296.7094846547);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1914.682347975), 2041.572110110458, (-5.3086706437795354E-9), 4);
      expandableStatefulODE0.setTime((-1.0));
      graggBulirschStoerIntegrator0.setInterpolationControl(true, (-2671));
      graggBulirschStoerIntegrator0.setControlFactors(0.638455867767334, (-1014), 4, (-1.309893394818129E-156));
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1.977118730545044);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-2145044014), 54, 1.977118730545044);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1507.793166404889, 0.0, 0.3416208028793335, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(56).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-1407.919167643), 10.0, (-2636.6362), 0.0);
      graggBulirschStoerIntegrator1.setOrderControl((-992), (-21.771185871094243), 3570.39502);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator1.integrate(expandableStatefulODE1, 10.0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3.424767112658065), (-3.424767112658065), (-3.424767112658065), (-3.424767112658065));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (double) 6);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecantSolver secantSolver0 = new SecantSolver(4, 4);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      SecantSolver secantSolver1 = new SecantSolver((-2225.723), (-5.3086706437795354E-9));
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2225.723), (-1214.9678306144), (-2636.736), 0.94);
      expandableStatefulODE0.setTime(1.0859222881334994E-7);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 4);
      DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.setControlFactors((-2225.723), (-2362.0), (-5.3086706437795354E-9), (-2190.6134006781476));
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1218.00289);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-74.81495583057404));
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-912), (-912), 1.0859222881334994E-7);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecantSolver secantSolver0 = new SecantSolver((-995.0731923), 2296.7094846547);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1914.682347975), 2041.572110110458, (-5.3086706437795354E-9), 4);
      expandableStatefulODE0.setTime((-1.0));
      graggBulirschStoerIntegrator0.setInterpolationControl(true, (-2671));
      graggBulirschStoerIntegrator0.setControlFactors(0.638455867767334, (-1014), 4, (-1.309893394818129E-156));
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1.977118730545044);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-2145044014), 54, 1.977118730545044);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(306.76, 1.0, 490.8369604209193, 1.0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 16, (-186), (-2362.0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1915.761);
      doubleArray0[1] = 1.0;
      doubleArray0[2] = 1.0;
      doubleArray0[3] = (-2170.776162742608);
      doubleArray0[4] = 1.0;
      doubleArray0[5] = 1.0;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3898.641643455, 1.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 5, 5, 1723.48136083);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1792.47), (-943.0), 2537.9, (-943.0));
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 542);
      graggBulirschStoerIntegrator0.setControlFactors((-1792.47), (-708.44336763), (-1792.47), (-708.44336763));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.7976931348623157E308, 0.01, 2047.069131925942, 2047.069131925942);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-502), (-502), 0.02);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E15, 1.0E15, 2171.6, 333052.7320237176);
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 333052.7320237176;
      doubleArray0[2] = 2693.547851;
      doubleArray0[3] = 333052.7320237176;
      doubleArray0[4] = 2171.6;
      graggBulirschStoerIntegrator0.setStepSizeControl(2693.547851, (-488.857421152959), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setControlFactors(500.907, 1.0E15, 2171.6, 0.01009695290858726);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-936.63), (-936.63), (-1138.484), (-1138.484));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(104).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.setControlFactors(104, (-1138.484), 104, 104);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3570.39502, 0.0, 0.0, 1.0E-15);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.setControlFactors((-1407.919167643), (-1407.919167643), 1.0E-4, 1507.793166404889);
      graggBulirschStoerIntegrator0.setControlFactors(0.0, (-1407.919167643), 26.344999848205845, (-71.3987478017807));
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-0.4358505203783363);
      doubleArray0[1] = (-0.4358505203783363);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-0.4358505203783363), (-0.4358505203783363), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(30, (-0.4358505203783363), (-0.4358505203783363));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1605.47963, (-75.4981974363327), (-75.4981974363327), 3.814697265625E-6);
      graggBulirschStoerIntegrator0.setOrderControl((-2146702727), 1605.47963, 3.814697265625E-6);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2023.482143, 2839.822542, (-2221.723), (-2221.723));
      graggBulirschStoerIntegrator0.setOrderControl(680, 0.6, 0.6);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3728.4570751, 3728.4570751, 3728.4570751, 1064.5046604189);
      graggBulirschStoerIntegrator0.clearStepHandlers();
      graggBulirschStoerIntegrator0.setOrderControl(6, 3728.4570751, 1064.5046604189);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.3416208028793335, 0.3416208028793335, 0.3416208028793335, 2.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1911).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.setOrderControl(1911, 1911, 1911);
      graggBulirschStoerIntegrator0.setControlFactors(2.0, (-1285.4529529398), 1.7976931348623157E308, (-426.15258284));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1564.772348), (-1564.772348), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(759).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 18, 18, (-1564.772348));
      graggBulirschStoerIntegrator0.setControlFactors(1406.80233, 0.94, 1406.80233, (-1937.1917874598023));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 1509.502;
      doubleArray0[1] = 1509.502;
      doubleArray0[2] = 1509.502;
      doubleArray0[3] = 1509.502;
      doubleArray0[4] = 1509.502;
      doubleArray0[5] = 1509.502;
      doubleArray0[6] = 1509.502;
      doubleArray0[7] = 1509.502;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1509.502, 1509.502, doubleArray0, doubleArray0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.BOTH;
      StepNormalizer stepNormalizer0 = new StepNormalizer(1.8504673536253893E-8, fixedStepHandler0, stepNormalizerBounds0);
      double[][] doubleArray1 = new double[0][6];
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      graggBulirschStoerIntegrator0.setControlFactors(0.65, 1.8504673536253893E-8, 0.65, (-2418.936457));
      graggBulirschStoerIntegrator0.setControlFactors(293.272747, (-4441.73), 1034.3183923, 1509.502);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-972.4452056);
      doubleArray0[1] = 141.612481551;
      doubleArray0[2] = 141.612481551;
      doubleArray0[3] = (-972.4452056);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(141.612481551, (-972.4452056), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(618).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecantSolver secantSolver0 = new SecantSolver(4, (-1887.37));
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1285.4529529398), (-1285.4529529398), (-822.38496473), 1209.8234530109);
      expandableStatefulODE0.setTime((-1886.33378));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      FilterType filterType1 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter1 = new EventFilter(eventFilter0, filterType1);
      FilterType filterType2 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter2 = new EventFilter(eventFilter1, filterType2);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.6, (-1887.37), (-931), (UnivariateSolver) secantSolver0);
      int int0 = 7;
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-497), (-1013), (-1013));
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      double double0 = (-903.3547548397938);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 3666.65);
      graggBulirschStoerIntegrator0.setOrderControl(int0, int0, double0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      double double0 = (-5.3086706437795354E-9);
      SecantSolver secantSolver0 = new SecantSolver(4, (-2225.723));
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(490.8369604209193, 0.01009695290858726, (-2720.79), 1363.4488913);
      expandableStatefulODE0.setTime(0.01009695290858726);
      boolean boolean0 = true;
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 4);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.BOTH;
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer(498.6484658605264, fixedStepHandler0, stepNormalizerBounds0);
      graggBulirschStoerIntegrator0.addStepHandler(dummyStepHandler0);
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-831.85856278));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minimal step size (4.91E02) reached, integration needs 2.13E-02
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = 4;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecantSolver secantSolver0 = new SecantSolver((-1285.4529529), (-5.3086706437795354E-9));
      expandableStatefulODE0.setTime((-2225.723));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      ExpandableStatefulODE expandableStatefulODE2 = new ExpandableStatefulODE(firstOrderConverter0);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1250.3669938);
      doubleArray0[1] = (-1765.0252568797);
      doubleArray0[2] = (double) 4;
      doubleArray0[3] = (-1765.0252568797);
      doubleArray0[4] = 1665.1534547;
      doubleArray0[5] = 1.0368403169781264E257;
      doubleArray0[6] = (-2011.95317635553);
      doubleArray0[7] = 0.07852803983943983;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2011.95317635553), (-5.3086706437795354E-9), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.sanityChecks(expandableStatefulODE0, (-1765.0252568797));
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 804.0213047577);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minimal step size (2.01E03) reached, integration needs 1.12E-08
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3576.8545126802856, 0.0, 0.0, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.getEventHandlers();
      graggBulirschStoerIntegrator0.clearEventHandlers();
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(670.8, 3576.8545126802856, 314112.1593577594, 3576.8545126802856);
      expandableStatefulODE0.setTime(314112.1593577594);
      graggBulirschStoerIntegrator1.setInterpolationControl(false, 6);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator2 = new GraggBulirschStoerIntegrator(1.601222826656464E-7, (-6.92653479533495E-5), 5.5257514455273825E-8, 61.6080216151);
      graggBulirschStoerIntegrator1.integrate(expandableStatefulODE0, 1.977118730545044);
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.FIRST;
      StepNormalizer stepNormalizer0 = new StepNormalizer(1.601222826656464E-7, fixedStepHandler0, stepNormalizerBounds0);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      graggBulirschStoerIntegrator1.setOrderControl(6, 61.6080216151, 8.990862214387203E-308);
      graggBulirschStoerIntegrator1.setInterpolationControl(false, 6);
  }
}
