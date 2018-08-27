/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 14:47:50 GMT 2018
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
      MnHesse mnHesse0 = new MnHesse(2107);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
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
  public void test01()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((-1657));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) (-1657);
      doubleArray0[1] = (double) (-1657);
      doubleArray0[2] = (double) (-1657);
      doubleArray0[3] = (double) (-1657);
      doubleArray0[4] = (double) (-1657);
      doubleArray0[5] = (double) (-1657);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      mnUserParameterState0.setLowerLimit(0, 1.0E-6);
      mnHesse0.ncycles();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      mnHesse0.calculate(fCNBase1, mnUserParameterState0, 7);
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase2).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase2, mnUserParameters0, 0);
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
      MnHesse mnHesse0 = new MnHesse((MnStrategy) null);
      // Undeclared exception!
      try { 
        mnHesse0.tolerg2();
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
      MnHesse mnHesse0 = new MnHesse((-1005));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, doubleArray0, (MnUserCovariance) null, (-1005));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserParameterState", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(1364);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[0];
      int int0 = (-1050);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) 1364;
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance(1364);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase1, doubleArray1, mnUserCovariance0);
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
      double double0 = mnHesse0.tolerg2();
      assertEquals(0.05, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, 3.269728, 3.269728).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0);
      MinimumState minimumState0 = new MinimumState(2);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserTransformation mnUserTransformation0 = mnUserParameters0.trafo();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-3.5453761660567498));
      MinimumState minimumState0 = new MinimumState(2);
      double[] doubleArray0 = new double[4];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation0 = mnUserParameters0.trafo();
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 2);
      assertNotSame(minimumState1, minimumState0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(100);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)100, 3.269728, 3.269728, (double)100, 854.2504433371221).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-3.5453761660567498));
      int int0 = 2;
      MinimumState minimumState0 = new MinimumState(2);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      double[] doubleArray0 = new double[4];
      MnUserParameters mnUserParameters1 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation0 = mnUserParameters1.trafo();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 100);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // parameters are invalid
         //
         verifyException("org.freehep.math.minuit.HessianGradientCalculator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = 0;
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (double)0, (double)0, 854.2504433371221).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-3.5453761660567498));
      int int1 = 2;
      MinimumState minimumState0 = new MinimumState(2);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      double[] doubleArray0 = new double[4];
      MnUserParameters mnUserParameters1 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation0 = mnUserParameters1.trafo();
      // Undeclared exception!
      mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((-1657));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1513.0584816562862), (double)(-1657), (double)(-1657), (-3.5635259615036864E9), (double)(-1657)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) (-1657);
      doubleArray0[1] = (double) (-1657);
      doubleArray0[2] = (double) (-1657);
      doubleArray0[3] = (double) (-1657);
      doubleArray0[4] = (double) (-1657);
      doubleArray0[5] = (double) (-1657);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      mnUserParameterState0.setLowerLimit(0, 1.0E-6);
      mnHesse0.ncycles();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-6, (-5385.3363), (-1473.38), (-1513.0584816562862), (-3.5635259615036864E9)).when(fCNBase1).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState1 = mnHesse0.calculate(fCNBase1, mnUserParameterState0, 7);
      assertEquals(80, mnUserParameterState1.nfcn());
      
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1657.0), (double)(-1657), 0.0, 0.0, 0.0).when(fCNBase2).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState2 = mnHesse0.calculate(fCNBase2, doubleArray0, doubleArray0);
      assertEquals((-1657.0), mnUserParameterState2.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0);
      int int0 = 2;
      MinimumState minimumState0 = new MinimumState(2);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      mnUserParameters0.trafo();
      String string0 = null;
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance(0);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase1, mnUserParameters0, mnUserCovariance0, 2917);
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
      MnHesse mnHesse0 = new MnHesse(1);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1;
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2031.7675361894192, 4771.14587, 0.0, 0.0, 0.0).when(fCNBase2).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase1, doubleArray0, doubleArray0);
      assertEquals(22, mnUserParameterState0.nfcn());
      
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      mnUserParameters0.clone();
      MnUserParameterState mnUserParameterState1 = mnHesse0.calculate(fCNBase2, mnUserParameters0, 986);
      assertEquals(2031.7675361894192, mnUserParameterState1.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((-1005));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance((-1428));
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, (MnUserParameters) null, mnUserCovariance0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserParameterState", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(100);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)100, 3.269728, 3.269728, (-1970.0524289794), 854.2504433371221).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-3.5453761660567498));
      MinimumState minimumState0 = new MinimumState(2);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      double[] doubleArray0 = new double[4];
      MnUserParameters mnUserParameters1 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation0 = mnUserParameters1.trafo();
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 2);
      assertNotSame(minimumState1, minimumState0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setMediumStrategy();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) (-1005);
      doubleArray0[1] = (double) (-1005);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameters mnUserParameters1 = mnUserParameters0.clone();
      MnStrategy mnStrategy1 = new MnStrategy((-750));
      MnHesse mnHesse0 = new MnHesse(mnStrategy1);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      mnHesse0.calculate(fCNBase0, mnUserParameters1, (-750));
      MnUserParameters mnUserParameters2 = new MnUserParameters(doubleArray0, doubleArray0);
      mnUserParameters1.params();
      MnHesse mnHesse1 = new MnHesse(mnStrategy1);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = mnHesse1.calculate(fCNBase1, mnUserParameters2, (-1005));
      assertEquals(20, mnUserParameterState0.nfcn());
      
      mnUserParameters1.add("MnHesse: matrix inversion fails!", (double) (-1005));
      mnStrategy1.setHessianNCycles((-1005));
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase2).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState1 = mnHesse0.calculate(fCNBase2, mnUserParameters2);
      assertEquals(15, mnUserParameterState1.nfcn());
      assertEquals(0.0, mnUserParameterState1.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, 3.269728, 3.269728, 3.269728, (double)0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.0);
      MinimumState minimumState0 = new MinimumState(2);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 2185.976678;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 2;
      doubleArray0[3] = (double) 2;
      MnUserParameters mnUserParameters1 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation0 = mnUserParameters1.trafo();
      mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 5);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase1, doubleArray0, doubleArray0);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((-1005));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-1005)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation0 = mnUserParameters0.trafo();
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-4388.797733945));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2105);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, (-4388.797733945));
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (MinimumError) null, functionGradient0, 1542.0, 529148916);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 1073741792);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameters have invalid size
         //
         verifyException("org.freehep.math.minuit.InitialGradientCalculator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, 3.269728, 3.269728, (-1970.0524289794), 854.2504433371221).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-3.5453761660567498));
      MinimumState minimumState0 = new MinimumState(2);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      double[] doubleArray0 = new double[4];
      mnFcn0.theNumCall = 0;
      doubleArray0[0] = 2185.976678;
      MnUserParameters mnUserParameters1 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation0 = mnUserParameters1.trafo();
      mnUserParameters1.setLowerLimit(0, (-3748.6607));
      mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 2);
      MinimumState minimumState1 = new MinimumState(2);
      mnHesse0.calculate(mnFcn0, minimumState1, mnUserTransformation0, 1057390426);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      mnHesse0.calculate(mnFcn0, minimumState1, mnUserTransformation0, (-1556));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase1, doubleArray0, doubleArray0, (-1556));
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }
}