/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 07:43:28 GMT 2019
 */

package org.la4j.matrix.dense;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferUnderflowException;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.dense.Basic1DMatrix;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Basic1DMatrix_ESTest extends Basic1DMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(632, 0.0);
      assertEquals(632, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromBinary(byteArray0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Basic1DMatrix basic1DMatrix0 = null;
      try {
        basic1DMatrix0 = new Basic1DMatrix((-1195), 109, doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -1195x109
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = null;
      try {
        basic1DMatrix0 = new Basic1DMatrix((-1057), Integer.MAX_VALUE);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[3][9];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      assertEquals(9, basic1DMatrix0.columns());
      
      basic1DMatrix0.toRowMajorSparseMatrix();
      assertEquals(3, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(8, 9);
      double[][] doubleArray0 = basic1DMatrix0.toArray();
      assertEquals(9, basic1DMatrix0.columns());
      assertEquals(8, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(9, (-270.1));
      Matrix matrix0 = basic1DMatrix0.copyOfShape(5, 1181);
      assertEquals(5, matrix0.rows());
      assertEquals(9, basic1DMatrix0.columns());
      assertEquals(1181, matrix0.columns());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(2381, 9997, (double[]) null);
      // Undeclared exception!
      try { 
        basic1DMatrix0.copyOfShape(3306, 9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(1, 1, doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.copyOfShape(3057, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[][] doubleArray0 = new double[2][2];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapColumns((-1482), 1309);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1482
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.swapColumns((-2853), 2);
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(649, 649, doubleArray0);
      basic1DMatrix0.swapColumns(649, 649);
      assertEquals(649, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[][] doubleArray0 = new double[3][9];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      assertEquals(0, basic1DMatrix0.columns());
      
      basic1DMatrix0.swapRows((-1720), 1316);
      assertEquals(3, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.swapRows(3147, 3147);
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)9;
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromBinary(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can not decode Basic1DMatrix from the given byte array.
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(8, 9);
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.fromBinary(byteArray0);
      assertEquals(585, byteArray0.length);
      assertTrue(basic1DMatrix1.equals((Object)basic1DMatrix0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[][] doubleArray0 = new double[2][1];
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(columnMajorSparseMatrix0, columnMajorSparseMatrix0, columnMajorSparseMatrix0, columnMajorSparseMatrix0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '3' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(1, mockRandom0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
      assertEquals(2, basic1DMatrix0.rows());
      assertEquals(2, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix0);
      assertTrue(basic1DMatrix1.equals((Object)basic1DMatrix0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(1, 1, doubleArray0);
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(1, 32);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, sparseMatrix0, basic1DMatrix0, basic1DMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.fromCSV("       ");
      Matrix matrix0 = rowMajorSparseMatrix0.rotate();
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(matrix0, matrix0, matrix0, rowMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Matrix matrix0 = basic1DMatrix0.copyOfColumns(1555);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(matrix0, matrix0, basic1DMatrix0, matrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(3147, 3147);
      MockRandom mockRandom0 = new MockRandom();
      SparseMatrix sparseMatrix0 = SparseMatrix.randomSymmetric(1, 0.0, (Random) mockRandom0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, columnMajorSparseMatrix0, columnMajorSparseMatrix0, sparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[][] doubleArray0 = new double[3][9];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapRows((-1720), 1316);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -15480
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(133, mockRandom0);
      assertEquals(133, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(1L);
      // Undeclared exception!
      try { 
        Basic1DMatrix.randomSymmetric((-818), mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -818x-818
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(4);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(95, 4, mockRandom0);
      assertEquals(95, basic1DMatrix0.rows());
      assertEquals(4, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(8);
      assertEquals(8, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromMatrixMarket("eU>0)=1|$yLz^</eHl");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong input file format: can not read header '%%MatrixMarket'.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Vector vector0 = basic1DMatrix0.getRow(1);
      assertEquals(0, vector0.length());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Matrix matrix0 = Matrix.from1DArray(3, 3, doubleArray0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(matrix0, matrix0, matrix0, matrix0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '4' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(8, 9);
      Matrix matrix0 = basic1DMatrix0.blankOfShape(0, 8);
      assertEquals(0, matrix0.rows());
      assertEquals(8, basic1DMatrix0.rows());
      assertEquals(8, matrix0.columns());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      // Undeclared exception!
      try { 
        basic1DMatrix0.set(1017, 1017, 1017);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '1017' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromCSV("Can not decode Basic1DMatrix from the given byte array.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(8, 9);
      basic1DMatrix0.setAll(9);
      assertEquals(9, basic1DMatrix0.columns());
      assertEquals(8, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.unit((-993), 9);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }
}
