/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 09:41:41 GMT 2018
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
import org.la4j.matrix.sparse.CRSMatrix;
import org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingularValueDecompositor_ESTest extends SingularValueDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Random.setNextRandom(3);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(3, (-1.2508807130755426));
      CRSMatrix cRSMatrix0 = (CRSMatrix)columnMajorSparseMatrix0.transpose();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(cRSMatrix0);
      singularValueDecompositor0.decompose();
      assertEquals(3, cRSMatrix0.cardinality());
      assertEquals(0.3333333333333333, cRSMatrix0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Random.setNextRandom(3);
      Random.setNextRandom(3);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(3, 0.0);
      Matrix matrix0 = columnMajorSparseMatrix0.transpose();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(1, 3, 1);
      columnMajorSparseMatrix0.columnMajorIterator();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(columnMajorSparseMatrix0);
      singularValueDecompositor0.decompose();
      Random.setNextRandom(3);
      double[][] doubleArrayArray0 = null;
      // Undeclared exception!
      try { 
        ColumnMajorSparseMatrix.from2DArray((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.sparse.CCSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(1);
      DenseMatrix denseMatrix0 = DenseMatrix.random(1, 1, mockRandom0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(3);
      Matrix matrix0 = columnMajorSparseMatrix0.subtract((double) 3);
      columnMajorSparseMatrix0.columnMajorIterator();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      columnMajorSparseMatrix0.subtract((double) 3);
      singularValueDecompositor0.decompose();
      Random.setNextRandom(3);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new OoPlaceMatrixHadamardProduct();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(3, 3, 3);
      Matrix matrix0 = columnMajorSparseMatrix0.subtract((double) 3);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      singularValueDecompositor0.decompose();
      // Undeclared exception!
      try { 
        DenseMatrix.fromCSV("org.la4j.decomposition.SingularValueDecompositor");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(3, 0, 0);
      Matrix matrix0 = columnMajorSparseMatrix0.subtract((double) 37);
      columnMajorSparseMatrix0.columnMajorIterator();
      columnMajorSparseMatrix0.columnMajorIterator();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      DenseMatrix.diagonal(3, 37);
      Random.setNextRandom(1353767245);
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
  public void test07()  throws Throwable  {
      OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new OoPlaceMatrixHadamardProduct();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(4);
      ColumnMajorSparseMatrix columnMajorSparseMatrix1 = ColumnMajorSparseMatrix.identity(4);
      columnMajorSparseMatrix0.subtract(2187.7);
      columnMajorSparseMatrix0.columnMajorIterator();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(columnMajorSparseMatrix1);
      singularValueDecompositor0.decompose();
      Random.setNextRandom(1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(2, 3, 3);
      Random.setNextRandom(24);
      Random.setNextRandom(219);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      singularValueDecompositor0.decompose();
      boolean boolean0 = singularValueDecompositor0.applicableTo(denseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new OoPlaceMatrixHadamardProduct();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(33, 16, 16);
      Matrix matrix0 = columnMajorSparseMatrix0.subtract((-9.073787388));
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      singularValueDecompositor0.decompose();
      MockRandom mockRandom0 = new MockRandom();
      RowMajorSparseMatrix.diagonal(33, (-9.073787388));
      // Undeclared exception!
      try { 
        RowMajorSparseMatrix.randomSymmetric(32, (-9.073787388), (java.util.Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cardinality should be positive: -9291.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(3);
      Matrix matrix0 = columnMajorSparseMatrix0.subtract(3613.860543);
      columnMajorSparseMatrix0.columnMajorIterator();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      singularValueDecompositor0.decompose();
      columnMajorSparseMatrix0.subtract((double) 3);
      Random.setNextRandom(2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(2, 3, 8.348519096944366E-29);
      Random.setNextRandom(37);
      Random.setNextRandom(219);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      singularValueDecompositor0.decompose();
      boolean boolean0 = singularValueDecompositor0.applicableTo(denseMatrix0);
      assertTrue(boolean0);
  }
}