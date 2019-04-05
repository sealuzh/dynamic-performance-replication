/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 14:08:01 GMT 2019
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.LinkedList;
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
import org.la4j.matrix.dense.Basic2DMatrix;
import org.la4j.matrix.sparse.CCSMatrix;
import org.la4j.operation.ooplace.OoPlaceMatricesMultiplication;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianSolver_ESTest extends GaussianSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      double[] doubleArray0 = new double[2];
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      CCSMatrix cCSMatrix0 = (CCSMatrix)ooPlaceOuterProduct0.apply(denseVector0, sparseVector0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(cCSMatrix0);
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      Basic2DMatrix basic2DMatrix0 = (Basic2DMatrix)DenseMatrix.zero(1780, 1780);
      CCSMatrix cCSMatrix1 = (CCSMatrix)ooPlaceMatricesMultiplication0.apply((ColumnMajorSparseMatrix) cCSMatrix0, (DenseMatrix) basic2DMatrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(cCSMatrix1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      DenseVector denseVector0 = DenseVector.fromCollection(linkedList0);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(sparseVector0, denseVector0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      Vector vector0 = gaussianSolver0.solve(denseVector0);
      assertEquals(0, vector0.length());
      assertNotSame(vector0, denseVector0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.identity(0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(sparseMatrix0);
      boolean boolean0 = gaussianSolver0.applicableTo(sparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-1L));
      Matrix matrix0 = Matrix.randomSymmetric(41, mockRandom0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      Vector vector0 = Vector.zero(41);
      // Undeclared exception!
      gaussianSolver0.solve(vector0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(0, 0, 0);
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
  public void test5()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(17);
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
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
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
  public void test7()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.diagonal(1277, 0.0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      Vector vector0 = Vector.fromMap(hashMap0, 1277);
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
  public void test8()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.unit(2, 2);
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      Vector vector0 = Vector.fromMap(hashMap0, 2);
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
  public void test9()  throws Throwable  {
      Vector vector0 = Vector.unit(2);
      MockRandom mockRandom0 = new MockRandom((-1197L));
      Matrix matrix0 = Matrix.randomSymmetric(2, mockRandom0);
      GaussianSolver gaussianSolver0 = new GaussianSolver(matrix0);
      Vector vector1 = gaussianSolver0.solve(vector0);
      assertEquals(2, vector1.length());
  }
}
