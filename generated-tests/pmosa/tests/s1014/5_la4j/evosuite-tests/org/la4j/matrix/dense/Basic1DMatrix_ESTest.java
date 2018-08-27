/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 05:03:26 GMT 2018
 */

package org.la4j.matrix.dense;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.MatrixFactory;
import org.la4j.matrix.dense.Basic1DMatrix;
import org.la4j.matrix.functor.MatrixFunction;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;
import org.la4j.vector.functor.VectorAccumulator;
import org.la4j.vector.functor.VectorFunction;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Basic1DMatrix_ESTest extends Basic1DMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.randomSymmetric(157, (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 957;
      MockRandom mockRandom0 = new MockRandom(1307L);
      // Undeclared exception!
      Basic1DMatrix.randomSymmetric(957, mockRandom0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Basic1DMatrix.constant(0, 0, (-380.0));
      double[][] doubleArray0 = new double[8][0];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (-380.0);
      doubleArray1[1] = (double) 0;
      doubleArray1[2] = (-380.0);
      doubleArray1[3] = (double) 0;
      doubleArray1[4] = (-380.0);
      doubleArray1[5] = (double) 0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = (double) 0;
      doubleArray2[1] = (-2649.846519313379);
      doubleArray2[2] = (-380.0);
      doubleArray2[3] = (double) 0;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[2];
      doubleArray3[0] = (-380.0);
      doubleArray3[1] = (double) 0;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[1];
      doubleArray4[0] = (-920.66683679119);
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[3];
      doubleArray5[0] = (-380.0);
      doubleArray5[1] = (-920.66683679119);
      doubleArray5[2] = 0.0;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[3];
      doubleArray6[0] = (-380.0);
      doubleArray6[1] = (-2649.846519313379);
      doubleArray6[2] = (-2649.846519313379);
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[2];
      doubleArray7[0] = (double) 0;
      doubleArray7[1] = (-380.0);
      doubleArray0[6] = doubleArray7;
      double[] doubleArray8 = new double[9];
      doubleArray8[0] = (-2649.846519313379);
      doubleArray8[1] = (-2649.846519313379);
      doubleArray8[2] = (-920.66683679119);
      doubleArray8[3] = (-2649.846519313379);
      doubleArray8[4] = (-380.0);
      doubleArray8[5] = (-920.66683679119);
      doubleArray8[6] = (-920.66683679119);
      doubleArray8[7] = (-1.0);
      doubleArray8[8] = (-920.66683679119);
      doubleArray0[7] = doubleArray8;
      // Undeclared exception!
      try { 
        Basic1DMatrix.from2DArray(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      DenseMatrix.from2DArray(doubleArray0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      assertEquals(2, basic1DMatrix0.columns());
      assertEquals(1, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(1, 1);
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
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromMatrixMarket("%");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong input file format: can not read header '%%MatrixMarket'.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = 0;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(0, 0, 2230.64476572523);
      basic1DMatrix0.shuffle();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix0);
      int int1 = 290;
      int int2 = 0;
      basic1DMatrix0.equals((Matrix) basic1DMatrix1, (double) 290);
      // Undeclared exception!
      try { 
        basic1DMatrix1.insert((Matrix) basic1DMatrix0, 290, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Out of bounds: Cannot add 290 rows and 0 cols at 0, 0 in a 0x0 matrix.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[2][2];
      double[] doubleArray1 = new double[1];
      DenseMatrix.from2DArray(doubleArray0);
      int int0 = 826;
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(826, 826, doubleArray1);
      // Undeclared exception!
      try { 
        basic1DMatrix0.shuffle();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[2][2];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, denseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.getRow(1003);
      basic1DMatrix0.setRow((-1290), (double) (-1290));
      basic1DMatrix0.shuffle();
      int int0 = (-2597);
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.nextInt();
      // Undeclared exception!
      try { 
        mockRandom0.doubles((long) 1003, (double) 1003, (-1786.4));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bound must be greater than origin
         //
         verifyException("java.util.Random", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.toBinary();
      int int0 = (-915);
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) (-915);
      doubleArray0[1] = (double) (-915);
      doubleArray0[2] = (double) (-915);
      doubleArray0[3] = (double) (-915);
      doubleArray0[4] = (double) (-915);
      doubleArray0[5] = (double) (-915);
      MatrixFunction matrixFunction0 = mock(MatrixFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        basic1DMatrix0.updateAt((-915), (-915), matrixFunction0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '-915' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(0, 0, mockRandom0);
      assertEquals(0, basic1DMatrix0.columns());
      
      basic1DMatrix0.swapRows((-631), 0);
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = 1;
      int int1 = 37;
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(0, mockRandom0);
      Matrix matrix0 = null;
      // Undeclared exception!
      try { 
        basic1DMatrix0.insert((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-3351.0);
      doubleArray0[0] = 0.0;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(957, 957);
      basic1DMatrix0.iteratorOfRow(433);
      basic1DMatrix0.setAll((-2097.4));
      assertEquals(957, basic1DMatrix0.columns());
      assertEquals(957, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      double[][] doubleArray0 = new double[2][2];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = (double) (byte)101;
      doubleArray2[1] = (double) (byte)0;
      doubleArray2[2] = (double) (byte)0;
      doubleArray0[1] = doubleArray2;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
      int int0 = 290;
      basic1DMatrix0.equals((Matrix) denseMatrix0, (double) 290);
      Matrix matrix0 = null;
      // Undeclared exception!
      try { 
        basic1DMatrix0.diagonalProduct();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '0' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = 200;
      DenseMatrix denseMatrix0 = DenseMatrix.from1DArray(200, 1, (double[]) null);
      Matrix matrix0 = Matrix.unit(200, 1);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(denseMatrix0, denseMatrix0, matrix0, matrix0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      double[][] doubleArray0 = new double[2][2];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = (double) (byte)101;
      doubleArray2[1] = (double) (byte)0;
      doubleArray2[2] = (double) (byte)0;
      doubleArray0[1] = doubleArray2;
      Matrix.from2DArray(doubleArray0);
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix((byte)0, (byte)0, doubleArray2);
      basic1DMatrix0.swapRows(3001, (-1));
      // Undeclared exception!
      try { 
        Basic1DMatrix.constant((-1), 3001, (byte)0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      Basic1DMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
      // Undeclared exception!
      try { 
        ColumnMajorSparseMatrix.fromCSV("V,]YGi!");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = 0;
      double[][] doubleArray0 = new double[2][5];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 2230.64476572523;
      doubleArray1[1] = (double) (byte)101;
      doubleArray1[2] = 2230.64476572523;
      doubleArray1[3] = (double) (byte)101;
      doubleArray1[4] = (-441.6);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = 2230.64476572523;
      doubleArray2[1] = (double) (byte)101;
      doubleArray2[2] = (-441.6);
      doubleArray0[1] = doubleArray2;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(1, 1);
      double[][] doubleArray0 = new double[9][1];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (double) 771;
      byte byte0 = (byte)101;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(denseMatrix0, basic1DMatrix0, denseMatrix0, basic1DMatrix0);
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
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      double[][] doubleArray0 = new double[2][2];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = (double) (byte)101;
      doubleArray2[1] = (double) (byte)0;
      doubleArray2[2] = (double) (byte)0;
      doubleArray0[1] = doubleArray2;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      double[][] doubleArray0 = new double[2][2];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      double[] doubleArray1 = new double[20];
      doubleArray0[0] = doubleArray1;
      DenseMatrix.from2DArray(doubleArray0);
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.swapColumns(6, 6);
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(0, 0, 2230.64476572523);
      Matrix matrix0 = basic1DMatrix0.shuffle();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1.0);
      doubleArray0[1] = 2230.64476572523;
      doubleArray0[2] = 2230.64476572523;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 1;
      basic1DMatrix0.manhattanNorm();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.from1DArray(1, 0, doubleArray0);
      assertFalse(basic1DMatrix1.equals((Object)basic1DMatrix0));
      assertEquals(0, basic1DMatrix1.columns());
      
      basic1DMatrix0.swapColumns(1731, 303);
      assertEquals(0, basic1DMatrix0.columns());
      assertTrue(basic1DMatrix0.equals((Object)matrix0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 1950;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(1950, 2);
      Matrix matrix0 = Matrix.identity(1950);
      double double0 = 0.0;
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.constant(2, 1950, 0.0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix1, basic1DMatrix1, basic1DMatrix0, matrix0);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-52);
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)0;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromBinary(byteArray0);
      assertEquals(0, basic1DMatrix0.rows());
      
      MatrixFunction matrixFunction0 = mock(MatrixFunction.class, new ViolatedAssumptionAnswer());
      Matrix matrix0 = basic1DMatrix0.transform(matrixFunction0);
      assertEquals(0, matrix0.rows());
      assertEquals(13369344, matrix0.columns());
      
      Basic1DMatrix.zero((byte)0, 28);
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.identity(55);
      assertEquals(55, basic1DMatrix1.columns());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      double[][] doubleArray0 = new double[2][2];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      Matrix.from2DArray(doubleArray0);
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix((byte)0, (byte)0);
      basic1DMatrix0.setAll(0.0);
      MockRandom mockRandom0 = new MockRandom(0L);
      mockRandom0.nextFloat();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.random((byte)0, 267, mockRandom0);
      basic1DMatrix0.toArray();
      Basic1DMatrix basic1DMatrix2 = Basic1DMatrix.unit((byte)0, 267);
      assertTrue(basic1DMatrix2.equals((Object)basic1DMatrix1));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[][] doubleArray0 = new double[2][2];
      DenseMatrix.from2DArray(doubleArray0);
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.diagonalProduct();
      double[][] doubleArray1 = basic1DMatrix0.toArray();
      assertNotSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      double[][] doubleArray0 = new double[3][7];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (double) (byte)0;
      doubleArray1[1] = (double) (byte)0;
      doubleArray1[2] = (double) (byte)0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[9];
      doubleArray2[0] = (double) (byte)0;
      doubleArray2[1] = (double) (byte)0;
      doubleArray2[2] = (double) (byte)0;
      doubleArray2[3] = (double) (byte)0;
      doubleArray2[4] = (double) (byte)0;
      doubleArray2[5] = (double) (byte)0;
      doubleArray2[6] = (double) (byte)0;
      doubleArray2[7] = (double) (byte)0;
      doubleArray2[8] = (double) (byte)0;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[5];
      doubleArray3[0] = (double) (byte)0;
      doubleArray3[1] = (double) (byte)0;
      doubleArray3[2] = (double) (byte)0;
      doubleArray3[3] = 0.0;
      doubleArray3[4] = (double) (byte)0;
      doubleArray0[2] = doubleArray3;
      Matrix.from2DArray(doubleArray0);
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(2659, 267);
      basic1DMatrix0.swapRows(0, 0);
      Basic1DMatrix.fromCSV("9");
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.zero(267, 267);
      assertEquals(267, basic1DMatrix1.rows());
      assertEquals(267, basic1DMatrix1.columns());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) (byte)0;
      doubleArray0[1] = (double) (byte)0;
      doubleArray0[2] = (double) (byte)0;
      doubleArray0[3] = (double) 9;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray((byte)0, 9, doubleArray0);
      basic1DMatrix0.swapColumns((-1331), (-1331));
      assertEquals(9, basic1DMatrix0.columns());
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)0;
      double[][] doubleArray0 = new double[2][2];
      double[] doubleArray1 = new double[1];
      DenseMatrix.zero(444, (byte)0);
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(0, 448, mockRandom0);
      Matrix matrix0 = basic1DMatrix0.copyOfShape((byte)101, (byte)0);
      basic1DMatrix0.setAll(1176.744378453);
      assertEquals(0, basic1DMatrix0.rows());
      assertEquals(448, basic1DMatrix0.columns());
      
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.from1DArray((byte)101, 0, doubleArray1);
      assertTrue(basic1DMatrix1.equals((Object)matrix0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(0, 0, 0);
      Basic1DMatrix basic1DMatrix1 = new Basic1DMatrix(18, 1);
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
  public void test32()  throws Throwable  {
      double[][] doubleArray0 = new double[2][2];
      double[] doubleArray1 = new double[1];
      doubleArray0[0] = doubleArray1;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      DenseVector denseVector0 = DenseVector.fromCollection(linkedList0);
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray1);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, sparseVector0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.block(matrix0, matrix0, denseMatrix0, denseMatrix0);
      assertEquals(2, basic1DMatrix0.rows());
      assertEquals(2, basic1DMatrix0.columns());
  }
}