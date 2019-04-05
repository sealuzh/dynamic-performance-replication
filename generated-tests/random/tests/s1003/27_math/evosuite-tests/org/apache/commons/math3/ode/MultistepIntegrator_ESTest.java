/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 10:10:14 GMT 2019
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.ODEIntegrator;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondaryEquations;
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math3.ode.nonstiff.LutherIntegrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultistepIntegrator_ESTest extends MultistepIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, (-782.3895), 0.0, doubleArray0, doubleArray0);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      
      adamsBashforthIntegrator0.setMinReduction(0.0);
      assertEquals(2.0, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 0.0, 0.0, 0.0, (-2056.8));
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      
      adamsBashforthIntegrator0.setMaxGrowth(0.0);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(3, 3, 573.3493758869264, 3, (-618.3554322625));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      try { 
        adamsMoultonIntegrator0.integrate(expandableStatefulODE0, 1064.25816);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one column
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = null;
      try {
        adamsMoultonIntegrator0 = new AdamsMoultonIntegrator((-1531), 0.4794800877571106, 1.9219478787856753E-98, 1.9219478787856753E-98, 5.164902728917601E-224);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // multistep method needs at least -1,531 previous steps, got 2
         //
         verifyException("org.apache.commons.math3.ode.MultistepIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, (-782.3895), 0.0, doubleArray0, doubleArray0);
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator((-3046.040129508));
      adamsBashforthIntegrator0.setStarterIntegrator(lutherIntegrator0);
      assertEquals(2.0, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, (-782.3895), 0.0, doubleArray0, doubleArray0);
      double double0 = adamsBashforthIntegrator0.getSafety();
      assertEquals(0.9, double0, 0.01);
      assertEquals(2.0, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, (-782.3895), 0.0, doubleArray0, doubleArray0);
      double double0 = adamsBashforthIntegrator0.getMinReduction();
      assertEquals(2.0, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, double0, 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(1, (-782.3895), 0.0, doubleArray0, doubleArray0);
      double double0 = adamsBashforthIntegrator0.getMaxGrowth();
      assertEquals(2.0, double0, 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 0.0, 0.0, 0.0, (-2056.8));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      adamsBashforthIntegrator0.integrate(expandableStatefulODE0, 0.0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, doubleArray0, doubleArray0);
      ODEIntegrator oDEIntegrator0 = adamsBashforthIntegrator0.getStarterIntegrator();
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(2.0, oDEIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
  }
}