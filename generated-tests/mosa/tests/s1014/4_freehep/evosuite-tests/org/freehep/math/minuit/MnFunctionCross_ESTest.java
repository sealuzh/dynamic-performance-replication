/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 05:22:59 GMT 2018
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
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2.0E-6, mnStrategy0, 12.000000000000002);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.0E-6, 2.0E-6, 2.0E-6, 2.0E-6, 2.0E-6).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      MnStrategy mnStrategy0 = new MnStrategy((-5));
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2.0E-6, mnStrategy0, 12.000000000000002);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-5), (-5));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.0E-6, 2.0E-6, 2.0E-6, 2.0E-6, 2.0E-6).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2.0E-6, mnStrategy0, 12.000000000000002);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 17.6, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.0E-6, 2.0E-6, 2.0E-6, 2.0E-6, 2.0E-6).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnStrategy0.setHighStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.3, mnStrategy0, 12.000000000000002);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.0E-6, 2.0E-6, 2.0E-6, 2.0E-6, 2.0E-6).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 2.0E-6, mnStrategy0, 0);
      mnUserParameterState0.setLowerLimit(0, (double) 0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1126.64882), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.0E-6, 2.0E-6, 2.0E-6, 2.0E-6, 2.0E-6).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[3];
      MnStrategy mnStrategy0 = new MnStrategy(0);
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) 0;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray1, doubleArray1);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, 0);
      int[] intArray0 = new int[1];
      intArray0[0] = 0;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 0.0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2779.8240272026, 0.5, 0.5, 0.5, 0.5).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      double double0 = 0.0;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      int int0 = 14;
      MnStrategy mnStrategy0 = new MnStrategy(14);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 14, mnStrategy0, 0.0);
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-0.099999), 0);
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
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.0E-6, 2.0E-6, 2.0E-6, 2.0E-6, 2.0E-6).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.3, mnStrategy0, 12.000000000000002);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 577.987561464, 0);
      assertNotSame(mnCross1, mnCross0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(3213.422, 3213.422, 3213.422, 3213.422, 3213.422).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = 165.272208686;
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.02, mnStrategy0, 2404.2398110419);
      int[] intArray0 = new int[2];
      intArray0[0] = 0;
      intArray0[1] = 0;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 165.272208686, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-0.9211331236876388), (-0.9211331236876388), 1.0E-6, 1.0E-6, 577.987562464).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-0.9211331236876388), mnStrategy0, (-0.9211331236876388));
      MnStrategy mnStrategy1 = new MnStrategy(0);
      mnStrategy1.setGradientTolerance(0);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-0.9211331236876388), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-25.149322896679344), (-25.149322896679344), 1.0E-6, 1.0E-6, 578.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      doubleArray0[0] = 2.159617072017956;
      doubleArray0[6] = (-25.149322896679344);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, 2.159617072017956);
      int[] intArray0 = new int[3];
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-25.149322896679344), 0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = 0.0;
      doubleArray0[2] = 0.0;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(7);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross((FCNBase) null, mnUserParameterState0, 0.0, mnStrategy0, 7);
      int[] intArray0 = new int[1];
      intArray0[0] = 7;
      mnUserParameterState0.setLowerLimit(7, 0.0);
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 7, 7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnFcn", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2.0E-6, 0.5, 0.5, 0.5, 0.5).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[1];
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.3, mnStrategy0, 0.3);
      int[] intArray0 = new int[1];
      intArray0[0] = 0;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.44999999999999996, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2803.442421762374, 0.5, 0.5, 0.5, 0.5).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1, mnStrategy0, (-1.0));
      int[] intArray0 = new int[2];
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 165.272208686, 0);
      mnStrategy0.setGradientTolerance(0.5);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1, 0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(3213.422, 3213.422, 3213.422, 3213.422, 3213.422).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = 165.272208686;
      doubleArray0[3] = 3213.422;
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-0.5), mnStrategy0, 165.272208686);
      mnUserParameterState0.add("MnFunctionCross problem 1", (-0.1), (-1639.90625997463), 165.272208686, (double) 0);
      MnStrategy mnStrategy1 = new MnStrategy();
      mnStrategy1.setHessianG2Tolerance(3213.422);
      mnStrategy0.setGradientTolerance(3213.422);
      int[] intArray0 = new int[4];
      intArray0[0] = 0;
      intArray0[1] = 0;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.1, 1);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-0.1), 0);
      assertNotSame(mnCross1, mnCross0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-25.149322896679344), (-25.149322896679344), 1.0E-6, 1.0E-6, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 1.0E-6;
      doubleArray1[1] = (-25.149322896679344);
      doubleArray0[6] = (-25.149322896679344);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, 1.0E-6);
      int[] intArray0 = new int[1];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray0, (-25.149322896679344), 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(2924.98741, 2924.98741, 1.0E-6, 1.0E-6, 578.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 1.0E-6;
      doubleArray1[1] = 2924.98741;
      doubleArray0[0] = 2924.98741;
      doubleArray0[6] = 2924.98741;
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, 1.0E-6);
      int[] intArray0 = new int[0];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1375.6676124267, 1079);
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray0, 1.0E-4, 73);
      assertNotSame(mnCross1, mnCross0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-6, (-25.1493229), 1.0E-6, 1.0E-6, 1.0E-7).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = 1.0E-6;
      doubleArray1[1] = (-1521.628287);
      doubleArray0[0] = (-25.1493229);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnUserParameterState mnUserParameterState1 = mnUserParameterState0.clone();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState1, 1.0E-6, mnStrategy0, (-1521.628287));
      mnUserParameterState1.setLowerLimit(0, 1.0E-6);
      mnStrategy0.setGradientTolerance((-6283.669970355663));
      int[] intArray0 = new int[5];
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 0.51, 1073741825);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-25.149322896679344), (-25.149322896679344), 1.0E-6, 1.0E-6, 577.987562464).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 1.0E-6;
      doubleArray1[1] = (-25.149322896679344);
      doubleArray0[0] = 1.0;
      doubleArray0[6] = (-25.149322896679344);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, 1.0E-6);
      int[] intArray0 = new int[3];
      doubleArray1[7] = (double) 0;
      mnUserParameterState0.setLowerLimit(0, 0.0);
      mnUserParameterState0.setLowerLimit(0, 0.0);
      mnStrategy0.setGradientTolerance(1.0);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, (-344.1017888414), 0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = 1.0E-6;
      doubleArray1[1] = (-1521.628287);
      doubleArray1[5] = 1.0E-6;
      doubleArray0[0] = (-25.149322896679344);
      doubleArray1[7] = (-25.149322896679344);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(125.222, 12.0, 12.0, (-197.6045136), (-25.149322896679344)).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase1, mnUserParameterState0, 577.987562464, mnStrategy0, 1.0);
      mnUserParameterState0.setLowerLimit(0, (-25.149322896679344));
      mnStrategy0.setGradientTolerance(1.0E-6);
      int[] intArray0 = new int[1];
      intArray0[0] = 0;
      mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray0, (-598.805140418), 0);
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 2941.5092772115713, 0);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, (-2207.7949), 0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-25.149322896679344), (-25.149322896679344), 1.0E-6, 1.0E-6, 1.0E-6).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 1.0E-6;
      doubleArray1[1] = (-25.149322896679344);
      doubleArray0[6] = (-25.149322896679344);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, 1.0E-6);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray0, (-25.149322896679344), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double double0 = 577.987562464;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-25.149322896679344), (-25.149322896679344), 1.0E-6, 1.0E-6, 577.987562464).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[4];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = 1.0E-6;
      doubleArray1[1] = (-25.149322896679344);
      doubleArray1[7] = (-25.149322896679344);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, 1.0E-6);
      MnStrategy mnStrategy1 = new MnStrategy(0);
      mnStrategy1.setHessianG2Tolerance((-25.149322896679344));
      int[] intArray0 = new int[4];
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1.0E-6, 0);
      intArray0[0] = 0;
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, (-25.149322896679344), 0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (-1521.628287);
      doubleArray1[1] = (-1521.628287);
      doubleArray1[5] = (-1521.628287);
      doubleArray0[0] = (-25.149322896679344);
      doubleArray1[7] = (-25.149322896679344);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(125.222, 12.0, 12.0, (-197.6045136), (-25.149322896679344)).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase1, mnUserParameterState0, 577.987562464, mnStrategy0, 1.0);
      mnUserParameterState0.setLowerLimit(0, (-25.149322896679344));
      mnStrategy0.setGradientTolerance((-1521.628287));
      int[] intArray0 = new int[1];
      intArray0[0] = 0;
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 2941.5092772115713, 0);
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, (-2207.7949), 0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MnStrategy mnStrategy0 = new MnStrategy(1);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-25.149322896679344);
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = 1.0E-6;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (-25.149322896679344);
      doubleArray0[6] = (-25.149322896679344);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-209.0), mnStrategy0, (-294.0));
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      mnUserParameterState0.setUpperLimit(0, (-25.149322896679344));
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[4] = 1;
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-294.0);
      doubleArray1[1] = (-209.0);
      doubleArray1[2] = (double) 1;
      doubleArray1[3] = (double) 0;
      doubleArray1[4] = (-294.0);
      doubleArray1[5] = (double) 0;
      doubleArray1[6] = (double) 0;
      doubleArray1[7] = (double) 1;
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, 1.0, (-1392));
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-505.346960944), (-2122039528));
  }
}