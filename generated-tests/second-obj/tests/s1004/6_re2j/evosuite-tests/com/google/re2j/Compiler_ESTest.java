/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 18:36:06 GMT 2018
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
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
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
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp1);
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
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
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
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.name = null;
      int[] intArray0 = new int[3];
      intArray0[0] = 1766;
      intArray0[1] = 1766;
      intArray0[2] = 1766;
      regexp0.runes = intArray0;
      regexp0.max = 1766;
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      Regexp.Op regexp_Op1 = Regexp.Op.VERTICAL_BAR;
      regexp1.flags = 16;
      Regexp regexp3 = new Regexp(regexp_Op1);
      Compiler.compileRegexp(regexp1);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp3);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // regexp: unhandled case in compile
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.cap = 11377;
      Regexp regexp1 = new Regexp(regexp0);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[2];
      intArray0[1] = 26;
      regexp0.reinit();
      regexp0.runes = intArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp1 = new Regexp(regexp_Op1);
      Regexp regexp2 = new Regexp(regexp1);
      regexp0.reinit();
      int int0 = 11778;
      regexp2.cap = 11778;
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp1;
      regexp1.reinit();
      regexp0.subs = regexpArray0;
      Regexp regexp3 = new Regexp(regexp1);
      Compiler.compileRegexp(regexp0);
      Regexp regexp4 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        regexp4.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[1];
      regexp0.reinit();
      intArray0[0] = 7975;
      regexp0.runes = intArray0;
      Compiler.compileRegexp(regexp0);
      regexp0.reinit();
      regexp0.reinit();
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
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[2];
      intArray0[0] = (-909);
      regexp0.runes = intArray0;
      Compiler.compileRegexp(regexp0);
      regexp0.toString();
      regexp0.reinit();
      Regexp regexp1 = new Regexp(regexp_Op0);
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
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp0);
      regexp1.reinit();
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp2;
      regexp2.reinit();
      regexp0.equals("-o^4dQC-");
      regexp0.subs = regexpArray0;
      Regexp regexp3 = new Regexp(regexp_Op0);
      Regexp regexp4 = new Regexp(regexp_Op0);
      Regexp regexp5 = new Regexp(regexp_Op0);
      Regexp regexp6 = new Regexp(regexp_Op0);
      Compiler.compileRegexp(regexp0);
      regexp6.subs = regexp0.subs;
      Regexp regexp7 = new Regexp(regexp_Op0);
      regexp6.min = 1611;
      // Undeclared exception!
      try { 
        regexp7.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[2];
      regexp0.runes = intArray0;
      Compiler.compileRegexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      Regexp regexp1 = new Regexp(regexp_Op1);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp2);
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
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.op = regexp_Op0;
      regexp0.op.isPseudo();
      Regexp.Op regexp_Op1 = Regexp.Op.ALTERNATE;
      regexp0.op.isPseudo();
      regexp0.op.isPseudo();
      regexp0.op = regexp_Op1;
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp0);
      Regexp regexp3 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[31];
      regexp0.op.isPseudo();
      Regexp regexp4 = new Regexp(regexp_Op0);
      regexpArray0[0] = regexp4;
      regexpArray0[1] = regexp3;
      regexpArray0[11] = regexp4;
      regexpArray0[8] = regexp1;
      regexp2.subs = regexpArray0;
      regexp1.toString();
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp2);
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
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      Regexp regexp1 = new Regexp(regexp_Op1);
      Regexp regexp2 = new Regexp(regexp1);
      Regexp regexp3 = new Regexp(regexp_Op0);
      Regexp regexp4 = new Regexp(regexp1);
      regexp2.reinit();
      regexp4.reinit();
      Regexp regexp5 = new Regexp(regexp1);
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp4;
      regexp4.reinit();
      regexp0.subs = regexpArray0;
      Regexp regexp6 = new Regexp(regexp3);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp2);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp1 = new Regexp(regexp_Op1);
      Regexp regexp2 = new Regexp(regexp1);
      regexp0.reinit();
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp1;
      regexp1.reinit();
      regexp0.subs = regexpArray0;
      Regexp regexp3 = new Regexp(regexp1);
      Compiler.compileRegexp(regexp0);
      Regexp.Op regexp_Op2 = Regexp.Op.ALTERNATE;
      Regexp regexp4 = new Regexp(regexp_Op2);
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
  public void test16()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[1];
      regexp0.reinit();
      regexp0.runes = intArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp2 = new Regexp(regexp_Op1);
      Regexp regexp3 = new Regexp(regexp2);
      regexp3.runes = intArray0;
      regexp1.equals(intArray0);
      Regexp regexp4 = new Regexp(regexp3);
      Regexp regexp5 = new Regexp(regexp4);
      Regexp.Op regexp_Op2 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp6 = new Regexp(regexp_Op2);
      Regexp.Op regexp_Op3 = Regexp.Op.STAR;
      Regexp regexp7 = new Regexp(regexp_Op3);
      Regexp[] regexpArray0 = new Regexp[4];
      regexp7.flags = 225;
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp4;
      regexpArray0[3] = regexp0;
      regexp7.subs = regexpArray0;
      Compiler.compileRegexp(regexp7);
      Compiler.compileRegexp(regexp7);
      Compiler.compileRegexp(regexp2);
      Regexp regexp8 = new Regexp(regexp_Op2);
      Prog prog1 = Compiler.compileRegexp(regexp3);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.op = regexp_Op0;
      Regexp.Op regexp_Op1 = Regexp.Op.ALTERNATE;
      regexp0.op.isPseudo();
      regexp0.op = regexp_Op1;
      Compiler.compileRegexp(regexp0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp0);
      Regexp regexp3 = new Regexp(regexp2);
      regexp1.reinit();
      Regexp[] regexpArray0 = new Regexp[9];
      Regexp regexp4 = new Regexp(regexp_Op0);
      regexp4.runes = null;
      regexpArray0[0] = regexp4;
      regexpArray0[1] = regexp3;
      regexpArray0[2] = regexp0;
      Regexp.Op regexp_Op2 = Regexp.Op.PLUS;
      regexp2.op = regexp_Op2;
      regexpArray0[3] = regexp3;
      regexpArray0[8] = regexp1;
      regexp2.flags = (-517);
      regexp2.subs = regexpArray0;
      Compiler.compileRegexp(regexp2);
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp3);
      Prog prog1 = Compiler.compileRegexp(regexp4);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.op = regexp_Op0;
      regexp0.op.isPseudo();
      Regexp.Op regexp_Op1 = Regexp.Op.CONCAT;
      regexp0.op = regexp_Op1;
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp0);
      Regexp regexp3 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[31];
      Regexp regexp4 = new Regexp(regexp_Op0);
      regexp3.toString();
      regexp1.subs = regexpArray0;
      regexp2.toString();
      regexp3.equals((Object) null);
      regexpArray0[0] = regexp4;
      regexpArray0[1] = regexp3;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp4;
      regexpArray0[8] = regexp0;
      regexp4.toString();
      regexp2.subs = regexpArray0;
      Regexp regexp5 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op2 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp6 = new Regexp(regexp_Op2);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp2);
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
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[1];
      Regexp[] regexpArray0 = new Regexp[11];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexp0.subs = regexpArray0;
      regexp0.reinit();
      regexp0.runes = intArray0;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Regexp[] regexpArray1 = new Regexp[5];
      regexpArray1[1] = regexp0;
      regexpArray1[2] = regexp0;
      regexpArray1[3] = regexp0;
      regexpArray1[4] = regexp0;
      regexp0.subs = regexpArray1;
      Regexp regexp1 = new Regexp(regexp_Op0);
      Regexp regexp2 = new Regexp(regexp0);
      regexp0.subs = regexpArray1;
      regexp2.runes = intArray0;
      Regexp regexp3 = new Regexp(regexp2);
      Regexp regexp4 = new Regexp(regexp3);
      Regexp regexp5 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      Regexp regexp6 = new Regexp(regexp_Op1);
      Regexp[] regexpArray2 = new Regexp[4];
      regexpArray2[0] = regexp0;
      regexpArray1[3] = regexp0;
      regexpArray2[2] = regexp3;
      regexp2.max = 10;
      regexpArray2[3] = regexp0;
      regexp6.subs = regexpArray2;
      regexp5.flags = 18;
      Prog prog1 = Compiler.compileRegexp(regexp6);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[1];
      regexp0.reinit();
      regexp0.runes = intArray0;
      regexp0.name = "gG";
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      Regexp regexp1 = new Regexp(regexp_Op1);
      Regexp.Op regexp_Op2 = Regexp.Op.END_TEXT;
      Regexp regexp2 = new Regexp(regexp_Op2);
      regexp1.toString();
      Regexp regexp3 = new Regexp(regexp0);
      Compiler.compileRegexp(regexp1);
      Regexp.Op regexp_Op3 = Regexp.Op.END_LINE;
      Regexp regexp4 = new Regexp(regexp_Op3);
      Regexp regexp5 = new Regexp(regexp1);
      Compiler.compileRegexp(regexp5);
      Regexp.Op regexp_Op4 = Regexp.Op.EMPTY_MATCH;
      int[] intArray1 = new int[0];
      regexp3.runes = intArray1;
      Regexp regexp6 = new Regexp(regexp_Op4);
      Compiler.compileRegexp(regexp4);
      Compiler.compileRegexp(regexp6);
      Compiler.compileRegexp(regexp3);
      Prog prog1 = Compiler.compileRegexp(regexp3);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      Regexp regexp1 = new Regexp(regexp_Op1);
      Regexp regexp2 = new Regexp(regexp1);
      regexp2.reinit();
      regexp0.flags = (-1374);
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp2;
      regexp1.reinit();
      regexp0.subs = regexpArray0;
      Regexp regexp3 = new Regexp(regexp2);
      Prog prog0 = Compiler.compileRegexp(regexp2);
      Compiler.compileRegexp(regexp0);
      Regexp.Op regexp_Op2 = Regexp.Op.NO_MATCH;
      Regexp regexp4 = new Regexp(regexp_Op2);
      Regexp.Op regexp_Op3 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp5 = new Regexp(regexp_Op3);
      Compiler.compileRegexp(regexp5);
      regexp4.op = regexp_Op0;
      Prog prog1 = Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp2);
      Regexp.Op regexp_Op4 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp6 = new Regexp(regexp_Op4);
      regexp4.equals(prog1);
      regexp6.toString();
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Regexp regexp7 = new Regexp(regexp6);
      Compiler.compileRegexp(regexp5);
      Compiler.compileRegexp(regexp7);
      Prog prog2 = Compiler.compileRegexp(regexp7);
      assertFalse(prog2.equals((Object)prog0));
  }
}
