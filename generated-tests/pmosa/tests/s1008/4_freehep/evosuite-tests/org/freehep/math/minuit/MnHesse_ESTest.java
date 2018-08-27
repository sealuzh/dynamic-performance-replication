/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 12:23:14 GMT 2018
 */

package org.freehep.math.minuit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.freehep.math.minuit.FCNBase;
import org.freehep.math.minuit.FunctionGradient;
import org.freehep.math.minuit.MinimumError;
import org.freehep.math.minuit.MinimumParameters;
import org.freehep.math.minuit.MinimumState;
import org.freehep.math.minuit.MnAlgebraicVector;
import org.freehep.math.minuit.MnFcn;
import org.freehep.math.minuit.MnHesse;
import org.freehep.math.minuit.MnStrategy;
import org.freehep.math.minuit.MnUserCovariance;
import org.freehep.math.minuit.MnUserParameterState;
import org.freehep.math.minuit.MnUserParameters;
import org.freehep.math.minuit.MnUserTransformation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnHesse_ESTest extends MnHesse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-260.446560383736);
      doubleArray0[1] = (-1939.8845);
      doubleArray0[2] = (-529.1976635);
      doubleArray0[3] = (-128.0);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
      assertEquals(26, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(998);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 998;
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase1, doubleArray0, doubleArray0, (-30));
      assertEquals(16, mnUserParameterState0.nfcn());
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = (-3540);
      MnStrategy mnStrategy0 = new MnStrategy((-3540));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      mnHesse0.tolerstp();
      mnHesse0.ncycles();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 7;
      FCNBase fCNBase1 = null;
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance((-3540));
      // Undeclared exception!
      try { 
        mnHesse0.calculate((FCNBase) null, doubleArray0, mnUserCovariance0, (-3540));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserParameterState", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(1128);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 1128;
      doubleArray0[1] = (double) 1128;
      doubleArray0[2] = (double) 1128;
      doubleArray0[3] = (double) 1128;
      doubleArray0[4] = (-1.0);
      doubleArray0[5] = (double) 1128;
      doubleArray0[6] = (double) 1128;
      doubleArray0[7] = (double) 1128;
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameters mnUserParameters1 = mnUserParameters0.clone();
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      mnHesse0.calculate(fCNBase0, mnUserParameters1, mnUserCovariance0, 0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase1, 1128.0);
      MinimumState minimumState0 = new MinimumState(3);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, (-178));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = (-1);
      MnHesse mnHesse0 = new MnHesse((-1));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) (-1);
      doubleArray0[1] = (double) (-1);
      doubleArray0[2] = (double) (-1);
      doubleArray0[3] = (double) (-1);
      doubleArray0[4] = (double) (-1);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase1, (-1.0));
      int int1 = 0;
      MinimumState minimumState0 = new MinimumState(0);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation0 = mnUserParameters0.trafo();
      MnUserTransformation mnUserTransformation1 = mnUserTransformation0.clone();
      MnAlgebraicVector mnAlgebraicVector0 = minimumState0.vec();
      MnAlgebraicVector mnAlgebraicVector1 = mnUserTransformation1.transform(mnAlgebraicVector0);
      mnFcn0.valueOf(mnAlgebraicVector1);
      MnUserTransformation mnUserTransformation2 = new MnUserTransformation(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation2, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // parameters are invalid
         //
         verifyException("org.freehep.math.minuit.HessianGradientCalculator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = (-3371);
      MnHesse mnHesse0 = new MnHesse((-3371));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) (-3371);
      doubleArray0[1] = (double) (-3371);
      int int1 = 3;
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance(3);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, doubleArray0, mnUserCovariance0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserParameterState", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      double double0 = mnHesse0.tolerstp();
      assertEquals(0.3, double0, 0.01);
      
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 0.3;
      doubleArray0[1] = 0.3;
      doubleArray0[2] = (-303.1490147);
      doubleArray0[3] = 0.3;
      doubleArray0[4] = 0.3;
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameters mnUserParameters1 = mnUserParameters0.clone();
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance(3248);
      MnUserCovariance mnUserCovariance1 = mnUserCovariance0.clone();
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters1, mnUserCovariance1);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
      assertEquals(30, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, 2.825922983374565, 712.9708, (double)0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      MinimumState minimumState0 = new MinimumState(200);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.5);
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 0);
      assertNotSame(minimumState1, minimumState0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, 2.825922983374565).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      MinimumState minimumState0 = new MinimumState(200);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, (-2356));
      assertNotSame(minimumState1, minimumState0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameters mnUserParameters1 = mnUserParameters0.clone();
      mnUserParameters1.add("", (double) 0, (-2295.46825894), (double) 0, (-2295.46825894));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters1);
      assertEquals(10, mnUserParameterState0.nfcn());
      
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, 83229.09138035588, 83229.09138035588, (-197.9123)).when(fCNBase1).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      MnUserParameterState mnUserParameterState1 = mnHesse0.calculate(fCNBase1, doubleArray0, doubleArray0, (-3115));
      assertEquals(0.0, mnUserParameterState1.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      mnUserParameters0.add("c_", (-4532.551751), 1.7999999999999988E9, 1.7999999999999988E9, 2.0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0);
      assertEquals(10, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 7.480827624318797E-7, 1.0, 0.0, 10000.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameters mnUserParameters1 = mnUserParameters0.clone();
      mnUserParameters1.add("", (double) 0, (-2295.46825894), (double) 0, (-2295.46825894));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters1);
      assertEquals(14, mnUserParameterState0.nfcn());
      
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[2];
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase2).valueOf(any(double[].class));
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 83229.09138035588;
      doubleArray1[1] = (double) 0;
      doubleArray1[2] = 148.1655051009962;
      doubleArray1[3] = (double) 0;
      doubleArray1[4] = 83229.09138035588;
      doubleArray1[5] = (-197.9123);
      MnUserParameterState mnUserParameterState1 = mnHesse0.calculate(fCNBase2, doubleArray0, doubleArray1);
      assertEquals(20, mnUserParameterState1.nfcn());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = 0;
      MnHesse mnHesse0 = new MnHesse(0);
      MnHesse mnHesse1 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, 0.5).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      MnHesse mnHesse2 = new MnHesse((MnStrategy) null);
      MnHesse mnHesse3 = new MnHesse(0);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        mnHesse3.calculate(fCNBase0, mnUserParameters0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (double)0, 712.9708, (double)0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      MinimumState minimumState0 = new MinimumState(200);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.5);
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 200);
      assertNotSame(minimumState1, minimumState0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (double)0, 712.9708, (double)0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      MinimumState minimumState0 = new MinimumState(200);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.5);
      mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 0);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      int int0 = mnHesse0.ncycles();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = 0;
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, 2.825922983374565, 712.9708, (double)0).when(fCNBase0).valueOf(any(double[].class));
      MinimumState minimumState0 = new MinimumState(200);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = 2.825922983374565;
      doubleArray0[2] = (double) 200;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1474.1442));
      mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 200);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnUserParameters0.release(173);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 173, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(48.72093560344865, 7.480827624318797E-7, 1.0, 48.72093560344865, 10000.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameters mnUserParameters1 = mnUserParameters0.clone();
      mnUserParameters1.add("", (double) 0, (-2295.46825894), (double) 0, (-2295.46825894));
      MnHesse mnHesse1 = new MnHesse(mnStrategy0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2295.46825894));
      MinimumState minimumState0 = new MinimumState(4);
      MnUserTransformation mnUserTransformation0 = mnUserParameters1.trafo();
      mnHesse1.calculate(mnFcn0, minimumState0, mnUserTransformation0, 5);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-2295.46825894);
      doubleArray0[1] = (-2295.46825894);
      doubleArray0[2] = (double) 4;
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase1, doubleArray0, doubleArray0);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = 0;
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      mnStrategy0.setGradientNCycles(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 7.480827624318797E-7, 1.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameters mnUserParameters1 = mnUserParameters0.clone();
      mnUserParameters0.setPrecision(1.0);
      mnUserParameters1.add("", (double) 0, (-2295.46825894), (double) 0, (-2295.46825894));
      mnHesse0.calculate(fCNBase0, mnUserParameters1);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[2];
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(7.480827624318797E-7, (-2295.46825894), (double)0, 262.8666390409828, 1.0).when(fCNBase2).valueOf(any(double[].class));
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 83229.09138035588;
      doubleArray1[1] = (double) 0;
      doubleArray1[2] = 148.1655051009962;
      doubleArray1[3] = (double) 0;
      doubleArray1[4] = 83229.09138035588;
      doubleArray1[5] = (-197.9123);
      mnHesse0.calculate(fCNBase2, doubleArray0, doubleArray1);
      FCNBase fCNBase3 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase3, 0);
      int int1 = (-122);
      MnAlgebraicVector mnAlgebraicVector0 = null;
      try {
        mnAlgebraicVector0 = new MnAlgebraicVector((-122));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicVector", e);
      }
  }
}