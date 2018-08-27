/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 14:37:01 GMT 2018
 */

package org.la4j.matrix.dense;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Spliterator;
import java.util.stream.DoubleStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.MatrixFactory;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.dense.Basic1DMatrix;
import org.la4j.matrix.sparse.CRSMatrix;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Basic1DMatrix_ESTest extends Basic1DMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(37);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(37, 37);
      basic1DMatrix0.setAll(37);
      assertEquals(37, basic1DMatrix0.columns());
      assertEquals(37, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.iterator();
      // Undeclared exception!
      try { 
        basic1DMatrix0.get(9999, 9);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '9999' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromMatrixMarket("*M<R>TF$k|,");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong input file format: can not read header '%%MatrixMarket'.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(37, 37);
      Vector vector0 = basic1DMatrix0.getRow(30);
      assertEquals(37, vector0.length());
      assertEquals(37, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromCSV("");
      MatrixFactory<Matrix> matrixFactory0 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
      doReturn((Matrix) null).when(matrixFactory0).apply(anyInt() , anyInt());
      // Undeclared exception!
      try { 
        basic1DMatrix0.to(matrixFactory0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.DenseMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[1][8];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      Matrix.from2DArray(doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.blankOfShape(1865, (-1465));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.swapColumns(32, 107);
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(5, 5);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapColumns(9936, 17);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9936
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(4, mockRandom0);
      assertEquals(4, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(1, 1, 1);
      // Undeclared exception!
      try { 
        basic1DMatrix0.set(1, 2200, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '1' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.swapColumns((-1773), (-1773));
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.toArray();
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(37);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(37, 37, mockRandom0);
      basic1DMatrix0.setAll(37);
      assertEquals(37, basic1DMatrix0.rows());
      assertEquals(37, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(0, 0);
      basic1DMatrix0.swapRows(0, (-4591));
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Matrix.diagonal(5, (-278.3330037043483));
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(5);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapRows(14, 5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 70
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      assertEquals(0, basic1DMatrix0.rows());
      assertEquals(0, basic1DMatrix0.columns());
      assertNotNull(basic1DMatrix0);
      
      MatrixFactory<Matrix> matrixFactory0 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
      Matrix matrix0 = basic1DMatrix0.copy();
      assertTrue(matrix0.equals((Object)basic1DMatrix0));
      assertEquals(0, basic1DMatrix0.rows());
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(0, matrix0.rows());
      assertEquals(0, matrix0.columns());
      assertNotNull(matrix0);
      assertNotSame(basic1DMatrix0, matrix0);
      assertNotSame(matrix0, basic1DMatrix0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(37, 37);
      assertEquals(37, basic1DMatrix0.rows());
      assertEquals(37, basic1DMatrix0.columns());
      assertNotNull(basic1DMatrix0);
      
      Matrix matrix0 = basic1DMatrix0.copy();
      assertEquals(37, basic1DMatrix0.rows());
      assertEquals(37, basic1DMatrix0.columns());
      assertEquals(37, matrix0.columns());
      assertEquals(37, matrix0.rows());
      assertNotNull(matrix0);
      assertNotSame(basic1DMatrix0, matrix0);
      assertNotSame(matrix0, basic1DMatrix0);
      
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      assertEquals(37, basic1DMatrix0.rows());
      assertEquals(37, basic1DMatrix0.columns());
      assertNotNull(byteArray0);
      assertNotSame(basic1DMatrix0, matrix0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      assertEquals(0, basic1DMatrix0.rows());
      assertEquals(0, basic1DMatrix0.columns());
      assertNotNull(basic1DMatrix0);
      
      basic1DMatrix0.setAll(0.0);
      assertEquals(0, basic1DMatrix0.rows());
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(30, 30);
      assertEquals(30, basic1DMatrix0.columns());
      assertEquals(30, basic1DMatrix0.rows());
      assertNotNull(basic1DMatrix0);
      
      double[][] doubleArray0 = basic1DMatrix0.toArray();
      assertEquals(30, basic1DMatrix0.columns());
      assertEquals(30, basic1DMatrix0.rows());
      assertNotNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)1;
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
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      DoubleStream doubleStream0 = mockRandom0.doubles(1107L);
      assertNotNull(doubleStream0);
      
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(8, 8, mockRandom0);
      assertEquals(8, basic1DMatrix0.rows());
      assertEquals(8, basic1DMatrix0.columns());
      assertNotNull(basic1DMatrix0);
      
      long long0 = mockRandom0.nextLong();
      assertEquals(64L, long0);
      
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      assertEquals(8, basic1DMatrix0.rows());
      assertEquals(8, basic1DMatrix0.columns());
      assertNotNull(byteArray0);
      
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.fromBinary(byteArray0);
      assertTrue(basic1DMatrix1.equals((Object)basic1DMatrix0));
      assertEquals(8, basic1DMatrix0.rows());
      assertEquals(8, basic1DMatrix0.columns());
      assertEquals(8, basic1DMatrix1.rows());
      assertEquals(8, basic1DMatrix1.columns());
      assertNotNull(basic1DMatrix1);
      assertNotSame(basic1DMatrix0, basic1DMatrix1);
      assertNotSame(basic1DMatrix1, basic1DMatrix0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 884;
      doubleArray0[1] = (double) 884;
      doubleArray0[2] = (double) 884;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(884, 884, doubleArray0);
      assertEquals(884, basic1DMatrix0.columns());
      assertEquals(884, basic1DMatrix0.rows());
      assertNotNull(basic1DMatrix0);
      assertArrayEquals(new double[] {884.0, 884.0, 884.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      basic1DMatrix0.swapRows(0, 0);
      assertEquals(884, basic1DMatrix0.columns());
      assertEquals(884, basic1DMatrix0.rows());
      assertArrayEquals(new double[] {884.0, 884.0, 884.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      Matrix matrix0 = basic1DMatrix0.copyOfShape(0, 884);
      assertFalse(matrix0.equals((Object)basic1DMatrix0));
      assertEquals(884, basic1DMatrix0.columns());
      assertEquals(884, basic1DMatrix0.rows());
      assertEquals(884, matrix0.columns());
      assertEquals(0, matrix0.rows());
      assertNotNull(matrix0);
      assertNotSame(basic1DMatrix0, matrix0);
      assertNotSame(matrix0, basic1DMatrix0);
      assertArrayEquals(new double[] {884.0, 884.0, 884.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      assertEquals(0, basic1DMatrix0.rows());
      assertEquals(0, basic1DMatrix0.columns());
      assertNotNull(basic1DMatrix0);
      
      Matrix matrix0 = basic1DMatrix0.copyOfShape(1, 9991);
      assertFalse(matrix0.equals((Object)basic1DMatrix0));
      assertEquals(0, basic1DMatrix0.rows());
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(1, matrix0.rows());
      assertEquals(9991, matrix0.columns());
      assertNotNull(matrix0);
      assertNotSame(basic1DMatrix0, matrix0);
      assertNotSame(matrix0, basic1DMatrix0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      DoubleStream doubleStream0 = mockRandom0.doubles((long) 8);
      assertNotNull(doubleStream0);
      
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(8, 8, mockRandom0);
      assertEquals(8, basic1DMatrix0.rows());
      assertEquals(8, basic1DMatrix0.columns());
      assertNotNull(basic1DMatrix0);
      
      Matrix matrix0 = basic1DMatrix0.copyOfShape(4498, 8);
      assertFalse(matrix0.equals((Object)basic1DMatrix0));
      assertEquals(8, basic1DMatrix0.rows());
      assertEquals(8, basic1DMatrix0.columns());
      assertEquals(4498, matrix0.rows());
      assertEquals(8, matrix0.columns());
      assertNotNull(matrix0);
      assertNotSame(basic1DMatrix0, matrix0);
      assertNotSame(matrix0, basic1DMatrix0);
      
      CRSMatrix cRSMatrix0 = (CRSMatrix)Matrix.diagonal(2654, 789.6699);
      assertEquals(3.7678975131876413E-4, cRSMatrix0.density(), 0.01);
      assertEquals(789.6699, cRSMatrix0.max(), 0.01);
      assertEquals(2654, cRSMatrix0.columns());
      assertEquals(2654, cRSMatrix0.rows());
      assertEquals(0.0, cRSMatrix0.min(), 0.01);
      assertEquals(2654, cRSMatrix0.cardinality());
      assertTrue(cRSMatrix0.isRowMajor());
      assertNotNull(cRSMatrix0);
      
      MatrixFactory<Matrix> matrixFactory0 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CRSMatrix cRSMatrix0 = (CRSMatrix)Matrix.diagonal(8, 8);
      assertEquals(0.0, cRSMatrix0.min(), 0.01);
      assertEquals(0.125, cRSMatrix0.density(), 0.01);
      assertTrue(cRSMatrix0.isRowMajor());
      assertEquals(8, cRSMatrix0.columns());
      assertEquals(8, cRSMatrix0.rows());
      assertEquals(8.0, cRSMatrix0.max(), 0.01);
      assertEquals(8, cRSMatrix0.cardinality());
      assertNotNull(cRSMatrix0);
      
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(cRSMatrix0, cRSMatrix0, cRSMatrix0, cRSMatrix0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '9' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-185L));
      assertNotNull(mockRandom0);
      
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-47);
      byteArray0[1] = (byte)111;
      byteArray0[2] = (byte) (-91);
      byteArray0[3] = (byte) (-1);
      byteArray0[5] = (byte) (-27);
      byteArray0[6] = (byte) (-27);
      byteArray0[7] = (byte) (-58);
      byteArray0[8] = (byte) (-1);
      mockRandom0.nextBytes(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)0, (byte)0, (byte)0, (byte)2}, byteArray0);
      
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(1, mockRandom0);
      assertEquals(1, denseMatrix0.columns());
      assertEquals(1, denseMatrix0.rows());
      assertNotNull(denseMatrix0);
      
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
      assertEquals(1, denseMatrix0.columns());
      assertEquals(1, denseMatrix0.rows());
      assertEquals(2, basic1DMatrix0.rows());
      assertEquals(2, basic1DMatrix0.columns());
      assertNotNull(basic1DMatrix0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      DoubleStream doubleStream0 = mockRandom0.doubles();
      assertNotNull(doubleStream0);
      
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(154, 0, mockRandom0);
      assertEquals(154, basic1DMatrix0.rows());
      assertEquals(0, basic1DMatrix0.columns());
      assertNotNull(basic1DMatrix0);
      
      long long0 = mockRandom0.nextLong();
      assertEquals(0L, long0);
      
      CRSMatrix cRSMatrix0 = (CRSMatrix)Matrix.diagonal(0, 0);
      assertEquals(Double.NaN, cRSMatrix0.density(), 0.01);
      assertEquals(0.0, cRSMatrix0.max(), 0.01);
      assertEquals(0, cRSMatrix0.rows());
      assertTrue(cRSMatrix0.isRowMajor());
      assertEquals(0.0, cRSMatrix0.min(), 0.01);
      assertEquals(0, cRSMatrix0.columns());
      assertEquals(0, cRSMatrix0.cardinality());
      assertNotNull(cRSMatrix0);
      
      MatrixFactory<Matrix> matrixFactory0 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, cRSMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CRSMatrix cRSMatrix0 = (CRSMatrix)Matrix.diagonal(8, 8);
      assertEquals(8.0, cRSMatrix0.max(), 0.01);
      assertEquals(0.0, cRSMatrix0.min(), 0.01);
      assertEquals(8, cRSMatrix0.rows());
      assertEquals(0.125, cRSMatrix0.density(), 0.01);
      assertEquals(8, cRSMatrix0.cardinality());
      assertEquals(8, cRSMatrix0.columns());
      assertTrue(cRSMatrix0.isRowMajor());
      assertNotNull(cRSMatrix0);
      
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(8, 8);
      assertEquals(8, basic1DMatrix0.columns());
      assertEquals(8, basic1DMatrix0.rows());
      assertNotNull(basic1DMatrix0);
      
      basic1DMatrix0.swapRows(8, 8);
      assertEquals(8, basic1DMatrix0.columns());
      assertEquals(8, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CRSMatrix cRSMatrix0 = (CRSMatrix)Matrix.diagonal(18, 0.0);
      assertEquals(0.05555555555555555, cRSMatrix0.density(), 0.01);
      assertEquals(0.0, cRSMatrix0.max(), 0.01);
      assertEquals(18, cRSMatrix0.rows());
      assertTrue(cRSMatrix0.isRowMajor());
      assertEquals(18, cRSMatrix0.cardinality());
      assertEquals(0.0, cRSMatrix0.min(), 0.01);
      assertEquals(18, cRSMatrix0.columns());
      assertNotNull(cRSMatrix0);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)1;
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      assertEquals(0, basic1DMatrix0.rows());
      assertEquals(0, basic1DMatrix0.columns());
      assertNotNull(basic1DMatrix0);
      
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, cRSMatrix0, cRSMatrix0, cRSMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(154, 0, mockRandom0);
      assertEquals(154, basic1DMatrix0.rows());
      assertEquals(0, basic1DMatrix0.columns());
      assertNotNull(basic1DMatrix0);
      
      long long0 = mockRandom0.nextLong();
      assertEquals(0L, long0);
      
      MatrixFactory<Matrix> matrixFactory0 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
      doReturn(basic1DMatrix0).when(matrixFactory0).apply(anyInt() , anyInt());
      Spliterator<Double> spliterator0 = basic1DMatrix0.spliterator();
      assertEquals(154, basic1DMatrix0.rows());
      assertEquals(0, basic1DMatrix0.columns());
      assertNotNull(spliterator0);
      
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.identity(154);
      assertFalse(basic1DMatrix1.equals((Object)basic1DMatrix0));
      assertEquals(154, basic1DMatrix1.rows());
      assertEquals(154, basic1DMatrix1.columns());
      assertNotNull(basic1DMatrix1);
      assertNotSame(basic1DMatrix1, basic1DMatrix0);
      
      Matrix matrix0 = basic1DMatrix0.to(matrixFactory0);
      assertFalse(basic1DMatrix0.equals((Object)basic1DMatrix1));
      assertFalse(matrix0.equals((Object)basic1DMatrix1));
      assertEquals(154, basic1DMatrix0.rows());
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(0, matrix0.columns());
      assertEquals(154, matrix0.rows());
      assertNotNull(matrix0);
      assertSame(basic1DMatrix0, matrix0);
      assertNotSame(basic1DMatrix0, basic1DMatrix1);
      assertNotSame(matrix0, basic1DMatrix1);
      assertSame(matrix0, basic1DMatrix0);
      
      Basic1DMatrix basic1DMatrix2 = new Basic1DMatrix();
      assertFalse(basic1DMatrix2.equals((Object)matrix0));
      assertFalse(basic1DMatrix2.equals((Object)basic1DMatrix1));
      assertFalse(basic1DMatrix2.equals((Object)basic1DMatrix0));
      assertEquals(0, basic1DMatrix2.columns());
      assertEquals(0, basic1DMatrix2.rows());
      assertNotNull(basic1DMatrix2);
      
      RowMajorSparseMatrix rowMajorSparseMatrix0 = basic1DMatrix0.toRowMajorSparseMatrix();
      assertFalse(basic1DMatrix0.equals((Object)basic1DMatrix2));
      assertFalse(basic1DMatrix0.equals((Object)basic1DMatrix1));
      assertEquals(154, basic1DMatrix0.rows());
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(154, rowMajorSparseMatrix0.rows());
      assertEquals(0.0, rowMajorSparseMatrix0.max(), 0.01);
      assertEquals(Double.NaN, rowMajorSparseMatrix0.density(), 0.01);
      assertEquals(0, rowMajorSparseMatrix0.columns());
      assertTrue(rowMajorSparseMatrix0.isRowMajor());
      assertEquals(0.0, rowMajorSparseMatrix0.min(), 0.01);
      assertEquals(0, rowMajorSparseMatrix0.cardinality());
      assertNotNull(rowMajorSparseMatrix0);
      assertNotSame(basic1DMatrix0, basic1DMatrix2);
      assertSame(basic1DMatrix0, matrix0);
      assertNotSame(basic1DMatrix0, basic1DMatrix1);
      
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(matrix0, basic1DMatrix1, basic1DMatrix0, basic1DMatrix0);
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
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      DoubleStream doubleStream0 = mockRandom0.doubles((long) 8);
      assertNotNull(doubleStream0);
      
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(7, 7);
      assertEquals(7, basic1DMatrix0.columns());
      assertEquals(7, basic1DMatrix0.rows());
      assertNotNull(basic1DMatrix0);
      
      long long0 = mockRandom0.nextLong();
      assertEquals(0L, long0);
      
      CRSMatrix cRSMatrix0 = (CRSMatrix)Matrix.diagonal(2686, 789.6699);
      assertEquals(3.7230081906180194E-4, cRSMatrix0.density(), 0.01);
      assertEquals(2686, cRSMatrix0.cardinality());
      assertTrue(cRSMatrix0.isRowMajor());
      assertEquals(789.6699, cRSMatrix0.max(), 0.01);
      assertEquals(2686, cRSMatrix0.columns());
      assertEquals(2686, cRSMatrix0.rows());
      assertEquals(0.0, cRSMatrix0.min(), 0.01);
      assertNotNull(cRSMatrix0);
      
      MatrixFactory<Matrix> matrixFactory0 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(cRSMatrix0, cRSMatrix0, basic1DMatrix0, cRSMatrix0);
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
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(19);
      assertEquals(19, basic1DMatrix0.columns());
      assertEquals(19, basic1DMatrix0.rows());
      assertNotNull(basic1DMatrix0);
      
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      assertEquals(19, basic1DMatrix0.columns());
      assertEquals(19, basic1DMatrix0.rows());
      assertNotNull(byteArray0);
      
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.fromBinary(byteArray0);
      assertTrue(basic1DMatrix1.equals((Object)basic1DMatrix0));
      assertEquals(19, basic1DMatrix0.columns());
      assertEquals(19, basic1DMatrix0.rows());
      assertEquals(19, basic1DMatrix1.columns());
      assertEquals(19, basic1DMatrix1.rows());
      assertNotNull(basic1DMatrix1);
      assertNotSame(basic1DMatrix0, basic1DMatrix1);
      assertNotSame(basic1DMatrix1, basic1DMatrix0);
      
      Matrix matrix0 = basic1DMatrix1.copyOfShape(17, 17);
      assertTrue(basic1DMatrix1.equals((Object)basic1DMatrix0));
      assertFalse(matrix0.equals((Object)basic1DMatrix1));
      assertFalse(matrix0.equals((Object)basic1DMatrix0));
      assertEquals(19, basic1DMatrix0.columns());
      assertEquals(19, basic1DMatrix0.rows());
      assertEquals(19, basic1DMatrix1.columns());
      assertEquals(19, basic1DMatrix1.rows());
      assertEquals(17, matrix0.columns());
      assertEquals(17, matrix0.rows());
      assertNotNull(matrix0);
      assertNotSame(basic1DMatrix0, basic1DMatrix1);
      assertNotSame(basic1DMatrix0, matrix0);
      assertNotSame(basic1DMatrix1, basic1DMatrix0);
      assertNotSame(basic1DMatrix1, matrix0);
      assertNotSame(matrix0, basic1DMatrix1);
      assertNotSame(matrix0, basic1DMatrix0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(2, 2, mockRandom0);
      assertEquals(2, basic1DMatrix0.columns());
      assertEquals(2, basic1DMatrix0.rows());
      assertNotNull(basic1DMatrix0);
      
      Matrix matrix0 = basic1DMatrix0.removeFirstColumn();
      assertFalse(matrix0.equals((Object)basic1DMatrix0));
      assertEquals(2, basic1DMatrix0.columns());
      assertEquals(2, basic1DMatrix0.rows());
      assertEquals(1, matrix0.columns());
      assertEquals(2, matrix0.rows());
      assertNotNull(matrix0);
      assertNotSame(basic1DMatrix0, matrix0);
      assertNotSame(matrix0, basic1DMatrix0);
      
      byte[] byteArray0 = matrix0.toBinary();
      assertFalse(basic1DMatrix0.equals((Object)matrix0));
      assertFalse(matrix0.equals((Object)basic1DMatrix0));
      assertEquals(2, basic1DMatrix0.columns());
      assertEquals(2, basic1DMatrix0.rows());
      assertEquals(1, matrix0.columns());
      assertEquals(2, matrix0.rows());
      assertNotNull(byteArray0);
      assertNotSame(basic1DMatrix0, matrix0);
      assertNotSame(matrix0, basic1DMatrix0);
      
      RowMajorSparseMatrix rowMajorSparseMatrix0 = matrix0.toRowMajorSparseMatrix();
      assertFalse(basic1DMatrix0.equals((Object)matrix0));
      assertFalse(matrix0.equals((Object)basic1DMatrix0));
      assertEquals(2, basic1DMatrix0.columns());
      assertEquals(2, basic1DMatrix0.rows());
      assertEquals(1, matrix0.columns());
      assertEquals(2, matrix0.rows());
      assertEquals(0.3, rowMajorSparseMatrix0.max(), 0.01);
      assertEquals(2, rowMajorSparseMatrix0.rows());
      assertTrue(rowMajorSparseMatrix0.isRowMajor());
      assertEquals(1.0, rowMajorSparseMatrix0.density(), 0.01);
      assertEquals(2, rowMajorSparseMatrix0.cardinality());
      assertEquals(0.0, rowMajorSparseMatrix0.min(), 0.01);
      assertEquals(1, rowMajorSparseMatrix0.columns());
      assertNotNull(rowMajorSparseMatrix0);
      assertNotSame(basic1DMatrix0, matrix0);
      assertNotSame(matrix0, basic1DMatrix0);
      
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(rowMajorSparseMatrix0, matrix0, rowMajorSparseMatrix0, matrix0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '3' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }
}