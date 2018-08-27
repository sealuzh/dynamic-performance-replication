/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 07:01:39 GMT 2018
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
      int int0 = Utils.unhex(65);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 8);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Utils.unhex(127);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Utils.runeToString(8);
      StringBuilder stringBuilder0 = new StringBuilder(8);
      Utils.escapeRune(stringBuilder0, 8);
      assertEquals("\\b", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Utils.runeToString(22);
      StringBuilder stringBuilder0 = new StringBuilder();
      Utils.escapeRune(stringBuilder0, 22);
      assertEquals("\\x16", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Utils.indexOf(byteArray0, byteArray0, (byte)0);
      StringBuilder stringBuilder0 = new StringBuilder(0);
      Utils.escapeRune(stringBuilder0, 0);
      assertEquals("\\x00", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = Utils.emptyOpContext((-40), (-40));
      assertEquals(47, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Utils.indexOf(byteArray0, byteArray0, (byte)0);
      // Undeclared exception!
      try { 
        Utils.subarray(byteArray0, 0, 241);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = Utils.runeToString((-847));
      assertEquals("\uFCB1", string0);
      
      boolean boolean0 = Utils.isWordRune((-847));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Utils.runeToString((-200));
      int[] intArray0 = Utils.stringToRunes("\uFF38");
      // Undeclared exception!
      try { 
        Utils.subarray(intArray0, (-200), 2483);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -200
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = Utils.emptyOpContext(2, 2);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(2389);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(8993);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int int0 = Utils.indexOf(byteArray0, byteArray0, (-26));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int int0 = Utils.indexOf(byteArray0, byteArray0, 8);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = Utils.runeToString((-200));
      assertEquals("\uFF38", string0);
      
      int[] intArray0 = Utils.stringToRunes("\uFF38");
      int[] intArray1 = Utils.subarray(intArray0, (-200), (-200));
      assertArrayEquals(new int[] {}, intArray1);
      assertArrayEquals(new int[] {65336}, intArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = Utils.emptyOpContext(102, (-2409));
      assertEquals(26, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[18];
      int int0 = Utils.emptyOpContext(48, (byte)0);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(323);
      Utils.escapeRune(stringBuilder0, 323);
      assertEquals("\u0143", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(122);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(115);
      boolean boolean1 = Utils.isalnum(115);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = 2948;
      // Undeclared exception!
      try { 
        Utils.escapeRune((StringBuilder) null, 2948);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.Utils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = Utils.unhex(52);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 42;
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
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Utils.subarray(byteArray0, 102, 102);
      assertNotSame(byteArray1, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = Utils.isalnum((-1225));
      assertFalse(boolean0);
      
      int int0 = Utils.emptyOpContext((-1225), 10);
      assertEquals(39, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(95);
      boolean boolean1 = Utils.isalnum(95);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = Utils.emptyOpContext((byte)10, 6);
      assertEquals(33, int0);
      
      int int1 = Utils.unhex(6);
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((byte)10);
      Utils.escapeRune(stringBuilder0, (byte)10);
      assertEquals("\\n", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(712);
      Utils.escapeRune(stringBuilder0, (byte)13);
      assertEquals("\\r", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = Utils.unhex(102);
      assertEquals(15, int0);
      
      String string0 = Utils.runeToString(15);
      assertEquals("\u000F", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)0;
      byteArray0[0] = (byte)60;
      byteArray0[0] = (byte)60;
      byte[] byteArray1 = new byte[6];
      int int0 = Utils.indexOf(byteArray0, byteArray1, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)60;
      byteArray0[3] = (byte)60;
      byteArray0[6] = (byte)60;
      byte[] byteArray1 = new byte[6];
      int int0 = Utils.indexOf(byteArray0, byteArray1, 0);
      assertEquals((-1), int0);
      
      String string0 = Utils.runeToString(0);
      assertEquals("\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)60;
      byteArray0[0] = (byte)60;
      byte[] byteArray1 = new byte[6];
      int int0 = Utils.indexOf(byteArray0, byteArray1, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = Utils.isWordRune(79);
      boolean boolean1 = Utils.isalnum(79);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
      boolean boolean0 = Utils.isalnum(48);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
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
}
