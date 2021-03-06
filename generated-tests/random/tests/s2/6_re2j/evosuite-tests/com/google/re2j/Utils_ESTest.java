/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 10:52:16 GMT 2019
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
      boolean boolean0 = Utils.isWordRune(48);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(97);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = new byte[3];
      byteArray1[1] = (byte) (-88);
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-87));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(57);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 4775, 90);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = Utils.subarray(byteArray0, (byte)87, (byte)87);
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray1, (-254), (byte)22);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -254
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
      boolean boolean0 = Utils.isalnum((-75));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune((-197));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.subarray((byte[]) null, (byte) (-78), 9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, 1257, (-89));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = Utils.emptyOpContext(1053, 10);
      assertEquals(34, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = Utils.emptyOpContext(10, (-2465));
      assertEquals(43, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = Utils.emptyOpContext((-617), (-617));
      assertEquals(47, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune((byte)95);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = Utils.emptyOpContext(70, 8008);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = Utils.emptyOpContext(53, 122);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-55);
      byte[] byteArray1 = new byte[3];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-87));
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)112;
      byte[] byteArray1 = new byte[3];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-87));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)6;
      byte[] byteArray1 = new byte[4];
      int int0 = Utils.indexOf(byteArray1, byteArray0, (-5527));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = Utils.subarray(byteArray0, (byte)87, (byte)87);
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-3020));
      assertEquals(0, int0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 1162);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)7);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 4);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, (-3754), 97);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3754
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[4];
      int[] intArray1 = Utils.subarray(intArray0, 7, (byte)7);
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = Utils.runeToString(741);
      assertEquals("\u02E5", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = Utils.runeToString((-75));
      assertEquals("\uFFB5", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("\uFDFA");
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 71, (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, (byte)7);
      assertEquals("\\x07", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "\uFDFA");
      Utils.escapeRune(stringBuilder0, (-740));
      assertEquals("\uFDFA\\xfffffd1c", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 2203);
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
        Utils.escapeRune((StringBuilder) null, 12);
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
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, (byte)10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 9);
      assertEquals("\\t", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 42);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(19968);
      Utils.escapeRune(stringBuilder0, 32);
      assertEquals(" ", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
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
  public void test40()  throws Throwable  {
      int int0 = Utils.unhex(65);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = Utils.unhex(97);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = Utils.unhex(57);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = Utils.unhex(431);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int int0 = Utils.unhex((-3034));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(397);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(97);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(53);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(65);
      assertTrue(boolean0);
  }
}
