/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 13:15:47 GMT 2018
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
      MnHesse mnHesse0 = new MnHesse(248);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, mnUserCovariance0, 248);
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
      MnHesse mnHesse0 = new MnHesse(248);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) (-78);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, 248);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
      assertEquals(16, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(518);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-10.13);
      doubleArray0[1] = (double) 518;
      doubleArray0[2] = (double) 518;
      doubleArray0[3] = (double) 518;
      doubleArray0[4] = (double) 518;
      doubleArray0[5] = (double) 518;
      doubleArray0[6] = (double) 518;
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState1 = mnHesse0.calculate(fCNBase0, mnUserParameterState0, (-921));
      assertEquals(0.0, mnUserParameterState1.fval(), 0.01);
      assertEquals(80, mnUserParameterState1.nfcn());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((-34));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance((-1951));
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, (double[]) null, mnUserCovariance0, (-1951));
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
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameters mnUserParameters1 = mnUserParameters0.clone();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MnAlgebraicVector mnAlgebraicVector1 = mnUserTransformation0.transform(mnAlgebraicVector0);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      MnUserCovariance mnUserCovariance0 = mnUserTransformation0.int2extCovariance(mnAlgebraicVector1, mnAlgebraicSymMatrix0);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters1, mnUserCovariance0);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
      
      double double0 = mnHesse0.tolerstp();
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-2050));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) (-2050);
      doubleArray0[1] = (double) (-2050);
      doubleArray0[2] = (double) (-2050);
      doubleArray0[3] = (double) (-2050);
      doubleArray0[4] = (double) (-2050);
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      MnUserCovariance mnUserCovariance1 = mnUserCovariance0.clone();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, doubleArray0, mnUserCovariance1);
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
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (double)0, 902.91826175775, (double)0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 902.91826175775);
      MinimumState minimumState0 = new MinimumState(370);
      MnUserTransformation mnUserTransformation1 = mnUserTransformation0.clone();
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation1, 370);
      assertFalse(minimumState1.equals((Object)minimumState0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((-1417));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1693.6597581292485), (double)(-1417), (double)(-1417), (-514.944175703078), (-1693.6597581292485)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1848.05842413915));
      MinimumParameters minimumParameters0 = new MinimumParameters(1290);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-2916.29333), (-1));
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1848.05842413915);
      doubleArray0[1] = (-2916.29333);
      doubleArray0[2] = (double) (-1417);
      doubleArray0[3] = (double) 1290;
      doubleArray0[4] = (double) 1290;
      doubleArray0[5] = (double) 1290;
      doubleArray0[6] = (double) 1290;
      doubleArray0[7] = (double) 1290;
      doubleArray0[8] = (double) (-1);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation0 = mnUserParameters0.trafo();
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 1290);
      MinimumState minimumState2 = mnHesse0.calculate(mnFcn0, minimumState1, mnUserTransformation0, 1290);
      assertNotSame(minimumState0, minimumState2);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, 6.005079760563872E-4, (double)0, 6.005079760563872E-4, (double)0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 6.005079760563872E-4);
      MinimumState minimumState0 = new MinimumState(2092);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(248);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)248, 2045.07930802, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 248;
      doubleArray0[1] = 10.0;
      doubleArray0[2] = (double) 248;
      doubleArray0[3] = (double) 248;
      MnUserParameters mnUserParameters1 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation0 = mnUserParameters1.trafo();
      mnUserTransformation0.params();
      int int0 = (-1417);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.6666666666666682E-12);
      MinimumState minimumState0 = new MinimumState(248);
      mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 248);
      MnHesse mnHesse1 = new MnHesse();
      mnHesse1.calculate(mnFcn0, minimumState0, mnUserTransformation0, int0);
      mnHesse1.tolerg2();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = 0;
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, 6.005079760563872E-4, (double)0, 902.91826175775, (double)0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      mnUserTransformation0.setUpperLimit(0, 0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 10.0);
      MinimumState minimumState0 = new MinimumState(1462);
      mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)1462, 10.0).when(fCNBase1).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      mnUserParameters0.errors();
      MnUserParameters mnUserParameters1 = mnUserParameters0.clone();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase1, mnUserParameters1);
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
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnHesse mnHesse0 = new MnHesse();
      mnUserParameters0.add("", (-5235.42718), (-5235.42718), 7.480827624318797E-4, (-5235.42718));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(10.0, 10.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0);
      assertEquals(10, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.02, 2837.58933, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-348.9964));
      MinimumState minimumState0 = new MinimumState(1454);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-348.9964);
      doubleArray0[1] = (-348.9964);
      doubleArray0[2] = (-348.9964);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation1 = mnUserTransformation0.clone();
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation1, 5);
      assertNotSame(minimumState0, minimumState1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (-1001.6129873806), (-1547.592), (double)0, (-812.2)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      doubleArray0[6] = (double) 0;
      mnStrategy0.setHessianNCycles(0);
      // Undeclared exception!
      mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, 0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      double double0 = (-1001.6129873806);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (-1001.6129873806), (-1547.592), (double)0, (-812.2)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      mnStrategy0.setGradientStepTolerance(0.0);
      doubleArray0[3] = 0.0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      doubleArray0[6] = (double) 0;
      mnStrategy0.setHessianNCycles(0);
      // Undeclared exception!
      mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, 0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 436.2683;
      doubleArray0[1] = 436.2683;
      doubleArray0[2] = 436.2683;
      doubleArray0[3] = 436.2683;
      doubleArray0[4] = 436.2683;
      doubleArray0[5] = 436.2683;
      mnStrategy0.setHessianNCycles((-42));
      doubleArray0[6] = 436.2683;
      doubleArray0[7] = 436.2683;
      doubleArray0[8] = 436.2683;
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, 100);
      assertEquals(92, mnUserParameterState0.nfcn());
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
  }
}
