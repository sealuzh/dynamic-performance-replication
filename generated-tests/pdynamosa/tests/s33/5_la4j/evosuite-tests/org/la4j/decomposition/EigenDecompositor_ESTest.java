/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 21:12:52 GMT 2019
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
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.sparse.CRSMatrix;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 19;
      doubleArray0[1] = (double) 19;
      doubleArray0[2] = (double) 19;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      CRSMatrix cRSMatrix0 = (CRSMatrix)ooPlaceOuterProduct0.apply(sparseVector0, sparseVector0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(cRSMatrix0);
      eigenDecompositor0.decompose();
      assertEquals(0.0, cRSMatrix0.min(), 0.01);
      assertEquals(9, cRSMatrix0.cardinality());
      assertEquals(0.25, cRSMatrix0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.unit(0, 2823);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(denseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Matrix matrix0 = Matrix.identity(263);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
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
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.unit(30, 1963);
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
  public void test05()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Matrix matrix0 = Matrix.random(9, 9, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(30);
      Matrix matrix0 = Matrix.random(30, 30, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(30);
      DenseMatrix denseMatrix0 = DenseMatrix.zero(1035, 30);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(denseMatrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(1000L);
      Matrix matrix0 = Matrix.random(3, 3, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      double[][] doubleArray0 = new double[3][9];
      Matrix matrix1 = Matrix.from2DArray(doubleArray0);
      eigenDecompositor0.matrix = matrix1;
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
  public void test09()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.unit(0, 2823);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Matrix matrix0 = Matrix.random(8, 8, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }
}
