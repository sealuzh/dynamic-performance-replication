/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 10:18:39 GMT 2019
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.GaussianSolver;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication;
import org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication;
import org.la4j.vector.DenseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianSolver_ESTest extends GaussianSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GaussianSolver gaussianSolver0 = null;
      try {
        gaussianSolver0 = new GaussianSolver((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.GaussianSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[][] doubleArray0 = new double[5][1];
      Matrix matrix0 = Matrix.from2DArray(doubleArray0);
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
  public void test2()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(3, 3, 3);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      double[] doubleArray0 = new double[3];
      Vector vector0 = Vector.fromArray(doubleArray0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(vector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system can't be solved.
         //
         verifyException("org.la4j.linear.GaussianSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Matrix matrix0 = Matrix.randomSymmetric(9, mockRandom0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      DenseVector denseVector0 = DenseVector.fromMap(hashMap0, 9);
      Vector vector0 = gaussianSolver0.solve(denseVector0);
      assertTrue(vector0.equals((Object)denseVector0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(1);
      ColumnMajorSparseMatrix columnMajorSparseMatrix1 = ColumnMajorSparseMatrix.block(columnMajorSparseMatrix0, columnMajorSparseMatrix0, columnMajorSparseMatrix0, columnMajorSparseMatrix0);
      Matrix matrix0 = ooPlaceMatrixByItsTransposeMultiplication0.apply(columnMajorSparseMatrix1);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new OoPlaceMatrixByVectorMultiplication();
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      DenseVector denseVector0 = DenseVector.fromMap(hashMap0, 31);
      Vector vector0 = ooPlaceMatrixByVectorMultiplication0.apply(columnMajorSparseMatrix1, denseVector0);
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
      doubleArray0[0] = (-966.0);
      doubleArray0[1] = 1.0;
      doubleArray0[2] = 2.0;
      doubleArray0[3] = (-2407.31);
      doubleArray0[4] = 1.1102230246251565E-14;
      doubleArray0[5] = 1.0;
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      Matrix matrix0 = denseVector0.toDiagonalMatrix();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      Vector vector0 = gaussianSolver0.solve(denseVector0);
      assertEquals(6, vector0.length());
  }
}
