/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 23:40:09 GMT 2018
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
      MnHesse mnHesse0 = new MnHesse((-2126));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) (-2126);
      doubleArray0[1] = (double) (-2126);
      doubleArray0[2] = (double) (-2126);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, (-2126));
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
      assertEquals(24, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2164.635148932), (-2164.635148932)).when(fCNBase0).valueOf(any(double[].class));
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
  public void test02()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((-2126));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-2126), (-2678.055465618084), (-1473.43112), (-2678.055465618084), (-1473.43112)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) (-2126);
      doubleArray0[2] = (double) (-2126);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, mnUserParameters0, (-2126));
      assertEquals(34, mnUserParameterState0.nfcn());
      assertEquals((-2126.0), mnUserParameterState0.fval(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, (double[]) null, (MnUserCovariance) null, 3435);
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
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
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
  public void test05()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      mnHesse0.tolerg2();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, (MnUserParameters) null);
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
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnHesse mnHesse0 = new MnHesse((MnStrategy) null);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, (MnUserCovariance) null, (-3042));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserParameterState", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 0;
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
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
  public void test08()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, (MnUserCovariance) null);
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
      int int0 = (-178);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      mnStrategy0.setHessianNCycles((-2780));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2872.18310726989), (-2872.18310726989), (-2872.18310726989), 0.0, 4.55177748458197E-15).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance((-2780));
      mnStrategy0.setHessianG2Tolerance((-178));
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase1, doubleArray0, mnUserCovariance0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserParameterState", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((-1));
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance((-1));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-1), 154.66175566823324, 1.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) (-1);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation0 = mnUserParameters0.trafo();
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.0);
      int int0 = 1658;
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1658);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, (-1793.81068356972));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1658, (-1));
      mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, (-1));
      MnHesse mnHesse1 = new MnHesse();
      // Undeclared exception!
      try { 
        mnHesse1.calculate((FCNBase) null, mnUserParameters0, 489);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFcn", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1725.6045776), 0.05, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnHesse mnHesse0 = new MnHesse(59);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 0.05;
      doubleArray0[1] = 0.05;
      doubleArray0[2] = (double) 59;
      doubleArray0[3] = (double) 59;
      doubleArray0[4] = (-1725.6045776);
      doubleArray0[5] = 0.05;
      doubleArray0[6] = (double) 59;
      doubleArray0[7] = (-1725.6045776);
      mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0, (-3367));
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase1, (MnUserParameters) null, (MnUserCovariance) null, (-25));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserParameterState", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse((-1));
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance((-1));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-1), (double)(-1), 1.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) (-1);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserTransformation mnUserTransformation0 = mnUserParameters0.trafo();
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.0);
      int int0 = 1658;
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1658);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, (-1793.81068356972));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1658, (-1));
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, (-1));
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
      MnStrategy mnStrategy0 = new MnStrategy((-178));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-178), 0.0, (-2167.17699583), 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, (-2167.17699583));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-178), (-1));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-4743.198841407991);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, (-1));
      MnFcn mnFcn1 = new MnFcn((FCNBase) null, 1420.039241);
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
  public void test14()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.0, 1.2171319002437315, (-203.093456681074), 377.8097, 2.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 4133.161523294;
      doubleArray0[1] = 0.1;
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      int int0 = 0;
      mnUserParameters0.setLowerLimit(0, (double) 0);
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      mnUserCovariance0.toString();
      mnHesse0.calculate(fCNBase0, mnUserParameters0, mnUserCovariance0, 0);
      int int1 = 280;
      MnHesse mnHesse1 = new MnHesse(280);
      // Undeclared exception!
      try { 
        mnUserCovariance0.get((-2496), (-2496));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3111264
         //
         verifyException("org.freehep.math.minuit.MnUserCovariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-178));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      mnStrategy0.setHessianNCycles((-178));
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) (-178);
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = 0.0;
      // Undeclared exception!
      mnHesse0.calculate(fCNBase1, doubleArray0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = (-178);
      MnStrategy mnStrategy0 = new MnStrategy((-178));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.1218621706080054E-4, (double)(-178), 7.105427493126273E-13, (double)(-178), 0.0010333905200431846).when(fCNBase0).valueOf(any(double[].class));
      mnStrategy0.setHessianNCycles((-178));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) (-178);
      mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      FCNBase fCNBase1 = null;
      MnUserTransformation mnUserTransformation0 = mnUserParameters0.trafo();
      mnUserTransformation0.clone();
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = null;
      try {
        mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix((-178));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid matrix size: -178
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = (-178);
      MnStrategy mnStrategy0 = new MnStrategy((-178));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-178)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2167.17699583));
      int int1 = 100;
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-2577.0), 100);
      double[] doubleArray0 = new double[0];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumError minimumError0 = new MinimumError(2959);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState1 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 8.0, 2959);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState1, mnUserTransformation0, (-178));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-178));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-178), 0.0, (-2167.17699583), 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1293.8913307051));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 8.0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 8.0, (-1051));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-1293.8913307051);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumState minimumState1 = new MinimumState(minimumParameters0, 8.0, 100);
      mnUserTransformation0.add(">q8!", 617.0182279, 8.0, 0.2, (-1051));
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn1 = new MnFcn(fCNBase1, 100);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState1, mnUserTransformation0, 79);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 2
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-178));
      MnHesse mnHesse0 = new MnHesse(mnStrategy0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-178), 0.0, (-2167.17699583), 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2167.17699583));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 8.0);
      mnStrategy0.setHessianStepTolerance((-2548.41052700582));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-622.224323984), 100);
      double[] doubleArray0 = new double[16];
      doubleArray0[0] = (double) 100;
      mnAlgebraicVector0.clone();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumState minimumState1 = new MinimumState(minimumParameters0, (-1797.18137), (-178));
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumState minimumState2 = new MinimumState(minimumParameters0, (-178), 4044);
      MnUserTransformation mnUserTransformation2 = mnUserTransformation1.clone();
      mnHesse0.calculate(mnFcn0, minimumState1, mnUserTransformation2, (-178));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.51, (-1223.5), 100.0, 4.6731861139603185E29).when(fCNBase1).valueOf(any(double[].class));
      MnFcn mnFcn1 = new MnFcn(fCNBase1, 0.0);
      mnFcn1.theNumCall = (-178);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn1, minimumState0, mnUserTransformation1, 100);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 16, Size: 16
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
