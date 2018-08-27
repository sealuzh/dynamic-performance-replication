/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 00:58:29 GMT 2018
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnFunctionCross_ESTest extends MnFunctionCross_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.2, (-4.0), 2.2, (-4.0), 2.2).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1380.3206198, mnStrategy0, 1380.3206198);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1610612736), (-1610612736));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1671.8345);
      double double0 = 2592.421;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      int int0 = 1;
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 426.34137, mnStrategy0, (-1671.8345));
      int[] intArray0 = new int[0];
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2.0, 0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0, 1.0, 1.0, 1.0, 1.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0, mnStrategy0, 0.0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0, 2126);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, (-119.45), (-119.45), 396.7687879).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1671.8345);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 426.34137, mnStrategy0, (-1671.8345));
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1457.0, 454);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 4.0, 454);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(605.7495663881315, (-4.0)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-4.0), mnStrategy0, 1.0E-4);
      int[] intArray0 = new int[0];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 1.0E-4;
      doubleArray1[1] = (double) 5;
      doubleArray1[2] = (-4.0);
      doubleArray1[3] = 1.0E-4;
      doubleArray1[4] = 1.0E-4;
      doubleArray1[5] = 1.0E-4;
      doubleArray1[6] = (double) 5;
      doubleArray1[7] = 605.7495663881315;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 5.0, 5);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(604.1962).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 604.1962, mnStrategy0, 604.1962);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 604.1962, (-3));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1359.1696418631072, 1359.1696418631072, 1359.1696418631072, 1359.1696418631072, 1359.1696418631072).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1671.8345);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 426.34137, mnStrategy0, (-1671.8345));
      int[] intArray0 = new int[0];
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1359.1696418631072, 1);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1240.694161), 0);
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2.0, 0);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2592.421, 1);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1671.8345);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.setValue(0, 0.1);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnUserParameterState mnUserParameterState1 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy1 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState1, 0, mnStrategy0, 426.34137);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross1 = new MnFunctionCross(fCNBase1, mnUserParameterState0, 652.02912443, mnStrategy0, 100.0);
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      intArray0[1] = 0;
      MnCross mnCross0 = mnFunctionCross1.cross(intArray0, doubleArray0, doubleArray0, 1, 12);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2692.382), 0);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0, (-4.0), 1.0, (-4.0), (-13.0)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      double double0 = 2592.421;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      int int0 = 1;
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 426.34137, mnStrategy0, 0.0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2.0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.1521640635026227, (-4.0), 2.1521640635026227, (-4.0), 2.1521640635026227).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 426.34137, mnStrategy0, 0.0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.1, 2551);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0, (-4.0), 1.0, (-4.0), (-13.0)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1671.8345);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.setLimits(2, 0.0, (-1671.8345));
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 426.34137, mnStrategy0, (-1671.8345));
      int[] intArray0 = new int[0];
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2.0, 0);
      int[] intArray1 = new int[8];
      intArray1[0] = 2;
      intArray1[1] = 2;
      intArray1[3] = 0;
      intArray1[4] = 2;
      intArray1[5] = 15;
      intArray1[6] = 1;
      intArray1[7] = 2;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (double) 1;
      doubleArray1[1] = (double) 0;
      doubleArray1[2] = (double) 0;
      doubleArray1[3] = (double) 2;
      doubleArray1[4] = (double) 0;
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray1, doubleArray1, doubleArray1, 0.0, 6);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 15, Size: 3
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.8747138, 1.8747138, 1.8747138, 1.8747138, 1.8747138).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.8747138;
      doubleArray0[1] = 1.8747138;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.setLimits(1, (double) 1, 1.8747138);
      MnStrategy mnStrategy0 = new MnStrategy(1);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.8747138, mnStrategy0, 1.8747138);
      int[] intArray0 = new int[1];
      intArray0[0] = 1;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.8747138, 1);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.setLimits(2, 429.3986700321, 1.0);
      MnStrategy mnStrategy1 = new MnStrategy(2);
      int[] intArray0 = new int[1];
      intArray0[0] = 2;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-3.4771498473437417);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)2, (-2062.002342219927), (-3.4771498473437417), 1242.28855782, (double)2).when(fCNBase0).valueOf(any(double[].class));
      MnStrategy mnStrategy2 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 429.3986700321, mnStrategy2, 1.0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 0.05, 2);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 425.84137;
      doubleArray0[1] = 0.5;
      doubleArray0[2] = (-1392.7601374774);
      doubleArray0[3] = (-1392.7601374774);
      doubleArray0[4] = (-1392.7601374774);
      doubleArray0[5] = 3293.9192528;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.setLimits(1, (double) 1, 0.5);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 4.0E-7, mnStrategy0, 2);
      int[] intArray0 = new int[8];
      intArray0[0] = 2;
      intArray0[1] = 1;
      intArray0[2] = 2;
      intArray0[3] = 2;
      intArray0[4] = 1;
      intArray0[5] = 1;
      intArray0[6] = 2;
      intArray0[7] = 0;
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 425.84137;
      doubleArray0[1] = 0.5;
      doubleArray0[2] = (-1392.7601374774);
      doubleArray0[3] = (-1392.7601374774);
      doubleArray0[4] = (-1392.7601374774);
      doubleArray0[5] = 3293.9192528;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.setUpperLimit(2, (-1392.7601374774));
      mnUserParameterState0.setLimits(1, (double) 1, 0.5);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 4.0E-7, mnStrategy0, 2);
      int[] intArray0 = new int[6];
      intArray0[0] = 0;
      intArray0[1] = 2;
      intArray0[2] = 2;
      intArray0[3] = 0;
      intArray0[4] = 2;
      intArray0[5] = 2776;
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 886.997064345, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2776, Size: 6
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(58.48, 58.48, 2592.421, 0.5, 557.38).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 425.84137;
      doubleArray0[1] = 0.5;
      doubleArray0[2] = (-1392.7601374774);
      doubleArray0[3] = (-1392.7601374774);
      doubleArray0[4] = (-1392.7601374774);
      doubleArray0[5] = 3293.9192528;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.setLimits(1, (double) 1, 0.5);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientStepTolerance(10.000000000000002);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 4.0E-7, mnStrategy0, 2);
      int[] intArray0 = new int[7];
      intArray0[0] = 2;
      intArray0[1] = 1;
      intArray0[2] = 2;
      intArray0[3] = 2;
      intArray0[0] = 1;
      intArray0[5] = 1;
      int[] intArray1 = new int[3];
      intArray1[0] = 1;
      intArray1[1] = 2;
      intArray0[0] = 1;
      mnFunctionCross0.cross(intArray1, doubleArray0, doubleArray0, (-1392.7601374774), (-95));
      // Undeclared exception!
      mnFunctionCross0.cross(intArray1, doubleArray0, doubleArray0, 2.2, 0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.8747138459049608;
      doubleArray0[1] = 1.8747138459049608;
      doubleArray0[2] = (-1392.7601374774);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.setLimits(1, (double) 1, 1.8747138459049608);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setHessianStepTolerance(675.36991082);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1, mnStrategy0, (-2722.347));
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      intArray0[1] = 0;
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1, 2336);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.setLimits(2, 2864.24751377, 1.0);
      MnStrategy mnStrategy1 = new MnStrategy(2);
      int[] intArray0 = new int[1];
      intArray0[0] = 2;
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-3.3556483051079953);
      mnUserParameterState0.setPrecision((-3.3556483051079953));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.0, (-3.3556483051079953), 2438.770388920847, 1.0E-4, 17.6).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2, mnStrategy0, (-3.3556483051079953));
      double[] doubleArray2 = new double[7];
      doubleArray2[0] = (double) 2;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray2, doubleArray2, 2, 14);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1.0), 3);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.2, (-4.0), 2.2, (-4.0), 2.2).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2.2, mnStrategy0, (-4.0));
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2.2, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[0];
      int int0 = 0;
      double double0 = 1679.2;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (-1396.9662610015), (-1396.9662610015)).when(fCNBase0).valueOf(any(double[].class));
      double double1 = 1.0;
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1396.9662610015), mnStrategy0, 10.000000000000002);
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0, 0);
      // Undeclared exception!
      try { 
        mnUserParameterState0.intOfExt((-1409089333));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ext=-1409089333
         //
         verifyException("org.freehep.math.minuit.MnUserTransformation", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.2, (-4.0), 2.2, (-4.0), 2.2).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2.2, mnStrategy0, (-4.0));
      int[] intArray0 = new int[0];
      mnStrategy0.setGradientTolerance(2.2);
      mnStrategy0.setGradientNCycles(1);
      mnFunctionCross0.cross(intArray0, doubleArray0, (double[]) null, (-718.41658404958), 1);
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2.2, 0);
      int[] intArray1 = new int[3];
      intArray1[0] = 0;
      intArray1[1] = (-408);
      intArray1[2] = 0;
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray1, doubleArray0, doubleArray0, 0.001, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.8747138;
      doubleArray0[1] = 1.8747138;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      int int0 = 1;
      mnUserParameterState0.setLimits(1, (double) 1, 1.8747138);
      MnStrategy mnStrategy0 = new MnStrategy(1);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.8747138, mnStrategy0, 1.8747138);
      int[] intArray0 = new int[8];
      intArray0[0] = 1;
      intArray0[1] = 1;
      intArray0[2] = 1;
      intArray0[3] = 1;
      mnUserParameterState0.setLowerLimit(1, (double) 1);
      intArray0[4] = 2514;
      intArray0[5] = 1;
      intArray0[6] = 1;
      intArray0[7] = 1;
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1, (-2054389229));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2514, Size: 6
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1392.7601374774), 1.8747138459049608, 1.0E-4, 28.97, (-990.7191297570284)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.8747138459049608;
      doubleArray0[1] = 1.8747138459049608;
      doubleArray0[2] = (-1392.7601374774);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.setLimits(1, (double) 1, 1.8747138459049608);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setHessianStepTolerance(675.36991082);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1, mnStrategy0, (-2722.347));
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      intArray0[1] = 0;
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1, 2336);
  }
}