/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 15:54:52 GMT 2018
 */

package org.la4j.matrix.dense;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.MatrixFactory;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.dense.Basic1DMatrix;
import org.la4j.operation.ooplace.OoPlaceMatricesMultiplication;
import org.la4j.operation.ooplace.OoPlaceMatricesSubtraction;
import org.la4j.vector.functor.VectorFunction;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Basic1DMatrix_ESTest extends Basic1DMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[] doubleArray1 = new double[2];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      basic1DMatrix0.setAll(0.0);
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(1, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.setRow((-2699), (-2190.8804257));
      // Undeclared exception!
      try { 
        basic1DMatrix0.blankOfShape((-2699), 1000);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(0, mockRandom0);
      Vector vector0 = basic1DMatrix0.getRow(0);
      assertEquals(0, basic1DMatrix0.columns());
      assertEquals(0, vector0.length());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(7, 7);
      MatrixFactory<Basic1DMatrix> matrixFactory0 = (MatrixFactory<Basic1DMatrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
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
  public void test04()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(10);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapRows(7, 10);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 100
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(10);
      basic1DMatrix0.swapRows(7, 0);
      assertEquals(10, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(927, 927, (double[]) null);
      basic1DMatrix0.swapColumns(927, 927);
      assertEquals(927, basic1DMatrix0.columns());
      assertEquals(927, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      // Undeclared exception!
      try { 
        basic1DMatrix0.get(13, 13);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '13' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte)24;
      byteArray0[0] = (byte)24;
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
  public void test09()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.toCSV();
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
  public void test10()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(1);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(1, 48, mockRandom0);
      assertEquals(48, basic1DMatrix0.columns());
      assertEquals(1, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      int int0 = (-2133);
      // Undeclared exception!
      try { 
        basic1DMatrix0.set((-2133), (-2133), (-2133));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '-2133' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.longs((long) 8);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(8, mockRandom0);
      assertEquals(8, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      MockRandom mockRandom0 = new MockRandom();
      double double0 = Locale.LanguageRange.MIN_WEIGHT;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(7);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, rowMajorSparseMatrix0, rowMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.toCSV();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix0);
      assertTrue(basic1DMatrix1.equals((Object)basic1DMatrix0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(1, 1, 1);
      assertEquals(1, basic1DMatrix0.columns());
      
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.zero(1, 1);
      Basic1DMatrix basic1DMatrix2 = Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix1, basic1DMatrix1);
      assertEquals(1, basic1DMatrix1.rows());
      assertEquals(2, basic1DMatrix2.rows());
      assertEquals(2, basic1DMatrix2.columns());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = 2;
      Random.setNextRandom(2);
      double double0 = (-3873.51473);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(2, (-3873.51473));
      OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new OoPlaceMatricesSubtraction();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(2, (-3873.51473));
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(columnMajorSparseMatrix0, columnMajorSparseMatrix0, basic1DMatrix0, basic1DMatrix0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '3' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromBinary(byteArray0);
      basic1DMatrix0.copyOfRows(75);
      MatrixFactory<Matrix> matrixFactory0 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.toBinary();
      basic1DMatrix0.swapRows(1387, 1387);
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      byteArray0[0] = (byte)0;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromBinary(byteArray0);
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      basic1DMatrix0.manhattanNorm();
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      MatrixFactory<Matrix> matrixFactory0 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
      basic1DMatrix0.swapColumns(23, (byte)0);
      MatrixFactory<Matrix> matrixFactory1 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.diagonal(23, 0.5);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, rowMajorSparseMatrix0, rowMajorSparseMatrix0, basic1DMatrix0);
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
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(298, 261);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapColumns(261, (-2212));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2212
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromCSV("");
      basic1DMatrix0.diagonalProduct();
      basic1DMatrix0.swapColumns((-809), (-2593));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.toArray();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromCSV("      ");
      basic1DMatrix0.toArray();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(298, 298);
      basic1DMatrix0.swapColumns(298, 298);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(18, 17);
      basic1DMatrix0.setAll(18);
      Matrix matrix0 = basic1DMatrix0.copyOfShape(17, 2116);
      Random.setNextRandom(2116);
      matrix0.copyOfShape(879, 18);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(1240L);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.randomSymmetric(134, 0.0, (java.util.Random) mockRandom0);
      Matrix matrix0 = columnMajorSparseMatrix0.rotate();
      double[][] doubleArray0 = new double[1][3];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (double) 1240L;
      doubleArray1[1] = (double) 134;
      doubleArray1[2] = 1.0;
      doubleArray1[3] = (double) 1240L;
      doubleArray1[4] = 0.0;
      doubleArray1[5] = 0.0;
      doubleArray0[0] = doubleArray1;
      ColumnMajorSparseMatrix columnMajorSparseMatrix1 = ColumnMajorSparseMatrix.from2DArray(doubleArray0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(matrix0, matrix0, columnMajorSparseMatrix0, columnMajorSparseMatrix1);
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
      int int0 = 2;
      Random.setNextRandom(2);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(2, 2);
      OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new OoPlaceMatricesSubtraction();
      double double0 = (-1.0);
      ooPlaceMatricesSubtraction0.partiallyApply((DenseMatrix) basic1DMatrix0);
      ColumnMajorSparseMatrix.diagonal(2, (-1.0));
      NumberFormat.getCurrencyInstance();
      basic1DMatrix0.toCSV();
      basic1DMatrix0.setAll((-928.152985372322));
      basic1DMatrix0.swapColumns((-1268), (-1268));
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      Basic1DMatrix.fromBinary(byteArray0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.unit(2, (-1268));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = 1;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(1, 1, 2229.769053984534);
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.zero(1, 2509);
      OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new OoPlaceMatricesSubtraction();
      basic1DMatrix1.setAll(322.66277);
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
  public void test29()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(1, 1, 1);
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.zero(2204, 1);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix1, basic1DMatrix1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4410
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }
}