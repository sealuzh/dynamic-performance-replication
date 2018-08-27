/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 15:47:42 GMT 2018
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.SingularValueDecompositor;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.sparse.CRSMatrix;
import org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix;
import org.la4j.operation.ooplace.OoPlaceMatricesMultiplication;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingularValueDecompositor_ESTest extends SingularValueDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.unit(2, 1);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(4);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(4, 696);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(columnMajorSparseMatrix0);
      singularValueDecompositor0.applicableTo(columnMajorSparseMatrix0);
      singularValueDecompositor0.decompose();
      rowMajorSparseMatrix0.infinityNorm();
      // Undeclared exception!
      try { 
        columnMajorSparseMatrix0.sliceBottomRight((-1136), 951);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong slice range: [-1136..4][951..4].
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(1);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(columnMajorSparseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ColumnMajorSparseMatrix.identity(4);
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(1, mockRandom0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 7;
      doubleArray0[1] = (double) 7;
      doubleArray0[2] = (double) 7;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Matrix matrix0 = sparseVector0.toRowMatrix();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(4, 185);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(rowMajorSparseMatrix0);
      singularValueDecompositor0.applicableTo(rowMajorSparseMatrix0);
      singularValueDecompositor0.decompose();
      rowMajorSparseMatrix0.infinityNorm();
      // Undeclared exception!
      try { 
        rowMajorSparseMatrix0.sliceBottomRight((-1136), (-1136));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '-1136' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      int int0 = 4;
      int int1 = 185;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(185, 4);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(rowMajorSparseMatrix0);
      singularValueDecompositor0.applicableTo(rowMajorSparseMatrix0);
      singularValueDecompositor0.decompose();
      rowMajorSparseMatrix0.infinityNorm();
      Matrix matrix0 = rowMajorSparseMatrix0.sliceBottomRight(185, (-1136));
      int int2 = (-122);
      Random.setNextRandom((-122));
      singularValueDecompositor0.applicableTo(matrix0);
      singularValueDecompositor0.decompose();
      // Undeclared exception!
      singularValueDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ColumnMajorSparseMatrix.identity(4);
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (double) 4;
      doubleArray0[1] = (double) 4;
      doubleArray0[2] = 0.0;
      doubleArray0[3] = (double) 4;
      doubleArray0[4] = (double) 4;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Matrix matrix0 = sparseVector0.toRowMatrix();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      Matrix[] matrixArray1 = singularValueDecompositor0.decompose();
      assertFalse(matrixArray1.equals((Object)matrixArray0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(4);
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(4, mockRandom0);
      Matrix matrix0 = ooPlaceMatricesMultiplication0.apply(columnMajorSparseMatrix0, denseMatrix0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.unit(2, 4);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ColumnMajorSparseMatrix.identity(4);
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(5, mockRandom0);
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication1 = new OoPlaceMatricesMultiplication();
      Matrix matrix0 = ooPlaceMatricesMultiplication1.apply(denseMatrix0, denseMatrix0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ColumnMajorSparseMatrix.identity(4);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = (double) 4;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      CRSMatrix cRSMatrix0 = (CRSMatrix)sparseVector0.toDiagonalMatrix();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(cRSMatrix0);
      singularValueDecompositor0.decompose();
      assertEquals(0.0625, cRSMatrix0.density(), 0.01);
      assertEquals(4.0, cRSMatrix0.max(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(5, mockRandom0);
      ooPlaceMatricesMultiplication0.apply(denseMatrix0, denseMatrix0);
      DenseMatrix denseMatrix1 = DenseMatrix.random(5, 5, mockRandom0);
      Matrix matrix0 = ooPlaceMatricesMultiplication0.apply(denseMatrix1, denseMatrix1);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      SingularValueDecompositor singularValueDecompositor1 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor1.decompose();
      assertNotNull(matrixArray0);
  }
}