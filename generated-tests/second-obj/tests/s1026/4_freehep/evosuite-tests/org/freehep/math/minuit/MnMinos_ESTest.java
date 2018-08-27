/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 11:37:41 GMT 2018
 */

package org.freehep.math.minuit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.freehep.math.minuit.FCNBase;
import org.freehep.math.minuit.FunctionGradient;
import org.freehep.math.minuit.FunctionMinimum;
import org.freehep.math.minuit.MinimumError;
import org.freehep.math.minuit.MinimumParameters;
import org.freehep.math.minuit.MinimumSeed;
import org.freehep.math.minuit.MinimumState;
import org.freehep.math.minuit.MnAlgebraicSymMatrix;
import org.freehep.math.minuit.MnAlgebraicVector;
import org.freehep.math.minuit.MnApplication;
import org.freehep.math.minuit.MnMinos;
import org.freehep.math.minuit.MnStrategy;
import org.freehep.math.minuit.MnUserTransformation;
import org.freehep.math.minuit.Point;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnMinos_ESTest extends MnMinos_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnMinos mnMinos0 = new MnMinos(fCNBase0, (FunctionMinimum) null);
      // Undeclared exception!
      try { 
        mnMinos0.upval(7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnMinos", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      int int0 = 0;
      MinimumState minimumState0 = new MinimumState(0);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      linkedList0.add(minimumState0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, linkedList0, 0);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, (-1627));
      int int1 = 2;
      // Undeclared exception!
      try { 
        mnMinos0.upval(21);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MinimumParameters minimumParameters0 = new MinimumParameters(2239);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 2239, 2239);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 2239);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.minos((-508), (-3017.82346457));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MinimumState minimumState0 = new MinimumState(1);
      MinimumState minimumState1 = new MinimumState(974);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState1, (MnUserTransformation) null);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 974);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.loval((-1199));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnMinos mnMinos0 = new MnMinos(fCNBase0, (FunctionMinimum) null);
      int int0 = 4484;
      // Undeclared exception!
      try { 
        mnMinos0.minos(4484);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnMinos", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = (-2293);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnMinos mnMinos0 = new MnMinos(fCNBase0, (FunctionMinimum) null);
      // Undeclared exception!
      try { 
        mnMinos0.upper((-2287));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnMinos", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, (FunctionMinimum) null);
      // Undeclared exception!
      try { 
        mnMinos0.range((-793));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnMinos", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1360);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 0.0);
      int int0 = 0;
      MinimumError minimumError0 = new MinimumError(0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 0, 0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, (MnUserTransformation) null);
      MinimumSeed minimumSeed1 = new MinimumSeed(minimumState0, (MnUserTransformation) null);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed1, (-2240.009516103754));
      MnStrategy mnStrategy0 = new MnStrategy();
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.upval(1543, 0.0);
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
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-28.435445808350863), (-1535.0107385044455), 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1360);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 0.0);
      MinimumError minimumError0 = new MinimumError(0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 0, 0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 0.0;
      minimumState0.vec();
      MnAlgebraicVector mnAlgebraicVector1 = new MnAlgebraicVector(1360);
      minimumError0.matrix();
      mnAlgebraicVector0.toString();
      minimumError0.hessian();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 0);
      MnStrategy mnStrategy0 = new MnStrategy(1360);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      int int0 = 0;
      // Undeclared exception!
      try { 
        mnMinos0.range(0, 2.0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      int int0 = 1360;
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1360);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 684.21663709061);
      int int1 = 0;
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      mnAlgebraicVector0.clone();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 684.21663709061, 0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 228.91481583);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.minos((-1170), (double) 1360);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1360);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1360);
      int int0 = 2;
      MinimumError minimumError0 = new MinimumError(2);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 2, 2);
      minimumError0.matrix();
      double[] doubleArray0 = new double[10];
      doubleArray0[0] = (double) 1360;
      MnAlgebraicVector mnAlgebraicVector1 = new MnAlgebraicVector(2);
      doubleArray0[2] = (double) 1360;
      minimumError0.hessian();
      MnStrategy mnStrategy0 = new MnStrategy((-959));
      MnStrategy mnStrategy1 = new MnStrategy();
      mnStrategy1.setHighStrategy();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 1360.0);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.loval((-1000), (double) 1360);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(366.240855, 1.0, 366.240855, (-2760.686990235968), (-2036.17608216074)).when(fCNBase0).valueOf(any(double[].class));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1360);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1360);
      MinimumError minimumError0 = new MinimumError(2);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 2, 2);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 2;
      MnAlgebraicVector mnAlgebraicVector1 = new MnAlgebraicVector(2);
      minimumError0.matrix();
      doubleArray0[1] = (double) 1360;
      doubleArray0[3] = (-2036.17608216074);
      mnAlgebraicVector0.toString();
      doubleArray0[1] = (double) 2;
      doubleArray0[5] = (double) 1360;
      doubleArray0[7] = (double) 1360;
      minimumError0.hessian();
      doubleArray0[8] = (double) 1360;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 1.0E-35);
      MnStrategy mnStrategy0 = new MnStrategy(2);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.range(0, 2.0);
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
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2683.0558669252323), (-2683.0558669252323), 0.1, (-2683.0558669252323), 3051.26445038562).when(fCNBase0).valueOf(any(double[].class));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1379);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 684.21663709061);
      MinimumError minimumError0 = new MinimumError(0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 0, 0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 684.21663709061;
      MnAlgebraicVector mnAlgebraicVector1 = new MnAlgebraicVector(0);
      doubleArray0[2] = 684.21663709061;
      doubleArray0[3] = 2641.148;
      doubleArray0[4] = (double) 0;
      mnAlgebraicVector0.toString();
      doubleArray0[5] = 684.21663709061;
      doubleArray0[7] = (double) 1379;
      doubleArray0[8] = (double) 1379;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 1.0E-35);
      List<MinimumState> list0 = functionMinimum0.states();
      FunctionMinimum functionMinimum1 = new FunctionMinimum(minimumSeed0, list0, 1379);
      functionMinimum1.states();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      MnApplication.DEFAULT_STRATEGY = 0;
      mnMinos0.lower(0);
      // Undeclared exception!
      mnMinos0.range(0, 684.21663709061);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.1, (-4529.6549), 0.1, (-2504.0395), (-2504.0395)).when(fCNBase0).valueOf(any(double[].class));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1360);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 684.21663709061);
      MinimumError minimumError0 = new MinimumError(0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 0, 0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 684.21663709061;
      MnAlgebraicVector mnAlgebraicVector1 = new MnAlgebraicVector(0);
      doubleArray0[1] = 684.21663709061;
      doubleArray0[2] = 684.21663709061;
      doubleArray0[3] = 2641.148;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = 684.21663709061;
      doubleArray0[6] = (double) 0;
      doubleArray0[7] = (double) 1360;
      doubleArray0[8] = (double) 1360;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 1.0E-35);
      List<MinimumState> list0 = functionMinimum0.states();
      FunctionMinimum functionMinimum1 = new FunctionMinimum(minimumSeed0, list0, 1360);
      functionMinimum1.states();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      Point point0 = mnMinos0.range(0, 684.21663709061);
      assertEquals(Double.NaN, point0.second, 0.01);
      assertEquals(Double.NaN, point0.first, 0.01);
      
      FunctionMinimum functionMinimum2 = new FunctionMinimum(minimumSeed0, 684.21663709061);
      mnMinos0.loval(0);
      double double0 = mnMinos0.upper(0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1360);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 684.21663709061);
      MinimumError minimumError0 = new MinimumError(0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 0, 0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 684.21663709061;
      MnAlgebraicVector mnAlgebraicVector1 = new MnAlgebraicVector(0);
      MnAlgebraicVector mnAlgebraicVector2 = new MnAlgebraicVector(1360);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum.MnReachedCallLimit functionMinimum_MnReachedCallLimit0 = new FunctionMinimum.MnReachedCallLimit();
      mnAlgebraicVector0.clone();
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 1360);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnStrategy mnStrategy0 = new MnStrategy(0);
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, (-994.6947482814267), 1000.0, 72.40848).when(fCNBase2).valueOf(any(double[].class));
      MnMinos mnMinos0 = new MnMinos(fCNBase2, functionMinimum0);
      mnMinos0.minos(0, (double) 0, 1);
      double double0 = mnMinos0.upper(1, (-2550.7), 1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = (-1535.23588);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 4.0E-7, (-1535.23588), 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      int int0 = 1360;
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1360);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 684.21663709061);
      MinimumError minimumError0 = new MinimumError(0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 0, 0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 684.21663709061;
      minimumError0.hessian();
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 0.0);
      FunctionMinimum functionMinimum1 = new FunctionMinimum(minimumSeed0, 4.0E-7);
      List<MinimumState> list0 = functionMinimum1.states();
      FunctionMinimum functionMinimum2 = new FunctionMinimum(minimumSeed0, list0, 684.21663709061);
      functionMinimum2.states();
      MnStrategy mnStrategy0 = new MnStrategy(1764);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum2, mnStrategy0);
      int int1 = 1;
      // Undeclared exception!
      try { 
        mnMinos0.range(1, 0.0, 1360);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-28.435445808350863), (-1535.23588), 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1360);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 0.0);
      MinimumError minimumError0 = new MinimumError(0);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 0, 0);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 0.0;
      MnAlgebraicVector mnAlgebraicVector1 = new MnAlgebraicVector(0);
      MnAlgebraicVector mnAlgebraicVector2 = new MnAlgebraicVector(1360);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 2641.148);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      List<MinimumState> list0 = functionMinimum0.states();
      FunctionMinimum functionMinimum1 = new FunctionMinimum(minimumSeed0, list0, 0.0);
      functionMinimum0.states();
      FunctionMinimum functionMinimum2 = new FunctionMinimum(minimumSeed0, list0, 0.0);
      FunctionMinimum functionMinimum3 = new FunctionMinimum(minimumSeed0, 1360);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum1, 1360);
      functionMinimum0.toString();
      mnUserTransformation0.setLowerLimit(6, (-1601.29));
      mnMinos0.lower(0);
      double double0 = mnMinos0.upper(6);
      assertEquals((-1601.29), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1360);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1360);
      MinimumError minimumError0 = new MinimumError(2);
      FunctionGradient functionGradient0 = new FunctionGradient(mnAlgebraicVector0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 2, 2);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 2;
      MnAlgebraicVector mnAlgebraicVector1 = new MnAlgebraicVector(2);
      minimumError0.matrix();
      doubleArray0[1] = (double) 1360;
      doubleArray0[2] = (double) 1360;
      doubleArray0[3] = 2641.148;
      mnAlgebraicVector0.toString();
      doubleArray0[4] = (double) 2;
      doubleArray0[5] = (double) 1360;
      doubleArray0[6] = (double) 1360;
      doubleArray0[7] = (double) 1360;
      minimumError0.hessian();
      doubleArray0[8] = (double) 1360;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 1.0E-35);
      MnStrategy mnStrategy0 = new MnStrategy(2);
      mnStrategy0.setMediumStrategy();
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.lower(2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }
}
