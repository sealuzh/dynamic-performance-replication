/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 13:07:37 GMT 2018
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
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
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
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp1);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[4];
      Regexp.Op regexp_Op1 = Regexp.Op.LITERAL;
      regexp0.op = regexp_Op1;
      regexp0.runes = intArray0;
      int[] intArray1 = new int[1];
      regexp0.runes = intArray1;
      Compiler.compileRegexp(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      Regexp.Op regexp_Op2 = Regexp.Op.STAR;
      Regexp regexp3 = new Regexp(regexp_Op2);
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
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[3];
      intArray0[0] = 1032;
      intArray0[1] = (-1247);
      intArray0[2] = 13;
      regexp0.runes = intArray0;
      Regexp regexp1 = new Regexp(regexp0);
      Prog prog0 = Compiler.compileRegexp(regexp1);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Prog prog0 = Compiler.compileRegexp(regexp0);
      assertNotNull(prog0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.cap = 2167;
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
  public void test07()  throws Throwable  {
      Regexp regexp0 = new Regexp((Regexp.Op) null);
      regexp0.equals((Object) null);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      regexp1.min = 0;
      Regexp[] regexpArray0 = new Regexp[2];
      regexpArray0[0] = regexp0;
      regexp1.subs = regexpArray0;
      regexp1.max = (-2103);
      regexp1.subs = regexpArray0;
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      regexp0.equals((Object) null);
      regexp0.op = regexp_Op1;
      regexp1.op = regexp_Op0;
      Compiler.compileRegexp(regexp1);
      Regexp.Op regexp_Op2 = Regexp.Op.STAR;
      Regexp regexp2 = new Regexp(regexp_Op2);
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
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.equals(regexp0);
      int[] intArray0 = new int[7];
      intArray0[0] = 602;
      intArray0[1] = (-208);
      intArray0[2] = (-640);
      intArray0[3] = 5295;
      intArray0[4] = 7;
      Regexp[] regexpArray0 = new Regexp[8];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexpArray0[5] = regexp1;
      Regexp regexp2 = new Regexp(regexp_Op0);
      regexpArray0[7] = regexp2;
      regexp0.subs = regexpArray0;
      intArray0[5] = 15;
      intArray0[6] = 3;
      regexp0.runes = intArray0;
      regexp0.max = 17;
      regexp0.max = 17;
      Prog prog0 = Compiler.compileRegexp(regexp0);
      Prog prog1 = Compiler.compileRegexp(regexp0);
      assertFalse(prog1.equals((Object)prog0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      int[] intArray0 = new int[4];
      Regexp.Op regexp_Op1 = Regexp.Op.CHAR_CLASS;
      regexp0.op = regexp_Op1;
      intArray0[0] = 769;
      intArray0[2] = 769;
      regexp0.runes = intArray0;
      regexp0.min = 769;
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Name is null
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Compiler.compileRegexp(regexp0);
      Regexp regexp1 = new Regexp(regexp0);
      Compiler.compileRegexp(regexp1);
      Regexp[] regexpArray0 = new Regexp[6];
      regexpArray0[0] = regexp0;
      Regexp regexp2 = new Regexp(regexp0);
      regexpArray0[1] = regexp2;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp1;
      regexp1.subs = regexpArray0;
      int int0 = 1174;
      regexp1.min = 1174;
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
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Compiler.compileRegexp(regexp0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp1;
      Compiler.compileRegexp(regexp1);
      Regexp regexp2 = new Regexp(regexp1);
      Compiler.compileRegexp(regexp2);
      regexp0.subs = regexpArray0;
      Regexp regexp3 = new Regexp(regexp0);
      Compiler.compileRegexp(regexp1);
      Regexp regexp4 = new Regexp(regexp_Op0);
      regexp3.reinit();
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
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
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[4];
      Regexp.Op regexp_Op1 = Regexp.Op.CHAR_CLASS;
      regexp0.op = regexp_Op1;
      regexp0.runes = intArray0;
      Compiler.compileRegexp(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Regexp.Op regexp_Op2 = Regexp.Op.CAPTURE;
      Regexp regexp3 = new Regexp(regexp_Op2);
      regexp0.equals(regexp2);
      Regexp regexp4 = new Regexp(regexp_Op0);
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
  public void test13()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.PLUS;
      regexp1.min = 2833;
      Regexp[] regexpArray0 = new Regexp[2];
      regexpArray0[0] = regexp1;
      regexp1.subs = regexpArray0;
      regexp1.max = 2833;
      regexpArray0[0] = regexp0;
      regexp1.flags = 810;
      regexp1.subs = regexpArray0;
      regexp0.equals((Object) null);
      Object object0 = new Object();
      regexp0.equals(object0);
      regexp1.op = regexp_Op1;
      Compiler.compileRegexp(regexp1);
      Regexp.Op regexp_Op2 = Regexp.Op.STAR;
      Regexp regexp2 = new Regexp(regexp_Op2);
      Regexp regexp3 = new Regexp(regexp2);
      Regexp regexp4 = new Regexp(regexp1);
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
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.equals((Object) null);
      regexp0.max = 2870;
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      regexp1.min = 2870;
      regexp0.cap = 2870;
      Regexp[] regexpArray0 = new Regexp[3];
      regexp0.cap = 2870;
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexp1.subs = regexpArray0;
      Regexp.Op regexp_Op2 = Regexp.Op.ANY_CHAR;
      regexp1.flags = 2870;
      regexp1.subs = regexpArray0;
      regexp0.op = regexp_Op2;
      regexp1.op = regexp_Op1;
      Compiler.compileRegexp(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      Compiler.compileRegexp(regexp2);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp0);
      regexp0.toString();
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
  public void test15()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Compiler.compileRegexp(regexp0);
      Regexp regexp1 = new Regexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp1;
      Compiler.compileRegexp(regexp1);
      Regexp regexp2 = new Regexp(regexp1);
      Compiler.compileRegexp(regexp2);
      regexp0.subs = regexpArray0;
      Regexp.Op regexp_Op1 = Regexp.Op.NO_MATCH;
      Compiler.compileRegexp(regexp1);
      Regexp regexp3 = new Regexp(regexp_Op0);
      Regexp regexp4 = new Regexp(regexp3);
      Compiler.compileRegexp(regexp0);
      Regexp.Op regexp_Op2 = Regexp.Op.LITERAL;
      Regexp regexp5 = new Regexp(regexp_Op2);
      Regexp.Op regexp_Op3 = Regexp.Op.PLUS;
      Regexp regexp6 = new Regexp(regexp_Op3);
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
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.QUEST;
      regexp1.min = 129;
      Regexp[] regexpArray0 = new Regexp[21];
      regexpArray0[0] = regexp0;
      regexp1.cap = 2230;
      regexp1.max = 129;
      regexpArray0[16] = regexp0;
      regexp1.subs = regexpArray0;
      regexp1.op = regexp_Op1;
      Compiler.compileRegexp(regexp0);
      Regexp.Op regexp_Op2 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp2 = new Regexp(regexp_Op2);
      Compiler.compileRegexp(regexp0);
      Object object0 = new Object();
      regexp2.equals(object0);
      Regexp regexp3 = new Regexp(regexp_Op2);
      Compiler.compileRegexp(regexp1);
      Regexp regexp4 = new Regexp(regexp1.op);
      Regexp.Op regexp_Op3 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp5 = new Regexp(regexp_Op3);
      Regexp regexp6 = new Regexp(regexp1);
      regexp6.flags = 2230;
      Compiler.compileRegexp(regexp6);
      regexp3.toString();
      Regexp regexp7 = new Regexp(regexp_Op3);
      regexp7.min = 1079;
      Compiler.compileRegexp(regexp7);
      Regexp.Op regexp_Op4 = Regexp.Op.NO_MATCH;
      Regexp regexp8 = new Regexp(regexp_Op4);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp8);
      Compiler.compileRegexp(regexp0);
      Compiler.compileRegexp(regexp3);
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
  public void test17()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[2];
      Regexp.Op regexp_Op1 = Regexp.Op.CHAR_CLASS;
      regexp0.op = regexp_Op1;
      regexp0.runes = intArray0;
      Regexp.Op regexp_Op2 = Regexp.Op.ANY_CHAR;
      Regexp regexp2 = new Regexp(regexp_Op2);
      Compiler.compileRegexp(regexp1);
      Regexp.Op regexp_Op3 = Regexp.Op.BEGIN_LINE;
      regexp2.op = regexp_Op3;
      Compiler.compileRegexp(regexp1);
      Regexp regexp3 = new Regexp(regexp0);
      Compiler.compileRegexp(regexp2);
      Regexp regexp4 = new Regexp(regexp0);
      Compiler.compileRegexp(regexp0);
      Regexp.Op regexp_Op4 = Regexp.Op.NO_MATCH;
      Regexp regexp5 = new Regexp(regexp_Op4);
      Regexp regexp6 = new Regexp(regexp_Op0);
      regexp3.op = regexp_Op1;
      Regexp regexp7 = new Regexp(regexp3.op);
      Compiler.compileRegexp(regexp5);
      Regexp regexp8 = new Regexp(regexp0.op);
      Compiler.compileRegexp(regexp4);
      Regexp regexp9 = new Regexp(regexp6);
      regexp0.reinit();
      Compiler.compileRegexp(regexp1);
      Compiler.compileRegexp(regexp3);
      // Undeclared exception!
      try { 
        Compiler.compileRegexp(regexp8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Compiler", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Compiler.compileRegexp(regexp0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[8];
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp1;
      Regexp regexp2 = new Regexp(regexp_Op0);
      regexpArray0[3] = regexp2;
      regexpArray0[6] = regexp0;
      regexpArray0[7] = regexp0;
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
}