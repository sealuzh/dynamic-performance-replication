/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 20:07:48 GMT 2018
 */

package org.la4j.matrix.dense;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.NumberFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.dense.Basic1DMatrix;
import org.la4j.matrix.functor.MatrixPredicate;
import org.la4j.operation.ooplace.OoPlaceMatricesAddition;
import org.la4j.vector.functor.VectorFunction;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Basic1DMatrix_ESTest extends Basic1DMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[15];
      doubleArray0[0] = (double) 287;
      doubleArray0[1] = (double) 287;
      doubleArray0[2] = (double) 287;
      doubleArray0[3] = (double) 287;
      doubleArray0[4] = (double) 287;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(287, 287, doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.blankOfShape((-2995), 32);
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
      // Undeclared exception!
      try { 
        basic1DMatrix0.set(653, 0, (-2198.5805232612));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '653' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)21;
      byte byte0 = (byte)64;
      byteArray0[1] = (byte)64;
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
  public void test03()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(0, 692, mockRandom0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.get(692, 692);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '692' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(25, 25);
      basic1DMatrix0.swapRows(25, 25);
      assertEquals(25, basic1DMatrix0.columns());
      assertEquals(25, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.toDenseMatrix();
      basic1DMatrix0.setAll((-929.74));
      assertEquals(0, basic1DMatrix0.rows());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Vector vector0 = basic1DMatrix0.getRow((-3577));
      assertEquals(0, vector0.length());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.random(0, 692, mockRandom0);
      basic1DMatrix0.toArray();
      assertEquals(0, basic1DMatrix0.rows());
      assertEquals(692, basic1DMatrix0.columns());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(447, 447);
      // Undeclared exception!
      try { 
        basic1DMatrix0.getRow(447);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[][] doubleArray0 = new double[8][6];
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from2DArray(doubleArray0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.get((-2332), 776);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Row '-2332' is invalid.
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.copyOfShape(2109, 8);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.copyOfRows(5);
      // Undeclared exception!
      try { 
        Basic1DMatrix.fromMatrixMarket("n>1|E*p%&Q{Z'@\"r");
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
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(769, 769);
      basic1DMatrix0.toArray();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Basic1DMatrix.random(792, 792, (java.util.Random) null);
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
      NumberFormat.getPercentInstance();
      MockRandom mockRandom0 = new MockRandom();
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix(753, 753);
      basic1DMatrix0.toArray();
      basic1DMatrix0.copyOfShape(469, 753);
      basic1DMatrix0.setAll(0.0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(0, 0);
      basic1DMatrix0.getRow(0);
      basic1DMatrix0.toBinary();
      Basic1DMatrix.constant(0, 0, 0);
      Basic1DMatrix basic1DMatrix1 = (Basic1DMatrix)basic1DMatrix0.copyOfShape(0, 0);
      basic1DMatrix0.setAll(2266.8802561);
      MockRandom mockRandom0 = new MockRandom(0);
      Basic1DMatrix basic1DMatrix2 = Basic1DMatrix.randomSymmetric(5, mockRandom0);
      basic1DMatrix0.setRow(2986, 0.0);
      basic1DMatrix1.toArray();
      byte[] byteArray0 = basic1DMatrix2.toBinary();
      Basic1DMatrix.fromBinary(byteArray0);
      String string0 = "l8pOn)l9)a";
      // Undeclared exception!
      try { 
        DenseMatrix.fromCSV("$:_!rD:)dtii8");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(17, 17);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapRows(17, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 289
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(0);
      basic1DMatrix0.swapRows(0, (-128));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.identity(8);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(denseMatrix0, denseMatrix0, denseMatrix0, denseMatrix0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.la4j.matrix.dense.Basic2DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromCSV("");
      MatrixPredicate matrixPredicate0 = mock(MatrixPredicate.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(matrixPredicate0).test(anyInt() , anyInt());
      basic1DMatrix0.toDenseMatrix();
      basic1DMatrix0.non(matrixPredicate0);
      Matrix matrix0 = Matrix.diagonal(3046, 3046);
      OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new OoPlaceMatricesAddition();
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(matrix0, matrix0, basic1DMatrix0, basic1DMatrix0);
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
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(0, 0);
      DenseMatrix denseMatrix0 = basic1DMatrix0.toDenseMatrix();
      basic1DMatrix0.determinant();
      basic1DMatrix0.toSparseMatrix();
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(911, 795);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, denseMatrix0, denseMatrix0, sparseMatrix0);
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
      NumberFormat.getNumberInstance();
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(61, 61);
      // Undeclared exception!
      try { 
        basic1DMatrix0.swapColumns(61, (-761));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -761
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      Matrix matrix0 = basic1DMatrix0.copyOfColumns(934);
      matrix0.swapColumns(934, 1707);
      basic1DMatrix0.swapColumns(1707, 934);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.identity(1);
      Matrix matrix0 = Matrix.diagonal(3046, (-5308.5895));
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(matrix0, basic1DMatrix0, basic1DMatrix0, matrix0);
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
      Basic1DMatrix basic1DMatrix0 = new Basic1DMatrix();
      basic1DMatrix0.swapColumns(61, 61);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 30;
      doubleArray0[1] = (double) 30;
      doubleArray0[2] = (double) 30;
      doubleArray0[3] = (double) 30;
      doubleArray0[4] = (double) 30;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.from1DArray(30, 30, doubleArray0);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        basic1DMatrix0.transformRow(13, vectorFunction0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = 0;
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.unit(0, 0);
      DenseMatrix denseMatrix0 = basic1DMatrix0.toDenseMatrix();
      MockRandom mockRandom0 = new MockRandom();
      basic1DMatrix0.determinant();
      basic1DMatrix0.toSparseMatrix();
      Random.setNextRandom(413);
      SparseMatrix sparseMatrix0 = SparseMatrix.zero(0, 795);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(basic1DMatrix0, denseMatrix0, denseMatrix0, sparseMatrix0);
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
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.diagonal(759, 1551.6229585);
      double[][] doubleArray0 = new double[1][9];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = (double) 759;
      doubleArray1[1] = (double) 759;
      doubleArray1[2] = (double) 759;
      doubleArray1[3] = (double) 759;
      doubleArray1[4] = 1551.6229585;
      doubleArray1[5] = 1551.6229585;
      doubleArray0[0] = doubleArray1;
      DenseMatrix.from2DArray(doubleArray0);
      basic1DMatrix0.copyOfShape(759, 734);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.constant(1, 1, Integer.MAX_VALUE);
      OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new OoPlaceMatricesAddition();
      Basic1DMatrix.block(basic1DMatrix0, basic1DMatrix0, basic1DMatrix0, basic1DMatrix0);
      // Undeclared exception!
      try { 
        basic1DMatrix0.copyOfShape(Integer.MAX_VALUE, (-3421));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong matrix dimensions: 2147483647x-3421
         //
         verifyException("org.la4j.Matrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Basic1DMatrix basic1DMatrix0 = Basic1DMatrix.fromCSV("");
      MatrixPredicate matrixPredicate0 = mock(MatrixPredicate.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(matrixPredicate0).test(anyInt() , anyInt());
      basic1DMatrix0.non(matrixPredicate0);
      int int0 = 802;
      int int1 = 1;
      Matrix matrix0 = basic1DMatrix0.copyOfShape(1, 1);
      Basic1DMatrix.identity(1);
      Basic1DMatrix basic1DMatrix1 = Basic1DMatrix.constant(802, 1, 802);
      // Undeclared exception!
      try { 
        Basic1DMatrix.block(matrix0, matrix0, basic1DMatrix1, basic1DMatrix1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1606
         //
         verifyException("org.la4j.matrix.dense.Basic1DMatrix", e);
      }
  }
}