/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 21:31:28 GMT 2019
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.ODEIntegrator;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondaryEquations;
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultistepIntegrator_ESTest extends MultistepIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 108.0, 2, 0.0, 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      try { 
        adamsBashforthIntegrator0.integrate(expandableStatefulODE0, (double) 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one column
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(7, 7, 7, 7, 7);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(7).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-1.0));
      // Undeclared exception!
      try { 
        adamsBashforthIntegrator0.integrate(expandableStatefulODE0, (double) 7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 0.0, 1924.0, doubleArray0, doubleArray0);
      DormandPrince853Integrator dormandPrince853Integrator0 = (DormandPrince853Integrator)adamsBashforthIntegrator0.getStarterIntegrator();
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(1924.0, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, 0.2, 0.0, doubleArray0, doubleArray0);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      
      adamsBashforthIntegrator0.setSafety(0.0);
      double double0 = adamsBashforthIntegrator0.getSafety();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, 2, 2);
      adamsBashforthIntegrator0.setStarterIntegrator((FirstOrderIntegrator) null);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(5, 108.0, 5, 0.0, 0.0);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(3001.065, 0.0, 0.0, 0.0);
      adamsBashforthIntegrator0.setStarterIntegrator(dormandPrince54Integrator0);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(1.148698354997035, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(1, 1, 1825.0, doubleArray0, doubleArray0);
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
      
      adamsMoultonIntegrator0.setSafety(1);
      assertEquals(1.4142135623730951, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(1, 1, 1825.0, doubleArray0, doubleArray0);
      adamsMoultonIntegrator0.setMinReduction(1825.0);
      assertEquals(1825.0, adamsMoultonIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, 2, 2);
      adamsBashforthIntegrator0.setMinReduction((-1663.620015626));
      double double0 = adamsBashforthIntegrator0.getMinReduction();
      assertEquals((-1663.620015626), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, 2, doubleArray0, doubleArray0);
      assertEquals(1.2599210498948732, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
      
      adamsMoultonIntegrator0.setMaxGrowth(0.0);
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(1, 1, 1825.0, doubleArray0, doubleArray0);
      adamsMoultonIntegrator0.setMaxGrowth(1825.0);
      assertEquals(1825.0, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, (-0.05363177735880214), (-0.05363177735880214));
      adamsBashforthIntegrator0.setSafety((-0.05363177735880214));
      double double0 = adamsBashforthIntegrator0.getSafety();
      assertEquals((-0.05363177735880214), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, 0.0, 0.0);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      
      adamsBashforthIntegrator0.setMinReduction(0.0);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, 343.85264983, 0.0, doubleArray0, doubleArray0);
      adamsBashforthIntegrator0.setMaxGrowth((-4159.57433698));
      double double0 = adamsBashforthIntegrator0.getMaxGrowth();
      assertEquals((-4159.57433698), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, 2, 2);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      adamsBashforthIntegrator0.integrate(expandableStatefulODE0, (double) 2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = null;
      try {
        adamsBashforthIntegrator0 = new AdamsBashforthIntegrator((-5), (-5), (-5), (-5), (-5));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // multistep method needs at least -5 previous steps, got 2
         //
         verifyException("org.apache.commons.math3.ode.MultistepIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, 2, 2);
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(2);
      adamsBashforthIntegrator0.setStarterIntegrator(eulerIntegrator0);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, 2, 2);
      double double0 = adamsBashforthIntegrator0.getSafety();
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, double0, 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, 2, 2);
      double double0 = adamsBashforthIntegrator0.getMinReduction();
      assertEquals(0.2, double0, 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, 2, 2);
      double double0 = adamsBashforthIntegrator0.getMaxGrowth();
      assertEquals(1.4142135623730951, double0, 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(5, 5, (-3.503399598592085E9), 5, (-3.503399598592085E9));
      ODEIntegrator oDEIntegrator0 = adamsBashforthIntegrator0.getStarterIntegrator();
      assertEquals(1.148698354997035, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(132351.79633446774, oDEIntegrator0.getCurrentSignedStepsize(), 0.01);
  }
}
