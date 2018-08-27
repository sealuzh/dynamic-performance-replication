/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 13:56:01 GMT 2018
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondaryEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
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
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(0.0);
      lutherIntegrator0.getEventHandlers();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      try { 
        lutherIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 4 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2238.9884089832), (-213.056507082186), (-2238.9884089832), (-213.056507082186));
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      dormandPrince54Integrator0.clearEventHandlers();
      dormandPrince54Integrator0.addStepHandler(dummyStepHandler0);
      dormandPrince54Integrator0.clearStepHandlers();
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2238.9884089832), (-216.47677456354901), (-2238.9884089832), (-216.47677456354901));
      double double0 = dormandPrince54Integrator0.getCurrentSignedStepsize();
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(696.1960852100904, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(4.94E-321, 4.94E-321, (-213.056507082186), (-213.056507082186));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1086).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      dormandPrince54Integrator0.getName();
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, (-78.942004));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1740.90501, 1740.90501, 1740.90501, 1740.90501);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-862.088567), doubleArray0, doubleArray0);
      dormandPrince54Integrator0.clearEventHandlers();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
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
  public void test05()  throws Throwable  {
      double double0 = 1740.90501;
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1740.90501, 1740.90501, 1740.90501, 1740.90501);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 1740.90501;
      try { 
        dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 0.0, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2238.9884089832), (-213.056507082186), (-2238.9884089832), (-213.056507082186));
      dormandPrince54Integrator0.setMaxEvaluations(936);
      assertEquals(936, dormandPrince54Integrator0.getMaxEvaluations());
      
      dormandPrince54Integrator0.setMaxEvaluations((-1));
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2238.9884089832), (-213.056507082186), (-2238.9884089832), (-213.056507082186));
      dormandPrince54Integrator0.getStepHandlers();
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2238.9884089832), (-213.056507082186), (-2238.9884089832), (-213.056507082186));
      dormandPrince54Integrator0.getEvaluations();
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(130.2907, 130.2907, 130.2907, 130.2907);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[7];
      graggBulirschStoerIntegrator0.setInterpolationControl(true, (-2811));
      doubleArray0[0] = 130.2907;
      doubleArray0[1] = 130.2907;
      graggBulirschStoerIntegrator0.setInitialStepSize((-95.6748650335126));
      doubleArray0[2] = 130.2907;
      doubleArray0[3] = (-1454.386154);
      doubleArray0[4] = 130.2907;
      doubleArray0[5] = (-1454.386154);
      doubleArray0[6] = 130.2907;
      firstOrderConverter0.computeDerivatives((-1454.386154), doubleArray0, doubleArray0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      firstOrderConverter0.computeDerivatives(1287.507562, doubleArray0, doubleArray0);
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 130.2907);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-213.056507082186), (-213.056507082186), (-213.056507082186), (-213.056507082186));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      EventFilter eventFilter1 = new EventFilter(eventFilter0, filterType0);
      dormandPrince54Integrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 4.94E-321, 2120620628);
      dormandPrince54Integrator0.getMaxEvaluations();
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, (-213.056507082186));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1.0), 2468.490206136, (-1628.0), 2545.695758548);
      graggBulirschStoerIntegrator0.getEventHandlers();
      graggBulirschStoerIntegrator0.setControlFactors(2468.490206136, 4.94E-321, (-2077.974209537581), (-1628.0));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) eventFilter0, 4.94E-321, 4.94E-321, 1108);
      graggBulirschStoerIntegrator0.getEventHandlers();
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(1.0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0, 0.0, 0.0, 0.0);
      graggBulirschStoerIntegrator0.getEventHandlers();
      graggBulirschStoerIntegrator0.setControlFactors(1730.529, 1730.529, 1.0, (-2572.3657774801));
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 784.6264004198442;
      doubleArray0[2] = 1.0;
      doubleArray0[3] = (-5.350322253112414E-8);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(784.6264004198442, (-5.350322253112414E-8), doubleArray0, doubleArray0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      double double0 = classicalRungeKuttaIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(4.94E-321, 4.94E-321, (-213.056507082186), (-213.056507082186));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer(521.6259307, fixedStepHandler0);
      dormandPrince54Integrator0.addStepHandler(stepNormalizer0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 4.94E-321);
  }
}