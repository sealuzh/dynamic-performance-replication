/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 06:09:16 GMT 2019
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
import org.la4j.decomposition.EigenDecompositor;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication;
import org.la4j.vector.DenseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[4][5];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (double) 3;
      doubleArray1[2] = (double) 3;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[3] = 1199.056573692;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[6];
      doubleArray3[0] = 21.855823070517125;
      doubleArray3[1] = 1199.056573692;
      doubleArray0[2] = doubleArray3;
      doubleArray0[3] = doubleArray0[0];
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      eigenDecompositor0.decompose();
      assertEquals(0.0, sparseMatrix0.min(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[4][5];
      double[] doubleArray1 = new double[4];
      doubleArray1[1] = (double) 3;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[3] = 1199.056573692;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[9];
      doubleArray3[0] = (double) 3;
      doubleArray0[3] = doubleArray3;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      eigenDecompositor0.decompose();
      assertEquals(0.1875, sparseMatrix0.density(), 0.01);
      assertEquals(3, sparseMatrix0.cardinality());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(3);
      DenseVector denseVector0 = DenseVector.random(3, mockRandom0);
      Matrix matrix0 = denseVector0.toRowMatrix();
      EigenDecompositor eigenDecompositor0 = null;
      try {
        eigenDecompositor0 = new EigenDecompositor(matrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given matrix can not be used with this decompositor.
         //
         verifyException("org.la4j.decomposition.AbstractDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(10, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(denseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[4][5];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (double) 3;
      doubleArray1[1] = (double) 3;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[0] = (double) 3;
      doubleArray2[1] = (double) 3;
      doubleArray2[3] = 1199.056573692;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[6];
      doubleArray3[2] = 1199.056573692;
      doubleArray3[3] = 1199.056573692;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[9];
      doubleArray4[0] = (double) 3;
      doubleArray0[3] = doubleArray4;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[4][5];
      double[] doubleArray1 = new double[4];
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[6];
      doubleArray2[1] = 3.0;
      doubleArray0[2] = doubleArray2;
      double[] doubleArray3 = new double[9];
      doubleArray3[2] = 3.0;
      doubleArray0[3] = doubleArray3;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[4][5];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (double) 3;
      doubleArray1[2] = (double) 3;
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      double[] doubleArray2 = new double[6];
      doubleArray2[0] = 21.855823070517125;
      doubleArray2[2] = 1199.056573692;
      doubleArray0[2] = doubleArray2;
      doubleArray0[3] = doubleArray1;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      eigenDecompositor0.decompose();
      assertEquals(1199.056573692, sparseMatrix0.max(), 0.01);
      assertEquals(8, sparseMatrix0.cardinality());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[4][5];
      double[] doubleArray1 = new double[4];
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[6];
      doubleArray2[1] = 3.0;
      doubleArray0[2] = doubleArray2;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(9, 9, 9);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(10, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      double[][] doubleArray0 = new double[1][7];
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      Matrix matrix0 = ooPlaceMatrixByItsTransposeMultiplication0.apply(denseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      eigenDecompositor0.matrix = (Matrix) denseMatrix0;
      // Undeclared exception!
      try { 
        eigenDecompositor0.decompose();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't decompose rectangle matrix
         //
         verifyException("org.la4j.decomposition.EigenDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DenseVector denseVector0 = DenseVector.fromCSV("");
      Matrix matrix0 = denseVector0.toRowMatrix();
      EigenDecompositor eigenDecompositor0 = null;
      try {
        eigenDecompositor0 = new EigenDecompositor(matrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given matrix can not be used with this decompositor.
         //
         verifyException("org.la4j.decomposition.AbstractDecompositor", e);
      }
  }
}