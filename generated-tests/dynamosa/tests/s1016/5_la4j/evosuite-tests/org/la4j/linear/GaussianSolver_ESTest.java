/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 04 00:01:23 GMT 2019
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
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.operation.ooplace.OoPlaceVectorByMatrixMultiplication;
import org.la4j.vector.DenseVector;
import org.la4j.vector.sparse.CompressedVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianSolver_ESTest extends GaussianSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(20);
      GaussianSolver gaussianSolver0 = new GaussianSolver(columnMajorSparseMatrix0);
      Vector vector0 = columnMajorSparseMatrix0.getRow(0);
      Vector vector1 = gaussianSolver0.solve(vector0);
      assertTrue(vector1.equals((Object)vector0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OoPlaceVectorByMatrixMultiplication ooPlaceVectorByMatrixMultiplication0 = new OoPlaceVectorByMatrixMultiplication();
      DenseVector denseVector0 = DenseVector.unit(0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(0);
      Vector vector0 = ooPlaceVectorByMatrixMultiplication0.apply(denseVector0, columnMajorSparseMatrix0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(columnMajorSparseMatrix0);
      CompressedVector compressedVector0 = (CompressedVector)gaussianSolver0.solve(vector0);
      assertNotSame(compressedVector0, vector0);
      assertEquals(Double.NaN, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(columnMajorSparseMatrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(columnMajorSparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(20);
      Matrix matrix0 = columnMajorSparseMatrix0.transpose();
      GaussianSolver gaussianSolver0 = new GaussianSolver(columnMajorSparseMatrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(matrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(105);
      GaussianSolver gaussianSolver0 = new GaussianSolver(columnMajorSparseMatrix0);
      Vector vector0 = columnMajorSparseMatrix0.getRow(105);
      // Undeclared exception!
      gaussianSolver0.solve(vector0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector vector0 = Vector.unit(18);
      DenseMatrix denseMatrix0 = DenseMatrix.diagonal(18, Double.NEGATIVE_INFINITY);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(vector0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Matrix matrix0 = Matrix.zero(8, 8);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
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
  public void test07()  throws Throwable  {
      Matrix matrix0 = Matrix.unit(0, 0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      Vector vector0 = Vector.zero(0);
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
  public void test08()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(21);
      GaussianSolver gaussianSolver0 = new GaussianSolver(columnMajorSparseMatrix0);
      gaussianSolver0.unknowns = 141;
      Vector vector0 = Vector.zero(21);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(vector0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '141' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Matrix matrix0 = Matrix.unit(2, 2);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      gaussianSolver0.unknowns = (-1);
      Vector vector0 = Vector.zero(2);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(vector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Matrix matrix0 = Matrix.unit(4, 4);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
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
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      Matrix matrix0 = Matrix.unit(1868, 2558);
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
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DenseMatrix denseMatrix0 = DenseMatrix.from1DArray(1287, 1287, doubleArray0);
      GaussianSolver gaussianSolver0 = null;
      try {
        gaussianSolver0 = new GaussianSolver(denseMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.zero(1, 0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(columnMajorSparseMatrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(denseMatrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(21);
      MockRandom mockRandom0 = new MockRandom();
      Matrix matrix0 = Matrix.random(21, 21, mockRandom0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      Vector vector0 = columnMajorSparseMatrix0.getRow(21);
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
  public void test16()  throws Throwable  {
      Matrix matrix0 = Matrix.unit(2, 2);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      Vector vector0 = Vector.zero(2);
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
  public void test17()  throws Throwable  {
      Vector vector0 = Vector.zero(2);
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(2, mockRandom0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      Vector vector1 = gaussianSolver0.solve(vector0);
      assertTrue(vector1.equals((Object)vector0));
  }
}
