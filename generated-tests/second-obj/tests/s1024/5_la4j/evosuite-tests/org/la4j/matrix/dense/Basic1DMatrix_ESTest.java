/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:05:25 GMT 2018
 */

package org.la4j.matrix.dense;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.MatrixFactory;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.dense.Basic1DMatrix;
import org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix;
import org.la4j.operation.ooplace.OoPlaceMatricesMultiplication;
import org.la4j.operation.ooplace.OoPlaceMatricesSubtraction;
import org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Basic1DMatrix_ESTest extends Basic1DMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 308;
      doubleArray0[1] = (double) 308;
      doubleArray0[2] = (double) 368;
      doubleArray0[3] = (double) 368;
      doubleArray0[4] = (double) 308;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(368, 308, doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.blankOfShape((-1012), 2);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.swapRows((-30), (-30));
      basic1DMatrix0.swapColumns((-294), (-4));
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[1] = (double) 63;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(63, 63, doubleArray0);
      basic1DMatrix0.setAll(63.0);
      assertArrayEquals(new double[] {63.0, 63.0, 63.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      // Undeclared exception!
      try { 
        basic1DMatrix0.get(10, 10);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '10' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
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
  public void test06()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)53;
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
  public void test07()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(7, 7);
      Matrix matrix0 = basic1DMatrix0.copyOfShape(7, 1624);
      assertEquals(1624, matrix0.columns());
      assertEquals(7, matrix0.rows());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[2][4];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
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
  public void test09()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.toArray();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.copyOfShape(557, 0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Basic1DMatrix.randomSymmetric((-688), mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -688x-688
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(4040, 0);
      basic1DMatrix0.swapRows(4, 4040);
      basic1DMatrix0.getRow(4040);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      Basic1DMatrix.randomSymmetric(990, mockRandom0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(16, 16);
      basic1DMatrix0.toBinary();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(15, 15, mockRandom0);
      basic1DMatrix0.toArray();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.toBinary();
      // Undeclared exception!
      try { 
        basic1DMatrix0.set(9970, 9970, 2.0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '9970' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(70);
      basic1DMatrix0.copyOfShape(2082, 1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(543, 84, (double[]) null);
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      SparseVector.zero(757, 757);
      // Undeclared exception!
      try { 
        basic1DMatrix0.copyOfShape(19, 19);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.diagonal(48, 48);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 49
         //
         verifyException("org.la4j.matrix.dense.Basic2DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte byte0 = (byte)0;
      SparseMatrix sparseMatrix0 = SparseMatrix.identity((byte)0);
      DenseMatrix denseMatrix0 = DenseMatrix.diagonal(2, (byte)0);
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      Matrix matrix0 = inPlaceCopyMatrixToMatrix0.applySimple(denseMatrix0, sparseMatrix0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(2, 2);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(denseMatrix0, basic1DMatrix0, denseMatrix0, matrix0);
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
      byte[] byteArray0 = new byte[11];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromBinary(byteArray0);
      SparseMatrix sparseMatrix0 = basic1DMatrix0.toSparseMatrix();
      Basic1DMatrix.block(sparseMatrix0, sparseMatrix0, sparseMatrix0, basic1DMatrix0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.diagonal(48, 48);
      double double0 = 548.7330599;
      DenseMatrix denseMatrix1 = DenseMatrix.diagonal(1, 548.7330599);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(denseMatrix0, denseMatrix1, denseMatrix0, denseMatrix1);
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
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(382, 2254, 2254);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapRows(8, 382);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 861028
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.swapColumns(4, 4);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(2, 2);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapColumns((-2091), 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2091
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte byte0 = (byte)0;
      SparseMatrix sparseMatrix0 = SparseMatrix.identity((byte)0);
      int int0 = 2;
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      int int1 = 16;
      DenseMatrix.diagonal(16, 2);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromCSV("1f");
      basic1DMatrix0.toSparseMatrix();
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(sparseMatrix0, sparseMatrix0, basic1DMatrix0, sparseMatrix0);
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
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      int int0 = 1058;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(1058, 1);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(rowMajorSparseMatrix0, rowMajorSparseMatrix0, rowMajorSparseMatrix0, rowMajorSparseMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4232
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = 2;
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(2, 2);
      basic1DMatrix0.toColumnVector();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.zero((byte)0, 2);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix1, basic1DMatrix1, basic1DMatrix0, basic1DMatrix0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '3' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte)0;
      byteArray0[9] = (byte)0;
      byteArray0[3] = (byte)0;
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.fromBinary(byteArray0);
      SparseMatrix.identity((byte)0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero((int) (byte)0, (int) (byte)0);
      Matrix matrix0 = columnMajorSparseMatrix0.add((double) (byte)0);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero((int) (byte)0, 229);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix1, basic1DMatrix0, matrix0, rowMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }
}