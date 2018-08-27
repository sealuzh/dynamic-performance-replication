/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 15:52:27 GMT 2018
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectStreamConstants;
import java.util.LinkedList;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventHandler;
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
      doubleArray0[0] = 0.0;
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getMaxGrowth();
      assertEquals(10.0, double0, 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 0.9;
      doubleArray0[1] = 1.3509137630462646;
      doubleArray0[2] = 0.9;
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.9, 1.3509137630462646, doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getMinReduction();
      assertEquals(0.2, double0, 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-0.1768481385645485);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-0.1768481385645485), (-0.1768481385645485), doubleArray0, doubleArray0);
      double double0 = dormandPrince54Integrator0.getSafety();
      assertEquals(0.9, double0, 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-928.3), (-928.3), (-928.3), 6.789527378582775E-122);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 6.789527378582775E-122);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-3300.075368955831), 169.089603119445, (-3301.075368955831), (-672.41544));
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-3301.075368955831);
      doubleArray0[1] = (-672.41544);
      doubleArray0[2] = (-3301.075368955831);
      doubleArray0[3] = (-672.41544);
      doubleArray0[4] = (-3300.075368955831);
      doubleArray0[5] = 169.089603119445;
      doubleArray0[6] = (-3301.075368955831);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (-2431.9796215844126);
      doubleArray1[1] = (-3301.075368955831);
      doubleArray1[2] = (-672.41544);
      doubleArray1[3] = 169.089603119445;
      doubleArray1[4] = (-3301.075368955831);
      doubleArray1[5] = 169.089603119445;
      doubleArray1[6] = (-672.41544);
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-672.41544), (-672.41544), doubleArray0, doubleArray1);
      dormandPrince853Integrator0.mainSetDimension = (-1885);
      dormandPrince853Integrator0.getOrder();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-599.8394711000001));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(904.5646648, 904.5646648, 904.5646648, 904.5646648);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 904.5646648;
      dormandPrince54Integrator0.setMaxGrowth(904.5646648);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(904.5646648);
      expandableStatefulODE0.getTotalDimension();
      expandableStatefulODE0.computeDerivatives(1, doubleArray0, doubleArray0);
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 2615.2062);
      dormandPrince54Integrator0.getSafety();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-709.1935712284223), 0.0, (-709.1935712284223), (-709.1935712284223));
      double[] doubleArray0 = new double[3];
      dormandPrince54Integrator0.setMaxGrowth((-709.1935712284223));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-1504.4041359));
      expandableStatefulODE0.getTotalDimension();
      expandableStatefulODE0.computeDerivatives(0.0, doubleArray0, doubleArray0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 10.0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(904.5646648, 904.5646648, 904.5646648, 904.5646648);
      LinkedList<EventHandler> linkedList0 = new LinkedList<EventHandler>();
      dormandPrince54Integrator0.setMaxGrowth(904.5646648);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(143.465035);
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1526.370381168516);
      doubleArray0[1] = (-1504.4041359);
      expandableStatefulODE0.computeDerivatives(10.0, doubleArray0, doubleArray0);
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 10.0);
      dormandPrince54Integrator0.getSafety();
      dormandPrince54Integrator0.setMaxGrowth(10.0);
  }
}
