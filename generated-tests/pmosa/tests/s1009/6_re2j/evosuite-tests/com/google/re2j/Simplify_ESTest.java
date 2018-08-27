/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 13:52:40 GMT 2018
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
  public void test1()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      regexp0.op = regexp_Op1;
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
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.ALTERNATE;
      regexp0.op = regexp_Op1;
      Regexp[] regexpArray0 = new Regexp[3];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp0;
      regexp0.reinit();
      regexp1.reinit();
      regexp0.subs = regexpArray0;
      regexp1.equals(regexp_Op0);
      regexp0.subs = regexpArray0;
      regexp0.name = "";
      regexp1.cap = (-1330);
      regexp0.max = (-1330);
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
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
  public void test4()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.ALTERNATE;
      regexp0.op = regexp_Op1;
      Regexp[] regexpArray0 = new Regexp[13];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp0;
      regexp0.reinit();
      regexp1.reinit();
      Regexp regexp2 = Simplify.simplify(regexp0);
      Regexp regexp3 = Simplify.simplify(regexp2);
      Regexp regexp4 = new Regexp(regexp1);
      Regexp regexp5 = Simplify.simplify(regexp4);
      Regexp regexp6 = Simplify.simplify(regexp3);
      Regexp.Op regexp_Op2 = Regexp.Op.CONCAT;
      regexp5.cap = (-481);
      Regexp regexp7 = new Regexp(regexp_Op2);
      Regexp regexp8 = Simplify.simplify(regexp5);
      Regexp regexp9 = new Regexp(regexp0);
      Simplify.simplify(regexp8);
      Simplify.simplify(regexp6);
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp7);
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
      Regexp regexp1 = Simplify.simplify(regexp0);
      regexp0.max = 2492;
      Regexp regexp2 = Simplify.simplify(regexp1);
      regexp2.name = "5D<#[|+5.8'zQ~Dvyb";
      Simplify.simplify(regexp2);
      Regexp regexp3 = Simplify.simplify(regexp2);
      regexp2.equals(regexp1);
      Regexp regexp4 = Simplify.simplify(regexp2);
      Regexp regexp5 = Simplify.simplify(regexp4);
      int[] intArray0 = new int[3];
      intArray0[0] = 2492;
      intArray0[1] = 2492;
      regexp1.name = "f";
      intArray0[2] = 7;
      regexp4.runes = intArray0;
      Regexp regexp6 = Simplify.simplify(regexp1);
      Regexp regexp7 = new Regexp(regexp6);
      Regexp regexp8 = new Regexp(regexp5);
      Simplify.simplify(regexp7);
      Simplify.simplify(regexp3);
      Regexp regexp9 = new Regexp(regexp0);
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[5];
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = Simplify.simplify(regexp1);
      assertNotNull(regexp2);
      
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      Regexp regexp3 = Simplify.simplify(regexp2);
      regexpArray0[4] = regexp3;
      regexp0.subs = regexpArray0;
      regexp0.min = 38;
      Regexp regexp4 = Simplify.simplify(regexp0);
      Regexp regexp5 = Simplify.simplify(regexp4);
      assertSame(regexp5, regexp4);
      assertFalse(regexp5.equals((Object)regexp3));
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.ALTERNATE;
      regexp0.op = regexp_Op1;
      Regexp[] regexpArray0 = new Regexp[11];
      regexpArray0[7] = regexp0;
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp0;
      regexp0.reinit();
      regexp1.reinit();
      regexp0.subs = regexpArray0;
      regexp1.min = (-822);
      regexp1.equals(regexp_Op0);
      regexp0.subs = regexpArray0;
      regexp0.name = "";
      regexp1.cap = (-1330);
      regexp0.max = (-1330);
      // Undeclared exception!
      Simplify.simplify(regexp1);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
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
  public void test9()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[5];
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = Simplify.simplify(regexp1);
      regexpArray0[0] = regexp2;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      Regexp regexp3 = Simplify.simplify(regexp0);
      regexpArray0[3] = regexp3;
      Regexp regexp4 = Simplify.simplify(regexp3);
      regexpArray0[4] = regexp4;
      regexp0.subs = regexpArray0;
      regexp0.min = 38;
      Regexp regexp5 = Simplify.simplify(regexp0);
      Regexp regexp6 = Simplify.simplify(regexp5);
      assertSame(regexp6, regexp5);
      assertFalse(regexp6.equals((Object)regexp3));
  }
}