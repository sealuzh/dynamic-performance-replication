/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:17:26 GMT 2018
 */

package org.la4j.decomposition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Matrix;
import org.la4j.decomposition.EigenDecompositor;
import org.la4j.matrix.DenseMatrix;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EigenDecompositor_ESTest extends EigenDecompositor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[][] doubleArray0 = new double[6][7];
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = null;
      try {
        eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
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
      DenseMatrix denseMatrix0 = DenseMatrix.constant(4, 4, 4);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(3);
      DenseMatrix denseMatrix0 = DenseMatrix.random(3, 3, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(8, 8, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      DenseMatrix denseMatrix0 = DenseMatrix.random(7, 7, mockRandom0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      Matrix[] matrixArray0 = eigenDecompositor0.decompose();
      assertNotNull(matrixArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double[][] doubleArray0 = new double[7][7];
      double[] doubleArray1 = new double[7];
      doubleArray1[1] = 1.191616393558691E-15;
      doubleArray0[4] = doubleArray1;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      eigenDecompositor0.decompose();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      double[][] doubleArray0 = new double[7][7];
      double[] doubleArray1 = new double[5];
      doubleArray1[1] = 7.892190988108138;
      doubleArray0[4] = doubleArray1;
      double[][] doubleArray2 = new double[5][5];
      double[] doubleArray3 = new double[9];
      doubleArray3[0] = 7.892190988108138;
      doubleArray3[5] = 7.892190988108138;
      doubleArray3[6] = 7.892190988108138;
      doubleArray3[7] = 7.892190988108138;
      doubleArray2[1] = doubleArray3;
      doubleArray2[2] = doubleArray1;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray2);
      EigenDecompositor eigenDecompositor0 = new EigenDecompositor(denseMatrix0);
      eigenDecompositor0.decompose();
      EigenDecompositor eigenDecompositor1 = new EigenDecompositor(denseMatrix0);
      eigenDecompositor0.decompose();
  }
}