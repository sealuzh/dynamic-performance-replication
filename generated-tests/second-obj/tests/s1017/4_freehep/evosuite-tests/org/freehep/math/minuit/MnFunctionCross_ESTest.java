/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 04:19:04 GMT 2018
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
      doReturn((-356.0646851769), (-356.0646851769), (-356.0646851769), (-356.0646851769), (-356.0646851769)).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnStrategy mnStrategy1 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 4.0E-7, mnStrategy1, 408.87472414774);
      int[] intArray0 = new int[1];
      intArray0[0] = 0;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 408.87472414774, 4015);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = 665.9412375175764;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[6];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      int int0 = 0;
      MnStrategy mnStrategy0 = new MnStrategy(0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase1, mnUserParameterState0, 0, mnStrategy0, 0);
      int[] intArray0 = new int[1];
      double[] doubleArray1 = new double[10];
      doubleArray1[1] = 1148.3498854739332;
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray1, 1673.05136, 0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(5);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 491.435, mnStrategy0, 0);
      int[] intArray0 = new int[3];
      intArray0[0] = 5;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 491.435, (-1082));
      intArray0[1] = 1;
      intArray0[2] = 0;
      MnCross mnCross1 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 5, 0);
      assertFalse(mnCross1.equals((Object)mnCross0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 6236.610266;
      doubleArray0[1] = 0.0;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      mnStrategy0.setMediumStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((double)0, 37.1808110043356, 0.0, 0.0, 37.1808110043356).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-49.458757), mnStrategy0, 4.0);
      mnUserParameterState0.setLowerLimit(0, 37.1808110043356);
      int[] intArray0 = new int[2];
      intArray0[0] = 0;
      intArray0[1] = 0;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 6236.610266, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setHessianNCycles(8);
      int[] intArray0 = new int[1];
      intArray0[0] = 0;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1405.2156211242002, (double)0, (double)0, (double)0, (double)2146734586).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 8, mnStrategy0, 1405.2156211242002);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.2, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[4];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-13.1), (double)0, 4219.943187866568, 1.5000000000000002, (-13.1)).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase1, mnUserParameterState0, 0, mnStrategy0, 0);
      int[] intArray0 = new int[1];
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray1 = new double[6];
      doubleArray1[3] = (double) 0;
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray0, 1.5000000000000002, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      int[] intArray0 = new int[1];
      mnStrategy0.setLowStrategy();
      mnUserParameterState0.clone();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-13.1), 1352.63087, 0.5, 4473.821548083639).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase1, mnUserParameterState0, 1352.63087, mnStrategy0, 0.0);
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-741.60458801), (-741.60458801), 420.18294719999994, 420.18294719999994, 420.18294719999994).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1658.5169472, mnStrategy0, 0.5);
      mnUserParameterState0.setLowerLimit(5, 0.0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(715.9884901406585, (-13.1), (-13.1), 4023.83883, 715.9884901406585).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 795.67386;
      doubleArray0[1] = 1369.067810031;
      doubleArray0[3] = 4023.83883;
      doubleArray0[4] = 4023.83883;
      doubleArray0[6] = 0.02;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1928.93883), mnStrategy0, 1.0);
      int[] intArray0 = new int[4];
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1928.93883), 0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      mnStrategy0.setLowStrategy();
      int[] intArray0 = new int[1];
      double[] doubleArray1 = new double[10];
      doubleArray1[1] = 1148.3498854739332;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1.0, mnStrategy0, (-1673.548));
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray1, 0, 0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int int0 = 0;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      int[] intArray0 = new int[1];
      double[] doubleArray1 = new double[10];
      doubleArray1[0] = 2340.11;
      double double0 = 1352.63087;
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-13.1), 1352.63087, 0.5, (double)0).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase1, mnUserParameterState0, (-1281.9292506964186), mnStrategy0, 2340.11);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 2991.7;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 1620.469207256494;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-563.997643777), mnStrategy0, 4.0);
      mnStrategy0.setGradientStepTolerance((-118.6));
      int[] intArray0 = new int[0];
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-563.997643777), 0);
      int int0 = (-1);
      // Undeclared exception!
      try { 
        mnUserParameterState0.setValue((-1), 4.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (-741.60458801);
      doubleArray0[1] = (-741.60458801);
      doubleArray0[0] = 1620.469207256494;
      doubleArray0[2] = 6236.610266;
      doubleArray0[2] = (-741.60458801);
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-741.60458801), mnStrategy0, 6236.610266);
      int[] intArray0 = new int[7];
      mnUserParameterState0.setLowerLimit(0, 912.80992530526);
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1949.6215515639158), 0);
      double[] doubleArray1 = new double[5];
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, (-1949.6215515639158), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.toString();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      mnStrategy0.setGradientNCycles((-1064815731));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      int[] intArray0 = new int[1];
      mnStrategy0.setHessianG2Tolerance((-1064815731));
      mnUserParameterState0.setUpperLimit(0, 2340.11);
      mnStrategy0.setLowStrategy();
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1565.0, mnStrategy0, 1565.0);
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 1565.0;
      doubleArray1[1] = 1565.0;
      doubleArray1[2] = 1565.0;
      doubleArray1[3] = 1565.0;
      MnCross mnCross0 = mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, (-1268.0), (-1064815731));
      assertNotNull(mnCross0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      int[] intArray0 = new int[1];
      mnUserParameterState0.clone();
      double[] doubleArray1 = new double[10];
      doubleArray1[0] = 2340.11;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-13.1), 1352.63087, (-32.545822315546125), 4473.821548083639).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0, mnStrategy0, 2340.11);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      int int0 = 0;
      mnUserParameterState0.toString();
      MnStrategy mnStrategy0 = new MnStrategy();
      int int1 = 0;
      mnStrategy0.setGradientNCycles((-1064815731));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      int[] intArray0 = new int[1];
      mnStrategy0.setHessianG2Tolerance((-1064815731));
      mnUserParameterState0.setUpperLimit(0, 2340.11);
      mnUserParameterState0.errors();
      mnStrategy0.setLowStrategy();
      mnStrategy0.setLowStrategy();
      mnUserParameterState0.clone();
      double[] doubleArray1 = new double[10];
      doubleArray1[0] = 2340.11;
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-13.1), 1352.5239783419518, (double)(-1064815731), 1352.5239783419518).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase1, mnUserParameterState0, (-1282.3718720226948), mnStrategy0, 2340.11);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray1, (-1282.3718720226948), 0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[9];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase1, mnUserParameterState0, 0, mnStrategy0, 0);
      int[] intArray0 = new int[1];
      double[] doubleArray1 = new double[10];
      mnStrategy0.setHessianGradientNCycles(0);
      doubleArray1[2] = (-4815.22640599);
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-4815.22640599), (-4815.22640599), 1352.63087, 1148.3498854739332, 4440.025460938853).when(fCNBase2).valueOf(any(double[].class));
      mnStrategy0.setHessianNCycles(0);
      MnFunctionCross mnFunctionCross1 = new MnFunctionCross(fCNBase2, mnUserParameterState0, (-1223.6638237150034), mnStrategy0, 5520.586908576779);
      double[] doubleArray2 = new double[2];
      doubleArray0[7] = 1352.63087;
      // Undeclared exception!
      mnFunctionCross1.cross(intArray0, doubleArray0, doubleArray2, (-2195.0469668086), 0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[7];
      doubleArray0[6] = (-741.60458801);
      doubleArray0[1] = (-3389.1006936079625);
      doubleArray0[2] = 1620.2013534287228;
      doubleArray0[2] = 6236.610266;
      doubleArray0[4] = 6236.610266;
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      double double0 = 1472.1332;
      mnUserParameterState0.setPrecision((-2307.8519557));
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn((-49.458757), (-741.60458801), 1472.1332, 222.22, 1620.2013534287228).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase1, mnUserParameterState0, (-741.60458801), mnStrategy0, 6236.610266);
      int[] intArray0 = new int[7];
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, (-1949.6215515639158), 0);
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) 0;
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray1, 6236.610266, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      int int0 = 0;
      mnUserParameterState0.toString();
      MnStrategy mnStrategy0 = new MnStrategy();
      int int1 = 0;
      mnStrategy0.setGradientNCycles((-1064815731));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      int[] intArray0 = new int[1];
      mnStrategy0.setHessianG2Tolerance((-1064815731));
      mnUserParameterState0.setUpperLimit(0, 2340.11);
      mnUserParameterState0.errors();
      mnStrategy0.setLowStrategy();
      mnStrategy0.setLowStrategy();
      mnUserParameterState0.clone();
      double[] doubleArray1 = new double[10];
      doubleArray1[0] = 2340.11;
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-13.1), 1352.5239783419518, (double)(-1064815731), 1352.5239783419518).when(fCNBase1).valueOf(any(double[].class));
      double double0 = (-1282.3718720226948);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase1, mnUserParameterState0, (-1282.3718720226948), mnStrategy0, 2340.11);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, (-1064815731), 0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(fCNBase0).valueOf(any(double[].class));
      int[] intArray0 = new int[1];
      double[] doubleArray1 = new double[10];
      doubleArray1[0] = 2340.11;
      doubleArray1[1] = (double) 0;
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 0.0, mnStrategy0, 1.0);
      mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray0, (-2101.2611056), 200);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1574.457661, 0.2, (-13.1), 4.0, 904.1).when(fCNBase0).valueOf(any(double[].class));
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1405.2156211242002, mnStrategy0, (-13.1));
      int[] intArray0 = new int[1];
      intArray0[0] = 0;
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, 0);
      mnStrategy0.setLowStrategy();
      mnStrategy0.setMediumStrategy();
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0, (-2146967384));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      int int0 = 0;
      mnUserParameterState0.toString();
      MnStrategy mnStrategy0 = new MnStrategy();
      int int1 = 0;
      mnStrategy0.setGradientNCycles((-1064815708));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      int[] intArray0 = new int[16];
      mnStrategy0.setHessianNCycles(0);
      mnStrategy0.setHessianG2Tolerance((-1064815708));
      mnUserParameterState0.setUpperLimit(0, 2340.11);
      mnStrategy0.setHessianGradientNCycles(0);
      mnUserParameterState0.errors();
      mnStrategy0.setLowStrategy();
      mnStrategy0.setLowStrategy();
      mnUserParameterState0.clone();
      mnUserParameterState0.clone();
      double[] doubleArray1 = new double[10];
      doubleArray1[0] = (double) (-1064815708);
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double double0 = (-1282.3718720226948);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase1, mnUserParameterState0, (-1282.3718720226948), mnStrategy0, (-1.064815708E9));
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray1, 2269.2421005462775, (-1064815708));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      int int0 = 0;
      MnStrategy mnStrategy0 = new MnStrategy();
      int int1 = 0;
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      int[] intArray0 = new int[1];
      double[] doubleArray1 = new double[10];
      doubleArray0[3] = 2340.11;
      doubleArray1[1] = (double) 0;
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-13.1), 1352.63087, 0.5, 4473.821548083639).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase1, mnUserParameterState0, 0.02, mnStrategy0, (-13.1));
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1000.0, 0);
      double double0 = (-1.0);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 1352.63087, 0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[6];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, 1405.5807, mnStrategy0, (-11.658622107102767));
      mnStrategy0.setLowStrategy();
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      MnFunctionCross mnFunctionCross1 = new MnFunctionCross(fCNBase1, mnUserParameterState0, 0, mnStrategy0, 0);
      int[] intArray0 = new int[1];
      mnStrategy0.setHessianGradientNCycles((-1));
      FCNBase fCNBase2 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-11.658622107102767), 1352.63087, 0.5, 4440.025460938853).when(fCNBase2).valueOf(any(double[].class));
      mnStrategy0.setHessianNCycles(0);
      MnFunctionCross mnFunctionCross2 = new MnFunctionCross(fCNBase2, mnUserParameterState0, (-1223.6638237150034), mnStrategy0, 5520.586908576779);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) 0;
      doubleArray0[1] = 4440.025460938853;
      mnFunctionCross2.cross(intArray0, doubleArray0, doubleArray1, 0.5, 0);
      doubleArray1[3] = 5520.586908576779;
      doubleArray1[5] = (-11.658622107102767);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.toString();
      MnStrategy mnStrategy0 = new MnStrategy();
      mnStrategy0.setGradientNCycles((-1064815731));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      int[] intArray0 = new int[1];
      mnUserParameterState0.setUpperLimit(0, 2340.11);
      mnUserParameterState0.errors();
      mnStrategy0.setLowStrategy();
      mnStrategy0.setLowStrategy();
      mnUserParameterState0.clone();
      double[] doubleArray1 = new double[10];
      doubleArray1[0] = 2340.11;
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-13.1), 1352.63087, (double)(-1064815731), 1352.63087).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase1, mnUserParameterState0, (-1282.3718720226948), mnStrategy0, 2340.11);
      mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray1, (-1282.3718720226948), 15);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray1, 0, 0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      int int0 = 0;
      mnUserParameterState0.toString();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      mnStrategy0.setGradientNCycles((-1064815731));
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      mnStrategy0.setGradientTolerance((-2.0));
      int[] intArray0 = new int[4];
      mnStrategy0.setHessianG2Tolerance((-1064815731));
      mnUserParameterState0.setUpperLimit(0, 2340.11);
      mnStrategy0.setLowStrategy();
      mnUserParameterState0.clone();
      double[] doubleArray1 = new double[10];
      doubleArray1[0] = 2340.11;
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-13.1), 2340.11, 0.5, 4473.821548083639).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase1, mnUserParameterState0, (-1282.3718720226948), mnStrategy0, 2340.11);
      mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray1, 0, 0);
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray0, doubleArray1, doubleArray0, 0, (-1517));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.freehep.math.minuit.MnFunctionCross", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      MnStrategy mnStrategy0 = new MnStrategy(0);
      int[] intArray0 = new int[1];
      intArray0[0] = 0;
      mnStrategy0.setGradientStepTolerance((-11.374665705334538));
      FCNBase fCNBase1 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(1405.2156211242002, (double)0, (double)0, 2.0, (double)2146734586).when(fCNBase1).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase1, mnUserParameterState0, 1886.459823, mnStrategy0, 1405.2156211242002);
      // Undeclared exception!
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray0, 0.2, 0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      MnUserParameterState mnUserParameterState0 = new MnUserParameterState(doubleArray0, doubleArray0);
      mnUserParameterState0.toString();
      MnStrategy mnStrategy0 = new MnStrategy(0);
      mnStrategy0.setGradientNCycles((-1064815731));
      mnUserParameterState0.int2ext(3, 2326.6124129494387);
      int[] intArray0 = new int[1];
      mnUserParameterState0.setUpperLimit(0, 2326.6124129494387);
      mnStrategy0.setLowStrategy();
      mnUserParameterState0.clone();
      double[] doubleArray1 = new double[10];
      doubleArray1[0] = 2326.6124129494387;
      mnUserParameterState0.clone();
      FCNBase fCNBase0 = mock(FCNBase.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, (-13.1), 1352.63087, (-0.545928685048), (-13.1)).when(fCNBase0).valueOf(any(double[].class));
      MnFunctionCross mnFunctionCross0 = new MnFunctionCross(fCNBase0, mnUserParameterState0, (-1282.3718720226948), mnStrategy0, 2326.6124129494387);
      mnFunctionCross0.cross(intArray0, doubleArray0, doubleArray1, (-1282.3718720226948), 0);
      int[] intArray1 = new int[7];
      intArray1[0] = (-1064815731);
      intArray1[1] = 0;
      // Undeclared exception!
      try { 
        mnFunctionCross0.cross(intArray1, doubleArray0, doubleArray0, (-669), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}