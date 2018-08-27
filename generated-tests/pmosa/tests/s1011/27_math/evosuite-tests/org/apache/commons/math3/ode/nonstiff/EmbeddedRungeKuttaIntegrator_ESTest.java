/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 20:47:49 GMT 2018
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectStreamConstants;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondaryEquations;
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
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-5.634051826192439E-33);
      doubleArray0[1] = 4703.7;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = 3414.38;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = 0.0;
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMinReduction();
      assertEquals(0.2, double0, 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (-1009.779133);
      doubleArray1[1] = (-2049.81512598);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1607.01), 4.523982262003404E-81, doubleArray0, doubleArray0);
      highamHall54Integrator0.getOrder();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-2176.158396767535));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double double0 = 943.8;
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1915.2385), 943.8, (-1318.8), (-1915.2385));
      highamHall54Integrator0.clearStepHandlers();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(80).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      double double1 = (-1476.0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-1476.0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 219.9858676265;
      doubleArray0[2] = (-1.1089952719756529E-7);
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (-1.1089952719756529E-7);
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 0.0;
      doubleArray0[7] = 0.0;
      doubleArray0[8] = 0.0;
      double[] doubleArray1 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, (-1.1089952719756529E-7), doubleArray0, doubleArray1);
      double[][] doubleArray2 = new double[6][8];
      dormandPrince853Integrator0.clearStepHandlers();
      doubleArray2[0] = doubleArray1;
      doubleArray2[1] = doubleArray1;
      doubleArray2[2] = doubleArray0;
      doubleArray2[3] = doubleArray1;
      double[] doubleArray3 = new double[0];
      doubleArray2[4] = doubleArray3;
      doubleArray2[5] = doubleArray0;
      dormandPrince853Integrator0.estimateError(doubleArray2, doubleArray1, doubleArray1, 1401.5656502315999);
      dormandPrince853Integrator0.setInitialStepSize((-1.1089952719756529E-7));
      dormandPrince853Integrator0.getOrder();
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, (-1.1089952719756529E-7), 2152.533020802526, 2.0023789405822754);
      highamHall54Integrator0.getOrder();
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      
      dormandPrince853Integrator0.getOrder();
      highamHall54Integrator0.setMinReduction(0.0);
      highamHall54Integrator0.getMaxGrowth();
      highamHall54Integrator0.getOrder();
      highamHall54Integrator0.estimateError(doubleArray2, doubleArray0, doubleArray3, 1668.471685463);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      highamHall54Integrator0.scalAbsoluteTolerance = 0.0;
      highamHall54Integrator0.getOrder();
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-875.1), 251.0, 0.0, 0.0);
      dormandPrince54Integrator0.estimateError((double[][]) null, doubleArray0, doubleArray0, (-875.1));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 4.020060558571273E-74, doubleArray0, 10.0, doubleArray0);
      highamHall54Integrator0.estimateError((double[][]) null, doubleArray0, doubleArray0, 5);
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 1142.7410960888205;
      doubleArray1[1] = 10.0;
      highamHall54Integrator0.estimateError((double[][]) null, doubleArray0, doubleArray1, 10.0);
      highamHall54Integrator0.getOrder();
      dormandPrince54Integrator0.getSafety();
      dormandPrince54Integrator0.getOrder();
      assertEquals(8, dormandPrince54Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-606.55678181), (-606.55678181), (-1343.0), (-1343.0));
      highamHall54Integrator0.setMinReduction(3783.46294);
      highamHall54Integrator0.getOrder();
      double[][] doubleArray0 = new double[2][3];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-606.55678181);
      doubleArray1[1] = (-606.55678181);
      doubleArray1[2] = (-1343.0);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, (-606.55678181), 491.4625630890075, 0.0);
      dormandPrince54Integrator0.estimateError(doubleArray0, doubleArray1, doubleArray1, 491.4625630890075);
      dormandPrince54Integrator0.setMinReduction((-606.55678181));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 2009.024479671057);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      highamHall54Integrator0.setSafety(0.0);
      highamHall54Integrator0.getOrder();
      highamHall54Integrator0.clearStepHandlers();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 0.6655423926681077);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double double0 = 817.88;
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-1009.779133);
      doubleArray0[1] = (-1009.779133);
      doubleArray0[2] = (-1260.6493331164);
      doubleArray0[3] = (-1009.779133);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(817.88, (-1260.6493331164), doubleArray0, doubleArray0);
      highamHall54Integrator0.setSafety(202.62891);
      highamHall54Integrator0.getOrder();
      highamHall54Integrator0.clearStepHandlers();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      expandableStatefulODE1.setTime((-5.637415935329794E117));
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1444.910885, (-1260.6493331164), 1.4997124671936035, (-734.0));
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE1, 4162.026519911901);
  }
}