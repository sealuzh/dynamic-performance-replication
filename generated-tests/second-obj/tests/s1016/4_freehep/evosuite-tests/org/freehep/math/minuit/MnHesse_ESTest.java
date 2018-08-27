/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:55:28 GMT 2018
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
import org.freehep.math.minuit.MnAlgebraicSymMatrix;
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
      MnHesse mnHesse0 = new MnHesse((-680));
      double double0 = mnHesse0.tolerstp();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(2795);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 2795;
      doubleArray0[1] = (double) 2795;
      doubleArray0[2] = (double) 2795;
      doubleArray0[3] = (double) 2795;
      doubleArray0[4] = (double) 2795;
      doubleArray0[5] = (double) 2795;
      doubleArray0[6] = (double) 2795;
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance(2795);
      // Undeclared exception!
      try { 
        mnHesse0.calculate((FCNBase) null, doubleArray0, mnUserCovariance0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserParameterState", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((MnStrategy) null);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnHesse", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((MnStrategy) null);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.343122719388148E-13).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.Numerical2PGradientCalculator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0).when(fCNBase0).valueOf(any(double[].class));
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      MnHesse mnHesse0 = new MnHesse();
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, mnUserCovariance0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, mnUserCovariance0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((-1657));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameters mnUserParameters1 = mnUserParameters0.clone();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(868.9484547339001, (-2386.2160323)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-35));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      mnStrategy0.setGradientNCycles((-35));
      mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-35));
      double double0 = mnHesse0.tolerg2();
      assertEquals(0.02, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(100);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 100);
      MinimumParameters minimumParameters0 = new MinimumParameters(5);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 100, 2);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 572);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(22);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)22).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 22;
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      mnUserParameters0.clone();
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 7.06036974759569E-5);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2869);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 22);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(2869);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix1 = mnAlgebraicSymMatrix0.clone();
      MinimumError.MnInvertFailed minimumError_MnInvertFailed0 = new MinimumError.MnInvertFailed();
      MinimumError minimumError0 = new MinimumError(mnAlgebraicSymMatrix1, minimumError_MnInvertFailed0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 22, (-128));
      MnUserTransformation mnUserTransformation0 = mnUserParameters0.trafo();
      mnUserTransformation0.clone();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 22);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameters have invalid size
         //
         verifyException("org.freehep.math.minuit.InitialGradientCalculator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-35));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-25.07165239421721), (-25.07165239421721), 1.0037049213810232E-25, 805.6478, (double)(-35)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      mnStrategy0.setGradientNCycles((-35));
      mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, 2138612834);
      mnStrategy0.setHessianStepTolerance((-25.07165239421721));
      MnHesse mnHesse1 = new MnHesse();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MinimumState minimumState0 = new MinimumState(2138612834);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(6);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      mnHesse0.tolerg2();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(45.81954679989908, 0.02, (double)6, 45.81954679989908, 0.3).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 6;
      doubleArray0[1] = (double) 6;
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = 0.02;
      doubleArray1[1] = (double) 6;
      doubleArray1[2] = 0.02;
      doubleArray1[3] = (double) 6;
      doubleArray1[4] = (double) 6;
      doubleArray1[5] = 0.02;
      doubleArray1[6] = 0.02;
      doubleArray1[7] = (double) 6;
      doubleArray1[8] = 0.02;
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray1);
      MnUserParameters mnUserParameters1 = mnUserParameters0.clone();
      mnStrategy0.setHessianNCycles((-128));
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance((-128));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters1, mnUserCovariance0, (-2146401331));
      assertEquals(45.81954679989908, mnUserParameterState0.fval(), 0.01);
      assertEquals(12, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.2188197508434996E-4, 0.008270000000000003, 2.2188197508434996E-4, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnStrategy mnStrategy0 = new MnStrategy((-456));
      mnStrategy0.setGradientStepTolerance(1001.1);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1120.2472405399851);
      MinimumState minimumState0 = new MinimumState(2645);
      double[] doubleArray0 = new double[15];
      doubleArray0[0] = (double) 2645;
      doubleArray0[1] = (double) 2645;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      mnFcn0.theNumCall = 2645;
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation(doubleArray0, doubleArray0);
      mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation1, (-32));
      mnHesse0.tolerg2();
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      mnUserParameters0.trafo();
      MinimumState minimumState1 = null;
      try {
        minimumState1 = new MinimumState((-456));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-35));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      double[] doubleArray0 = new double[4];
      mnStrategy0.setGradientNCycles((-35));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0037049213810232E-25, 1.0E-6, (-1163.5236895), (-25.072), (double)2138612834).when(fCNBase0).valueOf(any(double[].class));
      mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-35));
      double double0 = new Double((-1163.5236895));
      mnHesse0.ncycles();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase1, 315.61800968953736);
      MinimumState minimumState0 = new MinimumState(2138612834);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(3867.744296, 314.54669, 1864.903654734586, 1864.903654734586, 1864.903654734586).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      MnHesse mnHesse1 = new MnHesse(mnStrategy0);
      mnStrategy0.setGradientNCycles((-953));
      mnStrategy0.setHessianStepTolerance(2138612834);
      mnHesse1.calculate(fCNBase0, doubleArray0, doubleArray0, 4115);
      MnHesse mnHesse2 = new MnHesse();
      mnHesse2.tolerg2();
      int int0 = mnHesse0.ncycles();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-35));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      mnStrategy0.setHessianNCycles((-2146777948));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-25.07165239421721), (-25.07165239421721), 1.0037049213810232E-25, 805.6478, 1087.0436556).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      mnStrategy0.setGradientNCycles((-35));
      mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, 2138612834);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 1087.0436556;
      MnUserCovariance mnUserCovariance0 = null;
      try {
        mnUserCovariance0 = new MnUserCovariance(doubleArray1, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Inconsistent arguments
         //
         verifyException("org.freehep.math.minuit.MnUserCovariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-35));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      double[] doubleArray0 = new double[4];
      mnStrategy0.setGradientNCycles((-35));
      mnStrategy0.setHessianStepTolerance((-25.072));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0037049213810232E-25, 805.6478, (-1163.5236895), (-25.072), (double)2138612834).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-35));
      mnHesse0.tolerg2();
      MnUserParameterState mnUserParameterState1 = new MnUserParameterState();
      assertFalse(mnUserParameterState1.equals((Object)mnUserParameterState0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-35));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      double[] doubleArray0 = new double[3];
      mnStrategy0.setGradientNCycles((-35));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0037049213810232E-25, 805.6478, (-1163.5236895), (-25.072), (double)2138612857).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      mnUserParameters0.add("Minos # of function calls: %d\n", 1.0964715843920019E-16, 0.0, 1086.0, (-1.317247653312773E7));
      mnHesse0.calculate(fCNBase0, mnUserParameters0, (-35));
      mnStrategy0.setGradientNCycles(0);
      MnStrategy mnStrategy1 = new MnStrategy();
      mnStrategy1.setGradientNCycles(525);
      mnStrategy1.setHessianGradientNCycles(7);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      mnHesse0.calculate(fCNBase1, doubleArray0, doubleArray0, 7);
      mnHesse0.tolerg2();
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase2).valueOf(any(double[].class));
      mnHesse0.calculate(fCNBase2, doubleArray0, doubleArray0, (-35754));
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      assertFalse(mnUserParameterState0.hasCovariance());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-35));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-25.1), (-25.1), 1.0037049213810232E-25, 805.6478, 1087.0436556).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      mnStrategy0.setGradientNCycles((-35));
      mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, 2138612834);
      mnStrategy0.setHessianStepTolerance((-25.1));
      MnHesse mnHesse1 = new MnHesse();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-477.5673037315802), (double)2138612834, (double)(-35), (-477.5673037315802), (-477.5673037315802)).when(fCNBase1).valueOf(any(double[].class));
      mnHesse1.calculate(fCNBase1, doubleArray0, doubleArray0, 2136445347);
      mnStrategy0.setHessianStepTolerance(2138612834);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)2138612834, 4.0E-7, 0.51, 10000.0, (-1262.0174292969)).when(fCNBase2).valueOf(any(double[].class));
      mnUserParameters0.add((String) null, 805.6478, 1087.0436556, 2963.87688704, 1.0964715843920019E-16);
      mnHesse1.calculate(fCNBase2, mnUserParameters0, (-1));
      mnStrategy0.setGradientNCycles(2138612834);
      mnStrategy0.setGradientNCycles(765);
      assertEquals(0.02, mnStrategy0.hessianG2Tolerance(), 0.01);
  }
}