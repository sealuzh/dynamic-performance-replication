/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 20:30:44 GMT 2018
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
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp1);
      assertNotNull(prog0);
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
      Object object0 = new Object();
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp1);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp0;
      regexp1.subs = regexpArray0;
      regexp1.name = "*";
      int[] intArray0 = new int[8];
      intArray0[0] = 7;
      intArray0[1] = 3;
      intArray0[2] = 7;
      intArray0[3] = 4;
      intArray0[4] = 7;
      intArray0[0] = 7;
      intArray0[6] = 7;
      intArray0[7] = 7;
      regexp0.runes = intArray0;
      regexp1.cap = 7;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[4];
      intArray0[1] = 10;
      intArray0[3] = 1376;
      regexp1.runes = intArray0;
      Regexp regexp2 = new Regexp(regexp1);
      Regexp regexp3 = new Regexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp1);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.reinit();
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp1;
      regexpArray0[0] = regexp1;
      Regexp.Op regexp_Op1 = Regexp.Op.CONCAT;
      Regexp regexp2 = new Regexp(regexp_Op1);
      regexp2.subs = regexpArray0;
      regexp2.flags = 8359;
      regexpArray0[3] = regexp1;
      regexp0.subs = regexpArray0;
      regexp1.equals(regexp2);
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
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.cap = 5481;
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      regexp0.flags = 9;
      regexp1.op = regexp_Op1;
      regexp1.cap = 7;
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
  public void test13()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[2];
      regexp0.reinit();
      regexpArray0[0] = regexp0;
      regexpArray0[0] = regexp0;
      regexp1.subs = regexpArray0;
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
  public void test14()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      int[] intArray0 = new int[4];
      intArray0[0] = (-380);
      intArray0[1] = (-380);
      intArray0[3] = (-380);
      regexp1.runes = intArray0;
      Prog prog0 = Compiler.compileRegexp(regexp1);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[8];
      regexp0.reinit();
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexp0.max = (-240);
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexpArray0[7] = regexp0;
      regexp0.subs = regexpArray0;
      regexp0.flags = (-1842);
      int[] intArray0 = new int[0];
      regexp0.op = regexp_Op0;
      regexp0.runes = intArray0;
      regexp0.min = 756;
      regexp0.cap = 1095;
      Compiler.compileRegexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[1];
      regexp0.reinit();
      regexp1.flags = 28;
      regexp1.cap = 28;
      regexp1.cap = 6;
      regexp1.min = 28;
      regexpArray0[0] = regexp0;
      regexp1.subs = regexpArray0;
      Compiler.compileRegexp(regexp1);
      Regexp.Op regexp_Op1 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp2 = new Regexp(regexp_Op1);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // regexp: unhandled case in compile
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[9];
      intArray0[0] = (-1);
      intArray0[1] = 402;
      intArray0[2] = 4;
      intArray0[3] = 0;
      intArray0[4] = 8359;
      intArray0[5] = 10;
      intArray0[6] = 1807;
      intArray0[7] = 8347;
      intArray0[8] = (-2880);
      regexp0.runes = intArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      Regexp.Op regexp_Op2 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp2 = new Regexp(regexp_Op2);
      Regexp regexp3 = new Regexp(regexp1);
      Regexp[] regexpArray0 = new Regexp[8];
      Regexp regexp4 = new Regexp(regexp2);
      regexpArray0[0] = regexp4;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp1;
      Regexp regexp5 = new Regexp(regexp_Op1);
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexp3.subs = regexpArray0;
      Compiler.compileRegexp(regexp3);
      regexp0.reinit();
      Regexp.Op regexp_Op3 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp6 = new Regexp(regexp_Op3);
      // Undeclared exception!
      try { 
        regexp3.equals(regexp0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      Regexp regexp3 = new Regexp(regexp_Op1);
      Regexp regexp4 = new Regexp(regexp3);
      Compiler.compileRegexp(regexp4);
      Regexp regexp5 = new Regexp(regexp1);
      Regexp[] regexpArray0 = new Regexp[8];
      Regexp regexp6 = new Regexp(regexp4);
      regexpArray0[0] = regexp6;
      regexpArray0[1] = regexp3;
      regexpArray0[2] = regexp2;
      Regexp regexp7 = new Regexp(regexp_Op1);
      regexpArray0[6] = regexp0;
      regexpArray0[7] = regexp1;
      regexp5.subs = regexpArray0;
      Compiler.compileRegexp(regexp5);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexpArray0[3]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[4];
      regexp1.op = regexp_Op0;
      regexp1.reinit();
      Regexp[] regexpArray0 = new Regexp[2];
      regexpArray0[0] = regexp1;
      Regexp regexp2 = new Regexp(regexp1);
      regexpArray0[1] = regexp2;
      regexp1.subs = regexpArray0;
      regexp1.runes = intArray0;
      Compiler.compileRegexp(regexp1);
      Regexp.Op regexp_Op1 = Regexp.Op.QUEST;
      Regexp regexp3 = new Regexp(regexp_Op1);
      regexp3.reinit();
      Regexp regexp4 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      Regexp regexp3 = new Regexp(regexp_Op1);
      Regexp regexp4 = new Regexp(regexp3);
      Compiler.compileRegexp(regexp4);
      Regexp regexp5 = new Regexp(regexp1);
      Regexp[] regexpArray0 = new Regexp[11];
      Regexp regexp6 = new Regexp(regexp4);
      regexpArray0[0] = regexp6;
      regexpArray0[1] = regexp3;
      Regexp.Op regexp_Op2 = Regexp.Op.QUEST;
      regexp5.op = regexp_Op2;
      regexp3.equals(regexp_Op1);
      regexpArray0[2] = regexp5;
      regexpArray0[6] = regexp0;
      regexp3.op = regexp5.op;
      regexpArray0[7] = regexp1;
      regexp5.subs = regexpArray0;
      Compiler.compileRegexp(regexp5);
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
  public void test22()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.reinit();
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp1;
      Regexp.Op regexp_Op1 = Regexp.Op.CONCAT;
      Regexp regexp2 = new Regexp(regexp_Op1);
      regexp2.subs = regexpArray0;
      regexpArray0[3] = regexp1;
      Regexp regexp3 = new Regexp(regexp1);
      Regexp regexp4 = new Regexp(regexp_Op1);
      Compiler.compileRegexp(regexp2);
      regexp1.reinit();
      Regexp regexp5 = new Regexp(regexp_Op1);
      Regexp regexp6 = new Regexp(regexp5);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      Regexp regexp2 = new Regexp(regexp_Op1);
      Regexp regexp3 = new Regexp(regexp2);
      Regexp regexp4 = new Regexp(regexp1);
      regexp4.flags = (-921);
      Regexp[] regexpArray0 = new Regexp[11];
      Regexp regexp5 = new Regexp(regexp3);
      regexpArray0[0] = regexp5;
      regexpArray0[1] = regexp2;
      Regexp.Op regexp_Op2 = Regexp.Op.QUEST;
      regexp0.min = 899;
      regexp4.op = regexp_Op2;
      regexp2.equals(regexp_Op1);
      regexpArray0[2] = regexp2;
      regexpArray0[6] = regexp1;
      regexpArray0[7] = regexp1;
      regexp4.subs = regexpArray0;
      Regexp regexp6 = new Regexp(regexp2.op);
      Compiler.compileRegexp(regexp4);
      Compiler.compileRegexp(regexp4);
      Regexp regexp7 = new Regexp(regexp_Op2);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      Regexp regexp3 = new Regexp(regexp_Op1);
      Regexp.Op regexp_Op2 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp4 = new Regexp(regexp_Op2);
      Compiler.compileRegexp(regexp4);
      Regexp regexp5 = new Regexp(regexp1);
      Regexp[] regexpArray0 = new Regexp[8];
      regexpArray0[0] = regexp3;
      regexpArray0[1] = regexp3;
      regexpArray0[2] = regexp2;
      regexp0.op = regexp_Op2;
      Regexp regexp6 = new Regexp(regexp_Op1);
      regexpArray0[3] = regexp6;
      regexpArray0[5] = regexp3;
      regexp2.name = "";
      regexp5.flags = 2878;
      regexp2.reinit();
      regexp5.cap = 15;
      regexp5.subs = regexpArray0;
      Compiler.compileRegexp(regexp5);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.reinit();
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp1;
      regexpArray0[1] = regexp1;
      Regexp.Op regexp_Op1 = Regexp.Op.CONCAT;
      Regexp regexp2 = new Regexp(regexp_Op1);
      regexpArray0[3] = regexp1;
      regexp0.subs = regexpArray0;
      regexp1.equals(regexp2);
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
  public void test26()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      int[] intArray0 = new int[2];
      regexp1.runes = intArray0;
      Compiler.compileRegexp(regexp1);
      Regexp.Op regexp_Op1 = Regexp.Op.PLUS;
      Regexp regexp2 = new Regexp(regexp_Op1);
      Regexp regexp3 = new Regexp(regexp0);
      // Undeclared exception!
      try { 
        regexp3.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }
}