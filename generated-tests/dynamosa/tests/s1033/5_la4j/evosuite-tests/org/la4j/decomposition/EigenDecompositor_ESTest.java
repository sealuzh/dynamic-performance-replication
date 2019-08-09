/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 05 05:20:37 GMT 2019
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.EigenDecompositor;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.dense.Basic2DMatrix;
import org.la4j.matrix.sparse.CRSMatrix;
import org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix;
import org.la4j.operation.ooplace.OoPlaceMatricesMultiplication;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[3][9];
      double[] doubleArray1 = new double[3];
      doubleArray1[1] = (-468.96);
      doubleArray1[2] = (-468.96);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[0] = 0.964;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[6];
      doubleArray3[0] = (double) 1;
      doubleArray3[2] = (-2293.5845957318);
      doubleArray0[2] = doubleArray3;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[3][9];
      double[] doubleArray1 = new double[3];
      doubleArray1[1] = Double.POSITIVE_INFINITY;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[0] = 0.964;
      doubleArray2[1] = 0.004247211972706668;
      doubleArray2[2] = 0.964;
      doubleArray0[1] = doubleArray2;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Matrix matrix0 = Matrix.identity(10);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Matrix matrix0 = Matrix.identity(1);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.block(matrix0, matrix0, matrix0, matrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
      double[][] doubleArray0 = new double[7][5];
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      eigenDecompositor0.matrix = (Matrix) denseMatrix0;
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
      Matrix matrix0 = Matrix.identity(0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      double[][] doubleArray0 = new double[4][2];
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      boolean boolean0 = eigenDecompositor0.applicableTo(denseMatrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Matrix matrix0 = Matrix.identity(0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(matrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[3][9];
      double[] doubleArray1 = new double[3];
      doubleArray1[2] = Double.POSITIVE_INFINITY;
      doubleArray0[0] = doubleArray1;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
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
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[3][9];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      eigenDecompositor0.matrix = null;
      // Undeclared exception!
      try { 
        eigenDecompositor0.decompose();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.decomposition.EigenDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.nextInt();
      mockRandom0.nextInt();
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.random(9, 9, 0.5309840736190548, (Random) mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      // Undeclared exception!
      try { 
        eigenDecompositor0.decompose();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // This matrix can't grow up.
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Matrix matrix0 = Matrix.from1DArray(3, 3, doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      // Undeclared exception!
      try { 
        eigenDecompositor0.decompose();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Matrix matrix0 = Matrix.identity(1);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
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
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.nextGaussian();
      mockRandom0.nextInt();
      mockRandom0.nextInt();
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.random(9, 9, 0.00347819, (Random) mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CRSMatrix cRSMatrix0 = (CRSMatrix)Matrix.identity(1);
      double[][] doubleArray0 = new double[3][9];
      double[] doubleArray1 = new double[3];
      doubleArray1[1] = (-468.96);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[0] = (double) 1;
      doubleArray2[1] = (-7.641054184070513);
      doubleArray2[2] = (double) 1;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[6];
      doubleArray3[0] = (double) 1;
      doubleArray0[2] = doubleArray3;
      Basic2DMatrix basic2DMatrix0 = (Basic2DMatrix)DenseMatrix.from2DArray(doubleArray0);
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      inPlaceCopyMatrixToMatrix0.applySimple((SparseMatrix) cRSMatrix0, (DenseMatrix) basic2DMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(basic2DMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 0.964;
      doubleArray0[5] = (double) 1;
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (double) 1;
      double[][] doubleArray2 = new double[6][8];
      doubleArray2[0] = doubleArray1;
      doubleArray2[1] = doubleArray1;
      doubleArray2[3] = doubleArray0;
      doubleArray2[4] = doubleArray1;
      doubleArray2[5] = doubleArray0;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from2DArray(doubleArray2);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[][] doubleArray0 = new double[3][9];
      double[] doubleArray1 = new double[3];
      doubleArray1[2] = Double.POSITIVE_INFINITY;
      doubleArray0[0] = doubleArray1;
      doubleArray1[0] = 3003.5993623680474;
      doubleArray0[1] = doubleArray1;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(8, 8, 0.5000317409989867);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(2, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[][] doubleArray0 = new double[3][9];
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = null;
      try {
        eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given matrix can not be used with this decompositor.
         //
         verifyException("org.la4j.decomposition.AbstractDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CRSMatrix cRSMatrix0 = (CRSMatrix)Matrix.identity(1);
      double[][] doubleArray0 = new double[3][9];
      double[] doubleArray1 = new double[3];
      doubleArray0[0] = doubleArray1;
      Basic2DMatrix basic2DMatrix0 = (Basic2DMatrix)DenseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(basic2DMatrix0);
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      CRSMatrix cRSMatrix1 = (CRSMatrix)ooPlaceMatricesMultiplication0.apply((RowMajorSparseMatrix) cRSMatrix0, (DenseMatrix) basic2DMatrix0);
      eigenDecompositor0.matrix = (Matrix) cRSMatrix1;
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
}