/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 00:57:14 GMT 2019
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
import org.freehep.math.minuit.FunctionMinimum;
import org.freehep.math.minuit.MinimumParameters;
import org.freehep.math.minuit.MinimumSeed;
import org.freehep.math.minuit.MinimumState;
import org.freehep.math.minuit.MnAlgebraicVector;
import org.freehep.math.minuit.MnMinos;
import org.freehep.math.minuit.MnStrategy;
import org.freehep.math.minuit.MnUserTransformation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnMinos_ESTest extends MnMinos_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 0, 0);
      double[] doubleArray0 = new double[2];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      FunctionMinimum.MnAboveMaxEdm functionMinimum_MnAboveMaxEdm0 = new FunctionMinimum.MnAboveMaxEdm();
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, linkedList0, 0.0, functionMinimum_MnAboveMaxEdm0);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.lower(0, (-1656.533), 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MinimumState minimumState0 = new MinimumState(1612);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, (MnUserTransformation) null);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 1612);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.loval(1612, (-54.0593291117));
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
      MinimumState minimumState0 = new MinimumState(1);
      double[] doubleArray0 = new double[7];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 0.0);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, 1);
      // Undeclared exception!
      try { 
        mnMinos0.minos(1, 0.0, 1);
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
      MnMinos mnMinos0 = new MnMinos(fCNBase0, (FunctionMinimum) null, 1);
      // Undeclared exception!
      try { 
        mnMinos0.loval(1, 0.0);
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
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      FunctionMinimum.MnReachedCallLimit functionMinimum_MnReachedCallLimit0 = new FunctionMinimum.MnReachedCallLimit();
      FunctionMinimum functionMinimum0 = new FunctionMinimum((MinimumSeed) null, linkedList0, (-1.0), functionMinimum_MnReachedCallLimit0);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.upper(5, (-658.2753704333));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnMinos mnMinos0 = new MnMinos(fCNBase0, (FunctionMinimum) null);
      // Undeclared exception!
      try { 
        mnMinos0.range(928, (double) 928, 7);
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
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed((MinimumState) null, mnUserTransformation0);
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 4157.11613907, 0);
      linkedList0.add(minimumState0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, linkedList0, (-2121.388672127));
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, 0);
      // Undeclared exception!
      try { 
        mnMinos0.upval(0, 2354.5446, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 1.0, 0);
      double[] doubleArray0 = new double[9];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 1.0);
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.loval(0, 1.0, (-214));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed((MinimumState) null, mnUserTransformation0);
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 4157.11613907, 0);
      linkedList0.add(minimumState0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, linkedList0, (-2121.388672127));
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0, 0);
      // Undeclared exception!
      try { 
        mnMinos0.loval(2331);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2331, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed((MinimumState) null, mnUserTransformation0);
      LinkedList<MinimumState> linkedList0 = new LinkedList<MinimumState>();
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 0);
      MinimumState minimumState0 = new MinimumState(minimumParameters0, 4157.11613907, 0);
      linkedList0.add(minimumState0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, linkedList0, (-2121.388672127));
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.minos(100);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 100, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MinimumState minimumState0 = new MinimumState(2942);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, 2942);
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.upval(2942);
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
      MinimumState minimumState0 = new MinimumState(1);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, mnUserTransformation0);
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, (-1.0));
      MnMinos mnMinos0 = new MnMinos(fCNBase0, functionMinimum0);
      // Undeclared exception!
      try { 
        mnMinos0.minos(1);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(0);
      MinimumSeed minimumSeed0 = new MinimumSeed(minimumState0, (MnUserTransformation) null);
      FunctionMinimum.MnAboveMaxEdm functionMinimum_MnAboveMaxEdm0 = new FunctionMinimum.MnAboveMaxEdm();
      FunctionMinimum functionMinimum0 = new FunctionMinimum(minimumSeed0, (List<MinimumState>) null, (-491.059), functionMinimum_MnAboveMaxEdm0);
      MnStrategy mnStrategy0 = new MnStrategy((-2335));
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, functionMinimum0, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.lower((-1610));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.FunctionMinimum", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnMinos mnMinos0 = new MnMinos(fCNBase0, (FunctionMinimum) null, (-971));
      // Undeclared exception!
      try { 
        mnMinos0.upper((-971));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnMinos", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy((-1387));
      MnMinos mnMinos0 = new MnMinos((FCNBase) null, (FunctionMinimum) null, mnStrategy0);
      // Undeclared exception!
      try { 
        mnMinos0.range((-1387));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnMinos", e);
      }
  }
}
