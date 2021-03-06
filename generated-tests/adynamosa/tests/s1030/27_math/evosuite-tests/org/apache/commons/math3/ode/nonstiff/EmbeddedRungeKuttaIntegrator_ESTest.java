/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 00:01:01 GMT 2019
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
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.setSafety(-0.0);
      double double0 = dormandPrince853Integrator0.getSafety();
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 1.0, doubleArray0, doubleArray0);
      highamHall54Integrator0.setSafety((-1.1660424775832058E-7));
      double double0 = highamHall54Integrator0.getSafety();
      assertEquals((-1.1660424775832058E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2727.6476356135), (-2727.6476356135), (-2727.6476356135), (-2727.6476356135));
      dormandPrince54Integrator0.getOrder();
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-302.2065457), (-302.2065457), doubleArray0, doubleArray0);
      dormandPrince54Integrator0.setMinReduction((-302.2065457));
      double double0 = dormandPrince54Integrator0.getMinReduction();
      assertEquals((-302.2065457), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-524.52123), 262.019028, 262.019028, (-167.350553864337));
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      
      dormandPrince54Integrator0.setMaxGrowth((-167.350553864337));
      double double0 = dormandPrince54Integrator0.getMaxGrowth();
      assertEquals((-167.350553864337), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(10.0, 10.0, doubleArray0, doubleArray0);
      assertEquals(0.9, dormandPrince853Integrator0.getSafety(), 0.01);
      
      dormandPrince853Integrator0.setSafety(10.0);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1.0, 1.0, doubleArray0, doubleArray0);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      
      dormandPrince54Integrator0.setMinReduction(0.0);
      double double0 = dormandPrince54Integrator0.getMinReduction();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.9, (-5.718749537552229E-8), (-219.476806851747), (-5.718749537552229E-8));
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      
      dormandPrince853Integrator0.setMaxGrowth(0.0);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-1896.8768), 2508.266, 1969.88401288127, 10.0);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
      
      dormandPrince853Integrator0.setMaxGrowth(1.5655577182769775);
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1031.9849410165084, 0.9, 1031.9849410165084, 1031.9849410165084);
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
  public void test10()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2390), 1414.63003041015, (-381.82928277263017), (-2390));
      dormandPrince54Integrator0.setMaxEvaluations(1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(0.0);
      try { 
        dormandPrince54Integrator0.integrate(expandableStatefulODE0, 1414.63003041015);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2390), 1414.63003041015, (-381.82928277263017), (-2390));
      dormandPrince54Integrator0.setMaxEvaluations(1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        dormandPrince54Integrator0.integrate(expandableStatefulODE0, 1414.63003041015);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state: maximal count (1) exceeded
         //
         verifyException("org.apache.commons.math3.util.Incrementor$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-13.09473186291), (-13.09473186291), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        dormandPrince853Integrator0.integrate(expandableStatefulODE0, 1155.846107179);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 2
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2727.6476356135), (-2727.6476356135), (-2727.6476356135), (-2727.6476356135));
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.integrate((ExpandableStatefulODE) null, (-2727.6476356135));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.setMinReduction(1301.1889786670815);
      assertEquals(1301.1889786670815, dormandPrince853Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2727.6476356135), (-2727.6476356135), (-2727.6476356135), (-2727.6476356135));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(50).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(1.7407497662694827E-295);
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 636.5448091342219);
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, (-2727.6476356135));
      assertEquals((-2727.6476356135), expandableStatefulODE0.getTime(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2727.6476356135), (-2727.6476356135), (-2727.6476356135), (-2727.6476356135));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(50).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      dormandPrince54Integrator0.setStepSizeControl(0.0, (-789.785472450023), (-2727.6476356135), 0.0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-2727.6476356135));
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 636.5448091342219);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2727.6476356135), (-2727.6476356135), (-2727.6476356135), (-2727.6476356135));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(50).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime((-2727.6476356135));
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 636.5448091342219);
      assertEquals(636.5448091342219, expandableStatefulODE0.getTime(), 0.01);
      assertEquals(14, dormandPrince54Integrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, (-2390), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, (-8.596317424137734));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, (-2390), doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getMinReduction();
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(0.2, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, (-2390), doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getSafety();
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, double0, 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-524.52123), 262.019028, 262.019028, (-167.350553864337));
      double double0 = dormandPrince54Integrator0.getMaxGrowth();
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(10.0, double0, 0.01);
  }
}
