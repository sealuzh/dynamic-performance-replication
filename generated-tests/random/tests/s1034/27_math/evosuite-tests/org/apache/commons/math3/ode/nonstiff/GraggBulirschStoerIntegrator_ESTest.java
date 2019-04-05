/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 15:32:31 GMT 2019
 */

package org.apache.commons.math3.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.analysis.solvers.RiddersSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.EquationsMapper;
import org.apache.commons.math3.ode.ExpandableStatefulODE;
import org.apache.commons.math3.ode.FirstOrderConverter;
import org.apache.commons.math3.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math3.ode.events.EventHandler;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerStepInterpolator;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;
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
      double double0 = 1.0E-4;
      double double1 = 1074.081438282903;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-4, 1.0E-4, 1.0E-4, 1074.081438282903);
      int int0 = 1162;
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 1162);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(311).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.clearStepHandlers();
      expandableStatefulODE0.setTime(1162);
      graggBulirschStoerIntegrator0.mainSetDimension = (-2147483647);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 2580.4101414331735);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = (-3118.527945420078);
      double double1 = 2559.285;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3118.527945420078), 1327.9371, 1327.9371, 2559.285);
      graggBulirschStoerIntegrator0.getStepHandlers();
      double double2 = (-2600.0013);
      graggBulirschStoerIntegrator0.setControlFactors((-1495.279563887081), 1873.2436189225, (-2600.0013), 2559.285);
      boolean boolean0 = true;
      int int0 = 508;
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 508);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.getCompleteState();
      expandableStatefulODE0.setTime(1873.2436189225);
      expandableStatefulODE0.setTime((-1141.619158961721));
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1.0);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 508, 508, (-1495.279563887081));
      StepNormalizer stepNormalizer0 = new StepNormalizer((-1257.857), (FixedStepHandler) null);
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = null;
      try {
        graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator((GraggBulirschStoerStepInterpolator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = 1.0E-4;
      double double1 = 1074.081438282903;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-4, 1.0E-4, 1.0E-4, 1074.081438282903);
      int int0 = 1155;
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 1155);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      graggBulirschStoerIntegrator0.clearStepHandlers();
      expandableStatefulODE0.setTime(1155);
      graggBulirschStoerIntegrator0.mainSetDimension = (-2147483647);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 2580.4101414331735);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2.404020521381534E-8, 2.404020521381534E-8, 1507.2875846428262, 1507.2875846428262);
      graggBulirschStoerIntegrator0.resetInternalState();
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.getStepHandlers();
      DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.scalRelativeTolerance = 2.404020521381534E-8;
      graggBulirschStoerIntegrator0.addStepHandler(dummyStepHandler0);
      graggBulirschStoerIntegrator0.getEventHandlers();
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 288);
      graggBulirschStoerIntegrator0.setControlFactors(4.0E-15, 1507.2875846428262, 1507.2875846428262, 2.404020521381534E-8);
      graggBulirschStoerIntegrator0.setControlFactors(2.7279024753382288E76, 1507.2875846428262, 1507.2875846428262, 2.05597910889115E159);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 2.7279024753382288E76);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(316.9063, (-4023.86579), 1940.4256312231, 316.9063);
      graggBulirschStoerIntegrator0.setStepSizeControl(1940.4256312231, (-492.2630415189907), (-1.860165465666482E-10), 1.0E-4);
      graggBulirschStoerIntegrator0.filterStep(6.008604166110734E80, true, true);
      graggBulirschStoerIntegrator0.setStepSizeControl(1.0E-4, (-4023.86579), 10.0, 2721.3936);
      graggBulirschStoerIntegrator0.setControlFactors((-1.860165465666482E-10), (-1394.26659), 1.0E-4, 1.0E-4);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 3, 6, 137.469);
      graggBulirschStoerIntegrator0.setOrderControl(6, (-1164.7402320691), (-2055.008));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 2721.3936);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-67.298), (-67.298), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.getCompleteState();
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-67.298));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 0.6;
      doubleArray0[1] = 0.6;
      doubleArray0[2] = 0.6;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(985.258, 0.6, doubleArray0, doubleArray0);
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      DummyStepHandler.getInstance();
      DummyStepHandler dummyStepHandler1 = DummyStepHandler.getInstance();
      DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.addStepHandler(dummyStepHandler0);
      DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.clearStepHandlers();
      graggBulirschStoerIntegrator0.setMaxEvaluations(7);
      graggBulirschStoerIntegrator0.addStepHandler(dummyStepHandler1);
      graggBulirschStoerIntegrator0.setControlFactors((-1285.6742033), (-2976.0), (-2252.05), 316.9063);
      graggBulirschStoerIntegrator0.setOrderControl(1159, (-1403.0), 0.0);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 4187.44028115;
      doubleArray0[1] = 4187.44028115;
      doubleArray0[2] = 4187.44028115;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4187.44028115, 4187.44028115, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setControlFactors(0.4818955063819885, 0.4818955063819885, 4187.44028115, 4187.44028115);
      graggBulirschStoerIntegrator0.resetInternalState();
      graggBulirschStoerIntegrator0.setMaxEvaluations((-2144218556));
      graggBulirschStoerIntegrator0.setControlFactors(4187.44028115, 4187.44028115, 10.0, 10.0);
      graggBulirschStoerIntegrator0.setControlFactors(1.0E-4, 4295.197982799033, 4187.44028115, 4187.44028115);
      graggBulirschStoerIntegrator0.setControlFactors(10.0, 4187.44028115, 4187.44028115, 1.0E-4);
      graggBulirschStoerIntegrator0.setOrderControl((-1415), 0.4818955063819885, 4187.44028115);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(316.9063, (-4023.86579), 1940.4256312231, 316.9063);
      graggBulirschStoerIntegrator0.setStepSizeControl(1940.4256312231, (-492.2630415189907), (-1.860165465666482E-10), 1.0E-4);
      graggBulirschStoerIntegrator0.filterStep(6.008604166110734E80, true, true);
      graggBulirschStoerIntegrator0.setStepSizeControl(1.0E-4, (-4023.86579), 10.0, 2721.3936);
      graggBulirschStoerIntegrator0.setControlFactors((-1.860165465666482E-10), (-1394.26659), 1.0E-4, 1.0E-4);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 3, 6, 137.469);
      graggBulirschStoerIntegrator0.setOrderControl(6, (-1164.7402320691), (-2055.008));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 2721.3936);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1247.75326767666, (-814.517), (-814.517), (-1568.8));
      graggBulirschStoerIntegrator0.setOrderControl((-3909), (-814.517), 0.5);
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-4, 1.0E-4, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.vecRelativeTolerance = doubleArray0;
      graggBulirschStoerIntegrator0.setOrderControl(458, 1.0E-4, 458);
      RiddersSolver riddersSolver0 = new RiddersSolver(675.214270551151, 1.2493696959436675E-93);
      graggBulirschStoerIntegrator0.addEventHandler((EventHandler) null, (-399.8997902435005), 1.0E-4, 458, (UnivariateSolver) riddersSolver0);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-4726.078225);
      doubleArray0[1] = (-435.6);
      doubleArray0[2] = (-435.6);
      doubleArray0[3] = (-1981.257716806);
      doubleArray0[4] = (-1981.257716806);
      doubleArray0[5] = (-435.6);
      doubleArray0[6] = 1.447904348373413;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-435.6), (-1981.257716806), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 597.292592471067);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 != 7
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-8.316530604593264E105);
      doubleArray0[1] = (-8.316530604593264E105);
      doubleArray0[2] = (-8.316530604593264E105);
      doubleArray0[3] = (-8.316530604593264E105);
      doubleArray0[4] = (-8.316530604593264E105);
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-8.316530604593264E105), (-8.316530604593264E105), doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.mainSetDimension = 0;
      double double0 = 0.0;
      graggBulirschStoerIntegrator0.setControlFactors((-2550.48993989), 0.0, (-8.316530604593264E105), (-8.316530604593264E105));
      boolean boolean0 = true;
      int int0 = 2799;
      graggBulirschStoerIntegrator0.setStabilityCheck(true, (-609), 2799, (-8.316530604593264E105));
      int int1 = 2418;
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 2418);
      graggBulirschStoerIntegrator0.vecAbsoluteTolerance = doubleArray0;
      ExpandableStatefulODE expandableStatefulODE0 = null;
      // Undeclared exception!
      try { 
        graggBulirschStoerIntegrator0.integrate((ExpandableStatefulODE) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 8.349390727162016E-202;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(8.349390727162016E-202, 8.349390727162016E-202, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 809);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 809);
      assertEquals(8.349390727162016E-202, graggBulirschStoerIntegrator0.getMinStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(370.13549865227, (-107.32320245), 370.13549865227, (-1100.037));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      // Undeclared exception!
      graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, (-1100.037));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1168.3351221611024, 1168.3351221611024, 1168.3351221611024, (-117.754));
      DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
      DummyStepHandler.getInstance();
      graggBulirschStoerIntegrator0.addStepHandler(dummyStepHandler0);
      graggBulirschStoerIntegrator0.setControlFactors((-117.754), (-117.754), 1168.3351221611024, 0.8);
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerBounds stepNormalizerBounds0 = StepNormalizerBounds.FIRST;
      StepNormalizer stepNormalizer0 = new StepNormalizer(0.8, fixedStepHandler0, stepNormalizerBounds0);
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      graggBulirschStoerIntegrator0.setOrderControl(342, (-514.869032), (-117.754));
      graggBulirschStoerIntegrator0.addStepHandler(stepNormalizer0);
      assertEquals(1168.3351221611024, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-409.05871376332), (-409.05871376332), 0.9999, 0.9999);
      graggBulirschStoerIntegrator0.setOrderControl((-210), 4.0, (-409.05871376332));
      graggBulirschStoerIntegrator0.setInterpolationControl(false, (-210));
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 4);
      assertEquals(409.05871376332, graggBulirschStoerIntegrator0.getMaxStep(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0E-15, 0.22704219818115234, 0.22704219818115234, 1.0E-15);
      graggBulirschStoerIntegrator0.setOrderControl(1162, 10.0, 1878.42458306472);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-387.7265168732133);
      graggBulirschStoerIntegrator0.setStepSizeControl((-387.7265168732133), 0.22704219818115234, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 1162, 1162, 1162);
      graggBulirschStoerIntegrator0.setControlFactors((-3.411186219855533E217), (-987.89774), 8.0E298, (-387.7265168732133));
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 1162, (-1001), (-158.32164045));
      graggBulirschStoerIntegrator0.setOrderControl(1162, 1162, 4.0E-15);
      graggBulirschStoerIntegrator0.setInterpolationControl(false, 19);
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1.0001;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.0001, 1.0001, doubleArray0, doubleArray0);
      double double0 = 0.13243216276168823;
      graggBulirschStoerIntegrator0.setControlFactors(1.0001, 0.13243216276168823, (-1110.264411277908), 1.0001);
      double double1 = 347.0;
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizerMode stepNormalizerMode0 = StepNormalizerMode.MULTIPLES;
      StepNormalizer stepNormalizer0 = new StepNormalizer(347.0, fixedStepHandler0, stepNormalizerMode0);
      double[][] doubleArray1 = new double[9][0];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      doubleArray1[6] = doubleArray0;
      doubleArray1[7] = doubleArray0;
      doubleArray1[8] = doubleArray0;
      EquationsMapper equationsMapper0 = new EquationsMapper(2913, 2913);
      EquationsMapper[] equationsMapperArray0 = new EquationsMapper[6];
      equationsMapperArray0[0] = equationsMapper0;
      equationsMapperArray0[1] = equationsMapper0;
      equationsMapperArray0[2] = equationsMapper0;
      equationsMapperArray0[3] = equationsMapper0;
      equationsMapperArray0[4] = equationsMapper0;
      equationsMapperArray0[5] = equationsMapper0;
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true, equationsMapper0, equationsMapperArray0);
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator1 = new GraggBulirschStoerStepInterpolator(graggBulirschStoerStepInterpolator0);
      StepInterpolator stepInterpolator0 = graggBulirschStoerStepInterpolator1.doCopy();
      // Undeclared exception!
      try { 
        stepNormalizer0.handleStep(stepInterpolator0, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double double0 = (-3118.527945420078);
      double double1 = 2580.4101414331735;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-3118.527945420078), 1327.9371, 1327.9371, 2580.4101414331735);
      graggBulirschStoerIntegrator0.getStepHandlers();
      double double2 = (-1495.279563887081);
      double double3 = (-2600.0013);
      graggBulirschStoerIntegrator0.setControlFactors((-1495.279563887081), 1873.2436189225, (-2600.0013), 2580.4101414331735);
      int int0 = 508;
      graggBulirschStoerIntegrator0.setInterpolationControl(true, 508);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(508).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
      expandableStatefulODE0.getCompleteState();
      expandableStatefulODE0.setTime(1873.2436189225);
      double double4 = (-1141.619158961721);
      expandableStatefulODE0.setTime((-1141.619158961721));
      try { 
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 1.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // minimal step size (3.12E03) reached, integration needs 2.80E03
         //
         verifyException("org.apache.commons.math3.ode.nonstiff.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.7976931348623157E308, 1.7976931348623157E308, (-1756.4), 1318.268242318804);
      graggBulirschStoerIntegrator0.setInterpolationControl(true, (-4217));
      assertEquals(Double.POSITIVE_INFINITY, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-831.4486469), (-831.4486469), 4.267089756924666E-8, 1.4231244750190031E-8);
      graggBulirschStoerIntegrator0.setStabilityCheck(true, 44, 44, (-2788.7806005084385));
      assertEquals(0, graggBulirschStoerIntegrator0.getEvaluations());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.2340981629677117E-4;
      doubleArray0[1] = 1.2340981629677117E-4;
      doubleArray0[2] = 1.2340981629677117E-4;
      doubleArray0[3] = 1.2340981629677117E-4;
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1.2340981629677117E-4, 1.2340981629677117E-4, doubleArray0, doubleArray0);
      graggBulirschStoerIntegrator0.setStabilityCheck(false, 2644, (-2244), 1.2340981629677117E-4);
      StepNormalizer stepNormalizer0 = new StepNormalizer(1.0E-10, (FixedStepHandler) null);
      // Undeclared exception!
      try { 
        stepNormalizer0.init(1.0005602916630382E-271, doubleArray0, 1.2340981629677117E-4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ode.sampling.StepNormalizer", e);
      }
  }
}