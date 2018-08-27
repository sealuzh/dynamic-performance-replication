/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 07:40:55 GMT 2018
 */

package org.la4j.matrix.dense;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.LinearAlgebra;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.MatrixFactory;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.dense.Basic1DMatrix;
import org.la4j.operation.MatrixMatrixOperation;
import org.la4j.operation.ooplace.OoPlaceMatricesAddition;
import org.la4j.operation.ooplace.OoPlaceVectorsSubtraction;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;
import org.la4j.vector.functor.VectorAccumulator;
import org.la4j.vector.functor.VectorFunction;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Basic1DMatrix_ESTest extends Basic1DMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      VectorAccumulator vectorAccumulator0 = mock(VectorAccumulator.class, new ViolatedAssumptionAnswer());
      basic1DMatrix0.foldRows(vectorAccumulator0);
      basic1DMatrix0.swapColumns((-763), 1054);
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(5, 5);
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
  public void test02()  throws Throwable  {
      String string0 = "hxTc8 ]m>";
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromCSV("hxTc8 ]m>");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      byte[] byteArray0 = basic1DMatrix0.toBinary();
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      
      basic1DMatrix0.setAll(1972.6856);
      basic1DMatrix0.toArray();
      assertEquals(1, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromCSV("");
      basic1DMatrix0.setAll(0.0);
      assertEquals(0, basic1DMatrix0.rows());
      
      basic1DMatrix0.swapColumns((-1), (-798));
      assertEquals(0, basic1DMatrix0.columns());
      
      double[][] doubleArray0 = new double[9][8];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (double) (-798);
      doubleArray1[1] = (double) (-1);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[8];
      doubleArray2[0] = (double) (-798);
      doubleArray2[1] = (double) (-1);
      doubleArray2[2] = (double) (-798);
      doubleArray2[3] = (double) (-798);
      doubleArray2[4] = 0.0;
      doubleArray2[5] = (double) (-1);
      doubleArray2[6] = (double) (-1);
      doubleArray2[7] = 0.0;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[3];
      doubleArray3[0] = 0.0;
      doubleArray3[1] = 0.0;
      doubleArray3[2] = (double) (-1);
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[4];
      doubleArray4[0] = 0.0;
      doubleArray4[1] = (-505.15340917);
      doubleArray4[2] = (double) (-798);
      doubleArray4[3] = (double) (-1);
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[3];
      doubleArray5[0] = (double) (-1);
      doubleArray5[1] = (double) (-1);
      doubleArray5[2] = 0.0;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[8];
      doubleArray6[0] = 1968.5858146478606;
      doubleArray6[1] = (double) (-798);
      doubleArray6[2] = 0.0;
      doubleArray6[3] = (double) (-798);
      doubleArray6[4] = (double) (-1);
      doubleArray6[5] = (double) (-1);
      doubleArray6[6] = (-505.15340917);
      doubleArray6[7] = 0.0;
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[4];
      doubleArray7[0] = (-505.15340917);
      doubleArray7[1] = (double) (-1);
      doubleArray7[2] = 1968.5858146478606;
      doubleArray7[3] = (double) (-1);
      doubleArray0[6] = doubleArray7;
      double[] doubleArray8 = new double[4];
      doubleArray8[0] = (-40.929335610397);
      doubleArray8[1] = 0.0;
      doubleArray8[2] = 0.0;
      doubleArray8[3] = (double) (-798);
      doubleArray0[7] = doubleArray8;
      double[] doubleArray9 = new double[5];
      doubleArray9[0] = 1968.5858146478606;
      doubleArray9[1] = (-40.929335610397);
      doubleArray9[2] = 0.0;
      doubleArray9[3] = (-40.929335610397);
      doubleArray9[4] = (double) (-1);
      doubleArray0[8] = doubleArray9;
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.from2DArray(doubleArray0);
      assertEquals(2, basic1DMatrix1.columns());
      assertEquals(9, basic1DMatrix1.rows());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 566;
      doubleArray0[2] = (double) 566;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(566, 0, doubleArray0);
      basic1DMatrix0.rowMajorIterator();
      basic1DMatrix0.blankOfShape(0, 4163);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapColumns(0, 4163);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4163
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = 946;
      int int1 = 9;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(946, 9);
      int int2 = 0;
      basic1DMatrix0.copyOfRows(0);
      int int3 = (-1);
      basic1DMatrix0.sliceBottomRight(0, (-1));
      int int4 = 1349;
      basic1DMatrix0.blankOfShape(int4, int1);
      double double0 = Double.NEGATIVE_INFINITY;
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.diagonal(int4, double0);
      double[][] doubleArray0 = new double[7][1];
      double[] doubleArray1 = new double[9];
      double double1 = 211.68017374674935;
      doubleArray1[0] = double1;
      doubleArray1[1] = (double) int4;
      doubleArray1[2] = (double) int2;
      doubleArray1[3] = (double) int0;
      doubleArray1[4] = (double) int4;
      doubleArray1[5] = double0;
      doubleArray1[6] = (double) int1;
      doubleArray1[7] = (double) int2;
      doubleArray1[8] = (double) int2;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[2];
      double double2 = 1891.11;
      doubleArray2[0] = double2;
      doubleArray2[1] = (double) int1;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[9];
      doubleArray3[0] = (double) int0;
      doubleArray3[1] = (double) int1;
      doubleArray3[2] = double2;
      doubleArray3[3] = (double) int0;
      doubleArray3[4] = double2;
      doubleArray3[5] = double1;
      doubleArray3[6] = (double) int2;
      double double3 = 1.0;
      doubleArray3[7] = double3;
      doubleArray3[8] = (double) int0;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[5];
      doubleArray4[0] = (double) int3;
      doubleArray4[1] = (double) int0;
      doubleArray4[2] = (double) int2;
      doubleArray4[3] = double1;
      doubleArray4[4] = double1;
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[5];
      doubleArray5[0] = (double) int3;
      double double4 = 0.0;
      doubleArray5[1] = double4;
      doubleArray5[2] = double0;
      doubleArray5[3] = double0;
      doubleArray5[4] = double2;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[7];
      doubleArray6[0] = (double) int0;
      doubleArray6[1] = double3;
      doubleArray6[2] = double4;
      doubleArray6[3] = (double) int2;
      doubleArray6[4] = double3;
      doubleArray6[5] = (double) int1;
      doubleArray6[6] = double3;
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[5];
      doubleArray7[0] = (double) int1;
      doubleArray7[1] = double1;
      doubleArray7[2] = double0;
      doubleArray7[3] = (double) int2;
      doubleArray7[4] = (double) int4;
      doubleArray0[6] = doubleArray7;
      Basic1DMatrix.from2DArray(doubleArray0);
      Locale locale0 = null;
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale0);
      basic1DMatrix1.toMatrixMarket(numberFormat0);
      int int5 = 390;
      basic1DMatrix0.set(int4, int5, int4);
      int int6 = 1000;
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix.random(int6, int2, mockRandom0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 17;
      doubleArray0[1] = (double) 17;
      doubleArray0[2] = (double) 3706;
      doubleArray0[3] = (double) 17;
      doubleArray0[4] = (double) 17;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(3706, 17, doubleArray0);
      basic1DMatrix0.rowMajorIterator();
      // Undeclared exception!
      try { 
        basic1DMatrix0.copyOfShape(17, 3706);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(1, 1);
      DenseVector.unit(152);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapRows(1, 1663);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.ints();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(0, mockRandom0);
      basic1DMatrix0.swapRows(0, 0);
      assertEquals(0, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      int int0 = 0;
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      basic1DMatrix0.transformRow(0, vectorFunction0);
      Matrix matrix0 = basic1DMatrix0.blankOfShape(0, 0);
      matrix0.multiplyByItsTranspose();
      basic1DMatrix0.equals((Object) matrix0);
      DecimalFormat decimalFormat0 = new DecimalFormat();
      basic1DMatrix0.toMatrixMarket((NumberFormat) decimalFormat0);
      int int1 = 3424;
      int int2 = 17;
      basic1DMatrix0.swapRows(3424, 17);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.diagonal(17, 0.0);
      int int3 = 0;
      columnMajorSparseMatrix0.getRow(0);
      // Undeclared exception!
      try { 
        DenseVector.fromCSV("%%MatrixMarket matrix array real general\n0 0\n");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "W~B`QZ4YYV w6S?&a7";
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromMatrixMarket("W~B`QZ4YYV w6S?&a7");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong input file format: can not read header '%%MatrixMarket'.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = 2.0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 0;
      doubleArray0[6] = (double) 0;
      doubleArray0[7] = 0.0;
      doubleArray0[8] = (double) 0;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(0, 0, doubleArray0);
      basic1DMatrix0.swapColumns(0, 0);
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.random(0, 0, mockRandom0);
      Basic1DMatrix basic1DMatrix2 = Basic1DMatrix.zero(0, 0);
      Matrix matrix0 = basic1DMatrix2.blank();
      basic1DMatrix1.add(matrix0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.get(0, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '0' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = (-669);
      Random random0 = null;
      // Undeclared exception!
      try { 
        Basic1DMatrix.random((-669), (-669), (Random) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-308L));
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.randomSymmetric(10, mockRandom0);
      assertEquals(10, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = (double) 0;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(0, 0, doubleArray0);
      basic1DMatrix0.rotate();
      basic1DMatrix0.blankOfShape(0, 0);
      basic1DMatrix0.setRow(1000, (double) 0);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      basic1DMatrix0.transformRow(1000, vectorFunction0);
      basic1DMatrix0.getRow(1000);
      // Undeclared exception!
      try { 
        basic1DMatrix0.copyOfShape((-798), (-798));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -798x-798
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 441.391;
      doubleArray0[2] = (double) 464;
      doubleArray0[3] = (double) 464;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(0);
      basic1DMatrix0.toRowMajorSparseMatrix();
      LinearAlgebra.DecompositorFactory linearAlgebra_DecompositorFactory0 = LinearAlgebra.DecompositorFactory.LU;
      basic1DMatrix0.withDecompositor(linearAlgebra_DecompositorFactory0);
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.from1DArray(2620, 1, doubleArray0);
      basic1DMatrix1.toBinary();
      basic1DMatrix0.setAll(0.0);
      Basic1DMatrix basic1DMatrix2 = Basic1DMatrix.identity(3);
      // Undeclared exception!
      try { 
        basic1DMatrix2.swapColumns(32, 4898);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 32
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[10];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)99;
      byteArray0[2] = (byte)8;
      byteArray0[3] = (byte) (-32);
      Basic1DMatrix.fromBinary(byteArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.copyOfShape((-1823), (byte)8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: -1823x8
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      Basic1DMatrix basic1DMatrix1 = (Basic1DMatrix)basic1DMatrix0.transformRow(1170, vectorFunction0);
      basic1DMatrix1.toArray();
      assertEquals(0, basic1DMatrix1.rows());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.diagonal(12, 1167);
      assertEquals(12, basic1DMatrix1.columns());
      
      Basic1DMatrix basic1DMatrix2 = new Basic1DMatrix(12, 1167);
      Matrix matrix0 = basic1DMatrix2.copyOfShape(1167, 12);
      assertEquals(12, matrix0.columns());
      assertEquals(1167, matrix0.rows());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      int int0 = 1170;
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      int int1 = 12;
      Matrix matrix0 = basic1DMatrix0.copyOfShape(1170, 12);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, matrix0, basic1DMatrix0);
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
      int int0 = 217;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(217, 217);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Column '218' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(1, 1, (double[]) null);
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.fromCSV("");
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
      basic1DMatrix0.swapColumns((-1119), (-1119));
      basic1DMatrix0.toArray();
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(193, 8);
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.identity(8);
      basic1DMatrix1.removeFirstColumn();
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
  public void test25()  throws Throwable  {
      int int0 = 193;
      int int1 = 36;
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix0);
      VectorAccumulator vectorAccumulator0 = mock(VectorAccumulator.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vectorAccumulator0).accumulate();
      basic1DMatrix0.foldColumn(36, vectorAccumulator0);
      MatrixFactory<Matrix> matrixFactory0 = (MatrixFactory<Matrix>) mock(MatrixFactory.class, new ViolatedAssumptionAnswer());
      DecimalFormat decimalFormat0 = null;
      try {
        decimalFormat0 = new DecimalFormat("mp,]mgsbUhqY");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed pattern \"mp,]mgsbUhqY\"
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = 8;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(182, 8);
      SparseMatrix sparseMatrix0 = SparseMatrix.diagonal(8, 0.0);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, sparseMatrix0);
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
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(182, 1);
      Matrix matrix0 = basic1DMatrix0.subtract((double) 1);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, matrix0, basic1DMatrix0, matrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 728
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(1, 1);
      assertEquals(1, basic1DMatrix0.rows());
      
      DenseVector.unit(5);
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix0);
      assertEquals(1, basic1DMatrix0.columns());
      assertEquals(2, basic1DMatrix1.columns());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.zero(1, 1);
      int int0 = 5;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(1, 5, 1);
      Matrix matrix0 = rowMajorSparseMatrix0.rotate();
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, matrix0, matrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 12
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }
}