/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 05:46:53 GMT 2018
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
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1285.7, 1285.7, 0.6301699876785278, 1285.7);
      dormandPrince54Integrator0.getOrder();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 0.9);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = (-441.25395144);
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-441.25395144), 0.0, doubleArray0, doubleArray0);
      double[][] doubleArray1 = new double[4][5];
      doubleArray1[1] = doubleArray0;
      int int0 = 699;
      dormandPrince853Integrator0.setMaxEvaluations(699);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        dormandPrince853Integrator0.integrate(expandableStatefulODE0, 3601.3);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (699) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.8482842445373535, 1.8482842445373535, 1.8482842445373535, 1.8482842445373535);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      dormandPrince853Integrator0.scalRelativeTolerance = (-3538.050447);
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      double double0 = dormandPrince853Integrator0.getSafety();
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = 0.0;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.0;
      double double1 = (-885.1335132100619);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-885.1335132100619), 0.0, (-885.1335132100619), (-885.1335132100619));
      int int0 = 25;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(25).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 0.0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (-71.658558492);
      doubleArray0[4] = (-1.1248E-10);
      doubleArray0[5] = 0.0;
      doubleArray0[3] = (-71.658558492);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(42).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-71.658558492));
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, (-71.658558492), 0.0, 1.0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, (double) 42);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-441.25395144);
      doubleArray0[2] = 3601.3;
      doubleArray0[4] = (-441.25395144);
      doubleArray0[5] = (-441.25395144);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-441.25395144));
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(42, 42, 0.37974655628204346, 3601.3);
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 0.0);
      dormandPrince853Integrator0.scalAbsoluteTolerance = (-1911.626764);
      dormandPrince853Integrator0.getMinReduction();
      dormandPrince853Integrator0.getMaxGrowth();
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 3.6924578046381256E-267);
      assertEquals(3.6924578046381256E-267, expandableStatefulODE0.getTime(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(42).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(3601.3);
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(3601.3, 3601.3, (-3319.6), 42);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, (-1256.1192182338832));
  }
}