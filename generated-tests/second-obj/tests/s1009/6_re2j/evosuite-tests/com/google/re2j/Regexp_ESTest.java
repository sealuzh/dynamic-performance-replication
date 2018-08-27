/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 22:25:22 GMT 2018
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
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      String string0 = regexp0.toString();
      assertEquals("(?s:.)", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.toString();
      regexp1.equals(regexp0);
      assertTrue(regexp1.equals((Object)regexp0));
      
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      String string0 = regexp1.toString();
      assertEquals("\\A", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.flags = 41;
      regexp1.maxCap();
      regexp1.equals(regexp0);
      regexp0.reinit();
      regexp1.min = (-958);
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("Qy!GN%=]nHuUw%nwTt]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.Qy!GN%=]nHuUw%nwTt]
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[16];
      regexpArray0[0] = regexp0;
      regexpArray0[4] = regexp1;
      regexpArray0[5] = regexp0;
      regexpArray0[8] = regexp1;
      regexp1.subs = regexpArray0;
      // Undeclared exception!
      try { 
        regexp1.maxCap();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = 853;
      Regexp regexp1 = new Regexp(regexp0);
      boolean boolean0 = regexp1.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.op = regexp_Op0;
      String string0 = regexp0.toString();
      assertEquals("\\B", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.name = "ZRnsf/QP2um(iZmd";
      String string0 = regexp1.toString();
      assertEquals("[^\\x00-\\x{10FFFF}]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.WORD_BOUNDARY;
      regexp0.op = regexp_Op1;
      regexp0.toString();
      Regexp.Op regexp_Op2 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp1 = new Regexp(regexp_Op2);
      boolean boolean0 = regexp0.equals(regexp1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      boolean boolean0 = regexp0.equals(regexp1);
      regexp0.reinit();
      regexp0.max = 2021;
      Regexp regexp2 = new Regexp(regexp_Op0);
      regexp1.toString();
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      regexp_Op1.isPseudo();
      regexp2.toString();
      Regexp.Op regexp_Op2 = Regexp.Op.CAPTURE;
      boolean boolean1 = regexp_Op2.isPseudo();
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.flags = 1047;
      regexp0.equals(regexp1);
      regexp0.toString();
      Regexp.Op.values();
      Regexp.Op[] regexp_OpArray1 = Regexp.Op.values();
      assertFalse(regexp_OpArray1.equals((Object)regexp_OpArray0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp.Op regexp_Op1 = Regexp.Op.valueOf("END_LINE");
      regexp_Op0.isPseudo();
      Regexp.Op regexp_Op2 = Regexp.Op.valueOf("END_LINE");
      regexp_Op1.isPseudo();
      Object object0 = new Object();
      Regexp regexp0 = new Regexp(regexp_Op2);
      String string0 = regexp0.toString();
      assertEquals("$", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
      
      String string0 = regexp0.toString();
      assertEquals("(?:)", string0);
      
      Object object0 = new Object();
      boolean boolean0 = regexp0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.reinit();
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
  public void test16()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.equals(regexp_Op0);
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
  public void test17()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.flags = 127799;
      regexp0.toString();
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      assertNotNull(regexp_OpArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      regexp_Op0.isPseudo();
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      assertNotNull(regexp_OpArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = 853;
      Regexp regexp1 = new Regexp(regexp0);
      boolean boolean0 = regexp1.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.maxCap();
      Regexp.Op.values();
      regexp1.equals(regexp0);
      String string0 = regexp0.name;
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
  public void test21()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[7];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      Regexp regexp1 = new Regexp(regexp0);
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
  public void test22()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      regexp_Op0.isPseudo();
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
  public void test23()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      regexp_Op0.isPseudo();
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op1);
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
  public void test24()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Regexp.Op.values();
      Regexp[] regexpArray0 = new Regexp[8];
      regexpArray0[0] = regexp0;
      Regexp regexp1 = new Regexp(regexp0);
      Object object0 = new Object();
      regexp0.equals(object0);
      String string0 = regexp1.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Object object0 = new Object();
      regexp0.equals(object0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.flags = 7154;
      regexp0.equals(regexp1);
      regexp0.cap = 12;
      Object object1 = new Object();
      regexp0.equals(object1);
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp0;
      regexp1.subs = regexpArray0;
      regexp0.reinit();
      String string0 = "Hyphen";
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("Hyphen");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.Hyphen
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.toString();
      boolean boolean0 = regexp1.equals(regexp0);
      assertTrue(boolean0);
      
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Regexp.Op.values();
      Regexp[] regexpArray0 = new Regexp[8];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      Regexp regexp1 = new Regexp(regexp0);
      assertTrue(regexp1.equals((Object)regexp0));
      
      regexp1.subs = regexpArray0;
      regexp0.equals(regexp1);
      assertFalse(regexp1.equals((Object)regexp0));
      
      regexpArray0[3] = regexp1;
      regexpArray0[5] = regexp0;
      regexp0.equals(regexp_Op0);
      regexp0.toString();
      assertFalse(regexp0.equals((Object)regexp1));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[7];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
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
  public void test29()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.name = "01 ";
      int int0 = regexp1.maxCap();
      assertEquals(0, int0);
      
      boolean boolean0 = regexp1.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Object object0 = new Object();
      regexp1.equals(object0);
      regexp1.equals("Hex_Digit");
      regexp_Op0.isPseudo();
      regexp0.equals(regexp1);
      Object object1 = new Object();
      regexp1.equals(object1);
      regexp0.maxCap();
      Regexp.Op regexp_Op1 = Regexp.Op.valueOf("CAPTURE");
      assertFalse(regexp_Op1.equals((Object)regexp_Op0));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.WORD_BOUNDARY;
      regexp0.op = regexp_Op1;
      regexp0.toString();
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.equals(regexp1);
      boolean boolean0 = regexp0.equals(regexp1);
      assertTrue(boolean0);
      
      regexp0.toString();
      assertTrue(regexp0.equals((Object)regexp1));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexp1.flags = (-2712);
      regexp1.reinit();
      regexp1.equals(regexp0);
      regexp_Op0.isPseudo();
      String string0 = regexp0.name;
      String string1 = "";
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
  public void test33()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.equals((Object) null);
      int[] intArray0 = new int[7];
      intArray0[0] = (-338);
      intArray0[6] = (-524);
      intArray0[2] = 1645;
      intArray0[3] = (-338);
      Regexp[] regexpArray0 = new Regexp[10];
      regexpArray0[0] = regexp0;
      Regexp regexp1 = new Regexp(regexp0);
      regexpArray0[1] = regexp0;
      regexp0.subs = regexpArray0;
      regexpArray0[1].flags = (-338);
      intArray0[5] = (-338);
      intArray0[6] = 2;
      regexp0.runes = intArray0;
      String string0 = regexp0.toString();
      assertEquals("[invalid char class]", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Regexp.Op.values();
      Regexp[] regexpArray0 = new Regexp[8];
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      Regexp regexp2 = new Regexp(regexp0);
      regexp2.subs = regexpArray0;
      regexpArray0[3] = regexp0;
      regexpArray0[5] = regexp0;
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
  public void test35()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[7];
      intArray0[0] = 10;
      intArray0[6] = (-536);
      intArray0[2] = 1645;
      intArray0[3] = 10;
      Regexp[] regexpArray0 = new Regexp[2];
      regexpArray0[0] = regexp0;
      Regexp regexp1 = new Regexp(regexp0);
      assertTrue(regexp1.equals((Object)regexp0));
      
      regexpArray0[1] = regexp1;
      regexp0.subs = regexpArray0;
      regexpArray0[1].flags = 10;
      intArray0[4] = 14;
      intArray0[5] = 1370;
      intArray0[6] = 1046;
      regexp0.runes = intArray0;
      boolean boolean0 = regexp0.equals(regexp1);
      assertFalse(regexp1.equals((Object)regexp0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.name = "";
      regexp0.min = 101;
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
  public void test37()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.name = ">6hID6tytDQ]c";
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.equals(regexp_Op0);
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
  public void test38()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.equals(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.LITERAL;
      Regexp regexp1 = new Regexp(regexp_Op1);
      Regexp regexp2 = new Regexp(regexp0);
      assertTrue(regexp2.equals((Object)regexp0));
      
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp1;
      regexp0.max = 17;
      regexp2.subs = regexpArray0;
      int[] intArray0 = new int[11];
      regexp_Op0.isPseudo();
      regexp_Op0.isPseudo();
      regexp_Op0.isPseudo();
      regexp_Op0.isPseudo();
      regexp1.runes = intArray0;
      regexp2.toString();
      assertFalse(regexp0.equals((Object)regexp2));
      
      Regexp.Op regexp_Op2 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp3 = new Regexp(regexp_Op2);
      regexp1.reinit();
      int int0 = regexp1.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.reinit();
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp1;
      regexp1.subs = regexpArray0;
      regexp_Op0.isPseudo();
      // Undeclared exception!
      try { 
        regexp1.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp1);
      assertTrue(boolean0);
      
      Object object0 = new Object();
      Regexp regexp2 = new Regexp(regexp1);
      regexp0.flags = 2361;
      regexp2.equals(regexp_Op0);
      Regexp regexp3 = new Regexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.PLUS;
      Regexp regexp4 = new Regexp(regexp_Op1);
      Regexp regexp5 = new Regexp(regexp4);
      regexp5.equals(regexp_Op1);
      String string0 = regexp3.toString();
      assertFalse(regexp0.equals((Object)regexp1));
      assertEquals("(?-m:$)", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp1);
      assertTrue(boolean0);
      
      Object object0 = new Object();
      Regexp regexp2 = new Regexp(regexp1);
      regexp0.op = regexp_Op0;
      regexp2.equals(regexp_Op0);
      Object object1 = new Object();
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      regexp2.reinit();
      Regexp regexp3 = new Regexp(regexp_Op1);
      Regexp regexp4 = new Regexp(regexp0);
      regexp2.toString();
      regexp1.reinit();
      regexp0.flags = 1314;
      Regexp.Op regexp_Op2 = Regexp.Op.EMPTY_MATCH;
      regexp_Op2.isPseudo();
      regexp3.reinit();
      regexp2.maxCap();
      regexp4.equals(regexp0);
      regexp2.reinit();
      assertFalse(regexp2.equals((Object)regexp0));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexp1.name = "";
      regexp1.equals(regexp0);
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
  public void test43()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      Regexp regexp3 = new Regexp(regexp0);
      Regexp regexp4 = new Regexp(regexp_Op0);
      Regexp regexp5 = new Regexp(regexp0);
      regexp0.min = (-303);
      regexp0.equals(regexp2);
      Regexp.Op.values();
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp.Op.values();
      regexp_Op0.isPseudo();
      regexp2.reinit();
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
  public void test44()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      Regexp[] regexpArray0 = new Regexp[15];
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexpArray0[0] = regexp0;
      Regexp regexp1 = new Regexp(regexp_Op1);
      Regexp regexp2 = new Regexp(regexp1);
      regexpArray0[5] = regexp2;
      Regexp.Op.values();
      regexp2.subs = regexpArray0;
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
  public void test45()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = (-416);
      int[] intArray0 = new int[0];
      regexp0.runes = intArray0;
      regexp0.equals(intArray0);
      Regexp regexp1 = new Regexp(regexp0);
      assertTrue(regexp1.equals((Object)regexp0));
      
      regexp1.toString();
      Object object0 = new Object();
      boolean boolean0 = regexp1.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.max = 2065;
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.max = 2065;
      regexp1.runes = null;
      Regexp regexp2 = new Regexp(regexp1);
      regexp2.max = 2065;
      regexp2.max = 2184;
      regexp1.reinit();
      regexp0.equals(regexp1);
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("Old_Persian");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.Old_Persian
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.cap = 123;
      regexp0.flags = 123;
      int[] intArray0 = new int[2];
      regexp0.name = "";
      regexp0.runes = intArray0;
      regexp0.name = regexp0.name;
      regexp0.toString();
      regexp0.max = 123;
      int int0 = regexp0.min;
      Regexp.Op.values();
      Regexp.Op regexp_Op1 = Regexp.Op.PLUS;
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
  public void test48()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.cap = 123;
      regexp0.flags = 123;
      int[] intArray0 = new int[2];
      intArray0[0] = 123;
      intArray0[1] = 123;
      regexp0.name = "";
      regexp0.runes = intArray0;
      regexp0.name = "\b";
      regexp0.toString();
      Regexp.Op.values();
      regexp0.maxCap();
      Regexp.Op.values();
      Regexp.Op regexp_Op1 = Regexp.Op.CONCAT;
      regexp_Op1.isPseudo();
      Regexp.Op regexp_Op2 = Regexp.Op.NO_WORD_BOUNDARY;
      regexp_Op2.isPseudo();
      Regexp.Op regexp_Op3 = Regexp.Op.END_LINE;
      regexp_Op3.isPseudo();
      Object object0 = new Object();
      regexp0.maxCap();
      regexp0.toString();
      regexp_Op2.isPseudo();
      regexp_Op0.isPseudo();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("\b");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.\b
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.cap = 123;
      regexp0.flags = 123;
      int[] intArray0 = new int[2];
      intArray0[0] = 123;
      regexp0.name = "";
      regexp0.runes = intArray0;
      regexp0.toString();
      Regexp.Op regexp_Op1 = Regexp.Op.QUEST;
      Regexp regexp1 = new Regexp(regexp_Op1);
      Regexp regexp2 = new Regexp(regexp1);
      Regexp.Op.values();
      Regexp.Op regexp_Op2 = Regexp.Op.CONCAT;
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
  public void test50()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.cap = 123;
      regexp0.flags = 123;
      int[] intArray0 = new int[2];
      regexp0.name = "";
      regexp0.runes = intArray0;
      regexp0.name = regexp0.name;
      regexp0.toString();
      regexp0.max = 123;
      Regexp.Op.values();
      int int0 = regexp0.min;
      regexp0.toString();
      int int1 = regexp0.maxCap();
      assertTrue(int1 == int0);
      
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.toString();
      Regexp regexp2 = new Regexp(regexp0);
      Regexp regexp3 = new Regexp(regexp0);
      boolean boolean0 = regexp3.equals("(?i:x00x00)");
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      boolean boolean1 = regexp_Op1.isPseudo();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = (-430);
      int[] intArray0 = new int[1];
      regexp0.runes = intArray0;
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      regexp0.op = regexp_Op1;
      Regexp[] regexpArray0 = new Regexp[15];
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp0;
      regexpArray0[12] = regexp0;
      Regexp regexp2 = new Regexp(regexp_Op1);
      Regexp regexp3 = new Regexp(regexp2);
      regexpArray0[5] = regexp3;
      regexp0.subs = regexpArray0;
      Regexp.Op.values();
      int int0 = regexp0.cap;
      regexp0.toString();
      regexp0.equals(regexp0);
      Regexp regexp4 = new Regexp(regexp0.op);
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
  public void test52()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexp1.name = "";
      regexp1.cap = 419;
      regexp1.equals(regexp0);
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
}