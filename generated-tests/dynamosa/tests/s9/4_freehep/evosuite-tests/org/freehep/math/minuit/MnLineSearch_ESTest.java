/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 19:13:51 GMT 2019
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
      MnFcn mnFcn0 = new MnFcn((FCNBase) null, (-3373.9214488));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, (MnAlgebraicVector) null, 0);
      // Undeclared exception!
      try { 
        MnLineSearch.search(mnFcn0, minimumParameters0, (MnAlgebraicVector) null, 0, (MnMachinePrecision) null);
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
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 684.43764);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      try { 
        MnLineSearch.search(mnFcn0, (MinimumParameters) null, mnAlgebraicVector0, 684.43764, mnMachinePrecision0);
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
      doReturn((-1866.229), (-1866.229), (-1866.229), 4.0E-7, 4.0E-7).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 100);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 100, mnMachinePrecision0);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 100, mnMachinePrecision0);
      mnMachinePrecision0.setPrecision(0.0);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.05, mnMachinePrecision0);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 100, mnMachinePrecision0);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 100, mnMachinePrecision0);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.05, mnMachinePrecision0);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.05, mnMachinePrecision0);
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.0, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(17);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(17);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      try { 
        MnLineSearch.search((MnFcn) null, minimumParameters0, mnAlgebraicVector0, (-2.475000000000001), mnMachinePrecision0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnLineSearch", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MinimumParameters minimumParameters0 = new MinimumParameters(2);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      // Undeclared exception!
      try { 
        MnLineSearch.search((MnFcn) null, minimumParameters0, mnAlgebraicVector0, 12, mnMachinePrecision0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Incompatible vectors
         //
         verifyException("org.freehep.math.minuit.MnUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(17);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(142);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision((-102.85718566));
      // Undeclared exception!
      try { 
        MnLineSearch.search((MnFcn) null, minimumParameters0, mnAlgebraicVector0, 17, mnMachinePrecision0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-15.935225071678042), (double)0, (-15.935225071678042), (double)0, (double)0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-4226.89756048404), (-4226.89756048404), (-4226.89756048404), (-2896.96), (-2896.96)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.007421875);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(40);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 40);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision((-1271.74351919299));
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.007421875, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(53);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-999.4868915136967), (-999.4868915136967), (-999.4868915136967), (double)53, (-999.4868915136967)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 53);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(53);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 53, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1881.432, 3027.556, 3027.556, 3027.556, (-389.72)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 100);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 100, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(53);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2101.654325071404), (-2101.654325071404), (double)53, (-2333.7036972), (-2333.7036972)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 53);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(53);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 53, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1885.0157268797968, 1885.0157268797968, 1885.0157268797968, 1885.0157268797968, (-389.72)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MinimumParameters minimumParameters0 = new MinimumParameters(100);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 100, mnMachinePrecision0);
      mnMachinePrecision0.setPrecision(0.0);
      MnParabolaPoint mnParabolaPoint1 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1885.0157268797968, mnMachinePrecision0);
      assertFalse(mnParabolaPoint1.equals((Object)mnParabolaPoint0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(53);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)53, 235.0, (double)53, 235.0, (double)53).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 53);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(53);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 53, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1885.0157268797968, 1885.0157268797968, 1885.0157268797968, 1885.0157268797968, (-389.72)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 8.0);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-543.993145144689), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 2269.84774832);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2269.84774832);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-4494.3132), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(53);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)53).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 53);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(53);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(53);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 53, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1885.0157268797968, 1885.0157268797968, 1885.0157268797968, 1885.0157268797968, (-389.72)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MinimumParameters minimumParameters0 = new MinimumParameters(100);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(0.0);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1885.0157268797968, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }
}
