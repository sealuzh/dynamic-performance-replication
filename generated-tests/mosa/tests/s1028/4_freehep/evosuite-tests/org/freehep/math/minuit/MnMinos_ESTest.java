/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 19:06:14 GMT 2018
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
import org.freehep.math.minuit.FunctionMinimum;
import org.freehep.math.minuit.MinimumParameters;
import org.freehep.math.minuit.MinimumSeed;
import org.freehep.math.minuit.MinimumState;
import org.freehep.math.minuit.MnAlgebraicVector;
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
      MinimumState minimumState0 = new MinimumState(100);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 100);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.range(100);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MinimumState minimumState0 = new MinimumState(100);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 100);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.loval(100);
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
      MinimumState minimumState0 = new MinimumState(100);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 100);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.upval(100);
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
      int int0 = 100;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 100);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 100, 100);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 100);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.upval(100);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 100, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.1, 0.1, 0.1, 0.1, 0.1).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[8];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(4);
      MnAlgebraicVector mnAlgebraicVector1 = mnUserTransformation0.transform(mnAlgebraicVector0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, mnAlgebraicVector1, 0.0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 0.0, 4);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 4);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      mnMinos0.minos(4);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.1, 0.1, 0.1, 0.1, 0.1).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MnAlgebraicVector mnAlgebraicVector1 = mnUserTransformation0.transform(mnAlgebraicVector0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, mnAlgebraicVector1, 0.0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 0.0, 1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 0.1);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      Point point0 = mnMinos0.range(1, (double) 1, 1);
      assertEquals(-0.0, point0.first, 0.01);
      assertEquals(0.0, point0.second, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.1, 0.1, 0.1, 0.1, 0.1).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MnAlgebraicVector mnAlgebraicVector1 = mnUserTransformation0.transform(mnAlgebraicVector0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, mnAlgebraicVector1, 0.0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 0.0, 1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 0.1);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      Point point0 = mnMinos0.range(1);
      assertEquals(-0.0, point0.first, 0.01);
      assertEquals(0.0, point0.second, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MnAlgebraicVector mnAlgebraicVector1 = mnUserTransformation0.transform(mnAlgebraicVector0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, mnAlgebraicVector1, 0.0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 0.0, 1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 0.0);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      mnMinos0.lower(1);
      // Undeclared exception!
      mnMinos0.range(1, 0.0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (double) 10;
      doubleArray0[0] = (double) 10;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(4);
      MnAlgebraicVector mnAlgebraicVector1 = mnUserTransformation0.transform(mnAlgebraicVector0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, mnAlgebraicVector1, 0.0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 10.0, 4);
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation1);
      mnUserTransformation0.errors();
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 10);
      mnUserTransformation1.fix(4);
      functionMinimum0.userCovariance();
      MnStrategy mnStrategy0 = new MnStrategy(4);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.upper(4, 0.1, 4);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.1, 0.1, 0.1, 0.1, 0.1).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MnAlgebraicVector mnAlgebraicVector1 = mnUserTransformation0.transform(mnAlgebraicVector0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, mnAlgebraicVector1, 0.0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 0.0, 1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 0.1);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      double double0 = mnMinos0.upper(1, (double) 1, 1);
      assertEquals(0.0, double0, 0.01);
      
      double double1 = mnMinos0.lower(1);
      assertEquals(-0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.1, 0.1, 0.1, 0.1, 0.1).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MnAlgebraicVector mnAlgebraicVector1 = mnUserTransformation0.transform(mnAlgebraicVector0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, mnAlgebraicVector1, 0.0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 0.0, 1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 0.1);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      mnMinos0.loval(1);
      double double0 = mnMinos0.upper(1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[7];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MnAlgebraicVector mnAlgebraicVector1 = mnUserTransformation0.transform(mnAlgebraicVector0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, mnAlgebraicVector1, 0.0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 0.0, 1);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      mnUserTransformation0.fix(1);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 0.1);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.range(1);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
