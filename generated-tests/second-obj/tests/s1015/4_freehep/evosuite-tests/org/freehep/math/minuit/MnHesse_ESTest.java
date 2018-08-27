/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:03:33 GMT 2018
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
      MnHesse mnHesse0 = new MnHesse((-2629));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
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
  public void test01()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((-2366));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) (-2366);
      doubleArray0[1] = (-1961.81519);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-2366));
      assertEquals(20, mnUserParameterState0.nfcn());
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
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
  public void test03()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(5);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 5;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = (double) 5;
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, 5);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
      assertEquals(30, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, doubleArray0, (MnUserCovariance) null, (-1180));
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
      MnHesse mnHesse0 = new MnHesse((MnStrategy) null);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-3.3498055434549813E9);
      doubleArray0[1] = (-1352.957709865);
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
  public void test06()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(252);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(63.999999940395355, 0.3, (-1.0), 3544.08488087919, (double)252).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 252;
      doubleArray0[1] = (double) 252;
      doubleArray0[2] = (double) 252;
      doubleArray0[3] = (double) 252;
      doubleArray0[4] = 0.1;
      doubleArray0[5] = (double) 252;
      doubleArray0[6] = (double) 252;
      doubleArray0[7] = (double) 252;
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      assertEquals(48, mnUserParameterState0.nfcn());
      assertEquals(63.999999940395355, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, (MnUserCovariance) null, 44);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserParameterState", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(591.46959, 591.46959).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, 202);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      mnStrategy0.setHessianNCycles((-493));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-493), 3601.6396, 4790.9667, 1.4305117588264693E-7, (double)(-493)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[10];
      doubleArray0[0] = (double) (-493);
      doubleArray0[1] = (double) (-493);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-493));
      assertEquals(60, mnUserParameterState0.nfcn());
      assertEquals((-493.0), mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (double)0, (double)0, (double)0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      mnUserParameters0.setLowerLimit(0, 0.0);
      mnHesse0.calculate(fCNBase0, mnUserParameters0, 0);
      // Undeclared exception!
      try { 
        mnHesse0.calculate((FCNBase) null, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFcn", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      mnStrategy0.setHessianNCycles((-493));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(410.62589, 410.62589, 4790.9667, (-45.663959654903685), (double)(-493)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) (-493);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameters mnUserParameters1 = mnUserParameters0.clone();
      mnUserParameters1.clone();
      // Undeclared exception!
      mnHesse0.calculate(fCNBase0, mnUserParameters1, 1967);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      mnStrategy0.setHessianNCycles((-493));
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2736.55901598761;
      doubleArray0[1] = 591.46959;
      doubleArray0[2] = (double) (-493);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      mnUserParameters0.clone();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, 1388);
      assertEquals(Double.NaN, mnUserParameterState0.edm(), 0.01);
      assertEquals(23, mnUserParameterState0.nfcn());
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      mnStrategy0.setHessianNCycles((-493));
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2736.55901598761;
      doubleArray0[1] = 591.46959;
      doubleArray0[2] = (double) (-493);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      mnUserParameters0.clone();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(621.987, 2.0, 2736.55901598761, (-493.0), (double)(-493)).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, 1388);
      assertEquals(621.987, mnUserParameterState0.fval(), 0.01);
      assertEquals(25, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = Double.SIZE;
      double[] doubleArray0 = new double[2];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(5.9604644775390625E-8, 0.0, 0.0, 738.0615962929219, 5.9604644775390625E-8).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1158.905303));
      MinimumState minimumState0 = new MinimumState(64);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      mnUserTransformation0.clone();
      MnHesse mnHesse0 = new MnHesse();
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation1, 64);
      assertNotSame(minimumState0, minimumState1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = Double.SIZE;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 64;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(5.9604644775390625E-8, 64.0, 64.0).when(fCNBase0).valueOf(any(double[].class));
      MinimumParameters minimumParameters0 = new MinimumParameters(64);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 0.2, 64);
      int int1 = Double.SIZE;
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 738.0615962929219);
      MinimumState minimumState1 = new MinimumState(64);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      int int2 = Double.BYTES;
      MnHesse mnHesse0 = new MnHesse(8);
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation(doubleArray0, doubleArray0);
      mnHesse0.calculate(mnFcn0, minimumState1, mnUserTransformation1, (-1508));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(8);
      MnUserParameters mnUserParameters1 = new MnUserParameters();
      mnUserParameters0.clone();
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      assertEquals(0, mnUserParameterState0.variableParameters());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      mnUserParameters0.add("J@60M&2K8z4q", 1368.098873948, 63.999999940395355, 63.999999940395355, (-2378.499134931244));
      mnHesse0.calculate(fCNBase0, mnUserParameters0);
      mnHesse0.ncycles();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 5;
      mnStrategy0.setHessianG2Tolerance(5.0);
      doubleArray0[1] = (double) 5;
      doubleArray0[2] = (double) 5;
      doubleArray0[3] = 5.9604644775390625E-8;
      int int0 = 1;
      // Undeclared exception!
      try { 
        mnUserParameters0.setValue("", 1568.73048693662);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserTransformation", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.05, (-3049.0), (-3049.0), (-3049.0), 1069.4054955).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      mnUserParameters0.add("J@60M&2K8z4q", (-3049.0), 63.999999940395355, 63.999999940395355, (-2378.499134931244));
      mnHesse0.calculate(fCNBase0, mnUserParameters0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        mnUserParameters0.setError(5, (-823347.2057074908));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 5, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1185.91207));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 100);
      MinimumError minimumError0 = new MinimumError(0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 0.51, 100);
      MnUserTransformation mnUserTransformation0 = mnUserParameters0.trafo();
      MnUserTransformation mnUserTransformation1 = mnUserTransformation0.clone();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation1, 100);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameters have invalid size
         //
         verifyException("org.freehep.math.minuit.InitialGradientCalculator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      int int0 = Double.SIZE;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(5.9604644775390625E-8, (double)64, (double)64, 1.0E-35, (-3450.4133173948667)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1159.0));
      MinimumState minimumState0 = new MinimumState(64);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      mnHesse0.ncycles();
      mnUserTransformation0.add("_0-9,]]$Zixh;!I", 5, 64, 2.1702065209738652E13, 5.9604644775390625E-8);
      MnHesse mnHesse1 = new MnHesse();
      mnHesse1.calculate(mnFcn0, minimumState0, mnUserTransformation0, 64);
      mnUserTransformation0.clone();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
  }
}