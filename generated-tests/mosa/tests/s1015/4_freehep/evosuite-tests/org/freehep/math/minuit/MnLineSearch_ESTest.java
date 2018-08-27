/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 06:03:47 GMT 2018
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
      doReturn(2.0, 2.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1600.784732834);
      MinimumParameters minimumParameters0 = new MinimumParameters(4254);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(4254);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2.0, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1600.784732834);
      MinimumParameters minimumParameters0 = new MinimumParameters(4254);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(4254);
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector1, 4254, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.3749999999999999);
      MinimumParameters minimumParameters0 = new MinimumParameters(3);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.3749999999999999, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2583.84383);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(419);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 1.0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 419, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-572.029527469333), 1568.621060227657, (-572.029527469333), (-276.8035469), (-276.8035469)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.3749999999999999);
      MinimumParameters minimumParameters0 = new MinimumParameters(3);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.3749999999999999, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1);
      mnAlgebraicVector0.clone();
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, (-596.0));
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-596.0));
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 3.0, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 582.67);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(945);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 945);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.24999999999999994, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.4544732971629839, 159.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-1904.1702446284232));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(12);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 12);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, (-1904.1702446284232), mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2819);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(768.0, (double)2819, 3099.748371).when(fCNBase0).valueOf(any(double[].class));
      mnAlgebraicVector0.toString();
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2819);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 2819);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2819, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-771.411339711), (-771.411339711), (-771.411339711), 659.1099131355, (-771.411339711)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.3749999999999999);
      MinimumParameters minimumParameters0 = new MinimumParameters(3);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.3749999999999999, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2.0), (-2.0), (-2.0), (-2.0), (-2431.786617380006)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, (-2653.7455));
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(1655);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, (-2653.7455));
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 1655, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(2819);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2062.3307, 1014.6919325748505, (-1851.0062)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 2819);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, mnAlgebraicVector0, 2819);
      mnAlgebraicVector0.clone();
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2819, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 1600.784732834);
      MinimumParameters minimumParameters0 = new MinimumParameters(4254);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(4254);
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision((-2.0));
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector1, 4254, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(3117);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 0.0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(0.0);
      MinimumParameters minimumParameters1 = new MinimumParameters(3117);
      MnAlgebraicVector mnAlgebraicVector1 = new MnAlgebraicVector(3117);
      mnAlgebraicVector1.clone();
      MnMachinePrecision mnMachinePrecision1 = new MnMachinePrecision();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.1), (-0.1), (-0.1)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector2 = mnAlgebraicVector0.clone();
      // Undeclared exception!
      MnLineSearch.search(mnFcn0, minimumParameters1, mnAlgebraicVector2, 0.0, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(480);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 0.0);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(0.0);
      mnAlgebraicVector0.clone();
      MnMachinePrecision mnMachinePrecision1 = new MnMachinePrecision();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 2077.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.0);
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      MnParabolaPoint mnParabolaPoint0 = MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector1, 0.0, mnMachinePrecision0);
      assertNotNull(mnParabolaPoint0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(494);
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, (-0.7838837256511456));
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision((-0.7838837256511456));
      mnAlgebraicVector0.clone();
      MnMachinePrecision mnMachinePrecision1 = new MnMachinePrecision();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)494, (double)494, (-1377.207), (double)494, (-1377.207)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 494);
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector1, (-0.7838837256511456), mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(0.24999999999999994);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(100);
      MnAlgebraicVector mnAlgebraicVector1 = mnAlgebraicVector0.clone();
      mnAlgebraicVector1.clone();
      MnMachinePrecision mnMachinePrecision1 = new MnMachinePrecision();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 0.24999999999999994);
      MnAlgebraicVector mnAlgebraicVector2 = mnAlgebraicVector0.clone();
      MinimumParameters minimumParameters0 = new MinimumParameters(mnAlgebraicVector0, 0.00185546875);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector2, 0.00185546875, mnMachinePrecision0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1049.568842462532), 0.0, 0.0, (-1049.568842462532), (-1049.568842462532)).when(fCNBase0).valueOf(any(double[].class));
      MnFcn mnFcn0 = new MnFcn(fCNBase0, 689.5388);
      MnAlgebraicVector mnAlgebraicVector0 = new MnAlgebraicVector(4);
      MinimumParameters minimumParameters0 = new MinimumParameters(4);
      MnMachinePrecision mnMachinePrecision0 = new MnMachinePrecision();
      mnMachinePrecision0.setPrecision(689.5388);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 4, mnMachinePrecision0);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 4, mnMachinePrecision0);
      mnMachinePrecision0.setPrecision(422.84091);
      mnMachinePrecision0.setPrecision((-279.845513696));
      mnMachinePrecision0.setPrecision(689.5388);
      mnMachinePrecision0.setPrecision(0.0);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 0.0, mnMachinePrecision0);
      MnMachinePrecision mnMachinePrecision1 = new MnMachinePrecision();
      MinimumParameters minimumParameters1 = new MinimumParameters(mnAlgebraicVector0, 8.0);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 8.0, mnMachinePrecision1);
      MnLineSearch.search(mnFcn0, minimumParameters1, mnAlgebraicVector0, 422.84091, mnMachinePrecision1);
      MnLineSearch.search(mnFcn0, minimumParameters0, mnAlgebraicVector0, 2692.5565604846156, mnMachinePrecision1);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(422.84091, 76.4821851, 422.84091, 8.0, 285.2635081999997).when(fCNBase1).valueOf(any(double[].class));
      MnFcn mnFcn1 = new MnFcn(fCNBase1, 8.881784197001252E-16);
      MnLineSearch.search(mnFcn1, minimumParameters1, mnAlgebraicVector0, (-294.4695), mnMachinePrecision1);
      MnLineSearch.search(mnFcn1, minimumParameters1, mnAlgebraicVector0, (-8.881784197001252E-16), mnMachinePrecision1);
  }
}