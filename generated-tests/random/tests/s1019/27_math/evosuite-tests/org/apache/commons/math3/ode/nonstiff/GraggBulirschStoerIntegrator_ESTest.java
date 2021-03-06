/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 12:51:46 GMT 2019
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Tan;
import org.apache.commons.math3.analysis.solvers.BisectionSolver;
import org.apache.commons.math3.analysis.solvers.MullerSolver;
import org.apache.commons.math3.analysis.solvers.PegasusSolver;
import org.apache.commons.math3.analysis.solvers.RiddersSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondaryEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.NordsieckStepInterpolator;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.apache.commons.math3.ode.sampling.StepNormalizerBounds;
import org.apache.commons.math3.ode.sampling.StepNormalizerMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GraggBulirschStoerIntegrator_ESTest extends GraggBulirschStoerIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2.5316384477288628E8), (-2.5316384477288628E8), 2777.024086, 5.575759739697068E-8);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1235).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.setTime(3390.23641006);
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 5.575759739697068E-8);
      int int0 = 30;
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 30);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer(1.4219324087E-313, fixedStepHandler0);
      NordsieckStepInterpolator nordsieckStepInterpolator0 = new NordsieckStepInterpolator();
      NordsieckStepInterpolator nordsieckStepInterpolator1 = new NordsieckStepInterpolator(nordsieckStepInterpolator0);
      // Undeclared exception!
      try { 
        stepNormalizer0.handleStep(nordsieckStepInterpolator1, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = (-1601.19606465918);
      double double1 = 5.575759739697068E-8;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1601.19606465918), (-1601.19606465918), 0.9, 5.575759739697068E-8);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2296).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(5.575759739697068E-8);
      double double2 = 787.5739698598525;
      graggBulirschStoerIntegrator0.clearEventHandlers();
      boolean boolean0 = false;
      int int0 = (-2561);
      double double3 = 2.872649515690124E56;
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-2561), (-2561), 2.872649515690124E56);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 787.5739698598525);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3.216046320616945E29, 3.216046320616945E29, 3.216046320616945E29, 3.216046320616945E29);
      double double0 = (-2002.316);
      graggBulirschStoerIntegrator0.resetInternalState();
      graggBulirschStoerIntegrator0.setOrderControl(531, 3.216046320616945E29, (-2002.316));
      graggBulirschStoerIntegrator0.setOrderControl(531, 0.94, (-1.2531793589140273E-8));
      graggBulirschStoerIntegrator0.setOrderControl(531, 1.0E-4, 800.4372304);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(312).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (double) 531);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 4074.3562533533636, doubleArray0, doubleArray1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = 0.01;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4392.71377906, (-306.01557769324), (-306.01557769324), 0.01);
      int int0 = 3;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 5.883385169571802E-83;
      doubleArray0[1] = 0.01;
      graggBulirschStoerIntegrator0.vecAbsoluteTolerance = doubleArray0;
      double[] doubleArray1 = new double[0];
      graggBulirschStoerIntegrator0.vecAbsoluteTolerance = doubleArray1;
      graggBulirschStoerIntegrator0.setOrderControl(3, (-1348.036003635674), 0.01);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 3, 3, 3);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 3);
      graggBulirschStoerIntegrator0.setControlFactors((-1348.036003635674), 0.9999, 3082.288901424, 0.6608942747116089);
      graggBulirschStoerIntegrator0.setControlFactors(0.01, 3, 161.0, 3);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 5.883385169571802E-83);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(330.1200071, 603.4339236, 0.6, (-3459.06860348566));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 10.0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 7.37567604176979E-8;
      doubleArray0[1] = 2916.04;
      doubleArray0[2] = (-1161.9176760438547);
      doubleArray0[3] = (-1161.9176760438547);
      doubleArray0[4] = (-1161.9176760438547);
      doubleArray0[5] = 3583.0;
      doubleArray0[6] = 7.37567604176979E-8;
      doubleArray0[7] = (-1161.9176760438547);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1161.9176760438547), 7.37567604176979E-8, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 479);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1141.8177509, 1141.8177509, 1141.8177509, 1141.8177509);
      graggBulirschStoerIntegrator0.setControlFactors(1141.8177509, 1141.8177509, 1141.8177509, 517.96629);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      DummyStepHandler.getInstance();
      DummyStepHandler.getInstance();
      DummyStepHandler.getInstance();
      DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.addStepHandler(dummyStepHandler0);
      graggBulirschStoerIntegrator0.setControlFactors((-250.53121308254), 1213.08465, (-1.0), 279.0);
      boolean boolean0 = false;
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-518), (-518), 1.0E-4);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, (-518));
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.LAST;
      StepNormalizer stepNormalizer0 = new StepNormalizer(517.96629, (FixedStepHandler) null, stepNormalizerBounds0);
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator0.doCopy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1784.048596), 1902.458, (-404.79), (-404.79));
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-404.79);
      doubleArray0[1] = 1902.458;
      doubleArray0[2] = (-1784.048596);
      doubleArray0[3] = 1902.458;
      graggBulirschStoerIntegrator0.vecRelativeTolerance = doubleArray0;
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (-1784.048596);
      doubleArray1[1] = (-1784.048596);
      doubleArray1[2] = 1902.458;
      doubleArray1[3] = (-1784.048596);
      graggBulirschStoerIntegrator0.vecAbsoluteTolerance = doubleArray1;
      graggBulirschStoerIntegrator0.setControlFactors((-1784.048596), 0.01, 0.01, (-2086.8));
      graggBulirschStoerIntegrator0.setOrderControl(2146848638, (-1784.048596), (-1784.048596));
      assertEquals(1902.458, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 330.1200071;
      doubleArray0[2] = (-2122.05);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2122.05), 0.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setControlFactors(0.0, (-1.0), 330.1200071, 0.0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      eventFilter0.init((-2122.05), doubleArray0, 1697.5);
      double double0 = (-1033.0);
      double double1 = 0.0;
      int int0 = 997;
      BisectionSolver bisectionSolver0 = new BisectionSolver(330.1200071);
      int int1 = 1160;
      UnivariateFunction univariateFunction0 = null;
      double double2 = 4.0;
      // Undeclared exception!
      try { 
        bisectionSolver0.solve(7, (UnivariateFunction) null, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-4590.24), 1209.164167, 0.0, (-4590.24));
      graggBulirschStoerIntegrator0.setOrderControl(763, 941.61324261469, (-4590.24));
      assertEquals(4590.24, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 650.433969012;
      doubleArray0[1] = 650.433969012;
      doubleArray0[2] = 212.602;
      doubleArray0[3] = 1.5159096717834473;
      doubleArray0[4] = 212.602;
      doubleArray0[5] = 212.602;
      doubleArray0[6] = 650.433969012;
      doubleArray0[7] = 212.602;
      doubleArray0[8] = 212.602;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(650.433969012, 212.602, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.filterStep(934.93867049, false, false);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.NEITHER;
      StepNormalizer stepNormalizer0 = new StepNormalizer(0.0, fixedStepHandler0, stepNormalizerBounds0);
      stepNormalizer0.init(0.6, doubleArray0, 1.0E-15);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-3391), 869, 3381.8146912300535);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      PegasusSolver pegasusSolver0 = new PegasusSolver(2846.07247475, 212.602);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, (-853.441745), 1.0, (-925), (UnivariateSolver) pegasusSolver0);
      assertEquals(650.433969012, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-750.18289692878);
      doubleArray0[1] = (-750.18289692878);
      doubleArray0[2] = 6.033249389304709E-115;
      doubleArray0[3] = 6.033249389304709E-115;
      doubleArray0[4] = 2.8557016344085205E-8;
      doubleArray0[5] = (-750.18289692878);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-750.18289692878), 6.033249389304709E-115, doubleArray0, doubleArray0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.INCREMENT;
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.LAST;
      StepNormalizer stepNormalizer0 = new StepNormalizer(0.0, fixedStepHandler0, stepNormalizerMode0, stepNormalizerBounds0);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E15, 1.0E15, 1.0E15, 0.0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 6, (-152), (-382.01648672362));
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.addStepHandler(dummyStepHandler0);
      graggBulirschStoerIntegrator0.setControlFactors((-1764.57650315), 6, (-1.1524714043067699E-7), (-382.01648672362));
      graggBulirschStoerIntegrator0.setControlFactors((-1.1524714043067699E-7), 0.0, (-1.1524714043067699E-7), 1104.7281);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 6);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 5.883385169571802E-83;
      doubleArray0[1] = 0.01;
      double[] doubleArray1 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(161.0, 161.0, doubleArray1, doubleArray0);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 3);
      graggBulirschStoerIntegrator0.setOrderControl(3, (-1348.036003635674), 0.01);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2703.2426512, 2703.2426512, 2703.2426512, 2703.2426512);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, (-773));
      assertEquals(2703.2426512, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(676.684706749521, 676.684706749521, 676.684706749521, (-2942.42));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-1534), (-1534), 749.116890185);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver mullerSolver0 = new MullerSolver(1.959817886352539, 921.305);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 3304.835551, 2.872649515690124E56, 833, (UnivariateSolver) mullerSolver0);
      assertEquals(0, mullerSolver0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3.216046320616945E29, 3.216046320616945E29, 3.216046320616945E29, 3.216046320616945E29);
      graggBulirschStoerIntegrator0.resetInternalState();
      graggBulirschStoerIntegrator0.setOrderControl(531, 3.216046320616945E29, (-2002.316));
      graggBulirschStoerIntegrator0.setOrderControl(531, 0.94, (-1.2531793589140273E-8));
      graggBulirschStoerIntegrator0.setOrderControl(531, 1.0E-4, 800.4372304);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(312).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(800.4372304);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (double) 531);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 199, (-1236), (-2002.316));
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.addStepHandler(dummyStepHandler0);
      assertEquals(11, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-1686.31);
      doubleArray0[1] = (-1686.31);
      doubleArray0[2] = (-6.032174644509064E-23);
      doubleArray0[3] = 2382.4;
      doubleArray0[4] = (-1686.31);
      doubleArray0[5] = (-1686.31);
      doubleArray0[6] = 2382.4;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2382.4, (-1686.31), doubleArray0, doubleArray0);
      int int0 = (-3967);
      graggBulirschStoerIntegrator0.setOrderControl((-3967), (-1686.31), 4.0);
      graggBulirschStoerIntegrator0.setControlFactors((-6.032174644509064E-23), 4.0, 2382.4, (-6.032174644509064E-23));
      graggBulirschStoerIntegrator0.resetInternalState();
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-3967), 2146833847, (-2486.1568956));
      ExpandableStatefulODE expandableStatefulODE0 = null;
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((ExpandableStatefulODE) null, 2284.266767789);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double double0 = 525.12369094866;
      double double1 = 2.6565358606792454E19;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(525.12369094866, 525.12369094866, 2.6565358606792454E19, 1699.631364);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      int int0 = 3237;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 4.0;
      doubleArray0[1] = (double) 3237;
      eventFilter0.init(1699.631364, doubleArray0, 4.0);
      RiddersSolver riddersSolver0 = new RiddersSolver(4.0, 5.575748218689114E-8);
      Tan tan0 = new Tan();
      try { 
        riddersSolver0.solve(3237, (UnivariateFunction) tan0, 5.575748218689114E-8, (-58.6799663660472), 2.6565358606792454E19);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // endpoints do not specify an interval: [0, -58.68]
         //
         verifyException("org.apache.commons.math3.analysis.solvers.UnivariateSolverUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1606.438449838, (-1348.036003635674), (-5.2848), (-1348.036003635674));
      graggBulirschStoerIntegrator0.setControlFactors((-1348.036003635674), 0.8, (-1348.036003635674), 662.72479);
      assertEquals(1606.438449838, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double double0 = (-1601.19606465918);
      double double1 = 5.575759739697068E-8;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1601.19606465918), (-3.3878706977811337E-19), 0.9, 5.575759739697068E-8);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(5.575759739697068E-8);
      double double2 = 787.5739698598525;
      graggBulirschStoerIntegrator0.clearEventHandlers();
      int int0 = (-2561);
      double double3 = 2.872649515690124E56;
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-2561), (-2561), 2.872649515690124E56);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 787.5739698598525);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-822.9992955302), (-822.9992955302), (-822.9992955302), (-233.4966136350471));
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.INCREMENT;
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.NEITHER;
      StepNormalizer stepNormalizer0 = new StepNormalizer((-822.9992955302), fixedStepHandler0, stepNormalizerMode0, stepNormalizerBounds0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-3134.1019710377027);
      stepNormalizer0.init((-822.9992955302), doubleArray0, (-233.4966136350471));
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-2197), 805, 1987.4702);
      graggBulirschStoerIntegrator0.setOrderControl(560, (-593.107183945446), (-2104.0));
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }
}
