/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 09:24:54 GMT 2019
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
import org.freehep.math.minuit.MnUserParameterState;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnFunctionCross_ESTest extends MnFunctionCross_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(10001.57665407262, 10001.57665407262, 10001.57665407262, (-605.032), 580.96709232).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1140.27109);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 3382.351025422, mnStrategy0, 3382.351025422);
      mnUserParameterState0.setLimits(3, 118.2499, (double) 3);
      int[] intArray0 = new int[8];
      intArray0[0] = 3;
      double[] doubleArray1 = new double[9];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, (-46.7361366329641), 2);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.2, 0.2, 0.2, 0.2, 0.2).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[9];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(3);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 3382.351025422, mnStrategy0, 3382.351025422);
      mnUserParameterState0.setLimits(3, (-1687.211351), (-0.5));
      int[] intArray0 = new int[3];
      intArray0[1] = 3;
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2145449270, (-2529));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[5];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 283.2985008278825, mnStrategy0, 1160.8449562273);
      mnUserParameterState0.setLimits(3, 2.0, 1895.1081979429637);
      int[] intArray0 = new int[6];
      intArray0[0] = 3;
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, (double[]) null, 2.0, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[0];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0, 0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 3, mnStrategy0, 0.0);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 768);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, (MnUserParameterState) null, 0.0, mnStrategy0, 0.0);
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross((int[]) null, doubleArray0, doubleArray0, (-225.59), 803);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, (MnUserParameterState) null, 0.0, mnStrategy0, 862.570957);
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, (double[]) null, (double[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-17.52117548598926), (-17.52117548598926), (-17.52117548598926), (-17.52117548598926), 182.367).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, 182.367);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-17.52117548598926), 0);
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
      double[] doubleArray0 = new double[2];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-43.80304637274293), (-43.80304637274293), 0.0, 0.0, 2321.2845200829133).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-43.80304637274293), mnStrategy0, 0.001);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 8.881784197001252E-16, 1102);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(1389);
      mnStrategy0.setMediumStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, 0.05);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.0, 1389);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[0];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 182.367, mnStrategy0, 0.0);
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 4.0, 5749);
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
      doReturn((-0.5), (-0.5), (-0.5), (-0.2543968174394724), 4687.318769118985).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1140.27109);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(3);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2745.8841787849683, mnStrategy0, 2745.8841787849683);
      mnUserParameterState0.setLimits(3, (-2093.0), 2745.8841787849683);
      mnUserParameterState0.setPrecision((-54.0));
      int[] intArray0 = new int[5];
      intArray0[0] = 3;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 4687.318769118985, 3);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1236), 2005);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.5), (-0.5), (-0.5), (-0.2543968174394724), 4687.318769118985).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1140.27109);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(3);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.820366263735633, mnStrategy0, 2745.8841787849683);
      mnUserParameterState0.setLimits(3, (-2093.0), 2745.8841787849683);
      mnUserParameterState0.setPrecision((-54.0));
      int[] intArray0 = new int[5];
      intArray0[0] = 3;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.820366263735633, 3);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1199), 2005);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-17.52117548598926), (-17.52117548598926), (-17.52117548598926), (-17.52117548598926), 182.367).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, (-1473.304340635985));
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 4.0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-17.181545284409665), (-17.181545284409665), (-17.181545284409665), (-17.181545284409665), 182.367).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, 182.367);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0E-6, 485);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1140.27109);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(3);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0E-35, mnStrategy0, 3382.351025422);
      mnUserParameterState0.setLimits(3, (-2093.0), 2745.8841787849683);
      mnUserParameterState0.setPrecision((-54.0));
      int[] intArray0 = new int[5];
      intArray0[0] = 3;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1199), 2024);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 283.2985008278825, mnStrategy0, 1160.8449562273);
      int[] intArray0 = new int[2];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1.0), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(14.0, 0.0, 14.0, 0.0, 0.5).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(1389);
      mnStrategy0.setMediumStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, 0.05);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.016186132275276932, 12);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.5), 1236.0829934, (-0.5), 37.15034396884939, 4697.1236).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1140.27109);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(3);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0E-35, mnStrategy0, 1236.0829934);
      mnUserParameterState0.setLimits(3, (-0.5), 2745.8841787849683);
      mnUserParameterState0.setPrecision((-54.0));
      int[] intArray0 = new int[5];
      intArray0[0] = 3;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1199), 2024);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-24.0), (-24.0), 0.0, 0.0, 2321.2845200829133).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-0.5), mnStrategy0, 0.2266122290050559);
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-0.5), 196);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.2, 2147460674);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-43.80304637274293), (-43.80304637274293), 0.0, 0.0, 2321.2845200829133).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-43.80304637274293), mnStrategy0, 2321.2845200829133);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.02, 2057464148);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-9.846178060212054E125), 2057464148);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(14.0, 0.0, 14.0, 0.0, 0.5).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(1389);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, 0.05);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1389, 1533);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-25.395289888671744), (-25.395289888671744), 0.0, 0.0, 2321.8991783).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.5, mnStrategy0, (-25.395289888671744));
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 3490.3, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[5];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(3);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0E-35, mnStrategy0, 3382.351025422);
      int[] intArray0 = new int[4];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 709, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (-1140.27109);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 3, mnStrategy0, 3);
      mnUserParameterState0.setUpperLimit(3, 118.2499);
      int[] intArray0 = new int[16];
      intArray0[0] = 3;
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 118.2499, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.2, 0.2, 0.2, 0.2, 0.2).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 0.2;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(3);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 3382.351025422, mnStrategy0, 3382.351025422);
      int[] intArray0 = new int[3];
      mnUserParameterState0.setLowerLimit(3, 0.2);
      intArray0[0] = 3;
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2145449270, (-2529));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.2, 0.2, 0.2, 0.2, 0.2).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 0.2;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(3);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 3382.351025422, mnStrategy0, 3382.351025422);
      mnUserParameterState0.setLimits(3, (-1687.211351), (-0.5));
      int[] intArray0 = new int[3];
      intArray0[0] = 3;
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 2145449270, (-2529));
  }
}