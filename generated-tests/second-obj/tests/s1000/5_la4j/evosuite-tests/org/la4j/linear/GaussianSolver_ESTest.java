/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 15:05:28 GMT 2018
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.Vector;
import org.la4j.linear.GaussianSolver;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;
import org.la4j.vector.VectorFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GaussianSolver_ESTest extends GaussianSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.fromCSV("        ");
      GaussianSolver gaussianSolver0 = null;
      try {
        gaussianSolver0 = new GaussianSolver(columnMajorSparseMatrix0);
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
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      DenseMatrix denseMatrix0 = DenseMatrix.diagonal(0, (-194.617923));
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      SparseVector sparseVector0 = SparseVector.zero(0);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(sparseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong vector length: -1
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.zero(397, 397, 397);
      GaussianSolver gaussianSolver0 = new GaussianSolver(rowMajorSparseMatrix0);
      SparseVector sparseVector0 = SparseVector.zero(397, (-1676));
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(sparseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system can't be solved.
         //
         verifyException("org.la4j.linear.GaussianSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      int int0 = 3;
      DenseMatrix denseMatrix0 = DenseMatrix.diagonal(3, (-194.617923));
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      SparseVector sparseVector0 = SparseVector.zero(3);
      Vector vector0 = gaussianSolver0.solve(sparseVector0);
      Random.setNextRandom(3);
      sparseVector0.norm();
      gaussianSolver0.solve(sparseVector0);
      Matrix matrix0 = denseMatrix0.subtract((-1999.049402));
      VectorFactory<DenseVector> vectorFactory0 = (VectorFactory<DenseVector>) mock(VectorFactory.class, new ViolatedAssumptionAnswer());
      doReturn((Vector) null).when(vectorFactory0).apply(anyInt());
      sparseVector0.to(vectorFactory0);
      GaussianSolver gaussianSolver1 = new GaussianSolver(matrix0);
      gaussianSolver1.solve(vector0);
      Random.setNextRandom(539);
      // Undeclared exception!
      try { 
        SparseVector.fromCollection((Collection<? extends Number>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.dense.BasicVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      int int0 = 28;
      DenseMatrix denseMatrix0 = DenseMatrix.diagonal(28, (-0.22599598736459714));
      GaussianSolver gaussianSolver0 = new GaussianSolver(denseMatrix0);
      SparseVector sparseVector0 = SparseVector.zero(28);
      // Undeclared exception!
      try { 
        gaussianSolver0.solve(sparseVector0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // This system is singular.
         //
         verifyException("org.la4j.linear.AbstractSolver", e);
      }
  }
}
