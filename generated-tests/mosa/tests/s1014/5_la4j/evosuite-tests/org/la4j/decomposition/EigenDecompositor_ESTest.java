/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 05:52:36 GMT 2018
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
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(1854, 540);
      EigenDecompositor eigenDecompositor0 = null;
      try {
        eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given matrix can not be used with this decompositor.
         //
         verifyException("org.la4j.decomposition.AbstractDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DenseMatrix.identity(6);
      DenseMatrix denseMatrix0 = DenseMatrix.unit(6, 6);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(5, 5, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      EigenDecompositor eigenDecompositor1 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray1 = eigenDecompositor0.decompose();
      assertNotSame(matrixArray1, matrixArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)82;
      mockRandom0.nextBytes(byteArray0);
      DenseMatrix denseMatrix0 = DenseMatrix.random(5, 5, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      EigenDecompositor eigenDecompositor1 = new EigenDecompositor(denseMatrix0);
      eigenDecompositor0.decompose();
      eigenDecompositor1.decompose();
      Matrix[] matrixArray1 = eigenDecompositor1.decompose();
      assertNotSame(matrixArray1, matrixArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[][] doubleArray0 = new double[3][4];
      double[] doubleArray1 = new double[3];
      doubleArray1[1] = 577.2954183085121;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[0] = 151.8536662;
      doubleArray2[1] = 644.806697;
      doubleArray2[2] = 2108.003635;
      doubleArray2[3] = 577.2954183085121;
      doubleArray2[4] = 151.8536662;
      doubleArray2[5] = 151.8536662;
      doubleArray2[7] = 151.8536662;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[9];
      doubleArray3[0] = 577.2954183085121;
      doubleArray3[1] = 577.2954183085121;
      doubleArray3[3] = 577.2954183085121;
      doubleArray3[4] = 2108.003635;
      doubleArray3[5] = 577.2954183085121;
      doubleArray3[7] = 2108.003635;
      doubleArray3[8] = 577.2954183085121;
      doubleArray0[2] = doubleArray3;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      eigenDecompositor0.decompose();
      eigenDecompositor0.decompose();
      assertEquals(0.0, sparseMatrix0.min(), 0.01);
      assertEquals(0.6666666666666666, sparseMatrix0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[][] doubleArray0 = new double[3][4];
      double[] doubleArray1 = new double[3];
      doubleArray1[1] = 577.2954183085121;
      doubleArray1[2] = 151.8536662;
      doubleArray0[0] = doubleArray1;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[][] doubleArray0 = new double[3][4];
      double[] doubleArray1 = new double[3];
      doubleArray1[1] = 577.2954183085121;
      doubleArray1[2] = 151.8536662;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[0] = 577.2954183085121;
      doubleArray2[1] = 644.806697;
      doubleArray2[2] = 2108.003635;
      doubleArray2[3] = 577.2954183085121;
      doubleArray2[4] = 644.806697;
      doubleArray2[5] = 151.8536662;
      doubleArray2[6] = 151.8536662;
      doubleArray2[7] = 151.8536662;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[9];
      doubleArray3[0] = 577.2954183085121;
      doubleArray3[1] = 577.2954183085121;
      doubleArray3[2] = 644.806697;
      doubleArray3[3] = 577.2954183085121;
      doubleArray3[4] = 2108.003635;
      doubleArray3[5] = 577.2954183085121;
      doubleArray3[7] = 2108.003635;
      doubleArray3[8] = 577.2954183085121;
      doubleArray0[2] = doubleArray3;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[][] doubleArray0 = new double[3][4];
      double[] doubleArray1 = new double[3];
      doubleArray1[1] = 577.2954183085121;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[0] = 151.8536662;
      doubleArray2[1] = 644.806697;
      doubleArray2[2] = 577.2954183085121;
      doubleArray2[3] = 577.2954183085121;
      doubleArray2[4] = 151.8536662;
      doubleArray1[1] = 151.8536662;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[9];
      doubleArray3[0] = 577.2954183085121;
      doubleArray3[1] = 577.2954183085121;
      doubleArray3[3] = 577.2954183085121;
      doubleArray3[4] = 2108.003635;
      doubleArray3[5] = 577.2954183085121;
      doubleArray3[7] = 2108.003635;
      doubleArray3[8] = 577.2954183085121;
      doubleArray0[2] = doubleArray3;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      eigenDecompositor0.decompose();
      EigenDecompositor eigenDecompositor1 = new EigenDecompositor(sparseMatrix0);
      eigenDecompositor1.decompose();
  }
}