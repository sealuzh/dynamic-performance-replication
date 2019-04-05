/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 20:56:26 GMT 2019
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
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.dense.Basic1DMatrix;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Basic1DMatrix_ESTest extends Basic1DMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromCSV("");
      Matrix matrix0 = basic1DMatrix0.copyOfShape(8, 113);
      assertEquals(0, basic1DMatrix0.rows());
      assertEquals(113, matrix0.columns());
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(8, matrix0.rows());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)23;
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
  public void test02()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromCSV("");
      double[][] doubleArray0 = basic1DMatrix0.toArray();
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromCSV("");
      basic1DMatrix0.setAll((-1.0));
      assertEquals(0, basic1DMatrix0.rows());
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.random((-1), 469, (Random) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(0, 0);
      basic1DMatrix0.swapRows(0, 185);
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(243, 1884, doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.toArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(6, 0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.set(29, 1810, 1927.0849);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '29' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      Basic1DMatrix.randomSymmetric(395, mockRandom0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-298));
      // Undeclared exception!
      try { 
        Basic1DMatrix.random(2, (-298), mockRandom0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromMatrixMarket((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromCSV("t");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
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
  public void test13()  throws Throwable  {
      double[][] doubleArray0 = new double[8][1];
      double[] doubleArray1 = new double[9];
      doubleArray0[0] = doubleArray1;
      // Undeclared exception!
      try { 
        Basic1DMatrix.from2DArray(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(1, 1676, doubleArray0);
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      assertEquals(1, basic1DMatrix0.rows());
      assertEquals(13417, byteArray0.length);
      assertEquals(1676, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(14, 14);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = basic1DMatrix0.toRowMajorSparseMatrix();
      assertEquals(0.07142857142857142, rowMajorSparseMatrix0.density(), 0.01);
      assertEquals(0.0, rowMajorSparseMatrix0.min(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(4, 4);
      double[][] doubleArray0 = basic1DMatrix0.toArray();
      assertEquals(4, doubleArray0.length);
      assertEquals(4, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(856, (-225.0));
      Matrix matrix0 = basic1DMatrix0.copyOfShape(16, 856);
      assertEquals(856, matrix0.columns());
      assertEquals(16, matrix0.rows());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(1, 1);
      Matrix matrix0 = basic1DMatrix0.copyOfRows(3296);
      assertEquals(1, matrix0.columns());
      assertEquals(1, basic1DMatrix0.rows());
      assertEquals(3296, matrix0.rows());
      assertEquals(1, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(6, 0);
      Matrix matrix0 = basic1DMatrix0.copy();
      assertEquals(6, matrix0.rows());
      assertEquals(0, matrix0.columns());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(822, 822);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapColumns(822, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 675684
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(54, 54);
      basic1DMatrix0.swapColumns(1738, 1738);
      assertEquals(54, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(8, 0.0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapRows((-4345), 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -34760
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(0);
      basic1DMatrix0.swapRows(1130, 0);
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(1, 1, doubleArray0);
      basic1DMatrix0.swapRows(1, 1);
      assertEquals(1, basic1DMatrix0.rows());
      assertEquals(1, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(3, 516, doubleArray0);
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.fromBinary(byteArray0);
      assertEquals(516, basic1DMatrix1.columns());
      assertEquals(3, basic1DMatrix1.rows());
      assertEquals(12393, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-25);
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
  public void test27()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(0);
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.fromBinary(byteArray0);
      assertEquals(0, basic1DMatrix1.rows());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertTrue(basic1DMatrix1.equals((Object)basic1DMatrix0));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(13, 13);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '14' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(4, 4);
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.constant(4, 236, (-651.32));
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix1, basic1DMatrix0, basic1DMatrix1, basic1DMatrix1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(1902, 778, doubleArray0);
      double[][] doubleArray1 = new double[8][5];
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.from2DArray(doubleArray1);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(1, 9);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.fromCSV("");
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, columnMajorSparseMatrix0, columnMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(1, 1, 1.0);
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix0);
      assertEquals(2, basic1DMatrix1.rows());
      assertEquals(2, basic1DMatrix1.columns());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(4);
      Basic1DMatrix basic1DMatrix1 = new Basic1DMatrix();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.fromCSV("");
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix1, basic1DMatrix0, columnMajorSparseMatrix0, columnMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.get(1662, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '1662' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(8, mockRandom0);
      Matrix matrix0 = basic1DMatrix0.copyOfShape(1640, 0);
      assertEquals(1640, matrix0.rows());
      assertEquals(0, matrix0.columns());
      assertEquals(8, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      Basic1DMatrix.random(210, 210, mockRandom0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(0, 0, mockRandom0);
      assertEquals(0, basic1DMatrix0.rows());
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromMatrixMarket("org.la4j.operation.VectorMatrixOperation");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong input file format: can not read header '%%MatrixMarket'.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(2055, 9993, doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.getRow((-1024));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(14, 14);
      Matrix matrix0 = basic1DMatrix0.divide(196.0);
      assertEquals(14, matrix0.columns());
      assertEquals(14, matrix0.rows());
      assertFalse(matrix0.equals((Object)basic1DMatrix0));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      // Undeclared exception!
      try { 
        Basic1DMatrix.from1DArray((-557), (-557), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -557x-557
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.swapColumns(8, (-2572));
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromCSV("");
      // Undeclared exception!
      try { 
        basic1DMatrix0.blankOfShape(9964, (-1535));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(0);
      basic1DMatrix0.setAll(0);
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(0, 0);
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(0, basic1DMatrix0.rows());
  }
}
