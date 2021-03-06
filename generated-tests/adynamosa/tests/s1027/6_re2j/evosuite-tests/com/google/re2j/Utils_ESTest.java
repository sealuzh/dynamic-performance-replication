/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 19:10:57 GMT 2019
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
      int int0 = Utils.emptyOpContext(42802, 122);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Utils.emptyOpContext(97, 231);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Utils.emptyOpContext(13, 90);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)70;
      byte[] byteArray1 = new byte[9];
      int int0 = Utils.indexOf(byteArray1, byteArray0, (byte) (-125));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-125);
      byte[] byteArray1 = new byte[9];
      int int0 = Utils.indexOf(byteArray1, byteArray0, (byte) (-125));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[6];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-3955));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[17];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)16);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(125);
      Utils.escapeRune(stringBuilder0, 125);
      assertEquals("\\}", stringBuilder0.toString());
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
      int int0 = Utils.unhex(97);
      assertEquals(10, int0);
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
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, (-94), (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -94
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = Utils.subarray((int[]) null, (-1265), (-1265));
      assertEquals(0, intArray0.length);
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.subarray((int[]) null, 3424, 48);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = Utils.subarray((byte[]) null, 0, 0);
      assertEquals(0, byteArray0.length);
      assertNotNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = Utils.subarray(byteArray0, (byte) (-12), (byte) (-12));
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray1, 1351, 1945);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1351
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = Utils.runeToString(0);
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = Utils.runeToString((-824));
      assertEquals("\uFCC8", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utils.indexOf((byte[]) null, (byte[]) null, (-794));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(125);
      Utils.escapeRune(stringBuilder0, (-601));
      assertEquals("\\xfffffda7", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = Utils.emptyOpContext(0, 0);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("");
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 509, (-164));
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
      // Undeclared exception!
      try { 
        Utils.subarray((byte[]) null, (-1791), 2768);
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
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, 1664, (-1638));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (byte)0, 458);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        Utils.indexOf(byteArray0, (byte[]) null, (byte)65);
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
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 3396);
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
      int int0 = Utils.emptyOpContext(48, (-1157));
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = Utils.emptyOpContext(10, 10);
      assertEquals(35, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = Utils.emptyOpContext((-3482), 2819);
      assertEquals(37, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(95);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = Utils.emptyOpContext(57, 57);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = Utils.emptyOpContext(65, 1679);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune((-1244));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-79);
      byteArray0[1] = (byte) (-79);
      byte[] byteArray1 = new byte[6];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-105));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)46;
      byte[] byteArray1 = new byte[6];
      int int0 = Utils.indexOf(byteArray0, byteArray1, (byte) (-105));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[8];
      int int0 = Utils.indexOf(byteArray1, byteArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 57);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = Utils.subarray(byteArray0, 0, 8);
      assertEquals(8, byteArray1.length);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      int[] intArray0 = new int[8];
      int[] intArray1 = Utils.subarray(intArray0, (byte)0, 1);
      assertEquals(1, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = Utils.runeToString(101);
      assertEquals("e", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = Utils.runeToString(127797);
      assertEquals("\uF335", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("e");
      assertEquals(1, intArray0.length);
      assertArrayEquals(new int[] {101}, intArray0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("fjo1\"");
      Utils.escapeRune(stringBuilder0, 0);
      assertEquals("fjo1\"\\x00", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("");
      Utils.escapeRune(stringBuilder0, 2687);
      assertEquals("\\x{a7f}", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(8);
      Utils.escapeRune(stringBuilder0, 13);
      assertEquals("\\r", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("fjo1\"");
      Utils.escapeRune(stringBuilder0, 12);
      assertEquals("fjo1\"\\f", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(120000);
      Utils.escapeRune(stringBuilder0, 10);
      assertEquals("\\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 9);
      assertEquals("\\t", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(42802);
      Utils.escapeRune(stringBuilder0, 8);
      assertEquals("\\b", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("xL[|VNbO~]");
      Utils.escapeRune(stringBuilder0, 92);
      assertEquals("xL[|VNbO~]\\\\", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      int int0 = Utils.unhex((byte)70);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      int int0 = Utils.unhex(1171);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      int int0 = Utils.unhex(57);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      int int0 = Utils.unhex((-1213));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(69815);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(97);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(48);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(90);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((-1213));
      assertFalse(boolean0);
  }
}
