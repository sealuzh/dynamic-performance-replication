/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 16:09:34 GMT 2018
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmbeddedRungeKuttaIntegrator_ESTest extends EmbeddedRungeKuttaIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-1.0), 0.0, (-1201.047154), 1590.250359188664);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      dormandPrince54Integrator0.addEventHandler((EventHandler) eventFilter0, (-1023.55163), (-9.35292435884448), 985, (UnivariateSolver) null);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1590.250359188664;
      dormandPrince54Integrator0.vecRelativeTolerance = doubleArray0;
      double double0 = dormandPrince54Integrator0.getMaxGrowth();
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 2431.153480766;
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(2431.153480766, 0.2, doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getMinReduction();
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(0.2, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = (-1073.4634575);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2923.24415423136), (-2923.24415423136), (-1073.4634575), (-2923.24415423136));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, (-2923.24415423136));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-2.2239222395888823E-8);
      doubleArray0[1] = (-2.2239222395888823E-8);
      doubleArray0[2] = (-2.2239222395888823E-8);
      doubleArray0[3] = (-2.2239222395888823E-8);
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-2.2239222395888823E-8), (-2.2239222395888823E-8), doubleArray0, doubleArray0);
      dormandPrince853Integrator0.resetInternalState();
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2.2239222395888823E-8), (-2.2239222395888823E-8), (-2.2239222395888823E-8), 2227.2);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(0.2);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, 1155.0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 0.49999999999999994;
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.49999999999999994, 0.0, 0.49999999999999994, 489.8);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(secondOrderDifferentialEquations0).getDimension();
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1245.799344, 1245.799344, 0.9, 0.0);
      dormandPrince853Integrator0.getSafety();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations1 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(secondOrderDifferentialEquations1).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations1);
      FirstOrderConverter firstOrderConverter1 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter1);
      expandableStatefulODE0.getTotalDimension();
      expandableStatefulODE0.setTime(10.0);
      dormandPrince853Integrator0.integrate(expandableStatefulODE0, (-1.0));
      assertEquals(0.2, dormandPrince853Integrator0.getMinReduction(), 0.01);
      assertEquals(10.0, dormandPrince853Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.2, 0.2, (-3007.81095131), (-3090.107159566057));
      dormandPrince853Integrator0.setMinReduction((-2.2239222395888823E-8));
      DormandPrince853Integrator dormandPrince853Integrator1 = new DormandPrince853Integrator((-3234.8), (-3090.107159566057), 231.058964, 0.0);
      dormandPrince853Integrator1.getSafety();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(104).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations1 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(104).when(secondOrderDifferentialEquations1).getDimension();
      FirstOrderConverter firstOrderConverter1 = new FirstOrderConverter(secondOrderDifferentialEquations1);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(0.9);
      // Undeclared exception!
      dormandPrince853Integrator1.integrate(expandableStatefulODE0, 2295.48716161);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double double0 = 370.5;
      double double1 = 2362.658;
      double double2 = 938.12;
      double double3 = (-2858.68821);
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(370.5, 2362.658, 938.12, (-2858.68821));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      highamHall54Integrator0.integrate(expandableStatefulODE0, 1377.28595);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-2203.07);
      doubleArray0[1] = (-2203.07);
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-2203.07), (-2203.07), doubleArray0, doubleArray0);
      dormandPrince853Integrator0.clearEventHandlers();
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      DummyStepHandler.getInstance();
      DummyStepHandler.getInstance();
      DummyStepHandler.getInstance();
      dormandPrince853Integrator0.addStepHandler(dummyStepHandler0);
      dormandPrince853Integrator0.resetInternalState();
      DormandPrince853Integrator dormandPrince853Integrator1 = new DormandPrince853Integrator(1.3880166914480165E260, (-2203.07), (-2203.07), 0.9);
      dormandPrince853Integrator0.resetInternalState();
      dormandPrince853Integrator0.setMinReduction(0.0);
      dormandPrince853Integrator1.getSafety();
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(2464, (-1235.799344), doubleArray0, doubleArray0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      dormandPrince54Integrator0.integrate(expandableStatefulODE0, (-725.93185));
  }
}