/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 16:43:50 GMT 2018
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.Regexp;
import com.google.re2j.Simplify;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Simplify_ESTest extends Simplify_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = Simplify.simplify(regexp1);
      assertSame(regexp2, regexp1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[10];
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      assertFalse(regexp1.equals((Object)regexp0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp regexp2 = Simplify.simplify(regexp1);
      assertSame(regexp2, regexp0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = 2466;
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.reinit();
      Regexp regexp2 = Simplify.simplify(regexp1);
      regexp1.toString();
      Regexp[] regexpArray0 = new Regexp[8];
      regexpArray0[1] = regexp2;
      regexpArray0[2] = regexp2;
      regexpArray0[4] = regexp0;
      Regexp regexp3 = Simplify.simplify(regexp0);
      regexpArray0[6] = regexp3;
      regexpArray0[7] = regexp2;
      regexp1.subs = regexpArray0;
      Regexp.Op regexp_Op1 = Regexp.Op.PLUS;
      regexp1.op = regexp_Op1;
      Regexp regexp4 = Simplify.simplify(regexp0);
      regexp4.subs = regexp1.subs;
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Simplify", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.max = 577;
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.op = regexp_Op0;
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.reinit();
      Regexp regexp2 = Simplify.simplify(regexp1);
      Simplify.simplify(regexp2);
      regexp1.toString();
      Regexp[] regexpArray0 = new Regexp[8];
      regexpArray0[1] = regexp2;
      regexpArray0[2] = regexp2;
      regexpArray0[3] = regexp1;
      regexpArray0[4] = regexp0;
      Regexp regexp3 = Simplify.simplify(regexp0);
      Simplify.simplify(regexp1);
      Simplify.simplify(regexp0);
      regexp3.subs = regexpArray0;
      Simplify.simplify(regexp1);
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp3);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}