/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 07:24:52 GMT 2018
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
      MnHesse mnHesse0 = new MnHesse((-1909));
      mnHesse0.tolerg2();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) (-1909);
      // Undeclared exception!
      try { 
        mnHesse0.calculate((FCNBase) null, doubleArray0, (MnUserCovariance) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserParameterState", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((-890));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) (-890);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      assertEquals(16, mnUserParameterState0.nfcn());
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1734.7;
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, 544);
      assertEquals(16, mnUserParameterState0.nfcn());
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      double[] doubleArray0 = new double[0];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        mnHesse0.calculate((FCNBase) null, mnUserParameters0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFcn", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(2142015764);
      // Undeclared exception!
      try { 
        mnHesse0.calculate((FCNBase) null, (MnUserParameters) null, (MnUserCovariance) null, 2142015764);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserParameterState", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(44769.22072881635, 44769.22072881635, 1059.842501526071, 44769.22072881635, 44769.22072881635).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      assertEquals(44769.22072881635, mnUserParameterState0.fval(), 0.01);
      assertEquals(24, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((-3968));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, (-3968));
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
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, (-1068));
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
      double double0 = mnHesse0.tolerstp();
      assertEquals(0.3, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(1639);
      double double0 = mnHesse0.tolerstp();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.99, (-4187.0), 2.826403982124313, (double)1639, 2.826403982124313).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 1639;
      doubleArray0[2] = (double) 1639;
      doubleArray0[3] = 0.1;
      doubleArray0[5] = 1063.56838506;
      doubleArray0[6] = 0.1;
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      mnHesse0.calculate(fCNBase0, mnUserParameters0);
      double double1 = mnHesse0.tolerg2();
      assertNotEquals(double1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameters mnUserParameters1 = mnUserParameters0.clone();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters1, (MnUserCovariance) null);
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
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1338.97130378546);
      MinimumState minimumState0 = new MinimumState(5);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnUserTransformation mnUserTransformation1 = mnUserTransformation0.clone();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation1, 5);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = 4;
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)4, (double)4, 8.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 837.295587);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(4);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 4.265564326999992E13);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 837.295587, 4);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnUserTransformation mnUserTransformation1 = mnUserTransformation0.clone();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation1, 4);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[5] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[8] = (double) 0;
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      mnUserParameters0.clone();
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, (-248.0), 1289.5406514).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-248.0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameters mnUserParameters1 = new MnUserParameters();
      MnStrategy mnStrategy0 = new MnStrategy((-1358));
      MnHesse mnHesse1 = new MnHesse(mnStrategy0);
      mnStrategy0.setGradientNCycles(0);
      MnFcn mnFcn0 = new MnFcn(fCNBase1, 1578.57596983874);
      MnUserParameterState mnUserParameterState0 = mnHesse1.calculate(fCNBase0, doubleArray0, doubleArray0, (-1358));
      assertEquals(4, mnUserParameterState0.nfcn());
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      mnUserParameters0.clone();
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setHessianNCycles((-2411));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      // Undeclared exception!
      mnHesse0.calculate(fCNBase1, mnUserParameters0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      double[] doubleArray0 = new double[9];
      doubleArray0[1] = (double) 0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      doubleArray0[6] = (double) 0;
      doubleArray0[8] = (double) 0;
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (double)0, 0.0, 0.0, 1.18255615234375E-4).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-248.0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, (double)0, (double)0, (-248.0)).when(fCNBase1).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray1, doubleArray1);
      assertTrue(mnUserParameterState0.hasCovariance());
      assertEquals(6, mnUserParameterState0.nfcn());
      
      MnUserParameterState mnUserParameterState1 = mnHesse0.calculate(fCNBase1, doubleArray1, doubleArray0);
      assertEquals(0.0, mnUserParameterState1.fval(), 0.01);
      assertEquals(16, mnUserParameterState1.nfcn());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[18];
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      doubleArray0[6] = (double) 0;
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setLowStrategy();
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      mnUserParameters0.add("", 0.02, 7.152948538018261E-4, 7.152948538018261E-4, (-1182.9031046124403));
      mnUserParameters0.errors();
      mnHesse0.calculate(fCNBase0, mnUserParameters0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      mnHesse0.calculate(fCNBase1, mnUserParameters0);
      Double double0 = new Double((-631.64245906043));
      mnStrategy0.setHessianStepTolerance((-2999.3));
      mnUserParameters0.setValue("", 0.51);
      assertEquals(1, mnUserParameters0.variableParameters());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = 0;
      MnHesse mnHesse0 = new MnHesse(0);
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-248.0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (double)0, (double)0, 9990.368343).when(fCNBase1).valueOf(any(double[].class));
      mnHesse0.calculate(fCNBase1, doubleArray0, doubleArray0);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnUserParameters0.setLowerLimit(7, (-29.156665594852374));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 7, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-619.0259974656866));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(190);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 190);
      MinimumError.MnHesseFailed minimumError_MnHesseFailed0 = new MinimumError.MnHesseFailed();
      MinimumError minimumError0 = new MinimumError((MnAlgebraicSymMatrix) null, minimumError_MnHesseFailed0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, (-451.87241959), 5);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-619.0259974656866);
      doubleArray0[1] = (double) 190;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 200);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameters have invalid size
         //
         verifyException("org.freehep.math.minuit.InitialGradientCalculator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(2);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(3.8769E-4, 1326.3, 437.681359036, 0.02, 7.152948538018261E-4).when(fCNBase0).valueOf(any(double[].class));
      mnStrategy0.setLowStrategy();
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      mnUserParameters0.add("", (double) 2, 1.1834302957536673E-4, 1.1834302957536673E-4, 1600.40864411605);
      mnUserParameters0.errors();
      mnHesse0.calculate(fCNBase0, mnUserParameters0);
      int int0 = Double.MAX_EXPONENT;
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)2, (-953.1755993051399), 4146.11, 2.0, 437.681359036).when(fCNBase1).valueOf(any(double[].class));
      mnHesse0.calculate(fCNBase1, mnUserParameters0);
      Double double0 = new Double(0.02);
      mnStrategy0.setHessianStepTolerance(0.99);
      mnUserParameters0.setValue("", 2096.1519994388996);
      assertEquals(1, mnUserParameters0.variableParameters());
  }
}
