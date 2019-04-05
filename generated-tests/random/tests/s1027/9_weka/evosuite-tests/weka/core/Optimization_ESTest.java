/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 14:20:22 GMT 2019
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import weka.core.Optimization;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Optimization_ESTest extends Optimization_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(729);
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.addElement(729);
      optimization_DynamicIntArray0.removeElementAt(0);
      assertEquals(1, optimization_DynamicIntArray0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(30, 30, 1.000000238418579);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 30;
      boolean[] booleanArray0 = new boolean[9];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {29.999992847444332, (-29.999992847444332), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(2);
      optimization_DynamicIntArray0.addElement(2);
      optimization_DynamicIntArray0.addElement(2);
      optimization_DynamicIntArray0.addElement(2);
      assertEquals(3, optimization_DynamicIntArray0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(2238, 1227);
      double[] doubleArray0 = new double[7];
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[1] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[7];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 3296, 4090);
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[6] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray1, false, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[5][7];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 1397, 1397);
      double[] doubleArray1 = new double[0];
      boolean[] booleanArray0 = new boolean[9];
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, false, booleanArray0);
      assertFalse(doubleArray2.equals((Object)doubleArray1));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(30, 30, 1.000000238418579);
      double[] doubleArray0 = new double[8];
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[5] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(30, 30, 1.000000238418579);
      double[] doubleArray0 = new double[8];
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = true;
      booleanArray0[5] = true;
      booleanArray0[6] = true;
      booleanArray0[7] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[4][2];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 2271, 426);
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0[0], true, (boolean[]) null);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(614);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(614);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(3165);
      Optimization.DynamicIntArray optimization_DynamicIntArray1 = (Optimization.DynamicIntArray)optimization_DynamicIntArray0.copy();
      assertNotSame(optimization_DynamicIntArray1, optimization_DynamicIntArray0);
      assertEquals(0, optimization_DynamicIntArray1.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(3165);
      String string0 = optimization_DynamicIntArray0.getRevision();
      assertEquals("8076", string0);
      assertEquals(0, optimization_DynamicIntArray0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(624);
      int int0 = optimization_DynamicIntArray0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(3165);
      optimization_DynamicIntArray0.elementAt(25);
      assertEquals(0, optimization_DynamicIntArray0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(3165);
      optimization_DynamicIntArray0.removeAllElements();
      assertEquals(0, optimization_DynamicIntArray0.size());
  }
}