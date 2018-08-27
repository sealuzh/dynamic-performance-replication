/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 20:41:36 GMT 2018
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.EigenDecompositor;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.dense.Basic2DMatrix;
import org.la4j.matrix.sparse.CCSMatrix;
import org.la4j.matrix.sparse.CRSMatrix;
import org.la4j.operation.ooplace.OoPlaceMatricesAddition;
import org.la4j.operation.ooplace.OoPlaceMatricesMultiplication;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[12];
      doubleArray0[5] = 7.94448177519585E-17;
      doubleArray0[4] = 7.94448177519585E-17;
      doubleArray0[5] = 7.94448177519585E-17;
      SparseVector.fromArray(doubleArray0);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      SparseVector sparseVector0 = SparseVector.fromMap(hashMap0, 10);
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new OoPlaceMatricesAddition();
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(10, 10, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      eigenDecompositor0.decompose();
      Random.setNextRandom(10);
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      denseVector0.toColumnMatrix();
      boolean boolean0 = eigenDecompositor0.applicableTo(matrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2094.510285047014;
      doubleArray0[1] = 2094.510285047014;
      doubleArray0[5] = 2094.510285047014;
      doubleArray0[5] = 2094.510285047014;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix matrix1 = matrix0.sliceTopLeft(0, 246);
      Matrix matrix2 = matrix0.rotate();
      eigenDecompositor0.matrix = matrix2;
      eigenDecompositor0.decompose();
      eigenDecompositor0.applicableTo(matrix1);
      eigenDecompositor0.applicableTo(matrix0);
      Random.setNextRandom(0);
      boolean boolean0 = eigenDecompositor0.applicableTo(matrix1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2094.510285047014;
      doubleArray0[1] = 2094.510285047014;
      doubleArray0[5] = 2094.510285047014;
      doubleArray0[4] = 2094.510285047014;
      doubleArray0[5] = 2094.510285047014;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix matrix1 = matrix0.sliceTopLeft(0, 246);
      Matrix matrix2 = matrix0.rotate();
      eigenDecompositor0.matrix = matrix2;
      eigenDecompositor0.decompose();
      eigenDecompositor0.applicableTo(matrix1);
      eigenDecompositor0.applicableTo(matrix0);
      Random.setNextRandom(0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2094.510285047014;
      doubleArray0[5] = 2094.510285047014;
      doubleArray0[5] = 2094.510285047014;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      Matrix matrix1 = matrix0.sliceTopLeft(0, 246);
      Matrix matrix2 = matrix0.rotate();
      eigenDecompositor0.matrix = matrix2;
      eigenDecompositor0.decompose();
      boolean boolean0 = eigenDecompositor0.applicableTo(matrix1);
      Random.setNextRandom(0);
      boolean boolean1 = eigenDecompositor0.applicableTo(matrix1);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 2094.510285047014;
      doubleArray0[1] = 2094.510285047014;
      doubleArray0[5] = 2094.510285047014;
      doubleArray0[3] = 2094.510285047014;
      doubleArray0[4] = 2094.510285047014;
      doubleArray0[5] = 2094.510285047014;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Matrix matrix0 = sparseVector0.toDiagonalMatrix();
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      int int0 = 0;
      int int1 = 246;
      Matrix matrix1 = matrix0.sliceTopLeft(0, 246);
      eigenDecompositor0.matrix = matrix1;
      eigenDecompositor0.matrix.iterator();
      // Undeclared exception!
      try { 
        eigenDecompositor0.decompose();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't decompose rectangle matrix
         //
         verifyException("org.la4j.decomposition.EigenDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[] doubleArray0 = new double[18];
      doubleArray0[3] = 2.0;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      CRSMatrix cRSMatrix0 = (CRSMatrix)sparseVector0.toDiagonalMatrix();
      OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new OoPlaceMatricesAddition();
      MockRandom mockRandom0 = new MockRandom();
      Basic2DMatrix basic2DMatrix0 = (Basic2DMatrix)DenseMatrix.random(10, 10, mockRandom0);
      double[][] doubleArray1 = new double[2][1];
      doubleArray1[0] = doubleArray0;
      Basic2DMatrix basic2DMatrix1 = (Basic2DMatrix)ooPlaceMatricesAddition0.applySymmetric((DenseMatrix) basic2DMatrix0, (SparseMatrix) cRSMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(basic2DMatrix1);
      cRSMatrix0.rotate();
      boolean boolean0 = eigenDecompositor0.applicableTo(cRSMatrix0);
      eigenDecompositor0.decompose();
      Integer integer0 = new Integer(10);
      hashMap0.put(integer0, integer0);
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      ColumnMajorSparseMatrix.zero(10, 182633488);
      Random.setNextRandom(509);
      boolean boolean1 = eigenDecompositor0.applicableTo(cRSMatrix0);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[12];
      doubleArray0[3] = 0.4379750043645363;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      int int0 = 10;
      CRSMatrix cRSMatrix0 = (CRSMatrix)sparseVector0.toDiagonalMatrix();
      OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new OoPlaceMatricesAddition();
      MockRandom mockRandom0 = new MockRandom();
      Basic2DMatrix basic2DMatrix0 = (Basic2DMatrix)DenseMatrix.random(10, 10, mockRandom0);
      double[][] doubleArray1 = new double[2][1];
      doubleArray1[0] = doubleArray0;
      Basic2DMatrix basic2DMatrix1 = (Basic2DMatrix)ooPlaceMatricesAddition0.applySymmetric((DenseMatrix) basic2DMatrix0, (SparseMatrix) cRSMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(basic2DMatrix1);
      CCSMatrix cCSMatrix0 = (CCSMatrix)cRSMatrix0.rotate();
      eigenDecompositor0.applicableTo(cRSMatrix0);
      EigenDecompositor eigenDecompositor1 = new EigenDecompositor(cCSMatrix0);
      eigenDecompositor1.decompose();
      eigenDecompositor0.decompose();
      Integer integer0 = new Integer(10);
      hashMap0.put(integer0, integer0);
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      // Undeclared exception!
      try { 
        ColumnMajorSparseMatrix.from1DArray(10, 10, doubleArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("org.la4j.matrix.sparse.CCSMatrix", e);
      }
  }
}