/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 15:45:28 GMT 2018
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.GaussianSolver;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix;
import org.la4j.vector.SparseVector;
import org.la4j.vector.sparse.CompressedVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianSolver_ESTest extends GaussianSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      Matrix matrix0 = sparseVector0.toColumnMatrix();
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
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 1211;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(sparseVector0);
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
      double[] doubleArray0 = new double[1];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(sparseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system is singular.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 1211;
      doubleArray0[1] = (double) 1211;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      CompressedVector compressedVector0 = (CompressedVector)gaussianSolver0.solve(sparseVector0);
      assertEquals(1.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(2, 2);
      sparseVector0.toDiagonalMatrix();
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(2, mockRandom0);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.fromCSV("");
      Matrix matrix0 = inPlaceCopyMatrixToMatrix0.applySimple(denseMatrix0, (SparseMatrix) rowMajorSparseMatrix0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      denseMatrix0.sum();
      GaussianSolver gaussianSolver1 = new GaussianSolver(denseMatrix0);
      Vector vector0 = gaussianSolver1.solve(sparseVector0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(vector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong length of RHS vector: 2.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }
}