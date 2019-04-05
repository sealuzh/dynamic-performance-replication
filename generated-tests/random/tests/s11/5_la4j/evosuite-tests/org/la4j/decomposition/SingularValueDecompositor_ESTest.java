/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 19:15:33 GMT 2019
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.SingularValueDecompositor;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.sparse.CRSMatrix;
import org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingularValueDecompositor_ESTest extends SingularValueDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SparseMatrix sparseMatrix0 = SparseMatrix.diagonal(3, 3);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(sparseMatrix0);
      boolean boolean0 = singularValueDecompositor0.applicableTo(sparseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor((Matrix) null);
      // Undeclared exception!
      try { 
        singularValueDecompositor0.decompose();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.decomposition.SingularValueDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Matrix matrix0 = Matrix.unit(0, 0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      // Undeclared exception!
      try { 
        singularValueDecompositor0.decompose();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[][] doubleArray0 = new double[3][8];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-3.0);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[9];
      doubleArray2[4] = Double.POSITIVE_INFINITY;
      doubleArray0[2] = doubleArray2;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      // Undeclared exception!
      singularValueDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      double[][] doubleArray0 = new double[7][4];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 35.088459641312255;
      doubleArray0[0] = doubleArray1;
      doubleArray0[3] = doubleArray0[0];
      doubleArray0[4] = doubleArray1;
      double[] doubleArray2 = new double[2];
      doubleArray2[0] = (-795.0);
      doubleArray0[5] = doubleArray2;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from2DArray(doubleArray0);
      Matrix matrix0 = ooPlaceMatrixByItsTransposeMultiplication0.apply(rowMajorSparseMatrix0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[][] doubleArray0 = new double[2][8];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (-1315.19511);
      doubleArray1[1] = (-3276.178411);
      doubleArray1[2] = 0.161446698244965;
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray1;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      double[][] doubleArray0 = new double[7][4];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = 35.088459641312255;
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[1];
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = 12.405643876881193;
      doubleArray0[4] = doubleArray2;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from2DArray(doubleArray0);
      CRSMatrix cRSMatrix0 = (CRSMatrix)ooPlaceMatrixByItsTransposeMultiplication0.apply(rowMajorSparseMatrix0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(cRSMatrix0);
      singularValueDecompositor0.decompose();
      assertEquals(16, cRSMatrix0.cardinality());
      assertEquals(0.32653061224489793, cRSMatrix0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SparseVector sparseVector0 = SparseVector.zero(3);
      Matrix matrix0 = sparseVector0.toColumnMatrix();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }
}
