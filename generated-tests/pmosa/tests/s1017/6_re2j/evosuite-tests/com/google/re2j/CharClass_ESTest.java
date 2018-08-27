/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 12:27:32 GMT 2018
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
      int[] intArray0 = new int[8];
      intArray0[0] = (-262);
      intArray0[1] = 1848;
      intArray0[2] = 1938;
      intArray0[3] = (-2);
      intArray0[4] = 0;
      intArray0[5] = (-1499);
      intArray0[6] = (-1927);
      intArray0[7] = 6160;
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.appendLiteral(0, (-262));
      assertArrayEquals(new int[] {(-262), 1848, 1938, (-2), 0, (-1499), (-1927), 6160}, intArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.negateClass();
      CharClass charClass2 = charClass1.appendRange(1051, 65);
      assertSame(charClass0, charClass2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendLiteral((-650), 119999);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = 0;
      intArray0[1] = (-136);
      intArray0[2] = 0;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[1][5];
      intArray1[0] = intArray0;
      charClass0.appendNegatedTable(intArray1);
      assertArrayEquals(new int[] {0, (-136), 0, 0, 1114111}, intArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[0][4];
      CharClass charClass1 = charClass0.appendNegatedTable(intArray0);
      CharClass charClass2 = charClass1.appendTable(intArray0);
      assertSame(charClass0, charClass2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[7];
      intArray0[0] = 556;
      intArray0[1] = (-1569);
      intArray0[2] = 0;
      intArray0[3] = (-10);
      intArray0[4] = (-921);
      intArray0[5] = 0;
      intArray0[6] = 0;
      // Undeclared exception!
      try { 
        charClass0.appendClass(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-216);
      CharClass charClass0 = new CharClass(intArray0);
      // Undeclared exception!
      try { 
        charClass0.appendClassWithSign(intArray0, 920);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendFoldedRange(404, 225);
      assertSame(charClass0, charClass1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendFoldedRange((-237), 0);
      CharClass charClass2 = charClass1.cleanClass();
      CharClass charClass3 = charClass2.appendLiteral(2709, 2709);
      int[] intArray0 = new int[9];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 0;
      intArray0[4] = 2709;
      intArray0[5] = (-237);
      intArray0[6] = 2709;
      intArray0[7] = (-237);
      intArray0[8] = (-237);
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
  public void test09()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendLiteral(693, 693);
      charClass1.toString();
      // Undeclared exception!
      try { 
        charClass0.appendGroup((CharGroup) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[3];
      CharGroup charGroup0 = null;
      // Undeclared exception!
      try { 
        charClass0.appendClassWithSign(intArray0, (-1405));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.cleanClass();
      CharClass charClass2 = charClass1.negateClass();
      assertSame(charClass0, charClass2);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.negateClass();
      int[] intArray0 = new int[9];
      intArray0[0] = 0;
      intArray0[1] = 75;
      intArray0[2] = 0;
      int int0 = 0;
      intArray0[3] = 0;
      int int1 = 0;
      intArray0[4] = 0;
      intArray0[5] = (-3177);
      intArray0[6] = (-2);
      intArray0[7] = 0;
      intArray0[8] = 78;
      // Undeclared exception!
      try { 
        charClass1.appendClass(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[1][5];
      int[] intArray1 = new int[3];
      intArray1[2] = 1266;
      intArray0[0] = intArray1;
      charClass0.appendNegatedTable(intArray0);
      // Undeclared exception!
      try { 
        charClass0.appendGroup((CharGroup) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 0;
      int int0 = 0;
      intArray0[1] = 0;
      int int1 = (-2728);
      intArray0[2] = (-2728);
      intArray0[3] = (-2311);
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendClass(intArray0);
      int[][] intArray1 = new int[9][3];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      intArray1[7] = intArray0;
      int[] intArray2 = new int[4];
      CharClass charClass2 = charClass0.appendNegatedTable(intArray1);
      int int2 = 9216;
      charClass2.appendTableWithSign(intArray1, int2);
      int int3 = 66045;
      charClass1.appendRange(intArray0[2], int3);
      intArray2[0] = int0;
      int int4 = 3396;
      intArray2[1] = int4;
      intArray2[2] = int0;
      intArray2[3] = int1;
      intArray1[8] = intArray2;
      CharClass charClass3 = charClass1.appendNegatedTable(intArray1);
      int int5 = 0;
      charClass3.appendLiteral(int5, int0);
      int int6 = 29;
      charClass0.appendClassWithSign(intArray1[3], int6);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[0];
      CharClass charClass1 = charClass0.appendFoldedClass(intArray0);
      assertSame(charClass0, charClass1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[2];
      int int0 = 0;
      intArray0[0] = 0;
      intArray0[1] = (-3441);
      CharClass charClass1 = charClass0.appendFoldedClass(intArray0);
      int int1 = 167;
      CharClass charClass2 = charClass1.appendFoldedRange(0, 167);
      int[][] intArray1 = new int[2][6];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      // Undeclared exception!
      try { 
        charClass2.appendTableWithSign(intArray1, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      // Undeclared exception!
      try { 
        charClass0.appendTableWithSign((int[][]) null, 32);
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
      int[] intArray0 = new int[7];
      intArray0[0] = 2247;
      int int0 = 4;
      intArray0[1] = 4;
      intArray0[2] = 43443;
      int int1 = 2124;
      intArray0[3] = 2124;
      intArray0[4] = (-2);
      int int2 = (-2949);
      intArray0[5] = (-2949);
      int int3 = 1304;
      intArray0[6] = 1304;
      int int4 = (-1235);
      CharClass.charClassToString(intArray0, (-1235));
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.negateClass();
      // Undeclared exception!
      try { 
        charClass1.appendNegatedClass(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[0];
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      CharClass charClass2 = charClass0.negateClass();
      assertSame(charClass2, charClass1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = (-1796);
      intArray0[1] = 1839;
      intArray0[2] = 1157;
      intArray0[3] = 4;
      intArray0[4] = 65;
      intArray0[5] = 0;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      CharClass charClass2 = charClass1.appendClass(intArray0);
      int[][] intArray1 = new int[8][5];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      int[] intArray2 = new int[5];
      intArray2[0] = (-1796);
      intArray2[1] = 0;
      intArray2[2] = 1839;
      intArray2[3] = (-1796);
      intArray2[4] = 1157;
      intArray1[2] = intArray2;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      intArray1[7] = intArray0;
      CharClass charClass3 = charClass2.appendTableWithSign(intArray1, (-1796));
      CharClass charClass4 = charClass3.appendClassWithSign(intArray0, 0);
      CharClass charClass5 = charClass4.appendFoldedRange(1530, (-269));
      int[] intArray3 = new int[8];
      intArray3[0] = 1157;
      intArray3[1] = 4;
      intArray3[2] = (-269);
      intArray3[3] = 65;
      intArray3[4] = (-269);
      intArray3[5] = (-1796);
      intArray3[6] = 0;
      intArray3[7] = 4;
      charClass5.appendClassWithSign(intArray3, 277);
      assertArrayEquals(new int[] {(-1796), 1839, 1157, 4, 65, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[1][9];
      int[] intArray1 = new int[3];
      intArray1[1] = (-557);
      intArray1[2] = (-557);
      intArray0[0] = intArray1;
      CharClass charClass1 = charClass0.appendTableWithSign(intArray0, 1791);
      CharClass charClass2 = charClass0.negateClass();
      assertSame(charClass2, charClass1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[3][1];
      int[] intArray1 = new int[4];
      intArray1[0] = 2070;
      intArray1[1] = 3346;
      intArray1[2] = 0;
      intArray1[3] = 0;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[3];
      intArray2[0] = 3346;
      intArray2[1] = 0;
      intArray2[2] = 3346;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[5];
      intArray3[0] = 2070;
      intArray3[1] = (-1);
      intArray3[2] = 0;
      intArray3[3] = 3346;
      intArray3[4] = (-2158);
      intArray0[2] = intArray3;
      charClass0.appendTableWithSign(intArray0, 0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[4];
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.cleanClass();
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-606);
      intArray0[1] = (-867);
      intArray0[2] = 5024;
      intArray0[3] = 1984;
      intArray0[4] = 2;
      intArray0[5] = (-857);
      intArray0[6] = 79;
      intArray0[7] = 0;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendFoldedClass(intArray0);
      CharClass charClass2 = charClass1.cleanClass();
      CharClass charClass3 = charClass2.appendFoldedRange(2003, 79);
      CharClass charClass4 = charClass0.appendFoldedClass(intArray0);
      int[][] intArray1 = new int[2][9];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      charClass4.appendNegatedTable(intArray1);
      CharClass charClass5 = charClass3.appendFoldedClass(intArray0);
      charClass1.appendClass(intArray0);
      charClass5.appendFoldedClass(intArray0);
      assertArrayEquals(new int[] {(-606), (-867), 5024, 1984, 2, (-857), 79, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-333);
      int int0 = (-664);
      intArray0[1] = (-664);
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendRange((-333), (-333));
      CharClass charClass2 = charClass1.appendClassWithSign(intArray0, (-664));
      CharClass charClass3 = charClass2.appendClass(intArray0);
      CharClass charClass4 = charClass3.appendFoldedRange((-664), (-664));
      int[][] intArray1 = new int[9][5];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      charClass4.appendNegatedClass(intArray0);
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      intArray1[7] = intArray0;
      intArray1[8] = intArray0;
      // Undeclared exception!
      try { 
        charClass4.appendNegatedTable(intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-1112);
      intArray0[1] = (-540);
      intArray0[2] = 774;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 0;
      intArray0[6] = (-2293);
      intArray0[7] = (-1);
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendRange((-3833), 3760);
      CharClass charClass2 = charClass1.cleanClass();
      charClass2.cleanClass();
      assertArrayEquals(new int[] {(-3833), 3760, (-1112), (-540), 0, 0, 774, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 196;
      intArray0[1] = 0;
      intArray0[2] = 2691;
      intArray0[3] = 2081;
      intArray0[4] = 65;
      intArray0[5] = 43701;
      intArray0[6] = 0;
      intArray0[7] = (-400);
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendFoldedRange(2081, 196);
      CharClass charClass2 = charClass1.negateClass();
      charClass2.toArray();
      assertArrayEquals(new int[] {0, 195, 1, 2690, (-399), 1114111, 0, (-400)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = charClass0.toArray();
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 0;
      intArray0[1] = (-1538);
      intArray0[2] = 91;
      intArray0[3] = 1205;
      intArray0[4] = 0;
      intArray0[5] = 3239;
      intArray0[6] = 91;
      intArray0[7] = 1417;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendLiteral((-1538), 0);
      charClass1.toString();
      CharClass charClass2 = charClass0.cleanClass();
      charClass0.toArray();
      CharClass charClass3 = charClass2.appendRange((-1538), (-1538));
      assertSame(charClass3, charClass1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-2147);
      intArray0[1] = (-1798);
      intArray0[2] = 2041;
      intArray0[3] = 4;
      intArray0[4] = 920;
      intArray0[5] = 2834;
      intArray0[6] = 1631;
      intArray0[7] = (-10743);
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      int[][] intArray1 = new int[1][1];
      intArray1[0] = intArray0;
      CharClass charClass2 = charClass1.appendNegatedTable(intArray1);
      CharClass charClass3 = charClass2.appendFoldedRange(66639, (-1797));
      CharClass charClass4 = charClass3.appendTableWithSign(intArray1, 1502);
      int[] intArray2 = charClass4.toArray();
      int[] intArray3 = new int[6];
      intArray3[0] = (-1798);
      intArray3[1] = 920;
      intArray3[2] = (-2147);
      intArray3[3] = (-1798);
      intArray3[4] = 2041;
      intArray3[5] = 3013;
      charClass0.appendNegatedClass(intArray3);
      assertArrayEquals(new int[] {(-2147), (-1798), 2041, 4, (-1797), 2834, (-10742), 1114111}, intArray0);
      assertSame(intArray0, intArray2);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[1][5];
      int[] intArray1 = new int[3];
      intArray1[2] = 1;
      intArray0[0] = intArray1;
      charClass0.appendNegatedTable(intArray0);
      // Undeclared exception!
      try { 
        charClass0.appendGroup((CharGroup) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[5][6];
      int[] intArray1 = new int[9];
      intArray1[0] = 197;
      intArray1[1] = 2;
      intArray1[2] = 22;
      intArray1[3] = 611;
      intArray1[4] = (-775);
      intArray1[5] = 1114111;
      intArray1[6] = (-1554);
      intArray1[7] = 1;
      intArray1[8] = (-1472);
      intArray0[0] = intArray1;
      int[] intArray2 = new int[5];
      intArray2[0] = (-1554);
      intArray2[1] = 611;
      intArray2[2] = 2;
      intArray2[3] = 1;
      intArray2[4] = 197;
      intArray0[1] = intArray2;
      intArray0[2] = intArray1;
      int[] intArray3 = new int[3];
      intArray3[1] = 611;
      intArray3[2] = 1;
      intArray0[3] = intArray3;
      int[] intArray4 = new int[2];
      intArray4[0] = 22;
      intArray4[1] = 1114111;
      intArray0[4] = intArray4;
      charClass0.appendNegatedTable(intArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 66639;
      intArray0[1] = 66639;
      intArray0[2] = 66639;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.negateClass();
      charClass1.toString();
      CharClass charClass2 = new CharClass();
      charClass0.negateClass();
      int[][] intArray1 = new int[8][1];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
      intArray1[6] = intArray0;
      intArray1[7] = intArray0;
      charClass0.appendFoldedRange(0, 1);
      charClass0.appendNegatedTable(intArray1);
      CharClass charClass3 = charClass2.appendNegatedTable(intArray1);
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
}