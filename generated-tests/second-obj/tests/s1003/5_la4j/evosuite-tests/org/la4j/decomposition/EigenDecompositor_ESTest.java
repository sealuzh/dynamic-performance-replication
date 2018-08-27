/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:54:59 GMT 2018
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Stream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.EigenDecompositor;
import org.la4j.matrix.ColumnMajorSparseMatrix;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.matrix.dense.Basic2DMatrix;
import org.la4j.matrix.sparse.CRSMatrix;
import org.la4j.operation.ooplace.OoPlaceMatricesMultiplication;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.SparseVector;
import org.la4j.vector.sparse.CompressedVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 20;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 0;
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.from1DArray(0, 20, doubleArray0);
      EigenDecompositor eigenDecompositor0 = null;
      try {
        eigenDecompositor0 = new EigenDecompositor(rowMajorSparseMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given matrix can not be used with this decompositor.
         //
         verifyException("org.la4j.decomposition.AbstractDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(119);
      columnMajorSparseMatrix0.getRow(119);
      columnMajorSparseMatrix0.multiply((double) 119);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      DenseMatrix denseMatrix0 = DenseMatrix.unit(18, 18);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(3, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      eigenDecompositor0.decompose();
      eigenDecompositor0.matrix = (Matrix) denseMatrix0;
      // Undeclared exception!
      try { 
        mockRandom0.ints(3, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bound must be greater than origin
         //
         verifyException("java.util.Random", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(14);
      columnMajorSparseMatrix0.getRow(14);
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      columnMajorSparseMatrix0.setColumn(3, (-0.05));
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
      eigenDecompositor0.matrix = (Matrix) columnMajorSparseMatrix0;
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(21);
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(0.047619047619047616, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(21, columnMajorSparseMatrix0.cardinality());
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(21, columnMajorSparseMatrix0.rows());
      assertEquals(21, columnMajorSparseMatrix0.columns());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertNotNull(columnMajorSparseMatrix0);
      
      CompressedVector compressedVector0 = (CompressedVector)columnMajorSparseMatrix0.getRow(21);
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(0.047619047619047616, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(21, columnMajorSparseMatrix0.cardinality());
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(21, columnMajorSparseMatrix0.rows());
      assertEquals(21, columnMajorSparseMatrix0.columns());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(0, compressedVector0.cardinality());
      assertEquals(0.0, compressedVector0.density(), 0.01);
      assertEquals(21, compressedVector0.length());
      assertNotNull(compressedVector0);
      
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      Integer integer0 = new Integer(21);
      assertEquals(21, (int)integer0);
      assertNotNull(integer0);
      
      CompressedVector compressedVector1 = (CompressedVector)SparseVector.fromCollection(linkedList0);
      assertEquals(0, linkedList0.size());
      assertEquals(Double.NaN, compressedVector1.density(), 0.01);
      assertEquals(0, compressedVector1.cardinality());
      assertEquals(0, compressedVector1.length());
      assertNotSame(compressedVector1, compressedVector0);
      assertFalse(compressedVector1.equals((Object)compressedVector0));
      assertNotNull(compressedVector1);
      
      Object[] objectArray0 = linkedList0.toArray();
      assertEquals(0, linkedList0.size());
      assertNotNull(objectArray0);
      
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      assertNotNull(ooPlaceOuterProduct0);
      
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      CRSMatrix cRSMatrix0 = (CRSMatrix)ooPlaceOuterProduct0.apply((SparseVector) compressedVector1, (SparseVector) compressedVector0);
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(0.047619047619047616, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(21, columnMajorSparseMatrix0.cardinality());
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(21, columnMajorSparseMatrix0.rows());
      assertEquals(21, columnMajorSparseMatrix0.columns());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(0, compressedVector0.cardinality());
      assertEquals(0.0, compressedVector0.density(), 0.01);
      assertEquals(21, compressedVector0.length());
      assertEquals(0, linkedList0.size());
      assertEquals(Double.NaN, compressedVector1.density(), 0.01);
      assertEquals(0, compressedVector1.cardinality());
      assertEquals(0, compressedVector1.length());
      assertTrue(cRSMatrix0.isRowMajor());
      assertEquals(0.0, cRSMatrix0.min(), 0.01);
      assertEquals(0.0, cRSMatrix0.max(), 0.01);
      assertEquals(Double.NaN, cRSMatrix0.density(), 0.01);
      assertEquals(0, cRSMatrix0.cardinality());
      assertEquals(21, cRSMatrix0.columns());
      assertEquals(0, cRSMatrix0.rows());
      assertNotSame(compressedVector0, compressedVector1);
      assertNotSame(compressedVector1, compressedVector0);
      assertFalse(compressedVector0.equals((Object)compressedVector1));
      assertFalse(compressedVector1.equals((Object)compressedVector0));
      assertNotNull(cRSMatrix0);
      
      OoPlaceMatricesMultiplication ooPlaceMatricesMultiplication0 = new OoPlaceMatricesMultiplication();
      assertNotNull(ooPlaceMatricesMultiplication0);
      
      Basic2DMatrix basic2DMatrix0 = (Basic2DMatrix)DenseMatrix.unit(10, 10);
      assertEquals(10, basic2DMatrix0.rows());
      assertEquals(10, basic2DMatrix0.columns());
      assertNotNull(basic2DMatrix0);
      
      Basic2DMatrix basic2DMatrix1 = (Basic2DMatrix)ooPlaceMatricesMultiplication0.apply((DenseMatrix) basic2DMatrix0, (DenseMatrix) basic2DMatrix0);
      assertEquals(10, basic2DMatrix0.rows());
      assertEquals(10, basic2DMatrix0.columns());
      assertEquals(10, basic2DMatrix1.rows());
      assertEquals(10, basic2DMatrix1.columns());
      assertNotSame(basic2DMatrix0, basic2DMatrix1);
      assertNotSame(basic2DMatrix1, basic2DMatrix0);
      assertFalse(basic2DMatrix1.equals((Object)basic2DMatrix0));
      assertNotNull(basic2DMatrix1);
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(basic2DMatrix1);
      assertEquals(10, basic2DMatrix0.rows());
      assertEquals(10, basic2DMatrix0.columns());
      assertEquals(10, basic2DMatrix1.rows());
      assertEquals(10, basic2DMatrix1.columns());
      assertFalse(basic2DMatrix0.equals((Object)basic2DMatrix1));
      assertFalse(basic2DMatrix1.equals((Object)basic2DMatrix0));
      assertNotNull(eigenDecompositor0);
      
      eigenDecompositor0.matrix = (Matrix) cRSMatrix0;
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(0.047619047619047616, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(21, columnMajorSparseMatrix0.cardinality());
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(21, columnMajorSparseMatrix0.rows());
      assertEquals(21, columnMajorSparseMatrix0.columns());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(0, compressedVector0.cardinality());
      assertEquals(0.0, compressedVector0.density(), 0.01);
      assertEquals(21, compressedVector0.length());
      assertEquals(0, linkedList0.size());
      assertEquals(Double.NaN, compressedVector1.density(), 0.01);
      assertEquals(0, compressedVector1.cardinality());
      assertEquals(0, compressedVector1.length());
      assertTrue(cRSMatrix0.isRowMajor());
      assertEquals(0.0, cRSMatrix0.min(), 0.01);
      assertEquals(0.0, cRSMatrix0.max(), 0.01);
      assertEquals(Double.NaN, cRSMatrix0.density(), 0.01);
      assertEquals(0, cRSMatrix0.cardinality());
      assertEquals(21, cRSMatrix0.columns());
      assertEquals(0, cRSMatrix0.rows());
      assertEquals(10, basic2DMatrix0.rows());
      assertEquals(10, basic2DMatrix0.columns());
      assertEquals(10, basic2DMatrix1.rows());
      assertEquals(10, basic2DMatrix1.columns());
      assertEquals(21, eigenDecompositor0.matrix.columns());
      assertEquals(0, eigenDecompositor0.matrix.rows());
      
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
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(14);
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(14, columnMajorSparseMatrix0.rows());
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(14, columnMajorSparseMatrix0.columns());
      assertEquals(14, columnMajorSparseMatrix0.cardinality());
      assertEquals(0.07142857142857142, columnMajorSparseMatrix0.density(), 0.01);
      assertNotNull(columnMajorSparseMatrix0);
      
      CompressedVector compressedVector0 = (CompressedVector)columnMajorSparseMatrix0.getRow(14);
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(14, columnMajorSparseMatrix0.rows());
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(14, columnMajorSparseMatrix0.columns());
      assertEquals(14, columnMajorSparseMatrix0.cardinality());
      assertEquals(0.07142857142857142, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(14, compressedVector0.length());
      assertEquals(0, compressedVector0.cardinality());
      assertEquals(0.0, compressedVector0.density(), 0.01);
      assertNotNull(compressedVector0);
      
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      Object[] objectArray0 = linkedList0.toArray();
      assertEquals(0, linkedList0.size());
      assertNotNull(objectArray0);
      
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      assertNotNull(ooPlaceOuterProduct0);
      
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      columnMajorSparseMatrix0.setColumn(3, 1.0308639221868898E-18);
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(0.1377551020408163, columnMajorSparseMatrix0.density(), 0.01);
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(14, columnMajorSparseMatrix0.rows());
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(14, columnMajorSparseMatrix0.columns());
      assertEquals(27, columnMajorSparseMatrix0.cardinality());
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(0.1377551020408163, columnMajorSparseMatrix0.density(), 0.01);
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(14, columnMajorSparseMatrix0.rows());
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(14, columnMajorSparseMatrix0.columns());
      assertEquals(27, columnMajorSparseMatrix0.cardinality());
      assertNotNull(eigenDecompositor0);
      
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(14);
      assertEquals(14, columnMajorSparseMatrix0.columns());
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(0.07142857142857142, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(14, columnMajorSparseMatrix0.cardinality());
      assertEquals(14, columnMajorSparseMatrix0.rows());
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertNotNull(columnMajorSparseMatrix0);
      
      CompressedVector compressedVector0 = (CompressedVector)columnMajorSparseMatrix0.getRow(14);
      assertEquals(14, columnMajorSparseMatrix0.columns());
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(0.07142857142857142, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(14, columnMajorSparseMatrix0.cardinality());
      assertEquals(14, columnMajorSparseMatrix0.rows());
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(14, compressedVector0.length());
      assertEquals(0, compressedVector0.cardinality());
      assertEquals(0.0, compressedVector0.density(), 0.01);
      assertNotNull(compressedVector0);
      
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      Object[] objectArray0 = linkedList0.toArray();
      assertEquals(0, linkedList0.size());
      assertNotNull(objectArray0);
      
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      assertNotNull(ooPlaceOuterProduct0);
      
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      assertEquals(0, hashMap0.size());
      assertTrue(hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      columnMajorSparseMatrix0.setColumn(3, (double) 3);
      assertEquals(14, columnMajorSparseMatrix0.columns());
      assertEquals(0.1377551020408163, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(27, columnMajorSparseMatrix0.cardinality());
      assertEquals(14, columnMajorSparseMatrix0.rows());
      assertEquals(3.0, columnMajorSparseMatrix0.max(), 0.01);
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
      assertEquals(14, columnMajorSparseMatrix0.columns());
      assertEquals(0.1377551020408163, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(27, columnMajorSparseMatrix0.cardinality());
      assertEquals(14, columnMajorSparseMatrix0.rows());
      assertEquals(3.0, columnMajorSparseMatrix0.max(), 0.01);
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertNotNull(eigenDecompositor0);
      
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(8);
      assertEquals(8, columnMajorSparseMatrix0.cardinality());
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(0.125, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(8, columnMajorSparseMatrix0.rows());
      assertEquals(8, columnMajorSparseMatrix0.columns());
      assertNotNull(columnMajorSparseMatrix0);
      
      CompressedVector compressedVector0 = (CompressedVector)columnMajorSparseMatrix0.getRow(8);
      assertEquals(8, columnMajorSparseMatrix0.cardinality());
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(0.125, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(8, columnMajorSparseMatrix0.rows());
      assertEquals(8, columnMajorSparseMatrix0.columns());
      assertEquals(0, compressedVector0.cardinality());
      assertEquals(0.0, compressedVector0.density(), 0.01);
      assertEquals(8, compressedVector0.length());
      assertNotNull(compressedVector0);
      
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      Object[] objectArray0 = linkedList0.toArray();
      assertEquals(0, linkedList0.size());
      assertNotNull(objectArray0);
      
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      assertNotNull(ooPlaceOuterProduct0);
      
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      assertEquals(0, hashMap0.size());
      assertTrue(hashMap0.isEmpty());
      assertNotNull(hashMap0);
      
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      assertEquals(0, linkedList1.size());
      assertTrue(linkedList1.equals((Object)linkedList0));
      assertNotNull(linkedList1);
      
      Stream<Integer> stream0 = linkedList1.stream();
      assertEquals(0, linkedList1.size());
      assertNotSame(linkedList1, linkedList0);
      assertTrue(linkedList1.equals((Object)linkedList0));
      assertNotNull(stream0);
      
      ListIterator<Integer> listIterator0 = linkedList0.listIterator();
      assertEquals(0, linkedList0.size());
      assertFalse(listIterator0.hasPrevious());
      assertFalse(listIterator0.hasNext());
      assertNotSame(linkedList0, linkedList1);
      assertTrue(linkedList0.equals((Object)linkedList1));
      assertNotNull(listIterator0);
      
      Object[] objectArray1 = linkedList1.toArray();
      assertEquals(0, linkedList1.size());
      assertNotSame(linkedList1, linkedList0);
      assertNotSame(objectArray1, objectArray0);
      assertTrue(linkedList1.equals((Object)linkedList0));
      assertFalse(objectArray1.equals((Object)objectArray0));
      assertNotNull(objectArray1);
      
      OoPlaceOuterProduct ooPlaceOuterProduct1 = new OoPlaceOuterProduct();
      assertFalse(ooPlaceOuterProduct1.equals((Object)ooPlaceOuterProduct0));
      assertNotNull(ooPlaceOuterProduct1);
      
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      assertEquals(0, hashMap1.size());
      assertTrue(hashMap1.isEmpty());
      assertTrue(hashMap1.equals((Object)hashMap0));
      assertNotNull(hashMap1);
      
      HashMap<Integer, Integer> hashMap2 = new HashMap<Integer, Integer>();
      assertEquals(0, hashMap2.size());
      assertTrue(hashMap2.isEmpty());
      assertTrue(hashMap2.equals((Object)hashMap1));
      assertTrue(hashMap2.equals((Object)hashMap0));
      assertNotNull(hashMap2);
      
      columnMajorSparseMatrix0.setColumn(3, (double) 3);
      assertEquals(0.234375, columnMajorSparseMatrix0.density(), 0.01);
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(15, columnMajorSparseMatrix0.cardinality());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(8, columnMajorSparseMatrix0.rows());
      assertEquals(3.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(8, columnMajorSparseMatrix0.columns());
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
      assertEquals(0.234375, columnMajorSparseMatrix0.density(), 0.01);
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(15, columnMajorSparseMatrix0.cardinality());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(8, columnMajorSparseMatrix0.rows());
      assertEquals(3.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(8, columnMajorSparseMatrix0.columns());
      assertNotNull(eigenDecompositor0);
      
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(0.234375, columnMajorSparseMatrix0.density(), 0.01);
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(15, columnMajorSparseMatrix0.cardinality());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(8, columnMajorSparseMatrix0.rows());
      assertEquals(3.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(8, columnMajorSparseMatrix0.columns());
      assertNotNull(matrixArray0);
      
      Matrix[] matrixArray1 = eigenDecompositor0.decompose();
      assertEquals(0.234375, columnMajorSparseMatrix0.density(), 0.01);
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(15, columnMajorSparseMatrix0.cardinality());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(8, columnMajorSparseMatrix0.rows());
      assertEquals(3.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(8, columnMajorSparseMatrix0.columns());
      assertNotSame(matrixArray1, matrixArray0);
      assertFalse(matrixArray1.equals((Object)matrixArray0));
      assertNotNull(matrixArray1);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ColumnMajorSparseMatrix columnMajorSparseMatrix0 = ColumnMajorSparseMatrix.identity(14);
      assertEquals(0.07142857142857142, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(14, columnMajorSparseMatrix0.rows());
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(14, columnMajorSparseMatrix0.columns());
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(14, columnMajorSparseMatrix0.cardinality());
      assertNotNull(columnMajorSparseMatrix0);
      
      CompressedVector compressedVector0 = (CompressedVector)columnMajorSparseMatrix0.getRow(14);
      assertEquals(0.07142857142857142, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(14, columnMajorSparseMatrix0.rows());
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(14, columnMajorSparseMatrix0.columns());
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertEquals(14, columnMajorSparseMatrix0.cardinality());
      assertEquals(14, compressedVector0.length());
      assertEquals(0.0, compressedVector0.density(), 0.01);
      assertEquals(0, compressedVector0.cardinality());
      assertNotNull(compressedVector0);
      
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      Stream<Integer> stream0 = linkedList0.parallelStream();
      assertEquals(0, linkedList0.size());
      assertNotNull(stream0);
      
      ListIterator<Integer> listIterator0 = linkedList0.listIterator();
      assertEquals(0, linkedList0.size());
      assertFalse(listIterator0.hasNext());
      assertFalse(listIterator0.hasPrevious());
      assertNotNull(listIterator0);
      
      Object[] objectArray0 = linkedList0.toArray();
      assertEquals(0, linkedList0.size());
      assertNotNull(objectArray0);
      
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      assertNotNull(ooPlaceOuterProduct0);
      
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      assertEquals(0, hashMap1.size());
      assertTrue(hashMap1.isEmpty());
      assertTrue(hashMap1.equals((Object)hashMap0));
      assertNotNull(hashMap1);
      
      columnMajorSparseMatrix0.setColumn(2, 1.0308639221868898E-18);
      assertEquals(14, columnMajorSparseMatrix0.rows());
      assertEquals(27, columnMajorSparseMatrix0.cardinality());
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(14, columnMajorSparseMatrix0.columns());
      assertEquals(0.1377551020408163, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(columnMajorSparseMatrix0);
      assertEquals(14, columnMajorSparseMatrix0.rows());
      assertEquals(27, columnMajorSparseMatrix0.cardinality());
      assertFalse(columnMajorSparseMatrix0.isRowMajor());
      assertEquals(0.0, columnMajorSparseMatrix0.min(), 0.01);
      assertEquals(14, columnMajorSparseMatrix0.columns());
      assertEquals(0.1377551020408163, columnMajorSparseMatrix0.density(), 0.01);
      assertEquals(1.0, columnMajorSparseMatrix0.max(), 0.01);
      assertNotNull(eigenDecompositor0);
      
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }
}