/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 18:09:25 GMT 2018
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.BisectionSolver;
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GraggBulirschStoerIntegrator_ESTest extends GraggBulirschStoerIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-174.10112706), (-174.10112706), (-174.10112706), (-174.10112706));
      graggBulirschStoerIntegrator0.setOrderControl(3143, 3109.0, (-174.10112706));
      assertEquals(174.10112706, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-174.10112706), (-174.10112706), (-174.10112706), (-174.10112706));
      graggBulirschStoerIntegrator0.setOrderControl(642, 1166.4662178384, (-93.0));
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.setOrderControl(4, 4, 4);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, (double) 4, (double) 4, 998, (UnivariateSolver) bisectionSolver0);
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-414.0), (-414.0), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setOrderControl(4, (-414.0), 4);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-174.10112706), (-174.10112706), (-174.10112706), (-174.10112706));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-174.10112706));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2.883847036065813E-246), (-2.883847036065813E-246), (-2.883847036065813E-246), (-2.883847036065813E-246));
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 34);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1156, 1156, 34);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 2.0088042407239129E-7, 2.0088042407239129E-7, 0.0);
      graggBulirschStoerIntegrator0.getEventHandlers();
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.addStepHandler(dummyStepHandler0);
      graggBulirschStoerIntegrator0.setOrderControl(4, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.6, 0.6, 0.6, 0.6);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.getCompleteState();
      expandableStatefulODE0.setTime(0.6);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1785.38193);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4.0, 4.0, 4.0, 4.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 4.0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.9, 0.9);
      graggBulirschStoerIntegrator0.setOrderControl(4, 0.0, 0.9);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.6, 0.6, 0.6, 0.6);
      graggBulirschStoerIntegrator0.setOrderControl(4, 0.6, 4);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 4);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-174.10112706), (-174.10112706), (-174.10112706), (-174.10112706));
      graggBulirschStoerIntegrator0.setControlFactors((-1160), 100.1, (-1556.233), 566.0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-181.57486360087537), (-181.57486360087537), (-181.57486360087537), (-181.57486360087537));
      graggBulirschStoerIntegrator0.setControlFactors(1.0001, 1.0001, 1.0001, 1219.7079894199999);
      graggBulirschStoerIntegrator0.setOrderControl(4, 4, 2034.484054114);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-174.10112706), (-174.10112706), (-174.10112706), (-174.10112706));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      double[] doubleArray0 = new double[0];
      graggBulirschStoerIntegrator0.vecRelativeTolerance = doubleArray0;
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-693.40450824));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.4920966625213623, 0.4920966625213623, 0.4920966625213623, 0.4920966625213623);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, (-492));
      graggBulirschStoerIntegrator0.setInitialStepSize((-727.139));
      graggBulirschStoerIntegrator0.setControlFactors(0.4920966625213623, (-727.139), 0.4920966625213623, 1.7642714221524228E-7);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-174.10112706), (-174.10112706), (-174.10112706), (-174.10112706));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.getCompleteState();
      expandableStatefulODE0.setTime(3);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-2683.8903));
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-174.10112706));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(3);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 27553.976264919016, 3, 0.8);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 0.0);
      graggBulirschStoerIntegrator0.setOrderControl((-398), 0.8, 621.2937605958);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-174.10112706), (-174.10112706), (-174.10112706), (-174.10112706));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(18).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-174.10112706));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-414.0), (-414.0), (-414.0), (-414.0));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(52).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      double double0 = (-904.32328);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 24, 24, 24.5793647929641);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-904.32328));
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, double0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.4920966625213623, 0.4920966625213623, 0.4920966625213623, 0.4920966625213623);
      graggBulirschStoerIntegrator0.setStepSizeControl(0.4920966625213623, 0.4920966625213623, 0.4920966625213623, (-1772.88619831));
      graggBulirschStoerIntegrator0.setControlFactors(800.506, (-727.139), 0.4920966625213623, 1.7642714221524228E-7);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.6, 0.6, 0.6, 0.6);
      graggBulirschStoerIntegrator0.setControlFactors(4, 1.0E-4, 1015.43381693714, (-1.1345910784680524E163));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.9, 0.9);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 3, (-3478), 0.9);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 259.976873);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4.0, 4.0, 4.0, 4.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(27).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 27);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      graggBulirschStoerIntegrator0.getEventHandlers();
      SecantSolver secantSolver0 = new SecantSolver();
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 4.664436780622191E168, 4.664436780622191E168, 473, (UnivariateSolver) secantSolver0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 4.0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      double[] doubleArray0 = expandableStatefulODE0.getCompleteState();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations1 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(secondOrderDifferentialEquations1).getDimension();
      FirstOrderConverter firstOrderConverter1 = new FirstOrderConverter(secondOrderDifferentialEquations1);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations2 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations2).getDimension();
      FirstOrderConverter firstOrderConverter2 = new FirstOrderConverter(secondOrderDifferentialEquations2);
      ExpandableStatefulODE expandableStatefulODE2 = new ExpandableStatefulODE(firstOrderConverter1);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3, 3, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE1, (double) 3);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-174.10112706), (-174.10112706), 394.200443559091, 2010.70666359);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.getStepHandlers();
      expandableStatefulODE0.getCompleteState();
      expandableStatefulODE0.setTime(1.0001);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1417.86);
      graggBulirschStoerIntegrator0.getStepHandlers();
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 155, 155, 1.0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-381.022228476));
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 6);
      StepNormalizer stepNormalizer0 = new StepNormalizer(155, (FixedStepHandler) null);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(143.84, (-3111.4687), 1.0, 1.0E-4);
      graggBulirschStoerIntegrator1.addStepHandler(stepNormalizer0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations1 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations1).getDimension();
      FirstOrderConverter firstOrderConverter1 = new FirstOrderConverter(secondOrderDifferentialEquations1);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-174.10112706));
  }
}