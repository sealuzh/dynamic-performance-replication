/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 02:15:52 GMT 2018
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver;
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
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.LutherIntegrator;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
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
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(3119.2275922502);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1000.0;
      doubleArray0[1] = 3119.2275922502;
      try { 
        classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1000.0, doubleArray0, (-1.0), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 0.0;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.getEventHandlers();
      graggBulirschStoerIntegrator0.setInitialStepSize((-547.60325665));
      graggBulirschStoerIntegrator0.getEventHandlers();
      graggBulirschStoerIntegrator0.getStepHandlers();
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 35, 5, 5);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(3587.3, 0.0, 0.0, 3587.3);
      highamHall54Integrator0.getOrder();
      highamHall54Integrator0.getEventHandlers();
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(Double.NaN);
      lutherIntegrator0.setMaxEvaluations(689);
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = null;
      try {
        dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, doubleArray0, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 17.08255226308082;
      doubleArray0[1] = 17.08255226308082;
      doubleArray0[2] = 17.08255226308082;
      doubleArray0[3] = 17.08255226308082;
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(17.08255226308082, 17.08255226308082, doubleArray0, doubleArray0);
      highamHall54Integrator0.getName();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      firstOrderConverter0.computeDerivatives(17.08255226308082, doubleArray0, doubleArray0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        highamHall54Integrator0.integrate(expandableStatefulODE0, 2109.335430591992);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 4
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator((-1545.5226467349078));
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer((-1545.5226467349078), fixedStepHandler0);
      gillIntegrator0.addStepHandler(stepNormalizer0);
      double double0 = gillIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-2948.032607816133), (-2948.032607816133), 1392.5288526094);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 185);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 2759.5788309;
      doubleArray0[1] = 2759.5788309;
      doubleArray0[2] = 2759.5788309;
      doubleArray0[3] = 0.0;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 2759.5788309, doubleArray0, doubleArray0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 2759.5788309, (-544.81051252), (-1));
      graggBulirschStoerIntegrator0.getStepHandlers();
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 0);
      FirstOrderConverter firstOrderConverter0 = null;
      try {
        firstOrderConverter0 = new FirstOrderConverter((SecondOrderDifferentialEquations) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.FirstOrderConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(3587.3, 3587.3, 2957.005, 3587.3);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 4559.94140400757;
      firstOrderConverter0.computeDerivatives(3420.4828634, doubleArray0, doubleArray0);
      firstOrderConverter0.computeDerivatives(2957.005, doubleArray0, doubleArray0);
      firstOrderConverter0.computeDerivatives(0.0, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.setSafety((-2909.6802));
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 3587.3;
      doubleArray1[1] = 3587.3;
      doubleArray1[2] = (-6154.624435258426);
      doubleArray1[3] = 1606.713397333177;
      doubleArray1[4] = 0.0;
      doubleArray1[5] = (-6154.624435258426);
      double double0 = new Double((-6154.624435258426));
      dormandPrince853Integrator0.getOrder();
      dormandPrince853Integrator0.getOrder();
      int int0 = dormandPrince853Integrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
      
      dormandPrince853Integrator0.getStepHandlers();
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(3587.3, 8, 4559.94140400757, 1606.713397333177);
      DormandPrince54Integrator dormandPrince54Integrator1 = new DormandPrince54Integrator((-451.5757477626), 3420.4828634, doubleArray1, doubleArray0);
      dormandPrince54Integrator1.getOrder();
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator1.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-3446.7465923761033));
      int int0 = 0;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      double double0 = 0.0;
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 2027.6449830621764;
      doubleArray1[2] = 0.0;
      try { 
        eulerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-3446.7465923761033), doubleArray0, 2027.6449830621764, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-3446.7465923761033));
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      eulerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-2109.335430591992), doubleArray0, 0.0, doubleArray0);
      eulerIntegrator0.computeDerivatives(968.6678, doubleArray0, doubleArray0);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(9.636666808527841E52);
      double double0 = lutherIntegrator0.getCurrentSignedStepsize();
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2639.6149;
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = 2639.6149;
      doubleArray0[3] = 2639.6149;
      doubleArray0[5] = (-1.0);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1.0), 2639.6149, doubleArray0, doubleArray0);
      highamHall54Integrator0.getStepHandlers();
      highamHall54Integrator0.clearStepHandlers();
      highamHall54Integrator0.clearEventHandlers();
      highamHall54Integrator0.getOrder();
      highamHall54Integrator0.clearEventHandlers();
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      highamHall54Integrator0.addStepHandler(dummyStepHandler0);
      highamHall54Integrator0.getCurrentStepStart();
      highamHall54Integrator0.getEvaluations();
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(5, 0.0, 2639.6149, 5065.2095, (-1.0));
      // Undeclared exception!
      adamsBashforthIntegrator0.integrate(expandableStatefulODE0, (double) 0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2639.6149;
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = 2639.6149;
      doubleArray0[3] = 2639.6149;
      doubleArray0[5] = (-1.0);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1.0), 2639.6149, doubleArray0, doubleArray0);
      highamHall54Integrator0.getStepHandlers();
      highamHall54Integrator0.clearStepHandlers();
      highamHall54Integrator0.clearEventHandlers();
      highamHall54Integrator0.getOrder();
      highamHall54Integrator0.clearEventHandlers();
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      highamHall54Integrator0.addStepHandler(dummyStepHandler0);
      highamHall54Integrator0.getCurrentStepStart();
      highamHall54Integrator0.getEvaluations();
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(465.29946, 2639.6149, 5);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 727.0, (-60.15768007), 0, (UnivariateSolver) bracketingNthOrderBrentSolver0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-1.0));
  }
}
