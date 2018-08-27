/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 11:59:29 GMT 2018
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.Regexp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Regexp_ESTest extends Regexp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.subs = null;
      Regexp regexp1 = new Regexp(regexp0);
      boolean boolean0 = regexp0.equals(regexp1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.max = (-884);
      Regexp.Op regexp_Op1 = Regexp.Op.END_TEXT;
      regexp0.op = regexp_Op1;
      regexp0.max = 4160;
      regexp1.toString();
      regexp1.reinit();
      String string0 = "Cham";
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("Cham");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.Cham
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.reinit();
      int int0 = regexp1.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.toString();
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[7];
      Regexp regexp1 = new Regexp(regexp0);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexp0.subs = regexpArray0;
      // Undeclared exception!
      try { 
        regexp0.maxCap();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[5];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      Regexp regexp1 = new Regexp(regexp0);
      regexpArray0[4] = regexp1;
      regexp0.subs = regexpArray0;
      regexp0.op = regexp_Op0;
      regexp0.toString();
      assertTrue(regexp0.equals((Object)regexp1));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.max = 92;
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.name = "vN0;91m{rG&wRR";
      int[] intArray0 = new int[1];
      intArray0[0] = 92;
      regexp0.runes = intArray0;
      Object object0 = new Object();
      regexp1.equals(object0);
      regexp0.reinit();
      regexp0.toString();
      boolean boolean0 = regexp_Op0.isPseudo();
      boolean boolean1 = regexp1.equals("vN0;91m{rG&wRR");
      assertTrue(regexp1.equals((Object)regexp0));
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.name = null;
      regexp1.toString();
      assertTrue(regexp1.equals((Object)regexp0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Object object0 = new Object();
      Regexp.Op regexp_Op1 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op1);
      Regexp regexp1 = new Regexp(regexp0);
      Object object1 = new Object();
      regexp1.equals(object1);
      Regexp regexp2 = new Regexp(regexp1);
      regexp2.reinit();
      // Undeclared exception!
      try { 
        regexp1.toString();
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
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.toString();
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.name = "$";
      regexp1.flags = 0;
      regexp1.toString();
      Regexp regexp2 = new Regexp(regexp1);
      boolean boolean0 = regexp0.equals(regexp2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[5];
      intArray0[0] = 724;
      intArray0[1] = 1554;
      intArray0[2] = 40;
      regexp0.cap = 1100;
      intArray0[3] = 0;
      intArray0[4] = 2163;
      regexp0.runes = intArray0;
      Regexp regexp1 = new Regexp(regexp0);
      Object object0 = new Object();
      Object object1 = new Object();
      regexp0.equals(object1);
      regexp0.toString();
      regexp_Op0.isPseudo();
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      assertNotNull(regexp_OpArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Object object0 = new Object();
      regexp0.equals(object0);
      regexp0.toString();
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      regexp0.toString();
      Regexp.Op regexp_Op1 = Regexp.Op.NO_MATCH;
      regexp_Op1.isPseudo();
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op2 = Regexp.Op.QUEST;
      Regexp regexp2 = new Regexp(regexp_Op2);
      regexp1.equals(regexp2);
      regexp_Op2.isPseudo();
      regexp0.equals("(?s:.)");
      regexp2.maxCap();
      Object object1 = new Object();
      regexp1.equals(regexp0);
      regexp0.reinit();
      regexp2.min = 0;
      Regexp.Op regexp_Op3 = Regexp.Op.STAR;
      Regexp regexp3 = new Regexp(regexp_Op3);
      regexp2.equals(regexp3);
      Regexp.Op[] regexp_OpArray1 = Regexp.Op.values();
      assertFalse(regexp_OpArray1.equals((Object)regexp_OpArray0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp.Op regexp_Op1 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op1);
      Regexp regexp1 = new Regexp(regexp0);
      Object object0 = new Object();
      boolean boolean0 = regexp1.equals(object0);
      assertFalse(boolean0);
      
      Regexp regexp2 = new Regexp(regexp0);
      regexp2.reinit();
      String string0 = regexp2.toString();
      assertEquals("[^\\x00-\\x{10FFFF}]", string0);
      
      boolean boolean1 = regexp_Op0.isPseudo();
      Regexp.Op regexp_Op2 = Regexp.Op.ANY_CHAR;
      Regexp regexp3 = new Regexp(regexp_Op2);
      boolean boolean2 = regexp1.equals(regexp3);
      assertTrue(boolean2 == boolean1);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.equals(regexp0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.reinit();
      regexp0.reinit();
      Regexp regexp2 = new Regexp(regexp0);
      int int0 = regexp2.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      regexp_Op0.isPseudo();
      regexp_Op0.isPseudo();
      regexp_Op0.isPseudo();
      regexp_Op0.isPseudo();
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.max = 0;
      regexp1.max = (-4244);
      regexp1.toString();
      regexp1.maxCap();
      Regexp.Op regexp_Op1 = Regexp.Op.ALTERNATE;
      Regexp regexp2 = new Regexp(regexp_Op1);
      Regexp regexp3 = new Regexp(regexp_Op0);
      regexp3.equals(regexp1);
      Regexp regexp4 = new Regexp(regexp3);
      regexp2.cap = (-4244);
      Regexp.Op regexp_Op2 = Regexp.Op.BEGIN_LINE;
      Regexp regexp5 = new Regexp(regexp_Op2);
      regexp5.reinit();
      regexp4.reinit();
      // Undeclared exception!
      try { 
        regexp2.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp.Op regexp_Op1 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op1);
      int[] intArray0 = new int[0];
      regexp0.runes = intArray0;
      regexp0.equals(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("[^\\x00-\\x{10FFFF}]", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      regexp_Op0.isPseudo();
      Regexp.Op regexp_Op1 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op1);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.toString();
      Regexp.Op regexp_Op2 = Regexp.Op.ALTERNATE;
      Regexp.Op regexp_Op3 = Regexp.Op.PLUS;
      Regexp regexp2 = new Regexp(regexp_Op3);
      String string0 = regexp0.name;
      Object object0 = new Object();
      regexp2.equals(regexp_Op3);
      regexp2.cap = 256;
      regexp_Op2.isPseudo();
      // Undeclared exception!
      try { 
        regexp2.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.toString();
      Regexp regexp1 = new Regexp(regexp0);
      String string0 = regexp0.toString();
      assertEquals("\\b", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[5];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.equals(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.CONCAT;
      regexpArray0[1].op = regexp_Op1;
      regexpArray0[4] = regexp1;
      regexp0.subs = regexpArray0;
      // Undeclared exception!
      try { 
        regexp0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[23];
      Regexp regexp1 = new Regexp(regexp0);
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
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

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.maxCap();
      Regexp regexp1 = new Regexp(regexp0);
      // Undeclared exception!
      try { 
        regexp0.equals(regexp1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp.Op regexp_Op1 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op1);
      Regexp regexp1 = new Regexp(regexp0);
      Object object0 = new Object();
      regexp1.equals(object0);
      Regexp regexp2 = new Regexp(regexp0);
      regexp1.reinit();
      String string0 = regexp2.toString();
      assertEquals("[^\\x00-\\x{10FFFF}]", string0);
      
      boolean boolean0 = regexp_Op0.isPseudo();
      Regexp regexp3 = new Regexp(regexp0);
      boolean boolean1 = regexp3.equals("");
      assertTrue(boolean1 == boolean0);
      
      boolean boolean2 = regexp1.equals(regexp3);
      assertFalse(boolean2 == boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.max = (-2013);
      regexp1.toString();
      Object object0 = new Object();
      boolean boolean0 = regexp0.equals("Ugaritic");
      boolean boolean1 = regexp_Op0.isPseudo();
      assertTrue(boolean1 == boolean0);
      
      regexp1.toString();
      Regexp regexp2 = new Regexp(regexp0);
      regexp0.equals(regexp2);
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.PLUS;
      regexp0.op = regexp_Op1;
      regexp1.name = "0b17HcaB==y";
      // Undeclared exception!
      try { 
        regexp1.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.name = "NO_MATCH";
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

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.equals(regexp0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexp1.maxCap();
      Regexp regexp2 = new Regexp(regexp0);
      int int0 = regexp2.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.CONCAT;
      Regexp regexp1 = new Regexp(regexp_Op1);
      boolean boolean0 = regexp0.equals(regexp1);
      assertFalse(boolean0);
      
      Regexp regexp2 = new Regexp(regexp_Op0);
      Regexp regexp3 = new Regexp(regexp_Op1);
      regexp3.reinit();
      regexp3.toString();
      assertFalse(regexp3.equals((Object)regexp2));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.maxCap();
      regexp0.equals(regexp0);
      String string0 = regexp0.toString();
      assertEquals("\\B", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp.Op regexp_Op1 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op1);
      Regexp regexp1 = new Regexp(regexp0);
      int[] intArray0 = new int[9];
      intArray0[0] = 2510;
      intArray0[1] = (-3913);
      intArray0[2] = (-3913);
      intArray0[3] = 11;
      intArray0[4] = 2140;
      intArray0[5] = (-2418);
      regexp0.equals(regexp1);
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

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.equals(regexp_Op0);
      Regexp.Op.values();
      // Undeclared exception!
      try { 
        regexp0.equals(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.maxCap();
      regexp0.equals(regexp0);
      Regexp regexp1 = new Regexp(regexp0);
      assertTrue(regexp1.equals((Object)regexp0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        regexp0.equals(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        regexp0.equals(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      // Undeclared exception!
      try { 
        regexp0.equals(regexp1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.equals("I+l,v)$,<8sd.F)");
      regexp0.reinit();
      String string0 = regexp0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.maxCap();
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[7];
      regexpArray0[0] = regexp1;
      Regexp regexp2 = new Regexp(regexp0);
      regexpArray0[1] = regexp2;
      regexpArray0[2] = regexp1;
      regexpArray0[3] = regexp1;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp1;
      regexpArray0[6] = regexp0;
      regexp1.subs = regexpArray0;
      // Undeclared exception!
      try { 
        regexp1.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Regexp regexp1 = new Regexp(regexp0);
      boolean boolean0 = regexp1.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.equals(regexp0);
      regexp0.toString();
      regexp0.maxCap();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        regexp0.equals(regexp2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
      
      Regexp regexp1 = new Regexp(regexp0);
      assertTrue(regexp1.equals((Object)regexp0));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[2];
      Regexp regexp1 = new Regexp(regexp0);
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
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

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[20];
      Regexp.Op regexp_Op1 = Regexp.Op.LITERAL;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
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

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.max = 5;
      Regexp regexp1 = new Regexp(regexp_Op0);
      Object object0 = new Object();
      regexp1.equals(object0);
      regexp0.equals(regexp1);
      regexp0.reinit();
      assertNotSame(regexp0, regexp1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[20];
      Regexp.Op regexp_Op1 = Regexp.Op.LITERAL;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
      Regexp regexp2 = new Regexp(regexp0);
      regexp0.equals(regexp2);
      // Undeclared exception!
      try { 
        regexp1.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[2];
      Regexp.Op regexp_Op1 = Regexp.Op.NO_MATCH;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexp0.subs = regexpArray0;
      regexp0.toString();
      regexp0.equals(regexp0);
      regexp1.reinit();
      assertFalse(regexp1.equals((Object)regexp0));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[2];
      regexp0.runes = intArray0;
      boolean boolean0 = regexp0.equals(regexp_Op0);
      assertFalse(boolean0);
      
      Regexp regexp1 = new Regexp(regexp0);
      assertTrue(regexp1.equals((Object)regexp0));
      
      String string0 = regexp1.toString();
      assertEquals("[\\x00]", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[2];
      intArray0[0] = 2977;
      intArray0[1] = 12;
      regexp0.runes = intArray0;
      boolean boolean0 = regexp0.equals("");
      assertFalse(boolean0);
      
      String string0 = regexp0.toString();
      assertEquals("[\\x{ba1}-\\f]", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[2];
      intArray0[0] = 2977;
      intArray0[1] = 2977;
      regexp0.runes = intArray0;
      String string0 = regexp0.toString();
      assertEquals("[\\x{ba1}]", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[2];
      intArray0[1] = (-364);
      regexp0.runes = intArray0;
      regexp0.min = (-364);
      String string0 = regexp0.toString();
      assertEquals("[\\x00-\\xfffffe94]", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = 12;
      Regexp regexp1 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.flags = 8622;
      regexp1.min = 8622;
      boolean boolean0 = regexp0.equals(regexp1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.flags = (-1233);
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexp1.cap = 4062;
      regexp1.reinit();
      boolean boolean0 = regexp0.equals(regexp1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[8];
      Regexp.Op regexp_Op1 = Regexp.Op.LEFT_PAREN;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      Regexp.Op regexp_Op2 = Regexp.Op.CAPTURE;
      Regexp regexp2 = new Regexp(regexp_Op2);
      regexpArray0[4] = regexp2;
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexpArray0[7] = regexp0;
      regexp0.subs = regexpArray0;
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[8];
      Regexp.Op regexp_Op1 = Regexp.Op.LEFT_PAREN;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      Regexp regexp2 = new Regexp(regexp_Op0);
      regexpArray0[4] = regexp2;
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexpArray0[7] = regexp0;
      regexp0.subs = regexpArray0;
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexp1.name = "";
      regexp0.equals(regexp1);
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[20];
      Regexp.Op regexp_Op1 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
      regexp0.toString();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("(?:)+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.(?:)+
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[23];
      Regexp.Op regexp_Op1 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
      String string0 = regexp0.toString();
      assertEquals("(?:)?", string0);
      
      boolean boolean0 = regexp_Op1.isPseudo();
      Object object0 = new Object();
      boolean boolean1 = regexp0.equals(object0);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[23];
      Regexp.Op regexp_Op1 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
      String string0 = regexp0.toString();
      assertEquals("(?:){0}", string0);
  }
}
