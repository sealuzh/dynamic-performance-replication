/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 05:47:24 GMT 2019
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
import org.la4j.linear.ForwardBackSubstitutionSolver;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.dense.Basic2DMatrix;
import org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;
import org.la4j.vector.dense.BasicVector;
import org.la4j.vector.sparse.CompressedVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForwardBackSubstitutionSolver_ESTest extends ForwardBackSubstitutionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[2][2];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from2DArray(doubleArray0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = null;
      try {
        forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(rowMajorSparseMatrix0);
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
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-938.8209325);
      doubleArray0[1] = (double) 2;
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      Matrix matrix0 = denseVector0.toDiagonalMatrix();
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      forwardBackSubstitutionSolver0.unknowns = 2;
      Vector vector0 = forwardBackSubstitutionSolver0.solve(denseVector0);
      assertNotSame(denseVector0, vector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Basic2DMatrix basic2DMatrix0 = (Basic2DMatrix)Matrix.fromCSV("");
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(basic2DMatrix0);
      OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new OoPlaceMatrixByVectorMultiplication();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      CompressedVector compressedVector0 = (CompressedVector)SparseVector.fromCollection(linkedList0);
      BasicVector basicVector0 = (BasicVector)ooPlaceMatrixByVectorMultiplication0.apply((DenseMatrix) basic2DMatrix0, (SparseVector) compressedVector0);
      BasicVector basicVector1 = (BasicVector)forwardBackSubstitutionSolver0.solve(basicVector0);
      assertNotSame(basicVector1, basicVector0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(0, 1.0);
      DenseMatrix denseMatrix0 = columnMajorSparseMatrix0.toDenseMatrix();
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(columnMajorSparseMatrix0);
      boolean boolean0 = forwardBackSubstitutionSolver0.applicableTo(denseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(0, 1.0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(columnMajorSparseMatrix0);
      DenseMatrix denseMatrix0 = DenseMatrix.unit(862, 2951);
      boolean boolean0 = forwardBackSubstitutionSolver0.applicableTo(denseMatrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseVector denseVector0 = DenseVector.random(23, mockRandom0);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(23);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(rowMajorSparseMatrix0);
      // Undeclared exception!
      forwardBackSubstitutionSolver0.solve(denseVector0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Matrix matrix0 = Matrix.fromCSV("");
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
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
  public void test07()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(0, 1.0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(columnMajorSparseMatrix0);
      forwardBackSubstitutionSolver0.unknowns = (-1);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      DenseVector denseVector0 = DenseVector.fromCollection(linkedList0);
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
  public void test08()  throws Throwable  {
      Matrix matrix0 = Matrix.fromCSV("");
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      forwardBackSubstitutionSolver0.unknowns = 488;
      double[] doubleArray0 = new double[0];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      // Undeclared exception!
      try { 
        forwardBackSubstitutionSolver0.solve(sparseVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(10);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(rowMajorSparseMatrix0);
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
  public void test10()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      DenseVector denseVector0 = DenseVector.random(21, mockRandom0);
      Matrix matrix0 = Matrix.zero(21, 21);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      // Undeclared exception!
      try { 
        forwardBackSubstitutionSolver0.solve(denseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system can not be solved: coefficient matrix is singular.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(2, 2);
      Vector vector0 = Vector.zero(2);
      Matrix matrix0 = columnMajorSparseMatrix0.add((-1553.981272415938));
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
      Vector vector1 = forwardBackSubstitutionSolver0.solve(vector0);
      assertEquals(2, vector1.length());
  }
}
