/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 01:33:44 GMT 2018
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
      MnHesse mnHesse0 = new MnHesse(1484);
      double double0 = mnHesse0.tolerstp();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[0];
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
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
  public void test02()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      int int0 = mnHesse0.ncycles();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[2];
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase1, doubleArray0, doubleArray0, (-2238));
      assertEquals(24, mnUserParameterState0.nfcn());
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (double)0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0);
      MinimumParameters minimumParameters0 = new MinimumParameters(3);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 3, (-4937));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameters mnUserParameters1 = mnUserParameters0.clone();
      MnUserTransformation mnUserTransformation0 = mnUserParameters1.trafo();
      MnUserTransformation mnUserTransformation1 = mnUserTransformation0.clone();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation1, 3);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(620.05901, 620.05901, 620.05901, 620.05901, 286.0189769754).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1432.842361019222;
      mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-2319));
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase1, mnUserParameters0);
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
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1432.842361019222;
      doubleArray0[1] = 1810.88;
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-2319));
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
      assertEquals(20, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2000.1035206394145, 2000.1035206394145, 2000.1035206394145, 2000.1035206394145, 2000.1035206394145).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1432.842361019222;
      doubleArray0[1] = 1810.88;
      mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-2319));
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      MnUserCovariance mnUserCovariance1 = mnUserCovariance0.clone();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase1, mnUserParameters0, mnUserCovariance1, 2790);
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
      MnHesse mnHesse0 = new MnHesse();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      double double0 = mnHesse0.tolerg2();
      assertEquals(0.05, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-2008));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      mnStrategy0.setMediumStrategy();
      mnStrategy0.setHessianNCycles((-2008));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 0.00575409848201544;
      mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, 2145366918);
      double double0 = mnHesse0.tolerstp();
      assertEquals(0.3, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (double)0, (double)0, 0.6280597145580444).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      mnStrategy0.setGradientNCycles(0);
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      assertEquals(11, mnUserParameterState0.nfcn());
      
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState1 = mnHesse0.calculate(fCNBase1, doubleArray0, doubleArray0, 0);
      assertEquals(0.0, mnUserParameterState1.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      mnStrategy0.setGradientNCycles(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)(-2238), (double)(-2238), (double)(-2238), 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      mnStrategy0.setGradientNCycles((-2238));
      doubleArray0[1] = (double) (-2238);
      doubleArray0[1] = (double) (-2238);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-2238));
      mnUserParameterState0.setUpperLimit(0, 1183.9776);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)(-2238), 0.0, 0.30000000000000004, 3715.068517449458).when(fCNBase1).valueOf(any(double[].class));
      mnHesse0.calculate(fCNBase1, doubleArray0, doubleArray0);
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase2).valueOf(any(double[].class));
      mnHesse0.calculate(fCNBase2, mnUserParameterState0, 200);
      double double0 = mnHesse0.tolerg2();
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)(-2238), (double)(-2238), (double)(-2238), 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (double) (-2238);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-2238));
      mnUserParameterState0.setUpperLimit(0, 1183.9776);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)(-2238), 0.0, 0.30000000000000004, 3715.068517449458).when(fCNBase1).valueOf(any(double[].class));
      mnHesse0.calculate(fCNBase1, doubleArray0, doubleArray0);
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(6.740984690423201E-4, (double)0, (-2414.84172), (double)(-2238), (-561.5205688929725)).when(fCNBase2).valueOf(any(double[].class));
      mnHesse0.calculate(fCNBase2, mnUserParameterState0, (-2238));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      FCNBase fCNBase3 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(3715.068517449458, 1797.5156481238068, (-1173.0), 0.02, (-401.1056695)).when(fCNBase3).valueOf(any(double[].class));
      mnHesse0.ncycles();
      mnHesse0.tolerstp();
      mnHesse0.calculate(fCNBase3, doubleArray0, doubleArray0, 7);
      // Undeclared exception!
      try { 
        mnUserParameterState0.name(7);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 7, Size: 2
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      mnStrategy0.setGradientNCycles(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (double)0, (double)0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      mnStrategy0.setGradientNCycles(0);
      doubleArray0[1] = (double) 0;
      doubleArray0[1] = (double) 0;
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, 0);
      mnUserParameterState0.setUpperLimit(0, 1183.9776);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, 0.0, 0.30000000000000004, 3715.068517449458).when(fCNBase1).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState1 = mnHesse0.calculate(fCNBase1, doubleArray0, doubleArray0);
      assertEquals(0.037500000000000006, mnUserParameterState1.edm(), 0.01);
      
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2334.9, 0.0, 3715.068517449458, (-2438.041469980807), 1.0).when(fCNBase2).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState2 = mnHesse0.calculate(fCNBase2, mnUserParameterState0, 200);
      assertTrue(mnUserParameterState2.hasGlobalCC());
      
      mnHesse0.tolerg2();
      FCNBase fCNBase3 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase3).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance(0);
      MnUserParameterState mnUserParameterState3 = mnHesse0.calculate(fCNBase3, mnUserParameters0, mnUserCovariance0);
      assertEquals(0.0, mnUserParameterState3.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)(-2238), (double)(-2238), (double)(-2238), 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      mnStrategy0.setGradientNCycles((-2238));
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) (-2238);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-2238));
      mnUserParameterState0.toString();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)(-2238), 0.0, 0.30000000000000004, 3715.068517449458).when(fCNBase1).valueOf(any(double[].class));
      mnHesse0.calculate(fCNBase1, doubleArray0, doubleArray0);
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(6.740984690423201E-4, (double)0, (-2414.84172), (double)(-2238), (-561.5205688929725)).when(fCNBase2).valueOf(any(double[].class));
      mnHesse0.calculate(fCNBase2, mnUserParameterState0, (-2238));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      FCNBase fCNBase3 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-959.0), (double)(-2238), 0.14142135623731064, (-2238.0)).when(fCNBase3).valueOf(any(double[].class));
      mnHesse0.calculate(fCNBase3, doubleArray0, doubleArray0, (-2238));
      FCNBase fCNBase4 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.3).when(fCNBase4).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState1 = new MnUserParameterState();
      MnFcn mnFcn0 = new MnFcn(fCNBase4, (-3062.601332351869));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2431);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 0.1);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(2431);
      MinimumError.MnInvertFailed minimumError_MnInvertFailed0 = new MinimumError.MnInvertFailed();
      MinimumError minimumError0 = new MinimumError(mnAlgebraicSymMatrix0, minimumError_MnInvertFailed0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, (-1.0), (-2238));
      MnUserParameters mnUserParameters1 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation0 = mnUserParameters1.trafo();
      MnUserTransformation mnUserTransformation1 = mnUserTransformation0.clone();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation1, (-2238));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameters have invalid size
         //
         verifyException("org.freehep.math.minuit.InitialGradientCalculator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = 0;
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      int int1 = (-2238);
      double double0 = 0.0;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)(-2238), (double)(-2238), (double)(-2238), 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      mnStrategy0.setHessianStepTolerance((-2238));
      mnStrategy0.setGradientNCycles((-2238));
      doubleArray0[1] = (double) (-2238);
      doubleArray0[1] = (double) (-2238);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-2238));
      mnUserParameterState0.setUpperLimit(0, 1183.9776);
      double double1 = 0.30000000000000004;
      // Undeclared exception!
      try { 
        mnUserParameterState0.ext2int(5, (-2238));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 5, Size: 2
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}