/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 12:06:14 GMT 2018
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.Utils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.subarray((int[]) null, (-744), 97);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(13);
      boolean boolean1 = Utils.isWordRune(13);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(55296);
      assertFalse(boolean0);
      
      String string0 = Utils.runeToString(55296);
      assertEquals("\uD800", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (-2950), (-2296));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2950
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = Utils.runeToString(97);
      assertEquals("a", string0);
      
      int int0 = Utils.emptyOpContext(97, 97);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (-2296));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = Utils.EMPTY_END_TEXT;
      byte[] byteArray0 = new byte[10];
      int int1 = Utils.indexOf(byteArray0, byteArray0, 8);
      assertEquals((-1), int1);
      
      String string0 = Utils.runeToString((-1));
      assertEquals("\uFFFF", string0);
      
      boolean boolean0 = Utils.isalnum(8);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (-2296));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (-2296));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = Utils.emptyOpContext(34, 57);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(122);
      assertTrue(boolean0);
      
      int int0 = Utils.unhex(122);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = Utils.emptyOpContext((-414), (-414));
      assertEquals(47, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = Utils.unhex((-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(32);
      assertFalse(boolean0);
      
      int[] intArray0 = Utils.subarray((int[]) null, 32, 32);
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)33);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Utils.subarray(byteArray0, 1698, 1698);
      assertNotSame(byteArray1, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(1834);
      assertFalse(boolean0);
      
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 1834);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = Utils.unhex(57);
      assertEquals(9, int0);
      
      String string0 = Utils.runeToString(9);
      assertEquals("\t", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(57);
      boolean boolean1 = Utils.isWordRune(57);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 31);
      assertEquals("\\x1f", stringBuilder0.toString());
      
      String string0 = Utils.runeToString(31);
      assertEquals("\u001F", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "6'Zj:Aoz4?");
      Utils.escapeRune(stringBuilder0, 10);
      assertEquals("6'Zj:Aoz4?\\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 15);
      assertEquals("\\x0f", stringBuilder0.toString());
      
      String string0 = Utils.runeToString(15);
      assertEquals("\u000F", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(560);
      assertFalse(boolean0);
      
      int int0 = Utils.unhex(102);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 7466);
      assertEquals("\u1D2A", stringBuilder0.toString());
      
      String string0 = Utils.runeToString(7466);
      assertEquals("\u1D2A", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = 124;
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 124);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(90);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      StringBuilder stringBuilder1 = stringBuilder0.reverse();
      Utils.escapeRune(stringBuilder1, 3076);
      assertEquals("\\x{c04}", stringBuilder1.toString());
      assertEquals("\\x{c04}", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = Utils.emptyOpContext(95, 95);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = Utils.unhex(65);
      assertEquals(10, int0);
      
      int int1 = Utils.emptyOpContext(10, 10);
      assertEquals(35, int1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 13);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(113);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(86);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = Utils.unhex(66);
      assertEquals(11, int0);
      
      String string0 = Utils.runeToString(11);
      assertEquals("\u000B", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)11;
      byteArray0[3] = (byte)83;
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte) (-69);
      byteArray1[1] = (byte)33;
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-31));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = Utils.EMPTY_END_TEXT;
      byte[] byteArray0 = new byte[6];
      StringBuilder stringBuilder0 = new StringBuilder(8);
      byte[] byteArray1 = new byte[4];
      byteArray1[2] = (byte) (-90);
      Utils.indexOf(byteArray0, byteArray1, (byte) (-90));
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray1, 8, (byte) (-90));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)11;
      byteArray0[1] = (byte)33;
      byteArray0[2] = (byte) (-69);
      byteArray0[3] = (byte)83;
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte) (-69);
      byteArray1[1] = (byte)33;
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-31));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Utils.stringToRunes("6'Zj:Aoz4?");
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "6'Zj:Aoz4?");
      Utils.escapeRune(stringBuilder0, 12);
      assertEquals("6'Zj:Aoz4?\\f", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = Utils.EMPTY_END_TEXT;
      int int1 = Utils.EMPTY_WORD_BOUNDARY;
      StringBuilder stringBuilder0 = null;
      Utils.isalnum(8);
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }
}