/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 21:26:59 GMT 2019
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.Utils;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Utils_ESTest extends Utils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = Utils.emptyOpContext(48, 1668);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Utils.emptyOpContext(102, 2088);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte)60;
      byteArray1[1] = (byte) (-1);
      byteArray1[2] = (byte)10;
      int int0 = Utils.indexOf(byteArray1, byteArray0, (byte) (-28));
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 7, (-1051));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = Utils.subarray(intArray0, 2939, 2939);
      assertEquals(0, intArray1.length);
      assertNotSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, 70, (byte)0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("");
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((-1886));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(2088);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = Utils.subarray(byteArray0, 34, 34);
      int int0 = Utils.indexOf(byteArray1, byteArray1, 97);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.subarray((int[]) null, 397, 2266);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 256, 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (byte)30, (-3079));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = Utils.emptyOpContext(10, 10);
      assertEquals(35, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = Utils.emptyOpContext((-1), 95);
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = Utils.emptyOpContext(57, 57);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = Utils.emptyOpContext(43, 122);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = Utils.emptyOpContext(70, 0);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = Utils.emptyOpContext(1269, (-1112));
      assertEquals(42, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune((byte) (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-121);
      byteArray0[1] = (byte)56;
      byte[] byteArray1 = new byte[8];
      byteArray1[0] = (byte) (-121);
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-121));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (-46));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = Utils.subarray(byteArray0, 34, 34);
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-97));
      assertEquals(0, int0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)2);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)60);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (-290), 65);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -290
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, (-805), 426);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -805
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = Utils.runeToString(270);
      assertEquals("\u010E", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = Utils.runeToString((-991));
      assertEquals("\uFC21", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("ZnMuYydIJJa@");
      assertEquals(12, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("'79'io");
      Utils.escapeRune(stringBuilder0, 0);
      assertEquals("'79'io\\x00", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 2150);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringBuilder stringBuilder0 = new StringBuilder(charBuffer0);
      Utils.escapeRune(stringBuilder0, 12);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\\f", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "L1~#gQx=");
      Utils.escapeRune(stringBuilder0, 10);
      assertEquals("L1~#gQx=\\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 9);
      assertEquals("\\t", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("");
      Utils.escapeRune(stringBuilder0, 8);
      assertEquals("\\b", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("2PSHN<");
      Utils.escapeRune(stringBuilder0, 63);
      assertEquals("2PSHN<\\?", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("\u010E");
      Utils.escapeRune(stringBuilder0, 270);
      assertEquals("\u010E\u010E", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("");
      Utils.escapeRune(stringBuilder0, (-2248));
      assertEquals("\\xfffff738", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = Utils.unhex(65);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = Utils.unhex(97);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = Utils.unhex(48);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int int0 = Utils.unhex(736);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      int int0 = Utils.unhex((-45));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(122);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(70);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(48);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(270);
      assertFalse(boolean0);
  }
}