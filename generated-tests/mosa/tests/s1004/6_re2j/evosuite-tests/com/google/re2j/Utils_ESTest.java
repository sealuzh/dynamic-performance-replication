/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 19:48:46 GMT 2018
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
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 23, 65310);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 23
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Utils.unhex(63);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 32);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)2);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (-2361), 7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2361
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = Utils.runeToString((byte)30);
      assertEquals("\u001E", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = Utils.emptyOpContext(1273, 1273);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = Utils.emptyOpContext((-426), (-426));
      assertEquals(47, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(70);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(48);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = Utils.unhex(6435);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = Utils.subarray((int[]) null, 5, 5);
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (-1145));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 13);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte) (-112));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 3536);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byte[] byteArray1 = Utils.subarray(byteArray0, 97, 97);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = Utils.EMPTY_BEGIN_TEXT;
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, (-379));
      assertEquals("\\xfffffe85", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 2);
      assertEquals("\\x02", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = Utils.emptyOpContext((byte)90, 11372);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 8);
      assertEquals("\\b", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 63640);
      assertEquals("\\x{f898}", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(97);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Utils.unhex(0);
      boolean boolean0 = Utils.isalnum(1422);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)8;
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte)8;
      byteArray1[1] = (byte)23;
      byteArray1[2] = (byte) (-21);
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-21));
      Utils.unhex(0);
      boolean boolean1 = Utils.isalnum((-3687));
      assertTrue(boolean1 == boolean0);
      
      int int1 = Utils.unhex((byte)8);
      assertTrue(int1 == int0);
      
      int[] intArray0 = Utils.stringToRunes("Zyk_06Sf>y");
      assertArrayEquals(new int[] {90, 121, 107, 95, 48, 54, 83, 102, 62, 121}, intArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = Utils.emptyOpContext(108, 108);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(78);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = Utils.unhex(102);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((byte)57);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = Utils.unhex(68);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = Utils.EMPTY_ALL;
      boolean boolean0 = Utils.isalnum((-1));
      assertFalse(boolean0);
      
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[10];
      byteArray1[0] = (byte) (-110);
      Utils.indexOf(byteArray0, byteArray1, (byte) (-110));
      int int1 = Utils.indexOf(byteArray1, byteArray1, 45);
      assertEquals((-1), int1);
      
      String string0 = Utils.runeToString((-1));
      assertEquals("\uFFFF", string0);
      
      int int2 = Utils.indexOf(byteArray1, byteArray0, (-1));
      assertEquals(1, int2);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = Utils.emptyOpContext((byte)24, 95);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int int0 = Utils.emptyOpContext(10, 10);
      assertEquals(35, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 12);
      assertEquals("\\f", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 123);
      assertEquals("\\{", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 13);
      assertEquals("\\r", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 10);
      assertEquals("\\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = Utils.unhex(57);
      assertEquals(9, int0);
  }
}