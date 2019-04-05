/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 09:51:59 GMT 2019
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
      int[] intArray0 = new int[4];
      intArray0[0] = (-1723);
      intArray0[1] = 221;
      intArray0[2] = 1636;
      intArray0[3] = 3070;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.cleanClass();
      CharClass charClass2 = charClass1.appendNegatedClass(intArray0);
      int int0 = 4249;
      CharClass charClass3 = charClass2.appendRange(3070, 4249);
      // Undeclared exception!
      charClass3.appendFoldedClass(intArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 3074;
      intArray0[1] = (-1);
      intArray0[2] = 3479;
      intArray0[3] = 4;
      intArray0[4] = (-226);
      intArray0[5] = 461;
      intArray0[6] = (-1482);
      intArray0[7] = 1114111;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendClass(intArray0);
      int[][] intArray1 = new int[3][2];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      charClass1.appendTableWithSign(intArray1, 3074);
      charClass1.appendFoldedClass(intArray0);
      String string0 = CharClass.charClassToString(intArray0, (-470));
      assertEquals("[]", string0);
      
      charClass1.appendClassWithSign(intArray0, (-2));
      assertArrayEquals(new int[] {3074, (-1), 3479, 4, (-226), 461, (-1482), 1114111}, intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = 496;
      intArray0[1] = (-8339611);
      intArray0[2] = (-8352136);
      int int0 = (-8347125);
      intArray0[3] = (-8347125);
      intArray0[4] = 580;
      int int1 = (-540);
      intArray0[5] = (-540);
      int int2 = 1;
      intArray0[6] = 1;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[7][5];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      int[] intArray2 = new int[8];
      intArray2[0] = 580;
      intArray2[1] = 580;
      intArray2[2] = 1;
      intArray2[3] = 580;
      intArray2[4] = 1;
      intArray2[5] = 1;
      intArray2[6] = 1;
      intArray2[7] = (-8347125);
      intArray1[4] = intArray2;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      CharClass charClass1 = charClass0.appendTable(intArray1);
      // Undeclared exception!
      try { 
        charClass1.appendClassWithSign(intArray0, (-8352136));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = charClass0.toArray();
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[8][1];
      int[] intArray1 = new int[0];
      intArray0[0] = intArray1;
      int[] intArray2 = new int[7];
      intArray2[0] = 0;
      intArray2[1] = 2068;
      intArray2[2] = 65103;
      intArray2[3] = 0;
      intArray2[4] = (-2531);
      intArray2[5] = 656;
      intArray2[6] = 43346;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[6];
      intArray3[0] = 2068;
      intArray3[1] = (-2531);
      intArray3[2] = (-2531);
      intArray3[3] = 65103;
      intArray3[4] = 0;
      intArray3[5] = 0;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[7];
      intArray4[0] = 656;
      intArray4[1] = 0;
      intArray4[2] = 0;
      intArray4[3] = (-2782);
      intArray4[4] = (-2531);
      intArray4[5] = 0;
      intArray4[6] = 65103;
      intArray0[3] = intArray4;
      int[] intArray5 = new int[2];
      intArray5[0] = 12343;
      intArray5[1] = (-2531);
      intArray0[4] = intArray5;
      int[] intArray6 = new int[2];
      intArray6[0] = 43346;
      intArray6[1] = (-2531);
      intArray0[5] = intArray6;
      int[] intArray7 = new int[5];
      intArray7[0] = 12343;
      intArray7[1] = 65103;
      intArray7[2] = 65103;
      intArray7[3] = 0;
      intArray7[4] = (-2531);
      intArray0[6] = intArray7;
      int[] intArray8 = new int[0];
      intArray0[7] = intArray8;
      // Undeclared exception!
      try { 
        charClass0.appendNegatedTable(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int int0 = (-635);
      CharClass charClass1 = charClass0.appendLiteral((-635), (-635));
      int[] intArray0 = null;
      // Undeclared exception!
      try { 
        charClass1.appendFoldedClass((int[]) null);
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
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 816;
      intArray0[3] = 65;
      intArray0[4] = (-1518);
      intArray0[5] = 0;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.negateClass();
      charClass1.toString();
      // Undeclared exception!
      charClass0.appendFoldedClass(intArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = 124;
      intArray0[1] = 461;
      intArray0[2] = 2739;
      intArray0[3] = 1958;
      intArray0[4] = 1271;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[2][3];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      CharClass charClass1 = charClass0.appendTable(intArray1);
      charClass1.appendTable(intArray1);
      assertArrayEquals(new int[] {124, 461, 2739, 1958, 1271}, intArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      charClass0.toString();
      int int0 = 0;
      int[] intArray0 = new int[1];
      intArray0[0] = 26;
      // Undeclared exception!
      try { 
        CharClass.charClassToString(intArray0, 26);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[6];
      intArray0[0] = (-4012);
      intArray0[1] = 93;
      intArray0[2] = 527;
      intArray0[3] = 0;
      intArray0[4] = 1914;
      intArray0[5] = 1485;
      CharClass charClass1 = charClass0.appendFoldedClass(intArray0);
      charClass1.appendRange(1592, 93);
      int[] intArray1 = new int[6];
      intArray1[0] = 0;
      intArray1[1] = 1485;
      intArray1[2] = 1592;
      intArray1[3] = (-4012);
      intArray1[4] = (-4012);
      intArray1[5] = 1592;
      CharClass charClass2 = charClass1.appendNegatedClass(intArray1);
      assertSame(charClass2, charClass0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = 2013;
      intArray0[1] = 2708;
      intArray0[2] = 1807;
      intArray0[3] = 0;
      intArray0[4] = (-1873);
      int int0 = 255;
      intArray0[5] = 255;
      intArray0[6] = 0;
      intArray0[7] = (-1008);
      intArray0[8] = 432;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[7][4];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      int[] intArray2 = new int[6];
      intArray2[0] = (-1008);
      intArray2[1] = 2708;
      intArray2[2] = (-1008);
      intArray2[3] = 255;
      intArray2[4] = 255;
      intArray2[5] = (-1873);
      intArray1[3] = intArray2;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      // Undeclared exception!
      charClass0.appendNegatedTable(intArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-835);
      intArray0[1] = (-121);
      intArray0[2] = 837;
      intArray0[3] = 552;
      intArray0[4] = 0;
      intArray0[5] = 2531;
      intArray0[6] = (-3805);
      intArray0[7] = 1768;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendClassWithSign(intArray0, (-121));
      CharClass charClass2 = charClass1.appendLiteral(0, 2531);
      charClass2.cleanClass();
      int[][] intArray1 = new int[8][5];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      int[] intArray2 = new int[5];
      intArray2[0] = 552;
      intArray2[1] = 0;
      intArray2[2] = 552;
      intArray2[3] = (-2456);
      intArray2[4] = (-4986);
      intArray1[2] = intArray2;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      int[] intArray3 = new int[4];
      intArray3[0] = (-2456);
      intArray3[1] = (-4986);
      intArray3[2] = (-2456);
      intArray3[3] = 552;
      intArray1[5] = intArray3;
      intArray1[6] = intArray0;
      intArray1[7] = intArray0;
      // Undeclared exception!
      charClass2.appendTableWithSign(intArray1, (-2456));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.cleanClass();
      CharClass charClass2 = charClass1.negateClass();
      int int0 = 66639;
      int[][] intArray0 = new int[9][4];
      int[] intArray1 = new int[7];
      intArray1[0] = 66639;
      intArray1[1] = 66639;
      intArray1[2] = 66639;
      intArray1[3] = 66639;
      intArray1[4] = 66639;
      intArray1[5] = 66639;
      intArray1[6] = 66639;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[2];
      intArray2[0] = 66639;
      intArray2[1] = 66639;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[9];
      intArray3[0] = 66639;
      intArray3[1] = 66639;
      intArray3[2] = 66639;
      intArray3[3] = 66639;
      intArray3[4] = 66639;
      intArray3[5] = 6379;
      intArray3[6] = 66639;
      intArray3[7] = 66639;
      intArray3[8] = 66639;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[2];
      intArray4[0] = 6379;
      intArray4[1] = 66639;
      intArray0[3] = intArray4;
      int[] intArray5 = new int[6];
      intArray5[0] = 6379;
      intArray5[1] = 6379;
      intArray5[2] = 66639;
      intArray5[3] = 6379;
      intArray5[4] = 66639;
      intArray5[5] = 6379;
      intArray0[4] = intArray5;
      int[] intArray6 = new int[6];
      intArray6[0] = 6379;
      intArray6[1] = 6379;
      intArray6[2] = 66639;
      intArray6[3] = 66639;
      intArray6[4] = 66639;
      intArray6[5] = 66639;
      intArray0[5] = intArray6;
      int[] intArray7 = new int[3];
      intArray7[0] = 6379;
      intArray7[1] = 66639;
      intArray7[2] = 66639;
      intArray0[6] = intArray7;
      int[] intArray8 = new int[9];
      intArray8[0] = 66639;
      intArray8[1] = 66639;
      intArray8[2] = 66639;
      intArray8[3] = 6379;
      intArray8[4] = 66639;
      intArray8[5] = 6379;
      intArray8[6] = 66639;
      intArray8[7] = 66639;
      intArray8[8] = 6379;
      intArray0[7] = intArray8;
      int[] intArray9 = new int[2];
      intArray9[0] = 209;
      intArray9[1] = 66639;
      intArray0[8] = intArray9;
      // Undeclared exception!
      try { 
        charClass2.appendTableWithSign(intArray0, 66639);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[1][2];
      int[] intArray1 = new int[6];
      intArray1[0] = 2970;
      intArray1[1] = (-350);
      intArray1[2] = 3622;
      intArray1[3] = (-96);
      intArray1[4] = 625;
      intArray1[5] = 1378;
      intArray0[0] = intArray1;
      CharClass charClass1 = charClass0.appendTableWithSign(intArray0, (-350));
      CharClass charClass2 = charClass1.appendFoldedClass(intArray1);
      CharClass charClass3 = charClass2.appendClassWithSign(intArray1, 66639);
      CharClass charClass4 = charClass3.appendTable(intArray0);
      CharClass charClass5 = charClass4.appendFoldedClass(intArray1);
      charClass5.appendNegatedClass(intArray1);
      charClass5.appendTable(intArray0);
      charClass5.appendNegatedTable(intArray0);
      charClass4.appendRange((-350), (-96));
      charClass2.appendClass(intArray1);
      charClass4.appendNegatedTable(intArray0);
      CharClass charClass6 = charClass1.appendFoldedRange((-1), (-350));
      CharClass charClass7 = charClass2.negateClass();
      charClass1.negateClass();
      CharClass charClass8 = charClass4.cleanClass();
      String string0 = charClass7.toString();
      assertEquals("[0x1a9 0x244-0x245 0x271-0x10ffff]", string0);
      
      charClass6.appendFoldedClass(intArray1);
      charClass3.negateClass();
      charClass0.toString();
      charClass5.negateClass();
      int[] intArray2 = charClass8.toArray();
      assertEquals(82, intArray2.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-2022);
      intArray0[1] = (-4611);
      intArray0[2] = (-8352137);
      intArray0[3] = 66639;
      intArray0[4] = (-652086);
      intArray0[5] = (-8339610);
      intArray0[6] = (-250);
      intArray0[7] = 64;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendClass(intArray0);
      int[][] intArray1 = new int[9][6];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      int[] intArray2 = new int[5];
      intArray2[0] = (-8339610);
      intArray2[1] = (-8352137);
      intArray2[2] = 66639;
      intArray2[3] = (-8352137);
      intArray2[4] = (-250);
      intArray1[3] = intArray2;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      intArray1[7] = intArray0;
      intArray1[8] = intArray0;
      CharClass charClass2 = charClass1.appendNegatedTable(intArray1);
      // Undeclared exception!
      try { 
        charClass2.appendNegatedClass(intArray2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[1];
      int int0 = (-2315);
      intArray0[0] = (-2315);
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[5][6];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      // Undeclared exception!
      try { 
        charClass0.appendClass(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = (-8347125);
      intArray0[1] = 1651;
      intArray0[2] = 66639;
      intArray0[3] = (-2587);
      String string0 = CharClass.charClassToString(intArray0, (-2587));
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = 3805;
      intArray0[1] = 580;
      intArray0[2] = 119156;
      intArray0[3] = (-383);
      intArray0[4] = 1768;
      intArray0[5] = (-8352137);
      intArray0[6] = 193;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[4][5];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      CharClass charClass1 = charClass0.appendTable(intArray1);
      CharClass charClass2 = charClass1.appendTableWithSign(intArray1, 3805);
      CharClass charClass3 = charClass2.appendFoldedRange((-1663), (-8347125));
      CharClass charClass4 = charClass3.appendLiteral((-4084), 2993);
      // Undeclared exception!
      try { 
        charClass4.appendClassWithSign(intArray0, (-685));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-555);
      intArray0[1] = 66640;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendLiteral(66640, 66640);
      CharClass charClass2 = charClass1.appendFoldedRange(4369, 4371);
      CharClass charClass3 = charClass2.negateClass();
      CharClass charClass4 = charClass3.appendFoldedClass(intArray0);
      CharClass charClass5 = charClass4.appendClass(intArray0);
      int[][] intArray1 = new int[8][6];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      int[] intArray2 = new int[1];
      charClass4.appendFoldedRange(4, 93);
      intArray2[0] = 4371;
      intArray1[2] = intArray2;
      intArray1[3] = intArray0;
      int[] intArray3 = new int[2];
      intArray3[0] = (-555);
      intArray3[1] = 4371;
      intArray1[4] = intArray3;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      intArray1[7] = intArray0;
      // Undeclared exception!
      try { 
        charClass5.appendTableWithSign(intArray1, 4371);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = 7777;
      int int0 = 1114111;
      intArray0[1] = 1114111;
      intArray0[2] = 110;
      intArray0[3] = (-848);
      intArray0[4] = 43699;
      CharClass charClass0 = new CharClass(intArray0);
      // Undeclared exception!
      try { 
        charClass0.appendClassWithSign(intArray0, 1313);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }
}
