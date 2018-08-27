/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 06:48:59 GMT 2018
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
      Regexp.Op.values();
      Regexp.Op.values();
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
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Object object0 = new Object();
      regexp0.equals(object0);
      Regexp regexp1 = new Regexp(regexp0);
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
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      int[] intArray0 = new int[8];
      intArray0[0] = 123;
      regexp0.min = 123;
      regexp0.reinit();
      regexp1.max = 2586;
      intArray0[1] = 0;
      intArray0[2] = 1356;
      intArray0[3] = 120485;
      intArray0[4] = 0;
      intArray0[5] = 0;
      intArray0[6] = 15;
      intArray0[7] = 0;
      regexp1.runes = intArray0;
      Object object0 = new Object();
      regexp1.equals(object0);
      Object object1 = new Object();
      boolean boolean0 = regexp0.equals(object1);
      regexp_Op0.isPseudo();
      boolean boolean1 = regexp_Op0.isPseudo();
      assertTrue(boolean1 == boolean0);
      
      regexp0.toString();
      assertTrue(regexp0.equals((Object)regexp1));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp_Op0);
      regexp0.max = 1745;
      String string0 = regexp0.name;
      boolean boolean1 = regexp_Op0.isPseudo();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = 0;
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.equals(regexp_Op0);
      regexp1.equals(regexp0);
      regexp0.flags = 0;
      Regexp[] regexpArray0 = new Regexp[8];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp1;
      Regexp.Op regexp_Op1 = Regexp.Op.LITERAL;
      Regexp regexp2 = new Regexp(regexp_Op1);
      regexpArray0[2] = regexp2;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexpArray0[7] = regexp1;
      regexp0.subs = regexpArray0;
      regexp1.max = 158;
      regexp1.min = (-3167);
      regexp1.equals((Object) null);
      // Undeclared exception!
      try { 
        regexp0.maxCap();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[0];
      regexp0.subs = regexpArray0;
      regexp1.reinit();
      regexp1.equals((Object) null);
      Regexp.Op.values();
      regexp0.subs = regexpArray0;
      regexp0.equals("");
      Regexp.Op.values();
      regexp1.op = regexp_Op0;
      regexp1.maxCap();
      String string0 = regexp1.toString();
      assertEquals("LEFT_PAREN", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[8];
      regexp0.runes = intArray0;
      String string0 = regexp0.toString();
      assertEquals("[\\x00\\x00\\x00\\x00]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[8];
      intArray0[0] = (-1449);
      intArray0[1] = 0;
      intArray0[2] = (-1747);
      intArray0[3] = 3453;
      intArray0[4] = 1247;
      intArray0[5] = 1089;
      regexp0.cap = 0;
      intArray0[6] = 0;
      intArray0[7] = (-1547);
      regexp0.runes = intArray0;
      regexp0.toString();
      regexp0.toString();
      String string0 = regexp0.toString();
      assertEquals("[\\xfffffa57-\\x00\\xfffff92d-\u0D7D\u04DF-\u0441\\x00-\\xfffff9f5]", string0);
      
      Regexp.Op.values();
      boolean boolean0 = regexp_Op0.isPseudo();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[1];
      regexp0.runes = intArray0;
      String string0 = regexp0.toString();
      assertEquals("[invalid char class]", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[0];
      regexp0.runes = intArray0;
      String string0 = regexp0.toString();
      assertEquals("[^\\x00-\\x{10FFFF}]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[2];
      intArray0[0] = 6;
      intArray0[1] = (-3642);
      regexp0.cap = (-1363);
      Regexp[] regexpArray0 = new Regexp[7];
      Regexp.Op regexp_Op1 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      Regexp regexp2 = new Regexp(regexp0);
      regexpArray0[2] = regexp2;
      Object object0 = new Object();
      boolean boolean0 = regexp1.equals(object0);
      assertFalse(boolean0);
      
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexp0.subs = regexpArray0;
      regexp0.runes = intArray0;
      Regexp regexp3 = new Regexp(regexp0);
      regexpArray0[5].flags = (-3642);
      regexp3.reinit();
      Regexp.Op.values();
      int int0 = regexp3.maxCap();
      assertEquals(0, int0);
      
      regexpArray0[4].min = 0;
      regexp1.toString();
      regexp0.toString();
      assertTrue(regexp0.equals((Object)regexp3));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.maxCap();
      regexp_Op0.isPseudo();
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp0;
      regexp0.subs = regexpArray0;
      Regexp.Op regexp_Op1 = Regexp.Op.ALTERNATE;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexp0.subs = regexpArray0;
      regexpArray0[2].flags = 0;
      regexp0.toString();
      int int0 = 807;
      regexpArray0[0].cap = 807;
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("(?:)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.(?:)
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.toString();
      regexp0.cap = 10;
      regexp0.min = 10;
      regexp1.max = 119156;
      regexp1.name = "H&*WBqGlXLlXNBg";
      regexp1.reinit();
      Regexp regexp2 = new Regexp(regexp1);
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      regexp2.op = regexp_Op1;
      Regexp.Op.values();
      regexp1.maxCap();
      // Undeclared exception!
      try { 
        regexp2.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.toString();
      regexp0.cap = 10;
      regexp0.min = 10;
      regexp1.max = 119156;
      String string0 = "H&*WBqGl\\XLlXNBg";
      regexp1.name = "H&*WBqGlXLlXNBg";
      regexp1.reinit();
      Regexp regexp2 = new Regexp(regexp1);
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      regexp2.op = regexp_Op1;
      Regexp.Op.values();
      regexp1.maxCap();
      // Undeclared exception!
      try { 
        regexp2.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.toString();
      Regexp regexp1 = new Regexp(regexp0);
      int[] intArray0 = new int[4];
      intArray0[0] = 0;
      intArray0[1] = 577;
      intArray0[2] = 0;
      intArray0[3] = 12;
      regexp0.runes = intArray0;
      regexp0.toString();
      Regexp regexp2 = new Regexp(regexp1);
      regexp0.equals(regexp2);
      regexp0.maxCap();
      Regexp.Op regexp_Op1 = Regexp.Op.LEFT_PAREN;
      regexp_Op1.isPseudo();
      Object object0 = new Object();
      regexp2.equals("z");
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("z");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.z
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[2];
      intArray0[0] = 6;
      intArray0[1] = (-3642);
      regexp0.cap = (-1363);
      Regexp[] regexpArray0 = new Regexp[7];
      Regexp.Op regexp_Op1 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      Regexp regexp2 = new Regexp(regexp0);
      regexpArray0[2] = regexp2;
      Object object0 = new Object();
      regexp1.equals(object0);
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexp0.subs = regexpArray0;
      regexp0.runes = intArray0;
      Regexp regexp3 = new Regexp(regexp0);
      regexpArray0[5].flags = (-3642);
      Regexp.Op.values();
      regexp2.toString();
      // Undeclared exception!
      regexp0.maxCap();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      regexp_Op0.isPseudo();
      regexp_Op0.isPseudo();
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp1;
      regexp_Op0.isPseudo();
      regexp1.toString();
      regexp2.subs = regexpArray0;
      regexp1.equals(regexp2);
      regexp1.maxCap();
      regexp0.maxCap();
      Object object0 = new Object();
      boolean boolean0 = regexp1.equals(object0);
      regexpArray0[0].name = null;
      regexp0.maxCap();
      String string0 = regexp1.toString();
      assertEquals("[^\\x00-\\x{10FFFF}]", string0);
      
      boolean boolean1 = regexp_Op0.isPseudo();
      assertTrue(boolean1 == boolean0);
      
      int int0 = regexp2.maxCap();
      assertEquals(0, int0);
      
      regexp0.reinit();
      assertTrue(regexp0.equals((Object)regexp1));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = 0;
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.equals(regexp_Op0);
      regexp1.equals(regexp0);
      regexp0.flags = 0;
      Regexp[] regexpArray0 = new Regexp[8];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp1;
      Regexp.Op regexp_Op1 = Regexp.Op.LITERAL;
      Regexp regexp2 = new Regexp(regexp_Op1);
      regexpArray0[2] = regexp2;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexpArray0[7] = regexp0;
      regexp0.subs = regexpArray0;
      regexp1.max = 158;
      regexp1.min = (-3167);
      regexp0.toString();
      Regexp.Op.values();
      Regexp regexp3 = new Regexp(regexp1);
      regexp3.maxCap();
      regexp0.reinit();
      int int0 = regexp3.maxCap();
      assertEquals(0, int0);
      
      boolean boolean0 = regexp0.equals((Object) null);
      assertFalse(boolean0);
      assertFalse(regexp0.equals((Object)regexp2));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.cap = (-4784);
      int[] intArray0 = new int[4];
      regexp0.flags = 1455;
      intArray0[0] = (-4784);
      regexp0.flags = (-1547);
      regexp0.op = regexp_Op0;
      intArray0[1] = (-4784);
      intArray0[2] = (-968);
      regexp0.reinit();
      intArray0[3] = (-4784);
      regexp0.runes = intArray0;
      regexp0.min = (-4784);
      // Undeclared exception!
      try { 
        regexp0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.toString();
      boolean boolean0 = regexp_Op0.isPseudo();
      regexp0.toString();
      boolean boolean1 = regexp0.equals(regexp1);
      assertTrue(boolean1);
      
      regexp0.maxCap();
      regexp1.maxCap();
      Object object0 = new Object();
      Regexp regexp2 = new Regexp(regexp0);
      Object object1 = new Object();
      regexp2.equals(object1);
      Regexp.Op.values();
      boolean boolean2 = regexp0.equals(object0);
      assertTrue(boolean2 == boolean0);
      
      regexp2.maxCap();
      regexp0.toString();
      Regexp regexp3 = new Regexp(regexp_Op0);
      regexp3.maxCap();
      Regexp regexp4 = new Regexp(regexp_Op0);
      regexp4.reinit();
      regexp4.maxCap();
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.toString();
      Regexp regexp1 = new Regexp(regexp0);
      String string0 = regexp0.name;
      regexp0.reinit();
      Object object0 = new Object();
      regexp0.equals(regexp1);
      regexp0.toString();
      Regexp.Op.values();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("A");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.A
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      String string0 = regexp0.toString();
      assertEquals("", string0);
      
      regexp0.toString();
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      assertNotNull(regexp_OpArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp.Op regexp_Op1 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op1);
      boolean boolean0 = regexp0.equals(regexp_Op1);
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.reinit();
      Object object0 = new Object();
      Regexp.Op regexp_Op2 = Regexp.Op.ANY_CHAR_NOT_NL;
      regexp1.op = regexp_Op2;
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
      
      regexp0.equals(regexp_Op0);
      regexp0.toString();
      Object object1 = new Object();
      regexp1.equals(regexp_Op0);
      regexp1.toString();
      assertFalse(regexp1.equals((Object)regexp0));
      
      Regexp.Op.values();
      Regexp regexp2 = new Regexp(regexp0);
      regexp2.min = 0;
      boolean boolean1 = regexp0.equals(regexp2);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[9];
      regexpArray0[5] = regexp0;
      regexp0.subs = regexpArray0;
      // Undeclared exception!
      try { 
        regexp0.equals(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Object object0 = new Object();
      regexp0.equals(regexp_Op0);
      // Undeclared exception!
      try { 
        regexp0.equals(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
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
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      // Undeclared exception!
      try { 
        regexp1.equals(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Object object0 = new Object();
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
      
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.equals(regexp0);
      regexp1.toString();
      Object object1 = new Object();
      regexp1.equals(regexp_Op0);
      Regexp regexp2 = new Regexp(regexp_Op0);
      Regexp regexp3 = new Regexp(regexp1);
      Regexp.Op regexp_Op1 = Regexp.Op.END_LINE;
      Regexp regexp4 = new Regexp(regexp_Op1);
      regexp4.toString();
      Regexp.Op.values();
      Regexp regexp5 = new Regexp(regexp1);
      boolean boolean0 = regexp4.equals(object0);
      assertFalse(boolean0);
      assertFalse(regexp4.equals((Object)regexp1));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[8];
      intArray0[7] = (-1449);
      intArray0[0] = 0;
      intArray0[2] = (-1747);
      intArray0[3] = 3453;
      intArray0[4] = 1201;
      intArray0[5] = 1089;
      intArray0[6] = (-1747);
      intArray0[7] = (-1547);
      regexp0.runes = intArray0;
      regexp0.toString();
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      assertNotNull(regexp_OpArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.name = "NO_WORD_BOUNDARY";
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
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.toString();
      boolean boolean0 = regexp0.equals(regexp1);
      int int0 = regexp1.cap;
      assertEquals(0, int0);
      
      boolean boolean1 = regexp1.equals("VERTICAL_BAR");
      assertFalse(boolean1 == boolean0);
      
      regexp0.reinit();
      assertTrue(regexp0.equals((Object)regexp1));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[8];
      intArray0[7] = (-1449);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      regexp2.equals(regexp1);
      Regexp regexp3 = new Regexp(regexp_Op0);
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
  public void test32()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[8];
      regexp0.runes = intArray0;
      Regexp regexp1 = new Regexp(regexp0);
      boolean boolean0 = regexp0.equals(regexp1);
      assertTrue(boolean0);
      
      int int0 = regexp1.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
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
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[3];
      intArray0[0] = (-819);
      intArray0[1] = (-2719);
      intArray0[2] = 3286;
      regexp0.runes = intArray0;
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
  public void test35()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[1];
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
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.flags = 1201;
      regexp1.max = 7;
      boolean boolean0 = regexp1.equals(regexp0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.op = regexp_Op0;
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexp1.cap = 529;
      Regexp regexp2 = new Regexp(regexp1);
      boolean boolean0 = regexp1.equals(regexp0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        regexp0.equals(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      boolean boolean0 = regexp0.equals(regexp1);
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
      
      Object object0 = new Object();
      boolean boolean1 = regexp1.equals(object0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.max = 2948;
      Regexp regexp1 = new Regexp(regexp0);
      // Undeclared exception!
      try { 
        regexp0.equals(regexp1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[9];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexpArray0[7] = regexp0;
      regexpArray0[7].flags = (-1709);
      regexpArray0[8] = regexp0;
      regexp0.subs = regexpArray0;
      regexp0.equals(regexp0.subs);
      int int0 = regexp0.cap;
      // Undeclared exception!
      try { 
        regexp0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Object object0 = new Object();
      boolean boolean0 = regexp0.equals(object0);
      assertFalse(boolean0);
      
      Regexp.Op regexp_Op1 = Regexp.Op.BEGIN_LINE;
      Regexp regexp1 = new Regexp(regexp_Op1);
      boolean boolean1 = regexp1.equals(regexp1);
      assertFalse(regexp1.equals((Object)regexp0));
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      regexp_Op0.isPseudo();
      regexp_Op0.isPseudo();
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      Regexp regexp2 = new Regexp(regexp1);
      Regexp.Op regexp_Op1 = Regexp.Op.LEFT_PAREN;
      regexp2.op = regexp_Op1;
      regexp1.equals(regexp2);
      regexp0.equals(regexp1);
      regexp1.maxCap();
      Regexp regexp3 = new Regexp(regexp_Op1);
      Regexp[] regexpArray0 = new Regexp[7];
      int[] intArray0 = new int[5];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 0;
      intArray0[4] = 1089;
      regexp0.runes = intArray0;
      regexpArray0[0] = regexp1;
      regexp_Op0.isPseudo();
      Regexp.Op regexp_Op2 = Regexp.Op.LITERAL;
      regexp2.op = regexp_Op2;
      regexpArray0[1] = regexp2;
      regexpArray0[2] = regexp1;
      Regexp.Op regexp_Op3 = Regexp.Op.LITERAL;
      Regexp regexp4 = new Regexp(regexp_Op3);
      regexpArray0[3] = regexp4;
      regexpArray0[4] = regexp2;
      regexpArray0[5] = regexp1;
      regexp4.cap = 3719;
      regexp4.reinit();
      regexpArray0[6] = regexp3;
      regexp3.subs = regexpArray0;
      regexp0.equals(regexp3);
      regexp2.op.isPseudo();
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      assertNotNull(regexp_OpArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = 378;
      Regexp.Op regexp_Op1 = Regexp.Op.END_LINE;
      regexp0.op = regexp_Op1;
      regexp0.equals(regexp0);
      String string0 = regexp0.toString();
      assertEquals("$", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      boolean boolean0 = regexp0.equals("");
      assertFalse(boolean0);
      
      regexp1.max = 2775;
      boolean boolean1 = regexp0.equals(regexp1);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.EMPTY_MATCH;
      regexp0.op = regexp_Op1;
      regexp0.equals(regexp0);
      regexp0.toString();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("QEh7lW8T&7Oz|UY=;6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.QEh7lW8T&7Oz|UY=;6
         //
         verifyException("java.lang.Enum", e);
      }
  }
}
