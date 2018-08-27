/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 15:49:44 GMT 2018
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.ForwardBackSubstitutionSolver;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.operation.ooplace.OoPlaceMatricesMultiplication;
import org.la4j.operation.ooplace.OoPlaceMatricesSubtraction;
import org.la4j.vector.DenseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForwardBackSubstitutionSolver_ESTest extends ForwardBackSubstitutionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.fromCSV("");
      double[][] doubleArray0 = new double[6][6];
      double[] doubleArray1 = new double[7];
      doubleArray1[0] = (-1.0);
      doubleArray1[1] = 0.0;
      doubleArray1[2] = 0.0;
      doubleArray1[3] = Double.POSITIVE_INFINITY;
      doubleArray1[4] = (-46.0);
      doubleArray1[5] = 0.0;
      doubleArray1[6] = (-1.0);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[6];
      doubleArray2[0] = Double.POSITIVE_INFINITY;
      doubleArray2[1] = (-1.0);
      doubleArray2[2] = Double.POSITIVE_INFINITY;
      doubleArray2[3] = (-1.0);
      doubleArray2[4] = Double.POSITIVE_INFINITY;
      doubleArray2[5] = (-1.0);
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[6];
      doubleArray3[0] = Double.POSITIVE_INFINITY;
      doubleArray3[1] = 0.0;
      doubleArray3[2] = (-1.0);
      doubleArray3[3] = (-1.0);
      doubleArray3[4] = 0.0;
      doubleArray3[5] = 0.0;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[4];
      doubleArray4[0] = 0.0;
      doubleArray4[1] = 0.0;
      doubleArray4[2] = 0.0;
      doubleArray4[3] = (-1.0);
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[8];
      doubleArray5[0] = 0.0;
      doubleArray5[1] = (-2667.695142);
      doubleArray5[2] = 0.0;
      doubleArray5[3] = (-46.0);
      doubleArray5[4] = Double.POSITIVE_INFINITY;
      doubleArray5[5] = 1.0;
      doubleArray5[6] = (-1.0);
      doubleArray5[7] = (-1.0);
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[6];
      doubleArray6[0] = 0.0;
      doubleArray6[1] = 0.0;
      doubleArray6[2] = (-1370.83);
      doubleArray6[3] = (-2667.695142);
      doubleArray6[4] = (-2667.695142);
      doubleArray6[5] = 1.0;
      doubleArray0[5] = doubleArray6;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      Matrix matrix0 = ooPlaceMatricesMultiplication0.apply(rowMajorSparseMatrix0, denseMatrix0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = null;
      try {
        forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(matrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given coefficient matrix can not be used with this solver.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.diagonal(1, 1);
      DenseVector denseVector0 = DenseVector.constant(1, 0.0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(sparseMatrix0);
      Vector vector0 = forwardBackSubstitutionSolver0.solve(denseVector0);
      assertNotSame(vector0, denseVector0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new OoPlaceMatricesSubtraction();
      SparseMatrix sparseMatrix0 = SparseMatrix.diagonal(3, 3);
      DenseVector denseVector0 = DenseVector.constant(3, 0.0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(sparseMatrix0);
      Vector vector0 = forwardBackSubstitutionSolver0.solve(denseVector0);
      assertEquals(3, vector0.length());
  }
}