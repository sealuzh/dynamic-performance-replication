/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 12:00:19 GMT 2018
 */

package org.freehep.math.minuit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.freehep.math.minuit.AnalyticalGradientCalculator;
import org.freehep.math.minuit.FCNBase;
import org.freehep.math.minuit.FCNGradientBase;
import org.freehep.math.minuit.FunctionMinimum;
import org.freehep.math.minuit.GradientCalculator;
import org.freehep.math.minuit.HessianGradientCalculator;
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
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2.5);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy((-2614));
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, (-645), (-2614));
      assertEquals(0.0, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 406.0);
      MinimumState minimumState0 = new MinimumState(1);
      double[] doubleArray0 = new double[0];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 1, 1);
      assertEquals(0.0, functionMinimum0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 4.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 1067.0550831214);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1067.0550831214, 22);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 22, 1067.0550831214);
      assertEquals(4, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1067.0550831214, (-402.0), 1067.0550831214, 4.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 4.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 1067.0550831214);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1067.0550831214, 22);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 22, 1067.0550831214);
      assertEquals(6, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNGradientBase fCNGradientBase0 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      AnalyticalGradientCalculator analyticalGradientCalculator0 = new AnalyticalGradientCalculator(fCNGradientBase0, mnUserTransformation0, true);
      MinimumState minimumState0 = new MinimumState(2);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)2, 10.0, (double)2, 10.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-5232.5122));
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, analyticalGradientCalculator0, minimumSeed0, (MnStrategy) null, 2, 10.0);
      assertEquals(0.0, functionMinimum0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(4029.906080887347, 4029.906080887347, 3546.5619, 3546.5619).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 406.0);
      MinimumState minimumState0 = new MinimumState(1);
      double[] doubleArray0 = new double[0];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 1, 1);
      assertEquals(0.0, functionMinimum0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(8.0, 8.0, 1079.64717935, 8.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1291.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnUserTransformation mnUserTransformation1 = mnUserTransformation0.clone();
      MnStrategy mnStrategy0 = new MnStrategy(1);
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation1, mnStrategy0);
      MinimumState minimumState0 = new MinimumState(1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, numerical2PGradientCalculator0, minimumSeed0, mnStrategy0, 0, (-1290.60569));
      assertEquals(8.0, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1067.0550831214, 1067.0550831214, 1067.0550831214, 1067.0550831214, (-5455.2)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1067.0550831214);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 1067.0550831214);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1067.0550831214, 22);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 22, 1067.0550831214);
      assertEquals(5, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      MnStrategy mnStrategy0 = new MnStrategy(1);
      MinimumState minimumState0 = new MinimumState(1);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)1, 0.1, 2096.8, 498.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 1, (-92.3));
      assertEquals(0.0, functionMinimum0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      MnStrategy mnStrategy0 = new MnStrategy(1);
      MinimumState minimumState0 = new MinimumState(1);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (-1651.2801476635843), (-4340.699758), (-1651.2801476635843)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed0, mnStrategy0, 1, (-92.3));
      assertEquals((-1651.2801476635843), functionMinimum0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-282.866885337362));
      FCNGradientBase fCNGradientBase0 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(1);
      MnStrategy mnStrategy0 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnFcn mnFcn1 = new MnFcn(fCNGradientBase0, (-1651.2801476635843));
      Numerical2PGradientCalculator numerical2PGradientCalculator1 = new Numerical2PGradientCalculator(mnFcn1, mnUserTransformation0, mnStrategy0);
      SimplexBuilder simplexBuilder1 = new SimplexBuilder();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn2 = new MnFcn(fCNBase1, (-2088.4));
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1315.96991222547, 2563.564058881769, 947.274331778775, (-282.866885337362), (-626.0)).when(fCNBase2).valueOf(any(double[].class));
      MnFcn mnFcn3 = new MnFcn(fCNBase2, 1187.3199264041064);
      MinimumSeed minimumSeed1 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn3, numerical2PGradientCalculator1, minimumSeed0, mnStrategy0, 529, (-652.446848));
      assertEquals(0.0, functionMinimum0.edm(), 0.01);
      assertEquals(531, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNGradientBase fCNGradientBase0 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 355.872474680757, (-1651.2801476635843)).when(fCNGradientBase0).valueOf(any(double[].class));
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnFcn mnFcn0 = new MnFcn(fCNGradientBase0, 1);
      MinimumState minimumState1 = new MinimumState(1);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 355.872474680757;
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed1 = new MinimumSeed(minimumState0, mnUserTransformation1);
      MnStrategy mnStrategy0 = new MnStrategy();
      MinimumSeed minimumSeed2 = new MinimumSeed(minimumState1, mnUserTransformation1);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, (GradientCalculator) null, minimumSeed2, mnStrategy0, (-1621), 355.872474680757);
      assertEquals(5, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNGradientBase fCNGradientBase0 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFcn mnFcn0 = new MnFcn(fCNGradientBase0, (-1651.2801476635843));
      MnStrategy mnStrategy1 = new MnStrategy();
      Numerical2PGradientCalculator numerical2PGradientCalculator0 = new Numerical2PGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy1);
      SimplexBuilder simplexBuilder1 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn1 = new MnFcn(fCNBase0, 0.0);
      FCNGradientBase fCNGradientBase1 = mock(FCNGradientBase.class, new ViolatedAssumptionAnswer());
      AnalyticalGradientCalculator analyticalGradientCalculator0 = new AnalyticalGradientCalculator(fCNGradientBase1, mnUserTransformation0, true);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn2 = new MnFcn(fCNBase1, 1187.3199264041064);
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2674.1073528126267, 0.0, (-1291.0), (-652.446848), 654.429112462454).when(fCNBase2).valueOf(any(double[].class));
      MnFcn mnFcn3 = new MnFcn(fCNBase2, (-4222.190508973455));
      MinimumSeed minimumSeed1 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn3, analyticalGradientCalculator0, minimumSeed1, mnStrategy0, (-223), 4399.91312873);
      assertEquals(5, functionMinimum0.nfcn());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1067.0550831214, 1067.0550831214, 1067.0550831214, 2.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 4.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 1067.0550831214);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1067.0550831214, 22);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 22, 1067.0550831214);
      assertEquals(1065.0550831214, functionMinimum0.edm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimplexBuilder simplexBuilder0 = new SimplexBuilder();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 4.0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserTransformation0.setPrecision((-1125.5491958360828));
      HessianGradientCalculator hessianGradientCalculator0 = new HessianGradientCalculator(mnFcn0, mnUserTransformation0, mnStrategy0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 2422.83716947);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1.7251396329117163, (-1));
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = simplexBuilder0.minimum(mnFcn0, hessianGradientCalculator0, minimumSeed0, mnStrategy0, 2063, (-402.0));
      assertEquals(2065, functionMinimum0.nfcn());
  }
}