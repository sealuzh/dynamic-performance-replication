/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:36:35 GMT 2018
 */

package org.la4j.matrix.sparse;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferUnderflowException;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.iterator.RowMajorMatrixIterator;
import org.la4j.matrix.MatrixFactory;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.functor.MatrixAccumulator;
import org.la4j.matrix.functor.MatrixFunction;
import org.la4j.matrix.functor.MatrixProcedure;
import org.la4j.matrix.sparse.CRSMatrix;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.SparseVector;
import org.la4j.vector.functor.VectorAccumulator;
import org.la4j.vector.functor.VectorFunction;
import org.la4j.vector.functor.VectorProcedure;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CRSMatrix_ESTest extends CRSMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix();
      MatrixProcedure matrixProcedure0 = mock(MatrixProcedure.class, new ViolatedAssumptionAnswer());
      cRSMatrix0.eachNonZero(matrixProcedure0);
      // Undeclared exception!
      try { 
        cRSMatrix0.removeFirstColumn();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Illegal row number, must be 0..-1
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(513);
      CRSMatrix.randomSymmetric(513, 0.0, (Random) mockRandom0);
      CRSMatrix.fromCSV("T/0K_OK");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)0;
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
      // Undeclared exception!
      try { 
        CRSMatrix.fromMatrixMarket("d");
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
      CRSMatrix cRSMatrix0 = CRSMatrix.identity((byte)35);
      cRSMatrix0.removeFirstColumn();
      MockRandom mockRandom0 = new MockRandom();
      CRSMatrix.fromCSV("");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity((byte)35);
      CRSMatrix cRSMatrix1 = CRSMatrix.zero(13, (int) (byte)35);
      cRSMatrix1.divide(13);
      MatrixProcedure matrixProcedure0 = mock(MatrixProcedure.class, new ViolatedAssumptionAnswer());
      cRSMatrix0.each(matrixProcedure0);
      CRSMatrix.identity((byte)35);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity((byte)35);
      CRSMatrix cRSMatrix1 = new CRSMatrix();
      cRSMatrix0.setAll((byte)35);
      cRSMatrix0.minInRow((byte)35);
      cRSMatrix1.iteratorOfNonZeroRows();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix();
      // Undeclared exception!
      try { 
        cRSMatrix0.blankOfShape((byte)53, (-3542));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: 53x-3542
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix();
      assertEquals(0, cRSMatrix0.cardinality());
      assertEquals(0.0, cRSMatrix0.min(), 0.01);
      assertTrue(cRSMatrix0.isRowMajor());
      assertEquals(0.0, cRSMatrix0.max(), 0.01);
      assertEquals(Double.NaN, cRSMatrix0.density(), 0.01);
      assertEquals(0, cRSMatrix0.columns());
      assertEquals(0, cRSMatrix0.rows());
      assertNotNull(cRSMatrix0);
      
      SparseMatrix sparseMatrix0 = cRSMatrix0.toSparseMatrix();
      assertEquals(0, cRSMatrix0.cardinality());
      assertEquals(0.0, cRSMatrix0.min(), 0.01);
      assertTrue(cRSMatrix0.isRowMajor());
      assertEquals(0.0, cRSMatrix0.max(), 0.01);
      assertEquals(Double.NaN, cRSMatrix0.density(), 0.01);
      assertEquals(0, cRSMatrix0.columns());
      assertEquals(0, cRSMatrix0.rows());
      assertEquals(Double.NaN, sparseMatrix0.density(), 0.01);
      assertEquals(0, sparseMatrix0.cardinality());
      assertEquals(0.0, sparseMatrix0.min(), 0.01);
      assertEquals(0, sparseMatrix0.rows());
      assertEquals(0, sparseMatrix0.columns());
      assertTrue(sparseMatrix0.isRowMajor());
      assertEquals(0.0, sparseMatrix0.max(), 0.01);
      assertNotNull(sparseMatrix0);
      assertSame(cRSMatrix0, sparseMatrix0);
      assertSame(sparseMatrix0, cRSMatrix0);
      
      CRSMatrix cRSMatrix1 = CRSMatrix.fromCSV("");
      assertEquals(0, cRSMatrix1.cardinality());
      assertEquals(0.0, cRSMatrix1.min(), 0.01);
      assertTrue(cRSMatrix1.isRowMajor());
      assertEquals(0, cRSMatrix1.columns());
      assertEquals(Double.NaN, cRSMatrix1.density(), 0.01);
      assertEquals(0.0, cRSMatrix1.max(), 0.01);
      assertEquals(0, cRSMatrix1.rows());
      assertNotNull(cRSMatrix1);
      assertTrue(cRSMatrix1.equals((Object)cRSMatrix0));
      assertTrue(cRSMatrix1.equals((Object)sparseMatrix0));
      assertNotSame(cRSMatrix1, sparseMatrix0);
      assertNotSame(cRSMatrix1, cRSMatrix0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(2609);
      cRSMatrix0.multiplyByItsTranspose();
      String string0 = ";9";
      CRSMatrix.fromCSV(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[4][5];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (-2364.18699);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[4];
      assertFalse(doubleArray2.equals((Object)doubleArray1));
      
      doubleArray2[0] = (-2364.18699);
      doubleArray2[1] = (-2364.18699);
      doubleArray2[2] = (-2364.18699);
      doubleArray2[3] = (-2364.18699);
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[6];
      assertFalse(doubleArray3.equals((Object)doubleArray2));
      assertFalse(doubleArray3.equals((Object)doubleArray1));
      
      doubleArray3[0] = (-2364.18699);
      doubleArray3[1] = (-2364.18699);
      doubleArray3[2] = (-2364.18699);
      doubleArray3[3] = (-2364.18699);
      doubleArray3[4] = (-0.2901214644452077);
      doubleArray3[5] = (-2364.18699);
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[0];
      assertFalse(doubleArray4.equals((Object)doubleArray1));
      assertFalse(doubleArray4.equals((Object)doubleArray3));
      assertFalse(doubleArray4.equals((Object)doubleArray2));
      
      doubleArray0[3] = doubleArray4;
      // Undeclared exception!
      try { 
        CRSMatrix.from2DArray(doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      // Undeclared exception!
      try { 
        CRSMatrix.random(2187, (-1623), (double) 2187, (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The density value should be between 0 and 1.0
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(451L);
      assertNotNull(mockRandom0);
      
      CRSMatrix.randomSymmetric(67, 1.0, (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(2609);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      cRSMatrix0.transformRow(1755, vectorFunction0);
      double[][] doubleArray0 = new double[0][9];
      RowMajorSparseMatrix.from2DArray(doubleArray0);
      cRSMatrix0.multiplyByItsTranspose();
      String string0 = "Can not remove from this iterator.";
      CRSMatrix.fromCSV(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix();
      assertEquals(0, cRSMatrix0.rows());
      assertEquals(0.0, cRSMatrix0.max(), 0.01);
      assertEquals(0, cRSMatrix0.cardinality());
      assertEquals(0.0, cRSMatrix0.min(), 0.01);
      assertEquals(0, cRSMatrix0.columns());
      assertEquals(Double.NaN, cRSMatrix0.density(), 0.01);
      assertTrue(cRSMatrix0.isRowMajor());
      assertNotNull(cRSMatrix0);
      
      Iterator<Integer> iterator0 = cRSMatrix0.iteratorOfNonZeroRows();
      assertEquals(0, cRSMatrix0.rows());
      assertEquals(0.0, cRSMatrix0.max(), 0.01);
      assertEquals(0, cRSMatrix0.cardinality());
      assertEquals(0.0, cRSMatrix0.min(), 0.01);
      assertEquals(0, cRSMatrix0.columns());
      assertEquals(Double.NaN, cRSMatrix0.density(), 0.01);
      assertTrue(cRSMatrix0.isRowMajor());
      assertNotNull(iterator0);
      
      RowMajorMatrixIterator rowMajorMatrixIterator0 = cRSMatrix0.nonZeroRowMajorIterator();
      assertEquals(0, cRSMatrix0.rows());
      assertEquals(0.0, cRSMatrix0.max(), 0.01);
      assertEquals(0, cRSMatrix0.cardinality());
      assertEquals(0.0, cRSMatrix0.min(), 0.01);
      assertEquals(0, cRSMatrix0.columns());
      assertEquals(Double.NaN, cRSMatrix0.density(), 0.01);
      assertTrue(cRSMatrix0.isRowMajor());
      assertNotNull(rowMajorMatrixIterator0);
      
      // Undeclared exception!
      try { 
        cRSMatrix0.getRow((byte)35);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 36
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(369);
      CRSMatrix.fromCSV("");
      cRSMatrix0.setAll(0.0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.zero(32, 32);
      MockRandom mockRandom0 = new MockRandom(32);
      CRSMatrix cRSMatrix1 = new CRSMatrix();
      cRSMatrix1.setAll((-1118.3561));
      // Undeclared exception!
      try { 
        cRSMatrix0.minInRow(32);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 33
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity((byte)32);
      Matrix matrix0 = cRSMatrix0.removeFirstColumn();
      MockRandom mockRandom0 = new MockRandom();
      matrix0.iteratorOfRow((byte)32);
      matrix0.rank();
      CRSMatrix.block(matrix0, cRSMatrix0, matrix0, cRSMatrix0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        CRSMatrix.random(2940, 10, (-1247.98494340854), (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The density value should be between 0 and 1.0
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = 73;
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 73;
      doubleArray0[1] = (double) 73;
      doubleArray0[2] = (double) 73;
      CRSMatrix cRSMatrix0 = CRSMatrix.from1DArray(73, 73, doubleArray0);
      CRSMatrix.block(cRSMatrix0, cRSMatrix0, cRSMatrix0, cRSMatrix0);
      int int1 = 262;
      int int2 = (-1517);
      cRSMatrix0.copyOfShape(int1, int2);
      cRSMatrix0.divide(int0);
      CRSMatrix.identity(int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = 265;
      CRSMatrix cRSMatrix0 = CRSMatrix.diagonal(265, 578.68);
      int int1 = 129;
      int int2 = 260;
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(578.68, Double.NEGATIVE_INFINITY, 1.0, 608.375, 1.0).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      cRSMatrix0.updateRow(260, vectorFunction0);
      int int3 = (-1030);
      CRSMatrix cRSMatrix1 = new CRSMatrix(129, (-1030), 129);
      cRSMatrix1.toString();
      String string0 = "";
      CRSMatrix.fromCSV(string0);
      cRSMatrix1.maxInRow(int3);
      cRSMatrix0.maxInRow(int1);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      SparseVector sparseVector0 = null;
      Matrix matrix0 = ooPlaceOuterProduct0.apply(sparseVector0, sparseVector0);
      int int4 = 10;
      int int5 = (-1801);
      cRSMatrix1.insert(matrix0, int0, int0, int2, int2, int4, int5);
      cRSMatrix1.minInRow(int2);
      cRSMatrix1.blankOfShape(int0, int3);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.zero(8, 32, 32);
      cRSMatrix0.nonZeroRowMajorIterator();
      cRSMatrix0.iteratorOfRow(8);
      cRSMatrix0.rank();
      cRSMatrix0.iteratorOfNonZeroRows();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.zero(2588, 1, 1332);
      CRSMatrix.block(cRSMatrix0, cRSMatrix0, cRSMatrix0, cRSMatrix0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(381L);
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(69);
      cRSMatrix0.toBinary();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[][] doubleArray0 = new double[8][3];
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (-1867.5754);
      CRSMatrix cRSMatrix0 = CRSMatrix.from2DArray(doubleArray0);
      VectorProcedure vectorProcedure0 = mock(VectorProcedure.class, new ViolatedAssumptionAnswer());
      cRSMatrix0.eachNonZeroInColumn(1666, vectorProcedure0);
      cRSMatrix0.divide((-1867.5754));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix(2603, 2603, 2603);
      CRSMatrix.identity(2603);
      cRSMatrix0.maxInRow(169);
      cRSMatrix0.multiplyByItsTranspose();
      CRSMatrix.fromCSV("Can not remove from this iterator.");
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.zero(293, 2);
      int[] intArray0 = new int[1];
      CRSMatrix cRSMatrix1 = (CRSMatrix)cRSMatrix0.select(intArray0, intArray0);
      CRSMatrix cRSMatrix2 = new CRSMatrix();
      cRSMatrix2.min();
      cRSMatrix1.iteratorOfNonZeroRows();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)32;
      byteArray0[1] = (byte)32;
      // Undeclared exception!
      try { 
        CRSMatrix.fromBinary(byteArray0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(2601);
      cRSMatrix0.toSparseMatrix();
      MockRandom mockRandom0 = new MockRandom();
      VectorAccumulator vectorAccumulator0 = mock(VectorAccumulator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vectorAccumulator0).accumulate();
      cRSMatrix0.foldRow(0, vectorAccumulator0);
      CRSMatrix cRSMatrix1 = new CRSMatrix();
      cRSMatrix1.min();
      cRSMatrix0.iteratorOfNonZeroRows();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = 265;
      CRSMatrix cRSMatrix0 = CRSMatrix.diagonal(265, 265);
      int int1 = (-1);
      VectorAccumulator vectorAccumulator0 = mock(VectorAccumulator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(vectorAccumulator0).accumulate();
      cRSMatrix0.foldRows(vectorAccumulator0);
      VectorProcedure vectorProcedure0 = null;
      int int2 = 1791;
      cRSMatrix0.eachNonZeroInColumn(int2, vectorProcedure0);
      cRSMatrix0.divide(int1);
      MatrixProcedure matrixProcedure0 = mock(MatrixProcedure.class, new ViolatedAssumptionAnswer());
      cRSMatrix0.each(matrixProcedure0);
      CRSMatrix.identity(int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix();
      SparseMatrix sparseMatrix0 = cRSMatrix0.toSparseMatrix();
      CRSMatrix.block(sparseMatrix0, sparseMatrix0, cRSMatrix0, sparseMatrix0);
      MockRandom mockRandom0 = new MockRandom();
      CRSMatrix.block(sparseMatrix0, sparseMatrix0, sparseMatrix0, cRSMatrix0);
      ((CRSMatrix) sparseMatrix0).min();
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 585;
      doubleArray0[1] = (double) 4;
      doubleArray0[2] = (double) 585;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 60.0541;
      doubleArray0[5] = 0.0;
      doubleArray0[6] = 0.0;
      CRSMatrix.from1DArray(585, 4, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) (byte)0;
      doubleArray0[1] = (double) (byte)0;
      doubleArray0[2] = (double) (byte)0;
      doubleArray0[3] = (double) (byte)0;
      doubleArray0[4] = (double) (byte)0;
      CRSMatrix cRSMatrix0 = CRSMatrix.from1DArray((byte)0, (byte)0, doubleArray0);
      // Undeclared exception!
      try { 
        cRSMatrix0.removeLastColumn();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Illegal row number, must be 0..-1
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.diagonal(265, 570.6303158810296);
      int int0 = 13;
      CRSMatrix cRSMatrix1 = CRSMatrix.zero(265, 13, 31);
      CRSMatrix.block(cRSMatrix0, cRSMatrix1, cRSMatrix0, cRSMatrix0);
      NumberFormat.getIntegerInstance();
      Locale locale0 = null;
      Locale locale1 = Locale.UK;
      locale1.getDisplayCountry(locale0);
      Locale locale2 = Locale.CHINESE;
      locale1.getDisplayScript(locale2);
      Locale.getISOLanguages();
      int int1 = (-2971);
      int[] intArray0 = new int[1];
      intArray0[0] = int1;
      cRSMatrix1.select(intArray0, intArray0);
      Random random0 = null;
      int int2 = 2328;
      CRSMatrix.random(int2, int0, (double) int1, random0);
      CRSMatrix cRSMatrix2 = CRSMatrix.identity(int2);
      int int3 = 1787;
      int int4 = (-542);
      CRSMatrix cRSMatrix3 = CRSMatrix.zero(intArray0[0], int3, int4);
      cRSMatrix3.iteratorOfNonZeroRows();
      cRSMatrix2.copyOfShape(int2, int1);
      org.evosuite.runtime.Random.setNextRandom(int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.diagonal(271, 271);
      int int0 = (-1);
      VectorAccumulator vectorAccumulator0 = mock(VectorAccumulator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(vectorAccumulator0).accumulate();
      cRSMatrix0.foldNonZeroInColumns(vectorAccumulator0);
      VectorProcedure vectorProcedure0 = null;
      int int1 = 1791;
      cRSMatrix0.eachNonZeroInColumn(int1, vectorProcedure0);
      cRSMatrix0.divide(int0);
      MatrixProcedure matrixProcedure0 = mock(MatrixProcedure.class, new ViolatedAssumptionAnswer());
      int int2 = 1010;
      int int3 = 1580;
      CRSMatrix.zero(int2, int3, int3);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity((byte)32);
      Matrix matrix0 = cRSMatrix0.removeFirstColumn();
      MockRandom mockRandom0 = new MockRandom();
      matrix0.min();
      CRSMatrix.block(cRSMatrix0, matrix0, cRSMatrix0, matrix0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.zero(2724, 2724);
      cRSMatrix0.multiplyByItsTranspose();
      CRSMatrix.fromCSV("");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(2601);
      CRSMatrix cRSMatrix1 = CRSMatrix.identity(2601);
      cRSMatrix0.maxInRow(169);
      CRSMatrix cRSMatrix2 = CRSMatrix.zero(2630, 169, 169);
      CRSMatrix.block(cRSMatrix2, cRSMatrix1, cRSMatrix1, cRSMatrix1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = 32;
      CRSMatrix cRSMatrix0 = CRSMatrix.zero(32, 32, 32);
      Locale.getISOLanguages();
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[6];
      intArray1[0] = 0;
      intArray1[1] = 0;
      intArray1[2] = 32;
      intArray1[3] = 257;
      intArray1[4] = 32;
      intArray1[5] = 1;
      // Undeclared exception!
      try { 
        cRSMatrix0.select(intArray0, intArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No rows or columns selected.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity((byte)35);
      VectorAccumulator vectorAccumulator0 = mock(VectorAccumulator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(vectorAccumulator0).accumulate();
      cRSMatrix0.foldNonZeroInRows(vectorAccumulator0);
      cRSMatrix0.removeFirstColumn();
      cRSMatrix0.set(3084, 3084, 3084);
      String string0 = "";
      CRSMatrix.fromCSV(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      byte byte0 = (byte)35;
      CRSMatrix cRSMatrix0 = CRSMatrix.diagonal(19, (byte)35);
      int int0 = 1346;
      CRSMatrix cRSMatrix1 = CRSMatrix.zero(2589, 4, 2588);
      CRSMatrix cRSMatrix2 = CRSMatrix.block(cRSMatrix1, cRSMatrix1, cRSMatrix0, cRSMatrix0);
      NumberFormat.getIntegerInstance();
      Locale locale0 = null;
      Locale locale1 = Locale.UK;
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = byte0;
      byteArray0[1] = byte0;
      byteArray0[2] = byte0;
      byteArray0[3] = byte0;
      byteArray0[4] = byte0;
      byteArray0[5] = byte0;
      CRSMatrix.fromBinary(byteArray0);
      locale1.getDisplayCountry(locale0);
      int int1 = (-1094);
      cRSMatrix2.iteratorOfRow(int1);
      CRSMatrix cRSMatrix3 = CRSMatrix.identity(int0);
      cRSMatrix3.min();
      int int2 = cRSMatrix1.rank();
      int int3 = 17;
      CRSMatrix.zero(int2, int3, int2);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = 2;
      CRSMatrix.zero(293, 2, 293);
      int[] intArray0 = new int[1];
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(2);
      cRSMatrix0.select(intArray0, intArray0);
      MockRandom mockRandom0 = new MockRandom();
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
  public void test41()  throws Throwable  {
      CRSMatrix cRSMatrix0 = new CRSMatrix();
      SparseMatrix sparseMatrix0 = cRSMatrix0.toSparseMatrix();
      CRSMatrix cRSMatrix1 = CRSMatrix.block(sparseMatrix0, sparseMatrix0, cRSMatrix0, sparseMatrix0);
      MockRandom mockRandom0 = new MockRandom();
      MockRandom mockRandom1 = new MockRandom(0L);
      CRSMatrix cRSMatrix2 = CRSMatrix.random(3989, 3989, (double) 0L, (Random) mockRandom0);
      CRSMatrix cRSMatrix3 = CRSMatrix.identity(199);
      cRSMatrix3.iteratorOfNonZeroRows();
      CRSMatrix.block(cRSMatrix0, sparseMatrix0, cRSMatrix1, cRSMatrix2);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      CRSMatrix cRSMatrix0 = new CRSMatrix(2187, 2187, 2187);
      cRSMatrix0.max();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CRSMatrix.zero(1791, 851);
      MockRandom mockRandom0 = new MockRandom((-1643L));
      CRSMatrix.identity(1791);
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(851);
      cRSMatrix0.max();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int int0 = 1791;
      CRSMatrix cRSMatrix0 = CRSMatrix.diagonal(851, 1791);
      MatrixAccumulator matrixAccumulator0 = mock(MatrixAccumulator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(matrixAccumulator0).accumulate();
      cRSMatrix0.foldNonZero(matrixAccumulator0);
      double[][] doubleArray0 = new double[7][9];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = (double) 1791;
      doubleArray1[2] = 0.0;
      doubleArray1[3] = (double) 1791;
      doubleArray1[4] = (double) 851;
      doubleArray1[5] = 4.0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[2];
      doubleArray2[0] = 0.0;
      doubleArray2[1] = 4.0;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[1];
      doubleArray3[0] = 0.0;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[3];
      doubleArray4[0] = (double) 1791;
      doubleArray4[1] = 4.0;
      doubleArray4[2] = (double) 851;
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[6];
      doubleArray5[0] = 4.0;
      doubleArray5[1] = (double) 851;
      doubleArray5[2] = 0.0;
      doubleArray5[3] = 4.0;
      doubleArray5[4] = 0.0;
      doubleArray5[5] = 4.0;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[1];
      doubleArray6[0] = 0.0;
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[8];
      doubleArray7[0] = 0.0;
      doubleArray7[1] = (double) 851;
      doubleArray7[2] = (double) 851;
      doubleArray7[3] = 4.0;
      doubleArray7[4] = (double) 1791;
      doubleArray7[5] = (double) 1791;
      doubleArray7[6] = 557.0;
      doubleArray7[7] = (double) 1791;
      doubleArray0[6] = doubleArray7;
      SparseMatrix.from2DArray(doubleArray0);
      cRSMatrix0.removeFirstColumn();
      int int1 = 13;
      double double0 = 1024.733431;
      cRSMatrix0.set(int1, int0, double0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      int int0 = 2609;
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(2609);
      MatrixFunction matrixFunction0 = mock(MatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(matrixFunction0).evaluate(anyInt() , anyInt() , anyDouble());
      cRSMatrix0.update(matrixFunction0);
      int int1 = 2708;
      int int2 = (-1211);
      MockRandom mockRandom0 = new MockRandom();
      CRSMatrix.random(int0, int1, (double) int2, (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(2609);
      cRSMatrix0.iteratorOfRow(2609);
      Matrix matrix0 = cRSMatrix0.copyOfShape(1786, 2609);
      MatrixFactory<Matrix> matrixFactory0 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
      doReturn(matrix0).when(matrixFactory0).apply(anyInt() , anyInt());
      cRSMatrix0.to(matrixFactory0);
      int int0 = 3141;
      cRSMatrix0.minInRow(int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      int int0 = 2601;
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(2601);
      CRSMatrix cRSMatrix1 = CRSMatrix.identity(2601);
      cRSMatrix0.maxInRow(169);
      MatrixFunction matrixFunction0 = mock(MatrixFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)2601, 1.0, 1391.6518615310679, (double)169, (double)169).when(matrixFunction0).evaluate(anyInt() , anyInt() , anyDouble());
      cRSMatrix1.update(matrixFunction0);
      int int1 = 2708;
      int int2 = (-1211);
      MockRandom mockRandom0 = new MockRandom();
      CRSMatrix.random(int1, int2, (double) int0, (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CRSMatrix.identity(2601);
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(2601);
      Matrix matrix0 = cRSMatrix0.copyOfShape(2601, 169);
      CRSMatrix cRSMatrix1 = new CRSMatrix(2601, 2601, 169);
      cRSMatrix1.toDenseMatrix();
      matrix0.divide(169);
      cRSMatrix1.multiplyByItsTranspose();
      String string0 = "[^1A(zj5(@";
      CRSMatrix.fromCSV(string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MatrixProcedure matrixProcedure0 = mock(MatrixProcedure.class, new ViolatedAssumptionAnswer());
      CRSMatrix cRSMatrix0 = CRSMatrix.identity(1791);
      cRSMatrix0.minInRow(2);
      cRSMatrix0.iteratorOfNonZeroRows();
      cRSMatrix0.min();
      cRSMatrix0.iteratorOfNonZeroRows();
  }
}