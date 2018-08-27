/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:27:30 GMT 2018
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
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2.0));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(892);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 892);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 892, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1123.84341001602), (-1123.84341001602), 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1123.84341001602));
      MinimumParameters minimumParameters0 = new MinimumParameters(3207);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3207);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-1123.84341001602), mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-991.0776514299));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, 100);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1.0, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-647.282237216132));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, (-647.282237216132));
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 547.2631512, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1115);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 2251.0);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-237.425811135929), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision((-1.6897577356009283));
      MinimumParameters minimumParameters0 = new MinimumParameters(1021);
      MnFcn mnFcn0 = new MnFcn((FCNBase) null, (-1.6897577356009283));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1021);
      // Undeclared exception!
      try { 
        MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-1.6897577356009283), mnMachinePrecision0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFcn", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-266.921835446), (-266.921835446), 0.95, (-266.921835446), 0.95).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1095);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1095);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1095);
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-237.425811135929), mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1330.88324622424), 2287.6793876, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1115.57264);
      MinimumParameters minimumParameters0 = new MinimumParameters(3207);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3207);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-3881.145936), mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(4598.352090912569, 4598.352090912569, 4598.352090912569, 4598.352090912569, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2.0));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(892);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 892);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 892, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1732.474895898), (-1732.474895898), (-1732.474895898), (-1732.474895898), (-1732.474895898)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2913.43997));
      MinimumParameters minimumParameters0 = new MinimumParameters(12);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision((-2913.43997));
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-2913.43997), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-266.921835446), (-266.921835446), 0.95, (-266.921835446), 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1115);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1115);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1115);
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-237.425811135929), mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (-2501.8344767886)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1115.57264);
      MinimumParameters minimumParameters0 = new MinimumParameters(3207);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3207);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-3881.145936), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1380.379067), (-1380.379067), 3.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1115.57264);
      MinimumParameters minimumParameters0 = new MinimumParameters(3207);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3207);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-3882.4621466788594), mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1746.9755358650025), 1662.263889580934, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1115.57264);
      MinimumParameters minimumParameters0 = new MinimumParameters(3207);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3207);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-3881.145936), mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2913.43997));
      MinimumParameters minimumParameters0 = new MinimumParameters(12);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision((-2913.43997));
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-2913.43997), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.1), (-0.1), (-0.1), (-0.1), 0.5).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2913.43997));
      MinimumParameters minimumParameters0 = new MinimumParameters(12);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision((-2913.43997));
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-2913.43997), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1977.169681853)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1115.57264);
      MinimumParameters minimumParameters0 = new MinimumParameters(3186);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3186);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-3881.145936), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-977.4706873414938), (-977.4706873414938), (-977.4706873414938), 0.0032571031468422735, 2.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2913.43997));
      MinimumParameters minimumParameters0 = new MinimumParameters(12);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision((-2913.43997));
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-2913.43997), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 1591.9972370192302).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MinimumParameters minimumParameters0 = new MinimumParameters(12);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.0, mnMachinePrecision0);
      MnAlgebraicVector mnAlgebraicVector2 = new MnAlgebraicVector(12);
      MinimumParameters minimumParameters1 = new MinimumParameters(mnAlgebraicVector2, 12);
      MnMachinePrecision mnMachinePrecision1 = new MnMachinePrecision();
      mnMachinePrecision1.setPrecision(1591.9972370192302);
      MnAlgebraicVector mnAlgebraicVector3 = mnAlgebraicVector2.clone();
      mnAlgebraicVector1.toString();
      MinimumParameters minimumParameters2 = new MinimumParameters(12);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector2, (-694.143711777269), mnMachinePrecision0);
      MinimumParameters minimumParameters3 = new MinimumParameters(mnAlgebraicVector3, 8.0);
      MnMachinePrecision mnMachinePrecision2 = new MnMachinePrecision();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      MnFcn mnFcn1 = new MnFcn(fCNBase1, 1743.6249447);
      MnLineSearch.search(mnFcn0, minimumParameters3, mnAlgebraicVector1, 1591.9972370192302, mnMachinePrecision2);
      mnAlgebraicVector0.clone();
      MinimumParameters minimumParameters4 = new MinimumParameters(12);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters4, mnAlgebraicVector3, 2.0, mnMachinePrecision1);
      MnAlgebraicVector mnAlgebraicVector4 = new MnAlgebraicVector(376);
      MnParabolaPoint mnParabolaPoint1 = MnLineSearch.search(mnFcn1, minimumParameters4, mnAlgebraicVector0, 2.0, mnMachinePrecision2);
      assertNotSame(mnParabolaPoint1, mnParabolaPoint0);
  }
}