/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:28:33 GMT 2018
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.SingularValueDecompositor;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.dense.Basic2DMatrix;
import org.la4j.operation.ooplace.OoPlaceMatricesAddition;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingularValueDecompositor_ESTest extends SingularValueDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.zero(1, 1);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      Matrix[] matrixArray1 = singularValueDecompositor0.decompose();
      assertNotSame(matrixArray1, matrixArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.zero(1, 4);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      singularValueDecompositor0.decompose();
      Random.setNextRandom((-1065));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (-1472.4251251);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(0, 10, doubleArray0);
      rowMajorSparseMatrix0.getColumn(10);
      Matrix matrix0 = rowMajorSparseMatrix0.transpose();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      matrix0.toString();
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

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.diagonal(5, 1.0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      singularValueDecompositor0.applicableTo(denseMatrix0);
      OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new OoPlaceMatricesAddition();
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix.random(5, 3, mockRandom0);
      mockRandom0.setSeed(3);
      singularValueDecompositor0.decompose();
      Random.setNextRandom((-647));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(3, 3, 3);
      OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new OoPlaceMatricesAddition();
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(3, 3, mockRandom0);
      Matrix matrix0 = ooPlaceMatricesAddition0.applySymmetric(denseMatrix0, (SparseMatrix) rowMajorSparseMatrix0);
      mockRandom0.setSeed((-1526L));
      OoPlaceMatricesAddition ooPlaceMatricesAddition1 = new OoPlaceMatricesAddition();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      Random.setNextRandom(6);
      singularValueDecompositor0.decompose();
      SingularValueDecompositor singularValueDecompositor1 = new SingularValueDecompositor(rowMajorSparseMatrix0);
      singularValueDecompositor0.decompose();
      assertTrue(denseMatrix0.equals((Object)matrix0));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(3, 3, 3);
      OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new OoPlaceMatricesAddition();
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.unit(3, 3);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(3, 1.2363063714885469E-17);
      ooPlaceMatricesAddition0.apply(denseMatrix0, columnMajorSparseMatrix0);
      DenseMatrix denseMatrix1 = DenseMatrix.random(3, 3, mockRandom0);
      Basic2DMatrix basic2DMatrix0 = (Basic2DMatrix)ooPlaceMatricesAddition0.applySymmetric(denseMatrix1, (SparseMatrix) rowMajorSparseMatrix0);
      ooPlaceMatricesAddition0.applySymmetric(denseMatrix1, (SparseMatrix) columnMajorSparseMatrix0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      singularValueDecompositor0.decompose();
      ooPlaceMatricesAddition0.apply((DenseMatrix) basic2DMatrix0, denseMatrix1);
      Basic2DMatrix basic2DMatrix1 = (Basic2DMatrix)DenseMatrix.diagonal(3, 1.2363063714885469E-17);
      singularValueDecompositor0.applicableTo(basic2DMatrix1);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      SingularValueDecompositor singularValueDecompositor1 = new SingularValueDecompositor(columnMajorSparseMatrix0);
      singularValueDecompositor1.applicableTo(denseMatrix1);
      SingularValueDecompositor singularValueDecompositor2 = new SingularValueDecompositor(basic2DMatrix0);
      Random.setNextRandom((-4440));
      SingularValueDecompositor singularValueDecompositor3 = new SingularValueDecompositor(denseMatrix0);
      Matrix[] matrixArray1 = singularValueDecompositor0.decompose();
      assertNotSame(matrixArray1, matrixArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.diagonal(3, 3);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(26, 3, 9);
      RowMajorSparseMatrix rowMajorSparseMatrix1 = RowMajorSparseMatrix.identity(10);
      rowMajorSparseMatrix1.transpose();
      singularValueDecompositor0.applicableTo((Matrix) null);
      singularValueDecompositor0.applicableTo(rowMajorSparseMatrix0);
      OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new OoPlaceMatricesAddition();
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix1 = DenseMatrix.random(21, 10, mockRandom0);
      mockRandom0.setSeed(21);
      OoPlaceMatricesAddition ooPlaceMatricesAddition1 = new OoPlaceMatricesAddition();
      ooPlaceMatricesAddition1.applySymmetric(denseMatrix1, (SparseMatrix) rowMajorSparseMatrix0);
      singularValueDecompositor0.decompose();
      SingularValueDecompositor singularValueDecompositor1 = new SingularValueDecompositor(denseMatrix1);
      singularValueDecompositor1.applicableTo(denseMatrix1);
      singularValueDecompositor1.decompose();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 9;
      // Undeclared exception!
      try { 
        ColumnMajorSparseMatrix.from1DArray((-2001), 3, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -2001x3
         //
         verifyException("org.la4j.Matrix", e);
      }
  }
}