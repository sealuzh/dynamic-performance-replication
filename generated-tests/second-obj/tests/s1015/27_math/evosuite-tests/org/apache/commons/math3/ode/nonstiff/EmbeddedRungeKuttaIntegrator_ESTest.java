/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:12:05 GMT 2018
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
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-3502.564068270673);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-3502.564068270673), (-2431.1953), doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getMinReduction();
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.2184450328350067, 0.2184450328350067, 0.2184450328350067, 1627.771807745845);
      double double0 = dormandPrince853Integrator0.getSafety();
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, double0, 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.0, (-771.24), (-771.24), (-771.24));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, (-1018.371146));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-259.41608062069), 0.0, (-1700.07492), 0);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(3145.299744478728, 2.424783229827881, doubleArray0, doubleArray0);
      int int0 = Double.MIN_EXPONENT;
      highamHall54Integrator0.getEventHandlers();
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE1, (double) 0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = 1919.8160279476;
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1919.8160279476, 1919.8160279476, 1919.8160279476, 1919.8160279476);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(57).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      double double1 = (-1.0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-1.0));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-259.41608062069), 0.0, (-1700.07492), 0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-462.23), doubleArray0, 1.0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, (-76.3484413984743), (-76.3484413984743), (-76.3484413984743));
      dormandPrince54Integrator0.getMaxGrowth();
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1.4854841678687828E-8), 2957.9710696537377, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(356.3129864401093, 0.0, doubleArray0, doubleArray0);
      highamHall54Integrator0.getStepHandlers();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      double[][] doubleArray1 = new double[2][1];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      dormandPrince54Integrator0.estimateError(doubleArray1, doubleArray0, doubleArray0, (-863.1903565909464));
      DormandPrince853Integrator dormandPrince853Integrator1 = new DormandPrince853Integrator((-863.1903565909464), (-1036.3852757031739), (-1018.371146), 2957.9710696537377);
      dormandPrince853Integrator1.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (double) 0, doubleArray0, 796.38, doubleArray0);
      assertEquals(17, dormandPrince853Integrator1.getEvaluations());
      
      DormandPrince54Integrator dormandPrince54Integrator1 = new DormandPrince54Integrator(890.6752599186, (-179.1538967318), 890.6752599186, (-179.1538967318));
      dormandPrince54Integrator1.estimateError(doubleArray1, doubleArray0, doubleArray0, 0.0);
      highamHall54Integrator0.getOrder();
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, (-76.3484413984743), (-76.3484413984743), (-76.3484413984743));
      dormandPrince54Integrator0.getMaxGrowth();
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1.4854841678687828E-8), 2957.9710696537377, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1035.5), 2957.9710696537377, doubleArray0, doubleArray0);
      highamHall54Integrator0.getStepHandlers();
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 10.0, doubleArray0, (-76.3484413984743), doubleArray0);
      assertEquals(17, dormandPrince853Integrator0.getEvaluations());
  }
}