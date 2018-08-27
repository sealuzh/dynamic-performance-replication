/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 16:44:43 GMT 2018
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.apache.commons.math3.ode.EquationsMapper;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmbeddedRungeKuttaIntegrator_ESTest extends EmbeddedRungeKuttaIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1.2296934902142301E22), (-1.2296934902142301E22), (-1.2296934902142301E22), (-1.2296934902142301E22));
      highamHall54Integrator0.setMaxGrowth(10.0);
      double double0 = highamHall54Integrator0.getMinReduction();
      assertEquals(0.2, double0, 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.2, 0.2, 1.0, 0.2);
      dormandPrince853Integrator0.getMaxGrowth();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 10.0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(581.0, 487.779277, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.vecRelativeTolerance = doubleArray0;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 487.779277);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.2, 0.2, 1.0, 0.2);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(0.2, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertNotNull(dormandPrince853Integrator0);
      
      double double0 = dormandPrince853Integrator0.getMaxGrowth();
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(0.2, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(10.0, double0, 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1307).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertEquals(2614, firstOrderConverter0.getDimension());
      assertNotNull(firstOrderConverter0);
      
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      assertEquals(2614, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      assertNotNull(expandableStatefulODE0);
      
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 10.0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, 10.0, 1940.1);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertNotNull(dormandPrince853Integrator0);
      
      dormandPrince853Integrator0.setSafety(10.0);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(10.0, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMaxStep(), 0.01);
      
      dormandPrince853Integrator0.vecAbsoluteTolerance = null;
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(10.0, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMaxStep(), 0.01);
      
      dormandPrince853Integrator0.resetInternalState();
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(10.0, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMaxStep(), 0.01);
      
      int int0 = dormandPrince853Integrator0.getOrder();
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(10.0, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(8, int0);
      
      Collection<StepHandler> collection0 = dormandPrince853Integrator0.getStepHandlers();
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(10.0, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertNotNull(collection0);
      
      int int1 = dormandPrince853Integrator0.getOrder();
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(10.0, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertTrue(int1 == int0);
      assertEquals(8, int1);
      
      double double0 = dormandPrince853Integrator0.getSafety();
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(10.0, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(10.0, double0, 0.01);
      
      dormandPrince853Integrator0.setMaxGrowth(1940.1);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(0.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(1940.1, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(10.0, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince853Integrator0.getMaxStep(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertEquals(16, firstOrderConverter0.getDimension());
      assertNotNull(firstOrderConverter0);
      
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      assertEquals(16, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      assertNotNull(expandableStatefulODE0);
      
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 0.0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(581.0, 487.779277, doubleArray0, doubleArray0);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(581.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(532.3530406948006, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(487.779277, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertNotNull(dormandPrince853Integrator0);
      
      dormandPrince853Integrator0.vecRelativeTolerance = doubleArray0;
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(581.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(532.3530406948006, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(487.779277, dormandPrince853Integrator0.getMaxStep(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertNotNull(firstOrderConverter0);
      
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      assertNotNull(expandableStatefulODE0);
      
      EquationsMapper[] equationsMapperArray0 = expandableStatefulODE0.getSecondaryMappers();
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      assertNotNull(equationsMapperArray0);
      
      dormandPrince853Integrator0.sanityChecks(expandableStatefulODE0, 291.24);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(581.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(532.3530406948006, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(487.779277, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      
      expandableStatefulODE0.setTime(487.779277);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(487.779277, expandableStatefulODE0.getTime(), 0.01);
      
      double[][] doubleArray1 = new double[0][3];
      double double0 = dormandPrince853Integrator0.estimateError(doubleArray1, doubleArray0, doubleArray0, 1701.8);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(581.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(532.3530406948006, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(487.779277, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 3493.0901);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(581.0, 487.779277, doubleArray0, doubleArray0);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(532.3530406948006, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(487.779277, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(581.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertNotNull(dormandPrince853Integrator0);
      
      dormandPrince853Integrator0.vecRelativeTolerance = doubleArray0;
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(532.3530406948006, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(487.779277, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(581.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertNotNull(firstOrderConverter0);
      
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      assertNotNull(expandableStatefulODE0);
      
      EquationsMapper[] equationsMapperArray0 = expandableStatefulODE0.getSecondaryMappers();
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      assertNotNull(equationsMapperArray0);
      
      double[][] doubleArray1 = new double[8][8];
      dormandPrince853Integrator0.sanityChecks(expandableStatefulODE0, 487.779277);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(532.3530406948006, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(487.779277, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(581.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      
      expandableStatefulODE0.setTime(0);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(0.0, expandableStatefulODE0.getTime(), 0.01);
      
      double[] doubleArray2 = new double[0];
      assertFalse(doubleArray2.equals((Object)doubleArray0));
      
      double double0 = dormandPrince853Integrator0.estimateError(doubleArray1, doubleArray0, doubleArray2, 93.22072300000002);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(532.3530406948006, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(487.779277, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(581.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertFalse(doubleArray0.equals((Object)doubleArray2));
      assertFalse(doubleArray2.equals((Object)doubleArray0));
      assertEquals(Double.NaN, double0, 0.01);
      assertNotSame(doubleArray0, doubleArray2);
      assertNotSame(doubleArray2, doubleArray0);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {}, doubleArray2, 0.01);
      
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 487.779277);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(532.3530406948006, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(487.779277, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(17, dormandPrince853Integrator0.getEvaluations());
      assertEquals(581.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(487.779277, expandableStatefulODE0.getTime(), 0.01);
      assertFalse(doubleArray0.equals((Object)doubleArray2));
      assertNotSame(doubleArray0, doubleArray2);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(581.0, 487.779277, doubleArray0, doubleArray0);
      assertEquals(581.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(532.3530406948006, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(487.779277, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertNotNull(dormandPrince853Integrator0);
      
      dormandPrince853Integrator0.vecRelativeTolerance = doubleArray0;
      assertEquals(581.0, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(532.3530406948006, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(487.779277, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertNotNull(firstOrderConverter0);
      
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      assertNotNull(expandableStatefulODE0);
      
      EquationsMapper[] equationsMapperArray0 = expandableStatefulODE0.getSecondaryMappers();
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      assertNotNull(equationsMapperArray0);
      
      expandableStatefulODE0.setTime(366.80003674);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(366.80003674, expandableStatefulODE0.getTime(), 0.01);
      
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, (-1.0454849939675588));
  }
}