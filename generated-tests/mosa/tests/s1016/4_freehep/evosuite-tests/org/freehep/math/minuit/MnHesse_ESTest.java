/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 07:37:50 GMT 2018
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
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      double double0 = mnHesse0.tolerstp();
      assertEquals(0.3, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
      assertEquals(42, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[0];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, (MnUserCovariance) null, (-2691));
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
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
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
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(780);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 780;
      doubleArray0[1] = (double) 780;
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      assertEquals(20, mnUserParameterState0.nfcn());
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, (-427));
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
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
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
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase1, doubleArray0, (MnUserCovariance) null);
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
      double[] doubleArray0 = new double[5];
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2958.96), (-2958.96), 1468.44184, 1468.44184, (-2958.96)).when(fCNBase0).valueOf(any(double[].class));
      MinimumState minimumState0 = new MinimumState(6);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 6);
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 6);
      assertNotSame(minimumState1, minimumState0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, 0);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameters mnUserParameters1 = mnUserParameters0.clone();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(fCNBase2).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase2, 0.8998321812146177);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 0);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      MinimumError.MnHesseFailed minimumError_MnHesseFailed0 = new MinimumError.MnHesseFailed();
      MinimumError minimumError0 = new MinimumError(mnAlgebraicSymMatrix0, minimumError_MnHesseFailed0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 0, 3040);
      MnUserTransformation mnUserTransformation0 = mnUserParameters1.trafo();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, (-2145644725));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.1, 449.0, 449.0, 449.0, 449.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 449.0);
      MinimumState minimumState0 = new MinimumState(7);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 7);
      assertNotSame(minimumState0, minimumState1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      mnHesse0.tolerg2();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-1251), (double)(-1251), 0.1, 0.1, (double)0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0);
      MinimumState minimumState0 = new MinimumState(5);
      double[] doubleArray0 = new double[5];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 0);
      assertNotSame(minimumState0, minimumState1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      mnHesse0.tolerg2();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-1245), (double)(-1245), 0.05, (double)(-1507), 0.05).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1507));
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[1];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, (-1245));
      assertNotSame(minimumState0, minimumState1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(2144056174);
      mnHesse0.tolerg2();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-1251), (double)(-1251), 0.02, 0.02, (double)2144056174).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2144056174);
      MinimumState minimumState0 = new MinimumState(5);
      double[] doubleArray0 = new double[5];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 2144056174);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // parameters are invalid
         //
         verifyException("org.freehep.math.minuit.HessianGradientCalculator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (-1.0), (-1.0), 3102.8501131984, 3102.8501131984).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.0E-6);
      MinimumState minimumState0 = new MinimumState(7);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 7);
      assertNotSame(minimumState1, minimumState0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      mnHesse0.tolerg2();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-1235), (-1003.9770216636), 5.850157734546689E-9).when(fCNBase1).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase1, 809.6788161540297);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) (-1235);
      MinimumState minimumState0 = new MinimumState(1);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 5);
      assertNotSame(minimumState0, minimumState1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      mnHesse0.tolerg2();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-1235), (-1003.9770216636), (double)0).when(fCNBase1).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase1, 0);
      MnFcn mnFcn1 = new MnFcn(fCNBase0, 8.0);
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 5;
      mnFcn0.theNumCall = 7;
      doubleArray0[1] = 182.086;
      doubleArray0[2] = 8.0;
      doubleArray0[3] = (double) 5;
      doubleArray0[4] = (double) 7;
      doubleArray0[5] = (double) 0;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      mnUserTransformation0.setLowerLimit(0, (-3700.71816));
      mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, (-1235));
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase2, doubleArray0, mnUserCovariance0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserParameterState", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-5871.0);
      doubleArray0[1] = 850.82886676071;
      doubleArray0[2] = 2917.50172659;
      doubleArray0[3] = 2470.178;
      doubleArray0[4] = (-1719.0781);
      doubleArray0[5] = 4149.868341221;
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2382.6186883, 54.429554555132, 10000.0, (-21.84949625046), 62.79885289474172).when(fCNBase1).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      mnUserParameters0.setLowerLimit(0, 2.0);
      mnHesse0.calculate(fCNBase1, mnUserParameters0, 363);
      doubleArray0[7] = 2.826158029214684;
  }
}