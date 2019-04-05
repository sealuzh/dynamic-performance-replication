/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 22:19:32 GMT 2019
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
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.DenseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingularValueDecompositor_ESTest extends SingularValueDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor((Matrix) null);
      boolean boolean0 = singularValueDecompositor0.applicableTo((Matrix) null);
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
      double[][] doubleArray0 = new double[9][4];
      double[] doubleArray1 = new double[6];
      doubleArray0[0] = doubleArray1;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      // Undeclared exception!
      try { 
        singularValueDecompositor0.decompose();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[][] doubleArray0 = new double[5][7];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 687.423003649112;
      doubleArray1[2] = (-3128.682975);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[6];
      doubleArray2[2] = (-3128.682975);
      doubleArray0[1] = doubleArray2;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(sparseMatrix0);
      singularValueDecompositor0.decompose();
      assertEquals(687.423003649112, sparseMatrix0.max(), 0.01);
      assertEquals(0.12, sparseMatrix0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1756.25;
      doubleArray0[2] = (-1.0);
      doubleArray0[5] = 138.6028189;
      doubleArray0[6] = 2.0;
      doubleArray0[7] = (-439.5859542284815);
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, denseVector0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[][] doubleArray0 = new double[2][3];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 2.7561581154694327E-5;
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray0[0];
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from2DArray(doubleArray0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(columnMajorSparseMatrix0);
      singularValueDecompositor0.decompose();
      assertEquals(2, columnMajorSparseMatrix0.cardinality());
      assertEquals(0.125, columnMajorSparseMatrix0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(58, 4, 4);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(rowMajorSparseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertEquals(3, matrixArray0.length);
  }
}
