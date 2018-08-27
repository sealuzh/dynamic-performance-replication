/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 05:26:08 GMT 2018
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.decomposition.SingularValueDecompositor;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.functor.AdvancedMatrixPredicate;
import org.la4j.matrix.functor.MatrixAccumulator;
import org.la4j.operation.ooplace.OoPlaceMatricesMultiplication;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingularValueDecompositor_ESTest extends SingularValueDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DenseMatrix.constant(3, 3, 3);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 3;
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      ooPlaceOuterProduct0.apply(sparseVector0, sparseVector0);
      DenseVector denseVector0 = DenseVector.zero(3);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, sparseVector0);
      Vector.constant(3, (-3492.5693083555));
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(3, 2, 0.964);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 22;
      doubleArray0[1] = (double) 22;
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      Matrix matrix0 = denseVector0.toRowMatrix();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(2, 3, 3);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(1, 1, 1);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(3744L);
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(0, mockRandom0);
      MatrixAccumulator matrixAccumulator0 = mock(MatrixAccumulator.class, new ViolatedAssumptionAnswer());
      doReturn((double)3744L).when(matrixAccumulator0).accumulate();
      AdvancedMatrixPredicate advancedMatrixPredicate0 = mock(AdvancedMatrixPredicate.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(advancedMatrixPredicate0).test(any(org.la4j.Matrix.class));
      denseMatrix0.non(advancedMatrixPredicate0);
      denseMatrix0.fold(matrixAccumulator0);
      denseMatrix0.manhattanNorm();
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.randomSymmetric(1, 0.0, (Random) mockRandom0);
      SingularValueDecompositor singularValueDecompositor1 = new SingularValueDecompositor(rowMajorSparseMatrix0);
      singularValueDecompositor1.decompose();
      singularValueDecompositor0.applicableTo(rowMajorSparseMatrix0);
      SingularValueDecompositor singularValueDecompositor2 = new SingularValueDecompositor(denseMatrix0);
      singularValueDecompositor1.decompose();
      // Undeclared exception!
      try { 
        singularValueDecompositor2.decompose();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(22, 6);
      Matrix matrix0 = columnMajorSparseMatrix0.blankOfRows(22);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      singularValueDecompositor0.decompose();
      singularValueDecompositor0.decompose();
      boolean boolean0 = singularValueDecompositor0.applicableTo(matrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(6, 6);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (-1809.9691286822);
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = (double) 6;
      doubleArray0[5] = (double) 0;
      doubleArray0[6] = 1.009741958682895E-27;
      doubleArray0[7] = (double) 0;
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, sparseVector0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      singularValueDecompositor0.decompose();
      singularValueDecompositor0.decompose();
      singularValueDecompositor0.applicableTo(columnMajorSparseMatrix0);
      org.evosuite.runtime.Random.setNextRandom(1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(3, 3, 6);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(6);
      columnMajorSparseMatrix0.multiply((double) 0);
      columnMajorSparseMatrix0.blankOfRows(3);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (double) 6;
      doubleArray0[1] = (double) 6;
      doubleArray0[2] = (double) 6;
      doubleArray0[3] = (double) 3;
      doubleArray0[4] = (double) 0;
      doubleArray0[5] = (double) 6;
      doubleArray0[6] = (double) 6;
      doubleArray0[7] = (double) 3;
      DenseVector denseVector0 = DenseVector.fromArray(doubleArray0);
      SparseVector sparseVector0 = SparseVector.fromArray(doubleArray0);
      OoPlaceOuterProduct ooPlaceOuterProduct1 = new OoPlaceOuterProduct();
      MockRandom mockRandom0 = new MockRandom((-790L));
      DenseVector denseVector1 = DenseVector.random(0, mockRandom0);
      ooPlaceOuterProduct1.apply(denseVector1, sparseVector0);
      Matrix matrix0 = ooPlaceOuterProduct1.apply(denseVector0, sparseVector0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      SingularValueDecompositor singularValueDecompositor1 = new SingularValueDecompositor(columnMajorSparseMatrix0);
      singularValueDecompositor1.decompose();
      singularValueDecompositor0.decompose();
      singularValueDecompositor0.applicableTo(matrix0);
      // Undeclared exception!
      singularValueDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(6, 32, 3739.0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }
}