/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 11:19:36 GMT 2018
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
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
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
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp1;
      regexpArray0[0].max = 118;
      regexp0.subs = regexpArray0;
      Object object0 = new Object();
      Object object1 = new Object();
      regexp1.reinit();
      Regexp.Op regexp_Op1 = Regexp.Op.REPEAT;
      Regexp regexp2 = new Regexp(regexp_Op1);
      int int0 = regexp2.cap;
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
  public void test02()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals((Object) null);
      assertFalse(boolean0);
      
      Regexp regexp1 = new Regexp(regexp0);
      assertTrue(regexp1.equals((Object)regexp0));
      
      String string0 = regexp1.toString();
      assertEquals("(?:)", string0);
      
      int int0 = regexp1.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
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
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.equals(regexp0);
      Regexp.Op.values();
      int int0 = regexp0.cap;
      Regexp.Op.values();
      regexp0.toString();
      int int1 = regexp0.max;
      assertTrue(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      boolean boolean0 = regexp0.equals(regexp1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp1;
      regexpArray0[3] = regexp1;
      regexp1.subs = regexpArray0;
      String string0 = regexp1.toString();
      assertEquals("(?-s:.)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      String string0 = regexp0.toString();
      assertEquals("[^\\x00-\\x{10FFFF}]", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.equals(regexp_Op0);
      Regexp.Op.values();
      regexp0.reinit();
      regexp0.maxCap();
      String string0 = regexp1.toString();
      assertEquals("\\b", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      boolean boolean0 = regexp1.equals(regexp0);
      assertTrue(boolean0);
      
      String string0 = regexp1.name;
      String string1 = regexp0.toString();
      assertEquals("(?:)", string1);
      
      Regexp.Op.values();
      int int0 = regexp1.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.toString();
      regexp0.flags = 602;
      regexp0.toString();
      Regexp regexp1 = new Regexp(regexp0);
      Regexp regexp2 = new Regexp(regexp1);
      regexp1.equals(regexp2);
      regexp1.maxCap();
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      assertNotNull(regexp_OpArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.toString();
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
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
  public void test14()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[5];
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexp0.toString();
      regexpArray0[3] = regexp0;
      Regexp.Op regexp_Op1 = Regexp.Op.ALTERNATE;
      regexpArray0[1].op = regexp_Op1;
      regexpArray0[4] = regexp0;
      regexp0.subs = regexpArray0;
      Regexp regexp1 = new Regexp(regexp0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        regexp0.maxCap();
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
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      String string0 = regexp0.name;
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[3];
      intArray0[1] = 118;
      regexp0.runes = intArray0;
      regexp0.flags = (-2306);
      regexp0.runes = intArray0;
      regexp0.toString();
      int int0 = regexp0.cap;
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      Regexp.Op[] regexp_OpArray1 = Regexp.Op.values();
      assertNotSame(regexp_OpArray1, regexp_OpArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      boolean boolean0 = regexp_Op0.isPseudo();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      String string0 = regexp1.toString();
      assertEquals("\\z", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[2];
      Object object0 = new Object();
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.toString();
      Regexp.Op.values();
      Regexp regexp1 = new Regexp(regexp_Op0);
      boolean boolean0 = regexp0.equals(regexp1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Regexp.Op.values();
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexp0.equals(regexp1);
      assertFalse(regexp1.equals((Object)regexp0));
      
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.name = "";
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexp0.subs = regexpArray0;
      regexp0.op = regexp_Op0;
      Regexp regexp1 = new Regexp(regexp0);
      boolean boolean0 = regexp0.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[20];
      regexpArray0[0] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      Object object0 = new Object();
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
  public void test23()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Object object0 = new Object();
      regexp0.equals("h&");
      String string0 = regexp0.name;
      Regexp.Op regexp_Op1 = Regexp.Op.BEGIN_LINE;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexp1.toString();
      regexp1.reinit();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("Rk/Yu");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.Rk/Yu
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.flags = (-862);
      String string0 = regexp0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.name = "Me";
      regexp1.equals(regexp0);
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
  public void test26()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.subs = null;
      regexp1.max = (-714);
      regexp0.name = "CONCAT";
      regexp0.equals(regexp1);
      String string0 = regexp0.name;
      regexp0.maxCap();
      Regexp.Op.values();
      Object object0 = new Object();
      regexp1.equals(object0);
      regexp1.maxCap();
      regexp0.reinit();
      assertNotSame(regexp0, regexp1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.equals(regexp0);
      regexp1.maxCap();
      regexp1.equals(regexp_Op0);
      String string0 = regexp1.toString();
      assertEquals("$", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      int[] intArray0 = new int[2];
      intArray0[0] = 7;
      intArray0[1] = 917;
      regexp1.runes = intArray0;
      regexp0.name = "EFT_PAREN";
      regexp0.equals(regexp1);
      Regexp.Op.values();
      int int0 = regexp1.flags;
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
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      boolean boolean0 = regexp0.equals(regexp1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
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
  public void test31()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.CONCAT;
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.equals(regexp1);
      Regexp regexp2 = new Regexp(regexp_Op1);
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
  public void test32()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[5];
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexp0.toString();
      regexpArray0[3] = regexp0;
      Regexp.Op regexp_Op1 = Regexp.Op.ALTERNATE;
      regexpArray0[1].op = regexp_Op1;
      regexpArray0[4] = regexp0;
      regexp0.subs = regexpArray0;
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
  public void test33()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.NO_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.equals(regexp0);
      regexp0.equals(regexp_Op0);
      Regexp.Op.values();
      Regexp.Op.values();
      Regexp.Op regexp_Op1 = Regexp.Op.PLUS;
      regexp0.reinit();
      regexp_Op1.isPseudo();
      regexp1.maxCap();
      Object object0 = new Object();
      Regexp regexp2 = new Regexp(regexp_Op1);
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
  public void test34()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexp1.cap = 1983;
      regexp1.equals((Object) null);
      regexp0.name = "CONCAT";
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
  public void test35()  throws Throwable  {
      Object object0 = new Object();
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.reinit();
      regexp0.toString();
      Regexp.Op.values();
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.toString();
      regexp1.op = regexp_Op0;
      regexp0.equals(regexp0);
      boolean boolean0 = regexp0.equals(regexp1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
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
  public void test37()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.equals(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      regexp1.op = regexp_Op1;
      regexp1.reinit();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("ioeDm6e*tt;H~G9e37");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.ioeDm6e*tt;H~G9e37
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.cap = 93;
      Regexp[] regexpArray0 = new Regexp[5];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[3] = regexp0;
      Regexp.Op regexp_Op1 = Regexp.Op.CONCAT;
      regexpArray0[1].op = regexp_Op1;
      regexpArray0[4] = regexp0;
      regexp0.subs = regexpArray0;
      // Undeclared exception!
      try { 
        regexp0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[5];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      Regexp.Op regexp_Op1 = Regexp.Op.CONCAT;
      regexpArray0[3].name = "6QIv2db/vBqD#+mCb";
      regexpArray0[1].op = regexp_Op1;
      regexpArray0[4] = regexp0;
      regexp0.subs = regexpArray0;
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.reinit();
      regexp1.flags = 6;
      regexp1.equals(regexp0);
      Regexp.Op regexp_Op2 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp2 = new Regexp(regexp_Op2);
      regexp2.name = null;
      regexp2.toString();
      int int0 = regexp0.cap;
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      int[] intArray0 = new int[2];
      regexp1.runes = intArray0;
      regexp1.equals("D[Bd~`LK0OA");
      regexp1.toString();
      Regexp[] regexpArray0 = new Regexp[1];
      regexpArray0[0] = regexp1;
      regexp1.maxCap();
      regexp_Op0.isPseudo();
      regexp1.equals(intArray0);
      regexp1.reinit();
      Regexp.Op[] regexp_OpArray0 = Regexp.Op.values();
      assertNotNull(regexp_OpArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[5];
      regexpArray0[1] = regexp0;
      regexpArray0[3] = regexp0;
      Regexp.Op regexp_Op1 = Regexp.Op.ALTERNATE;
      regexpArray0[1].op = regexp_Op1;
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
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexp1.reinit();
      regexp1.max = (-714);
      regexp0.name = "";
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
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[2];
      intArray0[0] = 118;
      intArray0[1] = 118;
      regexp0.runes = intArray0;
      regexp0.min = 791;
      regexp0.min = 118;
      intArray0[1] = (-2306);
      regexp0.runes = intArray0;
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.toString();
      regexp0.equals("[v-xfffff6fe]");
      Regexp regexp2 = new Regexp(regexp_Op0);
      regexp0.reinit();
      assertNotSame(regexp0, regexp2);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      int[] intArray0 = new int[2];
      regexp1.runes = intArray0;
      Regexp regexp2 = new Regexp(regexp_Op0);
      regexp2.reinit();
      regexp1.toString();
      Regexp regexp3 = new Regexp(regexp0);
      assertTrue(regexp3.equals((Object)regexp2));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.cap = 83;
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp0;
      regexpArray0[1] = regexp0;
      regexpArray0[3] = regexp0;
      regexp0.equals(regexp0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.CHAR_CLASS;
      Regexp regexp2 = new Regexp(regexp_Op1);
      Regexp.Op regexp_Op2 = Regexp.Op.LEFT_PAREN;
      regexpArray0[1].min = 83;
      int[] intArray0 = new int[8];
      intArray0[0] = 83;
      intArray0[0] = 83;
      intArray0[3] = 83;
      intArray0[3] = 83;
      intArray0[6] = 83;
      intArray0[7] = 83;
      regexp2.runes = intArray0;
      Regexp regexp3 = new Regexp(regexp_Op2);
      regexp0.equals(regexp0);
      int int0 = regexp2.cap;
      Regexp.Op regexp_Op3 = Regexp.Op.ANY_CHAR;
      Regexp regexp4 = new Regexp(regexp_Op3);
      regexpArray0[0].runes = regexp2.runes;
      regexp4.subs = regexpArray0;
      regexp0.max = 83;
      regexp4.toString();
      // Undeclared exception!
      try { 
        regexp4.maxCap();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp1;
      regexpArray0[0].max = 118;
      regexp0.subs = regexpArray0;
      Regexp regexp2 = new Regexp(regexp_Op0);
      Object object0 = new Object();
      Object object1 = new Object();
      Regexp.Op regexp_Op1 = Regexp.Op.BEGIN_TEXT;
      regexp1.op = regexp_Op1;
      regexp1.reinit();
      Regexp regexp3 = new Regexp(regexp_Op0);
      int int0 = regexp0.cap;
      regexp0.toString();
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
  public void test47()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.name = null;
      regexp0.flags = 64335;
      Regexp regexp1 = new Regexp(regexp0);
      assertTrue(regexp1.equals((Object)regexp0));
      
      regexp1.reinit();
      boolean boolean0 = regexp1.equals(regexp0);
      assertFalse(boolean0);
      
      boolean boolean1 = regexp_Op0.isPseudo();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[3];
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp1;
      regexpArray0[0].max = 127;
      regexp0.subs = regexpArray0;
      Regexp regexp2 = new Regexp(regexp_Op0);
      regexp2.flags = 127;
      Object object0 = new Object();
      Object object1 = new Object();
      Regexp regexp3 = new Regexp(regexp_Op0);
      regexp0.equals(regexp2);
      int int0 = regexp2.cap;
      Regexp.Op.values();
      regexp1.reinit();
      Regexp.Op regexp_Op1 = Regexp.Op.CHAR_CLASS;
      Regexp regexp4 = new Regexp(regexp_Op1);
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
  public void test49()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[4];
      regexpArray0[0] = regexp1;
      int[] intArray0 = new int[0];
      regexp1.runes = intArray0;
      regexpArray0[1] = regexp0;
      regexpArray0[2] = regexp1;
      int[] intArray1 = new int[6];
      intArray1[0] = 103;
      intArray1[1] = 103;
      intArray1[3] = 103;
      regexp1.equals(intArray0);
      intArray1[3] = 103;
      intArray1[4] = 65310;
      intArray1[5] = 103;
      regexp1.runes = intArray1;
      regexpArray0[0].max = 103;
      regexp0.subs = regexpArray0;
      Object object0 = new Object();
      Object object1 = new Object();
      Regexp.Op regexp_Op1 = Regexp.Op.BEGIN_TEXT;
      regexp1.op = regexp_Op1;
      Regexp.Op regexp_Op2 = Regexp.Op.QUEST;
      Regexp regexp2 = new Regexp(regexp_Op2);
      Object object2 = new Object();
      boolean boolean0 = regexp1.equals(object2);
      Regexp regexp3 = new Regexp(regexp0);
      boolean boolean1 = regexp0.equals(regexp3);
      assertFalse(boolean1 == boolean0);
      
      int int0 = regexp1.cap;
      Regexp regexp4 = new Regexp(regexp_Op2);
      String string0 = regexp0.toString();
      assertEquals("\\A+", string0);
      
      Regexp.Op.values();
      int int1 = regexp1.maxCap();
      assertEquals(0, int1);
  }
}
