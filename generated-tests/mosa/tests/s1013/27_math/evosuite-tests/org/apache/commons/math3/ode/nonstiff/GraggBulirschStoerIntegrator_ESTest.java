/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 04:39:41 GMT 2018
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.commons.math3.analysis.solvers.RiddersSolver;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepNormalizer;
import org.apache.commons.math3.ode.sampling.StepNormalizerBounds;
import org.apache.commons.math3.ode.sampling.StepNormalizerMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GraggBulirschStoerIntegrator_ESTest extends GraggBulirschStoerIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.129004567861557, 0.129004567861557, 0.129004567861557, 0.129004567861557);
      graggBulirschStoerIntegrator0.setOrderControl(2713, 2713, 2713);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(581, 581, 581, 0.94);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) null, (double) 581, (-100.6), 2);
      graggBulirschStoerIntegrator0.addStepHandler((StepHandler) null);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(9.739345931419228E280, 9.739345931419228E280, 563, 0.3070250153541565);
      graggBulirschStoerIntegrator0.setControlFactors(0.3070250153541565, (-198.47765818), 563, 0.3070250153541565);
      graggBulirschStoerIntegrator0.addStepHandler((StepHandler) null);
      assertEquals(9.739345931419228E280, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.3070250153541565, 502.473, (-955.6078138952), (-955.6078138952));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      graggBulirschStoerIntegrator0.setControlFactors((-955.6078138952), 502.473, 1754.349414, 10.0);
      assertEquals(0.3070250153541565, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.3070250153541565, 563, 0.3070250153541565, 563);
      graggBulirschStoerIntegrator0.setInitialStepSize(563);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(563).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.setControlFactors((-1.0), (-1.0), 0.65, 0.17431432008743286);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2487.0, 2487.0, 2487.0, 1259.6447858724);
      graggBulirschStoerIntegrator0.scalRelativeTolerance = 0.5;
      graggBulirschStoerIntegrator0.scalAbsoluteTolerance = 2487.0;
      graggBulirschStoerIntegrator0.setControlFactors((-1685.5), (-1685.5), 1259.6447858724, 2487.0);
      assertEquals(Integer.MAX_VALUE, graggBulirschStoerIntegrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.3070250153541565, 563, 0.3070250153541565, 563);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (double) 563);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-2290.52994976057), (-2290.52994976057), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 643);
      assertEquals(2290.52994976057, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, 0.0, 0.0, 130.941);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 1);
      graggBulirschStoerIntegrator0.setOrderControl(0, 1014.25950249036, 562.74917476);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1620.2498220819773, 1.3152074173459994E-8, 0.0, 1.3152074173459994E-8);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.INCREMENT;
      StepNormalizer stepNormalizer0 = new StepNormalizer(0.0, fixedStepHandler0, stepNormalizerMode0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, (-4090), (-1238), (-2602.88040211488));
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1.3152074173459994E-8);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 0.3070250153541565;
      doubleArray0[1] = 0.3070250153541565;
      doubleArray0[2] = 0.3070250153541565;
      doubleArray0[3] = 0.3070250153541565;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.3070250153541565, 0.3070250153541565, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 581, 581, 0.3070250153541565);
      assertEquals(0.3070250153541565, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(9.739345931419228E280, 9.739345931419228E280, 581, 0.3070250153541565);
      RiddersSolver riddersSolver0 = new RiddersSolver(2013.2, 2013.2);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 30, 27, 27);
      assertEquals(9.739345931419228E280, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.129004567861557, 0.129004567861557, 0.129004567861557, 0.129004567861557);
      graggBulirschStoerIntegrator0.setOrderControl(2736, 2736, 2736);
      assertEquals("Gragg-Bulirsch-Stoer", graggBulirschStoerIntegrator0.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.129004567861557, 0.129004567861557, 0.129004567861557, 0.129004567861557);
      graggBulirschStoerIntegrator0.setOrderControl((-2682), 4.0E-15, 0.129004567861557);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.0, (-1194.0885047), 0.0, 0.0);
      graggBulirschStoerIntegrator0.setOrderControl(4, 0.6, 0.0);
      assertEquals(0.0, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.3070250153541565, 563, 0.3070250153541565, 563);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(563).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      graggBulirschStoerIntegrator0.setControlFactors(933.900689485637, (-198.47765818), 933.900689485637, 563);
      graggBulirschStoerIntegrator0.setControlFactors(0.3070250153541565, 0.5156965255737305, 1.6844747839686189E-9, 948.0);
      assertEquals(0.3070250153541565, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(3776.8938, 3776.8938, 3776.8938, 135.573812853178);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, (-1363));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-2049.905));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1620.2498220819773, 1.3152074173459994E-8, 0.0, 1.3152074173459994E-8);
          SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
          doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
          FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
          ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
          ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
          expandableStatefulODE1.setTime(0.0);
          // Undeclared exception!
          graggBulirschStoerIntegrator0.integrate(expandableStatefulODE1, 999.9);
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1620.2498220819773, 1.3152074173459994E-8, 1.3152074173459994E-8, 1.3152074173459994E-8);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.FIRST;
      StepNormalizer stepNormalizer0 = new StepNormalizer(1.3152074173459994E-8, fixedStepHandler0, stepNormalizerBounds0);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE1.setTime(1620.2498220819773);
      ExpandableStatefulODE expandableStatefulODE2 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE1, (-1937.4284478777467));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minimal step size (1.62E03) reached, integration needs 2.78E-08
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-23.918870961453692), (-23.918870961453692), (-23.918870961453692), (-2745.3151761059544));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(1.3152074173459994E-8);
      double[] doubleArray0 = new double[18];
      doubleArray0[0] = (-2745.3151761059544);
      doubleArray0[1] = (-2745.3151761059544);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1.0E-4);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-2745.3151761059544));
      graggBulirschStoerIntegrator0.setOrderControl(1, 1.0E-4, (-2745.3151761059544));
      ExpandableStatefulODE expandableStatefulODE2 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE2, (-2745.3151761059544));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = (-2745.3151761059544);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(0.3070250153541565, 0.3070250153541565, 0.3070250153541565, (-2745.3151761059544));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.setTime(1.3152074173459994E-8);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-2745.3151761059544);
      doubleArray0[1] = (-2745.3151761059544);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator1 = new GraggBulirschStoerIntegrator(1.3152074173459994E-8, (-277.580711859785), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator1.integrate(expandableStatefulODE0, 1.0E-4);
      ExpandableStatefulODE expandableStatefulODE1 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-2745.3151761059544));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations1 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      FirstOrderConverter firstOrderConverter1 = new FirstOrderConverter(secondOrderDifferentialEquations1);
      ExpandableStatefulODE expandableStatefulODE2 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, double0);
  }
}