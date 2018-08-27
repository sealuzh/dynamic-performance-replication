/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 19:09:31 GMT 2018
 */

package org.la4j.matrix.sparse;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.Random;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.MatrixFactory;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.functor.MatrixAccumulator;
import org.la4j.matrix.functor.MatrixFunction;
import org.la4j.matrix.functor.MatrixPredicate;
import org.la4j.matrix.sparse.CRSMatrix;
import org.la4j.operation.inplace.InPlaceCopyMatrixToMatrix;
import org.la4j.operation.ooplace.OoPlaceMatricesSubtraction;
import org.la4j.vector.DenseVector;
import org.la4j.vector.functor.VectorAccumulator;
import org.la4j.vector.functor.VectorFunction;
import org.la4j.vector.functor.VectorProcedure;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CRSMatrix_ESTest extends CRSMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(133L);
      // Undeclared exception!
      try { 
        CRSMatrix.random(255, 255, (-1128.6027417533), (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The density value should be between 0 and 1.0
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.zero(37, 37, 37);
      cRSMatrix0.diagonalProduct();
      cRSMatrix0.subtract((double) 37);
      cRSMatrix0.eachNonZeroInRow(3, (VectorProcedure) null);
      assertEquals(37, cRSMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        CRSMatrix.fromBinary(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can not decode CRSMatrix from the given byte array.
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        CRSMatrix.random(4, 4, 4562.1737632, (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The density value should be between 0 and 1.0
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity((byte)72);
      cRSMatrix0.isColumnMajor();
      cRSMatrix0.removeLastRow();
      cRSMatrix0.setAll(2161.0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CRSMatrix.identity((byte)72);
      CRSMatrix cRSMatrix0 = new CRSMatrix();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)37;
      org.evosuite.runtime.Random.setNextRandom((byte)37);
      cRSMatrix0.setAll((byte)37);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(17);
      MatrixAccumulator matrixAccumulator0 = mock(MatrixAccumulator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(matrixAccumulator0).accumulate();
      cRSMatrix0.foldNonZero(matrixAccumulator0);
      cRSMatrix0.add(0.0);
      cRSMatrix0.iteratorOfNonZeroRows();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix();
      // Undeclared exception!
      try { 
        CRSMatrix.fromCSV((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.diagonal(49, 309.2);
      cRSMatrix0.getColumn(49);
      CRSMatrix.fromCSV("");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix();
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        cRSMatrix0.transformRow((-1680), vectorFunction0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1680
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix$5", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[8][1];
      CRSMatrix cRSMatrix0 = CRSMatrix.from2DArray(doubleArray0);
      cRSMatrix0.iteratorOfNonZeroRows();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 37;
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(37);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 2;
      doubleArray0[1] = (double) 2;
      double[][] doubleArray1 = new double[19][9];
      doubleArray1[0] = doubleArray0;
      CRSMatrix.from2DArray(doubleArray1);
      cRSMatrix0.minInRow(905);
      org.evosuite.runtime.Random.setNextRandom(int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      CRSMatrix cRSMatrix0 = CRSMatrix.randomSymmetric(0, 0.9, (Random) mockRandom0);
      MatrixFactory<Matrix> matrixFactory0 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
      doReturn((Matrix) null).when(matrixFactory0).apply(anyInt() , anyInt());
      // Undeclared exception!
      try { 
        cRSMatrix0.to(matrixFactory0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.RowMajorSparseMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        CRSMatrix.fromMatrixMarket("&]=R4;Q1$C*Q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong input file format: can not read header '%%MatrixMarket'.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(3);
      cRSMatrix0.setAll(0.0);
      Matrix.identity(3);
      // Undeclared exception!
      try { 
        cRSMatrix0.equals((Matrix) null, 1950.767963654874);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix(27, 27, 27);
      CRSMatrix cRSMatrix1 = CRSMatrix.zero(27, 27);
      // Undeclared exception!
      try { 
        CRSMatrix.block(cRSMatrix1, cRSMatrix1, cRSMatrix0, cRSMatrix0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '28' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(15);
      Matrix matrix0 = cRSMatrix0.multiplyByItsTranspose();
      matrix0.manhattanNorm();
      matrix0.removeFirstColumn();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix(15, 15, 15);
      // Undeclared exception!
      try { 
        cRSMatrix0.setRow(15, (double) 15);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix$5", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(37);
      cRSMatrix0.mkString((String) null, "%%MatrixMarket vector coordinate real\n");
      VectorProcedure vectorProcedure0 = mock(VectorProcedure.class, new ViolatedAssumptionAnswer());
      cRSMatrix0.eachInRow(14, vectorProcedure0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(15);
      cRSMatrix0.getColumn(0);
      // Undeclared exception!
      try { 
        CRSMatrix.block(cRSMatrix0, cRSMatrix0, cRSMatrix0, cRSMatrix0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '16' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(37);
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = (double) 458;
      doubleArray0[2] = (double) 458;
      doubleArray0[3] = (double) 458;
      int[] intArray0 = new int[5];
      doubleArray0[5] = (double) 6;
      intArray0[2] = 37;
      intArray0[3] = 37;
      intArray0[4] = 37;
      CRSMatrix cRSMatrix1 = new CRSMatrix(458, 37, 37, doubleArray0, intArray0, intArray0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      cRSMatrix1.forEach(consumer0);
      VectorProcedure vectorProcedure0 = mock(VectorProcedure.class, new ViolatedAssumptionAnswer());
      double[][] doubleArrayArray0 = null;
      CRSMatrix.from2DArray(doubleArrayArray0);
      cRSMatrix0.minInRow(intArray0[2]);
      org.evosuite.runtime.Random.setNextRandom(intArray0[3]);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix();
      int int0 = 6;
      int[] intArray0 = new int[0];
      CRSMatrix cRSMatrix1 = new CRSMatrix(6, 6, 6, (double[]) null, intArray0, intArray0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        cRSMatrix1.forEach(consumer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix$2", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(37);
      cRSMatrix0.diagonalProduct();
      MatrixAccumulator matrixAccumulator0 = mock(MatrixAccumulator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(matrixAccumulator0).accumulate();
      cRSMatrix0.fold(matrixAccumulator0);
      MatrixPredicate matrixPredicate0 = mock(MatrixPredicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(matrixPredicate0).test(anyInt() , anyInt());
      cRSMatrix0.non(matrixPredicate0);
      cRSMatrix0.add(Double.POSITIVE_INFINITY);
      VectorProcedure vectorProcedure0 = mock(VectorProcedure.class, new ViolatedAssumptionAnswer());
      cRSMatrix0.eachNonZeroInRow(8, vectorProcedure0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix(8, 8);
      MatrixFactory<Matrix> matrixFactory0 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
      DenseMatrix.constant(8, 8, (-76.3278078694988));
      VectorProcedure vectorProcedure0 = mock(VectorProcedure.class, new ViolatedAssumptionAnswer());
      cRSMatrix0.eachInRow(0, vectorProcedure0);
      cRSMatrix0.toBinary();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix(1581, 10);
      cRSMatrix0.toRowMajorSparseMatrix();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      cRSMatrix0.spliterator();
      DenseVector.fromCollection(linkedList0);
      CRSMatrix cRSMatrix1 = CRSMatrix.identity(10);
      cRSMatrix0.toBinary();
      cRSMatrix1.iteratorOfRow(3);
      cRSMatrix0.min();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(37);
      cRSMatrix0.diagonalProduct();
      Matrix matrix0 = cRSMatrix0.multiplyByItsTranspose();
      matrix0.toBinary();
      matrix0.getColumn(5566);
      Matrix matrix1 = cRSMatrix0.copyOfRows(32);
      matrix0.maxInRow(958);
      CRSMatrix.block(cRSMatrix0, cRSMatrix0, matrix0, matrix1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 168;
      doubleArray0[2] = (double) 168;
      doubleArray0[3] = (double) 43;
      CRSMatrix.from1DArray(43, 168, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix(37, 37, 37);
      CRSMatrix cRSMatrix1 = CRSMatrix.identity(37);
      cRSMatrix1.minInColumn(8);
      CRSMatrix cRSMatrix2 = CRSMatrix.diagonal(48, 48);
      cRSMatrix2.min();
      int[] intArray0 = new int[0];
      cRSMatrix0.select(intArray0, intArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix();
      MockRandom mockRandom0 = new MockRandom(0L);
      CRSMatrix.randomSymmetric(0, (double) 0, (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[][] doubleArray0 = new double[2][0];
      CRSMatrix cRSMatrix0 = CRSMatrix.from2DArray(doubleArray0);
      cRSMatrix0.minInRow(0);
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      CRSMatrix.block(cRSMatrix0, sparseMatrix0, sparseMatrix0, sparseMatrix0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(37, 37);
      int int0 = (-1778);
      OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new OoPlaceMatricesSubtraction();
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) (-1778);
      doubleArray0[1] = (double) 37;
      doubleArray0[2] = (double) (-1778);
      doubleArray0[3] = (double) 37;
      doubleArray0[4] = (double) (-1778);
      doubleArray0[5] = (double) 37;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(1, 1, doubleArray0);
      Matrix matrix0 = ooPlaceMatricesSubtraction0.apply(rowMajorSparseMatrix0, columnMajorSparseMatrix0);
      // Undeclared exception!
      try { 
        CRSMatrix.block(columnMajorSparseMatrix0, matrix0, matrix0, columnMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix(8, 8);
      MatrixFactory<Matrix> matrixFactory0 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
      doReturn(cRSMatrix0).when(matrixFactory0).apply(anyInt() , anyInt());
      CRSMatrix cRSMatrix1 = (CRSMatrix)cRSMatrix0.to(matrixFactory0);
      cRSMatrix1.nonZeroRowMajorIterator();
      CRSMatrix cRSMatrix2 = new CRSMatrix(8, 8);
      cRSMatrix0.maxInRow(4);
      cRSMatrix0.getColumn(8);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix(2180, 2180);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      cRSMatrix0.multiplyByItsTranspose();
      cRSMatrix0.eachNonZeroInRow((-586), (VectorProcedure) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = 134;
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.nextLong();
      CRSMatrix cRSMatrix0 = CRSMatrix.randomSymmetric(134, 1.0, (Random) mockRandom0);
      MatrixFactory<Matrix> matrixFactory0 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
      cRSMatrix0.add((double) int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix(8, 32);
      CRSMatrix cRSMatrix1 = CRSMatrix.identity(25);
      MatrixFunction matrixFunction0 = mock(MatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(matrixFunction0).evaluate(anyInt() , anyInt() , anyDouble());
      cRSMatrix1.updateAt(8, (-230), matrixFunction0);
      // Undeclared exception!
      try { 
        DenseMatrix.constant(25, (-230), 32);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic2DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = 37;
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(37);
      cRSMatrix0.diagonalProduct();
      int int1 = 7;
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      cRSMatrix0.transformRow(7, vectorFunction0);
      MockRandom mockRandom0 = new MockRandom();
      SparseMatrix.random(7, 37, 1.0, (Random) mockRandom0);
      MockRandom mockRandom1 = new MockRandom();
      int int2 = (-726);
      cRSMatrix0.getRow((-726));
      cRSMatrix0.iteratorOfRow(int0);
      CRSMatrix.diagonal(int1, int2);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(0);
      cRSMatrix0.diagonalProduct();
      double double0 = 696.8;
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      cRSMatrix0.transformRow(0, vectorFunction0);
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        SparseMatrix.random(0, 0, (double) 0, (Random) mockRandom0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(37);
      cRSMatrix0.sum();
      cRSMatrix0.copyOfRows(3);
      cRSMatrix0.toRowVector();
      cRSMatrix0.getOrElse(2459, 2459, 2459);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = 37;
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(37);
      cRSMatrix0.add(0.0);
      cRSMatrix0.setRow(13, (double) 168);
      cRSMatrix0.min();
      CRSMatrix.from2DArray((double[][]) null);
      int int1 = 18;
      cRSMatrix0.minInRow(int1);
      org.evosuite.runtime.Random.setNextRandom(int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(15);
      VectorAccumulator vectorAccumulator0 = mock(VectorAccumulator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(vectorAccumulator0).accumulate();
      cRSMatrix0.foldColumns(vectorAccumulator0);
      cRSMatrix0.nonZeroIterator();
      cRSMatrix0.mkString("2|", "");
      cRSMatrix0.setAll((-175.0));
      cRSMatrix0.getColumn(899);
      // Undeclared exception!
      try { 
        CRSMatrix.block(cRSMatrix0, cRSMatrix0, cRSMatrix0, cRSMatrix0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '16' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity((byte)72);
      Matrix matrix0 = cRSMatrix0.removeLastRow();
      Matrix matrix1 = matrix0.copy();
      CRSMatrix.diagonal((byte)72, (byte)72);
      int[] intArray0 = new int[4];
      intArray0[0] = 2;
      intArray0[1] = (int) (byte)72;
      intArray0[2] = (int) (byte)72;
      intArray0[3] = (int) (byte)72;
      matrix1.select(intArray0, intArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix(8, 32);
      CRSMatrix.identity(25);
      MatrixFunction matrixFunction0 = mock(MatrixFunction.class, new ViolatedAssumptionAnswer());
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        cRSMatrix0.select(intArray0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rows or columns selected.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[][] doubleArray0 = new double[2][0];
      CRSMatrix cRSMatrix0 = CRSMatrix.from2DArray(doubleArray0);
      cRSMatrix0.minInRow(0);
      CRSMatrix cRSMatrix1 = new CRSMatrix(0, 0);
      // Undeclared exception!
      try { 
        CRSMatrix.block(cRSMatrix0, cRSMatrix1, cRSMatrix1, cRSMatrix1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(37);
      cRSMatrix0.diagonalProduct();
      Matrix matrix0 = cRSMatrix0.multiplyByItsTranspose();
      matrix0.getColumn(5566);
      Matrix matrix1 = cRSMatrix0.copyOfRows(32);
      CRSMatrix.block(cRSMatrix0, cRSMatrix0, matrix0, matrix1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix();
      cRSMatrix0.max();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(15);
      Matrix matrix0 = cRSMatrix0.multiplyByItsTranspose();
      matrix0.removeFirstColumn();
      matrix0.getColumn(0);
      matrix0.max();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix(37, 37, 37);
      cRSMatrix0.toColumnMajorSparseMatrix();
      cRSMatrix0.copyOfShape(2, 270);
      cRSMatrix0.isZeroAt(32, 270);
      cRSMatrix0.toColumnVector();
      // Undeclared exception!
      try { 
        CRSMatrix.block(cRSMatrix0, cRSMatrix0, cRSMatrix0, cRSMatrix0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '38' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(37);
      cRSMatrix0.diagonalProduct();
      int int0 = 25;
      cRSMatrix0.determinant();
      int int1 = 26;
      CRSMatrix cRSMatrix1 = CRSMatrix.identity(int1);
      int int2 = (-230);
      int int3 = 4;
      MatrixFunction matrixFunction0 = mock(MatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)int1).when(matrixFunction0).evaluate(anyInt() , anyInt() , anyDouble());
      cRSMatrix1.updateAt(int0, int3, matrixFunction0);
      int int4 = 8;
      double double0 = 2145.556693851;
      DenseMatrix denseMatrix0 = DenseMatrix.constant(int4, int2, double0);
      MatrixFactory<Matrix> matrixFactory0 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
      denseMatrix0.to(matrixFactory0);
      int int5 = 10;
      SparseMatrix.zero(int5, int1);
      denseMatrix0.removeFirstRow();
      CRSMatrix.block(cRSMatrix0, cRSMatrix1, denseMatrix0, cRSMatrix1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(37);
      cRSMatrix0.diagonalProduct();
      CRSMatrix cRSMatrix1 = CRSMatrix.identity(1562);
      MatrixFunction matrixFunction0 = mock(MatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(matrixFunction0).evaluate(anyInt() , anyInt() , anyDouble());
      cRSMatrix0.updateAt(4, 4, matrixFunction0);
      DenseMatrix denseMatrix0 = DenseMatrix.constant(8, 26, 8);
      MatrixFactory<Matrix> matrixFactory0 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
      doReturn((Matrix) null).when(matrixFactory0).apply(anyInt() , anyInt());
      Matrix matrix0 = denseMatrix0.to(matrixFactory0);
      int int0 = 10;
      int int1 = 1658;
      SparseMatrix.zero(int0, int1);
      Matrix matrix1 = denseMatrix0.removeFirstRow();
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      Matrix matrix2 = inPlaceCopyMatrixToMatrix0.applySimple((SparseMatrix) cRSMatrix1, (SparseMatrix) cRSMatrix0);
      CRSMatrix.block(matrix1, matrix2, cRSMatrix0, matrix0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity((byte)72);
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      Matrix matrix0 = inPlaceCopyMatrixToMatrix0.applySimple((SparseMatrix) cRSMatrix0, (SparseMatrix) cRSMatrix0);
      cRSMatrix0.multiply(matrix0);
      Matrix matrix1 = cRSMatrix0.removeLastRow();
      matrix1.copy();
      CRSMatrix.diagonal((byte)72, (byte)72);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)48;
      byteArray0[1] = (byte)82;
      byteArray0[2] = (byte)0;
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (double) (byte)82;
      doubleArray1[1] = (double) (byte)82;
      doubleArray1[2] = 1379.39653208186;
      doubleArray1[3] = (double) (byte)82;
      doubleArray1[4] = (double) (byte)82;
      doubleArray1[5] = (double) (byte)82;
      doubleArray0[0] = doubleArray1;
      CRSMatrix cRSMatrix0 = CRSMatrix.from2DArray(doubleArray0);
      cRSMatrix0.minInRow((byte)0);
      org.evosuite.runtime.Random.setNextRandom((byte)48);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix(17, 17);
      cRSMatrix0.multiply((-1572.5420705919514));
      cRSMatrix0.iteratorOfRow(17);
      cRSMatrix0.manhattanNorm();
      int[] intArray0 = new int[8];
      intArray0[0] = 17;
      intArray0[1] = 32;
      intArray0[2] = 17;
      intArray0[3] = 17;
      intArray0[4] = 17;
      CRSMatrix cRSMatrix1 = CRSMatrix.diagonal(17, (-3697.858786));
      cRSMatrix1.min();
      int int0 = 1332;
      // Undeclared exception!
      try { 
        CRSMatrix.zero(2, 1332, (-286));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cardinality should be positive: -286.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(17);
      cRSMatrix0.diagonalProduct();
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      CRSMatrix cRSMatrix1 = new CRSMatrix(14, 17);
      CRSMatrix cRSMatrix2 = CRSMatrix.diagonal(55, 1.0);
      cRSMatrix1.min();
      int[] intArray0 = new int[1];
      intArray0[0] = 14;
      cRSMatrix2.select(intArray0, intArray0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(0, 102);
      CRSMatrix cRSMatrix0 = CRSMatrix.block(columnMajorSparseMatrix0, columnMajorSparseMatrix0, columnMajorSparseMatrix0, columnMajorSparseMatrix0);
      // Undeclared exception!
      try { 
        CRSMatrix.block(columnMajorSparseMatrix0, cRSMatrix0, cRSMatrix0, columnMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(61);
      cRSMatrix0.diagonalProduct();
      int int0 = 270;
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(270, 61, 61);
      int int1 = 4;
      Matrix matrix0 = cRSMatrix0.copyOfShape(270, 4);
      int int2 = 6;
      cRSMatrix0.isZeroAt(int0, int2);
      cRSMatrix0.toColumnVector();
      String string0 = "o";
      Matrix matrix1 = Matrix.fromMatrixMarket(string0);
      CRSMatrix cRSMatrix1 = CRSMatrix.block(cRSMatrix0, matrix0, columnMajorSparseMatrix0, matrix1);
      int int3 = 2234;
      double double0 = 773.0;
      matrix1.set(int1, int3, double0);
      CRSMatrix.block(cRSMatrix0, columnMajorSparseMatrix0, matrix1, matrix0);
      cRSMatrix1.getRow(int1);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(17);
      cRSMatrix0.diagonalProduct();
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      CRSMatrix cRSMatrix1 = new CRSMatrix(14, 17);
      cRSMatrix0.minInColumn(8);
      CRSMatrix cRSMatrix2 = CRSMatrix.diagonal(55, 0.9586157370844512);
      cRSMatrix1.min();
      int[] intArray0 = new int[8];
      intArray0[0] = 17;
      cRSMatrix2.select(intArray0, intArray0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(0, 102);
      CRSMatrix cRSMatrix0 = CRSMatrix.block(columnMajorSparseMatrix0, columnMajorSparseMatrix0, columnMajorSparseMatrix0, columnMajorSparseMatrix0);
      Matrix matrix0 = cRSMatrix0.add((double) 0);
      // Undeclared exception!
      try { 
        CRSMatrix.block(cRSMatrix0, matrix0, cRSMatrix0, cRSMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Sides of blocks are incompatible!
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity((byte)72);
      InPlaceCopyMatrixToMatrix inPlaceCopyMatrixToMatrix0 = new InPlaceCopyMatrixToMatrix();
      VectorAccumulator vectorAccumulator0 = mock(VectorAccumulator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(vectorAccumulator0).accumulate();
      cRSMatrix0.manhattanNorm();
      cRSMatrix0.foldNonZeroInColumns(vectorAccumulator0);
      cRSMatrix0.removeFirstColumn();
  }
}