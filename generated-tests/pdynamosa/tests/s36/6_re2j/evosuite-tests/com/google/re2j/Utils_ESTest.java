/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 00:41:31 GMT 2019
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
      int int0 = Utils.emptyOpContext(57, 14);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(122);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Utils.emptyOpContext(97, 4183);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)93;
      byteArray0[1] = (byte) (-72);
      byteArray0[2] = (byte)40;
      byteArray0[3] = (byte) (-97);
      byteArray0[4] = (byte)92;
      byte[] byteArray1 = new byte[1];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-2949));
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[1];
      int int0 = Utils.indexOf(byteArray0, byteArray1, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = Utils.runeToString(120353);
      assertEquals("\uD621", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, (byte)92);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = Utils.unhex(70);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = Utils.unhex(65);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = Utils.unhex(102);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = Utils.unhex(57);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(122);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(65);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(57);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = Utils.unhex(48);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = Utils.unhex(0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = Utils.unhex((-114));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, (-3171), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3171
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 0, 917503);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[0];
      int[] intArray1 = Utils.subarray(intArray0, (-1047), (-1047));
      assertNotSame(intArray1, intArray0);
      assertEquals(0, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.subarray((byte[]) null, 0, (-5547));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Utils.subarray(byteArray0, 0, 0);
      assertEquals(0, byteArray1.length);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("");
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = Utils.runeToString(0);
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((-1047));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(65);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune((-588));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.indexOf((byte[]) null, (byte[]) null, (-3102));
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
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, (-530));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int int0 = Utils.emptyOpContext(0, 0);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.subarray((int[]) null, 65535, 83);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, 122, (byte)44);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (-2169), 1405);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2169
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.stringToRunes((String) null);
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
      int int0 = Utils.emptyOpContext((-1133), 10);
      assertEquals(39, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = Utils.emptyOpContext(10, 47);
      assertEquals(33, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = Utils.emptyOpContext(95, 95);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = Utils.emptyOpContext(48, (-348));
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = Utils.emptyOpContext(12688, 90);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)34;
      byteArray0[1] = (byte) (-68);
      byte[] byteArray1 = new byte[4];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-2));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-68);
      byteArray0[5] = (byte)70;
      byte[] byteArray1 = new byte[4];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-2));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[1];
      int int0 = Utils.indexOf(byteArray1, byteArray0, (byte) (-114));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 7);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 2255);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = Utils.subarray(byteArray0, 2, 7);
      assertEquals(5, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = Utils.runeToString((-4661));
      assertEquals("\uEDCB", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("L*R`=o7DQ");
      int[] intArray1 = Utils.subarray(intArray0, 6, 8);
      assertEquals(9, intArray0.length);
      assertEquals(2, intArray1.length);
      assertArrayEquals(new int[] {55, 68}, intArray1);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 150);
      assertEquals("\\x96", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(2184);
      Utils.escapeRune(stringBuilder0, 2184);
      assertEquals("\\x{888}", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 0);
      assertEquals("\\x00", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
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
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 10);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(9);
      Utils.escapeRune(stringBuilder0, 9);
      assertEquals("\\t", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
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
  public void test57()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(9);
      Utils.escapeRune(stringBuilder0, 1854);
      assertEquals("\u073E", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "{");
      Utils.escapeRune(stringBuilder0, (byte)123);
      assertEquals("{\\{", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
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
  public void test60()  throws Throwable  {
      int int0 = Utils.unhex(227);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      int int0 = Utils.unhex((byte)97);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((byte)97);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(2184);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(48);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(90);
      assertTrue(boolean0);
  }
}