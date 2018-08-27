/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 16:18:44 GMT 2018
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
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp1);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.BEGIN_LINE;
      regexp0.op = regexp_Op1;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
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
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp1);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
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
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.flags = 7;
      Prog prog0 = Compiler.compileRegexp(regexp1);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.cap = 42737;
      Regexp.Op regexp_Op1 = Regexp.Op.END_TEXT;
      regexp0.op = regexp_Op1;
      regexp0.min = 42737;
      regexp0.flags = 11055;
      regexp0.min = 4;
      regexp0.name = null;
      Object object0 = new Object();
      regexp0.equals(object0);
      regexp0.max = 8648;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[8];
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[3] = regexp1;
      regexp1.min = 4317;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp1;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Object object0 = new Object();
      regexp0.equals(object0);
      regexp0.flags = (-27);
      regexp0.reinit();
      Regexp regexp1 = new Regexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp1);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[7];
      intArray0[0] = 9;
      intArray0[1] = (-4935);
      intArray0[2] = 1;
      intArray0[3] = (-2351);
      intArray0[4] = 4144;
      intArray0[5] = 5;
      intArray0[6] = 8;
      regexp0.runes = intArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertNotSame(prog1, prog0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.PLUS;
      Regexp regexp1 = new Regexp(regexp_Op1);
      Regexp.Op regexp_Op2 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp2 = new Regexp(regexp_Op2);
      Regexp regexp3 = new Regexp(regexp2);
      Compiler.compileRegexp(regexp3);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp((Regexp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[8];
      regexp0.reinit();
      regexp0.flags = (-21);
      regexpArray0[0] = regexp0;
      regexp1.reinit();
      regexpArray0[1] = regexp0;
      regexpArray0[4] = regexp0;
      int[] intArray0 = new int[5];
      intArray0[1] = 43469;
      intArray0[0] = 43469;
      regexp0.cap = 0;
      intArray0[4] = 3;
      regexp1.runes = intArray0;
      regexp0.reinit();
      regexpArray0[3] = regexp1;
      regexp1.subs = regexpArray0;
      regexp0.cap = 6;
      Regexp regexp2 = new Regexp(regexp0);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.name;
      Regexp.Op regexp_Op1 = Regexp.Op.LITERAL;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexp0.reinit();
      Regexp regexp2 = new Regexp(regexp1);
      regexp1.op = regexp_Op1;
      Regexp regexp3 = new Regexp(regexp2);
      int[] intArray0 = new int[5];
      intArray0[0] = (-1998);
      intArray0[1] = 1;
      regexp0.equals(regexp2);
      intArray0[2] = 2;
      regexp0.toString();
      intArray0[3] = (-1998);
      regexp2.runes = intArray0;
      Regexp regexp4 = new Regexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp2);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = 11505;
      regexp0.flags = 9;
      int[] intArray0 = new int[8];
      intArray0[0] = 9;
      intArray0[1] = 11505;
      intArray0[2] = 11505;
      intArray0[3] = 11505;
      intArray0[4] = 9;
      regexp0.flags = 1524;
      intArray0[5] = 11505;
      intArray0[6] = 1524;
      intArray0[7] = 11505;
      regexp0.runes = intArray0;
      regexp0.name = null;
      regexp0.reinit();
      regexp0.max = 3083;
      Regexp[] regexpArray0 = new Regexp[5];
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
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
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[7];
      regexp0.flags = 3;
      regexpArray0[0] = regexp0;
      regexp1.reinit();
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      int[] intArray0 = new int[5];
      intArray0[1] = 43501;
      intArray0[2] = 924;
      Compiler.compileRegexp(regexp1);
      // Undeclared exception!
      try { 
        regexp0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }
}