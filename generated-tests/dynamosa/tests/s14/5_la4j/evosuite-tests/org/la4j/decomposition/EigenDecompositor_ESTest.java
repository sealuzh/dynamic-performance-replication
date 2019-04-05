/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 00:27:41 GMT 2019
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
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[3][1];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      double[] doubleArray2 = new double[9];
      doubleArray2[1] = 1075.2155;
      doubleArray2[2] = Double.NEGATIVE_INFINITY;
      doubleArray0[2] = doubleArray2;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      DenseMatrix denseMatrix0 = DenseMatrix.diagonal(36, 10836.59037809119);
      Matrix matrix0 = inPlaceCopyMatrixToMatrix0.applySimple(sparseMatrix0, denseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[3][1];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      double[] doubleArray2 = new double[9];
      doubleArray2[0] = (-1.0);
      doubleArray2[2] = Double.NEGATIVE_INFINITY;
      doubleArray0[2] = doubleArray2;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      eigenDecompositor0.decompose();
      assertEquals(Double.NEGATIVE_INFINITY, sparseMatrix0.min(), 0.01);
      assertEquals(0.2222222222222222, sparseMatrix0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(0, 1, 0);
      EigenDecompositor eigenDecompositor0 = null;
      try {
        eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given matrix can not be used with this decompositor.
         //
         verifyException("org.la4j.decomposition.AbstractDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Matrix matrix0 = Matrix.diagonal(0, 0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix matrix1 = Matrix.unit(3, 0);
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
  public void test04()  throws Throwable  {
      Matrix matrix0 = Matrix.diagonal(0, 0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix matrix1 = Matrix.unit(140, 0);
      boolean boolean0 = eigenDecompositor0.applicableTo(matrix1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(0, 0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(sparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(7, 7, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(denseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[3][1];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      doubleArray1[0] = Double.NEGATIVE_INFINITY;
      doubleArray0[2] = doubleArray1;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      // Undeclared exception!
      try { 
        eigenDecompositor0.decompose();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Infinite or NaN
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DenseMatrix denseMatrix0 = DenseMatrix.from1DArray(3130, 3130, doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      // Undeclared exception!
      try { 
        eigenDecompositor0.decompose();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3130
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(8, 8, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      // Undeclared exception!
      try { 
        eigenDecompositor0.applicableTo((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.decomposition.EigenDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-8.246478278941353);
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 1063.8730398709595;
      doubleArray0[1] = (-8.246478278941353);
      double[][] doubleArray2 = new double[3][4];
      doubleArray2[0] = doubleArray0;
      doubleArray2[1] = doubleArray0;
      doubleArray2[2] = doubleArray1;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray2);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.nextFloat();
      mockRandom0.nextFloat();
      DenseMatrix denseMatrix0 = DenseMatrix.random(8, 8, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.nextFloat();
      DenseMatrix denseMatrix0 = DenseMatrix.random(8, 8, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[][] doubleArray0 = new double[3][1];
      double[] doubleArray1 = new double[3];
      doubleArray1[1] = (-4825.2333671);
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      doubleArray1[0] = Double.NEGATIVE_INFINITY;
      doubleArray0[2] = doubleArray1;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = 1063.8730398709595;
      double[][] doubleArray2 = new double[3][4];
      doubleArray2[0] = doubleArray0;
      doubleArray2[2] = doubleArray1;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray2);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Matrix matrix0 = Matrix.unit(5, 5);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Matrix matrix0 = Matrix.diagonal(7, 7);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix matrix1 = Matrix.unit(3, 7);
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
  public void test18()  throws Throwable  {
      double[][] doubleArray0 = new double[3][1];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      doubleArray0[2] = doubleArray1;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }
}