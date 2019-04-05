/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 01:04:48 GMT 2019
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianSolver_ESTest extends GaussianSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(0, 0);
      Vector vector0 = Vector.constant(0, 134.24);
      GaussianSolver gaussianSolver0 = new GaussianSolver(sparseMatrix0);
      Vector vector1 = gaussianSolver0.solve(vector0);
      assertEquals(0, vector1.length());
      assertNotSame(vector1, vector0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.zero(1438, 1438);
      double[][] doubleArray0 = new double[1][1];
      double[] doubleArray1 = new double[4];
      doubleArray0[0] = doubleArray1;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(sparseMatrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(0, 0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(sparseMatrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(sparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.diagonal(33, 33);
      Matrix matrix0 = rowMajorSparseMatrix0.rotate();
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      Vector vector0 = Vector.constant(33, 33);
      // Undeclared exception!
      gaussianSolver0.solve(vector0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(2);
      SparseVector sparseVector0 = SparseVector.zero(2);
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      DenseMatrix denseMatrix0 = DenseMatrix.diagonal(2, Double.POSITIVE_INFINITY);
      Matrix matrix0 = inPlaceCopyMatrixToMatrix0.applySimple(denseMatrix0, sparseMatrix0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(sparseVector0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(11);
      GaussianSolver gaussianSolver0 = new GaussianSolver(sparseMatrix0);
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
  public void test06()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(0, mockRandom0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      Vector vector0 = Vector.constant(0, 2.0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(vector0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.dense.BasicVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(11);
      SparseVector sparseVector0 = SparseVector.zero(11, 11);
      GaussianSolver gaussianSolver0 = new GaussianSolver(sparseMatrix0);
      gaussianSolver0.unknowns = (-3491);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(sparseVector0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '-3491' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(2);
      Matrix matrix0 = Matrix.constant(2, 2, 2);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      gaussianSolver0.unknowns = (-1);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(sparseVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(10);
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
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Matrix matrix0 = Matrix.from1DArray(45, 45, doubleArray0);
      GaussianSolver gaussianSolver0 = null;
      try {
        gaussianSolver0 = new GaussianSolver(matrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(1029, 0, doubleArray0);
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
  public void test13()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(5, 5);
      SparseVector sparseVector0 = SparseVector.zero(5, 5);
      GaussianSolver gaussianSolver0 = new GaussianSolver(sparseMatrix0);
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
  public void test14()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Matrix matrix0 = Matrix.randomSymmetric(6, mockRandom0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      Vector vector0 = Vector.unit(6);
      Vector vector1 = gaussianSolver0.solve(vector0);
      assertEquals(6, vector1.length());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(1, 1);
      SparseVector sparseVector0 = SparseVector.zero(1, 1);
      GaussianSolver gaussianSolver0 = new GaussianSolver(sparseMatrix0);
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
}