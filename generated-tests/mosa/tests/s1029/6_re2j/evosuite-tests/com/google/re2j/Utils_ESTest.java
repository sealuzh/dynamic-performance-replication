/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 19:41:28 GMT 2018
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
      int int0 = Utils.unhex(65549);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Utils.unhex(102);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Utils.emptyOpContext(374, 374);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Utils.emptyOpContext((-1755), (-1755));
      assertEquals(47, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = Utils.emptyOpContext(99, 31);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(97);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("Pc");
      assertArrayEquals(new int[] {80, 99}, intArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(27);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 256);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 256);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = Utils.subarray(intArray0, (-810), (-810));
      assertNotSame(intArray1, intArray0);
      assertArrayEquals(new int[] {}, intArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, (-2495), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2495
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (-988));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(137);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(95);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, 8456, 65843);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8456
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = Utils.subarray((byte[]) null, 70, 70);
      assertNotNull(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = Utils.unhex(69);
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(102);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(175);
      Utils.escapeRune(stringBuilder0, 175);
      assertEquals("\u00AF", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, (byte)40);
      assertEquals("\\(", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(85);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 1);
      assertEquals("\\x01", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 64263);
      assertEquals("\\x{fb07}", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)0;
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)65;
      int int0 = Utils.indexOf(byteArray1, byteArray0, (-988));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)0;
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte)65;
      byteArray1[1] = (byte)65;
      int int0 = Utils.indexOf(byteArray1, byteArray0, (-988));
      assertEquals((-1), int0);
      
      String string0 = Utils.runeToString((byte)65);
      assertEquals("A", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)0;
      byte[] byteArray1 = new byte[11];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)104;
      Utils.indexOf(byteArray1, byteArray0, (byte)0);
      Utils.unhex((byte)0);
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray1, 65, (byte)0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(70);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 10);
      assertEquals("\\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 8);
      assertEquals("\\b", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(137);
      Utils.escapeRune(stringBuilder0, 137);
      assertEquals("\\x89", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 5);
      assertEquals((-1), int0);
      
      String string0 = Utils.runeToString((-1));
      assertEquals("\uFFFF", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = Utils.unhex(57);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((byte)56);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = Utils.emptyOpContext(10, (-988));
      assertEquals(43, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = Utils.emptyOpContext(48, 48);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 9);
      assertEquals("\\t", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(10);
      assertFalse(boolean0);
      
      int int0 = Utils.emptyOpContext(10, 10);
      assertEquals(35, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, (byte)12);
      assertEquals("\\f", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte)0;
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)104;
      int int0 = Utils.indexOf(byteArray1, byteArray0, (-988));
      assertEquals((-1), int0);
      
      int[] intArray0 = Utils.stringToRunes("");
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 13);
      assertEquals("\\r", stringBuilder0.toString());
  }
}