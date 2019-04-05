/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 06:17:05 GMT 2019
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
import org.la4j.linear.ForwardBackSubstitutionSolver;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForwardBackSubstitutionSolver_ESTest extends ForwardBackSubstitutionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.identity(2);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(denseMatrix0);
      forwardBackSubstitutionSolver0.unknowns = 1;
      DenseVector denseVector0 = DenseVector.zero(2);
      Vector vector0 = forwardBackSubstitutionSolver0.solve(denseVector0);
      assertEquals(1, vector0.length());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-517L));
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(13, mockRandom0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(denseMatrix0);
      OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new OoPlaceMatrixByVectorMultiplication();
      double[] doubleArray0 = new double[5];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Vector vector0 = ooPlaceMatrixByVectorMultiplication0.apply(denseMatrix0, sparseVector0);
      Vector vector1 = forwardBackSubstitutionSolver0.solve(vector0);
      assertEquals(13, vector1.length());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0);
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(0, mockRandom0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(denseMatrix0);
      OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new OoPlaceMatrixByVectorMultiplication();
      double[] doubleArray0 = new double[3];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Vector vector0 = ooPlaceMatrixByVectorMultiplication0.apply(denseMatrix0, sparseVector0);
      Vector vector1 = forwardBackSubstitutionSolver0.solve(vector0);
      assertNotSame(vector0, vector1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.zero(0, 0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = denseMatrix0.toColumnMajorSparseMatrix();
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(columnMajorSparseMatrix0);
      boolean boolean0 = forwardBackSubstitutionSolver0.applicableTo(denseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.identity(17);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(denseMatrix0);
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
  public void test5()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.zero(0, 0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = denseMatrix0.toColumnMajorSparseMatrix();
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(columnMajorSparseMatrix0);
      forwardBackSubstitutionSolver0.unknowns = (-148726533);
      DenseVector denseVector0 = DenseVector.unit(0);
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
  public void test6()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.identity(17);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(denseMatrix0);
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
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from1DArray(13, 0, doubleArray0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = null;
      try {
        forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(columnMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given coefficient matrix can not be used with this solver.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0);
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(0, mockRandom0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(denseMatrix0);
      double[][] doubleArray0 = new double[2][7];
      DenseMatrix denseMatrix1 = DenseMatrix.from2DArray(doubleArray0);
      boolean boolean0 = forwardBackSubstitutionSolver0.applicableTo(denseMatrix1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.zero(10, 10);
      OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new OoPlaceMatrixByVectorMultiplication();
      double[] doubleArray0 = new double[2];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Vector vector0 = ooPlaceMatrixByVectorMultiplication0.apply(denseMatrix0, sparseVector0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(denseMatrix0);
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
}