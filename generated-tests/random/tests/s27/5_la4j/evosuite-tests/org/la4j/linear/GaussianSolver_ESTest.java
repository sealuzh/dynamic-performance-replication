/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 11:53:21 GMT 2019
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.GaussianSolver;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.operation.ooplace.OoPlaceMatrixByVectorMultiplication;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianSolver_ESTest extends GaussianSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(17);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(rowMajorSparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from1DArray(3526, 0, doubleArray0);
      Matrix matrix0 = columnMajorSparseMatrix0.add(Double.POSITIVE_INFINITY);
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
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = 2212.51665580142;
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, denseVector0);
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
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Matrix matrix0 = sparseVector0.toRowMatrix();
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
  public void test4()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(17);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      OoPlaceMatrixByVectorMultiplication ooPlaceMatrixByVectorMultiplication0 = new OoPlaceMatrixByVectorMultiplication();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      Vector vector0 = ooPlaceMatrixByVectorMultiplication0.apply(rowMajorSparseMatrix0, sparseVector0);
      Vector vector1 = gaussianSolver0.solve(vector0);
      assertTrue(vector1.equals((Object)vector0));
  }
}
