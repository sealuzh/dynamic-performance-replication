/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 04:14:24 GMT 2019
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.SingularValueDecompositor;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.vector.DenseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingularValueDecompositor_ESTest extends SingularValueDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor((Matrix) null);
      boolean boolean0 = singularValueDecompositor0.applicableTo((Matrix) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(rowMajorSparseMatrix0);
      boolean boolean0 = singularValueDecompositor0.applicableTo(rowMajorSparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[][] doubleArray0 = new double[6][1];
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(columnMajorSparseMatrix0);
      DenseVector denseVector0 = DenseVector.constant(672, (-966.0));
      Matrix matrix0 = denseVector0.toDiagonalMatrix();
      boolean boolean0 = singularValueDecompositor0.applicableTo(matrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor((Matrix) null);
      // Undeclared exception!
      try { 
        singularValueDecompositor0.decompose();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.decomposition.SingularValueDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(0, 0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(columnMajorSparseMatrix0);
      // Undeclared exception!
      try { 
        singularValueDecompositor0.decompose();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '-1' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[][] doubleArray0 = new double[2][4];
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray0);
      Matrix matrix0 = columnMajorSparseMatrix0.add(Double.POSITIVE_INFINITY);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      // Undeclared exception!
      singularValueDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(28, 28);
      Matrix matrix0 = columnMajorSparseMatrix0.add((double) 28);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(3, Double.NEGATIVE_INFINITY);
      Matrix matrix0 = columnMajorSparseMatrix0.add(Double.NEGATIVE_INFINITY);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      // Undeclared exception!
      singularValueDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (double) 2;
      double[][] doubleArray1 = new double[2][4];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray1);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(columnMajorSparseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(2, 0, mockRandom0);
      SparseMatrix sparseMatrix0 = SparseMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(sparseMatrix0);
      // Undeclared exception!
      try { 
        singularValueDecompositor0.decompose();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}