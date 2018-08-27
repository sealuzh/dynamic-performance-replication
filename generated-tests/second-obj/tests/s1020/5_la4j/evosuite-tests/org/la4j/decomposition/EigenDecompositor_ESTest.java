/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 06:43:13 GMT 2018
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.EigenDecompositor;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.operation.ooplace.OoPlaceMatricesAddition;
import org.la4j.operation.ooplace.OoPlaceMatrixByItsTransposeMultiplication;
import org.la4j.operation.ooplace.OoPlaceMatrixHadamardProduct;
import org.la4j.vector.functor.VectorFunction;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(6, 6, 6);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NEGATIVE_INFINITY, 1.0, Double.NEGATIVE_INFINITY, (double)6, (double)6).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      denseMatrix0.updateColumn(2, vectorFunction0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(6, 6, 6);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(6, 6, 2.0);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(3.280440516890188E-29, 2.0, (double)2, 1869.0, (double)2).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      denseMatrix0.updateColumn(2, vectorFunction0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(6, 6, 2.0);
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      assertNotNull(denseMatrix0);
      
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NEGATIVE_INFINITY, 2.0, (double)2, 1869.0, 7.7625918806912).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      denseMatrix0.updateColumn(2, vectorFunction0);
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      assertNotNull(eigenDecompositor0);
      
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(6, 6, 2.0);
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      assertNotNull(denseMatrix0);
      
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NEGATIVE_INFINITY, 2.0, (double)2, 1869.0, (double)2).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      denseMatrix0.updateColumn(2, vectorFunction0);
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      assertNotNull(eigenDecompositor0);
      
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(6, 6, 6);
      assertEquals(6, denseMatrix0.columns());
      assertEquals(6, denseMatrix0.rows());
      assertNotNull(denseMatrix0);
      
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NEGATIVE_INFINITY, 1.0, (-1.0), (double)6, (-8.512174119941645E-30)).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      denseMatrix0.updateColumn(2, vectorFunction0);
      assertEquals(6, denseMatrix0.columns());
      assertEquals(6, denseMatrix0.rows());
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      assertEquals(6, denseMatrix0.columns());
      assertEquals(6, denseMatrix0.rows());
      assertNotNull(eigenDecompositor0);
      
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(5, 5, 2.0);
      assertEquals(5, denseMatrix0.rows());
      assertEquals(5, denseMatrix0.columns());
      assertNotNull(denseMatrix0);
      
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-630.5213500833719), 2.7488053254300284E-15, (double)5, 2.0).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      denseMatrix0.updateColumn(4, vectorFunction0);
      assertEquals(5, denseMatrix0.rows());
      assertEquals(5, denseMatrix0.columns());
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      assertEquals(5, denseMatrix0.rows());
      assertEquals(5, denseMatrix0.columns());
      assertNotNull(eigenDecompositor0);
      
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(5, denseMatrix0.rows());
      assertEquals(5, denseMatrix0.columns());
      assertNotNull(matrixArray0);
      
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(5, 4328, 5);
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(0.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(0, columnMajorSparseMatrix0.cardinality());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(0.0, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(4328, columnMajorSparseMatrix0.columns());
      assertEquals(5, columnMajorSparseMatrix0.rows());
      assertNotNull(columnMajorSparseMatrix0);
      
      boolean boolean0 = eigenDecompositor0.applicableTo(columnMajorSparseMatrix0);
      assertEquals(5, denseMatrix0.rows());
      assertEquals(5, denseMatrix0.columns());
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(0.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(0, columnMajorSparseMatrix0.cardinality());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(0.0, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(4328, columnMajorSparseMatrix0.columns());
      assertEquals(5, columnMajorSparseMatrix0.rows());
      assertFalse(boolean0);
      
      EigenDecompositor eigenDecompositor1 = null;
      try {
        eigenDecompositor1 = new EigenDecompositor(columnMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given matrix can not be used with this decompositor.
         //
         verifyException("org.la4j.decomposition.AbstractDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(6, 6, 6);
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      assertNotNull(denseMatrix0);
      
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      denseMatrix0.updateColumn(2, vectorFunction0);
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      assertNotNull(eigenDecompositor0);
      
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      assertNotNull(matrixArray0);
      
      Matrix[] matrixArray1 = eigenDecompositor0.decompose();
      assertFalse(matrixArray1.equals((Object)matrixArray0));
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      assertNotSame(matrixArray1, matrixArray0);
      assertNotNull(matrixArray1);
      
      Random.setNextRandom(32);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = 6;
      DenseMatrix denseMatrix0 = DenseMatrix.constant(6, 6, 2.0);
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      assertNotNull(denseMatrix0);
      
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)6, (-630.5213500833719), 2.7488053254300284E-15, (double)6, 2.0).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      denseMatrix0.updateColumn(4, vectorFunction0);
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      assertNotNull(eigenDecompositor0);
      
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      assertNotNull(matrixArray0);
      
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.zero(6, 4328, 6);
      assertEquals(6, columnMajorSparseMatrix0.rows());
      assertEquals(0.0, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(4328, columnMajorSparseMatrix0.columns());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(0.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(0, columnMajorSparseMatrix0.cardinality());
      assertNotNull(columnMajorSparseMatrix0);
      
      boolean boolean0 = eigenDecompositor0.applicableTo(columnMajorSparseMatrix0);
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      assertEquals(6, columnMajorSparseMatrix0.rows());
      assertEquals(0.0, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(4328, columnMajorSparseMatrix0.columns());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(0.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(0, columnMajorSparseMatrix0.cardinality());
      assertFalse(boolean0);
      
      EigenDecompositor eigenDecompositor1 = null;
      try {
        eigenDecompositor1 = new EigenDecompositor(columnMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given matrix can not be used with this decompositor.
         //
         verifyException("org.la4j.decomposition.AbstractDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(6, 6, 2.0);
      assertEquals(6, denseMatrix0.columns());
      assertEquals(6, denseMatrix0.rows());
      assertNotNull(denseMatrix0);
      
      int int0 = 4;
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)4, 2.0, (double)6, (double)4, (double)4).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      denseMatrix0.updateColumn(4, vectorFunction0);
      assertEquals(6, denseMatrix0.columns());
      assertEquals(6, denseMatrix0.rows());
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      assertEquals(6, denseMatrix0.columns());
      assertEquals(6, denseMatrix0.rows());
      assertNotNull(eigenDecompositor0);
      
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(6, denseMatrix0.columns());
      assertEquals(6, denseMatrix0.rows());
      assertNotNull(matrixArray0);
      
      boolean boolean0 = eigenDecompositor0.applicableTo(denseMatrix0);
      assertEquals(6, denseMatrix0.columns());
      assertEquals(6, denseMatrix0.rows());
      assertTrue(boolean0);
      
      OoPlaceMatrixByItsTransposeMultiplication ooPlaceMatrixByItsTransposeMultiplication0 = new OoPlaceMatrixByItsTransposeMultiplication();
      assertNotNull(ooPlaceMatrixByItsTransposeMultiplication0);
      
      boolean boolean1 = eigenDecompositor0.applicableTo(denseMatrix0);
      assertTrue(boolean1 == boolean0);
      assertEquals(6, denseMatrix0.columns());
      assertEquals(6, denseMatrix0.rows());
      assertTrue(boolean1);
      
      OoPlaceMatrixHadamardProduct ooPlaceMatrixHadamardProduct0 = new OoPlaceMatrixHadamardProduct();
      assertNotNull(ooPlaceMatrixHadamardProduct0);
      
      MockRandom mockRandom0 = new MockRandom();
      assertNotNull(mockRandom0);
      
      // Undeclared exception!
      try { 
        SparseMatrix.random((-2088207474), 2129633212, 2.0, (java.util.Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The density value should be between 0 and 1.0
         //
         verifyException("org.la4j.matrix.sparse.CRSMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(6, 6, 2.0);
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      assertNotNull(denseMatrix0);
      
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(4.096878137302765E-15, 1.9571297844761843E-16, 2.7488053254300284E-15, 4.096878137302765E-15, 2.0).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      denseMatrix0.updateColumn(4, vectorFunction0);
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      assertNotNull(eigenDecompositor0);
      
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      assertNotNull(matrixArray0);
      
      boolean boolean0 = eigenDecompositor0.applicableTo(denseMatrix0);
      assertEquals(6, denseMatrix0.rows());
      assertEquals(6, denseMatrix0.columns());
      assertTrue(boolean0);
      
      OoPlaceMatricesAddition ooPlaceMatricesAddition0 = new OoPlaceMatricesAddition();
      assertNotNull(ooPlaceMatricesAddition0);
      
      // Undeclared exception!
      try { 
        eigenDecompositor0.fail("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 
         //
         verifyException("org.la4j.decomposition.AbstractDecompositor", e);
      }
  }
}