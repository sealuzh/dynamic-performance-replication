/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 06:52:57 GMT 2018
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
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[0][6];
      CharClass charClass1 = charClass0.appendTableWithSign(intArray0, 405);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[1][7];
      charClass0.appendTable(intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendLiteral(42879, 42879);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendFoldedRange(8490, 8490);
      assertSame(charClass0, charClass1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      // Undeclared exception!
      charClass0.appendFoldedRange(3286, 64297);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[6];
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.appendClassWithSign(intArray0, 848);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[4];
      intArray0[0] = 647232;
      charClass0.appendNegatedClass(intArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[0];
      charClass0.appendClassWithSign(intArray0, (-1915));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      charClass0.appendLiteral(1795, 1795);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      charClass0.appendFoldedRange((-2326), 1356);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[0][2];
      charClass0.appendNegatedTable(intArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.negateClass();
      charClass1.negateClass();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      charClass0.appendLiteral(7483, 7483);
      charClass0.negateClass();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = 8469;
      intArray0[2] = 52;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[2][6];
      intArray1[0] = intArray0;
      CharClass charClass1 = new CharClass();
      charClass0.appendTable(intArray1);
      charClass0.cleanClass();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[2][7];
      // Undeclared exception!
      charClass0.appendNegatedTable(intArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      charClass0.appendLiteral(42894, 42894);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = charClass0.toArray();
      charClass0.appendClass(intArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        CharClass.charClassToString(intArray0, 2975);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      charClass0.toString();
      charClass0.negateClass();
      charClass0.toString();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[2];
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.appendClass(intArray0);
      charClass0.appendFoldedClass(intArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[6];
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.cleanClass();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      charClass0.appendFoldedRange((-2641), 612);
      charClass0.cleanClass();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[2] = 65;
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.cleanClass();
      charClass0.appendNegatedClass(intArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[5];
      CharClass charClass0 = new CharClass(intArray0);
      // Undeclared exception!
      try { 
        charClass0.cleanClass();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      charClass0.negateClass();
      charClass0.appendRange((-3644), (-3644));
      charClass0.cleanClass();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      charClass0.toString();
      // Undeclared exception!
      try { 
        charClass0.appendTableWithSign((int[][]) null, (-1806));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = 8469;
      intArray0[2] = 65;
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.appendNegatedClass(intArray0);
      charClass0.cleanClass();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = (-439);
      intArray0[1] = 8474;
      intArray0[2] = 8474;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[2][6];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      CharClass charClass1 = charClass0.appendNegatedTable(intArray1);
      charClass1.cleanClass();
      charClass1.appendFoldedClass(intArray0);
      charClass1.toArray();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      // Undeclared exception!
      charClass0.appendFoldedRange(1407, 119911);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[2] = 65;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[2][6];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      CharClass charClass1 = charClass0.appendNegatedTable(intArray1);
      charClass0.appendTableWithSign(intArray1, (-3135));
      charClass1.appendNegatedClass(intArray0);
      charClass0.appendNegatedTable(intArray1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      charClass0.appendFoldedRange(120310, 40960);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int[] intArray0 = new int[6];
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.negateClass();
      charClass0.appendFoldedClass(intArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = 8469;
      intArray0[2] = 65;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[2][6];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      charClass0.appendNegatedTable(intArray1);
      charClass0.cleanClass();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = 8469;
      intArray0[2] = 65;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[2][6];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      CharClass charClass1 = charClass0.appendNegatedTable(intArray1);
      CharClass charClass2 = charClass1.appendTable(intArray1);
      charClass2.appendClass(intArray1[1]);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[2] = 65;
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[2][6];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      charClass0.appendNegatedTable(intArray1);
      charClass0.cleanClass();
      charClass0.appendTableWithSign(intArray1, (-3108));
      charClass0.appendNegatedTable(intArray1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[1][2];
      int[] intArray1 = new int[4];
      intArray1[0] = 26;
      intArray1[1] = (-1481);
      intArray1[2] = 1;
      intArray1[3] = 26;
      intArray0[0] = intArray1;
      CharClass charClass1 = charClass0.appendNegatedTable(intArray0);
      charClass1.cleanClass();
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
}