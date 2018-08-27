/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 09:16:58 GMT 2018
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
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-9.603691279888153), (-9.603691279888153), (-9.603691279888153), (-1208.71912556424));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-1208.71912556424));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(3601.3, 10.0, doubleArray0, doubleArray0);
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(10.0, 3601.3, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, (-2100.2622));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-25.585797864578925), (-25.585797864578925), (-25.585797864578925), 1.244950238958056E-7);
      highamHall54Integrator0.getMaxGrowth();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1523.57, 3332.7956, 3332.7956, 3332.7956);
      highamHall54Integrator0.getMinReduction();
      highamHall54Integrator0.getSafety();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-3450.021764), (-3450.021764), (-3450.021764), (-3450.021764));
      dormandPrince853Integrator0.resetInternalState();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(62).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 1.132042407989502);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-2301.9), 2011.053489, (-2301.9), 0.0);
      dormandPrince853Integrator0.resetInternalState();
      dormandPrince853Integrator0.getMinReduction();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE1.setTime(0.1666666505023083);
      dormandPrince853Integrator0.integrate(expandableStatefulODE1, 1.0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(3601.3, 10.0, doubleArray0, doubleArray0);
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(10.0, (-585.0), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(0.3963087201118469);
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, (-1.0));
      dormandPrince853Integrator0.getOrder();
      dormandPrince853Integrator0.setMaxGrowth(821.283133692665);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(10.0, (-585.0), doubleArray0, doubleArray0);
      dormandPrince853Integrator0.resetInternalState();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-1.0));
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 1917.0);
  }
}