/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 02:07:59 GMT 2018
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
import org.freehep.math.minuit.FunctionMinimum;
import org.freehep.math.minuit.MinimumParameters;
import org.freehep.math.minuit.MinimumSeed;
import org.freehep.math.minuit.MinimumState;
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
        mnMinos0.loval((-3811));
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
      MinimumState minimumState0 = new MinimumState(1);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 1);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, (-4178));
      // Undeclared exception!
      try { 
        mnMinos0.loval((-1028), (double) (-1028));
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
      MnMinos mnMinos0 = new MnMinos(fCNBase0, (FunctionMinimum) null, 0);
      // Undeclared exception!
      try { 
        mnMinos0.range(100);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnMinos", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MinimumParameters minimumParameters0 = new MinimumParameters(207);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 207, 7);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 7);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, 7);
      // Undeclared exception!
      try { 
        mnMinos0.minos(207);
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
      FunctionMinimum functionMinimum0 = new FunctionMinimum((MinimumSeed) null, (List<MinimumState>) null, 485.9600140948);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.upval(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.FunctionMinimum", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(27);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 0.0);
      functionMinimum0.states();
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0, 27);
      // Undeclared exception!
      try { 
        mnMinos0.upval(27, 0.0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(207);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 207);
      MinimumParameters minimumParameters1 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 207);
      MinimumState minimumState0 = new MinimumState(minimumParameters1, 207, 207);
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = 2367.4514941134803;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 0.0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      MnApplication.DEFAULT_STRATEGY = 1501;
      // Undeclared exception!
      mnMinos0.range(1, (double) 1501);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(207);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 207);
      MinimumParameters minimumParameters1 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 207);
      MinimumState minimumState0 = new MinimumState(minimumParameters1, 207, 207);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 0.0;
      doubleArray0[3] = 2367.4514941134803;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 0.0);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, 1501);
      // Undeclared exception!
      mnMinos0.upper(1, (double) 207, (-1664));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(207);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 207);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 2392.946725064938, 207);
      MnAlgebraicVector mnAlgebraicVector1 = minimumState0.vec();
      MinimumParameters minimumParameters1 = new MinimumParameters(mnAlgebraicVector1, mnAlgebraicVector1, 207);
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 207;
      doubleArray0[2] = 2392.946725064938;
      doubleArray0[3] = 2392.946725064938;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      mnUserTransformation0.add("M/t6zA9ZL5Xb", 1.0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, linkedList0, 207.0);
      functionMinimum0.add(minimumState0);
      linkedList0.parallelStream();
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, 1480);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setHighStrategy();
      mnStrategy0.setGradientNCycles(207);
      MnStrategy mnStrategy1 = new MnStrategy((-474));
      mnStrategy0.setGradientNCycles(1480);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnMinos mnMinos1 = new MnMinos(fCNBase1, functionMinimum0, mnStrategy1);
      // Undeclared exception!
      try { 
        mnMinos0.minos(5, (-1.0), 207);
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
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(5);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 5);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-1.0), 5);
      MnAlgebraicVector mnAlgebraicVector1 = minimumState0.vec();
      MinimumParameters minimumParameters1 = new MinimumParameters(mnAlgebraicVector1, mnAlgebraicVector1, 5);
      MinimumState minimumState1 = new MinimumState(minimumParameters1, (-1.0), 5);
      double[] doubleArray0 = new double[5];
      mnAlgebraicVector1.toString();
      doubleArray0[2] = (-1.0);
      doubleArray0[2] = 0.0;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 5);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, 4);
      mnMinos0.upper(4);
      // Undeclared exception!
      try { 
        mnMinos0.loval(5);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 5, Size: 5
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1887.51331199, 1887.51331199, 1887.51331199, 4.0E-7, 4.0E-7).when(fCNBase0).valueOf(any(double[].class));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(5);
      mnAlgebraicVector0.clone();
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 5);
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = (-1.0);
      doubleArray0[2] = 0.0;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1887.51331199, 5);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 1887.51331199);
      List<MinimumState> list0 = functionMinimum0.states();
      FunctionMinimum functionMinimum1 = new FunctionMinimum(minimumSeed0, list0, 76.9574544);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum1);
      mnMinos0.upval(1, (-1155.891));
      Point point0 = mnMinos0.range(1, (double) 5, 1);
      assertEquals(-0.0, point0.first, 0.01);
      assertEquals(0.0, point0.second, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1887.51331199, 1887.51331199, 1978.79403355, 1978.79403355, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(5);
      mnAlgebraicVector0.clone();
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 5);
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = (-1.0);
      doubleArray0[2] = 0.0;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1887.51331199, 5);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 1887.51331199);
      functionMinimum0.states();
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      mnMinos0.lower(1, 0.0, 5);
      // Undeclared exception!
      try { 
        mnMinos0.range(5, (-1200.9076));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 5, Size: 5
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.51, 0.51, (-0.1), 0.0, (-2228.9122818616565)).when(fCNBase0).valueOf(any(double[].class));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(5);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 5);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, (-1.0), 5);
      MnAlgebraicVector mnAlgebraicVector1 = minimumState0.vec();
      MinimumParameters minimumParameters1 = new MinimumParameters(mnAlgebraicVector1, mnAlgebraicVector1, 5);
      MinimumState minimumState1 = new MinimumState(minimumParameters1, (-1.0), 5);
      double[] doubleArray0 = new double[5];
      mnAlgebraicVector1.toString();
      doubleArray0[2] = (-1.0);
      doubleArray0[2] = 0.0;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 5);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, 4);
      double double0 = mnMinos0.upper(4);
      double double1 = mnMinos0.lower(4);
      assertEquals(double1, double0, 0.01);
  }
}