/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 15:13:34 GMT 2019
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.MullerSolver2;
import org.apache.commons.math3.analysis.solvers.SecantSolver;
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
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(1000.0);
      gillIntegrator0.clearStepHandlers();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(3015.627576, 3015.627576, doubleArray0, doubleArray0);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      highamHall54Integrator0.addStepHandler(dummyStepHandler0);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-2872.82536362), 287.7933568026873, doubleArray0, doubleArray0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(156.003, (-3.6870882345139385E-8));
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter0, (-2872.82536362), 2.220446049250313E-13, 1, (UnivariateSolver) mullerSolver2_0);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(3015.627576, 3015.627576, doubleArray0, doubleArray0);
      highamHall54Integrator0.addEventHandler((EventHandler) null, 3015.627576, (-3541.3007095069624), Integer.MAX_VALUE, (UnivariateSolver) null);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(729.1597063603442);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      try { 
        threeEighthesIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 729.1597063603442, doubleArray0, 729.1597063603442, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(524.73233, 524.73233, 524.73233, 524.73233);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 872.1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator((-274.0582));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      double double0 = gillIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-274.0582), doubleArray0, 2479.0, doubleArray0);
      assertEquals(44, gillIntegrator0.getEvaluations());
      assertEquals(2479.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(287.7933568026873, (-1744.8998), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[5];
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1.757388200993436E162, doubleArray0, 1.757388200993436E162, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator((-274.0582));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[1];
      try { 
        gillIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, (-2416.8652), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(1818.4010168);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      SecantSolver secantSolver0 = new SecantSolver(3432, 1.2288203239440918);
      threeEighthesIntegrator0.addEventHandler((EventHandler) eventFilter0, 895.685, 895.685, 3432, (UnivariateSolver) secantSolver0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      threeEighthesIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, Double.NaN, doubleArray0, Double.NaN, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1873.19519), 1.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setMaxEvaluations(2054);
      assertEquals(2054, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1873.19519), 1.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) null, 4.547473508864641E-10, 4.547473508864641E-10, 2054);
      graggBulirschStoerIntegrator0.getEventHandlers();
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(287.7933568026873);
      eulerIntegrator0.getName();
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(3015.627576, 3015.627576, doubleArray0, doubleArray0);
      highamHall54Integrator0.getStepHandlers();
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(3015.627576, 3015.627576, doubleArray0, doubleArray0);
      highamHall54Integrator0.addEventHandler((EventHandler) null, (double) Integer.MAX_VALUE, 0.0, Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(1818.4010168);
      double double0 = threeEighthesIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, threeEighthesIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, threeEighthesIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(3015.627576, 3015.627576, doubleArray0, doubleArray0);
      int int0 = highamHall54Integrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, 0.0, 0.0);
      double double0 = dormandPrince54Integrator0.getCurrentSignedStepsize();
      assertEquals(0.0, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(9, 2920.799849492688, 1.206860599814453E82, 0.0, 1000.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      adamsBashforthIntegrator0.integrate(expandableStatefulODE0, 0.5796010099264536);
  }
}
