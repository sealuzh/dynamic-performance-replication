/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 17:21:42 GMT 2018
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
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
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
  public void test01()  throws Throwable  {
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
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
  public void test02()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, doubleArray0, (MnUserCovariance) null);
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
      MnHesse mnHesse0 = new MnHesse();
      double double0 = mnHesse0.tolerstp();
      assertEquals(0.3, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, 1058);
      assertEquals(42, mnUserParameterState0.nfcn());
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      // Undeclared exception!
      try { 
        mnHesse0.calculate((FCNBase) null, (double[]) null, (double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserTransformation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((-1651));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) (-1651);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      assertEquals(16, mnUserParameterState0.nfcn());
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, (MnUserCovariance) null);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
      assertEquals(18, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, (MnUserCovariance) null, 2141239846);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserParameterState", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      double double0 = mnHesse0.tolerg2();
      assertEquals(0.05, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-2232));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.0E-35;
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-2232));
      assertEquals(66, mnUserParameterState0.nfcn());
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)2, (double)2, 36.005347433037585, (double)2, 36.005347433037585).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 2;
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, 2);
      assertEquals(2.0, mnUserParameterState0.fval(), 0.01);
      assertEquals(28, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(26);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 26);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(5);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 0.1);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(3);
      MinimumError.MnMadePosDef minimumError_MnMadePosDef0 = new MinimumError.MnMadePosDef();
      MinimumError minimumError0 = new MinimumError(mnAlgebraicSymMatrix0, minimumError_MnMadePosDef0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 1835.859341276948, 3);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnUserTransformation mnUserTransformation1 = mnUserTransformation0.clone();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation1, 2147481754);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameters have invalid size
         //
         verifyException("org.freehep.math.minuit.InitialGradientCalculator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-270.33173560448756), (-270.33173560448756), (-270.33173560448756), 1086.8778475370048, 0.0).when(fCNBase0).valueOf(any(double[].class));
      mnStrategy0.setHessianNCycles((-1827));
      double[] doubleArray0 = new double[3];
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      MnHesse mnHesse1 = new MnHesse(mnStrategy0);
      // Undeclared exception!
      mnHesse1.calculate(fCNBase0, doubleArray0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientNCycles((-1781));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-270.33173560448756), (-270.33173560448756), (-270.33173560448756), 1031.0375133905957).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-1781));
      assertEquals(4, mnUserParameterState0.nfcn());
      assertEquals((-270.33173560448756), mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientNCycles((-1781));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-270.33173560448756), (-270.33173560448756), (-270.33173560448756), 1086.8778475370048, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1086.8778475370048;
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-1781));
      assertEquals((-270.33173560448756), mnUserParameterState0.fval(), 0.01);
      assertEquals(12, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientNCycles((-1781));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-270.33173560448756), (-270.33173560448756), (-270.33173560448756), 1030.0117237571424, 0.0).when(fCNBase0).valueOf(any(double[].class));
      mnStrategy0.setHessianStepTolerance((-1781));
      double[] doubleArray0 = new double[3];
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-1781));
      assertEquals(8, mnUserParameterState0.nfcn());
      assertEquals((-270.33173560448756), mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientNCycles((-1781));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-270.33173560448756), (-270.33173560448756), (-270.33173560448756), 1031.0375133905957, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      assertEquals(17, mnUserParameterState0.nfcn());
      assertEquals((-270.33173560448756), mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-270.33173560448756), (-270.33173560448756), (-270.33173560448756), 1086.8778475370048, 2515.9152433192735).when(fCNBase0).valueOf(any(double[].class));
      mnStrategy0.setHessianNCycles((-1827));
      double[] doubleArray0 = new double[1];
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      MnHesse mnHesse1 = new MnHesse(mnStrategy0);
      MnUserParameterState mnUserParameterState0 = mnHesse1.calculate(fCNBase0, doubleArray0, doubleArray0);
      assertEquals((-270.33173560448756), mnUserParameterState0.fval(), 0.01);
      assertEquals(12, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(2020949079);
      mnHesse0.tolerstp();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      mnUserParameters0.errors();
      mnUserParameters0.add("MnHesse: matrix is not pos. def.!", 0.1, 0.1, 10.0, (-1043.598412535));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, 179);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
      assertEquals(16, mnUserParameterState0.nfcn());
  }
}