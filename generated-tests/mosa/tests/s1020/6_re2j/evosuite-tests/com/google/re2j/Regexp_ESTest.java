/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 11:40:16 GMT 2018
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
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
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
  public void test01()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[1];
      Regexp regexp1 = new Regexp(regexp0);
      regexpArray0[0] = regexp1;
      regexp0.subs = regexpArray0;
      Regexp regexp2 = new Regexp(regexp0);
      assertTrue(regexp2.equals((Object)regexp0));
      
      regexp2.toString();
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
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
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
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
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.equals(regexp0);
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      assertNotNull(regexp_OpArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("\\z", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      boolean boolean0 = regexp_Op0.isPseudo();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      boolean boolean0 = regexp1.equals(regexp2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("(?-s:.)", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("LEFT_PAREN", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      // Undeclared exception!
      try { 
        regexp0.equals(regexp0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      String string0 = regexp0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("(?:)", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("[^\\x00-\\x{10FFFF}]", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("\\B", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("\\b", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.name;
      Regexp regexp1 = new Regexp(regexp_Op0);
      Regexp regexp2 = new Regexp(regexp_Op0);
      Regexp regexp3 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp2.equals(regexp3);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("^", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      boolean boolean0 = regexp_Op0.isPseudo();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      Regexp regexp2 = new Regexp(regexp1);
      boolean boolean0 = regexp0.equals(regexp2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp((Regexp.Op) null);
      boolean boolean0 = regexp0.equals(regexp1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.toString();
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
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
  public void test26()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("$", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
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
  public void test28()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[3];
      regexpArray0[0] = regexp0;
      regexpArray0[2] = regexp0;
      regexp0.subs = regexpArray0;
      // Undeclared exception!
      try { 
        regexp0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.name = "qL8u.eD/I(\"hHvh";
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
  public void test30()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp1.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      boolean boolean0 = regexp0.equals(regexp1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp0;
      regexp0.subs = regexpArray0;
      // Undeclared exception!
      try { 
        regexp0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp0;
      regexp0.subs = regexpArray0;
      // Undeclared exception!
      try { 
        regexp0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      boolean boolean0 = regexp1.equals(regexp2);
      assertTrue(boolean0);
      
      regexp0.toString();
      boolean boolean1 = regexp0.equals("(?s:.)");
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.flags = 8450;
      regexp0.cap = 8657;
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexp1.equals(regexp0);
      boolean boolean0 = regexp_Op0.isPseudo();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp0;
      regexpArray0[0].name = "~stl";
      Regexp regexp1 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[13];
      regexp0.runes = intArray0;
      String string0 = regexp0.toString();
      assertEquals("[invalid char class]", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int int0 = 2877;
      regexp0.flags = 2877;
      regexp0.equals(regexp_Op0);
      regexp0.maxCap();
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.name = "Cc";
      regexp1.reinit();
      regexp0.equals(regexp1);
      int[] intArray0 = new int[3];
      intArray0[0] = 2877;
      intArray0[1] = 0;
      intArray0[2] = 2877;
      regexp0.runes = intArray0;
      regexp0.reinit();
      Object object0 = new Object();
      regexp1.equals(object0);
      Regexp regexp2 = new Regexp(regexp0);
      // Undeclared exception!
      try { 
        regexp0.equals(regexp2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Regexp regexp1 = new Regexp(regexp0);
      boolean boolean0 = regexp1.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.flags = 2448;
      regexp0.toString();
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[8];
      regexp0.runes = intArray0;
      String string0 = regexp0.toString();
      assertEquals("\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      assertTrue(regexp1.equals((Object)regexp0));
      
      regexp0.name = "H";
      int[] intArray0 = new int[0];
      regexp1.runes = intArray0;
      boolean boolean0 = regexp0.equals(regexp1);
      assertFalse(regexp1.equals((Object)regexp0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
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
  public void test48()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[6];
      intArray0[4] = 94;
      intArray0[3] = 94;
      regexp0.runes = intArray0;
      String string0 = regexp0.toString();
      assertEquals("[\\x00\\x00-\\^\\^-\\x00]", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[12];
      regexpArray0[0] = regexp0;
      regexpArray0[2] = regexp0;
      regexp0.subs = regexpArray0;
      // Undeclared exception!
      try { 
        regexp0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      intArray0[1] = 168;
      regexp0.runes = intArray0;
      boolean boolean0 = regexp0.equals(regexp_Op0);
      assertFalse(boolean0);
      
      String string0 = regexp0.toString();
      assertEquals("[\\x01-\u00A8]", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      Regexp regexp2 = new Regexp(regexp1);
      regexp1.subs = null;
      regexp2.max = (-1991);
      boolean boolean0 = regexp1.equals(regexp2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[4];
      intArray0[0] = 32;
      regexp0.flags = 32;
      intArray0[1] = 2785;
      intArray0[2] = (-588);
      intArray0[3] = (-2101);
      regexp0.runes = intArray0;
      Regexp regexp1 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[12];
      regexpArray0[0] = regexp0;
      regexpArray0[2] = regexp0;
      regexp0.subs = regexpArray0;
      Regexp regexp1 = new Regexp(regexp0);
      // Undeclared exception!
      regexp0.equals(regexp1);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[14];
      regexp0.cap = 16;
      regexp0.flags = 17;
      regexp0.runes = intArray0;
      regexp0.toString();
      boolean boolean0 = regexp_Op0.isPseudo();
      assertFalse(boolean0);
  }
}