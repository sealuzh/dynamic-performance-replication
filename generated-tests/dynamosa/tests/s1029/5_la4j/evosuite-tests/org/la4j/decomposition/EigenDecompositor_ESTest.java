/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 22:00:33 GMT 2019
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
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
import org.la4j.matrix.sparse.CCSMatrix;
import org.la4j.operation.ooplace.OoPlaceMatricesMultiplication;
import org.la4j.operation.ooplace.OoPlaceMatricesSubtraction;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(2, 2);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      Matrix matrix0 = sparseVector0.toColumnMatrix();
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

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(2, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      double[][] doubleArray0 = new double[3][7];
      double[] doubleArray1 = new double[2];
      doubleArray0[0] = doubleArray1;
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray0);
      eigenDecompositor0.matrix = (Matrix) columnMajorSparseMatrix0;
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
  public void test03()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(0, 0, mockRandom0);
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(0, 0, 0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(sparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Matrix matrix0 = Matrix.constant(3, 3, Double.NEGATIVE_INFINITY);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
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
  public void test05()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(2, mockRandom0);
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
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DenseMatrix denseMatrix0 = DenseMatrix.from1DArray(13, 13, doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      // Undeclared exception!
      try { 
        eigenDecompositor0.decompose();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(2, mockRandom0);
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
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(0);
      Matrix matrix0 = sparseVector0.toRowMatrix();
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

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(2, mockRandom0);
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 2;
      double[][] doubleArray1 = new double[2][3];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray1);
      CCSMatrix cCSMatrix0 = (CCSMatrix)ooPlaceMatricesMultiplication0.apply(columnMajorSparseMatrix0, denseMatrix0);
      CCSMatrix cCSMatrix1 = (CCSMatrix)ooPlaceMatricesMultiplication0.apply((ColumnMajorSparseMatrix) cCSMatrix0, denseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(cCSMatrix1);
      eigenDecompositor0.decompose();
      assertEquals(4, cCSMatrix1.cardinality());
      assertEquals(0.04000000000000001, cCSMatrix1.max(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(2, mockRandom0);
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 2;
      double[][] doubleArray1 = new double[2][3];
      doubleArray1[0] = doubleArray0;
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray1);
      Matrix matrix0 = ooPlaceMatricesMultiplication0.apply(columnMajorSparseMatrix0, denseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      eigenDecompositor0.decompose();
      assertEquals(0.2, matrix0.max(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = (double) 2;
      doubleArray0[0] = doubleArray1;
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray0);
      OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new OoPlaceMatricesSubtraction();
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(1319, 1319);
      Matrix matrix0 = ooPlaceMatricesSubtraction0.apply(rowMajorSparseMatrix0, columnMajorSparseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(10);
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(10, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-1L));
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(0, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      DenseMatrix denseMatrix1 = DenseMatrix.zero(1726, 10);
      boolean boolean0 = eigenDecompositor0.applicableTo(denseMatrix1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(2, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      double[][] doubleArray0 = new double[3][7];
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray0);
      eigenDecompositor0.matrix = (Matrix) columnMajorSparseMatrix0;
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
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 2;
      double[][] doubleArray1 = new double[2][3];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray1);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
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
}