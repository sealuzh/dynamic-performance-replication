/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 19:21:49 GMT 2019
 */

package org.freehep.math.minuit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.freehep.math.minuit.FCNBase;
import org.freehep.math.minuit.MinimumParameters;
import org.freehep.math.minuit.MnAlgebraicVector;
import org.freehep.math.minuit.MnFcn;
import org.freehep.math.minuit.MnLineSearch;
import org.freehep.math.minuit.MnMachinePrecision;
import org.freehep.math.minuit.MnParabolaPoint;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnLineSearch_ESTest extends MnLineSearch_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MinimumParameters minimumParameters0 = new MinimumParameters(12);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      // Undeclared exception!
      try { 
        MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 12, (MnMachinePrecision) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnLineSearch", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      try { 
        MnLineSearch.search((MnFcn) null, minimumParameters0, mnAlgebraicVector0, (-2.0), mnMachinePrecision0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnLineSearch", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2787.290426489));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      try { 
        MnLineSearch.search(mnFcn0, (MinimumParameters) null, mnAlgebraicVector0, 744.3119646, mnMachinePrecision0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnLineSearch", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1014.98644304);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MinimumParameters minimumParameters0 = new MinimumParameters(809);
      // Undeclared exception!
      try { 
        MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2.863555702287338E-4, mnMachinePrecision0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Incompatible vectors
         //
         verifyException("org.freehep.math.minuit.MnUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1014.98644304);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1014.98644304);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision((-437.70454111));
      MnAlgebraicVector mnAlgebraicVector1 = new MnAlgebraicVector(802);
      // Undeclared exception!
      try { 
        MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector1, 2.863555702287338E-4, mnMachinePrecision0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.05, 0.05, 0.05, 0.25000000000000044, 0.25000000000000044).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2.0));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(794);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 794);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-2.0), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 1001.713956743676, (-2092.9355223), 0.0, 2884.888295349116).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1014.98644304);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3);
      mnFcn0.valueOf(mnAlgebraicVector0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1014.98644304);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1014.98644304, mnMachinePrecision0);
      MnParabolaPoint mnParabolaPoint1 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 3, mnMachinePrecision0);
      assertNotSame(mnParabolaPoint1, mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(4.0E-7, 1244.2657275, 4.0E-7, 8.0, 4.0E-7).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1014.98644304);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1014.98644304);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1014.98644304, mnMachinePrecision0);
      MnParabolaPoint mnParabolaPoint1 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-2328.86727), mnMachinePrecision0);
      assertNotSame(mnParabolaPoint1, mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(4.0E-7, 1244.2657275, 4.0E-7, 8.0, 4.0E-7).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1014.98644304);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1014.98644304);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1014.98644304, mnMachinePrecision0);
      mnMachinePrecision0.setPrecision((-437.70454111));
      MnParabolaPoint mnParabolaPoint1 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 272.0, mnMachinePrecision0);
      assertNotSame(mnParabolaPoint1, mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2027.594), 8.0, 8.0, 8.0, 8.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-964.9967));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(346);
      mnFcn0.valueOf(mnAlgebraicVector0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 8.0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-2027.594), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2.0);
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2787.290426489));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 2);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-4.0), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.0, 0.9981690948525785, 253.9183, (-3673.64359), (-871.3285)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1014.98644304);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1014.98644304);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 3, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 409.6);
      MinimumParameters minimumParameters0 = new MinimumParameters(812);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(812);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(1298.0);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-2.2), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), 744.3119646, (-1.0), (-1.0), 744.3119646).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2787.290426489));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 2);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision((-2787.290426489));
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.5000000000000002), (-100.0), (-100.0), (-100.0), 0.19999999999999984).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.47500000000000003);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(767);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, (-754.0));
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 6085.0095, mnMachinePrecision0);
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.5, mnMachinePrecision0);
  }
}
