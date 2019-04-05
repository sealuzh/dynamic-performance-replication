/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 02:57:08 GMT 2019
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.GaussianSolver;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianSolver_ESTest extends GaussianSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 2;
      doubleArray0[1] = (double) 2;
      doubleArray0[2] = (double) 2;
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from1DArray(2, 2, doubleArray0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(columnMajorSparseMatrix0);
      DenseVector denseVector0 = DenseVector.unit(2);
      Vector vector0 = gaussianSolver0.solve(denseVector0);
      assertEquals(2, vector0.length());
      assertNotSame(vector0, denseVector0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 2.0;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(sparseVector0, denseVector0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(denseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system can't be solved.
         //
         verifyException("org.la4j.linear.GaussianSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Matrix matrix0 = Matrix.zero(0, 0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(matrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Matrix matrix0 = Matrix.unit(62, 64);
      GaussianSolver gaussianSolver0 = null;
      try {
        gaussianSolver0 = new GaussianSolver(matrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given coefficient matrix can not be used with this solver.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Matrix matrix0 = Matrix.unit(1, 1);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.block(matrix0, matrix0, matrix0, matrix0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      SparseVector sparseVector0 = SparseVector.zero(3, 1228);
      Vector vector0 = ooPlaceVectorByMatrixMultiplication0.apply(sparseVector0, rowMajorSparseMatrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(vector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system is singular.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = (double) 2;
      doubleArray0[2] = (double) 2;
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from1DArray(2, 2, doubleArray0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(columnMajorSparseMatrix0);
      DenseVector denseVector0 = DenseVector.unit(2);
      Vector vector0 = gaussianSolver0.solve(denseVector0);
      assertNotSame(vector0, denseVector0);
      assertFalse(vector0.equals((Object)denseVector0));
  }
}
