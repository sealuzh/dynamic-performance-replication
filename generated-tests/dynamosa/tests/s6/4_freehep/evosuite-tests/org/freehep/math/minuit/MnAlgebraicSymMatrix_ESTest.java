/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 15:11:34 GMT 2019
 */

package org.freehep.math.minuit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.freehep.math.minuit.MnAlgebraicSymMatrix;
import org.freehep.math.minuit.MnAlgebraicVector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnAlgebraicSymMatrix_ESTest extends MnAlgebraicSymMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.set(233, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(2);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.get((-2074), 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(1);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.get(1, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(9);
      mnAlgebraicSymMatrix0.invert();
      mnAlgebraicSymMatrix0.invert();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      int int0 = mnAlgebraicSymMatrix0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      int int0 = mnAlgebraicSymMatrix0.nrow();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(41);
      int int0 = mnAlgebraicSymMatrix0.nrow();
      assertEquals(41, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      int int0 = mnAlgebraicSymMatrix0.ncol();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      double[] doubleArray0 = mnAlgebraicSymMatrix0.data();
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(898);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.set(0, 898, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.get(909, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(898);
      double double0 = mnAlgebraicSymMatrix0.get(0, 416);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(197);
      // Undeclared exception!
      mnAlgebraicSymMatrix0.toString();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(1);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.set((-1733), (-1733), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1499045
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(30);
      // Undeclared exception!
      mnAlgebraicSymMatrix0.invert();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(41);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.get((-483), (-483));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.eigenvalues();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.set((-2676), 5, (-2676));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(22);
      mnAlgebraicSymMatrix0.set(2, 0, 22);
      MnAlgebraicVector mnAlgebraicVector0 = mnAlgebraicSymMatrix0.eigenvalues();
      assertNotNull(mnAlgebraicVector0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(1);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.set(1, 703, 1863.806);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(2);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.get((-1), 22);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(4);
      MnAlgebraicVector mnAlgebraicVector0 = mnAlgebraicSymMatrix0.eigenvalues();
      assertNotNull(mnAlgebraicVector0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(1);
      try { 
        mnAlgebraicSymMatrix0.invert();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(4);
      mnAlgebraicSymMatrix0.invert();
      // Undeclared exception!
      mnAlgebraicSymMatrix0.eigenvalues();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = null;
      try {
        mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix((-19));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid matrix size: -19
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(22);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix1 = mnAlgebraicSymMatrix0.clone();
      assertNotSame(mnAlgebraicSymMatrix1, mnAlgebraicSymMatrix0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(17);
      int int0 = mnAlgebraicSymMatrix0.size();
      assertEquals(153, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(1);
      int int0 = mnAlgebraicSymMatrix0.ncol();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(22);
      String string0 = mnAlgebraicSymMatrix0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(1);
      double[] doubleArray0 = mnAlgebraicSymMatrix0.data();
      assertEquals(1, doubleArray0.length);
  }
}
