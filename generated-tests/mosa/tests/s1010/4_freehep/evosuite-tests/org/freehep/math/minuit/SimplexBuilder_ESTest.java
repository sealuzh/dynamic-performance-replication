/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 01:17:59 GMT 2018
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
import org.freehep.math.minuit.FunctionMinimum;
import org.freehep.math.minuit.GradientCalculator;
import org.freehep.math.minuit.MinimumError;
import org.freehep.math.minuit.MinimumParameters;
import org.freehep.math.minuit.MinimumSeed;
import org.freehep.math.minuit.MinimumState;
import org.freehep.math.minuit.MnAlgebraicSymMatrix;
import org.freehep.math.minuit.MnFcn;
import org.freehep.math.minuit.MnStrategy;
import org.freehep.math.minuit.MnUserTransformation;
import org.freehep.math.minuit.Numerical2PGradientCalculator;
import org.freehep.math.minuit.SimplexBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimplexBuilder_ESTest extends SimplexBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2.5);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, 2.5);
      assertEquals(0.0, functionMinimum0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.5, 2.5, (-18.242294711791615), (-18.242294711791615), 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2.5);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(4);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 4, 2.5);
      assertEquals(7, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1456.0), (-1456.0), (-1456.0)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1456.0));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, 0);
      assertEquals(3, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.5, 0.5, 0.5).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.5);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 349, 0.5);
      assertEquals(0.5, functionMinimum0.errorDef(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.5, 2.5, 2.5).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2.5);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, 2.5);
      assertEquals(2.5, functionMinimum0.errorDef(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 10.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserTransformation0.setPrecision((-3280.430794867114));
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumParameters minimumParameters0 = new MinimumParameters(3516);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(1);
      MinimumError minimumError0 = new MinimumError(mnAlgebraicSymMatrix0, 3516);
      FunctionGradient functionGradient0 = new FunctionGradient(1);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 0.0, 1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(fCNBase1).valueOf(any(double[].class));
      MnFcn mnFcn1 = new MnFcn(fCNBase1, 1);
      MinimumSeed minimumSeed1 = new MinimumSeed(minimumState0, mnUserTransformation0);
      // Undeclared exception!
      try { 
        simplexBuilder0.minimum(mnFcn1, numerical2PGradientCalculator0, minimumSeed1, (MnStrategy) null, 1931, 1674.78);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.5, (-332.0), 2.5).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2.5);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, 2.5);
      assertEquals(3, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1456.0), 2110.6357104, (-1456.0), 2110.6357104, 4.0E-7).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1456.0));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 349, (-1456.0));
      assertEquals(7, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.5, 2.5, (-1553.62)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2.5);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, 2.5);
      assertEquals(0.0, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1197.21823027173), (-1197.21823027173), (-4275.4164523), (-1197.21823027173), (-1197.21823027173)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1197.21823027173));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(5);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 1889, 5);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1197.21823027173), 542.46013, (-1197.21823027173), (-1197.21823027173), (-1.0)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1197.21823027173));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(5);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 5, 1053.7158221648385);
      assertEquals(7, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2829.9, (-2007.0957026666895), (-2007.0957026666895), (-2007.0957026666895), 2.5).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1456.0));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 349, (-1456.0));
      assertEquals((-1456.0), functionMinimum0.errorDef(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1456.0), (-1828.41), (-1828.41), 2241.185941432988).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2241.185941432988);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, (-1828.41));
      assertEquals(4, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2823.5347384715524, (-2007.0957026666895), (-2007.0957026666895), (-2007.0957026666895), (-2552.19659)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1456.0));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 349, (-1456.0));
      assertEquals(351, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-97.6062361486492), (-135.984), (-2402.928249358), (-135.984), 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2711.63276235);
      MinimumError.MnInvertFailed minimumError_MnInvertFailed0 = new MinimumError.MnInvertFailed();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 2711.63276235;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 0.5, (-1));
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MinimumSeed minimumSeed1 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy1 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed1, mnStrategy1, 2867, 3378.69622);
      assertEquals(4, functionMinimum0.nfcn());
      
      FunctionMinimum functionMinimum1 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 2867, 1783.408644);
      assertEquals(7, functionMinimum1.nfcn());
  }
}
