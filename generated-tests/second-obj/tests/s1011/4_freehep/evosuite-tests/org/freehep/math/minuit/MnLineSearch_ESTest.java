/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 23:57:23 GMT 2018
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
      doReturn((-515.1641253913585)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-515.1641253913585));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(0.0);
      MinimumParameters minimumParameters0 = new MinimumParameters(12);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-515.1641253913585), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      MinimumParameters minimumParameters0 = new MinimumParameters(12);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2.0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2.0, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 612.396754);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      MinimumParameters minimumParameters0 = new MinimumParameters(12);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)12, (double)12, (-1950.3013), (-1950.3013), 0.11265390831836097).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2.0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2.0, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.8369047619047619);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2785);
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, 0.8369047619047619);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1557.3, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-185.402), (-185.402), 1208.59190625786, 2.0, 2.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 0.0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1.3500000000000003, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-185.402), (-185.402), (-185.402)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, (-185.402));
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1.3500000000000003, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.05, 1.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.8369047619047619);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2785);
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, 0.8369047619047619);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2785, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1763.39647135));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(598);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, (-1763.39647135));
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(0.05);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-2814.73), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-515.1641253913585), 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-515.1641253913585));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MinimumParameters minimumParameters0 = new MinimumParameters(12);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-515.1641253913585), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-185.402), (-185.402), 1208.59190625786, 2.0, 2.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, (-185.402));
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1.3500000000000003, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1825.03102510259, 1825.03102510259, 1825.03102510259, 1825.03102510259, 2293.97339).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1825.03102510259);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 12);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnFcn0.valueOf(mnAlgebraicVector0);
      mnMachinePrecision0.setPrecision(0.0);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 12, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.2, 0.2, 0.2).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(9);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 0.2);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(0.2);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 9, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1821.4454390138403, 1821.4454390138403, 1821.4454390138403, 1821.4454390138403, 1821.4454390138403).when(fCNBase0).valueOf(any(double[].class));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 12);
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1141.80175);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1821.4454390138403, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-3606.235), (-3606.235), 13158.968010487504, (-3606.235), 13158.968010487504).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 13158.968010487504);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      MnAlgebraicVector mnAlgebraicVector2 = mnAlgebraicVector1.clone();
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, mnAlgebraicVector0, 1000.0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(0);
      MnAlgebraicVector mnAlgebraicVector3 = mnAlgebraicVector0.clone();
      MinimumParameters minimumParameters1 = new MinimumParameters(mnAlgebraicVector3, (MnAlgebraicVector) null, 2.25);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters1, mnAlgebraicVector2, (-923.6579), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.2, 0.2, (-1.0)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      mnFcn0.theNumCall = (-1497);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(9);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 9);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(0.0);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 9, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-515.1641253913585), 1298.6848133403923, (-515.1641253913585), 1786.154238275, 1786.154238275).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1298.6848133403923);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1409);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, (-23.868353875568623));
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector1, 1786.154238275, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1825.03102510259, 1825.03102510259, 1825.03102510259, 1825.03102510259, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1825.03102510259);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 1825.03102510259);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnFcn0.valueOf(mnAlgebraicVector0);
      mnMachinePrecision0.setPrecision((-3670.78200595));
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1825.03102510259, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1317.850976009), 557.5583, 0.5, 8.881784197001252E-16, 2.3986248899768916).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 612.396754);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.2, 0.2, 5.293955920339377E-23, (-357.4914364052644)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 10.95394399819638);
      mnFcn0.theNumCall = (-1497);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision((-4.440892098500626E-16));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, mnAlgebraicVector1, (-1497));
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 12, mnMachinePrecision0);
      MinimumParameters minimumParameters1 = new MinimumParameters(1510);
      // Undeclared exception!
      try { 
        MnLineSearch.search(mnFcn0, minimumParameters1, mnAlgebraicVector1, (-1497), mnMachinePrecision0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Incompatible vectors
         //
         verifyException("org.freehep.math.minuit.MnUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = 8.0;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(8.0, (-1690.0900929166598), (-1690.0900929166598), (-1690.0900929166598), 8.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      double double1 = 1095.31;
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 8.0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision((-2206.17532646));
      double double2 = 1005.13289397802;
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1005.13289397802, mnMachinePrecision0);
      MinimumParameters minimumParameters1 = new MinimumParameters(12);
      MnLineSearch.search(mnFcn0, minimumParameters1, mnAlgebraicVector0, (-232.438743144), mnMachinePrecision0);
      MnLineSearch.search(mnFcn0, minimumParameters1, mnAlgebraicVector0, 12, mnMachinePrecision0);
      MnMachinePrecision mnMachinePrecision1 = new MnMachinePrecision();
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-1690.0900929166598), mnMachinePrecision1);
      MnLineSearch.search(mnFcn0, minimumParameters1, mnAlgebraicVector0, 12, mnMachinePrecision1);
      MinimumParameters minimumParameters2 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1095.31);
      MnAlgebraicVector mnAlgebraicVector1 = null;
      try {
        mnAlgebraicVector1 = new MnAlgebraicVector((-600878));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicVector", e);
      }
  }
}