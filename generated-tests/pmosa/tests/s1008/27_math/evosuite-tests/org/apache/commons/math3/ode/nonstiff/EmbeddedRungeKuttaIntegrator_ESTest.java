/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 12:37:05 GMT 2018
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmbeddedRungeKuttaIntegrator_ESTest extends EmbeddedRungeKuttaIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 6.989914264479507E-28;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (-1.7658271111516935E-8);
      doubleArray0[3] = 6.989914264479507E-28;
      doubleArray0[4] = 6.989914264479507E-28;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 6.989914264479507E-28;
      doubleArray0[7] = 6.989914264479507E-28;
      doubleArray0[8] = 0.0;
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(6.989914264479507E-28, 0.0, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.getStepHandlers();
      dormandPrince853Integrator0.vecAbsoluteTolerance = doubleArray0;
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      eventFilter0.init(0.0, dormandPrince853Integrator0.vecAbsoluteTolerance, 50.0412314906);
      eventFilter0.init(50.0412314906, doubleArray0, 1139.25);
      dormandPrince853Integrator0.addEventHandler((EventHandler) eventFilter0, (-1.7658271111516935E-8), 3.6400093808551196E-229, (-365));
      dormandPrince853Integrator0.scalRelativeTolerance = 0.0;
      dormandPrince853Integrator0.getSafety();
      dormandPrince853Integrator0.getMinReduction();
      dormandPrince853Integrator0.getOrder();
      dormandPrince853Integrator0.setSafety((-741.43995423432));
      double double0 = dormandPrince853Integrator0.getMinReduction();
      assertEquals((-741.43995423432), dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(0.2, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1.0, 1.0, 1.0, 1.0);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1.0, 1.0, 1.0, 1.0);
      double[][] doubleArray0 = new double[0][2];
      double[] doubleArray1 = new double[9];
      dormandPrince54Integrator0.scalRelativeTolerance = 1.0;
      doubleArray1[0] = 1.0;
      doubleArray1[1] = 1.0;
      doubleArray1[2] = 1.0;
      doubleArray1[3] = 1.0;
      doubleArray1[4] = 1.0;
      doubleArray1[5] = 1.0;
      doubleArray1[6] = 1.0;
      doubleArray1[7] = 1.0;
      doubleArray1[8] = 1.0;
      dormandPrince54Integrator0.estimateError(doubleArray0, doubleArray1, doubleArray1, 1.0);
      highamHall54Integrator0.getMaxGrowth();
      highamHall54Integrator0.scalRelativeTolerance = 1.0;
      highamHall54Integrator0.getMinReduction();
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      
      highamHall54Integrator0.setMinReduction(1.0);
      dormandPrince54Integrator0.setMaxGrowth(1.0);
      dormandPrince54Integrator0.getMinReduction();
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 10.0, 1.0, 0.2);
      double[] doubleArray2 = new double[5];
      doubleArray2[0] = 1.0;
      doubleArray2[1] = 0.0;
      doubleArray2[2] = Double.NaN;
      doubleArray2[3] = 0.2;
      doubleArray2[4] = 1.0;
      dormandPrince853Integrator0.estimateError(doubleArray0, (double[]) null, doubleArray2, (-1586.184860219032));
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(105.8237945409633, 105.8237945409633, 105.8237945409633, 105.8237945409633);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(120).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 105.8237945409633);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = 105.8237945409633;
      double double1 = 0.0;
      double double2 = 5.56023190218245E110;
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(105.8237945409633, 105.8237945409633, 0.0, 5.56023190218245E110);
      double double3 = 0.0;
      dormandPrince54Integrator0.setMaxGrowth(0.0);
      double[][] doubleArray0 = new double[11][1];
      double[] doubleArray1 = new double[11];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 5.56023190218245E110;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 105.8237945409633);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = (-7.667998948729528E-9);
      double double1 = 0.0;
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 0.0;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      double[] doubleArray1 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1.0, 0.0, doubleArray1, doubleArray1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations1 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations1).getDimension();
      FirstOrderConverter firstOrderConverter1 = new FirstOrderConverter(secondOrderDifferentialEquations1);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter1);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE1, (-3769.5360417674806));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(105.8237945409633, 105.8237945409633, 105.8237945409633, 105.8237945409633);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-2844.20512));
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 105.8237945409633);
      assertEquals(105.8237945409633, expandableStatefulODE0.getTime(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double double0 = 3311.6;
      double double1 = 1.0;
      double double2 = 4715.4;
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(3311.6, 1.0, 3311.6, 4715.4);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      double double3 = 1044.0;
      expandableStatefulODE0.setTime(1044.0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 4715.4);
  }
}