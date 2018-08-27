/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 08:01:05 GMT 2018
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
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 689.5388);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0, mnMachinePrecision0);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0, mnMachinePrecision0);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.0, mnMachinePrecision0);
      mnMachinePrecision0.setPrecision(422.84091);
      mnMachinePrecision0.setPrecision(689.5388);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      mnMachinePrecision0.setPrecision(0.0);
      MnFcn mnFcn1 = new MnFcn(fCNBase1, 8.0);
      MnLineSearch.search(mnFcn1, minimumParameters0, mnAlgebraicVector0, 8.0, mnMachinePrecision0);
      mnAlgebraicVector0.toString();
      // Undeclared exception!
      try { 
        MnLineSearch.search(mnFcn0, (MinimumParameters) null, mnAlgebraicVector0, 0.0, mnMachinePrecision0);
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
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2876.2651616));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MnAlgebraicVector mnAlgebraicVector1 = new MnAlgebraicVector(0);
      MnAlgebraicVector mnAlgebraicVector2 = mnAlgebraicVector0.clone();
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector2, 3718.808064119725);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector1, 0.5, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (-401.68497)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1007.88));
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(2);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)2, (double)2, (-401.68497), 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1007.88));
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)1, (double)1, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-442.0));
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, (-442.0));
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-442.0), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)1, (double)1, (double)1, (double)1).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-442.0));
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 1948.48076845323);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-442.0), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2876.2651616));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      MnAlgebraicVector mnAlgebraicVector2 = mnAlgebraicVector1.clone();
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector1, mnAlgebraicVector0, 2.0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-2876.2651616), mnMachinePrecision0);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector2, 0.0, mnMachinePrecision0);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.0, mnMachinePrecision0);
      MinimumParameters minimumParameters1 = new MinimumParameters(mnAlgebraicVector1, 2.0);
      // Undeclared exception!
      try { 
        MnLineSearch.search(mnFcn0, minimumParameters1, mnAlgebraicVector2, (-2876.2651616), (MnMachinePrecision) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnLineSearch", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(9.769962616701378E-14, (-148.83), 9.769962616701378E-14, (-167.490570341003), 2496.18194632).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 719.49);
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      mnFcn0.valueOf(mnAlgebraicVector1);
      MnAlgebraicVector mnAlgebraicVector2 = new MnAlgebraicVector(0);
      mnAlgebraicVector2.toString();
      mnAlgebraicVector2.toString();
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector2, 0.0, mnMachinePrecision0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(719.49, 2496.18194632, (-1486.7832295446483), 7075270.262784, 719.49).when(fCNBase1).valueOf(any(double[].class));
      MnFcn mnFcn1 = new MnFcn(fCNBase1, 0.0);
      MnLineSearch.search(mnFcn1, minimumParameters0, mnAlgebraicVector0, 0.5, mnMachinePrecision0);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.5, mnMachinePrecision0);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector2, (-1034.635201407), mnMachinePrecision0);
      MinimumParameters minimumParameters1 = new MinimumParameters(mnAlgebraicVector0, (-2560.5));
      mnAlgebraicVector0.clone();
      MnLineSearch.search(mnFcn1, minimumParameters1, mnAlgebraicVector1, (-1491.4456120769), mnMachinePrecision0);
      MnLineSearch.search(mnFcn1, minimumParameters1, mnAlgebraicVector1, (-1491.4456120769), mnMachinePrecision0);
      MnAlgebraicVector mnAlgebraicVector3 = mnAlgebraicVector0.clone();
      mnAlgebraicVector3.toString();
      MnLineSearch.search(mnFcn1, minimumParameters1, mnAlgebraicVector3, (-3572.3092371), mnMachinePrecision0);
      MinimumParameters minimumParameters2 = new MinimumParameters(0);
      MnParabolaPoint mnParabolaPoint1 = MnLineSearch.search(mnFcn1, minimumParameters2, mnAlgebraicVector2, 0.0, mnMachinePrecision0);
      assertNotSame(mnParabolaPoint1, mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-885.5417), (-885.5417), (-885.5417), 3.2910719454811E14, 3.2910719454811E14).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 719.49);
      MinimumParameters minimumParameters0 = new MinimumParameters(0);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(0);
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      mnFcn0.valueOf(mnAlgebraicVector1);
      MnAlgebraicVector mnAlgebraicVector2 = new MnAlgebraicVector(0);
      mnAlgebraicVector2.toString();
      mnAlgebraicVector2.toString();
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector2, 0.0, mnMachinePrecision0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(719.49, (-2.0), 719.49, 0.0, 0.05).when(fCNBase1).valueOf(any(double[].class));
      MnFcn mnFcn1 = new MnFcn(fCNBase1, 0.0);
      MnLineSearch.search(mnFcn1, minimumParameters0, mnAlgebraicVector0, 0.5, mnMachinePrecision0);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.5, mnMachinePrecision0);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector2, (-1034.635201407), mnMachinePrecision0);
      MinimumParameters minimumParameters1 = new MinimumParameters(mnAlgebraicVector0, (-2560.5));
      mnAlgebraicVector0.clone();
      MnLineSearch.search(mnFcn1, minimumParameters1, mnAlgebraicVector1, (-1491.4456120769), mnMachinePrecision0);
      MnLineSearch.search(mnFcn1, minimumParameters1, mnAlgebraicVector1, (-1491.4456120769), mnMachinePrecision0);
      MnAlgebraicVector mnAlgebraicVector3 = mnAlgebraicVector0.clone();
      mnAlgebraicVector3.toString();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn1, minimumParameters1, mnAlgebraicVector3, (-3572.3092371), mnMachinePrecision0);
      MnParabolaPoint mnParabolaPoint1 = MnLineSearch.search(mnFcn1, minimumParameters0, mnAlgebraicVector0, 8.0, mnMachinePrecision0);
      assertNotSame(mnParabolaPoint1, mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MinimumParameters minimumParameters0 = new MinimumParameters(442);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnFcn mnFcn0 = new MnFcn((FCNBase) null, 442);
      MnFcn mnFcn1 = new MnFcn((FCNBase) null, (-4372.2));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(442);
      mnMachinePrecision0.setPrecision((-2.0));
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      // Undeclared exception!
      try { 
        MnLineSearch.search(mnFcn1, minimumParameters0, mnAlgebraicVector1, (-4372.2), mnMachinePrecision0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFcn", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1615.852), 0.1818220338983051, 0.1818220338983051, 0.5, 0.24584119936721074).when(fCNBase0).valueOf(any(double[].class));
      double double0 = 0.0;
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      int int0 = 1304;
      MinimumParameters minimumParameters0 = new MinimumParameters(1304);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1304);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1304, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(930.267080498, 930.267080498, 930.267080498).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2982);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 8.0);
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 5.0, mnMachinePrecision0);
  }
}