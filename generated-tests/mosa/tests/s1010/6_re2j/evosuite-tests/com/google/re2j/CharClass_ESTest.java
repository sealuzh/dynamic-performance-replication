/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 01:54:32 GMT 2018
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
      int[] intArray0 = new int[4];
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendLiteral((-776), (-776));
      CharClass charClass2 = charClass1.appendFoldedClass(intArray0);
      assertSame(charClass0, charClass2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[4];
      intArray0[0] = 13007;
      charClass0.appendNegatedClass(intArray0);
      intArray0[3] = 13007;
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[4];
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendRange(127138, (-14117949));
      charClass0.appendClassWithSign(intArray0, (-14117949));
      CharClass charClass2 = charClass1.appendLiteral(127138, (-252));
      charClass2.negateClass();
      // Undeclared exception!
      try { 
        charClass0.appendGroup((CharGroup) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int int0 = 120703;
      int[] intArray0 = new int[7];
      intArray0[0] = 120703;
      CharClass charClass1 = charClass0.cleanClass();
      int[][] intArray1 = new int[4][0];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      // Undeclared exception!
      try { 
        charClass1.appendNegatedTable(intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[2][2];
      int[] intArray1 = new int[7];
      intArray1[1] = 120607;
      intArray1[2] = 120607;
      intArray1[5] = 120607;
      intArray0[0] = intArray1;
      CharClass charClass1 = new CharClass();
      // Undeclared exception!
      try { 
        charClass0.appendNegatedTable(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[1] = 970;
      CharClass.charClassToString(intArray0, 0);
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.appendFoldedClass(intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[4];
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.appendClassWithSign(intArray0, 64);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      charClass0.negateClass();
      charClass0.negateClass();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      charClass0.appendFoldedRange(11810, 11810);
      charClass0.negateClass();
      // Undeclared exception!
      try { 
        charClass0.appendGroup((CharGroup) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.cleanClass();
      int[] intArray0 = new int[0];
      charClass1.appendClass(intArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[4];
      CharClass charClass0 = new CharClass();
      int[][] intArray1 = new int[2][7];
      CharClass charClass1 = charClass0.appendClass(intArray0);
      charClass1.negateClass();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      charClass0.appendFoldedRange(2934, 2934);
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
  public void test12()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[0][1];
      charClass0.appendNegatedTable(intArray0);
      int[] intArray1 = new int[0];
      CharClass charClass1 = charClass0.appendNegatedClass(intArray1);
      charClass1.appendTableWithSign(intArray0, 2433);
      charClass0.appendClassWithSign(intArray1, 2433);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 4;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[4][2];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      intArray1[3] = intArray0;
      CharClass charClass1 = charClass0.appendNegatedTable(intArray1);
      charClass1.appendTableWithSign(intArray1, 1406);
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
      CharClass charClass1 = charClass0.negateClass();
      CharClass charClass2 = charClass1.appendLiteral((-714), (-625));
      charClass2.cleanClass();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[2];
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.appendLiteral(93, 93);
      CharClass charClass1 = charClass0.cleanClass();
      charClass1.appendLiteral(93, (-2119));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[6];
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[3][7];
      CharClass charClass1 = charClass0.cleanClass();
      CharClass charClass2 = charClass1.appendNegatedTable(intArray1);
      charClass2.appendFoldedClass(intArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      charClass0.toString();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendRange(3810, 3810);
      charClass1.appendFoldedRange(3810, (-326));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[4];
      CharClass charClass0 = new CharClass();
      // Undeclared exception!
      try { 
        CharClass.charClassToString(intArray0, 947);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[3];
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.appendRange((-14117949), (-14117949));
      charClass0.cleanClass();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.negateClass();
      charClass1.appendFoldedRange((-523), 120752);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int int0 = (-1286);
      CharClass charClass1 = charClass0.appendFoldedRange((-1286), (-1286));
      // Undeclared exception!
      try { 
        charClass1.appendTableWithSign((int[][]) null, (-1286));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[2];
      intArray0[0] = 4;
      intArray0[1] = 184;
      CharClass charClass1 = charClass0.appendFoldedClass(intArray0);
      charClass1.appendRange(184, 8333);
      charClass0.cleanClass();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[5];
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendLiteral((-197), (-197));
      charClass1.appendLiteral(617, (-1691));
      charClass0.cleanClass();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      charClass0.toArray();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[7];
      intArray0[0] = 120597;
      intArray0[1] = 120597;
      CharGroup charGroup0 = null;
      CharClass charClass1 = charClass0.appendFoldedRange(198, 120597);
      boolean boolean0 = false;
      charClass1.appendGroup(charGroup0, boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 93;
      CharClass.charClassToString(intArray0, 2);
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[2][2];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      CharClass charClass1 = charClass0.appendNegatedTable(intArray1);
      charClass1.appendNegatedClass(intArray0);
      CharClass charClass2 = charClass1.cleanClass();
      charClass2.negateClass();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[2] = (-4246);
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendLiteral(239, (-4246));
      CharClass.charClassToString(intArray0, (-4246));
      charClass1.toArray();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendFoldedRange(120753, 120753);
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
  public void test30()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 93;
      CharClass.charClassToString(intArray0, (-12));
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.cleanClass();
      int[][] intArray1 = new int[2][2];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      CharClass charClass1 = charClass0.appendNegatedTable(intArray1);
      CharClass charClass2 = charClass0.appendNegatedTable(intArray1);
      charClass2.appendNegatedTable(intArray1);
      CharClass charClass3 = new CharClass(intArray0);
      charClass1.cleanClass();
      charClass2.appendLiteral((-2747), (-1967));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 93;
      CharClass.charClassToString(intArray0, 2);
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.cleanClass();
      int[][] intArray1 = new int[2][2];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      charClass0.appendNegatedTable(intArray1);
      int int0 = 2105;
      CharClass charClass2 = charClass0.appendRange(2105, 3116);
      CharClass charClass3 = charClass2.appendTableWithSign(intArray1, 2);
      int int1 = 7006;
      charClass3.appendFoldedRange(int0, int1);
      CharClass charClass4 = charClass1.appendFoldedClass(intArray1[1]);
      charClass4.appendClass(intArray1[1]);
      charClass1.appendNegatedClass(intArray1[1]);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 93;
      int int0 = (-21);
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.cleanClass();
      int[][] intArray1 = new int[2][2];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      CharClass charClass1 = charClass0.negateClass();
      CharClass charClass2 = charClass0.appendNegatedTable(intArray1);
      charClass2.appendFoldedRange(intArray0[0], int0);
      CharGroup charGroup0 = null;
      boolean boolean0 = true;
      CharClass charClass3 = new CharClass(intArray0);
      charClass3.appendGroup(charGroup0, boolean0);
      charClass1.appendClass(intArray0);
      int int1 = (-667);
      int int2 = 6652;
      charClass0.appendLiteral(int1, int2);
      CharClass charClass4 = charClass1.cleanClass();
      int int3 = 418;
      int int4 = (-10);
      charClass4.appendLiteral(int3, int4);
  }
}