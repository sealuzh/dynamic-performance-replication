/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 22:28:10 GMT 2019
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
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 5.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1857);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 5.0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1857, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 1.0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnFcn mnFcn0 = new MnFcn((FCNBase) null, 3530.299847);
      // Undeclared exception!
      try { 
        MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1, mnMachinePrecision0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(221.74989245778684, (-110.447436), 221.74989245778684, (-2371.145263023293), (-69.9645426044)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 3753.35109);
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2601.6804, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.19999999999999984, (-637.0), 1182.48712577081, 7.812500646409148E-10, 7285.3664872).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 2.4792815170079026);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2, mnMachinePrecision0);
      mnMachinePrecision0.setPrecision(0.0);
      MnParabolaPoint mnParabolaPoint1 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 4.0, mnMachinePrecision0);
      assertNotSame(mnParabolaPoint1, mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-839.677), 1259.6251, 1259.6251, 1259.6251).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 3.0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1738.0479351, 3068.828284828306, 5.0, 138.106668211, 0.5).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 3.0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2, mnMachinePrecision0);
      mnMachinePrecision0.setPrecision(0.0);
      MnParabolaPoint mnParabolaPoint1 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.0, mnMachinePrecision0);
      assertNotSame(mnParabolaPoint1, mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(358.5260342273, (-2236.2), 358.5260342273, 1.0, (-1708.43918019499)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.0);
      MinimumParameters minimumParameters0 = new MinimumParameters(100);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1668.4588045041066, mnMachinePrecision0);
      MnParabolaPoint mnParabolaPoint1 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-3599.22399), mnMachinePrecision0);
      assertNotSame(mnParabolaPoint1, mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 562.8);
      MinimumParameters minimumParameters0 = new MinimumParameters(4);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(4);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(4);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1202.74728051319, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.907348632775249E-22);
      MinimumParameters minimumParameters0 = new MinimumParameters(5);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(5);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1.907348632775249E-22, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1015.302871344), (-1015.302871344), (-1015.302871344), (-1015.302871344), (-1015.302871344)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1.0);
      MinimumParameters minimumParameters0 = new MinimumParameters(100);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision((-1279.309648));
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 4.0E-7, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-275.461183152));
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3034);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      try { 
        MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-275.461183152), mnMachinePrecision0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Incompatible vectors
         //
         verifyException("org.freehep.math.minuit.MnUtils", e);
      }
  }
}
