/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 18:38:52 GMT 2018
 */

package org.la4j.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Vector;
import org.la4j.linear.ForwardBackSubstitutionSolver;
import org.la4j.matrix.DenseMatrix;
import org.la4j.vector.SparseVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForwardBackSubstitutionSolver_ESTest extends ForwardBackSubstitutionSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[][] doubleArray0 = new double[9][7];
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (-993.5091059693941);
      doubleArray1[1] = 0.0;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[5];
      doubleArray2[0] = 0.0;
      doubleArray2[1] = 0.0;
      doubleArray2[2] = 0.0;
      doubleArray2[3] = (-993.5091059693941);
      doubleArray2[4] = (-993.5091059693941);
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[0];
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[1];
      doubleArray4[0] = (-993.5091059693941);
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[3];
      doubleArray5[0] = (-902.4);
      doubleArray5[1] = (-993.5091059693941);
      doubleArray5[2] = 0.0;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[2];
      doubleArray6[0] = (-902.4);
      doubleArray6[1] = (-902.4);
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[7];
      doubleArray7[0] = 0.0;
      doubleArray7[1] = (-993.5091059693941);
      doubleArray7[2] = 0.0;
      doubleArray7[3] = (-993.5091059693941);
      doubleArray7[4] = (-993.5091059693941);
      doubleArray7[5] = 0.0;
      doubleArray7[6] = 0.0;
      doubleArray0[6] = doubleArray7;
      double[] doubleArray8 = new double[4];
      doubleArray8[0] = 0.0;
      doubleArray8[1] = (-993.5091059693941);
      doubleArray8[2] = 0.0;
      doubleArray8[3] = 0.0;
      doubleArray0[7] = doubleArray8;
      double[] doubleArray9 = new double[6];
      doubleArray9[0] = 0.0;
      doubleArray9[1] = (-993.5091059693941);
      doubleArray9[2] = 0.0;
      doubleArray9[3] = 0.0;
      doubleArray9[4] = (-993.5091059693941);
      doubleArray9[5] = (-993.5091059693941);
      doubleArray0[8] = doubleArray9;
      DenseMatrix denseMatrix0 = DenseMatrix.from2DArray(doubleArray0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = null;
      try {
        forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(denseMatrix0);
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
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.nextLong();
      mockRandom0.ints(582L, (-752), 2);
      DenseMatrix denseMatrix0 = DenseMatrix.randomSymmetric(2, mockRandom0);
      ForwardBackSubstitutionSolver forwardBackSubstitutionSolver0 = new ForwardBackSubstitutionSolver(denseMatrix0);
      SparseVector sparseVector0 = SparseVector.zero(2, 2);
      forwardBackSubstitutionSolver0.applicableTo(denseMatrix0);
      forwardBackSubstitutionSolver0.solve(sparseVector0);
      // Undeclared exception!
      try { 
        SparseVector.zero((-752));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong vector length: -752
         //
         verifyException("org.la4j.Vector", e);
      }
  }
}