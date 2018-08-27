/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 09:55:33 GMT 2018
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
import org.freehep.math.minuit.MinimumState;
import org.freehep.math.minuit.MnCross;
import org.freehep.math.minuit.MnFunctionCross;
import org.freehep.math.minuit.MnStrategy;
import org.freehep.math.minuit.MnUserParameterState;
import org.freehep.math.minuit.MnUserTransformation;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnFunctionCross_ESTest extends MnFunctionCross_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(17);
      double[] doubleArray0 = new double[4];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 0.0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (double)17, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, 17);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.0, 17);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(5.0, 5.0, 5.0, 5.0, 5.0).when(fCNBase0).valueOf(any(double[].class));
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[1];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 7, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 7, mnStrategy0, 0.0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 7, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(17);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (double) 17;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 0.0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (double)17, 0.0, 0.0, 17.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 17.0, mnStrategy0, 17);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.0, 589);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[1];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 7, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 7, mnStrategy0, (-5707.1944044538));
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 7, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(53);
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (double) 53;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation1 = mnUserTransformation0.clone();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 0.0, mnUserTransformation1);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (double)53, 0.0, 0.0, 53.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 53.0, mnStrategy0, (-0.9284828179916591));
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.0, 560);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-0.9284828179916591), 53);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(17);
      double[] doubleArray0 = new double[4];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 0.0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (double)17, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, 17);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 589, 17);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(23.746639359655532, 23.746639359655532, 23.746639359655532, 23.746639359655532, 23.746639359655532).when(fCNBase0).valueOf(any(double[].class));
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[4];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 7, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 7, mnStrategy0, 0.0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 7, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(17);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (double) 17;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 0.0, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy(17);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (double)17, 0.0, 0.0, 17.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 17.0, mnStrategy0, 17);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.0, 597);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(5.0, 5.0, 5.0, 5.0, 5.0).when(fCNBase0).valueOf(any(double[].class));
      MinimumState minimumState0 = new MinimumState(4);
      double[] doubleArray0 = new double[1];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 4, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 4, mnStrategy0, (-5707.1944044538));
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1278.50071727458, 1489);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(17);
      double[] doubleArray0 = new double[4];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation1 = mnUserTransformation0.clone();
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 0.0, mnUserTransformation1);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (double)17, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, 17);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 17, 0);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1056.7816952), 0);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.5, 1375.6022598642, 1375.6022598642).when(fCNBase0).valueOf(any(double[].class));
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (double) 7;
      doubleArray0[0] = (double) 7;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation();
      mnUserTransformation1.add("", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 7, mnUserTransformation1);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 7, mnStrategy0, 7.0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2.0, 0);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.0, 7);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(13.0, 13.0, 0.5, 1375.6022598642, 1375.6022598642).when(fCNBase0).valueOf(any(double[].class));
      MinimumState minimumState0 = new MinimumState(12);
      double[] doubleArray0 = new double[4];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      mnUserTransformation0.add("", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 12, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 12, mnStrategy0, 0.0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 13.0, 12);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(13.0, 13.0, 0.5, 0.5, 0.5).when(fCNBase0).valueOf(any(double[].class));
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (double) 7;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation();
      mnUserTransformation1.add("", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 7, mnUserTransformation1);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 7, mnStrategy0, 0.0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.5, 7);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(13.0, 13.0, 0.5, 1375.6022598642, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MinimumState minimumState0 = new MinimumState(12);
      double[] doubleArray0 = new double[4];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      mnUserTransformation0.add("", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 12, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 12, mnStrategy0, 0.0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2528.0700000000184), 12);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(13.0, 13.0, 11.017336604031033, 1376.3184893286655).when(fCNBase0).valueOf(any(double[].class));
      MinimumState minimumState0 = new MinimumState(4);
      double[] doubleArray0 = new double[4];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      mnUserTransformation0.add("", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 4, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 4, mnStrategy0, 0.0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 4, 4);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 41.14015526607555, 1358.4114116952105, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 7;
      doubleArray0[1] = (double) 7;
      doubleArray0[0] = (double) 7;
      doubleArray0[3] = (double) 7;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation();
      mnUserTransformation1.add("", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 7, mnUserTransformation1);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 7, mnStrategy0, 7.0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2.0, 0);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.0, 7);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(13.0, 13.0, 1.0685673208472362, 1376.3184893286655, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MinimumState minimumState0 = new MinimumState(4);
      double[] doubleArray0 = new double[4];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      mnUserTransformation0.add("", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 4, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 4, mnStrategy0, 0.0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 13.0, 4);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(13.0, 13.0, 0.5, 1375.6022598642, 1375.6022598642).when(fCNBase0).valueOf(any(double[].class));
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 7;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation();
      mnUserTransformation1.add("", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 7, mnUserTransformation1);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 7, mnStrategy0, 7.0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-377.39), 2);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(13.0, 13.0, 0.5).when(fCNBase0).valueOf(any(double[].class));
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (double) 7;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation(doubleArray0, doubleArray0);
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation();
      mnUserTransformation1.add("", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 7, mnUserTransformation1);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.3, mnStrategy0, 0.5);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 13.0, 7);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(13.0, 13.0, 0.5, 1375.6022598642, 1375.6022598642).when(fCNBase0).valueOf(any(double[].class));
      MinimumState minimumState0 = new MinimumState(12);
      double[] doubleArray0 = new double[8];
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      mnUserTransformation0.add("y", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 12, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 12, mnStrategy0, 0.0);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 12, 12);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MinimumState minimumState0 = new MinimumState(7);
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      mnUserTransformation0.add("", 7);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 7, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 7, mnStrategy0, 0.5);
      int[] intArray0 = new int[1];
      mnUserTransformation0.add(":L%GgV7t1=^x|u^g:a0", 555, 0.29999999999999716);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.5, (double)555, 5.655788504057825, 5.655788504057825, 0.2).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross1 = new MnFunctionCross(fCNBase1, mnUserParameterState0, 0.5, mnStrategy0, 5.655788504057825);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 7;
      doubleArray0[1] = (double) 7;
      mnFunctionCross1.cross(intArray0, doubleArray0, doubleArray0, 2440.7174230897, (-419));
      mnFunctionCross1.cross(intArray0, doubleArray0, doubleArray0, 1.0, 555);
      MnCross mnCross0 = mnFunctionCross1.cross(intArray0, doubleArray0, doubleArray0, 555, 555);
      MnCross mnCross1 = mnFunctionCross1.cross(intArray0, doubleArray0, doubleArray0, 555, 4);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[16];
      doubleArray0[0] = (double) 7;
      doubleArray0[7] = (double) 7;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      mnUserTransformation0.add("", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 7, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.setUpperLimit("", 7.0);
      int[] intArray0 = new int[7];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(fCNBase0).valueOf(any(double[].class));
      MnUserParameterState mnUserParameterState1 = mnUserParameterState0.clone();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState1, 7.0, mnStrategy0, 0.1);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.1, 7);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[16];
      doubleArray0[0] = (double) 7;
      doubleArray0[3] = (double) 7;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation();
      mnUserTransformation1.add("", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 7, mnUserTransformation1);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.setUpperLimit("", 7.0);
      int[] intArray0 = new int[7];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)7, 7.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 7.0, mnStrategy0, 7.0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1558.9752848073042), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[16];
      doubleArray0[0] = (double) 7;
      doubleArray0[7] = (double) 7;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      mnUserTransformation0.add("", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 7, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.setUpperLimit("", 7.0);
      int[] intArray0 = new int[7];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1212.68356125, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.05, mnStrategy0, 7.0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 7, 3);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[16];
      doubleArray0[0] = (double) 7;
      doubleArray0[1] = (double) 7;
      doubleArray0[3] = (double) 7;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      mnUserTransformation0.add("", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 7, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientStepTolerance((-2208.411336307736));
      mnUserParameterState0.setUpperLimit("", 7.0);
      int[] intArray0 = new int[7];
      MnStrategy mnStrategy1 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(7.0, 7.0, 905.065, (-909.5366997), (-2.6741606574809445E13)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 7.0, mnStrategy0, 560);
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 400.91543171135424, 560);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2115.78), (-715827883));
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2208.411336307736), (-1655));
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 560, 0);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[16];
      doubleArray0[0] = (double) 7;
      doubleArray0[1] = (double) 7;
      doubleArray0[3] = (double) 7;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation();
      mnUserTransformation1.add("", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 7, mnUserTransformation1);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[0];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2406.0268977594, 10.0, 7.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2406.0268977594, mnStrategy0, 7);
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.000000000000007, 7);
      mnUserParameterState0.setUpperLimit("", 7.0);
      int[] intArray1 = new int[7];
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(7.0, 7.0, 905.065, (double)1949, (-2.97777947160644)).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross1 = new MnFunctionCross(fCNBase1, mnUserParameterState0, 7.0, mnStrategy0, 560);
      mnFunctionCross1.cross(intArray1, doubleArray0, doubleArray0, 7.0, 1949);
      mnFunctionCross0.cross(intArray1, doubleArray0, doubleArray0, 1265.0663334, 382);
      mnFunctionCross1.cross(intArray0, doubleArray0, doubleArray0, 2406.0268977594, 382);
      MnCross mnCross0 = mnFunctionCross1.cross(intArray1, doubleArray0, doubleArray0, (-1558.9752848073042), 1949);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray1, doubleArray0, doubleArray0, 10.0, 7);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[16];
      doubleArray0[0] = (double) 7;
      doubleArray0[1] = (double) 7;
      doubleArray0[3] = (double) 7;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation();
      mnUserTransformation1.add("", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 7, mnUserTransformation1);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[0];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1375.6022598642, 10.0, 7.0, (-0.5), (double)7).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1375.6022598642, mnStrategy0, (-222.07200710349));
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 7.0, 1949);
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.000000000000007, 7);
      mnUserParameterState0.setUpperLimit("", 7.0);
      int[] intArray1 = new int[7];
      MnStrategy mnStrategy1 = new MnStrategy();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(7.0, 7.0, 905.065, 1691.5173678112, 905.065).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross1 = new MnFunctionCross(fCNBase1, mnUserParameterState0, 7.0, mnStrategy0, 560);
      MnCross mnCross0 = mnFunctionCross1.cross(intArray1, doubleArray0, doubleArray0, 7.0, 0);
      mnFunctionCross0.cross(intArray1, doubleArray0, doubleArray0, 1265.0663334, 382);
      mnFunctionCross1.cross(intArray0, doubleArray0, doubleArray0, 1375.6022598642, 382);
      mnFunctionCross1.cross(intArray1, doubleArray0, doubleArray0, (-1558.9752848073042), 1949);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray1, doubleArray0, doubleArray0, 10.0, 7);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[16];
      doubleArray0[0] = (double) 7;
      doubleArray0[1] = (double) 7;
      doubleArray0[3] = (double) 7;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      mnUserTransformation0.add("", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 7, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientStepTolerance((-2208.411336307736));
      mnUserParameterState0.setUpperLimit("", 7.0);
      int[] intArray0 = new int[7];
      MnStrategy mnStrategy1 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(7.0, 7.0, 905.065, (-909.5366997), (-2.6741606574809445E13)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 7.0, mnStrategy0, 560);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2115.78), (-715827883));
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-2208.411336307736), (-1655));
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[16];
      doubleArray0[0] = (double) 7;
      doubleArray0[1] = (double) 7;
      doubleArray0[3] = (double) 7;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      MnUserTransformation mnUserTransformation1 = new MnUserTransformation();
      mnUserTransformation1.add("", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 7, mnUserTransformation1);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[0];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1375.6022598642, 10.0, 7.0, (-0.5), (double)7).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1375.6022598642, mnStrategy0, (-222.07200710349));
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 7.0, 7);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.000000000000007, 7);
      mnUserParameterState0.setUpperLimit("", 7.0);
      int[] intArray1 = new int[7];
      MnStrategy mnStrategy1 = new MnStrategy();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(7.0, 7.0, 905.065, 905.065, 14.200000000000003).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross1 = new MnFunctionCross(fCNBase1, mnUserParameterState0, 7.0, mnStrategy0, 560);
      mnFunctionCross1.cross(intArray1, doubleArray0, doubleArray0, 7.0, 0);
      mnFunctionCross0.cross(intArray1, doubleArray0, doubleArray0, 1265.0663334, 382);
      mnFunctionCross1.cross(intArray0, doubleArray0, doubleArray0, 1375.6022598642, 382);
      mnFunctionCross1.cross(intArray1, doubleArray0, doubleArray0, (-1558.9752848073042), 7);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray1, doubleArray0, doubleArray0, 10.0, 7);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MinimumState minimumState0 = new MinimumState(7);
      double[] doubleArray0 = new double[16];
      doubleArray0[0] = (double) 7;
      doubleArray0[7] = (double) 7;
      MnUserTransformation mnUserTransformation0 = new MnUserTransformation();
      mnUserTransformation0.add("", 0.0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(minimumState0, 7, mnUserTransformation0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnUserParameterState0.setUpperLimit("", 7.0);
      int[] intArray0 = new int[7];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)7, (double)7, 7.0, 0.1, (-735.3424441128)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-905.724), mnStrategy0, 7.0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.0, 7);
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (-905.724);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray1, 7.0, 2130);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }
}