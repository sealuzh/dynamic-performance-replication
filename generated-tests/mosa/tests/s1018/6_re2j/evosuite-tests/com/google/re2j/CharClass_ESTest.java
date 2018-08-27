/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 09:38:25 GMT 2018
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
      int[][] intArray0 = new int[5][9];
      charClass0.appendTable(intArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[5];
      CharClass charClass0 = new CharClass(intArray0);
      int[][] intArray1 = new int[0][3];
      charClass0.appendNegatedTable(intArray1);
      assertArrayEquals(new int[] {0, 0, 0, 0, 1114111}, intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[0];
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      CharClass charClass2 = charClass1.appendClass(intArray0);
      assertSame(charClass2, charClass1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = 65;
      intArray0[0] = 65;
      CharClass charClass0 = new CharClass(intArray0);
      assertNotNull(charClass0);
      assertArrayEquals(new int[] {65, 0, 0, 0, 0}, intArray0);
      
      charClass0.cleanClass();
      charClass0.appendLiteral(int0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[6];
      CharClass charClass0 = new CharClass(intArray0);
      assertNotNull(charClass0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      
      CharClass charClass1 = charClass0.cleanClass();
      assertNotNull(charClass1);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 0;
      intArray0[2] = 558;
      intArray0[3] = 3154;
      CharClass charClass0 = new CharClass(intArray0);
      assertNotNull(charClass0);
      assertArrayEquals(new int[] {0, 0, 558, 3154}, intArray0);
      
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      assertNotNull(charClass1);
      assertArrayEquals(new int[] {0, 0, 1, 1114111}, intArray0);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      CharClass charClass2 = charClass1.cleanClass();
      assertNotNull(charClass2);
      assertArrayEquals(new int[] {0, 1114111, 1, 1114111}, intArray0);
      assertSame(charClass0, charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass2);
      assertSame(charClass1, charClass0);
      assertSame(charClass2, charClass0);
      assertSame(charClass2, charClass1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      int[] intArray0 = new int[1];
      intArray0[0] = 159;
      // Undeclared exception!
      try { 
        charClass0.appendClassWithSign(intArray0, 159);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[5];
      CharClass charClass0 = new CharClass(intArray0);
      assertNotNull(charClass0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, intArray0);
      
      CharClass charClass1 = charClass0.appendFoldedRange((-2218), (-2218));
      assertNotNull(charClass1);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, intArray0);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 65;
      CharClass charClass0 = new CharClass(intArray0);
      assertNotNull(charClass0);
      assertArrayEquals(new int[] {65}, intArray0);
      
      CharClass charClass1 = charClass0.appendLiteral(65, 65);
      assertNotNull(charClass1);
      assertArrayEquals(new int[] {65}, intArray0);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.appendFoldedRange(1131, 1131);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      CharClass charClass2 = charClass0.appendLiteral((-1017), (-1017));
      assertNotNull(charClass2);
      assertSame(charClass0, charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass2, charClass0);
      assertSame(charClass2, charClass1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[1] = 12468;
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      charClass0.appendFoldedClass(intArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[0];
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.appendClassWithSign(intArray0, 1233);
      assertNotNull(charClass1);
      assertArrayEquals(new int[] {}, intArray0);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[6];
      CharClass charClass0 = new CharClass(intArray0);
      assertNotNull(charClass0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      
      CharClass charClass1 = charClass0.appendRange(619, 12);
      assertNotNull(charClass1);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      CharClass charClass2 = charClass1.cleanClass();
      assertNotNull(charClass2);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      assertSame(charClass0, charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      assertSame(charClass1, charClass2);
      assertSame(charClass2, charClass0);
      assertSame(charClass2, charClass1);
      
      int[][] intArray1 = new int[1][8];
      CharClass charClass3 = charClass1.negateClass();
      assertNotNull(charClass3);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
      assertSame(charClass0, charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass0, charClass3);
      assertSame(charClass1, charClass0);
      assertSame(charClass1, charClass3);
      assertSame(charClass1, charClass2);
      assertSame(charClass3, charClass1);
      assertSame(charClass3, charClass0);
      assertSame(charClass3, charClass2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      int[] intArray0 = new int[4];
      intArray0[0] = (-2265);
      CharClass charClass1 = charClass0.appendFoldedClass(intArray0);
      assertNotNull(charClass1);
      assertArrayEquals(new int[] {(-2265), 0, 0, 0}, intArray0);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 12442;
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      int[][] intArray1 = new int[12][4];
      intArray1[0] = intArray0;
      charClass0.appendTable(intArray1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      int[][] intArray0 = new int[0][7];
      CharClass charClass1 = charClass0.appendTableWithSign(intArray0, 12442);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.appendLiteral((-1340), (-1340));
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.negateClass();
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      String string0 = charClass0.toString();
      assertNotNull(string0);
      assertEquals("[0x0-0x10ffff]", string0);
      assertSame(charClass0, charClass1);
      
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
  public void test19()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      int[] intArray0 = new int[5];
      intArray0[0] = 43702;
      // Undeclared exception!
      try { 
        CharClass.charClassToString(intArray0, 43702);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      int[] intArray0 = new int[8];
      intArray0[1] = 42657;
      intArray0[2] = 42657;
      CharClass charClass1 = charClass0.appendLiteral(236, 42657);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      CharClass charClass2 = new CharClass();
      assertNotNull(charClass2);
      assertFalse(charClass2.equals((Object)charClass1));
      assertFalse(charClass2.equals((Object)charClass0));
      
      int[][] intArray1 = new int[1][2];
      intArray1[0] = intArray0;
      CharClass charClass3 = charClass0.appendNegatedTable(intArray1);
      assertNotNull(charClass3);
      assertFalse(charClass0.equals((Object)charClass2));
      assertFalse(charClass3.equals((Object)charClass2));
      assertSame(charClass0, charClass1);
      assertNotSame(charClass0, charClass2);
      assertSame(charClass0, charClass3);
      assertNotSame(charClass3, charClass2);
      assertSame(charClass3, charClass1);
      assertSame(charClass3, charClass0);
      
      CharClass charClass4 = charClass3.negateClass();
      assertNotNull(charClass4);
      assertFalse(charClass0.equals((Object)charClass2));
      assertFalse(charClass3.equals((Object)charClass2));
      assertFalse(charClass4.equals((Object)charClass2));
      assertSame(charClass0, charClass1);
      assertNotSame(charClass0, charClass2);
      assertSame(charClass0, charClass4);
      assertSame(charClass0, charClass3);
      assertNotSame(charClass3, charClass2);
      assertSame(charClass3, charClass4);
      assertSame(charClass3, charClass1);
      assertSame(charClass3, charClass0);
      assertNotSame(charClass4, charClass2);
      assertSame(charClass4, charClass3);
      assertSame(charClass4, charClass1);
      assertSame(charClass4, charClass0);
      
      CharClass charClass5 = charClass3.appendNegatedTable(intArray1);
      assertNotNull(charClass5);
      assertFalse(charClass0.equals((Object)charClass2));
      assertFalse(charClass3.equals((Object)charClass2));
      assertFalse(charClass5.equals((Object)charClass2));
      assertSame(charClass0, charClass1);
      assertNotSame(charClass0, charClass2);
      assertSame(charClass0, charClass5);
      assertSame(charClass0, charClass4);
      assertSame(charClass0, charClass3);
      assertSame(charClass3, charClass5);
      assertNotSame(charClass3, charClass2);
      assertSame(charClass3, charClass4);
      assertSame(charClass3, charClass1);
      assertSame(charClass3, charClass0);
      assertSame(charClass5, charClass1);
      assertSame(charClass5, charClass3);
      assertNotSame(charClass5, charClass2);
      assertSame(charClass5, charClass4);
      assertSame(charClass5, charClass0);
      
      int[] intArray2 = charClass0.toArray();
      assertNotNull(intArray2);
      assertArrayEquals(new int[] {0, 235, 1, 1114111}, intArray2);
      assertFalse(charClass0.equals((Object)charClass2));
      assertFalse(intArray2.equals((Object)intArray0));
      assertSame(charClass0, charClass1);
      assertNotSame(charClass0, charClass2);
      assertSame(charClass0, charClass5);
      assertSame(charClass0, charClass4);
      assertSame(charClass0, charClass3);
      assertNotSame(intArray2, intArray0);
      
      CharClass charClass6 = charClass4.appendNegatedClass(intArray2);
      assertNotNull(charClass6);
      assertArrayEquals(new int[] {0, 235, 1, 1114111}, intArray2);
      assertFalse(charClass0.equals((Object)charClass2));
      assertFalse(charClass3.equals((Object)charClass2));
      assertFalse(charClass4.equals((Object)charClass2));
      assertFalse(intArray2.equals((Object)intArray0));
      assertFalse(charClass6.equals((Object)charClass2));
      assertSame(charClass0, charClass1);
      assertSame(charClass0, charClass6);
      assertNotSame(charClass0, charClass2);
      assertSame(charClass0, charClass5);
      assertSame(charClass0, charClass4);
      assertSame(charClass0, charClass3);
      assertSame(charClass3, charClass6);
      assertSame(charClass3, charClass5);
      assertNotSame(charClass3, charClass2);
      assertSame(charClass3, charClass4);
      assertSame(charClass3, charClass1);
      assertSame(charClass3, charClass0);
      assertSame(charClass4, charClass5);
      assertNotSame(charClass4, charClass2);
      assertSame(charClass4, charClass3);
      assertSame(charClass4, charClass1);
      assertSame(charClass4, charClass6);
      assertSame(charClass4, charClass0);
      assertNotSame(intArray2, intArray0);
      assertSame(charClass6, charClass5);
      assertNotSame(charClass6, charClass2);
      assertSame(charClass6, charClass4);
      assertSame(charClass6, charClass1);
      assertSame(charClass6, charClass3);
      assertSame(charClass6, charClass0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.cleanClass();
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      CharClass charClass2 = charClass1.appendRange(923, 923);
      assertNotNull(charClass2);
      assertSame(charClass0, charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      assertSame(charClass1, charClass2);
      assertSame(charClass2, charClass1);
      assertSame(charClass2, charClass0);
      
      CharClass charClass3 = charClass0.negateClass();
      assertNotNull(charClass3);
      assertSame(charClass0, charClass2);
      assertSame(charClass0, charClass3);
      assertSame(charClass0, charClass1);
      assertSame(charClass3, charClass1);
      assertSame(charClass3, charClass0);
      assertSame(charClass3, charClass2);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.appendRange((-19994), (-19994));
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      int[][] intArray0 = new int[1][9];
      CharClass charClass2 = charClass0.negateClass();
      assertNotNull(charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass0, charClass2);
      assertSame(charClass2, charClass0);
      assertSame(charClass2, charClass1);
      
      charClass0.appendNegatedTable(intArray0);
      charClass0.appendNegatedTable(intArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      CharGroup charGroup0 = null;
      // Undeclared exception!
      try { 
        charClass0.appendTableWithSign((int[][]) null, (-3685));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      int[][] intArray0 = new int[1][2];
      int[] intArray1 = new int[4];
      intArray1[0] = 1836;
      intArray0[0] = intArray1;
      CharClass charClass1 = charClass0.appendTable(intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      CharClass charClass2 = charClass0.appendNegatedTable(intArray0);
      assertNotNull(charClass2);
      assertSame(charClass0, charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass2, charClass0);
      assertSame(charClass2, charClass1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[1] = 12442;
      intArray0[0] = 12442;
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      int[][] intArray1 = new int[12][4];
      intArray1[0] = intArray0;
      charClass0.appendNegatedTable(intArray1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[3];
      intArray0[0] = 6;
      intArray0[1] = (-1110);
      intArray0[2] = 128581;
      // Undeclared exception!
      try { 
        charClass0.appendClassWithSign(intArray0, (-1110));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[0];
      CharClass charClass1 = charClass0.appendClassWithSign(intArray0, (-2083));
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
  public void test28()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[4] = (-986);
      intArray0[1] = 12442;
      intArray0[2] = 882;
      intArray0[4] = 0;
      CharClass charClass0 = new CharClass();
      int[][] intArray1 = new int[2][4];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      CharClass charClass1 = charClass0.appendNegatedTable(intArray1);
      CharClass charClass2 = charClass1.appendNegatedTable(intArray1);
      charClass2.cleanClass();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int[] intArray0 = new int[6];
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.appendRange(619, 12);
      charClass1.appendFoldedRange(12, 12);
      charClass1.cleanClass();
      int[][] intArray1 = new int[1][8];
      charClass1.negateClass();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      charClass0.appendFoldedRange((-7759), 1114111);
      charClass0.appendRange(66639, 66639);
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
  public void test31()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[0][6];
      CharClass charClass1 = charClass0.appendTable(intArray0);
      CharClass charClass2 = charClass1.appendLiteral(1114111, 2889);
      charClass2.appendNegatedTable(intArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[2][9];
      charClass0.toArray();
      // Undeclared exception!
      charClass0.appendNegatedTable(intArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[1] = 2683;
      CharClass charClass0 = new CharClass(intArray0);
      CharClass charClass1 = charClass0.cleanClass();
      charClass1.appendFoldedRange(2683, 2544);
      CharClass charClass2 = charClass1.appendClass(intArray0);
      CharClass charClass3 = charClass2.negateClass();
      charClass2.toString();
      // Undeclared exception!
      charClass3.appendFoldedRange(2544, 1114111);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[4];
      intArray0[1] = 792;
      intArray0[2] = 1;
      intArray0[3] = 0;
      int[][] intArray1 = new int[5][0];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      intArray1[2] = intArray0;
      CharClass charClass1 = new CharClass();
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
  public void test35()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[4];
      intArray0[1] = 792;
      intArray0[2] = 1;
      CharClass charClass1 = new CharClass();
      int[][] intArray1 = new int[5][0];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      CharClass charClass2 = new CharClass();
      charClass0.appendRange(792, 1);
      // Undeclared exception!
      try { 
        charClass2.appendTable(intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[4];
      intArray0[1] = 792;
      intArray0[2] = 1;
      CharClass charClass1 = charClass0.appendLiteral(1, 1);
      int[][] intArray1 = new int[5][0];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      charClass0.cleanClass();
      int[][] intArray2 = new int[4][8];
      int[] intArray3 = new int[5];
      intArray3[0] = 1;
      intArray3[1] = 792;
      intArray3[2] = 1;
      intArray3[3] = 792;
      intArray3[4] = 1;
      intArray2[0] = intArray3;
      int[] intArray4 = new int[0];
      intArray2[1] = intArray4;
      intArray2[2] = intArray0;
      intArray2[3] = intArray0;
      // Undeclared exception!
      try { 
        charClass1.appendNegatedTable(intArray2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }
}