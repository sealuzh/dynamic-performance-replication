/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 10:59:54 GMT 2018
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
      int[] intArray0 = new int[2];
      int int0 = (-444);
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.appendNegatedClass(intArray0);
      CharClass charClass1 = charClass0.negateClass();
      int[][] intArray1 = new int[1][9];
      intArray1[0] = intArray0;
      // Undeclared exception!
      try { 
        charClass1.appendTable(intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[0];
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendFoldedRange(1043, 1043);
      assertSame(charClass0, charClass1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[3];
      CharClass charClass0 = new CharClass();
      // Undeclared exception!
      try { 
        charClass0.appendClassWithSign(intArray0, 1976);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[2];
      int[][] intArray1 = new int[1][9];
      intArray1[0] = intArray0;
      CharClass charClass0 = new CharClass(intArray0);
      int[] intArray2 = new int[1];
      intArray2[0] = (-1397);
      // Undeclared exception!
      try { 
        charClass0.appendClassWithSign(intArray2, (-1397));
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
      int[] intArray0 = new int[4];
      intArray0[0] = 8596;
      intArray0[1] = 1291;
      intArray0[2] = 0;
      intArray0[3] = 0;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[4][9];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      CharClass charClass1 = charClass0.appendTable(intArray1);
      assertSame(charClass0, charClass1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[10];
      charClass0.negateClass();
      charClass0.toString();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[6];
      charClass0.appendRange(0, 0);
      charClass0.negateClass();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int int0 = 71;
      CharClass charClass1 = charClass0.appendFoldedRange(2, 71);
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        charClass1.appendClass(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[8];
      charClass0.appendNegatedClass(intArray0);
      CharClass charClass1 = charClass0.cleanClass();
      charClass1.toArray();
      int[][] intArray1 = new int[0][0];
      charClass0.appendNegatedTable(intArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[6];
      CharClass charClass1 = charClass0.negateClass();
      charClass1.negateClass();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 8607;
      int[][] intArray1 = new int[2][6];
      int[] intArray2 = new int[4];
      intArray2[0] = 8607;
      intArray2[1] = 8607;
      intArray2[2] = 8607;
      intArray2[3] = 8607;
      intArray1[0] = intArray2;
      intArray1[1] = intArray0;
      int[][] intArray3 = new int[0][8];
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendTableWithSign(intArray1, 8607);
      // Undeclared exception!
      try { 
        charClass1.appendGroup((CharGroup) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 917537;
      intArray0[1] = 807;
      intArray0[2] = (-1);
      intArray0[3] = 1251;
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.negateClass();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[1] = (-2430);
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.cleanClass();
      charClass1.appendFoldedRange(32, (-2430));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 8596;
      intArray0[1] = 1291;
      intArray0[2] = 1291;
      intArray0[3] = 8596;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[3][9];
      charClass0.cleanClass();
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      charClass0.appendNegatedClass(intArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[2] = 0;
      intArray0[3] = 0;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[4][9];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      charClass0.toString();
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      charClass0.negateClass();
      charClass0.toArray();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[1] = 0;
      intArray0[2] = 2574;
      intArray0[3] = 2011;
      intArray0[5] = (-3548);
      intArray0[6] = (-2278);
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendClassWithSign(intArray0, (-3548));
      CharClass charClass2 = charClass1.appendClass(intArray0);
      int[][] intArray1 = new int[7][3];
      int[] intArray2 = new int[1];
      intArray2[0] = (-2278);
      intArray1[1] = intArray2;
      intArray1[2] = intArray0;
      CharClass charClass3 = charClass0.appendClass(intArray0);
      CharClass charClass4 = charClass2.appendFoldedRange(0, (-2278));
      charClass1.appendLiteral(2011, 0);
      charClass4.cleanClass();
      charClass3.toArray();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = (-444);
      intArray0[1] = 2;
      intArray0[2] = 1;
      intArray0[3] = 10181;
      intArray0[4] = 2543;
      intArray0[5] = 2012;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendLiteral(6439, 1);
      CharClass charClass2 = charClass1.cleanClass();
      int[][] intArray1 = new int[2][2];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      charClass2.appendNegatedTable(intArray1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 615;
      intArray0[1] = (-1446);
      intArray0[2] = 1163;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[6][2];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      int[] intArray2 = new int[0];
      intArray1[3] = intArray2;
      intArray1[4] = intArray0;
      intArray1[5] = intArray0;
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
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-1217);
      intArray0[1] = (-1217);
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.toArray();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[8];
      int[] intArray1 = new int[1];
      intArray1[0] = 611;
      CharClass charClass1 = charClass0.cleanClass();
      charClass1.cleanClass();
      charClass0.toString();
      charClass0.appendLiteral(611, 611);
      charClass0.cleanClass();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[0];
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.appendLiteral(902, (-1217));
      charClass0.appendRange(902, (-1217));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.negateClass();
      CharClass charClass2 = charClass1.appendRange(1702, 1702);
      CharClass charClass3 = charClass2.appendLiteral(440, 440);
      charClass0.appendRange(440, 619);
      charClass0.appendFoldedRange((-17), 917536);
      charClass3.toString();
      // Undeclared exception!
      try { 
        charClass1.appendGroup((CharGroup) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      intArray0[1] = 1646;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[0][1];
      CharClass charClass1 = charClass0.appendNegatedTable(intArray1);
      CharClass charClass2 = charClass1.appendNegatedClass(intArray0);
      CharClass charClass3 = charClass2.cleanClass();
      int[] intArray2 = new int[1];
      intArray2[0] = 1646;
      // Undeclared exception!
      try { 
        charClass3.appendClass(intArray2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[2][6];
      int[] intArray1 = new int[4];
      intArray1[0] = 8639;
      intArray1[1] = 8639;
      intArray1[2] = 1702;
      intArray0[0] = intArray1;
      charClass0.appendNegatedTable(intArray0);
      CharClass charClass1 = charClass0.appendTableWithSign(intArray0, intArray1[2]);
      CharClass charClass2 = charClass1.appendNegatedClass(intArray0[0]);
      CharClass charClass3 = new CharClass();
      charClass2.negateClass();
      int int0 = 64;
      CharClass.charClassToString(intArray1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 3026;
      intArray0[1] = 0;
      intArray0[2] = 4;
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.appendFoldedRange(1114111, 8717);
      // Undeclared exception!
      try { 
        charClass0.appendNegatedClass(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = 0;
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      CharClass charClass2 = charClass1.cleanClass();
      int[][] intArray1 = new int[2][6];
      CharClass charClass3 = charClass2.appendFoldedClass(intArray0);
      int[] intArray2 = new int[4];
      intArray2[0] = 66639;
      intArray2[1] = 66639;
      intArray2[2] = 66639;
      intArray1[0] = intArray2;
      intArray1[1] = intArray2;
      CharClass charClass4 = charClass2.appendFoldedRange(66639, 0);
      CharClass charClass5 = charClass4.appendTable(intArray1);
      CharClass charClass6 = charClass0.appendTableWithSign(intArray1, 66639);
      CharClass charClass7 = new CharClass();
      charClass6.appendTable(intArray1);
      CharClass charClass8 = charClass3.appendLiteral(196, 196);
      CharClass charClass9 = new CharClass(intArray2);
      charClass6.appendFoldedClass(intArray2);
      charClass4.appendFoldedClass(intArray2);
      charClass8.appendClass(intArray2);
      charClass4.appendClass(intArray2);
      CharClass charClass10 = charClass1.appendNegatedTable(intArray1);
      CharClass charClass11 = charClass2.negateClass();
      charClass5.appendTableWithSign(intArray1, (-1287));
      CharClass charClass12 = charClass11.appendTableWithSign(intArray1, 66639);
      charClass7.appendClassWithSign(intArray0, 66639);
      charClass10.negateClass();
      charClass1.toArray();
      charClass12.appendFoldedRange(66639, 119938);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 8706;
      intArray0[1] = 1;
      int[][] intArray1 = new int[2][6];
      int[] intArray2 = new int[4];
      intArray2[0] = 8706;
      intArray2[1] = 8706;
      intArray2[2] = 1;
      intArray1[0] = intArray2;
      intArray1[1] = intArray2;
      CharClass charClass0 = new CharClass();
      charClass0.appendNegatedTable(intArray1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int[][] intArray0 = new int[2][6];
      int[] intArray1 = new int[4];
      intArray1[2] = 1;
      intArray0[0] = intArray1;
      intArray0[1] = intArray1;
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendNegatedTable(intArray0);
      charClass1.appendTable(intArray0);
      charClass0.appendClass(intArray1);
  }
}