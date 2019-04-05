/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 23:27:14 GMT 2019
 */

package org.la4j.matrix.dense;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferUnderflowException;
import java.util.HashMap;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.dense.Basic1DMatrix;
import org.la4j.vector.DenseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Basic1DMatrix_ESTest extends Basic1DMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(998);
      Vector vector0 = basic1DMatrix0.getRow(2);
      assertEquals(998, vector0.length());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[2][8];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(2, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(0, mockRandom0);
      Matrix matrix0 = basic1DMatrix0.copyOfShape(0, 0);
      assertTrue(matrix0.equals((Object)basic1DMatrix0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(0, mockRandom0);
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix0);
      assertTrue(basic1DMatrix1.equals((Object)basic1DMatrix0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(528, (-128.84));
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapColumns(528, (-2342));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2342
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromCSV(" from a ");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        Basic1DMatrix.from1DArray((-2261), (-2261), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -2261x-2261
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(9);
      // Undeclared exception!
      try { 
        basic1DMatrix0.copyOfShape((-1897), (-907));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -1897x-907
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      Basic1DMatrix basic1DMatrix0 = null;
      try {
        basic1DMatrix0 = new Basic1DMatrix((-2556), (-2556), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -2556x-2556
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[1][5];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      DenseMatrix denseMatrix0 = basic1DMatrix0.toDenseMatrix();
      assertEquals(5, denseMatrix0.columns());
      assertEquals(1, basic1DMatrix0.rows());
      assertEquals(5, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(39, 2175);
      double[][] doubleArray0 = basic1DMatrix0.toArray();
      assertEquals(39, doubleArray0.length);
      assertEquals(2175, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(0, mockRandom0);
      double[][] doubleArray0 = basic1DMatrix0.toArray();
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(151, Double.NEGATIVE_INFINITY);
      Matrix matrix0 = basic1DMatrix0.copyOfColumns(140);
      assertEquals(140, matrix0.columns());
      assertEquals(151, matrix0.rows());
      assertEquals(151, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(8, 8);
      Matrix matrix0 = basic1DMatrix0.copyOfShape(9997, 8);
      assertEquals(8, matrix0.columns());
      assertEquals(8, basic1DMatrix0.columns());
      assertEquals(8, basic1DMatrix0.rows());
      assertEquals(9997, matrix0.rows());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Matrix matrix0 = basic1DMatrix0.copyOfShape(2, 2);
      assertEquals(2, matrix0.columns());
      assertEquals(2, matrix0.rows());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(39, 2175);
      basic1DMatrix0.swapColumns(6, 40);
      assertEquals(39, basic1DMatrix0.rows());
      assertEquals(2175, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(0, mockRandom0);
      basic1DMatrix0.swapColumns(0, 0);
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(10, 1);
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.fromBinary(byteArray0);
      assertTrue(basic1DMatrix1.equals((Object)basic1DMatrix0));
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
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
  public void test20()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(0, mockRandom0);
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.fromBinary(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertTrue(basic1DMatrix1.equals((Object)basic1DMatrix0));
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(44, 44);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '45' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(289, (-1606.58587));
      DenseMatrix denseMatrix0 = DenseMatrix.constant(289, 2089, 1505.67548936);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, denseMatrix0, basic1DMatrix0, basic1DMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      DenseVector denseVector0 = DenseVector.fromMap(hashMap0, 149);
      Matrix matrix0 = denseVector0.toRowMatrix();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(149, 0, 0.0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(matrix0, matrix0, matrix0, basic1DMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.fromCSV("");
      double[] doubleArray0 = new double[9];
      DenseMatrix denseMatrix0 = DenseMatrix.from1DArray(737, 737, doubleArray0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(columnMajorSparseMatrix0, columnMajorSparseMatrix0, denseMatrix0, columnMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(1, 1);
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix0);
      assertEquals(2, basic1DMatrix1.columns());
      assertEquals(2, basic1DMatrix1.rows());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(2, 153, mockRandom0);
      assertEquals(2, basic1DMatrix0.rows());
      assertEquals(153, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(998);
      Matrix matrix0 = basic1DMatrix0.copyOfRows(153);
      assertEquals(153, matrix0.rows());
      assertEquals(998, matrix0.columns());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromMatrixMarket("f%1,b0N?O>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong input file format: can not read header '%%MatrixMarket'.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(12);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(12, mockRandom0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.getRow(12);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(12);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(12, mockRandom0);
      double double0 = basic1DMatrix0.determinant();
      assertEquals((-2.0879999999999904E-6), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(5, 9);
      Matrix matrix0 = basic1DMatrix0.blank();
      assertEquals(5, matrix0.rows());
      assertEquals(9, matrix0.columns());
      assertFalse(matrix0.equals((Object)basic1DMatrix0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.swapRows(8, 8);
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromCSV("");
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(5, 9);
      basic1DMatrix0.setAll(2329.8913957500517);
      assertEquals(5, basic1DMatrix0.rows());
      assertEquals(9, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(273, 273);
      MockRandom mockRandom0 = new MockRandom();
      SparseMatrix sparseMatrix0 = SparseMatrix.random(3999, 387, 0.0, (Random) mockRandom0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, sparseMatrix0, sparseMatrix0, sparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }
}