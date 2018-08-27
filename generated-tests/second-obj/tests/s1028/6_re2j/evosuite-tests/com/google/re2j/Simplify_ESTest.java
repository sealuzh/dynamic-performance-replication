/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 13:43:48 GMT 2018
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
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.max = (-31);
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
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      int[] intArray0 = new int[2];
      intArray0[0] = (-1207);
      intArray0[1] = (-1207);
      regexp0.max = (-2028);
      Regexp regexp2 = Simplify.simplify(regexp1);
      Regexp regexp3 = Simplify.simplify(regexp1);
      Regexp[] regexpArray0 = new Regexp[5];
      regexpArray0[4] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp3;
      Regexp.Op regexp_Op1 = Regexp.Op.ALTERNATE;
      regexp3.reinit();
      regexp3.op = regexp_Op1;
      regexpArray0[4] = regexp1;
      regexp2.subs = regexpArray0;
      Regexp regexp4 = new Regexp(regexp2);
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
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.name = "5zc_=";
      Regexp.Op regexp_Op1 = Regexp.Op.ALTERNATE;
      regexp0.subs = null;
      Regexp.Op regexp_Op2 = Regexp.Op.EMPTY_MATCH;
      regexp0.op = regexp_Op2;
      regexp0.op = regexp_Op1;
      regexp0.flags = (-23);
      regexp0.op.isPseudo();
      regexp0.reinit();
      Simplify.simplify(regexp0);
      Regexp.Op regexp_Op3 = Regexp.Op.PLUS;
      Regexp regexp1 = new Regexp(regexp_Op3);
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
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      int[] intArray0 = new int[2];
      intArray0[0] = (-1177);
      intArray0[1] = (-1177);
      intArray0[1] = (-1177);
      regexp0.min = (-6);
      regexp0.max = (-1177);
      Regexp regexp2 = Simplify.simplify(regexp1);
      Regexp regexp3 = Simplify.simplify(regexp1);
      regexp3.toString();
      Regexp[] regexpArray0 = new Regexp[5];
      regexp0.min = 274;
      regexp2.subs = regexpArray0;
      regexpArray0[4] = regexp1;
      regexp2.flags = (-1177);
      regexpArray0[1] = regexp0;
      regexp1.runes = intArray0;
      regexpArray0[2] = regexp3;
      regexpArray0[3] = regexp1;
      regexp0.subs = regexpArray0;
      Regexp.Op regexp_Op1 = Regexp.Op.ALTERNATE;
      regexp3.reinit();
      regexp3.subs = regexpArray0;
      regexp3.op = regexp_Op1;
      regexp2.subs = regexpArray0;
      // Undeclared exception!
      Simplify.simplify(regexp1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      regexp1.min = (-1239);
      regexp0.max = (-1239);
      Regexp[] regexpArray0 = new Regexp[8];
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      Regexp regexp2 = new Regexp(regexp_Op0);
      regexpArray0[3] = regexp2;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp1;
      regexpArray0[6] = regexp0;
      regexp0.subs = regexpArray0;
      Regexp regexp3 = Simplify.simplify(regexp1);
      regexp3.reinit();
      Regexp regexp4 = Simplify.simplify(regexp0);
      Simplify.simplify(regexp0);
      Regexp regexp5 = Simplify.simplify(regexp1);
      assertNotSame(regexp5, regexp4);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = 3077;
      Simplify.simplify(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      Regexp regexp1 = new Regexp(regexp_Op1);
      Regexp[] regexpArray0 = new Regexp[3];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexp1.subs = regexpArray0;
      regexp1.name = "com.google.re2j.Simplify$1";
      Regexp regexp2 = Simplify.simplify(regexp1);
      assertSame(regexp2, regexp1);
      
      Simplify.simplify(regexp0);
      Simplify.simplify(regexp0);
      assertNotSame(regexp0, regexp2);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = 3077;
      Simplify.simplify(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      Regexp regexp1 = new Regexp(regexp_Op1);
      int[] intArray0 = new int[8];
      intArray0[0] = 3077;
      intArray0[1] = 3077;
      intArray0[2] = 3077;
      intArray0[3] = 3077;
      intArray0[4] = 3077;
      intArray0[5] = 3077;
      intArray0[1] = 3077;
      regexp1.runes = intArray0;
      intArray0[7] = 3077;
      regexp1.runes = intArray0;
      Regexp[] regexpArray0 = new Regexp[3];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexp1.subs = regexpArray0;
      regexp1.name = "com.google.re2j.Simplify$1";
      Regexp regexp2 = Simplify.simplify(regexp1);
      Simplify.simplify(regexp0);
      Simplify.simplify(regexp0);
      Regexp regexp3 = Simplify.simplify(regexp0);
      assertSame(regexp3, regexp2);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      regexp1.min = (-1239);
      int[] intArray0 = new int[20];
      intArray0[0] = (-1199);
      intArray0[9] = (-1199);
      intArray0[1] = 1706;
      Regexp[] regexpArray0 = new Regexp[7];
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      Regexp regexp2 = new Regexp(regexp_Op0);
      regexp0.max = 3;
      regexpArray0[3] = regexp2;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp1;
      regexpArray0[6] = regexp0;
      regexp0.subs = regexpArray0;
      Regexp regexp3 = Simplify.simplify(regexp1);
      Object object0 = new Object();
      regexp0.equals(object0);
      Regexp regexp4 = Simplify.simplify(regexp1);
      regexp4.reinit();
      Simplify.simplify(regexp0);
      Simplify.simplify(regexp3);
      Simplify.simplify(regexp1);
      Simplify.simplify(regexp3);
      Regexp regexp5 = Simplify.simplify(regexp3);
      assertNotSame(regexp5, regexp0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = Simplify.simplify(regexp0);
      regexp1.min = (-1239);
      int[] intArray0 = new int[20];
      intArray0[0] = (-1207);
      intArray0[9] = (-1207);
      Regexp[] regexpArray0 = new Regexp[7];
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      Regexp regexp2 = new Regexp(regexp_Op0);
      regexpArray0[3] = regexp2;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp1;
      regexpArray0[6] = regexp0;
      regexp0.subs = regexpArray0;
      regexp0.min = (-1239);
      Regexp regexp3 = Simplify.simplify(regexp1);
      regexp3.reinit();
      Regexp regexp4 = Simplify.simplify(regexp1);
      regexp2.min = (-1207);
      regexp4.op = regexp_Op0;
      Simplify.simplify(regexp3);
      Simplify.simplify(regexp4);
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
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      Regexp regexp2 = new Regexp(regexp_Op1);
      Regexp[] regexpArray0 = new Regexp[3];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      Regexp.Op regexp_Op2 = Regexp.Op.CONCAT;
      regexp2.op = regexp_Op2;
      regexpArray0[2] = regexp0;
      regexp2.subs = regexpArray0;
      regexp0.reinit();
      Regexp regexp3 = new Regexp(regexp1);
      Regexp regexp4 = new Regexp(regexp0);
      Simplify.simplify(regexp4);
      Simplify.simplify(regexp2);
      Simplify.simplify(regexp0);
      Regexp regexp5 = new Regexp(regexp0);
      Regexp regexp6 = Simplify.simplify(regexp5);
      Simplify.simplify(regexp4);
      Regexp regexp7 = Simplify.simplify(regexp0);
      Regexp regexp8 = Simplify.simplify(regexp7);
      assertTrue(regexp8.equals((Object)regexp6));
  }
}