/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 05:07:59 GMT 2018
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
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      boolean boolean0 = regexp1.equals(regexp0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[10];
      regexpArray0[0] = regexp0;
      regexpArray0[0].subs = regexpArray0;
      Object object0 = new Object();
      Object object1 = new Object();
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op.values();
      regexp0.reinit();
      Object object2 = new Object();
      regexp0.equals(object0);
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
      Regexp[] regexpArray0 = new Regexp[1];
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Object object0 = new Object();
      Regexp.Op regexp_Op1 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexp1.toString();
      Regexp.Op regexp_Op2 = Regexp.Op.STAR;
      Regexp regexp2 = new Regexp(regexp_Op2);
      regexp2.reinit();
      Regexp regexp3 = new Regexp(regexp_Op2);
      Regexp regexp4 = new Regexp(regexp3);
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

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.VERTICAL_BAR;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.name = "/*w;vtb g^pZnrd";
      regexp0.reinit();
      boolean boolean0 = regexp_Op0.isPseudo();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.op = regexp_Op0;
      Regexp regexp1 = new Regexp(regexp0);
      // Undeclared exception!
      try { 
        regexp1.equals(regexp1);
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
      Regexp.Op regexp_Op0 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.name = "(?-m:$)";
      regexp1.toString();
      Regexp.Op.values();
      regexp0.reinit();
      Object object0 = new Object();
      regexp0.equals(object0);
      Regexp.Op.values();
      regexp0.equals(regexp1);
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("B");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.B
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.maxCap();
      regexp0.equals(regexp1);
      regexp0.reinit();
      regexp0.min = 324;
      regexp0.name = "";
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("u;}P$qkwUg#RS");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.u;}P$qkwUg#RS
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LEFT_PAREN;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.equals("(?-m:$)");
      regexp1.toString();
      Regexp.Op.values();
      regexp0.reinit();
      Object object0 = new Object();
      regexp0.equals(regexp_Op0);
      Regexp.Op.values();
      regexp0.equals(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.valueOf("LEFT_PAREN");
      assertSame(regexp_Op1, regexp_Op0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.reinit();
      regexp1.equals(regexp0);
      regexp0.toString();
      regexp0.reinit();
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
  public void test09()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.flags = 591;
      int[] intArray0 = new int[2];
      intArray0[0] = 591;
      intArray0[1] = 382;
      regexp0.runes = intArray0;
      regexp0.equals(regexp1);
      Object object0 = new Object();
      regexp1.equals(intArray0);
      Object object1 = new Object();
      regexp1.equals(object0);
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
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.equals(regexp1);
      Regexp regexp2 = new Regexp(regexp1);
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf(">");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.>
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[5];
      Regexp regexp1 = new Regexp(regexp0);
      regexpArray0[0] = regexp1;
      regexpArray0[2] = regexp0;
      regexpArray0[2] = regexpArray0[1];
      regexpArray0[1] = regexp0;
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
  public void test12()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.PLUS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[4];
      intArray0[0] = 9;
      intArray0[1] = 1054;
      intArray0[2] = 591;
      intArray0[3] = 14;
      regexp0.runes = intArray0;
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
  public void test13()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[5];
      regexpArray0[0] = regexp0;
      regexpArray0[0].subs = regexpArray0;
      Object object0 = new Object();
      regexp0.equals(object0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.equals(object0);
      Regexp.Op.values();
      regexp0.equals((Object) null);
      Regexp.Op.values();
      regexp0.reinit();
      Object object1 = new Object();
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      Regexp regexp2 = new Regexp(regexp_Op1);
      regexp0.toString();
      Regexp.Op regexp_Op2 = Regexp.Op.LEFT_PAREN;
      Regexp regexp3 = new Regexp(regexp_Op2);
      // Undeclared exception!
      try { 
        regexp1.maxCap();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.max = 2387;
      regexp0.cap = 2387;
      Regexp regexp1 = new Regexp(regexp0);
      regexp0.toString();
      regexp_Op0.isPseudo();
      Regexp.Op.values();
      Regexp.Op.values();
      regexp_Op0.isPseudo();
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
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.NO_MATCH;
      regexp0.op = regexp_Op1;
      regexp_Op0.isPseudo();
      regexp0.toString();
      regexp0.op.isPseudo();
      Regexp.Op.values();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("Malayalam");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.Malayalam
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.reinit();
      Regexp[] regexpArray0 = new Regexp[14];
      regexpArray0[0] = regexp1;
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      regexp1.equals(regexp_Op1);
      regexp1.toString();
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
  public void test17()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.ANY_CHAR;
      regexp0.min = 8;
      regexp0.op = regexp_Op1;
      regexp1.equals(regexp0);
      regexp0.op.isPseudo();
      regexp1.equals(regexp_Op0);
      regexp1.maxCap();
      regexp0.name = "ALTERNATE";
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
  public void test18()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Regexp[] regexpArray0 = new Regexp[6];
      regexpArray0[0] = regexp1;
      regexpArray0[1] = regexp1;
      regexpArray0[2] = regexp0;
      regexpArray0[3] = regexp0;
      regexpArray0[4] = regexp0;
      regexpArray0[5] = regexp0;
      regexp0.subs = regexpArray0;
      regexp0.name = "_";
      regexp0.op = regexp_Op0;
      boolean boolean0 = regexp0.equals(">");
      int int0 = regexp1.maxCap();
      assertEquals(0, int0);
      
      regexp0.reinit();
      boolean boolean1 = regexp1.equals(regexp0);
      assertFalse(boolean1 == boolean0);
      
      regexp0.toString();
      assertTrue(regexp0.equals((Object)regexp1));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.equals(regexp_Op0);
      regexp1.equals(regexp0);
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf("5N@0:VyD%d1C3n3x%");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.5N@0:VyD%d1C3n3x%
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.equals((Object) null);
      int int0 = regexp0.maxCap();
      assertEquals(0, int0);
      
      boolean boolean0 = regexp0.equals("h4X6_HLFu1");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
         verifyException("com.google.re2j.Regexp", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.VERTICAL_BAR;
      regexp1.equals(regexp0);
      Regexp regexp2 = new Regexp(regexp_Op1);
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
  public void test23()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      regexp0.op = regexp_Op1;
      regexp0.equals(regexp_Op0);
      regexp0.reinit();
      regexp0.op.isPseudo();
      Regexp.Op regexp_Op2 = Regexp.Op.ALTERNATE;
      regexp0.op = regexp_Op2;
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.toString();
      Regexp.Op.values();
      regexp1.equals((Object) null);
      Object object0 = new Object();
      Regexp regexp2 = new Regexp(regexp0);
      regexp1.equals(regexp2);
      String string0 = regexp1.name;
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
  public void test24()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[5];
      regexpArray0[0] = regexp0;
      String string0 = "q#mA]'VAD,= w";
      regexp0.name = "q#mA]'VAD,= w";
      regexpArray0[0].subs = regexpArray0;
      Object object0 = new Object();
      regexp0.equals(object0);
      Regexp regexp1 = new Regexp(regexp0);
      // Undeclared exception!
      try { 
        regexp0.equals(regexp1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ANY_CHAR_NOT_NL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.cap = 2;
      regexp0.equals(regexp_Op0);
      regexp0.toString();
      regexp0.maxCap();
      Regexp.Op regexp_Op1 = Regexp.Op.PLUS;
      Regexp regexp1 = new Regexp(regexp_Op1);
      Regexp regexp2 = new Regexp(regexp_Op0);
      regexp0.equals(regexp0.op);
      Regexp regexp3 = new Regexp(regexp1);
      Regexp regexp4 = new Regexp(regexp_Op1);
      Regexp.Op regexp_Op2 = Regexp.Op.ANY_CHAR;
      regexp4.op = regexp_Op2;
      Regexp regexp5 = new Regexp(regexp4);
      Regexp.Op.values();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        regexp1.equals(regexp3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.WORD_BOUNDARY;
      regexp0.op = regexp_Op1;
      Regexp.Op regexp_Op2 = Regexp.Op.CAPTURE;
      regexp0.op = regexp_Op2;
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
  public void test27()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.WORD_BOUNDARY;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op.values();
      Object object0 = new Object();
      Regexp regexp1 = new Regexp(regexp_Op0);
      regexp1.min = (-4333);
      regexp0.max = (-4333);
      Object object1 = new Object();
      regexp1.equals(regexp0);
      String string0 = regexp0.name;
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
  public void test28()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.WORD_BOUNDARY;
      regexp0.op = regexp_Op1;
      regexp0.equals(regexp_Op0);
      regexp0.toString();
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
  public void test29()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.REPEAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.CAPTURE;
      regexp0.reinit();
      regexp_Op1.isPseudo();
      Regexp regexp1 = new Regexp(regexp0);
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
  public void test30()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[2];
      regexpArray0[0] = regexp0;
      regexpArray0[0].subs = regexpArray0;
      Object object0 = new Object();
      regexp0.equals(object0);
      Regexp regexp1 = new Regexp(regexp0);
      Object object1 = new Object();
      regexp1.equals(object1);
      Regexp.Op.values();
      Regexp regexp2 = new Regexp(regexp_Op0);
      regexp0.reinit();
      Object object2 = new Object();
      Object object3 = new Object();
      regexp1.equals(regexp0);
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
  public void test31()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CAPTURE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      Object object0 = new Object();
      Object object1 = new Object();
      regexp0.equals("*5i");
      // Undeclared exception!
      try { 
        regexp1.equals(regexp1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.BEGIN_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      regexp0.equals(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.op = regexp_Op0;
      regexp1.toString();
      regexp0.name = "^";
      regexp0.cap = 32;
      int int0 = regexp0.min;
      boolean boolean0 = regexp1.equals(regexp_Op0);
      Regexp.Op.values();
      regexp0.op = regexp_Op0;
      boolean boolean1 = regexp1.equals(regexp0);
      assertFalse(boolean1 == boolean0);
      
      int int1 = regexp1.maxCap();
      assertEquals(0, int1);
      
      Regexp.Op.values();
      regexp0.reinit();
      regexp1.toString();
      regexp0.toString();
      assertTrue(regexp0.equals((Object)regexp1));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      regexp0.op = regexp_Op1;
      regexp0.op.isPseudo();
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
  public void test34()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CONCAT;
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      Regexp regexp0 = new Regexp(regexp_Op1);
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
  public void test35()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[2];
      regexp0.runes = intArray0;
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexp0.toString();
      regexp0.reinit();
      Object object0 = new Object();
      Object object1 = new Object();
      regexp0.equals("[x00]");
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
  public void test36()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.flags = 636;
      int[] intArray0 = new int[2];
      intArray0[0] = (-1774);
      intArray0[1] = 382;
      regexp0.runes = intArray0;
      regexp0.equals(regexp1);
      Regexp regexp2 = new Regexp(regexp1);
      regexp0.toString();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf(">");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.>
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.ALTERNATE;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp[] regexpArray0 = new Regexp[5];
      regexpArray0[0] = regexp0;
      String string0 = "q#mA]'VAD,= w";
      regexp0.name = "q#mA]'VAD,= w";
      Regexp[] regexpArray1 = new Regexp[4];
      regexpArray1[0] = regexp0;
      regexpArray1[1] = regexp0;
      regexpArray1[2] = regexp0;
      regexpArray1[3] = regexp0;
      regexpArray0[0].subs = regexpArray1;
      regexpArray0[0].max = 1;
      regexp0.subs = regexpArray0;
      regexp0.subs = regexpArray0;
      Regexp regexp1 = new Regexp(regexp0);
      Regexp.Op regexp_Op1 = Regexp.Op.NO_WORD_BOUNDARY;
      Regexp regexp2 = new Regexp(regexp_Op1);
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
      Object object0 = new Object();
      Object object1 = new Object();
      regexp0.equals(object1);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.equals("q#mA]'VAD,= w");
      Regexp regexp2 = new Regexp(regexp_Op0);
      Regexp.Op.values();
      Regexp regexp3 = new Regexp(regexp_Op0);
      Regexp regexp4 = new Regexp(regexp3);
      regexp2.equals(regexp4);
      Regexp.Op.values();
      Object object2 = new Object();
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      Regexp regexp5 = new Regexp(regexp_Op0);
      Object object3 = new Object();
      regexp1.flags = (-6077);
      boolean boolean0 = regexp4.equals("q#mA]'VAD,= w");
      assertFalse(boolean0);
      
      Regexp.Op regexp_Op2 = Regexp.Op.BEGIN_TEXT;
      Regexp regexp6 = new Regexp(regexp_Op2);
      Regexp.Op regexp_Op3 = Regexp.Op.ALTERNATE;
      regexp6.op = regexp_Op3;
      String string0 = regexp6.name;
      int int0 = regexp4.maxCap();
      assertEquals(0, int0);
      
      Regexp regexp7 = new Regexp(regexp1);
      Regexp regexp8 = new Regexp(regexp_Op1);
      Object object4 = new Object();
      Regexp regexp9 = new Regexp(regexp7);
      regexp5.equals(regexp9);
      regexp1.toString();
      assertFalse(regexp1.equals((Object)regexp6));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.CHAR_CLASS;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp regexp1 = new Regexp(regexp0);
      regexp1.flags = 636;
      int[] intArray0 = new int[15];
      intArray0[0] = (-1774);
      intArray0[1] = 382;
      regexp0.runes = intArray0;
      regexp0.equals(regexp1);
      Regexp regexp2 = new Regexp(regexp1);
      regexp0.toString();
      // Undeclared exception!
      try { 
        Regexp.Op.valueOf(">");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant com.google.re2j.Regexp.Op.>
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.QUEST;
      Regexp.Op regexp_Op1 = Regexp.Op.END_LINE;
      Regexp regexp0 = new Regexp(regexp_Op1);
      Object object0 = new Object();
      regexp0.equals(object0);
      Object object1 = new Object();
      regexp0.equals(regexp_Op1);
      regexp0.equals(regexp0);
      Regexp regexp1 = new Regexp(regexp_Op1);
      regexp1.equals(regexp_Op1);
      Regexp.Op.values();
      regexp0.equals(regexp0);
      Regexp.Op.values();
      Object object2 = new Object();
      regexp0.toString();
      String string0 = "/";
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
  public void test41()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.LITERAL;
      Regexp regexp0 = new Regexp(regexp_Op0);
      int[] intArray0 = new int[2];
      regexp0.runes = intArray0;
      regexp0.toString();
      Object object0 = new Object();
      Object object1 = new Object();
      Regexp.Op regexp_Op1 = null;
      Regexp regexp1 = new Regexp((Regexp.Op) null);
      Regexp.Op regexp_Op2 = Regexp.Op.ANY_CHAR;
      regexp_Op0.isPseudo();
      Regexp.Op.values();
      Object object2 = new Object();
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
  public void test42()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.EMPTY_MATCH;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.STAR;
      Regexp regexp1 = new Regexp(regexp_Op1);
      Regexp.Op.values();
      Regexp.Op regexp_Op2 = Regexp.Op.CAPTURE;
      Regexp regexp2 = new Regexp(regexp_Op2);
      regexp2.name = "So";
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
  public void test43()  throws Throwable  {
      Regexp.Op regexp_Op0 = Regexp.Op.END_TEXT;
      Regexp regexp0 = new Regexp(regexp_Op0);
      Regexp.Op regexp_Op1 = Regexp.Op.WORD_BOUNDARY;
      regexp0.op = regexp_Op1;
      Regexp.Op regexp_Op2 = Regexp.Op.CAPTURE;
      Regexp regexp1 = new Regexp(regexp0.op);
      Regexp regexp2 = new Regexp(regexp_Op2);
      Regexp[] regexpArray0 = new Regexp[7];
      Regexp.Op.values();
      Regexp.Op regexp_Op3 = Regexp.Op.CAPTURE;
      Regexp regexp3 = new Regexp(regexp_Op3);
      Regexp regexp4 = new Regexp(regexp3);
      regexpArray0[0] = regexp4;
      regexp4.name = "";
      regexpArray0[1] = regexp2;
      regexpArray0[2] = regexp1;
      regexpArray0[3] = regexp1;
      regexpArray0[4] = regexp2;
      regexpArray0[5] = regexp1;
      regexpArray0[6] = regexp0;
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
}