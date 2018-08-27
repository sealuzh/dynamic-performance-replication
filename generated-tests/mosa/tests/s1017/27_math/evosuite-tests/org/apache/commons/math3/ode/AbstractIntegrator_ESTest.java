/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 08:30:54 GMT 2018
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math3.analysis.solvers.PegasusSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
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
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(4.94E-321);
      midpointIntegrator0.clearEventHandlers();
      midpointIntegrator0.addEventHandler((EventHandler) null, 4.94E-321, 0.0, 2256);
      midpointIntegrator0.clearEventHandlers();
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(1613.79326);
      int int0 = gillIntegrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
      
      double double0 = gillIntegrator0.getCurrentSignedStepsize();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-19.31483983632));
      midpointIntegrator0.getEvaluations();
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-37.005843270860126));
      midpointIntegrator0.clearStepHandlers();
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
      
      midpointIntegrator0.setMaxEvaluations(0);
      assertEquals(0, midpointIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(1613.79326);
      int int0 = gillIntegrator0.getMaxEvaluations();
      assertEquals(Integer.MAX_VALUE, int0);
      
      gillIntegrator0.clearStepHandlers();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(2.2737367544323206E-10);
      eulerIntegrator0.getStepHandlers();
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(1941.9);
      eulerIntegrator0.getName();
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2315).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      try { 
        midpointIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 4,630
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-605.6058754722807));
      double double0 = midpointIntegrator0.getCurrentStepStart();
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      midpointIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, (-1.6699188275658641E-62), 1363, (UnivariateSolver) pegasusSolver0);
      midpointIntegrator0.getEventHandlers();
      midpointIntegrator0.clearEventHandlers();
      Double double0 = new Double(0.0);
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      try { 
        midpointIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.3248254060745239);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      midpointIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.3248254060745239, doubleArray0, 0.0, doubleArray0);
      assertEquals(Integer.MAX_VALUE, midpointIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-1.8950538406321535E124));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      double double0 = new Double(1000.0);
      // Undeclared exception!
      midpointIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-1223.399), doubleArray0, (-411.344), doubleArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      firstOrderConverter0.computeDerivatives(817.674, doubleArray0, doubleArray0);
      MidpointIntegrator midpointIntegrator1 = new MidpointIntegrator(0.0);
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 4.94E-321;
      firstOrderConverter0.computeDerivatives(4.94E-321, doubleArray1, doubleArray1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations1 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations1).getDimension();
      FirstOrderConverter firstOrderConverter1 = new FirstOrderConverter(secondOrderDifferentialEquations1);
      try { 
        midpointIntegrator1.integrate((FirstOrderDifferentialEquations) firstOrderConverter1, 0.3248254060745239, doubleArray0, 0.0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-1.8950538406321535E124));
      midpointIntegrator0.clearEventHandlers();
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1.8950538406321535E124), 0.3248254060744684, 891);
      midpointIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 0.0, 1211, (UnivariateSolver) bracketingNthOrderBrentSolver0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      midpointIntegrator0.integrate(expandableStatefulODE0, (-1.8950538406321535E124));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.3248254060745239);
      midpointIntegrator0.clearEventHandlers();
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer(0.3248254060745239, fixedStepHandler0);
      midpointIntegrator0.addStepHandler(stepNormalizer0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      midpointIntegrator0.integrate(expandableStatefulODE0, 1.3095299991573769E-143);
  }
}