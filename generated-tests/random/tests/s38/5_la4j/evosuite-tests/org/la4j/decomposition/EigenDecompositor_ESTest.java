/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 23:18:38 GMT 2019
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.EigenDecompositor;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[6][3];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 284.62456773717;
      doubleArray1[2] = 984.241198;
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[1] = (-1463.030180845318);
      doubleArray0[2] = doubleArray2;
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = doubleArray0[0];
      doubleArray0[5] = doubleArray0[3];
      Matrix matrix0 = Matrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.fromCSV("");
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(rowMajorSparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      SparseMatrix sparseMatrix0 = SparseMatrix.from1DArray(2, 2, doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(sparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EigenDecompositor eigenDecompositor0 = null;
      try {
        eigenDecompositor0 = new EigenDecompositor((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.decomposition.EigenDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[6][3];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 284.62456773717;
      doubleArray1[1] = 2218.50184;
      doubleArray1[2] = 984.241198;
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray0[0];
      double[] doubleArray2 = new double[8];
      doubleArray2[1] = (-1463.030180845318);
      doubleArray2[4] = (-1931.335);
      doubleArray0[2] = doubleArray2;
      doubleArray0[3] = doubleArray0[1];
      double[] doubleArray3 = new double[7];
      doubleArray3[2] = (-1463.030180845318);
      doubleArray0[4] = doubleArray3;
      doubleArray0[5] = doubleArray0[0];
      Matrix matrix0 = Matrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[6][3];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 284.62456773717;
      doubleArray1[1] = 284.62456773717;
      doubleArray1[2] = 984.241198;
      doubleArray1[4] = 1.1102230246251565E-14;
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray0[0];
      double[] doubleArray2 = new double[8];
      doubleArray2[4] = (-1931.335);
      doubleArray0[2] = doubleArray2;
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = doubleArray0[0];
      doubleArray0[5] = doubleArray0[2];
      Matrix matrix0 = Matrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[6][3];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 284.62456773717;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[9];
      doubleArray2[2] = 984.241198;
      doubleArray0[1] = doubleArray2;
      doubleArray0[2] = doubleArray1;
      doubleArray0[3] = doubleArray0[1];
      doubleArray0[4] = doubleArray2;
      doubleArray0[5] = doubleArray0[1];
      Matrix matrix0 = Matrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[6][3];
      double[] doubleArray1 = new double[6];
      doubleArray1[1] = 2218.50184;
      doubleArray1[2] = 984.241198;
      doubleArray1[3] = (-1463.030180845318);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[9];
      doubleArray1[0] = 1.1102230246251565E-14;
      doubleArray2[0] = 1.1102230246251565E-14;
      doubleArray0[1] = doubleArray2;
      doubleArray0[2] = doubleArray1;
      doubleArray0[3] = doubleArray2;
      doubleArray0[4] = doubleArray1;
      doubleArray0[5] = doubleArray0[0];
      Matrix matrix0 = Matrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[6][3];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 284.62456773717;
      doubleArray1[2] = 984.241198;
      doubleArray1[3] = (-1463.030180845318);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[9];
      doubleArray2[0] = 2218.50184;
      doubleArray0[1] = doubleArray2;
      doubleArray0[2] = doubleArray1;
      doubleArray0[3] = doubleArray0[2];
      doubleArray0[4] = doubleArray0[1];
      doubleArray0[5] = doubleArray1;
      Matrix matrix0 = Matrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(5, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = (double) 2;
      doubleArray0[2] = (double) 2;
      SparseMatrix sparseMatrix0 = SparseMatrix.from1DArray(2, 2, doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      eigenDecompositor0.decompose();
      assertEquals(2.0, sparseMatrix0.max(), 0.01);
      assertEquals(2, sparseMatrix0.cardinality());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Matrix matrix0 = Matrix.identity(9);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix matrix1 = matrix0.removeLastRow();
      eigenDecompositor0.matrix = matrix0;
      eigenDecompositor0.matrix = matrix1;
      // Undeclared exception!
      try { 
        eigenDecompositor0.decompose();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't decompose rectangle matrix
         //
         verifyException("org.la4j.decomposition.EigenDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.fromCSV("");
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = (double) 2;
      SparseMatrix sparseMatrix0 = SparseMatrix.from1DArray(2, 2, doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      eigenDecompositor0.decompose();
      assertEquals(0.0, sparseMatrix0.min(), 0.01);
      assertEquals(2.0, sparseMatrix0.max(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Matrix matrix0 = Matrix.zero(2075, 5874);
      EigenDecompositor eigenDecompositor0 = null;
      try {
        eigenDecompositor0 = new EigenDecompositor(matrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given matrix can not be used with this decompositor.
         //
         verifyException("org.la4j.decomposition.AbstractDecompositor", e);
      }
  }
}