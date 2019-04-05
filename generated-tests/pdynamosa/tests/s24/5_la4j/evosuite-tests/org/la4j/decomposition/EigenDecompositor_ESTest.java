/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 11:29:41 GMT 2019
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
import org.la4j.matrix.sparse.CCSMatrix;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Matrix matrix0 = Matrix.constant(1799, 541, (-0.4375));
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.diagonal(0, 0.0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(matrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(23, 23, 23);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      MockRandom mockRandom0 = new MockRandom(2);
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(2, mockRandom0);
      boolean boolean0 = eigenDecompositor0.applicableTo(denseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.diagonal(0, 0.0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(rowMajorSparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(23, 23, 23);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      // Undeclared exception!
      try { 
        eigenDecompositor0.applicableTo((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.decomposition.EigenDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[1][3];
      Matrix matrix0 = Matrix.from2DArray(doubleArray0);
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
  public void test06()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      byte[] byteArray0 = new byte[12];
      mockRandom0.nextBytes(byteArray0);
      mockRandom0.nextInt();
      SparseMatrix sparseMatrix0 = SparseMatrix.random(5, 5, 0.5, (Random) mockRandom0);
      CCSMatrix cCSMatrix0 = (CCSMatrix)((RowMajorSparseMatrix) sparseMatrix0).transpose();
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(cCSMatrix0);
      eigenDecompositor0.decompose();
      assertEquals(0.2, cCSMatrix0.density(), 0.01);
      assertEquals(0.8, cCSMatrix0.max(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(276L);
      mockRandom0.nextDouble();
      SparseMatrix sparseMatrix0 = SparseMatrix.random(4, 4, 4.400082704586754E-18, (Random) mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      byte[] byteArray0 = new byte[1];
      mockRandom0.nextBytes(byteArray0);
      mockRandom0.nextInt();
      SparseMatrix sparseMatrix0 = SparseMatrix.random(5, 5, 0.5, (Random) mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      byte[] byteArray0 = new byte[12];
      mockRandom0.nextBytes(byteArray0);
      SparseMatrix sparseMatrix0 = SparseMatrix.random(5, 5, 0.5, (Random) mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-5020L));
      Matrix matrix0 = Matrix.randomSymmetric(6, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(2);
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(2, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(23, 23, 23);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      MockRandom mockRandom0 = new MockRandom();
      SparseVector sparseVector0 = SparseVector.random(23, 0.5, (Random) mockRandom0);
      Matrix matrix0 = sparseVector0.toRowMatrix();
      eigenDecompositor0.matrix = matrix0;
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
  public void test13()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(23, 23, 23);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }
}