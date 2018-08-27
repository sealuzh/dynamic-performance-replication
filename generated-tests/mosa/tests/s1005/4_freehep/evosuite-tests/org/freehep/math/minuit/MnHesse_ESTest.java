/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 20:45:57 GMT 2018
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
      MnHesse mnHesse0 = new MnHesse(3);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, 3);
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
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnHesse mnHesse0 = new MnHesse();
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      assertEquals(0.0, mnUserParameterState0.fval(), 0.01);
      assertEquals(24, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) (-8);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnHesse mnHesse0 = new MnHesse();
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      assertEquals(22, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnHesse mnHesse0 = new MnHesse();
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
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnHesse mnHesse0 = new MnHesse(3);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, mnUserParameters0, (MnUserCovariance) null, (-275));
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
      mnHesse0.ncycles();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(fCNBase0, (double[]) null, mnUserCovariance0);
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
      doReturn((-1780.43673715), (double)(-8), (double)(-8), (double)(-8), 2310.888823374).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) (-8);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnHesse mnHesse0 = new MnHesse();
      MnUserParameterState mnUserParameterState0 = mnHesse0.calculate(fCNBase0, doubleArray0, doubleArray0);
      assertEquals((-1780.43673715), mnUserParameterState0.fval(), 0.01);
      assertEquals(24, mnUserParameterState0.nfcn());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      mnHesse0.tolerg2();
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
  public void test08()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(3);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)3, (double)3, 10000.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 3);
      MinimumState minimumState0 = new MinimumState(3);
      mnUserParameters0.add("O0[)$N_l", (double) 3, 10000.0);
      MnUserTransformation mnUserTransformation0 = mnUserParameters0.trafo();
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 3);
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
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-13), 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-2.9620637978249337E-15);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2.9620637978249337E-15));
      MinimumState minimumState0 = new MinimumState(2107);
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, (-13));
      assertFalse(minimumState1.equals((Object)minimumState0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (-15.712290473208391), 0.03, 0.03, 0.03).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 3156.51726;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1605.031644575));
      MinimumState minimumState0 = new MinimumState(1);
      mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation1, (-3862));
      MinimumState minimumState1 = null;
      try {
        minimumState1 = new MinimumState((-2084));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, 3.8783086923365566, (double)0, 3.8783086923365566, (double)0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-2.9620637978249337E-15);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2.9620637978249337E-15));
      MinimumState minimumState0 = new MinimumState(2111);
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 2111);
      assertFalse(minimumState1.equals((Object)minimumState0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(525.7521222).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1245.38);
      MinimumParameters minimumParameters0 = new MinimumParameters(1592);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1592, 1592);
      MnHesse mnHesse0 = new MnHesse();
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1592);
      MinimumParameters minimumParameters1 = new MinimumParameters(mnAlgebraicVector0, 1245.38);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(1592);
      MinimumError minimumError0 = new MinimumError(mnAlgebraicSymMatrix0, (MinimumError.MnMadePosDef) null);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState1 = new MinimumState(minimumParameters1, minimumError0, functionGradient0, 0.0, (-2307));
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState1, mnUserTransformation0, 360);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameters have invalid size
         //
         verifyException("org.freehep.math.minuit.InitialGradientCalculator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, 2.8126697, 0.030000000000000006).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 3156.51726;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 8.0);
      mnFcn0.theNumCall = 0;
      MinimumState minimumState0 = new MinimumState(1);
      MinimumState minimumState1 = new MinimumState(1);
      MinimumState minimumState2 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 0);
      assertFalse(minimumState2.equals((Object)minimumState1));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = 0;
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, 2.8126697479638647, 2.8126697479638647, (double)0, 2.8126697479638647).when(fCNBase0).valueOf(any(double[].class));
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-14676.950241837174);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-14676.950241837174));
      MinimumParameters minimumParameters0 = new MinimumParameters(4);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 0.9996084543112791, 4);
      int int1 = 1527;
      // Undeclared exception!
      mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 1527);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (double)0, (double)0, (double)0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 0;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      mnUserTransformation0.setLowerLimit(0, 0);
      MinimumState minimumState0 = new MinimumState(2111);
      MinimumState minimumState1 = mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 2111);
      assertNotSame(minimumState0, minimumState1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, 3.8783086923365566, (double)0, 3.8783086923365566, (double)0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 3.8783086923365566;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 3.8783086923365566);
      mnUserTransformation0.setLowerLimit(0, 0);
      MinimumState minimumState0 = new MinimumState(2111);
      // Undeclared exception!
      try { 
        mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 2111);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MnHesse mnHesse0 = new MnHesse(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (-15.712290473208391), 0.03, 0.03, 0.03).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = 313.3432004;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1728.06475378706));
      MinimumState minimumState0 = new MinimumState(1);
      mnHesse0.calculate(mnFcn0, minimumState0, mnUserTransformation0, 2109);
      MinimumState minimumState1 = new MinimumState(1);
      MnHesse mnHesse1 = new MnHesse(2099);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      mnHesse0.calculate(fCNBase1, mnUserParameters0);
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase2).valueOf(any(double[].class));
      mnHesse1.calculate(fCNBase2, mnUserParameters0);
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance(0);
      FCNBase fCNBase3 = null;
      MnStrategy mnStrategy0 = new MnStrategy();
      MnHesse mnHesse2 = new MnHesse(mnStrategy0);
      // Undeclared exception!
      try { 
        mnHesse2.calculate((FCNBase) null, doubleArray0, mnUserCovariance0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserParameterState", e);
      }
  }
}