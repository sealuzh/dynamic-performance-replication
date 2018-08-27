/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 23:26:03 GMT 2018
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
      doReturn(5.0, 5.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      int int0 = 4425;
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(4425);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 4425);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(0.0);
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 4425, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2840);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 2840);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)2840, (double)2840, (double)2840).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2840);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2840, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2843);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 2843);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.0, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(3.2028873044839717E-11, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 3.2028873044839717E-11);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2839);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 2839);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.0, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(3.2028873044839717E-11, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 3.2028873044839717E-11);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2839);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 0.0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.0, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(4.37040980236351, 4.37040980236351, 4.37040980236351, 738.56751087656, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1029.577632));
      MinimumParameters minimumParameters0 = new MinimumParameters(1);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1029.577632));
      MinimumParameters minimumParameters0 = new MinimumParameters(1);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2026.2), 5.0, (-128.636691), 0.9999104379410526, (-128.636691)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1029.577632));
      MinimumParameters minimumParameters0 = new MinimumParameters(1);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2164.4813519), (-2164.4813519), (-2164.4813519), 1276.434785565073, 1276.434785565073).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 4.0);
      MinimumParameters minimumParameters0 = new MinimumParameters(12);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector1, 4.0, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2843);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 2843);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)2843, (double)2843, (double)2843).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2843);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-2221.937361384595), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.982459015232546, (-2787.18744438284), 0.982459015232546).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 405.2);
      assertNotNull(mnFcn0);
      
      MinimumParameters minimumParameters0 = new MinimumParameters(2758);
      assertNotNull(minimumParameters0);
      
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2758);
      assertNotNull(mnAlgebraicVector0);
      
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision0);
      
      MnMachinePrecision mnMachinePrecision1 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision1);
      assertFalse(mnMachinePrecision1.equals((Object)mnMachinePrecision0));
      
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 5.0, mnMachinePrecision1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1487.3092914284234, (-2152.675024415171), (-1.0)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 405.2);
      assertNotNull(mnFcn0);
      
      MinimumParameters minimumParameters0 = new MinimumParameters(2758);
      assertNotNull(minimumParameters0);
      
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2758);
      assertNotNull(mnAlgebraicVector0);
      
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision0);
      
      MnMachinePrecision mnMachinePrecision1 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision1);
      assertFalse(mnMachinePrecision1.equals((Object)mnMachinePrecision0));
      
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2758, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2851);
      assertNotNull(mnAlgebraicVector0);
      
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision0);
      
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)2851, (double)2851, (double)2851).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2851);
      assertNotNull(mnFcn0);
      
      mnMachinePrecision0.setPrecision((-1336.7));
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 0.5249999999999999);
      assertNotNull(minimumParameters0);
      
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 24.75442765496006, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(5.0, 5.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 5.0);
      assertNotNull(mnFcn0);
      
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(4425);
      assertNotNull(mnAlgebraicVector0);
      
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 4425);
      assertNotNull(minimumParameters0);
      
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision0);
      
      mnMachinePrecision0.setPrecision(5.0);
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 4425, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
      
      MnParabolaPoint mnParabolaPoint1 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 4425, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint1);
      assertFalse(mnParabolaPoint1.equals((Object)mnParabolaPoint0));
      assertNotSame(mnParabolaPoint1, mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2.0), 1622.3637, 0.006409118956489251).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 405.2);
      assertNotNull(mnFcn0);
      
      MinimumParameters minimumParameters0 = new MinimumParameters(2758);
      assertNotNull(minimumParameters0);
      
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2758);
      assertNotNull(mnAlgebraicVector0);
      
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision0);
      
      MnMachinePrecision mnMachinePrecision1 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision1);
      assertFalse(mnMachinePrecision1.equals((Object)mnMachinePrecision0));
      
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 5.0, mnMachinePrecision1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(5758.0, 5758.0, 5758.0, (-643.79327982343), (-341.0691)).when(fCNBase0).valueOf(any(double[].class));
      double double0 = 0.0;
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      assertNotNull(mnFcn0);
      
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      assertNotNull(mnAlgebraicVector0);
      
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      assertNotNull(mnAlgebraicVector1);
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector0));
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector1);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector0);
      
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, 0.0);
      assertNotNull(minimumParameters0);
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector1));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector0));
      
      MnAlgebraicVector mnAlgebraicVector2 = mnAlgebraicVector0.clone();
      assertNotNull(mnAlgebraicVector2);
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector1));
      assertFalse(mnAlgebraicVector2.equals((Object)mnAlgebraicVector0));
      assertFalse(mnAlgebraicVector2.equals((Object)mnAlgebraicVector1));
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector2);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector1);
      assertNotSame(mnAlgebraicVector2, mnAlgebraicVector0);
      assertNotSame(mnAlgebraicVector2, mnAlgebraicVector1);
      
      double double1 = 2029.212;
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision0);
      
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector2, 1399.0, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector2));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector1));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector2));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector0));
      assertFalse(mnAlgebraicVector2.equals((Object)mnAlgebraicVector0));
      assertFalse(mnAlgebraicVector2.equals((Object)mnAlgebraicVector1));
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector2);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector1);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector2);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector0);
      assertNotSame(mnAlgebraicVector2, mnAlgebraicVector0);
      assertNotSame(mnAlgebraicVector2, mnAlgebraicVector1);
      
      double double2 = 2.0;
      MinimumParameters minimumParameters1 = new MinimumParameters(mnAlgebraicVector2, mnAlgebraicVector1, 2.0);
      assertNotNull(minimumParameters1);
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector2));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector1));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector2));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector0));
      assertFalse(mnAlgebraicVector2.equals((Object)mnAlgebraicVector0));
      assertFalse(mnAlgebraicVector2.equals((Object)mnAlgebraicVector1));
      assertFalse(minimumParameters1.equals((Object)minimumParameters0));
      
      MnAlgebraicVector mnAlgebraicVector3 = null;
      try {
        mnAlgebraicVector3 = new MnAlgebraicVector((-1718));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2556.6), (-554.591), 5402.4105386921).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      assertNotNull(mnFcn0);
      
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2843);
      assertNotNull(mnAlgebraicVector0);
      
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 2843);
      assertNotNull(minimumParameters0);
      
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision0);
      
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.0, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 332.077).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      assertNotNull(mnFcn0);
      
      MinimumParameters minimumParameters0 = new MinimumParameters(1);
      assertNotNull(minimumParameters0);
      
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision0);
      
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      assertNotNull(mnAlgebraicVector0);
      
      MnMachinePrecision mnMachinePrecision1 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision1);
      assertFalse(mnMachinePrecision1.equals((Object)mnMachinePrecision0));
      
      mnMachinePrecision1.setPrecision(0.3000963454810631);
      assertFalse(mnMachinePrecision1.equals((Object)mnMachinePrecision0));
      assertNotSame(mnMachinePrecision1, mnMachinePrecision0);
      
      MnMachinePrecision mnMachinePrecision2 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision2);
      assertFalse(mnMachinePrecision2.equals((Object)mnMachinePrecision1));
      assertFalse(mnMachinePrecision2.equals((Object)mnMachinePrecision0));
      
      mnMachinePrecision1.setPrecision((-667.315524053668));
      assertFalse(mnMachinePrecision1.equals((Object)mnMachinePrecision0));
      assertFalse(mnMachinePrecision1.equals((Object)mnMachinePrecision2));
      assertNotSame(mnMachinePrecision1, mnMachinePrecision0);
      assertNotSame(mnMachinePrecision1, mnMachinePrecision2);
      
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 154.41, mnMachinePrecision1);
      assertNotNull(mnParabolaPoint0);
      assertFalse(mnMachinePrecision1.equals((Object)mnMachinePrecision0));
      assertFalse(mnMachinePrecision1.equals((Object)mnMachinePrecision2));
      assertNotSame(mnMachinePrecision1, mnMachinePrecision0);
      assertNotSame(mnMachinePrecision1, mnMachinePrecision2);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(232.739647339, 1172.416, 232.739647339, 0.9939359053786192, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-3063.47));
      assertNotNull(mnFcn0);
      
      MinimumParameters minimumParameters0 = new MinimumParameters(3);
      assertNotNull(minimumParameters0);
      
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3);
      assertNotNull(mnAlgebraicVector0);
      
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision0);
      
      mnMachinePrecision0.setPrecision(839.7);
      mnMachinePrecision0.setPrecision((-3063.47));
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFcn mnFcn1 = new MnFcn(fCNBase1, 839.7);
      assertNotNull(mnFcn1);
      assertFalse(mnFcn1.equals((Object)mnFcn0));
      
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.996176618772124, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
      assertFalse(mnFcn0.equals((Object)mnFcn1));
      assertNotSame(mnFcn0, mnFcn1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(4.9, 4.9, (-259.0919)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      assertNotNull(mnFcn0);
      
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2823);
      assertNotNull(mnAlgebraicVector0);
      
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 2823);
      assertNotNull(minimumParameters0);
      
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision0);
      
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.0, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      assertNotNull(mnAlgebraicVector0);
      
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      assertNotNull(mnAlgebraicVector1);
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector0));
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector1);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector0);
      
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, 0.0);
      assertNotNull(minimumParameters0);
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector1));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector0));
      
      MnAlgebraicVector mnAlgebraicVector2 = mnAlgebraicVector0.clone();
      assertNotNull(mnAlgebraicVector2);
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector1));
      assertFalse(mnAlgebraicVector2.equals((Object)mnAlgebraicVector1));
      assertFalse(mnAlgebraicVector2.equals((Object)mnAlgebraicVector0));
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector2);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector1);
      assertNotSame(mnAlgebraicVector2, mnAlgebraicVector1);
      assertNotSame(mnAlgebraicVector2, mnAlgebraicVector0);
      
      MnAlgebraicVector mnAlgebraicVector3 = mnAlgebraicVector0.clone();
      assertNotNull(mnAlgebraicVector3);
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector2));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector1));
      assertFalse(mnAlgebraicVector3.equals((Object)mnAlgebraicVector1));
      assertFalse(mnAlgebraicVector3.equals((Object)mnAlgebraicVector0));
      assertFalse(mnAlgebraicVector3.equals((Object)mnAlgebraicVector2));
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector2);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector1);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector3);
      assertNotSame(mnAlgebraicVector3, mnAlgebraicVector1);
      assertNotSame(mnAlgebraicVector3, mnAlgebraicVector0);
      assertNotSame(mnAlgebraicVector3, mnAlgebraicVector2);
      
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2916.750497), 1.3500000000000003, 4851.83, 4851.83, 1239.94189).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2029.212);
      assertNotNull(mnFcn0);
      
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision0);
      
      MnAlgebraicVector mnAlgebraicVector4 = mnAlgebraicVector1.clone();
      assertNotNull(mnAlgebraicVector4);
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector2));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector1));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector3));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector2));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector0));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector3));
      assertFalse(mnAlgebraicVector4.equals((Object)mnAlgebraicVector2));
      assertFalse(mnAlgebraicVector4.equals((Object)mnAlgebraicVector1));
      assertFalse(mnAlgebraicVector4.equals((Object)mnAlgebraicVector0));
      assertFalse(mnAlgebraicVector4.equals((Object)mnAlgebraicVector3));
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector2);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector1);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector4);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector3);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector4);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector2);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector0);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector3);
      assertNotSame(mnAlgebraicVector4, mnAlgebraicVector2);
      assertNotSame(mnAlgebraicVector4, mnAlgebraicVector1);
      assertNotSame(mnAlgebraicVector4, mnAlgebraicVector0);
      assertNotSame(mnAlgebraicVector4, mnAlgebraicVector3);
      
      mnMachinePrecision0.setPrecision(0.0);
      String string0 = mnAlgebraicVector2.toString();
      assertNotNull(string0);
      assertEquals("LAVector parameters:\n\n0.00000 \n", string0);
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector2));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector1));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector4));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector3));
      assertFalse(mnAlgebraicVector2.equals((Object)mnAlgebraicVector1));
      assertFalse(mnAlgebraicVector2.equals((Object)mnAlgebraicVector4));
      assertFalse(mnAlgebraicVector2.equals((Object)mnAlgebraicVector0));
      assertFalse(mnAlgebraicVector2.equals((Object)mnAlgebraicVector3));
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector2);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector1);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector4);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector3);
      assertNotSame(mnAlgebraicVector2, mnAlgebraicVector1);
      assertNotSame(mnAlgebraicVector2, mnAlgebraicVector4);
      assertNotSame(mnAlgebraicVector2, mnAlgebraicVector0);
      assertNotSame(mnAlgebraicVector2, mnAlgebraicVector3);
      
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector1, (-2916.750497), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector2));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector1));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector4));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector3));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector4));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector2));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector0));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector3));
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector2);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector1);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector4);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector3);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector4);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector2);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector0);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector3);
      
      MnAlgebraicVector mnAlgebraicVector5 = mnAlgebraicVector1.clone();
      assertNotNull(mnAlgebraicVector5);
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector2));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector1));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector4));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector3));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector4));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector2));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector0));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector3));
      assertFalse(mnAlgebraicVector5.equals((Object)mnAlgebraicVector4));
      assertFalse(mnAlgebraicVector5.equals((Object)mnAlgebraicVector2));
      assertFalse(mnAlgebraicVector5.equals((Object)mnAlgebraicVector1));
      assertFalse(mnAlgebraicVector5.equals((Object)mnAlgebraicVector0));
      assertFalse(mnAlgebraicVector5.equals((Object)mnAlgebraicVector3));
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector2);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector5);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector1);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector4);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector3);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector4);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector5);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector2);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector0);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector3);
      assertNotSame(mnAlgebraicVector5, mnAlgebraicVector4);
      assertNotSame(mnAlgebraicVector5, mnAlgebraicVector2);
      assertNotSame(mnAlgebraicVector5, mnAlgebraicVector1);
      assertNotSame(mnAlgebraicVector5, mnAlgebraicVector0);
      assertNotSame(mnAlgebraicVector5, mnAlgebraicVector3);
      
      MnMachinePrecision mnMachinePrecision1 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision1);
      assertFalse(mnMachinePrecision1.equals((Object)mnMachinePrecision0));
      
      MnMachinePrecision mnMachinePrecision2 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision2);
      assertFalse(mnMachinePrecision2.equals((Object)mnMachinePrecision1));
      assertFalse(mnMachinePrecision2.equals((Object)mnMachinePrecision0));
      
      MnMachinePrecision mnMachinePrecision3 = new MnMachinePrecision();
      assertNotNull(mnMachinePrecision3);
      assertFalse(mnMachinePrecision3.equals((Object)mnMachinePrecision1));
      assertFalse(mnMachinePrecision3.equals((Object)mnMachinePrecision2));
      assertFalse(mnMachinePrecision3.equals((Object)mnMachinePrecision0));
      
      MnParabolaPoint mnParabolaPoint1 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector5, 1.3500000000000003, mnMachinePrecision3);
      assertNotNull(mnParabolaPoint1);
      assertFalse(mnParabolaPoint1.equals((Object)mnParabolaPoint0));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector2));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector5));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector1));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector4));
      assertFalse(mnAlgebraicVector0.equals((Object)mnAlgebraicVector3));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector4));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector5));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector2));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector0));
      assertFalse(mnAlgebraicVector1.equals((Object)mnAlgebraicVector3));
      assertFalse(mnAlgebraicVector5.equals((Object)mnAlgebraicVector4));
      assertFalse(mnAlgebraicVector5.equals((Object)mnAlgebraicVector2));
      assertFalse(mnAlgebraicVector5.equals((Object)mnAlgebraicVector1));
      assertFalse(mnAlgebraicVector5.equals((Object)mnAlgebraicVector0));
      assertFalse(mnAlgebraicVector5.equals((Object)mnAlgebraicVector3));
      assertFalse(mnMachinePrecision3.equals((Object)mnMachinePrecision1));
      assertFalse(mnMachinePrecision3.equals((Object)mnMachinePrecision2));
      assertFalse(mnMachinePrecision3.equals((Object)mnMachinePrecision0));
      assertNotSame(mnParabolaPoint1, mnParabolaPoint0);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector2);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector5);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector1);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector4);
      assertNotSame(mnAlgebraicVector0, mnAlgebraicVector3);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector4);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector5);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector2);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector0);
      assertNotSame(mnAlgebraicVector1, mnAlgebraicVector3);
      assertNotSame(mnAlgebraicVector5, mnAlgebraicVector4);
      assertNotSame(mnAlgebraicVector5, mnAlgebraicVector2);
      assertNotSame(mnAlgebraicVector5, mnAlgebraicVector1);
      assertNotSame(mnAlgebraicVector5, mnAlgebraicVector0);
      assertNotSame(mnAlgebraicVector5, mnAlgebraicVector3);
      assertNotSame(mnMachinePrecision3, mnMachinePrecision1);
      assertNotSame(mnMachinePrecision3, mnMachinePrecision2);
      assertNotSame(mnMachinePrecision3, mnMachinePrecision0);
  }
}