/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 03:06:08 GMT 2018
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.EigenDecompositor;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.dense.Basic2DMatrix;
import org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix;
import org.la4j.operation.ooplace.OoPlaceMatricesMultiplication;
import org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      DenseVector denseVector0 = DenseVector.fromMap(hashMap0, 1576);
      Integer integer0 = new Integer(1532);
      denseVector0.toSparseVector();
      denseVector0.toCSV();
      Integer integer1 = new Integer(1105);
      hashMap0.put(integer0, integer1);
      Matrix matrix0 = denseVector0.toColumnMatrix();
      hashMap0.put((Integer) null, integer0);
      hashMap0.put(integer1, (Integer) null);
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
  public void test01()  throws Throwable  {
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      MockRandom mockRandom0 = new MockRandom(2);
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(2, mockRandom0);
      Matrix matrix0 = ooPlaceMatricesMultiplication0.apply(denseMatrix0, denseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      eigenDecompositor0.applicableTo(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 5;
      doubleArray0[1] = (double) 5;
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, denseVector0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      DenseMatrix denseMatrix0 = DenseMatrix.identity(12);
      denseMatrix0.toRowMajorSparseMatrix();
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(12, 2);
      Matrix matrix0 = columnMajorSparseMatrix0.transpose();
      eigenDecompositor0.matrix = matrix0;
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
      DenseMatrix denseMatrix0 = DenseMatrix.identity(12);
      denseMatrix0.toRowMajorSparseMatrix();
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(12, 2);
      Matrix matrix0 = columnMajorSparseMatrix0.transpose();
      eigenDecompositor0.matrix = matrix0;
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
  public void test05()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(3, 3, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Random.setNextRandom(3);
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      double[][] doubleArray0 = new double[1][6];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (double) 3;
      doubleArray1[1] = (double) 3;
      doubleArray0[0] = doubleArray1;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from2DArray(doubleArray0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(3);
      Matrix matrix0 = inPlaceCopyMatrixToMatrix0.apply(rowMajorSparseMatrix0, columnMajorSparseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      eigenDecompositor0.decompose();
      Matrix[] matrixArray1 = eigenDecompositor0.decompose();
      assertFalse(matrixArray1.equals((Object)matrixArray0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new OoPlaceMatrixHadamardProduct();
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(12, 12, mockRandom0);
      Matrix matrix0 = ooPlaceMatrixHadamardProduct0.apply(denseMatrix0, denseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(4, 4, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      eigenDecompositor0.decompose();
      Random.setNextRandom(8);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new OoPlaceMatrixHadamardProduct();
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(20, 20, mockRandom0);
      Matrix matrix0 = ooPlaceMatrixHadamardProduct0.apply(denseMatrix0, denseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new OoPlaceMatrixHadamardProduct();
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(20, 20, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new OoPlaceMatrixHadamardProduct();
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(12, 12, mockRandom0);
      Basic2DMatrix basic2DMatrix0 = (Basic2DMatrix)ooPlaceMatrixHadamardProduct0.apply(denseMatrix0, denseMatrix0);
      Basic2DMatrix basic2DMatrix1 = (Basic2DMatrix)ooPlaceMatrixHadamardProduct0.apply((DenseMatrix) basic2DMatrix0, denseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(basic2DMatrix1);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }
}