/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:24:15 GMT 2018
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
import org.freehep.math.minuit.MnCross;
import org.freehep.math.minuit.MnFunctionCross;
import org.freehep.math.minuit.MnStrategy;
import org.freehep.math.minuit.MnUserParameterState;
import org.freehep.math.minuit.MnUserParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnFunctionCross_ESTest extends MnFunctionCross_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      double double0 = (-0.1);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      int int0 = 500;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.04868953864075883, (-885.1), 2155.88082740528, 0.0, (double)500).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-0.1), mnStrategy0, 2155.88082740528);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.0, 500);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[0];
      mnStrategy0.setHessianG2Tolerance(921.0224625332238);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      double[] doubleArray0 = new double[1];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-484.8800167702211), (-370.3392), (-463.60218862), (-422.34318), (-463.60218862)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1534.061212332326, mnStrategy0, 4980.331424127);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-463.60218862), (-871));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-885.1);
      doubleArray0[1] = (-512.2197634694775);
      doubleArray0[2] = 4980.331424127;
      doubleArray0[3] = 2000.1598008034036;
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 100.0, mnStrategy0, 100.0);
      int[] intArray0 = new int[2];
      intArray0[0] = 2;
      intArray0[1] = 2;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-411.5), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (-885.1);
      doubleArray0[1] = 0.0;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      MnStrategy mnStrategy1 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-3816.6618131727073), mnStrategy0, 500);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-0.1), 500);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (-885.1);
      doubleArray0[1] = (-885.1);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[3];
      MnStrategy mnStrategy1 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.1), (-3816.6618131727073), (-2050.22), (-0.1), (-885.1)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-3816.6618131727073), mnStrategy0, 471);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-0.1), 471);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(100.0, 100.0, (-370.3392), (-370.3392), (-370.3392)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnStrategy mnStrategy1 = new MnStrategy();
      mnUserParameters0.params();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 4980.331424127, mnStrategy1, (-239.8216615587319));
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-370.3392), 2880);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(100.0, 100.0, (-370.3392), (-370.3392), 0.02).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnUserParameterState mnUserParameterState1 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy1 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState1, 4980.331424127, mnStrategy1, (-239.8216615587319));
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.0, 2880);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-100.0), (-5463423.572267319), (-100.0), (-100.0), (-370.3392)).when(fCNBase0).valueOf(any(double[].class));
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientTolerance((-370.3392));
      MnStrategy mnStrategy1 = new MnStrategy();
      int[] intArray0 = new int[1];
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy2 = new MnStrategy();
      mnUserParameters0.setPrecision((-2141.6718101122997));
      mnUserParameterState0.add("lGYb-li;G'T", (-1681.6888));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-100.0), mnStrategy0, 1556.74);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 180;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1681.6888), 180);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 180, 6);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(159.56414284, 159.56414284, (-769.3041142727951), (-769.3041142727951), (-769.3041142727951)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-884.8126885535039);
      doubleArray0[0] = (-884.8126885535039);
      doubleArray0[2] = 159.56414284;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-3816.6618131727073), mnStrategy0, (-0.1));
      int[] intArray0 = new int[0];
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-884.8126885535039), 2141537213);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-3902737.113888641), 2141537213);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(159.62057967908433, 159.62057967908433, (-769.9489275086647), (-769.9489275086647), (-769.9489275086647)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-884.8126885535039);
      doubleArray0[0] = 159.62057967908433;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-3816.6618131727073), mnStrategy0, (-0.1));
      int[] intArray0 = new int[0];
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 159.62057967908433, 2141537213);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-0.6367256341997393);
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      double[] doubleArray1 = mnUserParameterState0.params();
      mnUserParameterState0.intOfExt(2);
      mnUserParameterState0.setUpperLimit(2, (-0.5640395069746753));
      int[] intArray0 = new int[5];
      intArray0[1] = 2;
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1470.078089038405), mnStrategy0, 0.001);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray1, 1497.9206177629014, 210);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(101.77156, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnStrategy mnStrategy0 = new MnStrategy();
      MnStrategy mnStrategy1 = new MnStrategy();
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 18.64573755465159;
      doubleArray0[2] = (double) (-2147050454);
      doubleArray0[3] = (double) 494;
      doubleArray0[4] = (-370.3392);
      double[] doubleArray1 = new double[8];
      doubleArray0[3] = 18.64573755465159;
      doubleArray0[4] = 4980.331424127;
      doubleArray1[3] = 18.64573755465159;
      doubleArray1[4] = 101.77156;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("min == max", 4.0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 18.64573755465159, mnStrategy0, (-714.8));
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 5461904.229087319, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(99.5642568994701, 99.5642568994701, (-370.3392), (-370.3392), 0.02).when(fCNBase0).valueOf(any(double[].class));
      MnStrategy mnStrategy0 = new MnStrategy();
      MnStrategy mnStrategy1 = new MnStrategy();
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 18.64573755465159;
      mnStrategy1.setHessianGradientNCycles(2142923299);
      doubleArray0[2] = (double) 646;
      doubleArray0[3] = (double) 500;
      doubleArray0[4] = (-370.3392);
      doubleArray0[4] = 4980.331424127;
      mnStrategy1.setHessianG2Tolerance(500);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.02, mnStrategy1, 0.02);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 18.64573755465159, 646);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy();
      MnStrategy mnStrategy1 = new MnStrategy();
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 18.64573755465159;
      mnStrategy1.setHessianGradientNCycles(2142923299);
      doubleArray0[2] = (double) 646;
      doubleArray0[3] = (double) 512;
      doubleArray0[4] = (-370.3392);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 18.64573755465159;
      doubleArray0[4] = 4980.331424127;
      doubleArray1[3] = 18.64573755465159;
      doubleArray1[4] = 99.5642568994701;
      doubleArray1[5] = (double) 512;
      mnStrategy1.setHessianG2Tolerance(512);
      doubleArray1[0] = 0.02;
      doubleArray1[7] = (double) 512;
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(4980.331424127, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      mnUserParameterState0.toString();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 4980.331424127, mnStrategy1, 0.0);
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1561.5681468, 2142923299);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = 100.0;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(100.0, 100.0, (-1980.592991), (-1980.592991), (-1980.592991)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 100.0, mnStrategy0, (-239.49467619476246));
      int[] intArray0 = new int[0];
      int int0 = 646;
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 18.64573755465159, 646);
      double double1 = 2.0;
      mnStrategy0.setHessianG2Tolerance((-1980.592991));
      MnUserParameters mnUserParameters1 = new MnUserParameters();
      // Undeclared exception!
      try { 
        mnUserParameters1.setUpperLimit("org.freehep.math.minuit.MnAlgebraicSymMatrix$EigenvaluesException", (-2973.536212686441));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserTransformation", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(100.0, 100.0, (-1980.592991), (-1980.592991), 0.02).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnUserParameterState mnUserParameterState1 = mnUserParameterState0.clone();
      MnStrategy mnStrategy1 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState1, 4980.331424127, mnStrategy1, (-239.8216615587319));
      int[] intArray0 = new int[0];
      mnStrategy0.setGradientNCycles(11);
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 18.64573755465159, 646);
      mnStrategy0.setHessianG2Tolerance(500);
      MnUserParameters mnUserParameters1 = new MnUserParameters();
      MnUserParameterState mnUserParameterState2 = new MnUserParameterState(mnUserParameters0);
      int[] intArray1 = new int[4];
      intArray1[0] = 500;
      intArray1[2] = 500;
      intArray1[3] = 500;
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (-885.1);
      doubleArray0[1] = 0.0;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      int int0 = 500;
      mnStrategy0.setGradientStepTolerance(2155.88082740528);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 2155.88082740528, 0.0, (double)500).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-0.1), mnStrategy0, 3.368800173644827);
      mnStrategy0.setMediumStrategy();
      mnStrategy0.setHessianStepTolerance(3.368800173644827);
      mnUserParameterState0.add("", 4.0E-7, 3.368800173644827, (double) 500, 0.0);
      int int1 = 2475;
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1605.01), 2475);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(99.5642568994701, 99.5642568994701, (-370.3392), (-370.3392), 0.02).when(fCNBase0).valueOf(any(double[].class));
      MnStrategy mnStrategy0 = new MnStrategy();
      MnStrategy mnStrategy1 = new MnStrategy();
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[5];
      mnStrategy1.setHessianGradientNCycles((-816));
      doubleArray0[2] = (double) 646;
      doubleArray0[3] = (double) 500;
      doubleArray0[4] = (-370.3392);
      doubleArray0[4] = 4980.331424127;
      mnStrategy1.setHessianG2Tolerance(500);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.02, mnStrategy1, 0.02);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-42234.318), 2147483254);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[5];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      double[] doubleArray1 = mnUserParameterState0.params();
      mnUserParameterState0.setUpperLimit(2, (-0.5640395069746753));
      int[] intArray0 = new int[5];
      intArray0[0] = 2;
      intArray0[1] = 2;
      MnStrategy mnStrategy1 = new MnStrategy();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2975.248, (-3203.9408092842), 1.0, (double)2, (double)2).when(fCNBase1).valueOf(any(double[].class));
      mnStrategy1.setHessianStepTolerance((-2125067326));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase1, mnUserParameterState0, 0.0, mnStrategy1, 0);
      double[] doubleArray2 = new double[6];
      doubleArray2[0] = (-0.5640395069746753);
      doubleArray2[2] = 0.2;
      doubleArray2[3] = (-10.137140718);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray2, 2578.9397149, 2144);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(99.5642568994701, 99.5642568994701, 99.5642568994701, 99.5642568994701, 99.5642568994701).when(fCNBase0).valueOf(any(double[].class));
      MnStrategy mnStrategy0 = new MnStrategy();
      MnStrategy mnStrategy1 = new MnStrategy();
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[5];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy2 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 499, mnStrategy0, 500);
      mnStrategy0.setHessianGradientNCycles(3942);
      double double0 = (-1981.9011675);
      int int0 = 200;
      int[] intArray1 = new int[0];
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1981.9011675), 200);
      double[] doubleArray1 = null;
      // Undeclared exception!
      try { 
        mnUserParameterState0.setError(3942, (double) 499);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3942, Size: 5
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(100.0, 100.0, (-1980.592991), (-1980.592991), 0.02).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnUserParameterState mnUserParameterState1 = mnUserParameterState0.clone();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState1, 0.02, mnStrategy0, (-239.49467619476246));
      int[] intArray0 = new int[0];
      int int0 = 646;
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 18.64573755465159, 646);
      double double0 = 2.0;
      mnStrategy0.setHessianG2Tolerance(0.02);
      MnUserParameters mnUserParameters1 = new MnUserParameters();
      MnUserParameterState mnUserParameterState2 = new MnUserParameterState(mnUserParameters1);
      // Undeclared exception!
      try { 
        mnUserParameters1.setUpperLimit("org.freehep.math.minuit.MnAlgebraicSymMatrix$EigenvaluesException", (-2973.536212686441));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserTransformation", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientTolerance((-1430.0));
      MnStrategy mnStrategy1 = new MnStrategy();
      int[] intArray0 = new int[0];
      mnStrategy1.setHessianG2Tolerance(921.0224625332238);
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1097.663216005488), mnStrategy0, (-1097.663216005488));
      mnStrategy1.setHessianStepTolerance(1.0E-6);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1430.0), (-1123.9)).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross1 = new MnFunctionCross(fCNBase1, mnUserParameterState0, (-1516.129297), mnStrategy0, 921.0224625332238);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-1430.0);
      doubleArray0[1] = (-1516.129297);
      doubleArray0[2] = (-1097.663216005488);
      doubleArray0[3] = (double) 500;
      MnCross mnCross0 = mnFunctionCross1.cross(intArray0, doubleArray0, doubleArray0, 0.7179802465126623, (-2361));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 0.02;
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      double[] doubleArray1 = mnUserParameterState0.params();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1470.078089038405), mnStrategy0, 0.02);
      int int0 = 2;
      mnUserParameterState0.setUpperLimit(2, (-0.5640395069746753));
      int[] intArray0 = new int[5];
      intArray0[0] = 2;
      intArray0[1] = 2;
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 10.0, 929);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[5];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      double[] doubleArray1 = mnUserParameterState0.params();
      mnUserParameterState0.add("", 1.0, (-59.02699307), 2975.248, 0.2);
      mnUserParameterState0.setUpperLimit(2, (-0.5640395069746753));
      int[] intArray0 = new int[5];
      doubleArray1[1] = (double) 2;
      intArray0[1] = 2;
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(17.6, 1526.016290991615, 1526.016290991615, 6936.735816459326, 2574.18809).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase1, mnUserParameterState0, 0.0, mnStrategy0, 0);
      double[] doubleArray2 = new double[6];
      doubleArray1[2] = (-0.5640395069746753);
      doubleArray2[1] = 0.2;
      doubleArray2[4] = 0.02;
      doubleArray2[5] = 0.02;
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray2, 2578.9397149, 2144);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 0.02;
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      double[] doubleArray1 = mnUserParameterState0.params();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1470.078089038405), mnStrategy0, 0.02);
      mnUserParameterState0.setUpperLimit(2, (-0.5640395069746753));
      int[] intArray0 = new int[5];
      intArray0[0] = 2;
      mnUserParameterState0.setLowerLimit(2, (double) 2);
      intArray0[1] = 2;
      MnStrategy mnStrategy1 = new MnStrategy();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2975.248, (-3203.9408092842), 1.0, (double)2, (double)2).when(fCNBase1).valueOf(any(double[].class));
      mnStrategy1.setHessianStepTolerance((-2125067326));
      MnFunctionCross mnFunctionCross1 = new MnFunctionCross(fCNBase1, mnUserParameterState0, 0.02, mnStrategy1, 0);
      double[] doubleArray2 = new double[6];
      doubleArray2[0] = (-0.5640395069746753);
      doubleArray2[1] = 0.2;
      doubleArray2[2] = 0.2;
      doubleArray2[3] = (-10.137140718);
      doubleArray2[4] = 0.02;
      doubleArray2[5] = 0.02;
      // Undeclared exception!
      mnFunctionCross1.cross(intArray0, doubleArray1, doubleArray2, 2578.9397149, 2144);
  }
}