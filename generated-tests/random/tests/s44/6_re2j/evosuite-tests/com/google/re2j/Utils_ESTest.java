/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 05:41:38 GMT 2019
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
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte) (-8);
      byte[] byteArray1 = new byte[4];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-674));
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Utils.unhex(0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = Utils.subarray((int[]) null, (-523), (-523));
      assertNotNull(intArray0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = Utils.subarray((byte[]) null, 65, 65);
      assertNotNull(byteArray0);
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("");
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, (-2169), 61003);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2169
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((-709));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune((-1380));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = Utils.emptyOpContext(0, 5);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.subarray((int[]) null, (-2355), 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 48, 42);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, 10, (-1837));
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
  public void test13()  throws Throwable  {
      int int0 = Utils.emptyOpContext(65, (-1));
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = Utils.emptyOpContext(10, 10);
      assertEquals(35, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = Utils.emptyOpContext((-666), 10);
      assertEquals(39, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = Utils.emptyOpContext(9, 95);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = Utils.emptyOpContext(48, 1545);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = Utils.emptyOpContext((byte)121, 42607);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(34);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-104);
      byteArray0[1] = (byte) (-5);
      byte[] byteArray1 = new byte[4];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-674));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[2] = (byte) (-113);
      byte[] byteArray1 = new byte[4];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-126));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)21;
      byte[] byteArray1 = new byte[1];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-2166));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (-337));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 37);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 944);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, 8, (byte)16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = Utils.subarray(byteArray0, (byte) (-13), (byte) (-13));
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("\r");
      int[] intArray1 = Utils.subarray(intArray0, 1318, 1318);
      assertEquals(0, intArray1.length);
      assertArrayEquals(new int[] {13}, intArray0);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = Utils.runeToString(606);
      assertEquals("\u025E", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = Utils.runeToString((-433));
      assertEquals("\uFE4F", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 1);
      assertEquals("\\x01", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 63743);
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
      StringBuilder stringBuilder0 = new StringBuilder("");
      Utils.escapeRune(stringBuilder0, 13);
      assertEquals("\\r", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
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
  public void test39()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(1);
      Utils.escapeRune(stringBuilder0, (byte)43);
      assertEquals("\\+", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 1107);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, (byte) (-127));
      assertEquals("\\xffffff81", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = Utils.unhex(65);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = Utils.unhex(102);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int int0 = Utils.unhex(48);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      int int0 = Utils.unhex(3953);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      int int0 = Utils.unhex((-1051));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(122);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(90);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(48);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(606);
      assertFalse(boolean0);
  }
}
