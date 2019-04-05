/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 08:47:37 GMT 2019
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
      int[] intArray0 = new int[1];
      intArray0[0] = 15;
      regexp0.runes = intArray0;
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp0);
      regexp2.flags = 13;
      regexp1.equals(regexp2);
      Object object0 = new Object();
      Regexp regexp3 = new Regexp(regexp_Op0);
      regexp1.equals(regexp3);
      regexp0.reinit();
      regexp1.equals(object0);
      Object object1 = new Object();
      regexp0.equals(object1);
      regexp1.toString();
      regexp_Op0.isPseudo();
      regexp1.maxCap();
      regexp_Op0.isPseudo();
      regexp_Op0.isPseudo();
      regexp3.maxCap();
      regexp2.equals((Object) null);
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      assertEquals(21, regexp_OpArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.toString();
      regexp0.name = "BEGIN_TEXT";
      regexp0.max = (-3802);
      regexp0.min = 493;
      regexp0.toString();
      regexp0.toString();
      Regexp.Op.valueOf("VERTICAL_BAR");
      regexp0.toString();
      regexp0.toString();
      regexp0.flags = 1513;
      regexp0.equals("z");
      Regexp.Op.valueOf("VERTICAL_BAR");
      regexp0.max = 12;
      regexp0.toString();
      Regexp.Op.values();
      Regexp.Op.values();
      regexp0.equals("");
      regexp0.toString();
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      Regexp.Op[] regexp_OpArray1 = Regexp.Op.values();
      assertNotSame(regexp_OpArray1, regexp_OpArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.equals(regexp0);
      regexp1.cap = (-1616);
      regexp1.maxCap();
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
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.flags = 5;
      regexp1.reinit();
      regexp1.cap = 1405;
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp0;
      regexp1.subs = regexpArray0;
      int[] intArray0 = new int[8];
      intArray0[0] = 5;
      intArray0[1] = 1415;
      intArray0[2] = 1405;
      intArray0[3] = 1405;
      intArray0[4] = 5;
      intArray0[5] = 1405;
      intArray0[6] = 1405;
      intArray0[7] = 1405;
      regexp0.runes = intArray0;
      regexp1.name = "com.google.re2j.Regexp$1";
      regexp0.min = 1405;
      regexp1.equals(regexp0);
      regexp0.cap = 493;
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
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[7];
      intArray0[0] = 1479;
      intArray0[1] = (-659);
      intArray0[2] = 10;
      intArray0[3] = (-218);
      intArray0[4] = 206;
      intArray0[5] = 1118;
      intArray0[6] = (-1000);
      regexp0.runes = intArray0;
      regexp0.op = regexp_Op0;
      String string0 = regexp0.toString();
      assertEquals("[invalid char class]", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.flags = 1679;
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.min = (-168);
      regexp1.name = "Egyptian_Hieroglyphs";
      Regexp[] regexpArray0 = new Regexp[9];
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexpArray0[7] = regexp1;
      regexpArray0[8] = regexp1;
      regexp1.subs = regexpArray0;
      regexp1.flags = 3424;
      regexp1.equals(regexp_Op0);
      regexp0.equals(regexp1);
      Regexp.Op.values();
      regexp_Op0.isPseudo();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf(" >\"(D GE+(tk3_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op. >\"(D GE+(tk3_
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[6];
      intArray0[0] = 5;
      intArray0[1] = (-2942);
      intArray0[2] = 2147483645;
      intArray0[3] = 18;
      intArray0[4] = (-5967);
      intArray0[5] = 945;
      regexp0.runes = intArray0;
      Regexp regexp1 = new Regexp(regexp0);
      assertTrue(regexp1.equals((Object)regexp0));
      
      regexp1.op = regexp_Op0;
      String string0 = regexp1.toString();
      assertEquals("\\x05\\xfffff482\\x{7ffffffd}\\x12\\xffffe8b1\u03B1", string0);
      
      boolean boolean0 = regexp1.op.isPseudo();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = 1;
      Regexp.Op regexp_Op1 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexp1.cap = 1;
      regexp0.max = 1;
      regexp1.equals("Buhid");
      regexp0.name = "d";
      regexp1.cap = (-2769);
      regexp1.cap = (-2769);
      regexp0.equals(regexp1);
      regexp1.min = 1;
      regexp1.maxCap();
      Object object0 = new Object();
      regexp1.equals(object0);
      Regexp regexp2 = new Regexp(regexp0);
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
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      int[] intArray0 = new int[2];
      regexp1.runes = intArray0;
      boolean boolean0 = regexp1.equals(regexp0);
      assertTrue(boolean0);
      
      intArray0[0] = 166;
      intArray0[1] = 12;
      regexp1.runes = intArray0;
      regexp1.toString();
      regexp0.toString();
      Regexp.Op.values();
      int int0 = regexp1.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.min = (-3361);
      regexp0.name = "3~q!e^X3965&F#9l";
      regexp1.equals(regexp0);
      regexp1.flags = 2131;
      regexp1.op = regexp_Op0;
      regexp1.max = (-1037);
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
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.PLUS;
      regexp0.op = regexp_Op1;
      regexp0.flags = 1363;
      regexp0.max = 119938;
      regexp0.op = regexp_Op0;
      regexp0.op.isPseudo();
      regexp0.flags = 119938;
      regexp0.flags = (-1065);
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
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.name = "Tagbanwa";
      regexp0.cap = 2;
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp1;
      regexpArray0[3] = regexp1;
      regexp0.subs = regexpArray0;
      regexpArray0[3].max = (-970);
      regexpArray0[1].name = "W";
      regexp0.flags = (-1802);
      regexp1.min = 12;
      regexp0.equals(regexp1);
      regexp1.cap = 5;
      regexp1.min = (-1802);
      boolean boolean0 = regexp1.equals(regexp_Op0);
      Regexp.Op.values();
      boolean boolean1 = regexp_Op0.isPseudo();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = "4lPWxgT?R!=Gri9%c";
      int int0 = 16;
      Regexp[] regexpArray0 = new Regexp[3];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      Regexp regexp1 = new Regexp(regexp0);
      regexpArray0[2] = regexp1;
      regexp0.subs = regexpArray0;
      regexpArray0[0].runes = null;
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
  public void test13()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.cap = 43785;
      int[] intArray0 = new int[3];
      regexp0.reinit();
      intArray0[0] = 0;
      regexp0.max = 43785;
      intArray0[1] = 0;
      intArray0[2] = 0;
      regexp0.runes = intArray0;
      Object object0 = new Object();
      regexp0.equals(object0);
      regexp_Op0.isPseudo();
      regexp0.maxCap();
      regexp0.maxCap();
      regexp0.equals(object0);
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
  public void test14()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[6];
      intArray0[0] = 18;
      intArray0[1] = 18;
      intArray0[2] = 18;
      intArray0[3] = 18;
      intArray0[4] = 18;
      intArray0[5] = 18;
      regexp0.runes = intArray0;
      regexp0.max = 18;
      Regexp[] regexpArray0 = new Regexp[0];
      regexp0.subs = regexpArray0;
      regexp0.min = 18;
      regexp0.name = "";
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
  public void test15()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[3];
      regexp0.toString();
      intArray0[0] = 13;
      regexp0.runes = intArray0;
      intArray0[1] = (-2437);
      regexp0.flags = 4;
      intArray0[2] = 2;
      regexp0.runes = intArray0;
      regexp0.toString();
      Regexp.Op.values();
      regexp0.maxCap();
      regexp0.toString();
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.equals(regexp1);
      Regexp.Op.values();
      regexp0.toString();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.^
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.flags = 65792;
      regexp0.name = "&Wn}";
      regexp0.cap = 2483;
      regexp0.name = "";
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.toString();
      regexp0.name = "com.google.re2j.Regexp";
      regexp1.min = 65792;
      regexp1.min = 10;
      regexp1.flags = 10;
      regexp1.maxCap();
      Regexp.Op.values();
      regexp0.name = "";
      regexp0.min = 2483;
      regexp1.maxCap();
      regexp1.equals("");
      regexp1.toString();
      regexp0.min = 65792;
      regexp0.equals((Object) null);
      Regexp.Op.values();
      boolean boolean0 = regexp1.equals("LEFT_PAREN");
      regexp_Op0.isPseudo();
      regexp_Op0.isPseudo();
      regexp1.equals("");
      regexp_Op0.isPseudo();
      Regexp.Op.values();
      regexp1.toString();
      int int0 = regexp1.maxCap();
      assertEquals(0, int0);
      
      boolean boolean1 = regexp_Op0.isPseudo();
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      regexp_Op0.isPseudo();
      regexp_Op0.isPseudo();
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.toString();
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      regexp2.cap = 11;
      regexp1.equals(regexp2);
      boolean boolean0 = regexp1.equals(regexp0);
      regexp1.toString();
      regexp0.maxCap();
      regexp0.toString();
      boolean boolean1 = regexp_Op0.isPseudo();
      assertFalse(boolean1 == boolean0);
      
      int int0 = regexp2.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      int[] intArray0 = new int[8];
      intArray0[0] = (-1075);
      intArray0[1] = (-734);
      intArray0[2] = 1013;
      intArray0[3] = 17;
      intArray0[4] = 8463;
      intArray0[5] = 345;
      intArray0[6] = 7;
      intArray0[7] = 91;
      regexp1.runes = intArray0;
      regexp1.maxCap();
      Regexp.Op.values();
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      assertEquals(21, regexp_OpArray0.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.reinit();
      regexp0.max = 1;
      regexp0.reinit();
      boolean boolean0 = regexp1.equals(regexp0);
      boolean boolean1 = regexp1.equals(regexp_Op0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.equals(regexp_Op0);
      regexp0.name = "";
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.equals(regexp1);
      Regexp[] regexpArray0 = new Regexp[2];
      regexpArray0[0] = regexp1;
      regexp0.equals(regexp1);
      int int0 = 91;
      regexp1.min = 91;
      Regexp.Op regexp_Op1 = Regexp.Op.NO_WORD_BOUNDARY;
      regexp1.op = regexp_Op1;
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
  public void test21()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.maxCap();
      regexp1.max = 15;
      regexp0.maxCap();
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
  public void test22()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.flags = 656;
      regexp0.equals(regexp_Op0);
      regexp0.maxCap();
      regexp_Op0.isPseudo();
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexp1.op = regexp_Op0;
      regexp0.equals(regexp1);
      regexp1.op.isPseudo();
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
  public void test23()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.toString();
      Regexp.Op.valueOf("VERTICAL_BAR");
      Regexp regexp2 = new Regexp(regexp1);
      Regexp.Op regexp_Op1 = Regexp.Op.QUEST;
      Regexp regexp3 = new Regexp(regexp_Op1);
      regexp3.flags = (-1732);
      boolean boolean0 = regexp2.equals(regexp3);
      assertFalse(boolean0);
      
      regexp2.flags = 1497;
      regexp0.equals(regexp2);
      regexp1.toString();
      regexp2.toString();
      assertTrue(regexp1.equals((Object)regexp0));
      
      Regexp regexp4 = new Regexp(regexp0);
      regexp3.equals(regexp4);
      Regexp.Op.values();
      regexp4.equals(regexp0);
      Regexp.Op.valueOf("VERTICAL_BAR");
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.ALTERNATE;
      int[] intArray0 = new int[5];
      intArray0[0] = (-2777);
      intArray0[1] = 10;
      intArray0[2] = (-1457);
      intArray0[3] = 18;
      intArray0[4] = 2613;
      regexp0.runes = intArray0;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexp1.min = 18;
      regexp0.equals(regexp1);
      Object object0 = new Object();
      regexp1.equals(object0);
      regexp0.toString();
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      assertEquals(21, regexp_OpArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = 4992;
      regexp0.equals(regexp_Op0);
      regexp0.toString();
      Regexp[] regexpArray0 = new Regexp[5];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexp0.subs = regexpArray0;
      regexp0.reinit();
      regexp0.max = (-895);
      regexp0.name = "";
      regexp0.flags = 6;
      regexp0.flags = 6;
      regexp0.toString();
      regexp0.name = "S7";
      regexp0.maxCap();
      Regexp.Op.values();
      Regexp.Op.values();
      boolean boolean0 = regexp_Op0.isPseudo();
      regexp0.maxCap();
      Regexp.Op.valueOf("NO_WORD_BOUNDARY");
      Regexp.Op.values();
      regexp_Op0.isPseudo();
      Object object0 = new Object();
      boolean boolean1 = regexp0.equals(object0);
      assertTrue(boolean1 == boolean0);
      
      Regexp.Op.values();
      Regexp.Op.values();
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexp1.min = 4376;
      regexp1.cap = 772;
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
  public void test27()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.op = regexp_Op0;
      String string0 = regexp0.toString();
      assertEquals("(?:)", string0);
      
      regexp0.op.isPseudo();
      regexp0.op = regexp_Op0;
      regexp0.cap = 669;
      boolean boolean0 = regexp0.equals(regexp_Op0);
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
      
      boolean boolean1 = regexp0.op.isPseudo();
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = "}5{=h1";
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
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("^", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      // Undeclared exception!
      try { 
        regexp1.equals(regexp2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.END_LINE;
      regexp0.reinit();
      regexp0.toString();
      regexp0.op = regexp_Op1;
      int int0 = 4;
      regexp0.toString();
      regexp0.cap = 4;
      regexp0.toString();
      Regexp.Op.values();
      regexp0.equals(regexp_Op1);
      regexp0.maxCap();
      regexp0.toString();
      Regexp.Op.values();
      regexp0.toString();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.$
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.QUEST;
      regexp0.op = regexp_Op1;
      regexp0.cap = 6;
      regexp0.flags = 6;
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
  public void test33()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[8];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp1;
      regexpArray0[4] = regexp1;
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      Regexp regexp2 = new Regexp(regexp_Op1);
      regexpArray0[5] = regexp2;
      regexpArray0[6] = regexp1;
      Regexp regexp3 = new Regexp(regexp2);
      regexpArray0[7] = regexp3;
      regexp1.subs = regexpArray0;
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
  public void test34()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.min = (-1462);
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
  public void test35()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
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
  public void test36()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.cap = 20;
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.max = 1642;
      regexp1.maxCap();
      regexp1.maxCap();
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
  public void test37()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.cap = 0;
      regexp0.reinit();
      int[] intArray0 = new int[8];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 0;
      intArray0[6] = 0;
      intArray0[7] = 0;
      regexp0.runes = intArray0;
      regexp0.equals(regexp_Op0);
      regexp0.reinit();
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
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      int[] intArray0 = new int[1];
      regexp1.flags = 0;
      regexp1.max = 0;
      regexp1.flags = (-1871);
      intArray0[0] = (-2111);
      regexp1.runes = intArray0;
      regexp1.equals(regexp0);
      regexp1.reinit();
      regexp1.flags = (-1871);
      regexp1.cap = 0;
      regexp0.reinit();
      regexp0.toString();
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
  public void test39()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.max = 1364;
      int[] intArray0 = new int[4];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 0;
      Regexp[] regexpArray0 = new Regexp[3];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexp1.subs = regexpArray0;
      regexp1.runes = intArray0;
      regexp1.min = 0;
      Regexp regexp2 = new Regexp(regexp_Op0);
      regexp0.name = "}&816CYx!=eR!B@<";
      regexp2.name = "}&816CYx!=eR!B@<";
      regexp1.equals(regexp2);
      regexp2.toString();
      Regexp.Op.values();
      Regexp.Op.values();
      Regexp.Op.values();
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
  public void test40()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.toString();
      regexp0.name = "M";
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp2 = new Regexp(regexp_Op1);
      regexp1.equals(regexp2);
      regexp1.maxCap();
      Regexp.Op.values();
      regexp0.equals("LEFT_PAREN");
      regexp0.toString();
      regexp0.flags = 0;
      String string0 = "";
      regexp0.name = "";
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("Br~/_\"a;r;W8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.Br~/_\"a;r;W8
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.max = 5;
      regexp0.equals("");
      regexp0.toString();
      regexp0.maxCap();
      regexp_Op0.isPseudo();
      regexp0.flags = 0;
      regexp0.toString();
      Object object0 = new Object();
      regexp0.equals(object0);
      Object object1 = new Object();
      regexp0.equals(object1);
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
  public void test42()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp0;
      regexp0.subs = regexpArray0;
      Regexp[] regexpArray1 = new Regexp[0];
      regexp0.subs = regexpArray1;
      regexp0.toString();
      regexp0.reinit();
      regexp0.flags = (-82);
      Regexp.Op.valueOf("CAPTURE");
      regexp0.equals(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.equals(regexp1);
      regexp1.flags = 2572;
      regexp0.toString();
      regexp0.maxCap();
      Regexp regexp2 = new Regexp(regexp0);
      regexp2.op = regexp_Op0;
      regexp1.equals(regexp2);
      regexp2.maxCap();
      regexp_Op0.isPseudo();
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
  public void test43()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.cap = (-1934);
      regexp0.equals((Object) null);
      regexp0.max = (-1180);
      regexp0.equals(regexp_Op0);
      regexp0.reinit();
      regexp0.max = 4962;
      regexp_Op0.isPseudo();
      Regexp regexp1 = new Regexp(regexp0);
      Object object0 = new Object();
      regexp1.flags = (-1180);
      regexp1.equals(object0);
      regexp0.equals(regexp1);
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
}
