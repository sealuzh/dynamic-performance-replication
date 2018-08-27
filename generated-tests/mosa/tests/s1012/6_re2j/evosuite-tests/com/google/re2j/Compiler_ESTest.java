/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 03:28:02 GMT 2018
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.Compiler;
import com.google.re2j.Prog;
import com.google.re2j.Regexp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Compiler_ESTest extends Compiler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      Regexp regexp0 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // regexp: unhandled case in compile
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[0];
      regexp0.runes = intArray0;
      Regexp.Op regexp_Op1 = Regexp.Op.REPEAT;
      Regexp regexp1 = new Regexp(regexp_Op1);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[6];
      intArray0[0] = (-2862);
      intArray0[1] = 115;
      intArray0[2] = 10;
      intArray0[4] = 17;
      intArray0[5] = (-1886);
      regexp0.runes = intArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[1];
      intArray0[0] = 3648;
      regexp0.runes = intArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = 4;
      Regexp[] regexpArray0 = new Regexp[8];
      Regexp.Op regexp_Op1 = Regexp.Op.NO_MATCH;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      int[] intArray0 = new int[5];
      intArray0[0] = 4;
      intArray0[1] = 4;
      intArray0[2] = (-2862);
      intArray0[4] = 4;
      regexp1.runes = intArray0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      Regexp regexp2 = new Regexp(regexp_Op1);
      regexpArray0[3] = regexp0;
      regexp2.min = 4;
      regexpArray0[4] = regexp0;
      Regexp regexp3 = new Regexp(regexp0);
      regexpArray0[5] = regexp3;
      regexp3.name = "s";
      regexpArray0[6] = regexp0;
      regexpArray0[7] = regexp0;
      regexp0.subs = regexpArray0;
      regexp0.max = 1511;
      Compiler.compileRegexp(regexp0);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[1];
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.CHAR_CLASS;
      Regexp regexp1 = new Regexp(regexp_Op1);
      int[] intArray0 = new int[0];
      regexp1.runes = intArray0;
      Prog prog0 = Compiler.compileRegexp(regexp1);
      Prog prog1 = Compiler.compileRegexp(regexp1);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[3];
      Regexp regexp1 = new Regexp(regexp0);
      regexpArray0[0] = regexp0;
      regexp0.subs = regexpArray0;
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = 4;
      Regexp[] regexpArray0 = new Regexp[23];
      Regexp.Op regexp_Op1 = Regexp.Op.LITERAL;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      int[] intArray0 = new int[5];
      intArray0[0] = 4;
      intArray0[1] = 4;
      intArray0[3] = 4;
      intArray0[4] = 4;
      regexp1.runes = intArray0;
      regexpArray0[1] = regexp0;
      regexp0.cap = 4;
      regexpArray0[2] = regexp0;
      Regexp regexp2 = new Regexp(regexp_Op1);
      regexpArray0[3] = regexp2;
      regexp2.min = 4;
      regexpArray0[4] = regexp0;
      Regexp regexp3 = new Regexp(regexp_Op1);
      regexpArray0[6] = regexp0;
      regexpArray0[7] = regexp0;
      regexp1.runes = intArray0;
      regexp0.subs = regexpArray0;
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp1);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[1];
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexp0.flags = 434;
      regexp0.subs = regexpArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp1);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[7];
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      Regexp regexp2 = new Regexp(regexp1);
      Regexp regexp3 = new Regexp(regexp0);
      regexpArray0[4] = regexpArray0[3];
      regexpArray0[6] = regexp0;
      regexp0.subs = regexpArray0;
      Compiler.compileRegexp(regexp0);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexpArray0[4]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[1];
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexp0.flags = 434;
      regexp0.subs = regexpArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp1);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[5];
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp1;
      regexpArray0[3] = regexp1;
      regexp1.reinit();
      regexpArray0[4] = regexp0;
      regexp0.subs = regexpArray0;
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
