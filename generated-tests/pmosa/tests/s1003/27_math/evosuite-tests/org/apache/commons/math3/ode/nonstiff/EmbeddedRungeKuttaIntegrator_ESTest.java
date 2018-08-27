/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 23:10:59 GMT 2018
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
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-27.02681), (-27.02681), (-27.02681), 0.48610860109329224);
      double double0 = dormandPrince853Integrator0.getMaxGrowth();
      assertEquals(10.0, double0, 0.01);
      
      dormandPrince853Integrator0.getOrder();
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-27.02681);
      doubleArray0[1] = (-27.02681);
      doubleArray0[2] = 0.0;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-27.02681);
      doubleArray1[1] = (double) 8;
      doubleArray1[2] = (-27.02681);
      doubleArray1[3] = 0.0;
      doubleArray1[4] = 0.48610860109329224;
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, doubleArray0, doubleArray1);
      highamHall54Integrator0.getOrder();
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.2336299419403076, 1.2336299419403076, 0.0, (-2099.479538689907));
      double double0 = dormandPrince853Integrator0.getMinReduction();
      assertEquals(0.2, double0, 0.01);
      
      double[][] doubleArray0 = new double[2][4];
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (-2099.479538689907);
      doubleArray1[1] = 0.2;
      doubleArray1[2] = 1.2336299419403076;
      doubleArray1[3] = (-2099.479538689907);
      doubleArray1[4] = (-2099.479538689907);
      doubleArray1[5] = 0.2;
      doubleArray1[6] = (-2099.479538689907);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[2];
      doubleArray2[0] = 0.0;
      doubleArray2[1] = 1.2336299419403076;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[6];
      doubleArray3[0] = 0.2;
      doubleArray3[1] = (-2099.479538689907);
      doubleArray3[2] = (-2099.479538689907);
      doubleArray3[3] = 1.2336299419403076;
      doubleArray3[4] = 1.2336299419403076;
      doubleArray3[5] = (-2099.479538689907);
      dormandPrince853Integrator0.estimateError(doubleArray0, doubleArray3, doubleArray1, (-774.390081972562));
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, 0.0, 0.0);
      highamHall54Integrator0.setSafety((-4622.20568658929));
      highamHall54Integrator0.setMinReduction(0.0);
      highamHall54Integrator0.getSafety();
      double[][] doubleArray0 = new double[2][8];
      highamHall54Integrator0.setMaxGrowth((-4622.20568658929));
      highamHall54Integrator0.filterStep(0.0, false, false);
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[2];
      doubleArray2[0] = 0.0;
      doubleArray2[1] = 0.0;
      doubleArray0[1] = doubleArray2;
      highamHall54Integrator0.estimateError(doubleArray0, doubleArray2, doubleArray2, 0.0);
      highamHall54Integrator0.estimateError(doubleArray0, doubleArray2, doubleArray2, 0.0);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, (-361.15517), doubleArray2, doubleArray2);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        dormandPrince54Integrator0.integrate(expandableStatefulODE0, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 2
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.9, 1.0, doubleArray0, doubleArray0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 0.0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = (-788.54);
      double double1 = 2450.3651;
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-788.54), (-788.54), 2450.3651, (-788.54));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(107).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      highamHall54Integrator0.clearEventHandlers();
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 0.0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = (-788.54);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-788.54), (-788.54), (-788.54), (-788.54));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      highamHall54Integrator0.clearEventHandlers();
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 0.0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-788.54), (-788.54), (-788.54), (-788.54));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      highamHall54Integrator0.clearEventHandlers();
      double double0 = 0.0;
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (double) 1;
      doubleArray0[2] = (-788.54);
      doubleArray0[3] = (-788.54);
      doubleArray0[4] = 2959.63829;
      doubleArray0[5] = (-788.54);
      doubleArray0[6] = 0.0;
      doubleArray0[7] = 0.0;
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(2959.63829, 1, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations1 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations1).getDimension();
      FirstOrderConverter firstOrderConverter1 = new FirstOrderConverter(secondOrderDifferentialEquations1);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter1);
      double double1 = (-2920.32);
      DormandPrince853Integrator dormandPrince853Integrator1 = new DormandPrince853Integrator(0.9, 1.474522484905093E189, 1.0, (-2920.32));
      // Undeclared exception!
      dormandPrince853Integrator1.integrate(expandableStatefulODE0, (-788.54));
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1.0), (-1.0), (-1.0), 0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double double0 = 0.0;
      double[] doubleArray0 = new double[0];
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      highamHall54Integrator0.sanityChecks(expandableStatefulODE0, 0.0);
      // Undeclared exception!
      highamHall54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 6.90075846083, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.getSecondaryMappers();
      expandableStatefulODE0.setTime(0.9);
      expandableStatefulODE0.setCompleteState(doubleArray0);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.9, 1.0, doubleArray0, doubleArray0);
      highamHall54Integrator0.integrate(expandableStatefulODE0, 0.0);
      assertEquals(8, highamHall54Integrator0.getEvaluations());
  }
}