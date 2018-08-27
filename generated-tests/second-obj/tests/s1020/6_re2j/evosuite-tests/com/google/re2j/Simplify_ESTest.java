/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 07:06:31 GMT 2018
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
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
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
  public void test1()  throws Throwable  {
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
  public void test2()  throws Throwable  {
      Regexp[] regexpArray0 = new Regexp[6];
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
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
  public void test4()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
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
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.name = "";
      Simplify.simplify(regexp0);
      regexp0.min = (-53);
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
  public void test6()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[9];
      intArray0[1] = 4;
      intArray0[3] = 4;
      intArray0[7] = 4;
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      regexp0.equals(intArray0);
      regexp0.reinit();
      regexp1.op = regexp_Op1;
      regexp1.cap = 1867;
      regexp0.max = 4;
      Regexp regexp2 = new Regexp(regexp_Op0);
      regexp1.name = "ji\"";
      Regexp[] regexpArray0 = new Regexp[3];
      regexp1.subs = regexpArray0;
      Regexp regexp3 = new Regexp(regexp_Op0);
      Regexp regexp4 = Simplify.simplify(regexp1);
      Regexp regexp5 = Simplify.simplify(regexpArray0[2]);
      Simplify.simplify(regexp4);
      Regexp regexp6 = new Regexp(regexp4);
      Simplify.simplify(regexp6);
      Regexp regexp7 = new Regexp(regexp0);
      regexp7.name = "ji\"";
      Simplify.simplify(regexp7);
      Simplify.simplify(regexp5);
      Regexp regexp8 = Simplify.simplify((Regexp) null);
      assertNull(regexp8);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      regexp0.max = 4;
      Regexp regexp2 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[9];
      intArray0[0] = 4;
      intArray0[1] = 4;
      intArray0[2] = 4;
      intArray0[3] = 4;
      intArray0[4] = 4;
      intArray0[5] = 4;
      intArray0[6] = 4;
      intArray0[7] = 2148;
      intArray0[8] = 4;
      regexp0.runes = intArray0;
      regexp0.max = 63;
      Regexp regexp3 = Simplify.simplify(regexp2);
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      regexp2.reinit();
      regexp3.op = regexp_Op1;
      regexp2.max = 2148;
      Regexp regexp4 = Simplify.simplify(regexp1);
      regexp4.min = 63;
      Simplify.simplify(regexp3);
      Regexp[] regexpArray0 = new Regexp[3];
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp4;
      regexpArray0[2] = regexp2;
      regexp3.subs = regexpArray0;
      Regexp regexp5 = new Regexp(regexp_Op0);
      Simplify.simplify(regexp5);
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp2);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.equals("com.google.re2j.Simplify$1");
      Regexp regexp1 = Simplify.simplify(regexp0);
      Simplify.simplify(regexp1);
      Simplify.simplify(regexp0);
      Simplify.simplify(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp2 = new Regexp(regexp_Op1);
      Simplify.simplify(regexp2);
      Simplify.simplify(regexp0);
      Regexp regexp3 = Simplify.simplify(regexp0);
      Regexp regexp4 = new Regexp(regexp3);
      regexp0.max = (-2138);
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
}