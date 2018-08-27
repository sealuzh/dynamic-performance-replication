/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 18:58:12 GMT 2018
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectStreamConstants;
import org.apache.commons.math3.analysis.solvers.MullerSolver2;
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
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.LutherIntegrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.apache.commons.math3.ode.sampling.StepNormalizerBounds;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(380.694127988, 380.694127988, 0.0, 1.0);
      graggBulirschStoerIntegrator0.setOrderControl(636, 636, 0.0);
      graggBulirschStoerIntegrator0.getName();
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(2310.0, 2310.0, 2310.0, (-1391.67616977));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 2310.0;
      doubleArray0[1] = (-1391.67616977);
      doubleArray0[2] = (-1649.58);
      doubleArray0[3] = (-1649.58);
      try { 
        dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-1649.58), doubleArray0, (-1649.58), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(3.059023470086686E-7);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      MullerSolver2 mullerSolver2_0 = new MullerSolver2((-3367.07399407), (-3367.07399407));
      lutherIntegrator0.addEventHandler((EventHandler) eventFilter0, 3.059023470086686E-7, 3.059023470086686E-7, 1, (UnivariateSolver) mullerSolver2_0);
      lutherIntegrator0.getEventHandlers();
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1230.059), (-1230.059), (-1230.059), (-1230.059));
      highamHall54Integrator0.setMaxEvaluations(1225);
      highamHall54Integrator0.clearEventHandlers();
      assertEquals(1225, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(380.694127988, 380.694127988, 0.0, 0.0);
      DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.setOrderControl(636, 636, 0.0);
      double double0 = graggBulirschStoerIntegrator0.getCurrentSignedStepsize();
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
      assertEquals(380.694127988, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(1304.545678948);
      gillIntegrator0.setMaxEvaluations(362);
      int int0 = gillIntegrator0.getMaxEvaluations();
      assertEquals(362, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-7.330635250808021E64), (-1023.6665255131), 1000.0, 5.169878828456423E-23);
      highamHall54Integrator0.getEvaluations();
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0, 0.0, 0, Double.NaN);
      highamHall54Integrator0.setMaxEvaluations(0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      highamHall54Integrator0.getStepHandlers();
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 0.0, 1164);
      try { 
        highamHall54Integrator0.integrate(expandableStatefulODE0, 2483.559258233);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (0) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.BOTH;
      StepNormalizer stepNormalizer0 = new StepNormalizer(4.547473508864641E-10, fixedStepHandler0, stepNormalizerBounds0);
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(4.547473508864641E-10);
      classicalRungeKuttaIntegrator0.getCurrentStepStart();
      double double0 = 766.34429902331;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 4.547473508864641E-10;
      doubleArray0[1] = Double.NaN;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(766.34429902331, 4.547473508864641E-10, doubleArray0, doubleArray0);
      boolean boolean0 = true;
      graggBulirschStoerIntegrator0.getStepHandlers();
      int int0 = 406;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(406).when(secondOrderDifferentialEquations0).getDimension();
      graggBulirschStoerIntegrator0.getEventHandlers();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      classicalRungeKuttaIntegrator0.integrate(expandableStatefulODE0, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 3712.34;
      double[] doubleArray1 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3712.34, 3712.34, doubleArray1, doubleArray1);
      graggBulirschStoerIntegrator0.setOrderControl(0, 3712.34, 3712.34);
      graggBulirschStoerIntegrator0.clearEventHandlers();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      firstOrderConverter0.computeDerivatives(3712.34, doubleArray0, doubleArray0);
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 3712.34, doubleArray1, 6.595969532334058, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3712.34, 0.0, doubleArray1, doubleArray1);
      graggBulirschStoerIntegrator0.setOrderControl(0, 0.0, 17.01339364754373);
      graggBulirschStoerIntegrator0.clearEventHandlers();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      firstOrderConverter0.computeDerivatives(0, doubleArray1, doubleArray1);
      double double0 = (-597.5);
      double double1 = 2483.559258233;
      firstOrderConverter0.computeDerivatives(2483.559258233, doubleArray0, doubleArray0);
      double double2 = 7.515818610295186;
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 7.515818610295186, doubleArray1, 3712.34, doubleArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(0.0);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0, 0.0, 0, Double.NaN);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      expandableStatefulODE0.getCompleteState();
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      FilterType filterType1 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter1 = new EventFilter(eventFilter0, filterType1);
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter1, 1.1857289715706991E-298, (-1116.981), 1);
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter1, (double) 0, 1.0, 1960);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (double) 1960);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(0);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1.0), 0, 0.0, Double.NaN);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType1 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType1);
      EventFilter eventFilter1 = new EventFilter(eventFilter0, filterType0);
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter1, (double) 0, 0.0, 0);
      try { 
        highamHall54Integrator0.integrate(expandableStatefulODE0, (double) 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      expandableStatefulODE0.setTime(4.547473508864641E-10);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(2421.9187, 490.5081781598871, 2.4585794728405612E-8, (-2114.23425815591));
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      highamHall54Integrator0.getStepHandlers();
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      FilterType filterType1 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter1 = new EventFilter(eventFilter0, filterType1);
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter0, 1960.0, 6.883577595238845E230, 2145549252);
      highamHall54Integrator0.integrate(expandableStatefulODE0, 490.5081781598871);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = (-1116.981);
      int int0 = 0;
      double double1 = 0.0;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      double double2 = 0.0;
      expandableStatefulODE0.setTime(4.547473508864641E-10);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0, 0.0, 0, Double.NaN);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      SecondaryEquations secondaryEquations1 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      int int1 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      double double3 = 6.883577595238845E230;
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(6.883577595238845E230, (-1939.9), Double.NaN, (double)1, 1.1857289715706991E-298).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 0.0, 1164);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-1116.981));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(1527.9981234187005);
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(5, (-834.93038), (-613.0), 2659.1656164, 5);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      try { 
        adamsBashforthIntegrator0.integrate(expandableStatefulODE0, (-834.93038));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one column
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }
}