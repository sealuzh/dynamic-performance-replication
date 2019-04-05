/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 07:54:54 GMT 2019
 */

package org.freehep.math.minuit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
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
      MnStrategy mnStrategy0 = new MnStrategy((-2322));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1463.7309469), (-1463.7309469), (double)(-2322), (-900.17802399), 1.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[8];
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray1, (-2322));
      assertEquals((-1463.7309469), mnUserParameterState0.fval(), 0.01);
      assertEquals(6, mnUserParameterState0.variableParameters());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = 53.0;
      doubleArray0[3] = 10.0;
      mnStrategy0.setHessianNCycles((-1011));
      doubleArray0[4] = 7.598488340534056E27;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(53.0, 1188.7110644801369, 0.1, 8.0, 1.0E-35).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      assertFalse(mnUserParameterState0.hasGlobalCC());
      assertEquals(44, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-2322));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      double double0 = mnHesse0.tolerstp();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(5);
      double double0 = mnHesse0.tolerg2();
      assertEquals(0.02, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      int int0 = mnHesse0.ncycles();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(2);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, mnUserCovariance0, 2);
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
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1984.0, 1984.0, 1984.0, 1984.0, (-1229.639)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      mnStrategy0.setHessianNCycles((-4354));
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      // Undeclared exception!
      mnHesse0.calculate(fCNBase0, mnUserParameters0, 7080);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((-2173));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, (MnUserParameterState) null, (-1250));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnHesse", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(614);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)614, (double)614, 10000.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 614);
      MinimumState minimumState0 = new MinimumState(614);
      double[] doubleArray0 = new double[2];
      mnFcn0.theNumCall = 1327;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 614);
      assertNotSame(minimumState0, minimumState1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(180.45023188806212, 180.45023188806212, 180.45023188806212, 180.45023188806212, (-325.85700347)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = 53.0;
      doubleArray0[3] = 10.0;
      mnStrategy0.setHessianNCycles((-1011));
      doubleArray0[4] = 7.598488340534056E27;
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      assertEquals(180.45023188806212, mnUserParameterState0.fval(), 0.01);
      assertEquals(44, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = 53.0;
      doubleArray0[3] = 10.0;
      mnStrategy0.setHessianNCycles((-1011));
      doubleArray0[4] = 7.598488340534056E27;
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      assertEquals(Double.NaN, mnUserParameterState0.edm(), 0.01);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
      assertEquals(42, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(709);
      mnStrategy0.setLowStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-1841));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(614);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)614, (double)614, 10000.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 614);
      MinimumState minimumState0 = new MinimumState(614);
      double[] doubleArray0 = new double[2];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 614);
      assertFalse(minimumState1.equals((Object)minimumState0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (-729.0), (-729.0), (-729.0), 0.050719369463585975).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      mnUserParameters0.setLowerLimit(0, 10000.0);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, mnUserCovariance0);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
      assertEquals(32, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1147.90757234));
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(5);
      MinimumError.MnNotPosDef minimumError_MnNotPosDef0 = new MinimumError.MnNotPosDef();
      MinimumError minimumError0 = new MinimumError(mnAlgebraicSymMatrix0, minimumError_MnNotPosDef0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(5);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 269.019009619, 5);
      double[] doubleArray0 = new double[9];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameters are invalid
         //
         verifyException("org.freehep.math.minuit.InitialGradientCalculator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, (MnUserCovariance) null, (-128));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserParameterState", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0, 10.0).when(fCNBase0).valueOf(any(double[].class));
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
  public void test17()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-2322));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1463.7309469), (-1463.7309469), (double)(-2322), (-900.17802399), 1.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) (-2322);
      doubleArray0[1] = (double) (-2322);
      doubleArray0[2] = (double) (-2322);
      mnStrategy0.setGradientStepTolerance(1729.954);
      doubleArray0[3] = (-4973.5777901739);
      doubleArray0[4] = (double) (-2322);
      doubleArray0[5] = (double) (-2322);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-2322));
      assertEquals(18, mnUserParameterState0.nfcn());
      assertEquals((-1463.7309469), mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      double[] doubleArray0 = new double[5];
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
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
  public void test19()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(614);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.1, 0.001, 0.001, (double)614, 0.001).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 614);
      MinimumState minimumState0 = new MinimumState(614);
      double[] doubleArray0 = new double[2];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 614);
      assertNotSame(minimumState0, minimumState1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      mnUserParameters0.add("LNF)U.0 BO", (-2806.1782), (-2806.1782), 0.8000000000000002, 1.0);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, 612);
      assertEquals(10, mnUserParameterState0.nfcn());
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }
}