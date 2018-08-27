/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 21:10:35 GMT 2018
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
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-119);
      byte byte0 = (byte) (-115);
      byteArray0[2] = (byte) (-115);
      byte byte1 = (byte)0;
      byteArray0[3] = (byte)0;
      Utils.indexOf(byteArray0, byteArray0, (byte)0);
      Utils.emptyOpContext(944, 34);
      Utils.isalnum((byte)0);
      int int0 = 119362;
      Utils.unhex(119362);
      int int1 = 0;
      // Undeclared exception!
      try { 
        Utils.subarray((int[]) null, (-1), 0);
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
      int[] intArray0 = new int[0];
      int[] intArray1 = Utils.subarray(intArray0, (-5), (-5));
      assertArrayEquals(new int[] {}, intArray1);
      assertNotSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Utils.runeToString(4238);
      Utils.stringToRunes("\u108E");
      StringBuilder stringBuilder0 = null;
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 4238);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = 95;
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 95);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 565);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Utils.runeToString(95);
      Utils.stringToRunes("_");
      Utils.emptyOpContext(95, 95);
      Utils.isWordRune(32);
      Utils.isalnum(127166);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)9;
      byteArray0[2] = (byte) (-90);
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)123;
      byteArray0[6] = (byte) (-104);
      byteArray0[7] = (byte)65;
      Utils.indexOf(byteArray0, byteArray0, 578);
      Utils.isalnum((byte) (-90));
      Utils.stringToRunes("_");
      Utils.unhex((byte) (-90));
      Utils.emptyOpContext(0, (byte)1);
      Utils.emptyOpContext((byte)0, 0);
      Utils.stringToRunes("th\"#|cR5e<cUg[(");
      Utils.emptyOpContext((-1), (byte)65);
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, 0, (-1210));
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
      boolean boolean0 = Utils.isalnum(1317);
      assertFalse(boolean0);
      
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Utils.subarray(byteArray0, 1317, 1317);
      assertArrayEquals(new byte[] {}, byteArray1);
      
      String string0 = Utils.runeToString(1317);
      assertEquals("\u0525", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      StringBuilder stringBuilder1 = stringBuilder0.append(false);
      StringBuilder stringBuilder2 = stringBuilder1.append((CharSequence) stringBuilder0);
      Utils.escapeRune(stringBuilder2, 2);
      assertEquals("falsefalse\\x02", stringBuilder2.toString());
      assertEquals("falsefalse\\x02", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Utils.subarray((int[]) null, (-1722), (-1722));
      Utils.emptyOpContext((-1722), 0);
      Utils.runeToString((-1722));
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "\uF946");
      StringBuilder stringBuilder1 = stringBuilder0.delete(0, 37);
      int int0 = (-336);
      StringBuilder stringBuilder2 = stringBuilder1.append((-336));
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        stringBuilder2.insert((-1722), charArray0, 4, 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1722
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Utils.unhex(0);
      Utils.isalnum((-1));
      Utils.isalnum(728);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-106);
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)115;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)53;
      byteArray0[5] = (byte)101;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)0;
      Utils.indexOf(byteArray0, byteArray0, (byte)0);
      Utils.subarray(byteArray0, (byte)0, 0);
      Utils.isWordRune((byte)0);
      StringBuilder stringBuilder0 = new StringBuilder();
      StringBuilder stringBuilder1 = stringBuilder0.insert((int) (byte)0, "s4Vw");
      StringBuilder stringBuilder2 = stringBuilder0.append((CharSequence) stringBuilder1, (int) (byte)0, 0);
      Utils.escapeRune(stringBuilder2, (-1528));
      assertSame(stringBuilder1, stringBuilder2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Utils.isalnum(48);
      Utils.isalnum(48);
      String string0 = "K3r`Tv(k0b9";
      int[] intArray0 = Utils.stringToRunes("K3r`Tv(k0b9");
      Utils.isWordRune(48);
      Utils.emptyOpContext(102, 0);
      int int0 = 797;
      Utils.unhex(797);
      Utils.isalnum(48);
      int int1 = 11688;
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, 356, 11688);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 356
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Utils.runeToString(135);
      Utils.isalnum(135);
      byte byte0 = (byte)0;
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-90);
      byteArray0[2] = (byte) (-49);
      Utils.indexOf(byteArray0, byteArray0, (byte)123);
      Utils.isWordRune((byte)0);
      Utils.stringToRunes("\u0087");
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte) (-81);
      byteArray1[1] = (byte) (-49);
      Utils.indexOf(byteArray0, byteArray1, (byte) (-81));
      Utils.isalnum(0);
      Utils.emptyOpContext((byte)123, (byte) (-49));
      Utils.emptyOpContext((byte) (-81), (-2778));
      int int0 = 194;
      Utils.runeToString(194);
      Utils.unhex((byte) (-90));
      Utils.indexOf(byteArray1, byteArray1, (-48));
      byte[] byteArray2 = new byte[0];
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray2, 2666, (byte) (-49));
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
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte) (-80);
      Utils.indexOf(byteArray0, byteArray1, (byte)0);
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (-1), 31);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte) (-4);
      Utils.indexOf(byteArray0, byteArray1, (byte)0);
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (-1), 31);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Utils.runeToString(135);
      boolean boolean0 = Utils.isalnum(135);
      assertFalse(boolean0);
      
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-90);
      byteArray0[2] = (byte) (-49);
      Utils.indexOf(byteArray0, byteArray0, (byte)123);
      Utils.isWordRune((byte)0);
      int[] intArray0 = Utils.stringToRunes("\u0087");
      assertArrayEquals(new int[] {135}, intArray0);
      
      byte[] byteArray1 = new byte[2];
      Utils.isalnum((byte) (-49));
      Utils.emptyOpContext(787, (byte)123);
      int int0 = Utils.emptyOpContext((byte)123, 787);
      assertEquals(32, int0);
      
      String string0 = Utils.runeToString((byte) (-90));
      assertEquals("\uFFA6", string0);
      
      int int1 = Utils.unhex((-838));
      int int2 = Utils.indexOf(byteArray0, byteArray1, (byte) (-90));
      assertTrue(int2 == int1);
      
      int int3 = Utils.emptyOpContext(360, 360);
      assertEquals(32, int3);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Utils.runeToString(135);
      Utils.isalnum(135);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-83);
      byteArray0[4] = (byte) (-49);
      Utils.indexOf(byteArray0, byteArray0, (byte)123);
      Utils.isWordRune((byte)0);
      Utils.stringToRunes("\u0087");
      byte[] byteArray1 = new byte[2];
      byteArray0[1] = (byte) (-81);
      byteArray1[1] = (byte) (-49);
      Utils.indexOf(byteArray0, byteArray1, (byte)0);
      Utils.isalnum(0);
      Utils.emptyOpContext((byte)123, (byte) (-49));
      Utils.emptyOpContext((byte) (-81), 3);
      Utils.runeToString(194);
      Utils.unhex((byte) (-81));
      Utils.indexOf(byteArray1, byteArray1, (-48));
      byte[] byteArray2 = new byte[0];
      Utils.emptyOpContext(68121, 348);
      Utils.indexOf(byteArray2, byteArray0, (-3215));
      Utils.unhex(194);
      Utils.isalnum((-1086));
      StringBuilder stringBuilder0 = new StringBuilder();
      StringBuilder stringBuilder1 = stringBuilder0.append("\u00C2");
      StringBuilder stringBuilder2 = stringBuilder1.append((-474.2818146521607));
      StringBuilder stringBuilder3 = stringBuilder2.append((-1));
      // Undeclared exception!
      try { 
        stringBuilder3.insert((-3215), (long) (byte) (-83));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -3215
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(12);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      Utils.indexOf(byteArray0, byteArray0, (-794));
      String string0 = Utils.runeToString((-5200));
      assertEquals("\uEBB0", string0);
      
      boolean boolean1 = Utils.isWordRune((byte)0);
      assertFalse(boolean1);
      
      StringBuilder stringBuilder0 = new StringBuilder();
      boolean boolean2 = Utils.isalnum(65);
      assertFalse(boolean2 == boolean0);
      
      Utils.emptyOpContext((byte)0, 0);
      int int0 = Utils.emptyOpContext(65, (-432));
      assertEquals(26, int0);
      
      String string1 = Utils.runeToString(12);
      assertEquals("\f", string1);
      
      int int1 = Utils.unhex((-794));
      assertEquals((-1), int1);
      
      int int2 = Utils.indexOf(byteArray0, byteArray0, (-1));
      assertEquals(0, int2);
      
      int int3 = Utils.emptyOpContext((-1), (byte)0);
      assertEquals(37, int3);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      Utils.stringToRunes("C");
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      Utils.indexOf(byteArray0, byteArray0, (-1193));
      Utils.runeToString(15);
      Utils.isWordRune(95);
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.isalnum((byte)0);
      Utils.emptyOpContext(1651, 34);
      Utils.emptyOpContext(1153, 0);
      Utils.runeToString(1439);
      Utils.unhex(12);
      Utils.indexOf(byteArray0, byteArray0, (byte)0);
      Utils.emptyOpContext((byte)0, 2043);
      Utils.escapeRune(stringBuilder0, 12);
      assertEquals("\\f", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Utils.unhex(1317);
      byte[] byteArray0 = new byte[6];
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.isalnum(10);
      Utils.emptyOpContext(2043, 3);
      Utils.emptyOpContext((-3120), 97);
      Utils.runeToString(8222);
      Utils.unhex((-2846));
      Utils.indexOf(byteArray0, byteArray0, (byte) (-16));
      Utils.emptyOpContext(2043, 0);
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 2043);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      Utils.stringToRunes("C");
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      Utils.indexOf(byteArray0, byteArray0, (-1193));
      Utils.runeToString(15);
      Utils.isWordRune(95);
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.isalnum((byte)0);
      Utils.emptyOpContext(92, (-458));
      Utils.emptyOpContext((-1334), (-155));
      Utils.runeToString((byte)0);
      Utils.unhex(57);
      Utils.indexOf(byteArray0, byteArray0, 1);
      int int0 = Utils.EMPTY_END_TEXT;
      Utils.escapeRune(stringBuilder0, 8);
      assertEquals("\\b", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
}