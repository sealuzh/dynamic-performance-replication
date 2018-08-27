/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 07:51:39 GMT 2018
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
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(10.0, 10.0, 10.0, 1627.771807745845);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 10.0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 560.320526709168;
      doubleArray0[3] = 560.320526709168;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 560.320526709168;
      doubleArray0[7] = 0.0;
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 560.320526709168, doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getSafety();
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = (-885.49);
      double[] doubleArray0 = null;
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(187.67335, (-885.49), 187.67335, 187.67335);
      dormandPrince853Integrator0.getOrder();
      dormandPrince853Integrator0.getMaxGrowth();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.getTotalDimension();
      double double1 = (-3682.405137477519);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, (-3682.405137477519));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(907.1444999, 0.0, 0.0, 0.0);
      dormandPrince54Integrator0.getMinReduction();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 907.1444999;
      doubleArray0[1] = 0.2;
      doubleArray0[2] = 907.1444999;
      doubleArray0[3] = 0.42353010177612305;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 0.0;
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(907.1444999, 0.0, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.getOrder();
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, (-130.3721), doubleArray0, doubleArray0);
      double[][] doubleArray1 = new double[3][0];
      doubleArray1[0] = doubleArray0;
      double[] doubleArray2 = new double[0];
      doubleArray1[1] = doubleArray2;
      highamHall54Integrator0.setMaxGrowth(2632.7772995);
      doubleArray1[2] = doubleArray0;
      highamHall54Integrator0.estimateError(doubleArray1, doubleArray0, doubleArray2, 907.1444999);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setPrimaryState(doubleArray0);
      double double0 = 0.0;
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 0.2);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-96.2609846), 4898.546, 4898.546, 4898.546);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(54).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, (-694.1655194459861));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = 4898.546;
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.2184450328350067, 4898.546, 4898.546, 1627.771807745845);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-694.1655194459861));
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 10.0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.2184450328350067, 4898.546, 4898.546, 1627.771807745845);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      dormandPrince853Integrator0.setStepSizeControl(0.2184450328350067, 0.632247805595398, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.resetInternalState();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 0.2184450328350067);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(3.4405490416979487E257, (-694.1655194459861), doubleArray0, doubleArray0);
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 1734.085);
  }
}