/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 09:26:30 GMT 2019
 */

package org.freehep.math.minuit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
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
import org.freehep.math.minuit.MinosError;
import org.freehep.math.minuit.MnAlgebraicVector;
import org.freehep.math.minuit.MnMinos;
import org.freehep.math.minuit.MnStrategy;
import org.freehep.math.minuit.MnUserTransformation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnMinos_ESTest extends MnMinos_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(5);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, (-6589.76782));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 3603.1247, 0);
      double[] doubleArray0 = new double[5];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 3972.617162954862);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0, 0.0, (double)1, (-4345.73983736357), (double)2375).when(fCNBase0).valueOf(any(double[].class));
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      MinosError minosError0 = mnMinos0.minos(0);
      assertEquals(544, minosError0.nfcn());
      assertEquals(0, minosError0.parameter());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[8];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed((MinimumState) null, mnUserTransformation0);
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, linkedList0, (-2620.2));
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.upper(6, (-5229.5909765075685), 6);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(5);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, (-6589.76782));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 3603.1247, 0);
      double[] doubleArray0 = new double[5];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 3972.617162954862);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.minos(5);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 5, Size: 5
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnStrategy mnStrategy0 = new MnStrategy();
      MnMinos mnMinos0 = new MnMinos(fCNBase0, (FunctionMinimum) null, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.lower(1778, (double) 1778);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnMinos", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3273);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 0.0);
      MinimumError minimumError0 = new MinimumError(1);
      FunctionGradient functionGradient0 = new FunctionGradient(3273);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, minimumError0, functionGradient0, 0.0, 1);
      double[] doubleArray0 = new double[7];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 706.97184392);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.range(1, (-3534.00953), (-1223));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(5);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, (-6589.76782));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 3603.1247, 0);
      double[] doubleArray0 = new double[5];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 3972.617162954862);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 3972.617162954862, (-646.0), 3972.617162954862, (-2571.083194)).when(fCNBase0).valueOf(any(double[].class));
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      MinosError minosError0 = mnMinos0.minos(0, (-6589.76782));
      assertEquals(0, minosError0.parameter());
      assertEquals(561, minosError0.nfcn());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(200);
      double[] doubleArray0 = new double[3];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, (-286.658339));
      MnStrategy mnStrategy0 = new MnStrategy();
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.loval(200, (double) 200);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(1);
      double[] doubleArray0 = new double[0];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 1);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.range(1, (double) 1, 1);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(1177);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      FunctionMinimum.MnAboveMaxEdm functionMinimum_MnAboveMaxEdm0 = new FunctionMinimum.MnAboveMaxEdm();
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, linkedList0, 1177, functionMinimum_MnAboveMaxEdm0);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.loval((-1992));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(4953);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, (MnUserTransformation) null);
      FunctionMinimum.MnReachedCallLimit functionMinimum_MnReachedCallLimit0 = new FunctionMinimum.MnReachedCallLimit();
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, (List<MinimumState>) null, 4953, functionMinimum_MnReachedCallLimit0);
      MnStrategy mnStrategy0 = new MnStrategy(4953);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.upper(1860);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(0);
      double[] doubleArray0 = new double[5];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 2539.53541539);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.upval(0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MinimumState minimumState0 = new MinimumState(280);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, (MnUserTransformation) null);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, (-1144.887714817));
      MnStrategy mnStrategy0 = new MnStrategy();
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.upval(1, 983.4585993);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(5);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, (-6589.76782));
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 3603.1247, 0);
      double[] doubleArray0 = new double[5];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 3972.617162954862);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 3972.617162954862, (-646.0), 3972.617162954862, (-2571.083194)).when(fCNBase0).valueOf(any(double[].class));
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      MinosError minosError0 = mnMinos0.minos(0);
      assertEquals(51, minosError0.nfcn());
      assertTrue(minosError0.isValid());
      assertEquals(0.0, minosError0.upper(), 0.01);
      assertEquals(-0.0, minosError0.lower(), 0.01);
      assertEquals(0, minosError0.parameter());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[5];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed((MinimumState) null, mnUserTransformation0);
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      FunctionMinimum.MnAboveMaxEdm functionMinimum_MnAboveMaxEdm0 = new FunctionMinimum.MnAboveMaxEdm();
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, linkedList0, 434.779, functionMinimum_MnAboveMaxEdm0);
      MnStrategy mnStrategy0 = new MnStrategy((-938));
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.lower((-938));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      FunctionMinimum.MnReachedCallLimit functionMinimum_MnReachedCallLimit0 = new FunctionMinimum.MnReachedCallLimit();
      FunctionMinimum functionMinimum0 = new FunctionMinimum((MinimumSeed) null, linkedList0, 120.994900803833, functionMinimum_MnReachedCallLimit0);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.upper((-1226), (double) (-1226));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnMinos mnMinos0 = new MnMinos(fCNBase0, (FunctionMinimum) null, 5);
      // Undeclared exception!
      try { 
        mnMinos0.range(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnMinos", e);
      }
  }
}
