/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 03:39:26 GMT 2019
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
  public void test00()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(2417.162047, 1.1483560326413004E-7, 0.0, 2417.162047);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      
      dormandPrince853Integrator0.setSafety(0.0);
      double double0 = dormandPrince853Integrator0.getSafety();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-546.666), (-1225.8308648001), (-546.666), (-546.666));
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      
      dormandPrince853Integrator0.setSafety((-546.666));
      double double0 = dormandPrince853Integrator0.getSafety();
      assertEquals((-546.666), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.2, 3176.9212229706445, 0.2, 0.2);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      
      highamHall54Integrator0.setMinReduction(0.0);
      double double0 = highamHall54Integrator0.getMinReduction();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-3623.9896215674016), (-3623.9896215674016), doubleArray0, doubleArray0);
      dormandPrince853Integrator0.setMinReduction((-3623.9896215674016));
      double double0 = dormandPrince853Integrator0.getMinReduction();
      assertEquals((-3623.9896215674016), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 1.0, 1.0, 0.0);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      
      dormandPrince54Integrator0.setMaxGrowth(0.0);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(749.639, 749.639, 749.639, (-1.0));
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      
      dormandPrince54Integrator0.setMaxGrowth((-1.0));
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1528.8367057), (-1528.8367057), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        dormandPrince853Integrator0.integrate(expandableStatefulODE0, 2381.16402);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 2
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.2, 3176.9212229706445, 0.2, 0.2);
      // Undeclared exception!
      try { 
        highamHall54Integrator0.integrate((ExpandableStatefulODE) null, 1.2574668958946027E-256);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-546.666), (-546.666), (-546.666), (-546.666));
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      
      dormandPrince853Integrator0.setSafety(137.5127751);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1.2090653407564583E-7, (-1852.3860375), (-1.3577357192972777E258), 97.2204);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      
      dormandPrince54Integrator0.setMaxGrowth(0.3897167444229126);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-546.666), (-546.666), (-546.666), (-546.666));
      dormandPrince853Integrator0.setMinReduction(0.9);
      assertEquals(0.9, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(2417.162047, 1.0E-6, 0.0, (-5.2305110482722706E-8));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(0.0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 0.11604541540145874);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-546.666), (-546.666), (-546.666), (-546.666));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-856.91131));
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, (-1153.8303091560917));
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-546.666), (-1225.8308648001), (-546.666), (-546.666));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-2663.7240649422592));
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 2048.0);
      assertEquals(2048.0, expandableStatefulODE0.getTime(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.2, 3176.9212229706445, 0.2, 0.2);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-1381.0279621917905));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1675.3669342192, 1.1554977893829346, 1057.0116142834918, (-1.3577357192972777E258));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 0.0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(3.2820308007277566E-203, 0.0, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 840.0845);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.2, 3176.9212229706445, 0.2, 0.2);
      double double0 = highamHall54Integrator0.getMinReduction();
      assertEquals(0.2, double0, 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-546.666), (-1225.8308648001), (-546.666), (-546.666));
      double double0 = dormandPrince853Integrator0.getSafety();
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(192.381030176533, 192.381030176533, 192.381030176533, 2467.9071504327994);
      double double0 = dormandPrince853Integrator0.getMaxGrowth();
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(10.0, double0, 0.01);
  }
}