/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 01:15:07 GMT 2019
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.ForwardBackSubstitutionSolver;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.operation.ooplace.OoPlaceMatricesMultiplication;
import org.la4j.vector.DenseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForwardBackSubstitutionSolver_ESTest extends ForwardBackSubstitutionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      DenseMatrix denseMatrix0 = DenseMatrix.zero(2, 1);
      MockRandom mockRandom0 = new MockRandom(1106);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.randomSymmetric(1106, 0.0, (Random) mockRandom0);
      Matrix matrix0 = ooPlaceMatricesMultiplication0.apply(denseMatrix0, columnMajorSparseMatrix0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = null;
      try {
        forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given coefficient matrix can not be used with this solver.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(0, 0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(sparseMatrix0);
      Vector vector0 = sparseMatrix0.getRow(0);
      Vector vector1 = forwardBackSubstitutionSolver0.solve(vector0);
      assertNotSame(vector1, vector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(0, 0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(sparseMatrix0);
      boolean boolean0 = forwardBackSubstitutionSolver0.applicableTo(sparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(23, 23);
      Vector vector0 = Vector.unit(23);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(columnMajorSparseMatrix0);
      forwardBackSubstitutionSolver0.solve(vector0);
      // Undeclared exception!
      forwardBackSubstitutionSolver0.solve(vector0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(11, 11);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(columnMajorSparseMatrix0);
      // Undeclared exception!
      try { 
        forwardBackSubstitutionSolver0.solve((Vector) null);
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
      DenseVector denseVector0 = DenseVector.constant(1, 1);
      Matrix matrix0 = denseVector0.toRowMatrix();
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      forwardBackSubstitutionSolver0.unknowns = (-1851);
      // Undeclared exception!
      try { 
        forwardBackSubstitutionSolver0.solve(denseVector0);
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
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(16, 16);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(columnMajorSparseMatrix0);
      forwardBackSubstitutionSolver0.unknowns = 582;
      Vector vector0 = Vector.unit(16);
      // Undeclared exception!
      try { 
        forwardBackSubstitutionSolver0.solve(vector0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '16' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DenseVector denseVector0 = DenseVector.constant(1, 1);
      Matrix matrix0 = denseVector0.toRowMatrix();
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      forwardBackSubstitutionSolver0.unknowns = 32;
      // Undeclared exception!
      try { 
        forwardBackSubstitutionSolver0.solve(denseVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(0, 0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(sparseMatrix0);
      // Undeclared exception!
      try { 
        forwardBackSubstitutionSolver0.applicableTo((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.ForwardBackSubstitutionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(1476, 1476);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(sparseMatrix0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = null;
      try {
        forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.linear.ForwardBackSubstitutionSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(11, 1);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = null;
      try {
        forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(sparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given coefficient matrix can not be used with this solver.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Matrix matrix0 = Matrix.from1DArray(1374, 1374, doubleArray0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = null;
      try {
        forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.zero(0, 0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(denseMatrix0);
      double[][] doubleArray0 = new double[8][6];
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray0);
      boolean boolean0 = forwardBackSubstitutionSolver0.applicableTo(columnMajorSparseMatrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Matrix matrix0 = Matrix.randomSymmetric(11, mockRandom0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      forwardBackSubstitutionSolver0.unknowns = 1;
      Vector vector0 = Vector.unit(11);
      Vector vector1 = forwardBackSubstitutionSolver0.solve(vector0);
      assertEquals(1, vector1.length());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(11, 11);
      Vector vector0 = Vector.unit(11);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(sparseMatrix0);
      // Undeclared exception!
      try { 
        forwardBackSubstitutionSolver0.solve(vector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system can not be solved: coefficient matrix is singular.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Matrix matrix0 = Matrix.randomSymmetric(11, mockRandom0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      Vector vector0 = Vector.unit(11);
      Vector vector1 = forwardBackSubstitutionSolver0.solve(vector0);
      assertEquals(11, vector1.length());
  }
}
