/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 05:28:00 GMT 2019
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
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultistepIntegrator_ESTest extends MultistepIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(8, 8, 8, 8, 8);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(0.0);
      // Undeclared exception!
      try { 
        adamsMoultonIntegrator0.integrate(expandableStatefulODE0, (double) 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 5.86440876259637E-309, (-4850.8), doubleArray0, doubleArray0);
      ODEIntegrator oDEIntegrator0 = adamsBashforthIntegrator0.getStarterIntegrator();
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(5.333579850869628E-153, oDEIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(8, 8, 8, 8, 8);
      adamsMoultonIntegrator0.setMaxGrowth((-1.0));
      double double0 = adamsMoultonIntegrator0.getMaxGrowth();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(8, 8, 8, 8, 8);
      adamsMoultonIntegrator0.setStarterIntegrator((FirstOrderIntegrator) null);
      adamsMoultonIntegrator0.getStarterIntegrator();
      assertEquals(1.080059738892306, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, 213.7631, 213.7631, doubleArray0, doubleArray0);
      GillIntegrator gillIntegrator0 = new GillIntegrator((-485.0));
      adamsBashforthIntegrator0.setStarterIntegrator(gillIntegrator0);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(2.0, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(1, 1, 7.196457718729758E281, doubleArray0, doubleArray0);
      adamsMoultonIntegrator0.setSafety(5.744446753652847E185);
      assertEquals(5.744446753652847E185, adamsMoultonIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, 2, 2, 2);
      adamsMoultonIntegrator0.setSafety((-1105.21587));
      double double0 = adamsMoultonIntegrator0.getSafety();
      assertEquals((-1105.21587), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(8, 8, 8, 8, 8);
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
      
      adamsMoultonIntegrator0.setMinReduction(0.0);
      double double0 = adamsMoultonIntegrator0.getMinReduction();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(9, 9, (-852.0), (-852.0), (-852.0));
      adamsMoultonIntegrator0.setMinReduction(9);
      assertEquals(9.0, adamsMoultonIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, 1, 1, doubleArray0, doubleArray0);
      assertEquals(2.0, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      
      adamsBashforthIntegrator0.setMaxGrowth(0.0);
      double double0 = adamsBashforthIntegrator0.getMaxGrowth();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, 1, 1, doubleArray0, doubleArray0);
      assertEquals(2.0, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      
      adamsBashforthIntegrator0.setMaxGrowth(1.0);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(9, 9, (-852.0), (-852.0), (-852.0));
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
      
      adamsMoultonIntegrator0.setSafety(0.0);
      double double0 = adamsMoultonIntegrator0.getSafety();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(8, 8, 1168.658515, 8, 1168.658515);
      adamsMoultonIntegrator0.setMinReduction((-934.786462686209));
      double double0 = adamsMoultonIntegrator0.getMinReduction();
      assertEquals((-934.786462686209), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(8, 0.0, 0.0, 8, 3236.93538082576);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      adamsMoultonIntegrator0.integrate(expandableStatefulODE0, (double) 8);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = null;
      try {
        adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(0, 0, (-852.0), (-852.0), (-852.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // multistep method needs at least 0 previous steps, got 2
         //
         verifyException("org.apache.commons.math3.ode.MultistepIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, 0.0, (-852.0), doubleArray0, doubleArray0);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0, 1348.5, 0.0, 1.0);
      adamsBashforthIntegrator0.setStarterIntegrator(graggBulirschStoerIntegrator0);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(2.0, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(9, 9, (-852.0), (-852.0), (-852.0));
      double double0 = adamsMoultonIntegrator0.getSafety();
      assertEquals(0.9, double0, 0.01);
      assertEquals(1.0717734625362931, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(8, 8, 8, 8, 8);
      double double0 = adamsMoultonIntegrator0.getMinReduction();
      assertEquals(0.2, double0, 0.01);
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
      assertEquals(1.080059738892306, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(8, 8, 8, 8, 8);
      double double0 = adamsMoultonIntegrator0.getMaxGrowth();
      assertEquals(1.080059738892306, double0, 0.01);
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
      assertEquals(0.9, adamsMoultonIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, 0.0, (-852.0), doubleArray0, doubleArray0);
      DormandPrince853Integrator dormandPrince853Integrator0 = (DormandPrince853Integrator)adamsBashforthIntegrator0.getStarterIntegrator();
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(2.0, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(852.0, dormandPrince853Integrator0.getMaxStep(), 0.01);
  }
}
