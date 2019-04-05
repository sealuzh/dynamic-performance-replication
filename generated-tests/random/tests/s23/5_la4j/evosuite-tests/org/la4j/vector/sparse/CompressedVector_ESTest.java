/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 08:07:45 GMT 2019
 */

package org.la4j.vector.sparse;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.BufferUnderflowException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
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
import org.la4j.vector.DenseVector;
import org.la4j.vector.SparseVector;
import org.la4j.vector.VectorFactory;
import org.la4j.vector.functor.VectorFunction;
import org.la4j.vector.functor.VectorProcedure;
import org.la4j.vector.sparse.CompressedVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CompressedVector_ESTest extends CompressedVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Integer, Double> hashMap0 = new HashMap<Integer, Double>();
      Integer integer0 = new Integer(9);
      Double double0 = new Double((-1.0));
      hashMap0.put(integer0, double0);
      // Undeclared exception!
      try { 
        CompressedVector.fromMap(hashMap0, 8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Check your map: Index must be 0..n-1
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)107;
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
  public void test02()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(2055, 2055);
      VectorIterator vectorIterator0 = compressedVector0.nonZeroIterator();
      assertNotNull(vectorIterator0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.zero(0, 920);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cardinality should be less then or equal to capacity: 920.
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.fromCSV("");
      assertEquals(Double.NaN, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(2055, 2055);
      VectorProcedure vectorProcedure0 = mock(VectorProcedure.class, new ViolatedAssumptionAnswer());
      compressedVector0.eachNonZero(vectorProcedure0);
      assertEquals(2055, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      Vector vector0 = compressedVector0.blankOfLength(0);
      assertEquals(4, compressedVector0.length());
      assertEquals(0, vector0.length());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(2055, 2055);
      Vector vector0 = compressedVector0.blankOfLength(1613);
      assertEquals(1613, vector0.length());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(1533);
      // Undeclared exception!
      try { 
        compressedVector0.updateAt((-1796), (VectorFunction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      int[] intArray0 = new int[3];
      CompressedVector compressedVector0 = new CompressedVector(1, 1, doubleArray0, intArray0);
      // Undeclared exception!
      try { 
        compressedVector0.to((VectorFactory<CompressedVector>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 1550);
      // Undeclared exception!
      try { 
        compressedVector0.set((-35), 1122.111550335091);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index '-35' is invalid.
         //
         verifyException("org.la4j.vector.SparseVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(907);
      // Undeclared exception!
      try { 
        compressedVector0.getOrElse((-2146222351), (-2146222351));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index '-2146222351' is invalid.
         //
         verifyException("org.la4j.vector.SparseVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.fromArray((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 1.0;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      DecimalFormat decimalFormat0 = new DecimalFormat("pa6)");
      String string0 = compressedVector0.mkString((NumberFormat) decimalFormat0, "pa6)");
      assertEquals("pa6)0pa6)pa6)1pa6)pa6)0pa6)pa6)0", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 857.63638;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(857.63638, (-2224.62655), 880.29883960335, (-1483.3), 857.63638).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.update(vectorFunction0);
      assertEquals(1.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.update(vectorFunction0);
      assertEquals(6, compressedVector0.length());
      assertEquals(0, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      int[] intArray0 = new int[6];
      CompressedVector compressedVector0 = new CompressedVector(1478, 3182, doubleArray0, intArray0);
      // Undeclared exception!
      try { 
        compressedVector0.subtract((Vector) compressedVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CompressedVector compressedVector0 = null;
      try {
        compressedVector0 = new CompressedVector(0, 8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cardinality should be less then or equal to capacity: 8.
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.zero(2029, (-525));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cardinality should be positive: -525.
         //
         verifyException("org.la4j.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<Integer, Long> hashMap0 = new HashMap<Integer, Long>();
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 2852);
      compressedVector0.set(2100, 1.0);
      assertEquals(1, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.fromCSV("9");
      assertEquals(1, compressedVector0.cardinality());
      
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.update(vectorFunction0);
      assertEquals(0, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 857.63638;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(857.63638).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.updateAt((-913), vectorFunction0);
      assertEquals(0.3333333333333333, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>();
      CompressedVector compressedVector0 = CompressedVector.fromCollection(linkedList0);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)170).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      // Undeclared exception!
      try { 
        compressedVector0.updateAt(170, vectorFunction0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // This vector can't grow up.
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(4386, 116);
      SparseVector sparseVector0 = compressedVector0.toSparseVector();
      assertEquals(0, sparseVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(2);
      DenseVector denseVector0 = compressedVector0.toDenseVector();
      assertEquals(2, denseVector0.length());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1202.7535276228;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      compressedVector0.nonZeroAt((-3610));
      assertEquals(0.16666666666666666, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = (double) 2;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      boolean boolean0 = compressedVector0.isZeroAt(2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(2, 2);
      boolean boolean0 = compressedVector0.nonZeroAt(2);
      assertFalse(boolean0);
      assertEquals(2, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(4386, 116);
      compressedVector0.setAll((-2146396314));
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)4386).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.updateAt(48, vectorFunction0);
      assertEquals(1.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(4386, 116);
      compressedVector0.setAll(2584.32418);
      VectorFunction vectorFunction0 = mock(VectorFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vectorFunction0).evaluate(anyInt() , anyDouble());
      compressedVector0.updateAt(48, vectorFunction0);
      assertEquals(0.9997720018239854, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-352.756);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      // Undeclared exception!
      try { 
        compressedVector0.eachNonZero((VectorProcedure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 1550);
      double double0 = compressedVector0.sum();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1550, compressedVector0.length());
      assertEquals(0.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>();
      Byte byte0 = new Byte((byte)16);
      linkedList0.add(byte0);
      CompressedVector compressedVector0 = CompressedVector.fromCollection(linkedList0);
      VectorProcedure vectorProcedure0 = mock(VectorProcedure.class, new ViolatedAssumptionAnswer());
      compressedVector0.each(vectorProcedure0);
      assertEquals(1.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HashMap<Integer, Byte> hashMap0 = new HashMap<Integer, Byte>();
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 268);
      CompressedVector compressedVector1 = (CompressedVector)compressedVector0.copyOfLength(32);
      assertEquals(32, compressedVector1.length());
      assertEquals(0.0, compressedVector0.density(), 0.01);
      assertEquals(0.0, compressedVector1.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = (-2105.80028);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      compressedVector0.swapElements(568, 3);
      assertEquals(0.25, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[2] = (-1735.3358900919);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      compressedVector0.swapElements(2, 290);
      assertEquals(0.125, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-352.756);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      compressedVector0.swapElements(2671, (-5307));
      assertEquals(0.25, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(2055, 2055);
      compressedVector0.setAll((-1261.8880745277));
      compressedVector0.swapElements(996, 2029);
      assertEquals(1.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>();
      Byte byte0 = new Byte((byte)16);
      linkedList0.add(byte0);
      CompressedVector compressedVector0 = CompressedVector.fromCollection(linkedList0);
      // Undeclared exception!
      try { 
        compressedVector0.swapElements((byte) (-86), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CompressedVector compressedVector0 = CompressedVector.zero(2, 2);
      compressedVector0.swapElements(3001, 3001);
      assertEquals(2, compressedVector0.length());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(1177);
      compressedVector0.setAll(0.0);
      assertEquals(0.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(4386, 116);
      compressedVector0.setAll((-2146396314));
      compressedVector0.set(116, (-464.9158));
      assertEquals(4386, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[3] = (-1448.2);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      compressedVector0.set(2, 0.0);
      assertEquals(1, compressedVector0.cardinality());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[3] = 2194.985948;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      // Undeclared exception!
      try { 
        compressedVector0.sliceLeft(2067);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index '7' is invalid.
         //
         verifyException("org.la4j.vector.SparseVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector(538);
      double double0 = compressedVector0.getOrElse(37, 538);
      assertEquals(538.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      HashMap<Integer, Byte> hashMap0 = new HashMap<Integer, Byte>();
      Integer integer0 = new Integer(2641);
      Byte byte0 = new Byte((byte)104);
      hashMap0.put(integer0, byte0);
      CompressedVector compressedVector0 = CompressedVector.fromMap(hashMap0, 8396);
      assertEquals(1.1910433539780847E-4, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      HashMap<Integer, Double> hashMap0 = new HashMap<Integer, Double>();
      Integer integer0 = new Integer((-1304));
      Double double0 = new Double((-2623.8273));
      hashMap0.put(integer0, double0);
      // Undeclared exception!
      try { 
        CompressedVector.fromMap(hashMap0, 561);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Check your map: Index must be 0..n-1
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      Integer integer0 = new Integer(2);
      hashMap0.put(integer0, integer0);
      // Undeclared exception!
      try { 
        CompressedVector.fromMap(hashMap0, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Check your map: Index must be 0..n-1
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-113.811612269339);
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      byte[] byteArray0 = compressedVector0.toBinary();
      CompressedVector compressedVector1 = CompressedVector.fromBinary(byteArray0);
      assertEquals(25, byteArray0.length);
      assertEquals(0.25, compressedVector1.density(), 0.01);
      assertTrue(compressedVector1.equals((Object)compressedVector0));
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
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
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      byte[] byteArray0 = compressedVector0.toBinary();
      CompressedVector compressedVector1 = CompressedVector.fromBinary(byteArray0);
      assertEquals(9, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)16, (byte)0, (byte)0, (byte)0, (byte)4, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(0.0, compressedVector1.density(), 0.01);
      assertEquals(4, compressedVector1.length());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 1.0;
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      VectorProcedure vectorProcedure0 = mock(VectorProcedure.class, new ViolatedAssumptionAnswer());
      compressedVector0.each(vectorProcedure0);
      assertEquals(0.25, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom(5);
      // Undeclared exception!
      try { 
        CompressedVector.random(5, (double) 5, (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The density value should be between 0 and 1.0
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((byte) (-86));
      CompressedVector compressedVector0 = CompressedVector.random(170, 1.0, (Random) mockRandom0);
      assertEquals(170, compressedVector0.length());
      assertEquals(1.0, compressedVector0.density(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom();
      // Undeclared exception!
      try { 
        CompressedVector.random(0, (-869.0794625), (Random) mockRandom0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The density value should be between 0 and 1.0
         //
         verifyException("org.la4j.vector.sparse.CompressedVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        CompressedVector.fromCSV("hqyNN$$|KM-gy");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
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
  public void test58()  throws Throwable  {
      CompressedVector compressedVector0 = new CompressedVector();
      VectorIterator vectorIterator0 = compressedVector0.iterator();
      assertNotNull(vectorIterator0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      CompressedVector compressedVector0 = CompressedVector.fromArray(doubleArray0);
      CompressedVector compressedVector1 = (CompressedVector)compressedVector0.copyOfLength(32);
      assertEquals(4, compressedVector0.length());
      assertEquals(0, compressedVector1.cardinality());
      assertEquals(32, compressedVector1.length());
  }
}