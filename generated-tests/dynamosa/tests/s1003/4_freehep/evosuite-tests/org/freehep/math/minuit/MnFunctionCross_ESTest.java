/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 03 01:13:25 GMT 2019
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
import org.freehep.math.minuit.MnCross;
import org.freehep.math.minuit.MnFunctionCross;
import org.freehep.math.minuit.MnStrategy;
import org.freehep.math.minuit.MnUserCovariance;
import org.freehep.math.minuit.MnUserParameterState;
import org.freehep.math.minuit.MnUserParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnFunctionCross_ESTest extends MnFunctionCross_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy((-911));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2.0, mnStrategy0, 10.000000000000002);
      int[] intArray0 = new int[1];
      intArray0[0] = (-911);
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 10.000000000000002, (-911));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.3, mnStrategy0, 566.068);
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross((int[]) null, doubleArray0, doubleArray0, (-1067.17), 3253);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.3, mnStrategy0, 0.3);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 0.3, 13);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid state
         //
         verifyException("org.freehep.math.minuit.MnApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[4];
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross((FCNBase) null, mnUserParameterState0, 0, mnStrategy0, 0);
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[4];
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross((FCNBase) null, mnUserParameterState0, 0, mnStrategy0, 0);
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[15];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (double)0, (double)0, (-1.4151942842907794), (-1.4151942842907794)).when(fCNBase0).valueOf(any(double[].class));
      MnStrategy mnStrategy0 = new MnStrategy();
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0, mnUserCovariance0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, -0.0, mnStrategy0, (-0.5));
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserCovariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.3, 0.3).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.3, mnStrategy0, 0.3);
      int[] intArray0 = new int[0];
      mnStrategy0.setHighStrategy();
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 0.3, 13);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(307.819439771073, 307.819439771073, 0.0, 0.5, 10.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.5, mnStrategy0, 0.5);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 0.0, 2);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1763.7423751), (-2.019363137291674), (-1763.7423751), 0.8619399999999999, (-2.019363137291674)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-608.84514578052), mnStrategy0, 0.0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-608.84514578052), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(25.47, 10.0, 0.51).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.5, mnStrategy0, 0.5);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 2, 2);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-3.9076733670787243), 0.5, (-3.9076733670787243), (-3.9076733670787243), 850.738067594531).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.5, mnStrategy0, 0.5);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 0.5, 2);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[5];
      mnUserParameterState0.setPrecision(1580.3191619460608);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-20.623877), 0.5, (double)2137745031, 0.0, (-0.37)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1.0), mnStrategy0, 0.5);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1.0), 2137745031);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.3, 0.3, 3831.3893556, 0.3, 0.3).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.3, mnStrategy0, 3831.3893556);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[4];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.5), (double)751, 1475.5884313, (double)0, (double)751).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0, mnStrategy0, 0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 751);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.3, mnStrategy0, (-3580.5902));
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 13, 13);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.3, 673.8643110671035).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.3, mnStrategy0, 566.068);
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[7];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.3, 1960);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.setLowerLimit(0, 0.0);
      int[] intArray0 = new int[4];
      double[] doubleArray1 = new double[5];
      doubleArray1[3] = (-4.170568230187743);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-4.170568230187743), 0.5, (double)2137745019, 0.0, (-0.36871880363220744)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-4.170568230187743), mnStrategy0, 0.5);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 0.0, 0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.3, 0.3, 0.3, 0.3, 0.3).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.3, mnStrategy0, 0.3);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 0.3, 13);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.setLowerLimit(0, 0.0);
      int[] intArray0 = new int[4];
      double[] doubleArray1 = new double[4];
      doubleArray1[3] = (-4.170568230187743);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-4.170568230187743), 0.5, (double)(-2126008811), 0.0, (-4.170568230187743)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1.0), mnStrategy0, 0.5);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, (-4.170568230187743), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[5];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 6.6000000000000005, mnStrategy0, 6.6000000000000005);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-4.170568230187743), 1284);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[4];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0, mnStrategy0, 0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 69);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1.3805771919544716)).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1.3805771919544716), mnStrategy0, (-1.3805771919544716));
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, (-1.3805771919544716), 1840700269);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.setLowerLimit(0, 0.0);
      int[] intArray0 = new int[5];
      double[] doubleArray1 = new double[5];
      doubleArray1[3] = (-20.623876795912015);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-927.370405), mnStrategy0, 0);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray1, 0, 0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[2];
      mnStrategy0.setHighStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (double)0, (double)0, (double)0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0, mnStrategy0, 0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[4];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)17, (double)17, (double)17, (double)17, (double)17).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 17, mnStrategy0, 17);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 17, 17);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[4];
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = 0.5;
      mnUserParameterState0.setLimits(0, (-1.0), (double) 2137745019);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-4.170568230187743), 0.5, (double)2137745019, 0.0, (-0.11047149214916624)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1.0), mnStrategy0, 0.5);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray1, 0.5, 0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.setLowerLimit(0, 0.0);
      int[] intArray0 = new int[4];
      double[] doubleArray1 = new double[5];
      doubleArray1[3] = (-4.170568230187743);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-4.170568230187743), 0.5, (double)2137745019, 0.0, (-0.11047149214916624)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1.0), mnStrategy0, 0.5);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray1, 0.5, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.setLowerLimit(0, 0.0);
      int[] intArray0 = new int[4];
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = 0.5;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-4.170568230187743), 0.5, (double)2137745019, 0.0, (-0.11047149214916624)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1.0), mnStrategy0, 0.5);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray1, 0.5, 0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[15];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.setLowerLimit(0, 0.0);
      int[] intArray0 = new int[14];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (double)0, (double)0, (-2.45561170125404), (-2.45561170125404)).when(fCNBase0).valueOf(any(double[].class));
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, 0);
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2.45561170125404), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-69.61465009760641), (-69.61465009760641), 4.0, (-69.61465009760641), (-69.61465009760641)).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-69.61465009760641), mnStrategy0, 4.0);
      int[] intArray0 = new int[0];
      double[] doubleArray0 = new double[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-69.61465009760641), (-5444));
      assertNotNull(mnCross0);
  }
}
