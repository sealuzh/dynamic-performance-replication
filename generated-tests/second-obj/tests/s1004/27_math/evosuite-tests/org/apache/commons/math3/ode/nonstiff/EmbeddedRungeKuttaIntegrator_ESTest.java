/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 18:47:06 GMT 2018
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventHandler;
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
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1509.96368, 1509.96368, 1509.96368, 0.2);
      double double0 = dormandPrince54Integrator0.getMinReduction();
      assertEquals(0.2, double0, 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 0.2;
      doubleArray0[1] = 0.2;
      doubleArray0[2] = 0.2;
      doubleArray0[3] = 0.2;
      doubleArray0[4] = 0.9;
      doubleArray0[5] = 0.2;
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.2, 0.2, doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getSafety();
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, double0, 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(1480.30590986);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0, 1480.30590986, doubleArray0, doubleArray0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE1, 1782.373);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1878.002552);
      doubleArray0[1] = (-1878.002552);
      doubleArray0[2] = (-1878.002552);
      doubleArray0[3] = (-1878.002552);
      doubleArray0[4] = (-1878.002552);
      doubleArray0[5] = 770.12297382;
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1878.002552), (-1878.002552), doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMaxGrowth();
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(10.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1509.96368, 1509.96368, (-7.253671992213344E-296), 0.2);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1.0, doubleArray0, 0.2, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-963.871713));
      double double0 = 177.42380125521;
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-963.871713), 177.42380125521, doubleArray0, doubleArray0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 355.3156);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double double0 = 0.0;
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.2, 0.0, 0.0, 1504.5359399928486);
      int int0 = 9;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(9).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 1504.5359399928486);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations1 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations1).getDimension();
      FirstOrderConverter firstOrderConverter1 = new FirstOrderConverter(secondOrderDifferentialEquations1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations2 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations2).getDimension();
      FirstOrderConverter firstOrderConverter2 = new FirstOrderConverter(secondOrderDifferentialEquations2);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter2);
      expandableStatefulODE0.setTime((-963.871713));
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(6.516115189736396E126, 106.66666666666667, doubleArray0, doubleArray0);
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-962.971713));
      double[][] doubleArray1 = new double[2][7];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      highamHall54Integrator0.estimateError(doubleArray1, doubleArray0, doubleArray0, 1.733140900346534E-58);
  }
}