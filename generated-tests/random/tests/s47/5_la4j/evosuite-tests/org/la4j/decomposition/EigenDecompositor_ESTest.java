/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 08:38:27 GMT 2019
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.EigenDecompositor;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[2][5];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 0.5;
      doubleArray1[1] = (-1.0);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = 0.5;
      doubleArray0[1] = doubleArray2;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(0, 0, 1190.141657410435);
      MockRandom mockRandom0 = new MockRandom(2891L);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.randomSymmetric(0, 1190.141657410435, (Random) mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(rowMajorSparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(2139L);
      DenseMatrix denseMatrix0 = DenseMatrix.random(10, 10, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(denseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[2][5];
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = (-1.0);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = 1663.11514935076;
      doubleArray0[1] = doubleArray2;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[2][5];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = 0.5;
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray0[0];
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Matrix matrix0 = Matrix.random(30, 30, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      double[][] doubleArray0 = new double[9][2];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 100.0;
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray1;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from2DArray(doubleArray0);
      Matrix matrix0 = ooPlaceMatrixByItsTransposeMultiplication0.apply(rowMajorSparseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[9][5];
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = null;
      try {
        eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given matrix can not be used with this decompositor.
         //
         verifyException("org.la4j.decomposition.AbstractDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(2139L);
      DenseMatrix denseMatrix0 = DenseMatrix.random(10, 10, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      SparseMatrix sparseMatrix0 = SparseMatrix.fromCSV("");
      eigenDecompositor0.matrix = (Matrix) sparseMatrix0;
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(2139L);
      DenseMatrix denseMatrix0 = DenseMatrix.random(10, 10, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EigenDecompositor eigenDecompositor0 = null;
      try {
        eigenDecompositor0 = new EigenDecompositor((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.decomposition.EigenDecompositor", e);
      }
  }
}
