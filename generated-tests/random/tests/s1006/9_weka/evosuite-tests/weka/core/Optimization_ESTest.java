/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 10:38:09 GMT 2019
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
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[2][8];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 1.000000000000007;
      doubleArray0[0] = doubleArray1;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 654, 654);
      boolean[] booleanArray0 = new boolean[4];
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, true, booleanArray0);
      assertArrayEquals(new double[] {1.0}, doubleArray2, 0.01);
      assertArrayEquals(new double[] {1.000000000000007}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(0, 7);
      double[] doubleArray0 = new double[3];
      boolean[] booleanArray0 = new boolean[9];
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.addElement(0);
      assertEquals(1, optimization_DynamicIntArray0.size());
      
      optimization_DynamicIntArray0.removeElementAt(0);
      assertEquals(0, optimization_DynamicIntArray0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(18);
      optimization_DynamicIntArray0.addElement(18);
      assertEquals(1, optimization_DynamicIntArray0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(5, 47);
      double[] doubleArray0 = new double[5];
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[1] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, Double.NaN, Double.NaN, Double.NaN}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(2223, 19);
      double[] doubleArray0 = new double[6];
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[5] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[7][3];
      double[] doubleArray1 = new double[0];
      doubleArray0[2] = doubleArray1;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, (-823), 1);
      boolean[] booleanArray0 = new boolean[8];
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray0[2], false, booleanArray0);
      assertArrayEquals(new double[] {}, doubleArray2, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[2][8];
      double[] doubleArray1 = new double[4];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 654, 654);
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[1] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray1, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(447, 447);
      double[] doubleArray0 = new double[7];
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = true;
      booleanArray0[5] = true;
      booleanArray0[6] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[3][8];
      double[] doubleArray1 = new double[8];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, (-951), (-951));
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray1, true, (boolean[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(4, 370);
      double[] doubleArray0 = new double[3];
      boolean[] booleanArray0 = new boolean[2];
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(18);
      Optimization.DynamicIntArray optimization_DynamicIntArray1 = (Optimization.DynamicIntArray)optimization_DynamicIntArray0.copy();
      assertEquals(0, optimization_DynamicIntArray1.size());
      assertNotSame(optimization_DynamicIntArray1, optimization_DynamicIntArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(18);
      String string0 = optimization_DynamicIntArray0.getRevision();
      assertEquals(0, optimization_DynamicIntArray0.size());
      assertEquals("8076", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(18);
      int int0 = optimization_DynamicIntArray0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(18);
      optimization_DynamicIntArray0.elementAt(2);
      assertEquals(0, optimization_DynamicIntArray0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.removeAllElements();
      assertEquals(0, optimization_DynamicIntArray0.size());
  }
}
