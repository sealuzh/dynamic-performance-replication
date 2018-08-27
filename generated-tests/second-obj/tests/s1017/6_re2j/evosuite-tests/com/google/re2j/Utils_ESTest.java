/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 04:34:13 GMT 2018
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
      String string0 = Utils.runeToString(8);
      assertEquals("\b", string0);
      
      int int0 = Utils.unhex(8);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = Utils.runeToString(65664);
      assertEquals("\u0080", string0);
      
      int int0 = Utils.emptyOpContext(65664, 65664);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Utils.emptyOpContext((-3090), (-3090));
      assertEquals(47, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Utils.unhex(1461);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = Utils.EMPTY_NO_WORD_BOUNDARY;
      int int1 = Utils.indexOf(byteArray0, byteArray0, 32);
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(338);
      assertFalse(boolean0);
      
      String string0 = Utils.runeToString(338);
      assertEquals("\u0152", string0);
      
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 548);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[7];
      int int0 = 1699;
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 0, 1699);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("");
      int[] intArray1 = Utils.subarray(intArray0, 2284, 2284);
      assertNotSame(intArray1, intArray0);
      assertArrayEquals(new int[] {}, intArray1);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (-12));
      assertEquals(0, int0);
      
      String string0 = Utils.runeToString((-12));
      assertEquals("\uFFF4", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = Utils.unhex(8);
      assertEquals((-1), int0);
      
      boolean boolean0 = Utils.isalnum((-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(16);
      assertFalse(boolean0);
      
      String string0 = Utils.runeToString(16);
      assertEquals("\u0010", string0);
      
      int[] intArray0 = Utils.stringToRunes("\u0010");
      assertArrayEquals(new int[] {16}, intArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = Utils.EMPTY_END_LINE;
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 2);
      assertEquals("\\x02", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      stringBuilder0.chars();
      Utils.escapeRune(stringBuilder0, 31);
      assertEquals("\\x1f", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      char[] charArray0 = new char[3];
      byte[] byteArray0 = new byte[0];
      Utils.indexOf(byteArray0, byteArray0, (byte) (-107));
      Utils.escapeRune(stringBuilder0, 0);
      assertEquals("\\x00", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = Utils.runeToString(1);
      assertEquals("\u0001", string0);
      
      int int0 = Utils.unhex(1);
      assertEquals((-1), int0);
      
      byte[] byteArray0 = Utils.subarray((byte[]) null, 1, 1);
      assertNotNull(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      Utils.indexOf(byteArray0, byteArray0, (-12));
      Utils.runeToString((-12));
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (-12), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -12
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      int int0 = Utils.EMPTY_END_LINE;
      int int1 = Utils.indexOf(byteArray0, byteArray0, 2);
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)0;
      byte[] byteArray1 = new byte[4];
      byteArray1[0] = (byte) (-88);
      byteArray1[2] = (byte)73;
      Utils.indexOf(byteArray0, byteArray1, (-421));
      String string0 = Utils.runeToString((-421));
      assertEquals("\uFE5B", string0);
      
      int int0 = Utils.unhex((byte)0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Utils.isalnum(65112);
      StringBuilder stringBuilder0 = new StringBuilder(65112);
      Utils.escapeRune(stringBuilder0, 65112);
      assertEquals("\uFE58", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(122);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = Utils.emptyOpContext(10, 90);
      assertEquals(17, int0);
      
      boolean boolean0 = Utils.isalnum(10);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(66);
      assertTrue(boolean0);
      
      String string0 = Utils.runeToString(66);
      assertEquals("B", string0);
      
      int[] intArray0 = Utils.stringToRunes("B");
      assertArrayEquals(new int[] {66}, intArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 10);
      assertEquals("\\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = Utils.EMPTY_END_TEXT;
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 8);
      assertEquals("\\b", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Utils.emptyOpContext(10, 10);
      StringBuilder stringBuilder0 = new StringBuilder(10);
      Utils.escapeRune(stringBuilder0, 92);
      assertEquals("\\\\", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(106);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = Utils.unhex(65);
      assertEquals(10, int0);
      
      boolean boolean0 = Utils.isalnum(65);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      byteArray0[3] = (byte)0;
      byteArray0[0] = (byte)97;
      byte[] byteArray1 = new byte[3];
      byteArray1[2] = (byte)97;
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-421));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)97;
      byte[] byteArray1 = new byte[3];
      byteArray1[2] = (byte)97;
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-421));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      StringBuilder stringBuilder1 = stringBuilder0.append((double) 3811);
      StringBuilder stringBuilder2 = stringBuilder1.append((long) 3811);
      StringBuilder stringBuilder3 = stringBuilder2.append((CharSequence) stringBuilder1);
      Utils.escapeRune(stringBuilder3, 3811);
      assertEquals("3811.038113811.03811\\x{ee3}", stringBuilder3.toString());
      assertEquals("3811.038113811.03811\\x{ee3}", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = Utils.EMPTY_END_LINE;
      StringBuilder stringBuilder0 = new StringBuilder();
      stringBuilder0.append("=U:JlpK#j}y");
      Utils.escapeRune(stringBuilder0, 13);
      assertEquals("=U:JlpK#j}y\\r", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Utils.unhex(57);
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, (byte) (-120));
      assertEquals("\\xffffff88", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(879);
      assertFalse(boolean0);
      
      int int0 = Utils.unhex(97);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(51);
      assertTrue(boolean0);
      
      String string0 = Utils.runeToString(51);
      assertEquals("3", string0);
      
      int[] intArray0 = Utils.stringToRunes("3");
      assertArrayEquals(new int[] {51}, intArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(102);
      Utils.escapeRune(stringBuilder0, 12);
      assertEquals("\\f", stringBuilder0.toString());
      
      boolean boolean0 = Utils.isWordRune(6169);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(95);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(57);
      assertTrue(boolean0);
  }
}