/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 08:43:23 GMT 2019
 */

package org.la4j.matrix.dense;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferUnderflowException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.MatrixFactory;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.dense.Basic1DMatrix;
import org.la4j.vector.DenseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Basic1DMatrix_ESTest extends Basic1DMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(8, 8, doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.copyOfShape(8, 9979);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Matrix matrix0 = basic1DMatrix0.copyOfRows(1312);
      assertEquals(1312, matrix0.rows());
      assertEquals(0, matrix0.columns());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Matrix matrix0 = basic1DMatrix0.copyOfShape(17, 17);
      assertEquals(17, matrix0.columns());
      assertEquals(17, matrix0.rows());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(1, 1, mockRandom0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapColumns((-4751), 165);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -4751
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(7, 7);
      Matrix matrix0 = basic1DMatrix0.removeFirstColumn();
      assertEquals(6, matrix0.columns());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-26);
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
  public void test06()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(1, 1);
      double[] doubleArray0 = new double[7];
      Basic1DMatrix basic1DMatrix1 = new Basic1DMatrix(973, 1, doubleArray0);
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
  public void test07()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      DenseVector denseVector0 = DenseVector.fromCollection(linkedList0);
      Matrix matrix0 = denseVector0.toRowMatrix();
      MockRandom mockRandom0 = new MockRandom(1617);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.random(1617, 1617, 0.0, (Random) mockRandom0);
      Matrix matrix1 = columnMajorSparseMatrix0.add(566.4);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(matrix0, matrix1, columnMajorSparseMatrix0, matrix1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(83, 1718);
      basic1DMatrix0.swapRows(9, 7);
      assertEquals(83, basic1DMatrix0.rows());
      assertEquals(1718, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Basic1DMatrix basic1DMatrix1 = new Basic1DMatrix(370, 370);
      MatrixFactory<Basic1DMatrix> matrixFactory0 = (MatrixFactory<Basic1DMatrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
      doReturn(basic1DMatrix1).when(matrixFactory0).apply(anyInt() , anyInt());
      Basic1DMatrix basic1DMatrix2 = basic1DMatrix0.to(matrixFactory0);
      assertNotSame(basic1DMatrix2, basic1DMatrix0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(0, 0, mockRandom0);
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(31, 31);
      Vector vector0 = basic1DMatrix0.getRow(9);
      assertEquals(31, vector0.length());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(104, 104, 104);
      double double0 = basic1DMatrix0.get(37, 1);
      assertEquals(104, basic1DMatrix0.rows());
      assertEquals(104.0, double0, 0.01);
      assertEquals(104, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(493, (-1.0));
      double double0 = basic1DMatrix0.get(0, 0);
      assertEquals((-1.0), double0, 0.01);
      assertEquals(493, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[23];
      byteArray0[1] = (byte)9;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromBinary(byteArray0);
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(150994944, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[5] = (byte)9;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromBinary(byteArray0);
      assertEquals(0, basic1DMatrix0.rows());
      assertEquals(150994944, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[][] doubleArray0 = new double[3][2];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(3, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Matrix matrix0 = basic1DMatrix0.blankOfShape(0, 0);
      assertTrue(matrix0.equals((Object)basic1DMatrix0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(0, 0);
      assertEquals(0, basic1DMatrix0.rows());
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.zero((-148), (-28));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -148x-28
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.unit((-2236), 1399);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
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
  public void test22()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.swapRows((-4035), (-1621));
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.swapColumns((-1244), (-1244));
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.setAll(0.0);
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.setAll((-1935.370297644752));
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(9, 1116);
      // Undeclared exception!
      try { 
        basic1DMatrix0.set(9, 0, 1116.0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '9' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      // Undeclared exception!
      try { 
        basic1DMatrix0.set(27, 27, 1.0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '27' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(1, 0, mockRandom0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.set((-1), 2681, (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '-1' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.set(1707, (-226), (-226));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '1707' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Vector vector0 = basic1DMatrix0.getRow((-26));
      assertEquals(0, vector0.length());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      // Undeclared exception!
      try { 
        basic1DMatrix0.get(1163, (-4212));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '1163' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(2341, 16);
      // Undeclared exception!
      try { 
        basic1DMatrix0.get((-178), 2341);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '-178' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromCSV("");
      assertEquals(0, basic1DMatrix0.rows());
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
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
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(712, 763, doubleArray0);
      assertEquals(763, basic1DMatrix0.columns());
      assertEquals(712, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      // Undeclared exception!
      try { 
        Basic1DMatrix.from1DArray((-340), (-340), doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -340x-340
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray((byte)0, (byte)0, doubleArray0);
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(8, 1816, (double[]) null);
      assertEquals(1816, basic1DMatrix0.columns());
      assertEquals(8, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(0, 0);
      Matrix matrix0 = basic1DMatrix0.copyOfShape(0, 0);
      assertTrue(matrix0.equals((Object)basic1DMatrix0));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(0, (Random) null);
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix0);
      assertTrue(basic1DMatrix1.equals((Object)basic1DMatrix0));
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      DenseVector denseVector0 = DenseVector.fromCollection(linkedList0);
      Matrix matrix0 = denseVector0.toRowMatrix();
      MockRandom mockRandom0 = new MockRandom(1617);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.random(1617, 1617, 0.0, (Random) mockRandom0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(matrix0, matrix0, columnMajorSparseMatrix0, matrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(791);
      Matrix matrix0 = basic1DMatrix0.blankOfShape(791, 791);
      assertEquals(791, matrix0.rows());
      assertEquals(791, basic1DMatrix0.columns());
      assertEquals(791, matrix0.columns());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      // Undeclared exception!
      try { 
        basic1DMatrix0.blankOfShape(0, (-1029));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: 0x-1029
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.zero(3, (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.unit(13, (-822));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(108);
      // Undeclared exception!
      basic1DMatrix0.toBinary();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      // Undeclared exception!
      try { 
        basic1DMatrix0.to((MatrixFactory<Matrix>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-1360L));
      // Undeclared exception!
      Basic1DMatrix.randomSymmetric(767, mockRandom0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      Basic1DMatrix.random((-78), (-1051), mockRandom0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.random(62, 29, (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Basic1DMatrix.random((-1281), 5, mockRandom0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(1000L);
      // Undeclared exception!
      try { 
        Basic1DMatrix.random((byte)0, (-160), mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: 0x-160
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.identity((-246));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -246x-246
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(9, 9);
      // Undeclared exception!
      try { 
        basic1DMatrix0.getRow(9);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromMatrixMarket("");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromMatrixMarket("U");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong input file format: can not read header '%%MatrixMarket'.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromCSV("org.la4j.matrix.dense.Basic1DMatrix");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromCSV((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromBinary((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.from2DArray((double[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      double[][] doubleArray0 = new double[0][2];
      // Undeclared exception!
      try { 
        Basic1DMatrix.from2DArray(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.diagonal((-143), 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -143x-143
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      // Undeclared exception!
      try { 
        basic1DMatrix0.copyOfShape((-178), (-178));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -178x-178
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(51, 53, doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.copyOfShape(166, 17);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.constant((-148), (-148), 216.17172224);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -148x-148
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.block((Matrix) null, (Matrix) null, (Matrix) null, (Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      double[][] doubleArray0 = new double[8][1];
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from2DArray(doubleArray0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(rowMajorSparseMatrix0, rowMajorSparseMatrix0, rowMajorSparseMatrix0, rowMajorSparseMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 32
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      // Undeclared exception!
      try { 
        basic1DMatrix0.blankOfShape((-336), (-336));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -336x-336
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(0, 0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.set(0, 380, 0.0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '0' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(8, 8);
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      assertEquals(8, basic1DMatrix0.columns());
      assertEquals(521, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(31, 31);
      double[][] doubleArray0 = basic1DMatrix0.toArray();
      assertEquals(31, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      double[][] doubleArray0 = basic1DMatrix0.toArray();
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(104, 1, mockRandom0);
      Matrix matrix0 = basic1DMatrix0.copyOfShape(1, 1);
      assertEquals(1, basic1DMatrix0.columns());
      assertEquals(1, matrix0.columns());
      assertEquals(104, basic1DMatrix0.rows());
      assertEquals(1, matrix0.rows());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(1, 1, mockRandom0);
      Matrix matrix0 = basic1DMatrix0.copyOfShape(3158, 1);
      assertEquals(1, basic1DMatrix0.rows());
      assertEquals(1, matrix0.columns());
      assertEquals(3158, matrix0.rows());
      assertEquals(1, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(2570, 37, 37);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapColumns(2570, 66);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 95107
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.swapColumns(375, 8);
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant((byte)0, (byte)0, 0.0);
      basic1DMatrix0.swapColumns((byte)0, (byte)0);
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(3389, 1, (-1508.59420654058));
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapRows(103, 3389);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3389
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant((byte)0, (byte)0, 0.0);
      basic1DMatrix0.swapRows((byte)0, (byte)0);
      assertEquals(0, basic1DMatrix0.rows());
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)1;
      byteArray0[8] = (byte)9;
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
  public void test81()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)32;
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
  public void test82()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(1, 1116);
      SparseMatrix sparseMatrix0 = basic1DMatrix0.toSparseMatrix();
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(sparseMatrix0, sparseMatrix0, basic1DMatrix0, sparseMatrix0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '1117' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      DenseVector denseVector0 = DenseVector.constant(1, 1);
      Matrix matrix0 = denseVector0.toRowMatrix();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.block(matrix0, matrix0, matrix0, matrix0);
      Matrix matrix1 = basic1DMatrix0.blankOfRows(1);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(matrix1, matrix0, basic1DMatrix0, basic1DMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      DenseVector denseVector0 = DenseVector.constant(34, 1.0);
      Matrix matrix0 = denseVector0.toRowMatrix();
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
  public void test85()  throws Throwable  {
      DenseVector denseVector0 = DenseVector.constant(1, 1);
      Matrix matrix0 = denseVector0.toRowMatrix();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.block(matrix0, matrix0, matrix0, matrix0);
      Basic1DMatrix basic1DMatrix1 = new Basic1DMatrix(1, 5294);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix1, matrix0, basic1DMatrix0, basic1DMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      DenseVector denseVector0 = DenseVector.constant(1, 1);
      Matrix matrix0 = denseVector0.toRowMatrix();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.block(matrix0, matrix0, matrix0, matrix0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, matrix0, basic1DMatrix0, basic1DMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      double[][] doubleArray0 = new double[1][4];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      assertEquals(4, basic1DMatrix0.columns());
      assertEquals(1, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(87);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(87, mockRandom0);
      assertEquals(87, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-637));
      // Undeclared exception!
      try { 
        Basic1DMatrix.randomSymmetric((-637), mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -637x-637
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
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
  public void test91()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(33);
      double double0 = basic1DMatrix0.get(2, 12);
      assertEquals(0.0, double0, 0.01);
      assertEquals(33, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Vector vector0 = basic1DMatrix0.getRow(0);
      assertEquals(0, vector0.length());
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromCSV("6");
      assertEquals(1, basic1DMatrix0.rows());
      assertEquals(1, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(104, 104, 104);
      basic1DMatrix0.setAll(104);
      assertEquals(104, basic1DMatrix0.columns());
      assertEquals(104, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(0, 0);
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(0, basic1DMatrix0.rows());
  }
}
