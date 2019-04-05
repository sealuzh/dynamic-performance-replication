/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 12:12:59 GMT 2019
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.EigenDecompositor;
import org.la4j.matrix.DenseMatrix;
import org.la4j.matrix.SparseMatrix;
import org.la4j.operation.ooplace.OoPlaceKroneckerProduct;
import org.la4j.operation.ooplace.OoPlaceOuterProduct;
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      SparseMatrix sparseMatrix0 = SparseMatrix.randomSymmetric(0, 1274.67352, (Random) mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(sparseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.diagonal(0, 0.0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(denseMatrix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(5, 5, mockRandom0);
      OoPlaceKroneckerProduct ooPlaceKroneckerProduct0 = new OoPlaceKroneckerProduct();
      Matrix matrix0 = ooPlaceKroneckerProduct0.applyCommon(denseMatrix0, denseMatrix0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(matrix0);
      // Undeclared exception!
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(37, 37, 37);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      // Undeclared exception!
      try { 
        eigenDecompositor0.applicableTo((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.decomposition.EigenDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EigenDecompositor eigenDecompositor0 = null;
      try {
        eigenDecompositor0 = new EigenDecompositor((Matrix) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.decomposition.EigenDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OoPlaceOuterProduct ooPlaceOuterProduct0 = new OoPlaceOuterProduct();
      MockRandom mockRandom0 = new MockRandom(1624);
      DenseVector denseVector0 = DenseVector.random(1624, mockRandom0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SparseVector sparseVector0 = SparseVector.fromCollection(linkedList0);
      Matrix matrix0 = ooPlaceOuterProduct0.apply(denseVector0, sparseVector0);
      EigenDecompositor eigenDecompositor0 = null;
      try {
        eigenDecompositor0 = new EigenDecompositor(matrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Given matrix can not be used with this decompositor.
         //
         verifyException("org.la4j.decomposition.AbstractDecompositor", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(8);
      mockRandom0.nextLong();
      mockRandom0.nextInt();
      DenseMatrix denseMatrix0 = DenseMatrix.random(8, 8, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix.random(7, 7, mockRandom0);
      DenseMatrix denseMatrix0 = DenseMatrix.random(7, 7, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(8);
      byte[] byteArray0 = new byte[2];
      mockRandom0.nextBytes(byteArray0);
      DenseMatrix denseMatrix0 = DenseMatrix.random(8, 8, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(10, 10, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(8, 8, 8);
      Matrix matrix0 = denseMatrix0.removeLastRow();
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      boolean boolean0 = eigenDecompositor0.applicableTo(matrix0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(8, 8, 8);
      Matrix matrix0 = denseMatrix0.removeLastRow();
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      eigenDecompositor0.matrix = matrix0;
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
  public void test12()  throws Throwable  {
      DenseMatrix denseMatrix0 = DenseMatrix.constant(8, 8, 8);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertEquals(2, matrixArray0.length);
  }
}
