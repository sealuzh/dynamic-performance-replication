/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 11:13:43 GMT 2019
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
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
  public void test00()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, (-4255.68792306), (-4255.68792306), 0.0);
      dormandPrince54Integrator0.getOrder();
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(528.8, 528.8, doubleArray0, doubleArray0);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      
      dormandPrince853Integrator0.setMaxGrowth(0.0);
      double double0 = dormandPrince853Integrator0.getMaxGrowth();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      dormandPrince54Integrator0.setSafety(4);
      assertEquals(4.0, dormandPrince54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(786.121775, 2298.94, 0.9, 96.223);
      dormandPrince54Integrator0.setMaxGrowth(0.9);
      assertEquals(0.9, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 1868.27, (-1890.076), 1868.27);
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.integrate((ExpandableStatefulODE) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, (-4255.68792306), (-4255.68792306), 0.0);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      
      dormandPrince54Integrator0.setSafety(0.0);
      assertEquals(0.0, dormandPrince54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-170.7), (-170.7), (-170.7), 0.9);
      dormandPrince54Integrator0.setMinReduction(378.9469055);
      assertEquals(378.9469055, dormandPrince54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-170.7), (-170.7), (-170.7), 0.9);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(59).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-0.9651747386039236));
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, (-5.0551842723970724E-8));
      assertEquals((-5.0551842723970724E-8), expandableStatefulODE0.getTime(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-170.7), (-170.7), (-170.7), 0.9);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(59).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(2.0);
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, (-5.0551842723970724E-8));
      assertEquals((-5.0551842723970724E-8), expandableStatefulODE0.getTime(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-4.756403), (-4.756403), (-0.025), (-0.025));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-1251.03000660724), doubleArray0, 3310.3793370143635, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 0.0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.2, 310.90023, 3762.046, 3762.046);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 1.841078519821167);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(528.8, 528.8, doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMinReduction();
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(528.8, 528.8, doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getSafety();
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, double0, 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(528.8, 528.8, doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMaxGrowth();
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(10.0, double0, 0.01);
  }
}