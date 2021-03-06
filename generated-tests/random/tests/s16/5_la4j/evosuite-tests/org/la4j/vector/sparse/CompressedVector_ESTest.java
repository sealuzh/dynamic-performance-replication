/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 00:48:19 GMT 2019
 */

package org.la4j.vector.sparse;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferUnderflowException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;
import org.la4j.Vector;
import org.la4j.iterator.VectorIterator;
import org.la4j.matrix.RowMajorSparseMatrix;
import org.la4j.vector.SparseVector;
import org.la4j.vector.VectorFactory;
import org.la4j.vector.functor.VectorFunction;
import org.la4j.vector.functor.VectorProcedure;
import org.la4j.vector.sparse.CompressedVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CompressedVector_ESTest extends CompressedVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = (-1892.0721248637042);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (-627.7549348208), 637.2741, 1898.792164724, 1898.792164724).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.update(vectorFunction0);
      assertEquals(6, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1871.7759724281477);
      doubleArray0[1] = (-1490.407592312533);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      String string0 = compressedVector0.toMatrixMarket();
      assertEquals("%%MatrixMarket vector coordinate real\n3 2\n1 -1871.776\n2 -1490.408\n", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-2390.730668956764);
      doubleArray0[2] = (-152.73250790715);
      doubleArray0[3] = 386.22365052812563;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.updateAt(2, vectorFunction0);
      assertEquals(0.5, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-2390.730668956764);
      doubleArray0[2] = (-152.73250790715);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      assertEquals(2, compressedVector0.cardinality());
      
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.updateAt(2, vectorFunction0);
      assertEquals(1, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      CompressedVector compressedVector0 = CompressedVector.fromCollection(linkedList0);
      CompressedVector compressedVector1 = (CompressedVector)compressedVector0.copyOfLength(214);
      assertEquals(214, compressedVector1.length());
      assertEquals(0, compressedVector1.cardinality());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-2424.0);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorFactory<CompressedVector> vectorFactory0 = (VectorFactory<CompressedVector>) mock(VectorFactory.class, new ViolatedAssumptionAnswer());
      doReturn(compressedVector0).when(vectorFactory0).apply(anyInt());
      CompressedVector compressedVector1 = compressedVector0.to(vectorFactory0);
      assertEquals(0.14285714285714285, compressedVector1.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)23;
      // Undeclared exception!
      try { 
        CompressedVector.fromBinary(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can not decode CompressedVector from the given byte array.
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<Float> linkedList0 = new LinkedList<Float>();
      CompressedVector compressedVector0 = CompressedVector.fromCollection(linkedList0);
      compressedVector0.nonZeroIterator();
      assertEquals(Double.NaN, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector();
      VectorIterator vectorIterator0 = compressedVector0.iterator();
      assertNotNull(vectorIterator0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (-0.9542314416975383);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      double double0 = compressedVector0.getOrElse(3, 1502.726653135);
      assertEquals((-0.9542314416975383), double0, 0.01);
      assertEquals(0.25, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.zero((-708), 32);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong vector length: -708
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.random(29, (-2247.84646212), (Random) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The density value should be between 0 and 1.0
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      CompressedVector compressedVector0 = CompressedVector.random(1628, 0.0, (Random) mockRandom0);
      assertEquals(0.0, compressedVector0.density(), 0.01);
      assertEquals(1628, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 632);
      assertEquals(0.0, compressedVector0.density(), 0.01);
      assertEquals(632, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      assertEquals(0, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorProcedure vectorProcedure0 = mock(VectorProcedure.class, new ViolatedAssumptionAnswer());
      compressedVector0.each(vectorProcedure0);
      assertEquals(6, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(0, 0);
      CompressedVector compressedVector1 = (CompressedVector)compressedVector0.blankOfLength(0);
      assertEquals(Double.NaN, compressedVector1.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(452, 452);
      Vector vector0 = compressedVector0.blankOfLength(4443);
      assertEquals(4443, vector0.length());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.zero((-799));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong vector length: -799
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1.0;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorFactory<CompressedVector> vectorFactory0 = (VectorFactory<CompressedVector>) mock(VectorFactory.class, new ViolatedAssumptionAnswer());
      doReturn((Vector) null).when(vectorFactory0).apply(anyInt());
      // Undeclared exception!
      try { 
        compressedVector0.to(vectorFactory0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.SparseVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      int[] intArray0 = new int[0];
      CompressedVector compressedVector0 = new CompressedVector(13, 981, doubleArray0, intArray0);
      // Undeclared exception!
      try { 
        compressedVector0.set(13, (-1560.82449796));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index '13' is invalid.
         //
         verifyException("org.la4j.vector.SparseVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      // Undeclared exception!
      try { 
        compressedVector0.getOrElse(1004, 1137.140238);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index '1004' is invalid.
         //
         verifyException("org.la4j.vector.SparseVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.fromMatrixMarket((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.fromCollection((Collection<? extends Number>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.dense.BasicVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.fromCSV("2yQ#raVvuEh(dtJl[.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)16;
      // Undeclared exception!
      try { 
        CompressedVector.fromBinary(byteArray0);
        fail("Expecting exception: BufferUnderflowException");
      
      } catch(BufferUnderflowException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(2141, 1326);
      // Undeclared exception!
      try { 
        compressedVector0.each((VectorProcedure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(130, 130);
      // Undeclared exception!
      try { 
        compressedVector0.copyOfLength((-2024));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Wrong vector length: -2024
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      int[] intArray0 = new int[7];
      CompressedVector compressedVector0 = new CompressedVector(1679, (-1), doubleArray0, intArray0);
      // Undeclared exception!
      try { 
        compressedVector0.copyOfLength(470);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      SparseVector sparseVector0 = compressedVector0.toSparseVector();
      assertEquals(3, sparseVector0.length());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1898.792164724;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (-627.7549348208), 637.2741, 1898.792164724, 1898.792164724).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.update(vectorFunction0);
      assertEquals(6, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1898.792164724;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      assertEquals(1, compressedVector0.cardinality());
      
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.update(vectorFunction0);
      assertEquals(0, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(32);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)32, 365.508, (-1.0), (double)32, (double)32).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.update(vectorFunction0);
      assertEquals(1.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 3594.863;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      CompressedVector compressedVector1 = (CompressedVector)compressedVector0.add((Vector) compressedVector0);
      assertEquals(0.2, compressedVector1.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.zero(7, 8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cardinality should be less then or equal to capacity: 8.
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.zero(32, (-2623));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cardinality should be positive: -2623.
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 420.976075033744;
      doubleArray0[1] = (-0.9542314416975383);
      doubleArray0[2] = (-2991.2299135956);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.updateAt((-708), vectorFunction0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      double[] doubleArray0 = new double[6];
      linkedList0.add((Double) doubleArray0[2]);
      CompressedVector compressedVector0 = CompressedVector.fromCollection(linkedList0);
      assertEquals(1, compressedVector0.length());
      assertEquals(0, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (-3283.0);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      boolean boolean0 = compressedVector0.nonZeroAt(3);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      boolean boolean0 = compressedVector0.nonZeroAt((-2983));
      assertFalse(boolean0);
      assertEquals(0.25, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedList<Long> linkedList0 = new LinkedList<Long>();
      CompressedVector compressedVector0 = CompressedVector.fromCollection(linkedList0);
      boolean boolean0 = compressedVector0.nonZeroAt(6);
      assertFalse(boolean0);
      assertEquals(Double.NaN, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(547.817096234461).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.updateAt((-708), vectorFunction0);
      VectorFunction vectorFunction1 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2991.2299135956)).when(vectorFunction1).evaluate(anyInt() , anyDouble());
      compressedVector0.updateAt((-708), vectorFunction1);
      assertEquals(1, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      CompressedVector compressedVector0 = CompressedVector.fromCollection(linkedList0);
      // Undeclared exception!
      try { 
        compressedVector0.updateAt(2742, (VectorFunction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-3440.6236);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      double double0 = compressedVector0.norm();
      assertEquals(3440.6236, double0, 0.01);
      assertEquals(8, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 831.311023911288;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      double double0 = compressedVector0.product();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.16666666666666666, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(452, 452);
      CompressedVector compressedVector1 = (CompressedVector)compressedVector0.shuffle();
      assertEquals(452, compressedVector1.length());
      assertEquals(0, compressedVector1.cardinality());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 5094.9775618;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      compressedVector0.swapElements(32, (-855));
      assertEquals(0.3333333333333333, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(23);
      compressedVector0.setAll(4.0);
      // Undeclared exception!
      try { 
        compressedVector0.swapElements(1840700269, 12);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-3440.6236);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      compressedVector0.swapElements((-379), 2125);
      assertEquals(0.125, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[4] = 1.0;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      compressedVector0.swapElements(4, 345);
      assertEquals(0.1111111111111111, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(23);
      compressedVector0.swapElements(1840700269, 12);
      assertEquals(23, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      int[] intArray0 = new int[7];
      CompressedVector compressedVector0 = new CompressedVector(3760, 1592, doubleArray0, intArray0);
      compressedVector0.setAll(3760);
      assertEquals(3760, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(152, 152);
      compressedVector0.setAll(0.0);
      assertEquals(0, compressedVector0.cardinality());
      assertEquals(152, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(152, 152);
      compressedVector0.setAll((-2202.62931904));
      assertEquals(152, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-315.469728340613);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      assertEquals(1, compressedVector0.cardinality());
      
      compressedVector0.set(0, 0);
      assertEquals(0, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      int[] intArray0 = new int[6];
      intArray0[2] = 1843;
      CompressedVector compressedVector0 = new CompressedVector(1843, 3, doubleArray0, intArray0);
      compressedVector0.set(958, (-4962.25691268894));
      assertEquals(4, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1.0;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorFactory<CompressedVector> vectorFactory0 = (VectorFactory<CompressedVector>) mock(VectorFactory.class, new ViolatedAssumptionAnswer());
      doReturn(compressedVector0).when(vectorFactory0).apply(anyInt());
      CompressedVector compressedVector1 = compressedVector0.to(vectorFactory0);
      assertEquals(0.14285714285714285, compressedVector1.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      RowMajorSparseMatrix rowMajorSparseMatrix0 = RowMajorSparseMatrix.identity(309);
      // Undeclared exception!
      rowMajorSparseMatrix0.removeLastColumn();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      HashMap<Integer, Float> hashMap0 = new HashMap<Integer, Float>();
      Integer integer0 = new Integer(6);
      Float float0 = new Float(0.0F);
      hashMap0.put(integer0, float0);
      // Undeclared exception!
      try { 
        CompressedVector.fromMap(hashMap0, (-1493));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Check your map: Index must be 0..n-1
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      HashMap<Integer, Short> hashMap0 = new HashMap<Integer, Short>();
      Integer integer0 = new Integer((-611));
      hashMap0.put(integer0, (Short) null);
      // Undeclared exception!
      try { 
        CompressedVector.fromMap(hashMap0, (-4498));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Check your map: Index must be 0..n-1
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      Integer integer0 = new Integer(8);
      hashMap0.put(integer0, integer0);
      SparseVector sparseVector0 = SparseVector.fromMap(hashMap0, 1001);
      assertEquals(9.99000999000999E-4, sparseVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      byte[] byteArray0 = compressedVector0.toBinary();
      CompressedVector compressedVector1 = CompressedVector.fromBinary(byteArray0);
      assertEquals(25, byteArray0.length);
      assertEquals(0.25, compressedVector0.density(), 0.01);
      assertEquals(1, compressedVector1.cardinality());
      assertTrue(compressedVector1.equals((Object)compressedVector0));
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        CompressedVector.fromBinary(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can not decode CompressedVector from the given byte array.
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        CompressedVector.random(1161, 913.6179051, (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The density value should be between 0 and 1.0
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(16);
      CompressedVector compressedVector0 = CompressedVector.random(16, 1.0, (Random) mockRandom0);
      assertEquals(1.0, compressedVector0.density(), 0.01);
      assertEquals(16, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(0L);
      // Undeclared exception!
      try { 
        CompressedVector.random((-2146282354), (double) (-2146282354), (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The density value should be between 0 and 1.0
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.fromCSV("");
      assertEquals(0, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.fromMatrixMarket("%%MatrixMarket vector coordinate real\n3 3\n1 -1871.776\n2 -1490.408\n3 572.418\n");
      assertEquals(1.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector();
      byte[] byteArray0 = compressedVector0.toBinary();
      CompressedVector compressedVector1 = CompressedVector.fromBinary(byteArray0);
      assertEquals(9, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)16, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0, compressedVector1.length());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      byte[] byteArray0 = compressedVector0.toBinary();
      CompressedVector compressedVector1 = CompressedVector.fromBinary(byteArray0);
      assertEquals(4, compressedVector1.length());
      assertEquals(9, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)16, (byte)0, (byte)0, (byte)0, (byte)4, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }
}
