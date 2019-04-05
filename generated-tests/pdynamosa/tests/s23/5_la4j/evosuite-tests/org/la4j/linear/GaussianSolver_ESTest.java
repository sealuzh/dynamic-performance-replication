/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 09:25:19 GMT 2019
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
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianSolver_ESTest extends GaussianSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(0, 0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      DenseVector denseVector0 = DenseVector.zero(0);
      Vector vector0 = gaussianSolver0.solve(denseVector0);
      assertEquals(0, vector0.length());
      assertNotSame(vector0, denseVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      MockRandom mockRandom0 = new MockRandom(2586);
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(0, mockRandom0);
      boolean boolean0 = gaussianSolver0.applicableTo(denseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(14);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(rowMajorSparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(100);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      SparseVector sparseVector0 = SparseVector.fromMap(hashMap0, 100);
      // Undeclared exception!
      gaussianSolver0.solve(sparseVector0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(2999);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve((Vector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DenseVector denseVector0 = DenseVector.unit(0);
      Matrix matrix0 = Matrix.zero(0, 0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(denseVector0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.dense.BasicVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(2999);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.applicableTo((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.GaussianSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(1, 1313);
      GaussianSolver gaussianSolver0 = null;
      try {
        gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given coefficient matrix can not be used with this solver.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(0, 0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      DenseVector denseVector0 = DenseVector.zero(0);
      Matrix matrix0 = denseVector0.toRowMatrix();
      boolean boolean0 = gaussianSolver0.applicableTo(matrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(30, 30);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      Vector vector0 = Vector.constant(30, 493.014555);
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
  public void test10()  throws Throwable  {
      DenseVector denseVector0 = DenseVector.zero(1);
      Matrix matrix0 = denseVector0.toRowMatrix();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(denseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system is singular.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(30);
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(30, mockRandom0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      Vector vector0 = Vector.constant(30, 493.014555);
      Vector vector1 = gaussianSolver0.solve(vector0);
      assertNotSame(vector1, vector0);
  }
}