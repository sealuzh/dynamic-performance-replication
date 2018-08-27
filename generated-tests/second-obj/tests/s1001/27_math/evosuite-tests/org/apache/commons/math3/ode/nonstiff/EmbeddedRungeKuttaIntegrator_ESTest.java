/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 15:54:42 GMT 2018
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math3.ode.EquationsMapper;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
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
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 70.7534, 0.0, 0.0);
      double double0 = highamHall54Integrator0.getSafety();
      assertEquals(0.9, double0, 0.01);
      
      highamHall54Integrator0.getOrder();
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.9, 0.9, 10.0, 10.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 0.9);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(500.64814379, 3476.0192110739, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.getMinReduction();
      LinkedList<StepHandler> linkedList0 = new LinkedList<StepHandler>();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-1792.606086892012));
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 2215.583668048495);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(165).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertEquals(330, firstOrderConverter0.getDimension());
      assertNotNull(firstOrderConverter0);
      
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      assertEquals(330, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      assertNotNull(expandableStatefulODE0);
      
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(165, 165, (-498.95568952937), (-498.95568952937));
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(165.0, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(165.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(165.0, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertNotNull(highamHall54Integrator0);
      
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-498.95568952937));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = 1.0;
      double double1 = (-1.0);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1.0, 1.0, 10.0, (-1.0));
      assertEquals(1.0, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(1.0, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(1.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertNotNull(highamHall54Integrator0);
      
      double double2 = highamHall54Integrator0.getMaxGrowth();
      assertEquals(1.0, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(1.0, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(1.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(10.0, double2, 0.01);
      assertNotEquals(double2, double1, 0.01);
      assertNotEquals(double2, double0, 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(212).when(secondOrderDifferentialEquations0).getDimension();
      double[] doubleArray0 = null;
      highamHall54Integrator0.vecRelativeTolerance = null;
      assertEquals(1.0, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(1.0, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(1.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      
      highamHall54Integrator0.scalAbsoluteTolerance = (-2082.33537948334);
      assertEquals(1.0, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(1.0, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(1.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertEquals(424, firstOrderConverter0.getDimension());
      assertNotNull(firstOrderConverter0);
      
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      assertEquals(424, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      assertNotNull(expandableStatefulODE0);
      
      expandableStatefulODE0.setTime(10.0);
      assertEquals(424, firstOrderConverter0.getDimension());
      assertEquals(10.0, expandableStatefulODE0.getTime(), 0.01);
      
      double double3 = highamHall54Integrator0.getMaxGrowth();
      assertEquals(1.0, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(1.0, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(1.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(10.0, double3, 0.01);
      assertNotEquals(double3, double1, 0.01);
      assertEquals(double3, double2, 0.01);
      assertNotEquals(double3, double0, 0.01);
      
      double[] doubleArray1 = expandableStatefulODE0.getCompleteState();
      assertEquals(424, firstOrderConverter0.getDimension());
      assertEquals(10.0, expandableStatefulODE0.getTime(), 0.01);
      assertNotNull(doubleArray1);
      
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-1.0));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(500.64814379, 3476.0192110739, doubleArray0, doubleArray0);
      assertEquals(1319.1901173835893, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(500.64814379, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(3476.0192110739, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertNotNull(dormandPrince853Integrator0);
      
      double double0 = dormandPrince853Integrator0.getMinReduction();
      assertEquals(1319.1901173835893, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(500.64814379, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(3476.0192110739, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertEquals(0.2, double0, 0.01);
      
      Collection<StepHandler> collection0 = dormandPrince853Integrator0.getStepHandlers();
      assertEquals(1319.1901173835893, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(500.64814379, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(3476.0192110739, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertNotNull(collection0);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertNotNull(firstOrderConverter0);
      
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      assertNotNull(expandableStatefulODE0);
      
      expandableStatefulODE0.setTime(500.64814379);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(500.64814379, expandableStatefulODE0.getTime(), 0.01);
      
      double[] doubleArray1 = expandableStatefulODE0.getCompleteState();
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(500.64814379, expandableStatefulODE0.getTime(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray1, 0.01);
      assertNotNull(doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 302.4);
      assertEquals(1319.1901173835893, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(17, dormandPrince853Integrator0.getEvaluations());
      assertEquals(500.64814379, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(3476.0192110739, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(302.4, expandableStatefulODE0.getTime(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertNotSame(doubleArray0, doubleArray1);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      
      double double1 = dormandPrince853Integrator0.getMaxGrowth();
      assertEquals(1319.1901173835893, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(17, dormandPrince853Integrator0.getEvaluations());
      assertEquals(500.64814379, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(3476.0192110739, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertEquals(10.0, double1, 0.01);
      assertNotSame(doubleArray0, doubleArray1);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertNotEquals(double1, double0, 0.01);
      
      double double2 = dormandPrince853Integrator0.getSafety();
      assertEquals(1319.1901173835893, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(17, dormandPrince853Integrator0.getEvaluations());
      assertEquals(500.64814379, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(3476.0192110739, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertEquals(0.9, double2, 0.01);
      assertNotSame(doubleArray0, doubleArray1);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertNotEquals(double2, double1, 0.01);
      assertNotEquals(double2, double0, 0.01);
      
      dormandPrince853Integrator0.setMaxEvaluations(387);
      assertEquals(1319.1901173835893, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(17, dormandPrince853Integrator0.getEvaluations());
      assertEquals(500.64814379, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(3476.0192110739, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(387, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertNotSame(doubleArray0, doubleArray1);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE1.getTime(), 0.01);
      assertNotNull(expandableStatefulODE1);
      assertFalse(expandableStatefulODE1.equals((Object)expandableStatefulODE0));
      
      int int0 = dormandPrince853Integrator0.getOrder();
      assertEquals(1319.1901173835893, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(17, dormandPrince853Integrator0.getEvaluations());
      assertEquals(500.64814379, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(3476.0192110739, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(387, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertEquals(8, int0);
      assertNotSame(doubleArray0, doubleArray1);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      
      int int1 = dormandPrince853Integrator0.getOrder();
      assertEquals(1319.1901173835893, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(17, dormandPrince853Integrator0.getEvaluations());
      assertEquals(500.64814379, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(3476.0192110739, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(387, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertEquals(8, int1);
      assertNotSame(doubleArray0, doubleArray1);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(500.64814379, 3476.0192110739, doubleArray0, doubleArray0);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(500.64814379, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(3476.0192110739, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(1319.1901173835893, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertNotNull(dormandPrince853Integrator0);
      
      LinkedList<StepHandler> linkedList0 = new LinkedList<StepHandler>();
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertNotNull(firstOrderConverter0);
      
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      assertNotNull(expandableStatefulODE0);
      
      double double0 = dormandPrince853Integrator0.estimateError((double[][]) null, doubleArray0, doubleArray0, 8.0);
      assertEquals(0, dormandPrince853Integrator0.getEvaluations());
      assertEquals(500.64814379, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(3476.0192110739, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(1319.1901173835893, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      
      EquationsMapper[] equationsMapperArray0 = expandableStatefulODE0.getSecondaryMappers();
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(Double.NaN, expandableStatefulODE0.getTime(), 0.01);
      assertNotNull(equationsMapperArray0);
      
      expandableStatefulODE0.setTime(3598.66);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(3598.66, expandableStatefulODE0.getTime(), 0.01);
      
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, 3864.50724423);
      assertEquals(500.64814379, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(3476.0192110739, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(17, dormandPrince853Integrator0.getEvaluations());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(1319.1901173835893, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0, firstOrderConverter0.getDimension());
      assertEquals(3864.50724423, expandableStatefulODE0.getTime(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      
      double double1 = dormandPrince853Integrator0.getMaxGrowth();
      assertEquals(500.64814379, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(3476.0192110739, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(17, dormandPrince853Integrator0.getEvaluations());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(1319.1901173835893, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertEquals(10.0, double1, 0.01);
      assertNotEquals(double1, double0, 0.01);
      
      double[] doubleArray1 = new double[9];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      doubleArray1[0] = 3476.0192110739;
      doubleArray1[1] = (-429.1281);
      doubleArray1[2] = (-429.1281);
      doubleArray1[3] = 2215.583668048495;
      doubleArray1[4] = 803.04814379;
      doubleArray1[5] = 8.0;
      doubleArray1[6] = Double.NaN;
      doubleArray1[7] = (-898.655731418);
      doubleArray1[8] = 8.0;
      double double2 = dormandPrince853Integrator0.estimateError((double[][]) null, doubleArray1, doubleArray0, 3476.0192110739);
      assertEquals(500.64814379, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(3476.0192110739, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(17, dormandPrince853Integrator0.getEvaluations());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(1319.1901173835893, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {3476.0192110739, (-429.1281), (-429.1281), 2215.583668048495, 803.04814379, 8.0, Double.NaN, (-898.655731418), 8.0}, doubleArray1, 0.01);
      assertEquals(Double.NaN, double2, 0.01);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertEquals(double2, double0, 0.01);
      assertNotEquals(double2, double1, 0.01);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      dormandPrince853Integrator0.setSafety((-592.98195927972));
      assertEquals(500.64814379, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(3476.0192110739, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(17, dormandPrince853Integrator0.getEvaluations());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-592.98195927972), dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(1319.1901173835893, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertNotSame(doubleArray0, doubleArray1);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      
      dormandPrince853Integrator0.setMinReduction(1289.271205787);
      assertEquals(500.64814379, dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals(3476.0192110739, dormandPrince853Integrator0.getMaxStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
      assertEquals(17, dormandPrince853Integrator0.getEvaluations());
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-592.98195927972), dormandPrince853Integrator0.getSafety(), 0.01);
      assertEquals(1289.271205787, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals("Dormand-Prince 8 (5, 3)", dormandPrince853Integrator0.getName());
      assertEquals(1319.1901173835893, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertNotSame(doubleArray0, doubleArray1);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
  }
}
