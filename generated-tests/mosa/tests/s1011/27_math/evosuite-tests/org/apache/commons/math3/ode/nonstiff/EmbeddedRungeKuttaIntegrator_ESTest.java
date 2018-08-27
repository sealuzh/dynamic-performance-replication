/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 02:43:10 GMT 2018
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
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
  public void test0()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-606.55678181), (-606.55678181), (-1343.0), (-1343.0));
      highamHall54Integrator0.setMinReduction(3783.46294);
      highamHall54Integrator0.getOrder();
      assertEquals(3783.46294, highamHall54Integrator0.getMinReduction(), 0.01);
      
      double[] doubleArray0 = new double[6];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-534.2394656905338), (-1140.320829), doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMinReduction();
      assertEquals(0.2, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-3944.9474372);
      doubleArray0[1] = (-3944.9474372);
      doubleArray0[2] = (-3944.9474372);
      doubleArray0[3] = (-3944.9474372);
      doubleArray0[4] = (-3944.9474372);
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-3944.9474372), (-3944.9474372), doubleArray0, doubleArray0);
      double double0 = dormandPrince853Integrator0.getMaxGrowth();
      assertEquals(10.0, double0, 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1.122932337832262E-7, 2164.5577525, 2164.5577525, 2164.5577525);
      highamHall54Integrator0.setMinReduction(1.0);
      highamHall54Integrator0.getStepHandlers();
      highamHall54Integrator0.setMaxGrowth(1.0);
      highamHall54Integrator0.getMinReduction();
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.0, 1.122932337832262E-7, 1.0, 0.0);
      dormandPrince853Integrator0.getOrder();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 0.2);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(2661.867348, (-3591.219347384241), (-3591.219347384241), 10.0);
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(3591.219347384241, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(3091.8197748749812, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(2661.867348, dormandPrince54Integrator0.getMinStep(), 0.01);
      
      double double0 = dormandPrince54Integrator0.getMaxGrowth();
      assertEquals(10.0, double0, 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(3591.219347384241, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(3091.8197748749812, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(2661.867348, dormandPrince54Integrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[2] = 0.0;
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-462.9636621073), (-462.9636621073), 0.0, 0.0);
      assertNotNull(highamHall54Integrator0);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(462.9636621073, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(462.9636621073, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(462.9636621073, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      
      double double0 = highamHall54Integrator0.getSafety();
      assertEquals(0.9, double0, 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(462.9636621073, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(462.9636621073, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(462.9636621073, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 0.0;
      double double0 = 1.0;
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-462.9636621073), (-462.9636621073), 1.0, 0.0);
      assertNotNull(highamHall54Integrator0);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(462.9636621073, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(462.9636621073, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(462.9636621073, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      
      int int0 = 1;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertNotNull(firstOrderConverter0);
      assertEquals(2, firstOrderConverter0.getDimension());
      
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      assertNotNull(expandableStatefulODE0);
      assertEquals(2, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-462.9636621073));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-2291.994919), (-2291.994919), 10.0, (-2291.994919));
      assertNotNull(highamHall54Integrator0);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(2291.994919, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(2291.994919, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(2291.994919, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      
      int int0 = 1608;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1608).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertNotNull(firstOrderConverter0);
      assertEquals(3216, firstOrderConverter0.getDimension());
      
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      assertNotNull(expandableStatefulODE0);
      assertEquals(3216, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      
      expandableStatefulODE0.setTime(1.0);
      assertEquals(3216, firstOrderConverter0.getDimension());
      assertEquals(1.0, expandableStatefulODE0.getTime(), 0.01);
      
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 10.0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-606.55678181), (-606.55678181), (-1343.0), (-1343.0));
      assertNotNull(highamHall54Integrator0);
      assertEquals(606.55678181, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(606.55678181, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(606.55678181, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      
      int int0 = highamHall54Integrator0.getOrder();
      assertEquals(5, int0);
      assertEquals(606.55678181, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(606.55678181, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(606.55678181, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-606.55678181);
      doubleArray0[1] = (-606.55678181);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertNotNull(firstOrderConverter0);
      assertEquals(6, firstOrderConverter0.getDimension());
      
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      assertNotNull(expandableStatefulODE0);
      assertEquals(6, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      
      expandableStatefulODE0.setTime((-616.14948145));
      assertEquals(6, firstOrderConverter0.getDimension());
      assertEquals((-616.14948145), expandableStatefulODE0.getTime(), 0.01);
      
      highamHall54Integrator0.integrate(expandableStatefulODE0, (double) 5);
      assertEquals(606.55678181, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(606.55678181, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(15, highamHall54Integrator0.getEvaluations());
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(606.55678181, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(6, firstOrderConverter0.getDimension());
      assertEquals(5.0, expandableStatefulODE0.getTime(), 0.01);
      
      // Undeclared exception!
      try { 
        highamHall54Integrator0.estimateError((double[][]) null, doubleArray0, doubleArray0, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-606.55678181), (-606.55678181), (-1343.0), (-1343.0));
      assertNotNull(highamHall54Integrator0);
      assertEquals(606.55678181, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(606.55678181, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(606.55678181, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      
      highamHall54Integrator0.setMinReduction(3783.46294);
      assertEquals(606.55678181, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(3783.46294, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(606.55678181, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(606.55678181, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      
      int int0 = highamHall54Integrator0.getOrder();
      assertEquals(5, int0);
      assertEquals(606.55678181, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(3783.46294, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(606.55678181, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(606.55678181, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-606.55678181);
      doubleArray0[1] = (-606.55678181);
      doubleArray0[2] = (-1343.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertNotNull(firstOrderConverter0);
      assertEquals(0, firstOrderConverter0.getDimension());
      
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      assertNotNull(expandableStatefulODE0);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      
      expandableStatefulODE0.setTime((-616.14948145));
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals((-616.14948145), expandableStatefulODE0.getTime(), 0.01);
      
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (double) 5);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      assertNotNull(highamHall54Integrator0);
      assertEquals(0.0, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.0, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      
      int int0 = highamHall54Integrator0.getOrder();
      assertEquals(5, int0);
      assertEquals(0.0, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.0, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      
      double double0 = 0.9;
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 5, 5, 0.9);
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(5.0, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(0.0, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertNotNull(firstOrderConverter0);
      assertEquals(0, firstOrderConverter0.getDimension());
      
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      assertNotNull(expandableStatefulODE0);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 0.0);
  }
}