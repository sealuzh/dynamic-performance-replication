/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 11:02:54 GMT 2018
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
  public void test00()  throws Throwable  {
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
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Regexp regexp1 = Simplify.simplify(regexp0);
      assertSame(regexp0, regexp1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[1];
      regexp0.max = (-574);
      regexp0.subs = regexpArray0;
      Regexp regexp1 = Simplify.simplify(regexp0);
      assertNotSame(regexp0, regexp1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[5];
      regexp0.min = 3583;
      regexp0.subs = regexpArray0;
      Regexp regexp1 = Simplify.simplify(regexp0);
      assertNotSame(regexp0, regexp1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[1];
      regexp0.subs = regexpArray0;
      Regexp regexp1 = Simplify.simplify(regexp0);
      assertSame(regexp1, regexp0);
      assertNotNull(regexp1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[4];
      regexp0.min = (-1474);
      regexp0.subs = regexpArray0;
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
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[7];
      regexp0.min = 7;
      Regexp.Op regexp_Op1 = Regexp.Op.WORD_BOUNDARY;
      regexp0.min = (-772);
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexp0.subs = regexpArray0;
      Regexp regexp2 = Simplify.simplify(regexp0);
      Simplify.simplify(regexp2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[7];
      Regexp.Op regexp_Op1 = Regexp.Op.WORD_BOUNDARY;
      regexp0.min = (-30);
      regexp0.subs = regexpArray0;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      Regexp regexp2 = Simplify.simplify(regexp0);
      Simplify.simplify(regexp2);
      Simplify.simplify(regexp2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      Regexp[] regexpArray0 = new Regexp[4];
      Regexp regexp2 = new Regexp(regexp0);
      regexpArray0[0] = regexp2;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp1;
      regexp0.flags = 17;
      regexp0.subs = regexpArray0;
      Regexp regexp3 = new Regexp(regexp0);
      Simplify.simplify(regexp0);
      Regexp regexp4 = Simplify.simplify(regexp1);
      regexp4.reinit();
      regexp4.flags = (-1648);
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      regexp2.flags = 1306;
      regexp4.op = regexp_Op1;
      regexp1.subs = regexp0.subs;
      // Undeclared exception!
      try { 
        Simplify.simplify(regexp4);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[9];
      regexp0.subs = regexpArray0;
      regexp0.min = 1;
      Simplify.simplify(regexp0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[9];
      regexp0.max = 1;
      regexp0.max = 1;
      regexp0.subs = regexpArray0;
      regexp0.min = 1;
      Simplify.simplify(regexp0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[7];
      regexp0.min = (-1);
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[5] = regexp0;
      regexp0.flags = (-25);
      regexpArray0[6] = regexp0;
      regexp0.subs = regexpArray0;
      Simplify.simplify(regexp0);
      Regexp regexp2 = Simplify.simplify(regexp0);
      Simplify.simplify(regexp2);
  }
}