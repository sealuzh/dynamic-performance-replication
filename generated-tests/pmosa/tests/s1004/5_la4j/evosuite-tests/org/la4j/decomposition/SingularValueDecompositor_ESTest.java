/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 02:15:48 GMT 2018
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.SingularValueDecompositor;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.matrix.functor.MatrixAccumulator;
import org.la4j.matrix.functor.MatrixFunction;
import org.la4j.operation.ooplace.OoPlaceMatricesSubtraction;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingularValueDecompositor_ESTest extends SingularValueDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (double) (-44);
      doubleArray0[2] = (double) (-44);
      double[][] doubleArray1 = new double[2][3];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray1);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(sparseMatrix0);
      singularValueDecompositor0.decompose();
      Random.setNextRandom((-44));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from1DArray(2, 0, (double[]) null);
      Random.setNextRandom(2);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(columnMajorSparseMatrix0);
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
  public void test02()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      ColumnMajorSparseMatrix.randomSymmetric(0, (double) 0, (java.util.Random) mockRandom0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.from1DArray(2, 0, (double[]) null);
      Matrix matrix0 = columnMajorSparseMatrix0.add(0.0);
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
  public void test03()  throws Throwable  {
      OoPlaceMatricesSubtraction ooPlaceMatricesSubtraction0 = new OoPlaceMatricesSubtraction();
      DenseMatrix denseMatrix0 = DenseMatrix.zero(0, 0);
      Matrix matrix0 = ooPlaceMatricesSubtraction0.apply(denseMatrix0, denseMatrix0);
      denseMatrix0.copyOfColumns(0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(matrix0);
      MockRandom mockRandom0 = new MockRandom(1732L);
      mockRandom0.doubles(586.701574069307, 4340.0);
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.randomSymmetric(1, (double) 0, (java.util.Random) mockRandom0);
      singularValueDecompositor0.matrix = (Matrix) columnMajorSparseMatrix0;
      singularValueDecompositor0.applicableTo(columnMajorSparseMatrix0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      MatrixFunction matrixFunction0 = mock(MatrixFunction.class, new ViolatedAssumptionAnswer());
      denseMatrix0.update(matrixFunction0);
      matrix0.forEach(consumer0);
      MatrixAccumulator matrixAccumulator0 = mock(MatrixAccumulator.class, new ViolatedAssumptionAnswer());
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      DenseVector denseVector0 = DenseVector.fromCollection(linkedList0);
      ooPlaceOuterProduct0.apply(denseVector0, sparseVector0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) (-28);
      doubleArray0[2] = (double) (-28);
      doubleArray0[2] = (double) (-28);
      MockRandom mockRandom0 = new MockRandom();
      double[][] doubleArray1 = new double[4][6];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[0] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray1);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(sparseMatrix0);
      singularValueDecompositor0.decompose();
      Random.setNextRandom(1068);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) (-1);
      doubleArray0[2] = (double) (-1);
      double[][] doubleArray1 = new double[23][6];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[0] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray1);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(sparseMatrix0);
      singularValueDecompositor0.decompose();
      Random.setNextRandom(1068);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[0] = (double) 0;
      doubleArray0[3] = (double) 0;
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.nextBoolean();
      double[][] doubleArray1 = new double[4][0];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      double[] doubleArray2 = new double[5];
      doubleArray2[0] = 1.1102230246251565E-14;
      doubleArray2[1] = 3376.08990602;
      doubleArray2[2] = (double) 0;
      doubleArray2[3] = (double) 0;
      doubleArray2[4] = (double) 0;
      doubleArray1[2] = doubleArray2;
      doubleArray1[3] = doubleArray0;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray1);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(sparseMatrix0);
      singularValueDecompositor0.applicableTo(sparseMatrix0);
      singularValueDecompositor0.decompose();
      boolean boolean0 = singularValueDecompositor0.applicableTo(sparseMatrix0);
      boolean boolean1 = singularValueDecompositor0.applicableTo(sparseMatrix0);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(13, 13, 2.0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      Random.setNextRandom(13);
      singularValueDecompositor0.applicableTo(denseMatrix0);
      Matrix[] matrixArray1 = singularValueDecompositor0.decompose();
      assertFalse(matrixArray1.equals((Object)matrixArray0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.nextInt(3);
      mockRandom0.nextBoolean();
      double[][] doubleArray0 = new double[5][8];
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (double) 0;
      doubleArray1[1] = (double) 0;
      doubleArray1[2] = (double) 0;
      doubleArray1[3] = (double) 0;
      doubleArray1[4] = (double) 0;
      doubleArray1[5] = 2.0;
      doubleArray1[6] = (double) 0;
      doubleArray1[7] = (double) 0;
      doubleArray1[8] = (double) 0;
      doubleArray0[4] = doubleArray1;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(sparseMatrix0);
      singularValueDecompositor0.applicableTo(sparseMatrix0);
      SingularValueDecompositor singularValueDecompositor1 = new SingularValueDecompositor(sparseMatrix0);
      Matrix[] matrixArray0 = singularValueDecompositor0.decompose();
      singularValueDecompositor1.decompose();
      singularValueDecompositor0.decompose();
      Matrix[] matrixArray1 = singularValueDecompositor0.decompose();
      assertFalse(matrixArray1.equals((Object)matrixArray0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 0;
      MockRandom mockRandom0 = new MockRandom(0);
      mockRandom0.nextBoolean();
      double[][] doubleArray1 = new double[3][9];
      doubleArray1[0] = doubleArray0;
      double[] doubleArray2 = new double[7];
      doubleArray2[0] = 2.0;
      doubleArray2[1] = 2.0;
      doubleArray2[2] = (double) 0;
      doubleArray2[3] = 2.0;
      doubleArray2[4] = (double) 0;
      doubleArray2[5] = 2.0;
      doubleArray2[6] = 2.0;
      doubleArray1[1] = doubleArray2;
      doubleArray1[2] = doubleArray0;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray1);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(sparseMatrix0);
      singularValueDecompositor0.applicableTo(sparseMatrix0);
      singularValueDecompositor0.decompose();
      Random.setNextRandom(1794);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = (double) 0;
      doubleArray0[0] = (double) 0;
      doubleArray0[3] = (double) 0;
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.nextBoolean();
      double[][] doubleArray1 = new double[4][0];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      double[] doubleArray2 = new double[5];
      doubleArray2[0] = 1.1102230246251565E-14;
      doubleArray2[1] = 3376.08990602;
      double[][] doubleArray3 = new double[6][7];
      doubleArray3[0] = doubleArray0;
      doubleArray3[1] = doubleArray0;
      doubleArray3[2] = doubleArray2;
      doubleArray3[3] = doubleArray2;
      doubleArray3[4] = doubleArray2;
      doubleArray3[5] = doubleArray2;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray3);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(sparseMatrix0);
      singularValueDecompositor0.applicableTo(sparseMatrix0);
      singularValueDecompositor0.decompose();
      Random.setNextRandom(0);
      singularValueDecompositor0.decompose();
      assertEquals(0.3333333333333333, sparseMatrix0.density(), 0.01);
      assertEquals(8, sparseMatrix0.cardinality());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      double[][] doubleArray0 = new double[6][6];
      doubleArray0[0] = doubleArray0[1];
      DenseMatrix denseMatrix0 = DenseMatrix.constant(13, 12, 13);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(denseMatrix0);
      singularValueDecompositor0.decompose();
      Random.setNextRandom(3);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.nextBoolean();
      double[][] doubleArray0 = new double[2][9];
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (double) (-44);
      doubleArray1[1] = (double) (-44);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[5];
      doubleArray2[0] = (double) (-44);
      doubleArray2[1] = (double) (-44);
      doubleArray2[2] = (double) (-44);
      doubleArray2[3] = (double) (-44);
      doubleArray2[4] = (double) (-44);
      doubleArray0[1] = doubleArray2;
      SparseMatrix sparseMatrix0 = SparseMatrix.from2DArray(doubleArray0);
      SingularValueDecompositor singularValueDecompositor0 = new SingularValueDecompositor(sparseMatrix0);
      SingularValueDecompositor singularValueDecompositor1 = new SingularValueDecompositor(sparseMatrix0);
      singularValueDecompositor1.applicableTo(sparseMatrix0);
      singularValueDecompositor1.decompose();
      singularValueDecompositor0.applicableTo(sparseMatrix0);
      assertEquals(0.0, sparseMatrix0.max(), 0.01);
      assertEquals(0.75, sparseMatrix0.density(), 0.01);
      assertEquals(6, sparseMatrix0.cardinality());
  }
}