/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 23:28:08 GMT 2019
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
      MnUserParameters mnUserParameters0 = new MnUserParameters();
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0, mnUserCovariance0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-948.5372582806), mnStrategy0, 0.0);
      int[] intArray0 = new int[2];
      intArray0[0] = 227;
      double[] doubleArray0 = new double[2];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, (double[]) null, 100.0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 227, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0E-35, mnStrategy0, 1.0E-35);
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross((int[]) null, doubleArray0, doubleArray0, (-1548.6119458713886), 0);
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
      doReturn((-0.1), (-0.1), (-0.1), (-0.1), 2389.851698251681).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[8];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-0.1), mnStrategy0, 2389.851698251681);
      int[] intArray0 = new int[4];
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-0.1), 574);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy((-2125747983));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.1, mnStrategy0, (-3148.8783641));
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 0.1, (-2125747983));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Invalid state
         //
         verifyException("org.freehep.math.minuit.MnApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.1), (-0.1), (-0.1), (-0.1), 2389.851698251681).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[11];
      MnUserParameters mnUserParameters0 = new MnUserParameters(doubleArray0, doubleArray0);
      MnUserCovariance mnUserCovariance0 = new MnUserCovariance();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(mnUserParameters0, mnUserCovariance0);
      MnStrategy mnStrategy0 = new MnStrategy(826);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-0.1), mnStrategy0, (-0.1));
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2769.49718110871), 826);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnUserCovariance", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[0];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy((-445));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-2.1234869590446294E12), mnStrategy0, 2.0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-445), 200);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (double)0, (-4410.411), (-4410.411)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0, mnStrategy0, 0);
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (double)0, (double)728, (double)0, (double)728).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0, mnStrategy0, 0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 728, 728);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      mnUserParameterState0.add("z|}fo>#", (double) 812);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(10.0, (-2942.8), (double)812, (-1789.67594239532), 3222.73034649028).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1614.23436021045, mnStrategy0, 0.51);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1.253527154868531), (-1));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.add("", (-2415.41), (-2415.41), (-2.5036549446246776), (-2415.41));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, (-2.5036549446246776), (-2415.41), (-2415.41), (-314.0268541906357)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-324.091166400046), mnStrategy0, 9.875293026985503);
      int[] intArray0 = new int[5];
      mnUserParameterState0.fix(0);
      double[] doubleArray0 = new double[5];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-324.091166400046), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1789.67594239532), 7.045081615245559, 476.3372176391279, 7.045081615245559, (double)827).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 7.045081615245559, mnStrategy0, 476.3372176391279);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.8999999999999999, 827);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1789.67594239532), 10.0, 10.0, 10.0, (double)812).when(fCNBase0).valueOf(any(double[].class));
      mnUserParameterState0.add("z|}fo>#", (double) 812);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 10.0, mnStrategy0, 10.0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.5, 812);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.add("7GJWk!#_7zt", 8.039320402328956, 8.039320402328956, 0.85, 8.039320402328956);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, 0.85, 8.039320402328956, 8.039320402328956, (-297.7116433405)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0, mnStrategy0, 1.0);
      int[] intArray0 = new int[4];
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = 1.0;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.add("", (-2415.409763714671), (-2415.409763714671), 6.995279725121483, (-2415.409763714671));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, 6.995279725121483, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-324.0911664), mnStrategy0, 9.87529302699);
      int[] intArray0 = new int[5];
      mnUserParameterState0.fix("");
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 9.87529302699;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2415.409763714671), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.add("", (-2415.409763714671), (-2415.409763714671), 6.995279725121483, (-2415.409763714671));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, 6.995279725121483, (-2415.409763714671), (-2415.409763714671), (-2415.409763714671)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-324.0911664), mnStrategy0, 9.87529302699);
      int[] intArray0 = new int[5];
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 9.87529302699;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2415.409763714671), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 7.045081615245559, mnStrategy0, 476.3372176391279);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-432.22533665332), 2268);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1610.7083481557877, 4030.0, 121.1, 121.1, 4030.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[8];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-3433.0149), mnStrategy0, (-1123.3848334));
      int[] intArray0 = new int[3];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1112.46778393, 294);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1789.67594239532), 10.0, 10.0, 10.0, (double)789).when(fCNBase0).valueOf(any(double[].class));
      mnUserParameterState0.add("z|}fo>#", (double) 789);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 10.0, mnStrategy0, 10.0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-9.59), 789);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 264.910066215288, 789);
      assertNotSame(mnCross1, mnCross0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-2816.98272405074), (-2816.98272405074), (-2816.98272405074), (-2816.98272405074), 2391.3309084367816).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[8];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-2816.98272405074), mnStrategy0, 8.039320402328956);
      mnUserParameterState0.add("", (-1688.07366504), 4.0, 7.7835423851689765, 3421.0);
      int[] intArray0 = new int[4];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 8.039320402328956, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.51, 2.0, 0.51, (-2816.98272405074), 1709.37098).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 8.039320402328956, mnStrategy0, (-2816.98272405074));
      mnUserParameterState0.add("X6^t^Jh]0&", 287.467312, (-1.2704979587792562E15), 0.8456120506391973, (-114.229));
      int[] intArray0 = new int[7];
      double[] doubleArray0 = new double[8];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1.2704979587792562E15), 9);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-1789.67594239532)).when(fCNBase0).valueOf(any(double[].class));
      mnUserParameterState0.add("z|}fo>#", (double) 789);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 10.0, mnStrategy0, 10.0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 264.910066215288, 789);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(476.3372176391279, 476.3372176391279, 476.3372176391279, 476.3372176391279, 476.3372176391279).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[2];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 476.3372176391279, mnStrategy0, 476.3372176391279);
      int[] intArray0 = new int[1];
      mnUserParameterState0.setUpperLimit(0, (double) 0);
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (-2837.57);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, (-1023.9966), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      mnUserParameterState0.add("", 8.039320402328956, 8.039320402328956, 0.85, 8.039320402328956);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, 0.85, 8.039320402328956, 8.039320402328956, (-314.0268541906357)).when(fCNBase0).valueOf(any(double[].class));
      int[] intArray0 = new int[3];
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (-314.0268541906357);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-330.29729402253594), mnStrategy0, 0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-314.0268541906357), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.add("", (-2415.40976), (-2415.40976), 6.995279725121483, (-2415.40976));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, 6.995279725121483, (-2415.40976), (-2415.40976), (-314.03)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-324.0911664), mnStrategy0, 9.87529302699);
      int[] intArray0 = new int[4];
      mnUserParameterState0.setLowerLimit(0, (-1686.3298947728));
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = 9.87529302699;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2415.40976), 0);
      assertNotNull(mnCross0);
  }
}