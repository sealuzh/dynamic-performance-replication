/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:24:18 GMT 2018
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectStreamConstants;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.function.Ulp;
import org.apache.commons.math3.analysis.solvers.BisectionSolver;
import org.apache.commons.math3.analysis.solvers.MullerSolver2;
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
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
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
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1749.266476422047, 1749.266476422047, 1749.266476422047, 1749.266476422047);
      graggBulirschStoerIntegrator0.setControlFactors(1749.266476422047, 1749.266476422047, 0.0, 0.0);
      assertEquals(1749.266476422047, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 3093.3131682937;
      doubleArray0[1] = 3093.3131682937;
      doubleArray0[2] = 3093.3131682937;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3093.3131682937, 3093.3131682937, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setControlFactors(4.0, 3093.3131682937, 3093.3131682937, 3093.3131682937);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(309.438216345577, 309.438216345577, (-589.6348), 1.1128638067747114E36);
      graggBulirschStoerIntegrator0.setControlFactors(0.003264928160178856, 1.0, 972.20581, 1.0001);
      assertEquals(309.438216345577, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3709.9658366, 3709.9658366, 3709.9658366, 3709.9658366);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 2856);
      graggBulirschStoerIntegrator0.setOrderControl(2856, 1.7976931348623157E308, 574.0712);
      assertEquals(3709.9658366, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1220.93, (-3248.7666001786), 1220.93, 3098.53);
      graggBulirschStoerIntegrator0.setOrderControl(857, (-65.72), 3098.53);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2251.551539141025), 1039.3, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.vecRelativeTolerance = doubleArray0;
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) null, 4250.70287718235, 1039.3, 401, (UnivariateSolver) null);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 757.667944);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-1746.0252);
      doubleArray0[1] = (-1746.0252);
      doubleArray0[2] = 377.65966;
      doubleArray0[3] = 377.65966;
      doubleArray0[4] = 377.65966;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = (-1746.0252);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(377.65966, (-1746.0252), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(490, 0.02, (-1.2281487504266522E-8));
      assertEquals(1746.0252, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-1494.3988094);
      doubleArray0[1] = 0.003264928160178856;
      doubleArray0[2] = 0.003264928160178856;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1494.3988094), 0.003264928160178856, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 4457, 998, (-1494.3988094));
      graggBulirschStoerIntegrator0.setOrderControl(4457, 3294.894299762, 0.003264928160178856);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 891, 4457, 937.36036342896);
      assertEquals(0.003264928160178856, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 775);
      graggBulirschStoerIntegrator0.getEventHandlers();
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 6);
      graggBulirschStoerIntegrator0.setControlFactors(775, 1.0E-4, 6, 6);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1.0001);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 209.3661815464, 0.0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.NEITHER;
      StepNormalizer stepNormalizer0 = new StepNormalizer(543.189827671437, fixedStepHandler0, stepNormalizerBounds0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-7.675790582869644E157);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 209.3661815464;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 0.0;
      stepNormalizer0.init(0.0, doubleArray0, 0.0);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      int int0 = 34;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(34).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 209.3661815464);
      boolean boolean0 = true;
      double double0 = (-1317.0);
      graggBulirschStoerIntegrator0.setStabilityCheck(boolean0, int0, int0, double0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1391.0);
      doubleArray0[1] = (-1391.0);
      doubleArray0[2] = (-1391.0);
      doubleArray0[3] = (-1391.0);
      doubleArray0[4] = (-1391.0);
      doubleArray0[6] = (-1391.0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1391.0), 1052.240617824289, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 14, (-1702), 5.486523121881414E-8);
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(0.65, 14);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(214).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-1391.0), 1.0E15, (-4.5199654318611534E-10), (-1391.0));
      double double0 = 2.1970362663269043;
      graggBulirschStoerIntegrator1.setInitialStepSize(2.1970362663269043);
      graggBulirschStoerIntegrator1.integrate(expandableStatefulODE0, 1.1099648061301941E-7);
      double double1 = 4.0E-15;
      double double2 = 512.4552665716989;
      graggBulirschStoerIntegrator0.setControlFactors(doubleArray0[6], double1, double2, double0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.6, 0.0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.NEITHER;
      StepNormalizer stepNormalizer0 = new StepNormalizer(543.189827671437, fixedStepHandler0, stepNormalizerBounds0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-7.675790582869644E157);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      double double0 = 10.0;
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 10.0, 0.6, 401, (UnivariateSolver) bisectionSolver0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(401).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations1 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations1).getDimension();
      FirstOrderConverter firstOrderConverter1 = new FirstOrderConverter(secondOrderDifferentialEquations1);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE1, (-7.675790582869644E157));
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE1, double0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.375, 1.375, 4006.8448, 3051.018675007675);
      graggBulirschStoerIntegrator0.setControlFactors(3051.018675007675, 1.375, 0.6, 0.6);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn((-3229)).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = null;
      try {
        firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.FirstOrderConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1102.6882), 1.0001, 1.0001, (-1102.6882));
      double double0 = 4.0E-15;
      graggBulirschStoerIntegrator0.setOrderControl(6, 4.0E-15, 6);
      int int0 = 8;
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 6);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator((-674.81448), 1.0001, (-1571.1), 4.0E-15);
      graggBulirschStoerIntegrator1.getEventHandlers();
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator2 = new GraggBulirschStoerIntegrator((-3611.25), 1.0001, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator2.setControlFactors(2247.07, 4.0E-15, 6, 1441.7);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations1 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(secondOrderDifferentialEquations1).getDimension();
      FirstOrderConverter firstOrderConverter1 = new FirstOrderConverter(secondOrderDifferentialEquations1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations2 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(secondOrderDifferentialEquations2).getDimension();
      FirstOrderConverter firstOrderConverter2 = new FirstOrderConverter(secondOrderDifferentialEquations2);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter1);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 3686.993483259248);
      double double1 = (-426.340316778);
      graggBulirschStoerIntegrator0.setControlFactors(double1, int0, double0, double0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1125.49082, 2046.05, doubleArray0, doubleArray0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      graggBulirschStoerIntegrator0.clearStepHandlers();
      graggBulirschStoerIntegrator0.setControlFactors((-1229.13881946), (-1229.13881946), (-2019.194331752343), 1125.49082);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 937);
      graggBulirschStoerIntegrator0.setControlFactors(1052.6118168767655, 0.8, (-8.774170234116), 1922.2707938578);
      assertEquals(1125.49082, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 0.0;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-2251.551539141025), doubleArray0, doubleArray0);
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      Ulp ulp0 = new Ulp();
      mullerSolver2_0.solve(120, (UnivariateFunction) ulp0, (-2251.551539141025), (-3.0307641004671077E-233));
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) null, (-3.303297758377758E-145), (-48.4484), 14, (UnivariateSolver) mullerSolver2_0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(14).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.MULTIPLES;
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.FIRST;
      StepNormalizer stepNormalizer0 = new StepNormalizer((-48.4484), fixedStepHandler0, stepNormalizerMode0, stepNormalizerBounds0);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      graggBulirschStoerIntegrator0.addStepHandler((StepHandler) null);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(944.1061006871962, 14, 985.989593575811, 0.94);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator1.integrate(expandableStatefulODE1, 944.1061006871962);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-1102.6882), 0.0, (-1102.6882));
      graggBulirschStoerIntegrator0.setOrderControl(6, (-1571.1), 0.0);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 604);
      graggBulirschStoerIntegrator0.getEventHandlers();
      boolean boolean0 = true;
      int int0 = 14;
      int int1 = 1;
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 1, 604, (-2971.0));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter((EventHandler) null, filterType0);
      FilterType filterType1 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter1 = new EventFilter(eventFilter0, filterType1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE1, 256.0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double double0 = (-2251.551539141025);
      double double1 = 1039.3;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2251.551539141025), 1039.3, doubleArray0, doubleArray0);
      EventHandler eventHandler0 = null;
      UnivariateSolver univariateSolver0 = null;
      graggBulirschStoerIntegrator0.vecRelativeTolerance = doubleArray0;
      double double2 = 4250.70287718235;
      graggBulirschStoerIntegrator0.addStepHandler((StepHandler) null);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.vecRelativeTolerance = doubleArray0;
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-2251.551539141025), doubleArray0, 2520.0, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double double0 = 2.5465477111883854E-8;
      double double1 = 1212.1573449036;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2123.878923), 2.5465477111883854E-8, 0.65, 1212.1573449036);
      boolean boolean0 = false;
      int int0 = 6;
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 6);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 3);
      graggBulirschStoerIntegrator0.getEventHandlers();
      int int1 = 19;
      int int2 = 2302;
      int int3 = 439;
      double double2 = 0.5;
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2302, 439, 0.5);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(19).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations1 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(439).when(secondOrderDifferentialEquations1).getDimension();
      FirstOrderConverter firstOrderConverter1 = new FirstOrderConverter(secondOrderDifferentialEquations1);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(439).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      int int4 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(0.5, 155.0, 860.3, (-224.0690086));
      graggBulirschStoerIntegrator1.integrate(expandableStatefulODE0, 1212.1573449036);
      graggBulirschStoerIntegrator0.setOrderControl(int2, int1, int4);
      int int5 = (-152);
      double double3 = 628.292;
      graggBulirschStoerIntegrator1.setStabilityCheck(boolean0, int0, int5, double3);
      double double4 = 18.0;
      graggBulirschStoerIntegrator1.integrate(expandableStatefulODE0, double4);
      graggBulirschStoerIntegrator1.setControlFactors(int3, double2, double0, double1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double double0 = 3962.360788;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3962.360788, (-1579.0450165379432), (-1579.0450165379432), 775);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(775, 3962.360788, 1.0E-15, 1.1479863663699871E296);
      graggBulirschStoerIntegrator1.setInitialStepSize(1441.7);
      graggBulirschStoerIntegrator1.integrate(expandableStatefulODE0, 1.6496143246803731E199);
      double double1 = 2302.0;
      double double2 = 1.5229979055675358E-8;
      double double3 = 551.0;
      graggBulirschStoerIntegrator0.setControlFactors(double1, double2, double0, double3);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = 0.0;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 2.5465477111883854E-8, 2.5465477111883854E-8, 2.5465477111883854E-8);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 3);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 3);
      graggBulirschStoerIntegrator0.getEventHandlers();
      int int0 = 19;
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 19, 14, 19);
      MullerSolver2 mullerSolver2_0 = new MullerSolver2((-206.0), (-3332.126225034));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      double double1 = 1.4919618228191664;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(395.50363397, 2756.5690754760653, 3, 2.5465477111883854E-8);
      graggBulirschStoerIntegrator1.setInitialStepSize(2756.5690754760653);
      double double2 = 1814.24258370946;
      graggBulirschStoerIntegrator1.integrate(expandableStatefulODE0, 395.50363397);
      boolean boolean0 = true;
      graggBulirschStoerIntegrator1.setInterpolationControl(boolean0, int0);
      double double3 = 865.5386419;
      graggBulirschStoerIntegrator1.setControlFactors(double3, double0, double2, double1);
  }
}