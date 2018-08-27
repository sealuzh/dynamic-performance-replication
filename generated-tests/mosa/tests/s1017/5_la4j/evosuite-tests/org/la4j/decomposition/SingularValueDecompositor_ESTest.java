/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 08:18:35 GMT 2018
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.SingularValueDecompositor;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.vector.DenseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingularValueDecompositor_ESTest extends SingularValueDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[5][8];
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[4][4];
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(9);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(columnMajorSparseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 1490.8580161065;
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      denseVector0.toColumnMatrix();
      double[][] doubleArray1 = new double[4][4];
      doubleArray1[0] = doubleArray0;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray1);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = Double.NEGATIVE_INFINITY;
      double[][] doubleArray1 = new double[4][4];
      doubleArray1[0] = doubleArray0;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray1);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      // Undeclared exception!
      singularValueDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = Double.NEGATIVE_INFINITY;
      double[][] doubleArray1 = new double[2][9];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray1);
      assertNotNull(denseMatrix0);
      assertEquals(2, denseMatrix0.columns());
      assertEquals(2, denseMatrix0.rows());
      
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      assertNotNull(singularValueDecompositor0);
      assertEquals(2, denseMatrix0.columns());
      assertEquals(2, denseMatrix0.rows());
      
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
      assertEquals(2, denseMatrix0.columns());
      assertEquals(2, denseMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = Double.NEGATIVE_INFINITY;
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      assertNotNull(denseVector0);
      assertEquals(2, denseVector0.length());
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, 0.0}, doubleArray0, 0.01);
      
      Matrix matrix0 = denseVector0.toColumnMatrix();
      assertNotNull(matrix0);
      assertEquals(2, denseVector0.length());
      assertEquals(2, matrix0.rows());
      assertEquals(1, matrix0.columns());
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, 0.0}, doubleArray0, 0.01);
      
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      assertNotNull(singularValueDecompositor0);
      assertEquals(2, denseVector0.length());
      assertEquals(2, matrix0.rows());
      assertEquals(1, matrix0.columns());
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, 0.0}, doubleArray0, 0.01);
      
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
      assertEquals(2, denseVector0.length());
      assertEquals(2, matrix0.rows());
      assertEquals(1, matrix0.columns());
      assertArrayEquals(new double[] {Double.NEGATIVE_INFINITY, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[4][4];
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      assertNotNull(denseMatrix0);
      assertEquals(4, denseMatrix0.rows());
      assertEquals(4, denseMatrix0.columns());
      
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      assertNotNull(singularValueDecompositor0);
      assertEquals(4, denseMatrix0.rows());
      assertEquals(4, denseMatrix0.columns());
      
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
      assertEquals(4, denseMatrix0.rows());
      assertEquals(4, denseMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      assertNotNull(denseVector0);
      assertEquals(8, denseVector0.length());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      Matrix matrix0 = denseVector0.toColumnMatrix();
      assertNotNull(matrix0);
      assertEquals(8, denseVector0.length());
      assertEquals(8, matrix0.rows());
      assertEquals(1, matrix0.columns());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      assertNotNull(singularValueDecompositor0);
      assertEquals(8, denseVector0.length());
      assertEquals(8, matrix0.rows());
      assertEquals(1, matrix0.columns());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
      assertEquals(8, denseVector0.length());
      assertEquals(8, matrix0.rows());
      assertEquals(1, matrix0.columns());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1095.653);
      doubleArray0[1] = 2.0;
      double[][] doubleArray1 = new double[2][4];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray1);
      assertNotNull(denseMatrix0);
      assertEquals(2, denseMatrix0.rows());
      assertEquals(8, denseMatrix0.columns());
      
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      assertNotNull(singularValueDecompositor0);
      assertEquals(2, denseMatrix0.rows());
      assertEquals(8, denseMatrix0.columns());
      
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
      assertEquals(2, denseMatrix0.rows());
      assertEquals(8, denseMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = Double.NEGATIVE_INFINITY;
      double[][] doubleArray1 = new double[4][4];
      doubleArray1[0] = doubleArray0;
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(9);
      assertNotNull(columnMajorSparseMatrix0);
      assertEquals(9, columnMajorSparseMatrix0.columns());
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(9, columnMajorSparseMatrix0.rows());
      assertEquals(0.1111111111111111, columnMajorSparseMatrix0.density(), 0.01);
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(9, columnMajorSparseMatrix0.cardinality());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      
      Matrix matrix0 = columnMajorSparseMatrix0.add(630.4201541652709);
      assertNotNull(matrix0);
      assertEquals(9, columnMajorSparseMatrix0.columns());
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(9, columnMajorSparseMatrix0.rows());
      assertEquals(0.1111111111111111, columnMajorSparseMatrix0.density(), 0.01);
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(9, columnMajorSparseMatrix0.cardinality());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(9, matrix0.columns());
      assertEquals(9, matrix0.rows());
      
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      assertNotNull(singularValueDecompositor0);
      assertEquals(9, columnMajorSparseMatrix0.columns());
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(9, columnMajorSparseMatrix0.rows());
      assertEquals(0.1111111111111111, columnMajorSparseMatrix0.density(), 0.01);
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(9, columnMajorSparseMatrix0.cardinality());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(9, matrix0.columns());
      assertEquals(9, matrix0.rows());
      
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
      assertEquals(9, columnMajorSparseMatrix0.columns());
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(9, columnMajorSparseMatrix0.rows());
      assertEquals(0.1111111111111111, columnMajorSparseMatrix0.density(), 0.01);
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(9, columnMajorSparseMatrix0.cardinality());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(9, matrix0.columns());
      assertEquals(9, matrix0.rows());
      
      Matrix[] matrixArray1 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray1);
      assertEquals(9, columnMajorSparseMatrix0.columns());
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(9, columnMajorSparseMatrix0.rows());
      assertEquals(0.1111111111111111, columnMajorSparseMatrix0.density(), 0.01);
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(9, columnMajorSparseMatrix0.cardinality());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(9, matrix0.columns());
      assertEquals(9, matrix0.rows());
      assertFalse(matrixArray1.equals((Object)matrixArray0));
      assertNotSame(matrixArray1, matrixArray0);
      
      // Undeclared exception!
      try { 
        SparseMatrix.from1DArray(9, 9, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 1490.8580161065;
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      assertNotNull(denseVector0);
      assertEquals(2, denseVector0.length());
      assertArrayEquals(new double[] {0.0, 1490.8580161065}, doubleArray0, 0.01);
      
      Matrix matrix0 = denseVector0.toColumnMatrix();
      assertNotNull(matrix0);
      assertEquals(2, denseVector0.length());
      assertEquals(2, matrix0.rows());
      assertEquals(1, matrix0.columns());
      assertArrayEquals(new double[] {0.0, 1490.8580161065}, doubleArray0, 0.01);
      
      double[][] doubleArray1 = new double[4][4];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray1);
      assertNotNull(denseMatrix0);
      assertEquals(4, denseMatrix0.rows());
      assertEquals(2, denseMatrix0.columns());
      assertFalse(denseMatrix0.equals((Object)matrix0));
      assertNotSame(denseMatrix0, matrix0);
      
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      assertNotNull(singularValueDecompositor0);
      assertEquals(4, denseMatrix0.rows());
      assertEquals(2, denseMatrix0.columns());
      assertFalse(denseMatrix0.equals((Object)matrix0));
      
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
      assertEquals(4, denseMatrix0.rows());
      assertEquals(2, denseMatrix0.columns());
      assertFalse(denseMatrix0.equals((Object)matrix0));
      assertNotSame(denseMatrix0, matrix0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1095.653);
      doubleArray0[1] = 2.0;
      double[][] doubleArray1 = new double[3][5];
      double[] doubleArray2 = new double[5];
      assertFalse(doubleArray2.equals((Object)doubleArray0));
      
      doubleArray2[0] = 2.0;
      doubleArray2[2] = (-1095.653);
      doubleArray2[3] = 2.0;
      doubleArray2[4] = 0.0;
      doubleArray1[0] = doubleArray2;
      doubleArray1[1] = doubleArray0;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray1);
      assertNotNull(denseMatrix0);
      assertEquals(3, denseMatrix0.rows());
      assertEquals(5, denseMatrix0.columns());
      
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      assertNotNull(singularValueDecompositor0);
      assertEquals(3, denseMatrix0.rows());
      assertEquals(5, denseMatrix0.columns());
      
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
      assertEquals(3, denseMatrix0.rows());
      assertEquals(5, denseMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[][] doubleArray0 = new double[2][8];
      double[] doubleArray1 = new double[16];
      doubleArray1[0] = 1490.8580161065;
      doubleArray1[1] = Double.NEGATIVE_INFINITY;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[4];
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      
      doubleArray2[0] = Double.NEGATIVE_INFINITY;
      doubleArray2[1] = Double.NEGATIVE_INFINITY;
      doubleArray2[2] = 1490.8580161065;
      doubleArray2[3] = Double.NEGATIVE_INFINITY;
      doubleArray0[0] = doubleArray2;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      assertNotNull(denseMatrix0);
      assertEquals(4, denseMatrix0.columns());
      assertEquals(2, denseMatrix0.rows());
      
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      assertNotNull(singularValueDecompositor0);
      assertEquals(4, denseMatrix0.columns());
      assertEquals(2, denseMatrix0.rows());
      
      // Undeclared exception!
      singularValueDecompositor0.decompose();
  }
}