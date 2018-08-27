/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 07:40:40 GMT 2018
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.ODEIntegrator;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondaryEquations;
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultistepIntegrator_ESTest extends MultistepIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = null;
      try {
        adamsMoultonIntegrator0 = new AdamsMoultonIntegrator((-96), (-96), (-96), doubleArray0, doubleArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdamsNordsieckTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = null;
      try {
        adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(0, 0, 0, 0, 1734.872346);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // multistep method needs at least 0 previous steps, got 2
         //
         verifyException("org.apache.commons.math3.ode.MultistepIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, 960.8464757279966, 2.150458158068556, 2);
      adamsMoultonIntegrator0.getStepHandlers();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      try { 
        adamsMoultonIntegrator0.integrate(expandableStatefulODE0, 2.150458158068556);
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
      double double0 = (-3676.631);
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(7, (-3676.631), 1.0686607360839844, 0.0, 1.0686607360839844);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(7).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      adamsMoultonIntegrator0.integrate(expandableStatefulODE0, 1.0686607360839844);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, 2, 2);
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(1.6385396676990034E-7);
      adamsBashforthIntegrator0.setStarterIntegrator(classicalRungeKuttaIntegrator0);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(6, 0.08064348995685577, 0.08064348995685577, 9.183480622172801E148, 9.183480622172801E148);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      try { 
        adamsBashforthIntegrator0.integrate(expandableStatefulODE0, 0.08064348995685577);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix must have at least one column
         //
         verifyException("org.apache.commons.math3.linear.Array2DRowRealMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(2, 2, 2, 0.0, 2);
      double double0 = adamsMoultonIntegrator0.getSafety();
      assertEquals(0.9, double0, 0.01);
      assertEquals(1.2599210498948732, adamsMoultonIntegrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, adamsMoultonIntegrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, (-3676.630637995), (-1376.64083));
      ODEIntegrator oDEIntegrator0 = adamsBashforthIntegrator0.getStarterIntegrator();
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(2.0, oDEIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(2, 2, 2, 2, 2);
      double double0 = adamsBashforthIntegrator0.getMinReduction();
      assertEquals(0.2, double0, 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(1.4142135623730951, adamsBashforthIntegrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(6, 0.08064348995685577, 0.08064348995685577, 9.183480622172801E148, 9.183480622172801E148);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      double double0 = adamsBashforthIntegrator0.getMaxGrowth();
      assertEquals(0.2, adamsBashforthIntegrator0.getMinReduction(), 0.01);
      assertEquals(0.9, adamsBashforthIntegrator0.getSafety(), 0.01);
      assertEquals(1.122462048309373, double0, 0.01);
  }
}
