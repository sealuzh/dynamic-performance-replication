/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 07:16:43 GMT 2018
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
import org.freehep.math.minuit.AnalyticalGradientCalculator;
import org.freehep.math.minuit.FCNBase;
import org.freehep.math.minuit.FCNGradientBase;
import org.freehep.math.minuit.FunctionGradient;
import org.freehep.math.minuit.FunctionMinimum;
import org.freehep.math.minuit.GradientCalculator;
import org.freehep.math.minuit.HessianGradientCalculator;
import org.freehep.math.minuit.MinimumError;
import org.freehep.math.minuit.MinimumParameters;
import org.freehep.math.minuit.MinimumSeed;
import org.freehep.math.minuit.MinimumState;
import org.freehep.math.minuit.MnAlgebraicVector;
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
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-313.831293));
      MinimumState minimumState0 = new MinimumState(32);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy(32);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 32, (-313.831293));
      assertEquals(0.0, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.1, 0.1, 0.1, 0.1, 0.1).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.1);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation1, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(4);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation1);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 4, 10000.0);
      assertFalse(functionMinimum0.isValid());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 188.97908);
      FCNGradientBase fCNGradientBase0 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      AnalyticalGradientCalculator analyticalGradientCalculator0 = new AnalyticalGradientCalculator(fCNGradientBase0, mnUserTransformation0, false);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy(519);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, analyticalGradientCalculator0, minimumSeed0, mnStrategy0, 519, 0.2);
      assertTrue(functionMinimum0.isValid());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-427.80562595888836), (-427.80562595888836), (-427.80562595888836), (-427.80562595888836), (-427.80562595888836)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 5.928185858082036);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(18);
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(27);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 27, 0.5);
      assertEquals(0.0, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.5);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 3158.246657276823);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 0, 0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 879, 1373.8560887514);
      assertEquals(3, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.3, 0.3, 0.3).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 4.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy1 = new MnStrategy(1);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy1, (-1), 0);
      assertEquals(3, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnUserTransformation mnUserTransformation1 = mnUserTransformation0.clone();
      MinimumState minimumState0 = new MinimumState(3);
      MnStrategy mnStrategy0 = new MnStrategy();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation1);
      mnStrategy0.setGradientNCycles(1);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)1, (double)3, (double)1, (double)1, (double)3).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, (-2965), 3);
      assertEquals(1.0, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.3, 0.05, 1907.0, 1.0, 1845.281).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1845.281);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnUserTransformation mnUserTransformation1 = mnUserTransformation0.clone();
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation1, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(4);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation1);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 4, 4);
      assertEquals(1845.281, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1219.89229088926, 1219.89229088926, 1219.89229088926, 1219.89229088926, 2.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy(18);
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(18);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 27, 0.5);
      assertEquals(2.0, functionMinimum0.errorDef(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNGradientBase fCNGradientBase0 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy(519);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (double)519, 1310.2694857, (double)519).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1310.2694857);
      mnStrategy0.setHessianG2Tolerance(0);
      FCNGradientBase fCNGradientBase1 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 519, (-2802.86349764));
      assertEquals(0.0, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNGradientBase fCNGradientBase0 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy(496);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (double)496, (-1002.3083)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 486.2);
      mnStrategy0.setHessianG2Tolerance(486.2);
      FCNGradientBase fCNGradientBase1 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumSeed minimumSeed1 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed1, mnStrategy0, 496, 0);
      assertEquals(4, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-348.27705901103));
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      MnFcn mnFcn1 = new MnFcn(fCNBase1, 629.66118692);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 3408.15437;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation1 = mnUserTransformation0.clone();
      MnStrategy mnStrategy0 = new MnStrategy(41);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn1, mnUserTransformation1, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation1);
      MinimumParameters minimumParameters0 = minimumSeed0.parameters();
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MnAlgebraicVector mnAlgebraicVector1 = mnUserTransformation1.transform(mnAlgebraicVector0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector1, mnAlgebraicVector0, mnAlgebraicVector1);
      MinimumState minimumState1 = new MinimumState(minimumParameters0, (MinimumError) null, functionGradient0, 130.02641601, 0);
      MinimumSeed minimumSeed1 = new MinimumSeed(minimumState1, mnUserTransformation0);
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase2).valueOf(any(double[].class));
      MnFcn mnFcn2 = new MnFcn(fCNBase2, (-2728.09681));
      MnStrategy mnStrategy1 = new MnStrategy();
      simplexBuilder0.minimum(mnFcn2, numerical2PGradientCalculator0, minimumSeed1, mnStrategy1, 41, (-348.27705901103));
      simplexBuilder0.minimum(mnFcn2, numerical2PGradientCalculator0, minimumSeed1, mnStrategy1, 41, 1);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn1, numerical2PGradientCalculator0, minimumSeed1, mnStrategy1, 1, 8.0);
      assertEquals(629.66118692, functionMinimum0.errorDef(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNGradientBase fCNGradientBase0 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (double)(-914), 1310.2694857).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 486.2);
      mnStrategy0.setHessianG2Tolerance(486.2);
      FCNGradientBase fCNGradientBase1 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, 0);
      assertFalse(functionMinimum0.isValid());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1712.4595, 1712.4595, 1712.4595, 1.0, (-823.798292)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-823.798292));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(3);
      MnAlgebraicVector mnAlgebraicVector0 = minimumState0.vec();
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 3);
      MinimumState minimumState1 = new MinimumState(minimumParameters0, (-823.798292), (-1694));
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState1, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy((-1694));
      mnStrategy0.setHessianGradientNCycles((-1694));
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 1, 1.0);
      // Undeclared exception!
      simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 3415, (-1.0));
  }
}