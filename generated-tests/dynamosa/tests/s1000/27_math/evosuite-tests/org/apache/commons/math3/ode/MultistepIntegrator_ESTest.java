/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 20:25:22 GMT 2019
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.FirstOrderIntegrator;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondaryEquations;
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultistepIntegrator_ESTest extends MultistepIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(7, 7, 7, 7, 7);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[0];
      // Undeclared exception!
      try { 
        adamsMoultonIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-1.0), doubleArray0, 2.3616843223571777, doubleArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, 2, 2, 2);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-165.5116822));
      adamsMoultonIntegrator0.integrate(expandableStatefulODE0, (double) 2);
      DormandPrince853Integrator dormandPrince853Integrator0 = (DormandPrince853Integrator)adamsMoultonIntegrator0.getStarterIntegrator();
      assertEquals(2.0, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(1.2599210498948732, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, (-343.230647744), 0.0, (-510.0), 2.0);
      DormandPrince853Integrator dormandPrince853Integrator0 = (DormandPrince853Integrator)adamsBashforthIntegrator0.getStarterIntegrator();
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(343.230647744, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, 2, 2, 2);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(2);
      adamsMoultonIntegrator0.integrate(expandableStatefulODE0, (double) 0);
      DormandPrince853Integrator dormandPrince853Integrator0 = (DormandPrince853Integrator)adamsMoultonIntegrator0.getStarterIntegrator();
      assertEquals(1.2599210498948732, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
      assertEquals(2.0, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(7, 7, 7, 7, 7);
      assertEquals(1.0905077326652577, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
      
      adamsMoultonIntegrator0.setMaxGrowth(0.0);
      double double0 = adamsMoultonIntegrator0.getMaxGrowth();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, 1, (-1148.25897859319), doubleArray0, doubleArray0);
      adamsBashforthIntegrator0.setStarterIntegrator((FirstOrderIntegrator) null);
      adamsBashforthIntegrator0.getStarterIntegrator();
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(2.0, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, (-655.8265727), 2, 2, (-655.8265727));
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(8, (-4439.96328098), 2, (-2581.5563771), (-2581.5563771));
      adamsBashforthIntegrator0.setStarterIntegrator(adamsMoultonIntegrator0);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(1.2599210498948732, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(1, 2.0, 0.9, doubleArray0, doubleArray0);
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
      
      adamsMoultonIntegrator0.setSafety(0.0);
      double double0 = adamsMoultonIntegrator0.getSafety();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, (-655.8265727), 511.229365, 724.6607, (-655.8265727));
      adamsMoultonIntegrator0.setSafety(724.6607);
      assertEquals(724.6607, adamsMoultonIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, 0.0, 0.7542341653323061);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      
      adamsBashforthIntegrator0.setMinReduction(0.0);
      double double0 = adamsBashforthIntegrator0.getMinReduction();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, 0.0, 0.7542341653323061);
      adamsBashforthIntegrator0.setMinReduction(0.2);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, 2, 724.6607, 2);
      adamsMoultonIntegrator0.setMaxGrowth(724.6607);
      assertEquals(724.6607, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, (-655.8265727), 2, 2, (-655.8265727));
      adamsMoultonIntegrator0.setMaxGrowth((-655.8265727));
      assertEquals((-655.8265727), adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, 2, 724.6607, 2);
      adamsMoultonIntegrator0.setSafety((-1230.06));
      double double0 = adamsMoultonIntegrator0.getSafety();
      assertEquals((-1230.06), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, 2, 2, 2);
      adamsMoultonIntegrator0.setMinReduction((-2312.311965296436));
      double double0 = adamsMoultonIntegrator0.getMinReduction();
      assertEquals((-2312.311965296436), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, 2, 2, 2);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      adamsMoultonIntegrator0.integrate(expandableStatefulODE0, (double) 2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(7, 7, 7, 7, 7);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(7).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      adamsMoultonIntegrator0.integrate(expandableStatefulODE0, (double) 7);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = null;
      try {
        adamsBashforthIntegrator0 = new AdamsBashforthIntegrator((-1074), (-1074), (-1074), (-1074), (-1074));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // multistep method needs at least -1,074 previous steps, got 2
         //
         verifyException("org.apache.commons.math3.ode.MultistepIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, 2, doubleArray0, doubleArray0);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 2, 2, 2);
      adamsMoultonIntegrator0.setStarterIntegrator(dormandPrince54Integrator0);
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
      assertEquals(1.2599210498948732, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, 2, 724.6607, 2);
      double double0 = adamsMoultonIntegrator0.getSafety();
      assertEquals(1.2599210498948732, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
      assertEquals(0.9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(7, 7, 7, 7, 7);
      double double0 = adamsMoultonIntegrator0.getMinReduction();
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
      assertEquals(0.2, double0, 0.01);
      assertEquals(1.0905077326652577, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, 2, 2);
      double double0 = adamsBashforthIntegrator0.getMaxGrowth();
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(1.4142135623730951, double0, 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
  }
}
