/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 23:26:33 GMT 2018
 */

package org.la4j.matrix.dense;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.MatrixFactory;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.dense.Basic1DMatrix;
import org.la4j.matrix.functor.MatrixPredicate;
import org.la4j.vector.DenseVector;
import org.la4j.vector.functor.VectorAccumulator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Basic1DMatrix_ESTest extends Basic1DMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(0, 0, mockRandom0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
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
  public void test01()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix.random(5, 515, mockRandom0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-11);
      byteArray0[1] = (byte)25;
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
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(1, mockRandom0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.getRow((-3071));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromMatrixMarket("Sides of blocks are incompatible!");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong input file format: can not read header '%%MatrixMarket'.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(339, 339, 339);
      // Undeclared exception!
      try { 
        basic1DMatrix0.get(339, 339);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '339' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Vector vector0 = basic1DMatrix0.getRow(1040);
      assertEquals(0, vector0.length());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(0, 0, mockRandom0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
      basic1DMatrix0.toArray();
      assertEquals(0, basic1DMatrix0.rows());
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[2][0];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-2459.4619388);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[2];
      doubleArray2[0] = (-2459.4619388);
      doubleArray2[1] = (-2459.4619388);
      doubleArray0[1] = doubleArray2;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      basic1DMatrix0.toArray();
      assertEquals(1, basic1DMatrix0.columns());
      assertEquals(2, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix.random(17, 17, mockRandom0);
      MatrixFactory<Basic1DMatrix> matrixFactory0 = (MatrixFactory<Basic1DMatrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromCSV("");
      VectorAccumulator vectorAccumulator0 = mock(VectorAccumulator.class, new ViolatedAssumptionAnswer());
      basic1DMatrix0.foldRows(vectorAccumulator0);
      Matrix matrix0 = basic1DMatrix0.shuffle();
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      assertTrue(basic1DMatrix0.equals((Object)matrix0));
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(2413, 8);
      basic1DMatrix0.copyOfColumns(8);
      // Undeclared exception!
      basic1DMatrix0.toBinary();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(356, 356);
      // Undeclared exception!
      try { 
        basic1DMatrix0.set(784, 1365, 1365);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '784' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 9;
      doubleArray0[2] = (double) 9;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(9, 293, doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.blankOfShape(137, (-856));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(1310, 48, 48);
      basic1DMatrix0.copyOfShape(48, 1310);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(0, 183);
      DenseMatrix denseMatrix0 = DenseMatrix.diagonal(183, 0.0);
      basic1DMatrix0.toColumnVector();
      basic1DMatrix0.maxInColumn(0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, denseMatrix0, basic1DMatrix0, denseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(0, 517, mockRandom0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
      basic1DMatrix0.setAll(0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(5, 517, mockRandom0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 518
         //
         verifyException("org.la4j.matrix.dense.Basic2DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(37, mockRandom0);
      MockRandom mockRandom1 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(37, 1, mockRandom0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, denseMatrix0, denseMatrix0, basic1DMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(522, 1048);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapColumns(1048, 11);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 547056
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(0, 1095);
      basic1DMatrix0.swapColumns(1453, 2495);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (double) 1132;
      doubleArray0[2] = (double) 1132;
      doubleArray0[3] = (double) 1132;
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.nextDouble();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(480, 1.0);
      basic1DMatrix0.copyOfShape(0, 460);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Matrix.identity(2573);
      DenseMatrix.diagonal(3190, 3190);
      basic1DMatrix0.copyOfRows(1618);
      MatrixFactory<Matrix> matrixFactory0 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.nextDouble();
      DenseMatrix denseMatrix0 = DenseMatrix.random(1, 1, mockRandom0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-38);
      byteArray0[1] = (byte)1;
      basic1DMatrix0.swapColumns(9, 9);
      // Undeclared exception!
      try { 
        basic1DMatrix0.get((byte)25, 8);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '25' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(0, 0, mockRandom0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
      MatrixFactory<Matrix> matrixFactory0 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
      basic1DMatrix0.slice(0, 0, 0, 0);
      basic1DMatrix0.swapRows(9955, 9955);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(1, 1, mockRandom0);
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapRows(1, 1132);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2264
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.nextDouble();
      DenseMatrix denseMatrix0 = DenseMatrix.random(1, 496, mockRandom0);
      int int0 = 1635;
      double[][] doubleArray0 = new double[3][5];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = (double) 1;
      doubleArray1[2] = 0.0;
      doubleArray1[3] = 0.0;
      doubleArray1[4] = 2133.9517840256;
      int int1 = 1216;
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(2117, 2130);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(sparseMatrix0, sparseMatrix0, sparseMatrix0, denseMatrix0);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[8] = (byte)0;
      byteArray0[2] = (byte)0;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromBinary(byteArray0);
      int int0 = 1000;
      basic1DMatrix0.swapRows(1000, 6719);
      long long0 = 0L;
      MockRandom mockRandom0 = new MockRandom(0L);
      MockRandom mockRandom1 = new MockRandom();
      mockRandom0.nextDouble();
      // Undeclared exception!
      try { 
        mockRandom1.longs((long) (-777), (long) (byte)0, (-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // size must be non-negative
         //
         verifyException("java.util.Random", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.nextDouble();
      int int0 = 1;
      DenseMatrix denseMatrix0 = DenseMatrix.random(1, 1, mockRandom0);
      DenseMatrix.random(1, 1, mockRandom0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      DenseVector denseVector0 = DenseVector.fromCollection(linkedList0);
      Matrix matrix0 = denseVector0.toRowMatrix();
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(denseMatrix0, matrix0, denseMatrix0, denseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(6);
      mockRandom0.setSeed((-1737L));
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(6, mockRandom0);
      basic1DMatrix0.copyOfShape(9, 9);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(37);
      basic1DMatrix0.iteratorOfColumn((-12));
      MatrixPredicate matrixPredicate0 = mock(MatrixPredicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(matrixPredicate0).test(anyInt() , anyInt());
      basic1DMatrix0.is(matrixPredicate0);
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 1627;
      doubleArray0[1] = (-1.0);
      doubleArray0[2] = (double) 3523;
      Basic1DMatrix.from1DArray(1627, 3523, doubleArray0);
      Basic1DMatrix.fromBinary(byteArray0);
      Basic1DMatrix.zero(1368, 37);
  }
}
