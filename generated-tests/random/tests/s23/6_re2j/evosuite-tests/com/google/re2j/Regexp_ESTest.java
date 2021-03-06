/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 07:44:55 GMT 2019
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
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.name = "";
      regexp0.name = "";
      regexp0.reinit();
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[0];
      regexp1.flags = 256;
      regexp1.subs = regexpArray0;
      regexp0.equals((Object) null);
      regexp0.toString();
      regexp1.equals(regexp0);
      regexp_Op0.isPseudo();
      regexp0.equals("");
      regexp0.maxCap();
      regexp0.min = 0;
      regexp0.maxCap();
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
  public void test01()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      regexp_Op0.isPseudo();
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op1);
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
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[1];
      intArray0[0] = 1653;
      regexp0.runes = intArray0;
      Regexp regexp1 = new Regexp(regexp0);
      int int0 = 128581;
      int[] intArray1 = new int[2];
      regexp1.reinit();
      intArray1[0] = 128581;
      regexp1.runes = regexp0.runes;
      regexp1.reinit();
      intArray1[1] = 128581;
      regexp0.runes = intArray1;
      regexp1.max = 128581;
      regexp1.equals(regexp_Op0);
      regexp_Op0.isPseudo();
      Regexp.Op.values();
      Regexp[] regexpArray0 = new Regexp[0];
      regexp1.subs = regexpArray0;
      regexp0.equals(regexp1);
      regexp0.equals(regexp1);
      String string0 = "w:~Q\"M/54*)";
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("w:~Q\"M/54*)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.w:~Q\"M/54*)
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      assertEquals(21, regexp_OpArray0.length);
      
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.flags = (-1730);
      regexp0.toString();
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.min = (-1730);
      regexp1.reinit();
      regexp1.name = "N#!!<EmcJO\"4D`";
      regexp1.maxCap();
      regexp_Op0.isPseudo();
      regexp1.name = "";
      regexp0.maxCap();
      regexp1.min = 0;
      Regexp.Op.values();
      regexp1.cap = 0;
      regexp1.maxCap();
      regexp0.equals(regexp1);
      regexp1.equals("N#!!<EmcJO\"4D`");
      regexp_Op0.isPseudo();
      regexp1.toString();
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
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      regexp_Op0.isPseudo();
      regexp_Op0.isPseudo();
      Regexp.Op regexp_Op1 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op1);
      regexp0.flags = (-443);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.reinit();
      regexp0.equals(regexp1);
      regexp0.max = (-1557);
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
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[9];
      Regexp regexp1 = new Regexp(regexp0);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexpArray0[3].max = (-14);
      regexpArray0[6].name = "#tH5A&";
      regexpArray0[0].flags = (-474);
      regexpArray0[7] = regexp0;
      regexpArray0[8] = regexp0;
      regexp0.subs = regexpArray0;
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
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[7];
      Regexp regexp1 = new Regexp(regexp0);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexp0.reinit();
      regexpArray0[5] = regexp0;
      regexpArray0[6] = regexp0;
      regexp0.subs = regexpArray0;
      regexpArray0[3].cap = 256;
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
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[5];
      intArray0[0] = 123;
      intArray0[1] = 11;
      intArray0[2] = 9;
      intArray0[3] = 0;
      intArray0[4] = 16;
      regexp0.runes = intArray0;
      regexp0.equals(regexp_Op0);
      regexp0.name = "4Sp]d%$T`8Y;r{";
      Regexp[] regexpArray0 = new Regexp[0];
      regexp0.subs = regexpArray0;
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
  public void test08()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.flags = 256;
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.max = 256;
      regexp1.name = null;
      regexp1.name = "*";
      regexp1.toString();
      regexp1.maxCap();
      regexp0.toString();
      regexp_Op0.isPseudo();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("*");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.*
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Object object0 = new Object();
      regexp0.cap = 2568;
      regexp0.equals(object0);
      Regexp.Op.values();
      Regexp.Op regexp_Op1 = Regexp.Op.ALTERNATE;
      regexp0.op = regexp_Op1;
      Regexp.Op.values();
      Regexp[] regexpArray0 = new Regexp[1];
      Regexp regexp1 = new Regexp(regexp_Op1);
      Regexp regexp2 = new Regexp(regexp1);
      regexpArray0[0] = regexp2;
      regexp0.subs = regexpArray0;
      regexp_Op0.isPseudo();
      regexp0.maxCap();
      Regexp.Op.values();
      String string0 = "Nd";
      regexp0.equals("Nd");
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
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.flags = 496;
      int[] intArray0 = new int[9];
      intArray0[0] = 496;
      intArray0[1] = 496;
      intArray0[2] = 496;
      intArray0[3] = 496;
      intArray0[4] = 496;
      intArray0[5] = 496;
      intArray0[6] = 496;
      intArray0[7] = 1115;
      intArray0[8] = 496;
      regexp0.runes = intArray0;
      regexp0.equals(regexp1);
      regexp1.max = 1514;
      Regexp regexp2 = new Regexp(regexp_Op0);
      // Undeclared exception!
      try { 
        regexp1.equals(regexp2);
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
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.max = 10;
      Regexp regexp1 = new Regexp(regexp0);
      int[] intArray0 = new int[1];
      intArray0[0] = 10;
      regexp1.runes = intArray0;
      regexp1.toString();
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
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      int int0 = (-1384);
      // Undeclared exception!
      try { 
        regexp1.equals(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.toString();
      regexp1.min = (-1976);
      regexp1.toString();
      regexp1.toString();
      regexp1.maxCap();
      regexp1.equals(regexp0);
      regexp_Op0.isPseudo();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf(")`7jiX|V1Gy=i23!\">");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.)`7jiX|V1Gy=i23!\">
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Regexp[] regexpArray0 = new Regexp[0];
      regexp0.min = (-1729);
      regexp0.subs = regexpArray0;
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.equals(regexp0);
      regexp1.op = regexp_Op0;
      regexp0.toString();
      regexp1.equals("(?-s:.)");
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      Regexp.Op.values();
      Regexp.Op.values();
      Regexp.Op[] regexp_OpArray1 = Regexp.Op.values();
      assertNotSame(regexp_OpArray1, regexp_OpArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[4];
      intArray0[0] = 356;
      intArray0[1] = (-3056);
      intArray0[2] = 1329;
      regexp0.name = null;
      intArray0[3] = (-2002);
      regexp0.runes = intArray0;
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
  public void test16()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[5];
      intArray0[0] = 7516;
      intArray0[1] = 953;
      intArray0[2] = (-298);
      intArray0[3] = (-723);
      intArray0[4] = 3;
      regexp0.runes = intArray0;
      regexp0.toString();
      regexp0.min = 8262;
      int[] intArray1 = new int[1];
      regexp0.flags = 8262;
      intArray1[0] = 8262;
      regexp0.runes = intArray1;
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.max = 7264;
      Regexp[] regexpArray0 = new Regexp[0];
      regexp0.subs = regexpArray0;
      Object object0 = new Object();
      regexp1.equals(object0);
      regexp_Op0.isPseudo();
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      assertEquals(21, regexp_OpArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Object object0 = new Object();
      boolean boolean0 = regexp0.equals(object0);
      assertFalse(boolean0);
      
      regexp0.max = 3455;
      regexp0.toString();
      Regexp[] regexpArray0 = new Regexp[6];
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      regexp0.subs = regexpArray0;
      boolean boolean1 = regexp_Op0.isPseudo();
      regexp_Op0.isPseudo();
      regexp0.toString();
      boolean boolean2 = regexp1.equals(regexp1);
      assertFalse(boolean2 == boolean1);
      assertTrue(boolean2);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      int int0 = 125;
      regexp1.max = 125;
      // Undeclared exception!
      try { 
        regexp1.equals(regexp0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.max = 5;
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
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
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
  public void test21()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.toString();
      Object object0 = new Object();
      regexp0.equals(object0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.equals(regexp0);
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf(";wY=eY-g4}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.;wY=eY-g4}
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[5];
      intArray0[0] = 9;
      intArray0[1] = (-684);
      intArray0[2] = (-684);
      intArray0[3] = (-684);
      intArray0[4] = 8;
      regexp0.runes = intArray0;
      regexp0.cap = (-684);
      regexp0.toString();
      Object object0 = new Object();
      boolean boolean0 = regexp0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      regexp_Op0.isPseudo();
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp_Op0.isPseudo();
      regexp0.max = 256;
      regexp1.min = 256;
      regexp1.min = 256;
      regexp0.flags = 256;
      Object object0 = new Object();
      regexp1.equals(object0);
      regexp0.equals(regexp1);
      regexp0.maxCap();
      String string0 = "";
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("QT");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.QT
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.op = regexp_Op0;
      regexp0.maxCap();
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
      Regexp.Op.values();
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
  public void test26()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Object object0 = new Object();
      regexp0.equals(object0);
      regexp0.reinit();
      Regexp[] regexpArray0 = new Regexp[0];
      regexp0.subs = regexpArray0;
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.toString();
      regexp1.reinit();
      regexp1.name = "}#b8z]F:z0m*\"Oo*q/s";
      regexp1.toString();
      regexp1.name = "$";
      regexp_Op0.isPseudo();
      Regexp.Op.values();
      regexp1.toString();
      regexp0.op = regexp_Op0;
      regexp0.equals(regexp1);
      regexp_Op0.isPseudo();
      Regexp.Op.values();
      regexp_Op0.isPseudo();
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
  public void test27()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.toString();
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
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
  public void test29()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Object object0 = new Object();
      regexp0.name = "";
      regexp0.cap = 4215;
      regexp0.runes = null;
      regexp0.equals(object0);
      regexp0.reinit();
      regexp0.min = (-2203);
      regexp0.flags = (-2203);
      regexp0.cap = 8;
      regexp0.flags = 8;
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
  public void test30()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Object object0 = new Object();
      regexp0.equals(object0);
      regexp0.name = "\b";
      regexp0.cap = 7;
      regexp0.toString();
      regexp0.toString();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("^97X");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.^97X
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.op = regexp_Op0;
      regexp0.name = "";
      regexp0.equals((Object) null);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp0);
      regexp2.cap = 1378;
      regexp1.flags = 626;
      regexp2.cap = 330;
      regexp2.min = 1;
      regexp1.equals(regexp2);
      regexp2.maxCap();
      Regexp.Op.values();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("@@R");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.@@R
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp1;
      regexp1.subs = regexpArray0;
      regexp1.equals("|i&f?");
      Regexp.Op regexp_Op1 = Regexp.Op.END_LINE;
      regexp0.op = regexp_Op1;
      regexp1.max = 1514;
      regexp0.flags = 1514;
      regexp1.name = "SU.mMcZ >McTJxT";
      regexp1.cap = 7;
      regexp0.flags = 7;
      regexp0.flags = 7;
      regexp1.equals("Tejh8>R@[");
      regexp1.toString();
      regexp0.equals(regexp1);
      regexp1.equals("");
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("Z");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.Z
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.name = "[invalid char class]";
      regexp0.cap = 10795;
      regexp0.toString();
      regexp0.flags = 7944;
      Regexp.Op.values();
      regexp0.maxCap();
      regexp0.toString();
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.max = 120485;
      regexp1.flags = 10795;
      boolean boolean0 = regexp0.equals(regexp1);
      regexp_Op0.isPseudo();
      Regexp.Op.values();
      boolean boolean1 = regexp_Op0.isPseudo();
      assertFalse(boolean1 == boolean0);
      
      regexp0.maxCap();
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      regexp_Op0.isPseudo();
      Regexp.Op regexp_Op1 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op1);
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.max = 256;
      regexp1.min = 256;
      regexp1.min = 256;
      regexp0.flags = 256;
      Object object0 = new Object();
      regexp1.equals(object0);
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
  public void test35()  throws Throwable  {
      Regexp regexp0 = null;
      Regexp regexp1 = null;
      try {
        regexp1 = new Regexp((Regexp) null);
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
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.reinit();
      regexp0.equals(regexp_Op0);
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
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[2];
      Regexp.Op regexp_Op1 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp2 = new Regexp(regexp_Op1);
      regexpArray0[0] = regexp2;
      regexpArray0[1] = regexp0;
      Regexp[] regexpArray1 = new Regexp[6];
      regexpArray1[0] = regexp2;
      regexpArray1[1] = regexp1;
      regexpArray1[2] = regexp2;
      regexpArray1[3] = regexp2;
      regexpArray1[4] = regexp0;
      Regexp regexp3 = new Regexp(regexp_Op1);
      Regexp regexp4 = new Regexp(regexp3);
      regexpArray1[5] = regexp4;
      regexpArray0[1].subs = regexpArray1;
      regexpArray0[0].flags = 991;
      regexp1.name = "Terminal_Punctuation";
      regexp2.toString();
      regexp2.reinit();
      regexp1.subs = regexpArray0;
      regexp1.toString();
      Object object0 = new Object();
      regexp0.flags = 0;
      regexpArray0[1].min = 0;
      regexp1.equals(object0);
      regexp2.reinit();
      regexp_Op1.isPseudo();
      regexp2.reinit();
      regexp0.reinit();
      assertNotSame(regexp0, regexp3);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.max = 1094;
      regexp0.toString();
      regexp0.min = (-984);
      regexp0.flags = 92;
      regexp0.toString();
      regexp_Op0.isPseudo();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("[^x00-x{10FFFF}]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.[^x00-x{10FFFF}]
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[5];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexp0.subs = regexpArray0;
      regexp0.toString();
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.reinit();
      regexp1.max = 7;
      regexp1.equals(regexp0);
      regexp1.maxCap();
      Regexp.Op.values();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.\"
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      regexp_Op0.isPseudo();
      regexp_Op0.isPseudo();
      Regexp.Op.values();
      Regexp.Op.values();
      regexp_Op0.isPseudo();
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op1);
      String string0 = regexp0.toString();
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.op = regexp_Op0;
      regexp1.maxCap();
      regexp_Op0.isPseudo();
      regexp_Op0.isPseudo();
      regexp1.op.isPseudo();
      regexp1.cap = 0;
      regexp1.maxCap();
      regexp_Op1.isPseudo();
      regexp1.toString();
      Regexp.Op.values();
      regexp1.op.isPseudo();
      regexp1.maxCap();
      regexp_Op1.isPseudo();
      String string1 = regexp0.toString();
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.toString();
      regexp0.flags = 0;
      regexp0.min = 1372;
      regexp0.max = (-930);
      regexp0.flags = (-711);
      regexp0.cap = 1372;
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.max = (-711);
      regexp1.equals(regexp0);
      regexp1.runes = null;
      regexp1.max = 92;
      regexp_Op0.isPseudo();
      regexp1.toString();
      regexp0.reinit();
      regexp1.flags = (-1583);
      Regexp.Op.values();
      regexp_Op0.isPseudo();
      regexp1.toString();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("b(s$<87u_8COa`g");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.b(s$<87u_8COa`g
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      String string0 = "?/p];|";
      regexp_Op0.isPseudo();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("?/p];|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.?/p];|
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Regexp.Op.values();
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
  public void test44()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      int[] intArray0 = new int[9];
      intArray0[1] = 0;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[7] = 1115;
      regexp0.runes = intArray0;
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
}
