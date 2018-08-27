/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 20:31:19 GMT 2018
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
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)95;
      byteArray0[0] = (byte)95;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)10;
      byteArray0[4] = (byte)36;
      Utils.indexOf(byteArray0, byteArray0, (byte)10);
      Utils.indexOf(byteArray0, byteArray0, 8485);
      int[] intArray0 = new int[4];
      intArray0[0] = (int) (byte)0;
      intArray0[1] = (int) (byte)95;
      intArray0[2] = (int) (byte)95;
      intArray0[3] = (int) (byte)10;
      Utils.subarray(intArray0, 0, 0);
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, (byte)95, (byte)0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(447);
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 8317);
      assertEquals(0, int0);
      
      boolean boolean1 = Utils.isWordRune(6177);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = Utils.stringToRunes("");
      int[] intArray1 = Utils.subarray(intArray0, 638, 638);
      assertArrayEquals(new int[] {}, intArray0);
      assertNotSame(intArray1, intArray0);
      assertArrayEquals(new int[] {}, intArray1);
      
      String string0 = Utils.runeToString(638);
      assertEquals("\u027E", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Utils.isalnum(0);
      Utils.isWordRune(0);
      Utils.emptyOpContext(0, 0);
      Utils.emptyOpContext(32, 0);
      StringBuilder stringBuilder0 = new StringBuilder(2127);
      Utils.escapeRune(stringBuilder0, 0);
      assertEquals("\\x00", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Utils.indexOf(byteArray0, byteArray0, 8340);
      StringBuilder stringBuilder0 = new StringBuilder(12736);
      StringBuilder stringBuilder1 = stringBuilder0.append((Object) byteArray0);
      Utils.escapeRune(stringBuilder1, 0);
      assertSame(stringBuilder0, stringBuilder1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = Utils.emptyOpContext(1, 57);
      assertEquals(16, int0);
      
      boolean boolean0 = Utils.isalnum(57);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)0);
      assertEquals(0, int0);
      
      boolean boolean0 = Utils.isWordRune(178);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(95);
      boolean boolean1 = Utils.isWordRune((byte)0);
      assertTrue(boolean1 == boolean0);
      
      int int0 = Utils.unhex(125);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Utils.emptyOpContext(9, 9);
      Utils.unhex(9);
      int int0 = 0;
      Utils.unhex(0);
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte) (-59);
      byteArray0[0] = (byte) (-59);
      byte byte1 = (byte)0;
      byteArray0[1] = (byte)0;
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte) (-59);
      byteArray1[2] = (byte) (-59);
      Utils.indexOf(byteArray0, byteArray1, 0);
      int[] intArray0 = Utils.stringToRunes("Q(f[EtFOB6");
      Utils.subarray(byteArray1, 0, 0);
      Utils.unhex((byte) (-59));
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, (-627), 9);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -627
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 2);
      assertEquals((-1), int0);
      
      byte[] byteArray1 = Utils.subarray(byteArray0, (-312), (-312));
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = 674;
      Utils.unhex(674);
      Utils.emptyOpContext((-3804), 197);
      StringBuilder stringBuilder0 = new StringBuilder();
      StringBuilder stringBuilder1 = stringBuilder0.append(0L);
      stringBuilder1.append('&');
      // Undeclared exception!
      try { 
        stringBuilder1.replace(37, 197, "Lo");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // start > length()
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Utils.isalnum(447);
      byte[] byteArray0 = new byte[0];
      Utils.indexOf(byteArray0, byteArray0, 8340);
      StringBuilder stringBuilder0 = new StringBuilder(12736);
      StringBuilder stringBuilder1 = stringBuilder0.append((Object) byteArray0);
      Utils.escapeRune(stringBuilder1, 0);
      assertSame(stringBuilder1, stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Utils.isalnum(95);
      byte byte0 = (byte)0;
      Utils.isWordRune((byte)0);
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 317);
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
      boolean boolean0 = Utils.isWordRune((byte)0);
      assertFalse(boolean0);
      
      String string0 = Utils.runeToString(34);
      assertEquals("\"", string0);
      
      int int0 = Utils.unhex((byte)0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "\\\\";
      Utils.stringToRunes("\\");
      Utils.stringToRunes("\\");
      int int0 = (-52);
      Utils.runeToString((-52));
      Utils.stringToRunes("\uFFCC");
      byte[] byteArray0 = new byte[0];
      int int1 = 291;
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, 291, (-52));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Utils.stringToRunes("Balinese");
      StringBuilder stringBuilder0 = new StringBuilder(0);
      char[] charArray0 = new char[2];
      charArray0[0] = 'R';
      charArray0[1] = '$';
      StringBuilder stringBuilder1 = stringBuilder0.append(charArray0, 0, 0);
      StringBuilder stringBuilder2 = stringBuilder1.delete(0, 1493);
      StringBuilder stringBuilder3 = stringBuilder2.insert(0, (Object) stringBuilder0);
      StringBuilder stringBuilder4 = stringBuilder3.append("\r");
      StringBuilder stringBuilder5 = new StringBuilder(1493);
      stringBuilder2.append((Object) null);
      Utils.escapeRune(stringBuilder4, 68);
      Utils.escapeRune(stringBuilder3, (-1325));
      assertEquals("\rnullD\\xfffffad3", stringBuilder3.toString());
      assertEquals("\rnullD\\xfffffad3", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Utils.isalnum(447);
      Utils.isWordRune((-4303));
      Utils.emptyOpContext(122, 12938);
      Utils.emptyOpContext(12938, 2960);
      StringBuilder stringBuilder0 = new StringBuilder(447);
      stringBuilder0.append(43454);
      Utils.escapeRune(stringBuilder0, 39);
      assertEquals("43454'", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(187);
      Utils.stringToRunes("");
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)39;
      byteArray0[1] = (byte)95;
      byteArray0[2] = (byte) (-38);
      byteArray0[3] = (byte)65;
      int int0 = Utils.emptyOpContext((byte)65, 8);
      assertEquals(16, int0);
      
      boolean boolean1 = Utils.isalnum(64416);
      assertTrue(boolean1 == boolean0);
      
      int[] intArray0 = Utils.stringToRunes("]<(L+(Jk=");
      assertArrayEquals(new int[] {93, 60, 40, 76, 43, 40, 74, 107, 61}, intArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(95);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-63);
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte) (-63);
      byteArray1[1] = (byte)0;
      int int0 = Utils.indexOf(byteArray0, byteArray1, (-1882));
      assertEquals(1, int0);
      
      boolean boolean1 = Utils.isWordRune(178);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)12;
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, (byte)12);
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
      Utils.isalnum(95);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-63);
      byte[] byteArray1 = new byte[2];
      byteArray1[1] = (byte)0;
      Utils.indexOf(byteArray0, byteArray1, (byte) (-63));
      byte[] byteArray2 = Utils.subarray(byteArray0, (byte)0, 0);
      Utils.unhex(409);
      Utils.isWordRune((byte)0);
      Utils.runeToString((byte)0);
      Utils.indexOf(byteArray0, byteArray2, 409);
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, 9, 2);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)12;
      byteArray0[0] = (byte)12;
      byte byte1 = (byte)39;
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 2263);
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
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      Utils.indexOf(byteArray0, byteArray0, 907);
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte)39;
      byteArray1[1] = (byte)39;
      byteArray1[2] = (byte)98;
      byteArray1[3] = (byte) (-68);
      byteArray1[4] = (byte) (-68);
      Utils.indexOf(byteArray0, byteArray1, (-1));
      StringBuilder stringBuilder0 = new StringBuilder((byte)0);
      StringBuilder stringBuilder1 = stringBuilder0.append(true);
      stringBuilder1.append((Object) stringBuilder0);
      Utils.escapeRune(stringBuilder0, (byte) (-68));
      assertEquals("truetrue\\xffffffbc", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-29);
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
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Utils.indexOf(byteArray0, byteArray0, (byte)12);
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
  public void test25()  throws Throwable  {
      Utils.stringToRunes("RS!^zq=Q");
      Utils.emptyOpContext(90, 90);
      Utils.isalnum(90);
      Utils.isWordRune(90);
      Utils.unhex(32);
      Utils.runeToString(32);
      int int0 = (-1797);
      Utils.isalnum((-1797));
      Utils.isWordRune(4977);
      Utils.unhex(32);
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte) (-59);
      byteArray0[0] = (byte) (-59);
      byteArray0[1] = (byte) (-80);
      byteArray0[2] = (byte) (-52);
      byteArray0[3] = (byte) (-53);
      byteArray0[4] = (byte)122;
      byte byte1 = (byte) (-110);
      byteArray0[5] = (byte) (-110);
      Utils.indexOf(byteArray0, byteArray0, (-180));
      StringBuilder stringBuilder0 = new StringBuilder();
      int int1 = (-1);
      // Undeclared exception!
      try { 
        stringBuilder0.insert(32, (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 32
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
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
}