/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 04:10:37 GMT 2019
 */

package org.apache.commons.math3.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.BisectionSolver;
import org.apache.commons.math3.analysis.solvers.PegasusSolver;
import org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.SecondaryEquations;
import org.apache.commons.math3.ode.events.EventFilter;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.events.FilterType;
import org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator;
import org.apache.commons.math3.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GillIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math3.ode.nonstiff.LutherIntegrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(8.988361382732908E-9, 2533.535201, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 2533.535201, doubleArray0, 8.988361382732908E-9, (double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 6 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        dormandPrince853Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 3 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(0.0);
      eulerIntegrator0.clearEventHandlers();
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-2.3641341460419062E-7));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, (-2.3641341460419062E-7), doubleArray0);
      // Undeclared exception!
      classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, (-2.3641341460419062E-7), doubleArray0, 0.307829856873, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, Double.NaN, 0.0);
      double double0 = highamHall54Integrator0.getCurrentSignedStepsize();
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(1, 1, 2695.781109348241, doubleArray0, doubleArray0);
      double double0 = adamsMoultonIntegrator0.getCurrentSignedStepsize();
      assertEquals(51.920912061983664, double0, 0.01);
      assertEquals(Integer.MAX_VALUE, adamsMoultonIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator((-529.190997619));
      gillIntegrator0.setMaxEvaluations(0);
      assertEquals(0, gillIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1331.89226), (-1331.89226), doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) null, (-1414.5), doubleArray0, 0.0, doubleArray0);
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
      MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(0.0);
      // Undeclared exception!
      try { 
        midpointIntegrator0.computeDerivatives((-1302.7426502), (double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-806.15515884574), 0.0, doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.computeDerivatives(0.0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator(0.0);
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        lutherIntegrator0.computeDerivatives(949.334913129467, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1785.238090145413, 0.0, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.addStepHandler((StepHandler) null);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(2533.535201);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer((-1913), fixedStepHandler0);
      gillIntegrator0.addStepHandler(stepNormalizer0);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(1849.46408);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 2092.92355812027, 1);
      gillIntegrator0.addEventHandler((EventHandler) eventFilter0, (-1185.953264123), 2.2737367544323206E-10, 1, (UnivariateSolver) regulaFalsiSolver0);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(12.360567175794303, 0.7777777777777778, doubleArray0, doubleArray0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      BisectionSolver bisectionSolver0 = new BisectionSolver((-608.46459166), (-895.638327753815));
      highamHall54Integrator0.addEventHandler((EventHandler) eventFilter0, (-63.0), (-621.2325), 1775, (UnivariateSolver) bisectionSolver0);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(0.0);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(3.9036541111764032E-140, 4109.7468862509, 0.0);
      gillIntegrator0.addEventHandler((EventHandler) null, Double.NaN, 1.8279051206232177E83, 566, (UnivariateSolver) regulaFalsiSolver0);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1, 0.0, (-981.122452731));
      GillIntegrator gillIntegrator0 = new GillIntegrator((-5.36108186384227E-9));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      gillIntegrator0.addEventHandler((EventHandler) eventFilter0, (double) 1, (-309.275162357), 1, (UnivariateSolver) regulaFalsiSolver0);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(1849.46408);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0, 1000.0);
      gillIntegrator0.addEventHandler((EventHandler) eventFilter0, 1.0, 1.0, 0, (UnivariateSolver) regulaFalsiSolver0);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LutherIntegrator lutherIntegrator0 = new LutherIntegrator((-1106.177951));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      PegasusSolver pegasusSolver0 = new PegasusSolver(2417.60827848);
      lutherIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 0.0, 2835, (UnivariateSolver) pegasusSolver0);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, lutherIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, lutherIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator((-5.36108186384227E-9));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      gillIntegrator0.addEventHandler((EventHandler) eventFilter0, (-5.36108186384227E-9), (double) 859, 5976, (UnivariateSolver) null);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(2533.535201);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      PegasusSolver pegasusSolver0 = new PegasusSolver(1282.328170505);
      gillIntegrator0.addEventHandler((EventHandler) eventFilter0, 2533.535201, 1282.328170505, (-134), (UnivariateSolver) pegasusSolver0);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator((-529.190997619));
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      gillIntegrator0.addEventHandler((EventHandler) eventFilter0, 1535.2, 1649.28988, 0);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(121.0073188228, (-10.36823), 801.39700897029, 962.5846128395366);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      dormandPrince853Integrator0.addEventHandler((EventHandler) eventFilter0, (-1.324889724104E12), 0.0, 1660);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.addEventHandler((EventHandler) null, 0.0, (-1131.1114007241924), 1052);
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(0.0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(566).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      try { 
        gillIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 2670.89590364, (double[]) null, (-910.630269), (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(1849.46408);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(538).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      gillIntegrator0.integrate(expandableStatefulODE0, 1849.46408);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-5.36108186384227E-9));
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        classicalRungeKuttaIntegrator0.computeDerivatives((-5.36108186384227E-9), doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-2.3641341460419062E-7));
      classicalRungeKuttaIntegrator0.setMaxEvaluations((-1838));
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-1568.185343426), (-155.0), (-155.0), (-1568.185343426));
      graggBulirschStoerIntegrator0.getEvaluations();
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.692170143127, 0.692170143127, (-484.56), 2092.9236);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 1.0, doubleArray0, 1.0, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // too small integration interval: length = 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.30783);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      
      double[] doubleArray0 = new double[0];
      classicalRungeKuttaIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 2.2737367544323206E-10, doubleArray0, 0.0, doubleArray0);
      assertEquals(Integer.MAX_VALUE, classicalRungeKuttaIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(2533.535201);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      SecondaryEquations secondaryEquations0 = mock(SecondaryEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondaryEquations0).getDimension();
      expandableStatefulODE0.addSecondaryEquations(secondaryEquations0);
      // Undeclared exception!
      gillIntegrator0.integrate(expandableStatefulODE0, 2533.535201);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[5];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2092.92355812027, 182.9163416578, doubleArray1, doubleArray1);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 2092.92355812027, doubleArray0, 9.517570994930463E-138, doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 5 != 0
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(2533.535201);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[0];
      try { 
        gillIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.0, doubleArray0, (double) (-1913), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 2
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(89.9839402);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      FilterType filterType0 = FilterType.TRIGGER_ONLY_DECREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      gillIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 89.9839402, (-4946));
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      gillIntegrator0.integrate(expandableStatefulODE0, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-5.36108186384227E-9));
      classicalRungeKuttaIntegrator0.setMaxEvaluations(1230);
      assertEquals(1230, classicalRungeKuttaIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(2533.535201);
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      FilterType filterType0 = FilterType.TRIGGER_ONLY_INCREASING_EVENTS;
      EventFilter eventFilter0 = new EventFilter(eventHandler0, filterType0);
      gillIntegrator0.addEventHandler((EventHandler) eventFilter0, 0.0, 2533.535201, 4276);
      gillIntegrator0.getEventHandlers();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(12.360567175794303, 0.7777777777777778, doubleArray0, doubleArray0);
      highamHall54Integrator0.getName();
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(3110.3119650626, 67.5, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.getStepHandlers();
      assertEquals(Integer.MAX_VALUE, dormandPrince853Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EulerIntegrator eulerIntegrator0 = new EulerIntegrator(0.0);
      double double0 = eulerIntegrator0.getCurrentStepStart();
      assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, eulerIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.30783);
      int int0 = classicalRungeKuttaIntegrator0.getMaxEvaluations();
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      AdamsBashforthIntegrator adamsBashforthIntegrator0 = new AdamsBashforthIntegrator(5, 0.0, 0.0, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      adamsBashforthIntegrator0.integrate(expandableStatefulODE0, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GillIntegrator gillIntegrator0 = new GillIntegrator(1849.46408);
      gillIntegrator0.clearStepHandlers();
      assertEquals(Double.NaN, gillIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, gillIntegrator0.getMaxEvaluations());
      assertEquals(Double.NaN, gillIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.692170143127, 0.692170143127, (-484.56), 2092.9236);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 0.692170143127, doubleArray0, 1.0, doubleArray0);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }
}