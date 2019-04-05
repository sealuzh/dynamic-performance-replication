/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 12:01:33 GMT 2019
 */

package org.freehep.math.minuit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.freehep.math.minuit.MnAlgebraicSymMatrix;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MnAlgebraicSymMatrix_ESTest extends MnAlgebraicSymMatrix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(1);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix1 = mnAlgebraicSymMatrix0.clone();
      mnAlgebraicSymMatrix1.toString();
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix2 = mnAlgebraicSymMatrix1.clone();
      try { 
        mnAlgebraicSymMatrix2.invert();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          int int0 = 36;
          MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(36);
          mnAlgebraicSymMatrix0.eigenvalues();
          mnAlgebraicSymMatrix0.set(4, 1, 36);
          mnAlgebraicSymMatrix0.eigenvalues();
          mnAlgebraicSymMatrix0.toString();
          mnAlgebraicSymMatrix0.data();
          mnAlgebraicSymMatrix0.ncol();
          MnAlgebraicSymMatrix mnAlgebraicSymMatrix1 = mnAlgebraicSymMatrix0.clone();
          mnAlgebraicSymMatrix0.toString();
          mnAlgebraicSymMatrix0.data();
          mnAlgebraicSymMatrix1.nrow();
          int int1 = (-194);
          int int2 = 1;
          mnAlgebraicSymMatrix0.toString();
          double double0 = (-1.0);
          int int3 = 2;
          MnAlgebraicSymMatrix mnAlgebraicSymMatrix2 = mnAlgebraicSymMatrix0.clone();
          // Undeclared exception!
          try { 
            mnAlgebraicSymMatrix2.set((-194), 36, 36);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
          
          } catch(ArrayIndexOutOfBoundsException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 3;
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(3);
      mnAlgebraicSymMatrix0.eigenvalues();
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix1 = mnAlgebraicSymMatrix0.clone();
      mnAlgebraicSymMatrix0.eigenvalues();
      mnAlgebraicSymMatrix1.eigenvalues();
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix2 = mnAlgebraicSymMatrix1.clone();
      mnAlgebraicSymMatrix2.toString();
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix3 = mnAlgebraicSymMatrix2.clone();
      int int1 = 3294;
      mnAlgebraicSymMatrix3.clone();
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix3.set((-1982), 3294, 1728.854);
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
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(2);
      int int0 = (-1583);
      int int1 = 0;
      int int2 = 0;
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.get(0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = (-2047);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = null;
      try {
        mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix((-2047));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid matrix size: -2047
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = 2;
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(2);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix1 = mnAlgebraicSymMatrix0.clone();
      int int1 = 3126;
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix1.get(2, 3126);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      mnAlgebraicSymMatrix0.clone();
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
  public void test07()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix1 = mnAlgebraicSymMatrix0.clone();
      int int0 = 0;
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix1.get(0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(5);
      mnAlgebraicSymMatrix0.clone();
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix1 = mnAlgebraicSymMatrix0.clone();
      mnAlgebraicSymMatrix1.ncol();
      mnAlgebraicSymMatrix1.eigenvalues();
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix1.set(5, 60, 1.0E-6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = 3;
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(3);
      mnAlgebraicSymMatrix0.invert();
      // Undeclared exception!
      mnAlgebraicSymMatrix0.eigenvalues();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(0);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix1 = mnAlgebraicSymMatrix0.clone();
      mnAlgebraicSymMatrix1.size();
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.set(4, 0, 0);
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
      int int0 = 16;
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(16);
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix1 = mnAlgebraicSymMatrix0.clone();
      mnAlgebraicSymMatrix1.clone();
      mnAlgebraicSymMatrix1.eigenvalues();
      mnAlgebraicSymMatrix0.invert();
      int int1 = (-911);
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.set((-911), (-911), 16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 413594
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(48);
      mnAlgebraicSymMatrix0.eigenvalues();
      // Undeclared exception!
      try { 
        mnAlgebraicSymMatrix0.get(2660, 48);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.freehep.math.minuit.MnAlgebraicSymMatrix", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = 874;
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(874);
      mnAlgebraicSymMatrix0.clone();
      mnAlgebraicSymMatrix0.clone();
      // Undeclared exception!
      mnAlgebraicSymMatrix0.eigenvalues();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = 425;
      MnAlgebraicSymMatrix mnAlgebraicSymMatrix0 = new MnAlgebraicSymMatrix(425);
      // Undeclared exception!
      mnAlgebraicSymMatrix0.toString();
  }
}
