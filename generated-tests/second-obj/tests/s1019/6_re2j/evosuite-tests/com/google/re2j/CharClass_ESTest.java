/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 06:14:36 GMT 2018
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
      int[] intArray0 = new int[7];
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.appendFoldedRange(44016, 44016);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[5];
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.appendRange((-1371), (-1371));
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[5] = 2;
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.negateClass();
      CharClass charClass2 = charClass1.appendFoldedRange(2, 0);
      assertSame(charClass1, charClass2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[][] intArray0 = new int[0][6];
      CharClass charClass1 = charClass0.appendFoldedRange(275, 275);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      charClass0.negateClass();
      CharClass charClass1 = charClass0.appendRange(1114112, 1114112);
      assertSame(charClass0, charClass1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      int[] intArray0 = new int[1];
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
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[3];
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendFoldedRange(44007, 44007);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      CharClass charClass1 = charClass0.appendLiteral((-199), (-199));
      assertSame(charClass0, charClass1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[3];
      CharClass charClass0 = new CharClass(intArray0);
      charClass0.appendFoldedRange(44015, 44015);
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      // Undeclared exception!
      try { 
        charClass0.appendClassWithSign((int[]) null, 64);
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
      int[] intArray0 = new int[4];
      intArray0[2] = 5404;
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 5404, 0}, intArray0);
      assertNotNull(charClass0);
      
      int[][] intArray1 = new int[20][2];
      intArray1[0] = intArray0;
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
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[4];
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.cleanClass();
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      int[] intArray1 = charClass1.toArray();
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
      assertArrayEquals(new int[] {0, 0}, intArray1);
      assertFalse(intArray1.equals((Object)intArray0));
      assertNotNull(intArray1);
      assertNotSame(intArray0, intArray1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      assertNotSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = 2;
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {0, 2, 0, 0}, intArray0);
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.cleanClass();
      assertArrayEquals(new int[] {0, 2, 0, 0}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      String string0 = charClass0.toString();
      assertArrayEquals(new int[] {0, 2, 0, 0}, intArray0);
      assertNotNull(string0);
      assertEquals("[0x0-0x2]", string0);
      assertSame(charClass0, charClass1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 4;
      intArray0[1] = (-2544);
      intArray0[2] = 2579;
      intArray0[3] = (-2941);
      intArray0[4] = 4864;
      intArray0[5] = 5120;
      intArray0[6] = 1563;
      intArray0[7] = 749;
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {4, (-2544), 2579, (-2941), 4864, 5120, 1563, 749}, intArray0);
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.cleanClass();
      assertArrayEquals(new int[] {4, (-2544), 1563, 749, 2579, (-2941), 4864, 5120}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[2] = 5426;
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 5426, 0}, intArray0);
      assertNotNull(charClass0);
      
      int[][] intArray1 = new int[1][2];
      CharClass charClass1 = charClass0.appendLiteral(5426, 1978);
      assertArrayEquals(new int[] {0, 0, 5426, 0}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      intArray1[0] = intArray0;
      CharClass charClass2 = charClass0.appendNegatedTable(intArray1);
      assertArrayEquals(new int[] {0, 0, 5426, 0}, intArray0);
      assertNotNull(charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass0, charClass2);
      assertSame(charClass2, charClass1);
      assertSame(charClass2, charClass0);
      
      CharClass charClass3 = charClass1.cleanClass();
      assertArrayEquals(new int[] {0, 0, 5426, 0}, intArray0);
      assertNotNull(charClass3);
      assertSame(charClass0, charClass1);
      assertSame(charClass0, charClass2);
      assertSame(charClass0, charClass3);
      assertSame(charClass1, charClass2);
      assertSame(charClass1, charClass0);
      assertSame(charClass1, charClass3);
      assertSame(charClass3, charClass1);
      assertSame(charClass3, charClass0);
      assertSame(charClass3, charClass2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = (-8);
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {0, (-8), 0, 0}, intArray0);
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.appendLiteral(5426, (-8));
      assertArrayEquals(new int[] {0, (-8), 0, 0}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      CharClass charClass2 = charClass0.cleanClass();
      assertArrayEquals(new int[] {0, (-8), 0, 0}, intArray0);
      assertNotNull(charClass2);
      assertSame(charClass0, charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass2, charClass0);
      assertSame(charClass2, charClass1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[2] = 5426;
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 5426, 0}, intArray0);
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.cleanClass();
      assertArrayEquals(new int[] {0, 0, 5426, 0}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[5];
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      // Undeclared exception!
      try { 
        charClass0.appendClassWithSign(intArray0, (-29843053));
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
      assertNotNull(charClass0);
      
      int[] intArray0 = new int[3];
      intArray0[0] = 9168;
      intArray0[1] = (-576);
      intArray0[2] = (-3449);
      // Undeclared exception!
      try { 
        charClass0.appendClassWithSign(intArray0, (-576));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      int[] intArray0 = new int[0];
      CharClass charClass1 = charClass0.appendClass(intArray0);
      assertArrayEquals(new int[] {}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      CharClass charClass2 = charClass0.appendNegatedClass(intArray0);
      assertArrayEquals(new int[] {}, intArray0);
      assertNotNull(charClass2);
      assertSame(charClass0, charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass2, charClass1);
      assertSame(charClass2, charClass0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.cleanClass();
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        charClass0.appendFoldedClass(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 64;
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {64, 0, 0, 0}, intArray0);
      assertNotNull(charClass0);
      
      String string0 = charClass0.toString();
      assertArrayEquals(new int[] {64, 0, 0, 0}, intArray0);
      assertNotNull(string0);
      assertEquals("[0x40-0x0 0x0]", string0);
      
      CharClass charClass1 = charClass0.appendRange(64, 64);
      assertArrayEquals(new int[] {64, 0, 0, 0}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[13];
      int int0 = (-2);
      intArray0[5] = (-2);
      CharClass charClass0 = new CharClass(intArray0);
      assertNotNull(charClass0);
      
      // Undeclared exception!
      try { 
        charClass0.negateClass();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 13
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[5];
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      int[][] intArray1 = new int[0][6];
      CharClass charClass1 = charClass0.appendTableWithSign(intArray1, 247);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      CharClass charClass2 = charClass0.appendNegatedTable(intArray1);
      assertNotNull(charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass0, charClass2);
      assertSame(charClass2, charClass1);
      assertSame(charClass2, charClass0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[10];
      intArray0[3] = 2486;
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 2486, 0, 0, 0, 0, 0, 0}, intArray0);
      assertNotNull(charClass0);
      
      int[][] intArray1 = new int[1][3];
      intArray1[0] = intArray0;
      CharClass charClass1 = charClass0.negateClass();
      assertArrayEquals(new int[] {1, 1114111, 0, 2486, 0, 0, 0, 0, 0, 0}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      CharClass charClass2 = charClass1.appendTableWithSign(intArray1, (-1355));
      charClass2.appendFoldedClass(intArray1[0]);
      charClass1.appendClassWithSign(intArray0, intArray0[3]);
      charClass0.appendNegatedTable(intArray1);
      charClass1.appendTable(intArray1);
      int int0 = 8213;
      charClass0.appendClassWithSign(intArray1[0], int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[4];
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.negateClass();
      assertArrayEquals(new int[] {1, 1114111, 0, 0}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int[][] intArray0 = new int[1][1];
      int int0 = 3;
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.appendFoldedRange(3, 65);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      // Undeclared exception!
      try { 
        charClass1.appendClassWithSign((int[]) null, 65);
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
      int[] intArray0 = new int[8];
      intArray0[0] = 308;
      intArray0[1] = 0;
      intArray0[2] = 911;
      intArray0[3] = 911;
      intArray0[4] = 911;
      intArray0[5] = 1163;
      intArray0[6] = (-1);
      intArray0[7] = 1137;
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {308, 0, 911, 911, 911, 1163, (-1), 1137}, intArray0);
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.appendClassWithSign(intArray0, 1169);
      assertArrayEquals(new int[] {308, 0, 911, 911, 911, 1163, (-1), 1163}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      CharClass charClass2 = charClass1.cleanClass();
      assertArrayEquals(new int[] {(-1), 1163, 308, 0, 911, 1163, 911, 911}, intArray0);
      assertNotNull(charClass2);
      assertSame(charClass0, charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass2);
      assertSame(charClass1, charClass0);
      assertSame(charClass2, charClass0);
      assertSame(charClass2, charClass1);
      
      CharClass charClass3 = charClass2.appendRange(911, 911);
      assertArrayEquals(new int[] {(-1), 1163, 308, 0, 911, 1163, 911, 911}, intArray0);
      assertNotNull(charClass3);
      assertSame(charClass0, charClass2);
      assertSame(charClass0, charClass3);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass2);
      assertSame(charClass1, charClass0);
      assertSame(charClass1, charClass3);
      assertSame(charClass2, charClass0);
      assertSame(charClass2, charClass1);
      assertSame(charClass2, charClass3);
      assertSame(charClass3, charClass0);
      assertSame(charClass3, charClass1);
      assertSame(charClass3, charClass2);
      
      String string0 = CharClass.charClassToString(intArray0, (-1));
      assertArrayEquals(new int[] {(-1), 1163, 308, 0, 911, 1163, 911, 911}, intArray0);
      assertNotNull(string0);
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = 2;
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {0, 2, 0, 0}, intArray0);
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.appendLiteral(5426, 2);
      assertArrayEquals(new int[] {0, 2, 0, 0}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      CharClass charClass2 = charClass0.cleanClass();
      assertArrayEquals(new int[] {0, 2, 0, 0}, intArray0);
      assertNotNull(charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass0, charClass2);
      assertSame(charClass2, charClass1);
      assertSame(charClass2, charClass0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[2] = 5426;
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 5426, 0}, intArray0);
      assertNotNull(charClass0);
      
      int[][] intArray1 = new int[1][2];
      intArray1[0] = intArray0;
      CharClass charClass1 = charClass0.appendNegatedTable(intArray1);
      assertArrayEquals(new int[] {0, 0, 1, 1114111}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      CharClass charClass2 = charClass0.cleanClass();
      assertArrayEquals(new int[] {0, 1114111, 1, 1114111}, intArray0);
      assertNotNull(charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass0, charClass2);
      assertSame(charClass2, charClass0);
      assertSame(charClass2, charClass1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      int[] intArray0 = new int[0];
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      assertArrayEquals(new int[] {}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      CharClass charClass2 = charClass0.appendFoldedClass(intArray0);
      assertArrayEquals(new int[] {}, intArray0);
      assertNotNull(charClass2);
      assertSame(charClass0, charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass2, charClass0);
      assertSame(charClass2, charClass1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int[] intArray0 = new int[13];
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.negateClass();
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      CharClass charClass2 = charClass0.negateClass();
      assertNotNull(charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass0, charClass2);
      assertSame(charClass2, charClass0);
      assertSame(charClass2, charClass1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[2] = 5404;
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 5404, 0}, intArray0);
      assertNotNull(charClass0);
      
      int[][] intArray1 = new int[20][2];
      intArray1[0] = intArray0;
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 1, 1114111}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
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
  public void test34()  throws Throwable  {
      int[] intArray0 = new int[4];
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 1114111}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      int[][] intArray1 = new int[1][2];
      CharClass charClass2 = charClass0.appendFoldedClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 1114111}, intArray0);
      assertNotNull(charClass2);
      assertSame(charClass0, charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass2, charClass1);
      assertSame(charClass2, charClass0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int[] intArray0 = new int[10];
      intArray0[3] = (-931);
      intArray0[3] = (-931);
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, (-931), 0, 0, 0, 0, 0, 0}, intArray0);
      assertNotNull(charClass0);
      
      int[][] intArray1 = new int[1][3];
      intArray1[0] = intArray0;
      // Undeclared exception!
      charClass0.appendTableWithSign(intArray1, (-2764));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int[] intArray0 = new int[4];
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 1114111}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      int[][] intArray1 = new int[1][2];
      CharClass charClass2 = charClass0.appendNegatedClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 1114111}, intArray0);
      assertNotNull(charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass0, charClass2);
      assertSame(charClass2, charClass0);
      assertSame(charClass2, charClass1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int[] intArray0 = new int[4];
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      int[] intArray1 = charClass0.toArray();
      assertArrayEquals(new int[] {}, intArray1);
      assertFalse(intArray1.equals((Object)intArray0));
      assertNotNull(intArray1);
      assertNotSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int[] intArray0 = new int[5];
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, intArray0);
      assertNotNull(charClass0);
      
      int[][] intArray1 = new int[1][3];
      intArray1[0] = intArray0;
      String string0 = CharClass.charClassToString(intArray0, (-575));
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, intArray0);
      assertNotNull(string0);
      assertEquals("[]", string0);
      
      CharClass charClass1 = charClass0.appendFoldedRange(119179, 1006);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[2] = 5426;
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 5426, 0}, intArray0);
      assertNotNull(charClass0);
      
      CharClass charClass1 = charClass0.appendNegatedClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 1, 1114111}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      int[][] intArray1 = new int[12][2];
      intArray1[0] = intArray0;
      // Undeclared exception!
      try { 
        charClass0.appendNegatedTable(intArray1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[3] = 8243;
      intArray0[2] = 215;
      intArray0[3] = 0;
      CharClass charClass0 = new CharClass(intArray0);
      assertArrayEquals(new int[] {0, 0, 215, 0}, intArray0);
      assertNotNull(charClass0);
      
      int[][] intArray1 = new int[2][3];
      intArray1[0] = intArray0;
      intArray1[1] = intArray0;
      CharClass charClass1 = charClass0.appendNegatedTable(intArray1);
      assertArrayEquals(new int[] {0, 0, 1, 1114111}, intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
      
      CharClass charClass2 = charClass1.negateClass();
      assertArrayEquals(new int[] {0, 0, 1, 1114111}, intArray0);
      assertNotNull(charClass2);
      assertSame(charClass0, charClass1);
      assertSame(charClass0, charClass2);
      assertSame(charClass1, charClass2);
      assertSame(charClass1, charClass0);
      assertSame(charClass2, charClass0);
      assertSame(charClass2, charClass1);
      
      CharClass charClass3 = new CharClass();
      assertFalse(charClass3.equals((Object)charClass0));
      assertFalse(charClass3.equals((Object)charClass2));
      assertFalse(charClass3.equals((Object)charClass1));
      assertNotNull(charClass3);
      
      CharClass charClass4 = charClass2.appendFoldedRange(1, 1114111);
      assertArrayEquals(new int[] {1, 1114111, 1, 1114111}, intArray0);
      assertFalse(charClass0.equals((Object)charClass3));
      assertFalse(charClass1.equals((Object)charClass3));
      assertFalse(charClass2.equals((Object)charClass3));
      assertFalse(charClass4.equals((Object)charClass3));
      assertNotNull(charClass4);
      assertSame(charClass0, charClass1);
      assertSame(charClass0, charClass2);
      assertNotSame(charClass0, charClass3);
      assertSame(charClass0, charClass4);
      assertSame(charClass1, charClass4);
      assertNotSame(charClass1, charClass3);
      assertSame(charClass1, charClass2);
      assertSame(charClass1, charClass0);
      assertSame(charClass2, charClass0);
      assertSame(charClass2, charClass1);
      assertNotSame(charClass2, charClass3);
      assertSame(charClass2, charClass4);
      assertSame(charClass4, charClass1);
      assertNotSame(charClass4, charClass3);
      assertSame(charClass4, charClass2);
      assertSame(charClass4, charClass0);
      
      CharClass charClass5 = charClass0.appendNegatedTable(intArray1);
      assertArrayEquals(new int[] {0, 1114111, 1, 1114111}, intArray0);
      assertFalse(charClass0.equals((Object)charClass3));
      assertFalse(charClass5.equals((Object)charClass3));
      assertNotNull(charClass5);
      assertSame(charClass0, charClass1);
      assertSame(charClass0, charClass2);
      assertNotSame(charClass0, charClass3);
      assertSame(charClass0, charClass4);
      assertSame(charClass0, charClass5);
      assertSame(charClass5, charClass0);
      assertNotSame(charClass5, charClass3);
      assertSame(charClass5, charClass4);
      assertSame(charClass5, charClass2);
      assertSame(charClass5, charClass1);
      
      CharClass charClass6 = charClass5.appendTable(intArray1);
      assertArrayEquals(new int[] {0, 1114111, 1, 1114111}, intArray0);
      assertFalse(charClass0.equals((Object)charClass3));
      assertFalse(charClass5.equals((Object)charClass3));
      assertFalse(charClass6.equals((Object)charClass3));
      assertNotNull(charClass6);
      assertSame(charClass0, charClass1);
      assertSame(charClass0, charClass6);
      assertSame(charClass0, charClass2);
      assertNotSame(charClass0, charClass3);
      assertSame(charClass0, charClass4);
      assertSame(charClass0, charClass5);
      assertSame(charClass5, charClass0);
      assertNotSame(charClass5, charClass3);
      assertSame(charClass5, charClass4);
      assertSame(charClass5, charClass2);
      assertSame(charClass5, charClass6);
      assertSame(charClass5, charClass1);
      assertSame(charClass6, charClass1);
      assertSame(charClass6, charClass2);
      assertSame(charClass6, charClass4);
      assertNotSame(charClass6, charClass3);
      assertSame(charClass6, charClass5);
      assertSame(charClass6, charClass0);
      
      int[] intArray2 = new int[4];
      assertFalse(intArray2.equals((Object)intArray0));
      
      intArray2[0] = 215;
      intArray2[1] = 1;
      intArray2[2] = 1;
      intArray2[3] = 8243;
      int[] intArray3 = null;
      // Undeclared exception!
      try { 
        charClass0.appendClass((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.re2j.CharClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      int[][] intArray0 = new int[1][5];
      int[] intArray1 = new int[8];
      intArray1[0] = 91;
      intArray1[1] = 2486;
      intArray1[2] = 1;
      intArray1[3] = 2656;
      intArray1[4] = 612;
      intArray1[5] = (-2688);
      intArray1[6] = 612;
      intArray1[7] = (-405);
      intArray0[0] = intArray1;
      CharClass charClass1 = charClass0.appendNegatedTable(intArray0);
      assertNotNull(charClass1);
      assertSame(charClass0, charClass1);
      assertSame(charClass1, charClass0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 64;
      CharClass charClass0 = new CharClass();
      assertNotNull(charClass0);
      
      int[][] intArray1 = new int[8][9];
      // Undeclared exception!
      charClass0.appendFoldedRange(2155, 120415);
  }
}