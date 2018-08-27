/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 16:18:25 GMT 2018
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
import org.freehep.math.minuit.MnApplication;
import org.freehep.math.minuit.MnMinos;
import org.freehep.math.minuit.MnUserTransformation;
import org.freehep.math.minuit.Point;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnMinos_ESTest extends MnMinos_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MinimumState minimumState0 = new MinimumState(5);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 5);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.loval(5, (double) 5, 5);
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
      MinimumState minimumState0 = new MinimumState(5);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 5);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.minos(5);
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
      MinimumState minimumState0 = new MinimumState(5);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 5);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.upval(5);
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
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1395);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 1395);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1395, 1395);
      double[] doubleArray0 = new double[7];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 1395);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      MnApplication.DEFAULT_MAXFCN = 1395;
      // Undeclared exception!
      mnMinos0.upval(1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1395);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 1395);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1395, 1395);
      double[] doubleArray0 = new double[3];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 0.0);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      mnMinos0.loval(1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1395);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 1395);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1395, 1395);
      double[] doubleArray0 = new double[7];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 1395);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      MnApplication.DEFAULT_MAXFCN = 1395;
      // Undeclared exception!
      mnMinos0.loval(1, (double) 1395);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(4);
      MnAlgebraicVector mnAlgebraicVector1 = mnUserTransformation0.transform(mnAlgebraicVector0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, 1388);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1388, 4);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 1388);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      mnMinos0.range(4);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(5);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 5);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 5, 5);
      double[] doubleArray0 = new double[4];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 5);
      mnUserTransformation0.fix(1);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.lower(1);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = (double) 1388;
      doubleArray0[6] = (double) 1388;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(4);
      MnAlgebraicVector mnAlgebraicVector1 = mnUserTransformation0.transform(mnAlgebraicVector0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, 0.0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 947.98218426, 4);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 1388.0, (-1810.2505784260254), (double)1388).when(fCNBase0).valueOf(any(double[].class));
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 1388);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      mnMinos0.range(1);
      // Undeclared exception!
      try { 
        mnMinos0.upper(1388, (-1810.2505784260254), (-522));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1388, Size: 7
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(4);
      MnAlgebraicVector mnAlgebraicVector1 = mnUserTransformation0.transform(mnAlgebraicVector0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, 947.98218426);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 2048.897836052, 4);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation(doubleArray0, doubleArray0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 4);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(947.98218426, (double)4, (double)4, 947.98218426, 947.98218426).when(fCNBase0).valueOf(any(double[].class));
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      mnMinos0.lower(4);
      double double0 = mnMinos0.upper(4, 947.98218426, 4);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(4);
      MnAlgebraicVector mnAlgebraicVector1 = mnUserTransformation0.transform(mnAlgebraicVector0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, 947.98218426);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 2048.897836052, 4);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation(doubleArray0, doubleArray0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 4);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      mnAlgebraicVector1.clone();
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      Point point0 = mnMinos0.range(4, 947.98218426, 4);
      assertEquals(0.0, point0.second, 0.01);
      assertEquals(-0.0, point0.first, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 947.98218426).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 947.98218426;
      doubleArray0[1] = 0.1;
      doubleArray0[3] = (double) 1388;
      doubleArray0[4] = (double) 1388;
      doubleArray0[6] = (double) 1388;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(4);
      MnAlgebraicVector mnAlgebraicVector1 = mnUserTransformation0.transform(mnAlgebraicVector0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, 0.0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 947.98218426, 4);
      MnUserTransformation mnUserTransformation1 = mnUserTransformation0.clone();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation1);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 947.98218426);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      double double0 = mnMinos0.upper(4);
      double double1 = mnMinos0.lower(4);
      assertEquals(-0.0, double1, 0.01);
      assertEquals(double1, double0, 0.01);
  }
}
