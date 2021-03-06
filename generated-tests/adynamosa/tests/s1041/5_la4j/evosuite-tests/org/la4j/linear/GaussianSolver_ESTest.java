/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 19:03:55 GMT 2019
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.GaussianSolver;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianSolver_ESTest extends GaussianSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(sparseMatrix0);
      MockRandom mockRandom0 = new MockRandom();
      DenseVector denseVector0 = DenseVector.random(0, mockRandom0);
      Vector vector0 = gaussianSolver0.solve(denseVector0);
      assertEquals(0, vector0.length());
      assertNotSame(vector0, denseVector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0);
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(0, mockRandom0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(denseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Matrix matrix0 = Matrix.random(78, 78, mockRandom0);
      SparseVector sparseVector0 = SparseVector.zero(78);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      // Undeclared exception!
      gaussianSolver0.solve(sparseVector0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(1772);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.randomSymmetric(1772, 0.0, (Random) mockRandom0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(columnMajorSparseMatrix0);
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
  public void test04()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(8);
      GaussianSolver gaussianSolver0 = new GaussianSolver(sparseMatrix0);
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
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(1192, 0, doubleArray0);
      Matrix matrix0 = rowMajorSparseMatrix0.transpose();
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
  public void test06()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(8);
      GaussianSolver gaussianSolver0 = new GaussianSolver(sparseMatrix0);
      SparseVector sparseVector0 = SparseVector.zero(8);
      Matrix matrix0 = sparseVector0.toColumnMatrix();
      boolean boolean0 = gaussianSolver0.applicableTo(matrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(1772);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.randomSymmetric(1772, 0.0, (Random) mockRandom0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(columnMajorSparseMatrix0);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      DenseVector denseVector0 = DenseVector.fromMap(hashMap0, 1772);
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
  public void test08()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.diagonal(5, 1772.0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      DenseVector denseVector0 = DenseVector.unit(5);
      Vector vector0 = gaussianSolver0.solve(denseVector0);
      assertEquals(5, vector0.length());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(1, 1);
      Matrix matrix0 = Matrix.zero(1, 1);
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
  public void test10()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-427L));
      DenseMatrix denseMatrix0 = DenseMatrix.random(2, 2, mockRandom0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      Vector vector0 = Vector.unit(2);
      Vector vector1 = gaussianSolver0.solve(vector0);
      assertEquals(2, vector1.length());
      assertNotSame(vector1, vector0);
  }
}
