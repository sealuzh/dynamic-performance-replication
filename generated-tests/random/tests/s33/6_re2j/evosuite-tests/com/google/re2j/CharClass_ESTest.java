/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 18:28:53 GMT 2019
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.CharClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CharClass_ESTest extends CharClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendRange(2668, (-1546));
      CharClass charClass2 = charClass1.appendLiteral(92160, 7);
      int[][] intArray0 = new int[4][7];
      int[] intArray1 = new int[8];
      intArray1[0] = (-1546);
      intArray1[1] = 2668;
      intArray1[2] = 2699;
      intArray1[3] = (-1546);
      intArray1[4] = 7;
      intArray1[5] = 7;
      intArray1[6] = 92160;
      intArray1[7] = 7;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[9];
      intArray2[0] = 2699;
      intArray2[1] = (-1546);
      intArray2[2] = (-1546);
      intArray2[3] = 92160;
      intArray2[4] = 92160;
      intArray2[5] = 92160;
      intArray2[6] = 92160;
      intArray2[7] = (-1546);
      intArray2[8] = 2699;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[0];
      intArray0[2] = intArray3;
      int[] intArray4 = new int[7];
      intArray4[0] = 92160;
      intArray4[1] = 92160;
      intArray4[2] = 92160;
      intArray4[3] = 92160;
      intArray4[4] = 726;
      intArray4[5] = (-1546);
      intArray4[6] = 2699;
      intArray0[3] = intArray4;
      // Undeclared exception!
      try { 
        charClass2.appendTableWithSign(intArray0, (-1546));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 8;
      intArray0[1] = 43640;
      intArray0[2] = 2847;
      intArray0[3] = 5;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[9][7];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      int[] intArray2 = new int[5];
      intArray2[0] = 43640;
      intArray2[1] = 2847;
      intArray2[2] = 1;
      intArray2[3] = 2847;
      intArray2[4] = 2847;
      intArray1[4] = intArray2;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      intArray1[7] = intArray0;
      intArray1[8] = intArray0;
      CharClass charClass1 = charClass0.appendNegatedTable(intArray1);
      charClass1.appendClassWithSign(intArray0, 3095);
      assertArrayEquals(new int[] {0, 1114111, 0, 1114111}, intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 179;
      intArray0[1] = 3959;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      charClass0.appendLiteral(54, 54);
      charClass1.toString();
      CharClass charClass2 = charClass1.appendFoldedRange(2266, (-1748));
      CharClass charClass3 = charClass2.appendClassWithSign(intArray0, 3959);
      charClass2.toArray();
      CharClass charClass4 = charClass3.negateClass();
      int[][] intArray1 = new int[2][7];
      int[] intArray2 = new int[4];
      intArray2[0] = 2266;
      intArray2[1] = 1117;
      intArray2[2] = 3959;
      intArray2[3] = (-1748);
      intArray1[0] = intArray2;
      intArray1[1] = intArray0;
      // Undeclared exception!
      try { 
        charClass4.appendTable(intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendLiteral(8240, 2);
      charClass1.appendFoldedRange(2, 66640);
      CharClass charClass2 = charClass1.appendLiteral(8240, 2);
      int[][] intArray0 = new int[4][4];
      int[] intArray1 = new int[5];
      intArray1[0] = 8240;
      intArray1[1] = 2;
      intArray1[2] = 2;
      intArray1[3] = 8240;
      intArray1[4] = 787;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[1];
      intArray2[0] = 2;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[6];
      intArray3[0] = 66640;
      intArray3[1] = 8240;
      intArray3[2] = 66640;
      intArray3[3] = (-885);
      intArray3[4] = 2;
      intArray3[5] = 2;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[2];
      intArray4[0] = 787;
      intArray4[1] = 66640;
      intArray0[3] = intArray4;
      // Undeclared exception!
      try { 
        charClass2.appendNegatedTable(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 542;
      intArray0[1] = 300;
      intArray0[2] = 91;
      intArray0[3] = (-1764);
      intArray0[4] = 0;
      intArray0[5] = 1058;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[5][3];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      CharClass charClass1 = charClass0.appendTable(intArray1);
      CharClass charClass2 = charClass1.appendLiteral(71, (-3787));
      CharClass charClass3 = charClass2.appendNegatedClass(intArray0);
      charClass3.appendNegatedClass(intArray0);
      assertArrayEquals(new int[] {542, 300, 91, (-1764), (-1763), 1114111}, intArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = null;
      int int0 = (-1811);
      // Undeclared exception!
      try { 
        charClass0.appendClassWithSign((int[]) null, (-1811));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = (-2768102);
      intArray0[1] = (-2791069);
      intArray0[2] = 2;
      intArray0[3] = (-2782456);
      intArray0[4] = 4803;
      intArray0[5] = 1023;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendFoldedClass(intArray0);
      CharClass charClass2 = charClass1.negateClass();
      CharClass charClass3 = charClass2.appendFoldedRange(4803, 370);
      int[][] intArray1 = new int[1][8];
      intArray1[0] = intArray0;
      CharClass charClass4 = charClass3.appendTable(intArray1);
      CharClass charClass5 = charClass4.appendTableWithSign(intArray1, 93);
      charClass5.negateClass();
      assertArrayEquals(new int[] {(-2768102), (-2791069), 2, (-2782456), 4803, 1023}, intArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.cleanClass();
      CharClass charClass2 = charClass1.appendLiteral(1585, 1585);
      charClass1.appendRange(1981, 1981);
      CharClass charClass3 = charClass1.cleanClass();
      int[] intArray0 = new int[4];
      intArray0[0] = 1981;
      intArray0[1] = 1981;
      intArray0[2] = 1981;
      intArray0[3] = (-2);
      CharClass charClass4 = charClass3.appendFoldedClass(intArray0);
      charClass3.toString();
      int[] intArray1 = charClass1.toArray();
      charClass1.appendNegatedClass(intArray1);
      int[][] intArray2 = new int[7][3];
      intArray2[0] = intArray1;
      intArray2[1] = intArray1;
      intArray2[2] = intArray1;
      intArray2[3] = intArray1;
      intArray2[4] = intArray1;
      intArray2[5] = intArray1;
      intArray2[6] = intArray1;
      charClass2.appendTableWithSign(intArray2, 252);
      CharClass charClass5 = charClass2.appendTable(intArray2);
      charClass5.appendTableWithSign(intArray2, 2);
      charClass1.appendTableWithSign(intArray2, 1898);
      CharClass charClass6 = charClass5.appendRange(960, 91);
      assertSame(charClass6, charClass4);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = (-1746);
      intArray0[1] = 31;
      intArray0[2] = (-1719);
      intArray0[3] = 178;
      intArray0[4] = (-5198);
      intArray0[5] = (-1719);
      intArray0[6] = (-2773);
      CharClass charClass0 = new CharClass(intArray0);
      // Undeclared exception!
      try { 
        charClass0.appendClassWithSign(intArray0, 2355);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[4][3];
      int[] intArray1 = new int[1];
      intArray1[0] = 8527;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[6];
      intArray2[0] = 8527;
      intArray2[1] = 8527;
      intArray2[2] = 8527;
      intArray2[3] = 43600;
      intArray2[4] = 8527;
      intArray2[5] = 298;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[6];
      intArray3[0] = 8527;
      intArray3[1] = 298;
      intArray3[2] = 43600;
      intArray3[3] = 298;
      intArray3[4] = 8527;
      intArray3[5] = 298;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[2];
      intArray4[0] = 298;
      intArray4[1] = 8527;
      intArray0[3] = intArray4;
      // Undeclared exception!
      try { 
        charClass0.appendTableWithSign(intArray0, (-1416));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[8];
      intArray0[0] = (-5199);
      intArray0[1] = 8471;
      intArray0[2] = 6742;
      intArray0[3] = 1585;
      intArray0[4] = (-2);
      intArray0[5] = (-1501);
      intArray0[6] = (-226);
      intArray0[7] = (-249);
      CharClass charClass1 = charClass0.appendClass(intArray0);
      int[][] intArray1 = new int[8][6];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      int[] intArray2 = new int[9];
      intArray2[0] = 6742;
      intArray2[1] = (-1501);
      intArray2[2] = (-249);
      intArray2[3] = (-226);
      intArray2[4] = (-1501);
      intArray2[5] = (-226);
      intArray2[6] = 1585;
      intArray2[7] = 3754;
      intArray2[8] = (-249);
      intArray1[4] = intArray2;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      intArray1[7] = intArray0;
      CharClass charClass2 = charClass1.appendTable(intArray1);
      CharClass charClass3 = charClass2.negateClass();
      assertSame(charClass2, charClass3);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 66640;
      intArray0[1] = (-1298);
      int int0 = 42798;
      intArray0[2] = 42798;
      CharClass charClass0 = new CharClass(intArray0);
      int int1 = 1470;
      CharClass charClass1 = charClass0.appendLiteral((-2223), 1470);
      CharClass charClass2 = charClass1.negateClass();
      // Undeclared exception!
      try { 
        charClass2.appendClass(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 613;
      int int0 = 70;
      intArray0[1] = 70;
      intArray0[2] = (-2962);
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[1][8];
      int[] intArray2 = new int[0];
      intArray1[0] = intArray2;
      // Undeclared exception!
      try { 
        charClass0.appendNegatedTable(intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 6829;
      intArray0[1] = (-1273);
      intArray0[2] = 1816;
      intArray0[3] = 1216;
      intArray0[4] = 1;
      intArray0[5] = 69;
      intArray0[6] = (-4435);
      intArray0[7] = (-32);
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.negateClass();
      charClass0.appendNegatedClass(intArray0);
      charClass0.appendFoldedRange(1216, 69);
      charClass0.toString();
      String string0 = charClass1.toString();
      assertArrayEquals(new int[] {0, 6828, (-1272), 1815, (-31), 1114111, (-4435), (-32)}, intArray0);
      assertEquals("[0x0-0x1aac 0xfffffb08-0x717 0xffffffe1-0x10ffff]", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int int0 = 6;
      CharClass charClass1 = charClass0.appendFoldedRange(6, 6);
      int[] intArray0 = new int[9];
      intArray0[0] = 6;
      intArray0[1] = 6;
      intArray0[2] = 6;
      intArray0[3] = 6;
      intArray0[4] = 6;
      intArray0[5] = 6;
      int int1 = 104;
      intArray0[6] = 104;
      intArray0[7] = 6;
      intArray0[8] = 6;
      // Undeclared exception!
      try { 
        charClass1.appendNegatedClass(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[9];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 32;
      intArray0[3] = 0;
      intArray0[4] = (-311);
      intArray0[5] = 0;
      intArray0[6] = 69246;
      intArray0[7] = (-2);
      intArray0[8] = 0;
      // Undeclared exception!
      try { 
        charClass0.appendNegatedClass(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[3];
      int int0 = (-2762);
      intArray0[0] = (-2762);
      intArray0[1] = (-257);
      int int1 = (-14);
      intArray0[2] = (-14);
      // Undeclared exception!
      try { 
        charClass0.appendFoldedClass(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = null;
      CharClass charClass0 = null;
      try {
        charClass0 = new CharClass((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = (-4440);
      intArray0[1] = 16;
      intArray0[2] = 1310;
      intArray0[3] = (-1887);
      intArray0[4] = 4;
      intArray0[5] = 7;
      intArray0[6] = 1;
      intArray0[7] = (-2371);
      intArray0[8] = 1141;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[7][9];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      int[] intArray2 = new int[9];
      intArray2[0] = (-4440);
      intArray2[1] = 4;
      intArray2[2] = 1310;
      intArray2[3] = (-2371);
      intArray2[4] = 7;
      intArray2[5] = (-4440);
      intArray2[6] = 1;
      intArray2[7] = 7010;
      intArray2[8] = (-4440);
      intArray1[2] = intArray2;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      CharClass charClass1 = charClass0.appendTable(intArray1);
      CharClass charClass2 = charClass1.appendNegatedTable(intArray1);
      CharClass charClass3 = charClass2.appendTableWithSign(intArray1, 4);
      // Undeclared exception!
      try { 
        charClass3.appendClass(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendFoldedRange((-2002), 1869);
      CharClass charClass2 = charClass1.cleanClass();
      int[][] intArray0 = new int[8][1];
      int[] intArray1 = new int[5];
      intArray1[0] = 1869;
      intArray1[1] = (-2002);
      intArray1[2] = (-2002);
      intArray1[3] = 1869;
      intArray1[4] = 1869;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[2];
      intArray2[0] = 2;
      intArray2[1] = 1869;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[9];
      intArray3[0] = (-2002);
      intArray3[1] = 2;
      intArray3[2] = 107;
      intArray3[3] = (-2002);
      intArray3[4] = (-2002);
      intArray3[5] = 105;
      intArray3[6] = 1869;
      intArray3[7] = (-2002);
      intArray3[8] = (-2002);
      intArray0[2] = intArray3;
      int[] intArray4 = new int[4];
      intArray4[0] = 2;
      intArray4[1] = 105;
      intArray4[2] = 1869;
      intArray4[3] = 107;
      intArray0[3] = intArray4;
      int[] intArray5 = new int[6];
      intArray5[0] = 105;
      intArray5[1] = 1869;
      intArray5[2] = 105;
      intArray5[3] = 105;
      intArray5[4] = 1160;
      intArray5[5] = (-2002);
      intArray0[4] = intArray5;
      int[] intArray6 = new int[4];
      intArray6[0] = (-2002);
      intArray6[1] = 1160;
      intArray6[2] = 105;
      intArray6[3] = 1160;
      intArray0[5] = intArray6;
      int[] intArray7 = new int[5];
      intArray7[0] = 105;
      intArray7[1] = 1160;
      intArray7[2] = 1160;
      intArray7[3] = 105;
      intArray7[4] = 105;
      intArray0[6] = intArray7;
      int[] intArray8 = new int[9];
      intArray8[0] = 105;
      intArray8[1] = 1160;
      intArray8[2] = 1869;
      intArray8[3] = 1160;
      intArray8[4] = (-2002);
      intArray8[5] = 1160;
      intArray8[6] = 1160;
      intArray8[7] = 105;
      intArray8[8] = 65596;
      intArray0[7] = intArray8;
      // Undeclared exception!
      try { 
        charClass2.appendTableWithSign(intArray0, 99);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }
}
