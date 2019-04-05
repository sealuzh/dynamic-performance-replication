/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 12:52:07 GMT 2019
 */

package com.google.re2j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.re2j.CharClass;
import com.google.re2j.CharGroup;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CharClass_ESTest extends CharClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = 3205;
      intArray0[1] = 1015480;
      intArray0[2] = 1;
      intArray0[3] = (-1039);
      intArray0[4] = 660;
      intArray0[5] = 66640;
      intArray0[6] = 43061;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[8][4];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      intArray1[7] = intArray0;
      CharClass charClass1 = charClass0.appendTableWithSign(intArray1, (-1039));
      // Undeclared exception!
      charClass1.appendFoldedClass(intArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 2;
      intArray0[1] = 960;
      intArray0[2] = 1114111;
      intArray0[3] = 480;
      intArray0[4] = (-2);
      intArray0[5] = 11631;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[5][1];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      CharClass charClass1 = charClass0.appendNegatedTable(intArray1);
      CharClass charClass2 = charClass1.appendTableWithSign(intArray1, 11076);
      CharClass charClass3 = charClass2.appendClass(intArray0);
      CharClass charClass4 = charClass3.appendNegatedClass(intArray0);
      CharClass charClass5 = charClass4.cleanClass();
      charClass5.appendClassWithSign(intArray0, 545);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[7][8];
      int[] intArray1 = new int[8];
      intArray1[0] = (-3033);
      intArray1[1] = 11784;
      intArray1[2] = 1;
      intArray1[3] = (-3966);
      intArray1[4] = 1397;
      intArray1[5] = 91;
      intArray1[6] = 4447;
      intArray1[7] = 2651;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[7];
      intArray2[0] = 2651;
      intArray2[1] = 11784;
      intArray2[2] = 91;
      intArray2[3] = 11784;
      intArray2[4] = (-3033);
      intArray2[5] = 11784;
      intArray2[6] = (-3033);
      intArray0[1] = intArray2;
      int[] intArray3 = new int[1];
      intArray3[0] = 91;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[9];
      intArray4[0] = 11784;
      intArray4[1] = 1397;
      intArray4[2] = 1;
      intArray4[3] = (-3033);
      intArray4[4] = (-3966);
      intArray4[5] = 1;
      intArray4[6] = 4447;
      intArray4[7] = 1;
      intArray4[8] = 11784;
      intArray0[3] = intArray4;
      int[] intArray5 = new int[5];
      intArray5[0] = 91;
      intArray5[1] = 4447;
      intArray5[2] = 11784;
      intArray5[3] = (-3966);
      intArray5[4] = (-3966);
      intArray0[4] = intArray5;
      int[] intArray6 = new int[2];
      intArray6[0] = 91;
      intArray6[1] = (-3033);
      intArray0[5] = intArray6;
      int[] intArray7 = new int[3];
      intArray7[0] = (-3966);
      intArray7[1] = 91;
      intArray7[2] = (-3966);
      intArray0[6] = intArray7;
      // Undeclared exception!
      try { 
        charClass0.appendTableWithSign(intArray0, 787);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[6];
      int int0 = 3070;
      intArray0[0] = 3070;
      intArray0[1] = 4;
      intArray0[2] = (-1198);
      int int1 = (-1014);
      intArray0[3] = (-1014);
      int int2 = (-2);
      intArray0[4] = (-2);
      intArray0[5] = 2835;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      int[][] intArray1 = new int[4][4];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      CharClass charClass2 = charClass1.appendFoldedClass(intArray0);
      int int3 = 2417;
      charClass2.appendClassWithSign(intArray0, 2417);
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      CharClass charClass3 = charClass1.appendTableWithSign(intArray1, (-1014));
      charClass3.appendLiteral((-1014), (-1198));
      CharGroup charGroup0 = null;
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        charClass3.appendGroup((CharGroup) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = (-945);
      intArray0[1] = (-655);
      intArray0[2] = 64;
      intArray0[3] = (-1);
      intArray0[4] = 32;
      intArray0[5] = 8697;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[6][1];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      CharClass charClass1 = charClass0.appendTableWithSign(intArray1, (-1781));
      CharClass charClass2 = charClass1.negateClass();
      charClass2.appendNegatedTable(intArray1);
      assertArrayEquals(new int[] {(-945), (-655), 64, (-1), 32, 8697}, intArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[2];
      intArray0[0] = 6;
      intArray0[1] = 65376;
      CharClass charClass1 = charClass0.appendClassWithSign(intArray0, (-2579));
      CharClass charClass2 = charClass1.appendLiteral(6, 65376);
      CharClass charClass3 = charClass2.appendRange(49, 6);
      CharClass charClass4 = charClass3.cleanClass();
      int[] intArray1 = charClass4.toArray();
      assertArrayEquals(new int[] {0, 6, 49, 6, 65377, 1114111}, intArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = charClass0.toArray();
      int[][] intArray1 = new int[1][8];
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      int[][] intArray2 = new int[2][0];
      intArray2[0] = intArray0;
      intArray2[1] = intArray0;
      // Undeclared exception!
      try { 
        charClass1.appendTableWithSign(intArray2, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int int0 = 1114111;
      int int1 = 8184;
      CharClass charClass1 = charClass0.appendFoldedRange(1114111, 8184);
      int[] intArray0 = new int[4];
      intArray0[0] = 1114111;
      intArray0[1] = 1114111;
      intArray0[2] = 8184;
      intArray0[3] = 1114111;
      // Undeclared exception!
      charClass1.appendFoldedClass(intArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[0];
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendClass(intArray0);
      CharClass charClass2 = charClass1.appendFoldedClass(intArray0);
      CharClass charClass3 = charClass2.appendNegatedClass(intArray0);
      CharClass charClass4 = charClass3.appendClassWithSign(intArray0, (-3279));
      int[][] intArray1 = new int[2][8];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      // Undeclared exception!
      try { 
        charClass4.appendNegatedTable(intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-1);
      int int0 = 0;
      intArray0[1] = 0;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[6][6];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      int[] intArray2 = new int[3];
      int int1 = 2;
      intArray2[0] = 2;
      charClass0.appendFoldedClass(intArray0);
      intArray2[1] = 0;
      intArray2[2] = 0;
      intArray1[2] = intArray2;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      // Undeclared exception!
      try { 
        charClass0.appendTable(intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[0];
      CharClass charClass0 = new CharClass(intArray0);
      int[] intArray1 = new int[9];
      intArray1[0] = (-3366);
      intArray1[1] = 1257;
      intArray1[2] = 3298;
      intArray1[3] = 760;
      intArray1[4] = 65;
      intArray1[5] = 372;
      intArray1[6] = (-103);
      intArray1[7] = (-725);
      intArray1[8] = (-523);
      // Undeclared exception!
      try { 
        charClass0.appendClass(intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[7][7];
      int[] intArray1 = new int[9];
      intArray1[0] = 1503;
      intArray1[1] = (-695);
      intArray1[2] = (-477);
      intArray1[3] = 3844;
      intArray1[4] = (-473);
      intArray1[5] = 0;
      intArray1[6] = 65;
      intArray1[7] = 3198;
      intArray1[8] = 294;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[1];
      intArray2[0] = 3198;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[9];
      intArray3[0] = 3198;
      intArray3[1] = 133;
      intArray3[2] = 0;
      intArray3[3] = 65;
      intArray3[4] = 0;
      intArray3[5] = 3844;
      intArray3[6] = (-477);
      intArray3[7] = (-473);
      intArray3[8] = 3198;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[8];
      intArray4[0] = (-473);
      intArray4[1] = (-477);
      intArray4[2] = 65;
      intArray4[3] = 0;
      intArray4[4] = (-473);
      intArray4[5] = 0;
      intArray4[6] = (-477);
      intArray4[7] = 294;
      intArray0[3] = intArray4;
      int[] intArray5 = new int[6];
      intArray5[0] = 1503;
      intArray5[1] = (-477);
      intArray5[2] = 65;
      intArray5[3] = 133;
      intArray5[4] = (-473);
      intArray5[5] = 64;
      intArray0[4] = intArray5;
      int[] intArray6 = new int[7];
      intArray6[0] = 64;
      intArray6[1] = 803;
      intArray6[2] = (-695);
      intArray6[3] = 133;
      intArray6[4] = 3198;
      intArray6[5] = 0;
      intArray6[6] = (-473);
      intArray0[5] = intArray6;
      int[] intArray7 = new int[2];
      intArray7[0] = (-477);
      intArray7[1] = (-695);
      intArray0[6] = intArray7;
      // Undeclared exception!
      try { 
        charClass0.appendNegatedTable(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 0;
      intArray0[1] = (-2727);
      int int0 = 120546;
      intArray0[2] = 120546;
      intArray0[3] = (-494);
      intArray0[4] = 741;
      intArray0[5] = 4333;
      intArray0[6] = 2561;
      intArray0[7] = 91;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArrayArray0 = null;
      // Undeclared exception!
      try { 
        charClass0.appendTable((int[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 0;
      int int0 = (-163);
      intArray0[1] = (-163);
      intArray0[2] = 0;
      CharClass charClass0 = new CharClass(intArray0);
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
  public void test14()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int int0 = 0;
      CharClass charClass1 = charClass0.appendRange((-880), 0);
      CharClass charClass2 = charClass1.cleanClass();
      int[] intArray0 = new int[2];
      intArray0[0] = 0;
      charClass1.appendClassWithSign(intArray0, 0);
      CharClass charClass3 = charClass0.cleanClass();
      intArray0[1] = 0;
      CharClass charClass4 = charClass2.appendNegatedClass(intArray0);
      CharClass charClass5 = charClass4.appendClassWithSign(intArray0, 0);
      charClass5.toString();
      charClass2.appendFoldedClass(intArray0);
      charClass5.appendFoldedClass(intArray0);
      int int1 = 116;
      CharClass charClass6 = charClass3.appendNegatedClass(intArray0);
      charClass6.appendRange(0, 116);
      // Undeclared exception!
      try { 
        CharClass.charClassToString(intArray0, 64);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[6];
      intArray0[0] = 0;
      intArray0[1] = (-1440);
      int int0 = 0;
      intArray0[2] = 0;
      int int1 = 73;
      intArray0[3] = 73;
      int int2 = 76;
      intArray0[4] = 76;
      int int3 = 0;
      intArray0[5] = 0;
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      int[] intArray1 = new int[5];
      intArray1[0] = 0;
      intArray1[1] = 0;
      intArray1[2] = 73;
      intArray1[3] = 76;
      intArray1[4] = (-1440);
      // Undeclared exception!
      try { 
        charClass1.appendNegatedClass(intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 581;
      intArray0[1] = (-2113);
      intArray0[2] = 3090;
      intArray0[3] = 2039;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[5][9];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      CharClass charClass1 = charClass0.appendTable(intArray1);
      CharClass charClass2 = charClass1.appendNegatedClass(intArray0);
      CharClass charClass3 = charClass2.appendTableWithSign(intArray1, (-2113));
      CharClass charClass4 = charClass3.appendFoldedClass(intArray0);
      CharClass charClass5 = charClass4.appendClass(intArray0);
      charClass5.appendRange(3096, 0);
      assertArrayEquals(new int[] {581, (-2113), 3090, 2039}, intArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendFoldedRange(2, 502);
      CharClass charClass2 = charClass1.cleanClass();
      int[] intArray0 = new int[0];
      int int0 = 883;
      charClass2.appendClassWithSign(intArray0, 883);
      int[] intArray1 = new int[4];
      intArray1[0] = 502;
      intArray1[1] = 2;
      intArray1[2] = 502;
      intArray1[3] = 2;
      CharClass charClass3 = charClass2.appendFoldedClass(intArray1);
      charClass3.appendFoldedRange(2, 502);
      charClass3.toString();
      charClass1.negateClass();
      charClass2.toString();
      int[][] intArray2 = new int[8][1];
      intArray2[0] = intArray1;
      intArray2[1] = intArray1;
      intArray2[2] = intArray0;
      intArray2[3] = intArray1;
      intArray2[4] = intArray0;
      intArray2[5] = intArray0;
      intArray2[6] = intArray0;
      intArray2[7] = intArray0;
      int int1 = 1714;
      int[] intArray3 = new int[7];
      intArray3[0] = 1714;
      intArray3[1] = 883;
      intArray3[2] = 1714;
      intArray3[3] = 1714;
      intArray3[4] = 502;
      intArray3[5] = 883;
      intArray3[6] = 883;
      // Undeclared exception!
      try { 
        charClass0.appendClassWithSign(intArray3, 502);
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
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[8];
      intArray0[0] = 11503;
      int int0 = (-2);
      intArray0[1] = (-2);
      intArray0[2] = 1092;
      intArray0[3] = 442;
      intArray0[4] = (-268);
      intArray0[5] = 2666;
      intArray0[6] = (-426);
      intArray0[7] = 506;
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      int[][] intArray1 = new int[7][4];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      int[] intArray2 = new int[8];
      intArray2[0] = 1092;
      intArray2[1] = 506;
      intArray2[2] = (-426);
      intArray2[3] = (-2);
      intArray2[4] = (-426);
      intArray2[5] = 2666;
      intArray2[6] = 11503;
      intArray2[7] = 2666;
      intArray1[2] = intArray2;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      CharClass charClass2 = charClass1.appendNegatedTable(intArray1);
      // Undeclared exception!
      charClass2.appendFoldedClass(intArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[6][7];
      int[] intArray1 = new int[9];
      intArray1[0] = (-3887);
      intArray1[1] = 2615;
      intArray1[2] = 2694;
      intArray1[3] = 1495;
      intArray1[4] = 2670;
      intArray1[5] = 2692;
      intArray1[6] = (-2579);
      intArray1[7] = 1445;
      intArray1[8] = 2699;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[5];
      intArray2[0] = 2699;
      intArray2[1] = (-2579);
      intArray2[2] = 2692;
      intArray2[3] = 2694;
      intArray2[4] = 2670;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[0];
      intArray0[2] = intArray3;
      int[] intArray4 = new int[0];
      intArray0[3] = intArray4;
      int[] intArray5 = new int[5];
      intArray5[0] = 2694;
      intArray5[1] = 2694;
      intArray5[2] = 1495;
      intArray5[3] = 1495;
      intArray5[4] = 91;
      intArray0[4] = intArray5;
      int[] intArray6 = new int[8];
      intArray6[0] = 1495;
      intArray6[1] = 2670;
      intArray6[2] = 1445;
      intArray6[3] = 2670;
      intArray6[4] = 2699;
      intArray6[5] = 2670;
      intArray6[6] = 2699;
      intArray6[7] = (-3887);
      intArray0[5] = intArray6;
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
  public void test20()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = charClass0.toArray();
      int[][] intArray1 = new int[1][2];
      CharClass charClass1 = charClass0.appendClassWithSign(intArray0, 1);
      // Undeclared exception!
      try { 
        charClass1.appendNegatedTable(intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = 1114111;
      intArray0[0] = 1114111;
      intArray0[1] = 2922;
      intArray0[2] = 2663;
      intArray0[3] = 1376;
      intArray0[4] = (-1);
      CharClass charClass0 = new CharClass(intArray0);
      int int1 = 2093;
      CharClass charClass1 = charClass0.appendRange(1376, 2093);
      CharClass charClass2 = charClass1.negateClass();
      // Undeclared exception!
      try { 
        charClass2.appendFoldedClass(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.cleanClass();
      int[][] intArray0 = new int[4][4];
      int[] intArray1 = new int[5];
      intArray1[0] = 2678;
      intArray1[1] = 2696;
      intArray1[2] = 2694;
      intArray1[3] = (-4387);
      intArray1[4] = 2665;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[2];
      intArray2[0] = 2696;
      intArray2[1] = 2678;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[0];
      intArray0[2] = intArray3;
      int[] intArray4 = new int[6];
      intArray4[0] = 2694;
      intArray4[1] = 2678;
      intArray4[2] = 2696;
      intArray4[3] = 528;
      intArray4[4] = 2694;
      intArray4[5] = 2678;
      intArray0[3] = intArray4;
      // Undeclared exception!
      try { 
        charClass1.appendTable(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendLiteral(1183, 1183);
      int[] intArray0 = new int[4];
      intArray0[1] = 1183;
      intArray0[2] = 1183;
      intArray0[3] = 1183;
      CharClass charClass2 = charClass1.appendClassWithSign(intArray0, 1183);
      charClass2.cleanClass();
      CharClass charClass3 = new CharClass();
      charClass3.appendLiteral(1183, 2674);
      // Undeclared exception!
      try { 
        CharClass.charClassToString(intArray0, 1183);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
