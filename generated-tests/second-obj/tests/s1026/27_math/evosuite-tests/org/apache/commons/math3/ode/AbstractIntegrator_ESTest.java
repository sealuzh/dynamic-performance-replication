/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 12:06:25 GMT 2018
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.LutherIntegrator;
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
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.0578181174343009, Double.NaN, 1.0578181174343009, 1.0578181174343009);
      dormandPrince853Integrator0.clearStepHandlers();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1.0578181174343009;
      // Undeclared exception!
      try { 
        dormandPrince853Integrator0.computeDerivatives(1.0578181174343009, doubleArray0, doubleArray0);
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
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(2932.0239423864);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 556.0691938226196;
      doubleArray0[1] = 556.0691938226196;
      try { 
        lutherIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 556.0691938226196, doubleArray0, 556.0691938226196, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(4.547473508864641E-10, 1240.113534635, 4.547473508864641E-10, 4.547473508864641E-10);
      highamHall54Integrator0.getEvaluations();
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(3796.0);
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter((EventHandler) null, filterType0);
      lutherIntegrator0.addEventHandler((EventHandler) eventFilter0, 242.96, 211.02368861, 2147019596);
      lutherIntegrator0.clearStepHandlers();
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(5.206150291559893E-8);
      eulerIntegrator0.clearEventHandlers();
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(1.0000000184578217);
      lutherIntegrator0.getMaxEvaluations();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations1 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations1).getDimension();
      FirstOrderConverter firstOrderConverter1 = new FirstOrderConverter(secondOrderDifferentialEquations1);
      lutherIntegrator0.addStepHandler((StepHandler) null);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations2 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations2).getDimension();
      FirstOrderConverter firstOrderConverter2 = new FirstOrderConverter(secondOrderDifferentialEquations2);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter1);
      // Undeclared exception!
      try { 
        lutherIntegrator0.integrate(expandableStatefulODE1, 1008.2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-2995.0));
      classicalRungeKuttaIntegrator0.getName();
      classicalRungeKuttaIntegrator0.getStepHandlers();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 349.528253841361;
      doubleArray0[1] = 349.528253841361;
      double[] doubleArray1 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(349.528253841361, 349.528253841361, doubleArray0, doubleArray1);
      double double0 = dormandPrince853Integrator0.getCurrentSignedStepsize();
      assertEquals(349.528253841361, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 2813.405613333062, doubleArray0, doubleArray0);
      dormandPrince54Integrator0.getOrder();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      firstOrderConverter0.computeDerivatives(2813.405613333062, doubleArray0, doubleArray0);
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(6286.7951537564);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
      
      lutherIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 2813.405613333062, doubleArray0, (double) 5, doubleArray0);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double double0 = 0.0;
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 2813.405613333062, doubleArray0, doubleArray0);
      dormandPrince54Integrator0.getOrder();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double double1 = (-495.61929);
      double double2 = 19.4;
      firstOrderConverter0.computeDerivatives(19.4, doubleArray0, doubleArray0);
      double double3 = (-1008.15528);
      try { 
        dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 0.0, doubleArray0);
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
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(1.0000000184578217);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 4;
      doubleArray0[1] = 1.0000000184578217;
      doubleArray0[3] = 1.0000000184578217;
      doubleArray0[4] = (double) 4;
      doubleArray0[5] = (double) 4;
      doubleArray0[6] = (double) 4;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0000000184578217, 4.0, doubleArray0, doubleArray0);
      LutherIntegrator lutherIntegrator1 = new LutherIntegrator(1398.903072297351);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations1 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations1).getDimension();
      FirstOrderConverter firstOrderConverter1 = new FirstOrderConverter(secondOrderDifferentialEquations1);
      lutherIntegrator1.getEventHandlers();
      firstOrderConverter1.computeDerivatives(4, doubleArray0, doubleArray0);
      double double0 = lutherIntegrator1.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 1398.903072297351, doubleArray0);
      assertArrayEquals(new double[] {4.0, 4.0, 4.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1398.903072297351, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator((-2588.9));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      gillIntegrator0.getName();
      gillIntegrator0.addEventHandler((EventHandler) eventFilter0, 736.5196743182, 278.0, Integer.MAX_VALUE, (UnivariateSolver) pegasusSolver0);
      gillIntegrator0.setMaxEvaluations(474);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(474).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      gillIntegrator0.integrate(expandableStatefulODE0, 2.220446049250313E-13);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      SecondOrderDifferentialEquations secondOrderDifferentialEquations1 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations1).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations1);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.getSecondaryMappers();
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(98445.799372262);
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter((EventHandler) null, filterType0);
      EventFilter eventFilter1 = new EventFilter(eventFilter0, filterType0);
      lutherIntegrator0.addEventHandler((EventHandler) null, 0.0, (double) 4, 4);
      lutherIntegrator0.addEventHandler((EventHandler) eventFilter0, 8.881784197001252E-13, 83.925, 4);
      // Undeclared exception!
      try { 
        lutherIntegrator0.integrate(expandableStatefulODE0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(2783.9597061961003, (-2317.5871274050323), 0.0, 0.0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter0, 0.0, (-2317.5871274050323), 2748, (UnivariateSolver) pegasusSolver0);
      highamHall54Integrator0.getEventHandlers();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn((-2054)).when(secondOrderDifferentialEquations0).getDimension();
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
  public void test14()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator((-2588.9));
      gillIntegrator0.setMaxEvaluations(483);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(483).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.INCREMENT;
      StepNormalizer stepNormalizer0 = new StepNormalizer(483, fixedStepHandler0, stepNormalizerMode0);
      gillIntegrator0.addStepHandler(stepNormalizer0);
      // Undeclared exception!
      gillIntegrator0.integrate(expandableStatefulODE0, 15.819189386928043);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = 4;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double double0 = 1.0000000184578217;
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(1.0000000184578217);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 4;
      doubleArray0[1] = 1.0000000184578217;
      doubleArray0[1] = 1.0000000184578217;
      doubleArray0[4] = (double) 4;
      lutherIntegrator0.getMaxEvaluations();
      double[] doubleArray1 = new double[0];
      try { 
        lutherIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (double) Integer.MAX_VALUE, doubleArray0, (double) Integer.MAX_VALUE, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 8
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(2.1452318648984935E9);
      double double0 = gillIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, double0, 0.01);
      
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      gillIntegrator0.addEventHandler((EventHandler) eventFilter0, 66.49818647178896, (-1350.1708), 9, (UnivariateSolver) null);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
  }
}